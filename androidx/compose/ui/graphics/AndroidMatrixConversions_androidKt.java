package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u001F\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u001F\u0010\u0000\u001A\u00020\u0001*\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\t"}, d2 = {"setFrom", "", "Landroid/graphics/Matrix;", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "setFrom-EL8BTi8", "(Landroid/graphics/Matrix;[F)V", "setFrom-tU-YjHk", "([FLandroid/graphics/Matrix;)V", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidMatrixConversions_androidKt {
    public static final void setFrom-EL8BTi8(Matrix matrix0, float[] arr_f) {
        Intrinsics.checkNotNullParameter(matrix0, "$this$setFrom");
        Intrinsics.checkNotNullParameter(arr_f, "matrix");
        float f = arr_f[2];
        if(f != 0.0f || arr_f[6] != 0.0f || arr_f[10] != 1.0f || arr_f[14] != 0.0f || arr_f[8] != 0.0f || arr_f[9] != 0.0f || arr_f[11] != 0.0f) {
            throw new IllegalArgumentException("Android does not support arbitrary transforms");
        }
        float f1 = arr_f[0];
        float f2 = arr_f[1];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = arr_f[5];
        float f6 = arr_f[6];
        float f7 = arr_f[7];
        float f8 = arr_f[8];
        float f9 = arr_f[12];
        float f10 = arr_f[13];
        float f11 = arr_f[15];
        arr_f[0] = f1;
        arr_f[1] = f4;
        arr_f[2] = f9;
        arr_f[3] = f2;
        arr_f[4] = f5;
        arr_f[5] = f10;
        arr_f[6] = f3;
        arr_f[7] = f7;
        arr_f[8] = f11;
        matrix0.setValues(arr_f);
        arr_f[0] = f1;
        arr_f[1] = f2;
        arr_f[2] = f;
        arr_f[3] = f3;
        arr_f[4] = f4;
        arr_f[5] = f5;
        arr_f[6] = f6;
        arr_f[7] = f7;
        arr_f[8] = f8;
    }

    public static final void setFrom-tU-YjHk(float[] arr_f, Matrix matrix0) {
        Intrinsics.checkNotNullParameter(arr_f, "$this$setFrom");
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        matrix0.getValues(arr_f);
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = arr_f[5];
        float f6 = arr_f[6];
        float f7 = arr_f[7];
        float f8 = arr_f[8];
        arr_f[0] = f;
        arr_f[1] = f3;
        arr_f[2] = 0.0f;
        arr_f[3] = f6;
        arr_f[4] = f1;
        arr_f[5] = f4;
        arr_f[6] = 0.0f;
        arr_f[7] = f7;
        arr_f[8] = 0.0f;
        arr_f[9] = 0.0f;
        arr_f[10] = 1.0f;
        arr_f[11] = 0.0f;
        arr_f[12] = f2;
        arr_f[13] = f5;
        arr_f[14] = 0.0f;
        arr_f[15] = f8;
    }
}

