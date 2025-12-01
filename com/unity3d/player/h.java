package com.unity3d.player;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.PixelCopy.OnPixelCopyFinishedListener;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

final class h implements Application.ActivityLifecycleCallbacks {
    final class a extends View implements PixelCopy.OnPixelCopyFinishedListener {
        Bitmap a;
        final h b;

        a(Context context0) {
            super(context0);
        }

        public final void a(SurfaceView surfaceView0) {
            Bitmap bitmap0 = Bitmap.createBitmap(surfaceView0.getWidth(), surfaceView0.getHeight(), Bitmap.Config.ARGB_8888);
            this.a = bitmap0;
            PixelCopy.request(surfaceView0, bitmap0, this, new Handler(Looper.getMainLooper()));
        }

        @Override  // android.view.PixelCopy$OnPixelCopyFinishedListener
        public final void onPixelCopyFinished(int v) {
            if(v == 0) {
                this.setBackground(new LayerDrawable(new Drawable[]{new ColorDrawable(0xFF000000), new BitmapDrawable(this.getResources(), this.a)}));
            }
        }
    }

    WeakReference a;
    Activity b;
    a c;

    h(Context context0) {
        this.a = new WeakReference(null);
        this.c = null;
        if(context0 instanceof Activity) {
            this.b = (Activity)context0;
            ((Activity)context0).getApplication().registerActivityLifecycleCallbacks(this);
        }
    }

    public final void a() {
        Activity activity0 = this.b;
        if(activity0 != null) {
            activity0.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public final void a(SurfaceView surfaceView0) {
        if(PlatformSupport.NOUGAT_SUPPORT) {
            if(this.c == null) {
                this.c = new a(this, this.b);
            }
            this.c.a(surfaceView0);
        }
    }

    public final void a(ViewGroup viewGroup0) {
        if(this.c != null && this.c.getParent() == null) {
            viewGroup0.addView(this.c);
            viewGroup0.bringChildToFront(this.c);
        }
    }

    public final void b() {
        this.c = null;
    }

    public final void b(ViewGroup viewGroup0) {
        if(this.c != null && this.c.getParent() != null) {
            viewGroup0.removeView(this.c);
        }
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity0) {
        this.a = new WeakReference(activity0);
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity0, Bundle bundle0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity0) {
    }

    @Override  // android.app.Application$ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity0) {
    }
}

