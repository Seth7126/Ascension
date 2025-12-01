package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.as;
import java.io.File;

public final class dp implements as {
    private final as a;
    private final as b;
    private final as c;
    private final as d;
    private final as e;
    private final as f;
    private final as g;

    public dp(as as0, as as1, as as2, as as3, as as4, as as5, as as6) {
        this.a = as0;
        this.b = as1;
        this.c = as2;
        this.d = as3;
        this.e = as4;
        this.f = as5;
        this.g = as6;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        String s = (String)this.a.a();
        Object object0 = this.b.a();
        Object object1 = this.c.a();
        Context context0 = ((u)this.d).b();
        Object object2 = this.e.a();
        aq aq0 = aq.c(this.f);
        Object object3 = this.g.a();
        return s == null ? new do(context0.getExternalFilesDir(null), ((bb)object0), ((co)object1), context0, ((ed)object2), aq0, ((eb)object3)) : new do(new File(context0.getExternalFilesDir(null), s), ((bb)object0), ((co)object1), context0, ((ed)object2), aq0, ((eb)object3));
    }
}

