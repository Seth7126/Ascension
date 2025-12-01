package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.internal.o;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

final class es {
    private static final o a;
    private final bh b;

    static {
        es.a = new o("VerifySliceTaskHandler");
    }

    es(bh bh0) {
        this.b = bh0;
    }

    public final void a(er er0) {
        File file0 = this.b.p(er0.l, er0.a, er0.b, er0.c);
        if(!file0.exists()) {
            throw new ck(String.format("Cannot find unverified files for slice %s.", er0.c), er0.k);
        }
        this.b(er0, file0);
        File file1 = this.b.q(er0.l, er0.a, er0.b, er0.c);
        if(!file1.exists()) {
            file1.mkdirs();
        }
        if(!file0.renameTo(file1)) {
            throw new ck(String.format("Failed to move slice %s after verification.", er0.c), er0.k);
        }
    }

    private final void b(er er0, File file0) {
        List list0;
        try {
            File file1 = this.b.o(er0.l, er0.a, er0.b, er0.c);
            if(!file1.exists()) {
                throw new ck(String.format("Cannot find metadata files for slice %s.", er0.c), er0.k);
            }
            list0 = eq.a(file0, file1);
        }
        catch(IOException iOException0) {
            throw new ck(String.format("Could not reconstruct slice archive during verification for slice %s.", er0.c), iOException0, er0.k);
        }
        try {
            String s = dq.a(list0);
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new ck("SHA256 algorithm not supported.", noSuchAlgorithmException0, er0.k);
        }
        catch(IOException iOException1) {
            throw new ck(String.format("Could not digest file during verification for slice %s.", er0.c), iOException1, er0.k);
        }
        if(!s.equals(er0.d)) {
            throw new ck(String.format("Verification failed for slice %s.", er0.c), er0.k);
        }
        es.a.d("Verification of slice %s of pack %s successful.", new Object[]{er0.c, er0.l});
    }
}

