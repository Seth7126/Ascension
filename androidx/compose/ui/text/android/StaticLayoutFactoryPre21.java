package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.util.Log;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "()V", "create", "Landroid/text/StaticLayout;", "params", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class StaticLayoutFactoryPre21 implements StaticLayoutFactoryImpl {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactoryPre21$Companion;", "", "()V", "isInitialized", "", "staticLayoutConstructor", "Ljava/lang/reflect/Constructor;", "Landroid/text/StaticLayout;", "getStaticLayoutConstructor", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final Constructor getStaticLayoutConstructor() {
            StaticLayoutFactoryPre21.isInitialized = true;
            try {
                StaticLayoutFactoryPre21.staticLayoutConstructor = StaticLayout.class.getConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
            }
            catch(NoSuchMethodException unused_ex) {
                StaticLayoutFactoryPre21.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return StaticLayoutFactoryPre21.staticLayoutConstructor;
        }
    }

    public static final Companion Companion;
    private static boolean isInitialized;
    private static Constructor staticLayoutConstructor;

    static {
        StaticLayoutFactoryPre21.Companion = new Companion(null);
    }

    public static final boolean access$isInitialized$cp() [...] // 潜在的解密器

    @Override  // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public StaticLayout create(StaticLayoutParams staticLayoutParams0) {
        Intrinsics.checkNotNullParameter(staticLayoutParams0, "params");
        Constructor constructor0 = StaticLayoutFactoryPre21.Companion.getStaticLayoutConstructor();
        StaticLayout staticLayout0 = null;
        if(constructor0 != null) {
            try {
                staticLayout0 = (StaticLayout)constructor0.newInstance(staticLayoutParams0.getText(), staticLayoutParams0.getStart(), staticLayoutParams0.getEnd(), staticLayoutParams0.getPaint(), staticLayoutParams0.getWidth(), staticLayoutParams0.getAlignment(), staticLayoutParams0.getTextDir(), staticLayoutParams0.getLineSpacingMultiplier(), staticLayoutParams0.getLineSpacingExtra(), Boolean.valueOf(staticLayoutParams0.getIncludePadding()), staticLayoutParams0.getEllipsize(), staticLayoutParams0.getEllipsizedWidth(), staticLayoutParams0.getMaxLines());
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.getText(), staticLayoutParams0.getStart(), staticLayoutParams0.getEnd(), staticLayoutParams0.getPaint(), staticLayoutParams0.getWidth(), staticLayoutParams0.getAlignment(), staticLayoutParams0.getLineSpacingMultiplier(), staticLayoutParams0.getLineSpacingExtra(), staticLayoutParams0.getIncludePadding(), staticLayoutParams0.getEllipsize(), staticLayoutParams0.getEllipsizedWidth()) : staticLayout0;
            }
            catch(IllegalAccessException unused_ex) {
                StaticLayoutFactoryPre21.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.getText(), staticLayoutParams0.getStart(), staticLayoutParams0.getEnd(), staticLayoutParams0.getPaint(), staticLayoutParams0.getWidth(), staticLayoutParams0.getAlignment(), staticLayoutParams0.getLineSpacingMultiplier(), staticLayoutParams0.getLineSpacingExtra(), staticLayoutParams0.getIncludePadding(), staticLayoutParams0.getEllipsize(), staticLayoutParams0.getEllipsizedWidth()) : staticLayout0;
            }
            catch(InstantiationException unused_ex) {
                StaticLayoutFactoryPre21.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.getText(), staticLayoutParams0.getStart(), staticLayoutParams0.getEnd(), staticLayoutParams0.getPaint(), staticLayoutParams0.getWidth(), staticLayoutParams0.getAlignment(), staticLayoutParams0.getLineSpacingMultiplier(), staticLayoutParams0.getLineSpacingExtra(), staticLayoutParams0.getIncludePadding(), staticLayoutParams0.getEllipsize(), staticLayoutParams0.getEllipsizedWidth()) : staticLayout0;
            }
            catch(InvocationTargetException unused_ex) {
                StaticLayoutFactoryPre21.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
                return staticLayout0 == null ? new StaticLayout(staticLayoutParams0.getText(), staticLayoutParams0.getStart(), staticLayoutParams0.getEnd(), staticLayoutParams0.getPaint(), staticLayoutParams0.getWidth(), staticLayoutParams0.getAlignment(), staticLayoutParams0.getLineSpacingMultiplier(), staticLayoutParams0.getLineSpacingExtra(), staticLayoutParams0.getIncludePadding(), staticLayoutParams0.getEllipsize(), staticLayoutParams0.getEllipsizedWidth()) : staticLayout0;
            }
        }
        return new StaticLayout(staticLayoutParams0.getText(), staticLayoutParams0.getStart(), staticLayoutParams0.getEnd(), staticLayoutParams0.getPaint(), staticLayoutParams0.getWidth(), staticLayoutParams0.getAlignment(), staticLayoutParams0.getLineSpacingMultiplier(), staticLayoutParams0.getLineSpacingExtra(), staticLayoutParams0.getIncludePadding(), staticLayoutParams0.getEllipsize(), staticLayoutParams0.getEllipsizedWidth());
    }
}

