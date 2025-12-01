package com.google.android.play.core.assetpacks.internal;

public final class ap implements as {
    private as a;

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        as as0 = this.a;
        if(as0 == null) {
            throw new IllegalStateException();
        }
        return as0.a();
    }

    public static void b(as as0, as as1) {
        if(((ap)as0).a != null) {
            throw new IllegalStateException();
        }
        ((ap)as0).a = as1;
    }
}

