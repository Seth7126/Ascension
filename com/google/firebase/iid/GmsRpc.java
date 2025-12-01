package com.google.firebase.iid;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo.HeartBeat;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

public class GmsRpc {
    public static final String ERROR_INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";
    public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
    private final FirebaseApp app;
    private final FirebaseInstallationsApi firebaseInstallations;
    private final HeartBeatInfo heartbeatInfo;
    private final Metadata metadata;
    private final Rpc rpc;
    private final UserAgentPublisher userAgentPublisher;

    GmsRpc(FirebaseApp firebaseApp0, Metadata metadata0, Rpc rpc0, UserAgentPublisher userAgentPublisher0, HeartBeatInfo heartBeatInfo0, FirebaseInstallationsApi firebaseInstallationsApi0) {
        this.app = firebaseApp0;
        this.metadata = metadata0;
        this.rpc = rpc0;
        this.userAgentPublisher = userAgentPublisher0;
        this.heartbeatInfo = heartBeatInfo0;
        this.firebaseInstallations = firebaseInstallationsApi0;
    }

    public GmsRpc(FirebaseApp firebaseApp0, Metadata metadata0, UserAgentPublisher userAgentPublisher0, HeartBeatInfo heartBeatInfo0, FirebaseInstallationsApi firebaseInstallationsApi0) {
        this(firebaseApp0, metadata0, new Rpc(firebaseApp0.getApplicationContext(), metadata0), userAgentPublisher0, heartBeatInfo0, firebaseInstallationsApi0);
    }

    private static String base64UrlSafe(byte[] arr_b) {
        return Base64.encodeToString(arr_b, 11);
    }

    public Task deleteInstanceId(String s) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("iid-operation", "delete");
        bundle0.putString("delete", "1");
        return this.extractResponseWhenComplete(this.startRpc(s, "*", "*", bundle0));
    }

    public Task deleteToken(String s, String s1, String s2) {
        Bundle bundle0 = new Bundle();
        bundle0.putString("delete", "1");
        return this.extractResponseWhenComplete(this.startRpc(s, s1, s2, bundle0));
    }

    private Task extractResponseWhenComplete(Task task0) {
        return task0.continueWith(FirebaseIidExecutors.directExecutor(), (Task task0) -> this.handleResponse(((Bundle)task0.getResult(IOException.class))));
    }

    private String getHashedFirebaseAppName() {
        String s = this.app.getName();
        try {
            return GmsRpc.base64UrlSafe(MessageDigest.getInstance("SHA-1").digest(s.getBytes()));
        }
        catch(NoSuchAlgorithmException unused_ex) {
            return "[HASH-ERROR]";
        }
    }

    public Task getToken(String s, String s1, String s2) {
        return this.extractResponseWhenComplete(this.startRpc(s, s1, s2, new Bundle()));
    }

    private String handleResponse(Bundle bundle0) throws IOException {
        if(bundle0 == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String s = bundle0.getString("registration_id");
        if(s != null) {
            return s;
        }
        String s1 = bundle0.getString("unregistered");
        if(s1 != null) {
            return s1;
        }
        String s2 = bundle0.getString("error");
        if("RST".equals(s2)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if(s2 != null) {
            throw new IOException(s2);
        }
        Log.w("FirebaseInstanceId", "Unexpected response: " + bundle0, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    // 去混淆评级： 低(30)
    static boolean isErrorMessageForRetryableError(String s) {
        return "SERVICE_NOT_AVAILABLE".equals(s) || "INTERNAL_SERVER_ERROR".equals(s) || "InternalServerError".equals(s);
    }

    // 检测为 Lambda 实现
    final String lambda$extractResponseWhenComplete$0$GmsRpc(Task task0) throws Exception [...]

    private Bundle setDefaultAttributesToBundle(String s, String s1, String s2, Bundle bundle0) {
        bundle0.putString("scope", s2);
        bundle0.putString("sender", s1);
        bundle0.putString("subtype", s1);
        bundle0.putString("appid", s);
        bundle0.putString("gmp_app_id", this.app.getOptions().getApplicationId());
        bundle0.putString("gmsv", Integer.toString(this.metadata.getGmsVersionCode()));
        bundle0.putString("osv", "33");
        bundle0.putString("app_ver", this.metadata.getAppVersionCode());
        bundle0.putString("app_ver_name", this.metadata.getAppVersionName());
        bundle0.putString("firebase-app-name-hash", this.getHashedFirebaseAppName());
        try {
            String s3 = ((InstallationTokenResult)Tasks.await(this.firebaseInstallations.getToken(false))).getToken();
            if(TextUtils.isEmpty(s3)) {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
            else {
                bundle0.putString("Goog-Firebase-Installations-Auth", s3);
            }
        }
        catch(ExecutionException | InterruptedException executionException0) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", executionException0);
        }
        bundle0.putString("cliv", "fiid-20.2.3");
        HeartBeat heartBeatInfo$HeartBeat0 = this.heartbeatInfo.getHeartBeatCode("fire-iid");
        if(heartBeatInfo$HeartBeat0 != HeartBeat.NONE) {
            bundle0.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatInfo$HeartBeat0.getCode()));
            bundle0.putString("Firebase-Client", this.userAgentPublisher.getUserAgent());
        }
        return bundle0;
    }

    private Task startRpc(String s, String s1, String s2, Bundle bundle0) {
        this.setDefaultAttributesToBundle(s, s1, s2, bundle0);
        return this.rpc.registerRpc(bundle0);
    }

    public Task subscribeToTopic(String s, String s1, String s2) {
        Bundle bundle0 = new Bundle();
        String s3 = String.valueOf(s2);
        bundle0.putString("gcm.topic", (s3.length() == 0 ? new String("/topics/") : "/topics/" + s3));
        String s4 = String.valueOf(s2);
        return s4.length() == 0 ? this.extractResponseWhenComplete(this.startRpc(s, s1, new String("/topics/"), bundle0)) : this.extractResponseWhenComplete(this.startRpc(s, s1, "/topics/" + s4, bundle0));
    }

    public Task unsubscribeFromTopic(String s, String s1, String s2) {
        Bundle bundle0 = new Bundle();
        String s3 = String.valueOf(s2);
        bundle0.putString("gcm.topic", (s3.length() == 0 ? new String("/topics/") : "/topics/" + s3));
        bundle0.putString("delete", "1");
        String s4 = String.valueOf(s2);
        return s4.length() == 0 ? this.extractResponseWhenComplete(this.startRpc(s, s1, new String("/topics/"), bundle0)) : this.extractResponseWhenComplete(this.startRpc(s, s1, "/topics/" + s4, bundle0));
    }
}

