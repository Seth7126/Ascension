package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A<\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\u0011H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0012\u001A\u0018\u0010\n\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0015\u001A2\u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00142\u0006\u0010\r\u001A\u00020\u00142\u0006\u0010\u000E\u001A\u00020\u00142\b\b\u0002\u0010\u000F\u001A\u00020\u0014H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0016\u001A\u0018\u0010\n\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u0017H\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0018\u001A1\u0010\u0019\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\f2\u0006\u0010\u001B\u001A\u00020\f2\u0006\u0010\u001C\u001A\u00020\f2\u0006\u0010\u001D\u001A\u00020\f2\u0006\u0010\u001E\u001A\u00020\fH\u0082\b\u001A-\u0010\u001F\u001A\u00020\u00022\u0006\u0010 \u001A\u00020\u00022\u0006\u0010!\u001A\u00020\u00022\u0006\u0010\"\u001A\u00020\fH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010$\u001A\u0010\u0010%\u001A\u00020\f2\u0006\u0010&\u001A\u00020\fH\u0002\u001A!\u0010\'\u001A\u00020\u0002*\u00020\u00022\u0006\u0010(\u001A\u00020\u0002H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*\u001A\u0019\u0010+\u001A\u00020,*\u00020\u0002H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b-\u0010.\u001A\u0019\u0010/\u001A\u00020\f*\u00020\u0002H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u00101\u001A+\u00102\u001A\u00020\u0002*\u00020\u00022\f\u00103\u001A\b\u0012\u0004\u0012\u00020\u000204H\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b5\u00106\u001A\u0019\u00107\u001A\u00020\u0014*\u00020\u0002H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001A\u00020\u0001*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001A\u00020\u0001*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0005\b\u009920\u0001\u00A8\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ColorKt {
    public static final long Color(float f, float f1, float f2, float f3, ColorSpace colorSpace0) {
        boolean z;
        Intrinsics.checkNotNullParameter(colorSpace0, "colorSpace");
        float f4 = colorSpace0.getMinValue(0);
        if(f > colorSpace0.getMaxValue(0) || f4 > f) {
            z = false;
        }
        else {
            float f5 = colorSpace0.getMinValue(1);
            if(f1 > colorSpace0.getMaxValue(1) || f5 > f1) {
                z = false;
            }
            else {
                float f6 = colorSpace0.getMinValue(2);
                z = f2 > colorSpace0.getMaxValue(2) || f6 > f2 || (0.0f > f3 || f3 > 1.0f) ? false : true;
            }
        }
        if(!z) {
            throw new IllegalArgumentException(("red = " + f + ", green = " + f1 + ", blue = " + f2 + ", alpha = " + f3 + " outside the range for " + colorSpace0).toString());
        }
        if(colorSpace0.isSrgb()) {
            return (((long)(((int)(f * 255.0f + 0.5f)) << 16 | ((int)(f3 * 255.0f + 0.5f)) << 24 | ((int)(f1 * 255.0f + 0.5f)) << 8 | ((int)(f2 * 255.0f + 0.5f)))) & 0xFFFFFFFFL) << 0x20;
        }
        if(colorSpace0.getComponentCount() != 3) {
            throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
        }
        int v = colorSpace0.getId$ui_graphics_release();
        if(v == -1) {
            throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
        }
        return (((long)Float16.constructor-impl(f1)) & 0xFFFFL) << 0x20 | (((long)Float16.constructor-impl(f)) & 0xFFFFL) << 0x30 | (((long)Float16.constructor-impl(f2)) & 0xFFFFL) << 16 | (((long)(((int)(Math.max(0.0f, Math.min(f3, 1.0f)) * 1023.0f + 0.5f)))) & 0x3FFL) << 6 | ((long)v) & 0x3FL;
    }

    public static final long Color(int v) {
        return ((long)v) << 0x20;
    }

    public static final long Color(int v, int v1, int v2, int v3) {
        return ColorKt.Color((v & 0xFF) << 16 | (v3 & 0xFF) << 24 | (v1 & 0xFF) << 8 | v2 & 0xFF);
    }

    public static final long Color(long v) [...] // 潜在的解密器

    public static long Color$default(float f, float f1, float f2, float f3, ColorSpace colorSpace0, int v, Object object0) {
        if((v & 8) != 0) {
            f3 = 1.0f;
        }
        if((v & 16) != 0) {
            colorSpace0 = ColorSpaces.INSTANCE.getSrgb();
        }
        return ColorKt.Color(f, f1, f2, f3, colorSpace0);
    }

    public static long Color$default(int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 8) != 0) {
            v3 = 0xFF;
        }
        return ColorKt.Color(v, v1, v2, v3);
    }

    // 去混淆评级： 低(30)
    private static final float compositeComponent(float f, float f1, float f2, float f3, float f4) {
        return f4 == 0.0f ? 0.0f : (f * f2 + f1 * f3 * (1.0f - f2)) / f4;
    }

    public static final long compositeOver--OWjLjI(long v, long v1) {
        long v2 = Color.convert-vNxB06k(v, Color.getColorSpace-impl(v1));
        float f = Color.getAlpha-impl(v1);
        float f1 = Color.getAlpha-impl(v2);
        float f2 = f * (1.0f - f1) + f1;
        float f3 = Color.getRed-impl(v2);
        float f4 = Color.getRed-impl(v1);
        float f5 = 0.0f;
        int v3 = Float.compare(f2, 0.0f);
        float f6 = Color.getGreen-impl(v2);
        float f7 = Color.getGreen-impl(v1);
        float f8 = Color.getBlue-impl(v2);
        float f9 = Color.getBlue-impl(v1);
        if(v3 != 0) {
            f5 = (f8 * f1 + f9 * f * (1.0f - f1)) / f2;
        }
        return ColorKt.Color((v3 == 0 ? (f3 * f1 + f4 * f * (1.0f - f1)) / f2 : 0.0f), (v3 == 0 ? (f6 * f1 + f7 * f * (1.0f - f1)) / f2 : 0.0f), f5, f2, Color.getColorSpace-impl(v1));
    }

    private static final float[] getComponents-8_81llA(long v) {
        return new float[]{Color.getRed-impl(v), Color.getGreen-impl(v), Color.getBlue-impl(v), Color.getAlpha-impl(v)};
    }

    // 去混淆评级： 低(20)
    public static final boolean isSpecified-8_81llA(long v) {
        return v != 16L;
    }

    public static void isSpecified-8_81llA$annotations(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean isUnspecified-8_81llA(long v) {
        return v == 16L;
    }

    public static void isUnspecified-8_81llA$annotations(long v) {
    }

    public static final long lerp-jxsXWHM(long v, long v1, float f) {
        ColorSpace colorSpace0 = ColorSpaces.INSTANCE.getOklab$ui_graphics_release();
        long v2 = Color.convert-vNxB06k(v, colorSpace0);
        long v3 = Color.convert-vNxB06k(v1, colorSpace0);
        return Color.convert-vNxB06k(ColorKt.Color(MathHelpersKt.lerp(Color.getRed-impl(v2), Color.getRed-impl(v3), f), MathHelpersKt.lerp(Color.getGreen-impl(v2), Color.getGreen-impl(v3), f), MathHelpersKt.lerp(Color.getBlue-impl(v2), Color.getBlue-impl(v3), f), (1.0f - f) * Color.getAlpha-impl(v2) + f * Color.getAlpha-impl(v3), colorSpace0), Color.getColorSpace-impl(v1));
    }

    public static final float luminance-8_81llA(long v) {
        ColorSpace colorSpace0 = Color.getColorSpace-impl(v);
        if(!ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L)) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("The specified color must be encoded in an RGB color space. The supplied color space is ", ColorModel.toString-impl(colorSpace0.getModel-xdoWZVw())).toString());
        }
        Function1 function10 = ((Rgb)colorSpace0).getEotf();
        return ColorKt.saturate(((float)(((Number)function10.invoke(((double)Color.getRed-impl(v)))).doubleValue() * 0.2126 + ((Number)function10.invoke(((double)Color.getGreen-impl(v)))).doubleValue() * 0.7152 + ((Number)function10.invoke(((double)Color.getBlue-impl(v)))).doubleValue() * 0.0722)));
    }

    private static final float saturate(float f) {
        if(f <= 0.0f) {
            return 0.0f;
        }
        return f >= 1.0f ? 1.0f : f;
    }

    // 去混淆评级： 低(20)
    public static final long takeOrElse-DxMtmZc(long v, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        return v == 16L ? ((Color)function00.invoke()).unbox-impl() : v;
    }

    public static final int toArgb-8_81llA(long v) {
        ColorSpace colorSpace0 = Color.getColorSpace-impl(v);
        if(colorSpace0.isSrgb()) {
            return (int)(v >>> 0x20);
        }
        float[] arr_f = ColorKt.getComponents-8_81llA(v);
        ColorSpaceKt.connect-YBCOT_4$default(colorSpace0, null, 0, 3, null).transform(arr_f);
        return ((int)(arr_f[2] * 255.0f + 0.5f)) | (((int)(arr_f[3] * 255.0f + 0.5f)) << 24 | ((int)(arr_f[0] * 255.0f + 0.5f)) << 16 | ((int)(arr_f[1] * 255.0f + 0.5f)) << 8);
    }
}

