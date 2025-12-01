package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u000BH\u0002J\u0010\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016J\u0010\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u0005H\u0016J\u0010\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u0005H\u0016J\u0010\u0010\u0013\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000EH\u0016R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\t¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "id", "", "(Ljava/lang/String;I)V", "isWideGamut", "", "()Z", "clamp", "", "x", "fromXyz", "", "v", "getMaxValue", "component", "getMinValue", "toXyz", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Xyz extends ColorSpace {
    public Xyz(String s, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        super(s, 0x300000001L, v, null);
    }

    private final float clamp(float f) {
        return RangesKt.coerceIn(f, -2.0f, 2.0f);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        arr_f[0] = this.clamp(arr_f[0]);
        arr_f[1] = this.clamp(arr_f[1]);
        arr_f[2] = this.clamp(arr_f[2]);
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return 2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return -2.0f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        arr_f[0] = this.clamp(arr_f[0]);
        arr_f[1] = this.clamp(arr_f[1]);
        arr_f[2] = this.clamp(arr_f[2]);
        return arr_f;
    }
}

