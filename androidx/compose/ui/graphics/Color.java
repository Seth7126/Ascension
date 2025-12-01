package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Connector;
import androidx.compose.ui.graphics.colorspace.Rgb;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 :2\u00020\u0001:\u0001:B\u0012\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u001D\u001A\u00020\u0007H\u0087\u0002\u00A2\u0006\u0004\b\u001E\u0010\u000BJ\u0010\u0010\u001F\u001A\u00020\u0007H\u0087\u0002\u00A2\u0006\u0004\b \u0010\u000BJ\u0010\u0010!\u001A\u00020\u0007H\u0087\u0002\u00A2\u0006\u0004\b\"\u0010\u000BJ\u0010\u0010#\u001A\u00020\u0007H\u0087\u0002\u00A2\u0006\u0004\b$\u0010\u000BJ\u0010\u0010%\u001A\u00020\u0010H\u0087\u0002\u00A2\u0006\u0004\b&\u0010\u0013J\u001E\u0010\'\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u0010\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b(\u0010)J@\u0010*\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\u0017\u001A\u00020\u00072\b\b\u0002\u0010\u0014\u001A\u00020\u00072\b\b\u0002\u0010\f\u001A\u00020\u0007H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010,J\u001A\u0010-\u001A\u00020.2\b\u0010/\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b0\u00101J\u0010\u00102\u001A\u000203H\u00D6\u0001\u00A2\u0006\u0004\b4\u00105J\u000F\u00106\u001A\u000207H\u0016\u00A2\u0006\u0004\b8\u00109R\u001A\u0010\u0006\u001A\u00020\u00078FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\u00078FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\r\u0010\t\u001A\u0004\b\u000E\u0010\u000BR\u001A\u0010\u000F\u001A\u00020\u00108FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0011\u0010\t\u001A\u0004\b\u0012\u0010\u0013R\u001A\u0010\u0014\u001A\u00020\u00078FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0015\u0010\t\u001A\u0004\b\u0016\u0010\u000BR\u001A\u0010\u0017\u001A\u00020\u00078FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0018\u0010\t\u001A\u0004\b\u0019\u0010\u000BR\u001C\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u001C\u001A\u0004\b\u001A\u0010\u001B\u0088\u0001\u0002\u00F8\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006;"}, d2 = {"Landroidx/compose/ui/graphics/Color;", "", "value", "Lkotlin/ULong;", "constructor-impl", "(J)J", "alpha", "", "getAlpha$annotations", "()V", "getAlpha-impl", "(J)F", "blue", "getBlue$annotations", "getBlue-impl", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace$annotations", "getColorSpace-impl", "(J)Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "green", "getGreen$annotations", "getGreen-impl", "red", "getRed$annotations", "getRed-impl", "getValue-s-VKNKU", "()J", "J", "component1", "component1-impl", "component2", "component2-impl", "component3", "component3-impl", "component4", "component4-impl", "component5", "component5-impl", "convert", "convert-vNxB06k", "(JLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "copy", "copy-wmQWz5c", "(JFFFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Color {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002JD\u0010-\u001A\u00020\u00042\u0006\u0010.\u001A\u00020/2\u0006\u00100\u001A\u00020/2\u0006\u00101\u001A\u00020/2\b\b\u0002\u00102\u001A\u00020/2\b\b\u0002\u00103\u001A\u000204H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b5\u00106J(\u00107\u001A\u00020/2\u0006\u00108\u001A\u0002092\u0006\u0010:\u001A\u00020/2\u0006\u0010;\u001A\u00020/2\u0006\u0010<\u001A\u00020/H\u0002JD\u0010=\u001A\u00020\u00042\u0006\u0010.\u001A\u00020/2\u0006\u00100\u001A\u00020/2\u0006\u0010>\u001A\u00020/2\b\b\u0002\u00102\u001A\u00020/2\b\b\u0002\u00103\u001A\u000204H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b?\u00106J(\u0010@\u001A\u00020/2\u0006\u00108\u001A\u0002092\u0006\u0010:\u001A\u00020/2\u0006\u0010;\u001A\u00020/2\u0006\u0010A\u001A\u00020/H\u0002R\'\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\'\u0010\t\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001A\u0004\b\u000B\u0010\u0007R\'\u0010\f\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001A\u0004\b\u000E\u0010\u0007R\'\u0010\u000F\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0010\u0010\u0002\u001A\u0004\b\u0011\u0010\u0007R\'\u0010\u0012\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0013\u0010\u0002\u001A\u0004\b\u0014\u0010\u0007R\'\u0010\u0015\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0016\u0010\u0002\u001A\u0004\b\u0017\u0010\u0007R\'\u0010\u0018\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0019\u0010\u0002\u001A\u0004\b\u001A\u0010\u0007R\'\u0010\u001B\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001C\u0010\u0002\u001A\u0004\b\u001D\u0010\u0007R\'\u0010\u001E\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u001F\u0010\u0002\u001A\u0004\b \u0010\u0007R\'\u0010!\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\"\u0010\u0002\u001A\u0004\b#\u0010\u0007R\'\u0010$\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b%\u0010\u0002\u001A\u0004\b&\u0010\u0007R\'\u0010\'\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b(\u0010\u0002\u001A\u0004\b)\u0010\u0007R\'\u0010*\u001A\u00020\u00048\u0006X\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b+\u0010\u0002\u001A\u0004\b,\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/Color$Companion;", "", "()V", "Black", "Landroidx/compose/ui/graphics/Color;", "getBlack-0d7_KjU$annotations", "getBlack-0d7_KjU", "()J", "J", "Blue", "getBlue-0d7_KjU$annotations", "getBlue-0d7_KjU", "Cyan", "getCyan-0d7_KjU$annotations", "getCyan-0d7_KjU", "DarkGray", "getDarkGray-0d7_KjU$annotations", "getDarkGray-0d7_KjU", "Gray", "getGray-0d7_KjU$annotations", "getGray-0d7_KjU", "Green", "getGreen-0d7_KjU$annotations", "getGreen-0d7_KjU", "LightGray", "getLightGray-0d7_KjU$annotations", "getLightGray-0d7_KjU", "Magenta", "getMagenta-0d7_KjU$annotations", "getMagenta-0d7_KjU", "Red", "getRed-0d7_KjU$annotations", "getRed-0d7_KjU", "Transparent", "getTransparent-0d7_KjU$annotations", "getTransparent-0d7_KjU", "Unspecified", "getUnspecified-0d7_KjU$annotations", "getUnspecified-0d7_KjU", "White", "getWhite-0d7_KjU$annotations", "getWhite-0d7_KjU", "Yellow", "getYellow-0d7_KjU$annotations", "getYellow-0d7_KjU", "hsl", "hue", "", "saturation", "lightness", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "hsl-JlNiLsg", "(FFFFLandroidx/compose/ui/graphics/colorspace/Rgb;)J", "hslToRgbComponent", "n", "", "h", "s", "l", "hsv", "value", "hsv-JlNiLsg", "hsvToRgbComponent", "v", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getBlack-0d7_KjU() [...] // 潜在的解密器

        public static void getBlack-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getBlue-0d7_KjU() [...] // 潜在的解密器

        public static void getBlue-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getCyan-0d7_KjU() {
            return 0xFF00FFFF00000000L;
        }

        public static void getCyan-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getDarkGray-0d7_KjU() {
            return 0xFF44444400000000L;
        }

        public static void getDarkGray-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getGray-0d7_KjU() {
            return 0xFF88888800000000L;
        }

        public static void getGray-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getGreen-0d7_KjU() {
            return 0xFF00FF0000000000L;
        }

        public static void getGreen-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getLightGray-0d7_KjU() {
            return 0xFFCCCCCC00000000L;
        }

        public static void getLightGray-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getMagenta-0d7_KjU() {
            return 0xFFFF00FF00000000L;
        }

        public static void getMagenta-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getRed-0d7_KjU() [...] // 潜在的解密器

        public static void getRed-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getTransparent-0d7_KjU() [...] // 潜在的解密器

        public static void getTransparent-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-0d7_KjU() [...] // 潜在的解密器

        public static void getUnspecified-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getWhite-0d7_KjU() {
            return 0xFFFFFFFF00000000L;
        }

        public static void getWhite-0d7_KjU$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getYellow-0d7_KjU() {
            return 0xFFFFFF0000000000L;
        }

        public static void getYellow-0d7_KjU$annotations() {
        }

        @ExperimentalGraphicsApi
        public final long hsl-JlNiLsg(float f, float f1, float f2, float f3, Rgb rgb0) {
            Intrinsics.checkNotNullParameter(rgb0, "colorSpace");
            if(0.0f > f || f > 360.0f || (0.0f > f1 || f1 > 1.0f) || (0.0f > f2 || f2 > 1.0f)) {
                throw new IllegalArgumentException(("HSL (" + f + ", " + f1 + ", " + f2 + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return ColorKt.Color(this.hslToRgbComponent(0, f, f1, f2), this.hslToRgbComponent(8, f, f1, f2), this.hslToRgbComponent(4, f, f1, f2), f3, rgb0);
        }

        public static long hsl-JlNiLsg$default(Companion color$Companion0, float f, float f1, float f2, float f3, Rgb rgb0, int v, Object object0) {
            if((v & 16) != 0) {
                rgb0 = ColorSpaces.INSTANCE.getSrgb();
            }
            return color$Companion0.hsl-JlNiLsg(f, f1, f2, ((v & 8) == 0 ? f3 : 1.0f), rgb0);
        }

        private final float hslToRgbComponent(int v, float f, float f1, float f2) {
            float f3 = (((float)v) + f / 30.0f) % 12.0f;
            return f2 - f1 * Math.min(f2, 1.0f - f2) * Math.max(-1.0f, Math.min(f3 - 3.0f, Math.min(9.0f - f3, 1.0f)));
        }

        @ExperimentalGraphicsApi
        public final long hsv-JlNiLsg(float f, float f1, float f2, float f3, Rgb rgb0) {
            Intrinsics.checkNotNullParameter(rgb0, "colorSpace");
            if(0.0f > f || f > 360.0f || (0.0f > f1 || f1 > 1.0f) || (0.0f > f2 || f2 > 1.0f)) {
                throw new IllegalArgumentException(("HSV (" + f + ", " + f1 + ", " + f2 + ") must be in range (0..360, 0..1, 0..1)").toString());
            }
            return ColorKt.Color(this.hsvToRgbComponent(5, f, f1, f2), this.hsvToRgbComponent(3, f, f1, f2), this.hsvToRgbComponent(1, f, f1, f2), f3, rgb0);
        }

        public static long hsv-JlNiLsg$default(Companion color$Companion0, float f, float f1, float f2, float f3, Rgb rgb0, int v, Object object0) {
            if((v & 16) != 0) {
                rgb0 = ColorSpaces.INSTANCE.getSrgb();
            }
            return color$Companion0.hsv-JlNiLsg(f, f1, f2, ((v & 8) == 0 ? f3 : 1.0f), rgb0);
        }

        private final float hsvToRgbComponent(int v, float f, float f1, float f2) {
            float f3 = (((float)v) + f / 60.0f) % 6.0f;
            return f2 - f1 * f2 * Math.max(0.0f, Math.min(f3, Math.min(4.0f - f3, 1.0f)));
        }
    }

    private static final long Black;
    private static final long Blue;
    public static final Companion Companion;
    private static final long Cyan;
    private static final long DarkGray;
    private static final long Gray;
    private static final long Green;
    private static final long LightGray;
    private static final long Magenta;
    private static final long Red;
    private static final long Transparent;
    private static final long Unspecified;
    private static final long White;
    private static final long Yellow;
    private final long value;

    static {
        Color.Companion = new Companion(null);
        Color.Black = 0xFF00000000000000L;
        Color.DarkGray = 0xFF44444400000000L;
        Color.Gray = 0xFF88888800000000L;
        Color.LightGray = 0xFFCCCCCC00000000L;
        Color.White = 0xFFFFFFFF00000000L;
        Color.Red = 0xFFFF000000000000L;
        Color.Green = 0xFF00FF0000000000L;
        Color.Blue = 0xFF0000FF00000000L;
        Color.Yellow = 0xFFFFFF0000000000L;
        Color.Cyan = 0xFF00FFFF00000000L;
        Color.Magenta = 0xFFFF00FF00000000L;
        Color.Transparent = ColorKt.Color(0);
        Color.Unspecified = ColorKt.Color(0.0f, 0.0f, 0.0f, 0.0f, ColorSpaces.INSTANCE.getUnspecified$ui_graphics_release());
    }

    private Color(long v) {
        this.value = v;
    }

    public static final long access$getBlack$cp() [...] // 潜在的解密器

    public static final long access$getBlue$cp() [...] // 潜在的解密器

    public static final long access$getCyan$cp() [...] // 潜在的解密器

    public static final long access$getDarkGray$cp() [...] // 潜在的解密器

    public static final long access$getGray$cp() [...] // 潜在的解密器

    public static final long access$getGreen$cp() [...] // 潜在的解密器

    public static final long access$getLightGray$cp() [...] // 潜在的解密器

    public static final long access$getMagenta$cp() [...] // 潜在的解密器

    public static final long access$getRed$cp() [...] // 潜在的解密器

    public static final long access$getTransparent$cp() [...] // 潜在的解密器

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final long access$getWhite$cp() [...] // 潜在的解密器

    public static final long access$getYellow$cp() [...] // 潜在的解密器

    public static final Color box-impl(long v) {
        return new Color(v);
    }

    public static final float component1-impl(long v) {
        return Color.getRed-impl(v);
    }

    public static final float component2-impl(long v) {
        return Color.getGreen-impl(v);
    }

    public static final float component3-impl(long v) {
        return Color.getBlue-impl(v);
    }

    public static final float component4-impl(long v) {
        return Color.getAlpha-impl(v);
    }

    public static final ColorSpace component5-impl(long v) {
        return Color.getColorSpace-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long convert-vNxB06k(long v, ColorSpace colorSpace0) {
        Intrinsics.checkNotNullParameter(colorSpace0, "colorSpace");
        if(Intrinsics.areEqual(colorSpace0, Color.getColorSpace-impl(v))) {
            return v;
        }
        Connector connector0 = ColorSpaceKt.connect-YBCOT_4$default(Color.getColorSpace-impl(v), colorSpace0, 0, 2, null);
        float[] arr_f = ColorKt.getComponents-8_81llA(v);
        connector0.transform(arr_f);
        return ColorKt.Color(arr_f[0], arr_f[1], arr_f[2], arr_f[3], colorSpace0);
    }

    public static final long copy-wmQWz5c(long v, float f, float f1, float f2, float f3) {
        return ColorKt.Color(f1, f2, f3, f, Color.getColorSpace-impl(v));
    }

    public static long copy-wmQWz5c$default(long v, float f, float f1, float f2, float f3, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Color.getAlpha-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = Color.getRed-impl(v);
        }
        if((v1 & 4) != 0) {
            f2 = Color.getGreen-impl(v);
        }
        if((v1 & 8) != 0) {
            f3 = Color.getBlue-impl(v);
        }
        return Color.copy-wmQWz5c(v, f, f1, f2, f3);
    }

    @Override
    public boolean equals(Object object0) {
        return Color.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Color ? v == ((Color)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getAlpha$annotations() {
    }

    public static final float getAlpha-impl(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 56 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 56 & 0xFFL)))) / 255.0f : ((float)(((double)((v >>> 6 & 0x3FFL) >>> 11)) * 2048.0 + ((double)(v >>> 6 & 0x3FFL)))) / 1023.0f;
    }

    public static void getBlue$annotations() {
    }

    public static final float getBlue-impl(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 0x20 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 0x20 & 0xFFL)))) / 255.0f : Float16.toFloat-impl(((short)(((int)(v >>> 16 & 0xFFFFL)))));
    }

    public static void getColorSpace$annotations() {
    }

    public static final ColorSpace getColorSpace-impl(long v) {
        return ColorSpaces.INSTANCE.getColorSpacesArray$ui_graphics_release()[((int)(v & 0x3FL))];
    }

    public static void getGreen$annotations() {
    }

    public static final float getGreen-impl(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 40 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 40 & 0xFFL)))) / 255.0f : Float16.toFloat-impl(((short)(((int)(v >>> 0x20 & 0xFFFFL)))));
    }

    public static void getRed$annotations() {
    }

    public static final float getRed-impl(long v) {
        return (0x3FL & v) == 0L ? ((float)(((double)((v >>> 0x30 & 0xFFL) >>> 11)) * 2048.0 + ((double)(v >>> 0x30 & 0xFFL)))) / 255.0f : Float16.toFloat-impl(((short)(((int)(v >>> 0x30 & 0xFFFFL)))));
    }

    public final long getValue-s-VKNKU() {
        return this.unbox-impl();
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    public String toString() {
        return Color.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        return "Color(" + Color.getRed-impl(v) + ", " + Color.getGreen-impl(v) + ", " + Color.getBlue-impl(v) + ", " + Color.getAlpha-impl(v) + ", " + Color.getColorSpace-impl(v).getName() + ')';
    }

    public final long unbox-impl() {
        return this.value;
    }
}

