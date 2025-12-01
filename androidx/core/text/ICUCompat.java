package androidx.core.text;

import android.icu.util.ULocale;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public final class ICUCompat {
    private static final String TAG = "ICUCompat";
    private static Method sAddLikelySubtagsMethod;
    private static Method sGetScriptMethod;

    static {
        if(Build.VERSION.SDK_INT < 24) {
            try {
                ICUCompat.sAddLikelySubtagsMethod = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            }
            catch(Exception exception0) {
                throw new IllegalStateException(exception0);
            }
        }
    }

    private static String addLikelySubtags(Locale locale0) {
        String s = locale0.toString();
        Method method0 = ICUCompat.sAddLikelySubtagsMethod;
        if(method0 != null) {
            try {
                return (String)method0.invoke(null, s);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.w("ICUCompat", illegalAccessException0);
                return s;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.w("ICUCompat", invocationTargetException0);
                return s;
            }
        }
        return s;
    }

    private static String getScript(String s) {
        Method method0 = ICUCompat.sGetScriptMethod;
        if(method0 != null) {
            try {
                return (String)method0.invoke(null, s);
            }
            catch(IllegalAccessException illegalAccessException0) {
                Log.w("ICUCompat", illegalAccessException0);
                return null;
            }
            catch(InvocationTargetException invocationTargetException0) {
                Log.w("ICUCompat", invocationTargetException0);
                return null;
            }
        }
        return null;
    }

    public static String maximizeAndGetScript(Locale locale0) {
        if(Build.VERSION.SDK_INT >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale0)).getScript();
        }
        try {
            return ((Locale)ICUCompat.sAddLikelySubtagsMethod.invoke(null, locale0)).getScript();
        }
        catch(InvocationTargetException invocationTargetException0) {
            Log.w("ICUCompat", invocationTargetException0);
            return locale0.getScript();
        }
        catch(IllegalAccessException illegalAccessException0) {
            Log.w("ICUCompat", illegalAccessException0);
            return locale0.getScript();
        }
    }
}

