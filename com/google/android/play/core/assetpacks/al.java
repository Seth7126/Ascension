package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.assetpacks.internal.g;
import java.util.List;

class al extends g {
    final TaskCompletionSource a;
    final aw b;

    al(aw aw0, TaskCompletionSource taskCompletionSource0) {
        this.b = aw0;
        super();
        this.a = taskCompletionSource0;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public final void b(int v, Bundle bundle0) {
        aw.s(this.b).u(this.a);
        aw.r().d("onCancelDownload(%d)", new Object[]{v});
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public final void c(Bundle bundle0) {
        aw.s(this.b).u(this.a);
        aw.r().d("onCancelDownloads()", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public void d(Bundle bundle0) {
        aw.s(this.b).u(this.a);
        int v = bundle0.getInt("error_code");
        aw.r().b("onError(%d)", new Object[]{v});
        AssetPackException assetPackException0 = new AssetPackException(v);
        this.a.trySetException(assetPackException0);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public void e(Bundle bundle0, Bundle bundle1) throws RemoteException {
        aw.s(this.b).u(this.a);
        aw.r().d("onGetChunkFileDescriptor", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public final void f(int v, Bundle bundle0) {
        aw.s(this.b).u(this.a);
        aw.r().d("onGetSession(%d)", new Object[]{v});
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public void g(List list0) {
        aw.s(this.b).u(this.a);
        aw.r().d("onGetSessionStates", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public void h(Bundle bundle0, Bundle bundle1) {
        aw.t(this.b).u(this.a);
        aw.r().d("onKeepAlive(%b)", new Object[]{Boolean.valueOf(bundle0.getBoolean("keep_alive"))});
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public final void i(Bundle bundle0, Bundle bundle1) {
        aw.s(this.b).u(this.a);
        aw.r().d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", new Object[]{bundle0.getString("module_name"), bundle0.getString("slice_id"), bundle0.getInt("chunk_number"), bundle0.getInt("session_id")});
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public final void j(Bundle bundle0, Bundle bundle1) {
        aw.s(this.b).u(this.a);
        aw.r().d("onNotifyModuleCompleted(%s, sessionId=%d)", new Object[]{bundle0.getString("module_name"), bundle0.getInt("session_id")});
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public final void k(Bundle bundle0, Bundle bundle1) {
        aw.s(this.b).u(this.a);
        aw.r().d("onNotifySessionFailed(%d)", new Object[]{bundle0.getInt("session_id")});
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public final void l(Bundle bundle0, Bundle bundle1) {
        aw.s(this.b).u(this.a);
        aw.r().d("onRemoveModule()", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public void m(Bundle bundle0, Bundle bundle1) {
        aw.s(this.b).u(this.a);
        aw.r().d("onRequestDownloadInfo()", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.internal.h
    public void n(int v, Bundle bundle0) {
        aw.s(this.b).u(this.a);
        aw.r().d("onStartDownload(%d)", new Object[]{v});
    }
}

