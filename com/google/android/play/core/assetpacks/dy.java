package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aq;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

final class dy {
    private final bh a;
    private final de b;
    private final co c;
    private final eb d;
    private final aq e;
    private final aq f;

    dy(bh bh0, aq aq0, de de0, aq aq1, co co0, eb eb0) {
        this.a = bh0;
        this.e = aq0;
        this.b = de0;
        this.f = aq1;
        this.c = co0;
        this.d = eb0;
    }

    public final void a(dw dw0) {
        File file0 = this.a.j(dw0.l, dw0.a, dw0.b);
        File file1 = this.a.l(dw0.l, dw0.a, dw0.b);
        if(!file0.exists() || !file1.exists()) {
            throw new ck(String.format("Cannot find pack files to move for pack %s.", dw0.l), dw0.k);
        }
        File file2 = this.a.h(dw0.l, dw0.a, dw0.b);
        file2.mkdirs();
        if(!file0.renameTo(file2)) {
            throw new ck("Cannot move merged pack files to final location.", dw0.k);
        }
        new File(this.a.h(dw0.l, dw0.a, dw0.b), "merge.tmp").delete();
        File file3 = this.a.i(dw0.l, dw0.a, dw0.b);
        file3.mkdirs();
        if(!file1.renameTo(file3)) {
            throw new ck("Cannot move metadata files to final location.", dw0.k);
        }
        try {
            this.d.b(dw0.l, dw0.a, dw0.b, dw0.c);
        }
        catch(IOException iOException0) {
            throw new ck(String.format("Could not write asset pack version tag for pack %s: %s", dw0.l, iOException0.getMessage()), dw0.k);
        }
        ((Executor)this.f.a()).execute(() -> this.a.B(dw0.l, dw0.a, dw0.b));
        this.b.k(dw0.l, dw0.a, dw0.b);
        this.c.c(dw0.l);
        ((y)this.e.a()).h(dw0.k, dw0.l);
    }

    // 检测为 Lambda 实现
    final void b(dw dw0) [...]
}

