package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aq;
import java.io.File;
import java.util.concurrent.Executor;

final class ek {
    private final bh a;
    private final de b;
    private final co c;
    private final aq d;
    private final aq e;

    ek(bh bh0, aq aq0, de de0, aq aq1, co co0) {
        this.a = bh0;
        this.d = aq0;
        this.b = de0;
        this.e = aq1;
        this.c = co0;
    }

    public final void a(ei ei0) {
        File file0 = this.a.h(ei0.l, ei0.a, ei0.c);
        if(!file0.exists()) {
            throw new ck(String.format("Cannot find pack files to promote for pack %s at %s", ei0.l, file0.getAbsolutePath()), ei0.k);
        }
        File file1 = this.a.h(ei0.l, ei0.b, ei0.c);
        file1.mkdirs();
        if(!file0.renameTo(file1)) {
            throw new ck(String.format("Cannot promote pack %s from %s to %s", ei0.l, file0.getAbsolutePath(), file1.getAbsolutePath()), ei0.k);
        }
        ((Executor)this.e.a()).execute(() -> this.a.B(ei0.l, ei0.b, ei0.c));
        this.b.k(ei0.l, ei0.b, ei0.c);
        this.c.c(ei0.l);
        ((y)this.d.a()).h(ei0.k, ei0.l);
    }

    // 检测为 Lambda 实现
    final void b(ei ei0) [...]
}

