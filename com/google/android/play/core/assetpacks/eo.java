package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

final class eo {
    private static final o a;
    private final byte[] b;
    private final bh c;
    private final String d;
    private final int e;
    private final long f;
    private final String g;
    private int h;

    static {
        eo.a = new o("SliceMetadataManager");
    }

    eo(bh bh0, String s, int v, long v1, String s1) {
        this.b = new byte[0x2000];
        this.c = bh0;
        this.d = s;
        this.e = v;
        this.f = v1;
        this.g = s1;
        this.h = -1;
    }

    final int a() throws IOException {
        Properties properties0;
        File file0 = this.c.n(this.d, this.e, this.f, this.g);
        if(!file0.exists()) {
            return 0;
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
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileInputStream0.close();
        if(Integer.parseInt(properties0.getProperty("fileStatus", "-1")) == 4) {
            return -1;
        }
        if(properties0.getProperty("previousChunk") == null) {
            throw new ck("Slice checkpoint file corrupt.");
        }
        return Integer.parseInt(properties0.getProperty("previousChunk")) + 1;
    }

    final em b() throws IOException {
        File file0 = this.c.n(this.d, this.e, this.f, this.g);
        if(!file0.exists()) {
            throw new ck("Slice checkpoint file does not exist.");
        }
        Properties properties0 = new Properties();
        FileInputStream fileInputStream0 = new FileInputStream(file0);
        try {
            properties0.load(fileInputStream0);
        }
        catch(Throwable throwable0) {
            try {
                fileInputStream0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileInputStream0.close();
        if(properties0.getProperty("fileStatus") != null && properties0.getProperty("previousChunk") != null) {
            try {
                int v = Integer.parseInt(properties0.getProperty("fileStatus"));
                String s = properties0.getProperty("fileName");
                long v1 = Long.parseLong(properties0.getProperty("fileOffset", "-1"));
                long v2 = Long.parseLong(properties0.getProperty("remainingBytes", "-1"));
                int v3 = Integer.parseInt(properties0.getProperty("previousChunk"));
                this.h = Integer.parseInt(properties0.getProperty("metadataFileCounter", "0"));
                return new bp(v, s, v1, v2, v3);
            }
            catch(NumberFormatException numberFormatException0) {
                throw new ck("Slice checkpoint file corrupt.", numberFormatException0);
            }
        }
        throw new ck("Slice checkpoint file corrupt.");
    }

    final File c() {
        return new File(this.n(), String.format("%s-NAM.dat", this.h));
    }

    final void d(InputStream inputStream0, long v) throws IOException {
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(this.c(), "rw");
        try {
            randomAccessFile0.seek(v);
            do {
                int v1 = inputStream0.read(this.b);
                if(v1 > 0) {
                    randomAccessFile0.write(this.b, 0, v1);
                }
            }
            while(v1 == 0x2000);
        }
        catch(Throwable throwable0) {
            try {
                randomAccessFile0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        randomAccessFile0.close();
    }

    final void e(long v, byte[] arr_b, int v1, int v2) throws IOException {
        RandomAccessFile randomAccessFile0 = new RandomAccessFile(this.c(), "rw");
        try {
            randomAccessFile0.seek(v);
            randomAccessFile0.write(arr_b, v1, v2);
        }
        catch(Throwable throwable0) {
            try {
                randomAccessFile0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        randomAccessFile0.close();
    }

    final void f(int v) throws IOException {
        Properties properties0 = new Properties();
        properties0.put("fileStatus", "3");
        properties0.put("fileOffset", String.valueOf(this.c().length()));
        properties0.put("previousChunk", String.valueOf(v));
        properties0.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.o());
        try {
            properties0.store(fileOutputStream0, null);
        }
        catch(Throwable throwable0) {
            try {
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileOutputStream0.close();
    }

    final void g(String s, long v, long v1, int v2) throws IOException {
        Properties properties0 = new Properties();
        properties0.put("fileStatus", "1");
        properties0.put("fileName", s);
        properties0.put("fileOffset", String.valueOf(v));
        properties0.put("remainingBytes", String.valueOf(v1));
        properties0.put("previousChunk", String.valueOf(v2));
        properties0.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.o());
        try {
            properties0.store(fileOutputStream0, null);
        }
        catch(Throwable throwable0) {
            try {
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileOutputStream0.close();
    }

    final void h(byte[] arr_b, int v) throws IOException {
        Properties properties0 = new Properties();
        properties0.put("fileStatus", "2");
        properties0.put("previousChunk", String.valueOf(v));
        properties0.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.o());
        try {
            properties0.store(fileOutputStream0, null);
        }
        catch(Throwable throwable0) {
            try {
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileOutputStream0.close();
        File file0 = this.c.m(this.d, this.e, this.f, this.g);
        if(file0.exists()) {
            file0.delete();
        }
        FileOutputStream fileOutputStream1 = new FileOutputStream(file0);
        try {
            fileOutputStream1.write(arr_b);
        }
        catch(Throwable throwable2) {
            try {
                fileOutputStream1.close();
            }
            catch(Throwable throwable3) {
                en.a(throwable2, throwable3);
            }
            throw throwable2;
        }
        fileOutputStream1.close();
    }

    final void i(int v) throws IOException {
        Properties properties0 = new Properties();
        properties0.put("fileStatus", "4");
        properties0.put("previousChunk", String.valueOf(v));
        properties0.put("metadataFileCounter", String.valueOf(this.h));
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.o());
        try {
            properties0.store(fileOutputStream0, null);
        }
        catch(Throwable throwable0) {
            try {
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileOutputStream0.close();
    }

    final void j(byte[] arr_b) throws IOException {
        ++this.h;
        File file0 = new File(this.n(), String.format("%s-LFH.dat", this.h));
        try {
            FileOutputStream fileOutputStream0 = new FileOutputStream(file0);
            try {
                fileOutputStream0.write(arr_b);
            }
            catch(Throwable throwable0) {
                try {
                    fileOutputStream0.close();
                }
                catch(Throwable throwable1) {
                    en.a(throwable0, throwable1);
                }
                throw throwable0;
            }
            fileOutputStream0.close();
        }
        catch(IOException iOException0) {
            throw new ck("Could not write metadata file.", iOException0);
        }
    }

    final void k(byte[] arr_b, InputStream inputStream0) throws IOException {
        ++this.h;
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.c());
        try {
            fileOutputStream0.write(arr_b);
            for(int v = inputStream0.read(this.b); v > 0; v = inputStream0.read(this.b)) {
                fileOutputStream0.write(this.b, 0, v);
            }
        }
        catch(Throwable throwable0) {
            try {
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileOutputStream0.close();
    }

    final void l(byte[] arr_b, int v, int v1) throws IOException {
        ++this.h;
        FileOutputStream fileOutputStream0 = new FileOutputStream(this.c());
        try {
            fileOutputStream0.write(arr_b, 0, v1);
        }
        catch(Throwable throwable0) {
            try {
                fileOutputStream0.close();
            }
            catch(Throwable throwable1) {
                en.a(throwable0, throwable1);
            }
            throw throwable0;
        }
        fileOutputStream0.close();
    }

    final boolean m() {
        Properties properties0;
        File file0 = this.c.n(this.d, this.e, this.f, this.g);
        if(!file0.exists()) {
            return false;
        }
        try {
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
                    en.a(throwable0, throwable1);
                }
                throw throwable0;
            }
            fileInputStream0.close();
        }
        catch(IOException iOException0) {
            eo.a.b("Could not read checkpoint while checking if extraction finished. %s", new Object[]{iOException0});
            return false;
        }
        if(properties0.getProperty("fileStatus") == null) {
            eo.a.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        }
        return Integer.parseInt(properties0.getProperty("fileStatus")) == 4;
    }

    private final File n() {
        File file0 = this.c.o(this.d, this.e, this.f, this.g);
        if(!file0.exists()) {
            file0.mkdirs();
        }
        return file0;
    }

    private final File o() throws IOException {
        File file0 = this.c.n(this.d, this.e, this.f, this.g);
        file0.getParentFile().mkdirs();
        file0.createNewFile();
        return file0;
    }
}

