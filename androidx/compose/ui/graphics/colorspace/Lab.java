package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J\u0010\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J\u0010\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXyz", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Lab extends ColorSpace {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab$Companion;", "", "()V", "A", "", "B", "C", "D", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    private static final float A = 0.008856f;
    private static final float B = 7.787037f;
    private static final float C = 0.137931f;
    public static final Companion Companion = null;
    private static final float D = 0.206897f;

    static {
        Lab.Companion = new Companion(null);
    }

    public Lab(String s, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        super(s, 0x300000002L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        float f = arr_f[0] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        float f1 = arr_f[1] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        float f2 = arr_f[2] / Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        float f3 = f1 > 0.008856f ? ((float)Math.pow(f1, 0.333333)) : f1 * 7.787037f + 0.137931f;
        arr_f[0] = RangesKt.coerceIn(116.0f * f3 - 16.0f, 0.0f, 100.0f);
        arr_f[1] = RangesKt.coerceIn(((f > 0.008856f ? ((float)Math.pow(f, 0.333333)) : f * 7.787037f + 0.137931f) - f3) * 500.0f, -128.0f, 128.0f);
        arr_f[2] = RangesKt.coerceIn((f3 - (f2 > 0.008856f ? ((float)Math.pow(f2, 0.333333)) : f2 * 7.787037f + 0.137931f)) * 200.0f, -128.0f, 128.0f);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return v == 0 ? 100.0f : 128.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return v == 0 ? 0.0f : -128.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        arr_f[0] = RangesKt.coerceIn(arr_f[0], 0.0f, 100.0f);
        arr_f[1] = RangesKt.coerceIn(arr_f[1], -128.0f, 128.0f);
        float f = RangesKt.coerceIn(arr_f[2], -128.0f, 128.0f);
        arr_f[2] = f;
        float f1 = (arr_f[0] + 16.0f) / 116.0f;
        float f2 = arr_f[1] * 0.002f + f1;
        float f3 = f1 - f * 0.005f;
        arr_f[0] = (f2 > 0.206897f ? f2 * f2 * f2 : (f2 - 0.137931f) * 0.128419f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[0];
        arr_f[1] = (f1 > 0.206897f ? f1 * f1 * f1 : (f1 - 0.137931f) * 0.128419f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[1];
        arr_f[2] = (f3 > 0.206897f ? f3 * f3 * f3 : (f3 - 0.137931f) * 0.128419f) * Illuminant.INSTANCE.getD50Xyz$ui_graphics_release()[2];
        return arr_f;
    }
}

