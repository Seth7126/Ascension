package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\u0006\u001A\u00020\u00072\b\u0010\b\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000B\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000F\u0010\r\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class BlendMode {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u001C\u0010\n\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006R\u001C\u0010\f\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\r\u0010\u0006R\u001C\u0010\u000E\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000F\u0010\u0006R\u001C\u0010\u0010\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0011\u0010\u0006R\u001C\u0010\u0012\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0013\u0010\u0006R\u001C\u0010\u0014\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0015\u0010\u0006R\u001C\u0010\u0016\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0017\u0010\u0006R\u001C\u0010\u0018\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0019\u0010\u0006R\u001C\u0010\u001A\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u001B\u0010\u0006R\u001C\u0010\u001C\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u001D\u0010\u0006R\u001C\u0010\u001E\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u001F\u0010\u0006R\u001C\u0010 \u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b!\u0010\u0006R\u001C\u0010\"\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b#\u0010\u0006R\u001C\u0010$\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b%\u0010\u0006R\u001C\u0010&\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\'\u0010\u0006R\u001C\u0010(\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b)\u0010\u0006R\u001C\u0010*\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b+\u0010\u0006R\u001C\u0010,\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b-\u0010\u0006R\u001C\u0010.\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b/\u0010\u0006R\u001C\u00100\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b1\u0010\u0006R\u001C\u00102\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b3\u0010\u0006R\u001C\u00104\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b5\u0010\u0006R\u001C\u00106\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b7\u0010\u0006R\u001C\u00108\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b9\u0010\u0006R\u001C\u0010:\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b;\u0010\u0006R\u001C\u0010<\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b=\u0010\u0006R\u001C\u0010>\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b?\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006@"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode$Companion;", "", "()V", "Clear", "Landroidx/compose/ui/graphics/BlendMode;", "getClear-0nO6VwU", "()I", "I", "Color", "getColor-0nO6VwU", "ColorBurn", "getColorBurn-0nO6VwU", "ColorDodge", "getColorDodge-0nO6VwU", "Darken", "getDarken-0nO6VwU", "Difference", "getDifference-0nO6VwU", "Dst", "getDst-0nO6VwU", "DstAtop", "getDstAtop-0nO6VwU", "DstIn", "getDstIn-0nO6VwU", "DstOut", "getDstOut-0nO6VwU", "DstOver", "getDstOver-0nO6VwU", "Exclusion", "getExclusion-0nO6VwU", "Hardlight", "getHardlight-0nO6VwU", "Hue", "getHue-0nO6VwU", "Lighten", "getLighten-0nO6VwU", "Luminosity", "getLuminosity-0nO6VwU", "Modulate", "getModulate-0nO6VwU", "Multiply", "getMultiply-0nO6VwU", "Overlay", "getOverlay-0nO6VwU", "Plus", "getPlus-0nO6VwU", "Saturation", "getSaturation-0nO6VwU", "Screen", "getScreen-0nO6VwU", "Softlight", "getSoftlight-0nO6VwU", "Src", "getSrc-0nO6VwU", "SrcAtop", "getSrcAtop-0nO6VwU", "SrcIn", "getSrcIn-0nO6VwU", "SrcOut", "getSrcOut-0nO6VwU", "SrcOver", "getSrcOver-0nO6VwU", "Xor", "getXor-0nO6VwU", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getClear-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getColor-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getColorBurn-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getColorDodge-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDarken-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDifference-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDst-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstAtop-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstIn-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstOut-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getDstOver-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getExclusion-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getHardlight-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getHue-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getLighten-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getLuminosity-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getModulate-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getMultiply-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getOverlay-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getPlus-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSaturation-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getScreen-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSoftlight-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrc-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcAtop-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcIn-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcOut-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getSrcOver-0nO6VwU() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getXor-0nO6VwU() [...] // 潜在的解密器
    }

    private static final int Clear;
    private static final int Color;
    private static final int ColorBurn;
    private static final int ColorDodge;
    public static final Companion Companion;
    private static final int Darken;
    private static final int Difference;
    private static final int Dst;
    private static final int DstAtop;
    private static final int DstIn;
    private static final int DstOut;
    private static final int DstOver;
    private static final int Exclusion;
    private static final int Hardlight;
    private static final int Hue;
    private static final int Lighten;
    private static final int Luminosity;
    private static final int Modulate;
    private static final int Multiply;
    private static final int Overlay;
    private static final int Plus;
    private static final int Saturation;
    private static final int Screen;
    private static final int Softlight;
    private static final int Src;
    private static final int SrcAtop;
    private static final int SrcIn;
    private static final int SrcOut;
    private static final int SrcOver;
    private static final int Xor;
    private final int value;

    static {
        BlendMode.Companion = new Companion(null);
        BlendMode.Clear = 0;
        BlendMode.Src = 1;
        BlendMode.Dst = 2;
        BlendMode.SrcOver = 3;
        BlendMode.DstOver = 4;
        BlendMode.SrcIn = 5;
        BlendMode.DstIn = 6;
        BlendMode.SrcOut = 7;
        BlendMode.DstOut = 8;
        BlendMode.SrcAtop = 9;
        BlendMode.DstAtop = 10;
        BlendMode.Xor = 11;
        BlendMode.Plus = 12;
        BlendMode.Modulate = 13;
        BlendMode.Screen = 14;
        BlendMode.Overlay = 15;
        BlendMode.Darken = 16;
        BlendMode.Lighten = 17;
        BlendMode.ColorDodge = 18;
        BlendMode.ColorBurn = 19;
        BlendMode.Hardlight = 20;
        BlendMode.Softlight = 21;
        BlendMode.Difference = 22;
        BlendMode.Exclusion = 23;
        BlendMode.Multiply = 24;
        BlendMode.Hue = 25;
        BlendMode.Saturation = 26;
        BlendMode.Color = 27;
        BlendMode.Luminosity = 28;
    }

    private BlendMode(int v) {
        this.value = v;
    }

    public static final int access$getClear$cp() [...] // 潜在的解密器

    public static final int access$getColor$cp() [...] // 潜在的解密器

    public static final int access$getColorBurn$cp() [...] // 潜在的解密器

    public static final int access$getColorDodge$cp() [...] // 潜在的解密器

    public static final int access$getDarken$cp() [...] // 潜在的解密器

    public static final int access$getDifference$cp() [...] // 潜在的解密器

    public static final int access$getDst$cp() [...] // 潜在的解密器

    public static final int access$getDstAtop$cp() [...] // 潜在的解密器

    public static final int access$getDstIn$cp() [...] // 潜在的解密器

    public static final int access$getDstOut$cp() [...] // 潜在的解密器

    public static final int access$getDstOver$cp() [...] // 潜在的解密器

    public static final int access$getExclusion$cp() [...] // 潜在的解密器

    public static final int access$getHardlight$cp() [...] // 潜在的解密器

    public static final int access$getHue$cp() [...] // 潜在的解密器

    public static final int access$getLighten$cp() [...] // 潜在的解密器

    public static final int access$getLuminosity$cp() [...] // 潜在的解密器

    public static final int access$getModulate$cp() [...] // 潜在的解密器

    public static final int access$getMultiply$cp() [...] // 潜在的解密器

    public static final int access$getOverlay$cp() [...] // 潜在的解密器

    public static final int access$getPlus$cp() [...] // 潜在的解密器

    public static final int access$getSaturation$cp() [...] // 潜在的解密器

    public static final int access$getScreen$cp() [...] // 潜在的解密器

    public static final int access$getSoftlight$cp() [...] // 潜在的解密器

    public static final int access$getSrc$cp() [...] // 潜在的解密器

    public static final int access$getSrcAtop$cp() [...] // 潜在的解密器

    public static final int access$getSrcIn$cp() [...] // 潜在的解密器

    public static final int access$getSrcOut$cp() [...] // 潜在的解密器

    public static final int access$getSrcOver$cp() [...] // 潜在的解密器

    public static final int access$getXor$cp() [...] // 潜在的解密器

    public static final BlendMode box-impl(int v) {
        return new BlendMode(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return BlendMode.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof BlendMode ? v == ((BlendMode)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @Override
    public int hashCode() {
        return this.unbox-impl();
    }

    public static int hashCode-impl(int v) [...] // Inlined contents

    @Override
    public String toString() {
        return BlendMode.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(int v) {
        if(BlendMode.equals-impl0(v, BlendMode.Clear)) {
            return "Clear";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Src)) {
            return "Src";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Dst)) {
            return "Dst";
        }
        if(BlendMode.equals-impl0(v, 3)) {
            return "SrcOver";
        }
        if(BlendMode.equals-impl0(v, BlendMode.DstOver)) {
            return "DstOver";
        }
        if(BlendMode.equals-impl0(v, BlendMode.SrcIn)) {
            return "SrcIn";
        }
        if(BlendMode.equals-impl0(v, BlendMode.DstIn)) {
            return "DstIn";
        }
        if(BlendMode.equals-impl0(v, BlendMode.SrcOut)) {
            return "SrcOut";
        }
        if(BlendMode.equals-impl0(v, BlendMode.DstOut)) {
            return "DstOut";
        }
        if(BlendMode.equals-impl0(v, BlendMode.SrcAtop)) {
            return "SrcAtop";
        }
        if(BlendMode.equals-impl0(v, BlendMode.DstAtop)) {
            return "DstAtop";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Xor)) {
            return "Xor";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Plus)) {
            return "Plus";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Modulate)) {
            return "Modulate";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Screen)) {
            return "Screen";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Overlay)) {
            return "Overlay";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Darken)) {
            return "Darken";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Lighten)) {
            return "Lighten";
        }
        if(BlendMode.equals-impl0(v, BlendMode.ColorDodge)) {
            return "ColorDodge";
        }
        if(BlendMode.equals-impl0(v, BlendMode.ColorBurn)) {
            return "ColorBurn";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Hardlight)) {
            return "HardLight";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Softlight)) {
            return "Softlight";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Difference)) {
            return "Difference";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Exclusion)) {
            return "Exclusion";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Multiply)) {
            return "Multiply";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Hue)) {
            return "Hue";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Saturation)) {
            return "Saturation";
        }
        if(BlendMode.equals-impl0(v, BlendMode.Color)) {
            return "Color";
        }
        return BlendMode.equals-impl0(v, BlendMode.Luminosity) ? "Luminosity" : "Unknown";
    }

    public final int unbox-impl() {
        return this.value;
    }
}

