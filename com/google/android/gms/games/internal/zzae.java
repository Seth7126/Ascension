package com.google.android.gms.games.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.view.Display;
import android.view.View.OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.internal.games.zzfg;
import java.lang.ref.WeakReference;

public final class zzae implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    private boolean zzdm;
    private zzf zzes;
    private zzfg zzet;
    private WeakReference zzeu;

    private zzae(zzf zzf0, int v) {
        this.zzdm = false;
        this.zzes = zzf0;
        this.zzet = new zzfg(v, null);
    }

    @Override  // android.view.ViewTreeObserver$OnGlobalLayoutListener
    public final void onGlobalLayout() {
        WeakReference weakReference0 = this.zzeu;
        if(weakReference0 == null) {
            return;
        }
        View view0 = (View)weakReference0.get();
        if(view0 == null) {
            return;
        }
        this.zzc(view0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view0) {
        this.zzc(view0);
    }

    @Override  // android.view.View$OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view0) {
        this.zzes.zzbd();
        view0.removeOnAttachStateChangeListener(this);
    }

    public final void setGravity(int v) {
        this.zzet.gravity = v;
    }

    public static zzae zza(zzf zzf0, int v) {
        return new zzae(zzf0, v);
    }

    public final void zzb(View view0) {
        this.zzes.zzbd();
        WeakReference weakReference0 = this.zzeu;
        if(weakReference0 != null) {
            View view1 = (View)weakReference0.get();
            Context context0 = this.zzes.getContext();
            if(view1 == null && context0 instanceof Activity) {
                view1 = ((Activity)context0).getWindow().getDecorView();
            }
            if(view1 != null) {
                view1.removeOnAttachStateChangeListener(this);
                view1.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
        this.zzeu = null;
        Context context1 = this.zzes.getContext();
        if(view0 == null && context1 instanceof Activity) {
            Activity activity0 = (Activity)context1;
            try {
                view0 = activity0.findViewById(0x1020002);
            }
            catch(IllegalStateException unused_ex) {
            }
            if(view0 == null) {
                view0 = activity0.getWindow().getDecorView();
            }
            zzz.w("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments");
        }
        if(view0 != null) {
            this.zzc(view0);
            this.zzeu = new WeakReference(view0);
            view0.addOnAttachStateChangeListener(this);
            view0.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        zzz.e("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client\'s calls. Use setViewForPopups() to set your content view.");
    }

    public final Bundle zzbl() {
        return this.zzet.zzce();
    }

    public final IBinder zzbm() {
        return this.zzet.zzjn;
    }

    public final zzfg zzbn() {
        return this.zzet;
    }

    public final void zzbo() {
        if(this.zzet.zzjn != null) {
            this.zzes.zza(this.zzet.zzjn, this.zzet.zzce());
            this.zzdm = false;
            return;
        }
        this.zzdm = true;
    }

    private final void zzc(View view0) {
        int v = -1;
        Display display0 = view0.getDisplay();
        if(display0 != null) {
            v = display0.getDisplayId();
        }
        IBinder iBinder0 = view0.getWindowToken();
        int[] arr_v = new int[2];
        view0.getLocationInWindow(arr_v);
        int v1 = view0.getWidth();
        int v2 = view0.getHeight();
        this.zzet.zzjo = v;
        this.zzet.zzjn = iBinder0;
        this.zzet.left = arr_v[0];
        this.zzet.top = arr_v[1];
        this.zzet.right = arr_v[0] + v1;
        this.zzet.bottom = arr_v[1] + v2;
        if(this.zzdm) {
            this.zzbo();
        }
    }
}

