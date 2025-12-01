package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.o;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

final class dh {
    private static final o a;
    private final de b;
    private final bh c;
    private final bu d;

    static {
        dh.a = new o("ExtractorTaskFinder");
    }

    dh(de de0, bh bh0, bu bu0) {
        this.b = de0;
        this.c = bh0;
        this.d = bu0;
    }

    final dg a() {
        de de0;
        int v1;
        dg dg1;
        dg dg0;
        try {
            this.b.j();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: this.b.g().values()) {
                db db0 = (db)object0;
                if(bg.b(db0.c.d)) {
                    arrayList0.add(db0);
                }
            }
            if(!arrayList0.isEmpty()) {
                dg0 = null;
                Map map0 = this.c.t();
                for(Object object1: arrayList0) {
                    db db1 = (db)object1;
                    Long long0 = (Long)map0.get(db1.c.a);
                    if(long0 != null && db1.c.b == ((long)long0)) {
                        dh.a.a("Found promote pack task for session %s with pack %s.", new Object[]{db1.a, db1.c.a});
                        int v = this.c.a(db1.c.a);
                        dg0 = new ei(db1.a, db1.c.a, v, db1.b, db1.c.b);
                        break;
                    }
                }
                if(dg0 != null) {
                    goto label_117;
                }
                Iterator iterator2 = arrayList0.iterator();
                while(true) {
                    if(!iterator2.hasNext()) {
                        dg0 = null;
                        break;
                    }
                    Object object2 = iterator2.next();
                    db db2 = (db)object2;
                    try {
                        if(this.c.b(db2.c.a, db2.b, db2.c.b) == db2.c.f.size()) {
                            goto label_32;
                        }
                        continue;
                    }
                    catch(IOException iOException0) {
                        throw new ck(String.format("Failed to check number of completed merges for session %s, pack %s", db2.a, db2.c.a), iOException0, db2.a);
                    }
                label_32:
                    dh.a.a("Found final move task for session %s with pack %s.", new Object[]{db2.a, db2.c.a});
                    dg0 = new dw(db2.a, db2.c.a, db2.b, db2.c.b, db2.c.c);
                    break;
                }
                if(dg0 != null) {
                    goto label_117;
                }
                dg0 = null;
                for(Object object3: arrayList0) {
                    db db3 = (db)object3;
                    da da0 = db3.c;
                    if(bg.b(da0.d)) {
                        Iterator iterator4 = da0.f.iterator();
                    label_45:
                        if(iterator4.hasNext()) {
                            Object object4 = iterator4.next();
                            dc dc0 = (dc)object4;
                            if(!this.c.q(db3.c.a, db3.b, db3.c.b, dc0.a).exists()) {
                                goto label_45;
                            }
                            dh.a.a("Found merge task for session %s with pack %s and slice %s.", new Object[]{db3.a, db3.c.a, dc0.a});
                            dg0 = new dt(db3.a, db3.c.a, db3.b, db3.c.b, dc0.a);
                            break;
                        }
                    }
                }
                if(dg0 != null) {
                    goto label_117;
                }
                dg0 = null;
                for(Object object5: arrayList0) {
                    db db4 = (db)object5;
                    da da1 = db4.c;
                    if(bg.b(da1.d)) {
                        Iterator iterator6 = da1.f.iterator();
                    label_60:
                        if(iterator6.hasNext()) {
                            Object object6 = iterator6.next();
                            dc dc1 = (dc)object6;
                            if(!this.b(db4, dc1) || !this.c.p(db4.c.a, db4.b, db4.c.b, dc1.a).exists()) {
                                goto label_60;
                            }
                            dh.a.a("Found verify task for session %s with pack %s and slice %s.", new Object[]{db4.a, db4.c.a, dc1.a});
                            dg0 = new er(db4.a, db4.c.a, db4.b, db4.c.b, dc1.a, dc1.b, dc1.c);
                            break;
                        }
                    }
                }
                if(dg0 != null) {
                    goto label_117;
                }
                dg1 = null;
                for(Object object7: arrayList0) {
                    db db5 = (db)object7;
                    da da2 = db5.c;
                    if(bg.b(da2.d)) {
                        Iterator iterator8 = da2.f.iterator();
                    label_75:
                        if(iterator8.hasNext()) {
                            Object object8 = iterator8.next();
                            dc dc2 = (dc)object8;
                            if(dh.c(dc2)) {
                                goto label_75;
                            }
                            eo eo0 = new eo(this.c, db5.c.a, db5.b, db5.c.b, dc2.a);
                            try {
                                v1 = eo0.a();
                            }
                            catch(IOException iOException1) {
                                dh.a.b("Slice checkpoint corrupt, restarting extraction. %s", new Object[]{iOException1});
                                v1 = 0;
                            }
                            if(v1 == -1 || !((cz)dc2.d.get(v1)).a) {
                                goto label_75;
                            }
                            dh.a.a("Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s.", new Object[]{dc2.e, db5.a, db5.c.a, dc2.a, v1});
                            InputStream inputStream0 = this.d.a(db5.a, db5.c.a, dc2.a, v1);
                            dg1 = new ce(db5.a, db5.c.a, db5.b, db5.c.b, db5.c.c, dc2.a, dc2.e, v1, dc2.d.size(), db5.c.e, db5.c.d, inputStream0);
                            break;
                        }
                    }
                }
                if(dg1 != null) {
                    de0 = this.b;
                    goto label_115;
                }
                dg1 = null;
                for(Object object9: arrayList0) {
                    db db6 = (db)object9;
                    da da3 = db6.c;
                    if(bg.b(da3.d)) {
                        Iterator iterator10 = da3.f.iterator();
                    label_98:
                        if(iterator10.hasNext()) {
                            Object object10 = iterator10.next();
                            dc dc3 = (dc)object10;
                            if(!dh.c(dc3) || !((cz)dc3.d.get(0)).a || this.b(db6, dc3)) {
                                goto label_98;
                            }
                            dh.a.a("Found patch slice task using patch format %s for session %s, pack %s, slice %s.", new Object[]{dc3.f, db6.a, db6.c.a, dc3.a});
                            InputStream inputStream1 = this.d.a(db6.a, db6.c.a, dc3.a, 0);
                            int v2 = this.c.a(db6.c.a);
                            long v3 = this.c.c(db6.c.a);
                            dg1 = new ef(db6.a, db6.c.a, v2, v3, db6.b, db6.c.b, dc3.f, dc3.a, dc3.c, inputStream1);
                            break;
                        }
                    }
                }
                if(dg1 != null) {
                    de0 = this.b;
                    goto label_115;
                }
            }
            goto label_119;
        }
        catch(Throwable throwable0) {
            this.b.l();
            throw throwable0;
        }
    label_115:
        de0.l();
        return dg1;
    label_117:
        this.b.l();
        return dg0;
    label_119:
        this.b.l();
        return null;
    }

    private final boolean b(db db0, dc dc0) {
        return new eo(this.c, db0.c.a, db0.b, db0.c.b, dc0.a).m();
    }

    private static boolean c(dc dc0) {
        return dc0.f == 1 || dc0.f == 2;
    }
}

