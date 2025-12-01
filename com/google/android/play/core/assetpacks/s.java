package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.play.core.assetpacks.internal.af;
import com.google.android.play.core.assetpacks.internal.ar;
import com.google.android.play.core.assetpacks.internal.as;

public final class s implements as {
    private final as a;
    private final as b;

    public s(as as0, as as1) {
        this.a = as0;
        this.b = as1;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        Object object0 = this.a.a();
        Context context0 = ((u)this.b).b();
        af.a(context0.getPackageManager(), new ComponentName("com.playdekgames.android.Ascension", "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        af.a(context0.getPackageManager(), new ComponentName("com.playdekgames.android.Ascension", "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        ar.a(((l)object0));
        return (l)object0;
    }
}

