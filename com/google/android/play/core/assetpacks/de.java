package com.google.android.play.core.assetpacks;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import com.google.android.play.core.assetpacks.model.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

final class de {
    private static final o a;
    private final bh b;
    private final co c;
    private final Map d;
    private final ReentrantLock e;
    private final aq f;
    private final aq g;

    static {
        de.a = new o("ExtractorSessionStoreView");
    }

    de(bh bh0, aq aq0, co co0, aq aq1) {
        this.b = bh0;
        this.f = aq0;
        this.c = co0;
        this.g = aq1;
        this.d = new HashMap();
        this.e = new ReentrantLock();
    }

    // 检测为 Lambda 实现
    final Boolean a(Bundle bundle0) [...]

    // 检测为 Lambda 实现
    final Boolean b(Bundle bundle0) [...]

    final Object c(String s, int v, long v1) {
        db db0 = (db)this.u(Arrays.asList(new String[]{s})).get(s);
        if(db0 == null || bg.d(db0.c.d)) {
            de.a.b(String.format("Could not find pack %s while trying to complete it", s), new Object[0]);
        }
        this.b.E(s, v, v1);
        db0.c.d = 4;
        return null;
    }

    final Object d(int v, int v1) {
        this.q(v).c.d = 5;
        return null;
    }

    final Object e(int v) {
        db db0 = this.q(v);
        da da0 = db0.c;
        if(!bg.d(da0.d)) {
            throw new ck(String.format("Could not safely delete session %d because it is not in a terminal state.", v), v);
        }
        this.b.E(da0.a, db0.b, da0.b);
        da da1 = db0.c;
        if(da1.d == 5 || da1.d == 6) {
            this.b.F(da1.a, db0.b, da1.b);
        }
        return null;
    }

    final Map f(List list0) {
        return (Map)this.r(() -> {
            Map map0 = this.u(list0);
            Map map1 = new HashMap();
            for(Object object0: list0) {
                String s = (String)object0;
                db db0 = (db)map0.get(s);
                if(db0 == null) {
                    map1.put(s, 8);
                }
                else {
                    da da0 = db0.c;
                    if(bg.a(da0.d)) {
                        try {
                            da0.d = 6;
                            ((Executor)this.g.a()).execute(() -> this.r(new cs(this, this.b.a)));
                            this.c.c(s);
                        }
                        catch(ck unused_ex) {
                            de.a.d("Session %d with pack %s does not exist, no need to cancel.", new Object[]{db0.a, s});
                        }
                    }
                    map1.put(s, db0.c.d);
                }
            }
            return map1;
        });
    }

    final Map g() {
        return this.d;
    }

    // 检测为 Lambda 实现
    final Map h(List list0) [...]

    // 检测为 Lambda 实现
    final Map i(List list0) [...]

    final void j() {
        this.e.lock();
    }

    final void k(String s, int v, long v1) {
        this.r(new cu(this, s, v, v1));
    }

    final void l() {
        this.e.unlock();
    }

    final void m(int v, int v1) {
        this.r(new cx(this, v, 5));
    }

    // 检测为 Lambda 实现
    final void n(int v) [...]

    final boolean o(Bundle bundle0) {
        return ((Boolean)this.r(() -> {
            int v = bundle0.getInt("session_id");
            if(v == 0) {
                return true;
            }
            Integer integer0 = v;
            if(!this.d.containsKey(integer0)) {
                return true;
            }
            db db0 = (db)this.d.get(integer0);
            if(db0.c.d == 6) {
                return false;
            }
            int v1 = bundle0.getInt(b.a("status", de.s(bundle0)));
            return Boolean.valueOf(!bg.c(db0.c.d, v1));
        })).booleanValue();
    }

