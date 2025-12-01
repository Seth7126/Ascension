package kotlin.time;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u001A\u0010\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000BH\u0002\u001A\u0010\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0000\u001A\u0018\u0010\u0010\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00020\u000BH\u0000\u001A\u0018\u0010\u0011\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\n\u001A\u00020\u000BH\u0000\"\u001C\u0010\u0000\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004\"\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\u0007\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"precisionFormats", "", "Ljava/lang/ThreadLocal;", "Ljava/text/DecimalFormat;", "[Ljava/lang/ThreadLocal;", "rootNegativeExpFormatSymbols", "Ljava/text/DecimalFormatSymbols;", "rootPositiveExpFormatSymbols", "scientificFormat", "createFormatForDecimals", "decimals", "", "formatScientific", "", "value", "", "formatToExactDecimals", "formatUpToDecimals", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class FormatToDecimalsKt {
    private static final ThreadLocal[] precisionFormats;
    private static final DecimalFormatSymbols rootNegativeExpFormatSymbols;
    private static final DecimalFormatSymbols rootPositiveExpFormatSymbols;
    private static final ThreadLocal scientificFormat;

    static {
        DecimalFormatSymbols decimalFormatSymbols0 = new DecimalFormatSymbols(Locale.ROOT);
        decimalFormatSymbols0.setExponentSeparator("e");
        FormatToDecimalsKt.rootNegativeExpFormatSymbols = decimalFormatSymbols0;
        DecimalFormatSymbols decimalFormatSymbols1 = new DecimalFormatSymbols(Locale.ROOT);
        decimalFormatSymbols1.setExponentSeparator("e+");
        FormatToDecimalsKt.rootPositiveExpFormatSymbols = decimalFormatSymbols1;
        ThreadLocal[] arr_threadLocal = new ThreadLocal[4];
        for(int v = 0; v < 4; ++v) {
            arr_threadLocal[v] = new ThreadLocal();
        }
        FormatToDecimalsKt.precisionFormats = arr_threadLocal;
        FormatToDecimalsKt.scientificFormat = new ThreadLocal();
    }

    private static final DecimalFormat createFormatForDecimals(int v) {
        DecimalFormat decimalFormat0 = new DecimalFormat("0", FormatToDecimalsKt.rootNegativeExpFormatSymbols);
        if(v > 0) {
            decimalFormat0.setMinimumFractionDigits(v);
        }
        decimalFormat0.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat0;
    }

    public static final String formatScientific(double f) {
        ThreadLocal threadLocal0 = FormatToDecimalsKt.scientificFormat;
        DecimalFormat decimalFormat0 = threadLocal0.get();
        if(decimalFormat0 == null) {
            decimalFormat0 = new DecimalFormat("0E0", FormatToDecimalsKt.rootNegativeExpFormatSymbols);
            decimalFormat0.setMinimumFractionDigits(2);
            threadLocal0.set(decimalFormat0);
        }
        decimalFormat0.setDecimalFormatSymbols((f >= 1.0 || f <= -1.0 ? FormatToDecimalsKt.rootPositiveExpFormatSymbols : FormatToDecimalsKt.rootNegativeExpFormatSymbols));
        String s = decimalFormat0.format(f);
        Intrinsics.checkNotNullExpressionValue(s, "scientificFormat.getOrSe… }\n        .format(value)");
        return s;
    }

    public static final String formatToExactDecimals(double f, int v) {
        DecimalFormat decimalFormat1;
        ThreadLocal[] arr_threadLocal = FormatToDecimalsKt.precisionFormats;
        if(v < arr_threadLocal.length) {
            ThreadLocal threadLocal0 = arr_threadLocal[v];
            DecimalFormat decimalFormat0 = threadLocal0.get();
            if(decimalFormat0 == null) {
                decimalFormat0 = FormatToDecimalsKt.createFormatForDecimals(v);
                threadLocal0.set(decimalFormat0);
            }
            decimalFormat1 = decimalFormat0;
        }
        else {
            decimalFormat1 = FormatToDecimalsKt.createFormatForDecimals(v);
        }
        String s = decimalFormat1.format(f);
        Intrinsics.checkNotNullExpressionValue(s, "format.format(value)");
        return s;
    }

    public static final String formatUpToDecimals(double f, int v) {
        DecimalFormat decimalFormat0 = FormatToDecimalsKt.createFormatForDecimals(0);
        decimalFormat0.setMaximumFractionDigits(v);
        String s = decimalFormat0.format(f);
        Intrinsics.checkNotNullExpressionValue(s, "createFormatForDecimals(… }\n        .format(value)");
        return s;
    }
}

