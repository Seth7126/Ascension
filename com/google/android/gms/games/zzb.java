package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.zzd;

public final class zzb extends zzh implements CurrentPlayerInfo {
    private final zzd zzg;

    public zzb(DataHolder dataHolder0, int v, zzd zzd0) {
        super(dataHolder0, v);
        this.zzg = zzd0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object object0) {
        return zza.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return new zza(this);
    }

    @Override  // com.google.android.gms.games.CurrentPlayerInfo
    public final int getFriendsListVisibilityStatus() {
        return this.zza(this.zzg.zzjk, 0);
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return zza.zza(this);
    }

    @Override
    public final String toString() {
        return zza.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        new zza(this).writeToParcel(parcel0, v);
    }

    // 去混淆评级： 低(20)
    public final boolean zzb() {
        return this.hasColumn(this.zzg.zzjk) && !this.hasNull(this.zzg.zzjk);
    }
}

