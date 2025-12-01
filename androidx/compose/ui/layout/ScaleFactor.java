package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 *2\u00020\u0001:\u0001*B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0010\u001A\u00020\tH\u0087\n¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0012\u001A\u00020\tH\u0087\n¢\u0006\u0004\b\u0013\u0010\fJ*\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001E\u0010\u001FJ\u0010\u0010 \u001A\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J!\u0010$\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\tH\u0087\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b%\u0010\u001AJ\u000F\u0010&\u001A\u00020\'H\u0016¢\u0006\u0004\b(\u0010)R\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000E\u0010\u0007\u001A\u0004\b\u000F\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "scaleX", "", "getScaleX$annotations", "getScaleX-impl", "(J)F", "scaleY", "getScaleY$annotations", "getScaleY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-8GGzs04", "(JFF)J", "div", "operand", "div-44nBxM0", "(JF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "times", "times-44nBxM0", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class ScaleFactor {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/ui/layout/ScaleFactor$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/layout/ScaleFactor;", "getUnspecified-_hLwfpc$annotations", "getUnspecified-_hLwfpc", "()J", "J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-_hLwfpc() [...] // 潜在的解密器

        public static void getUnspecified-_hLwfpc$annotations() {
        }
    }

    public static final Companion Companion;
    private static final long Unspecified;
    private final long packedValue;

    static {
        ScaleFactor.Companion = new Companion(null);
        ScaleFactor.Unspecified = 0x7FC000007FC00000L;
    }

    private ScaleFactor(long v) {
        this.packedValue = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final ScaleFactor box-impl(long v) {
        return new ScaleFactor(v);
    }

    public static final float component1-impl(long v) {
        return ScaleFactor.getScaleX-impl(v);
    }

    public static final float component2-impl(long v) {
        return ScaleFactor.getScaleY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-8GGzs04(long v, float f, float f1) {
        return ScaleFactorKt.ScaleFactor(f, f1);
    }

    public static long copy-8GGzs04$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = ScaleFactor.getScaleX-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = ScaleFactor.getScaleY-impl(v);
        }
        return ScaleFactor.copy-8GGzs04(v, f, f1);
    }

    public static final long div-44nBxM0(long v, float f) {
        return ScaleFactorKt.ScaleFactor(ScaleFactor.getScaleX-impl(v) / f, ScaleFactor.getScaleY-impl(v) / f);
    }

    @Override
    public boolean equals(Object object0) {
        return ScaleFactor.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof ScaleFactor ? v == ((ScaleFactor)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getPackedValue$annotations() {
    }

    public static void getScaleX$annotations() {
    }

    public static final float getScaleX-impl(long v) {
        if(v == ScaleFactor.Unspecified) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static void getScaleY$annotations() {
    }

    public static final float getScaleY-impl(long v) {
        if(v == 0x7FC000007FC00000L) {
            throw new IllegalStateException("ScaleFactor is unspecified");
        }
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return ScaleFactor.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final long times-44nBxM0(long v, float f) {
        return ScaleFactorKt.ScaleFactor(ScaleFactor.getScaleX-impl(v) * f, ScaleFactor.getScaleY-impl(v) * f);
    }

    @Override
    public String toString() {
        return ScaleFactor.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        return "ScaleFactor(" + ScaleFactorKt.roundToTenths(ScaleFactor.getScaleX-impl(v)) + ", " + ScaleFactorKt.roundToTenths(ScaleFactor.getScaleY-impl(v)) + ')';
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

