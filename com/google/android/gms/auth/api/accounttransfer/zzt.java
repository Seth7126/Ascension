package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.collection.ArraySet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zzt extends zzaz {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzaz;
    private final Set zzba;
    private String zzbn;
    private int zzbo;
    private byte[] zzbp;
    private PendingIntent zzbq;
    private DeviceMetaData zzbr;
    private final int zzv;

    static {
        zzt.CREATOR = new zzu();
        HashMap hashMap0 = new HashMap();
        zzt.zzaz = hashMap0;
        hashMap0.put("accountType", Field.forString("accountType", 2));
        hashMap0.put("status", Field.forInteger("status", 3));
        hashMap0.put("transferBytes", Field.forBase64("transferBytes", 4));
    }

    public zzt() {
        this.zzba = new ArraySet(3);
        this.zzv = 1;
    }

    zzt(Set set0, int v, String s, int v1, byte[] arr_b, PendingIntent pendingIntent0, DeviceMetaData deviceMetaData0) {
        this.zzba = set0;
        this.zzv = v;
        this.zzbn = s;
        this.zzbo = v1;
        this.zzbp = arr_b;
        this.zzbq = pendingIntent0;
        this.zzbr = deviceMetaData0;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Map getFieldMappings() {
        return zzt.zzaz;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected Object getFieldValue(Field fastJsonResponse$Field0) {
        switch(fastJsonResponse$Field0.getSafeParcelableFieldId()) {
            case 1: {
                return this.zzv;
            }
            case 2: {
                return this.zzbn;
            }
            case 3: {
                return this.zzbo;
            }
            case 4: {
                return this.zzbp;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field0.getSafeParcelableFieldId());
            }
        }
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean isFieldSet(Field fastJsonResponse$Field0) {
        return this.zzba.contains(fastJsonResponse$Field0.getSafeParcelableFieldId());
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setDecodedBytesInternal(Field fastJsonResponse$Field0, String s, byte[] arr_b) {
        int v = fastJsonResponse$Field0.getSafeParcelableFieldId();
        if(v != 4) {
            throw new IllegalArgumentException("Field with id=" + v + " is not known to be an byte array.");
        }
        this.zzbp = arr_b;
        this.zzba.add(4);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setIntegerInternal(Field fastJsonResponse$Field0, String s, int v) {
        int v1 = fastJsonResponse$Field0.getSafeParcelableFieldId();
        if(v1 != 3) {
            throw new IllegalArgumentException("Field with id=" + v1 + " is not known to be an int.");
        }
        this.zzbo = v;
        this.zzba.add(3);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringInternal(Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.getSafeParcelableFieldId();
        if(v != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
        }
        this.zzbn = s1;
        this.zzba.add(2);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        Set set0 = this.zzba;
        if(set0.contains(1)) {
            SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        }
        if(set0.contains(2)) {
            SafeParcelWriter.writeString(parcel0, 2, this.zzbn, true);
        }
        if(set0.contains(3)) {
            SafeParcelWriter.writeInt(parcel0, 3, this.zzbo);
        }
        if(set0.contains(4)) {
            SafeParcelWriter.writeByteArray(parcel0, 4, this.zzbp, true);
        }
        if(set0.contains(5)) {
            SafeParcelWriter.writeParcelable(parcel0, 5, this.zzbq, v, true);
        }
        if(set0.contains(6)) {
            SafeParcelWriter.writeParcelable(parcel0, 6, this.zzbr, v, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

