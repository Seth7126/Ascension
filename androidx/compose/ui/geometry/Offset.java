package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0087@\u0018\u0000 92\u00020\u0001:\u00019B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000F\u001A\u00020\u0007H\u0087\u0002\u00A2\u0006\u0004\b\u0010\u0010\u000BJ\u0010\u0010\u0011\u001A\u00020\u0007H\u0087\u0002\u00A2\u0006\u0004\b\u0012\u0010\u000BJ*\u0010\u0013\u001A\u00020\u00002\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\f\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u0007H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001A\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010\u001F\u001A\u00020\u0007H\u0007\u00A2\u0006\u0004\b \u0010\u000BJ\u000F\u0010!\u001A\u00020\u0007H\u0007\u00A2\u0006\u0004\b\"\u0010\u000BJ\u0010\u0010#\u001A\u00020$H\u00D6\u0001\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020\u001BH\u0007\u00A2\u0006\u0004\b(\u0010)J\u001E\u0010*\u001A\u00020\u00002\u0006\u0010\u001C\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0002\u00A2\u0006\u0004\b+\u0010,J\u001E\u0010-\u001A\u00020\u00002\u0006\u0010\u001C\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0002\u00A2\u0006\u0004\b.\u0010,J!\u0010/\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u0007H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b0\u0010\u0019J!\u00101\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u0007H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b2\u0010\u0019J\u000F\u00103\u001A\u000204H\u0016\u00A2\u0006\u0004\b5\u00106J\u0019\u00107\u001A\u00020\u0000H\u0087\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\b8\u0010\u0005R\u000E\u0010\u0002\u001A\u00020\u0003X\u0080\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0006\u001A\u00020\u00078FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\u00078FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\r\u0010\t\u001A\u0004\b\u000E\u0010\u000B\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u00F8\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006:"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "", "packedValue", "", "constructor-impl", "(J)J", "x", "", "getX$annotations", "()V", "getX-impl", "(J)F", "y", "getY$annotations", "getY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-dBAh8RU", "(JFF)J", "div", "operand", "div-tuRUvjQ", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "getDistance", "getDistance-impl", "getDistanceSquared", "getDistanceSquared-impl", "hashCode", "", "hashCode-impl", "(J)I", "isValid", "isValid-impl", "(J)Z", "minus", "minus-MK-Hz9U", "(JJ)J", "plus", "plus-MK-Hz9U", "rem", "rem-tuRUvjQ", "times", "times-tuRUvjQ", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-F1C5BW0", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Offset {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\'\u0010\t\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001A\u0004\b\u000B\u0010\u0007R\'\u0010\f\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001A\u0004\b\u000E\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/geometry/Offset$Companion;", "", "()V", "Infinite", "Landroidx/compose/ui/geometry/Offset;", "getInfinite-F1C5BW0$annotations", "getInfinite-F1C5BW0", "()J", "J", "Unspecified", "getUnspecified-F1C5BW0$annotations", "getUnspecified-F1C5BW0", "Zero", "getZero-F1C5BW0$annotations", "getZero-F1C5BW0", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getInfinite-F1C5BW0() [...] // 潜在的解密器

        public static void getInfinite-F1C5BW0$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-F1C5BW0() [...] // 潜在的解密器

        public static void getUnspecified-F1C5BW0$annotations() {
        }

        // 去混淆评级： 低(20)
        public final long getZero-F1C5BW0() [...] // 潜在的解密器

        public static void getZero-F1C5BW0$annotations() {
        }
    }

    public static final Companion Companion;
    private static final long Infinite;
    private static final long Unspecified;
    private static final long Zero;
    private final long packedValue;

    static {
        Offset.Companion = new Companion(null);
        Offset.Zero = 0L;
        Offset.Infinite = 0x7F8000007F800000L;
        Offset.Unspecified = 0x7FC000007FC00000L;
    }

    private Offset(long v) {
        this.packedValue = v;
    }

    public static final long access$getInfinite$cp() [...] // 潜在的解密器

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final long access$getZero$cp() [...] // 潜在的解密器

    public static final Offset box-impl(long v) {
        return new Offset(v);
    }

    public static final float component1-impl(long v) {
        return Offset.getX-impl(v);
    }

    public static final float component2-impl(long v) {
        return Offset.getY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-dBAh8RU(long v, float f, float f1) {
        return OffsetKt.Offset(f, f1);
    }

    public static long copy-dBAh8RU$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = Offset.getX-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = Offset.getY-impl(v);
        }
        return Offset.copy-dBAh8RU(v, f, f1);
    }

    public static final long div-tuRUvjQ(long v, float f) {
        return OffsetKt.Offset(Offset.getX-impl(v) / f, Offset.getY-impl(v) / f);
    }

    @Override
    public boolean equals(Object object0) {
        return Offset.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof Offset ? v == ((Offset)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final float getDistance-impl(long v) {
        return (float)Math.sqrt(Offset.getX-impl(v) * Offset.getX-impl(v) + Offset.getY-impl(v) * Offset.getY-impl(v));
    }

    public static final float getDistanceSquared-impl(long v) {
        return Offset.getX-impl(v) * Offset.getX-impl(v) + Offset.getY-impl(v) * Offset.getY-impl(v);
    }

    public static void getX$annotations() {
    }

    public static final float getX-impl(long v) {
        if(v == Offset.Unspecified) {
            throw new IllegalStateException("Offset is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static void getY$annotations() {
    }

    public static final float getY-impl(long v) {
        if(v == Offset.Unspecified) {
            throw new IllegalStateException("Offset is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return Offset.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final boolean isValid-impl(long v) {
        if(Float.isNaN(Offset.getX-impl(v)) || Float.isNaN(Offset.getY-impl(v))) {
            throw new IllegalStateException("Offset argument contained a NaN value.");
        }
        return true;
    }

    public static final long minus-MK-Hz9U(long v, long v1) {
        return OffsetKt.Offset(Offset.getX-impl(v) - Offset.getX-impl(v1), Offset.getY-impl(v) - Offset.getY-impl(v1));
    }

    public static final long plus-MK-Hz9U(long v, long v1) {
        return OffsetKt.Offset(Offset.getX-impl(v) + Offset.getX-impl(v1), Offset.getY-impl(v) + Offset.getY-impl(v1));
    }

    public static final long rem-tuRUvjQ(long v, float f) {
        return OffsetKt.Offset(Offset.getX-impl(v) % f, Offset.getY-impl(v) % f);
    }

    public static final long times-tuRUvjQ(long v, float f) {
        return OffsetKt.Offset(Offset.getX-impl(v) * f, Offset.getY-impl(v) * f);
    }

    @Override
    public String toString() {
        return Offset.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        return "Offset(" + GeometryUtilsKt.toStringAsFixed(Offset.getX-impl(v), 1) + ", " + GeometryUtilsKt.toStringAsFixed(Offset.getY-impl(v), 1) + ')';
    }

    public static final long unaryMinus-F1C5BW0(long v) {
        return OffsetKt.Offset(-Offset.getX-impl(v), -Offset.getY-impl(v));
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

