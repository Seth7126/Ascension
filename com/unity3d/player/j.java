package com.unity3d.player;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;

public final class j extends View {
    static final class a extends Enum {
        public static final enum int a = 1;
        public static final enum int b = 2;
        public static final enum int c = 3;
        private static final int[] d;

        static {
            a.d = new int[]{1, 2, 3};
        }

        public static int[] a() {
            return (int[])a.d.clone();
        }
    }

    final int a;
    final int b;
    Bitmap c;
    Bitmap d;

    public j(Context context0, int v) {
        super(context0);
        this.a = v;
        int v1 = this.getResources().getIdentifier("unity_static_splash", "drawable", "com.playdekgames.android.Ascension");
        this.b = v1;
        if(v1 != 0) {
            this.forceLayout();
        }
    }

    @Override  // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap0 = this.c;
        if(bitmap0 != null) {
            bitmap0.recycle();
            this.c = null;
        }
        Bitmap bitmap1 = this.d;
        if(bitmap1 != null) {
            bitmap1.recycle();
            this.d = null;
        }
    }

    @Override  // android.view.View
    public final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        if(this.b == 0) {
            return;
        }
        if(this.c == null) {
            BitmapFactory.Options bitmapFactory$Options0 = new BitmapFactory.Options();
            bitmapFactory$Options0.inScaled = false;
            this.c = BitmapFactory.decodeResource(this.getResources(), this.b, bitmapFactory$Options0);
        }
        int v4 = this.c.getWidth();
        int v5 = this.c.getHeight();
        int v6 = this.getWidth();
        int v7 = this.getHeight();
        if(v6 != 0 && v7 != 0) {
            float f = ((float)v4) / ((float)v5);
            int v8 = this.a;
            int v9 = com.unity3d.player.j.1.a[v8 - 1];
            switch(v9) {
                case 1: {
                    if(v6 < v4) {
                        v5 = (int)(((float)v6) / f);
                        v4 = v6;
                    }
                    if(v7 < v5) {
                        v4 = (int)(((float)v7) * f);
                        v5 = v7;
                    }
                    break;
                }
                case 2: {
                label_24:
                    if(((v8 == a.c ? 1 : 0) ^ (((float)v6) / ((float)v7) <= f ? 1 : 0)) == 0) {
                        v4 = (int)(((float)v7) * f);
                        v5 = v7;
                    }
                    else {
                        v5 = (int)(((float)v6) / f);
                        v4 = v6;
                    }
                    break;
                }
                default: {
                    if(v9 == 3) {
                        goto label_24;
                    }
                }
            }
            Bitmap bitmap0 = this.d;
            if(bitmap0 != null) {
                if(bitmap0.getWidth() == v4 && this.d.getHeight() == v5) {
                    return;
                }
                Bitmap bitmap1 = this.d;
                if(bitmap1 != this.c) {
                    bitmap1.recycle();
                    this.d = null;
                }
            }
            Bitmap bitmap2 = Bitmap.createScaledBitmap(this.c, v4, v5, true);
            this.d = bitmap2;
            bitmap2.setDensity(this.getResources().getDisplayMetrics().densityDpi);
            ColorDrawable colorDrawable0 = new ColorDrawable(0xFF000000);
            BitmapDrawable bitmapDrawable0 = new BitmapDrawable(this.getResources(), this.d);
            bitmapDrawable0.setGravity(17);
            this.setBackground(new LayerDrawable(new Drawable[]{colorDrawable0, bitmapDrawable0}));
        }
    }

    final class com.unity3d.player.j.1 {
        static final int[] a;

        static {
            int[] arr_v = new int[a.a().length];
            com.unity3d.player.j.1.a = arr_v;
            try {
                arr_v[a.a - 1] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.unity3d.player.j.1.a[a.b - 1] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                com.unity3d.player.j.1.a[a.c - 1] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
        }
    }

}

