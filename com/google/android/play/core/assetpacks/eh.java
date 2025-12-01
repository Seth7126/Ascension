package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.as;

public final class eh implements as {
    private final as a;
    private final as b;

    public eh(as as0, as as1) {
        this.a = as0;
        this.b = as1;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        return new eg(((bh)this.a.a()), aq.c(this.b));
    }
}

