package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.player.zza;
import com.google.android.gms.games.internal.player.zzb;
import com.google.android.gms.games.internal.player.zzd;

public final class PlayerRef extends zzh implements Player {
    private final PlayerLevelInfo zzbg;
    private final zzb zzby;
    private final zzn zzbz;
    private final com.google.android.gms.games.zzb zzca;
    private final zzd zzg;

    public PlayerRef(DataHolder dataHolder0, int v) {
        this(dataHolder0, v, null);
    }

    private PlayerRef(DataHolder dataHolder0, int v, String s) {
        super(dataHolder0, v);
        zzd zzd0 = new zzd(null);
        this.zzg = zzd0;
        this.zzby = new zzb(dataHolder0, v, zzd0);
        this.zzbz = new zzn(dataHolder0, v, zzd0);
        this.zzca = new com.google.android.gms.games.zzb(dataHolder0, v, zzd0);
        if(!this.hasNull(zzd0.zzii) && this.getLong(zzd0.zzii) != -1L) {
            int v1 = this.getInteger(zzd0.zzij);
            int v2 = this.getInteger(zzd0.zzim);
            PlayerLevel playerLevel0 = new PlayerLevel(v1, this.getLong(zzd0.zzik), this.getLong(zzd0.zzil));
            PlayerLevel playerLevel1 = v1 == v2 ? playerLevel0 : new PlayerLevel(v2, this.getLong(zzd0.zzil), this.getLong(zzd0.zzin));
            this.zzbg = new PlayerLevelInfo(this.getLong(zzd0.zzii), this.getLong(zzd0.zzio), playerLevel0, playerLevel1);
            return;
        }
        this.zzbg = null;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object object0) {
        return PlayerEntity.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return new PlayerEntity(this);
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getBannerImageLandscapeUri() {
        return this.parseUri(this.zzg.zziy);
    }

    @Override  // com.google.android.gms.games.Player
    public final String getBannerImageLandscapeUrl() {
        return this.getString(this.zzg.zziz);
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getBannerImagePortraitUri() {
        return this.parseUri(this.zzg.zzja);
    }

    @Override  // com.google.android.gms.games.Player
    public final String getBannerImagePortraitUrl() {
        return this.getString(this.zzg.zzjb);
    }

    @Override  // com.google.android.gms.games.Player
    public final CurrentPlayerInfo getCurrentPlayerInfo() {
        return this.zzca.zzb() ? this.zzca : null;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getDisplayName() {
        return this.getString(this.zzg.zzia);
    }

    @Override  // com.google.android.gms.games.Player
    public final void getDisplayName(CharArrayBuffer charArrayBuffer0) {
        this.copyToBuffer(this.zzg.zzia, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getHiResImageUri() {
        return this.parseUri(this.zzg.zzid);
    }

    @Override  // com.google.android.gms.games.Player
    public final String getHiResImageUrl() {
        return this.getString(this.zzg.zzie);
    }

    @Override  // com.google.android.gms.games.Player
    public final Uri getIconImageUri() {
        return this.parseUri(this.zzg.zzib);
    }

    @Override  // com.google.android.gms.games.Player
    public final String getIconImageUrl() {
        return this.getString(this.zzg.zzic);
    }

    // 去混淆评级： 低(20)
    @Override  // com.google.android.gms.games.Player
    public final long getLastPlayedWithTimestamp() {
        return !this.hasColumn(this.zzg.zzih) || this.hasNull(this.zzg.zzih) ? -1L : this.getLong(this.zzg.zzih);
    }

    @Override  // com.google.android.gms.games.Player
    public final PlayerLevelInfo getLevelInfo() {
        return this.zzbg;
    }

    @Override  // com.google.android.gms.games.Player
    public final String getName() {
        return this.getString(this.zzg.name);
    }

    @Override  // com.google.android.gms.games.Player
    public final String getPlayerId() {
        return this.getString(this.zzg.zzhz);
    }

    @Override  // com.google.android.gms.games.Player
    public final PlayerRelationshipInfo getRelationshipInfo() {
        return this.zzbz.getFriendStatus() != -1 || this.zzbz.zzq() != null || this.zzbz.zzr() != null ? this.zzbz : null;
    }

    @Override  // com.google.android.gms.games.Player
    public final long getRetrievedTimestamp() {
        return this.getLong(this.zzg.zzif);
    }

    @Override  // com.google.android.gms.games.Player
    public final String getTitle() {
        return this.getString(this.zzg.zzbe);
    }

    @Override  // com.google.android.gms.games.Player
    public final void getTitle(CharArrayBuffer charArrayBuffer0) {
        this.copyToBuffer(this.zzg.zzbe, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean hasHiResImage() {
        return this.getHiResImageUri() != null;
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean hasIconImage() {
        return this.getIconImageUri() != null;
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return PlayerEntity.zza(this);
    }

    @Override
    public final String toString() {
        return PlayerEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ((PlayerEntity)(((Player)this.freeze()))).writeToParcel(parcel0, v);
    }

    @Override  // com.google.android.gms.games.Player
    public final String zzk() {
        return this.getString(this.zzg.zzbj);
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean zzl() {
        return this.getBoolean(this.zzg.zzix);
    }

    @Override  // com.google.android.gms.games.Player
    public final int zzm() {
        return this.getInteger(this.zzg.zzig);
    }

    @Override  // com.google.android.gms.games.Player
    public final boolean zzn() {
        return this.getBoolean(this.zzg.zziq);
    }

    @Override  // com.google.android.gms.games.Player
    public final zza zzo() {
        return this.hasNull(this.zzg.zzir) ? null : this.zzby;
    }

    @Override  // com.google.android.gms.games.Player
    public final long zzp() {
        String s = this.zzg.zzjf;
        return !this.hasColumn(s) || this.hasNull(s) ? -1L : this.getLong(s);
    }
}

