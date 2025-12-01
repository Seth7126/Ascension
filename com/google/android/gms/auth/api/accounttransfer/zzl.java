package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzl extends zzaz {
    public static final Parcelable.Creator CREATOR;
    private static final HashMap zzaz;
    private final Set zzba;
    private ArrayList zzbb;
    private int zzbc;
    private zzo zzbd;
    private final int zzv;

    static {
        zzl.CREATOR = new zzm();
        HashMap hashMap0 = new HashMap();
        zzl.zzaz = hashMap0;
        hashMap0.put("authenticatorData", Field.forConcreteTypeArray("authenticatorData", 2, zzr.class));
        hashMap0.put("progress", Field.forConcreteType("progress", 4, zzo.class));
    }

    public zzl() {
        this.zzba = new HashSet(1);
        this.zzv = 1;
    }

    zzl(Set set0, int v, ArrayList arrayList0, int v1, zzo zzo0) {
        this.zzba = set0;
        this.zzv = v;
        this.zzbb = arrayList0;
        this.zzbc = v1;
        this.zzbd = zzo0;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeArrayInternal(Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.getSafeParcelableFieldId();
        if(v != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known ConcreteTypeArray type. Found %s", v, arrayList0.getClass().getCanonicalName()));
        }
        this.zzbb = arrayList0;
        this.zzba.add(2);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final void addConcreteTypeInternal(Field fastJsonResponse$Field0, String s, FastJsonResponse fastJsonResponse0) {
        int v = fastJsonResponse$Field0.getSafeParcelableFieldId();
        if(v != 4) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", v, fastJsonResponse0.getClass().getCanonicalName()));
        }
        this.zzbd = (zzo)fastJsonResponse0;
        this.zzba.add(4);
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public final Map getFieldMappings() {
        return zzl.zzaz;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected final Object getFieldValue(Field fastJsonResponse$Field0) {
        switch(fastJsonResponse$Field0.getSafeParcelableFieldId()) {
            case 1: {
                return this.zzv;
            }
            case 2: {
                return this.zzbb;
            }
            case 4: {
                return this.zzbd;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field0.getSafeParcelableFieldId());
            }
        }
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected final boolean isFieldSet(Field fastJsonResponse$Field0) {
        return this.zzba.contains(fastJsonResponse$Field0.getSafeParcelableFieldId());
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        Set set0 = this.zzba;
        if(set0.contains(1)) {
            SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        }
        if(set0.contains(2)) {
            SafeParcelWriter.writeTypedList(parcel0, 2, this.zzbb, true);
        }
        if(set0.contains(3)) {
            SafeParcelWriter.writeInt(parcel0, 3, this.zzbc);
        }
        if(set0.contains(4)) {
            SafeParcelWriter.writeParcelable(parcel0, 4, this.zzbd, v, true);
        }
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

