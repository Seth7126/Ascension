package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\u001A%\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020\f2\u0006\u0010 \u001A\u00020!H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#\u001A\u001D\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020\u0006H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010\u0015\u001A%\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u0006H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b)\u0010*\u001A-\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020\u00062\u0006\u0010(\u001A\u00020\u00062\u0006\u0010+\u001A\u00020\u0006H\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b,\u0010-\u001A-\u0010.\u001A\u00020\u00062\u0006\u0010/\u001A\u00020\u00062\u0006\u00100\u001A\u00020\u00062\u0006\u00101\u001A\u00020\fH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b2\u00103\u001A \u00104\u001A\u00020\u00062\u0006\u00105\u001A\u00020\u00012\u0006\u00106\u001A\u00020\fH\u0001\u00F8\u0001\u0000\u00A2\u0006\u0002\u00107\u001A+\u00108\u001A\u00020\u0006*\u00020\u00062\f\u00109\u001A\b\u0012\u0004\u0012\u00020\u00060:H\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b;\u0010<\u001A\"\u0010=\u001A\u00020\u0006*\u00020\u00072\u0006\u0010>\u001A\u00020\u0006H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b?\u0010@\u001A\"\u0010=\u001A\u00020\u0006*\u00020\f2\u0006\u0010>\u001A\u00020\u0006H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b?\u0010#\u001A\"\u0010=\u001A\u00020\u0006*\u00020\u000F2\u0006\u0010>\u001A\u00020\u0006H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b?\u0010A\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"!\u0010\u0005\u001A\u00020\u0006*\u00020\u00078FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"!\u0010\u0005\u001A\u00020\u0006*\u00020\f8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\b\u0010\r\u001A\u0004\b\n\u0010\u000E\"!\u0010\u0005\u001A\u00020\u0006*\u00020\u000F8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\b\u0010\u0010\u001A\u0004\b\n\u0010\u0011\"\"\u0010\u0012\u001A\u00020\u0013*\u00020\u00068\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017\"!\u0010\u0018\u001A\u00020\u0013*\u00020\u00068FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0019\u0010\u0015\u001A\u0004\b\u001A\u0010\u0017\"!\u0010\u001B\u001A\u00020\u0006*\u00020\u00078FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\t\u001A\u0004\b\u001D\u0010\u000B\"!\u0010\u001B\u001A\u00020\u0006*\u00020\f8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\r\u001A\u0004\b\u001D\u0010\u000E\"!\u0010\u001B\u001A\u00020\u0006*\u00020\u000F8FX\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\u0010\u001A\u0004\b\u001D\u0010\u0011\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0005\b\u009920\u0001\u00A8\u0006B"}, d2 = {"UNIT_MASK", "", "UNIT_TYPE_EM", "UNIT_TYPE_SP", "UNIT_TYPE_UNSPECIFIED", "em", "Landroidx/compose/ui/unit/TextUnit;", "", "getEm$annotations", "(D)V", "getEm", "(D)J", "", "(F)V", "(F)J", "", "(I)V", "(I)J", "isSpecified", "", "isSpecified--R2X_6o$annotations", "(J)V", "isSpecified--R2X_6o", "(J)Z", "isUnspecified", "isUnspecified--R2X_6o$annotations", "isUnspecified--R2X_6o", "sp", "getSp$annotations", "getSp", "TextUnit", "value", "type", "Landroidx/compose/ui/unit/TextUnitType;", "TextUnit-anM5pPY", "(FJ)J", "checkArithmetic", "", "a", "checkArithmetic--R2X_6o", "b", "checkArithmetic-NB67dxo", "(JJ)V", "c", "checkArithmetic-vU-0ePk", "(JJJ)V", "lerp", "start", "stop", "fraction", "lerp-C3pnCVY", "(JJF)J", "pack", "unitType", "v", "(JF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-eAf_CNQ", "(JLkotlin/jvm/functions/Function0;)J", "times", "other", "times-mpE4wyQ", "(DJ)J", "(IJ)J", "ui-unit_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextUnitKt {
    private static final long UNIT_MASK = 0xFF00000000L;
    private static final long UNIT_TYPE_EM = 0x200000000L;
    private static final long UNIT_TYPE_SP = 0x100000000L;
    private static final long UNIT_TYPE_UNSPECIFIED;

    @ExperimentalUnitApi
    public static final long TextUnit-anM5pPY(float f, long v) {
        return TextUnitKt.pack(v, f);
    }

    public static final void checkArithmetic--R2X_6o(long v) {
        if(!TextUnitKt.isUnspecified--R2X_6o(v) == 0) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void checkArithmetic-NB67dxo(long v, long v1) {
        if(TextUnitKt.isUnspecified--R2X_6o(v) || TextUnitKt.isUnspecified--R2X_6o(v1)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), TextUnit.getType-UIouoOA(v1))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v1))).toString());
        }
    }

    public static final void checkArithmetic-vU-0ePk(long v, long v1, long v2) {
        if(TextUnitKt.isUnspecified--R2X_6o(v) || TextUnitKt.isUnspecified--R2X_6o(v1) || TextUnitKt.isUnspecified--R2X_6o(v2)) {
            throw new IllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), TextUnit.getType-UIouoOA(v1)) || !TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v1), TextUnit.getType-UIouoOA(v2))) {
            throw new IllegalArgumentException(("Cannot perform operation for " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v)) + " and " + TextUnitType.toString-impl(TextUnit.getType-UIouoOA(v1))).toString());
        }
    }

    public static final long getEm(double f) {
        return TextUnitKt.pack(0x200000000L, ((float)f));
    }

    public static final long getEm(float f) {
        return TextUnitKt.pack(0x200000000L, f);
    }

    public static final long getEm(int v) {
        return TextUnitKt.pack(0x200000000L, ((float)v));
    }

    public static void getEm$annotations(double f) {
    }

    public static void getEm$annotations(float f) {
    }

    public static void getEm$annotations(int v) {
    }

    public static final long getSp(double f) {
        return TextUnitKt.pack(0x100000000L, ((float)f));
    }

    public static final long getSp(float f) {
        return TextUnitKt.pack(0x100000000L, f);
    }

    public static final long getSp(int v) [...] // 潜在的解密器

    public static void getSp$annotations(double f) {
    }

    public static void getSp$annotations(float f) {
    }

    public static void getSp$annotations(int v) {
    }

    public static final boolean isSpecified--R2X_6o(long v) {
        return !TextUnitKt.isUnspecified--R2X_6o(v);
    }

    public static void isSpecified--R2X_6o$annotations(long v) {
    }

    public static final boolean isUnspecified--R2X_6o(long v) {
        return (v & 0xFF00000000L) == 0L;
    }

    public static void isUnspecified--R2X_6o$annotations(long v) {
    }

    public static final long lerp-C3pnCVY(long v, long v1, float f) {
        TextUnitKt.checkArithmetic-NB67dxo(v, v1);
        return TextUnitKt.pack(v & 0xFF00000000L, (1.0f - f) * TextUnit.getValue-impl(v) + f * TextUnit.getValue-impl(v1));
    }

    public static final long pack(long v, float f) [...] // 潜在的解密器

    public static final long takeOrElse-eAf_CNQ(long v, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        return !TextUnitKt.isUnspecified--R2X_6o(v) == 0 ? ((TextUnit)function00.invoke()).unbox-impl() : v;
    }

    public static final long times-mpE4wyQ(double f, long v) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(v & 0xFF00000000L, ((float)f) * TextUnit.getValue-impl(v));
    }

    public static final long times-mpE4wyQ(float f, long v) {
        TextUnitKt.checkArithmetic--R2X_6o(v);
        return TextUnitKt.pack(TextUnit.getRawType-impl(v), f * TextUnit.getValue-impl(v));
    }

    public static final long times-mpE4wyQ(int v, long v1) {
        TextUnitKt.checkArithmetic--R2X_6o(v1);
        return TextUnitKt.pack(v1 & 0xFF00000000L, ((float)v) * TextUnit.getValue-impl(v1));
    }
}

