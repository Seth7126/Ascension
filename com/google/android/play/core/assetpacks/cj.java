package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.as;

public final class cj implements as {
    private final as a;

    public cj(as as0) {
        this.a = as0;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        return new ci(((u)this.a).b());
    }
}

