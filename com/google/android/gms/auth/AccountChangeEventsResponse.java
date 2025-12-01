package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zze;
    private final List zzl;

    static {
        AccountChangeEventsResponse.CREATOR = new zzc();
    }

    AccountChangeEventsResponse(int v, List list0) {
        this.zze = v;
        this.zzl = (List)Preconditions.checkNotNull(list0);
    }

    public AccountChangeEventsResponse(List list0) {
        this.zze = 1;
        this.zzl = (List)Preconditions.checkNotNull(list0);
    }

    public List getEvents() {
        return this.zzl;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zze);
        SafeParcelWriter.writeTypedList(parcel0, 2, this.zzl, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

