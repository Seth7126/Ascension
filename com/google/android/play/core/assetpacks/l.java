package com.google.android.play.core.assetpacks;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest.Builder;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.ad;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.model.b;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

final class l implements AssetPackManager {
    private static final o a;
    private final bh b;
    private final bb c;
    private final ad d;
    private final de e;
    private final co f;
    private final bx g;
    private final eb h;
    private final Handler i;
    private boolean j;
    private final aq k;
    private final aq l;

    static {
        l.a = new o("AssetPackManager");
    }

    l(bh bh0, aq aq0, bb bb0, ad ad0, de de0, co co0, bx bx0, aq aq1, eb eb0) {
        this.i = new Handler(Looper.getMainLooper());
        this.b = bh0;
        this.k = aq0;
        this.c = bb0;
        this.d = ad0;
        this.e = de0;
        this.f = co0;
        this.g = bx0;
        this.l = aq1;
        this.h = eb0;
    }

    // 检测为 Lambda 实现
    final int a(int v, String s) [...]

    // 检测为 Lambda 实现
    final void c() [...]

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackStates cancel(List list0) {
        Map map0 = this.e.f(list0);
        HashMap hashMap0 = new HashMap();
        for(Object object0: list0) {
            Integer integer0 = (Integer)map0.get(((String)object0));
            hashMap0.put(((String)object0), AssetPackState.a(((String)object0), (integer0 == null ? 0 : ((int)integer0)), 0, 0L, 0L, 0.0, 0, "", ""));
        }
        ((y)this.k.a()).e(list0);
        return new bo(0L, hashMap0);
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final void clearListeners() {
        this.c.e();
    }

    // 检测为 Lambda 实现
    final void d(String s, TaskCompletionSource taskCompletionSource0) [...]

    // 检测为 Lambda 实现
    static void e(Exception exception0) [...]

    // 检测为 Lambda 实现
    final void f() [...]

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task fetch(List list0) {
        Map map0 = this.b.u();
        ArrayList arrayList0 = new ArrayList(list0);
        if(arrayList0.isEmpty()) {
            Bundle bundle0 = new Bundle();
            bundle0.putInt("session_id", 0);
            bundle0.putInt("error_code", 0);
            for(Object object0: list0) {
                bundle0.putInt(b.a("status", ((String)object0)), 4);
                bundle0.putInt(b.a("error_code", ((String)object0)), 0);
                bundle0.putLong(b.a("total_bytes_to_download", ((String)object0)), 0L);
                bundle0.putLong(b.a("bytes_downloaded", ((String)object0)), 0L);
            }
            bundle0.putStringArrayList("pack_names", new ArrayList(list0));
            bundle0.putLong("total_bytes_to_download", 0L);
            bundle0.putLong("bytes_downloaded", 0L);
            return Tasks.forResult(AssetPackStates.a(bundle0, this.f, this.h, (int v, String s) -> v));
        }
        return ((y)this.k.a()).c(arrayList0, map0);
    }

    final void g(boolean z) {
        boolean z1 = this.c.j();
        this.c.g(z);
        if(z && !z1) {
            this.h();
        }
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetLocation getAssetLocation(String s, String s1) {
        AssetPackLocation assetPackLocation0;
        if(!this.j) {
            ((Executor)this.l.a()).execute(() -> {
                this.b.y();
                this.b.w();
                this.b.x();
            });
            this.j = true;
        }
        if(this.b.G(s)) {
            try {
                assetPackLocation0 = this.b.f(s);
            }
            catch(IOException unused_ex) {
                assetPackLocation0 = null;
            }
        }
        else {
            assetPackLocation0 = this.d.a().contains(s) ? AssetPackLocation.a() : null;
        }
        if(assetPackLocation0 == null) {
            return null;
        }
        switch(assetPackLocation0.packStorageMethod()) {
            case 0: {
                return this.b.e(s, s1, assetPackLocation0);
            }
            case 1: {
                List list0 = this.b.s(s);
                return this.b.d(s, s1, list0);
            }
            default: {
                l.a.a("The asset %s is not present in Asset Pack %s", new Object[]{s1, s});
                return null;
            }
        }
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final AssetPackLocation getPackLocation(String s) {
        if(!this.j) {
            ((Executor)this.l.a()).execute(() -> {
                this.b.y();
                this.b.w();
                this.b.x();
            });
            this.j = true;
        }
        if(this.b.G(s)) {
            try {
                return this.b.f(s);
            }
            catch(IOException unused_ex) {
                return null;
            }
        }
        return this.d.a().contains(s) ? AssetPackLocation.a() : null;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final Map getPackLocations() {
        Map map0 = this.b.v();
        HashMap hashMap0 = new HashMap();
        for(Object object0: this.d.a()) {
            hashMap0.put(((String)object0), AssetPackLocation.a());
        }
        map0.putAll(hashMap0);
        return map0;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task getPackStates(List list0) {
        return ((y)this.k.a()).b(list0, (int v, String s) -> {
            if(!this.b.G(s) && v == 4) {
                return 8;
            }
            return !this.b.G(s) || v == 4 ? v : 4;
        }, this.b.u());
    }

    private final void h() {
        ((Executor)this.l.a()).execute(() -> {
            Task task0 = ((y)this.k.a()).d(this.b.u());
            Executor executor0 = (Executor)this.l.a();
            this.b.getClass();
            task0.addOnSuccessListener(executor0, new g(this.b)).addOnFailureListener(((Executor)this.l.a()), (Exception exception0) -> l.a.e(String.format("Could not sync active asset packs. %s", exception0), new Object[0]));
        });
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final void registerListener(AssetPackStateUpdateListener assetPackStateUpdateListener0) {
        synchronized(this) {
            boolean z = this.c.j();
            this.c.f(assetPackStateUpdateListener0);
            if(!z) {
                this.h();
            }
        }
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task removePack(String s) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        ((Executor)this.l.a()).execute(() -> {
            if(this.b.D(s)) {
                taskCompletionSource0.setResult(null);
                ((y)this.k.a()).j(s);
                return;
            }
            taskCompletionSource0.setException(new IOException(String.format("Failed to remove pack %s.", s)));
        });
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final Task showCellularDataConfirmation(Activity activity0) {
        if(activity0 == null) {
            return Tasks.forException(new AssetPackException(-3));
        }
        if(this.g.a() == null) {
            return Tasks.forException(new AssetPackException(-12));
        }
        Intent intent0 = new Intent(activity0, PlayCoreDialogWrapperActivity.class);
        intent0.putExtra("confirmation_intent", this.g.a());
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        intent0.putExtra("result_receiver", new k(this, this.i, taskCompletionSource0));
        activity0.startActivity(intent0);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final boolean showCellularDataConfirmation(ActivityResultLauncher activityResultLauncher0) {
        if(activityResultLauncher0 != null && this.g.a() != null) {
            activityResultLauncher0.launch(new Builder(this.g.a().getIntentSender()).build());
            return true;
        }
        return false;
    }

    @Override  // com.google.android.play.core.assetpacks.AssetPackManager
    public final void unregisterListener(AssetPackStateUpdateListener assetPackStateUpdateListener0) {
        this.c.h(assetPackStateUpdateListener0);
    }
}

