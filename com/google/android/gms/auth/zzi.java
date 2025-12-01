package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzi implements zzj {
    private final String zzt;

    zzi(String s) {
        this.zzt = s;
        super();
    }

    @Override  // com.google.android.gms.auth.zzj
    public final Object zzb(IBinder iBinder0) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle0 = (Bundle)zzd.zza(zzf.zza(iBinder0).zza(this.zzt));
        String s = bundle0.getString("Error");
        Intent intent0 = (Intent)bundle0.getParcelable("userRecoveryIntent");
        zzay zzay0 = zzay.zzc(s);
        if(zzay.zzcm.equals(zzay0)) {
            return true;
        }
        if(!zzay.zza(zzay0)) {
            throw new GoogleAuthException(s);
        }
        zzd.zzn.w("GoogleAuthUtil", new Object[]{"isUserRecoverableError status: " + zzay0});
        throw new UserRecoverableAuthException(s, intent0);
    }
}

