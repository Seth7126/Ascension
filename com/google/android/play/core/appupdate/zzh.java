package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzaf;

public final class zzh implements zzaf {
    private final zzaf zza;
    private final zzaf zzb;
    private final zzaf zzc;

    public zzh(zzaf zzaf0, zzaf zzaf1, zzaf zzaf2) {
        this.zza = zzaf0;
        this.zzb = zzaf1;
        this.zzc = zzaf2;
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        return new zzg(((zzr)this.zza.zza()), ((zzc)this.zzb.zza()), ((zzk)this.zzc).zzb());
    }
}

