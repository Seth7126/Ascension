package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.ag;
import com.google.android.play.core.assetpacks.internal.ai;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.internal.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

final class aw implements y {
    private static final o a;
    private static final Intent b;
    private final String c;
    private final co d;
    private final eb e;
    private z f;
    private z g;
    private final AtomicBoolean h;

    static {
        aw.a = new o("AssetPackServiceImpl");
        aw.b = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    }

    aw(Context context0, co co0, eb eb0) {
        this.h = new AtomicBoolean();
        this.c = "com.playdekgames.android.Ascension";
        this.d = co0;
        this.e = eb0;
        if(ai.b(context0)) {
            this.f = new z(ag.a(context0), aw.a, "AssetPackService", aw.b, com.google.android.play.core.assetpacks.z.a, null);
            this.g = new z(ag.a(context0), aw.a, "AssetPackService-keepAlive", aw.b, com.google.android.play.core.assetpacks.z.a, null);
        }
        aw.a.a("AssetPackService initiated.", new Object[0]);
    }

    private static Bundle A() {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("playcore_version_code", 11004);
        ArrayList arrayList0 = new ArrayList();
        arrayList0.add(0);
        arrayList0.add(1);
        bundle0.putIntegerArrayList("supported_compression_formats", arrayList0);
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(1);
        arrayList1.add(2);
        bundle0.putIntegerArrayList("supported_patch_formats", arrayList1);
        return bundle0;
    }

    private static Bundle B(int v) {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("session_id", v);
        return bundle0;
    }

    private static Task C() {
        aw.a.b("onError(%d)", new Object[]{-11});
        return Tasks.forException(new AssetPackException(-11));
    }

    private final void D(int v, String s, int v1) {
        if(this.f == null) {
            throw new ck("The Play Store app is not installed or is an unofficial version.", v);
        }
        aw.a.d("notifyModuleCompleted", new Object[0]);
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new ah(this, taskCompletionSource0, v, s, taskCompletionSource0, v1), taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task a(int v, String s, String s1, int v1) {
        if(this.f == null) {
            return aw.C();
        }
        aw.a.d("getChunkFileDescriptor(%s, %s, %d, session=%d)", new Object[]{s, s1, v1, v});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new aj(this, taskCompletionSource0, v, s, s1, v1, taskCompletionSource0), taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task b(List list0, be be0, Map map0) {
        if(this.f == null) {
            return aw.C();
        }
        aw.a.d("getPackStates(%s)", new Object[]{list0});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new af(this, taskCompletionSource0, list0, map0, taskCompletionSource0, be0), taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task c(List list0, Map map0) {
        if(this.f == null) {
            return aw.C();
        }
        aw.a.d("startDownload(%s)", new Object[]{list0});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new ac(this, taskCompletionSource0, list0, map0, taskCompletionSource0), taskCompletionSource0);
        taskCompletionSource0.getTask().addOnSuccessListener(new aa(this));
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task d(Map map0) {
        if(this.f == null) {
            return aw.C();
        }
        aw.a.d("syncPacks", new Object[0]);
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new ae(this, taskCompletionSource0, map0, taskCompletionSource0), taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void e(List list0) {
        if(this.f == null) {
            return;
        }
        aw.a.d("cancelDownloads(%s)", new Object[]{list0});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new ad(this, taskCompletionSource0, list0, taskCompletionSource0), taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void f() {
        synchronized(this) {
            if(this.g == null) {
                aw.a.e("Keep alive connection manager is not initialized.", new Object[0]);
                return;
            }
            o o0 = aw.a;
            o0.d("keepAlive", new Object[0]);
            if(!this.h.compareAndSet(false, true)) {
                o0.d("Service is already kept alive.", new Object[0]);
                return;
            }
            TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
            this.g.s(new ak(this, taskCompletionSource0, taskCompletionSource0), taskCompletionSource0);
        }
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void g(int v, String s, String s1, int v1) {
        if(this.f == null) {
            throw new ck("The Play Store app is not installed or is an unofficial version.", v);
        }
        aw.a.d("notifyChunkTransferred", new Object[0]);
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ag(this, taskCompletionSource0, v, s, s1, v1, taskCompletionSource0), taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void h(int v, String s) {
        this.D(v, s, 10);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void i(int v) {
        if(this.f == null) {
            throw new ck("The Play Store app is not installed or is an unofficial version.", v);
        }
        aw.a.d("notifySessionFailed", new Object[0]);
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new com.google.android.play.core.assetpacks.ai(this, taskCompletionSource0, v, taskCompletionSource0), taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void j(String s) {
        if(this.f == null) {
            return;
        }
        aw.a.d("removePack(%s)", new Object[]{s});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.f.s(new ab(this, taskCompletionSource0, s, taskCompletionSource0), taskCompletionSource0);
    }

    static Bundle k(int v, String s, String s1, int v1) {
        Bundle bundle0 = aw.z(v, s);
        bundle0.putString("slice_id", s1);
        bundle0.putInt("chunk_number", v1);
        return bundle0;
    }

    static Bundle l(int v, String s) {
        return aw.z(v, s);
    }

    static Bundle m() {
        return aw.A();
    }

    static Bundle n(Map map0) {
        Bundle bundle0 = aw.A();
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: map0.entrySet()) {
            Bundle bundle1 = new Bundle();
            bundle1.putString("installed_asset_module_name", ((String)((Map.Entry)object0).getKey()));
            bundle1.putLong("installed_asset_module_version", ((long)(((Long)((Map.Entry)object0).getValue()))));
            arrayList0.add(bundle1);
        }
        bundle0.putParcelableArrayList("installed_asset_module", arrayList0);
        return bundle0;
    }

    static Bundle o(int v) {
        return aw.B(v);
    }

    static co p(aw aw0) {
        return aw0.d;
    }

    static eb q(aw aw0) {
        return aw0.e;
    }

    static o r() {
        return aw.a;
    }

    static z s(aw aw0) {
        return aw0.f;
    }

    static z t(aw aw0) {
        return aw0.g;
    }

    static String u(aw aw0) {
        return aw0.c;
    }

    static ArrayList v(Collection collection0) {
        ArrayList arrayList0 = new ArrayList(collection0.size());
        for(Object object0: collection0) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("module_name", ((String)object0));
            arrayList0.add(bundle0);
        }
        return arrayList0;
    }

    static List w(aw aw0, List list0) {
        List list1 = new ArrayList();
        for(Object object0: list0) {
            Object object1 = AssetPackStates.a(((Bundle)object0), aw0.d, aw0.e, bf.a).packStates().values().iterator().next();
            AssetPackState assetPackState0 = (AssetPackState)object1;
            if(assetPackState0 == null) {
                aw.a.b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            if(bg.a(assetPackState0.status())) {
                list1.add(assetPackState0.name());
            }
        }
        return list1;
    }

    static AtomicBoolean x(aw aw0) {
        return aw0.h;
    }

    static void y(aw aw0, int v, String s, int v1) {
        aw0.D(v, s, v1);
    }

    private static Bundle z(int v, String s) {
        Bundle bundle0 = aw.B(v);
        bundle0.putString("module_name", s);
        return bundle0;
    }
}

