package androidx.compose.ui.graphics;

import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u001D\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A%\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000B\u001A%\u0010\f\u001A\u00020\u00012\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\u000FH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001A\n\u0010\u0012\u001A\u00020\u0013*\u00020\u0001\u001A\n\u0010\u0014\u001A\u00020\u0001*\u00020\u0013*\f\b\u0000\u0010\u0015\"\u00020\u00132\u00020\u0013\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"actualColorMatrixColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "actualLightingColorFilter", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "actualLightingColorFilter--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "actualTintColorFilter", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "actualTintColorFilter-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "asAndroidColorFilter", "Landroid/graphics/ColorFilter;", "asComposeColorFilter", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidColorFilter_androidKt {
    public static final ColorFilter actualColorMatrixColorFilter-jHG-Opc(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "colorMatrix");
        return new ColorFilter(new ColorMatrixColorFilter(arr_f));
    }

    public static final ColorFilter actualLightingColorFilter--OWjLjI(long v, long v1) {
        return new ColorFilter(new LightingColorFilter(ColorKt.toArgb-8_81llA(v), ColorKt.toArgb-8_81llA(v1)));
    }

    public static final ColorFilter actualTintColorFilter-xETnrds(long v, int v1) {
        return Build.VERSION.SDK_INT < 29 ? new ColorFilter(new PorterDuffColorFilter(ColorKt.toArgb-8_81llA(v), AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v1))) : new ColorFilter(BlendModeColorFilterHelper.INSTANCE.BlendModeColorFilter-xETnrds(v, v1));
    }

    public static final android.graphics.ColorFilter asAndroidColorFilter(ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(colorFilter0, "<this>");
        return colorFilter0.getNativeColorFilter$ui_graphics_release();
    }

    public static final ColorFilter asComposeColorFilter(android.graphics.ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(colorFilter0, "<this>");
        return new ColorFilter(colorFilter0);
    }
}

