package com.google.android.gms.internal.games;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzgj {
    private final ConcurrentHashMap zznj;
    private final ReferenceQueue zznk;

    zzgj() {
        this.zznj = new ConcurrentHashMap(16, 0.75f, 10);
        this.zznk = new ReferenceQueue();
    }

    public final List zza(Throwable throwable0, boolean z) {
        for(Reference reference0 = this.zznk.poll(); reference0 != null; reference0 = this.zznk.poll()) {
            this.zznj.remove(reference0);
        }
        zzgm zzgm0 = new zzgm(throwable0, null);
        List list0 = (List)this.zznj.get(zzgm0);
        if(list0 != null) {
            return list0;
        }
        List list1 = new Vector(2);
        zzgm zzgm1 = new zzgm(throwable0, this.zznk);
        List list2 = (List)this.zznj.putIfAbsent(zzgm1, list1);
        return list2 == null ? list1 : list2;
    }
}

