package com.google.android.play.core.appupdate;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zze extends ResultReceiver {
    final TaskCompletionSource zza;

    zze(zzg zzg0, Handler handler0, TaskCompletionSource taskCompletionSource0) {
        this.zza = taskCompletionSource0;
        super(handler0);
    }

    @Override  // android.os.ResultReceiver
    public final void onReceiveResult(int v, Bundle bundle0) {
        switch(v) {
            case 1: {
                this.zza.trySetResult(-1);
                return;
            }
            case 2: {
                this.zza.trySetResult(0);
                return;
            }
            default: {
                this.zza.trySetResult(1);
            }
        }
    }
}

