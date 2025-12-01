package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class PlayerLevelInfo extends zzb {
    public static final Parcelable.Creator CREATOR;
    private final long zzbu;
    private final long zzbv;
    private final PlayerLevel zzbw;
    private final PlayerLevel zzbx;

    static {
        PlayerLevelInfo.CREATOR = new zzk();
    }

    public PlayerLevelInfo(long v, long v1, PlayerLevel playerLevel0, PlayerLevel playerLevel1) {
        Preconditions.checkState(v != -1L);
        Preconditions.checkNotNull(playerLevel0);
        Preconditions.checkNotNull(playerLevel1);
        this.zzbu = v;
        this.zzbv = v1;
        this.zzbw = playerLevel0;
        this.zzbx = playerLevel1;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof PlayerLevelInfo)) {
            return false;
        }
        return object0 == this ? true : Objects.equal(this.zzbu, ((PlayerLevelInfo)object0).zzbu) && Objects.equal(this.zzbv, ((PlayerLevelInfo)object0).zzbv) && Objects.equal(this.zzbw, ((PlayerLevelInfo)object0).zzbw) && Objects.equal(this.zzbx, ((PlayerLevelInfo)object0).zzbx);
    }

    public final PlayerLevel getCurrentLevel() {
        return this.zzbw;
    }

    public final long getCurrentXpTotal() {
        return this.zzbu;
    }

    public final long getLastLevelUpTimestamp() {
        return this.zzbv;
    }

    public final PlayerLevel getNextLevel() {
        return this.zzbx;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzbu, this.zzbv, this.zzbw, this.zzbx});
    }

    public final boolean isMaxLevel() {
        return this.zzbw.equals(this.zzbx);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeLong(parcel0, 1, this.getCurrentXpTotal());
        SafeParcelWriter.writeLong(parcel0, 2, this.getLastLevelUpTimestamp());
        SafeParcelWriter.writeParcelable(parcel0, 3, this.getCurrentLevel(), v, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.getNextLevel(), v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

