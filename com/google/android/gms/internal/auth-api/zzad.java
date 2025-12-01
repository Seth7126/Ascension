package com.google.android.gms.internal.auth-api;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;

public interface zzad extends IInterface {
    void zzc(IStatusCallback arg1, String arg2) throws RemoteException;

    void zzc(zzab arg1, BeginSignInRequest arg2) throws RemoteException;
}

