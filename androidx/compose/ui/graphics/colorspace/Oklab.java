package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J\u0010\u0010\u0010\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0005H\u0016J\u0010\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0016R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\t¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "fromXyz", "", "v", "getMaxValue", "", "component", "getMinValue", "toXyz", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Oklab extends ColorSpace {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab$Companion;", "", "()V", "InverseM1", "", "InverseM2", "M1", "M2", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion;
    private static final float[] InverseM1;
    private static final float[] InverseM2;
    private static final float[] M1;
    private static final float[] M2;

    static {
        Oklab.Companion = new Companion(null);
        float[] arr_f = ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getVonKries().getTransform$ui_graphics_release(), Illuminant.INSTANCE.getD50().toXyz$ui_graphics_release(), Illuminant.INSTANCE.getD65().toXyz$ui_graphics_release());
        float[] arr_f1 = ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032985f, 0.0482f, 0.361867f, 0.929312f, 0.264366f, -0.12886f, 0.036146f, 0.633852f}, arr_f);
        Oklab.M1 = arr_f1;
        float[] arr_f2 = {0.210454f, 1.977998f, 0.025904f, 0.793618f, -2.428592f, 0.782772f, -0.004072f, 0.450594f, -0.808676f};
        Oklab.M2 = arr_f2;
        Oklab.InverseM1 = ColorSpaceKt.inverse3x3(arr_f1);
        Oklab.InverseM2 = ColorSpaceKt.inverse3x3(arr_f2);
    }

    public Oklab(String s, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        super(s, 0x300000002L, v, null);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        ColorSpaceKt.mul3x3Float3(Oklab.M1, arr_f);
        arr_f[0] = (float)Math.pow(arr_f[0], 0.333333);
        arr_f[1] = (float)Math.pow(arr_f[1], 0.333333);
        arr_f[2] = (float)Math.pow(arr_f[2], 0.333333);
        ColorSpaceKt.mul3x3Float3(Oklab.M2, arr_f);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return v == 0 ? 1.0f : 2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return v == 0 ? 0.0f : -2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        arr_f[0] = RangesKt.coerceIn(arr_f[0], 0.0f, 1.0f);
        arr_f[1] = RangesKt.coerceIn(arr_f[1], -2.0f, 2.0f);
        arr_f[2] = RangesKt.coerceIn(arr_f[2], -2.0f, 2.0f);
        ColorSpaceKt.mul3x3Float3(Oklab.InverseM2, arr_f);
        arr_f[0] = (float)Math.pow(arr_f[0], 3.0);
        arr_f[1] = (float)Math.pow(arr_f[1], 3.0);
        arr_f[2] = (float)Math.pow(arr_f[2], 3.0);
        ColorSpaceKt.mul3x3Float3(Oklab.InverseM1, arr_f);
        return arr_f;
    }
}

