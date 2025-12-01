package com.google.androidgamesdk;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.hardware.display.DisplayManager.DisplayListener;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.Display.Mode;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SwappyDisplayManager implements DisplayManager.DisplayListener {
    final class a extends Thread {
        public Handler a;
        final SwappyDisplayManager b;
        private Lock c;
        private Condition d;

        private a() {
            ReentrantLock reentrantLock0 = new ReentrantLock();
            this.c = reentrantLock0;
            this.d = reentrantLock0.newCondition();
        }

        a(byte b) {
        }

        @Override
        public final void run() {
            Log.i("SwappyDisplayManager", "Starting looper thread");
            this.c.lock();
            Looper.prepare();
            this.a = new Handler();
            this.d.signal();
            this.c.unlock();
            Looper.loop();
            Log.i("SwappyDisplayManager", "Terminating looper thread");
        }

        @Override
        public final void start() {
            this.c.lock();
            super.start();
            try {
                this.d.await();
            }
            catch(InterruptedException interruptedException0) {
                interruptedException0.printStackTrace();
            }
            this.c.unlock();
        }
    }

    private final boolean DEBUG;
    private final String LOG_TAG;
    private final long ONE_MS_IN_NS;
    private final long ONE_S_IN_NS;
    private Activity mActivity;
    private long mCookie;
    private Display.Mode mCurrentMode;
    private a mLooper;
    private WindowManager mWindowManager;

    public SwappyDisplayManager(long v, Activity activity0) {
        this.LOG_TAG = "SwappyDisplayManager";
        this.DEBUG = false;
        this.ONE_MS_IN_NS = 1000000L;
        this.ONE_S_IN_NS = 1000000000L;
        try {
            ActivityInfo activityInfo0 = activity0.getPackageManager().getActivityInfo(activity0.getIntent().getComponent(), 0x80);
            if(activityInfo0.metaData != null) {
                String s = activityInfo0.metaData.getString("android.app.lib_name");
                if(s != null) {
                    System.loadLibrary(s);
                }
            }
        }
        catch(Throwable throwable0) {
            Log.e("SwappyDisplayManager", throwable0.getMessage());
        }
        this.mCookie = v;
        this.mActivity = activity0;
        WindowManager windowManager0 = (WindowManager)activity0.getSystemService(WindowManager.class);
        this.mWindowManager = windowManager0;
        Display display0 = windowManager0.getDefaultDisplay();
        this.mCurrentMode = display0.getMode();
        this.updateSupportedRefreshRates(display0);
        DisplayManager displayManager0 = (DisplayManager)this.mActivity.getSystemService(DisplayManager.class);
        synchronized(this) {
            a swappyDisplayManager$a0 = new a(this, 0);
            this.mLooper = swappyDisplayManager$a0;
            swappyDisplayManager$a0.start();
            displayManager0.registerDisplayListener(this, this.mLooper.a);
        }
    }

    private boolean modeMatchesCurrentResolution(Display.Mode display$Mode0) {
        return display$Mode0.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight() && display$Mode0.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth();
    }

    private native void nOnRefreshPeriodChanged(long arg1, long arg2, long arg3, long arg4) {
    }

    private native void nSetSupportedRefreshPeriods(long arg1, long[] arg2, int[] arg3) {
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public void onDisplayAdded(int v) {
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public void onDisplayChanged(int v) {
        synchronized(this) {
            Display display0 = this.mWindowManager.getDefaultDisplay();
            float f = display0.getRefreshRate();
            Display.Mode display$Mode0 = display0.getMode();
            boolean z = true;
            int v2 = display$Mode0.getPhysicalWidth() == this.mCurrentMode.getPhysicalWidth() ? 0 : 1;
            int v3 = display$Mode0.getPhysicalHeight() == this.mCurrentMode.getPhysicalHeight() ? 0 : 1;
            if(f == this.mCurrentMode.getRefreshRate()) {
                z = false;
            }
            this.mCurrentMode = display$Mode0;
            if((v2 | v3) != 0) {
                this.updateSupportedRefreshRates(display0);
            }
            if(z) {
                long v4 = display0.getAppVsyncOffsetNanos();
                long v5 = this.mWindowManager.getDefaultDisplay().getPresentationDeadlineNanos();
                this.nOnRefreshPeriodChanged(this.mCookie, ((long)(1000000000.0f / f)), v4, ((long)(1000000000.0f / f)) - (v5 - 1000000L));
            }
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public void onDisplayRemoved(int v) {
    }

    public void setPreferredDisplayModeId(int v) {
        this.mActivity.runOnUiThread(new Runnable() {
            final SwappyDisplayManager b;

            @Override
            public final void run() {
                Window window0 = SwappyDisplayManager.this.mActivity.getWindow();
                WindowManager.LayoutParams windowManager$LayoutParams0 = window0.getAttributes();
                windowManager$LayoutParams0.preferredDisplayModeId = v;
                window0.setAttributes(windowManager$LayoutParams0);
            }
        });
    }

    public void terminate() {
        this.mLooper.a.getLooper().quit();
    }

    private void updateSupportedRefreshRates(Display display0) {
        Display.Mode[] arr_display$Mode = display0.getSupportedModes();
        int v2 = 0;
        for(int v1 = 0; v1 < arr_display$Mode.length; ++v1) {
            if(this.modeMatchesCurrentResolution(arr_display$Mode[v1])) {
                ++v2;
            }
        }
        long[] arr_v = new long[v2];
        int[] arr_v1 = new int[v2];
        int v3 = 0;
        for(int v = 0; v < arr_display$Mode.length; ++v) {
            if(this.modeMatchesCurrentResolution(arr_display$Mode[v])) {
                arr_v[v3] = (long)(1000000000.0f / arr_display$Mode[v].getRefreshRate());
                arr_v1[v3] = arr_display$Mode[v].getModeId();
                ++v3;
            }
        }
        this.nSetSupportedRefreshPeriods(this.mCookie, arr_v, arr_v1);
    }
}

