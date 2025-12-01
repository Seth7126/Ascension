package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzm {
    private final ConcurrentHashMap zza;
    private final ReferenceQueue zzb;

    zzm() {
        this.zza = new ConcurrentHashMap(16, 0.75f, 10);
        this.zzb = new ReferenceQueue();
    }

    public final List zza(Throwable throwable0, boolean z) {
        for(Reference reference0 = this.zzb.poll(); reference0 != null; reference0 = this.zzb.poll()) {
            this.zza.remove(reference0);
        }
        zzp zzp0 = new zzp(throwable0, null);
        List list0 = (List)this.zza.get(zzp0);
        if(list0 != null) {
            return list0;
        }
        List list1 = new Vector(2);
        zzp zzp1 = new zzp(throwable0, this.zzb);
        List list2 = (List)this.zza.putIfAbsent(zzp1, list1);
        return list2 == null ? list1 : list2;
    }
}

