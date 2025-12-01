package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00DE\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002bcB\u0005\u00A2\u0006\u0002\u0010\u0002J\u0018\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0010H\u0002J\u0014\u0010\u0011\u001A\u00020\u00002\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0012JX\u0010\u0013\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0019\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u001D\u001A\u00020\u00172\u0006\u0010\u001E\u001A\u00020\u00172\u0006\u0010\u001F\u001A\u00020\u0017H\u0002J\u0006\u0010 \u001A\u00020\fJ\u0010\u0010!\u001A\u00020\f2\u0006\u0010\"\u001A\u00020\u0015H\u0002J \u0010#\u001A\u00020\u00102\u0006\u0010$\u001A\u00020\u00102\u0006\u0010\u001E\u001A\u00020%2\u0006\u0010&\u001A\u00020%H\u0002JX\u0010\'\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010(\u001A\u00020\u00172\u0006\u0010)\u001A\u00020\u00172\u0006\u0010*\u001A\u00020\u00172\u0006\u0010+\u001A\u00020\u00172\u0006\u0010\u0019\u001A\u00020\u00172\u0006\u0010\u001A\u001A\u00020\u00172\u0006\u0010\u001D\u001A\u00020\u00172\u0006\u0010,\u001A\u00020-2\u0006\u0010.\u001A\u00020-H\u0002J \u0010/\u001A\u00020\f2\u0006\u00100\u001A\u0002012\u0006\u0010\u001E\u001A\u00020%2\u0006\u00102\u001A\u000203H\u0002J\u0010\u00104\u001A\u00020\u00102\u0006\u00100\u001A\u000201H\u0002J\u0018\u00105\u001A\u00020%2\u0006\u00100\u001A\u0002012\u0006\u0010&\u001A\u00020%H\u0002J\u000E\u00106\u001A\u00020\u00002\u0006\u00107\u001A\u000201J\f\u00108\u001A\b\u0012\u0004\u0012\u00020\b0\u0012J\u0010\u00109\u001A\u00020\u00152\b\b\u0002\u0010\"\u001A\u00020\u0015J\u0014\u0010:\u001A\u00020\f*\u00020;2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010<\u001A\u00020\f*\u00020=2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010>\u001A\u00020\f*\u00020?2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010@\u001A\u00020\f*\u00020A2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010B\u001A\u00020\f*\u00020C2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010D\u001A\u00020\f*\u00020E2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u001C\u0010F\u001A\u00020\f*\u00020G2\u0006\u0010H\u001A\u00020-2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u001C\u0010I\u001A\u00020\f*\u00020J2\u0006\u0010K\u001A\u00020-2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010L\u001A\u00020\f*\u00020M2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010N\u001A\u00020\f*\u00020O2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010P\u001A\u00020\f*\u00020Q2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010R\u001A\u00020\f*\u00020S2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010T\u001A\u00020\f*\u00020U2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010V\u001A\u00020\f*\u00020W2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u001C\u0010X\u001A\u00020\f*\u00020Y2\u0006\u0010H\u001A\u00020-2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u001C\u0010Z\u001A\u00020\f*\u00020[2\u0006\u0010K\u001A\u00020-2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\u0014\u0010\\\u001A\u00020\f*\u00020]2\u0006\u0010\"\u001A\u00020\u0015H\u0002J\f\u0010^\u001A\u00020\u0017*\u00020\u0017H\u0002J\f\u0010^\u001A\u00020_*\u00020_H\u0002J\u0014\u0010`\u001A\u00020\f*\u00020a2\u0006\u0010\"\u001A\u00020\u0015H\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006d"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser;", "", "()V", "ctrlPoint", "Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "currentPoint", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "reflectiveCtrlPoint", "segmentPoint", "addNode", "", "cmd", "", "args", "", "addPathNodes", "", "arcToBezier", "p", "Landroidx/compose/ui/graphics/Path;", "cx", "", "cy", "a", "b", "e1x", "e1y", "theta", "start", "sweep", "clear", "close", "target", "copyOfRange", "original", "", "end", "drawArc", "x0", "y0", "x1", "y1", "isMoreThanHalf", "", "isPositiveArc", "extract", "s", "", "result", "Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "getFloats", "nextStart", "parsePathString", "pathData", "toNodes", "toPath", "arcTo", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "curveTo", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "horizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "lineTo", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "moveTo", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "quadTo", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "reflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "prevIsCurve", "reflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "prevIsQuad", "relativeArcTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "relativeCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "relativeHorizontalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "relativeLineTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "relativeMoveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "relativeQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "relativeReflectiveCurveTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "relativeReflectiveQuadTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "relativeVerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "toRadians", "", "verticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "ExtractFloatResult", "PathPoint", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PathParser {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0010\u000E\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0005HÆ\u0003J\u001D\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00052\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u0004\u001A\u00020\u0005X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000E¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$ExtractFloatResult;", "", "endPosition", "", "endWithNegativeOrDot", "", "(IZ)V", "getEndPosition", "()I", "setEndPosition", "(I)V", "getEndWithNegativeOrDot", "()Z", "setEndWithNegativeOrDot", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class ExtractFloatResult {
        private int endPosition;
        private boolean endWithNegativeOrDot;

        public ExtractFloatResult() {
            this(0, false, 3, null);
        }

        public ExtractFloatResult(int v, boolean z) {
            this.endPosition = v;
            this.endWithNegativeOrDot = z;
        }

        public ExtractFloatResult(int v, boolean z, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v1 & 1) != 0) {
                v = 0;
            }
            if((v1 & 2) != 0) {
                z = false;
            }
            this(v, z);
        }

        public final int component1() {
            return this.endPosition;
        }

        public final boolean component2() {
            return this.endWithNegativeOrDot;
        }

        public final ExtractFloatResult copy(int v, boolean z) {
            return new ExtractFloatResult(v, z);
        }

        public static ExtractFloatResult copy$default(ExtractFloatResult pathParser$ExtractFloatResult0, int v, boolean z, int v1, Object object0) {
            if((v1 & 1) != 0) {
                v = pathParser$ExtractFloatResult0.endPosition;
            }
            if((v1 & 2) != 0) {
                z = pathParser$ExtractFloatResult0.endWithNegativeOrDot;
            }
            return pathParser$ExtractFloatResult0.copy(v, z);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ExtractFloatResult)) {
                return false;
            }
            return this.endPosition == ((ExtractFloatResult)object0).endPosition ? this.endWithNegativeOrDot == ((ExtractFloatResult)object0).endWithNegativeOrDot : false;
        }

        public final int getEndPosition() {
            return this.endPosition;
        }

        public final boolean getEndWithNegativeOrDot() {
            return this.endWithNegativeOrDot;
        }

        @Override
        public int hashCode() {
            int v = this.endPosition * 0x1F;
            int v1 = this.endWithNegativeOrDot;
            if(v1) {
                v1 = 1;
            }
            return v + v1;
        }

        public final void setEndPosition(int v) {
            this.endPosition = v;
        }

        public final void setEndWithNegativeOrDot(boolean z) {
            this.endWithNegativeOrDot = z;
        }

        @Override
        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.endPosition + ", endWithNegativeOrDot=" + this.endWithNegativeOrDot + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001A\u00020\u0003HÆ\u0003J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000F\u001A\u00020\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001J\u0006\u0010\u0014\u001A\u00020\u0015J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001A\u0010\u0004\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0007\"\u0004\b\u000B\u0010\t¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathParser$PathPoint;", "", "x", "", "y", "(FF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "reset", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class PathPoint {
        private float x;
        private float y;

        public PathPoint() {
            this(0.0f, 0.0f, 3, null);
        }

        public PathPoint(float f, float f1) {
            this.x = f;
            this.y = f1;
        }

        public PathPoint(float f, float f1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                f = 0.0f;
            }
            if((v & 2) != 0) {
                f1 = 0.0f;
            }
            this(f, f1);
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final PathPoint copy(float f, float f1) {
            return new PathPoint(f, f1);
        }

        public static PathPoint copy$default(PathPoint pathParser$PathPoint0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathParser$PathPoint0.x;
            }
            if((v & 2) != 0) {
                f1 = pathParser$PathPoint0.y;
            }
            return pathParser$PathPoint0.copy(f, f1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof PathPoint)) {
                return false;
            }
            return Intrinsics.areEqual(this.x, ((PathPoint)object0).x) ? Intrinsics.areEqual(this.y, ((PathPoint)object0).y) : false;
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

        public final void reset() {
            this.x = 0.0f;
            this.y = 0.0f;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final void setY(float f) {
            this.y = f;
        }

        @Override
        public String toString() {
            return "PathPoint(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    private final PathPoint ctrlPoint;
    private final PathPoint currentPoint;
    private final List nodes;
    private final PathPoint reflectiveCtrlPoint;
    private final PathPoint segmentPoint;

    public PathParser() {
        this.nodes = new ArrayList();
        this.currentPoint = new PathPoint(0.0f, 0.0f, 3, null);
        this.ctrlPoint = new PathPoint(0.0f, 0.0f, 3, null);
        this.segmentPoint = new PathPoint(0.0f, 0.0f, 3, null);
        this.reflectiveCtrlPoint = new PathPoint(0.0f, 0.0f, 3, null);
    }

    private final void addNode(char c, float[] arr_f) {
        Collection collection0 = PathNodeKt.toPathNodes(c, arr_f);
        this.nodes.addAll(collection0);
    }

    public final PathParser addPathNodes(List list0) {
        Intrinsics.checkNotNullParameter(list0, "nodes");
        this.nodes.addAll(list0);
        return this;
    }

    private final void arcTo(ArcTo pathNode$ArcTo0, Path path0) {
        this.drawArc(path0, ((double)this.currentPoint.getX()), ((double)this.currentPoint.getY()), ((double)pathNode$ArcTo0.getArcStartX()), ((double)pathNode$ArcTo0.getArcStartY()), ((double)pathNode$ArcTo0.getHorizontalEllipseRadius()), ((double)pathNode$ArcTo0.getVerticalEllipseRadius()), ((double)pathNode$ArcTo0.getTheta()), pathNode$ArcTo0.isMoreThanHalf(), pathNode$ArcTo0.isPositiveArc());
        this.currentPoint.setX(pathNode$ArcTo0.getArcStartX());
        this.currentPoint.setY(pathNode$ArcTo0.getArcStartY());
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void arcToBezier(Path path0, double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7, double f8) {
        int v = (int)Math.ceil(Math.abs(f8 * 4.0 / 3.141593));
        double f9 = Math.cos(f6);
        double f10 = Math.sin(f6);
        double f11 = Math.cos(f7);
        double f12 = Math.sin(f7);
        double f13 = -f2 * f9;
        double f14 = f3 * f10;
        double f15 = -f2 * f10;
        double f16 = f3 * f9;
        if(v > 0) {
            double f17 = f7;
            double f18 = f12 * f15 + f11 * f16;
            double f19 = f13 * f12 - f14 * f11;
            int v1 = 0;
            double f20 = f4;
            double f21 = f5;
            while(true) {
                double f22 = f17 + f8 / ((double)v);
                double f23 = Math.sin(f22);
                double f24 = Math.cos(f22);
                double f25 = f + f2 * f9 * f24 - f14 * f23;
                double f26 = f1 + f2 * f10 * f24 + f16 * f23;
                double f27 = f13 * f23 - f14 * f24;
                double f28 = f23 * f15 + f24 * f16;
                double f29 = f22 - f17;
                double f30 = Math.tan(f29 / 2.0);
                double f31 = Math.sin(f29) * (Math.sqrt(4.0 + 3.0 * f30 * f30) - 1.0) / 3.0;
                path0.cubicTo(((float)(f20 + f19 * f31)), ((float)(f21 + f18 * f31)), ((float)(f25 - f31 * f27)), ((float)(f26 - f31 * f28)), ((float)f25), ((float)f26));
                if(v1 + 1 >= v) {
                    break;
                }
                ++v1;
                f17 = f22;
                f18 = f28;
                f19 = f27;
                f21 = f26;
                f20 = f25;
            }
        }
    }

    public final void clear() {
        this.nodes.clear();
    }

    private final void close(Path path0) {
        this.currentPoint.setX(this.segmentPoint.getX());
        this.currentPoint.setY(this.segmentPoint.getY());
        this.ctrlPoint.setX(this.segmentPoint.getX());
        this.ctrlPoint.setY(this.segmentPoint.getY());
        path0.close();
        path0.moveTo(this.currentPoint.getX(), this.currentPoint.getY());
    }

    private final float[] copyOfRange(float[] arr_f, int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException();
        }
        if(v < 0 || v > arr_f.length) {
            throw new IndexOutOfBoundsException();
        }
        int v2 = v1 - v;
        float[] arr_f1 = new float[v2];
        ArraysKt.copyInto(arr_f, arr_f1, 0, v, Math.min(v2, arr_f.length - v) + v);
        return arr_f1;
    }

    private final void curveTo(CurveTo pathNode$CurveTo0, Path path0) {
        path0.cubicTo(pathNode$CurveTo0.getX1(), pathNode$CurveTo0.getY1(), pathNode$CurveTo0.getX2(), pathNode$CurveTo0.getY2(), pathNode$CurveTo0.getX3(), pathNode$CurveTo0.getY3());
        this.ctrlPoint.setX(pathNode$CurveTo0.getX2());
        this.ctrlPoint.setY(pathNode$CurveTo0.getY2());
        this.currentPoint.setX(pathNode$CurveTo0.getX3());
        this.currentPoint.setY(pathNode$CurveTo0.getY3());
    }

    private final void drawArc(Path path0, double f, double f1, double f2, double f3, double f4, double f5, double f6, boolean z, boolean z1) {
        double f25;
        double f24;
        double f7 = f6 / 180.0 * 3.141593;
        double f8 = Math.cos(f7);
        double f9 = Math.sin(f7);
        double f10 = (f * f8 + f1 * f9) / f4;
        double f11 = (-f * f9 + f1 * f8) / f5;
        double f12 = (f2 * f8 + f3 * f9) / f4;
        double f13 = (-f2 * f9 + f3 * f8) / f5;
        double f14 = f10 - f12;
        double f15 = f11 - f13;
        double f16 = (f10 + f12) / 2.0;
        double f17 = (f11 + f13) / 2.0;
        double f18 = f14 * f14 + f15 * f15;
        if(f18 == 0.0) {
            return;
        }
        double f19 = 1.0 / f18 - 0.25;
        if(f19 < 0.0) {
            double f20 = (double)(((float)(Math.sqrt(f18) / 1.99999)));
            this.drawArc(path0, f, f1, f2, f3, f4 * f20, f5 * f20, f6, z, z1);
            return;
        }
        double f21 = Math.sqrt(f19);
        double f22 = f14 * f21;
        double f23 = f21 * f15;
        if(z == z1) {
            f24 = f16 - f23;
            f25 = f17 + f22;
        }
        else {
            f24 = f16 + f23;
            f25 = f17 - f22;
        }
        double f26 = Math.atan2(f11 - f25, f10 - f24);
        double f27 = Math.atan2(f13 - f25, f12 - f24) - f26;
        int v = Double.compare(f27, 0.0);
        if(z1 != v >= 0) {
            f27 = v <= 0 ? f27 + 6.283185 : f27 - 6.283185;
        }
        this.arcToBezier(path0, f24 * f4 * f8 - f25 * f5 * f9, f24 * f4 * f9 + f25 * f5 * f8, f4, f5, f, f1, f7, f26, f27);
    }

    private final void extract(String s, int v, ExtractFloatResult pathParser$ExtractFloatResult0) {
        boolean z3;
        pathParser$ExtractFloatResult0.setEndWithNegativeOrDot(false);
        int v1 = v;
        boolean z = false;
        boolean z1 = false;
        boolean z2 = false;
        while(v1 < s.length()) {
            int v2 = s.charAt(v1);
            if(v2 == 0x20 || v2 == 44) {
                z = false;
                z2 = true;
            }
            else {
                switch(v2) {
                    case 45: {
                        if(v1 != v && !z) {
                            pathParser$ExtractFloatResult0.setEndWithNegativeOrDot(true);
                            z = false;
                            z2 = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    case 46: {
                        if(z1) {
                            pathParser$ExtractFloatResult0.setEndWithNegativeOrDot(true);
                            z = false;
                            z2 = true;
                        }
                        else {
                            z = false;
                            z1 = true;
                        }
                        break;
                    }
                    case 69: 
                    case 101: {
                        z3 = true;
                    label_25:
                        if(z3) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    default: {
                        z3 = false;
                        goto label_25;
                    }
                }
            }
            if(z2) {
                break;
            }
            ++v1;
        }
        pathParser$ExtractFloatResult0.setEndPosition(v1);
    }

    private final float[] getFloats(String s) {
        switch(s.charAt(0)) {
            case 90: 
            case 0x7A: {
                return new float[0];
            }
            default: {
                float[] arr_f = new float[s.length()];
                ExtractFloatResult pathParser$ExtractFloatResult0 = new ExtractFloatResult(0, false, 3, null);
                int v = s.length();
                int v2 = 0;
                for(int v1 = 1; v1 < v; v1 = pathParser$ExtractFloatResult0.getEndWithNegativeOrDot() ? v3 : v3 + 1) {
                    this.extract(s, v1, pathParser$ExtractFloatResult0);
                    int v3 = pathParser$ExtractFloatResult0.getEndPosition();
                    if(v1 < v3) {
                        String s1 = s.substring(v1, v3);
                        Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        arr_f[v2] = Float.parseFloat(s1);
                        ++v2;
                    }
                }
                return this.copyOfRange(arr_f, 0, v2);
            }
        }
    }

    private final void horizontalTo(HorizontalTo pathNode$HorizontalTo0, Path path0) {
        path0.lineTo(pathNode$HorizontalTo0.getX(), this.currentPoint.getY());
        this.currentPoint.setX(pathNode$HorizontalTo0.getX());
    }

    private final void lineTo(LineTo pathNode$LineTo0, Path path0) {
        path0.lineTo(pathNode$LineTo0.getX(), pathNode$LineTo0.getY());
        this.currentPoint.setX(pathNode$LineTo0.getX());
        this.currentPoint.setY(pathNode$LineTo0.getY());
    }

    private final void moveTo(MoveTo pathNode$MoveTo0, Path path0) {
        this.currentPoint.setX(pathNode$MoveTo0.getX());
        this.currentPoint.setY(pathNode$MoveTo0.getY());
        path0.moveTo(pathNode$MoveTo0.getX(), pathNode$MoveTo0.getY());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final int nextStart(String s, int v) {
        while(v < s.length()) {
            int v1 = s.charAt(v);
            if(((v1 - 65) * (v1 - 90) <= 0 || (v1 - 97) * (v1 - 0x7A) <= 0) && v1 != 101 && v1 != 69) {
                return v;
            }
            ++v;
        }
        return v;
    }

    public final PathParser parsePathString(String s) {
        Intrinsics.checkNotNullParameter(s, "pathData");
        this.nodes.clear();
        int v = 1;
        int v1 = 0;
        while(v < s.length()) {
            int v2 = this.nextStart(s, v);
            String s1 = s.substring(v1, v2);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            CharSequence charSequence0 = s1;
            int v3 = charSequence0.length() - 1;
            int v4 = 0;
            boolean z = false;
            while(v4 <= v3) {
                boolean z1 = Intrinsics.compare(charSequence0.charAt((z ? v3 : v4)), 0x20) <= 0;
                if(z) {
                    if(!z1) {
                        break;
                    }
                    --v3;
                }
                else if(z1) {
                    ++v4;
                }
                else {
                    z = true;
                }
            }
            String s2 = charSequence0.subSequence(v4, v3 + 1).toString();
            if(s2.length() > 0) {
                this.addNode(s2.charAt(0), this.getFloats(s2));
            }
            v1 = v2;
            v = v2 + 1;
        }
        if(v - v1 == 1 && v1 < s.length()) {
            this.addNode(s.charAt(v1), new float[0]);
        }
        return this;
    }

    private final void quadTo(QuadTo pathNode$QuadTo0, Path path0) {
        path0.quadraticBezierTo(pathNode$QuadTo0.getX1(), pathNode$QuadTo0.getY1(), pathNode$QuadTo0.getX2(), pathNode$QuadTo0.getY2());
        this.ctrlPoint.setX(pathNode$QuadTo0.getX1());
        this.ctrlPoint.setY(pathNode$QuadTo0.getY1());
        this.currentPoint.setX(pathNode$QuadTo0.getX2());
        this.currentPoint.setY(pathNode$QuadTo0.getY2());
    }

    private final void reflectiveCurveTo(ReflectiveCurveTo pathNode$ReflectiveCurveTo0, boolean z, Path path0) {
        if(z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() * 2.0f - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(2.0f * this.currentPoint.getY() - this.ctrlPoint.getY());
        }
        else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path0.cubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), pathNode$ReflectiveCurveTo0.getX1(), pathNode$ReflectiveCurveTo0.getY1(), pathNode$ReflectiveCurveTo0.getX2(), pathNode$ReflectiveCurveTo0.getY2());
        this.ctrlPoint.setX(pathNode$ReflectiveCurveTo0.getX1());
        this.ctrlPoint.setY(pathNode$ReflectiveCurveTo0.getY1());
        this.currentPoint.setX(pathNode$ReflectiveCurveTo0.getX2());
        this.currentPoint.setY(pathNode$ReflectiveCurveTo0.getY2());
    }

    private final void reflectiveQuadTo(ReflectiveQuadTo pathNode$ReflectiveQuadTo0, boolean z, Path path0) {
        if(z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() * 2.0f - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(2.0f * this.currentPoint.getY() - this.ctrlPoint.getY());
        }
        else {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY());
        }
        path0.quadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), pathNode$ReflectiveQuadTo0.getX(), pathNode$ReflectiveQuadTo0.getY());
        this.ctrlPoint.setX(this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(pathNode$ReflectiveQuadTo0.getX());
        this.currentPoint.setY(pathNode$ReflectiveQuadTo0.getY());
    }

    private final void relativeArcTo(RelativeArcTo pathNode$RelativeArcTo0, Path path0) {
        float f = pathNode$RelativeArcTo0.getArcStartDx() + this.currentPoint.getX();
        float f1 = pathNode$RelativeArcTo0.getArcStartDy() + this.currentPoint.getY();
        this.drawArc(path0, ((double)this.currentPoint.getX()), ((double)this.currentPoint.getY()), ((double)f), ((double)f1), ((double)pathNode$RelativeArcTo0.getHorizontalEllipseRadius()), ((double)pathNode$RelativeArcTo0.getVerticalEllipseRadius()), ((double)pathNode$RelativeArcTo0.getTheta()), pathNode$RelativeArcTo0.isMoreThanHalf(), pathNode$RelativeArcTo0.isPositiveArc());
        this.currentPoint.setX(f);
        this.currentPoint.setY(f1);
        this.ctrlPoint.setX(this.currentPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY());
    }

    private final void relativeCurveTo(RelativeCurveTo pathNode$RelativeCurveTo0, Path path0) {
        path0.relativeCubicTo(pathNode$RelativeCurveTo0.getDx1(), pathNode$RelativeCurveTo0.getDy1(), pathNode$RelativeCurveTo0.getDx2(), pathNode$RelativeCurveTo0.getDy2(), pathNode$RelativeCurveTo0.getDx3(), pathNode$RelativeCurveTo0.getDy3());
        this.ctrlPoint.setX(this.currentPoint.getX() + pathNode$RelativeCurveTo0.getDx2());
        this.ctrlPoint.setY(this.currentPoint.getY() + pathNode$RelativeCurveTo0.getDy2());
        this.currentPoint.setX(this.currentPoint.getX() + pathNode$RelativeCurveTo0.getDx3());
        this.currentPoint.setY(this.currentPoint.getY() + pathNode$RelativeCurveTo0.getDy3());
    }

    private final void relativeHorizontalTo(RelativeHorizontalTo pathNode$RelativeHorizontalTo0, Path path0) {
        path0.relativeLineTo(pathNode$RelativeHorizontalTo0.getDx(), 0.0f);
        this.currentPoint.setX(this.currentPoint.getX() + pathNode$RelativeHorizontalTo0.getDx());
    }

    private final void relativeLineTo(RelativeLineTo pathNode$RelativeLineTo0, Path path0) {
        path0.relativeLineTo(pathNode$RelativeLineTo0.getDx(), pathNode$RelativeLineTo0.getDy());
        this.currentPoint.setX(this.currentPoint.getX() + pathNode$RelativeLineTo0.getDx());
        this.currentPoint.setY(this.currentPoint.getY() + pathNode$RelativeLineTo0.getDy());
    }

    private final void relativeMoveTo(RelativeMoveTo pathNode$RelativeMoveTo0, Path path0) {
        this.currentPoint.setX(this.currentPoint.getX() + pathNode$RelativeMoveTo0.getDx());
        this.currentPoint.setY(this.currentPoint.getY() + pathNode$RelativeMoveTo0.getDy());
        path0.relativeMoveTo(pathNode$RelativeMoveTo0.getDx(), pathNode$RelativeMoveTo0.getDy());
        this.segmentPoint.setX(this.currentPoint.getX());
        this.segmentPoint.setY(this.currentPoint.getY());
    }

    private final void relativeQuadTo(RelativeQuadTo pathNode$RelativeQuadTo0, Path path0) {
        path0.relativeQuadraticBezierTo(pathNode$RelativeQuadTo0.getDx1(), pathNode$RelativeQuadTo0.getDy1(), pathNode$RelativeQuadTo0.getDx2(), pathNode$RelativeQuadTo0.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + pathNode$RelativeQuadTo0.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + pathNode$RelativeQuadTo0.getDy1());
        this.currentPoint.setX(this.currentPoint.getX() + pathNode$RelativeQuadTo0.getDx1());
        this.currentPoint.setY(this.currentPoint.getY() + pathNode$RelativeQuadTo0.getDy1());
    }

    private final void relativeReflectiveCurveTo(RelativeReflectiveCurveTo pathNode$RelativeReflectiveCurveTo0, boolean z, Path path0) {
        if(z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        }
        else {
            this.reflectiveCtrlPoint.reset();
        }
        path0.relativeCubicTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), pathNode$RelativeReflectiveCurveTo0.getDx1(), pathNode$RelativeReflectiveCurveTo0.getDy1(), pathNode$RelativeReflectiveCurveTo0.getDx2(), pathNode$RelativeReflectiveCurveTo0.getDy2());
        this.ctrlPoint.setX(this.currentPoint.getX() + pathNode$RelativeReflectiveCurveTo0.getDx1());
        this.ctrlPoint.setY(this.currentPoint.getY() + pathNode$RelativeReflectiveCurveTo0.getDy1());
        this.currentPoint.setX(this.currentPoint.getX() + pathNode$RelativeReflectiveCurveTo0.getDx2());
        this.currentPoint.setY(this.currentPoint.getY() + pathNode$RelativeReflectiveCurveTo0.getDy2());
    }

    private final void relativeReflectiveQuadTo(RelativeReflectiveQuadTo pathNode$RelativeReflectiveQuadTo0, boolean z, Path path0) {
        if(z) {
            this.reflectiveCtrlPoint.setX(this.currentPoint.getX() - this.ctrlPoint.getX());
            this.reflectiveCtrlPoint.setY(this.currentPoint.getY() - this.ctrlPoint.getY());
        }
        else {
            this.reflectiveCtrlPoint.reset();
        }
        path0.relativeQuadraticBezierTo(this.reflectiveCtrlPoint.getX(), this.reflectiveCtrlPoint.getY(), pathNode$RelativeReflectiveQuadTo0.getDx(), pathNode$RelativeReflectiveQuadTo0.getDy());
        this.ctrlPoint.setX(this.currentPoint.getX() + this.reflectiveCtrlPoint.getX());
        this.ctrlPoint.setY(this.currentPoint.getY() + this.reflectiveCtrlPoint.getY());
        this.currentPoint.setX(this.currentPoint.getX() + pathNode$RelativeReflectiveQuadTo0.getDx());
        this.currentPoint.setY(this.currentPoint.getY() + pathNode$RelativeReflectiveQuadTo0.getDy());
    }

    private final void relativeVerticalTo(RelativeVerticalTo pathNode$RelativeVerticalTo0, Path path0) {
        path0.relativeLineTo(0.0f, pathNode$RelativeVerticalTo0.getDy());
        this.currentPoint.setY(this.currentPoint.getY() + pathNode$RelativeVerticalTo0.getDy());
    }

    public final List toNodes() {
        return this.nodes;
    }

    public final Path toPath(Path path0) {
        Intrinsics.checkNotNullParameter(path0, "target");
        path0.reset();
        this.currentPoint.reset();
        this.ctrlPoint.reset();
        this.segmentPoint.reset();
        this.reflectiveCtrlPoint.reset();
        List list0 = this.nodes;
        int v = list0.size();
        if(v - 1 >= 0) {
            PathNode pathNode0 = null;
            for(int v1 = 0; true; ++v1) {
                PathNode pathNode1 = (PathNode)list0.get(v1);
                if(pathNode0 == null) {
                    pathNode0 = pathNode1;
                }
                if(pathNode1 instanceof Close) {
                    this.close(path0);
                }
                else if(pathNode1 instanceof RelativeMoveTo) {
                    this.relativeMoveTo(((RelativeMoveTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof MoveTo) {
                    this.moveTo(((MoveTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof RelativeLineTo) {
                    this.relativeLineTo(((RelativeLineTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof LineTo) {
                    this.lineTo(((LineTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof RelativeHorizontalTo) {
                    this.relativeHorizontalTo(((RelativeHorizontalTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof HorizontalTo) {
                    this.horizontalTo(((HorizontalTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof RelativeVerticalTo) {
                    this.relativeVerticalTo(((RelativeVerticalTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof VerticalTo) {
                    this.verticalTo(((VerticalTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof RelativeCurveTo) {
                    this.relativeCurveTo(((RelativeCurveTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof CurveTo) {
                    this.curveTo(((CurveTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof RelativeReflectiveCurveTo) {
                    Intrinsics.checkNotNull(pathNode0);
                    this.relativeReflectiveCurveTo(((RelativeReflectiveCurveTo)pathNode1), pathNode0.isCurve(), path0);
                }
                else if(pathNode1 instanceof ReflectiveCurveTo) {
                    Intrinsics.checkNotNull(pathNode0);
                    this.reflectiveCurveTo(((ReflectiveCurveTo)pathNode1), pathNode0.isCurve(), path0);
                }
                else if(pathNode1 instanceof RelativeQuadTo) {
                    this.relativeQuadTo(((RelativeQuadTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof QuadTo) {
                    this.quadTo(((QuadTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof RelativeReflectiveQuadTo) {
                    Intrinsics.checkNotNull(pathNode0);
                    this.relativeReflectiveQuadTo(((RelativeReflectiveQuadTo)pathNode1), pathNode0.isQuad(), path0);
                }
                else if(pathNode1 instanceof ReflectiveQuadTo) {
                    Intrinsics.checkNotNull(pathNode0);
                    this.reflectiveQuadTo(((ReflectiveQuadTo)pathNode1), pathNode0.isQuad(), path0);
                }
                else if(pathNode1 instanceof RelativeArcTo) {
                    this.relativeArcTo(((RelativeArcTo)pathNode1), path0);
                }
                else if(pathNode1 instanceof ArcTo) {
                    this.arcTo(((ArcTo)pathNode1), path0);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
                pathNode0 = pathNode1;
            }
        }
        return path0;
    }

    public static Path toPath$default(PathParser pathParser0, Path path0, int v, Object object0) {
        if((v & 1) != 0) {
            path0 = AndroidPath_androidKt.Path();
        }
        return pathParser0.toPath(path0);
    }

    private final double toRadians(double f) [...] // Inlined contents

    private final float toRadians(float f) {
        return f / 180.0f * 3.141593f;
    }

    private final void verticalTo(VerticalTo pathNode$VerticalTo0, Path path0) {
        path0.lineTo(this.currentPoint.getX(), pathNode$VerticalTo0.getY());
        this.currentPoint.setY(pathNode$VerticalTo0.getY());
    }
}

