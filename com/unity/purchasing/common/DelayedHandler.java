package com.unity.purchasing.common;

import android.os.Handler;
import android.os.Looper;

public class DelayedHandler implements IDelayedExecutor {
    private Handler handler;

    public DelayedHandler() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    @Override  // com.unity.purchasing.common.IDelayedExecutor
    public void ExecuteDelayed(Runnable runnable0, long v) {
        this.handler.postDelayed(runnable0, v);
    }
}

