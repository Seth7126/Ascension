package com.google.android.gms.internal.games;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzfx extends zzfr {
    @NullableDecl
    private Object[] zzmv;

    public zzfx() {
        super(4);
    }

    @Override  // com.google.android.gms.internal.games.zzfr
    public final zzfu zza(Iterable iterable0) {
        zzfo.checkNotNull(iterable0);
        super.zza(iterable0);
        return this;
    }

    @Override  // com.google.android.gms.internal.games.zzfr
    public final zzfr zzb(Object object0) {
        return (zzfx)this.zzc(object0);
    }

    @Override  // com.google.android.gms.internal.games.zzfr
    public final zzfu zzc(Object object0) {
        zzfo.checkNotNull(object0);
        this.zzmv = null;
        super.zzb(object0);
        return this;
    }

    public final zzfy zzct() {
        switch(this.size) {
            case 0: {
                return zzgb.zzmz;
            }
            case 1: {
                return zzfy.zze(this.zzmp[0]);
            }
            default: {
                zzfy zzfy0 = zzfy.zzb(this.size, this.zzmp);
                this.size = zzfy0.size();
                this.zzmq = true;
                this.zzmv = null;
                return zzfy0;
            }
        }
    }
}

