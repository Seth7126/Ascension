package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzh implements zzj {
    private final Account zzo;

    zzh(Account account0) {
        this.zzo = account0;
        super();
    }

    @Override  // com.google.android.gms.auth.zzj
    public final Object zzb(IBinder iBinder0) throws RemoteException, IOException, GoogleAuthException {
        return (Bundle)zzd.zza(zzf.zza(iBinder0).zza(this.zzo));
    }
}

