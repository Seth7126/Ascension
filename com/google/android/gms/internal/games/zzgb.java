package com.google.android.gms.internal.games;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

final class zzgb extends zzfy {
    private final transient int mask;
    private final transient int size;
    static final zzgb zzmz;
    private final transient Object[] zzna;
    private final transient Object[] zznb;
    private final transient int zznc;

    static {
        zzgb.zzmz = new zzgb(new Object[0], 0, null, 0, 0);
    }

    zzgb(Object[] arr_object, int v, Object[] arr_object1, int v1, int v2) {
        this.zzna = arr_object;
        this.zznb = arr_object1;
        this.mask = v1;
        this.zznc = v;
        this.size = v2;
    }

    @Override
    public final boolean contains(@NullableDecl Object object0) {
        Object[] arr_object = this.zznb;
        if(object0 != null && arr_object != null) {
            for(int v = zzfp.zzp((object0 == null ? 0 : object0.hashCode())); true; v = v1 + 1) {
                int v1 = v & this.mask;
                Object object1 = arr_object[v1];
                if(object1 == null) {
                    return false;
                }
                if(object1.equals(object0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    public final int hashCode() {
        return this.zznc;
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    public final Iterator iterator() {
        return this.zzcn();
    }

    @Override
    public final int size() {
        return this.size;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zza(Object[] arr_object, int v) {
        System.arraycopy(this.zzna, 0, arr_object, v, this.size);
        return v + this.size;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    public final zzgg zzcn() {
        return (zzgg)this.zzcr().iterator();
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final Object[] zzco() {
        return this.zzna;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zzcp() {
        return 0;
    }

    @Override  // com.google.android.gms.internal.games.zzfs
    final int zzcq() {
        return this.size;
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    final boolean zzcu() {
        return true;
    }

    @Override  // com.google.android.gms.internal.games.zzfy
    final zzft zzcv() {
        return zzft.zzb(this.zzna, this.size);
    }
}

