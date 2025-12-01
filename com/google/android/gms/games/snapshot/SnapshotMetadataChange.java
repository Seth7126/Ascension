package com.google.android.gms.games.snapshot;

import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.gms.common.data.BitmapTeleporter;

public interface SnapshotMetadataChange {
    public static final class Builder {
        private String description;
        private Long zzla;
        private Long zzlb;
        private BitmapTeleporter zzlc;
        private Uri zzld;

        public final SnapshotMetadataChange build() {
            return new SnapshotMetadataChangeEntity(this.description, this.zzla, this.zzlc, this.zzld, this.zzlb);
        }

        public final Builder fromMetadata(SnapshotMetadata snapshotMetadata0) {
            this.description = snapshotMetadata0.getDescription();
            this.zzla = snapshotMetadata0.getPlayedTime();
            this.zzlb = snapshotMetadata0.getProgressValue();
            if(((long)this.zzla) == -1L) {
                this.zzla = null;
            }
            Uri uri0 = snapshotMetadata0.getCoverImageUri();
            this.zzld = uri0;
            if(uri0 != null) {
                this.zzlc = null;
            }
            return this;
        }

        public final Builder setCoverImage(Bitmap bitmap0) {
            this.zzlc = new BitmapTeleporter(bitmap0);
            this.zzld = null;
            return this;
        }

        public final Builder setDescription(String s) {
            this.description = s;
            return this;
        }

        public final Builder setPlayedTimeMillis(long v) {
            this.zzla = v;
            return this;
        }

        public final Builder setProgressValue(long v) {
            this.zzlb = v;
            return this;
        }
    }

    public static final SnapshotMetadataChange EMPTY_CHANGE;

    static {
        SnapshotMetadataChange.EMPTY_CHANGE = new SnapshotMetadataChangeEntity();
    }

    Bitmap getCoverImage();

    String getDescription();

    Long getPlayedTimeMillis();

    Long getProgressValue();

    BitmapTeleporter zzcl();
}

