package com.google.android.gms.internal.games;

import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzac;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzcs implements RemoteCall {
    private final String zzew;
    private final String zzfm;
    private final String zzfz;

    zzcs(String s, String s1, String s2) {
        this.zzew = s;
        this.zzfz = s1;
        this.zzfm = s2;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        ((TaskCompletionSource)object1).setResult(((zzac)((zzf)object0).getService()).zza(this.zzew, this.zzfz, this.zzfm));
    }
}

