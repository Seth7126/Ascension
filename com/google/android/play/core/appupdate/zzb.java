package com.google.android.play.core.appupdate;

import android.content.Context;
import com.google.android.play.core.appupdate.internal.zzz;

public final class zzb {
    private static zza zza;

    static zza zza(Context context0) {
        synchronized(zzb.class) {
            if(zzb.zza == null) {
                zzab zzab0 = new zzab(null);
                zzab0.zzb(new zzi(zzz.zza(context0)));
                zzb.zza = zzab0.zza();
            }
            return zzb.zza;
        }
    }
}

