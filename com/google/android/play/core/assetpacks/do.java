package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.assetpacks.internal.ak;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.common.LocalTestingException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

final class do implements y {
    private static final o a;
    private static final AtomicInteger b;
    private final String c;
    private final bb d;
    private final co e;
    private final Context f;
    private final ed g;
    private final eb h;
    private final Handler i;
    private final aq j;

    static {
        do.a = new o("FakeAssetPackService");
        do.b = new AtomicInteger(1);
    }

    do(File file0, bb bb0, co co0, Context context0, ed ed0, aq aq0, eb eb0) {
        this.i = new Handler(Looper.getMainLooper());
        this.c = file0.getAbsolutePath();
        this.d = bb0;
        this.e = co0;
        this.f = context0;
        this.g = ed0;
        this.j = aq0;
        this.h = eb0;
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task a(int v, String s, String s1, int v1) {
        do.a.d("getChunkFileDescriptor(session=%d, %s, %s, %d)", new Object[]{v, s, s1, v1});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        try {
            File[] arr_file = this.s(s);
            for(int v2 = 0; v2 < arr_file.length; ++v2) {
                File file0 = arr_file[v2];
                if(ak.a(file0).equals(s1)) {
                    taskCompletionSource0.setResult(ParcelFileDescriptor.open(file0, 0x10000000));
                    return taskCompletionSource0.getTask();
                }
            }
            throw new LocalTestingException(String.format("Local testing slice for \'%s\' not found.", s1));
        }
        catch(FileNotFoundException fileNotFoundException0) {
            do.a.e("getChunkFileDescriptor failed", new Object[]{fileNotFoundException0});
            taskCompletionSource0.setException(new LocalTestingException("Asset Slice file not found.", fileNotFoundException0));
            return taskCompletionSource0.getTask();
        }
        catch(LocalTestingException localTestingException0) {
            do.a.e("getChunkFileDescriptor failed", new Object[]{localTestingException0});
            taskCompletionSource0.setException(localTestingException0);
            return taskCompletionSource0.getTask();
        }
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task b(List list0, be be0, Map map0) {
        do.a.d("getPackStates(%s)", new Object[]{list0});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        ((Executor)this.j.a()).execute(() -> {
            AssetPackState assetPackState0;
            HashMap hashMap0 = new HashMap();
            long v = 0L;
            for(Object object0: list0) {
                String s = (String)object0;
                int v1 = ((f)be0).a.a(8, s);
                try {
                    assetPackState0 = this.q(s, v1);
                }
                catch(LocalTestingException localTestingException0) {
                    taskCompletionSource0.setException(localTestingException0);
                    return;
                }
                v += assetPackState0.totalBytesToDownload();
                hashMap0.put(s, assetPackState0);
            }
            taskCompletionSource0.setResult(new bo(v, hashMap0));
        });
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task c(List list0, Map map0) {
        do.a.d("startDownload(%s)", new Object[]{list0});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        ((Executor)this.j.a()).execute(() -> {
            AssetPackState assetPackState0;
            HashMap hashMap0 = new HashMap();
            long v = 0L;
            for(Object object0: list0) {
                String s = (String)object0;
                try {
                    assetPackState0 = this.q(s, 1);
                }
                catch(LocalTestingException localTestingException0) {
                    taskCompletionSource0.setException(localTestingException0);
                    return;
                }
                v += assetPackState0.totalBytesToDownload();
                hashMap0.put(s, assetPackState0);
            }
            for(Object object1: list0) {
                String s1 = (String)object1;
                try {
                    int v1 = do.b.getAndIncrement();
                    this.p(v1, s1, 1);
                    this.p(v1, s1, 2);
                    this.p(v1, s1, 3);
                }
                catch(LocalTestingException localTestingException1) {
                    taskCompletionSource0.setException(localTestingException1);
                    return;
                }
            }
            taskCompletionSource0.setResult(new bo(v, hashMap0));
        });
        return taskCompletionSource0.getTask();
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final Task d(Map map0) {
        do.a.d("syncPacks()", new Object[0]);
        return Tasks.forResult(new ArrayList());
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void e(List list0) {
        do.a.d("cancelDownload(%s)", new Object[]{list0});
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void f() {
        do.a.d("keepAlive", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void g(int v, String s, String s1, int v1) {
        do.a.d("notifyChunkTransferred", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void h(int v, String s) {
        do.a.d("notifyModuleCompleted", new Object[0]);
        ((Executor)this.j.a()).execute(() -> try {
            this.p(v, s, 4);
        }
        catch(LocalTestingException localTestingException0) {
            do.a.e("notifyModuleCompleted failed", new Object[]{localTestingException0});
        });
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void i(int v) {
        do.a.d("notifySessionFailed", new Object[0]);
    }

    @Override  // com.google.android.play.core.assetpacks.y
    public final void j(String s) {
        do.a.d("removePack(%s)", new Object[]{s});
    }

    static long k(int v, long v1) {
        switch(v) {
            case 2: {
                return v1 / 2L;
            }
            case 3: 
            case 4: {
                return v1;
            }
            default: {
                return 0L;
            }
        }
    }

    // 检测为 Lambda 实现
    final void l(Intent intent0) [...]

    // 检测为 Lambda 实现
    final void m(List list0, be be0, TaskCompletionSource taskCompletionSource0) [...]

    // 检测为 Lambda 实现
    final void n(int v, String s) [...]

    // 检测为 Lambda 实现
    final void o(List list0, TaskCompletionSource taskCompletionSource0) [...]

    private final Bundle p(int v, String s, int v1) throws LocalTestingException {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("app_version_code", this.g.a());
        bundle0.putInt("session_id", v);
        File[] arr_file = this.s(s);
        ArrayList arrayList0 = new ArrayList();
        long v2 = 0L;
        for(int v3 = 0; v3 < arr_file.length; ++v3) {
            File file0 = arr_file[v3];
            v2 += file0.length();
            ArrayList arrayList1 = new ArrayList();
            arrayList1.add((v1 == 3 ? new Intent().setData(Uri.EMPTY) : null));
            String s1 = ak.a(file0);
            bundle0.putParcelableArrayList("chunk_intents:" + s + ":" + s1, arrayList1);
            bundle0.putString("uncompressed_hash_sha256:" + s + ":" + s1, do.r(file0));
            bundle0.putLong("uncompressed_size:" + s + ":" + s1, file0.length());
            arrayList0.add(s1);
        }
        bundle0.putStringArrayList("slice_ids:" + s, arrayList0);
        bundle0.putLong("pack_version:" + s, ((long)this.g.a()));
        bundle0.putInt("status:" + s, v1);
        bundle0.putInt("error_code:" + s, 0);
        bundle0.putLong("bytes_downloaded:" + s, do.k(v1, v2));
        bundle0.putLong("total_bytes_to_download:" + s, v2);
        bundle0.putStringArrayList("pack_names", new ArrayList(Arrays.asList(new String[]{s})));
        bundle0.putLong("bytes_downloaded", do.k(v1, v2));
        bundle0.putLong("total_bytes_to_download", v2);
        dm dm0 = () -> this.d.c(this.f, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle0));
        this.i.post(dm0);
        return bundle0;
    }

    private final AssetPackState q(String s, int v) throws LocalTestingException {
        File[] arr_file = this.s(s);
        long v2 = 0L;
        for(int v1 = 0; v1 < arr_file.length; ++v1) {
            v2 += arr_file[v1].length();
        }
        return AssetPackState.a(s, v, 0, do.k(v, v2), v2, this.e.a(s), 1, String.valueOf(this.g.a()), this.h.a(s));
    }

    private static String r(File file0) throws LocalTestingException {
        try {
            return dq.a(Arrays.asList(new File[]{file0}));
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new LocalTestingException("SHA256 algorithm not supported.", noSuchAlgorithmException0);
        }
        catch(IOException iOException0) {
            throw new LocalTestingException(String.format("Could not digest file: %s.", file0), iOException0);
        }
    }

    private final File[] s(String s) throws LocalTestingException {
        File file0 = new File(this.c);
        if(!file0.isDirectory()) {
            throw new LocalTestingException(String.format("Local testing directory \'%s\' not found.", file0));
        }
        File[] arr_file = file0.listFiles(new dl(s));
        if(arr_file == null) {
            throw new LocalTestingException(String.format("Failed fetching APKs for pack \'%s\'.", s));
        }
        if(arr_file.length == 0) {
            throw new LocalTestingException(String.format("No APKs available for pack \'%s\'.", s));
        }
        for(int v = 0; v < arr_file.length; ++v) {
            if(ak.a(arr_file[v]).equals(s)) {
                return arr_file;
            }
        }
        throw new LocalTestingException(String.format("No main slice available for pack \'%s\'.", s));
    }
}

