package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.as;

public final class bv implements as {
    private final as a;

    public bv(as as0) {
        this.a = as0;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        return new bu(aq.c(this.a));
    }
}

