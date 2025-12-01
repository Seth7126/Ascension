package com.unity3d.player;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public final class g extends Fragment {
    final class a implements Runnable {
        final g a;
        private IPermissionRequestCallbacks b;
        private String c;
        private int d;
        private boolean e;

        a(IPermissionRequestCallbacks iPermissionRequestCallbacks0, String s, int v, boolean z) {
            this.b = iPermissionRequestCallbacks0;
            this.c = s;
            this.d = v;
            this.e = z;
        }

        @Override
        public final void run() {
            int v = this.d;
            if(v == -1) {
                if(Build.VERSION.SDK_INT < 30 && !this.e) {
                    this.b.onPermissionDeniedAndDontAskAgain(this.c);
                    return;
                }
                this.b.onPermissionDenied(this.c);
                return;
            }
            if(v == 0) {
                this.b.onPermissionGranted(this.c);
            }
        }
    }

    private final IPermissionRequestCallbacks a;
    private final Activity b;
    private final Looper c;

    public g() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public g(Activity activity0, IPermissionRequestCallbacks iPermissionRequestCallbacks0) {
        this.a = iPermissionRequestCallbacks0;
        this.b = activity0;
        this.c = Looper.myLooper();
    }

    // 检测为 Lambda 实现
    private void a(String[] arr_s) [...]

    @Override  // android.app.Fragment
    public final void onCreate(Bundle bundle0) {
        super.onCreate(bundle0);
        this.requestPermissions(this.getArguments().getStringArray("PermissionNames"), 96489);
    }

    @Override  // android.app.Fragment
    public final void onRequestPermissionsResult(int v, String[] arr_s, int[] arr_v) {
        if(v != 96489) {
            return;
        }
        if(arr_s.length != 0) {
            for(int v1 = 0; v1 < arr_s.length && v1 < arr_v.length; ++v1) {
                IPermissionRequestCallbacks iPermissionRequestCallbacks0 = this.a;
                if(iPermissionRequestCallbacks0 != null && this.b != null && this.c != null) {
                    if(iPermissionRequestCallbacks0 instanceof ModalWaitForPermissionResponse) {
                        iPermissionRequestCallbacks0.onPermissionGranted(arr_s[v1]);
                    }
                    else {
                        String s = arr_s[v1];
                        if(s == null) {
                            s = "<null>";
                        }
                        Handler handler0 = new Handler(this.c);
                        int v2 = arr_v[v1];
                        boolean z = this.b.shouldShowRequestPermissionRationale(s);
                        handler0.post(new a(this, this.a, s, v2, z));
                    }
                }
            }
        }
        else if(this.a != null && this.b != null && this.c != null) {
            String[] arr_s1 = this.getArguments().getStringArray("PermissionNames");
            if(this.a instanceof ModalWaitForPermissionResponse) {
                this.a(arr_s1);
            }
            else {
                new Handler(this.c).post(() -> for(int v = 0; v < this.a.length; ++v) {
                    g.this.a.onPermissionDenied(this.a[v]);
                });
            }
        }
        FragmentTransaction fragmentTransaction0 = this.getActivity().getFragmentManager().beginTransaction();
        fragmentTransaction0.remove(this);
        fragmentTransaction0.commit();

        final class com.unity3d.player.g.1 implements Runnable {
            final g b;

            com.unity3d.player.g.1(String[] arr_s) {
            }

            @Override
            public final void run() {
                g.this.a(this.a);
            }
        }

    }
}

