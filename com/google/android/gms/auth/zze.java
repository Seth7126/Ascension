package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zze implements zzj {
    private final Bundle val$options;
    private final Account zzo;
    private final String zzp;

    zze(Account account0, String s, Bundle bundle0) {
        this.zzo = account0;
        this.zzp = s;
        this.val$options = bundle0;
        super();
    }

    @Override  // com.google.android.gms.auth.zzj
    public final Object zzb(IBinder iBinder0) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle0 = (Bundle)zzd.zza(zzf.zza(iBinder0).zza(this.zzo, this.zzp, this.val$options));
        TokenData tokenData0 = TokenData.zza(bundle0, "tokenDetails");
        if(tokenData0 != null) {
            return tokenData0;
        }
        String s = bundle0.getString("Error");
        Intent intent0 = (Intent)bundle0.getParcelable("userRecoveryIntent");
        zzay zzay0 = zzay.zzc(s);
        if(!zzay.zza(zzay0)) {
            if(!(zzay.zzco.equals(zzay0) || zzay.zzcp.equals(zzay0) || zzay.zzcq.equals(zzay0))) {
                throw new GoogleAuthException(s);
            }
            throw new IOException(s);
        }
        zzd.zzn.w("GoogleAuthUtil", new Object[]{"isUserRecoverableError status: " + zzay0});
        throw new UserRecoverableAuthException(s, intent0);
    }
}

