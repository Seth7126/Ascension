package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.aq;
import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;

final class cf {
    private static final o a;
    private final byte[] b;
    private final bh c;
    private final co d;
    private final eb e;
    private final aq f;
    private final aq g;

    static {
        cf.a = new o("ExtractChunkTaskHandler");
    }

    cf(bh bh0, aq aq0, aq aq1, co co0, eb eb0) {
        this.b = new byte[0x2000];
        this.c = bh0;
        this.f = aq0;
        this.g = aq1;
        this.d = co0;
        this.e = eb0;
    }

    public final void a(ce ce0) {
        long v8;
        File file5;
        eu eu0;
        Throwable throwable2;
        InputStream inputStream3;
        InputStream inputStream2;
        String s1;
        long v6;
        int v4;
        long v2;
        RandomAccessFile randomAccessFile0;
        File file1;
        int v1;
        em em0;
        InputStream inputStream1;
        String s = ce0.l;
        eo eo0 = new eo(this.c, s, ce0.a, ce0.b, ce0.d);
        File file0 = this.c.o(s, ce0.a, ce0.b, ce0.d);
        if(!file0.exists()) {
            file0.mkdirs();
        }
        try {
            InputStream inputStream0 = ce0.j;
            inputStream1 = ce0.e == 1 ? new GZIPInputStream(inputStream0, 0x2000) : inputStream0;
        }
        catch(IOException iOException0) {
            cf.a.b("IOException during extraction %s.", new Object[]{iOException0.getMessage()});
            throw new ck(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", ce0.f, ce0.d, ce0.l, ce0.k), iOException0, ce0.k);
        }
        try {
            if(ce0.f > 0) {
                em0 = eo0.b();
                int v = em0.b();
                v1 = ce0.f;
                if(v != v1 - 1) {
                    inputStream2 = inputStream1;
                    throw new ck(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", v1, em0.b()), ce0.k);
                }
                switch(em0.a()) {
                    case 1: {
                        goto label_17;
                    }
                    case 2: {
                        goto label_49;
                    }
                    case 3: {
                        goto label_56;
                    }
                }
            }
            else {
                goto label_69;
            }
            goto label_71;
        }
        catch(Throwable throwable0) {
            inputStream2 = inputStream1;
            goto label_114;
        }
        try {
            throw new ck(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", em0.a()), ce0.k);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            inputStream2 = inputStream1;
            goto label_115;
        }
        try {
        label_17:
            Object[] arr_object = {em0.e()};
            cf.a.a("Resuming zip entry from last chunk during file %s.", arr_object);
            file1 = new File(em0.e());
            if(!file1.exists()) {
                inputStream2 = inputStream1;
                throw new ck("Partial file specified in checkpoint does not exist. Corrupt directory.", ce0.k);
            }
            randomAccessFile0 = new RandomAccessFile(file1, "rw");
            randomAccessFile0.seek(em0.c());
            v2 = em0.d();
            while(true) {
            label_24:
                int v3 = (int)Math.min(v2, 0x2000L);
                v4 = Math.max(inputStream1.read(this.b, 0, v3), 0);
                if(v4 > 0) {
                    break;
                }
                goto label_28;
            }
        }
        catch(Throwable throwable0) {
            inputStream2 = inputStream1;
            goto label_114;
        }
        try {
            randomAccessFile0.write(this.b, 0, v4);
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            inputStream2 = inputStream1;
            goto label_115;
        }
    label_28:
        long v5 = v2 - ((long)v4);
        if(v5 <= 0L || v4 <= 0) {
            goto label_32;
        }
        try {
            v2 = v5;
            goto label_24;
        label_32:
            v6 = randomAccessFile0.length();
            randomAccessFile0.close();
            if(v4 == v3) {
                inputStream2 = inputStream1;
                inputStream3 = inputStream2;
            }
            else {
                cf.a.a("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                s1 = file1.getCanonicalPath();
                inputStream2 = inputStream1;
                goto label_42;
            }
            goto label_71;
        }
        catch(Throwable throwable0) {
            inputStream2 = inputStream1;
            goto label_114;
        }
        try {
        label_42:
            eo0.g(s1, v6, v5, ce0.f);
            inputStream3 = null;
            goto label_71;
        }
        catch(Throwable throwable0) {
            goto label_114;
        }
        try {
        label_49:
            cf.a.a("Resuming zip entry from last chunk during local file header.", new Object[0]);
            File file2 = this.c.m(ce0.l, ce0.a, ce0.b, ce0.d);
            if(!file2.exists()) {
                throw new ck("Checkpoint extension file not found.", ce0.k);
            }
            inputStream2 = inputStream1;
            inputStream3 = new SequenceInputStream(new FileInputStream(file2), inputStream1);
            goto label_71;
        label_56:
            cf.a.a("Resuming central directory from last chunk.", new Object[0]);
            eo0.d(inputStream1, em0.c());
            if(!ce0.a()) {
                throw new ck("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", ce0.k);
            }
            inputStream2 = inputStream1;
            inputStream3 = null;
            goto label_71;
        }
        catch(Throwable throwable1) {
            throwable2 = throwable1;
            inputStream2 = inputStream1;
            goto label_115;
        }
        try {
            inputStream2 = inputStream1;
            throw new ck(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", v1, em0.b()), ce0.k);
        label_69:
            inputStream2 = inputStream1;
            inputStream3 = inputStream2;
        label_71:
            if(inputStream3 != null) {
                bw bw0 = new bw(inputStream3);
                File file3 = this.b(ce0);
                do {
                    eu0 = bw0.b();
                    if(!eu0.e() && !bw0.c()) {
                        if(!eu0.h() || eu0.g()) {
                            eo0.k(eu0.f(), bw0);
                        }
                        else {
                            eo0.j(eu0.f());
                            File file4 = new File(file3, eu0.c());
                            file4.getParentFile().mkdirs();
                            FileOutputStream fileOutputStream0 = new FileOutputStream(file4);
                            for(int v7 = bw0.read(this.b, 0, 0x2000); v7 > 0; v7 = bw0.read(this.b, 0, 0x2000)) {
                                fileOutputStream0.write(this.b, 0, v7);
                            }
                            fileOutputStream0.close();
                        }
                    }
                }
                while(!bw0.d() && !bw0.c());
                if(bw0.c()) {
                    cf.a.a("Writing central directory metadata.", new Object[0]);
                    eo0.k(eu0.f(), inputStream3);
                }
                if(!ce0.a()) {
                    if(eu0.e()) {
                        cf.a.a("Writing slice checkpoint for partial local file header.", new Object[0]);
                        eo0.h(eu0.f(), ce0.f);
                    }
                    else if(!bw0.c()) {
                        if(eu0.a() == 0) {
                            cf.a.a("Writing slice checkpoint for partial file.", new Object[0]);
                            file5 = new File(this.b(ce0), eu0.c());
                            v8 = eu0.b() - bw0.a();
                            if(file5.length() != v8) {
                                throw new ck("Partial file is of unexpected size.");
                            }
                        }
                        else {
                            cf.a.a("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                            file5 = eo0.c();
                            v8 = file5.length();
                        }
                        eo0.g(file5.getCanonicalPath(), v8, bw0.a(), ce0.f);
                    }
                    else {
                        cf.a.a("Writing slice checkpoint for central directory.", new Object[0]);
                        eo0.f(ce0.f);
                    }
                }
            }
            goto label_120;
        }
        catch(Throwable throwable0) {
        }
    label_114:
        throwable2 = throwable0;
        try {
        label_115:
            inputStream2.close();
        }
        catch(Throwable throwable3) {
            try {
                throwable2.addSuppressed(throwable3);
            }
            catch(Exception unused_ex) {
            }
        }
        try {
            throw throwable2;
        label_120:
            inputStream2.close();
        }
        catch(IOException iOException0) {
            cf.a.b("IOException during extraction %s.", new Object[]{iOException0.getMessage()});
            throw new ck(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", ce0.f, ce0.d, ce0.l, ce0.k), iOException0, ce0.k);
        }
        if(ce0.a()) {
            try {
                eo0.i(ce0.f);
            }
            catch(IOException iOException1) {
                cf.a.b("Writing extraction finished checkpoint failed with %s.", new Object[]{iOException1.getMessage()});
                throw new ck("Writing extraction finished checkpoint failed.", iOException1, ce0.k);
            }
        }
        cf.a.d("Extraction finished for chunk %s of slice %s of pack %s of session %s.", new Object[]{ce0.f, ce0.d, ce0.l, ce0.k});
        ((y)this.f.a()).g(ce0.k, ce0.l, ce0.d, ce0.f);
        try {
            ce0.j.close();
        }
        catch(IOException unused_ex) {
            cf.a.e("Could not close file for chunk %s of slice %s of pack %s.", new Object[]{ce0.f, ce0.d, ce0.l});
        }
        if(ce0.i == 3) {
            bb bb0 = (bb)this.g.a();
            String s2 = ce0.l;
            double f = this.d.b(s2, ce0);
            String s3 = this.e.a(ce0.l);
            bb0.d(AssetPackState.a(s2, 3, 0, ce0.h, ce0.h, f, 1, ce0.c, s3));
        }
    }

    private final File b(ce ce0) {
        File file0 = this.c.p(ce0.l, ce0.a, ce0.b, ce0.d);
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return file0;
    }
}

