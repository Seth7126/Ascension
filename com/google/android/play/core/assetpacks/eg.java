package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.am;
import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import jeb.synthetic.TWR;

final class eg {
    private static final o a;
    private final bh b;
    private final aq c;

    static {
        eg.a = new o("PatchSliceTaskHandler");
    }

    eg(bh bh0, aq aq0) {
        this.b = bh0;
        this.c = aq0;
    }

    public final void a(ef ef0) {
        File file0 = this.b.h(ef0.l, ef0.a, ef0.b);
        File file1 = new File(this.b.i(ef0.l, ef0.a, ef0.b), ef0.f);
        try {
            InputStream inputStream0 = ef0.h;
            if(ef0.e == 2) {
                inputStream0 = new GZIPInputStream(inputStream0, 0x2000);
            }
            try {
                bk bk0 = new bk(file0, file1);
                File file2 = this.b.p(ef0.l, ef0.c, ef0.d, ef0.f);
                if(!file2.exists()) {
                    file2.mkdirs();
                }
                eo eo0 = new eo(this.b, ef0.l, ef0.c, ef0.d, ef0.f);
                am.a(bk0, inputStream0, new cn(file2, eo0), ef0.g);
                eo0.i(0);
            }
            catch(Throwable throwable0) {
                TWR.safeClose$NT(inputStream0, throwable0);
                throw throwable0;
            }
            inputStream0.close();
        }
        catch(IOException iOException0) {
            eg.a.b("IOException during patching %s.", new Object[]{iOException0.getMessage()});
            throw new ck(String.format("Error patching slice %s of pack %s.", ef0.f, ef0.l), iOException0, ef0.k);
        }
        eg.a.d("Patching and extraction finished for slice %s of pack %s.", new Object[]{ef0.f, ef0.l});
        ((y)this.c.a()).g(ef0.k, ef0.l, ef0.f, 0);
        try {
            ef0.h.close();
        }
        catch(IOException unused_ex) {
            eg.a.e("Could not close file for slice %s of pack %s.", new Object[]{ef0.f, ef0.l});
        }
    }
}

