package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class BundleCompat {
    static class BundleCompatBaseImpl {
        private static final String TAG = "BundleCompatBaseImpl";
        private static Method sGetIBinderMethod;
        private static boolean sGetIBinderMethodFetched;
        private static Method sPutIBinderMethod;
        private static boolean sPutIBinderMethodFetched;

        public static IBinder getBinder(Bundle bundle0, String s) {
            if(!BundleCompatBaseImpl.sGetIBinderMethodFetched) {
                try {
                    Method method0 = Bundle.class.getMethod("getIBinder", String.class);
                    BundleCompatBaseImpl.sGetIBinderMethod = method0;
                    method0.setAccessible(true);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", noSuchMethodException0);
                }
                BundleCompatBaseImpl.sGetIBinderMethodFetched = true;
            }
            Method method1 = BundleCompatBaseImpl.sGetIBinderMethod;
            if(method1 != null) {
                try {
                    return (IBinder)method1.invoke(bundle0, s);
                }
                catch(InvocationTargetException | IllegalAccessException | IllegalArgumentException invocationTargetException0) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", invocationTargetException0);
                    BundleCompatBaseImpl.sGetIBinderMethod = null;
                }
            }
            return null;
        }

        public static void putBinder(Bundle bundle0, String s, IBinder iBinder0) {
            if(!BundleCompatBaseImpl.sPutIBinderMethodFetched) {
                try {
                    Method method0 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    BundleCompatBaseImpl.sPutIBinderMethod = method0;
                    method0.setAccessible(true);
                }
                catch(NoSuchMethodException noSuchMethodException0) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", noSuchMethodException0);
                }
                BundleCompatBaseImpl.sPutIBinderMethodFetched = true;
            }
            Method method1 = BundleCompatBaseImpl.sPutIBinderMethod;
            if(method1 != null) {
                try {
                    method1.invoke(bundle0, s, iBinder0);
                }
                catch(InvocationTargetException | IllegalAccessException | IllegalArgumentException invocationTargetException0) {
                    Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", invocationTargetException0);
                    BundleCompatBaseImpl.sPutIBinderMethod = null;
                }
            }
        }
    }

    public static IBinder getBinder(Bundle bundle0, String s) {
        return bundle0.getBinder(s);
    }

    public static void putBinder(Bundle bundle0, String s, IBinder iBinder0) {
        bundle0.putBinder(s, iBinder0);
    }
}

