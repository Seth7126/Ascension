package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.zzb;

public final class ExperienceEventEntity extends zzb implements ExperienceEvent {
    public static final Parcelable.Creator CREATOR;
    private final int type;
    private final String zzhb;
    private final GameEntity zzhc;
    private final String zzhd;
    private final String zzhe;
    private final long zzhf;
    private final long zzhg;
    private final long zzhh;
    private final int zzhi;
    private final Uri zzm;
    private final String zzx;

    static {
        ExperienceEventEntity.CREATOR = new zza();
    }

    ExperienceEventEntity(String s, GameEntity gameEntity0, String s1, String s2, String s3, Uri uri0, long v, long v1, long v2, int v3, int v4) {
        this.zzhb = s;
        this.zzhc = gameEntity0;
        this.zzhd = s1;
        this.zzhe = s2;
        this.zzx = s3;
        this.zzm = uri0;
        this.zzhf = v;
        this.zzhg = v1;
        this.zzhh = v2;
        this.type = v3;
        this.zzhi = v4;
    }

    // 去混淆评级： 低(43)
    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof ExperienceEvent) {
            return this == object0 ? true : Objects.equal(((ExperienceEvent)object0).zzbq(), this.zzbq()) && Objects.equal(((ExperienceEvent)object0).getGame(), this.getGame()) && Objects.equal(((ExperienceEvent)object0).zzbr(), this.zzbr()) && Objects.equal(((ExperienceEvent)object0).zzbs(), this.zzbs()) && Objects.equal(((ExperienceEvent)object0).getIconImageUrl(), this.getIconImageUrl()) && Objects.equal(((ExperienceEvent)object0).getIconImageUri(), this.getIconImageUri()) && Objects.equal(((ExperienceEvent)object0).zzbt(), this.zzbt()) && Objects.equal(((ExperienceEvent)object0).zzbu(), this.zzbu()) && Objects.equal(((ExperienceEvent)object0).zzbv(), this.zzbv()) && Objects.equal(((ExperienceEvent)object0).getType(), this.getType()) && Objects.equal(((ExperienceEvent)object0).zzbw(), this.zzbw());
        }
        return false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Game getGame() {
        return this.zzhc;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int getType() {
        return this.type;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzbq(), this.getGame(), this.zzbr(), this.zzbs(), this.getIconImageUrl(), this.getIconImageUri(), this.zzbt(), this.zzbu(), this.zzbv(), this.getType(), this.zzbw()});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("ExperienceId", this.zzbq()).add("Game", this.getGame()).add("DisplayTitle", this.zzbr()).add("DisplayDescription", this.zzbs()).add("IconImageUrl", this.getIconImageUrl()).add("IconImageUri", this.getIconImageUri()).add("CreatedTimestamp", this.zzbt()).add("XpEarned", this.zzbu()).add("CurrentXp", this.zzbv()).add("Type", this.getType()).add("NewLevel", this.zzbw()).toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zzhb, false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zzhc, v, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzhd, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzhe, false);
        SafeParcelWriter.writeString(parcel0, 5, this.getIconImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.zzm, v, false);
        SafeParcelWriter.writeLong(parcel0, 7, this.zzhf);
        SafeParcelWriter.writeLong(parcel0, 8, this.zzhg);
        SafeParcelWriter.writeLong(parcel0, 9, this.zzhh);
        SafeParcelWriter.writeInt(parcel0, 10, this.type);
        SafeParcelWriter.writeInt(parcel0, 11, this.zzhi);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbq() {
        return this.zzhb;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbr() {
        return this.zzhd;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbs() {
        return this.zzhe;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbt() {
        return this.zzhf;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbu() {
        return this.zzhg;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbv() {
        return this.zzhh;
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzbw() {
        return this.zzhi;
    }
}

