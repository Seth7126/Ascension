package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.internal.zzaf;

public final class zzs implements zzaf {
    private final zzaf zza;
    private final zzaf zzb;

    public zzs(zzaf zzaf0, zzaf zzaf1) {
        this.zza = zzaf0;
        this.zzb = zzaf1;
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        return new zzr(((zzk)this.zza).zzb(), ((zzt)this.zzb.zza()));
    }
}

