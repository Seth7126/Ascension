package com.google.android.play.core.appupdate;

public final class zzab {
    private zzi zza;

    private zzab() {
    }

    zzab(zzaa zzaa0) {
    }

    public final zza zza() {
        zzi zzi0 = this.zza;
        if(zzi0 == null) {
            throw new IllegalStateException(zzi.class.getCanonicalName() + " must be set");
        }
        return new zzz(zzi0, null);
    }

    public final zzab zzb(zzi zzi0) {
        this.zza = zzi0;
        return this;
    }
}

