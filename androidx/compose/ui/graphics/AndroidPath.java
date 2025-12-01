package androidx.compose.ui.graphics;

import android.graphics.Matrix;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Path.Op;
import android.graphics.RectF;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u0010\u0010\u001A\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\u001CH\u0002J \u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001C2\u0006\u0010 \u001A\u00020!2\u0006\u0010\"\u001A\u00020!H\u0016J \u0010#\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001C2\u0006\u0010$\u001A\u00020!2\u0006\u0010%\u001A\u00020!H\u0016J\u0010\u0010&\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u001CH\u0016J%\u0010\'\u001A\u00020\u001E2\u0006\u0010(\u001A\u00020\u00012\u0006\u0010)\u001A\u00020*H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010,J\u0010\u0010-\u001A\u00020\u001E2\u0006\u0010\u001B\u001A\u00020\u001CH\u0016J\u0010\u0010.\u001A\u00020\u001E2\u0006\u0010/\u001A\u000200H\u0016J(\u00101\u001A\u00020\u001E2\u0006\u0010\u001B\u001A\u00020\u001C2\u0006\u0010 \u001A\u00020!2\u0006\u0010\"\u001A\u00020!2\u0006\u00102\u001A\u00020\u000FH\u0016J\b\u00103\u001A\u00020\u001EH\u0016J8\u00104\u001A\u00020\u001E2\u0006\u00105\u001A\u00020!2\u0006\u00106\u001A\u00020!2\u0006\u00107\u001A\u00020!2\u0006\u00108\u001A\u00020!2\u0006\u00109\u001A\u00020!2\u0006\u0010:\u001A\u00020!H\u0016J\b\u0010;\u001A\u00020\u001CH\u0016J\u0018\u0010<\u001A\u00020\u001E2\u0006\u0010=\u001A\u00020!2\u0006\u0010>\u001A\u00020!H\u0016J\u0018\u0010?\u001A\u00020\u001E2\u0006\u0010=\u001A\u00020!2\u0006\u0010>\u001A\u00020!H\u0016J-\u0010@\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020\u00012\u0006\u0010B\u001A\u00020\u00012\u0006\u0010C\u001A\u00020DH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010FJ(\u0010G\u001A\u00020\u001E2\u0006\u00105\u001A\u00020!2\u0006\u00106\u001A\u00020!2\u0006\u00107\u001A\u00020!2\u0006\u00108\u001A\u00020!H\u0016J8\u0010H\u001A\u00020\u001E2\u0006\u0010I\u001A\u00020!2\u0006\u0010J\u001A\u00020!2\u0006\u0010K\u001A\u00020!2\u0006\u0010L\u001A\u00020!2\u0006\u0010M\u001A\u00020!2\u0006\u0010N\u001A\u00020!H\u0016J\u0018\u0010O\u001A\u00020\u001E2\u0006\u0010P\u001A\u00020!2\u0006\u0010Q\u001A\u00020!H\u0016J\u0018\u0010R\u001A\u00020\u001E2\u0006\u0010P\u001A\u00020!2\u0006\u0010Q\u001A\u00020!H\u0016J(\u0010S\u001A\u00020\u001E2\u0006\u0010I\u001A\u00020!2\u0006\u0010J\u001A\u00020!2\u0006\u0010K\u001A\u00020!2\u0006\u0010L\u001A\u00020!H\u0016J\b\u0010T\u001A\u00020\u001EH\u0016J\u001D\u0010U\u001A\u00020\u001E2\u0006\u0010)\u001A\u00020*H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bV\u0010WR-\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u001A\u0010\u000E\u001A\u00020\u000F8VX\u0096\u0004\u00A2\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001A\u0004\b\u000E\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u000F8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0012R\u000E\u0010\u0014\u001A\u00020\u0015X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0016\u001A\u00020\u0017X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0018\u001A\u00020\u0019X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006X"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPath;", "Landroidx/compose/ui/graphics/Path;", "internalPath", "Landroid/graphics/Path;", "(Landroid/graphics/Path;)V", "value", "Landroidx/compose/ui/graphics/PathFillType;", "fillType", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "getInternalPath", "()Landroid/graphics/Path;", "isConvex", "", "isConvex$annotations", "()V", "()Z", "isEmpty", "mMatrix", "Landroid/graphics/Matrix;", "radii", "", "rectF", "Landroid/graphics/RectF;", "_rectIsValid", "rect", "Landroidx/compose/ui/geometry/Rect;", "addArc", "", "oval", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "arcTo", "forceMoveTo", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "lineTo", "x", "y", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "quadraticBezierTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "reset", "translate", "translate-k-4lQ0M", "(J)V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidPath implements Path {
    private final android.graphics.Path internalPath;
    private final Matrix mMatrix;
    private final float[] radii;
    private final RectF rectF;

    public AndroidPath() {
        this(null, 1, null);
    }

    public AndroidPath(android.graphics.Path path0) {
        Intrinsics.checkNotNullParameter(path0, "internalPath");
        super();
        this.internalPath = path0;
        this.rectF = new RectF();
        this.radii = new float[8];
        this.mMatrix = new Matrix();
    }

    public AndroidPath(android.graphics.Path path0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            path0 = new android.graphics.Path();
        }
        this(path0);
    }

    private final boolean _rectIsValid(Rect rect0) {
        if(!Float.isNaN(rect0.getLeft()) == 0) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if(!Float.isNaN(rect0.getTop()) == 0) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if(!Float.isNaN(rect0.getRight()) == 0) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if(!Float.isNaN(rect0.getBottom()) == 0) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        return true;
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addArc(Rect rect0, float f, float f1) {
        Intrinsics.checkNotNullParameter(rect0, "oval");
        if(!this._rectIsValid(rect0)) {
            throw new IllegalStateException("Check failed.");
        }
        android.graphics.Rect rect1 = RectHelper_androidKt.toAndroidRect(rect0);
        this.rectF.set(rect1);
        this.internalPath.addArc(this.rectF, f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addArcRad(Rect rect0, float f, float f1) {
        Intrinsics.checkNotNullParameter(rect0, "oval");
        this.addArc(rect0, f * 57.29578f, f1 * 57.29578f);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addOval(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "oval");
        android.graphics.Rect rect1 = RectHelper_androidKt.toAndroidRect(rect0);
        this.rectF.set(rect1);
        this.internalPath.addOval(this.rectF, Path.Direction.CCW);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addPath-Uv8p0NA(Path path0, long v) {
        Intrinsics.checkNotNullParameter(path0, "path");
        android.graphics.Path path1 = this.internalPath;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path1.addPath(((AndroidPath)path0).getInternalPath(), Offset.getX-impl(v), Offset.getY-impl(v));
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addRect(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        if(!this._rectIsValid(rect0)) {
            throw new IllegalStateException("Check failed.");
        }
        RectF rectF0 = RectHelper_androidKt.toAndroidRectF(rect0);
        this.rectF.set(rectF0);
        this.internalPath.addRect(this.rectF, Path.Direction.CCW);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void addRoundRect(RoundRect roundRect0) {
        Intrinsics.checkNotNullParameter(roundRect0, "roundRect");
        this.rectF.set(roundRect0.getLeft(), roundRect0.getTop(), roundRect0.getRight(), roundRect0.getBottom());
        this.radii[0] = CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
        this.radii[1] = CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
        this.radii[2] = CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
        this.radii[3] = CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
        this.radii[4] = CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
        this.radii[5] = CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
        this.radii[6] = CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
        this.radii[7] = CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
        this.internalPath.addRoundRect(this.rectF, this.radii, Path.Direction.CCW);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void arcTo(Rect rect0, float f, float f1, boolean z) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        this.rectF.set(rect0.getLeft(), rect0.getTop(), rect0.getRight(), rect0.getBottom());
        this.internalPath.arcTo(this.rectF, f, f1, z);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void arcToRad(Rect rect0, float f, float f1, boolean z) {
        DefaultImpls.arcToRad(this, rect0, f, f1, z);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void close() {
        this.internalPath.close();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void cubicTo(float f, float f1, float f2, float f3, float f4, float f5) {
        this.internalPath.cubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public Rect getBounds() {
        this.internalPath.computeBounds(this.rectF, true);
        return new Rect(this.rectF.left, this.rectF.top, this.rectF.right, this.rectF.bottom);
    }

    // 去混淆评级： 中等(50)
    @Override  // androidx.compose.ui.graphics.Path
    public int getFillType-Rg-k1Os() {
        return this.internalPath.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    public final android.graphics.Path getInternalPath() {
        return this.internalPath;
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean isConvex() {
        return this.internalPath.isConvex();
    }

    public static void isConvex$annotations() {
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean isEmpty() {
        return this.internalPath.isEmpty();
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void lineTo(float f, float f1) {
        this.internalPath.lineTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void moveTo(float f, float f1) {
        this.internalPath.moveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public boolean op-N5in7k0(Path path0, Path path1, int v) {
        Path.Op path$Op0;
        Intrinsics.checkNotNullParameter(path0, "path1");
        Intrinsics.checkNotNullParameter(path1, "path2");
        if(PathOperation.equals-impl0(v, 0)) {
            path$Op0 = Path.Op.DIFFERENCE;
        }
        else if(PathOperation.equals-impl0(v, 1)) {
            path$Op0 = Path.Op.INTERSECT;
        }
        else if(PathOperation.equals-impl0(v, 4)) {
            path$Op0 = Path.Op.REVERSE_DIFFERENCE;
        }
        else {
            path$Op0 = PathOperation.equals-impl0(v, 2) ? Path.Op.UNION : Path.Op.XOR;
        }
        android.graphics.Path path2 = this.internalPath;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path path3 = ((AndroidPath)path0).getInternalPath();
        if(!(path1 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return path2.op(path3, ((AndroidPath)path1).getInternalPath(), path$Op0);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void quadraticBezierTo(float f, float f1, float f2, float f3) {
        this.internalPath.quadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeCubicTo(float f, float f1, float f2, float f3, float f4, float f5) {
        this.internalPath.rCubicTo(f, f1, f2, f3, f4, f5);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeLineTo(float f, float f1) {
        this.internalPath.rLineTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeMoveTo(float f, float f1) {
        this.internalPath.rMoveTo(f, f1);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void relativeQuadraticBezierTo(float f, float f1, float f2, float f3) {
        this.internalPath.rQuadTo(f, f1, f2, f3);
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void reset() {
        this.internalPath.reset();
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.graphics.Path
    public void setFillType-oQ8Xj4U(int v) {
        this.internalPath.setFillType((PathFillType.equals-impl0(v, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING));
    }

    @Override  // androidx.compose.ui.graphics.Path
    public void translate-k-4lQ0M(long v) {
        this.mMatrix.reset();
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        this.mMatrix.setTranslate(f, f1);
        this.internalPath.transform(this.mMatrix);
    }
}

