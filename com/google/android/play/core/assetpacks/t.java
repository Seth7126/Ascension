package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.ar;
import com.google.android.play.core.assetpacks.internal.as;

public final class t implements as {
    private final as a;
    private final as b;
    private final as c;

    public t(as as0, as as1, as as2) {
        this.a = as0;
        this.b = as1;
        this.c = as2;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        Context context0 = ((u)this.a).b();
        aq aq0 = aq.c(this.b);
        aq aq1 = aq.c(this.c);
        y y0 = p.b(context0) == null ? ((y)aq0.a()) : ((y)aq1.a());
        ar.a(y0);
        return y0;
    }
}

