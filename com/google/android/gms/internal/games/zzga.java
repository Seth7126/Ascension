package com.google.android.gms.internal.games;

import java.util.NoSuchElementException;

final class zzga extends zzgg {
    private boolean zzmx;
    private final Object zzmy;

    zzga(Object object0) {
        this.zzmy = object0;
        super();
    }

    @Override
    public final boolean hasNext() {
        return !this.zzmx;
    }

    @Override
    public final Object next() {
        if(this.zzmx) {
            throw new NoSuchElementException();
        }
        this.zzmx = true;
        return this.zzmy;
    }
}

