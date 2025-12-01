package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000B\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000F\b\u0081@\u0018\u0000 R2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001RB\u0014\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u0014\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0006\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0007B\u0012\u0012\u0006\u0010\b\u001A\u00020\t\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\nJ\u0016\u0010\u0015\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0016\u0010\nJ\u0016\u0010\u0017\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0018\u0010\nJ\u001E\u0010\u0019\u001A\u00020\f2\u0006\u0010\u001A\u001A\u00020\u0000H\u0096\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u001A\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001A\u001A\u0004\u0018\u00010\u001FH\u00D6\u0003\u00A2\u0006\u0004\b \u0010!J\u0016\u0010\"\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b#\u0010\nJ\u0010\u0010$\u001A\u00020\fH\u00D6\u0001\u00A2\u0006\u0004\b%\u0010\u000EJ\r\u0010&\u001A\u00020\u001E\u00A2\u0006\u0004\b\'\u0010(J\r\u0010)\u001A\u00020\u001E\u00A2\u0006\u0004\b*\u0010(J\r\u0010+\u001A\u00020\u001E\u00A2\u0006\u0004\b,\u0010(J\r\u0010-\u001A\u00020\u001E\u00A2\u0006\u0004\b.\u0010(J\u0016\u0010/\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u0010\nJ\r\u00101\u001A\u00020\f\u00A2\u0006\u0004\b2\u0010\u000EJ\r\u00103\u001A\u000204\u00A2\u0006\u0004\b5\u00106J\r\u00107\u001A\u00020\u0006\u00A2\u0006\u0004\b8\u00109J\r\u0010:\u001A\u00020\u0003\u00A2\u0006\u0004\b;\u0010<J\r\u0010=\u001A\u00020>\u00A2\u0006\u0004\b?\u0010@J\r\u0010A\u001A\u00020\f\u00A2\u0006\u0004\bB\u0010\u000EJ\r\u0010C\u001A\u00020D\u00A2\u0006\u0004\bE\u0010FJ\r\u0010G\u001A\u00020\f\u00A2\u0006\u0004\bH\u0010\u000EJ\r\u0010I\u001A\u00020\t\u00A2\u0006\u0004\bJ\u0010\nJ\u000F\u0010K\u001A\u00020>H\u0016\u00A2\u0006\u0004\bL\u0010@J\u0016\u0010M\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bN\u0010\nJ\u001B\u0010O\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bP\u0010QR\u0011\u0010\u000B\u001A\u00020\f8F\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\u00008F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001A\u00020\f8F\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\u000E\u0088\u0001\b\u00F8\u0001\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006S"}, d2 = {"Landroidx/compose/ui/graphics/Float16;", "", "value", "", "constructor-impl", "(F)S", "", "(D)S", "halfValue", "", "(S)S", "exponent", "", "getExponent-impl", "(S)I", "getHalfValue", "()S", "sign", "getSign-slo4al4", "significand", "getSignificand-impl", "absoluteValue", "absoluteValue-slo4al4", "ceil", "ceil-slo4al4", "compareTo", "other", "compareTo-41bOqos", "(SS)I", "equals", "", "", "equals-impl", "(SLjava/lang/Object;)Z", "floor", "floor-slo4al4", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(S)Z", "isInfinite", "isInfinite-impl", "isNaN", "isNaN-impl", "isNormalized", "isNormalized-impl", "round", "round-slo4al4", "toBits", "toBits-impl", "toByte", "", "toByte-impl", "(S)B", "toDouble", "toDouble-impl", "(S)D", "toFloat", "toFloat-impl", "(S)F", "toHexString", "", "toHexString-impl", "(S)Ljava/lang/String;", "toInt", "toInt-impl", "toLong", "", "toLong-impl", "(S)J", "toRawBits", "toRawBits-impl", "toShort", "toShort-impl", "toString", "toString-impl", "trunc", "trunc-slo4al4", "withSign", "withSign-qCeQghg", "(SS)S", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Float16 implements Comparable {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u001F\n\u0002\u0010\n\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J\u0010\u00101\u001A\u0002022\u0006\u00103\u001A\u00020\u0012H\u0002J\u0010\u00104\u001A\u00020\t2\u0006\u00105\u001A\u000202H\u0002R\u001C\u0010\u0003\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u000E\u0010\b\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000F\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\u0012X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0013\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0015\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0016\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0017\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0018\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0019\u001A\u00020\tX\u0082T\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u001A\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u001B\u0010\u0006R\u000E\u0010\u001C\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u001D\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u001E\u0010\u0006R\u000E\u0010\u001F\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000R\u001C\u0010 \u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b!\u0010\u0006R\u001C\u0010\"\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b#\u0010\u0006R\u001C\u0010$\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b%\u0010\u0006R\u001C\u0010&\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\'\u0010\u0006R\u0019\u0010(\u001A\u00020\u0004X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0007R\u001C\u0010)\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b*\u0010\u0006R\u0019\u0010+\u001A\u00020\u0004X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0007R\u001C\u0010,\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b-\u0010\u0006R\u001C\u0010.\u001A\u00020\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b/\u0010\u0006R\u000E\u00100\u001A\u00020\tX\u0086T\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00066"}, d2 = {"Landroidx/compose/ui/graphics/Float16$Companion;", "", "()V", "Epsilon", "Landroidx/compose/ui/graphics/Float16;", "getEpsilon-slo4al4", "()S", "S", "FP16_COMBINED", "", "FP16_EXPONENT_BIAS", "FP16_EXPONENT_MASK", "FP16_EXPONENT_MAX", "FP16_EXPONENT_SHIFT", "FP16_SIGNIFICAND_MASK", "FP16_SIGN_MASK", "FP16_SIGN_SHIFT", "FP32_DENORMAL_FLOAT", "", "FP32_DENORMAL_MAGIC", "FP32_EXPONENT_BIAS", "FP32_EXPONENT_MASK", "FP32_EXPONENT_SHIFT", "FP32_QNAN_MASK", "FP32_SIGNIFICAND_MASK", "FP32_SIGN_SHIFT", "LowestValue", "getLowestValue-slo4al4", "MaxExponent", "MaxValue", "getMaxValue-slo4al4", "MinExponent", "MinNormal", "getMinNormal-slo4al4", "MinValue", "getMinValue-slo4al4", "NaN", "getNaN-slo4al4", "NegativeInfinity", "getNegativeInfinity-slo4al4", "NegativeOne", "NegativeZero", "getNegativeZero-slo4al4", "One", "PositiveInfinity", "getPositiveInfinity-slo4al4", "PositiveZero", "getPositiveZero-slo4al4", "Size", "floatToHalf", "", "f", "toCompareValue", "value", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final short floatToHalf(float f) {
            int v = Float.floatToRawIntBits(f);
            int v1 = v >>> 23 & 0xFF;
            if(v1 == 0xFF) {
                return (v & 0x7FFFFF) == 0 ? ((short)(v >>> 0x1F << 15 | 0x7C00)) : ((short)(v >>> 0x1F << 15 | 0x7E00));
            }
            if(v1 - 0x70 >= 0x1F) {
                return (short)(v >>> 0x1F << 15 | 0xC400);
            }
            if(v1 - 0x70 <= 0) {
                if(v1 - 0x70 < -10) {
                    return (short)(v >>> 0x1F << 15);
                }
                int v2 = (v & 0x7FFFFF | 0x800000) >> 0x71 - v1;
                return (short)(v >>> 0x1F << 15 | ((v2 & 0x1000) == 0 ? (v & 0x7FFFFF | 0x800000) >> 0x71 - v1 : v2 + 0x2000) >> 13);
            }
            int v3 = (v & 0x7FFFFF) >> 13;
            return (v & 0x1000) == 0 ? ((short)(v >>> 0x1F << 15 | v1 - 0x70 << 10 | v3)) : ((short)((v1 - 0x70 << 10 | v3) + 1 | v >>> 0x1F << 15));
        }

        // 去混淆评级： 低(20)
        public final short getEpsilon-slo4al4() {
            return 0x1400;
        }

        // 去混淆评级： 低(20)
        public final short getLowestValue-slo4al4() {
            return 0xFFFFFBFF;
        }

        // 去混淆评级： 低(20)
        public final short getMaxValue-slo4al4() {
            return 0x7BFF;
        }

        // 去混淆评级： 低(20)
        public final short getMinNormal-slo4al4() {
            return 0x400;
        }

        // 去混淆评级： 低(20)
        public final short getMinValue-slo4al4() {
            return 1;
        }

        // 去混淆评级： 低(20)
        public final short getNaN-slo4al4() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final short getNegativeInfinity-slo4al4() {
            return 0xFFFFFC00;
        }

        // 去混淆评级： 低(20)
        public final short getNegativeZero-slo4al4() {
            return 0xFFFF8000;
        }

        // 去混淆评级： 低(20)
        public final short getPositiveInfinity-slo4al4() {
            return 0x7C00;
        }

        // 去混淆评级： 低(20)
        public final short getPositiveZero-slo4al4() {
            return 0;
        }

        private final int toCompareValue(short v) {
            return (v & 0x8000) == 0 ? v & 0xFFFF : 0x8000 - (v & 0xFFFF);
        }
    }

    public static final Companion Companion = null;
    private static final short Epsilon = 0;
    private static final int FP16_COMBINED = 0x7FFF;
    private static final int FP16_EXPONENT_BIAS = 15;
    private static final int FP16_EXPONENT_MASK = 0x1F;
    private static final int FP16_EXPONENT_MAX = 0x7C00;
    private static final int FP16_EXPONENT_SHIFT = 10;
    private static final int FP16_SIGNIFICAND_MASK = 0x3FF;
    private static final int FP16_SIGN_MASK = 0x8000;
    private static final int FP16_SIGN_SHIFT = 15;
    private static final float FP32_DENORMAL_FLOAT = 0.0f;
    private static final int FP32_DENORMAL_MAGIC = 0x3F000000;
    private static final int FP32_EXPONENT_BIAS = 0x7F;
    private static final int FP32_EXPONENT_MASK = 0xFF;
    private static final int FP32_EXPONENT_SHIFT = 23;
    private static final int FP32_QNAN_MASK = 0x400000;
    private static final int FP32_SIGNIFICAND_MASK = 0x7FFFFF;
    private static final int FP32_SIGN_SHIFT = 0x1F;
    private static final short LowestValue = 0;
    public static final int MaxExponent = 15;
    private static final short MaxValue = 0;
    public static final int MinExponent = -14;
    private static final short MinNormal = 0;
    private static final short MinValue = 0;
    private static final short NaN = 0;
    private static final short NegativeInfinity = 0;
    private static final short NegativeOne = 0;
    private static final short NegativeZero = 0;
    private static final short One = 0;
    private static final short PositiveInfinity = 0;
    private static final short PositiveZero = 0;
    public static final int Size = 16;
    private final short halfValue;

    static {
        Float16.Companion = new Companion(null);
        Float16.Epsilon = 0x1400;
        Float16.LowestValue = (short)0xFBFF;
        Float16.MaxValue = 0x7BFF;
        Float16.MinNormal = 0x400;
        Float16.MinValue = 1;
        Float16.NaN = 0x7E00;
        Float16.NegativeInfinity = (short)0xFC00;
        Float16.NegativeZero = (short)0x8000;
        Float16.PositiveInfinity = 0x7C00;
        Float16.PositiveZero = 0;
        Float16.One = 0x3C00;
        Float16.NegativeOne = (short)0xBC00;
        Float16.FP32_DENORMAL_FLOAT = 0.5f;
    }

    private Float16(short v) {
        this.halfValue = v;
    }

    public static final short absoluteValue-slo4al4(short v) {
        return (short)(v & 0x7FFF);
    }

    public static final short access$getEpsilon$cp() [...] // 潜在的解密器

    public static final short access$getLowestValue$cp() [...] // 潜在的解密器

    public static final short access$getMaxValue$cp() [...] // 潜在的解密器

    public static final short access$getMinNormal$cp() [...] // 潜在的解密器

    public static final short access$getMinValue$cp() [...] // 潜在的解密器

    public static final short access$getNaN$cp() [...] // 潜在的解密器

    public static final short access$getNegativeInfinity$cp() [...] // 潜在的解密器

    public static final short access$getNegativeZero$cp() [...] // 潜在的解密器

    public static final short access$getPositiveInfinity$cp() [...] // 潜在的解密器

    public static final short access$getPositiveZero$cp() [...] // 潜在的解密器

    public static final Float16 box-impl(short v) {
        return new Float16(v);
    }

    public static final short ceil-slo4al4(short v) {
        int v1 = v & 0xFFFF;
        int v2 = 1;
        if((v1 & 0x7FFF) < 0x3C00) {
            if((v1 & 0x7FFF) == 0) {
                v2 = 0;
            }
            return (short)(-(~(v1 >> 15) & v2) & 0x3C00 | 0x8000 & v1);
        }
        if((v1 & 0x7FFF) < 0x6400) {
            int v3 = (1 << 25 - ((v1 & 0x7FFF) >> 10)) - 1;
            v1 = v1 + (v3 & (v1 >> 15) - 1) & ~v3;
        }
        return (short)v1;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo-41bOqos(((Float16)object0).unbox-impl());
    }

    public static int compareTo-41bOqos(short v, short v1) {
        if(Float16.isNaN-impl(v)) {
            return !Float16.isNaN-impl(v1);
        }
        return Float16.isNaN-impl(v1) ? -1 : Intrinsics.compare(Float16.Companion.toCompareValue(v), Float16.Companion.toCompareValue(v1));
    }

    public int compareTo-41bOqos(short v) {
        return Float16.compareTo-41bOqos(this.unbox-impl(), v);
    }

    public static short constructor-impl(double f) {
        return Float16.constructor-impl(((float)f));
    }

    public static short constructor-impl(float f) [...] // 潜在的解密器

    public static short constructor-impl(short v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return Float16.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(short v, Object object0) {
        return object0 instanceof Float16 ? v == ((Float16)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(short v, short v1) {
        return v == v1;
    }

    public static final short floor-slo4al4(short v) {
        int v1 = 0xFFFF;
        int v2 = v & 0xFFFF;
        if((v2 & 0x7FFF) < 0x3C00) {
            if(v2 <= 0x8000) {
                v1 = 0;
            }
            return (short)(v1 & 0x3C00 | v2 & 0x8000);
        }
        if((v2 & 0x7FFF) < 0x6400) {
            int v3 = (1 << 25 - ((v2 & 0x7FFF) >> 10)) - 1;
            v2 = v2 + (-(v2 >> 15) & v3) & ~v3;
        }
        return (short)v2;
    }

    public static final int getExponent-impl(short v) {
        return (v >>> 10 & 0x1F) - 15;
    }

    public final short getHalfValue() {
        return this.unbox-impl();
    }

    public static final short getSign-slo4al4(short v) {
        if(Float16.isNaN-impl(v)) {
            return Float16.NaN;
        }
        if(Float16.compareTo-41bOqos(v, Float16.NegativeZero) < 0) {
            return Float16.NegativeOne;
        }
        return Float16.compareTo-41bOqos(v, Float16.PositiveZero) <= 0 ? v : Float16.One;
    }

    public static final int getSignificand-impl(short v) {
        return v & 0x3FF;
    }

    @Override
    public int hashCode() {
        return this.unbox-impl();
    }

    public static int hashCode-impl(short v) [...] // Inlined contents

    public static final boolean isFinite-impl(short v) {
        return (v & 0x7FFF) != 0x7C00;
    }

    public static final boolean isInfinite-impl(short v) {
        return (v & 0x7FFF) == 0x7C00;
    }

    public static final boolean isNaN-impl(short v) {
        return (v & 0x7FFF) > 0x7C00;
    }

    public static final boolean isNormalized-impl(short v) {
        return (v & 0x7C00) != 0 && (v & 0x7C00) != 0x7C00;
    }

    public static final short round-slo4al4(short v) {
        int v1 = 0xFFFF;
        int v2 = v & 0xFFFF;
        if((v2 & 0x7FFF) < 0x3C00) {
            if((v2 & 0x7FFF) < 0x3800) {
                v1 = 0;
            }
            return (short)(v2 & 0x8000 | v1 & 0x3C00);
        }
        if((v2 & 0x7FFF) < 0x6400) {
            int v3 = 25 - ((v2 & 0x7FFF) >> 10);
            v2 = v2 + (1 << v3 - 1) & ~((1 << v3) - 1);
        }
        return (short)v2;
    }

    public static final int toBits-impl(short v) {
        return Float16.isNaN-impl(v) ? Float16.NaN : v & 0xFFFF;
    }

    public static final byte toByte-impl(short v) {
        return (byte)(((int)Float16.toFloat-impl(v)));
    }

    public static final double toDouble-impl(short v) {
        return (double)Float16.toFloat-impl(v);
    }

    public static final float toFloat-impl(short v) {
        int v1 = 0x8000 & (v & 0xFFFF);
        int v2 = (v & 0xFFFF) >>> 10 & 0x1F;
        if(v2 == 0) {
            if((v & 0x3FF) != 0) {
                float f = Float.intBitsToFloat((v & 0x3FF) + 0x3F000000) - Float16.FP32_DENORMAL_FLOAT;
                return v1 == 0 ? f : -f;
            }
            return Float.intBitsToFloat(v1 << 16);
        }
        int v3 = (v & 0x3FF) << 13;
        if(v2 == 0x1F) {
            if(v3 != 0) {
                v3 |= 0x400000;
            }
            return Float.intBitsToFloat(0x7F800000 | v1 << 16 | v3);
        }
        return Float.intBitsToFloat(v2 + 0x70 << 23 | v1 << 16 | v3);
    }

    public static final String toHexString-impl(short v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v1 = (v & 0xFFFF) >>> 15;
        int v2 = (v & 0xFFFF) >>> 10 & 0x1F;
        if(v2 != 0x1F) {
            if(v1 == 1) {
                stringBuilder0.append('-');
            }
            if(v2 != 0) {
                stringBuilder0.append("0x1.");
                String s1 = Integer.toString(v & 0x3FF, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(s1, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                stringBuilder0.append(new Regex("0{2,}$").replaceFirst(s1, ""));
                stringBuilder0.append('p');
                stringBuilder0.append(String.valueOf(v2 - 15));
            }
            else if((v & 0x3FF) == 0) {
                stringBuilder0.append("0x0.0p0");
            }
            else {
                stringBuilder0.append("0x0.");
                String s = Integer.toString(v & 0x3FF, CharsKt.checkRadix(16));
                Intrinsics.checkNotNullExpressionValue(s, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                stringBuilder0.append(new Regex("0{2,}$").replaceFirst(s, ""));
                stringBuilder0.append("p-14");
            }
        }
        else if((v & 0x3FF) == 0) {
            if(v1 != 0) {
                stringBuilder0.append('-');
            }
            stringBuilder0.append("Infinity");
        }
        else {
            stringBuilder0.append("NaN");
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "o.toString()");
        return s2;
    }

    public static final int toInt-impl(short v) {
        return (int)Float16.toFloat-impl(v);
    }

    public static final long toLong-impl(short v) {
        return (long)Float16.toFloat-impl(v);
    }

    public static final int toRawBits-impl(short v) {
        return v & 0xFFFF;
    }

    public static final short toShort-impl(short v) {
        return (short)(((int)Float16.toFloat-impl(v)));
    }

    @Override
    public String toString() {
        return Float16.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(short v) {
        return String.valueOf(Float16.toFloat-impl(v));
    }

    public static final short trunc-slo4al4(short v) {
        if((v & 0x7FFF) < 0x3C00) {
            return (short)(v & 0x8000);
        }
        return (v & 0x7FFF) >= 0x6400 ? ((short)(v & 0xFFFF)) : ((short)(v & 0xFFFF & ~((1 << 25 - ((v & 0x7FFF) >> 10)) - 1)));
    }

    public final short unbox-impl() {
        return this.halfValue;
    }

    public static final short withSign-qCeQghg(short v, short v1) {
        return Float16.constructor-impl(((short)(v & 0x7FFF | v1 & 0x8000)));
    }
}

