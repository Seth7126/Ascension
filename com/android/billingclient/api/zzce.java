package com.android.billingclient.api;

import com.google.android.datatransport.Transformer;
import com.google.android.gms.internal.play_billing.zzhl;

public final class zzce implements Transformer {
    public static final zzce zza;

    static {
        zzce.zza = new zzce();
    }

    @Override  // com.google.android.datatransport.Transformer
    public final Object apply(Object object0) {
        return ((zzhl)object0).zzd();
    }
}

