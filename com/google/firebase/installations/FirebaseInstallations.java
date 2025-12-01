package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.local.IidStore;
import com.google.firebase.installations.local.PersistedInstallation;
import com.google.firebase.installations.local.PersistedInstallationEntry;
import com.google.firebase.installations.remote.FirebaseInstallationServiceClient;
import com.google.firebase.installations.remote.InstallationResponse;
import com.google.firebase.installations.remote.TokenResult.ResponseCode;
import com.google.firebase.installations.remote.TokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class FirebaseInstallations implements FirebaseInstallationsApi {
    private static final String API_KEY_VALIDATION_MSG = "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String APP_ID_VALIDATION_MSG = "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final String AUTH_ERROR_MSG = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.";
    private static final String CHIME_FIREBASE_APP_NAME = "CHIME_ANDROID_SDK";
    private static final int CORE_POOL_SIZE = 0;
    private static final long KEEP_ALIVE_TIME_IN_SECONDS = 30L;
    private static final String LOCKFILE_NAME_GENERATE_FID = "generatefid.lock";
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final String PROJECT_ID_VALIDATION_MSG = "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.";
    private static final ThreadFactory THREAD_FACTORY;
    private final ExecutorService backgroundExecutor;
    private String cachedFid;
    private final RandomFidGenerator fidGenerator;
    private final FirebaseApp firebaseApp;
    private final IidStore iidStore;
    private final List listeners;
    private final Object lock;
    private static final Object lockGenerateFid;
    private final ExecutorService networkExecutor;
    private final PersistedInstallation persistedInstallation;
    private final FirebaseInstallationServiceClient serviceClient;
    private final Utils utils;

    static {
        FirebaseInstallations.lockGenerateFid = new Object();
        FirebaseInstallations.THREAD_FACTORY = new ThreadFactory() {
            private final AtomicInteger mCount;

            {
                this.mCount = new AtomicInteger(1);
            }

            @Override
            public Thread newThread(Runnable runnable0) {
                return new Thread(runnable0, String.format("firebase-installations-executor-%d", this.mCount.getAndIncrement()));
            }
        };
    }

    FirebaseInstallations(FirebaseApp firebaseApp0, UserAgentPublisher userAgentPublisher0, HeartBeatInfo heartBeatInfo0) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), FirebaseInstallations.THREAD_FACTORY), firebaseApp0, new FirebaseInstallationServiceClient(firebaseApp0.getApplicationContext(), userAgentPublisher0, heartBeatInfo0), new PersistedInstallation(firebaseApp0), new Utils(), new IidStore(firebaseApp0), new RandomFidGenerator());
    }

    FirebaseInstallations(ExecutorService executorService0, FirebaseApp firebaseApp0, FirebaseInstallationServiceClient firebaseInstallationServiceClient0, PersistedInstallation persistedInstallation0, Utils utils0, IidStore iidStore0, RandomFidGenerator randomFidGenerator0) {
        this.lock = new Object();
        this.listeners = new ArrayList();
        this.firebaseApp = firebaseApp0;
        this.serviceClient = firebaseInstallationServiceClient0;
        this.persistedInstallation = persistedInstallation0;
        this.utils = utils0;
        this.iidStore = iidStore0;
        this.fidGenerator = randomFidGenerator0;
        this.backgroundExecutor = executorService0;
        this.networkExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), FirebaseInstallations.THREAD_FACTORY);
    }

    static Void access$lambda$0(FirebaseInstallations firebaseInstallations0) {
        return firebaseInstallations0.deleteFirebaseInstallationId();
    }

    private Task addGetAuthTokenListener() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.addStateListeners(new GetAuthTokenListener(this.utils, taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    private Task addGetIdListener() {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.addStateListeners(new GetIdListener(taskCompletionSource0));
        return taskCompletionSource0.getTask();
    }

    private void addStateListeners(StateListener stateListener0) {
        synchronized(this.lock) {
            this.listeners.add(stateListener0);
        }
    }

    @Override  // com.google.firebase.installations.FirebaseInstallationsApi
    public Task delete() {
        Callable callable0 = FirebaseInstallations..Lambda.3.lambdaFactory$(this);
        return Tasks.call(this.backgroundExecutor, callable0);
    }

    private Void deleteFirebaseInstallationId() throws FirebaseInstallationsException {
        this.updateCacheFid(null);
        PersistedInstallationEntry persistedInstallationEntry0 = this.getMultiProcessSafePrefs();
        if(persistedInstallationEntry0.isRegistered()) {
            String s = this.getApiKey();
            String s1 = persistedInstallationEntry0.getFirebaseInstallationId();
            String s2 = this.getProjectIdentifier();
            String s3 = persistedInstallationEntry0.getRefreshToken();
            this.serviceClient.deleteFirebaseInstallation(s, s1, s2, s3);
        }
        this.insertOrUpdatePrefs(persistedInstallationEntry0.withNoGeneratedFid());
        return null;
    }

    private void doNetworkCallIfNecessary(boolean z) {
        PersistedInstallationEntry persistedInstallationEntry1;
        PersistedInstallationEntry persistedInstallationEntry0 = this.getMultiProcessSafePrefs();
        try {
            if(persistedInstallationEntry0.isErrored() || persistedInstallationEntry0.isUnregistered()) {
                persistedInstallationEntry1 = this.registerFidWithServer(persistedInstallationEntry0);
            }
            else {
                if(!z && !this.utils.isAuthTokenExpired(persistedInstallationEntry0)) {
                    return;
                }
                persistedInstallationEntry1 = this.fetchAuthTokenFromServer(persistedInstallationEntry0);
            }
        }
        catch(FirebaseInstallationsException firebaseInstallationsException0) {
            this.triggerOnException(persistedInstallationEntry0, firebaseInstallationsException0);
            return;
        }
        this.insertOrUpdatePrefs(persistedInstallationEntry1);
        if(persistedInstallationEntry1.isRegistered()) {
            this.updateCacheFid(persistedInstallationEntry1.getFirebaseInstallationId());
        }
        if(persistedInstallationEntry1.isErrored()) {
            this.triggerOnException(persistedInstallationEntry1, new FirebaseInstallationsException(Status.BAD_CONFIG));
            return;
        }
        if(persistedInstallationEntry1.isNotGenerated()) {
            this.triggerOnException(persistedInstallationEntry1, new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
            return;
        }
        this.triggerOnStateReached(persistedInstallationEntry1);
    }

    private final void doRegistrationOrRefresh(boolean z) {
        PersistedInstallationEntry persistedInstallationEntry0 = this.getPrefsWithGeneratedIdMultiProcessSafe();
        if(z) {
            persistedInstallationEntry0 = persistedInstallationEntry0.withClearedAuthToken();
        }
        this.triggerOnStateReached(persistedInstallationEntry0);
        Runnable runnable0 = FirebaseInstallations..Lambda.4.lambdaFactory$(this, z);
        this.networkExecutor.execute(runnable0);
    }

    private PersistedInstallationEntry fetchAuthTokenFromServer(PersistedInstallationEntry persistedInstallationEntry0) throws FirebaseInstallationsException {
        String s = this.getApiKey();
        String s1 = persistedInstallationEntry0.getFirebaseInstallationId();
        String s2 = this.getProjectIdentifier();
        String s3 = persistedInstallationEntry0.getRefreshToken();
        TokenResult tokenResult0 = this.serviceClient.generateAuthToken(s, s1, s2, s3);
        switch(com.google.firebase.installations.FirebaseInstallations.2.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[tokenResult0.getResponseCode().ordinal()]) {
            case 1: {
                return persistedInstallationEntry0.withAuthToken(tokenResult0.getToken(), tokenResult0.getTokenExpirationTimestamp(), this.utils.currentTimeInSecs());
            }
            case 2: {
                return persistedInstallationEntry0.withFisError("BAD CONFIG");
            }
            case 3: {
                this.updateCacheFid(null);
                return persistedInstallationEntry0.withNoGeneratedFid();
            }
            default: {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
            }
        }
    }

    String getApiKey() {
        return this.firebaseApp.getOptions().getApiKey();
    }

    String getApplicationId() {
        return this.firebaseApp.getOptions().getApplicationId();
    }

    private String getCacheFid() {
        synchronized(this) {
        }
        return this.cachedFid;
    }

    @Override  // com.google.firebase.installations.FirebaseInstallationsApi
    public Task getId() {
        this.preConditionChecks();
        String s = this.getCacheFid();
        if(s != null) {
            return Tasks.forResult(s);
        }
        Task task0 = this.addGetIdListener();
        Runnable runnable0 = FirebaseInstallations..Lambda.1.lambdaFactory$(this);
        this.backgroundExecutor.execute(runnable0);
        return task0;
    }

    public static FirebaseInstallations getInstance() {
        return FirebaseInstallations.getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstallations getInstance(FirebaseApp firebaseApp0) {
        Preconditions.checkArgument(firebaseApp0 != null, "Null is not a valid value of FirebaseApp.");
        return (FirebaseInstallations)firebaseApp0.get(FirebaseInstallationsApi.class);
    }

    private PersistedInstallationEntry getMultiProcessSafePrefs() {
        PersistedInstallationEntry persistedInstallationEntry0;
        synchronized(FirebaseInstallations.lockGenerateFid) {
            CrossProcessLock crossProcessLock0 = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), "generatefid.lock");
            try {
                persistedInstallationEntry0 = this.persistedInstallation.readPersistedInstallationEntryValue();
            }
            catch(Throwable throwable0) {
                if(crossProcessLock0 != null) {
                    crossProcessLock0.releaseAndClose();
                }
                throw throwable0;
            }
            if(crossProcessLock0 != null) {
                crossProcessLock0.releaseAndClose();
            }
            return persistedInstallationEntry0;
        }
    }

    String getName() {
        return this.firebaseApp.getName();
    }

    private PersistedInstallationEntry getPrefsWithGeneratedIdMultiProcessSafe() {
        synchronized(FirebaseInstallations.lockGenerateFid) {
            CrossProcessLock crossProcessLock0 = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), "generatefid.lock");
            try {
                PersistedInstallationEntry persistedInstallationEntry0 = this.persistedInstallation.readPersistedInstallationEntryValue();
                if(persistedInstallationEntry0.isNotGenerated()) {
                    PersistedInstallationEntry persistedInstallationEntry1 = persistedInstallationEntry0.withUnregisteredFid(this.readExistingIidOrCreateFid(persistedInstallationEntry0));
                    persistedInstallationEntry0 = this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry1);
                }
                return persistedInstallationEntry0;
            }
            finally {
                if(crossProcessLock0 != null) {
                    crossProcessLock0.releaseAndClose();
                }
            }
        }
    }

    String getProjectIdentifier() {
        return this.firebaseApp.getOptions().getProjectId();
    }

    @Override  // com.google.firebase.installations.FirebaseInstallationsApi
    public Task getToken(boolean z) {
        this.preConditionChecks();
        Task task0 = this.addGetAuthTokenListener();
        Runnable runnable0 = FirebaseInstallations..Lambda.2.lambdaFactory$(this, z);
        this.backgroundExecutor.execute(runnable0);
        return task0;
    }

    private void insertOrUpdatePrefs(PersistedInstallationEntry persistedInstallationEntry0) {
        synchronized(FirebaseInstallations.lockGenerateFid) {
            CrossProcessLock crossProcessLock0 = CrossProcessLock.acquire(this.firebaseApp.getApplicationContext(), "generatefid.lock");
            try {
                this.persistedInstallation.insertOrUpdatePersistedInstallationEntry(persistedInstallationEntry0);
            }
            catch(Throwable throwable0) {
                if(crossProcessLock0 != null) {
                    crossProcessLock0.releaseAndClose();
                }
                throw throwable0;
            }
            if(crossProcessLock0 != null) {
                crossProcessLock0.releaseAndClose();
            }
        }
    }

    static void lambda$doRegistrationOrRefresh$2(FirebaseInstallations firebaseInstallations0, boolean z) {
        firebaseInstallations0.doNetworkCallIfNecessary(z);
    }

    static void lambda$getId$0(FirebaseInstallations firebaseInstallations0) {
        firebaseInstallations0.doRegistrationOrRefresh(false);
    }

    static void lambda$getToken$1(FirebaseInstallations firebaseInstallations0, boolean z) {
        firebaseInstallations0.doRegistrationOrRefresh(z);
    }

    private void preConditionChecks() {
        Preconditions.checkNotEmpty(this.getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.getProjectIdentifier(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(this.getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Utils.isValidAppIdFormat(this.getApplicationId()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(Utils.isValidApiKeyFormat(this.getApiKey()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    // 去混淆评级： 低(22)
    private String readExistingIidOrCreateFid(PersistedInstallationEntry persistedInstallationEntry0) {
        if(!this.firebaseApp.getName().equals("CHIME_ANDROID_SDK") && !this.firebaseApp.isDefaultApp() || !persistedInstallationEntry0.shouldAttemptMigration()) {
            return "f3soFWaNTjirEhzm1bSBoc";
        }
        String s = this.iidStore.readIid();
        return TextUtils.isEmpty(s) ? "f3soFWaNTjirEhzm1bSBoc" : s;
    }

    private PersistedInstallationEntry registerFidWithServer(PersistedInstallationEntry persistedInstallationEntry0) throws FirebaseInstallationsException {
        String s = persistedInstallationEntry0.getFirebaseInstallationId() == null || persistedInstallationEntry0.getFirebaseInstallationId().length() != 11 ? null : this.iidStore.readToken();
        String s1 = this.getApiKey();
        String s2 = persistedInstallationEntry0.getFirebaseInstallationId();
        String s3 = this.getProjectIdentifier();
        String s4 = this.getApplicationId();
        InstallationResponse installationResponse0 = this.serviceClient.createFirebaseInstallation(s1, s2, s3, s4, s);
        switch(com.google.firebase.installations.FirebaseInstallations.2.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[installationResponse0.getResponseCode().ordinal()]) {
            case 1: {
                return persistedInstallationEntry0.withRegisteredFid(installationResponse0.getFid(), installationResponse0.getRefreshToken(), this.utils.currentTimeInSecs(), installationResponse0.getAuthToken().getToken(), installationResponse0.getAuthToken().getTokenExpirationTimestamp());
            }
            case 2: {
                return persistedInstallationEntry0.withFisError("BAD CONFIG");
            }
            default: {
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", Status.UNAVAILABLE);
            }
        }
    }

    private void triggerOnException(PersistedInstallationEntry persistedInstallationEntry0, Exception exception0) {
        synchronized(this.lock) {
            Iterator iterator0 = this.listeners.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((StateListener)object1).onException(persistedInstallationEntry0, exception0)) {
                    iterator0.remove();
                }
            }
        }
    }

    private void triggerOnStateReached(PersistedInstallationEntry persistedInstallationEntry0) {
        synchronized(this.lock) {
            Iterator iterator0 = this.listeners.iterator();
            while(iterator0.hasNext()) {
                Object object1 = iterator0.next();
                if(((StateListener)object1).onStateReached(persistedInstallationEntry0)) {
                    iterator0.remove();
                }
            }
        }
    }

    private void updateCacheFid(String s) {
        synchronized(this) {
            this.cachedFid = s;
        }
    }

    class com.google.firebase.installations.FirebaseInstallations.2 {
        static final int[] $SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode;
        static final int[] $SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode;

        static {
            int[] arr_v = new int[ResponseCode.values().length];
            com.google.firebase.installations.FirebaseInstallations.2.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode = arr_v;
            try {
                arr_v[ResponseCode.OK.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.installations.FirebaseInstallations.2.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[ResponseCode.BAD_CONFIG.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.installations.FirebaseInstallations.2.$SwitchMap$com$google$firebase$installations$remote$TokenResult$ResponseCode[ResponseCode.AUTH_ERROR.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            int[] arr_v1 = new int[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.values().length];
            com.google.firebase.installations.FirebaseInstallations.2.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode = arr_v1;
            try {
                arr_v1[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.OK.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.google.firebase.installations.FirebaseInstallations.2.$SwitchMap$com$google$firebase$installations$remote$InstallationResponse$ResponseCode[com.google.firebase.installations.remote.InstallationResponse.ResponseCode.BAD_CONFIG.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

