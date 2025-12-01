package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzr extends zzaz {
    public static final Parcelable.Creator CREATOR;
    private String mPackageName;
    private static final HashMap zzaz;
    private final Set zzba;
    private zzt zzbk;
    private String zzbl;
    private String zzbm;
    private final int zzv;

    static {
        zzr.CREATOR = new zzs();
        HashMap hashMap0 = new HashMap();
        zzr.zzaz = hashMap0;
        hashMap0.put("authenticatorInfo", Field.forConcreteType("authenticatorInfo", 2, zzt.class));
        hashMap0.put("signature", Field.forString("signature", 3));
        hashMap0.put("package", Field.forString("package", 4));
    }

    public zzr() {
        this.zzba = new HashSet(3);
        this.zzv = 1;
    }

    zzr(Set set0, int v, zzt zzt0, String s, String s1, String s2) {
        this.zzba = set0;
        this.zzv = v;
        this.zzbk = zzt0;
        this.zzbl = s;
        this.mPackageName = s1;
        this.zzbm = s2;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public void addConcreteTypeInternal(Field fastJsonResponse$Field0, String s, FastJsonResponse fastJsonResponse0) {
        int v = fastJsonResponse$Field0.getSafeParcelableFieldId();
        if(v != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", v, fastJsonResponse0.getClass().getCanonicalName()));
        }
        this.zzbk = (zzt)fastJsonResponse0;
        this.zzba.add(2);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Map getFieldMappings() {
        return zzr.zzaz;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected Object getFieldValue(Field fastJsonResponse$Field0) {
        switch(fastJsonResponse$Field0.getSafeParcelableFieldId()) {
            case 1: {
                return this.zzv;
            }
            case 2: {
                return this.zzbk;
            }
            case 3: {
                return this.zzbl;
            }
            case 4: {
                return this.mPackageName;
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
    protected void setStringInternal(Field fastJsonResponse$Field0, String s, String s1) {
        int v = fastJsonResponse$Field0.getSafeParcelableFieldId();
        switch(v) {
            case 3: {
                this.zzbl = s1;
                break;
            }
            case 4: {
                this.mPackageName = s1;
                break;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", v));
            }
        }
        this.zzba.add(v);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        Set set0 = this.zzba;
        if(set0.contains(1)) {
            SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        }
        if(set0.contains(2)) {
            SafeParcelWriter.writeParcelable(parcel0, 2, this.zzbk, v, true);
        }
        if(set0.contains(3)) {
            SafeParcelWriter.writeString(parcel0, 3, this.zzbl, true);
        }
        if(set0.contains(4)) {
            SafeParcelWriter.writeString(parcel0, 4, this.mPackageName, true);
        }
        if(set0.contains(5)) {
            SafeParcelWriter.writeString(parcel0, 5, this.zzbm, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

