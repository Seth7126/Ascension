package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A \u0010\n\u001A\u00020\u00022\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\fH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000E\u001A-\u0010\u000F\u001A\u00020\u00022\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u0011\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001A\"\u0010\u0015\u001A\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001A\f\u0010\u001A\u001A\u00020\f*\u00020\fH\u0002\u001A+\u0010\u001B\u001A\u00020\u0002*\u00020\u00022\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00020\u00020\u001DH\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u001E\u0010\u001F\u001A\"\u0010 \u001A\u00020\u0016*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0002H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u0019\u001A\"\u0010 \u001A\u00020\u0016*\u00020\u00022\u0006\u0010\"\u001A\u00020\u0016H\u0087\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0019\"\"\u0010\u0000\u001A\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001A\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001A\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0005\b\u009920\u0001¨\u0006$"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/layout/ScaleFactor;", "isSpecified-FK8aYYs$annotations", "(J)V", "isSpecified-FK8aYYs", "(J)Z", "isUnspecified", "isUnspecified-FK8aYYs$annotations", "isUnspecified-FK8aYYs", "ScaleFactor", "scaleX", "", "scaleY", "(FF)J", "lerp", "start", "stop", "fraction", "lerp--bDIf60", "(JJF)J", "div", "Landroidx/compose/ui/geometry/Size;", "scaleFactor", "div-UQTWf7w", "(JJ)J", "roundToTenths", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-oyDd2qo", "(JLkotlin/jvm/functions/Function0;)J", "times", "times-UQTWf7w", "size", "times-m-w2e94", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ScaleFactorKt {
    public static final long ScaleFactor(float f, float f1) [...] // 潜在的解密器

    public static final long div-UQTWf7w(long v, long v1) {
        return SizeKt.Size(Size.getWidth-impl(v) / ScaleFactor.getScaleX-impl(v1), Size.getHeight-impl(v) / ScaleFactor.getScaleY-impl(v1));
    }

    // 去混淆评级： 低(20)
    public static final boolean isSpecified-FK8aYYs(long v) {
        return v != 0x7FC000007FC00000L;
    }

    public static void isSpecified-FK8aYYs$annotations(long v) {
    }

    // 去混淆评级： 低(20)
    public static final boolean isUnspecified-FK8aYYs(long v) {
        return v == 0x7FC000007FC00000L;
    }

    public static void isUnspecified-FK8aYYs$annotations(long v) {
    }

    public static final long lerp--bDIf60(long v, long v1, float f) {
        return ScaleFactorKt.ScaleFactor(MathHelpersKt.lerp(ScaleFactor.getScaleX-impl(v), ScaleFactor.getScaleX-impl(v1), f), MathHelpersKt.lerp(ScaleFactor.getScaleY-impl(v), ScaleFactor.getScaleY-impl(v1), f));
    }

    private static final float roundToTenths(float f) {
        int v = (int)(f * 10.0f);
        return ((float)(f * 10.0f - ((float)v) >= 0.5f ? v + 1 : ((int)(f * 10.0f)))) / 10.0f;
    }

    // 去混淆评级： 低(20)
    public static final long takeOrElse-oyDd2qo(long v, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        return v == 0x7FC000007FC00000L ? ((ScaleFactor)function00.invoke()).unbox-impl() : v;
    }

    public static final long times-UQTWf7w(long v, long v1) {
        return SizeKt.Size(Size.getWidth-impl(v) * ScaleFactor.getScaleX-impl(v1), Size.getHeight-impl(v) * ScaleFactor.getScaleY-impl(v1));
    }

    public static final long times-m-w2e94(long v, long v1) {
        return ScaleFactorKt.times-UQTWf7w(v1, v);
    }
}

