package com.google.android.play.core.appupdate.internal;

import android.os.Process;
import android.util.Log;
import java.util.Locale;

public final class zzm {
    private final String zza;

    public zzm(String s) {
        this.zza = "UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] " + s;
    }

    // 去混淆评级： 低(20)
    public final int zza(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 3) ? Log.d("PlayCore", zzm.zzf(this.zza, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzb(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", zzm.zzf(this.zza, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzc(Throwable throwable0, String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 6) ? Log.e("PlayCore", zzm.zzf(this.zza, s, arr_object), throwable0) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zzd(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 4) ? Log.i("PlayCore", zzm.zzf(this.zza, s, arr_object)) : 0;
    }

    // 去混淆评级： 低(20)
    public final int zze(String s, Object[] arr_object) {
        return Log.isLoggable("PlayCore", 5) ? Log.w("PlayCore", zzm.zzf(this.zza, "Phonesky package is not signed -- possibly self-built package. Could not verify.", arr_object)) : 0;
    }

    private static String zzf(String s, String s1, Object[] arr_object) {
        if(arr_object.length > 0) {
            s1 = String.format(Locale.US, s1, arr_object);
        }
        return s + " : " + s1;
    }
}

