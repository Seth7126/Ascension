package com.google.android.gms.auth;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzg implements zzj {
    private final String zzr;
    private final int zzs;

    zzg(String s, int v) {
        this.zzr = s;
        this.zzs = v;
        super();
    }

    @Override  // com.google.android.gms.auth.zzj
    public final Object zzb(IBinder iBinder0) throws RemoteException, IOException, GoogleAuthException {
        return ((AccountChangeEventsResponse)zzd.zza(zzf.zza(iBinder0).zza(new AccountChangeEventsRequest().setAccountName(this.zzr).setEventIndex(this.zzs)))).getEvents();
    }
}

