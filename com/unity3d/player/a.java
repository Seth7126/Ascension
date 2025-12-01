package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.google.android.play.core.assetpacks.AssetPackManager;
import com.google.android.play.core.assetpacks.AssetPackManagerFactory;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class a implements d {
    static final class com.unity3d.player.a.a implements Runnable {
        private Set a;
        private String b;
        private int c;
        private long d;
        private long e;
        private int f;
        private int g;

        com.unity3d.player.a.a(Set set0, String s, int v, long v1, long v2, int v3, int v4) {
            this.a = set0;
            this.b = s;
            this.c = v;
            this.d = v1;
            this.e = v2;
            this.f = v3;
            this.g = v4;
        }

        @Override
        public final void run() {
            for(Object object0: this.a) {
                ((IAssetPackManagerDownloadStatusCallback)object0).onStatusUpdate(this.b, this.c, this.d, this.e, this.f, this.g);
            }
        }
    }

    final class b implements AssetPackStateUpdateListener {
        final a a;
        private HashSet b;
        private Looper c;

        public b(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0) {
            this(iAssetPackManagerDownloadStatusCallback0, Looper.myLooper());
        }

        public b(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0, Looper looper0) {
            HashSet hashSet0 = new HashSet();
            this.b = hashSet0;
            hashSet0.add(iAssetPackManagerDownloadStatusCallback0);
            this.c = looper0;
        }

        private static Set a(HashSet hashSet0) {
            return (Set)hashSet0.clone();
        }

        private void a(AssetPackState assetPackState0) {
            synchronized(this) {
                switch(assetPackState0.status()) {
                    case 0: 
                    case 4: 
                    case 5: {
                        a a0 = a.a;
                        synchronized(a0) {
                            a.this.c.remove(assetPackState0.name());
                            if(a.this.c.isEmpty()) {
                                a.this.a(a.this.d);
                                a.c(a.this);
                            }
                        }
                    }
                }
                if(this.b.size() == 0) {
                    return;
                }
                Handler handler0 = new Handler(this.c);
                Set set0 = b.a(this.b);
                int v2 = assetPackState0.status();
                long v3 = assetPackState0.totalBytesToDownload();
                long v4 = assetPackState0.bytesDownloaded();
                int v5 = assetPackState0.transferProgressPercentage();
                int v6 = assetPackState0.errorCode();
                handler0.post(new com.unity3d.player.a.a(set0, assetPackState0.name(), v2, v3, v4, v5, v6));
            }
        }

        public final void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0) {
            synchronized(this) {
                this.b.add(iAssetPackManagerDownloadStatusCallback0);
            }
        }

        @Override  // com.google.android.play.core.listener.StateUpdatedListener
        public final void onStateUpdate(Object object0) {
            this.a(((AssetPackState)object0));
        }
    }

    static final class c implements OnSuccessListener {
        static final class com.unity3d.player.a.c.a implements Runnable {
            private IAssetPackManagerMobileDataConfirmationCallback a;
            private boolean b;

            com.unity3d.player.a.c.a(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback0, boolean z) {
                this.a = iAssetPackManagerMobileDataConfirmationCallback0;
                this.b = z;
            }

            @Override
            public final void run() {
                this.a.onMobileDataConfirmationResult(this.b);
            }
        }

        private IAssetPackManagerMobileDataConfirmationCallback a;
        private Looper b;

        public c(IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback0) {
            this.a = iAssetPackManagerMobileDataConfirmationCallback0;
            this.b = Looper.myLooper();
        }

        private void a(Integer integer0) {
            if(this.a != null) {
                new Handler(this.b).post(new com.unity3d.player.a.c.a(this.a, ((int)integer0) == -1));
            }
        }

        @Override  // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(Object object0) {
            this.a(((Integer)object0));
        }
    }

    static final class com.unity3d.player.a.d implements OnCompleteListener {
        private IAssetPackManagerDownloadStatusCallback a;
        private Looper b;
        private String c;

        public com.unity3d.player.a.d(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0, String s) {
            this.a = iAssetPackManagerDownloadStatusCallback0;
            this.b = Looper.myLooper();
            this.c = s;
        }

        private void a(String s, int v, int v1, long v2) {
            new Handler(this.b).post(new com.unity3d.player.a.a(Collections.singleton(this.a), s, v, v2, (v == 4 ? v2 : 0L), 0, v1));
        }

        @Override  // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task0) {
            AssetPackStates assetPackStates0;
            try {
                assetPackStates0 = (AssetPackStates)task0.getResult();
            }
            catch(RuntimeExecutionException runtimeExecutionException0) {
                this.a(this.c, 0, a.b(runtimeExecutionException0), 0L);
                return;
            }
            Map map0 = assetPackStates0.packStates();
            if(map0.size() == 0) {
                return;
            }
            for(Object object0: map0.values()) {
                AssetPackState assetPackState0 = (AssetPackState)object0;
                if(assetPackState0.errorCode() == 0) {
                    switch(assetPackState0.status()) {
                        case 0: 
                        case 4: 
                        case 5: {
                            break;
                        }
                        default: {
                            a.a.a(assetPackState0.name(), this.a, this.b);
                            continue;
                        }
                    }
                }
                int v = assetPackState0.status();
                int v1 = assetPackState0.errorCode();
                long v2 = assetPackStates0.totalBytes();
                this.a(assetPackState0.name(), v, v1, v2);
            }
        }
    }

    static final class e implements OnCompleteListener {
        static final class com.unity3d.player.a.e.a implements Runnable {
            private IAssetPackManagerStatusQueryCallback a;
            private long b;
            private String[] c;
            private int[] d;
            private int[] e;

            com.unity3d.player.a.e.a(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback0, long v, String[] arr_s, int[] arr_v, int[] arr_v1) {
                this.a = iAssetPackManagerStatusQueryCallback0;
                this.b = v;
                this.c = arr_s;
                this.d = arr_v;
                this.e = arr_v1;
            }

            @Override
            public final void run() {
                this.a.onStatusResult(this.b, this.c, this.d, this.e);
            }
        }

        private IAssetPackManagerStatusQueryCallback a;
        private Looper b;
        private String[] c;

        public e(IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback0, String[] arr_s) {
            this.a = iAssetPackManagerStatusQueryCallback0;
            this.b = Looper.myLooper();
            this.c = arr_s;
        }

        @Override  // com.google.android.gms.tasks.OnCompleteListener
        public final void onComplete(Task task0) {
            AssetPackStates assetPackStates0;
            int v;
            if(this.a == null) {
                return;
            }
            try {
                v = 0;
                assetPackStates0 = (AssetPackStates)task0.getResult();
            }
            catch(RuntimeExecutionException runtimeExecutionException0) {
                String s = runtimeExecutionException0.getMessage();
                String[] arr_s = this.c;
                for(int v1 = 0; v1 < arr_s.length; ++v1) {
                    String s1 = arr_s[v1];
                    if(s.contains(s1)) {
                        Handler handler0 = new Handler(this.b);
                        IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback0 = this.a;
                        int[] arr_v = {a.b(runtimeExecutionException0)};
                        handler0.post(new com.unity3d.player.a.e.a(iAssetPackManagerStatusQueryCallback0, 0L, new String[]{s1}, new int[]{0}, arr_v));
                        return;
                    }
                }
                String[] arr_s1 = this.c;
                int[] arr_v1 = new int[arr_s1.length];
                int[] arr_v2 = new int[arr_s1.length];
                for(int v2 = 0; v2 < this.c.length; ++v2) {
                    arr_v1[v2] = 0;
                    arr_v2[v2] = a.b(runtimeExecutionException0);
                }
                new Handler(this.b).post(new com.unity3d.player.a.e.a(this.a, 0L, this.c, arr_v1, arr_v2));
                return;
            }
            Map map0 = assetPackStates0.packStates();
            int v3 = map0.size();
            String[] arr_s2 = new String[v3];
            int[] arr_v3 = new int[v3];
            int[] arr_v4 = new int[v3];
            for(Object object0: map0.values()) {
                arr_s2[v] = ((AssetPackState)object0).name();
                arr_v3[v] = ((AssetPackState)object0).status();
                arr_v4[v] = ((AssetPackState)object0).errorCode();
                ++v;
            }
            new Handler(this.b).post(new com.unity3d.player.a.e.a(this.a, assetPackStates0.totalBytes(), arr_s2, arr_v3, arr_v4));
        }
    }

    private static a a;
    private AssetPackManager b;
    private HashSet c;
    private Object d;

    private a(Context context0) {
        if(a.a != null) {
            throw new RuntimeException("AssetPackManagerWrapper should be created only once. Use getInstance() instead.");
        }
        this.b = AssetPackManagerFactory.getInstance(context0);
        this.c = new HashSet();
    }

    public static d a(Context context0) {
        if(a.a == null) {
            a.a = new a(context0);
        }
        return a.a;
    }

    private void a(String s, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0, Looper looper0) {
        synchronized(a.a) {
            Object object0 = this.d;
            if(object0 == null) {
                b a$b0 = new b(this, iAssetPackManagerDownloadStatusCallback0, looper0);
                this.b.registerListener(a$b0);
                this.d = a$b0;
            }
            else {
                ((b)object0).a(iAssetPackManagerDownloadStatusCallback0);
            }
            this.c.add(s);
            this.b.fetch(Collections.singletonList(s));
        }
    }

    @Override  // com.unity3d.player.d
    public final Object a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0) {
        b a$b0 = new b(this, iAssetPackManagerDownloadStatusCallback0);
        this.b.registerListener(a$b0);
        return a$b0;
    }

    @Override  // com.unity3d.player.d
    public final String a(String s) {
        AssetPackLocation assetPackLocation0 = this.b.getPackLocation(s);
        return assetPackLocation0 == null ? "" : assetPackLocation0.assetsPath();
    }

    @Override  // com.unity3d.player.d
    public final void a(Activity activity0, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback0) {
        this.b.showCellularDataConfirmation(activity0).addOnSuccessListener(new c(iAssetPackManagerMobileDataConfirmationCallback0));
    }

    @Override  // com.unity3d.player.d
    public final void a(Object object0) {
        if(!(object0 instanceof b)) {
            return;
        }
        this.b.unregisterListener(((b)object0));
    }

    @Override  // com.unity3d.player.d
    public final void a(String[] arr_s) {
        this.b.cancel(Arrays.asList(arr_s));
    }

    @Override  // com.unity3d.player.d
    public final void a(String[] arr_s, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback0) {
        for(int v = 0; v < arr_s.length; ++v) {
            String s = arr_s[v];
            this.b.getPackStates(Collections.singletonList(s)).addOnCompleteListener(new com.unity3d.player.a.d(iAssetPackManagerDownloadStatusCallback0, s));
        }
    }

    @Override  // com.unity3d.player.d
    public final void a(String[] arr_s, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback0) {
        this.b.getPackStates(Arrays.asList(arr_s)).addOnCompleteListener(new e(iAssetPackManagerStatusQueryCallback0, arr_s));
    }

    private static int b(Throwable throwable0) {
        do {
            if(throwable0 instanceof AssetPackException) {
                return ((AssetPackException)throwable0).getErrorCode();
            }
            throwable0 = throwable0.getCause();
        }
        while(throwable0 != null);
        return -100;
    }

    @Override  // com.unity3d.player.d
    public final void b(String s) {
        this.b.removePack(s);
    }

    static Object c(a a0) {
        a0.d = null;
        return null;
    }
}

