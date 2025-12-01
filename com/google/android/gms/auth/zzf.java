package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

final class zzf implements zzj {
    private final Bundle val$extras;
    private final String zzq;

    zzf(String s, Bundle bundle0) {
        this.zzq = s;
        this.val$extras = bundle0;
        super();
    }

    @Override  // com.google.android.gms.auth.zzj
    public final Object zzb(IBinder iBinder0) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle0 = (Bundle)zzd.zza(com.google.android.gms.internal.auth.zzf.zza(iBinder0).zza(this.zzq, this.val$extras));
        String s = bundle0.getString("Error");
        if(!bundle0.getBoolean("booleanResult")) {
            throw new GoogleAuthException(s);
        }
        return null;
    }
}

