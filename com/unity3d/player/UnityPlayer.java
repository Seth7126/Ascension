package com.unity3d.player;

import android.app.Activity;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.AlertDialog.Builder;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.provider.Settings.System;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.InputEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.Surface;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class UnityPlayer extends FrameLayout implements IUnityPlayerLifecycleEvents {
    public static enum SynchronizationTimeout {
        Pause(0),
        SurfaceDetach(1),
        Destroy(2);

        private int m_TimeoutMilliseconds;
        final int value;

        private SynchronizationTimeout(int v1) {
            this.value = v1;
            this.m_TimeoutMilliseconds = 2000;
        }

        public final int getTimeout() {
            return this.m_TimeoutMilliseconds;
        }

        public final void setTimeout(int v) {
            this.m_TimeoutMilliseconds = v;
        }

        public static void setTimeoutForAll(int v) {
            SynchronizationTimeout[] arr_unityPlayer$SynchronizationTimeout = (SynchronizationTimeout[])SynchronizationTimeout.class.getEnumConstants();
            for(int v1 = 0; v1 < arr_unityPlayer$SynchronizationTimeout.length; ++v1) {
                arr_unityPlayer$SynchronizationTimeout[v1].setTimeout(v);
            }
        }
    }

    final class a implements SensorEventListener {
        final UnityPlayer a;

        @Override  // android.hardware.SensorEventListener
        public final void onAccuracyChanged(Sensor sensor0, int v) {
        }

        @Override  // android.hardware.SensorEventListener
        public final void onSensorChanged(SensorEvent sensorEvent0) {
        }
    }

    static final class b extends Enum {
        public static final enum int a = 1;
        public static final enum int b = 2;
        public static final enum int c = 3;
        private static final int[] d;

        static {
            b.d = new int[]{1, 2, 3};
        }
    }

    final class c extends PhoneStateListener {
        final UnityPlayer a;

        private c() {
        }

        c(byte b) {
        }

        @Override  // android.telephony.PhoneStateListener
        public final void onCallStateChanged(int v, String s) {
            UnityPlayer.this.nativeMuteMasterAudio(v == 1);
        }
    }

    static enum d {
        PAUSE,
        RESUME,
        QUIT,
        SURFACE_LOST,
        SURFACE_ACQUIRED,
        FOCUS_LOST,
        FOCUS_GAINED,
        NEXT_FRAME,
        URL_ACTIVATED,
        ORIENTATION_ANGLE_CHANGE;

    }

    final class e extends Thread {
        Handler a;
        boolean b;
        boolean c;
        int d;
        int e;
        int f;
        int g;
        int h;
        final UnityPlayer i;

        private e() {
            this.b = false;
            this.c = false;
            this.d = b.b;
            this.e = 0;
            this.h = 5;
        }

        e(byte b) {
        }

        private void a(d unityPlayer$d0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                Message.obtain(handler0, 0x8DD, unityPlayer$d0).sendToTarget();
            }
        }

        public final void a() {
            this.a(d.c);
        }

        public final void a(int v, int v1) {
            this.f = v;
            this.g = v1;
            this.a(d.j);
        }

        public final void a(Runnable runnable0) {
            if(this.a == null) {
                return;
            }
            this.a(d.a);
            Message.obtain(this.a, runnable0).sendToTarget();
        }

        public final void b() {
            this.a(d.b);
        }

        public final void b(Runnable runnable0) {
            if(this.a == null) {
                return;
            }
            this.a(d.d);
            Message.obtain(this.a, runnable0).sendToTarget();
        }

        public final void c() {
            this.a(d.g);
        }

        public final void c(Runnable runnable0) {
            Handler handler0 = this.a;
            if(handler0 == null) {
                return;
            }
            Message.obtain(handler0, runnable0).sendToTarget();
            this.a(d.e);
        }

        public final void d() {
            this.a(d.f);
        }

        public final void d(Runnable runnable0) {
            Handler handler0 = this.a;
            if(handler0 != null) {
                Message.obtain(handler0, runnable0).sendToTarget();
            }
        }

        public final void e() {
            this.a(d.i);
        }

        @Override
        public final void run() {
            this.setName("UnityMain");
            Looper.prepare();
            this.a = new Handler(new Handler.Callback() {
                final e a;

                private void a() {
                    if(e.this.d == b.c && e.this.c) {
                        UnityPlayer.this.nativeFocusChanged(true);
                        e.this.d = b.a;
                    }
                }

                @Override  // android.os.Handler$Callback
                public final boolean handleMessage(Message message0) {
                    if(message0.what != 0x8DD) {
                        return false;
                    }
                    d unityPlayer$d0 = (d)message0.obj;
                    if(unityPlayer$d0 == d.h) {
                        --e.this.e;
                        UnityPlayer.this.executeGLThreadJobs();
                        if(!e.this.b) {
                            return true;
                        }
                        if(!e.this.c) {
                            return true;
                        }
                        if(e.this.h >= 0) {
                            if(e.this.h == 0) {
                                if(UnityPlayer.this.getSplashEnabled()) {
                                    UnityPlayer.this.DisableStaticSplashScreen();
                                }
                                if(UnityPlayer.this.mActivity != null && UnityPlayer.this.getAutoReportFullyDrawnEnabled()) {
                                    UnityPlayer.this.mActivity.reportFullyDrawn();
                                }
                            }
                            --e.this.h;
                        }
                        if(!UnityPlayer.this.isFinishing() && !UnityPlayer.this.nativeRender()) {
                            UnityPlayer.this.finish();
                        }
                    }
                    else if(unityPlayer$d0 == d.c) {
                        Looper.myLooper().quit();
                    }
                    else if(unityPlayer$d0 == d.b) {
                        e.this.b = true;
                    }
                    else if(unityPlayer$d0 == d.a) {
                        e.this.b = false;
                    }
                    else if(unityPlayer$d0 == d.d) {
                        e.this.c = false;
                    }
                    else if(unityPlayer$d0 == d.e) {
                        e.this.c = true;
                        this.a();
                    }
                    else if(unityPlayer$d0 == d.f) {
                        if(e.this.d == b.a) {
                            UnityPlayer.this.nativeFocusChanged(false);
                        }
                        e.this.d = b.b;
                    }
                    else if(unityPlayer$d0 == d.g) {
                        e.this.d = b.c;
                        this.a();
                    }
                    else if(unityPlayer$d0 == d.i) {
                        String s = UnityPlayer.this.getLaunchURL();
                        UnityPlayer.this.nativeSetLaunchURL(s);
                    }
                    else if(unityPlayer$d0 == d.j) {
                        UnityPlayer.this.nativeOrientationChanged(e.this.f, e.this.g);
                    }
                    if(e.this.b && e.this.e <= 0) {
                        Message.obtain(e.this.a, 0x8DD, d.h).sendToTarget();
                        ++e.this.e;
                    }
                    return true;
                }
            });
            Looper.loop();
        }
    }

    abstract class f implements Runnable {
        final UnityPlayer e;

        private f() {
        }

        f(byte b) {
        }

        public abstract void a();

        @Override
        public final void run() {
            if(!UnityPlayer.this.isFinishing()) {
                this.a();
            }
        }
    }

    private static final String ARCORE_ENABLE_METADATA_NAME = "unity.arcore-enable";
    private static final String AUTO_REPORT_FULLY_DRAWN_ENABLE_METADATA_NAME = "unity.auto-report-fully-drawn";
    private static final String LAUNCH_FULLSCREEN = "unity.launch-fullscreen";
    private static final int RUN_STATE_CHANGED_MSG_CODE = 0x8DD;
    private static final String SPLASH_ENABLE_METADATA_NAME = "unity.splash-enable";
    private static final String SPLASH_MODE_METADATA_NAME = "unity.splash-mode";
    public static Activity currentActivity;
    private Activity mActivity;
    private Context mContext;
    private SurfaceView mGlView;
    Handler mHandler;
    private int mInitialScreenOrientation;
    private boolean mIsFullscreen;
    private boolean mMainDisplayOverride;
    private int mNaturalOrientation;
    private OrientationEventListener mOrientationListener;
    private boolean mProcessKillRequested;
    private boolean mQuitting;
    i mSoftInputDialog;
    private m mState;
    private o mVideoPlayerProxy;
    private GoogleARCoreApi m_ARCoreApi;
    private boolean m_AddPhoneCallListener;
    private AudioVolumeHandler m_AudioVolumeHandler;
    private Camera2Wrapper m_Camera2Wrapper;
    private ClipboardManager m_ClipboardManager;
    private final ConcurrentLinkedQueue m_Events;
    private a m_FakeListener;
    private HFPStatus m_HFPStatus;
    e m_MainThread;
    private NetworkConnectivity m_NetworkConnectivity;
    private OrientationLockListener m_OrientationLockListener;
    private h m_PersistentUnitySurface;
    private c m_PhoneCallListener;
    private j m_SplashScreen;
    private TelephonyManager m_TelephonyManager;
    private IUnityPlayerLifecycleEvents m_UnityPlayerLifecycleEvents;
    Window m_Window;
    private Uri m_launchUri;
    private Configuration prevConfig;

    static {
        new l().a();
    }

    public UnityPlayer(Context context0) {
        this(context0, null);
    }

    public UnityPlayer(Context context0, IUnityPlayerLifecycleEvents iUnityPlayerLifecycleEvents0) {
        super(context0);
        this.mHandler = new Handler();
        this.mInitialScreenOrientation = -1;
        this.mMainDisplayOverride = false;
        this.mIsFullscreen = true;
        this.mState = new m();
        this.m_Events = new ConcurrentLinkedQueue();
        this.mOrientationListener = null;
        this.m_MainThread = new e(this, 0);
        this.m_AddPhoneCallListener = false;
        this.m_PhoneCallListener = new c(this, 0);
        this.m_ARCoreApi = null;
        this.m_FakeListener = new a(this);
        this.m_Camera2Wrapper = null;
        this.m_HFPStatus = null;
        this.m_AudioVolumeHandler = null;
        this.m_OrientationLockListener = null;
        this.m_launchUri = null;
        this.m_NetworkConnectivity = null;
        this.m_UnityPlayerLifecycleEvents = null;
        this.mProcessKillRequested = true;
        this.mSoftInputDialog = null;
        if(iUnityPlayerLifecycleEvents0 == null) {
            iUnityPlayerLifecycleEvents0 = this;
        }
        this.m_UnityPlayerLifecycleEvents = iUnityPlayerLifecycleEvents0;
        if(context0 instanceof Activity) {
            this.mActivity = (Activity)context0;
            UnityPlayer.currentActivity = (Activity)context0;
            this.mInitialScreenOrientation = ((Activity)context0).getRequestedOrientation();
            this.m_launchUri = this.mActivity.getIntent().getData();
        }
        this.mContext = context0;
        this.EarlyEnableFullScreenIfEnabled();
        Configuration configuration0 = this.getResources().getConfiguration();
        this.prevConfig = configuration0;
        this.mNaturalOrientation = this.getNaturalOrientation(configuration0.orientation);
        if(this.mActivity != null && this.getSplashEnabled()) {
            Context context1 = this.mContext;
            int[] arr_v = com.unity3d.player.j.a.a();
            j j0 = new j(context1, arr_v[this.getSplashMode()]);
            this.m_SplashScreen = j0;
            this.addView(j0);
        }
        if(UnityPlayer.currentActivity != null) {
            this.m_PersistentUnitySurface = new h(this.mContext);
        }
        UnityPlayer.preloadJavaPlugins();
        String s = UnityPlayer.loadNative(UnityPlayer.getUnityNativeLibraryPath(this.mContext));
        com.unity3d.player.f.Log(6, "Your hardware does not support this application.");
        AlertDialog alertDialog0 = new AlertDialog.Builder(this.mContext).setTitle("Failure to initialize!").setPositiveButton("OK", (/* 缺少LAMBDA参数 */, /* 缺少LAMBDA参数 */) -> UnityPlayer.this.finish()).setMessage("Your hardware does not support this application.\n\n" + s + "\n\n Press OK to quit.").create();
        alertDialog0.setCancelable(false);
        alertDialog0.show();

        final class com.unity3d.player.UnityPlayer.1 implements DialogInterface.OnClickListener {
            final UnityPlayer a;

            @Override  // android.content.DialogInterface$OnClickListener
            public final void onClick(DialogInterface dialogInterface0, int v) {
                UnityPlayer.access$600(UnityPlayer.this);
            }
        }

    }

    private SurfaceView CreateGlView() {
        SurfaceView surfaceView0 = new SurfaceView(this.mContext);
        surfaceView0.setId(this.mContext.getResources().getIdentifier("unitySurfaceView", "id", "com.playdekgames.android.Ascension"));
        if(this.IsWindowTranslucent()) {
            surfaceView0.getHolder().setFormat(-3);
            surfaceView0.setZOrderOnTop(true);
        }
        else {
            surfaceView0.getHolder().setFormat(-1);
        }
        surfaceView0.getHolder().addCallback(new SurfaceHolder.Callback() {
            final UnityPlayer a;

            @Override  // android.view.SurfaceHolder$Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
                Surface surface0 = surfaceHolder0.getSurface();
                UnityPlayer.access$1300(UnityPlayer.this, 0, surface0);
                UnityPlayer.access$1500(UnityPlayer.this);
            }

            @Override  // android.view.SurfaceHolder$Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
                Surface surface0 = surfaceHolder0.getSurface();
                UnityPlayer.access$1300(UnityPlayer.this, 0, surface0);
                if(UnityPlayer.access$1400(UnityPlayer.this) != null) {
                    UnityPlayer.access$1400(UnityPlayer.this).a(UnityPlayer.this);
                }
            }

            @Override  // android.view.SurfaceHolder$Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
                if(UnityPlayer.access$1400(UnityPlayer.this) != null) {
                    SurfaceView surfaceView0 = UnityPlayer.access$1600(UnityPlayer.this);
                    UnityPlayer.access$1400(UnityPlayer.this).a(surfaceView0);
                }
                UnityPlayer.access$1300(UnityPlayer.this, 0, null);
            }
        });
        surfaceView0.setFocusable(true);
        surfaceView0.setFocusableInTouchMode(true);
        return surfaceView0;
    }

    private void DisableStaticSplashScreen() {
        this.runOnUiThread(new Runnable() {
            final UnityPlayer a;

            @Override
            public final void run() {
                j j0 = UnityPlayer.access$1200(UnityPlayer.this);
                UnityPlayer.this.removeView(j0);
                UnityPlayer.access$1202(UnityPlayer.this, null);
            }
        });
    }

    private void EarlyEnableFullScreenIfEnabled() {
        if(this.mActivity != null && this.mActivity.getWindow() != null && (this.getLaunchFullscreen() || this.mActivity.getIntent().getBooleanExtra("android.intent.extra.VR_LAUNCH", false))) {
            View view0 = this.mActivity.getWindow().getDecorView();
            if(view0 != null) {
                view0.setSystemUiVisibility(7);
            }
        }
    }

    private String GetGlViewContentDescription(Context context0) {
        return context0.getResources().getString(context0.getResources().getIdentifier("game_view_content_description", "string", "com.playdekgames.android.Ascension"));
    }

    private boolean IsWindowTranslucent() {
        Activity activity0 = this.mActivity;
        if(activity0 == null) {
            return false;
        }
        TypedArray typedArray0 = activity0.getTheme().obtainStyledAttributes(new int[]{0x1010058});
        boolean z = typedArray0.getBoolean(0, false);
        typedArray0.recycle();
        return z;
    }

    public static void UnitySendMessage(String s, String s1, String s2) {
        com.unity3d.player.f.Log(5, "Native libraries not loaded - dropping message for " + s + "." + s1);
    }

    static j access$1200(UnityPlayer unityPlayer0) {
        return unityPlayer0.m_SplashScreen;
    }

    static j access$1202(UnityPlayer unityPlayer0, j j0) {
        unityPlayer0.m_SplashScreen = j0;
        return j0;
    }

    static void access$1300(UnityPlayer unityPlayer0, int v, Surface surface0) {
        unityPlayer0.updateGLDisplay(v, surface0);
    }

    static void access$1500(UnityPlayer unityPlayer0) {
        unityPlayer0.sendSurfaceChangedEvent();
    }

    protected void addPhoneCallListener() {
        this.m_AddPhoneCallListener = true;
        this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0x20);
    }

    public boolean addViewToPlayer(View view0, boolean z) {
        this.swapViews(view0, (z ? this.mGlView : null));
        boolean z1 = view0.getParent() == this;
        boolean z2 = z && this.mGlView.getParent() == null;
        boolean z3 = this.mGlView.getParent() == this;
        if(!z1 || !z2 && !z3) {
            if(!z1) {
                com.unity3d.player.f.Log(6, "addViewToPlayer: Failure adding view to hierarchy");
            }
            if(!z2 && !z3) {
                com.unity3d.player.f.Log(6, "addViewToPlayer: Failure removing old view from hierarchy");
            }
        }
        return true;
    }

    // 去混淆评级： 低(20)
    protected boolean canPauseUnity() {
        return this.mState.f() || !this.mState.d();
    }

    private void checkResumePlayer() {
        boolean z = this.mActivity == null ? false : MultiWindowSupport.isInMultiWindowMode(this.mActivity);
        if(!this.mState.e(z)) {
            return;
        }
        this.mState.d(true);
        this.queueGLThreadEvent(() -> {
        });
        this.m_MainThread.b();

        final class com.unity3d.player.UnityPlayer.3 implements Runnable {
            final UnityPlayer a;

            @Override
            public final void run() {
                UnityPlayer.this.nativeResume();
            }
        }

    }

    public void configurationChanged(Configuration configuration0) {
        int v = this.prevConfig.diff(configuration0);
        if((v & 0x100) != 0 || (v & 0x400) != 0 || (v & 0x800) != 0 || (v & 0x80) != 0) {
            this.nativeHidePreservedContent();
        }
        this.prevConfig = new Configuration(configuration0);
        SurfaceView surfaceView0 = this.mGlView;
        if(surfaceView0 instanceof SurfaceView) {
            surfaceView0.getHolder().setSizeFromLayout();
        }
        o o0 = this.mVideoPlayerProxy;
        if(o0 != null) {
            o0.c();
        }
    }

    // 检测为 Lambda 实现
    public void destroy() [...]

    protected void disableLogger() {
        com.unity3d.player.f.a = true;
    }

    public boolean displayChanged(int v, Surface surface0) {
        if(v == 0) {
            this.mMainDisplayOverride = surface0 != null;
            this.runOnUiThread(new Runnable() {
                final UnityPlayer a;

                @Override
                public final void run() {
                    if(UnityPlayer.this.mMainDisplayOverride) {
                        UnityPlayer.this.removeView(UnityPlayer.this.mGlView);
                        return;
                    }
                    if(UnityPlayer.this.mGlView.getParent() == null) {
                        UnityPlayer.this.addView(UnityPlayer.this.mGlView);
                        return;
                    }
                    com.unity3d.player.f.Log(5, "Couldn\'t add view, because it\'s already assigned to another parent");
                }
            });
        }
        return this.updateDisplayInternal(v, surface0);
    }

    protected void executeGLThreadJobs() {
        Runnable runnable0;
        while((runnable0 = (Runnable)this.m_Events.poll()) != null) {
            runnable0.run();
        }
    }

    private void finish() {
        if(this.mActivity != null && !this.mActivity.isFinishing()) {
            this.mActivity.finish();
        }
    }

    private boolean getARCoreEnabled() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.arcore-enable");
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    private ApplicationInfo getApplicationInfo() {
        return this.mContext.getPackageManager().getApplicationInfo("com.playdekgames.android.Ascension", 0x80);
    }

    private boolean getAutoReportFullyDrawnEnabled() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.auto-report-fully-drawn");
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    protected String getClipboardText() {
        ClipData clipData0 = this.m_ClipboardManager.getPrimaryClip();
        return clipData0 == null ? "" : clipData0.getItemAt(0).coerceToText(this.mContext).toString();
    }

    protected String getKeyboardLayout() {
        return this.mSoftInputDialog == null ? null : this.mSoftInputDialog.a();
    }

    private boolean getLaunchFullscreen() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.launch-fullscreen");
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    protected String getLaunchURL() {
        return this.m_launchUri == null ? null : this.m_launchUri.toString();
    }

    private int getNaturalOrientation(int v) {
        int v1 = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay().getRotation();
        return (v1 == 0 || v1 == 2) && v == 2 || (v1 == 1 || v1 == 3) && v == 1 ? 0 : 1;
    }

    protected int getNetworkConnectivity() {
        if(PlatformSupport.NOUGAT_SUPPORT) {
            if(this.m_NetworkConnectivity == null) {
                this.m_NetworkConnectivity = new NetworkConnectivity(this.mContext);
            }
            return this.m_NetworkConnectivity.a();
        }
        return 0;
    }

    public String getNetworkProxySettings(String s) {
        String s2;
        String s1;
        if(s.startsWith("http:")) {
            s1 = "http.proxyHost";
            s2 = "http.proxyPort";
            goto label_7;
        }
        else if(s.startsWith("https:")) {
            s1 = "https.proxyHost";
            s2 = "https.proxyPort";
        label_7:
            String s3 = System.getProperties().getProperty(s1);
            if(s3 != null && !"".equals(s3)) {
                StringBuilder stringBuilder0 = new StringBuilder(s3);
                String s4 = System.getProperties().getProperty(s2);
                if(s4 != null && !"".equals(s4)) {
                    stringBuilder0.append(":");
                    stringBuilder0.append(s4);
                }
                String s5 = System.getProperties().getProperty("http.nonProxyHosts");
                if(s5 != null && !"".equals(s5)) {
                    stringBuilder0.append('\n');
                    stringBuilder0.append(s5);
                }
                return stringBuilder0.toString();
            }
        }
        return null;
    }

    private String getProcessName() {
        int v = Process.myPid();
        List list0 = ((ActivityManager)this.mContext.getSystemService("activity")).getRunningAppProcesses();
        if(list0 == null) {
            return null;
        }
        for(Object object0: list0) {
            ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
            if(activityManager$RunningAppProcessInfo0.pid == v) {
                return activityManager$RunningAppProcessInfo0.processName;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public float getScreenBrightness() {
        Window window0 = this.m_Window;
        if(window0 == null) {
            return 1.0f;
        }
        float f = window0.getAttributes().screenBrightness;
        if(f < 0.0f) {
            int v = Settings.System.getInt(this.getContext().getContentResolver(), "screen_brightness", 0xFF);
            return PlatformSupport.PIE_SUPPORT ? ((float)Math.max(0.0, Math.min(1.0, (Math.log(v) * 19.811 - 9.411) / 100.0))) : ((float)v) / 255.0f;
        }
        return f;
    }

    public Bundle getSettings() {
        return Bundle.EMPTY;
    }

    private boolean getSplashEnabled() {
        try {
            return this.getApplicationInfo().metaData.getBoolean("unity.splash-enable");
        }
        catch(Exception unused_ex) {
            return false;
        }
    }

    protected int getSplashMode() {
        try {
            return this.getApplicationInfo().metaData.getInt("unity.splash-mode");
        }
        catch(Exception unused_ex) {
            return 0;
        }
    }

    protected int getUaaLLaunchProcessType() {
        String s = this.getProcessName();
        return s == null || s.equals("com.playdekgames.android.Ascension") ? 0 : 1;
    }

    private static String getUnityNativeLibraryPath(Context context0) {
        return context0.getApplicationInfo().nativeLibraryDir;
    }

    public View getView() {
        return this;
    }

    private void hidePreservedContent() {
        this.runOnUiThread(new Runnable() {
            final UnityPlayer a;

            @Override
            public final void run() {
                if(UnityPlayer.this.m_PersistentUnitySurface != null) {
                    UnityPlayer.this.m_PersistentUnitySurface.b(UnityPlayer.this);
                    UnityPlayer.this.m_PersistentUnitySurface.b();
                }
            }
        });
    }

    protected void hideSoftInput() {
        this.postOnUiThread(new Runnable() {
            final UnityPlayer a;

            @Override
            public final void run() {
                Rect rect0 = new Rect();
                UnityPlayer.this.reportSoftInputArea(rect0);
                UnityPlayer.this.reportSoftInputIsVisible(false);
                if(UnityPlayer.this.mSoftInputDialog != null) {
                    UnityPlayer.this.mSoftInputDialog.dismiss();
                    UnityPlayer.this.mSoftInputDialog = null;
                    UnityPlayer.this.nativeReportKeyboardConfigChanged();
                }
            }
        });
    }

    private void hideStatusBar() {
        Activity activity0 = this.mActivity;
        if(activity0 != null) {
            activity0.getWindow().setFlags(0x400, 0x400);
        }
    }

    public void init(int v, boolean z) {
    }

    private final native void initJni(Context arg1) {
    }

    protected boolean initializeGoogleAr() {
        if(this.m_ARCoreApi == null && this.mActivity != null && this.getARCoreEnabled()) {
            GoogleARCoreApi googleARCoreApi0 = new GoogleARCoreApi();
            this.m_ARCoreApi = googleARCoreApi0;
            googleARCoreApi0.initializeARCore(this.mActivity);
            if(!this.mState.d()) {
                this.m_ARCoreApi.resumeARCore();
            }
        }
        return false;
    }

    // 去混淆评级： 低(30)
    public boolean injectEvent(InputEvent inputEvent0) {
        return false;
    }

    protected boolean isFinishing() {
        if(this.mQuitting) {
            return true;
        }
        Activity activity0 = this.mActivity;
        if(activity0 != null) {
            this.mQuitting = activity0.isFinishing();
        }
        return this.mQuitting;
    }

    protected boolean isUaaLUseCase() {
        Activity activity0 = this.mActivity;
        if(activity0 != null) {
            String s = activity0.getCallingPackage();
            return s != null && s.equals("com.playdekgames.android.Ascension");
        }
        return false;
    }

    protected void kill() {
        Process.killProcess(Process.myPid());
    }

    protected boolean loadLibrary(String s) {
        try {
            System.loadLibrary(s);
            return true;
        }
        catch(UnsatisfiedLinkError | Exception unused_ex) {
            return false;
        }
    }

    private static String loadNative(String s) {
        try {
            try {
                System.load((s + "/libmain.so"));
                goto label_8;
            }
            catch(UnsatisfiedLinkError unused_ex) {
            }
            try {
                System.loadLibrary("main");
                goto label_8;
            }
            catch(UnsatisfiedLinkError unsatisfiedLinkError0) {
            }
        }
        catch(SecurityException securityException0) {
            return UnityPlayer.logLoadLibMainError((s + "/libmain.so"), securityException0.toString());
        }
        return UnityPlayer.logLoadLibMainError((s + "/libmain.so"), unsatisfiedLinkError0.toString());
    label_8:
        if(NativeLoader.load(s)) {
            m.a();
            return "";
        }
        com.unity3d.player.f.Log(6, "NativeLoader.load failure, Unity libraries were not loaded.");
        return "NativeLoader.load failure, Unity libraries were not loaded.";
    }

    private static String logLoadLibMainError(String s, String s1) {
        com.unity3d.player.f.Log(6, "Failed to load \'libmain.so\'\n\n" + s1);
        return "Failed to load \'libmain.so\'\n\n" + s1;
    }

    // 去混淆评级： 低(30)
    public void lowMemory() {

        final class com.unity3d.player.UnityPlayer.2 implements Runnable {
            final UnityPlayer a;

            @Override
            public final void run() {
                UnityPlayer.this.nativeLowMemory();
            }
        }

    }

    private final native void nativeApplicationUnload() {
    }

    private final native boolean nativeDone() {
    }

    private final native void nativeFocusChanged(boolean arg1) {
    }

    private final native void nativeHidePreservedContent() {
    }

    private final native boolean nativeInjectEvent(InputEvent arg1) {
    }

    private final native boolean nativeIsAutorotationOn() {
    }

    private final native void nativeLowMemory() {
    }

    private final native void nativeMuteMasterAudio(boolean arg1) {
    }

    private final native void nativeOrientationChanged(int arg1, int arg2) {
    }

    private final native boolean nativePause() {
    }

    private final native void nativeRecreateGfxState(int arg1, Surface arg2) {
    }

    private final native boolean nativeRender() {
    }

    private final native void nativeReportKeyboardConfigChanged() {
    }

    private final native void nativeRestartActivityIndicator() {
    }

    // 检测为 Lambda 实现
    private final native void nativeResume() [...]

    private final native void nativeSendSurfaceChangedEvent() {
    }

    private final native void nativeSetInputArea(int arg1, int arg2, int arg3, int arg4) {
    }

    private final native void nativeSetInputSelection(int arg1, int arg2) {
    }

    private final native void nativeSetInputString(String arg1) {
    }

    private final native void nativeSetKeyboardIsVisible(boolean arg1) {
    }

    private final native void nativeSetLaunchURL(String arg1) {
    }

    private final native void nativeSoftInputCanceled() {
    }

    private final native void nativeSoftInputClosed() {
    }

    private final native void nativeSoftInputLostFocus() {
    }

    private static native void nativeUnitySendMessage(String arg0, String arg1, byte[] arg2) {
    }

    public void newIntent(Intent intent0) {
        this.m_launchUri = intent0.getData();
        this.m_MainThread.e();
    }

    @Override  // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent0) {
        return this.injectEvent(motionEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyDown(int v, KeyEvent keyEvent0) {
        return this.injectEvent(keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyLongPress(int v, KeyEvent keyEvent0) {
        return this.injectEvent(keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyMultiple(int v, int v1, KeyEvent keyEvent0) {
        return this.injectEvent(keyEvent0);
    }

    @Override  // android.view.View
    public boolean onKeyUp(int v, KeyEvent keyEvent0) {
        return this.injectEvent(keyEvent0);
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        return this.injectEvent(motionEvent0);
    }

    @Override  // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerQuitted() {
    }

    @Override  // com.unity3d.player.IUnityPlayerLifecycleEvents
    public void onUnityPlayerUnloaded() {
    }

    public void pause() {
        GoogleARCoreApi googleARCoreApi0 = this.m_ARCoreApi;
        if(googleARCoreApi0 != null) {
            googleARCoreApi0.pauseARCore();
        }
        o o0 = this.mVideoPlayerProxy;
        if(o0 != null) {
            o0.a();
        }
        AudioVolumeHandler audioVolumeHandler0 = this.m_AudioVolumeHandler;
        if(audioVolumeHandler0 != null) {
            audioVolumeHandler0.a();
            this.m_AudioVolumeHandler = null;
        }
        OrientationLockListener orientationLockListener0 = this.m_OrientationLockListener;
        if(orientationLockListener0 != null) {
            orientationLockListener0.a();
            this.m_OrientationLockListener = null;
        }
        if(this.canPauseUnity()) {
            this.pauseUnity();
        }
    }

    protected void pauseJavaAndCallUnloadCallback() {
        this.runOnUiThread(new Runnable() {
            final UnityPlayer a;

            @Override
            public final void run() {
                UnityPlayer.this.pause();
                UnityPlayer.this.windowFocusChanged(false);
                UnityPlayer.this.m_UnityPlayerLifecycleEvents.onUnityPlayerUnloaded();
            }
        });
    }

    private void pauseUnity() {
        this.reportSoftInputStr(null, 1, true);
        this.mState.d(false);
        this.mState.b(true);
        if(this.m_AddPhoneCallListener) {
            this.m_TelephonyManager.listen(this.m_PhoneCallListener, 0);
        }

        final class com.unity3d.player.UnityPlayer.26 implements Runnable {
            final UnityPlayer b;

            com.unity3d.player.UnityPlayer.26(Semaphore semaphore0) {
            }

            @Override
            public final void run() {
                UnityPlayer.this.shutdown();
                this.a.release();
            }
        }


        final class com.unity3d.player.UnityPlayer.27 implements Runnable {
            final UnityPlayer b;

            com.unity3d.player.UnityPlayer.27(Semaphore semaphore0) {
            }

            @Override
            public final void run() {
                if(UnityPlayer.this.nativePause()) {
                    UnityPlayer.this.mQuitting = true;
                    UnityPlayer.this.shutdown();
                    UnityPlayer.this.queueDestroy();
                }
                this.a.release();
            }
        }

    }

    void postOnUiThread(Runnable runnable0) {
        new Handler(Looper.getMainLooper()).post(runnable0);
    }

    private static void preloadJavaPlugins() {
        try {
            Class.forName("com.unity3d.JavaPluginPreloader");
        }
        catch(ClassNotFoundException linkageError0) {
            com.unity3d.player.f.Log(6, "Java class preloading failed: " + linkageError0.getMessage());
        }
        catch(LinkageError unused_ex) {
        }
    }

    private void queueDestroy() {
        com.unity3d.player.f.Log(4, "Queue Destroy");
        this.runOnUiThread(() -> {
            h h0 = UnityPlayer.this.m_PersistentUnitySurface;
            if(h0 != null) {
                h0.a();
                UnityPlayer.this.m_PersistentUnitySurface = null;
            }
            Camera2Wrapper camera2Wrapper0 = UnityPlayer.this.m_Camera2Wrapper;
            if(camera2Wrapper0 != null) {
                camera2Wrapper0.a();
                UnityPlayer.this.m_Camera2Wrapper = null;
            }
            HFPStatus hFPStatus0 = UnityPlayer.this.m_HFPStatus;
            if(hFPStatus0 != null) {
                hFPStatus0.a();
                UnityPlayer.this.m_HFPStatus = null;
            }
            NetworkConnectivity networkConnectivity0 = UnityPlayer.this.m_NetworkConnectivity;
            if(networkConnectivity0 != null) {
                networkConnectivity0.b();
                UnityPlayer.this.m_NetworkConnectivity = null;
            }
            UnityPlayer.this.mQuitting = true;
            if(!UnityPlayer.this.mState.d()) {
                UnityPlayer.this.pause();
            }
            UnityPlayer.this.m_MainThread.a();
            try {
                UnityPlayer.this.m_MainThread.join(((long)SynchronizationTimeout.Destroy.getTimeout()));
            }
            catch(InterruptedException unused_ex) {
                UnityPlayer.this.m_MainThread.interrupt();
            }
            if(UnityPlayer.this.mProcessKillRequested) {
                UnityPlayer.this.m_UnityPlayerLifecycleEvents.onUnityPlayerQuitted();
                UnityPlayer.this.kill();
            }
            UnityPlayer.unloadNative();
        });

        final class com.unity3d.player.UnityPlayer.25 implements Runnable {
            final UnityPlayer a;

            @Override
            public final void run() {
                UnityPlayer.this.destroy();
            }
        }

    }

    private void queueGLThreadEvent(f unityPlayer$f0) {
        if(this.isFinishing()) {
            return;
        }
        this.queueGLThreadEvent(unityPlayer$f0);
    }

    // 去混淆评级： 低(30)
    void queueGLThreadEvent(Runnable runnable0) {
    }

    public void quit() {
        this.destroy();
    }

    public void removeViewFromPlayer(View view0) {
        this.swapViews(this.mGlView, view0);
        boolean z = view0.getParent() == null;
        boolean z1 = this.mGlView.getParent() == this;
        if(!z || !z1) {
            if(!z) {
                com.unity3d.player.f.Log(6, "removeViewFromPlayer: Failure removing view from hierarchy");
            }
            if(!z1) {
                com.unity3d.player.f.Log(6, "removeVireFromPlayer: Failure agging old view to hierarchy");
            }
        }
    }

    public void reportError(String s, String s1) {
        com.unity3d.player.f.Log(6, s + ": " + s1);
    }

    protected void reportSoftInputArea(Rect rect0) {
        this.queueGLThreadEvent(new f(rect0) {
            final Rect a;
            final UnityPlayer b;

            {
                UnityPlayer.this = unityPlayer0;
                this.a = rect0;
                super(0);
            }

            @Override  // com.unity3d.player.UnityPlayer$f
            public final void a() {
                UnityPlayer.this.nativeSetInputArea(this.a.left, this.a.top, this.a.right, this.a.bottom);
            }
        });
    }

    protected void reportSoftInputIsVisible(boolean z) {
        this.queueGLThreadEvent(new f(z) {
            final boolean a;
            final UnityPlayer b;

            {
                UnityPlayer.this = unityPlayer0;
                this.a = z;
                super(0);
            }

            @Override  // com.unity3d.player.UnityPlayer$f
            public final void a() {
                UnityPlayer.this.nativeSetKeyboardIsVisible(this.a);
            }
        });
    }

    protected void reportSoftInputSelection(int v, int v1) {
        this.queueGLThreadEvent(new f(v, v1) {
            final int a;
            final int b;
            final UnityPlayer c;

            {
                UnityPlayer.this = unityPlayer0;
                this.a = v;
                this.b = v1;
                super(0);
            }

            @Override  // com.unity3d.player.UnityPlayer$f
            public final void a() {
                UnityPlayer.this.nativeSetInputSelection(this.a, this.b);
            }
        });
    }

    protected void reportSoftInputStr(String s, int v, boolean z) {
        if(v == 1) {
            this.hideSoftInput();
        }
        this.queueGLThreadEvent(new f(z, s, v) {
            final boolean a;
            final String b;
            final int c;
            final UnityPlayer d;

            {
                UnityPlayer.this = unityPlayer0;
                this.a = z;
                this.b = s;
                this.c = v;
                super(0);
            }

            @Override  // com.unity3d.player.UnityPlayer$f
            public final void a() {
                if(this.a) {
                    UnityPlayer.this.nativeSoftInputCanceled();
                }
                else {
                    String s = this.b;
                    if(s != null) {
                        UnityPlayer.this.nativeSetInputString(s);
                    }
                }
                if(this.c == 1) {
                    UnityPlayer.this.nativeSoftInputClosed();
                }
            }
        });
    }

    protected void requestUserAuthorization(String s) {
        if(s != null && !s.isEmpty() && this.mActivity != null) {
            ModalWaitForPermissionResponse unityPermissions$ModalWaitForPermissionResponse0 = new ModalWaitForPermissionResponse();
            UnityPermissions.requestUserPermissions(this.mActivity, new String[]{s}, unityPermissions$ModalWaitForPermissionResponse0);
            unityPermissions$ModalWaitForPermissionResponse0.waitForResponse();
        }
    }

    public void resume() {
        GoogleARCoreApi googleARCoreApi0 = this.m_ARCoreApi;
        if(googleARCoreApi0 != null) {
            googleARCoreApi0.resumeARCore();
        }
        this.mState.b(false);
        o o0 = this.mVideoPlayerProxy;
        if(o0 != null) {
            o0.b();
        }
        this.checkResumePlayer();
        if(this.m_AudioVolumeHandler == null) {
            this.m_AudioVolumeHandler = new AudioVolumeHandler(this.mContext);
        }
    }

    void runOnAnonymousThread(Runnable runnable0) {
        new Thread(runnable0).start();
    }

    void runOnUiThread(Runnable runnable0) {
        Activity activity0 = this.mActivity;
        if(activity0 != null) {
            activity0.runOnUiThread(runnable0);
            return;
        }
        if(Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.mHandler.post(runnable0);
            return;
        }
        runnable0.run();
    }

    // 去混淆评级： 低(40)
    private void sendSurfaceChangedEvent() {

        final class com.unity3d.player.UnityPlayer.22 implements Runnable {
            final UnityPlayer a;

            @Override
            public final void run() {
                UnityPlayer.this.nativeSendSurfaceChangedEvent();
            }
        }

    }

    protected void setCharacterLimit(int v) {
        this.runOnUiThread(new Runnable() {
            final UnityPlayer b;

            @Override
            public final void run() {
                if(UnityPlayer.this.mSoftInputDialog != null) {
                    UnityPlayer.this.mSoftInputDialog.a(v);
                }
            }
        });
    }

    protected void setClipboardText(String s) {
        ClipData clipData0 = ClipData.newPlainText("Text", s);
        this.m_ClipboardManager.setPrimaryClip(clipData0);
    }

    protected void setHideInputField(boolean z) {
        this.runOnUiThread(new Runnable() {
            final UnityPlayer b;

            @Override
            public final void run() {
                if(UnityPlayer.this.mSoftInputDialog != null) {
                    UnityPlayer.this.mSoftInputDialog.a(z);
                }
            }
        });
    }

    public void setScreenBrightness(float f) {
        float f1 = Math.max(0.04f, f);
        if(this.m_Window != null && this.getScreenBrightness() != f1) {
            this.runOnUiThread(new Runnable() {
                final UnityPlayer b;

                @Override
                public final void run() {
                    WindowManager.LayoutParams windowManager$LayoutParams0 = UnityPlayer.this.m_Window.getAttributes();
                    windowManager$LayoutParams0.screenBrightness = f1;
                    UnityPlayer.this.m_Window.setAttributes(windowManager$LayoutParams0);
                }
            });
        }
    }

    protected void setSelection(int v, int v1) {
        this.runOnUiThread(new Runnable() {
            final UnityPlayer c;

            @Override
            public final void run() {
                if(UnityPlayer.this.mSoftInputDialog != null) {
                    UnityPlayer.this.mSoftInputDialog.a(v, v1);
                }
            }
        });
    }

    protected void setSoftInputStr(String s) {
        this.runOnUiThread(new Runnable() {
            final UnityPlayer b;

            @Override
            public final void run() {
                if(UnityPlayer.this.mSoftInputDialog != null && s != null) {
                    UnityPlayer.this.mSoftInputDialog.a(s);
                }
            }
        });
    }

    protected void showSoftInput(String s, int v, boolean z, boolean z1, boolean z2, boolean z3, String s1, int v1, boolean z4, boolean z5) {
        this.postOnUiThread(new Runnable() {
            final UnityPlayer l;

            @Override
            public final void run() {
                UnityPlayer.this.mSoftInputDialog = new i(UnityPlayer.this.mContext, this, s, v, z, z1, z2, s1, v1, z4, z5);
                UnityPlayer.this.mSoftInputDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
                    final com.unity3d.player.UnityPlayer.4 a;

                    @Override  // android.content.DialogInterface$OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface0) {
                        UnityPlayer.this.nativeSoftInputLostFocus();
                        UnityPlayer.this.reportSoftInputStr(null, 1, false);
                    }
                });
                UnityPlayer.this.mSoftInputDialog.show();
                UnityPlayer.this.nativeReportKeyboardConfigChanged();
            }
        });
    }

    protected boolean showVideoPlayer(String s, int v, int v1, int v2, boolean z, int v3, int v4) {
        if(this.mVideoPlayerProxy == null) {
            this.mVideoPlayerProxy = new o(this);
        }
        boolean z1 = this.mVideoPlayerProxy.a(this.mContext, s, v, v1, v2, z, ((long)v3), ((long)v4), new com.unity3d.player.o.a() {
            final UnityPlayer a;

            @Override  // com.unity3d.player.o$a
            public final void a() {
                UnityPlayer.this.mVideoPlayerProxy = null;
            }
        });
        if(z1) {
            this.runOnUiThread(new Runnable() {
                final UnityPlayer a;

                @Override
                public final void run() {
                    if(UnityPlayer.this.nativeIsAutorotationOn() && UnityPlayer.this.mActivity != null) {
                        ((Activity)UnityPlayer.this.mContext).setRequestedOrientation(UnityPlayer.this.mInitialScreenOrientation);
                    }
                }
            });
        }
        return z1;
    }

    private void shutdown() {
        this.mProcessKillRequested = this.nativeDone();
        this.mState.c(false);
    }

    protected boolean skipPermissionsDialog() {
        return this.mActivity == null ? false : UnityPermissions.skipPermissionsDialog(this.mActivity);
    }

    public boolean startOrientationListener(int v) {
        String s;
        if(this.mOrientationListener == null) {
            com.unity3d.player.UnityPlayer.19 unityPlayer$190 = new OrientationEventListener(this.mContext, v) {
                final UnityPlayer a;

                @Override  // android.view.OrientationEventListener
                public final void onOrientationChanged(int v) {
                    UnityPlayer.this.m_MainThread.a(UnityPlayer.this.mNaturalOrientation, v);
                }
            };
            this.mOrientationListener = unityPlayer$190;
            if(unityPlayer$190.canDetectOrientation()) {
                this.mOrientationListener.enable();
                return true;
            }
            s = "Orientation Listener cannot detect orientation.";
        }
        else {
            s = "Orientation Listener already started.";
        }
        com.unity3d.player.f.Log(5, s);
        return false;
    }

    public boolean stopOrientationListener() {
        OrientationEventListener orientationEventListener0 = this.mOrientationListener;
        if(orientationEventListener0 == null) {
            com.unity3d.player.f.Log(5, "Orientation Listener was not started.");
            return false;
        }
        orientationEventListener0.disable();
        this.mOrientationListener = null;
        return true;
    }

    private void swapViews(View view0, View view1) {
        boolean z;
        if(this.mState.d()) {
            z = false;
        }
        else {
            this.pause();
            z = true;
        }
        if(view0 != null) {
            ViewParent viewParent0 = view0.getParent();
            if(!(viewParent0 instanceof UnityPlayer) || ((UnityPlayer)viewParent0) != this) {
                if(viewParent0 instanceof ViewGroup) {
                    ((ViewGroup)viewParent0).removeView(view0);
                }
                this.addView(view0);
                this.bringChildToFront(view0);
                view0.setVisibility(0);
            }
        }
        if(view1 != null && view1.getParent() == this) {
            view1.setVisibility(8);
            this.removeView(view1);
        }
        if(z) {
            this.resume();
        }
    }

    protected void toggleGyroscopeSensor(boolean z) {
        SensorManager sensorManager0 = (SensorManager)this.mContext.getSystemService("sensor");
        Sensor sensor0 = sensorManager0.getDefaultSensor(11);
        if(z) {
            sensorManager0.registerListener(this.m_FakeListener, sensor0, 1);
            return;
        }
        sensorManager0.unregisterListener(this.m_FakeListener);
    }

    public void unload() {
        this.nativeApplicationUnload();
    }

    // 去混淆评级： 低(40)
    private static void unloadNative() {
    }

    // 去混淆评级： 中等(50)
    private boolean updateDisplayInternal(int v, Surface surface0) {
        return false;

        final class com.unity3d.player.UnityPlayer.23 implements Runnable {
            final UnityPlayer d;

            com.unity3d.player.UnityPlayer.23(int v, Surface surface0, Semaphore semaphore0) {
            }

            @Override
            public final void run() {
                UnityPlayer.this.nativeRecreateGfxState(this.a, this.b);
                this.c.release();
            }
        }

    }

    private void updateGLDisplay(int v, Surface surface0) {
        if(this.mMainDisplayOverride) {
            return;
        }
        this.updateDisplayInternal(v, surface0);
    }

    public void windowFocusChanged(boolean z) {
        this.mState.a(z);
        if(this.mState.e() && (this.mSoftInputDialog == null || this.mSoftInputDialog.a)) {
            if(z) {
                this.m_MainThread.c();
            }
            else {
                this.m_MainThread.d();
            }
            this.checkResumePlayer();
        }
    }
}

