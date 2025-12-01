package com.google.android.gms.internal.games;

final class zzfw extends zzfq {
    private final zzft zzmu;

    zzfw(zzft zzft0, int v) {
        super(zzft0.size(), v);
        this.zzmu = zzft0;
    }

    @Override  // com.google.android.gms.internal.games.zzfq
    protected final Object get(int v) {
        return this.zzmu.get(v);
    }
}

