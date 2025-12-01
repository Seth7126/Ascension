package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import javax.annotation.Nonnull;

public class FirebaseInstanceId {
    class AutoInit {
        private EventHandler dataCollectionDefaultChangeEventHandler;
        private Boolean fcmAutoInitEnabled;
        private boolean initialized;
        private boolean isFcmLibraryPresent;
        private final Subscriber subscriber;

        AutoInit(Subscriber subscriber0) {
            this.subscriber = subscriber0;
        }

        void initialize() {
            synchronized(this) {
                if(this.initialized) {
                    return;
                }
                this.isFcmLibraryPresent = this.isFcmPresent();
                Boolean boolean0 = this.readEnabled();
                this.fcmAutoInitEnabled = boolean0;
                if(boolean0 == null && this.isFcmLibraryPresent) {
                    FirebaseInstanceId.AutoInit..Lambda.0 firebaseInstanceId$AutoInit$$Lambda$00 = (Event event0) -> synchronized(this) {
                        if(this.isEnabled()) {
                            FirebaseInstanceId.this.startSyncIfNecessary();
                        }
                    };
                    this.dataCollectionDefaultChangeEventHandler = firebaseInstanceId$AutoInit$$Lambda$00;
                    this.subscriber.subscribe(DataCollectionDefaultChange.class, firebaseInstanceId$AutoInit$$Lambda$00);
                }
                this.initialized = true;
            }
        }

        boolean isEnabled() {
            synchronized(this) {
                this.initialize();
                Boolean boolean0 = this.fcmAutoInitEnabled;
                return boolean0 != null ? boolean0.booleanValue() : this.isFcmLibraryPresent && FirebaseInstanceId.this.app.isDataCollectionDefaultEnabled();
            }
        }

