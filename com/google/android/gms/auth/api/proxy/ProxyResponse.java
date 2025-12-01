package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = null;
    public static final int STATUS_CODE_NO_CONNECTION = -1;
    public final byte[] body;
    public final int googlePlayServicesStatusCode;
    public final PendingIntent recoveryAction;
    public final int statusCode;
    private final int versionCode;
    private final Bundle zzby;

    static {
        ProxyResponse.CREATOR = new zzb();
    }

    ProxyResponse(int v, int v1, PendingIntent pendingIntent0, int v2, Bundle bundle0, byte[] arr_b) {
        this.versionCode = v;
        this.googlePlayServicesStatusCode = v1;
        this.statusCode = v2;
        this.zzby = bundle0;
        this.body = arr_b;
        this.recoveryAction = pendingIntent0;
    }

    public ProxyResponse(int v, PendingIntent pendingIntent0, int v1, Bundle bundle0, byte[] arr_b) {
        this(1, v, pendingIntent0, v1, bundle0, arr_b);
    }

    private ProxyResponse(int v, Bundle bundle0, byte[] arr_b) {
        this(1, 0, null, v, bundle0, arr_b);
    }

    public ProxyResponse(int v, Map map0, byte[] arr_b) {
        this(v, ProxyResponse.zza(map0), arr_b);
    }

    public static ProxyResponse createErrorProxyResponse(int v, PendingIntent pendingIntent0, int v1, Map map0, byte[] arr_b) {
        return new ProxyResponse(1, v, pendingIntent0, v1, ProxyResponse.zza(map0), arr_b);
    }

    public Map getHeaders() {
        if(this.zzby == null) {
            return Collections.emptyMap();
        }
        Map map0 = new HashMap();
        for(Object object0: this.zzby.keySet()) {
            map0.put(((String)object0), this.zzby.getString(((String)object0)));
        }
        return map0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.googlePlayServicesStatusCode);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.recoveryAction, v, false);
        SafeParcelWriter.writeInt(parcel0, 3, this.statusCode);
        SafeParcelWriter.writeBundle(parcel0, 4, this.zzby, false);
        SafeParcelWriter.writeByteArray(parcel0, 5, this.body, false);
        SafeParcelWriter.writeInt(parcel0, 1000, this.versionCode);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    private static Bundle zza(Map map0) {
        Bundle bundle0 = new Bundle();
        if(map0 == null) {
            return bundle0;
        }
        for(Object object0: map0.entrySet()) {
            bundle0.putString(((String)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
        }
        return bundle0;
    }
}

