package com.google.android.gms.internal.games;

import java.util.List;

final class zzfv extends zzft {
    private final transient int length;
    private final transient int offset;
    private final zzft zzmt;

    zzfv(zzft zzft0, int v, int v1) {
        this.zzmt = zzft0;
        super();
        this.offset = v;
        this.length = v1;
    }

    @Override
    public final Object get(int v) {
        zzfo.zza(v, this.length);
        return this.zzmt.get(v + this.offset);
    }

    @Override
    public final int size() {
        return this.length;
    }

    @Override  // com.google.android.gms.internal.games.zzft
    public final List subList(int v, int v1) {
        return this.zzc(v, v1);
    }

    @Override  // com.google.android.gms.internal.games.zzft
    public final zzft zzc(int v, int v1) {
        zzfo.zza(v, v1, this.length);
        return (zzft)this.zzmt.subList(v + this.offset, v1 + this.offset);
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final Object[] zzco() {
        return this.zzmt.zzco();
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zzcp() {
        return this.zzmt.zzcp() + this.offset;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.zzmt.zzcp() + this.offset + this.length;
    }
}

