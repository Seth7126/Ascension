package com.google.android.play.core.appupdate;

import android.content.Context;
import java.io.File;

final class zzt {
    private final Context zza;

    zzt(Context context0) {
        this.zza = context0;
    }

    final long zza() {
        return zzt.zzb(new File(this.zza.getFilesDir(), "assetpacks"));
    }

    private static long zzb(File file0) {
        if(!file0.isDirectory()) {
            return file0.length();
        }
        File[] arr_file = file0.listFiles();
        long v = 0L;
        if(arr_file != null) {
            for(int v1 = 0; v1 < arr_file.length; ++v1) {
                v += zzt.zzb(arr_file[v1]);
            }
        }
        return v;
    }
}

