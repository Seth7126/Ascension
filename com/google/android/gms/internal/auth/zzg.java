package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;

public final class zzg extends zza implements zze {
    zzg(IBinder iBinder0) {
        super(iBinder0, "com.google.android.auth.IAuthManagerService");
    }

    @Override  // com.google.android.gms.internal.auth.zze
    public final Bundle zza(Account account0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, account0);
        Parcel parcel1 = this.transactAndReadException(7, parcel0);
        Bundle bundle0 = (Bundle)zzc.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.auth.zze
    public final Bundle zza(Account account0, String s, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, account0);
        parcel0.writeString(s);
        zzc.zza(parcel0, bundle0);
        Parcel parcel1 = this.transactAndReadException(5, parcel0);
        Bundle bundle1 = (Bundle)zzc.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.auth.zze
    public final Bundle zza(String s) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        parcel0.writeString(s);
        Parcel parcel1 = this.transactAndReadException(8, parcel0);
        Bundle bundle0 = (Bundle)zzc.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle0;
    }

    @Override  // com.google.android.gms.internal.auth.zze
    public final Bundle zza(String s, Bundle bundle0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        parcel0.writeString(s);
        zzc.zza(parcel0, bundle0);
        Parcel parcel1 = this.transactAndReadException(2, parcel0);
        Bundle bundle1 = (Bundle)zzc.zza(parcel1, Bundle.CREATOR);
        parcel1.recycle();
        return bundle1;
    }

    @Override  // com.google.android.gms.internal.auth.zze
    public final AccountChangeEventsResponse zza(AccountChangeEventsRequest accountChangeEventsRequest0) throws RemoteException {
        Parcel parcel0 = this.obtainAndWriteInterfaceToken();
        zzc.zza(parcel0, accountChangeEventsRequest0);
        Parcel parcel1 = this.transactAndReadException(3, parcel0);
        AccountChangeEventsResponse accountChangeEventsResponse0 = (AccountChangeEventsResponse)zzc.zza(parcel1, AccountChangeEventsResponse.CREATOR);
        parcel1.recycle();
        return accountChangeEventsResponse0;
    }
}

