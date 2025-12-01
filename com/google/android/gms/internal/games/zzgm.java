package com.google.android.gms.internal.games;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class zzgm extends WeakReference {
    private final int zznn;

    public zzgm(Throwable throwable0, ReferenceQueue referenceQueue0) {
        super(throwable0, referenceQueue0);
        if(throwable0 == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.zznn = System.identityHashCode(throwable0);
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 != null && object0.getClass() == this.getClass()) {
            return this == object0 ? true : this.zznn == ((zzgm)object0).zznn && this.get() == ((zzgm)object0).get();
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.zznn;
    }
}

