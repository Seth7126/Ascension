package com.google.android.gms.games;

public class AnnotatedData {
    private final Object data;
    private final boolean zze;

    public AnnotatedData(Object object0, boolean z) {
        this.data = object0;
        this.zze = z;
    }

    public Object get() {
        return this.data;
    }

    public boolean isStale() {
        return this.zze;
    }
}

