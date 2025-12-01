package com.google.android.gms.games.achievement;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzb;

public final class AchievementEntity extends zzb implements Achievement {
    public static final Parcelable.Creator CREATOR;
    private final String description;
    private final String name;
    private final int state;
    private final int type;
    private final String zzck;
    private final Uri zzcl;
    private final String zzcm;
    private final Uri zzcn;
    private final String zzco;
    private final int zzcp;
    private final String zzcq;
    private final PlayerEntity zzcr;
    private final int zzcs;
    private final String zzct;
    private final long zzcu;
    private final long zzcv;
    private final float zzcw;
    private final String zzh;

    static {
        AchievementEntity.CREATOR = new zza();
    }

    public AchievementEntity(Achievement achievement0) {
        String s = achievement0.getAchievementId();
        this.zzck = s;
        this.type = achievement0.getType();
        this.name = achievement0.getName();
        String s1 = achievement0.getDescription();
        this.description = s1;
        this.zzcl = achievement0.getUnlockedImageUri();
        this.zzcm = achievement0.getUnlockedImageUrl();
        this.zzcn = achievement0.getRevealedImageUri();
        this.zzco = achievement0.getRevealedImageUrl();
        this.zzcr = achievement0.zzad() == null ? null : ((PlayerEntity)achievement0.zzad().freeze());
        this.state = achievement0.getState();
        this.zzcu = achievement0.getLastUpdatedTimestamp();
        this.zzcv = achievement0.getXpValue();
        this.zzcw = achievement0.zzae();
        this.zzh = achievement0.getApplicationId();
        if(achievement0.getType() == 1) {
            this.zzcp = achievement0.getTotalSteps();
            this.zzcq = achievement0.getFormattedTotalSteps();
            this.zzcs = achievement0.getCurrentSteps();
            this.zzct = achievement0.getFormattedCurrentSteps();
        }
        else {
            this.zzcp = 0;
            this.zzcq = null;
            this.zzcs = 0;
            this.zzct = null;
        }
        Asserts.checkNotNull(s);
        Asserts.checkNotNull(s1);
    }

    AchievementEntity(String s, int v, String s1, String s2, Uri uri0, String s3, Uri uri1, String s4, int v1, String s5, PlayerEntity playerEntity0, int v2, int v3, String s6, long v4, long v5, float f, String s7) {
        this.zzck = s;
        this.type = v;
        this.name = s1;
        this.description = s2;
        this.zzcl = uri0;
        this.zzcm = s3;
        this.zzcn = uri1;
        this.zzco = s4;
        this.zzcp = v1;
        this.zzcq = s5;
        this.zzcr = playerEntity0;
        this.state = v2;
        this.zzcs = v3;
        this.zzct = s6;
        this.zzcu = v4;
        this.zzcv = v5;
        this.zzcw = f;
        this.zzh = s7;
    }

    @Override
    public final boolean equals(Object object0) {
        return AchievementEntity.zza(this, object0);
    }

