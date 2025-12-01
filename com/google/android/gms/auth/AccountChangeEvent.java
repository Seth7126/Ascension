package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zze;
    private final long zzf;
    private final String zzg;
    private final int zzh;
    private final int zzi;
    private final String zzj;

    static {
        AccountChangeEvent.CREATOR = new zza();
    }

    AccountChangeEvent(int v, long v1, String s, int v2, int v3, String s1) {
        this.zze = v;
        this.zzf = v1;
        this.zzg = (String)Preconditions.checkNotNull(s);
        this.zzh = v2;
        this.zzi = v3;
        this.zzj = s1;
    }

    public AccountChangeEvent(long v, String s, int v1, int v2, String s1) {
        this.zze = 1;
        this.zzf = v;
        this.zzg = (String)Preconditions.checkNotNull(s);
        this.zzh = v1;
        this.zzi = v2;
        this.zzj = s1;
    }

    // 去混淆评级： 低(40)
    @Override
    public boolean equals(Object object0) {
        return object0 == this ? true : object0 instanceof AccountChangeEvent && this.zze == ((AccountChangeEvent)object0).zze && this.zzf == ((AccountChangeEvent)object0).zzf && Objects.equal(this.zzg, ((AccountChangeEvent)object0).zzg) && this.zzh == ((AccountChangeEvent)object0).zzh && this.zzi == ((AccountChangeEvent)object0).zzi && Objects.equal(this.zzj, ((AccountChangeEvent)object0).zzj);
    }

    public String getAccountName() {
        return this.zzg;
    }

    public String getChangeData() {
        return this.zzj;
    }

    public int getChangeType() {
        return this.zzh;
    }

    public int getEventIndex() {
        return this.zzi;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj});
    }

    @Override
    public String toString() {
        switch(this.zzh) {
            case 1: {
                return "AccountChangeEvent {accountName = " + this.zzg + ", changeType = " + "ADDED" + ", changeData = " + this.zzj + ", eventIndex = " + this.zzi + "}";
            }
            case 2: {
                return "AccountChangeEvent {accountName = " + this.zzg + ", changeType = " + "REMOVED" + ", changeData = " + this.zzj + ", eventIndex = " + this.zzi + "}";
            }
            case 3: {
                return "AccountChangeEvent {accountName = " + this.zzg + ", changeType = " + "RENAMED_FROM" + ", changeData = " + this.zzj + ", eventIndex = " + this.zzi + "}";
            }
            case 4: {
                return "AccountChangeEvent {accountName = " + this.zzg + ", changeType = " + "RENAMED_TO" + ", changeData = " + this.zzj + ", eventIndex = " + this.zzi + "}";
            }
            default: {
                return "AccountChangeEvent {accountName = " + this.zzg + ", changeType = " + "UNKNOWN" + ", changeData = " + this.zzj + ", eventIndex = " + this.zzi + "}";
            }
        }
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zze);
        SafeParcelWriter.writeLong(parcel0, 2, this.zzf);
        SafeParcelWriter.writeString(parcel0, 3, this.zzg, false);
        SafeParcelWriter.writeInt(parcel0, 4, this.zzh);
        SafeParcelWriter.writeInt(parcel0, 5, this.zzi);
        SafeParcelWriter.writeString(parcel0, 6, this.zzj, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

