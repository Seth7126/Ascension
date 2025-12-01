package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class PlayerLevel extends zzb {
    public static final Parcelable.Creator CREATOR;
    private final int zzbr;
    private final long zzbs;
    private final long zzbt;

    static {
        PlayerLevel.CREATOR = new zzj();
    }

    public PlayerLevel(int v, long v1, long v2) {
        boolean z = true;
        Preconditions.checkState(v1 >= 0L, "Min XP must be positive!");
        if(v2 <= v1) {
            z = false;
        }
        Preconditions.checkState(z, "Max XP must be more than min XP!");
        this.zzbr = v;
        this.zzbs = v1;
        this.zzbt = v2;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof PlayerLevel)) {
            return false;
        }
        return this == object0 ? true : Objects.equal(((PlayerLevel)object0).getLevelNumber(), this.getLevelNumber()) && Objects.equal(((PlayerLevel)object0).getMinXp(), this.getMinXp()) && Objects.equal(((PlayerLevel)object0).getMaxXp(), this.getMaxXp());
    }

    public final int getLevelNumber() {
        return this.zzbr;
    }

    public final long getMaxXp() {
        return this.zzbt;
    }

    public final long getMinXp() {
        return this.zzbs;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzbr, this.zzbs, this.zzbt});
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("LevelNumber", this.getLevelNumber()).add("MinXp", this.getMinXp()).add("MaxXp", this.getMaxXp()).toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getLevelNumber());
        SafeParcelWriter.writeLong(parcel0, 2, this.getMinXp());
        SafeParcelWriter.writeLong(parcel0, 3, this.getMaxXp());
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

