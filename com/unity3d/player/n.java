package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer.OnBufferingUpdateListener;
import android.media.MediaPlayer.OnCompletionListener;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.MediaPlayer.OnVideoSizeChangedListener;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.FrameLayout;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.MediaController;
import java.io.FileInputStream;
import java.io.IOException;

public final class n extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    public interface a {
        void a(int arg1);
    }

    public final class b implements Runnable {
        final n a;
        private n b;
        private boolean c;

        public b(n n1) {
            this.b = n1;
            this.c = false;
        }

        public final void a() {
            this.c = true;
        }

        @Override
        public final void run() {
            try {
                Thread.sleep(5000L);
            }
            catch(InterruptedException unused_ex) {
                Thread.currentThread().interrupt();
            }
            if(!this.c) {
                this.b.cancelOnPrepare();
            }
        }
    }

    private static boolean a;
    private final Context b;
    private final SurfaceView c;
    private final SurfaceHolder d;
    private final String e;
    private final int f;
    private final int g;
    private final boolean h;
    private final long i;
    private final long j;
    private final FrameLayout k;
    private final Display l;
    private int m;
    private int n;
    private int o;
    private int p;
    private MediaPlayer q;
    private MediaController r;
    private boolean s;
    private boolean t;
    private int u;
    private boolean v;
    private boolean w;
    private a x;
    private b y;
    private volatile int z;

    static {
    }

    protected n(Context context0, String s, int v, int v1, int v2, boolean z, long v3, long v4, a n$a0) {
        super(context0);
        this.s = false;
        this.t = false;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.z = 0;
        this.x = n$a0;
        this.b = context0;
        this.k = this;
        SurfaceView surfaceView0 = new SurfaceView(context0);
        this.c = surfaceView0;
        SurfaceHolder surfaceHolder0 = surfaceView0.getHolder();
        this.d = surfaceHolder0;
        surfaceHolder0.addCallback(this);
        this.setBackgroundColor(v);
        this.addView(surfaceView0);
        this.l = ((WindowManager)context0.getSystemService("window")).getDefaultDisplay();
        this.e = s;
        this.f = v1;
        this.g = v2;
        this.h = z;
        this.i = v3;
        this.j = v4;
        if(n.a) {
            n.b(("fileName: " + s));
        }
        if(n.a) {
            n.b(("backgroundColor: " + v));
        }
        if(n.a) {
            n.b(("controlMode: " + v1));
        }
        if(n.a) {
            n.b(("scalingMode: " + v2));
        }
        if(n.a) {
            n.b(("isURL: " + z));
        }
        if(n.a) {
            n.b(("videoOffset: " + v3));
        }
        if(n.a) {
            n.b(("videoLength: " + v4));
        }
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
    }

    private void a(int v) {
        this.z = v;
        a n$a0 = this.x;
        if(n$a0 != null) {
            n$a0.a(this.z);
        }
    }

    static void a(String s) {
        n.b(s);
    }

    final boolean a() {
        return this.v;
    }

    private static void b(String s) {
        Log.i("Video", "VideoPlayer: " + s);
    }

    static boolean b() [...] // 潜在的解密器

    private void c() {
        FileInputStream fileInputStream0;
        MediaPlayer mediaPlayer0 = this.q;
        if(mediaPlayer0 != null) {
            mediaPlayer0.setDisplay(this.d);
            if(!this.v) {
                if(n.a) {
                    n.b("Resuming playback");
                }
                this.q.start();
            }
            return;
        }
        this.a(0);
        this.doCleanUp();
        try {
            MediaPlayer mediaPlayer1 = new MediaPlayer();
            this.q = mediaPlayer1;
            if(this.h) {
                Uri uri0 = Uri.parse(this.e);
                mediaPlayer1.setDataSource(this.b, uri0);
            }
            else if(this.j == 0L) {
                AssetManager assetManager0 = this.getResources().getAssets();
                try {
                    AssetFileDescriptor assetFileDescriptor0 = assetManager0.openFd(this.e);
                    this.q.setDataSource(assetFileDescriptor0.getFileDescriptor(), assetFileDescriptor0.getStartOffset(), assetFileDescriptor0.getLength());
                    assetFileDescriptor0.close();
                    goto label_28;
                }
                catch(IOException unused_ex) {
                    fileInputStream0 = new FileInputStream(this.e);
                    this.q.setDataSource(fileInputStream0.getFD());
                }
            label_27:
                fileInputStream0.close();
            }
            else {
                fileInputStream0 = new FileInputStream(this.e);
                this.q.setDataSource(fileInputStream0.getFD(), this.i, this.j);
                goto label_27;
            }
        label_28:
            this.q.setDisplay(this.d);
            this.q.setScreenOnWhilePlaying(true);
            this.q.setOnBufferingUpdateListener(this);
            this.q.setOnCompletionListener(this);
            this.q.setOnPreparedListener(this);
            this.q.setOnVideoSizeChangedListener(this);
            this.q.setAudioStreamType(3);
            this.q.prepareAsync();
            this.y = new b(this, this);
            new Thread(this.y).start();
        }
        catch(Exception exception0) {
            if(n.a) {
                n.b(("error: " + exception0.getMessage() + exception0));
            }
            this.a(2);
        }
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    public final void cancelOnPrepare() {
        this.a(2);
    }

    private void d() {
        if(this.isPlaying()) {
            return;
        }
        this.a(1);
        if(n.a) {
            n.b("startVideoPlayback");
        }
        this.updateVideoLayout();
        if(!this.v) {
            this.start();
        }
    }

    protected final void destroyPlayer() {
        if(n.a) {
            n.b("destroyPlayer");
        }
        if(!this.v) {
            this.pause();
        }
        this.doCleanUp();
    }

    protected final void doCleanUp() {
        b n$b0 = this.y;
        if(n$b0 != null) {
            n$b0.a();
            this.y = null;
        }
        MediaPlayer mediaPlayer0 = this.q;
        if(mediaPlayer0 != null) {
            mediaPlayer0.reset();
            this.q.release();
            this.q = null;
        }
        this.o = 0;
        this.p = 0;
        this.t = false;
        this.s = false;
    }

    public final boolean exitOnKeypress(int v, KeyEvent keyEvent0) {
        if(v != 4 && (this.f != 2 || v == 0 || keyEvent0.isSystem())) {
            return false;
        }
        this.destroyPlayer();
        this.a(3);
        return true;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final int getAudioSessionId() {
        return this.q == null ? 0 : this.q.getAudioSessionId();
    }

    // 去混淆评级： 低(20)
    @Override  // android.widget.MediaController$MediaPlayerControl
    public final int getBufferPercentage() {
        return this.h ? this.u : 100;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final int getCurrentPosition() {
        return this.q == null ? 0 : this.q.getCurrentPosition();
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final int getDuration() {
        return this.q == null ? 0 : this.q.getDuration();
    }

    // 去混淆评级： 低(30)
    @Override  // android.widget.MediaController$MediaPlayerControl
    public final boolean isPlaying() {
        boolean z = this.t && this.s;
        return this.q == null ? !z : this.q.isPlaying() || !z;
    }

    @Override  // android.media.MediaPlayer$OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer0, int v) {
        if(n.a) {
            n.b(("onBufferingUpdate percent:" + v));
        }
        this.u = v;
    }

    @Override  // android.media.MediaPlayer$OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer0) {
        if(n.a) {
            n.b("onCompletion called");
        }
        this.destroyPlayer();
        this.a(3);
    }

    @Override  // android.view.View
    public final boolean onKeyDown(int v, KeyEvent keyEvent0) {
        if(this.exitOnKeypress(v, keyEvent0)) {
            return true;
        }
        MediaController mediaController0 = this.r;
        return mediaController0 == null ? super.onKeyDown(v, keyEvent0) : mediaController0.onKeyDown(v, keyEvent0);
    }

    @Override  // android.view.View
    public final boolean onKeyUp(int v, KeyEvent keyEvent0) {
        if(this.exitOnKeypress(v, keyEvent0)) {
            return true;
        }
        MediaController mediaController0 = this.r;
        return mediaController0 == null ? super.onKeyUp(v, keyEvent0) : mediaController0.onKeyUp(v, keyEvent0);
    }

    @Override  // android.media.MediaPlayer$OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer0) {
        if(n.a) {
            n.b("onPrepared called");
        }
        b n$b0 = this.y;
        if(n$b0 != null) {
            n$b0.a();
            this.y = null;
        }
        if(this.f == 0 || this.f == 1) {
            MediaController mediaController0 = new MediaController(this.b);
            this.r = mediaController0;
            mediaController0.setMediaPlayer(this);
            this.r.setAnchorView(this);
            this.r.setEnabled(true);
            Context context0 = this.b;
            if(context0 instanceof Activity) {
                this.r.setSystemUiVisibility(((Activity)context0).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.r.show();
        }
        this.t = true;
        if(this.s) {
            this.d();
        }
    }

    @Override  // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent0) {
        int v = motionEvent0.getAction();
        if(this.f == 2 && (v & 0xFF) == 0) {
            this.destroyPlayer();
            this.a(3);
            return true;
        }
        MediaController mediaController0 = this.r;
        return mediaController0 == null ? super.onTouchEvent(motionEvent0) : mediaController0.onTouchEvent(motionEvent0);
    }

    @Override  // android.media.MediaPlayer$OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer0, int v, int v1) {
        if(n.a) {
            n.b(("onVideoSizeChanged called " + v + "x" + v1));
        }
        if(v != 0 && v1 != 0) {
            this.s = true;
            this.o = v;
            this.p = v1;
            if(this.t) {
                this.d();
            }
            return;
        }
        if(n.a) {
            n.b(("invalid video width(" + v + ") or height(" + v1 + ")"));
        }
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final void pause() {
        MediaPlayer mediaPlayer0 = this.q;
        if(mediaPlayer0 == null) {
            return;
        }
        if(this.w) {
            mediaPlayer0.pause();
        }
        this.v = true;
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final void seekTo(int v) {
        MediaPlayer mediaPlayer0 = this.q;
        if(mediaPlayer0 == null) {
            return;
        }
        mediaPlayer0.seekTo(v);
    }

    @Override  // android.widget.MediaController$MediaPlayerControl
    public final void start() {
        if(n.a) {
            n.b("Start");
        }
        MediaPlayer mediaPlayer0 = this.q;
        if(mediaPlayer0 == null) {
            return;
        }
        if(this.w) {
            mediaPlayer0.start();
        }
        this.v = false;
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder0, int v, int v1, int v2) {
        if(n.a) {
            n.b(("surfaceChanged called " + v + " " + v1 + "x" + v2));
        }
        if(this.m != v1 || this.n != v2) {
            this.m = v1;
            this.n = v2;
            if(this.w) {
                this.updateVideoLayout();
            }
        }
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder0) {
        if(n.a) {
            n.b("surfaceCreated called");
        }
        this.w = true;
        this.c();
    }

    @Override  // android.view.SurfaceHolder$Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder0) {
        if(n.a) {
            n.b("surfaceDestroyed called");
        }
        this.w = false;
    }

    protected final void updateVideoLayout() {
        if(n.a) {
            n.b("updateVideoLayout");
        }
        if(this.q == null) {
            return;
        }
        if(this.m == 0 || this.n == 0) {
            WindowManager windowManager0 = (WindowManager)this.b.getSystemService("window");
            DisplayMetrics displayMetrics0 = new DisplayMetrics();
            windowManager0.getDefaultDisplay().getMetrics(displayMetrics0);
            this.m = displayMetrics0.widthPixels;
            this.n = displayMetrics0.heightPixels;
        }
        int v = this.m;
        int v1 = this.n;
        if(this.s) {
            int v2 = this.o;
            int v3 = this.p;
            float f = ((float)v2) / ((float)v3);
            float f1 = ((float)v) / ((float)v1);
            int v4 = this.g;
            if(v4 != 1) {
                switch(v4) {
                    case 0: {
                        v = v2;
                        v1 = v3;
                        break;
                    }
                    case 2: {
                        if(f1 >= f) {
                            v1 = (int)(((float)v) / f);
                        }
                        else {
                            v = (int)(((float)v1) * f);
                        }
                    }
                }
            }
            else if(f1 <= f) {
                v1 = (int)(((float)v) / f);
            }
            else {
                v = (int)(((float)v1) * f);
            }
        }
        else if(n.a) {
            n.b("updateVideoLayout: Video size is not known yet");
        }
        if(this.m != v || this.n != v1) {
            if(n.a) {
                n.b(("frameWidth = " + v + "; frameHeight = " + v1));
            }
            FrameLayout.LayoutParams frameLayout$LayoutParams0 = new FrameLayout.LayoutParams(v, v1, 17);
            this.k.updateViewLayout(this.c, frameLayout$LayoutParams0);
        }
    }
}

