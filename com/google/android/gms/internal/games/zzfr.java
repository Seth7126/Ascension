package com.google.android.gms.internal.games;

import java.util.Arrays;
import java.util.Collection;

class zzfr extends zzfu {
    int size;
    Object[] zzmp;
    boolean zzmq;

    zzfr(int v) {
        this.zzmp = new Object[4];
        this.size = 0;
    }

    @Override  // com.google.android.gms.internal.games.zzfu
    public zzfu zza(Iterable iterable0) {
        if(iterable0 instanceof Collection) {
            this.zzq(this.size + ((Collection)iterable0).size());
            if(((Collection)iterable0) instanceof zzfs) {
                this.size = ((zzfs)(((Collection)iterable0))).zza(this.zzmp, this.size);
                return this;
            }
        }
        super.zza(iterable0);
        return this;
    }

    public zzfr zzb(Object object0) {
        zzfo.checkNotNull(object0);
        this.zzq(this.size + 1);
        int v = this.size;
        this.size = v + 1;
        this.zzmp[v] = object0;
        return this;
    }

    @Override  // com.google.android.gms.internal.games.zzfu
    public zzfu zzc(Object object0) {
        return this.zzb(object0);
    }

    private final void zzq(int v) {
        Object[] arr_object = this.zzmp;
        if(arr_object.length < v) {
            if(v < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int v1 = arr_object.length + (arr_object.length >> 1) + 1 >= v ? arr_object.length + (arr_object.length >> 1) + 1 : Integer.highestOneBit(v - 1) << 1;
            if(v1 < 0) {
                v1 = 0x7FFFFFFF;
            }
            this.zzmp = Arrays.copyOf(arr_object, v1);
            this.zzmq = false;
            return;
        }
        if(this.zzmq) {
            this.zzmp = (Object[])arr_object.clone();
            this.zzmq = false;
        }
    }
}

