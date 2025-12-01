package androidx.core.location;

import android.location.GnssStatus.Callback;
import android.location.GnssStatus;
import android.location.GpsStatus.Listener;
import android.location.GpsStatus;
import android.location.LocationManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.SimpleArrayMap;
import androidx.core.os.ExecutorCompat;
import androidx.core.util.Preconditions;
import java.lang.reflect.Field;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class LocationManagerCompat {
    static class Api28Impl {
        public static boolean isLocationEnabled(LocationManager locationManager0) {
            return locationManager0.isLocationEnabled();
        }
    }

    static class GnssStatusTransport extends GnssStatus.Callback {
        final Callback mCallback;

        GnssStatusTransport(Callback gnssStatusCompat$Callback0) {
            Preconditions.checkArgument(gnssStatusCompat$Callback0 != null, "invalid null callback");
            this.mCallback = gnssStatusCompat$Callback0;
        }

        @Override  // android.location.GnssStatus$Callback
        public void onFirstFix(int v) {
        }

        @Override  // android.location.GnssStatus$Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus0) {
            GnssStatusCompat.wrap(gnssStatus0);
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStarted() {
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStopped() {
        }
    }

    static class GpsStatusTransport implements GpsStatus.Listener {
        final Callback mCallback;
        volatile Executor mExecutor;
        private final LocationManager mLocationManager;

        GpsStatusTransport(LocationManager locationManager0, Callback gnssStatusCompat$Callback0) {
            Preconditions.checkArgument(gnssStatusCompat$Callback0 != null, "invalid null callback");
            this.mLocationManager = locationManager0;
            this.mCallback = gnssStatusCompat$Callback0;
        }

        @Override  // android.location.GpsStatus$Listener
        public void onGpsStatusChanged(int v) {
            Executor executor0 = this.mExecutor;
            if(executor0 == null) {
                return;
            }
            switch(v) {
                case 1: {
                    executor0.execute(new Runnable() {
                        @Override
                        public void run() {
                            if(GpsStatusTransport.this.mExecutor != executor0) {
                            }
                        }
                    });
                    return;
                }
                case 2: {
                    executor0.execute(new Runnable() {
                        @Override
                        public void run() {
                            if(GpsStatusTransport.this.mExecutor != executor0) {
                            }
                        }
                    });
                    return;
                }
                case 3: {
                    GpsStatus gpsStatus0 = this.mLocationManager.getGpsStatus(null);
                    if(gpsStatus0 != null) {
                        executor0.execute(new Runnable() {
                            @Override
                            public void run() {
                                if(GpsStatusTransport.this.mExecutor != executor0) {
                                }
                            }
                        });
                        return;
                    }
                    break;
                }
                case 4: {
                    GpsStatus gpsStatus1 = this.mLocationManager.getGpsStatus(null);
                    if(gpsStatus1 != null) {
                        executor0.execute(new Runnable() {
                            @Override
                            public void run() {
                                if(GpsStatusTransport.this.mExecutor != executor0) {
                                }
                            }
                        });
                        return;
                    }
                    break;
                }
            }
        }

        public void register(Executor executor0) {
            Preconditions.checkState(this.mExecutor == null);
            this.mExecutor = executor0;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    static class InlineHandlerExecutor implements Executor {
        private final Handler mHandler;

        InlineHandlerExecutor(Handler handler0) {
            this.mHandler = (Handler)Preconditions.checkNotNull(handler0);
        }

        @Override
        public void execute(Runnable runnable0) {
            if(Looper.myLooper() == this.mHandler.getLooper()) {
                runnable0.run();
                return;
            }
            Runnable runnable1 = (Runnable)Preconditions.checkNotNull(runnable0);
            if(!this.mHandler.post(runnable1)) {
                throw new RejectedExecutionException(this.mHandler + " is shutting down");
            }
        }
    }

    static class PreRGnssStatusTransport extends GnssStatus.Callback {
        final Callback mCallback;
        volatile Executor mExecutor;

        PreRGnssStatusTransport(Callback gnssStatusCompat$Callback0) {
            Preconditions.checkArgument(gnssStatusCompat$Callback0 != null, "invalid null callback");
            this.mCallback = gnssStatusCompat$Callback0;
        }

        @Override  // android.location.GnssStatus$Callback
        public void onFirstFix(int v) {
            Executor executor0 = this.mExecutor;
            if(executor0 == null) {
                return;
            }
            executor0.execute(new Runnable() {
                @Override
                public void run() {
                    if(PreRGnssStatusTransport.this.mExecutor != executor0) {
                    }
                }
            });
        }

        @Override  // android.location.GnssStatus$Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus0) {
            Executor executor0 = this.mExecutor;
            if(executor0 == null) {
                return;
            }
            executor0.execute(new Runnable() {
                @Override
                public void run() {
                    if(PreRGnssStatusTransport.this.mExecutor != executor0) {
                        return;
                    }
                    GnssStatusCompat.wrap(gnssStatus0);
                }
            });
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStarted() {
            Executor executor0 = this.mExecutor;
            if(executor0 == null) {
                return;
            }
            executor0.execute(new Runnable() {
                @Override
                public void run() {
                    if(PreRGnssStatusTransport.this.mExecutor != executor0) {
                    }
                }
            });
        }

        @Override  // android.location.GnssStatus$Callback
        public void onStopped() {
            Executor executor0 = this.mExecutor;
            if(executor0 == null) {
                return;
            }
            executor0.execute(new Runnable() {
                @Override
                public void run() {
                    if(PreRGnssStatusTransport.this.mExecutor != executor0) {
                    }
                }
            });
        }

        public void register(Executor executor0) {
            boolean z = true;
            Preconditions.checkArgument(executor0 != null, "invalid null executor");
            if(this.mExecutor != null) {
                z = false;
            }
            Preconditions.checkState(z);
            this.mExecutor = executor0;
        }

        public void unregister() {
            this.mExecutor = null;
        }
    }

    private static final long PRE_N_LOOPER_TIMEOUT_S = 4L;
    private static Field sContextField;
    private static final SimpleArrayMap sGnssStatusListeners;

    static {
        LocationManagerCompat.sGnssStatusListeners = new SimpleArrayMap();
    }

    // 去混淆评级： 低(20)
    public static boolean isLocationEnabled(LocationManager locationManager0) {
        return Build.VERSION.SDK_INT < 28 ? locationManager0.isProviderEnabled("network") || locationManager0.isProviderEnabled("gps") : Api28Impl.isLocationEnabled(locationManager0);
    }

    private static boolean registerGnssStatusCallback(LocationManager locationManager0, Handler handler0, Executor executor0, Callback gnssStatusCompat$Callback0) {
        int v6;
        int v5;
        long v4;
        long v3;
        if(Build.VERSION.SDK_INT >= 30) {
            SimpleArrayMap simpleArrayMap0 = LocationManagerCompat.sGnssStatusListeners;
            synchronized(simpleArrayMap0) {
                GnssStatusTransport locationManagerCompat$GnssStatusTransport0 = (GnssStatusTransport)simpleArrayMap0.get(gnssStatusCompat$Callback0);
                if(locationManagerCompat$GnssStatusTransport0 == null) {
                    locationManagerCompat$GnssStatusTransport0 = new GnssStatusTransport(gnssStatusCompat$Callback0);
                }
                if(locationManager0.registerGnssStatusCallback(executor0, locationManagerCompat$GnssStatusTransport0)) {
                    simpleArrayMap0.put(gnssStatusCompat$Callback0, locationManagerCompat$GnssStatusTransport0);
                    return true;
                }
                return false;
            }
        }
        if(Build.VERSION.SDK_INT >= 24) {
            Preconditions.checkArgument(handler0 != null);
            SimpleArrayMap simpleArrayMap1 = LocationManagerCompat.sGnssStatusListeners;
            synchronized(simpleArrayMap1) {
                PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport0 = (PreRGnssStatusTransport)simpleArrayMap1.get(gnssStatusCompat$Callback0);
                if(locationManagerCompat$PreRGnssStatusTransport0 == null) {
                    locationManagerCompat$PreRGnssStatusTransport0 = new PreRGnssStatusTransport(gnssStatusCompat$Callback0);
                }
                else {
                    locationManagerCompat$PreRGnssStatusTransport0.unregister();
                }
                locationManagerCompat$PreRGnssStatusTransport0.register(executor0);
                if(locationManager0.registerGnssStatusCallback(locationManagerCompat$PreRGnssStatusTransport0, handler0)) {
                    simpleArrayMap1.put(gnssStatusCompat$Callback0, locationManagerCompat$PreRGnssStatusTransport0);
                    return true;
                }
                return false;
            }
        }
        Preconditions.checkArgument(handler0 != null);
        SimpleArrayMap simpleArrayMap2 = LocationManagerCompat.sGnssStatusListeners;
        synchronized(simpleArrayMap2) {
            GpsStatusTransport locationManagerCompat$GpsStatusTransport0 = (GpsStatusTransport)simpleArrayMap2.get(gnssStatusCompat$Callback0);
            if(locationManagerCompat$GpsStatusTransport0 == null) {
                locationManagerCompat$GpsStatusTransport0 = new GpsStatusTransport(locationManager0, gnssStatusCompat$Callback0);
            }
            else {
                locationManagerCompat$GpsStatusTransport0.unregister();
            }
            locationManagerCompat$GpsStatusTransport0.register(executor0);
            FutureTask futureTask0 = new FutureTask(new Callable() {
                public Boolean call() {
                    return Boolean.valueOf(locationManager0.addGpsStatusListener(locationManagerCompat$GpsStatusTransport0));
                }

                @Override
                public Object call() throws Exception {
                    return this.call();
                }
            });
            if(Looper.myLooper() == handler0.getLooper()) {
                futureTask0.run();
                goto label_49;
            }
            if(handler0.post(futureTask0)) {
                try {
                label_49:
                    v3 = TimeUnit.SECONDS.toNanos(4L);
                    v4 = System.nanoTime() + v3;
                    v5 = 0;
                }
                catch(ExecutionException executionException0) {
                    try {
                        v6 = 0;
                        goto label_70;
                    }
                    catch(Throwable throwable0) {
                        goto label_79;
                    }
                }
                catch(TimeoutException timeoutException0) {
                    v6 = 0;
                    throw new IllegalStateException(handler0 + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", timeoutException0);
                }
                catch(Throwable throwable0) {
                    v6 = 0;
                    goto label_82;
                }
                while(true) {
                    try {
                    label_62:
                        if(!((Boolean)futureTask0.get(v3, TimeUnit.NANOSECONDS)).booleanValue()) {
                            break;
                        }
                        LocationManagerCompat.sGnssStatusListeners.put(gnssStatusCompat$Callback0, locationManagerCompat$GpsStatusTransport0);
                        return true;
                    }
                    catch(InterruptedException unused_ex) {
                    }
                    catch(ExecutionException executionException0) {
                        goto label_69;
                    }
                    catch(TimeoutException timeoutException0) {
                        goto label_76;
                    }
                    catch(Throwable throwable0) {
                        goto label_81;
                    }
                    v3 = v4 - System.nanoTime();
                    v5 = 1;
                    goto label_62;
                label_69:
                    v6 = v5;
                    try {
                    label_70:
                        if(executionException0.getCause() instanceof RuntimeException) {
                            throw (RuntimeException)executionException0.getCause();
                        }
                        if(!(executionException0.getCause() instanceof Error)) {
                            throw new IllegalStateException(executionException0);
                        }
                        throw (Error)executionException0.getCause();
                    label_76:
                        v6 = v5;
                        throw new IllegalStateException(handler0 + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", timeoutException0);
                    }
                    catch(Throwable throwable0) {
                    label_79:
                        goto label_82;
                    }
                label_81:
                    v6 = v5;
                label_82:
                    if(v6 != 0) {
                        Thread.currentThread().interrupt();
                    }
                    throw throwable0;
                }
                return false;
            }
        }
        throw new IllegalStateException(handler0 + " is shutting down");
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager0, Callback gnssStatusCompat$Callback0, Handler handler0) {
        return Build.VERSION.SDK_INT < 30 ? LocationManagerCompat.registerGnssStatusCallback(locationManager0, new InlineHandlerExecutor(handler0), gnssStatusCompat$Callback0) : LocationManagerCompat.registerGnssStatusCallback(locationManager0, ExecutorCompat.create(handler0), gnssStatusCompat$Callback0);
    }

    public static boolean registerGnssStatusCallback(LocationManager locationManager0, Executor executor0, Callback gnssStatusCompat$Callback0) {
        if(Build.VERSION.SDK_INT >= 30) {
            return LocationManagerCompat.registerGnssStatusCallback(locationManager0, null, executor0, gnssStatusCompat$Callback0);
        }
        Looper looper0 = Looper.myLooper();
        if(looper0 == null) {
            looper0 = Looper.getMainLooper();
        }
        return LocationManagerCompat.registerGnssStatusCallback(locationManager0, new Handler(looper0), executor0, gnssStatusCompat$Callback0);
    }

    public static void unregisterGnssStatusCallback(LocationManager locationManager0, Callback gnssStatusCompat$Callback0) {
        if(Build.VERSION.SDK_INT >= 30) {
            SimpleArrayMap simpleArrayMap0 = LocationManagerCompat.sGnssStatusListeners;
            synchronized(simpleArrayMap0) {
                GnssStatusTransport locationManagerCompat$GnssStatusTransport0 = (GnssStatusTransport)simpleArrayMap0.remove(gnssStatusCompat$Callback0);
                if(locationManagerCompat$GnssStatusTransport0 != null) {
                    locationManager0.unregisterGnssStatusCallback(locationManagerCompat$GnssStatusTransport0);
                }
            }
            return;
        }
        if(Build.VERSION.SDK_INT >= 24) {
            SimpleArrayMap simpleArrayMap1 = LocationManagerCompat.sGnssStatusListeners;
            synchronized(simpleArrayMap1) {
                PreRGnssStatusTransport locationManagerCompat$PreRGnssStatusTransport0 = (PreRGnssStatusTransport)simpleArrayMap1.remove(gnssStatusCompat$Callback0);
                if(locationManagerCompat$PreRGnssStatusTransport0 != null) {
                    locationManagerCompat$PreRGnssStatusTransport0.unregister();
                    locationManager0.unregisterGnssStatusCallback(locationManagerCompat$PreRGnssStatusTransport0);
                }
            }
            return;
        }
        SimpleArrayMap simpleArrayMap2 = LocationManagerCompat.sGnssStatusListeners;
        synchronized(simpleArrayMap2) {
            GpsStatusTransport locationManagerCompat$GpsStatusTransport0 = (GpsStatusTransport)simpleArrayMap2.remove(gnssStatusCompat$Callback0);
            if(locationManagerCompat$GpsStatusTransport0 != null) {
                locationManagerCompat$GpsStatusTransport0.unregister();
                locationManager0.removeGpsStatusListener(locationManagerCompat$GpsStatusTransport0);
            }
        }
    }
}

