package com.google.android.gms.games.snapshot;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.internal.zzb;
import com.google.android.gms.games.internal.zzz;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class SnapshotContentsEntity extends zzb implements SnapshotContents {
    public static final Parcelable.Creator CREATOR;
    private static final Object zzkw;
    private Contents zzkx;

    static {
        SnapshotContentsEntity.zzkw = new Object();
        SnapshotContentsEntity.CREATOR = new zza();
    }

    public SnapshotContentsEntity(Contents contents0) {
        this.zzkx = contents0;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public final void close() {
        this.zzkx = null;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public final ParcelFileDescriptor getParcelFileDescriptor() {
        Preconditions.checkState(!this.isClosed(), "Cannot mutate closed contents!");
        return this.zzkx.getParcelFileDescriptor();
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean isClosed() {
        return this.zzkx == null;
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean modifyBytes(int v, byte[] arr_b, int v1, int v2) {
        return this.zza(v, arr_b, v1, arr_b.length, false);
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public final byte[] readFully() throws IOException {
        byte[] arr_b;
        Preconditions.checkState(!this.isClosed(), "Must provide a previously opened Snapshot");
        synchronized(SnapshotContentsEntity.zzkw) {
            FileInputStream fileInputStream0 = new FileInputStream(this.zzkx.getParcelFileDescriptor().getFileDescriptor());
            BufferedInputStream bufferedInputStream0 = new BufferedInputStream(fileInputStream0);
            try {
                fileInputStream0.getChannel().position(0L);
                arr_b = IOUtils.readInputStreamFully(bufferedInputStream0, false);
                fileInputStream0.getChannel().position(0L);
                return arr_b;
            }
            catch(IOException iOException0) {
                zzz.w("SnapshotContentsEntity", "Failed to read snapshot data", iOException0);
                throw iOException0;
            }
        }
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public final boolean writeBytes(byte[] arr_b) {
        return this.zza(0, arr_b, 0, arr_b.length, true);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.zzkx, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    private final boolean zza(int v, byte[] arr_b, int v1, int v2, boolean z) {
        Preconditions.checkState(!this.isClosed(), "Must provide a previously opened SnapshotContents");
        synchronized(SnapshotContentsEntity.zzkw) {
            FileOutputStream fileOutputStream0 = new FileOutputStream(this.zzkx.getParcelFileDescriptor().getFileDescriptor());
            BufferedOutputStream bufferedOutputStream0 = new BufferedOutputStream(fileOutputStream0);
            try {
                FileChannel fileChannel0 = fileOutputStream0.getChannel();
                fileChannel0.position(((long)v));
                bufferedOutputStream0.write(arr_b, v1, v2);
                if(z) {
                    fileChannel0.truncate(((long)arr_b.length));
                }
                bufferedOutputStream0.flush();
                return true;
            }
            catch(IOException iOException0) {
                zzz.i("SnapshotContentsEntity", "Failed to write snapshot data", iOException0);
                return false;
            }
        }
    }

    @Override  // com.google.android.gms.games.snapshot.SnapshotContents
    public final Contents zzck() {
        return this.zzkx;
    }
}

