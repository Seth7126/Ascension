package com.google.android.gms.auth.account;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.auth.zzb;

public abstract class zzd extends zzb implements zzc {
    public static zzc zzc(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return iInterface0 instanceof zzc ? ((zzc)iInterface0) : new zze(iBinder0);
    }
}

