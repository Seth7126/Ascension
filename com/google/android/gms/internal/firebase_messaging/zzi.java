package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzi {
    private static final Logger zza;

    static {
        zzi.zza = Logger.getLogger(zzi.class.getName());
    }

    public static void zza(@NullableDecl InputStream inputStream0) {
        if(inputStream0 != null) {
            try {
                inputStream0.close();
            }
            catch(IOException iOException0) {
                try {
                    zzi.zza.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", iOException0);
                }
                catch(IOException iOException1) {
                    throw new AssertionError(iOException1);
                }
            }
        }
    }
}

