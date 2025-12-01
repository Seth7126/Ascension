package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class o {
    public interface a {
        void a();
    }

    private UnityPlayer a;
    private Context b;
    private a c;
    private final Semaphore d;
    private final Lock e;
    private n f;
    private int g;
    private boolean h;
    private boolean i;

    o(UnityPlayer unityPlayer0) {
        this.a = null;
        this.b = null;
        this.d = new Semaphore(0);
        this.e = new ReentrantLock();
        this.f = null;
        this.g = 2;
        this.h = false;
        this.i = false;
        this.a = unityPlayer0;
    }

    public final void a() {
        this.e.lock();
        n n0 = this.f;
        if(n0 != null) {
            if(this.g == 0) {
                n0.cancelOnPrepare();
            }
            else if(this.i) {
                boolean z = n0.a();
                this.h = z;
                if(!z) {
                    this.f.pause();
                }
            }
        }
        this.e.unlock();
    }

    public final boolean a(Context context0, String s, int v, int v1, int v2, boolean z, long v3, long v4, a o$a0) {
        this.e.lock();
        this.c = o$a0;
        this.b = context0;
        this.d.drainPermits();
        this.g = 2;
        this.runOnUiThread(new Runnable() {
            final o h;

            @Override
            public final void run() {
                if(o.this.f != null) {
                    f.Log(5, "Video already playing");
                    o.this.g = 2;
                    o.this.d.release();
                    return;
                }
                Context context0 = o.this.b;
                com.unity3d.player.o.1.1 o$1$10 = new com.unity3d.player.n.a() {
                    final com.unity3d.player.o.1 a;

                    @Override  // com.unity3d.player.n$a
                    public final void a(int v) {
                        o.this.e.lock();
                        o.this.g = v;
                        if(v == 3 && o.this.i) {
                            com.unity3d.player.o.1.1.1 o$1$1$10 = new Runnable() {
                                final com.unity3d.player.o.1.1 a;

                                @Override
                                public final void run() {
                                    o.this.d();
                                    o.this.a.resume();
                                }
                            };
                            o.this.runOnUiThread(o$1$1$10);
                        }
                        if(v != 0) {
                            o.this.d.release();
                        }
                        o.this.e.unlock();
                    }
                };
                n n0 = new n(context0, s, v, v1, v2, z, v3, v4, o$1$10);
                o.this.f = n0;
                if(o.this.f != null) {
                    o.this.a.bringToFront();
                    o.this.a.addView(o.this.f);
                }
            }
        });
        try {
            this.e.unlock();
            this.d.acquire();
            this.e.lock();
        }
        catch(InterruptedException unused_ex) {
        }
        this.runOnUiThread(new Runnable() {
            final o a;

            @Override
            public final void run() {
                o.this.a.pause();
            }
        });
        this.runOnUiThread(new Runnable() {
            final o a;

            @Override
            public final void run() {
                o.this.d();
                o.this.a.resume();
            }
        });
        this.e.unlock();
        return false;

        final class com.unity3d.player.o.3 implements Runnable {
            final o a;

            @Override
            public final void run() {
                if(o.this.f != null) {
                    o.this.a.addViewToPlayer(o.this.f, true);
                    o.h(o.this);
                    o.this.f.requestFocus();
                }
            }
        }

    }

    public final void b() {
        this.e.lock();
        n n0 = this.f;
        if(n0 != null && this.i && !this.h) {
            n0.start();
        }
        this.e.unlock();
    }

    public final void c() {
        this.e.lock();
        n n0 = this.f;
        if(n0 != null) {
            n0.updateVideoLayout();
        }
        this.e.unlock();
    }

    private void d() {
        n n0 = this.f;
        if(n0 != null) {
            this.a.removeViewFromPlayer(n0);
            this.i = false;
            this.f.destroyPlayer();
            this.f = null;
            a o$a0 = this.c;
            if(o$a0 != null) {
                o$a0.a();
            }
        }
    }

    static boolean h(o o0) {
        o0.i = true;
        return true;
    }

    protected final void runOnUiThread(Runnable runnable0) {
        Context context0 = this.b;
        if(context0 instanceof Activity) {
            ((Activity)context0).runOnUiThread(runnable0);
            return;
        }
        f.Log(5, "Not running from an Activity; Ignoring execution request...");
    }
}

