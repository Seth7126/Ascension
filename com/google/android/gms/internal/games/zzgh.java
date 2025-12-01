package com.google.android.gms.internal.games;

import android.os.Build.VERSION;

public final class zzgh {
    static final class zza extends zzgk {
        @Override  // com.google.android.gms.internal.games.zzgk
        public final void zza(Throwable throwable0, Throwable throwable1) {
        }
    }

    private static final zzgk zznh;
    private static final int zzni;

    static {
        zza zzgh$zza0;
        Integer integer0;
        int v = 1;
        try {
            integer0 = null;
            integer0 = zzgh.zzcw();
            zzgh$zza0 = integer0 == null || ((int)integer0) < 19 ? new zzgl() : new zzgn();
        }
        catch(Throwable throwable0) {
            System.err.println("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy com.google.android.gms.internal.games.zzgh$zzawill be used. The error is: ");
            throwable0.printStackTrace(System.err);
            zzgh$zza0 = new zza();
        }
        zzgh.zznh = zzgh$zza0;
        if(integer0 != null) {
            v = (int)integer0;
        }
        zzgh.zzni = v;
    }

    public static void zza(Throwable throwable0, Throwable throwable1) {
        zzgh.zznh.zza(throwable0, throwable1);
    }

    // 去混淆评级： 低(40)
    private static Integer zzcw() {
        return Build.VERSION.SDK_INT;
    }
}