    public final Achievement freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getAchievementId() {
        return this.zzck;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getApplicationId() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final int getCurrentSteps() {
        Asserts.checkState(this.getType() == 1);
        return this.zzcs;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getDescription() {
        return this.description;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final void getDescription(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.description, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getFormattedCurrentSteps() {
        Asserts.checkState(this.getType() == 1);
        return this.zzct;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedCurrentSteps(CharArrayBuffer charArrayBuffer0) {
        Asserts.checkState(this.getType() == 1);
        DataUtils.copyStringToBuffer(this.zzct, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getFormattedTotalSteps() {
        Asserts.checkState(this.getType() == 1);
        return this.zzcq;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final void getFormattedTotalSteps(CharArrayBuffer charArrayBuffer0) {
        Asserts.checkState(this.getType() == 1);
        DataUtils.copyStringToBuffer(this.zzcq, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final long getLastUpdatedTimestamp() {
        return this.zzcu;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getName() {
        return this.name;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final void getName(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.name, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final Player getPlayer() {
        return (Player)Preconditions.checkNotNull(this.zzcr);
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final Uri getRevealedImageUri() {
        return this.zzcn;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getRevealedImageUrl() {
        return this.zzco;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final int getState() {
        return this.state;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final int getTotalSteps() {
        Asserts.checkState(this.getType() == 1);
        return this.zzcp;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final int getType() {
        return this.type;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final Uri getUnlockedImageUri() {
        return this.zzcl;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final String getUnlockedImageUrl() {
        return this.zzcm;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final long getXpValue() {
        return this.zzcv;
    }

    @Override
    public final int hashCode() {
        return AchievementEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return AchievementEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getAchievementId(), false);
        SafeParcelWriter.writeInt(parcel0, 2, this.getType());
        SafeParcelWriter.writeString(parcel0, 3, this.getName(), false);
        SafeParcelWriter.writeString(parcel0, 4, this.getDescription(), false);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.getUnlockedImageUri(), v, false);
        SafeParcelWriter.writeString(parcel0, 6, this.getUnlockedImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel0, 7, this.getRevealedImageUri(), v, false);
        SafeParcelWriter.writeString(parcel0, 8, this.getRevealedImageUrl(), false);
        SafeParcelWriter.writeInt(parcel0, 9, this.zzcp);
        SafeParcelWriter.writeString(parcel0, 10, this.zzcq, false);
        SafeParcelWriter.writeParcelable(parcel0, 11, this.zzcr, v, false);
        SafeParcelWriter.writeInt(parcel0, 12, this.getState());
        SafeParcelWriter.writeInt(parcel0, 13, this.zzcs);
        SafeParcelWriter.writeString(parcel0, 14, this.zzct, false);
        SafeParcelWriter.writeLong(parcel0, 15, this.getLastUpdatedTimestamp());
        SafeParcelWriter.writeLong(parcel0, 16, this.getXpValue());
        SafeParcelWriter.writeFloat(parcel0, 17, this.zzcw);
        SafeParcelWriter.writeString(parcel0, 18, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    static int zza(Achievement achievement0) {
        if(achievement0.getType() == 1) {
            int v = achievement0.getCurrentSteps();
            int v1 = achievement0.getTotalSteps();
            return Objects.hashCode(new Object[]{achievement0.getAchievementId(), achievement0.getApplicationId(), achievement0.getName(), achievement0.getType(), achievement0.getDescription(), achievement0.getXpValue(), achievement0.getState(), achievement0.getLastUpdatedTimestamp(), achievement0.zzad(), v, v1});
        }
        return Objects.hashCode(new Object[]{achievement0.getAchievementId(), achievement0.getApplicationId(), achievement0.getName(), achievement0.getType(), achievement0.getDescription(), achievement0.getXpValue(), achievement0.getState(), achievement0.getLastUpdatedTimestamp(), achievement0.zzad(), 0, 0});
    }

    static boolean zza(Achievement achievement0, Object object0) {
        if(!(object0 instanceof Achievement)) {
            return false;
        }
        if(achievement0 == object0) {
            return true;
        }
        if(((Achievement)object0).getType() != achievement0.getType()) {
            return false;
        }
        if(achievement0.getType() == 1) {
            if(((Achievement)object0).getCurrentSteps() != achievement0.getCurrentSteps()) {
                return false;
            }
            return ((Achievement)object0).getTotalSteps() == achievement0.getTotalSteps() ? ((Achievement)object0).getXpValue() == achievement0.getXpValue() && ((Achievement)object0).getState() == achievement0.getState() && ((Achievement)object0).getLastUpdatedTimestamp() == achievement0.getLastUpdatedTimestamp() && Objects.equal(((Achievement)object0).getAchievementId(), achievement0.getAchievementId()) && Objects.equal(((Achievement)object0).getApplicationId(), achievement0.getApplicationId()) && Objects.equal(((Achievement)object0).getName(), achievement0.getName()) && Objects.equal(((Achievement)object0).getDescription(), achievement0.getDescription()) && Objects.equal(((Achievement)object0).zzad(), achievement0.zzad()) && ((Achievement)object0).zzae() == achievement0.zzae() : false;
        }
        return ((Achievement)object0).getXpValue() == achievement0.getXpValue() && ((Achievement)object0).getState() == achievement0.getState() && ((Achievement)object0).getLastUpdatedTimestamp() == achievement0.getLastUpdatedTimestamp() && Objects.equal(((Achievement)object0).getAchievementId(), achievement0.getAchievementId()) && Objects.equal(((Achievement)object0).getApplicationId(), achievement0.getApplicationId()) && Objects.equal(((Achievement)object0).getName(), achievement0.getName()) && Objects.equal(((Achievement)object0).getDescription(), achievement0.getDescription()) && Objects.equal(((Achievement)object0).zzad(), achievement0.zzad()) && ((Achievement)object0).zzae() == achievement0.zzae();
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final Player zzad() {
        return this.zzcr;
    }

    @Override  // com.google.android.gms.games.achievement.Achievement
    public final float zzae() {
        return this.zzcw;
    }

    static String zzb(Achievement achievement0) {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(achievement0).add("Id", achievement0.getAchievementId()).add("Game Id", achievement0.getApplicationId()).add("Type", achievement0.getType()).add("Name", achievement0.getName()).add("Description", achievement0.getDescription()).add("Player", achievement0.zzad()).add("State", achievement0.getState()).add("Rarity Percent", achievement0.zzae());
        if(achievement0.getType() == 1) {
            objects$ToStringHelper0.add("CurrentSteps", achievement0.getCurrentSteps());
            objects$ToStringHelper0.add("TotalSteps", achievement0.getTotalSteps());
        }
        return objects$ToStringHelper0.toString();
    }
}

