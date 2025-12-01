package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera.Area;

public class Camera2Wrapper implements e {
    private Context a;
    private c b;
    private final int c;

    public Camera2Wrapper(Context context0) {
        this.b = null;
        this.c = 100;
        this.a = context0;
        this.initCamera2Jni();
    }

    private static int a(float f) {
        return (int)Math.min(Math.max(f * 2000.0f - 1000.0f, -900.0f), 900.0f);
    }

    public final void a() {
        this.deinitCamera2Jni();
        this.closeCamera2();
    }

    @Override  // com.unity3d.player.e
    public final void a(Object object0) {
        this.nativeSurfaceTextureReady(object0);
    }

    @Override  // com.unity3d.player.e
    public final void a(Object object0, Object object1, Object object2, int v, int v1, int v2) {
        this.nativeFrameReady(object0, object1, object2, v, v1, v2);
    }

    protected void closeCamera2() {
        c c0 = this.b;
        if(c0 != null) {
            c0.b();
        }
        this.b = null;
    }

    private final native void deinitCamera2Jni() {
    }

    protected int getCamera2Count() {
        return c.a(this.a);
    }

    protected int getCamera2FocalLengthEquivalent(int v) {
        return c.d(this.a, v);
    }

    protected int[] getCamera2Resolutions(int v) {
        return c.e(this.a, v);
    }

    protected int getCamera2SensorOrientation(int v) {
        return c.a(this.a, v);
    }

    protected Object getCameraFocusArea(float f, float f1) {
        int v = Camera2Wrapper.a(f);
        int v1 = Camera2Wrapper.a(1.0f - f1);
        return new Camera.Area(new Rect(v - 100, v1 - 100, v + 100, v1 + 100), 1000);
    }

    protected Rect getFrameSizeCamera2() {
        c c0 = this.b;
        return c0 == null ? new Rect() : c0.a();
    }

    private final native void initCamera2Jni() {
    }

    protected boolean initializeCamera2(int v, int v1, int v2, int v3, int v4) {
        if(this.b == null && UnityPlayer.currentActivity != null) {
            c c0 = new c(this);
            this.b = c0;
            return c0.a(this.a, v, v1, v2, v3, v4);
        }
        return false;
    }

    protected boolean isCamera2AutoFocusPointSupported(int v) {
        return c.c(this.a, v);
    }

    protected boolean isCamera2FrontFacing(int v) {
        return c.b(this.a, v);
    }

    private final native void nativeFrameReady(Object arg1, Object arg2, Object arg3, int arg4, int arg5, int arg6) {
    }

    private final native void nativeSurfaceTextureReady(Object arg1) {
    }

    protected void pauseCamera2() {
        c c0 = this.b;
        if(c0 != null) {
            c0.d();
        }
    }

    protected boolean setAutoFocusPoint(float f, float f1) {
        return this.b == null ? false : this.b.a(f, f1);
    }

    protected void startCamera2() {
        c c0 = this.b;
        if(c0 != null) {
            c0.c();
        }
    }

    protected void stopCamera2() {
        c c0 = this.b;
        if(c0 != null) {
            c0.e();
        }
    }
}

