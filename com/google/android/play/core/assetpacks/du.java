package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.IOException;

final class du {
    private static final o a;
    private final bh b;

    static {
        du.a = new o("MergeSliceTaskHandler");
    }

    du(bh bh0) {
        this.b = bh0;
    }

    public final void a(dt dt0) {
        File file0 = this.b.q(dt0.l, dt0.a, dt0.b, dt0.c);
        if(file0.exists()) {
            File file1 = this.b.j(dt0.l, dt0.a, dt0.b);
            if(!file1.exists()) {
                file1.mkdirs();
            }
            du.b(file0, file1);
            try {
                int v = this.b.b(dt0.l, dt0.a, dt0.b);
                this.b.A(dt0.l, dt0.a, dt0.b, v + 1);
                return;
            }
            catch(IOException iOException0) {
                du.a.b("Writing merge checkpoint failed with %s.", new Object[]{iOException0.getMessage()});
                throw new ck("Writing merge checkpoint failed.", iOException0, dt0.k);
            }
        }
        throw new ck(String.format("Cannot find verified files for slice %s.", dt0.c), dt0.k);
    }

    private static void b(File file0, File file1) {
        if(file0.isDirectory()) {
            file1.mkdirs();
            File[] arr_file = file0.listFiles();
            for(int v = 0; v < arr_file.length; ++v) {
                File file2 = arr_file[v];
                du.b(file2, new File(file1, file2.getName()));
            }
            if(!file0.delete()) {
                throw new ck("Unable to delete directory: " + file0);
            }
            return;
        }
        if(file1.exists()) {
            throw new ck("File clashing with existing file from other slice: " + file1.toString());
        }
        if(!file0.renameTo(file1)) {
            throw new ck("Unable to move file: " + file0);
        }
    }
}

