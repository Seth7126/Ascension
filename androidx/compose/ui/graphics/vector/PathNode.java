package androidx.compose.ui.graphics.vector;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0007\b\t\n\u000B\f\r\u000E\u000F\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\u001B\b\u0004\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0002\u0010\u0006R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0004\u0010\u0006\u0082\u0001\u0013\u001A\u001B\u001C\u001D\u001E\u001F !\"#$%&\'()*+,¨\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode;", "", "isCurve", "", "isQuad", "(ZZ)V", "()Z", "ArcTo", "Close", "CurveTo", "HorizontalTo", "LineTo", "MoveTo", "QuadTo", "ReflectiveCurveTo", "ReflectiveQuadTo", "RelativeArcTo", "RelativeCurveTo", "RelativeHorizontalTo", "RelativeLineTo", "RelativeMoveTo", "RelativeQuadTo", "RelativeReflectiveCurveTo", "RelativeReflectiveQuadTo", "RelativeVerticalTo", "VerticalTo", "Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class PathNode {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003JO\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u001B\u001A\u00020\u00072\b\u0010\u001C\u001A\u0004\u0018\u00010\u001DHÖ\u0003J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001J\t\u0010 \u001A\u00020!HÖ\u0001R\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\n\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\r¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "horizontalEllipseRadius", "", "verticalEllipseRadius", "theta", "isMoreThanHalf", "", "isPositiveArc", "arcStartX", "arcStartY", "(FFFZZFF)V", "getArcStartX", "()F", "getArcStartY", "getHorizontalEllipseRadius", "()Z", "getTheta", "getVerticalEllipseRadius", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class ArcTo extends PathNode {
        private final float arcStartX;
        private final float arcStartY;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public ArcTo(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            super(false, false, 3, null);
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f1;
            this.theta = f2;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z1;
            this.arcStartX = f3;
            this.arcStartY = f4;
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartX;
        }

        public final float component7() {
            return this.arcStartY;
        }

        public final ArcTo copy(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            return new ArcTo(f, f1, f2, z, z1, f3, f4);
        }

        public static ArcTo copy$default(ArcTo pathNode$ArcTo0, float f, float f1, float f2, boolean z, boolean z1, float f3, float f4, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ArcTo0.horizontalEllipseRadius;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ArcTo0.verticalEllipseRadius;
            }
            if((v & 4) != 0) {
                f2 = pathNode$ArcTo0.theta;
            }
            if((v & 8) != 0) {
                z = pathNode$ArcTo0.isMoreThanHalf;
            }
            if((v & 16) != 0) {
                z1 = pathNode$ArcTo0.isPositiveArc;
            }
            if((v & 0x20) != 0) {
                f3 = pathNode$ArcTo0.arcStartX;
            }
            if((v & 0x40) != 0) {
                f4 = pathNode$ArcTo0.arcStartY;
            }
            return pathNode$ArcTo0.copy(f, f1, f2, z, z1, f3, f4);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ArcTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.horizontalEllipseRadius, ((ArcTo)object0).horizontalEllipseRadius)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.verticalEllipseRadius, ((ArcTo)object0).verticalEllipseRadius)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.theta, ((ArcTo)object0).theta)) {
                return false;
            }
            if(this.isMoreThanHalf != ((ArcTo)object0).isMoreThanHalf) {
                return false;
            }
            if(this.isPositiveArc != ((ArcTo)object0).isPositiveArc) {
                return false;
            }
            return Intrinsics.areEqual(this.arcStartX, ((ArcTo)object0).arcStartX) ? Intrinsics.areEqual(this.arcStartY, ((ArcTo)object0).arcStartY) : false;
        }

        public final float getArcStartX() {
            return this.arcStartX;
        }

        public final float getArcStartY() {
            return this.arcStartY;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        @Override
        public int hashCode() {
            int v = Float.floatToIntBits(this.horizontalEllipseRadius);
            int v1 = Float.floatToIntBits(this.verticalEllipseRadius);
            int v2 = Float.floatToIntBits(this.theta);
            int v3 = this.isMoreThanHalf;
            int v4 = 1;
            if(v3) {
                v3 = 1;
            }
            if(!this.isPositiveArc) {
                v4 = false;
            }
            return (((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + Float.floatToIntBits(this.arcStartX)) * 0x1F + Float.floatToIntBits(this.arcStartY);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @Override
        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartX=" + this.arcStartX + ", arcStartY=" + this.arcStartY + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$Close;", "Landroidx/compose/ui/graphics/vector/PathNode;", "()V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Close extends PathNode {
        public static final Close INSTANCE;

        static {
            Close.INSTANCE = new Close();
        }

        private Close() {
            super(false, false, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003JE\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u001BHÖ\u0003J\t\u0010\u001C\u001A\u00020\u001DHÖ\u0001J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$CurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x1", "", "y1", "x2", "y2", "x3", "y3", "(FFFFFF)V", "getX1", "()F", "getX2", "getX3", "getY1", "getY2", "getY3", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class CurveTo extends PathNode {
        private final float x1;
        private final float x2;
        private final float x3;
        private final float y1;
        private final float y2;
        private final float y3;

        public CurveTo(float f, float f1, float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f1;
            this.x2 = f2;
            this.y2 = f3;
            this.x3 = f4;
            this.y3 = f5;
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final float component5() {
            return this.x3;
        }

        public final float component6() {
            return this.y3;
        }

        public final CurveTo copy(float f, float f1, float f2, float f3, float f4, float f5) {
            return new CurveTo(f, f1, f2, f3, f4, f5);
        }

        public static CurveTo copy$default(CurveTo pathNode$CurveTo0, float f, float f1, float f2, float f3, float f4, float f5, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$CurveTo0.x1;
            }
            if((v & 2) != 0) {
                f1 = pathNode$CurveTo0.y1;
            }
            if((v & 4) != 0) {
                f2 = pathNode$CurveTo0.x2;
            }
            if((v & 8) != 0) {
                f3 = pathNode$CurveTo0.y2;
            }
            if((v & 16) != 0) {
                f4 = pathNode$CurveTo0.x3;
            }
            if((v & 0x20) != 0) {
                f5 = pathNode$CurveTo0.y3;
            }
            return pathNode$CurveTo0.copy(f, f1, f2, f3, f4, f5);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CurveTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.x1, ((CurveTo)object0).x1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.y1, ((CurveTo)object0).y1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.x2, ((CurveTo)object0).x2)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.y2, ((CurveTo)object0).y2)) {
                return false;
            }
            return Intrinsics.areEqual(this.x3, ((CurveTo)object0).x3) ? Intrinsics.areEqual(this.y3, ((CurveTo)object0).y3) : false;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getX3() {
            return this.x3;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        public final float getY3() {
            return this.y3;
        }

        @Override
        public int hashCode() {
            return ((((Float.floatToIntBits(this.x1) * 0x1F + Float.floatToIntBits(this.y1)) * 0x1F + Float.floatToIntBits(this.x2)) * 0x1F + Float.floatToIntBits(this.y2)) * 0x1F + Float.floatToIntBits(this.x3)) * 0x1F + Float.floatToIntBits(this.y3);
        }

        @Override
        public String toString() {
            return "CurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ", x3=" + this.x3 + ", y3=" + this.y3 + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$HorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "(F)V", "getX", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class HorizontalTo extends PathNode {
        private final float x;

        public HorizontalTo(float f) {
            super(false, false, 3, null);
            this.x = f;
        }

        public final float component1() {
            return this.x;
        }

        public final HorizontalTo copy(float f) {
            return new HorizontalTo(f);
        }

        public static HorizontalTo copy$default(HorizontalTo pathNode$HorizontalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$HorizontalTo0.x;
            }
            return pathNode$HorizontalTo0.copy(f);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof HorizontalTo ? Intrinsics.areEqual(this.x, ((HorizontalTo)object0).x) : false;
        }

        public final float getX() {
            return this.x;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.x);
        }

        @Override
        public String toString() {
            return "HorizontalTo(x=" + this.x + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$LineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class LineTo extends PathNode {
        private final float x;
        private final float y;

        public LineTo(float f, float f1) {
            super(false, false, 3, null);
            this.x = f;
            this.y = f1;
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final LineTo copy(float f, float f1) {
            return new LineTo(f, f1);
        }

        public static LineTo copy$default(LineTo pathNode$LineTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$LineTo0.x;
            }
            if((v & 2) != 0) {
                f1 = pathNode$LineTo0.y;
            }
            return pathNode$LineTo0.copy(f, f1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof LineTo)) {
                return false;
            }
            return Intrinsics.areEqual(this.x, ((LineTo)object0).x) ? Intrinsics.areEqual(this.y, ((LineTo)object0).y) : false;
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
            return "LineTo(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$MoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class MoveTo extends PathNode {
        private final float x;
        private final float y;

        public MoveTo(float f, float f1) {
            super(false, false, 3, null);
            this.x = f;
            this.y = f1;
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final MoveTo copy(float f, float f1) {
            return new MoveTo(f, f1);
        }

        public static MoveTo copy$default(MoveTo pathNode$MoveTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$MoveTo0.x;
            }
            if((v & 2) != 0) {
                f1 = pathNode$MoveTo0.y;
            }
            return pathNode$MoveTo0.copy(f, f1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof MoveTo)) {
                return false;
            }
            return Intrinsics.areEqual(this.x, ((MoveTo)object0).x) ? Intrinsics.areEqual(this.y, ((MoveTo)object0).y) : false;
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
            return "MoveTo(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$QuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x1", "", "y1", "x2", "y2", "(FFFF)V", "getX1", "()F", "getX2", "getY1", "getY2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class QuadTo extends PathNode {
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public QuadTo(float f, float f1, float f2, float f3) {
            super(false, true, 1, null);
            this.x1 = f;
            this.y1 = f1;
            this.x2 = f2;
            this.y2 = f3;
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final QuadTo copy(float f, float f1, float f2, float f3) {
            return new QuadTo(f, f1, f2, f3);
        }

        public static QuadTo copy$default(QuadTo pathNode$QuadTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$QuadTo0.x1;
            }
            if((v & 2) != 0) {
                f1 = pathNode$QuadTo0.y1;
            }
            if((v & 4) != 0) {
                f2 = pathNode$QuadTo0.x2;
            }
            if((v & 8) != 0) {
                f3 = pathNode$QuadTo0.y2;
            }
            return pathNode$QuadTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof QuadTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.x1, ((QuadTo)object0).x1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.y1, ((QuadTo)object0).y1)) {
                return false;
            }
            return Intrinsics.areEqual(this.x2, ((QuadTo)object0).x2) ? Intrinsics.areEqual(this.y2, ((QuadTo)object0).y2) : false;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.x1) * 0x1F + Float.floatToIntBits(this.y1)) * 0x1F + Float.floatToIntBits(this.x2)) * 0x1F + Float.floatToIntBits(this.y2);
        }

        @Override
        public String toString() {
            return "QuadTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x1", "", "y1", "x2", "y2", "(FFFF)V", "getX1", "()F", "getX2", "getY1", "getY2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class ReflectiveCurveTo extends PathNode {
        private final float x1;
        private final float x2;
        private final float y1;
        private final float y2;

        public ReflectiveCurveTo(float f, float f1, float f2, float f3) {
            super(true, false, 2, null);
            this.x1 = f;
            this.y1 = f1;
            this.x2 = f2;
            this.y2 = f3;
        }

        public final float component1() {
            return this.x1;
        }

        public final float component2() {
            return this.y1;
        }

        public final float component3() {
            return this.x2;
        }

        public final float component4() {
            return this.y2;
        }

        public final ReflectiveCurveTo copy(float f, float f1, float f2, float f3) {
            return new ReflectiveCurveTo(f, f1, f2, f3);
        }

        public static ReflectiveCurveTo copy$default(ReflectiveCurveTo pathNode$ReflectiveCurveTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ReflectiveCurveTo0.x1;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ReflectiveCurveTo0.y1;
            }
            if((v & 4) != 0) {
                f2 = pathNode$ReflectiveCurveTo0.x2;
            }
            if((v & 8) != 0) {
                f3 = pathNode$ReflectiveCurveTo0.y2;
            }
            return pathNode$ReflectiveCurveTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ReflectiveCurveTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.x1, ((ReflectiveCurveTo)object0).x1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.y1, ((ReflectiveCurveTo)object0).y1)) {
                return false;
            }
            return Intrinsics.areEqual(this.x2, ((ReflectiveCurveTo)object0).x2) ? Intrinsics.areEqual(this.y2, ((ReflectiveCurveTo)object0).y2) : false;
        }

        public final float getX1() {
            return this.x1;
        }

        public final float getX2() {
            return this.x2;
        }

        public final float getY1() {
            return this.y1;
        }

        public final float getY2() {
            return this.y2;
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.x1) * 0x1F + Float.floatToIntBits(this.y1)) * 0x1F + Float.floatToIntBits(this.x2)) * 0x1F + Float.floatToIntBits(this.y2);
        }

        @Override
        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$ReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "x", "", "y", "(FF)V", "getX", "()F", "getY", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class ReflectiveQuadTo extends PathNode {
        private final float x;
        private final float y;

        public ReflectiveQuadTo(float f, float f1) {
            super(false, true, 1, null);
            this.x = f;
            this.y = f1;
        }

        public final float component1() {
            return this.x;
        }

        public final float component2() {
            return this.y;
        }

        public final ReflectiveQuadTo copy(float f, float f1) {
            return new ReflectiveQuadTo(f, f1);
        }

        public static ReflectiveQuadTo copy$default(ReflectiveQuadTo pathNode$ReflectiveQuadTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$ReflectiveQuadTo0.x;
            }
            if((v & 2) != 0) {
                f1 = pathNode$ReflectiveQuadTo0.y;
            }
            return pathNode$ReflectiveQuadTo0.copy(f, f1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ReflectiveQuadTo)) {
                return false;
            }
            return Intrinsics.areEqual(this.x, ((ReflectiveQuadTo)object0).x) ? Intrinsics.areEqual(this.y, ((ReflectiveQuadTo)object0).y) : false;
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
            return "ReflectiveQuadTo(x=" + this.x + ", y=" + this.y + ')';
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0003¢\u0006\u0002\u0010\u000BJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003JO\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\u00032\b\b\u0002\u0010\n\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u001B\u001A\u00020\u00072\b\u0010\u001C\u001A\u0004\u0018\u00010\u001DHÖ\u0003J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001J\t\u0010 \u001A\u00020!HÖ\u0001R\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\n\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0010R\u0011\u0010\b\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0010R\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\r¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeArcTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "horizontalEllipseRadius", "", "verticalEllipseRadius", "theta", "isMoreThanHalf", "", "isPositiveArc", "arcStartDx", "arcStartDy", "(FFFZZFF)V", "getArcStartDx", "()F", "getArcStartDy", "getHorizontalEllipseRadius", "()Z", "getTheta", "getVerticalEllipseRadius", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeArcTo extends PathNode {
        private final float arcStartDx;
        private final float arcStartDy;
        private final float horizontalEllipseRadius;
        private final boolean isMoreThanHalf;
        private final boolean isPositiveArc;
        private final float theta;
        private final float verticalEllipseRadius;

        public RelativeArcTo(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            super(false, false, 3, null);
            this.horizontalEllipseRadius = f;
            this.verticalEllipseRadius = f1;
            this.theta = f2;
            this.isMoreThanHalf = z;
            this.isPositiveArc = z1;
            this.arcStartDx = f3;
            this.arcStartDy = f4;
        }

        public final float component1() {
            return this.horizontalEllipseRadius;
        }

        public final float component2() {
            return this.verticalEllipseRadius;
        }

        public final float component3() {
            return this.theta;
        }

        public final boolean component4() {
            return this.isMoreThanHalf;
        }

        public final boolean component5() {
            return this.isPositiveArc;
        }

        public final float component6() {
            return this.arcStartDx;
        }

        public final float component7() {
            return this.arcStartDy;
        }

        public final RelativeArcTo copy(float f, float f1, float f2, boolean z, boolean z1, float f3, float f4) {
            return new RelativeArcTo(f, f1, f2, z, z1, f3, f4);
        }

        public static RelativeArcTo copy$default(RelativeArcTo pathNode$RelativeArcTo0, float f, float f1, float f2, boolean z, boolean z1, float f3, float f4, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeArcTo0.horizontalEllipseRadius;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeArcTo0.verticalEllipseRadius;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeArcTo0.theta;
            }
            if((v & 8) != 0) {
                z = pathNode$RelativeArcTo0.isMoreThanHalf;
            }
            if((v & 16) != 0) {
                z1 = pathNode$RelativeArcTo0.isPositiveArc;
            }
            if((v & 0x20) != 0) {
                f3 = pathNode$RelativeArcTo0.arcStartDx;
            }
            if((v & 0x40) != 0) {
                f4 = pathNode$RelativeArcTo0.arcStartDy;
            }
            return pathNode$RelativeArcTo0.copy(f, f1, f2, z, z1, f3, f4);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeArcTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.horizontalEllipseRadius, ((RelativeArcTo)object0).horizontalEllipseRadius)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.verticalEllipseRadius, ((RelativeArcTo)object0).verticalEllipseRadius)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.theta, ((RelativeArcTo)object0).theta)) {
                return false;
            }
            if(this.isMoreThanHalf != ((RelativeArcTo)object0).isMoreThanHalf) {
                return false;
            }
            if(this.isPositiveArc != ((RelativeArcTo)object0).isPositiveArc) {
                return false;
            }
            return Intrinsics.areEqual(this.arcStartDx, ((RelativeArcTo)object0).arcStartDx) ? Intrinsics.areEqual(this.arcStartDy, ((RelativeArcTo)object0).arcStartDy) : false;
        }

        public final float getArcStartDx() {
            return this.arcStartDx;
        }

        public final float getArcStartDy() {
            return this.arcStartDy;
        }

        public final float getHorizontalEllipseRadius() {
            return this.horizontalEllipseRadius;
        }

        public final float getTheta() {
            return this.theta;
        }

        public final float getVerticalEllipseRadius() {
            return this.verticalEllipseRadius;
        }

        @Override
        public int hashCode() {
            int v = Float.floatToIntBits(this.horizontalEllipseRadius);
            int v1 = Float.floatToIntBits(this.verticalEllipseRadius);
            int v2 = Float.floatToIntBits(this.theta);
            int v3 = this.isMoreThanHalf;
            int v4 = 1;
            if(v3) {
                v3 = 1;
            }
            if(!this.isPositiveArc) {
                v4 = false;
            }
            return (((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + Float.floatToIntBits(this.arcStartDx)) * 0x1F + Float.floatToIntBits(this.arcStartDy);
        }

        public final boolean isMoreThanHalf() {
            return this.isMoreThanHalf;
        }

        public final boolean isPositiveArc() {
            return this.isPositiveArc;
        }

        @Override
        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.horizontalEllipseRadius + ", verticalEllipseRadius=" + this.verticalEllipseRadius + ", theta=" + this.theta + ", isMoreThanHalf=" + this.isMoreThanHalf + ", isPositiveArc=" + this.isPositiveArc + ", arcStartDx=" + this.arcStartDx + ", arcStartDy=" + this.arcStartDy + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003JE\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u001BHÖ\u0003J\t\u0010\u001C\u001A\u00020\u001DHÖ\u0001J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000BR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000B¨\u0006 "}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx1", "", "dy1", "dx2", "dy2", "dx3", "dy3", "(FFFFFF)V", "getDx1", "()F", "getDx2", "getDx3", "getDy1", "getDy2", "getDy3", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dx3;
        private final float dy1;
        private final float dy2;
        private final float dy3;

        public RelativeCurveTo(float f, float f1, float f2, float f3, float f4, float f5) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f1;
            this.dx2 = f2;
            this.dy2 = f3;
            this.dx3 = f4;
            this.dy3 = f5;
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final float component5() {
            return this.dx3;
        }

        public final float component6() {
            return this.dy3;
        }

        public final RelativeCurveTo copy(float f, float f1, float f2, float f3, float f4, float f5) {
            return new RelativeCurveTo(f, f1, f2, f3, f4, f5);
        }

        public static RelativeCurveTo copy$default(RelativeCurveTo pathNode$RelativeCurveTo0, float f, float f1, float f2, float f3, float f4, float f5, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeCurveTo0.dx1;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeCurveTo0.dy1;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeCurveTo0.dx2;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeCurveTo0.dy2;
            }
            if((v & 16) != 0) {
                f4 = pathNode$RelativeCurveTo0.dx3;
            }
            if((v & 0x20) != 0) {
                f5 = pathNode$RelativeCurveTo0.dy3;
            }
            return pathNode$RelativeCurveTo0.copy(f, f1, f2, f3, f4, f5);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeCurveTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dx1, ((RelativeCurveTo)object0).dx1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dy1, ((RelativeCurveTo)object0).dy1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dx2, ((RelativeCurveTo)object0).dx2)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dy2, ((RelativeCurveTo)object0).dy2)) {
                return false;
            }
            return Intrinsics.areEqual(this.dx3, ((RelativeCurveTo)object0).dx3) ? Intrinsics.areEqual(this.dy3, ((RelativeCurveTo)object0).dy3) : false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDx3() {
            return this.dx3;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        public final float getDy3() {
            return this.dy3;
        }

        @Override
        public int hashCode() {
            return ((((Float.floatToIntBits(this.dx1) * 0x1F + Float.floatToIntBits(this.dy1)) * 0x1F + Float.floatToIntBits(this.dx2)) * 0x1F + Float.floatToIntBits(this.dy2)) * 0x1F + Float.floatToIntBits(this.dx3)) * 0x1F + Float.floatToIntBits(this.dy3);
        }

        @Override
        public String toString() {
            return "RelativeCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ", dx3=" + this.dx3 + ", dy3=" + this.dy3 + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeHorizontalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "(F)V", "getDx", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeHorizontalTo extends PathNode {
        private final float dx;

        public RelativeHorizontalTo(float f) {
            super(false, false, 3, null);
            this.dx = f;
        }

        public final float component1() {
            return this.dx;
        }

        public final RelativeHorizontalTo copy(float f) {
            return new RelativeHorizontalTo(f);
        }

        public static RelativeHorizontalTo copy$default(RelativeHorizontalTo pathNode$RelativeHorizontalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeHorizontalTo0.dx;
            }
            return pathNode$RelativeHorizontalTo0.copy(f);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RelativeHorizontalTo ? Intrinsics.areEqual(this.dx, ((RelativeHorizontalTo)object0).dx) : false;
        }

        public final float getDx() {
            return this.dx;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.dx);
        }

        @Override
        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.dx + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeLineTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "dy", "(FF)V", "getDx", "()F", "getDy", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeLineTo extends PathNode {
        private final float dx;
        private final float dy;

        public RelativeLineTo(float f, float f1) {
            super(false, false, 3, null);
            this.dx = f;
            this.dy = f1;
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeLineTo copy(float f, float f1) {
            return new RelativeLineTo(f, f1);
        }

        public static RelativeLineTo copy$default(RelativeLineTo pathNode$RelativeLineTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeLineTo0.dx;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeLineTo0.dy;
            }
            return pathNode$RelativeLineTo0.copy(f, f1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeLineTo)) {
                return false;
            }
            return Intrinsics.areEqual(this.dx, ((RelativeLineTo)object0).dx) ? Intrinsics.areEqual(this.dy, ((RelativeLineTo)object0).dy) : false;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.dx) * 0x1F + Float.floatToIntBits(this.dy);
        }

        @Override
        public String toString() {
            return "RelativeLineTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeMoveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "dy", "(FF)V", "getDx", "()F", "getDy", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeMoveTo extends PathNode {
        private final float dx;
        private final float dy;

        public RelativeMoveTo(float f, float f1) {
            super(false, false, 3, null);
            this.dx = f;
            this.dy = f1;
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeMoveTo copy(float f, float f1) {
            return new RelativeMoveTo(f, f1);
        }

        public static RelativeMoveTo copy$default(RelativeMoveTo pathNode$RelativeMoveTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeMoveTo0.dx;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeMoveTo0.dy;
            }
            return pathNode$RelativeMoveTo0.copy(f, f1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeMoveTo)) {
                return false;
            }
            return Intrinsics.areEqual(this.dx, ((RelativeMoveTo)object0).dx) ? Intrinsics.areEqual(this.dy, ((RelativeMoveTo)object0).dy) : false;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.dx) * 0x1F + Float.floatToIntBits(this.dy);
        }

        @Override
        public String toString() {
            return "RelativeMoveTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx1", "", "dy1", "dx2", "dy2", "(FFFF)V", "getDx1", "()F", "getDx2", "getDy1", "getDy2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeQuadTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeQuadTo(float f, float f1, float f2, float f3) {
            super(false, true, 1, null);
            this.dx1 = f;
            this.dy1 = f1;
            this.dx2 = f2;
            this.dy2 = f3;
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeQuadTo copy(float f, float f1, float f2, float f3) {
            return new RelativeQuadTo(f, f1, f2, f3);
        }

        public static RelativeQuadTo copy$default(RelativeQuadTo pathNode$RelativeQuadTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeQuadTo0.dx1;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeQuadTo0.dy1;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeQuadTo0.dx2;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeQuadTo0.dy2;
            }
            return pathNode$RelativeQuadTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeQuadTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dx1, ((RelativeQuadTo)object0).dx1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dy1, ((RelativeQuadTo)object0).dy1)) {
                return false;
            }
            return Intrinsics.areEqual(this.dx2, ((RelativeQuadTo)object0).dx2) ? Intrinsics.areEqual(this.dy2, ((RelativeQuadTo)object0).dy2) : false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.dx1) * 0x1F + Float.floatToIntBits(this.dy1)) * 0x1F + Float.floatToIntBits(this.dx2)) * 0x1F + Float.floatToIntBits(this.dy2);
        }

        @Override
        public String toString() {
            return "RelativeQuadTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001A\u00020\u0003HÆ\u0003J1\u0010\u0011\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001A\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveCurveTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx1", "", "dy1", "dx2", "dy2", "(FFFF)V", "getDx1", "()F", "getDx2", "getDy1", "getDy2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeReflectiveCurveTo extends PathNode {
        private final float dx1;
        private final float dx2;
        private final float dy1;
        private final float dy2;

        public RelativeReflectiveCurveTo(float f, float f1, float f2, float f3) {
            super(true, false, 2, null);
            this.dx1 = f;
            this.dy1 = f1;
            this.dx2 = f2;
            this.dy2 = f3;
        }

        public final float component1() {
            return this.dx1;
        }

        public final float component2() {
            return this.dy1;
        }

        public final float component3() {
            return this.dx2;
        }

        public final float component4() {
            return this.dy2;
        }

        public final RelativeReflectiveCurveTo copy(float f, float f1, float f2, float f3) {
            return new RelativeReflectiveCurveTo(f, f1, f2, f3);
        }

        public static RelativeReflectiveCurveTo copy$default(RelativeReflectiveCurveTo pathNode$RelativeReflectiveCurveTo0, float f, float f1, float f2, float f3, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeReflectiveCurveTo0.dx1;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeReflectiveCurveTo0.dy1;
            }
            if((v & 4) != 0) {
                f2 = pathNode$RelativeReflectiveCurveTo0.dx2;
            }
            if((v & 8) != 0) {
                f3 = pathNode$RelativeReflectiveCurveTo0.dy2;
            }
            return pathNode$RelativeReflectiveCurveTo0.copy(f, f1, f2, f3);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeReflectiveCurveTo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dx1, ((RelativeReflectiveCurveTo)object0).dx1)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.dy1, ((RelativeReflectiveCurveTo)object0).dy1)) {
                return false;
            }
            return Intrinsics.areEqual(this.dx2, ((RelativeReflectiveCurveTo)object0).dx2) ? Intrinsics.areEqual(this.dy2, ((RelativeReflectiveCurveTo)object0).dy2) : false;
        }

        public final float getDx1() {
            return this.dx1;
        }

        public final float getDx2() {
            return this.dx2;
        }

        public final float getDy1() {
            return this.dy1;
        }

        public final float getDy2() {
            return this.dy2;
        }

        @Override
        public int hashCode() {
            return ((Float.floatToIntBits(this.dx1) * 0x1F + Float.floatToIntBits(this.dy1)) * 0x1F + Float.floatToIntBits(this.dx2)) * 0x1F + Float.floatToIntBits(this.dy2);
        }

        @Override
        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.dx1 + ", dy1=" + this.dy1 + ", dx2=" + this.dx2 + ", dy2=" + this.dy2 + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeReflectiveQuadTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dx", "", "dy", "(FF)V", "getDx", "()F", "getDy", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeReflectiveQuadTo extends PathNode {
        private final float dx;
        private final float dy;

        public RelativeReflectiveQuadTo(float f, float f1) {
            super(false, true, 1, null);
            this.dx = f;
            this.dy = f1;
        }

        public final float component1() {
            return this.dx;
        }

        public final float component2() {
            return this.dy;
        }

        public final RelativeReflectiveQuadTo copy(float f, float f1) {
            return new RelativeReflectiveQuadTo(f, f1);
        }

        public static RelativeReflectiveQuadTo copy$default(RelativeReflectiveQuadTo pathNode$RelativeReflectiveQuadTo0, float f, float f1, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeReflectiveQuadTo0.dx;
            }
            if((v & 2) != 0) {
                f1 = pathNode$RelativeReflectiveQuadTo0.dy;
            }
            return pathNode$RelativeReflectiveQuadTo0.copy(f, f1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof RelativeReflectiveQuadTo)) {
                return false;
            }
            return Intrinsics.areEqual(this.dx, ((RelativeReflectiveQuadTo)object0).dx) ? Intrinsics.areEqual(this.dy, ((RelativeReflectiveQuadTo)object0).dy) : false;
        }

        public final float getDx() {
            return this.dx;
        }

        public final float getDy() {
            return this.dy;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.dx) * 0x1F + Float.floatToIntBits(this.dy);
        }

        @Override
        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.dx + ", dy=" + this.dy + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$RelativeVerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "dy", "", "(F)V", "getDy", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RelativeVerticalTo extends PathNode {
        private final float dy;

        public RelativeVerticalTo(float f) {
            super(false, false, 3, null);
            this.dy = f;
        }

        public final float component1() {
            return this.dy;
        }

        public final RelativeVerticalTo copy(float f) {
            return new RelativeVerticalTo(f);
        }

        public static RelativeVerticalTo copy$default(RelativeVerticalTo pathNode$RelativeVerticalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$RelativeVerticalTo0.dy;
            }
            return pathNode$RelativeVerticalTo0.copy(f);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof RelativeVerticalTo ? Intrinsics.areEqual(this.dy, ((RelativeVerticalTo)object0).dy) : false;
        }

        public final float getDy() {
            return this.dy;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.dy);
        }

        @Override
        public String toString() {
            return "RelativeVerticalTo(dy=" + this.dy + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001A\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001A\u00020\n2\b\u0010\u000B\u001A\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001A\u00020\u000EHÖ\u0001J\t\u0010\u000F\u001A\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/vector/PathNode$VerticalTo;", "Landroidx/compose/ui/graphics/vector/PathNode;", "y", "", "(F)V", "getY", "()F", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class VerticalTo extends PathNode {
        private final float y;

        public VerticalTo(float f) {
            super(false, false, 3, null);
            this.y = f;
        }

        public final float component1() {
            return this.y;
        }

        public final VerticalTo copy(float f) {
            return new VerticalTo(f);
        }

        public static VerticalTo copy$default(VerticalTo pathNode$VerticalTo0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = pathNode$VerticalTo0.y;
            }
            return pathNode$VerticalTo0.copy(f);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof VerticalTo ? Intrinsics.areEqual(this.y, ((VerticalTo)object0).y) : false;
        }

        public final float getY() {
            return this.y;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.y);
        }

        @Override
        public String toString() {
            return "VerticalTo(y=" + this.y + ')';
        }
    }

    private final boolean isCurve;
    private final boolean isQuad;

    private PathNode(boolean z, boolean z1) {
        this.isCurve = z;
        this.isQuad = z1;
    }

    public PathNode(boolean z, boolean z1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = false;
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        this(z, z1, null);
    }

    public PathNode(boolean z, boolean z1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(z, z1);
    }

    public final boolean isCurve() {
        return this.isCurve;
    }

    public final boolean isQuad() {
        return this.isQuad;
    }
}

