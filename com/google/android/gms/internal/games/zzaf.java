package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaf implements RemoteCall {
    private final RemoteCall zzfe;

    zzaf(RemoteCall remoteCall0) {
        this.zzfe = remoteCall0;
    }

    @Override  // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object object0, Object object1) {
        zzf zzf0 = (zzf)object0;
        TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)object1;
        try {
            this.zzfe.accept(zzf0, taskCompletionSource0);
        }
        catch(RemoteException | SecurityException remoteException0) {
            taskCompletionSource0.trySetException(remoteException0);
        }
    }
}