    final boolean p(Bundle bundle0) {
        return ((Boolean)this.r(() -> {
            int v = bundle0.getInt("session_id");
            if(v == 0) {
                return false;
            }
            Integer integer0 = v;
            boolean z = true;
            if(this.d.containsKey(integer0)) {
                db db0 = this.q(v);
                int v1 = bundle0.getInt("status:" + db0.c.a);
                da da0 = db0.c;
                int v2 = da0.d;
                if(bg.c(v2, v1)) {
                    de.a.a("Found stale update for session %s with status %d.", new Object[]{integer0, v2});
                    String s = db0.c.a;
                    int v3 = db0.c.d;
                    if(v3 == 4) {
                        ((y)this.f.a()).h(v, s);
                        return true;
                    }
                    switch(v3) {
                        case 5: {
                            ((y)this.f.a()).i(v);
                            return true;
                        }
                        case 6: {
                            ((y)this.f.a()).e(Arrays.asList(new String[]{s}));
                            return true;
                        }
                        default: {
                            return true;
                        }
                    }
                }
                da0.d = v1;
                if(bg.d(v1)) {
                    this.n(v);
                    this.c.c(db0.c.a);
                    return true;
                }
                for(Object object0: da0.f) {
                    dc dc0 = (dc)object0;
                    ArrayList arrayList0 = bundle0.getParcelableArrayList("chunk_intents:" + db0.c.a + ":" + dc0.a);
                    if(arrayList0 != null) {
                        for(int v4 = 0; v4 < arrayList0.size(); ++v4) {
                            if(arrayList0.get(v4) != null && ((Intent)arrayList0.get(v4)).getData() != null) {
                                ((cz)dc0.d.get(v4)).a = true;
                            }
                        }
                    }
                }
                return true;
            }
            String s1 = de.s(bundle0);
            long v5 = bundle0.getLong("pack_version:" + s1);
            String s2 = bundle0.getString("pack_version_tag:" + s1, "");
            int v6 = bundle0.getInt("status:" + s1);
            long v7 = bundle0.getLong("total_bytes_to_download:" + s1);
            ArrayList arrayList1 = bundle0.getStringArrayList("slice_ids:" + s1);
            ArrayList arrayList2 = new ArrayList();
            for(Object object1: de.t(arrayList1)) {
                String s3 = (String)object1;
                ArrayList arrayList3 = bundle0.getParcelableArrayList("chunk_intents:" + s1 + ":" + s3);
                ArrayList arrayList4 = new ArrayList();
                for(Object object2: de.t(arrayList3)) {
                    if(((Intent)object2) == null) {
                        z = false;
                    }
                    arrayList4.add(new cz(z));
                    z = true;
                }
                String s4 = bundle0.getString("uncompressed_hash_sha256:" + s1 + ":" + s3);
                long v8 = bundle0.getLong("uncompressed_size:" + s1 + ":" + s3);
                int v9 = bundle0.getInt("patch_format:" + s1 + ":" + s3, 0);
                arrayList2.add((v9 == 0 ? new dc(s3, s4, v8, arrayList4, bundle0.getInt("compression_format:" + s1 + ":" + s3, 0), 0) : new dc(s3, s4, v8, arrayList4, 0, v9)));
                z = true;
            }
            da da1 = new da(s1, v5, v6, v7, arrayList2, s2);
            db db1 = new db(v, bundle0.getInt("app_version_code"), da1);
            this.d.put(v, db1);
            return true;
        })).booleanValue();
    }

    private final db q(int v) {
        Integer integer0 = v;
        db db0 = (db)this.d.get(integer0);
        if(db0 == null) {
            throw new ck(String.format("Could not find session %d while trying to get it", integer0), v);
        }
        return db0;
    }

    private final Object r(dd dd0) {
        try {
            this.e.lock();
            return dd0.a();
        }
        finally {
            this.e.unlock();
        }
    }

    private static String s(Bundle bundle0) {
        ArrayList arrayList0 = bundle0.getStringArrayList("pack_names");
        if(arrayList0 == null || arrayList0.isEmpty()) {
            throw new ck("Session without pack received.");
        }
        return (String)arrayList0.get(0);
    }

    private static List t(List list0) {
        return list0 == null ? Collections.emptyList() : list0;
    }

    private final Map u(List list0) {
        return (Map)this.r(() -> {
            Map map0 = new HashMap();
            for(Object object0: this.d.values()) {
                db db0 = (db)object0;
                String s = db0.c.a;
                if(list0.contains(s)) {
                    db db1 = (db)map0.get(s);
                    if((db1 == null ? -1 : db1.a) < db0.a) {
                        map0.put(s, db0);
                    }
                }
            }
            return map0;
        });
    }
}

