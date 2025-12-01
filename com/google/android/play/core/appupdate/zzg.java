package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest.Builder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;

final class zzg implements AppUpdateManager {
    private final zzr zza;
    private final zzc zzb;
    private final Context zzc;
    private final Handler zzd;

    zzg(zzr zzr0, zzc zzc0, Context context0) {
        this.zzd = new Handler(Looper.getMainLooper());
        this.zza = zzr0;
        this.zzb = zzc0;
        this.zzc = context0;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task completeUpdate() {
        return this.zza.zzd("com.playdekgames.android.Ascension");
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task getAppUpdateInfo() {
        return this.zza.zze("com.playdekgames.android.Ascension");
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final void registerListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        synchronized(this) {
            this.zzb.zzb(installStateUpdatedListener0);
        }
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task startUpdateFlow(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0) {
        if(appUpdateInfo0 != null && activity0 != null && appUpdateOptions0 != null && !appUpdateInfo0.zzd()) {
            if(!appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0)) {
                return Tasks.forException(new InstallException(-6));
            }
            appUpdateInfo0.zzc();
            Intent intent0 = new Intent(activity0, PlayCoreDialogWrapperActivity.class);
            intent0.putExtra("confirmation_intent", appUpdateInfo0.zza(appUpdateOptions0));
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
            intent0.putExtra("result_receiver", new zze(this, this.zzd, taskCompletionSource0));
            activity0.startActivity(intent0);
            return taskCompletionSource0.getTask();
        }
        return Tasks.forException(new InstallException(-4));
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, int v, Activity activity0, int v1) throws IntentSender.SendIntentException {
        AppUpdateOptions appUpdateOptions0 = AppUpdateOptions.defaultOptions(v);
        return activity0 == null ? false : this.startUpdateFlowForResult(appUpdateInfo0, new zzf(this, activity0), appUpdateOptions0, v1);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, int v, IntentSenderForResultStarter intentSenderForResultStarter0, int v1) throws IntentSender.SendIntentException {
        return this.startUpdateFlowForResult(appUpdateInfo0, intentSenderForResultStarter0, AppUpdateOptions.defaultOptions(v), v1);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0, int v) throws IntentSender.SendIntentException {
        return activity0 == null ? false : this.startUpdateFlowForResult(appUpdateInfo0, new zzf(this, activity0), appUpdateOptions0, v);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, ActivityResultLauncher activityResultLauncher0, AppUpdateOptions appUpdateOptions0) {
        if(appUpdateInfo0 != null && activityResultLauncher0 != null && appUpdateOptions0 != null && appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && !appUpdateInfo0.zzd()) {
            appUpdateInfo0.zzc();
            activityResultLauncher0.launch(new Builder(appUpdateInfo0.zza(appUpdateOptions0).getIntentSender()).build());
            return true;
        }
        return false;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, IntentSenderForResultStarter intentSenderForResultStarter0, AppUpdateOptions appUpdateOptions0, int v) throws IntentSender.SendIntentException {
        if(appUpdateInfo0 != null && intentSenderForResultStarter0 != null && appUpdateOptions0 != null && appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && !appUpdateInfo0.zzd()) {
            appUpdateInfo0.zzc();
            intentSenderForResultStarter0.startIntentSenderForResult(appUpdateInfo0.zza(appUpdateOptions0).getIntentSender(), v, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        synchronized(this) {
            this.zzb.zzc(installStateUpdatedListener0);
        }
    }
}

