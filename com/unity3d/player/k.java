package com.unity3d.player;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.System;

final class k {
    public interface a {
        void b();
    }

    final class b extends ContentObserver {
        final k a;
        private a b;

        public b(Handler handler0, a k$a0) {
            super(handler0);
            this.b = k$a0;
        }

        @Override  // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        @Override  // android.database.ContentObserver
        public final void onChange(boolean z) {
            a k$a0 = this.b;
            if(k$a0 != null) {
                k$a0.b();
            }
        }
    }

    private Context a;
    private b b;

    public k(Context context0) {
        this.a = context0;
    }

    public final void a() {
        if(this.b != null) {
            this.a.getContentResolver().unregisterContentObserver(this.b);
            this.b = null;
        }
    }

    public final void a(a k$a0, String s) {
        this.b = new b(this, new Handler(Looper.getMainLooper()), k$a0);
        this.a.getContentResolver().registerContentObserver(Settings.System.getUriFor(s), true, this.b);
    }
}

