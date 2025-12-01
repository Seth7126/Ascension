package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001A\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 32\u00020\u0001:\u00013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0016\u001A\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0017\u0010\u000BJ\u0010\u0010\u0018\u001A\u00020\u0007H\u0087\n¢\u0006\u0004\b\u0019\u0010\u000BJ*\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0013\u001A\u00020\u00072\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001B\u0010\u001CJ!\u0010\u001D\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001F\u0010 J\u001A\u0010!\u001A\u00020\"2\b\u0010#\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001A\u00020\'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u000F\u0010*\u001A\u00020\"H\u0007¢\u0006\u0004\b+\u0010,J!\u0010-\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u0007H\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b.\u0010 J\u000F\u0010/\u001A\u000200H\u0016¢\u0006\u0004\b1\u00102R\u001A\u0010\u0006\u001A\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\t\u001A\u0004\b\u000E\u0010\u000BR\u001A\u0010\u000F\u001A\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\t\u001A\u0004\b\u0011\u0010\u000BR\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\tR\u001A\u0010\u0013\u001A\u00020\u00078FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\t\u001A\u0004\b\u0015\u0010\u000B\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u00064"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "", "packedValue", "", "constructor-impl", "(J)J", "height", "", "getHeight$annotations", "()V", "getHeight-impl", "(J)F", "maxDimension", "getMaxDimension$annotations", "getMaxDimension-impl", "minDimension", "getMinDimension$annotations", "getMinDimension-impl", "getPackedValue$annotations", "width", "getWidth$annotations", "getWidth-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-xjbvk4A", "(JFF)J", "div", "operand", "div-7Ah8Wj8", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "isEmpty", "isEmpty-impl", "(J)Z", "times", "times-7Ah8Wj8", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Size {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\'\u0010\t\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001A\u0004\b\u000B\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\f"}, d2 = {"Landroidx/compose/ui/geometry/Size$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/geometry/Size;", "getUnspecified-NH-jbRc$annotations", "getUnspecified-NH-jbRc", "()J", "J", "Zero", "getZero-NH-jbRc$annotations", "getZero-NH-jbRc", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-NH-jbRc() [...] // 潜在的解密器

        public static void getUnspecified-NH-jbRc$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getZero-NH-jbRc() [...] // 潜在的解密器

        public static void getZero-NH-jbRc$annotations() {
        }
    }

    public static final Companion Companion;
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    static {
        Size.Companion = new Companion(null);
        Size.Zero = 0L;
        Size.Unspecified = 0x7FC000007FC00000L;
    }

    private Size(long v) {
        this.packedValue = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final Size box-impl(long v) {
        return new Size(v);
    }

    public static final float component1-impl(long v) {
        return Size.getWidth-impl(v);
    }

    public static final float component2-impl(long v) {
        return Size.getHeight-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-xjbvk4A(long v, float f, float f1) {
        return SizeKt.Size(f, f1);
    }

    public static long copy-xjbvk4A$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Size.getWidth-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = Size.getHeight-impl(v);
        }
        return Size.copy-xjbvk4A(v, f, f1);
    }

    public static final long div-7Ah8Wj8(long v, float f) {
        return SizeKt.Size(Size.getWidth-impl(v) / f, Size.getHeight-impl(v) / f);
    }

    @Override
    public boolean equals(Object object0) {
        return Size.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Size ? v == ((Size)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getHeight$annotations() {
    }

    public static final float getHeight-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    public static void getMaxDimension$annotations() {
    }

    public static final float getMaxDimension-impl(long v) {
        return Math.max(Math.abs(Size.getWidth-impl(v)), Math.abs(Size.getHeight-impl(v)));
    }

    public static void getMinDimension$annotations() {
    }

    public static final float getMinDimension-impl(long v) {
        return Math.min(Math.abs(Size.getWidth-impl(v)), Math.abs(Size.getHeight-impl(v)));
    }

    public static void getPackedValue$annotations() {
    }

    public static void getWidth$annotations() {
    }

    public static final float getWidth-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    @Override
    public int hashCode() {
        return Size.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final boolean isEmpty-impl(long v) {
        return Size.getWidth-impl(v) <= 0.0f || Size.getHeight-impl(v) <= 0.0f;
    }

    public static final long times-7Ah8Wj8(long v, float f) {
        return SizeKt.Size(Size.getWidth-impl(v) * f, Size.getHeight-impl(v) * f);
    }

    @Override
    public String toString() {
        return Size.toString-impl(this.unbox-impl());
    }

    // 去混淆评级： 低(40)
    public static String toString-impl(long v) {
        return v == 0x7FC000007FC00000L ? "Size(" + GeometryUtilsKt.toStringAsFixed(Size.getWidth-impl(v), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Size.getHeight-impl(v), 1) + ')' : "Size(UNSPECIFIED)";
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

