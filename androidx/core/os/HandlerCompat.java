package androidx.core.os;

import android.os.Build.VERSION;
import android.os.Handler.Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;

public final class HandlerCompat {
    private static final String TAG = "HandlerCompat";

    public static Handler createAsync(Looper looper0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper0);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, null, Boolean.TRUE);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException unused_ex) {
            Log.v("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor");
            return new Handler(looper0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(!(throwable0 instanceof Error)) {
                throw new RuntimeException(throwable0);
            }
            throw (Error)throwable0;
        }
    }

    public static Handler createAsync(Looper looper0, Handler.Callback handler$Callback0) {
        if(Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper0, handler$Callback0);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper0, handler$Callback0, Boolean.TRUE);
        }
        catch(IllegalAccessException | InstantiationException | NoSuchMethodException unused_ex) {
            Log.v("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor");
            return new Handler(looper0, handler$Callback0);
        }
        catch(InvocationTargetException invocationTargetException0) {
            Throwable throwable0 = invocationTargetException0.getCause();
            if(throwable0 instanceof RuntimeException) {
                throw (RuntimeException)throwable0;
            }
            if(!(throwable0 instanceof Error)) {
                throw new RuntimeException(throwable0);
            }
            throw (Error)throwable0;
        }
    }

    public static boolean postDelayed(Handler handler0, Runnable runnable0, Object object0, long v) {
        if(Build.VERSION.SDK_INT >= 28) {
            return handler0.postDelayed(runnable0, object0, v);
        }
        Message message0 = Message.obtain(handler0, runnable0);
        message0.obj = object0;
        return handler0.sendMessageDelayed(message0, v);
    }
}

