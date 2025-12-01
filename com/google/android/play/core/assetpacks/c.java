package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.as;

public final class c implements as {
    private final as a;
    private final as b;
    private final as c;
    private final as d;

    public c(as as0, as as1, as as2, as as3) {
        this.a = as0;
        this.b = as1;
        this.c = as2;
        this.d = as3;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        return new b(((u)this.a).b(), ((bh)this.b.a()), ((l)this.c.a()), ((ci)this.d.a()));
    }
}

