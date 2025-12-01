package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameEntity extends GamesDowngradeableSafeParcel implements Game {
    static final class zza extends zzd {
        @Override  // com.google.android.gms.games.zzd
        public final Object createFromParcel(Parcel parcel0) {
            return this.zzb(parcel0);
        }

        @Override  // com.google.android.gms.games.zzd
        public final GameEntity zzb(Parcel parcel0) {
            if(!GameEntity.zzb(GameEntity.getUnparcelClientVersion()) && !GameEntity.canUnparcelSafely(GameEntity.class.getCanonicalName())) {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                String s6 = parcel0.readString();
                Uri uri0 = s6 == null ? null : Uri.parse(s6);
                String s7 = parcel0.readString();
                Uri uri1 = s7 == null ? null : Uri.parse(s7);
                String s8 = parcel0.readString();
                Uri uri2 = s8 == null ? null : Uri.parse(s8);
                boolean z = parcel0.readInt() > 0;
                return parcel0.readInt() <= 0 ? new GameEntity(s, s1, s2, s3, s4, s5, uri0, uri1, uri2, z, false, parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), false, false, null, null, null, false, false, false, null, false) : new GameEntity(s, s1, s2, s3, s4, s5, uri0, uri1, uri2, z, true, parcel0.readString(), parcel0.readInt(), parcel0.readInt(), parcel0.readInt(), false, false, null, null, null, false, false, false, null, false);
            }
            return super.zzb(parcel0);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final String description;
    private final boolean zzaa;
    private final boolean zzab;
    private final boolean zzac;
    private final String zzad;
    private final boolean zzae;
    private final String zzh;
    private final String zzi;
    private final String zzj;
    private final String zzk;
    private final String zzl;
    private final Uri zzm;
    private final Uri zzn;
    private final Uri zzo;
    private final boolean zzp;
    private final boolean zzq;
    private final String zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final String zzx;
    private final String zzy;
    private final String zzz;

    static {
        GameEntity.CREATOR = new zza();
    }

    public GameEntity(Game game0) {
        this.zzh = game0.getApplicationId();
        this.zzj = game0.getPrimaryCategory();
        this.zzk = game0.getSecondaryCategory();
        this.description = game0.getDescription();
        this.zzl = game0.getDeveloperName();
        this.zzi = game0.getDisplayName();
        this.zzm = game0.getIconImageUri();
        this.zzx = game0.getIconImageUrl();
        this.zzn = game0.getHiResImageUri();
        this.zzy = game0.getHiResImageUrl();
        this.zzo = game0.getFeaturedImageUri();
        this.zzz = game0.getFeaturedImageUrl();
        this.zzp = game0.zzc();
        this.zzq = game0.zze();
        this.zzr = game0.zzf();
        this.zzs = 1;
        this.zzt = game0.getAchievementTotalCount();
        this.zzu = game0.getLeaderboardCount();
        this.zzv = game0.zzg();
        this.zzw = game0.zzh();
        this.zzaa = game0.isMuted();
        this.zzab = game0.zzd();
        this.zzac = game0.areSnapshotsEnabled();
        this.zzad = game0.getThemeColor();
        this.zzae = game0.hasGamepadSupport();
    }

    GameEntity(String s, String s1, String s2, String s3, String s4, String s5, Uri uri0, Uri uri1, Uri uri2, boolean z, boolean z1, String s6, int v, int v1, int v2, boolean z2, boolean z3, String s7, String s8, String s9, boolean z4, boolean z5, boolean z6, String s10, boolean z7) {
        this.zzh = s;
        this.zzi = s1;
        this.zzj = s2;
        this.zzk = s3;
        this.description = s4;
        this.zzl = s5;
        this.zzm = uri0;
        this.zzx = s7;
        this.zzn = uri1;
        this.zzy = s8;
        this.zzo = uri2;
        this.zzz = s9;
        this.zzp = z;
        this.zzq = z1;
        this.zzr = s6;
        this.zzs = v;
        this.zzt = v1;
        this.zzu = v2;
        this.zzv = z2;
        this.zzw = z3;
        this.zzaa = z4;
        this.zzab = z5;
        this.zzac = z6;
        this.zzad = s10;
        this.zzae = z7;
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean areSnapshotsEnabled() {
        return this.zzac;
    }

    @Override
    public final boolean equals(Object object0) {
        return GameEntity.zza(this, object0);
    }

    public final Game freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.Game
    public final int getAchievementTotalCount() {
        return this.zzt;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getApplicationId() {
        return this.zzh;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getDescription() {
        return this.description;
    }

    @Override  // com.google.android.gms.games.Game
    public final void getDescription(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.description, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.Game
    public final String getDeveloperName() {
        return this.zzl;
    }

    @Override  // com.google.android.gms.games.Game
    public final void getDeveloperName(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzl, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.Game
    public final String getDisplayName() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.games.Game
    public final void getDisplayName(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzi, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.Game
    public final Uri getFeaturedImageUri() {
        return this.zzo;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getFeaturedImageUrl() {
        return this.zzz;
    }

    @Override  // com.google.android.gms.games.Game
    public final Uri getHiResImageUri() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getHiResImageUrl() {
        return this.zzy;
    }

    @Override  // com.google.android.gms.games.Game
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override  // com.google.android.gms.games.Game
    public final int getLeaderboardCount() {
        return this.zzu;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getPrimaryCategory() {
        return this.zzj;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getSecondaryCategory() {
        return this.zzk;
    }

    @Override  // com.google.android.gms.games.Game
    public final String getThemeColor() {
        return this.zzad;
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean hasGamepadSupport() {
        return this.zzae;
    }

    @Override
    public final int hashCode() {
        return GameEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean isMuted() {
        return this.zzaa;
    }

    @Override
    public final String toString() {
        return GameEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        if(!this.shouldDowngrade()) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 1, this.getApplicationId(), false);
            SafeParcelWriter.writeString(parcel0, 2, this.getDisplayName(), false);
            SafeParcelWriter.writeString(parcel0, 3, this.getPrimaryCategory(), false);
            SafeParcelWriter.writeString(parcel0, 4, this.getSecondaryCategory(), false);
            SafeParcelWriter.writeString(parcel0, 5, this.getDescription(), false);
            SafeParcelWriter.writeString(parcel0, 6, this.getDeveloperName(), false);
            SafeParcelWriter.writeParcelable(parcel0, 7, this.getIconImageUri(), v, false);
            SafeParcelWriter.writeParcelable(parcel0, 8, this.getHiResImageUri(), v, false);
            SafeParcelWriter.writeParcelable(parcel0, 9, this.getFeaturedImageUri(), v, false);
            SafeParcelWriter.writeBoolean(parcel0, 10, this.zzp);
            SafeParcelWriter.writeBoolean(parcel0, 11, this.zzq);
            SafeParcelWriter.writeString(parcel0, 12, this.zzr, false);
            SafeParcelWriter.writeInt(parcel0, 13, this.zzs);
            SafeParcelWriter.writeInt(parcel0, 14, this.getAchievementTotalCount());
            SafeParcelWriter.writeInt(parcel0, 15, this.getLeaderboardCount());
            SafeParcelWriter.writeBoolean(parcel0, 16, this.zzv);
            SafeParcelWriter.writeBoolean(parcel0, 17, this.zzw);
            SafeParcelWriter.writeString(parcel0, 18, this.getIconImageUrl(), false);
            SafeParcelWriter.writeString(parcel0, 19, this.getHiResImageUrl(), false);
            SafeParcelWriter.writeString(parcel0, 20, this.getFeaturedImageUrl(), false);
            SafeParcelWriter.writeBoolean(parcel0, 21, this.zzaa);
            SafeParcelWriter.writeBoolean(parcel0, 22, this.zzab);
            SafeParcelWriter.writeBoolean(parcel0, 23, this.areSnapshotsEnabled());
            SafeParcelWriter.writeString(parcel0, 24, this.getThemeColor(), false);
            SafeParcelWriter.writeBoolean(parcel0, 25, this.hasGamepadSupport());
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
            return;
        }
        parcel0.writeString(this.zzh);
        parcel0.writeString(this.zzi);
        parcel0.writeString(this.zzj);
        parcel0.writeString(this.zzk);
        parcel0.writeString(this.description);
        parcel0.writeString(this.zzl);
        String s = null;
        parcel0.writeString((this.zzm == null ? null : this.zzm.toString()));
        parcel0.writeString((this.zzn == null ? null : this.zzn.toString()));
        Uri uri0 = this.zzo;
        if(uri0 != null) {
            s = uri0.toString();
        }
        parcel0.writeString(s);
        parcel0.writeInt(((int)this.zzp));
        parcel0.writeInt(((int)this.zzq));
        parcel0.writeString(this.zzr);
        parcel0.writeInt(this.zzs);
        parcel0.writeInt(this.zzt);
        parcel0.writeInt(this.zzu);
    }

    static int zza(Game game0) {
        return Objects.hashCode(new Object[]{game0.getApplicationId(), game0.getDisplayName(), game0.getPrimaryCategory(), game0.getSecondaryCategory(), game0.getDescription(), game0.getDeveloperName(), game0.getIconImageUri(), game0.getHiResImageUri(), game0.getFeaturedImageUri(), Boolean.valueOf(game0.zzc()), Boolean.valueOf(game0.zze()), game0.zzf(), game0.getAchievementTotalCount(), game0.getLeaderboardCount(), Boolean.valueOf(game0.zzg()), Boolean.valueOf(game0.zzh()), Boolean.valueOf(game0.isMuted()), Boolean.valueOf(game0.zzd()), Boolean.valueOf(game0.areSnapshotsEnabled()), game0.getThemeColor(), Boolean.valueOf(game0.hasGamepadSupport())});
    }

    // 去混淆评级： 低(36)
    static boolean zza(Game game0, Object object0) {
        if(!(object0 instanceof Game)) {
            return false;
        }
        if(game0 == object0) {
            return true;
        }
        Game game1 = (Game)object0;
        return Objects.equal(game1.getApplicationId(), game0.getApplicationId()) && Objects.equal(game1.getDisplayName(), game0.getDisplayName()) && Objects.equal(game1.getPrimaryCategory(), game0.getPrimaryCategory()) && Objects.equal(game1.getSecondaryCategory(), game0.getSecondaryCategory()) && Objects.equal(game1.getDescription(), game0.getDescription()) && Objects.equal(game1.getDeveloperName(), game0.getDeveloperName()) && Objects.equal(game1.getIconImageUri(), game0.getIconImageUri()) && Objects.equal(game1.getHiResImageUri(), game0.getHiResImageUri()) && Objects.equal(game1.getFeaturedImageUri(), game0.getFeaturedImageUri()) && Objects.equal(Boolean.valueOf(game1.zzc()), Boolean.valueOf(game0.zzc())) && Objects.equal(Boolean.valueOf(game1.zze()), Boolean.valueOf(game0.zze())) && Objects.equal(game1.zzf(), game0.zzf()) && Objects.equal(game1.getAchievementTotalCount(), game0.getAchievementTotalCount()) && Objects.equal(game1.getLeaderboardCount(), game0.getLeaderboardCount()) && Objects.equal(Boolean.valueOf(game1.zzg()), Boolean.valueOf(game0.zzg())) && Objects.equal(Boolean.valueOf(game1.zzh()), Boolean.valueOf(game0.zzh())) && Objects.equal(Boolean.valueOf(game1.isMuted()), Boolean.valueOf(game0.isMuted())) && Objects.equal(Boolean.valueOf(game1.zzd()), Boolean.valueOf(game0.zzd())) && Objects.equal(Boolean.valueOf(game1.areSnapshotsEnabled()), Boolean.valueOf(game0.areSnapshotsEnabled())) && Objects.equal(game1.getThemeColor(), game0.getThemeColor()) && Objects.equal(Boolean.valueOf(game1.hasGamepadSupport()), Boolean.valueOf(game0.hasGamepadSupport()));
    }

    static String zzb(Game game0) {
        return Objects.toStringHelper(game0).add("ApplicationId", game0.getApplicationId()).add("DisplayName", game0.getDisplayName()).add("PrimaryCategory", game0.getPrimaryCategory()).add("SecondaryCategory", game0.getSecondaryCategory()).add("Description", game0.getDescription()).add("DeveloperName", game0.getDeveloperName()).add("IconImageUri", game0.getIconImageUri()).add("IconImageUrl", game0.getIconImageUrl()).add("HiResImageUri", game0.getHiResImageUri()).add("HiResImageUrl", game0.getHiResImageUrl()).add("FeaturedImageUri", game0.getFeaturedImageUri()).add("FeaturedImageUrl", game0.getFeaturedImageUrl()).add("PlayEnabledGame", Boolean.valueOf(game0.zzc())).add("InstanceInstalled", Boolean.valueOf(game0.zze())).add("InstancePackageName", game0.zzf()).add("AchievementTotalCount", game0.getAchievementTotalCount()).add("LeaderboardCount", game0.getLeaderboardCount()).add("AreSnapshotsEnabled", Boolean.valueOf(game0.areSnapshotsEnabled())).add("ThemeColor", game0.getThemeColor()).add("HasGamepadSupport", Boolean.valueOf(game0.hasGamepadSupport())).toString();
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean zzc() {
        return this.zzp;
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean zzd() {
        return this.zzab;
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean zze() {
        return this.zzq;
    }

    @Override  // com.google.android.gms.games.Game
    public final String zzf() {
        return this.zzr;
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean zzg() {
        return this.zzv;
    }

    @Override  // com.google.android.gms.games.Game
    public final boolean zzh() {
        return this.zzw;
    }
}

