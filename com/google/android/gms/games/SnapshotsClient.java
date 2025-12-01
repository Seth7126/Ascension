package com.google.android.gms.games;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.tasks.Task;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public interface SnapshotsClient {
    public static final class DataOrConflict {
        private final Object data;
        private final SnapshotConflict zzcf;

        public DataOrConflict(Object object0, SnapshotConflict snapshotsClient$SnapshotConflict0) {
            this.data = object0;
            this.zzcf = snapshotsClient$SnapshotConflict0;
        }

        public final SnapshotConflict getConflict() {
            if(!this.isConflict()) {
                throw new IllegalStateException("getConflict called when there is no conflict.");
            }
            return this.zzcf;
        }

        public final Object getData() {
            if(this.isConflict()) {
                throw new IllegalStateException("getData called when there is a conflict.");
            }
            return this.data;
        }

        public final boolean isConflict() {
            return this.zzcf != null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ResolutionPolicy {
    }

    public static final class SnapshotConflict {
        private final Snapshot zzcg;
        private final String zzch;
        private final Snapshot zzci;
        private final SnapshotContents zzcj;

        public SnapshotConflict(Snapshot snapshot0, String s, Snapshot snapshot1, SnapshotContents snapshotContents0) {
            this.zzcg = snapshot0;
            this.zzch = s;
            this.zzci = snapshot1;
            this.zzcj = snapshotContents0;
        }

        public final String getConflictId() {
            return this.zzch;
        }

        public final Snapshot getConflictingSnapshot() {
            return this.zzci;
        }

        public final SnapshotContents getResolutionSnapshotContents() {
            return this.zzcj;
        }

        public final Snapshot getSnapshot() {
            return this.zzcg;
        }
    }

    public static final class SnapshotContentUnavailableApiException extends ApiException {
        protected final SnapshotMetadata metadata;

        public SnapshotContentUnavailableApiException(Status status0, SnapshotMetadata snapshotMetadata0) {
            super(status0);
            this.metadata = snapshotMetadata0;
        }

        public final SnapshotMetadata getSnapshotMetadata() {
            return this.metadata;
        }
    }

    public static final int DISPLAY_LIMIT_NONE = -1;
    public static final String EXTRA_SNAPSHOT_METADATA = "com.google.android.gms.games.SNAPSHOT_METADATA";
    public static final String EXTRA_SNAPSHOT_NEW = "com.google.android.gms.games.SNAPSHOT_NEW";
    public static final int RESOLUTION_POLICY_HIGHEST_PROGRESS = 4;
    public static final int RESOLUTION_POLICY_LAST_KNOWN_GOOD = 2;
    public static final int RESOLUTION_POLICY_LONGEST_PLAYTIME = 1;
    public static final int RESOLUTION_POLICY_MANUAL = -1;
    public static final int RESOLUTION_POLICY_MOST_RECENTLY_MODIFIED = 3;

    Task commitAndClose(Snapshot arg1, SnapshotMetadataChange arg2);

    Task delete(SnapshotMetadata arg1);

    Task discardAndClose(Snapshot arg1);

    Task getMaxCoverImageSize();

    Task getMaxDataSize();

    Task getSelectSnapshotIntent(String arg1, boolean arg2, boolean arg3, int arg4);

    Task load(boolean arg1);

    Task open(SnapshotMetadata arg1);

    Task open(SnapshotMetadata arg1, int arg2);

    Task open(String arg1, boolean arg2);

    Task open(String arg1, boolean arg2, int arg3);

    Task resolveConflict(String arg1, Snapshot arg2);

    Task resolveConflict(String arg1, String arg2, SnapshotMetadataChange arg3, SnapshotContents arg4);
}

