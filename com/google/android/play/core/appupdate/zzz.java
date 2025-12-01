package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzad;
import com.google.android.play.core.appupdate.internal.zzaf;

final class zzz implements zza {
    private final zzz zza;
    private final zzaf zzb;
    private final zzaf zzc;
    private final zzaf zzd;
    private final zzaf zze;
    private final zzaf zzf;
    private final zzaf zzg;

    zzz(zzi zzi0, zzy zzy0) {
        this.zza = this;
        zzk zzk0 = new zzk(zzi0);
        this.zzb = zzk0;
        zzaf zzaf0 = zzad.zzb(new zzu(zzk0));
        this.zzc = zzaf0;
        zzaf zzaf1 = zzad.zzb(new zzs(zzk0, zzaf0));
        this.zzd = zzaf1;
        zzaf zzaf2 = zzad.zzb(new zzd(zzk0));
        this.zze = zzaf2;
        zzaf zzaf3 = zzad.zzb(new zzh(zzaf1, zzaf2, zzk0));
        this.zzf = zzaf3;
        this.zzg = zzad.zzb(new zzj(zzaf3));
    }

    @Override  // com.google.android.play.core.appupdate.zza
    public final AppUpdateManager zza() {
        return (AppUpdateManager)this.zzg.zza();
    }
}

