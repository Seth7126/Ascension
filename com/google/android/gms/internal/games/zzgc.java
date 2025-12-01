package com.google.android.gms.internal.games;

final class zzgc extends zzft {
    private final transient int size;
    static final zzft zznd;
    private final transient Object[] zzne;

    static {
        zzgc.zznd = new zzgc(new Object[0], 0);
    }

    zzgc(Object[] arr_object, int v) {
        this.zzne = arr_object;
        this.size = v;
    }

    @Override
    public final Object get(int v) {
        zzfo.zza(v, this.size);
        return this.zzne[v];
    }

    @Override
    public final int size() {
        return this.size;
    }

    @Override  // com.google.android.gms.internal.games.zzft
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzne, 0, arr_object, v, this.size);
        return v + this.size;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final Object[] zzco() {
        return this.zzne;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zzcp() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.size;
    }
}

