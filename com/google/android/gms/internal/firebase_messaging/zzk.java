package com.google.android.gms.internal.firebase_messaging;

import android.os.Build.VERSION;

public final class zzk {
    static final class zza extends zzn {
        @Override  // com.google.android.gms.internal.firebase_messaging.zzn
        public final void zza(Throwable throwable0, Throwable throwable1) {
        }
    }

    private static final zzn zza;
    private static final int zzb;

    static {
        zza zzk$zza0;
        Integer integer0;
        int v = 1;
        try {
            integer0 = null;
            integer0 = zzk.zza();
            zzk$zza0 = integer0 == null || ((int)integer0) < 19 ? new zzo() : new zzq();
        }
        catch(Throwable throwable0) {
            System.err.println("An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy com.google.android.gms.internal.firebase_messaging.zzk$zzawill be used. The error is: ");
            throwable0.printStackTrace(System.err);
            zzk$zza0 = new zza();
        }
        zzk.zza = zzk$zza0;
        if(integer0 != null) {
            v = (int)integer0;
        }
        zzk.zzb = v;
    }

    // 去混淆评级： 低(40)
    private static Integer zza() {
        return Build.VERSION.SDK_INT;
    }

    public static void zza(Throwable throwable0, Throwable throwable1) {
        zzk.zza.zza(throwable0, throwable1);
    }
}

