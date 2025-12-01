package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0015\bf\u0018\u0000 J2\u00020\u0001:\u0001JJ \u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0011H&J \u0010\u0013\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u0011H&J\u0010\u0010\u0016\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH&J\'\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u00002\b\b\u0002\u0010\u0019\u001A\u00020\u001AH&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u0010\u0010\u001D\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u000FH&J\u0010\u0010\u001F\u001A\u00020\r2\u0006\u0010 \u001A\u00020!H&J(\u0010\"\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\tH&J(\u0010$\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u000F2\u0006\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u0015\u001A\u00020\u00112\u0006\u0010#\u001A\u00020\tH\u0016J\b\u0010%\u001A\u00020\rH&J8\u0010&\u001A\u00020\r2\u0006\u0010\'\u001A\u00020\u00112\u0006\u0010(\u001A\u00020\u00112\u0006\u0010)\u001A\u00020\u00112\u0006\u0010*\u001A\u00020\u00112\u0006\u0010+\u001A\u00020\u00112\u0006\u0010,\u001A\u00020\u0011H&J\b\u0010-\u001A\u00020\u000FH&J\u0018\u0010.\u001A\u00020\r2\u0006\u0010/\u001A\u00020\u00112\u0006\u00100\u001A\u00020\u0011H&J\u0018\u00101\u001A\u00020\r2\u0006\u0010/\u001A\u00020\u00112\u0006\u00100\u001A\u00020\u0011H&J-\u00102\u001A\u00020\t2\u0006\u00103\u001A\u00020\u00002\u0006\u00104\u001A\u00020\u00002\u0006\u00105\u001A\u000206H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b7\u00108J(\u00109\u001A\u00020\r2\u0006\u0010\'\u001A\u00020\u00112\u0006\u0010(\u001A\u00020\u00112\u0006\u0010)\u001A\u00020\u00112\u0006\u0010*\u001A\u00020\u0011H&J8\u0010:\u001A\u00020\r2\u0006\u0010;\u001A\u00020\u00112\u0006\u0010<\u001A\u00020\u00112\u0006\u0010=\u001A\u00020\u00112\u0006\u0010>\u001A\u00020\u00112\u0006\u0010?\u001A\u00020\u00112\u0006\u0010@\u001A\u00020\u0011H&J\u0018\u0010A\u001A\u00020\r2\u0006\u0010B\u001A\u00020\u00112\u0006\u0010C\u001A\u00020\u0011H&J\u0018\u0010D\u001A\u00020\r2\u0006\u0010B\u001A\u00020\u00112\u0006\u0010C\u001A\u00020\u0011H&J(\u0010E\u001A\u00020\r2\u0006\u0010;\u001A\u00020\u00112\u0006\u0010<\u001A\u00020\u00112\u0006\u0010=\u001A\u00020\u00112\u0006\u0010>\u001A\u00020\u0011H&J\b\u0010F\u001A\u00020\rH&J\u001D\u0010G\u001A\u00020\r2\u0006\u0010\u0019\u001A\u00020\u001AH&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bH\u0010IR!\u0010\u0002\u001A\u00020\u0003X\u00A6\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\nR\u0012\u0010\u000B\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\n\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006K"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "", "fillType", "Landroidx/compose/ui/graphics/PathFillType;", "getFillType-Rg-k1Os", "()I", "setFillType-oQ8Xj4U", "(I)V", "isConvex", "", "()Z", "isEmpty", "addArc", "", "oval", "Landroidx/compose/ui/geometry/Rect;", "startAngleDegrees", "", "sweepAngleDegrees", "addArcRad", "startAngleRadians", "sweepAngleRadians", "addOval", "addPath", "path", "offset", "Landroidx/compose/ui/geometry/Offset;", "addPath-Uv8p0NA", "(Landroidx/compose/ui/graphics/Path;J)V", "addRect", "rect", "addRoundRect", "roundRect", "Landroidx/compose/ui/geometry/RoundRect;", "arcTo", "forceMoveTo", "arcToRad", "close", "cubicTo", "x1", "y1", "x2", "y2", "x3", "y3", "getBounds", "lineTo", "x", "y", "moveTo", "op", "path1", "path2", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "op-N5in7k0", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;I)Z", "quadraticBezierTo", "relativeCubicTo", "dx1", "dy1", "dx2", "dy2", "dx3", "dy3", "relativeLineTo", "dx", "dy", "relativeMoveTo", "relativeQuadraticBezierTo", "reset", "translate", "translate-k-4lQ0M", "(J)V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Path {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/graphics/Path$Companion;", "", "()V", "combine", "Landroidx/compose/ui/graphics/Path;", "operation", "Landroidx/compose/ui/graphics/PathOperation;", "path1", "path2", "combine-xh6zSI8", "(ILandroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/Path;)Landroidx/compose/ui/graphics/Path;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }

        public final Path combine-xh6zSI8(int v, Path path0, Path path1) {
            Intrinsics.checkNotNullParameter(path0, "path1");
            Intrinsics.checkNotNullParameter(path1, "path2");
            Path path2 = AndroidPath_androidKt.Path();
            if(!path2.op-N5in7k0(path0, path1, v)) {
                throw new IllegalArgumentException("Path.combine() failed.  This may be due an invalid path; in particular, check for NaN values.");
            }
            return path2;
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void addPath-Uv8p0NA$default(Path path0, Path path1, long v, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPath-Uv8p0NA");
            }
            if((v1 & 2) != 0) {
                v = 0L;
            }
            path0.addPath-Uv8p0NA(path1, v);
        }

        public static void arcToRad(Path path0, Rect rect0, float f, float f1, boolean z) {
            Intrinsics.checkNotNullParameter(path0, "this");
            Intrinsics.checkNotNullParameter(rect0, "rect");
            path0.arcTo(rect0, f * 57.29578f, f1 * 57.29578f, z);
        }
    }

    public static final Companion Companion;

    static {
        Path.Companion = Companion.$$INSTANCE;
    }

    void addArc(Rect arg1, float arg2, float arg3);

    void addArcRad(Rect arg1, float arg2, float arg3);

    void addOval(Rect arg1);

    void addPath-Uv8p0NA(Path arg1, long arg2);

    void addRect(Rect arg1);

    void addRoundRect(RoundRect arg1);

    void arcTo(Rect arg1, float arg2, float arg3, boolean arg4);

    void arcToRad(Rect arg1, float arg2, float arg3, boolean arg4);

    void close();

    void cubicTo(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);

    Rect getBounds();

    int getFillType-Rg-k1Os();

    boolean isConvex();

    boolean isEmpty();

    void lineTo(float arg1, float arg2);

    void moveTo(float arg1, float arg2);

    boolean op-N5in7k0(Path arg1, Path arg2, int arg3);

    void quadraticBezierTo(float arg1, float arg2, float arg3, float arg4);

    void relativeCubicTo(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6);

    void relativeLineTo(float arg1, float arg2);

    void relativeMoveTo(float arg1, float arg2);

    void relativeQuadraticBezierTo(float arg1, float arg2, float arg3, float arg4);

    void reset();

    void setFillType-oQ8Xj4U(int arg1);

    void translate-k-4lQ0M(long arg1);
}

