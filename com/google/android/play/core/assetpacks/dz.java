package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.as;

public final class dz implements as {
    private final as a;
    private final as b;
    private final as c;
    private final as d;
    private final as e;
    private final as f;

    public dz(as as0, as as1, as as2, as as3, as as4, as as5) {
        this.a = as0;
        this.b = as1;
        this.c = as2;
        this.d = as3;
        this.e = as4;
        this.f = as5;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        return new dy(((bh)this.a.a()), aq.c(this.b), ((de)this.c.a()), aq.c(this.d), ((co)this.e.a()), ((eb)this.f.a()));
    }
}

