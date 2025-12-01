package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.as;

public final class ax implements as {
    private final as a;
    private final as b;
    private final as c;

    public ax(as as0, as as1, as as2) {
        this.a = as0;
        this.b = as1;
        this.c = as2;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        return new aw(((u)this.a).b(), ((co)this.b.a()), ((eb)this.c.a()));
    }
}

