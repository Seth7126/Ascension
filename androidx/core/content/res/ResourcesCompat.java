package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.util.Preconditions;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

public final class ResourcesCompat {
    public static abstract class FontCallback {
        public final void callbackFailAsync(int v, Handler handler0) {
            FontCallback.getHandler(handler0).post(() -> ;);

            class androidx.core.content.res.ResourcesCompat.FontCallback.2 implements Runnable {
                androidx.core.content.res.ResourcesCompat.FontCallback.2(int v) {
                }

                @Override
                public void run() {
                    FontCallback.this.onFontRetrievalFailed(this.val$reason);
                }
            }

        }

        public final void callbackSuccessAsync(Typeface typeface0, Handler handler0) {
            FontCallback.getHandler(handler0).post(() -> ;);

            class androidx.core.content.res.ResourcesCompat.FontCallback.1 implements Runnable {
                androidx.core.content.res.ResourcesCompat.FontCallback.1(Typeface typeface0) {
                }

                @Override
                public void run() {
                    FontCallback.this.onFontRetrieved(this.val$typeface);
                }
            }

        }

        public static Handler getHandler(Handler handler0) {
            return handler0 == null ? new Handler(Looper.getMainLooper()) : handler0;
        }

        // 检测为 Lambda 实现
        public abstract void onFontRetrievalFailed(int arg1);

        // 检测为 Lambda 实现
        public abstract void onFontRetrieved(Typeface arg1);
    }

    public static final class ThemeCompat {
        static class ImplApi23 {
            private static Method sRebaseMethod;
            private static boolean sRebaseMethodFetched;
            private static final Object sRebaseMethodLock;

            static {
                ImplApi23.sRebaseMethodLock = new Object();
            }

