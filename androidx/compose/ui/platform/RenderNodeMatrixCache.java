package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001E\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0011ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001E\u0010\u0014\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0011ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0013J\u0006\u0010\u0016\u001A\u00020\u0017R\u001B\u0010\u0003\u001A\u0004\u0018\u00010\u0004X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u001B\u0010\t\u001A\u0004\u0018\u00010\u0004X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001A\u0004\u0018\u00010\u000BX\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001A\u0004\u0018\u00010\u000BX\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\u000E\u001A\u0004\u0018\u00010\u000BX\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeMatrixCache;", "", "()V", "inverseMatrixCache", "Landroidx/compose/ui/graphics/Matrix;", "[F", "isDirty", "", "isInverseDirty", "matrixCache", "newAndroidMatrixCache", "Landroid/graphics/Matrix;", "newInverseAndroidMatrixCache", "oldAndroidMatrixCache", "oldInverseAndroidMatrixCache", "getInverseMatrix", "renderNode", "Landroidx/compose/ui/platform/DeviceRenderNode;", "getInverseMatrix-GrdbGEg", "(Landroidx/compose/ui/platform/DeviceRenderNode;)[F", "getMatrix", "getMatrix-GrdbGEg", "invalidate", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class RenderNodeMatrixCache {
    private float[] inverseMatrixCache;
    private boolean isDirty;
    private boolean isInverseDirty;
    private float[] matrixCache;
    private Matrix newAndroidMatrixCache;
    private Matrix newInverseAndroidMatrixCache;
    private Matrix oldAndroidMatrixCache;
    private Matrix oldInverseAndroidMatrixCache;

    public RenderNodeMatrixCache() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }

    public final float[] getInverseMatrix-GrdbGEg(DeviceRenderNode deviceRenderNode0) {
        Intrinsics.checkNotNullParameter(deviceRenderNode0, "renderNode");
        float[] arr_f = this.inverseMatrixCache;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
            this.inverseMatrixCache = arr_f;
        }
        if(!this.isInverseDirty) {
            return arr_f;
        }
        Matrix matrix0 = this.newInverseAndroidMatrixCache;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.newInverseAndroidMatrixCache = matrix0;
        }
        deviceRenderNode0.getInverseMatrix(matrix0);
        if(!Intrinsics.areEqual(this.oldInverseAndroidMatrixCache, matrix0)) {
            AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(arr_f, matrix0);
            Matrix matrix1 = this.oldInverseAndroidMatrixCache;
            if(matrix1 == null) {
                this.oldInverseAndroidMatrixCache = new Matrix(matrix0);
            }
            else {
                Intrinsics.checkNotNull(matrix1);
                matrix1.set(matrix0);
            }
        }
        this.isInverseDirty = false;
        return arr_f;
    }

    public final float[] getMatrix-GrdbGEg(DeviceRenderNode deviceRenderNode0) {
        Intrinsics.checkNotNullParameter(deviceRenderNode0, "renderNode");
        float[] arr_f = this.matrixCache;
        if(arr_f == null) {
            arr_f = androidx.compose.ui.graphics.Matrix.constructor-impl$default(null, 1, null);
            this.matrixCache = arr_f;
        }
        if(!this.isDirty) {
            return arr_f;
        }
        Matrix matrix0 = this.newAndroidMatrixCache;
        if(matrix0 == null) {
            matrix0 = new Matrix();
            this.newAndroidMatrixCache = matrix0;
        }
        deviceRenderNode0.getMatrix(matrix0);
        if(!Intrinsics.areEqual(this.oldAndroidMatrixCache, matrix0)) {
            AndroidMatrixConversions_androidKt.setFrom-tU-YjHk(arr_f, matrix0);
            Matrix matrix1 = this.oldAndroidMatrixCache;
            if(matrix1 == null) {
                this.oldAndroidMatrixCache = new Matrix(matrix0);
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

