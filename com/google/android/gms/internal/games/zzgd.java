package com.google.android.gms.internal.games;

import java.util.Iterator;

final class zzgd extends zzfy {
    private final transient Object zznf;
    private transient int zzng;

    zzgd(Object object0) {
        this.zznf = zzfo.checkNotNull(object0);
    }

    zzgd(Object object0, int v) {
        this.zznf = object0;
        this.zzng = v;
    }

    @Override
    public final boolean contains(Object object0) {
        return this.zznf.equals(object0);
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    public final int hashCode() {
        int v = this.zzng;
        if(v == 0) {
            v = this.zznf.hashCode();
            this.zzng = v;
        }
        return v;
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    public final Iterator iterator() {
        return this.zzcn();
    }

    @Override
    public final int size() {
        return 1;
    }

    @Override
    public final String toString() {
        return '[' + this.zznf.toString() + ']';
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zza(Object[] arr_object, int v) {
        arr_object[v] = this.zznf;
        return v + 1;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    public final zzgg zzcn() {
        return new zzga(this.zznf);
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    final boolean zzcu() {
        return this.zzng != 0;
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    final zzft zzcv() {
        return zzft.zzd(this.zznf);
    }
}

