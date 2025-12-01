package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ProfileInstallReceiver extends BroadcastReceiver {
    class ResultDiagnostics implements DiagnosticsCallback {
        @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
        public void onDiagnosticReceived(int v, Object object0) {
            ProfileInstaller.LOG_DIAGNOSTICS.onDiagnosticReceived(v, object0);
        }

        @Override  // androidx.profileinstaller.ProfileInstaller$DiagnosticsCallback
        public void onResultReceived(int v, Object object0) {
            ProfileInstaller.LOG_DIAGNOSTICS.onResultReceived(v, object0);
            ProfileInstallReceiver.this.setResultCode(v);
        }
    }

    public static final String ACTION_INSTALL_PROFILE = "androidx.profileinstaller.action.INSTALL_PROFILE";

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        if(!"androidx.profileinstaller.action.INSTALL_PROFILE".equals(intent0.getAction())) {
            return;
        }
        ProfileInstaller.writeProfile(context0, new ProfileInstallReceiver..ExternalSyntheticLambda0(), new ResultDiagnostics(this));
    }
}

