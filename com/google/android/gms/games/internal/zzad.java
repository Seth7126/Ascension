package com.google.android.gms.games.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.games.zza;
import com.google.android.gms.internal.games.zzd;
import com.google.android.gms.internal.games.zzfi;

public abstract class zzad extends zza implements zzaa {
    public zzad() {
        super("com.google.android.gms.games.internal.IGamesClient");
    }

    @Override  // com.google.android.gms.internal.games.zza
    protected final boolean zza(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        if(v == 1001) {
            zzfi zzfi0 = this.zzaf();
            parcel1.writeNoException();
            zzd.zzb(parcel1, zzfi0);
            return true;
        }
        return false;
    }
}

