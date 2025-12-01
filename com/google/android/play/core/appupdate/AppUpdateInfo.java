package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AppUpdateInfo {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final Integer zze;
    private final int zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final PendingIntent zzk;
    private final PendingIntent zzl;
    private final PendingIntent zzm;
    private final PendingIntent zzn;
    private final Map zzo;
    private boolean zzp;

    private AppUpdateInfo(String s, int v, int v1, int v2, Integer integer0, int v3, long v4, long v5, long v6, long v7, PendingIntent pendingIntent0, PendingIntent pendingIntent1, PendingIntent pendingIntent2, PendingIntent pendingIntent3, Map map0) {
        this.zzp = false;
        this.zza = s;
        this.zzb = v;
        this.zzc = v1;
        this.zzd = v2;
        this.zze = integer0;
        this.zzf = v3;
        this.zzg = v4;
        this.zzh = v5;
        this.zzi = v6;
        this.zzj = v7;
        this.zzk = pendingIntent0;
        this.zzl = pendingIntent1;
        this.zzm = pendingIntent2;
        this.zzn = pendingIntent3;
        this.zzo = map0;
    }

    public int availableVersionCode() {
        return this.zzb;
    }

    public long bytesDownloaded() {
        return this.zzg;
    }

    public Integer clientVersionStalenessDays() {
        return this.zze;
    }

    public Set getFailedUpdatePreconditions(AppUpdateOptions appUpdateOptions0) {
        if(appUpdateOptions0.allowAssetPackDeletion()) {
            return appUpdateOptions0.appUpdateType() == 0 ? AppUpdateInfo.zze(((Set)this.zzo.get("nonblocking.destructive.intent"))) : AppUpdateInfo.zze(((Set)this.zzo.get("blocking.destructive.intent")));
        }
        return appUpdateOptions0.appUpdateType() == 0 ? AppUpdateInfo.zze(((Set)this.zzo.get("nonblocking.intent"))) : AppUpdateInfo.zze(((Set)this.zzo.get("blocking.intent")));
    }

    public int installStatus() {
        return this.zzd;
    }

    public boolean isUpdateTypeAllowed(int v) {
        return this.zza(AppUpdateOptions.defaultOptions(v)) != null;
    }

    public boolean isUpdateTypeAllowed(AppUpdateOptions appUpdateOptions0) {
        return this.zza(appUpdateOptions0) != null;
    }

    public String packageName() {
        return this.zza;
    }

    public long totalBytesToDownload() {
        return this.zzh;
    }

    public int updateAvailability() {
        return this.zzc;
    }

    public int updatePriority() {
        return this.zzf;
    }

    final PendingIntent zza(AppUpdateOptions appUpdateOptions0) {
        switch(appUpdateOptions0.appUpdateType()) {
            case 0: {
                PendingIntent pendingIntent0 = this.zzl;
                if(pendingIntent0 != null) {
                    return pendingIntent0;
                }
                return this.zzf(appUpdateOptions0) ? this.zzn : null;
            }
            case 1: {
                PendingIntent pendingIntent1 = this.zzk;
                if(pendingIntent1 != null) {
                    return pendingIntent1;
                }
                return this.zzf(appUpdateOptions0) ? this.zzm : null;
            }
            default: {
                return null;
            }
        }
    }

    public static AppUpdateInfo zzb(String s, int v, int v1, int v2, Integer integer0, int v3, long v4, long v5, long v6, long v7, PendingIntent pendingIntent0, PendingIntent pendingIntent1, PendingIntent pendingIntent2, PendingIntent pendingIntent3, Map map0) {
        return new AppUpdateInfo(s, v, v1, v2, integer0, v3, v4, v5, v6, v7, pendingIntent0, pendingIntent1, pendingIntent2, pendingIntent3, map0);
    }

    final void zzc() {
        this.zzp = true;
    }

    final boolean zzd() {
        return this.zzp;
    }

    private static Set zze(Set set0) {
        return set0 == null ? new HashSet() : set0;
    }

    private final boolean zzf(AppUpdateOptions appUpdateOptions0) {
        return appUpdateOptions0.allowAssetPackDeletion() && this.zzi <= this.zzj;
    }
}

