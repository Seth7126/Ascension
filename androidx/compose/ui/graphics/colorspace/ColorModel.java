package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0011\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000BJ\u000F\u0010\u0013\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001A\u0010\u0006\u001A\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u000E\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel;", "", "packedValue", "", "constructor-impl", "(J)J", "componentCount", "", "getComponentCount$annotations", "()V", "getComponentCount-impl", "(J)I", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class ColorModel {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u001C\u0010\n\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006R\u001C\u0010\f\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\r\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorModel$Companion;", "", "()V", "Cmyk", "Landroidx/compose/ui/graphics/colorspace/ColorModel;", "getCmyk-xdoWZVw", "()J", "J", "Lab", "getLab-xdoWZVw", "Rgb", "getRgb-xdoWZVw", "Xyz", "getXyz-xdoWZVw", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getCmyk-xdoWZVw() {
            return 0x400000003L;
        }

        // 去混淆评级： 低(20)
        public final long getLab-xdoWZVw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getRgb-xdoWZVw() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final long getXyz-xdoWZVw() [...] // 潜在的解密器
    }

    private static final long Cmyk;
    public static final Companion Companion;
    private static final long Lab;
    private static final long Rgb;
    private static final long Xyz;
    private final long packedValue;

    static {
        ColorModel.Companion = new Companion(null);
        ColorModel.Rgb = 0x300000000L;
        ColorModel.Xyz = 0x300000001L;
        ColorModel.Lab = 0x300000002L;
        ColorModel.Cmyk = 0x400000003L;
    }

    private ColorModel(long v) {
        this.packedValue = v;
    }

    public static final long access$getCmyk$cp() [...] // 潜在的解密器

    public static final long access$getLab$cp() [...] // 潜在的解密器

    public static final long access$getRgb$cp() [...] // 潜在的解密器

    public static final long access$getXyz$cp() [...] // 潜在的解密器

    public static final ColorModel box-impl(long v) {
        return new ColorModel(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return ColorModel.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof ColorModel ? v == ((ColorModel)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getComponentCount$annotations() {
    }

    public static final int getComponentCount-impl(long v) [...] // Inlined contents

    @Override
    public int hashCode() {
        return ColorModel.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    public String toString() {
        return ColorModel.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        if(ColorModel.equals-impl0(v, 0x300000000L)) {
            return "Rgb";
        }
        if(ColorModel.equals-impl0(v, 0x300000001L)) {
            return "Xyz";
        }
        if(ColorModel.equals-impl0(v, 0x300000002L)) {
            return "Lab";
        }
        return ColorModel.equals-impl0(v, ColorModel.Cmyk) ? "Cmyk" : "Unknown";
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

