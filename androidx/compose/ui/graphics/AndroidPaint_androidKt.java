package androidx.compose.ui.graphics;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build.VERSION;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001A\u0006\u0010\u0000\u001A\u00020\u0001\u001A\b\u0010\u0002\u001A\u00020\u0003H\u0000\u001A\u0010\u0010\u0004\u001A\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001A\u0010\u0010\u0007\u001A\u00020\b*\u00060\u0003j\u0002`\u0006H\u0000\u001A\u0018\u0010\t\u001A\u00020\n*\u00060\u0003j\u0002`\u0006H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000B\u001A\u0018\u0010\f\u001A\u00020\r*\u00060\u0003j\u0002`\u0006H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000E\u001A\u0018\u0010\u000F\u001A\u00020\u0010*\u00060\u0003j\u0002`\u0006H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000E\u001A\u0018\u0010\u0011\u001A\u00020\u0012*\u00060\u0003j\u0002`\u0006H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000E\u001A\u0010\u0010\u0013\u001A\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001A\u0010\u0010\u0014\u001A\u00020\u0005*\u00060\u0003j\u0002`\u0006H\u0000\u001A\u0018\u0010\u0015\u001A\u00020\u0016*\u00060\u0003j\u0002`\u0006H\u0000\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u000E\u001A\u0018\u0010\u0017\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\u0005H\u0000\u001A\u0018\u0010\u001A\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\bH\u0000\u001A%\u0010\u001B\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u001C\u001A\u00020\u001DH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001A%\u0010 \u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\nH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b!\u0010\"\u001A\u001A\u0010#\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001A\u0004\u0018\u00010$H\u0000\u001A%\u0010%\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\rH\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b&\u0010\u001F\u001A\u001A\u0010\'\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\b\u0010\u0019\u001A\u0004\u0018\u00010(H\u0000\u001A \u0010)\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u000E\u0010\u0019\u001A\n\u0018\u00010*j\u0004\u0018\u0001`+H\u0000\u001A%\u0010,\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\u0010H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b-\u0010\u001F\u001A%\u0010.\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\u0012H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b/\u0010\u001F\u001A\u0018\u00100\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\u0005H\u0000\u001A\u0018\u00101\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\u0005H\u0000\u001A%\u00102\u001A\u00020\u0018*\u00060\u0003j\u0002`\u00062\u0006\u0010\u0019\u001A\u00020\u0016H\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b3\u0010\u001F*\n\u00104\"\u00020\u00032\u00020\u0003\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00065"}, d2 = {"Paint", "Landroidx/compose/ui/graphics/Paint;", "makeNativePaint", "Landroid/graphics/Paint;", "getNativeAlpha", "", "Landroidx/compose/ui/graphics/NativePaint;", "getNativeAntiAlias", "", "getNativeColor", "Landroidx/compose/ui/graphics/Color;", "(Landroid/graphics/Paint;)J", "getNativeFilterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "(Landroid/graphics/Paint;)I", "getNativeStrokeCap", "Landroidx/compose/ui/graphics/StrokeCap;", "getNativeStrokeJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "getNativeStrokeMiterLimit", "getNativeStrokeWidth", "getNativeStyle", "Landroidx/compose/ui/graphics/PaintingStyle;", "setNativeAlpha", "", "value", "setNativeAntiAlias", "setNativeBlendMode", "mode", "Landroidx/compose/ui/graphics/BlendMode;", "setNativeBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setNativeColor", "setNativeColor-4WTKRHQ", "(Landroid/graphics/Paint;J)V", "setNativeColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "setNativeFilterQuality", "setNativeFilterQuality-50PEsBU", "setNativePathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "setNativeShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "setNativeStrokeCap", "setNativeStrokeCap-CSYIeUk", "setNativeStrokeJoin", "setNativeStrokeJoin-kLtJ_vA", "setNativeStrokeMiterLimit", "setNativeStrokeWidth", "setNativeStyle", "setNativeStyle--5YerkU", "NativePaint", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidPaint_androidKt {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;
        public static final int[] $EnumSwitchMapping$2;

        static {
            int[] arr_v = new int[Paint.Style.values().length];
            arr_v[Paint.Style.STROKE.ordinal()] = 1;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[Paint.Cap.values().length];
            arr_v1[Paint.Cap.BUTT.ordinal()] = 1;
            arr_v1[Paint.Cap.ROUND.ordinal()] = 2;
            arr_v1[Paint.Cap.SQUARE.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
            int[] arr_v2 = new int[Paint.Join.values().length];
            arr_v2[Paint.Join.MITER.ordinal()] = 1;
            arr_v2[Paint.Join.BEVEL.ordinal()] = 2;
            arr_v2[Paint.Join.ROUND.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$2 = arr_v2;
        }
    }

    public static final Paint Paint() {
        return new AndroidPaint();
    }

    public static final float getNativeAlpha(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        return ((float)paint0.getAlpha()) / 255.0f;
    }

    public static final boolean getNativeAntiAlias(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        return paint0.isAntiAlias();
    }

    public static final long getNativeColor(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        return ColorKt.Color(paint0.getColor());
    }

    // 去混淆评级： 低(25)
    public static final int getNativeFilterQuality(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        return paint0.isFilterBitmap() ? 1 : 0;
    }

    public static final int getNativeStrokeCap(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        Paint.Cap paint$Cap0 = paint0.getStrokeCap();
        switch((paint$Cap0 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[paint$Cap0.ordinal()])) {
            case 1: {
                return 0;
            }
            case 2: {
                return 1;
            }
            case 3: {
                return 2;
            }
            default: {
                return 0;
            }
        }
    }

    public static final int getNativeStrokeJoin(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        Paint.Join paint$Join0 = paint0.getStrokeJoin();
        switch((paint$Join0 == null ? -1 : WhenMappings.$EnumSwitchMapping$2[paint$Join0.ordinal()])) {
            case 1: {
                return 0;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 1;
            }
            default: {
                return 0;
            }
        }
    }

    public static final float getNativeStrokeMiterLimit(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        return paint0.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        return paint0.getStrokeWidth();
    }

    // 去混淆评级： 低(20)
    public static final int getNativeStyle(android.graphics.Paint paint0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        Paint.Style paint$Style0 = paint0.getStyle();
        return (paint$Style0 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[paint$Style0.ordinal()]) == 1 ? 1 : 0;
    }

    public static final android.graphics.Paint makeNativePaint() {
        return new android.graphics.Paint(1);
    }

    public static final void setNativeAlpha(android.graphics.Paint paint0, float f) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        paint0.setAlpha(((int)(((float)Math.rint(f * 255.0f)))));
    }

    public static final void setNativeAntiAlias(android.graphics.Paint paint0, boolean z) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        paint0.setAntiAlias(z);
    }

    public static final void setNativeBlendMode-GB0RdKg(android.graphics.Paint paint0, int v) {
        Intrinsics.checkNotNullParameter(paint0, "$this$setNativeBlendMode");
        if(Build.VERSION.SDK_INT >= 29) {
            WrapperVerificationHelperMethods.INSTANCE.setBlendMode-GB0RdKg(paint0, v);
            return;
        }
        paint0.setXfermode(new PorterDuffXfermode(AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v)));
    }

    public static final void setNativeColor-4WTKRHQ(android.graphics.Paint paint0, long v) {
        Intrinsics.checkNotNullParameter(paint0, "$this$setNativeColor");
        paint0.setColor(ColorKt.toArgb-8_81llA(v));
    }

    public static final void setNativeColorFilter(android.graphics.Paint paint0, ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        paint0.setColorFilter((colorFilter0 == null ? null : AndroidColorFilter_androidKt.asAndroidColorFilter(colorFilter0)));
    }

    public static final void setNativeFilterQuality-50PEsBU(android.graphics.Paint paint0, int v) {
        Intrinsics.checkNotNullParameter(paint0, "$this$setNativeFilterQuality");
        paint0.setFilterBitmap(!FilterQuality.equals-impl0(v, 0));
    }

    public static final void setNativePathEffect(android.graphics.Paint paint0, PathEffect pathEffect0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        paint0.setPathEffect((((AndroidPathEffect)pathEffect0) == null ? null : ((AndroidPathEffect)pathEffect0).getNativePathEffect()));
    }

    public static final void setNativeShader(android.graphics.Paint paint0, Shader shader0) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        paint0.setShader(shader0);
    }

    public static final void setNativeStrokeCap-CSYIeUk(android.graphics.Paint paint0, int v) {
        Paint.Cap paint$Cap0;
        Intrinsics.checkNotNullParameter(paint0, "$this$setNativeStrokeCap");
        if(StrokeCap.equals-impl0(v, 2)) {
            paint$Cap0 = Paint.Cap.SQUARE;
        }
        else {
            paint$Cap0 = StrokeCap.equals-impl0(v, 1) ? Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
        paint0.setStrokeCap(paint$Cap0);
    }

    public static final void setNativeStrokeJoin-kLtJ_vA(android.graphics.Paint paint0, int v) {
        Paint.Join paint$Join0;
        Intrinsics.checkNotNullParameter(paint0, "$this$setNativeStrokeJoin");
        if(StrokeJoin.equals-impl0(v, 0)) {
            paint$Join0 = Paint.Join.MITER;
        }
        else if(StrokeJoin.equals-impl0(v, 2)) {
            paint$Join0 = Paint.Join.BEVEL;
        }
        else {
            paint$Join0 = StrokeJoin.equals-impl0(v, 1) ? Paint.Join.ROUND : Paint.Join.MITER;
        }
        paint0.setStrokeJoin(paint$Join0);
    }

    public static final void setNativeStrokeMiterLimit(android.graphics.Paint paint0, float f) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        paint0.setStrokeMiter(f);
    }

    public static final void setNativeStrokeWidth(android.graphics.Paint paint0, float f) {
        Intrinsics.checkNotNullParameter(paint0, "<this>");
        paint0.setStrokeWidth(f);
    }

    public static final void setNativeStyle--5YerkU(android.graphics.Paint paint0, int v) {
        Intrinsics.checkNotNullParameter(paint0, "$this$setNativeStyle");
        paint0.setStyle((PaintingStyle.equals-impl0(v, 1) ? Paint.Style.STROKE : Paint.Style.FILL));
    }
}

