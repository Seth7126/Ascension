package com.google.android.gms.games.snapshot;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.DataUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.zzb;

public final class SnapshotMetadataEntity extends zzb implements SnapshotMetadata {
    public static final Parcelable.Creator CREATOR;
    private final String description;
    private final String deviceName;
    private final String zzbe;
    private final String zzeb;
    private final GameEntity zzhc;
    private final Uri zzld;
    private final PlayerEntity zzle;
    private final String zzlf;
    private final long zzlg;
    private final long zzlh;
    private final float zzli;
    private final String zzlj;
    private final boolean zzlk;
    private final long zzll;

    static {
        SnapshotMetadataEntity.CREATOR = new zzd();
    }

    SnapshotMetadataEntity(GameEntity gameEntity0, PlayerEntity playerEntity0, String s, Uri uri0, String s1, String s2, String s3, long v, long v1, float f, String s4, boolean z, long v2, String s5) {
        this.zzhc = gameEntity0;
        this.zzle = playerEntity0;
        this.zzeb = s;
        this.zzld = uri0;
        this.zzlf = s1;
        this.zzli = f;
        this.zzbe = s2;
        this.description = s3;
        this.zzlg = v;
        this.zzlh = v1;
        this.zzlj = s4;
        this.zzlk = z;
        this.zzll = v2;
        this.deviceName = s5;
    }

