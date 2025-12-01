package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import java.util.concurrent.atomic.AtomicBoolean;

final class cl {
    private static final o a;
    private final de b;
    private final cf c;
    private final es d;
    private final du e;
    private final dy f;
    private final eg g;
    private final ek h;
    private final dh i;
    private final AtomicBoolean j;
    private final aq k;

    static {
        cl.a = new o("ExtractorLooper");
    }

    cl(de de0, aq aq0, cf cf0, es es0, du du0, dy dy0, eg eg0, ek ek0, dh dh0) {
        this.b = de0;
        this.k = aq0;
        this.c = cf0;
        this.d = es0;
        this.e = du0;
        this.f = dy0;
        this.g = eg0;
        this.h = ek0;
        this.i = dh0;
        this.j = new AtomicBoolean(false);
    }

    final void a() {
        dg dg0;
        o o0 = cl.a;
        o0.a("Run extractor loop", new Object[0]);
        if(this.j.compareAndSet(false, true)) {
            while(true) {
                try {
                label_3:
                    dg0 = this.i.a();
                }
                catch(ck ck0) {
                    cl.a.b("Error while getting next extraction task: %s", new Object[]{ck0.getMessage()});
                    if(ck0.a >= 0) {
                        ((y)this.k.a()).i(ck0.a);
                        this.b(ck0.a, ck0);
                    }
                    dg0 = null;
                }
                if(dg0 == null) {
                    break;
                }
                try {
                    if(!(dg0 instanceof ce)) {
                        if(dg0 instanceof er) {
                            this.d.a(((er)dg0));
                        }
                        else if(dg0 instanceof dt) {
                            this.e.a(((dt)dg0));
                        }
                        else if(dg0 instanceof dw) {
                            this.f.a(((dw)dg0));
                        }
                        else if(dg0 instanceof ef) {
                            this.g.a(((ef)dg0));
                        }
                        else if(dg0 instanceof ei) {
                            this.h.a(((ei)dg0));
                        }
                        else {
                            Object[] arr_object = {dg0.getClass().getName()};
                            cl.a.b("Unknown task type: %s", arr_object);
                        }
                        goto label_3;
                    }
                    this.c.a(((ce)dg0));
                }
                catch(Exception exception0) {
                    cl.a.b("Error during extraction task: %s", new Object[]{exception0.getMessage()});
                    ((y)this.k.a()).i(dg0.k);
                    this.b(dg0.k, exception0);
                }
            }
            this.j.set(false);
            return;
        }
        o0.e("runLoop already looping; return", new Object[0]);
    }

    private final void b(int v, Exception exception0) {
        try {
            this.b.m(v, 5);
            this.b.n(v);
        }
        catch(ck unused_ex) {
            cl.a.b("Error during error handling: %s", new Object[]{exception0.getMessage()});
        }
    }
}

