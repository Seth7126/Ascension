package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class SnapshotEntity extends zzb implements Snapshot {
    public static final Parcelable.Creator CREATOR;
    private final SnapshotMetadataEntity zzky;
    private final SnapshotContentsEntity zzkz;

    static {
        SnapshotEntity.CREATOR = new com.google.android.gms.games.snapshot.zzb();
    }

    public SnapshotEntity(SnapshotMetadata snapshotMetadata0, SnapshotContentsEntity snapshotContentsEntity0) {
        this.zzky = new SnapshotMetadataEntity(snapshotMetadata0);
        this.zzkz = snapshotContentsEntity0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof Snapshot) {
            return this == object0 ? true : Objects.equal(((Snapshot)object0).getMetadata(), this.getMetadata()) && Objects.equal(((Snapshot)object0).getSnapshotContents(), this.getSnapshotContents());
        }
        return false;
    }

    public final Snapshot freeze() [...] // Inlined contents

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshot
    public final SnapshotMetadata getMetadata() {
        return this.zzky;
    }

    @Override  // com.google.android.gms.games.snapshot.Snapshot
    public final SnapshotContents getSnapshotContents() {
        return this.zzkz.isClosed() ? null : this.zzkz;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.getMetadata(), this.getSnapshotContents()});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this).add("Metadata", this.getMetadata());
        return this.getSnapshotContents() == null ? objects$ToStringHelper0.add("HasContents", Boolean.FALSE).toString() : objects$ToStringHelper0.add("HasContents", Boolean.TRUE).toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.getMetadata(), v, false);
        SafeParcelWriter.writeParcelable(parcel0, 3, this.getSnapshotContents(), v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