    public SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata0) {
        this(snapshotMetadata0, new PlayerEntity(snapshotMetadata0.getOwner()));
    }

    private SnapshotMetadataEntity(SnapshotMetadata snapshotMetadata0, PlayerEntity playerEntity0) {
        this.zzhc = new GameEntity(snapshotMetadata0.getGame());
        this.zzle = playerEntity0;
        this.zzeb = snapshotMetadata0.getSnapshotId();
        this.zzld = snapshotMetadata0.getCoverImageUri();
        this.zzlf = snapshotMetadata0.getCoverImageUrl();
        this.zzli = snapshotMetadata0.getCoverImageAspectRatio();
        this.zzbe = snapshotMetadata0.getTitle();
        this.description = snapshotMetadata0.getDescription();
        this.zzlg = snapshotMetadata0.getLastModifiedTimestamp();
        this.zzlh = snapshotMetadata0.getPlayedTime();
        this.zzlj = snapshotMetadata0.getUniqueName();
        this.zzlk = snapshotMetadata0.hasChangePending();
        this.zzll = snapshotMetadata0.getProgressValue();
        this.deviceName = snapshotMetadata0.getDeviceName();
    }

    @Override
    public final boolean equals(Object object0) {
        return SnapshotMetadataEntity.zza(this, object0);
    }

    public final SnapshotMetadata freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final float getCoverImageAspectRatio() {
        return this.zzli;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final Uri getCoverImageUri() {
        return this.zzld;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String getCoverImageUrl() {
        return this.zzlf;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String getDescription() {
        return this.description;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final void getDescription(CharArrayBuffer charArrayBuffer0) {
        DataUtils.copyStringToBuffer(this.description, charArrayBuffer0);
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String getDeviceName() {
        return this.deviceName;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final Game getGame() {
        return this.zzhc;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getLastModifiedTimestamp() {
        return this.zzlg;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final Player getOwner() {
        return this.zzle;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getPlayedTime() {
        return this.zzlh;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final long getProgressValue() {
        return this.zzll;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String getSnapshotId() {
        return this.zzeb;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String getTitle() {
        return this.zzbe;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final String getUniqueName() {
        return this.zzlj;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadata
    public final boolean hasChangePending() {
        return this.zzlk;
    }

    @Override
    public final int hashCode() {
        return SnapshotMetadataEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return SnapshotMetadataEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.getGame(), v, false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.getOwner(), v, false);
        SafeParcelWriter.writeString(parcel0, 3, this.getSnapshotId(), false);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.getCoverImageUri(), v, false);
        SafeParcelWriter.writeString(parcel0, 6, this.getCoverImageUrl(), false);
        SafeParcelWriter.writeString(parcel0, 7, this.zzbe, false);
        SafeParcelWriter.writeString(parcel0, 8, this.getDescription(), false);
        SafeParcelWriter.writeLong(parcel0, 9, this.getLastModifiedTimestamp());
        SafeParcelWriter.writeLong(parcel0, 10, this.getPlayedTime());
        SafeParcelWriter.writeFloat(parcel0, 11, this.getCoverImageAspectRatio());
        SafeParcelWriter.writeString(parcel0, 12, this.getUniqueName(), false);
        SafeParcelWriter.writeBoolean(parcel0, 13, this.hasChangePending());
        SafeParcelWriter.writeLong(parcel0, 14, this.getProgressValue());
        SafeParcelWriter.writeString(parcel0, 15, this.getDeviceName(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    static int zza(SnapshotMetadata snapshotMetadata0) {
        return Objects.hashCode(new Object[]{snapshotMetadata0.getGame(), snapshotMetadata0.getOwner(), snapshotMetadata0.getSnapshotId(), snapshotMetadata0.getCoverImageUri(), snapshotMetadata0.getCoverImageAspectRatio(), snapshotMetadata0.getTitle(), snapshotMetadata0.getDescription(), snapshotMetadata0.getLastModifiedTimestamp(), snapshotMetadata0.getPlayedTime(), snapshotMetadata0.getUniqueName(), Boolean.valueOf(snapshotMetadata0.hasChangePending()), snapshotMetadata0.getProgressValue(), snapshotMetadata0.getDeviceName()});
    }

    // 去混淆评级： 中等(50)
    static boolean zza(SnapshotMetadata snapshotMetadata0, Object object0) {
        if(!(object0 instanceof SnapshotMetadata)) {
            return false;
        }
        return snapshotMetadata0 == object0 ? true : Objects.equal(((SnapshotMetadata)object0).getGame(), snapshotMetadata0.getGame()) && Objects.equal(((SnapshotMetadata)object0).getOwner(), snapshotMetadata0.getOwner()) && Objects.equal(((SnapshotMetadata)object0).getSnapshotId(), snapshotMetadata0.getSnapshotId()) && Objects.equal(((SnapshotMetadata)object0).getCoverImageUri(), snapshotMetadata0.getCoverImageUri()) && Objects.equal(((SnapshotMetadata)object0).getCoverImageAspectRatio(), snapshotMetadata0.getCoverImageAspectRatio()) && Objects.equal(((SnapshotMetadata)object0).getTitle(), snapshotMetadata0.getTitle()) && Objects.equal(((SnapshotMetadata)object0).getDescription(), snapshotMetadata0.getDescription()) && Objects.equal(((SnapshotMetadata)object0).getLastModifiedTimestamp(), snapshotMetadata0.getLastModifiedTimestamp()) && Objects.equal(((SnapshotMetadata)object0).getPlayedTime(), snapshotMetadata0.getPlayedTime()) && Objects.equal(((SnapshotMetadata)object0).getUniqueName(), snapshotMetadata0.getUniqueName()) && Objects.equal(Boolean.valueOf(((SnapshotMetadata)object0).hasChangePending()), Boolean.valueOf(snapshotMetadata0.hasChangePending())) && Objects.equal(((SnapshotMetadata)object0).getProgressValue(), snapshotMetadata0.getProgressValue()) && Objects.equal(((SnapshotMetadata)object0).getDeviceName(), snapshotMetadata0.getDeviceName());
    }

    static String zzb(SnapshotMetadata snapshotMetadata0) {
        return Objects.toStringHelper(snapshotMetadata0).add("Game", snapshotMetadata0.getGame()).add("Owner", snapshotMetadata0.getOwner()).add("SnapshotId", snapshotMetadata0.getSnapshotId()).add("CoverImageUri", snapshotMetadata0.getCoverImageUri()).add("CoverImageUrl", snapshotMetadata0.getCoverImageUrl()).add("CoverImageAspectRatio", snapshotMetadata0.getCoverImageAspectRatio()).add("Description", snapshotMetadata0.getDescription()).add("LastModifiedTimestamp", snapshotMetadata0.getLastModifiedTimestamp()).add("PlayedTime", snapshotMetadata0.getPlayedTime()).add("UniqueName", snapshotMetadata0.getUniqueName()).add("ChangePending", Boolean.valueOf(snapshotMetadata0.hasChangePending())).add("ProgressValue", snapshotMetadata0.getProgressValue()).add("DeviceName", snapshotMetadata0.getDeviceName()).toString();
    }
}

