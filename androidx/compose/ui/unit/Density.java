package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u000B\u001A\u00020\f*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u000B\u001A\u00020\f*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001A\u00020\r*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001C\u0010\u0013\u001A\u00020\r*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001C\u0010\u0013\u001A\u00020\r*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0018J\u0019\u0010\u0019\u001A\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001A\u0010\u0017J\u0019\u0010\u0019\u001A\u00020\u0003*\u00020\u0010H\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u0015J\f\u0010\u001C\u001A\u00020\u001D*\u00020\u001EH\u0017J\u0019\u0010\u001F\u001A\u00020\u0010*\u00020\rH\u0017ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u001C\u0010\u001F\u001A\u00020\u0010*\u00020\u0003H\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010!J\u001C\u0010\u001F\u001A\u00020\u0010*\u00020\fH\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\"\u0010#R\u001A\u0010\u0002\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007R\u001A\u0010\b\u001A\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001A\u0004\b\n\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "fontScale", "getFontScale$annotations", "getFontScale", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Density {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void getDensity$annotations() {
        }

        public static void getFontScale$annotations() {
        }

        public static int roundToPx--R2X_6o(Density density0, long v) {
            Intrinsics.checkNotNullParameter(density0, "this");
            return MathKt.roundToInt(density0.toPx--R2X_6o(v));
        }

        public static int roundToPx-0680j_4(Density density0, float f) {
            Intrinsics.checkNotNullParameter(density0, "this");
            float f1 = density0.toPx-0680j_4(f);
            return Float.isInfinite(f1) ? 0x7FFFFFFF : MathKt.roundToInt(f1);
        }

        public static float toDp-GaN1DYA(Density density0, long v) {
            Intrinsics.checkNotNullParameter(density0, "this");
            if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0x100000000L)) {
                throw new IllegalStateException("Only Sp can convert to Px");
            }
            return Dp.constructor-impl(TextUnit.getValue-impl(v) * density0.getFontScale());
        }

        public static float toDp-u2uoSUM(Density density0, float f) {
            Intrinsics.checkNotNullParameter(density0, "this");
            return Dp.constructor-impl(f / density0.getDensity());
        }

        public static float toDp-u2uoSUM(Density density0, int v) {
            Intrinsics.checkNotNullParameter(density0, "this");
            return Dp.constructor-impl(((float)v) / density0.getDensity());
        }

        public static float toPx--R2X_6o(Density density0, long v) {
            Intrinsics.checkNotNullParameter(density0, "this");
            if(!TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(v), 0x100000000L)) {
                throw new IllegalStateException("Only Sp can convert to Px");
            }
            return TextUnit.getValue-impl(v) * density0.getFontScale() * density0.getDensity();
        }

        public static float toPx-0680j_4(Density density0, float f) {
            Intrinsics.checkNotNullParameter(density0, "this");
            return f * density0.getDensity();
        }

        public static Rect toRect(Density density0, DpRect dpRect0) {
            Intrinsics.checkNotNullParameter(density0, "this");
            Intrinsics.checkNotNullParameter(dpRect0, "receiver");
            return new Rect(density0.toPx-0680j_4(dpRect0.getLeft-D9Ej5fM()), density0.toPx-0680j_4(dpRect0.getTop-D9Ej5fM()), density0.toPx-0680j_4(dpRect0.getRight-D9Ej5fM()), density0.toPx-0680j_4(dpRect0.getBottom-D9Ej5fM()));
        }

        public static long toSp-0xMU5do(Density density0, float f) {
            Intrinsics.checkNotNullParameter(density0, "this");
            return TextUnitKt.getSp(f / density0.getFontScale());
        }

        public static long toSp-kPz2Gy4(Density density0, float f) {
            Intrinsics.checkNotNullParameter(density0, "this");
            return TextUnitKt.getSp(f / (density0.getFontScale() * density0.getDensity()));
        }

        public static long toSp-kPz2Gy4(Density density0, int v) {
            Intrinsics.checkNotNullParameter(density0, "this");
            return TextUnitKt.getSp(((float)v) / (density0.getFontScale() * density0.getDensity()));
        }
    }

    float getDensity();

    float getFontScale();

    int roundToPx--R2X_6o(long arg1);

    int roundToPx-0680j_4(float arg1);

    float toDp-GaN1DYA(long arg1);

    float toDp-u2uoSUM(float arg1);

    float toDp-u2uoSUM(int arg1);

    float toPx--R2X_6o(long arg1);

    float toPx-0680j_4(float arg1);

    Rect toRect(DpRect arg1);

    long toSp-0xMU5do(float arg1);

    long toSp-kPz2Gy4(float arg1);

    long toSp-kPz2Gy4(int arg1);
}

