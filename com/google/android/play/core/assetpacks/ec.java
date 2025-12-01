package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.as;

public final class ec implements as {
    private final as a;
    private final as b;

    public ec(as as0, as as1) {
        this.a = as0;
        this.b = as1;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        return new eb(((bh)this.a.a()), ((ed)this.b.a()));
    }
}

