package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0087@\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001&B\u0012\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001E\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0000H\u0097\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001E\u0010\r\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ!\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000FJ!\u0010\r\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\tH\u0087\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001A\u0010\u0012\u001A\u00020\u00132\b\u0010\n\u001A\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001A\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001E\u0010\u001A\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u000FJ\u001E\u0010\u001C\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\u000FJ!\u0010\u001E\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u0003H\u0087\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001F\u0010\u000FJ!\u0010\u001E\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\tH\u0087\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001F\u0010\u0011J\u000F\u0010 \u001A\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001A\u00020\u0000H\u0087\nø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b%\u0010\u0005R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\'"}, d2 = {"Landroidx/compose/ui/unit/Dp;", "", "value", "", "constructor-impl", "(F)F", "getValue", "()F", "compareTo", "", "other", "compareTo-0680j_4", "(FF)I", "div", "div-0680j_4", "(FF)F", "div-u2uoSUM", "(FI)F", "equals", "", "", "equals-impl", "(FLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(F)I", "minus", "minus-5rwHm24", "plus", "plus-5rwHm24", "times", "times-u2uoSUM", "toString", "", "toString-impl", "(F)Ljava/lang/String;", "unaryMinus", "unaryMinus-D9Ej5fM", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Dp implements Comparable {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\'\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\'\u0010\t\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\n\u0010\u0002\u001A\u0004\b\u000B\u0010\u0007R\'\u0010\f\u001A\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\r\u0010\u0002\u001A\u0004\b\u000E\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/unit/Dp$Companion;", "", "()V", "Hairline", "Landroidx/compose/ui/unit/Dp;", "getHairline-D9Ej5fM$annotations", "getHairline-D9Ej5fM", "()F", "F", "Infinity", "getInfinity-D9Ej5fM$annotations", "getInfinity-D9Ej5fM", "Unspecified", "getUnspecified-D9Ej5fM$annotations", "getUnspecified-D9Ej5fM", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final float getHairline-D9Ej5fM() {
            return 0.0f;
        }

        public static void getHairline-D9Ej5fM$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getInfinity-D9Ej5fM() {
            return Infinityf;
        }

        public static void getInfinity-D9Ej5fM$annotations() {
        }

        // 去混淆评级： 低(20)
        public final float getUnspecified-D9Ej5fM() {
            return NaNf;
        }

        public static void getUnspecified-D9Ej5fM$annotations() {
        }
    }

    public static final Companion Companion;
    private static final float Hairline;
    private static final float Infinity;
    private static final float Unspecified;
    private final float value;

    static {
        Dp.Companion = new Companion(null);
        Dp.Hairline = 0.0f;
        Dp.Infinity = Infinityf;
        Dp.Unspecified = NaNf;
    }

    private Dp(float f) {
        this.value = f;
    }

    public static final float access$getHairline$cp() [...] // 潜在的解密器

    public static final float access$getInfinity$cp() [...] // 潜在的解密器

    public static final float access$getUnspecified$cp() [...] // 潜在的解密器

    public static final Dp box-impl(float f) {
        return new Dp(f);
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo-0680j_4(((Dp)object0).unbox-impl());
    }

    public static int compareTo-0680j_4(float f, float f1) {
        return Float.compare(f, f1);
    }

    public int compareTo-0680j_4(float f) {
        return Dp.compareTo-0680j_4(this.unbox-impl(), f);
    }

    public static float constructor-impl(float f) [...] // Inlined contents

    public static final float div-0680j_4(float f, float f1) {
        return f / f1;
    }

    public static final float div-u2uoSUM(float f, float f1) {
        return Dp.constructor-impl(f / f1);
    }

    public static final float div-u2uoSUM(float f, int v) {
        return Dp.constructor-impl(f / ((float)v));
    }

    @Override
    public boolean equals(Object object0) {
        return Dp.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(float f, Object object0) {
        return object0 instanceof Dp ? Intrinsics.areEqual(f, ((Dp)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(float f, float f1) {
        return Intrinsics.areEqual(f, f1);
    }

    public final float getValue() {
        return this.unbox-impl();
    }

    @Override
    public int hashCode() {
        return Dp.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(float f) {
        return Float.floatToIntBits(f);
    }

    public static final float minus-5rwHm24(float f, float f1) {
        return f - f1;
    }

    public static final float plus-5rwHm24(float f, float f1) {
        return f + f1;
    }

    public static final float times-u2uoSUM(float f, float f1) {
        return f * f1;
    }

    public static final float times-u2uoSUM(float f, int v) {
        return f * ((float)v);
    }

    @Override
    public String toString() {
        return Dp.toString-impl(this.unbox-impl());
    }

    // 去混淆评级： 低(20)
    public static String toString-impl(float f) {
        return Float.isNaN(f) ? "Dp.Unspecified" : f + ".dp";
    }

    public static final float unaryMinus-D9Ej5fM(float f) {
        return -f;
    }

    public final float unbox-impl() {
        return this.value;
    }
}

