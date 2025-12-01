package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

final class an extends al {
    an(aw aw0, TaskCompletionSource taskCompletionSource0) {
        super(aw0, taskCompletionSource0);
    }

    @Override  // com.google.android.play.core.assetpacks.al
    public final void e(Bundle bundle0, Bundle bundle1) throws RemoteException {
        super.e(bundle0, bundle1);
        ParcelFileDescriptor parcelFileDescriptor0 = (ParcelFileDescriptor)bundle0.getParcelable("chunk_file_descriptor");
        this.a.trySetResult(parcelFileDescriptor0);
    }
}

