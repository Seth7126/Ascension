package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000E\u001A\u00020\tH\u0087\n¢\u0006\u0004\b\u000F\u0010\u000BJ\u0010\u0010\u0010\u001A\u00020\tH\u0087\n¢\u0006\u0004\b\u0011\u0010\u000BJ*\u0010\u0012\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001A\u001A\u00020\u001BHÖ\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ\u0010\u0010\u001E\u001A\u00020\u001FHÖ\u0001¢\u0006\u0004\b \u0010!R\u0016\u0010\u0002\u001A\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\f\u001A\u00020\t8F¢\u0006\u0006\u001A\u0004\b\r\u0010\u000B\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "pivotFractionX", "", "getPivotFractionX-impl", "(J)F", "pivotFractionY", "getPivotFractionY-impl", "component1", "component1-impl", "component2", "component2-impl", "copy", "copy-zey9I6w", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class TransformOrigin {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/TransformOrigin$Companion;", "", "()V", "Center", "Landroidx/compose/ui/graphics/TransformOrigin;", "getCenter-SzJe1aQ", "()J", "J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final long getCenter-SzJe1aQ() [...] // 潜在的解密器
    }

    private static final long Center;
    public static final Companion Companion;
    private final long packedValue;

    static {
        TransformOrigin.Companion = new Companion(null);
        TransformOrigin.Center = 0x3F0000003F000000L;
    }

    private TransformOrigin(long v) {
        this.packedValue = v;
    }

    public static final long access$getCenter$cp() [...] // 潜在的解密器

    public static final TransformOrigin box-impl(long v) {
        return new TransformOrigin(v);
    }

    public static final float component1-impl(long v) {
        return TransformOrigin.getPivotFractionX-impl(v);
    }

    public static final float component2-impl(long v) {
        return TransformOrigin.getPivotFractionY-impl(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long copy-zey9I6w(long v, float f, float f1) {
        return TransformOriginKt.TransformOrigin(f, f1);
    }

    public static long copy-zey9I6w$default(long v, float f, float f1, int v1, Object object0) {
        if((v1 & 1) != 0) {
            f = TransformOrigin.getPivotFractionX-impl(v);
        }
        if((v1 & 2) != 0) {
            f1 = TransformOrigin.getPivotFractionY-impl(v);
        }
        return TransformOrigin.copy-zey9I6w(v, f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        return TransformOrigin.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof TransformOrigin ? v == ((TransformOrigin)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getPackedValue$annotations() {
    }

    public static final float getPivotFractionX-impl(long v) {
        return Float.intBitsToFloat(((int)(v >> 0x20)));
    }

    public static final float getPivotFractionY-impl(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return TransformOrigin.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    @Override
    public String toString() {
        return TransformOrigin.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        return "TransformOrigin(packedValue=" + v + ')';
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

