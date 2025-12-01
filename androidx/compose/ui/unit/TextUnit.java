package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001E\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00020\u0000H\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001BJ!\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u001DH\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001E\u0010\u001FJ!\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0014H\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001E\u0010 J!\u0010\u001C\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0018H\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001E\u0010!J\u001A\u0010\"\u001A\u00020\u00072\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b#\u0010$J\u0010\u0010%\u001A\u00020\u0018H\u00D6\u0001\u00A2\u0006\u0004\b&\u0010\'J!\u0010(\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u001DH\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010\u001FJ!\u0010(\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0014H\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010 J!\u0010(\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0018H\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010!J\u000F\u0010*\u001A\u00020+H\u0016\u00A2\u0006\u0004\b,\u0010-J\u0019\u0010.\u001A\u00020\u0000H\u0086\n\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b/\u0010\u0005R\u0011\u0010\u0006\u001A\u00020\u00078F\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0011\u0010\n\u001A\u00020\u00078F\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u000E\u0010\u0002\u001A\u00020\u0003X\u0080\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\f\u001A\u00020\u00038@X\u0081\u0004\u00A2\u0006\f\u0012\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0005R\u001A\u0010\u0010\u001A\u00020\u00118F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0013\u001A\u00020\u00148F\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u00F8\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00061"}, d2 = {"Landroidx/compose/ui/unit/TextUnit;", "", "packedValue", "", "constructor-impl", "(J)J", "isEm", "", "isEm-impl", "(J)Z", "isSp", "isSp-impl", "rawType", "getRawType$annotations", "()V", "getRawType-impl", "type", "Landroidx/compose/ui/unit/TextUnitType;", "getType-UIouoOA", "value", "", "getValue-impl", "(J)F", "compareTo", "", "other", "compareTo--R2X_6o", "(JJ)I", "div", "", "div-kPz2Gy4", "(JD)J", "(JF)J", "(JI)J", "equals", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "(J)I", "times", "times-kPz2Gy4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "unaryMinus", "unaryMinus-XSAIIZE", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class TextUnit {
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001F\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\b\u001A\u0004\b\u0006\u0010\u0007R\'\u0010\t\u001A\u00020\n8\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u000E\u0012\u0004\b\u000B\u0010\u0002\u001A\u0004\b\f\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/unit/TextUnit$Companion;", "", "()V", "TextUnitTypes", "", "Landroidx/compose/ui/unit/TextUnitType;", "getTextUnitTypes$ui_unit_release", "()[Landroidx/compose/ui/unit/TextUnitType;", "[Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "Landroidx/compose/ui/unit/TextUnit;", "getUnspecified-XSAIIZE$annotations", "getUnspecified-XSAIIZE", "()J", "J", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final TextUnitType[] getTextUnitTypes$ui_unit_release() {
            return TextUnit.TextUnitTypes;
        }

        // 去混淆评级： 低(20)
        public final long getUnspecified-XSAIIZE() [...] // 潜在的解密器

        public static void getUnspecified-XSAIIZE$annotations() {
        }
    }

    public static final Companion Companion;
    private static final TextUnitType[] TextUnitTypes;
    private static final long Unspecified;
    private final long packedValue;

    // 去混淆评级： 低(20)
    static {
        TextUnit.Companion = new Companion(null);
        TextUnit.TextUnitTypes = new TextUnitType[]{TextUnitType.box-impl(0L), TextUnitType.box-impl(0x100000000L), TextUnitType.box-impl(0x200000000L)};
        TextUnit.Unspecified = 0x7FC00000L;
    }

    private TextUnit(long v) {
        this.packedValue = v;
    }

    public static final long access$getUnspecified$cp() [...] // 潜在的解密器

    public static final TextUnit box-impl(long v) {
        return new TextUnit(v);
    }

    public static final int compareTo--R2X_6o(long v, long v1) {
        TextUnitKt.checkArithmetic-NB67dxo(v, v1);
        return Float.compare(TextUnit.getValue-impl(v), TextUnit.getValue-impl(v1));
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    public static final long div-kPz2Gy4(long v, double f) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(TextUnit.getRawType-impl(v), ((float)(((double)TextUnit.getValue-impl(v)) / f)));
    }

    public static final long div-kPz2Gy4(long v, float f) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(v & 0xFF00000000L, TextUnit.getValue-impl(v) / f);
    }

    public static final long div-kPz2Gy4(long v, int v1) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(TextUnit.getRawType-impl(v), TextUnit.getValue-impl(v) / ((float)v1));
    }

    @Override
    public boolean equals(Object object0) {
        return TextUnit.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof TextUnit ? v == ((TextUnit)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static void getRawType$annotations() {
    }

    public static final long getRawType-impl(long v) [...] // Inlined contents

    public static final long getType-UIouoOA(long v) {
        return TextUnit.TextUnitTypes[((int)((v & 0xFF00000000L) >>> 0x20))].unbox-impl();
    }

    public static final float getValue-impl(long v) {
        return Float.intBitsToFloat(((int)(v & 0xFFFFFFFFL)));
    }

    @Override
    public int hashCode() {
        return TextUnit.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(long v) {
        return (int)(v ^ v >>> 0x20);
    }

    public static final boolean isEm-impl(long v) {
        return (v & 0xFF00000000L) == 0x200000000L;
    }

    public static final boolean isSp-impl(long v) {
        return (v & 0xFF00000000L) == 0x100000000L;
    }

    public static final long times-kPz2Gy4(long v, double f) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(v & 0xFF00000000L, ((float)(((double)TextUnit.getValue-impl(v)) * f)));
    }

    public static final long times-kPz2Gy4(long v, float f) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(v & 0xFF00000000L, TextUnit.getValue-impl(v) * f);
    }

    public static final long times-kPz2Gy4(long v, int v1) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(TextUnit.getRawType-impl(v), TextUnit.getValue-impl(v) * ((float)v1));
    }

    @Override
    public String toString() {
        return TextUnit.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(long v) {
        long v1 = TextUnit.getType-UIouoOA(v);
        if(TextUnitType.equals-impl0(v1, 0L)) {
            return "Unspecified";
        }
        if(TextUnitType.equals-impl0(v1, 0x100000000L)) {
            return TextUnit.getValue-impl(v) + ".sp";
        }
        return TextUnitType.equals-impl0(v1, 0x200000000L) ? TextUnit.getValue-impl(v) + ".em" : "Invalid";
    }

    public static final long unaryMinus-XSAIIZE(long v) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(v & 0xFF00000000L, -TextUnit.getValue-impl(v));
    }

    public final long unbox-impl() {
        return this.packedValue;
    }
}

