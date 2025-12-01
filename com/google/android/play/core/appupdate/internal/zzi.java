package com.google.android.play.core.appupdate.internal;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzi {
    private static final Set zza;
    private static final Set zzb;
    private static final Map zzc;
    private static final zzm zzd;

    static {
        zzi.zza = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        zzi.zzb = new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        zzi.zzc = new HashMap();
        zzi.zzd = new zzm("PlayCoreVersion");
    }

    public static Map zza(String s) {
        synchronized(zzi.class) {
            Map map0 = zzi.zzc;
            if(!map0.containsKey("app_update")) {
                HashMap hashMap0 = new HashMap();
                hashMap0.put("java", 11004);
                map0.put("app_update", hashMap0);
            }
            return (Map)map0.get("app_update");
        }
    }
}

