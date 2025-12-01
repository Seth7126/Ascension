package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions.Builder;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

public final class zzh extends GmsClient {
    private final GoogleSignInOptions zzcg;

    public zzh(Context context0, Looper looper0, ClientSettings clientSettings0, GoogleSignInOptions googleSignInOptions0, ConnectionCallbacks googleApiClient$ConnectionCallbacks0, OnConnectionFailedListener googleApiClient$OnConnectionFailedListener0) {
        super(context0, looper0, 91, clientSettings0, googleApiClient$ConnectionCallbacks0, googleApiClient$OnConnectionFailedListener0);
        Builder googleSignInOptions$Builder0 = googleSignInOptions0 == null ? new Builder() : new Builder(googleSignInOptions0);
        googleSignInOptions$Builder0.setLogSessionId("UwHB7OwqER-VAXmlPZY3tw");
        if(!clientSettings0.getAllRequestedScopes().isEmpty()) {
            for(Object object0: clientSettings0.getAllRequestedScopes()) {
                googleSignInOptions$Builder0.requestScopes(((Scope)object0), new Scope[0]);
            }
        }
        this.zzcg = googleSignInOptions$Builder0.build();
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected final IInterface createServiceInterface(IBinder iBinder0) {
        if(iBinder0 == null) {
            return null;
        }
        IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterface0 instanceof zzv ? ((zzv)iInterface0) : new zzu(iBinder0);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public final Intent getSignInIntent() {
        return zzg.zzc(this.getContext(), this.zzcg);
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override  // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api$Client
    public final boolean providesSignIn() {
        return true;
    }

    public final GoogleSignInOptions zzk() {
        return this.zzcg;
    }
}