            static void rebase(Resources.Theme resources$Theme0) {
                synchronized(ImplApi23.sRebaseMethodLock) {
                    if(!ImplApi23.sRebaseMethodFetched) {
                        try {
                            Method method0 = Resources.Theme.class.getDeclaredMethod("rebase");
                            ImplApi23.sRebaseMethod = method0;
                            method0.setAccessible(true);
                        }
                        catch(NoSuchMethodException noSuchMethodException0) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", noSuchMethodException0);
                        }
                        ImplApi23.sRebaseMethodFetched = true;
                    }
                    Method method1 = ImplApi23.sRebaseMethod;
                    if(method1 != null) {
                        try {
                            method1.invoke(resources$Theme0);
                        }
                        catch(IllegalAccessException | InvocationTargetException illegalAccessException0) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", illegalAccessException0);
                            ImplApi23.sRebaseMethod = null;
                        }
                    }
                }
            }
        }

        static class ImplApi29 {
            static void rebase(Resources.Theme resources$Theme0) {
                resources$Theme0.rebase();
            }
        }

        public static void rebase(Resources.Theme resources$Theme0) {
            if(Build.VERSION.SDK_INT >= 29) {
                ImplApi29.rebase(resources$Theme0);
                return;
            }
            if(Build.VERSION.SDK_INT >= 23) {
                ImplApi23.rebase(resources$Theme0);
            }
        }
    }

    public static final int ID_NULL = 0;
    private static final String TAG = "ResourcesCompat";

    // 去混淆评级： 低(20)
    public static Typeface getCachedFont(Context context0, int v) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.loadFont(context0, v, new TypedValue(), 0, null, null, false, true);
    }

    public static int getColor(Resources resources0, int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT < 23 ? resources0.getColor(v) : resources0.getColor(v, resources$Theme0);
    }

    public static ColorStateList getColorStateList(Resources resources0, int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT < 23 ? resources0.getColorStateList(v) : resources0.getColorStateList(v, resources$Theme0);
    }

    public static Drawable getDrawable(Resources resources0, int v, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return resources0.getDrawable(v, resources$Theme0);
    }

    public static Drawable getDrawableForDensity(Resources resources0, int v, int v1, Resources.Theme resources$Theme0) throws Resources.NotFoundException {
        return resources0.getDrawableForDensity(v, v1, resources$Theme0);
    }

    public static float getFloat(Resources resources0, int v) {
        TypedValue typedValue0 = new TypedValue();
        resources0.getValue(v, typedValue0, true);
        if(typedValue0.type != 4) {
            throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(v) + " type #0x" + Integer.toHexString(typedValue0.type) + " is not valid");
        }
        return typedValue0.getFloat();
    }

    // 去混淆评级： 低(20)
    public static Typeface getFont(Context context0, int v) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.loadFont(context0, v, new TypedValue(), 0, null, null, false, false);
    }

    // 去混淆评级： 低(20)
    public static Typeface getFont(Context context0, int v, TypedValue typedValue0, int v1, FontCallback resourcesCompat$FontCallback0) throws Resources.NotFoundException {
        return context0.isRestricted() ? null : ResourcesCompat.loadFont(context0, v, typedValue0, v1, resourcesCompat$FontCallback0, null, true, false);
    }

    public static void getFont(Context context0, int v, FontCallback resourcesCompat$FontCallback0, Handler handler0) throws Resources.NotFoundException {
        Preconditions.checkNotNull(resourcesCompat$FontCallback0);
        if(context0.isRestricted()) {
            resourcesCompat$FontCallback0.callbackFailAsync(-4, handler0);
            return;
        }
        ResourcesCompat.loadFont(context0, v, new TypedValue(), 0, resourcesCompat$FontCallback0, handler0, false, false);
    }

    private static Typeface loadFont(Context context0, int v, TypedValue typedValue0, int v1, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z, boolean z1) {
        Resources resources0 = context0.getResources();
        resources0.getValue(v, typedValue0, true);
        Typeface typeface0 = ResourcesCompat.loadFont(context0, resources0, typedValue0, v, v1, resourcesCompat$FontCallback0, handler0, z, z1);
        if(typeface0 == null && resourcesCompat$FontCallback0 == null && !z1) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(v) + " could not be retrieved.");
        }
        return typeface0;
    }

    private static Typeface loadFont(Context context0, Resources resources0, TypedValue typedValue0, int v, int v1, FontCallback resourcesCompat$FontCallback0, Handler handler0, boolean z, boolean z1) {
        if(typedValue0.string == null) {
            throw new Resources.NotFoundException("Resource \"" + resources0.getResourceName(v) + "\" (" + Integer.toHexString(v) + ") is not a Font: " + typedValue0);
        }
        String s = typedValue0.string.toString();
        if(!s.startsWith("res/")) {
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
            }
            return null;
        }
        Typeface typeface0 = TypefaceCompat.findFromCache(resources0, v, v1);
        if(typeface0 != null) {
            if(resourcesCompat$FontCallback0 != null) {
                resourcesCompat$FontCallback0.callbackSuccessAsync(typeface0, handler0);
            }
            return typeface0;
        }
        if(z1) {
            return null;
        }
        try {
            if(s.toLowerCase().endsWith(".xml")) {
                FamilyResourceEntry fontResourcesParserCompat$FamilyResourceEntry0 = FontResourcesParserCompat.parse(resources0.getXml(v), resources0);
                if(fontResourcesParserCompat$FamilyResourceEntry0 == null) {
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    if(resourcesCompat$FontCallback0 != null) {
                        resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
                    }
                    return null;
                }
                return TypefaceCompat.createFromResourcesFamilyXml(context0, fontResourcesParserCompat$FamilyResourceEntry0, resources0, v, v1, resourcesCompat$FontCallback0, handler0, z);
            }
            Typeface typeface1 = TypefaceCompat.createFromResourcesFontFile(context0, resources0, v, s, v1);
            if(resourcesCompat$FontCallback0 != null) {
                if(typeface1 != null) {
                    resourcesCompat$FontCallback0.callbackSuccessAsync(typeface1, handler0);
                    return typeface1;
                }
                resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
            }
            return typeface1;
        }
        catch(XmlPullParserException xmlPullParserException0) {
            Log.e("ResourcesCompat", "Failed to parse xml resource " + s, xmlPullParserException0);
        }
        catch(IOException iOException0) {
            Log.e("ResourcesCompat", "Failed to read xml resource " + s, iOException0);
        }
        if(resourcesCompat$FontCallback0 != null) {
            resourcesCompat$FontCallback0.callbackFailAsync(-3, handler0);
        }
        return null;
    }
}

