package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0018\u0002\n\u0002\b\b\u001A%\u0010!\u001A\u00020\"2\u0006\u0010#\u001A\u00020\u00012\u0006\u0010$\u001A\u00020\u0001H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b%\u0010&\u001A-\u0010\'\u001A\u00020\u00012\u0006\u0010(\u001A\u00020\u00012\u0006\u0010)\u001A\u00020\u00012\u0006\u0010*\u001A\u00020\u0007H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010,\u001A-\u0010\'\u001A\u00020\"2\u0006\u0010(\u001A\u00020\"2\u0006\u0010)\u001A\u00020\"2\u0006\u0010*\u001A\u00020\u0007H\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b-\u0010.\u001A&\u0010/\u001A\u00020\u00012\u0006\u00100\u001A\u00020\u00012\u0006\u00101\u001A\u00020\u0001H\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b2\u00103\u001A&\u00104\u001A\u00020\u00012\u0006\u00100\u001A\u00020\u00012\u0006\u00101\u001A\u00020\u0001H\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b5\u00103\u001A\"\u00106\u001A\u00020\u0001*\u00020\u00012\u0006\u00107\u001A\u00020\u0001H\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b8\u00103\u001A\"\u00109\u001A\u00020\u0001*\u00020\u00012\u0006\u0010:\u001A\u00020\u0001H\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b;\u00103\u001A*\u0010<\u001A\u00020\u0001*\u00020\u00012\u0006\u00107\u001A\u00020\u00012\u0006\u0010:\u001A\u00020\u0001H\u0087\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b=\u0010,\u001A+\u0010>\u001A\u00020\u0001*\u00020\u00012\f\u0010?\u001A\b\u0012\u0004\u0012\u00020\u00010@H\u0086\b\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bA\u0010B\u001A\"\u0010C\u001A\u00020\u0001*\u00020\u00022\u0006\u0010D\u001A\u00020\u0001H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010F\u001A\"\u0010C\u001A\u00020\u0001*\u00020\u00072\u0006\u0010D\u001A\u00020\u0001H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u00103\u001A\"\u0010C\u001A\u00020\u0001*\u00020\n2\u0006\u0010D\u001A\u00020\u0001H\u0087\n\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010G\"\"\u0010\u0000\u001A\u00020\u0001*\u00020\u00028\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\"\u0010\u0000\u001A\u00020\u0001*\u00020\u00078\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0003\u0010\b\u001A\u0004\b\u0005\u0010\t\"\"\u0010\u0000\u001A\u00020\u0001*\u00020\n8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0003\u0010\u000B\u001A\u0004\b\u0005\u0010\f\"\"\u0010\r\u001A\u00020\u0001*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\"\u0010\u0013\u001A\u00020\u0014*\u00020\u00018\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0015\u0010\b\u001A\u0004\b\u0016\u0010\u0017\"\"\u0010\u0018\u001A\u00020\u0014*\u00020\u00018\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u0019\u0010\b\u001A\u0004\b\u001A\u0010\u0017\"\"\u0010\u001B\u001A\u00020\u0014*\u00020\u00018\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001C\u0010\b\u001A\u0004\b\u001D\u0010\u0017\"\"\u0010\u001E\u001A\u00020\u0001*\u00020\u000E8\u00C6\u0002X\u0087\u0004\u00F8\u0001\u0000\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\u0010\u001A\u0004\b \u0010\u0012\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0005\b\u009920\u0001\u00A8\u0006H"}, d2 = {"dp", "Landroidx/compose/ui/unit/Dp;", "", "getDp$annotations", "(D)V", "getDp", "(D)F", "", "(F)V", "(F)F", "", "(I)V", "(I)F", "height", "Landroidx/compose/ui/unit/DpRect;", "getHeight$annotations", "(Landroidx/compose/ui/unit/DpRect;)V", "getHeight", "(Landroidx/compose/ui/unit/DpRect;)F", "isFinite", "", "isFinite-0680j_4$annotations", "isFinite-0680j_4", "(F)Z", "isSpecified", "isSpecified-0680j_4$annotations", "isSpecified-0680j_4", "isUnspecified", "isUnspecified-0680j_4$annotations", "isUnspecified-0680j_4", "width", "getWidth$annotations", "getWidth", "DpOffset", "Landroidx/compose/ui/unit/DpOffset;", "x", "y", "DpOffset-YgX7TsA", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-Md-fbLM", "(FFF)F", "lerp-xhh869w", "(JJF)J", "max", "a", "b", "max-YgX7TsA", "(FF)F", "min", "min-YgX7TsA", "coerceAtLeast", "minimumValue", "coerceAtLeast-YgX7TsA", "coerceAtMost", "maximumValue", "coerceAtMost-YgX7TsA", "coerceIn", "coerceIn-2z7ARbQ", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-D5KLDUw", "(FLkotlin/jvm/functions/Function0;)F", "times", "other", "times-3ABfNKs", "(DF)F", "(IF)F", "ui-unit_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class DpKt {
    public static final long DpOffset-YgX7TsA(float f, float f1) [...] // 潜在的解密器

    public static final float coerceAtLeast-YgX7TsA(float f, float f1) {
        return Dp.constructor-impl(RangesKt.coerceAtLeast(f, f1));
    }

    public static final float coerceAtMost-YgX7TsA(float f, float f1) {
        return Dp.constructor-impl(RangesKt.coerceAtMost(f, f1));
    }

    public static final float coerceIn-2z7ARbQ(float f, float f1, float f2) {
        return Dp.constructor-impl(RangesKt.coerceIn(f, f1, f2));
    }

    public static final float getDp(double f) {
        return (float)f;
    }

    public static final float getDp(float f) {
        return Dp.constructor-impl(f);
    }

    public static final float getDp(int v) {
        return (float)v;
    }

    public static void getDp$annotations(double f) {
    }

    public static void getDp$annotations(float f) {
    }

    public static void getDp$annotations(int v) {
    }

    public static final float getHeight(DpRect dpRect0) {
        Intrinsics.checkNotNullParameter(dpRect0, "<this>");
        return Dp.constructor-impl(dpRect0.getBottom-D9Ej5fM() - dpRect0.getTop-D9Ej5fM());
    }

    public static void getHeight$annotations(DpRect dpRect0) {
    }

    public static final float getWidth(DpRect dpRect0) {
        Intrinsics.checkNotNullParameter(dpRect0, "<this>");
        return Dp.constructor-impl(dpRect0.getRight-D9Ej5fM() - dpRect0.getLeft-D9Ej5fM());
    }

    public static void getWidth$annotations(DpRect dpRect0) {
    }

    public static final boolean isFinite-0680j_4(float f) {
        return f == Infinityf ? 0 : 1;
    }

    public static void isFinite-0680j_4$annotations(float f) {
    }

    public static final boolean isSpecified-0680j_4(float f) {
        return !Float.isNaN(f);
    }

    public static void isSpecified-0680j_4$annotations(float f) {
    }

    public static final boolean isUnspecified-0680j_4(float f) {
        return Float.isNaN(f);
    }

    public static void isUnspecified-0680j_4$annotations(float f) {
    }

    public static final float lerp-Md-fbLM(float f, float f1, float f2) {
        return (1.0f - f2) * f + f2 * f1;
    }

    public static final long lerp-xhh869w(long v, long v1, float f) {
        return DpKt.DpOffset-YgX7TsA(DpKt.lerp-Md-fbLM(DpOffset.getX-D9Ej5fM(v), DpOffset.getX-D9Ej5fM(v1), f), DpKt.lerp-Md-fbLM(DpOffset.getY-D9Ej5fM(v), DpOffset.getY-D9Ej5fM(v1), f));
    }

    public static final float max-YgX7TsA(float f, float f1) {
        return Dp.constructor-impl(Math.max(f, f1));
    }

    public static final float min-YgX7TsA(float f, float f1) {
        return Math.min(f, f1);
    }

    public static final float takeOrElse-D5KLDUw(float f, Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        return !Float.isNaN(f) == 0 ? ((Dp)function00.invoke()).unbox-impl() : f;
    }

    public static final float times-3ABfNKs(double f, float f1) {
        return ((float)f) * f1;
    }

    public static final float times-3ABfNKs(float f, float f1) {
        return f * f1;
    }

    public static final float times-3ABfNKs(int v, float f) {
        return Dp.constructor-impl(((float)v) * f);
    }
}

