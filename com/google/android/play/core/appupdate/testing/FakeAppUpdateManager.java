package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResultLauncher;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FakeAppUpdateManager implements AppUpdateManager {
    private final zzc zza;
    private final Context zzb;
    private final List zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private Integer zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private Integer zzo;

    public FakeAppUpdateManager(Context context0) {
        this.zzc = new ArrayList();
        this.zzd = 0;
        this.zze = 0;
        this.zzf = false;
        this.zzg = 0;
        this.zzh = null;
        this.zzi = 0;
        this.zzj = 0L;
        this.zzk = 0L;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zza = new zzc(context0);
        this.zzb = context0;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public Task completeUpdate() {
        if(this.zze != 0) {
            return Tasks.forException(new InstallException(this.zze));
        }
        int v = this.zzd;
        if(v == 11) {
            this.zzd = 3;
            this.zzn = true;
            if(0.equals(this.zzo)) {
                this.zzc();
            }
            return Tasks.forResult(null);
        }
        return v == 3 ? Tasks.forException(new InstallException(-8)) : Tasks.forException(new InstallException(-7));
    }

    public void downloadCompletes() {
        if(this.zzd == 1 || this.zzd == 2) {
            this.zzd = 11;
            this.zzj = 0L;
            this.zzk = 0L;
            if(0.equals(this.zzo)) {
                this.zzc();
                return;
            }
            if(1.equals(this.zzo)) {
                this.completeUpdate();
            }
        }
    }

    public void downloadFails() {
        if(this.zzd != 1 && this.zzd != 2) {
            return;
        }
        this.zzd = 5;
        if(0.equals(this.zzo)) {
            this.zzc();
        }
        this.zzo = null;
        this.zzm = false;
        this.zzd = 0;
    }

    public void downloadStarts() {
        if(this.zzd == 1) {
            this.zzd = 2;
            if(0.equals(this.zzo)) {
                this.zzc();
            }
        }
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public Task getAppUpdateInfo() {
        PendingIntent pendingIntent1;
        PendingIntent pendingIntent0;
        if(this.zze != 0) {
            return Tasks.forException(new InstallException(this.zze));
        }
        if(this.zzb() == 2) {
            if(this.zzc.contains(0)) {
                Intent intent0 = new Intent();
                pendingIntent0 = PendingIntent.getBroadcast(this.zzb, 0, intent0, 0x4000000);
                Intent intent1 = new Intent();
                pendingIntent1 = PendingIntent.getBroadcast(this.zzb, 0, intent1, 0x4000000);
            }
            else {
                pendingIntent0 = null;
                pendingIntent1 = null;
            }
            if(this.zzc.contains(1)) {
                Intent intent2 = new Intent();
                PendingIntent pendingIntent2 = PendingIntent.getBroadcast(this.zzb, 0, intent2, 0x4000000);
                Intent intent3 = new Intent();
                PendingIntent pendingIntent3 = PendingIntent.getBroadcast(this.zzb, 0, intent3, 0x4000000);
                return Tasks.forResult(AppUpdateInfo.zzb("com.playdekgames.android.Ascension", this.zzg, this.zzb(), this.zzd, this.zzh, this.zzi, this.zzj, this.zzk, 0L, 0L, pendingIntent2, pendingIntent0, pendingIntent3, pendingIntent1, new HashMap()));
            }
            return Tasks.forResult(AppUpdateInfo.zzb("com.playdekgames.android.Ascension", this.zzg, this.zzb(), this.zzd, this.zzh, this.zzi, this.zzj, this.zzk, 0L, 0L, null, pendingIntent0, null, pendingIntent1, new HashMap()));
        }
        return Tasks.forResult(AppUpdateInfo.zzb("com.playdekgames.android.Ascension", this.zzg, this.zzb(), this.zzd, this.zzh, this.zzi, this.zzj, this.zzk, 0L, 0L, null, null, null, null, new HashMap()));
    }

    public Integer getTypeForUpdateInProgress() {
        return this.zzo;
    }

    public void installCompletes() {
        if(this.zzd == 3) {
            this.zzd = 4;
            this.zzf = false;
            this.zzg = 0;
            this.zzh = null;
            this.zzi = 0;
            this.zzj = 0L;
            this.zzk = 0L;
            this.zzm = false;
            this.zzn = false;
            if(0.equals(this.zzo)) {
                this.zzc();
            }
            this.zzo = null;
            this.zzd = 0;
        }
    }

    public void installFails() {
        if(this.zzd == 3) {
            this.zzd = 5;
            if(0.equals(this.zzo)) {
                this.zzc();
            }
            this.zzo = null;
            this.zzn = false;
            this.zzm = false;
            this.zzd = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.zzl;
    }

    public boolean isImmediateFlowVisible() {
        return this.zzm;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.zzn;
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public void registerListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        this.zza.zzb(installStateUpdatedListener0);
    }

    public void setBytesDownloaded(long v) {
        if(this.zzd == 2 && v <= this.zzk) {
            this.zzj = v;
            if(0.equals(this.zzo)) {
                this.zzc();
            }
        }
    }

    public void setClientVersionStalenessDays(Integer integer0) {
        if(this.zzf) {
            this.zzh = integer0;
        }
    }

    public void setInstallErrorCode(int v) {
        this.zze = v;
    }

    public void setTotalBytesToDownload(long v) {
        if(this.zzd == 2) {
            this.zzk = v;
            if(0.equals(this.zzo)) {
                this.zzc();
            }
        }
    }

    public void setUpdateAvailable(int v) {
        this.zzf = true;
        this.zzc.clear();
        this.zzc.add(0);
        this.zzc.add(1);
        this.zzg = v;
    }

    public void setUpdateAvailable(int v, int v1) {
        this.zzf = true;
        this.zzc.clear();
        this.zzc.add(v1);
        this.zzg = v;
    }

    public void setUpdateNotAvailable() {
        this.zzf = false;
        this.zzh = null;
    }

    public void setUpdatePriority(int v) {
        if(this.zzf) {
            this.zzi = v;
        }
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final Task startUpdateFlow(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0) {
        return this.zzd(appUpdateInfo0, appUpdateOptions0) ? Tasks.forResult(-1) : Tasks.forException(new InstallException(-6));
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, int v, Activity activity0, int v1) {
        return this.zzd(appUpdateInfo0, AppUpdateOptions.newBuilder(v).build());
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, int v, IntentSenderForResultStarter intentSenderForResultStarter0, int v1) {
        return this.zzd(appUpdateInfo0, AppUpdateOptions.newBuilder(v).build());
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, Activity activity0, AppUpdateOptions appUpdateOptions0, int v) {
        return this.zzd(appUpdateInfo0, appUpdateOptions0);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, ActivityResultLauncher activityResultLauncher0, AppUpdateOptions appUpdateOptions0) {
        return this.zzd(appUpdateInfo0, appUpdateOptions0);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo0, IntentSenderForResultStarter intentSenderForResultStarter0, AppUpdateOptions appUpdateOptions0, int v) {
        return this.zzd(appUpdateInfo0, appUpdateOptions0);
    }

    @Override  // com.google.android.play.core.appupdate.AppUpdateManager
    public void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener0) {
        this.zza.zzc(installStateUpdatedListener0);
    }

    public void userAcceptsUpdate() {
        if(this.zzl || this.zzm) {
            this.zzl = false;
            this.zzd = 1;
            if(0.equals(this.zzo)) {
                this.zzc();
            }
        }
    }

    public void userCancelsDownload() {
        if(this.zzd != 1 && this.zzd != 2) {
            return;
        }
        this.zzd = 6;
        if(0.equals(this.zzo)) {
            this.zzc();
        }
        this.zzo = null;
        this.zzm = false;
        this.zzd = 0;
    }

    public void userRejectsUpdate() {
        if(!this.zzl && !this.zzm) {
            return;
        }
        this.zzl = false;
        this.zzm = false;
        this.zzo = null;
        this.zzd = 0;
    }

    private static int zza() [...] // 潜在的解密器

    private final int zzb() {
        if(this.zzf) {
            return this.zzd == 0 || this.zzd == 4 || this.zzd == 5 || this.zzd == 6 ? 2 : 3;
        }
        return 1;
    }

    private final void zzc() {
        InstallState installState0 = InstallState.zza(this.zzd, this.zzj, this.zzk, this.zze, "com.playdekgames.android.Ascension");
        this.zza.zzd(installState0);
    }

    private final boolean zzd(AppUpdateInfo appUpdateInfo0, AppUpdateOptions appUpdateOptions0) {
        if(!appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0) && (!AppUpdateOptions.defaultOptions(appUpdateOptions0.appUpdateType()).equals(appUpdateOptions0) || !appUpdateInfo0.isUpdateTypeAllowed(appUpdateOptions0.appUpdateType()))) {
            return false;
        }
        if(appUpdateOptions0.appUpdateType() == 1) {
            this.zzm = true;
            this.zzo = 1;
            return true;
        }
        this.zzl = true;
        this.zzo = 0;
        return true;
    }
}

