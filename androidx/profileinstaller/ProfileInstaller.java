package androidx.profileinstaller;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

public class ProfileInstaller {
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiagnosticCode {
    }

    public interface DiagnosticsCallback {
        void onDiagnosticReceived(int arg1, Object arg2);

        void onResultReceived(int arg1, Object arg2);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResultCode {
    }

    public static final int DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST = 2;
    public static final int DIAGNOSTIC_CURRENT_PROFILE_EXISTS = 1;
    public static final int DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST = 4;
    public static final int DIAGNOSTIC_REF_PROFILE_EXISTS = 3;
    private static final DiagnosticsCallback EMPTY_DIAGNOSTICS = null;
    static final DiagnosticsCallback LOG_DIAGNOSTICS = null;
    private static final int MIN_MEANINGFUL_LENGTH = 10;
    private static final String PROFILE_BASE_DIR = "/data/misc/profiles/cur/0";
    private static final String PROFILE_FILE = "primary.prof";
    private static final String PROFILE_REF_BASE_DIR = "/data/misc/profiles/ref";
    private static final String PROFILE_SOURCE_LOCATION = "dexopt/baseline.prof";
    public static final int RESULT_ALREADY_INSTALLED = 2;
    public static final int RESULT_BASELINE_PROFILE_NOT_FOUND = 6;
    public static final int RESULT_DESIRED_FORMAT_UNSUPPORTED = 5;
    public static final int RESULT_INSTALL_SUCCESS = 1;
    public static final int RESULT_IO_EXCEPTION = 7;
    public static final int RESULT_NOT_WRITABLE = 4;
    public static final int RESULT_PARSE_EXCEPTION = 8;
    public static final int RESULT_UNSUPPORTED_ART_VERSION = 3;

    static {
        ProfileInstaller.EMPTY_DIAGNOSTICS = new DiagnosticsCallback() {
            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void onDiagnosticReceived(int code, Object data) {
            }

            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void onResultReceived(int code, Object data) {
            }
        };
        ProfileInstaller.LOG_DIAGNOSTICS = new DiagnosticsCallback() {
            static final String TAG = "ProfileInstaller";

            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void onDiagnosticReceived(int v, Object object0) {
                String s;
                switch(v) {
                    case 1: {
                        s = "DIAGNOSTIC_CURRENT_PROFILE_EXISTS";
                        break;
                    }
                    case 2: {
                        s = "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST";
                        break;
                    }
                    case 3: {
                        s = "DIAGNOSTIC_REF_PROFILE_EXISTS";
                        break;
                    }
                    case 4: {
                        s = "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST";
                        break;
                    }
                    default: {
                        s = "";
                    }
                }
                Log.d("ProfileInstaller", s);
            }

            @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
            public void onResultReceived(int v, Object object0) {
                String s;
                switch(v) {
                    case 1: {
                        s = "RESULT_INSTALL_SUCCESS";
                        break;
                    }
                    case 2: {
                        s = "RESULT_ALREADY_INSTALLED";
                        break;
                    }
                    case 3: {
                        s = "RESULT_UNSUPPORTED_ART_VERSION";
                        break;
                    }
                    case 4: {
                        s = "RESULT_NOT_WRITABLE";
                        break;
                    }
                    case 5: {
                        s = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                        break;
                    }
                    case 6: {
                        s = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                        break;
                    }
                    case 7: {
                        s = "RESULT_IO_EXCEPTION";
                        break;
                    }
                    case 8: {
                        s = "RESULT_PARSE_EXCEPTION";
                        break;
                    }
                    default: {
                        s = "";
                    }
                }
                if(v != 6 && v != 7 && v != 8) {
                    Log.d("ProfileInstaller", s);
                    return;
                }
                Log.e("ProfileInstaller", s, ((Throwable)object0));
            }
        };
    }

    static void diagnostic(Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0, int v, Object object0) {
        executor0.execute(new ProfileInstaller..ExternalSyntheticLambda2(profileInstaller$DiagnosticsCallback0, v, object0));
    }

    // 检测为 Lambda 实现
    static boolean lambda$transcodeAndWrite$2(Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0, long v, ExistingProfileState deviceProfileWriter$ExistingProfileState0) [...]

    static void result(Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0, int v, Object object0) {
        executor0.execute(new ProfileInstaller..ExternalSyntheticLambda0(profileInstaller$DiagnosticsCallback0, v, object0));
    }

    static boolean shouldSkipInstall(Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0, long v, boolean z, long v1, boolean z1, long v2) {
        if(!z || v1 <= 10L) {
            ProfileInstaller.diagnostic(executor0, profileInstaller$DiagnosticsCallback0, 2, null);
        }
        else {
            ProfileInstaller.diagnostic(executor0, profileInstaller$DiagnosticsCallback0, 1, null);
        }
        if(!z1 || v2 <= 10L) {
            ProfileInstaller.diagnostic(executor0, profileInstaller$DiagnosticsCallback0, 4, null);
        }
        else {
            ProfileInstaller.diagnostic(executor0, profileInstaller$DiagnosticsCallback0, 3, null);
        }
        int v3 = Long.compare(v, 0L);
        if(v3 > 0 && v == v1) {
            ProfileInstaller.result(executor0, profileInstaller$DiagnosticsCallback0, 2, null);
            return true;
        }
        if(v3 > 0 && v == v2) {
            ProfileInstaller.result(executor0, profileInstaller$DiagnosticsCallback0, 2, null);
            return true;
        }
        if(v3 > 0 && (v < v1 || v < v2)) {
            ProfileInstaller.result(executor0, profileInstaller$DiagnosticsCallback0, 2, null);
            return true;
        }
        return false;
    }

    private static void transcodeAndWrite(AssetManager assetManager0, String s, Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        DeviceProfileWriter deviceProfileWriter0 = new DeviceProfileWriter(assetManager0, executor0, profileInstaller$DiagnosticsCallback0, "dexopt/baseline.prof", new File(new File("/data/misc/profiles/cur/0", s), "primary.prof"), new File(new File("/data/misc/profiles/ref", s), "primary.prof"));
        if(!deviceProfileWriter0.deviceAllowsProfileInstallerAotWrites()) {
            return;
        }
        ProfileInstaller..ExternalSyntheticLambda1 profileInstaller$$ExternalSyntheticLambda10 = (long v, ExistingProfileState deviceProfileWriter$ExistingProfileState0) -> ProfileInstaller.shouldSkipInstall(executor0, profileInstaller$DiagnosticsCallback0, v, deviceProfileWriter$ExistingProfileState0.hasCurFile(), deviceProfileWriter$ExistingProfileState0.getCurLength(), deviceProfileWriter$ExistingProfileState0.hasRefFile(), deviceProfileWriter$ExistingProfileState0.getRefLength());
        deviceProfileWriter0.copyProfileOrRead(profileInstaller$$ExternalSyntheticLambda10).transcodeIfNeeded().writeIfNeeded(profileInstaller$$ExternalSyntheticLambda10);
    }

    public static void writeProfile(Context context0) {
        ProfileInstaller.writeProfile(context0, new ProfileInstallReceiver..ExternalSyntheticLambda0(), ProfileInstaller.EMPTY_DIAGNOSTICS);
    }

    public static void writeProfile(Context context0, Executor executor0, DiagnosticsCallback profileInstaller$DiagnosticsCallback0) {
        ProfileInstaller.transcodeAndWrite(context0.getApplicationContext().getAssets(), "com.playdekgames.android.Ascension", executor0, profileInstaller$DiagnosticsCallback0);
    }
}

