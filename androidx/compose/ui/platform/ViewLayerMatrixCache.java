package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001E\u0010\r\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\u000Fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001E\u0010\u0012\u001A\u00020\u00072\u0006\u0010\u000E\u001A\u00020\u000Fø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0006\u0010\u0014\u001A\u00020\u0015R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u001B\u0010\u0006\u001A\u0004\u0018\u00010\u0007X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\bR\u000E\u0010\t\u001A\u00020\nX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\nX\u0082\u000E¢\u0006\u0002\n\u0000R\u001B\u0010\f\u001A\u0004\u0018\u00010\u0007X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerMatrixCache;", "", "()V", "androidMatrixCache", "Landroid/graphics/Matrix;", "inverseAndroidMatrixCache", "inverseMatrixCache", "Landroidx/compose/ui/graphics/Matrix;", "[F", "isDirty", "", "isInverseDirty", "matrixCache", "getInverseMatrix", "view", "Landroid/view/View;", "getInverseMatrix-GrdbGEg", "(Landroid/view/View;)[F", "getMatrix", "getMatrix-GrdbGEg", "invalidate", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ViewLayerMatrixCache {
    private Matrix androidMatrixCache;
    private Matrix inverseAndroidMatrixCache;
    private float[] inverseMatrixCache;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache;

    public ViewLayerMatrixCache() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final float[] getInverseMatrix-GrdbGEg(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        float[] arr_f = this.inverseMatrixCache;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
            this.inverseMatrixCache = arr_f;
        }
        if(!this.isInverseDirty) {
            return arr_f;
        }
        Matrix matrix0 = view0.getMatrix();
        if(!Intrinsics.areEqual(this.inverseAndroidMatrixCache, matrix0)) {
            Intrinsics.checkNotNullExpressionValue(matrix0, "new");
            AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(arr_f, matrix0);
            androidx.compose.ui.graphics.Matrix.invert-impl(arr_f);
            Matrix matrix1 = this.inverseAndroidMatrixCache;
            if(matrix1 == null) {
                this.inverseAndroidMatrixCache = new Matrix(matrix0);
            }
            else {
                Intrinsics.checkNotNull(matrix1);
                matrix1.set(matrix0);
            }
        }
        this.isInverseDirty = false;
        return arr_f;
    }

    public final float[] getMatrix-GrdbGEg(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        float[] arr_f = this.matrixCache;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
            this.matrixCache = arr_f;
        }
        if(!this.isDirty) {
            return arr_f;
        }
        Matrix matrix0 = view0.getMatrix();
        if(!Intrinsics.areEqual(this.androidMatrixCache, matrix0)) {
            Intrinsics.checkNotNullExpressionValue(matrix0, "new");
            AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(arr_f, matrix0);
            Matrix matrix1 = this.androidMatrixCache;
            if(matrix1 == null) {
                this.androidMatrixCache = new Matrix(matrix0);
            }
            else {
                Intrinsics.checkNotNull(matrix1);
                matrix1.set(matrix0);
            }
        }
        this.isDirty = false;
        return arr_f;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}

