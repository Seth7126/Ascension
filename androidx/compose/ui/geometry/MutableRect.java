package androidx.compose.ui.geometry;

import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\u001B\u0010\u001D\u001A\u00020\u000F2\u0006\u0010\u001E\u001A\u00020\u001Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J(\u0010\"\u001A\u00020#2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003H\u0007J&\u0010$\u001A\u00020#2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0003J\b\u0010%\u001A\u00020&H\u0016R\u001A\u0010\u0006\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u0012\u0010\f\u001A\u00020\u00038Æ\u0002¢\u0006\u0006\u001A\u0004\b\r\u0010\tR\u0011\u0010\u000E\u001A\u00020\u000F8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u0010R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000BR\u001A\u0010\u0005\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000BR\u001A\u0010\u0015\u001A\u00020\u00168Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0004\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\t\"\u0004\b\u001A\u0010\u000BR\u0012\u0010\u001B\u001A\u00020\u00038Æ\u0002¢\u0006\u0006\u001A\u0004\b\u001C\u0010\t\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\'"}, d2 = {"Landroidx/compose/ui/geometry/MutableRect;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom", "()F", "setBottom", "(F)V", "height", "getHeight", "isEmpty", "", "()Z", "getLeft", "setLeft", "getRight", "setRight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc", "()J", "getTop", "setTop", "width", "getWidth", "contains", "offset", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "intersect", "", "set", "toString", "", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MutableRect {
    private float bottom;
    private float left;
    private float right;
    private float top;

    public MutableRect(float f, float f1, float f2, float f3) {
        this.left = f;
        this.top = f1;
        this.right = f2;
        this.bottom = f3;
    }

    public final boolean contains-k-4lQ0M(long v) {
        return Offset.getX-impl(v) >= this.left && Offset.getX-impl(v) < this.right && Offset.getY-impl(v) >= this.top && Offset.getY-impl(v) < this.bottom;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final float getHeight() {
        return this.getBottom() - this.getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final long getSize-NH-jbRc() {
        return SizeKt.Size(this.getRight() - this.getLeft(), this.getBottom() - this.getTop());
    }

    public final float getTop() {
        return this.top;
    }

    public final float getWidth() {
        return this.getRight() - this.getLeft();
    }

    public final void intersect(float f, float f1, float f2, float f3) {
        this.left = Math.max(f, this.left);
        this.top = Math.max(f1, this.top);
        this.right = Math.min(f2, this.right);
        this.bottom = Math.min(f3, this.bottom);
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final void set(float f, float f1, float f2, float f3) {
        this.left = f;
        this.top = f1;
        this.right = f2;
        this.bottom = f3;
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setLeft(float f) {
        this.left = f;
    }

    public final void setRight(float f) {
        this.right = f;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    @Override
    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }
}

