package com.google.android.gms.internal.games;

import android.os.RemoteException;
import com.google.android.gms.games.internal.zzf;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaw extends zzbe {
    zzaw(zzaq zzaq0) {
    }

    @Override  // com.google.android.gms.internal.games.zzbe
    protected final void zzb(zzf zzf0, TaskCompletionSource taskCompletionSource0) throws RemoteException {
        taskCompletionSource0.setResult(zzf0.zzah());
    }
}