        private boolean isFcmPresent() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return true;
            }
            catch(ClassNotFoundException unused_ex) {
                Context context0 = FirebaseInstanceId.this.app.getApplicationContext();
                Intent intent0 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent0.setPackage("com.playdekgames.android.Ascension");
                ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent0, 0);
                return resolveInfo0 != null && resolveInfo0.serviceInfo != null;
            }
        }

        // 检测为 Lambda 实现
        final void lambda$initialize$0$FirebaseInstanceId$AutoInit(Event event0) [...]

        private Boolean readEnabled() {
            Context context0 = FirebaseInstanceId.this.app.getApplicationContext();
            SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.messaging", 0);
            if(sharedPreferences0.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences0.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager0 = context0.getPackageManager();
                if(packageManager0 != null) {
                    ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.playdekgames.android.Ascension", 0x80);
                    return applicationInfo0 == null || applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("firebase_messaging_auto_init_enabled") ? null : Boolean.valueOf(applicationInfo0.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                }
            }
            catch(PackageManager.NameNotFoundException unused_ex) {
            }
            return null;
        }

        void setEnabled(boolean z) {
            synchronized(this) {
                this.initialize();
                EventHandler eventHandler0 = this.dataCollectionDefaultChangeEventHandler;
                if(eventHandler0 != null) {
                    this.subscriber.unsubscribe(DataCollectionDefaultChange.class, eventHandler0);
                    this.dataCollectionDefaultChangeEventHandler = null;
                }
                SharedPreferences.Editor sharedPreferences$Editor0 = FirebaseInstanceId.this.app.getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                sharedPreferences$Editor0.putBoolean("auto_init", z);
                sharedPreferences$Editor0.apply();
                if(z) {
                    FirebaseInstanceId.this.startSyncIfNecessary();
                }
                this.fcmAutoInitEnabled = Boolean.valueOf(z);
            }
        }
    }

    private static final Pattern API_KEY_FORMAT;
    private static final long MAX_DELAY_SEC;
    private final FirebaseApp app;
    private final AutoInit autoInit;
    final Executor fileIoExecutor;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final Metadata metadata;
    private final RequestDeduplicator requestDeduplicator;
    private final GmsRpc rpc;
    private static Store store;
    static ScheduledExecutorService syncExecutor;
    private boolean syncScheduledOrRunning;

    static {
        FirebaseInstanceId.MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8L);
        FirebaseInstanceId.API_KEY_FORMAT = Pattern.compile("\\AA[\\w-]{38}\\z");
    }

    FirebaseInstanceId(FirebaseApp firebaseApp0, Subscriber subscriber0, UserAgentPublisher userAgentPublisher0, HeartBeatInfo heartBeatInfo0, FirebaseInstallationsApi firebaseInstallationsApi0) {
        this(firebaseApp0, new Metadata(firebaseApp0.getApplicationContext()), FirebaseIidExecutors.newCachedSingleThreadExecutor(), FirebaseIidExecutors.newCachedSingleThreadExecutor(), subscriber0, userAgentPublisher0, heartBeatInfo0, firebaseInstallationsApi0);
    }

    FirebaseInstanceId(FirebaseApp firebaseApp0, Metadata metadata0, Executor executor0, Executor executor1, Subscriber subscriber0, UserAgentPublisher userAgentPublisher0, HeartBeatInfo heartBeatInfo0, FirebaseInstallationsApi firebaseInstallationsApi0) {
        this.syncScheduledOrRunning = false;
        if(Metadata.getDefaultSenderId(firebaseApp0) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized(FirebaseInstanceId.class) {
            if(FirebaseInstanceId.store == null) {
                FirebaseInstanceId.store = new Store(firebaseApp0.getApplicationContext());
            }
        }
        this.app = firebaseApp0;
        this.metadata = metadata0;
        this.rpc = new GmsRpc(firebaseApp0, metadata0, userAgentPublisher0, heartBeatInfo0, firebaseInstallationsApi0);
        this.fileIoExecutor = executor1;
        this.autoInit = new AutoInit(this, subscriber0);
        this.requestDeduplicator = new RequestDeduplicator(executor0);
        this.firebaseInstallations = firebaseInstallationsApi0;
        executor1.execute(() -> if(this.isFcmAutoInitEnabled()) {
            this.startSyncIfNecessary();
        });
    }

    private Object awaitTask(Task task0) throws IOException {
        try {
            return Tasks.await(task0, 30000L, TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException executionException0) {
            Throwable throwable0 = executionException0.getCause();
            if(throwable0 instanceof IOException) {
                if("INSTANCE_ID_RESET".equals(throwable0.getMessage())) {
                    this.resetStorageAndScheduleSync();
                }
                throw (IOException)throwable0;
            }
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            throw new IOException(executionException0);
        }
        catch(InterruptedException | TimeoutException unused_ex) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    private static Object awaitTaskAllowOnMainThread(Task task0) throws InterruptedException {
        Preconditions.checkNotNull(task0, "Task must not be null");
        CountDownLatch countDownLatch0 = new CountDownLatch(1);
        FirebaseInstanceId..Lambda.3 firebaseInstanceId$$Lambda$30 = (Task task0) -> countDownLatch0.countDown();
        task0.addOnCompleteListener(FirebaseInstanceId..Lambda.2.$instance, firebaseInstanceId$$Lambda$30);
        countDownLatch0.await(30000L, TimeUnit.MILLISECONDS);
        return FirebaseInstanceId.getResultOrThrowException(task0);
    }

    String blockingGetMasterToken() throws IOException {
        return this.getToken(Metadata.getDefaultSenderId(this.app), "*");
    }

    private static void checkRequiredFirebaseOptions(FirebaseApp firebaseApp0) {
        Preconditions.checkNotEmpty(firebaseApp0.getOptions().getProjectId(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        Preconditions.checkNotEmpty(firebaseApp0.getOptions().getApplicationId(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        Preconditions.checkNotEmpty(firebaseApp0.getOptions().getApiKey(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        Preconditions.checkArgument(FirebaseInstanceId.isValidAppIdFormat(firebaseApp0.getOptions().getApplicationId()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(FirebaseInstanceId.isValidApiKeyFormat(firebaseApp0.getOptions().getApiKey()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public static void clearInstancesForTest() {
        synchronized(FirebaseInstanceId.class) {
            ScheduledExecutorService scheduledExecutorService0 = FirebaseInstanceId.syncExecutor;
            if(scheduledExecutorService0 != null) {
                scheduledExecutorService0.shutdownNow();
            }
            FirebaseInstanceId.syncExecutor = null;
            FirebaseInstanceId.store = null;
        }
    }

    public void deleteInstanceId() throws IOException {
        FirebaseInstanceId.checkRequiredFirebaseOptions(this.app);
        if(Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        this.awaitTask(this.firebaseInstallations.delete());
        this.resetStorageAndScheduleSync();
    }

    public void deleteToken(String s, String s1) throws IOException {
        FirebaseInstanceId.checkRequiredFirebaseOptions(this.app);
        if(Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        String s2 = FirebaseInstanceId.rationaliseScope(s1);
        String s3 = this.getIdWithoutTriggeringSync();
        this.awaitTask(this.rpc.deleteToken(s3, s, s2));
        FirebaseInstanceId.store.deleteToken(this.getSubtype(), s, s2);
    }

    void enqueueTaskWithDelaySeconds(Runnable runnable0, long v) {
        synchronized(FirebaseInstanceId.class) {
            if(FirebaseInstanceId.syncExecutor == null) {
                FirebaseInstanceId.syncExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }
            FirebaseInstanceId.syncExecutor.schedule(runnable0, v, TimeUnit.SECONDS);
        }
    }

    void forceTokenRefresh() {
        FirebaseInstanceId.store.deleteTokens(this.getSubtype());
        this.startSync();
    }

    FirebaseApp getApp() {
        return this.app;
    }

    public long getCreationTime() {
        return FirebaseInstanceId.store.getCreationTime(this.app.getPersistenceKey());
    }

    public String getId() {
        FirebaseInstanceId.checkRequiredFirebaseOptions(this.app);
        this.startSyncIfNecessary();
        return this.getIdWithoutTriggeringSync();
    }

    String getIdWithoutTriggeringSync() {
        try {
            FirebaseInstanceId.store.setCreationTime(this.app.getPersistenceKey());
            return (String)FirebaseInstanceId.awaitTaskAllowOnMainThread(this.firebaseInstallations.getId());
        }
        catch(InterruptedException interruptedException0) {
            throw new IllegalStateException(interruptedException0);
        }
    }

    public static FirebaseInstanceId getInstance() {
        return FirebaseInstanceId.getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp0) {
        FirebaseInstanceId.checkRequiredFirebaseOptions(firebaseApp0);
        return (FirebaseInstanceId)firebaseApp0.get(FirebaseInstanceId.class);
    }

    private Task getInstanceId(String s, String s1) {
        Task task0 = Tasks.forResult(null);
        FirebaseInstanceId..Lambda.1 firebaseInstanceId$$Lambda$10 = (Task task0) -> {
            String s2 = this.getIdWithoutTriggeringSync();
            Token store$Token0 = this.getTokenWithoutTriggeringSync(s, FirebaseInstanceId.rationaliseScope(s1));
            if(!this.tokenNeedsRefresh(store$Token0)) {
                return Tasks.forResult(new InstanceIdResultImpl(s2, store$Token0.token));
            }
            FirebaseInstanceId..Lambda.4 firebaseInstanceId$$Lambda$40 = () -> {
                Task task0 = this.rpc.getToken(s2, s, s1);
                FirebaseInstanceId..Lambda.5 firebaseInstanceId$$Lambda$50 = (String s3) -> {
                    FirebaseInstanceId.store.saveToken(this.getSubtype(), s1, s2, s3, this.metadata.getAppVersionCode());
                    return Tasks.forResult(new InstanceIdResultImpl(s, s3));
                };
                return task0.onSuccessTask(this.fileIoExecutor, firebaseInstanceId$$Lambda$50);
            };
            return this.requestDeduplicator.getOrStartGetTokenRequest(s, FirebaseInstanceId.rationaliseScope(s1), firebaseInstanceId$$Lambda$40);
        };
        return task0.continueWithTask(this.fileIoExecutor, firebaseInstanceId$$Lambda$10);
    }

    public Task getInstanceId() {
        FirebaseInstanceId.checkRequiredFirebaseOptions(this.app);
        return this.getInstanceId(Metadata.getDefaultSenderId(this.app), "*");
    }

    private static Object getResultOrThrowException(Task task0) {
        if(task0.isSuccessful()) {
            return task0.getResult();
        }
        if(task0.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if(!task0.isComplete()) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
        throw new IllegalStateException(task0.getException());
    }

    // 去混淆评级： 低(20)
    private String getSubtype() {
        return "[DEFAULT]".equals(this.app.getName()) ? "" : this.app.getPersistenceKey();
    }

    @Deprecated
    public String getToken() {
        FirebaseInstanceId.checkRequiredFirebaseOptions(this.app);
        Token store$Token0 = this.getTokenWithoutTriggeringSync();
        if(this.tokenNeedsRefresh(store$Token0)) {
            this.startSync();
        }
        return Token.getTokenOrNull(store$Token0);
    }

    public String getToken(String s, String s1) throws IOException {
        FirebaseInstanceId.checkRequiredFirebaseOptions(this.app);
        if(Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        return ((InstanceIdResult)this.awaitTask(this.getInstanceId(s, s1))).getToken();
    }

    Token getTokenWithoutTriggeringSync() {
        return this.getTokenWithoutTriggeringSync(Metadata.getDefaultSenderId(this.app), "*");
    }

    Token getTokenWithoutTriggeringSync(String s, String s1) {
        return FirebaseInstanceId.store.getToken(this.getSubtype(), s, s1);
    }

    // 去混淆评级： 低(30)
    static boolean isDebugLogEnabled() {
        return Log.isLoggable("FirebaseInstanceId", 3) || Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
    }

    public boolean isFcmAutoInitEnabled() {
        return this.autoInit.isEnabled();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.isGmscorePresent();
    }

    static boolean isValidApiKeyFormat(@Nonnull String s) {
        return FirebaseInstanceId.API_KEY_FORMAT.matcher(s).matches();
    }

    static boolean isValidAppIdFormat(@Nonnull String s) {
        return s.contains(":");
    }

    // 检测为 Lambda 实现
    static final void lambda$awaitTaskAllowOnMainThread$4$FirebaseInstanceId(CountDownLatch countDownLatch0, Task task0) [...]

    // 检测为 Lambda 实现
    final Task lambda$getInstanceId$1$FirebaseInstanceId(String s, String s1, String s2, String s3) throws Exception [...]

    // 检测为 Lambda 实现
    final Task lambda$getInstanceId$2$FirebaseInstanceId(String s, String s1, String s2) [...]

    // 检测为 Lambda 实现
    final Task lambda$getInstanceId$3$FirebaseInstanceId(String s, String s1, Task task0) throws Exception [...]

    // 检测为 Lambda 实现
    final void lambda$new$0$FirebaseInstanceId() [...]

    // 去混淆评级： 低(30)
    private static String rationaliseScope(String s) {
        return s.isEmpty() || s.equalsIgnoreCase("fcm") || s.equalsIgnoreCase("gcm") ? "*" : s;
    }

    void resetStorageAndScheduleSync() {
        synchronized(this) {
            FirebaseInstanceId.store.deleteAll();
            if(this.isFcmAutoInitEnabled()) {
                this.startSync();
            }
        }
    }

    public void setFcmAutoInitEnabled(boolean z) {
        this.autoInit.setEnabled(z);
    }

    void setSyncScheduledOrRunning(boolean z) {
        synchronized(this) {
            this.syncScheduledOrRunning = z;
        }
    }

    void startSync() {
        synchronized(this) {
            if(!this.syncScheduledOrRunning) {
                this.syncWithDelaySecondsInternal(0L);
            }
        }
    }

    private void startSyncIfNecessary() {
        if(this.tokenNeedsRefresh(this.getTokenWithoutTriggeringSync())) {
            this.startSync();
        }
    }

    void syncWithDelaySecondsInternal(long v) {
        synchronized(this) {
            this.enqueueTaskWithDelaySeconds(new SyncTask(this, Math.min(Math.max(30L, v << 1), FirebaseInstanceId.MAX_DELAY_SEC)), v);
            this.syncScheduledOrRunning = true;
        }
    }

    boolean tokenNeedsRefresh(Token store$Token0) {
        return store$Token0 == null || store$Token0.needsRefresh(this.metadata.getAppVersionCode());
    }
}

