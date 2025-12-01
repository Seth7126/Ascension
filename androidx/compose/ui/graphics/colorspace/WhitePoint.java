package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003¢\u0006\u0002\u0010\u0006B\'\b\u0012\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000F\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001J\r\u0010\u0017\u001A\u00020\u0018H\u0000¢\u0006\u0002\b\u0019R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "", "x", "", "y", "z", "(FFF)V", "sum", "(FFFF)V", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "toXyz", "", "toXyz$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class WhitePoint {
    private final float x;
    private final float y;

    public WhitePoint(float f, float f1) {
        this.x = f;
        this.y = f1;
    }

    public WhitePoint(float f, float f1, float f2) {
        this(f, f1, f2, f + f1 + f2);
    }

    private WhitePoint(float f, float f1, float f2, float f3) {
        this(f / f3, f1 / f3);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final WhitePoint copy(float f, float f1) {
        return new WhitePoint(f, f1);
    }

    public static WhitePoint copy$default(WhitePoint whitePoint0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = whitePoint0.x;
        }
        if((v & 2) != 0) {
            f1 = whitePoint0.y;
        }
        return whitePoint0.copy(f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof WhitePoint)) {
            return false;
        }
        return Intrinsics.areEqual(this.x, ((WhitePoint)object0).x) ? Intrinsics.areEqual(this.y, ((WhitePoint)object0).y) : false;
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.x) * 0x1F + Float.floatToIntBits(this.y);
    }

    @Override
    public String toString() {
        return "WhitePoint(x=" + this.x + ", y=" + this.y + ')';
    }

    public final float[] toXyz$ui_graphics_release() {
        return new float[]{this.x / this.y, 1.0f, (1.0f - this.x - this.y) / this.y};
    }
}

