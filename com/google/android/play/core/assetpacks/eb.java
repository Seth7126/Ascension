package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

final class eb {
    private static final o a;
    private final bh b;
    private final ed c;

    static {
        eb.a = new o("PackMetadataManager");
    }

    eb(bh bh0, ed ed0) {
        this.b = bh0;
        this.c = ed0;
    }

    final String a(String s) {
        Properties properties0;
        if(!this.b.G(s)) {
            return "";
        }
        int v = this.c.a();
        long v1 = this.b.c(s);
        File file0 = this.b.k(s, v, v1);
        try {
            if(!file0.exists()) {
                return String.valueOf(v);
            }
            FileInputStream fileInputStream0 = new FileInputStream(file0);
            try {
                properties0 = new Properties();
                properties0.load(fileInputStream0);
            }
            catch(Throwable throwable0) {
                try {
                    fileInputStream0.close();
                }
                catch(Throwable throwable1) {
                    ea.a(throwable0, throwable1);
                }
                throw throwable0;
            }
            fileInputStream0.close();
            String s1 = properties0.getProperty("moduleVersionTag");
            return s1 == null ? String.valueOf(v) : s1;
        }
        catch(IOException unused_ex) {
            eb.a.b("Failed to read pack version tag for pack %s", new Object[]{s});
            return "";
        }
    }

    final void b(String s, int v, long v1, String s1) throws IOException {
        if(s1 == null || s1.isEmpty()) {
            s1 = String.valueOf(v);
        }
        Properties properties0 = new Properties();
        properties0.put("moduleVersionTag", s1);
        File file0 = this.b.k(s, v, v1);
        file0.getParentFile().mkdirs();
        file0.createNewFile();
        FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
        try {
            properties0.store(fileOutputStream0, null);
        }
        catch(Throwable throwable0) {
            try {
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                ea.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileOutputStream0.close();
    }
}

