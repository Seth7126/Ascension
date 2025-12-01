package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR;
    private final List zzaa;
    private final String zzab;
    private final int zzv;
    private final String zzw;
    private final Long zzx;
    private final boolean zzy;
    private final boolean zzz;

    static {
        TokenData.CREATOR = new zzk();
    }

    TokenData(int v, String s, Long long0, boolean z, boolean z1, List list0, String s1) {
        this.zzv = v;
        this.zzw = Preconditions.checkNotEmpty(s);
        this.zzx = long0;
        this.zzy = z;
        this.zzz = z1;
        this.zzaa = list0;
        this.zzab = s1;
    }

    // 去混淆评级： 中等(50)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof TokenData ? TextUtils.equals(this.zzw, ((TokenData)object0).zzw) && Objects.equal(this.zzx, ((TokenData)object0).zzx) && this.zzy == ((TokenData)object0).zzy && this.zzz == ((TokenData)object0).zzz && Objects.equal(this.zzaa, ((TokenData)object0).zzaa) && Objects.equal(this.zzab, ((TokenData)object0).zzab) : false;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zzw, this.zzx, Boolean.valueOf(this.zzy), Boolean.valueOf(this.zzz), this.zzaa, this.zzab});
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zzv);
        SafeParcelWriter.writeString(parcel0, 2, this.zzw, false);
        SafeParcelWriter.writeLongObject(parcel0, 3, this.zzx, false);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.zzy);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zzz);
        SafeParcelWriter.writeStringList(parcel0, 6, this.zzaa, false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzab, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    public static TokenData zza(Bundle bundle0, String s) {
        Class class0 = TokenData.class;
        bundle0.setClassLoader(class0.getClassLoader());
        Bundle bundle1 = bundle0.getBundle(s);
        if(bundle1 == null) {
            return null;
        }
        bundle1.setClassLoader(class0.getClassLoader());
        return (TokenData)bundle1.getParcelable("TokenData");
    }

    public final String zzb() {
        return this.zzw;
    }
}

