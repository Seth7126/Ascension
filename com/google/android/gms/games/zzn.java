package com.google.android.gms.games;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.zzd;

public final class zzn extends zzh implements PlayerRelationshipInfo {
    private final zzd zzg;

    public zzn(DataHolder dataHolder0, int v, zzd zzd0) {
        super(dataHolder0, v);
        this.zzg = zzd0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object object0) {
        return zzm.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return new zzm(this);
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return this.zza(this.zzg.zzjg, -1);
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return zzm.zza(this);
    }

    @Override
    public final String toString() {
        return zzm.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        new zzm(this).writeToParcel(parcel0, v);
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzq() {
        return this.zza(this.zzg.zzjh, null);
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzr() {
        return this.zza(this.zzg.zzji, null);
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzs() {
        return this.zza(this.zzg.zzce, null);
    }
}

