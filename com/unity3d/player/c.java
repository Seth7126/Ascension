package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image.Plane;
import android.media.Image;
import android.media.ImageReader.OnImageAvailableListener;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class c {
    static final class a extends Enum {
        public static final enum int a = 1;
        public static final enum int b = 2;
        public static final enum int c = 3;
        private static final int[] d;

        static {
            a.d = new int[]{1, 2, 3};
        }
    }

    private CameraCaptureSession.CaptureCallback A;
    private final CameraDevice.StateCallback B;
    private final ImageReader.OnImageAvailableListener C;
    private final SurfaceTexture.OnFrameAvailableListener D;
    private e a;
    private static CameraManager b;
    private static String[] c;
    private CameraDevice d;
    private static Semaphore e;
    private HandlerThread f;
    private Handler g;
    private Rect h;
    private Rect i;
    private int j;
    private int k;
    private float l;
    private float m;
    private int n;
    private int o;
    private boolean p;
    private Range q;
    private ImageReader r;
    private Image s;
    private CaptureRequest.Builder t;
    private CameraCaptureSession u;
    private Object v;
    private int w;
    private SurfaceTexture x;
    private Surface y;
    private int z;

    static {
        c.e = new Semaphore(1);
    }

    protected c(e e0) {
        this.a = null;
        this.l = -1.0f;
        this.m = -1.0f;
        this.p = false;
        this.r = null;
        this.u = null;
        this.v = new Object();
        this.y = null;
        this.z = a.c;
        this.A = new CameraCaptureSession.CaptureCallback() {
            final c a;

            @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, TotalCaptureResult totalCaptureResult0) {
                Object object0 = captureRequest0.getTag();
                c.this.a(object0);
            }

            @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession0, CaptureRequest captureRequest0, CaptureFailure captureFailure0) {
                f.Log(5, "Camera2: Capture session failed " + captureRequest0.getTag() + " reason " + captureFailure0.getReason());
                Object object0 = captureRequest0.getTag();
                c.this.a(object0);
            }

            @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
            public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession0, int v) {
            }

            @Override  // android.hardware.camera2.CameraCaptureSession$CaptureCallback
            public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession0, int v, long v1) {
            }
        };
        this.B = new CameraDevice.StateCallback() {
            final c a;

            @Override  // android.hardware.camera2.CameraDevice$StateCallback
            public final void onClosed(CameraDevice cameraDevice0) {
                c.e.release();
            }

            @Override  // android.hardware.camera2.CameraDevice$StateCallback
            public final void onDisconnected(CameraDevice cameraDevice0) {
                f.Log(5, "Camera2: CameraDevice disconnected.");
                c.this.a(cameraDevice0);
                c.e.release();
            }

            @Override  // android.hardware.camera2.CameraDevice$StateCallback
            public final void onError(CameraDevice cameraDevice0, int v) {
                f.Log(6, "Camera2: Error opeining CameraDevice " + v);
                c.this.a(cameraDevice0);
                c.e.release();
            }

            @Override  // android.hardware.camera2.CameraDevice$StateCallback
            public final void onOpened(CameraDevice cameraDevice0) {
                c.this.d = cameraDevice0;
                c.e.release();
            }
        };
        this.C = new ImageReader.OnImageAvailableListener() {
            final c a;

            @Override  // android.media.ImageReader$OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader0) {
                if(c.e.tryAcquire()) {
                    Image image0 = imageReader0.acquireNextImage();
                    if(image0 != null) {
                        Image.Plane[] arr_image$Plane = image0.getPlanes();
                        if(image0.getFormat() != 35 || arr_image$Plane == null || arr_image$Plane.length != 3) {
                            f.Log(6, "Camera2: Wrong image format.");
                        }
                        else {
                            c.this.a.a(arr_image$Plane[0].getBuffer(), arr_image$Plane[1].getBuffer(), arr_image$Plane[2].getBuffer(), arr_image$Plane[0].getRowStride(), arr_image$Plane[1].getRowStride(), arr_image$Plane[1].getPixelStride());
                        }
                        if(c.this.s != null) {
                            c.this.s.close();
                        }
                        c.this.s = image0;
                    }
                    c.e.release();
                }
            }
        };
        this.D = new SurfaceTexture.OnFrameAvailableListener() {
            final c a;

            @Override  // android.graphics.SurfaceTexture$OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture0) {
                c.this.a.a(surfaceTexture0);
            }
        };
        this.a = e0;
        this.g();
    }

    public static int a(Context context0) {
        return c.c(context0).length;
    }

    public static int a(Context context0, int v) {
        try {
            return (int)(((Integer)c.b(context0).getCameraCharacteristics(c.c(context0)[v]).get(CameraCharacteristics.SENSOR_ORIENTATION)));
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
            return 0;
        }
    }

    private static int a(Range[] arr_range, int v) {
        int v1 = -1;
        double f = 1.797693E+308;
        for(int v2 = 0; v2 < arr_range.length; ++v2) {
            int v3 = (int)(((Integer)arr_range[v2].getLower()));
            int v4 = (int)(((Integer)arr_range[v2].getUpper()));
            if(((float)v) + 0.1f > ((float)v3) && ((float)v) - 0.1f < ((float)v4)) {
                return v;
            }
            double f1 = (double)(((float)Math.min(Math.abs(v - v3), Math.abs(v - v4))));
            if(f1 < f) {
                v1 = v2;
                f = f1;
            }
        }
        return v <= ((int)(((Integer)arr_range[v1].getUpper()))) ? ((int)(((Integer)arr_range[v1].getLower()))) : ((int)(((Integer)arr_range[v1].getUpper())));
    }

    private static Rect a(Size[] arr_size, double f, double f1) {
        double f2 = 1.797693E+308;
        int v1 = 0;
        int v2 = 0;
        for(int v = 0; v < arr_size.length; ++v) {
            int v3 = arr_size[v].getWidth();
            int v4 = arr_size[v].getHeight();
            double f3 = Math.abs(Math.log(f / ((double)v3))) + Math.abs(Math.log(f1 / ((double)v4)));
            if(f3 < f2) {
                v1 = v3;
                v2 = v4;
                f2 = f3;
            }
        }
        return new Rect(0, 0, v1, v2);
    }

    private void a(CameraDevice cameraDevice0) {
        synchronized(this.v) {
            this.u = null;
        }
        cameraDevice0.close();
        this.d = null;
    }

    private void a(Object object0) {
        switch(object0) {
            case 10465: {
                Object object1 = this.v;
                synchronized(object1) {
                    if(this.u != null) {
                        this.j();
                    }
                }
                return;
            }
            case 0x32A3: {
                this.p = false;
                Object object2 = this.v;
                synchronized(object2) {
                    if(this.u != null) {
                        try {
                            this.t.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                            this.t.setTag("Regular");
                            this.u.setRepeatingRequest(this.t.build(), this.A, this.g);
                        }
                        catch(CameraAccessException cameraAccessException0) {
                            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
                        }
                    }
                }
            }
        }
    }

    private static Size[] a(CameraCharacteristics cameraCharacteristics0) {
        StreamConfigurationMap streamConfigurationMap0 = (StreamConfigurationMap)cameraCharacteristics0.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if(streamConfigurationMap0 == null) {
            f.Log(6, "Camera2: configuration map is not available.");
            return null;
        }
        Size[] arr_size = streamConfigurationMap0.getOutputSizes(35);
        return arr_size == null || arr_size.length == 0 ? null : arr_size;
    }

    public final Rect a() {
        return this.h;
    }

    public final boolean a(float f, float f1) {
        if(this.k > 0) {
            if(!this.p) {
                this.l = f;
                this.m = f1;
                Object object0 = this.v;
                synchronized(object0) {
                    if(this.u != null && this.z != a.b) {
                        this.k();
                    }
                    return true;
                }
            }
            f.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public final boolean a(Context context0, int v, int v1, int v2, int v3, int v4) {
        CameraCharacteristics cameraCharacteristics0;
        try {
            cameraCharacteristics0 = c.b.getCameraCharacteristics(c.c(context0)[v]);
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
            return false;
        }
        if(((int)(((Integer)cameraCharacteristics0.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)))) == 2) {
            f.Log(5, "Camera2: only LEGACY hardware level is supported.");
            return false;
        }
        Size[] arr_size = c.a(cameraCharacteristics0);
        if(arr_size != null && arr_size.length != 0) {
            this.h = c.a(arr_size, ((double)v1), ((double)v2));
            Range[] arr_range = (Range[])cameraCharacteristics0.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if(arr_range != null && arr_range.length != 0) {
                int v5 = c.a(arr_range, v3);
                this.q = new Range(v5, v5);
                try {
                    if(!c.e.tryAcquire(4L, TimeUnit.SECONDS)) {
                        f.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                        return false;
                    }
                }
                catch(InterruptedException interruptedException0) {
                    f.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + interruptedException0);
                    return false;
                }
                try {
                    c.b.openCamera(c.c(context0)[v], this.B, this.g);
                }
                catch(CameraAccessException cameraAccessException1) {
                    f.Log(6, "Camera2: CameraAccessException " + cameraAccessException1);
                    c.e.release();
                    return false;
                }
                try {
                    if(!c.e.tryAcquire(4L, TimeUnit.SECONDS)) {
                        f.Log(5, "Camera2: Timeout waiting to open camera.");
                        return false;
                    }
                    c.e.release();
                }
                catch(InterruptedException interruptedException1) {
                    f.Log(6, "Camera2: Interrupted while waiting to open camera " + interruptedException1);
                }
                this.w = v4;
                this.b(cameraCharacteristics0);
                return this.d != null;
            }
            f.Log(6, "Camera2: target FPS ranges are not avialable.");
        }
        return false;
    }

    private static CameraManager b(Context context0) {
        if(c.b == null) {
            c.b = (CameraManager)context0.getSystemService("camera");
        }
        return c.b;
    }

    private void b(CameraCharacteristics cameraCharacteristics0) {
        int v = (int)(((Integer)cameraCharacteristics0.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)));
        this.k = v;
        if(v > 0) {
            Rect rect0 = (Rect)cameraCharacteristics0.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            this.i = rect0;
            float f = ((float)rect0.width()) / ((float)this.i.height());
            float f1 = ((float)this.h.width()) / ((float)this.h.height());
            if(f1 > f) {
                this.n = 0;
                this.o = (int)((((float)this.i.height()) - ((float)this.i.width()) / f1) / 2.0f);
            }
            else {
                this.o = 0;
                this.n = (int)((((float)this.i.width()) - ((float)this.i.height()) * f1) / 2.0f);
            }
            this.j = Math.min(this.i.width(), this.i.height()) / 20;
        }
    }

    public static boolean b(Context context0, int v) {
        try {
            if(((int)(((Integer)c.b(context0).getCameraCharacteristics(c.c(context0)[v]).get(CameraCharacteristics.LENS_FACING)))) == 0) {
                return true;
            }
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
        }
        return false;
    }

    public final void b() {
        if(this.d != null) {
            this.e();
            this.i();
            this.A = null;
            this.y = null;
            this.x = null;
            Image image0 = this.s;
            if(image0 != null) {
                image0.close();
                this.s = null;
            }
            ImageReader imageReader0 = this.r;
            if(imageReader0 != null) {
                imageReader0.close();
                this.r = null;
            }
        }
        this.h();
    }

    public static boolean c(Context context0, int v) {
        try {
            if(((int)(((Integer)c.b(context0).getCameraCharacteristics(c.c(context0)[v]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)))) > 0) {
                return true;
            }
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
        }
        return false;
    }

    private static String[] c(Context context0) {
        if(c.c == null) {
            try {
                c.c = c.b(context0).getCameraIdList();
                return c.c;
            }
            catch(CameraAccessException cameraAccessException0) {
                f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
                c.c = new String[0];
            }
        }
        return c.c;
    }

    public final void c() {
        if(this.r == null) {
            ImageReader imageReader0 = ImageReader.newInstance(this.h.width(), this.h.height(), 35, 2);
            this.r = imageReader0;
            imageReader0.setOnImageAvailableListener(this.C, this.g);
            this.s = null;
            if(this.w != 0) {
                SurfaceTexture surfaceTexture0 = new SurfaceTexture(this.w);
                this.x = surfaceTexture0;
                surfaceTexture0.setDefaultBufferSize(this.h.width(), this.h.height());
                this.x.setOnFrameAvailableListener(this.D, this.g);
                this.y = new Surface(this.x);
            }
        }
        try {
            if(this.u == null) {
                Surface surface0 = this.y;
                this.d.createCaptureSession((surface0 == null ? Arrays.asList(new Surface[]{this.r.getSurface()}) : Arrays.asList(new Surface[]{surface0, this.r.getSurface()})), new CameraCaptureSession.StateCallback() {
                    final c a;

                    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession0) {
                        f.Log(6, "Camera2: CaptureSession configuration failed.");
                    }

                    @Override  // android.hardware.camera2.CameraCaptureSession$StateCallback
                    public final void onConfigured(CameraCaptureSession cameraCaptureSession0) {
                        String s;
                        if(c.this.d == null) {
                            return;
                        }
                        synchronized(c.this.v) {
                            c.this.u = cameraCaptureSession0;
                            try {
                                CaptureRequest.Builder captureRequest$Builder0 = c.this.d.createCaptureRequest(1);
                                c.this.t = captureRequest$Builder0;
                                if(c.this.y != null) {
                                    c.this.t.addTarget(c.this.y);
                                }
                                c.this.t.addTarget(c.this.r.getSurface());
                                c.this.t.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c.this.q);
                                c.this.j();
                                return;
                            }
                            catch(CameraAccessException cameraAccessException0) {
                                s = "Camera2: CameraAccessException " + cameraAccessException0;
                            }
                            catch(IllegalStateException illegalStateException0) {
                                s = "Camera2: IllegalStateException " + illegalStateException0;
                            }
                            f.Log(6, s);
                        }
                    }
                }, this.g);
            }
            else if(this.z == a.b) {
                this.u.setRepeatingRequest(this.t.build(), this.A, this.g);
            }
            this.z = a.a;
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
        }
    }

    public static int d(Context context0, int v) {
        try {
            CameraCharacteristics cameraCharacteristics0 = c.b(context0).getCameraCharacteristics(c.c(context0)[v]);
            float[] arr_f = (float[])cameraCharacteristics0.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF0 = (SizeF)cameraCharacteristics0.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if(arr_f.length > 0) {
                return (int)(arr_f[0] * 36.0f / sizeF0.getWidth());
            }
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
        }
        return 0;
    }

    public final void d() {
        synchronized(this.v) {
            CameraCaptureSession cameraCaptureSession0 = this.u;
            if(cameraCaptureSession0 != null) {
                try {
                    cameraCaptureSession0.stopRepeating();
                    this.z = a.b;
                }
                catch(CameraAccessException cameraAccessException0) {
                    f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
                }
            }
        }
    }

    public static int[] e(Context context0, int v) {
        CameraCharacteristics cameraCharacteristics0;
        try {
            cameraCharacteristics0 = c.b(context0).getCameraCharacteristics(c.c(context0)[v]);
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
            return null;
        }
        Size[] arr_size = c.a(cameraCharacteristics0);
        if(arr_size != null) {
            int[] arr_v = new int[arr_size.length * 2];
            for(int v1 = 0; v1 < arr_size.length; ++v1) {
                arr_v[v1 * 2] = arr_size[v1].getWidth();
                arr_v[v1 * 2 + 1] = arr_size[v1].getHeight();
            }
            return arr_v;
        }
        return null;
    }

    public final void e() {
        synchronized(this.v) {
            CameraCaptureSession cameraCaptureSession0 = this.u;
            if(cameraCaptureSession0 != null) {
                try {
                    cameraCaptureSession0.abortCaptures();
                }
                catch(CameraAccessException cameraAccessException0) {
                    f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
                }
                this.u.close();
                this.u = null;
                this.z = a.c;
            }
        }
    }

    private void g() {
        HandlerThread handlerThread0 = new HandlerThread("CameraBackground");
        this.f = handlerThread0;
        handlerThread0.start();
        this.g = new Handler(this.f.getLooper());
    }

    private void h() {
        this.f.quit();
        try {
            this.f.join(4000L);
            this.f = null;
            this.g = null;
        }
        catch(InterruptedException interruptedException0) {
            this.f.interrupt();
            f.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + interruptedException0);
        }
    }

    private void i() {
        try {
            if(!c.e.tryAcquire(4L, TimeUnit.SECONDS)) {
                f.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
        }
        catch(InterruptedException interruptedException0) {
            f.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + interruptedException0);
            return;
        }
        this.d.close();
        try {
            if(!c.e.tryAcquire(4L, TimeUnit.SECONDS)) {
                f.Log(5, "Camera2: Timeout waiting to close camera.");
            }
        }
        catch(InterruptedException interruptedException1) {
            f.Log(6, "Camera2: Interrupted while waiting to close camera " + interruptedException1);
        }
        this.d = null;
        c.e.release();
    }

    private void j() {
        try {
            if(this.k != 0 && (this.l >= 0.0f && this.l <= 1.0f) && (this.m >= 0.0f && this.m <= 1.0f)) {
                this.p = true;
                int v = (int)(((float)(this.i.width() - this.n * 2)) * this.l + ((float)this.n));
                int v1 = (int)(((double)(this.i.height() - this.o * 2)) * (1.0 - ((double)this.m)) + ((double)this.o));
                int v2 = Math.max(this.j + 1, Math.min(v, this.i.width() - this.j - 1));
                int v3 = Math.max(this.j + 1, Math.min(v1, this.i.height() - this.j - 1));
                this.t.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(v2 - this.j, v3 - this.j, this.j * 2, this.j * 2, 999)});
                this.t.set(CaptureRequest.CONTROL_AF_MODE, 1);
                this.t.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                this.t.setTag("Focus");
                this.u.capture(this.t.build(), this.A, this.g);
                return;
            }
            this.t.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.t.setTag("Regular");
            CameraCaptureSession cameraCaptureSession0 = this.u;
            if(cameraCaptureSession0 != null) {
                cameraCaptureSession0.setRepeatingRequest(this.t.build(), this.A, this.g);
            }
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
        }
    }

    private void k() {
        try {
            CameraCaptureSession cameraCaptureSession0 = this.u;
            if(cameraCaptureSession0 != null) {
                cameraCaptureSession0.stopRepeating();
                this.t.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                this.t.set(CaptureRequest.CONTROL_AF_MODE, 0);
                this.t.setTag("Cancel focus");
                this.u.capture(this.t.build(), this.A, this.g);
            }
        }
        catch(CameraAccessException cameraAccessException0) {
            f.Log(6, "Camera2: CameraAccessException " + cameraAccessException0);
        }
    }
}

