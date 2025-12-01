package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

final class k extends ResultReceiver {
    final TaskCompletionSource a;
    final l b;

    k(l l0, Handler handler0, TaskCompletionSource taskCompletionSource0) {
        this.b = l0;
        this.a = taskCompletionSource0;
        super(handler0);
    }

    @Override  // android.os.ResultReceiver
    public final void onReceiveResult(int v, Bundle bundle0) {
        switch(v) {
            case 1: {
                this.a.trySetResult(-1);
                this.b.g.b(null);
                return;
            }
            case 2: {
                this.a.trySetResult(0);
                return;
            }
            default: {
                AssetPackException assetPackException0 = new AssetPackException(-100);
                this.a.trySetException(assetPackException0);
            }
        }
    }
}

