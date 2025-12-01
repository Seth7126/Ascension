package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.n;
import com.google.android.play.core.assetpacks.internal.o;
import java.util.ArrayList;
import java.util.concurrent.Executor;

final class bb extends n {
    private final de c;
    private final cl d;
    private final bx e;
    private final co f;
    private final eb g;
    private final Handler h;
    private final aq i;
    private final aq j;
    private final aq k;

    bb(Context context0, de de0, cl cl0, aq aq0, co co0, bx bx0, aq aq1, aq aq2, eb eb0) {
        super(new o("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context0);
        this.h = new Handler(Looper.getMainLooper());
        this.c = de0;
        this.d = cl0;
        this.i = aq0;
        this.f = co0;
        this.e = bx0;
        this.j = aq1;
        this.k = aq2;
        this.g = eb0;
    }

    // 检测为 Lambda 实现
    final void a(Bundle bundle0) [...]

    // 检测为 Lambda 实现
    final void b(Bundle bundle0, AssetPackState assetPackState0) [...]

    @Override  // com.google.android.play.core.assetpacks.internal.n
    protected final void c(Context context0, Intent intent0) {
        Bundle bundle0 = intent0.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if(bundle0 != null) {
            ArrayList arrayList0 = bundle0.getStringArrayList("pack_names");
            if(arrayList0 != null && arrayList0.size() == 1) {
                AssetPackState assetPackState0 = AssetPackState.b(bundle0, ((String)arrayList0.get(0)), this.f, this.g, bd.a);
                this.a.a("ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{assetPackState0});
                PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("confirmation_intent");
                if(pendingIntent0 != null) {
                    this.e.b(pendingIntent0);
                }
                ((Executor)this.k.a()).execute(() -> if(this.c.o(bundle0)) {
                    this.d(assetPackState0);
                    ((y)this.i.a()).f();
                });
                ((Executor)this.j.a()).execute(() -> if(this.c.p(bundle0)) {
                    this.d.a();
                });
                return;
            }
            this.a.b("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        this.a.b("Empty bundle received from broadcast.", new Object[0]);
    }

    final void d(AssetPackState assetPackState0) {
        ba ba0 = new ba(this, assetPackState0);
        this.h.post(ba0);
    }
}

