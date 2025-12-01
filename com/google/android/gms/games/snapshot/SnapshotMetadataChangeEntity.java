package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class SnapshotMetadataChangeEntity extends zzb implements SnapshotMetadataChange {
    public static final Parcelable.Creator CREATOR;
    private final String description;
    private final Long zzlb;
    private final Uri zzld;
    private final Long zzlm;
    private BitmapTeleporter zzln;

    static {
        SnapshotMetadataChangeEntity.CREATOR = new zzc();
    }

    SnapshotMetadataChangeEntity() {
        this(null, null, null, null, null);
    }

    SnapshotMetadataChangeEntity(String s, Long long0, BitmapTeleporter bitmapTeleporter0, Uri uri0, Long long1) {
        this.description = s;
        this.zzlm = long0;
        this.zzln = bitmapTeleporter0;
        this.zzld = uri0;
        this.zzlb = long1;
        Preconditions.checkState(bitmapTeleporter0 == null || uri0 == null, "Cannot set both a URI and an image");
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final Bitmap getCoverImage() {
        return this.zzln == null ? null : this.zzln.get();
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final String getDescription() {
        return this.description;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final Long getPlayedTimeMillis() {
        return this.zzlm;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final Long getProgressValue() {
        return this.zzlb;
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getDescription(), false);
        SafeParcelWriter.writeLongObject(parcel0, 2, this.getPlayedTimeMillis(), false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzld, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.zzln, v, false);
        SafeParcelWriter.writeLongObject(parcel0, 6, this.getProgressValue(), false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotMetadataChange
    public final BitmapTeleporter zzcl() {
        return this.zzln;
    }
}

