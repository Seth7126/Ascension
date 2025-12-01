package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A5\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0005H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001A\u0017\u0010\n\u001A\u00020\u000B*\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "isIdentity", "", "isIdentity-58bKbWc", "([F)Z", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MatrixKt {
    private static final float dot-p89u6pk(float[] arr_f, int v, float[] arr_f1, int v1) {
        return arr_f[v * 4] * arr_f1[v1] + arr_f[v * 4 + 1] * arr_f1[v1 + 4] + arr_f[v * 4 + 2] * arr_f1[v1 + 8] + arr_f[v * 4 + 3] * arr_f1[v1 + 12];
    }

    public static final boolean isIdentity-58bKbWc(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "$this$isIdentity");
        for(int v = 0; true; ++v) {
            for(int v1 = 0; true; ++v1) {
                if(arr_f[v * 4 + v1] != (v == v1 ? 1.0f : 0.0f)) {
                    return false;
                }
                if(v1 + 1 > 3) {
                    break;
                }
            }
            if(v + 1 > 3) {
                return true;
            }
        }
    }
}

