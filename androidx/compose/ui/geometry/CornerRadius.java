package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0087@\u0018\u0000 12\u00020\u0001:\u00011B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001A\u00020\tH\u0087\n\u00A2\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001A\u00020\tH\u0087\n\u00A2\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\t\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\tH\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020!H\u00D6\u0001\u00A2\u0006\u0004\b\"\u0010#J\u001E\u0010$\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0002\u00A2\u0006\u0004\b%\u0010&J\u001E\u0010\'\u001A\u00020\u00002\u0006\u0010\u001D\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0002\u00A2\u0006\u0004\b(\u0010&J!\u0010)\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\tH\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b*\u0010\u001AJ\u000F\u0010+\u001A\u00020,H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0019\u0010/\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b0\u0010\u0005R\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004\u00A2\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\t8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\n\u0010\u0007\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\t8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u000E\u0010\u0007\u001A\u0004\b\u000F\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u00F8\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u00062"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "", "getX$annotations", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-OHQCggk", "(JFF)J", "div", "operand", "div-Bz7bX_o", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-vF7b-mM", "(JJ)J", "plus", "plus-vF7b-mM", "times", "times-Bz7bX_o", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-kKHJgLs", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class CornerRadius {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/geometry/CornerRadius$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/CornerRadius;", "getZero-kKHJgLs$annotations", "getZero-kKHJgLs", "()J", "J", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getZero-kKHJgLs() [...] // 潜在的解密器

        public static void getZero-kKHJgLs$annotations() {
        }
    }

    public static final Companion Companion;
    private static final long Zero;
    private final long packedValue;

    static {
        CornerRadius.Companion = new Companion(null);
        CornerRadius.Zero = 0L;
    }

    private CornerRadius(long v) {
        this.packedValue = v;
    }

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final CornerRadius box-impl(long v) {
        return new CornerRadius(v);
    }

    public static final float component1-impl(long v) {
        return CornerRadius.getX-impl(v);
    }

    public static final float component2-impl(long v) {
        return CornerRadius.getY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-OHQCggk(long v, float f, float f1) {
        return CornerRadiusKt.CornerRadius(f, f1);
    }

    public static long copy-OHQCggk$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = CornerRadius.getX-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = CornerRadius.getY-impl(v);
        }
        return CornerRadius.copy-OHQCggk(v, f, f1);
    }

    public static final long div-Bz7bX_o(long v, float f) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v) / f, CornerRadius.getY-impl(v) / f);
    }

    @Override
    public boolean equals(Object object0) {
        return CornerRadius.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof CornerRadius ? v == ((CornerRadius)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getPackedValue$annotations() {
    }

    public static void getX$annotations() {
    }

    public static final float getX-impl(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static void getY$annotations() {
    }

    public static final float getY-impl(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return CornerRadius.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final long minus-vF7b-mM(long v, long v1) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v) - CornerRadius.getX-impl(v1), CornerRadius.getY-impl(v) - CornerRadius.getY-impl(v1));
    }

    public static final long plus-vF7b-mM(long v, long v1) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v) + CornerRadius.getX-impl(v1), CornerRadius.getY-impl(v) + CornerRadius.getY-impl(v1));
    }

    public static final long times-Bz7bX_o(long v, float f) {
        return CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(v) * f, CornerRadius.getY-impl(v) * f);
    }

    @Override
    public String toString() {
        return CornerRadius.toString-impl(this.unbox-impl());
    }

    // 去混淆评级： 低(40)
    public static String toString-impl(long v) {
        return CornerRadius.getX-impl(v) == CornerRadius.getY-impl(v) ? "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1) + ')' : "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1) + ", " + GeometryUtilsKt.toStringAsFixed(CornerRadius.getY-impl(v), 1) + ')';
    }

    public static final long unaryMinus-kKHJgLs(long v) {
        return CornerRadiusKt.CornerRadius(-CornerRadius.getX-impl(v), -CornerRadius.getY-impl(v));
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

