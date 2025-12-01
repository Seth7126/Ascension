package com.google.androidgamesdk;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Choreographer.FrameCallback;
import android.view.Choreographer;

public class ChoreographerCallback implements Choreographer.FrameCallback {
    final class a extends Thread {
        public Handler a;
        final ChoreographerCallback b;

        private a() {
        }

        a(byte b) {
        }

        @Override
        public final void run() {
            Log.i("ChoreographerCallback", "Starting looper thread");
            Looper.prepare();
            this.a = new Handler();
            Looper.loop();
            Log.i("ChoreographerCallback", "Terminating looper thread");
        }
    }

    private static final String LOG_TAG = "ChoreographerCallback";
    private long mCookie;
    private a mLooper;

    public ChoreographerCallback(long v) {
        this.mCookie = v;
        a choreographerCallback$a0 = new a(this, 0);
        this.mLooper = choreographerCallback$a0;
        choreographerCallback$a0.start();
    }

    @Override  // android.view.Choreographer$FrameCallback
    public void doFrame(long v) {
        this.nOnChoreographer(this.mCookie, v);
    }

    public native void nOnChoreographer(long arg1, long arg2) {
    }

    public void postFrameCallback() {
        this.mLooper.a.post(new Runnable() {
            final ChoreographerCallback a;

            @Override
            public final void run() {
                Choreographer.getInstance().postFrameCallback(ChoreographerCallback.this);
            }
        });
    }

    public void postFrameCallbackDelayed(long v) {
        Choreographer.getInstance().postFrameCallbackDelayed(this, v);
    }

    public void terminate() {
        this.mLooper.a.getLooper().quit();
    }
}

