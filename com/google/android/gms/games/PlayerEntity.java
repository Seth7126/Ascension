package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;
import com.google.android.gms.games.internal.player.MostRecentGameInfoEntity;

public final class PlayerEntity extends GamesDowngradeableSafeParcel implements Player {
    static final class zza extends zzi {
        @Override  // com.google.android.gms.games.zzi
        public final Object createFromParcel(Parcel parcel0) {
            return this.zzc(parcel0);
        }

        @Override  // com.google.android.gms.games.zzi
        public final PlayerEntity zzc(Parcel parcel0) {
            if(!PlayerEntity.zzb(PlayerEntity.getUnparcelClientVersion()) && !PlayerEntity.canUnparcelSafely(PlayerEntity.class.getCanonicalName())) {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                String s3 = parcel0.readString();
                long v = parcel0.readLong();
                String s4 = parcel0.readString();
                String s5 = parcel0.readString();
                Uri uri0 = s2 == null ? null : Uri.parse(s2);
                return s3 == null ? new PlayerEntity(s, s1, uri0, null, v, -1, -1L, null, null, null, null, null, true, false, s4, s5, null, null, null, null, -1L, null, null) : new PlayerEntity(s, s1, uri0, Uri.parse(s3), v, -1, -1L, null, null, null, null, null, true, false, s4, s5, null, null, null, null, -1L, null, null);
            }
            return super.zzc(parcel0);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private final String name;
    private String zzba;
    private final long zzbb;
    private final int zzbc;
    private final long zzbd;
    private final String zzbe;
    private final MostRecentGameInfoEntity zzbf;
    private final PlayerLevelInfo zzbg;
    private final boolean zzbh;
    private final boolean zzbi;
    private final String zzbj;
    private final Uri zzbk;
    private final String zzbl;
    private final Uri zzbm;
    private final String zzbn;
    private long zzbo;
    private final zzm zzbp;
    private final com.google.android.gms.games.zza zzbq;
    private String zzi;
    private final Uri zzm;
    private final Uri zzn;
    private final String zzx;
    private final String zzy;

    static {
        PlayerEntity.CREATOR = new zza();
    }

    public PlayerEntity(Player player0) {
        this.zzba = player0.getPlayerId();
        this.zzi = player0.getDisplayName();
        this.zzm = player0.getIconImageUri();
        this.zzx = player0.getIconImageUrl();
        this.zzn = player0.getHiResImageUri();
        this.zzy = player0.getHiResImageUrl();
        long v = player0.getRetrievedTimestamp();
        this.zzbb = v;
        this.zzbc = player0.zzm();
        this.zzbd = player0.getLastPlayedWithTimestamp();
        this.zzbe = player0.getTitle();
        this.zzbh = player0.zzn();
        com.google.android.gms.games.internal.player.zza zza0 = player0.zzo();
        com.google.android.gms.games.zza zza1 = null;
        this.zzbf = zza0 == null ? null : new MostRecentGameInfoEntity(zza0);
        this.zzbg = player0.getLevelInfo();
        this.zzbi = player0.zzl();
        this.zzbj = player0.zzk();
        this.name = player0.getName();
        this.zzbk = player0.getBannerImageLandscapeUri();
        this.zzbl = player0.getBannerImageLandscapeUrl();
        this.zzbm = player0.getBannerImagePortraitUri();
        this.zzbn = player0.getBannerImagePortraitUrl();
        this.zzbo = player0.zzp();
        PlayerRelationshipInfo playerRelationshipInfo0 = player0.getRelationshipInfo();
        this.zzbp = playerRelationshipInfo0 == null ? null : new zzm(((PlayerRelationshipInfo)playerRelationshipInfo0.freeze()));
        CurrentPlayerInfo currentPlayerInfo0 = player0.getCurrentPlayerInfo();
        if(currentPlayerInfo0 != null) {
            zza1 = (com.google.android.gms.games.zza)currentPlayerInfo0.freeze();
        }
        this.zzbq = zza1;
        Asserts.checkNotNull(this.zzba);
        Asserts.checkNotNull(this.zzi);
        Asserts.checkState(v > 0L);
    }

    PlayerEntity(String s, String s1, Uri uri0, Uri uri1, long v, int v1, long v2, String s2, String s3, String s4, MostRecentGameInfoEntity mostRecentGameInfoEntity0, PlayerLevelInfo playerLevelInfo0, boolean z, boolean z1, String s5, String s6, Uri uri2, String s7, Uri uri3, String s8, long v3, zzm zzm0, com.google.android.gms.games.zza zza0) {
        this.zzba = s;
        this.zzi = s1;
        this.zzm = uri0;
        this.zzx = s2;
        this.zzn = uri1;
        this.zzy = s3;
        this.zzbb = v;
        this.zzbc = v1;
        this.zzbd = v2;
        this.zzbe = s4;
        this.zzbh = z;
        this.zzbf = mostRecentGameInfoEntity0;
        this.zzbg = playerLevelInfo0;
        this.zzbi = z1;
        this.zzbj = s5;
        this.name = s6;
        this.zzbk = uri2;
        this.zzbl = s7;
        this.zzbm = uri3;
        this.zzbn = s8;
        this.zzbo = v3;
        this.zzbp = zzm0;
        this.zzbq = zza0;
    }

    @Override
    public final boolean equals(Object object0) {
        return PlayerEntity.zza(this, object0);
    }

    public final Player freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getBannerImageLandscapeUri() {
        return this.zzbk;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getBannerImageLandscapeUrl() {
        return this.zzbl;
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getBannerImagePortraitUri() {
        return this.zzbm;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getBannerImagePortraitUrl() {
        return this.zzbn;
    }

    @Override  // com.google.android.gms.games.Player
    public final CurrentPlayerInfo getCurrentPlayerInfo() {
        return this.zzbq;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getDisplayName() {
        return this.zzi;
    }

    @Override  // com.google.android.gms.games.Player
    public final void getDisplayName(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzi, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getHiResImageUri() {
        return this.zzn;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getHiResImageUrl() {
        return this.zzy;
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getIconImageUrl() {
        return this.zzx;
    }

    @Override  // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
        return this.zzbd;
    }

    @Override  // com.google.android.gms.games.Player
    public final PlayerLevelInfo getLevelInfo() {
        return this.zzbg;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getName() {
        return this.name;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getPlayerId() {
        return this.zzba;
    }

    @Override  // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo getRelationshipInfo() {
        return this.zzbp;
    }

    @Override  // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
        return this.zzbb;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getTitle() {
        return this.zzbe;
    }

    @Override  // com.google.android.gms.games.Player
    public final void getTitle(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.zzbe, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
        return this.getHiResImageUri() != null;
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean hasIconImage() {
        return this.getIconImageUri() != null;
    }

    @Override
    public final int hashCode() {
        return PlayerEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return PlayerEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        if(!this.shouldDowngrade()) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeString(parcel0, 1, this.getPlayerId(), false);
            SafeParcelWriter.writeString(parcel0, 2, this.getDisplayName(), false);
            SafeParcelWriter.writeParcelable(parcel0, 3, this.getIconImageUri(), v, false);
            SafeParcelWriter.writeParcelable(parcel0, 4, this.getHiResImageUri(), v, false);
            SafeParcelWriter.writeLong(parcel0, 5, this.getRetrievedTimestamp());
            SafeParcelWriter.writeInt(parcel0, 6, this.zzbc);
            SafeParcelWriter.writeLong(parcel0, 7, this.getLastPlayedWithTimestamp());
            SafeParcelWriter.writeString(parcel0, 8, this.getIconImageUrl(), false);
            SafeParcelWriter.writeString(parcel0, 9, this.getHiResImageUrl(), false);
            SafeParcelWriter.writeString(parcel0, 14, this.getTitle(), false);
            SafeParcelWriter.writeParcelable(parcel0, 15, this.zzbf, v, false);
            SafeParcelWriter.writeParcelable(parcel0, 16, this.getLevelInfo(), v, false);
            SafeParcelWriter.writeBoolean(parcel0, 18, this.zzbh);
            SafeParcelWriter.writeBoolean(parcel0, 19, this.zzbi);
            SafeParcelWriter.writeString(parcel0, 20, this.zzbj, false);
            SafeParcelWriter.writeString(parcel0, 21, this.name, false);
            SafeParcelWriter.writeParcelable(parcel0, 22, this.getBannerImageLandscapeUri(), v, false);
            SafeParcelWriter.writeString(parcel0, 23, this.getBannerImageLandscapeUrl(), false);
            SafeParcelWriter.writeParcelable(parcel0, 24, this.getBannerImagePortraitUri(), v, false);
            SafeParcelWriter.writeString(parcel0, 25, this.getBannerImagePortraitUrl(), false);
            SafeParcelWriter.writeLong(parcel0, 29, this.zzbo);
            SafeParcelWriter.writeParcelable(parcel0, 33, this.getRelationshipInfo(), v, false);
            SafeParcelWriter.writeParcelable(parcel0, 35, this.getCurrentPlayerInfo(), v, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
            return;
        }
        parcel0.writeString(this.zzba);
        parcel0.writeString(this.zzi);
        String s = null;
        parcel0.writeString((this.zzm == null ? null : this.zzm.toString()));
        Uri uri0 = this.zzn;
        if(uri0 != null) {
            s = uri0.toString();
        }
        parcel0.writeString(s);
        parcel0.writeLong(this.zzbb);
    }

    static int zza(Player player0) {
        return Objects.hashCode(new Object[]{player0.getPlayerId(), player0.getDisplayName(), Boolean.valueOf(player0.zzl()), player0.getIconImageUri(), player0.getHiResImageUri(), player0.getRetrievedTimestamp(), player0.getTitle(), player0.getLevelInfo(), player0.zzk(), player0.getName(), player0.getBannerImageLandscapeUri(), player0.getBannerImagePortraitUri(), player0.zzp(), player0.getRelationshipInfo(), player0.getCurrentPlayerInfo()});
    }

    // 去混淆评级： 中等(56)
    static boolean zza(Player player0, Object object0) {
        if(!(object0 instanceof Player)) {
            return false;
        }
        return player0 == object0 ? true : Objects.equal(((Player)object0).getPlayerId(), player0.getPlayerId()) && Objects.equal(((Player)object0).getDisplayName(), player0.getDisplayName()) && Objects.equal(Boolean.valueOf(((Player)object0).zzl()), Boolean.valueOf(player0.zzl())) && Objects.equal(((Player)object0).getIconImageUri(), player0.getIconImageUri()) && Objects.equal(((Player)object0).getHiResImageUri(), player0.getHiResImageUri()) && Objects.equal(((Player)object0).getRetrievedTimestamp(), player0.getRetrievedTimestamp()) && Objects.equal(((Player)object0).getTitle(), player0.getTitle()) && Objects.equal(((Player)object0).getLevelInfo(), player0.getLevelInfo()) && Objects.equal(((Player)object0).zzk(), player0.zzk()) && Objects.equal(((Player)object0).getName(), player0.getName()) && Objects.equal(((Player)object0).getBannerImageLandscapeUri(), player0.getBannerImageLandscapeUri()) && Objects.equal(((Player)object0).getBannerImagePortraitUri(), player0.getBannerImagePortraitUri()) && Objects.equal(((Player)object0).zzp(), player0.zzp()) && Objects.equal(((Player)object0).getCurrentPlayerInfo(), player0.getCurrentPlayerInfo()) && Objects.equal(((Player)object0).getRelationshipInfo(), player0.getRelationshipInfo());
    }

    static String zzb(Player player0) {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(player0).add("PlayerId", player0.getPlayerId()).add("DisplayName", player0.getDisplayName()).add("HasDebugAccess", Boolean.valueOf(player0.zzl())).add("IconImageUri", player0.getIconImageUri()).add("IconImageUrl", player0.getIconImageUrl()).add("HiResImageUri", player0.getHiResImageUri()).add("HiResImageUrl", player0.getHiResImageUrl()).add("RetrievedTimestamp", player0.getRetrievedTimestamp()).add("Title", player0.getTitle()).add("LevelInfo", player0.getLevelInfo()).add("GamerTag", player0.zzk()).add("Name", player0.getName()).add("BannerImageLandscapeUri", player0.getBannerImageLandscapeUri()).add("BannerImageLandscapeUrl", player0.getBannerImageLandscapeUrl()).add("BannerImagePortraitUri", player0.getBannerImagePortraitUri()).add("BannerImagePortraitUrl", player0.getBannerImagePortraitUrl()).add("CurrentPlayerInfo", player0.getCurrentPlayerInfo()).add("totalUnlockedAchievement", player0.zzp());
        if(player0.getRelationshipInfo() != null) {
            objects$ToStringHelper0.add("RelationshipInfo", player0.getRelationshipInfo());
        }
        return objects$ToStringHelper0.toString();
    }

    @Override  // com.google.android.gms.games.Player
    public final String zzk() {
        return this.zzbj;
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean zzl() {
        return this.zzbi;
    }

    @Override  // com.google.android.gms.games.Player
    public final int zzm() {
        return this.zzbc;
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean zzn() {
        return this.zzbh;
    }

    @Override  // com.google.android.gms.games.Player
    public final com.google.android.gms.games.internal.player.zza zzo() {
        return this.zzbf;
    }

    @Override  // com.google.android.gms.games.Player
    public final long zzp() {
        return this.zzbo;
    }
}

