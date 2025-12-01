package com.google.android.play.core.assetpacks;

public final class cd {
    private p a;

    private cd() {
    }

    cd(cc cc0) {
    }

    public final a a() {
        p p0 = this.a;
        if(p0 == null) {
            throw new IllegalStateException(p.class.getCanonicalName() + " must be set");
        }
        return new cb(p0, null);
    }

    public final cd b(p p0) {
        this.a = p0;
        return this;
    }
}

