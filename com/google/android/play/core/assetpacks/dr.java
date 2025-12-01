package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

public final class dr extends InputStream {
    private final Enumeration a;
    private InputStream b;

    public dr(Enumeration enumeration0) throws IOException {
        this.a = enumeration0;
        this.a();
    }

    final void a() throws IOException {
        InputStream inputStream0 = this.b;
        if(inputStream0 != null) {
            inputStream0.close();
        }
        this.b = this.a.hasMoreElements() ? new FileInputStream(((File)this.a.nextElement())) : null;
    }

    @Override
    public final void close() throws IOException {
        super.close();
        InputStream inputStream0 = this.b;
        if(inputStream0 != null) {
            inputStream0.close();
            this.b = null;
        }
    }

    @Override
    public final int read() throws IOException {
        InputStream inputStream0;
        while((inputStream0 = this.b) != null) {
            int v = inputStream0.read();
            if(v != -1) {
                return v;
            }
            this.a();
        }
        return -1;
    }

    @Override
    public final int read(byte[] arr_b, int v, int v1) throws IOException {
        if(this.b == null) {
            return -1;
        }
        arr_b.getClass();
        if(v < 0 || v1 < 0 || v1 > arr_b.length - v) {
            throw new IndexOutOfBoundsException();
        }
        if(v1 != 0) {
            do {
                int v2 = this.b.read(arr_b, v, v1);
                if(v2 > 0) {
                    return v2;
                }
                this.a();
            }
            while(this.b != null);
            return -1;
        }
        return 0;
    }
}

