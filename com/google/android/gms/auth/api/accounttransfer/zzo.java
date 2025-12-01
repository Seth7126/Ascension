package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class zzo extends zzaz {
    public static final Parcelable.Creator CREATOR;
    private static final ArrayMap zzbe;
    private List zzbf;
    private List zzbg;
    private List zzbh;
    private List zzbi;
    private List zzbj;
    private final int zzv;

    static {
        zzo.CREATOR = new zzp();
        ArrayMap arrayMap0 = new ArrayMap();
        zzo.zzbe = arrayMap0;
        arrayMap0.put("registered", Field.forStrings("registered", 2));
        arrayMap0.put("in_progress", Field.forStrings("in_progress", 3));
        arrayMap0.put("success", Field.forStrings("success", 4));
        arrayMap0.put("failed", Field.forStrings("failed", 5));
        arrayMap0.put("escrowed", Field.forStrings("escrowed", 6));
    }

    public zzo() {
        this.zzv = 1;
    }

    zzo(int v, List list0, List list1, List list2, List list3, List list4) {
        this.zzv = v;
        this.zzbf = list0;
        this.zzbg = list1;
        this.zzbh = list2;
        this.zzbi = list3;
        this.zzbj = list4;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    public Map getFieldMappings() {
        return zzo.zzbe;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected Object getFieldValue(Field fastJsonResponse$Field0) {
        switch(fastJsonResponse$Field0.getSafeParcelableFieldId()) {
            case 1: {
                return this.zzv;
            }
            case 2: {
                return this.zzbf;
            }
            case 3: {
                return this.zzbg;
            }
            case 4: {
                return this.zzbh;
            }
            case 5: {
                return this.zzbi;
            }
            case 6: {
                return this.zzbj;
            }
            default: {
                throw new IllegalStateException("Unknown SafeParcelable id=" + fastJsonResponse$Field0.getSafeParcelableFieldId());
            }
        }
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected boolean isFieldSet(Field fastJsonResponse$Field0) {
        return true;
    }

    @Override  // com.google.android.gms.common.server.response.FastJsonResponse
    protected void setStringsInternal(Field fastJsonResponse$Field0, String s, ArrayList arrayList0) {
        int v = fastJsonResponse$Field0.getSafeParcelableFieldId();
        switch(v) {
            case 2: {
                this.zzbf = arrayList0;
                return;
            }
            case 3: {
                this.zzbg = arrayList0;
                return;
            }
            case 4: {
                this.zzbh = arrayList0;
                return;
            }
            case 5: {
                this.zzbi = arrayList0;
                return;
            }
            case 6: {
                this.zzbj = arrayList0;
                return;
            }
            default: {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string list.", v));
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        SafeParcelWriter.writeStringList(parcel0, 2, this.zzbf, false);
        SafeParcelWriter.writeStringList(parcel0, 3, this.zzbg, false);
        SafeParcelWriter.writeStringList(parcel0, 4, this.zzbh, false);
        SafeParcelWriter.writeStringList(parcel0, 5, this.zzbi, false);
        SafeParcelWriter.writeStringList(parcel0, 6, this.zzbj, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

