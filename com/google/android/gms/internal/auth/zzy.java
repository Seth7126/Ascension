package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override  // com.google.android.gms.internal.auth.zzb
    protected final boolean dispatchTransaction(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
        switch(v) {
            case 1: {
                this.zzb(((Status)zzc.zza(parcel0, Status.CREATOR)));
                return true;
            }
            case 2: {
                this.zza(((Status)zzc.zza(parcel0, Status.CREATOR)), ((zzt)zzc.zza(parcel0, zzt.CREATOR)));
                return true;
            }
            case 3: {
                this.zza(((Status)zzc.zza(parcel0, Status.CREATOR)), ((zzl)zzc.zza(parcel0, zzl.CREATOR)));
                return true;
            }
            case 4: {
                this.zzd();
                return true;
            }
            case 5: {
                this.onFailure(((Status)zzc.zza(parcel0, Status.CREATOR)));
                return true;
            }
            case 6: {
                this.zza(parcel0.createByteArray());
                return true;
            }
            case 7: {
                this.zza(((DeviceMetaData)zzc.zza(parcel0, DeviceMetaData.CREATOR)));
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

