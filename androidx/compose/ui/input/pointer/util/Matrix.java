package androidx.compose.ui.input.pointer.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u0003J\u000E\u0010\u000E\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u0003J\u001E\u0010\u000F\u001A\u00020\u00102\u0006\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u00032\u0006\u0010\u0011\u001A\u00020\u000BR\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/util/Matrix;", "", "rows", "", "cols", "(II)V", "elements", "", "Landroidx/compose/ui/input/pointer/util/Vector;", "[Landroidx/compose/ui/input/pointer/util/Vector;", "get", "", "row", "col", "getRow", "set", "", "value", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class Matrix {
    private final Vector[] elements;

    public Matrix(int v, int v1) {
        Vector[] arr_vector = new Vector[v];
        for(int v2 = 0; v2 < v; ++v2) {
            arr_vector[v2] = new Vector(v1);
        }
        this.elements = arr_vector;
    }

    public final float get(int v, int v1) {
        return this.elements[v].get(v1);
    }

    public final Vector getRow(int v) {
        return this.elements[v];
    }

    public final void set(int v, int v1, float f) {
        this.elements[v].set(v1, f);
    }
}

