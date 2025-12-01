package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0001>BP\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001A\u00020\b\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\n\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\fJ\t\u0010\u001D\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001E\u001A\u00020\u0003H\u00C6\u0003J\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\t\u0010 \u001A\u00020\u0003H\u00C6\u0003J\u0019\u0010!\u001A\u00020\bH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010\u0011J\u0019\u0010#\u001A\u00020\bH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010\u0011J\u0019\u0010%\u001A\u00020\bH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b&\u0010\u0011J\u0019\u0010\'\u001A\u00020\bH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b(\u0010\u0011J\u001B\u0010)\u001A\u00020*2\u0006\u0010+\u001A\u00020,\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b-\u0010.Jf\u0010/\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\bH\u00C6\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u00101J\u0013\u00102\u001A\u00020*2\b\u00103\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u00104\u001A\u000205H\u00D6\u0001J(\u00106\u001A\u00020\u00032\u0006\u00107\u001A\u00020\u00032\u0006\u00108\u001A\u00020\u00032\u0006\u00109\u001A\u00020\u00032\u0006\u0010:\u001A\u00020\u0003H\u0002J\b\u0010;\u001A\u00020\u0000H\u0002J\b\u0010<\u001A\u00020=H\u0016R\u0010\u0010\r\u001A\u0004\u0018\u00010\u0000X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\u000B\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0010\u0010\u0011R\u001C\u0010\n\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u000FR\u0011\u0010\u0005\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u000FR\u0011\u0010\u0004\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u000FR\u001C\u0010\u0007\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0019\u0010\u0011R\u001C\u0010\t\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u001A\u0010\u0011R\u0011\u0010\u001B\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u000F\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006?"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect;", "", "left", "", "top", "right", "bottom", "topLeftCornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "topRightCornerRadius", "bottomRightCornerRadius", "bottomLeftCornerRadius", "(FFFFJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "_scaledRadiiRect", "getBottom", "()F", "getBottomLeftCornerRadius-kKHJgLs", "()J", "J", "getBottomRightCornerRadius-kKHJgLs", "height", "getHeight", "getLeft", "getRight", "getTop", "getTopLeftCornerRadius-kKHJgLs", "getTopRightCornerRadius-kKHJgLs", "width", "getWidth", "component1", "component2", "component3", "component4", "component5", "component5-kKHJgLs", "component6", "component6-kKHJgLs", "component7", "component7-kKHJgLs", "component8", "component8-kKHJgLs", "contains", "", "point", "Landroidx/compose/ui/geometry/Offset;", "contains-k-4lQ0M", "(J)Z", "copy", "copy-MDFrsts", "(FFFFJJJJ)Landroidx/compose/ui/geometry/RoundRect;", "equals", "other", "hashCode", "", "minRadius", "min", "radius1", "radius2", "limit", "scaledRadiiRect", "toString", "", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RoundRect {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/RoundRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/RoundRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/RoundRect;", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        @JvmStatic
        public static void getZero$annotations() {
        }
    }

    public static final Companion Companion;
    private static final RoundRect Zero;
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;
    private final float top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    static {
        RoundRect.Companion = new Companion(null);
        RoundRect.Zero = RoundRectKt.RoundRect-gG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    private RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3) {
        this.left = f;
        this.top = f1;
        this.right = f2;
        this.bottom = f3;
        this.topLeftCornerRadius = v;
        this.topRightCornerRadius = v1;
        this.bottomRightCornerRadius = v2;
        this.bottomLeftCornerRadius = v3;
    }

    // 去混淆评级： 低(40)
    public RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(f, f1, f2, f3, ((v4 & 16) == 0 ? v : 0L), ((v4 & 0x20) == 0 ? v1 : 0L), ((v4 & 0x40) == 0 ? v2 : 0L), ((v4 & 0x80) == 0 ? v3 : 0L), null);
    }

    public RoundRect(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(f, f1, f2, f3, v, v1, v2, v3);
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    public final long component5-kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    public final long component6-kKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final long component7-kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final long component8-kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    public final boolean contains-k-4lQ0M(long v) {
        float f3;
        float f2;
        float f1;
        float f;
        if(Offset.getX-impl(v) >= this.left && Offset.getX-impl(v) < this.right && Offset.getY-impl(v) >= this.top && Offset.getY-impl(v) < this.bottom) {
            RoundRect roundRect0 = this.scaledRadiiRect();
            if(Offset.getX-impl(v) < this.left + CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs()) && Offset.getY-impl(v) < this.top + CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs())) {
                f = Offset.getX-impl(v) - this.left - CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
                f1 = Offset.getY-impl(v) - this.top - CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
                f2 = CornerRadius.getX-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
                f3 = CornerRadius.getY-impl(roundRect0.getTopLeftCornerRadius-kKHJgLs());
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            if(Offset.getX-impl(v) > this.right - CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs()) && Offset.getY-impl(v) < this.top + CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs())) {
                f = Offset.getX-impl(v) - this.right + CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
                f1 = Offset.getY-impl(v) - this.top - CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
                f2 = CornerRadius.getX-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
                f3 = CornerRadius.getY-impl(roundRect0.getTopRightCornerRadius-kKHJgLs());
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            if(Offset.getX-impl(v) > this.right - CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs()) && Offset.getY-impl(v) > this.bottom - CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs())) {
                f = Offset.getX-impl(v) - this.right + CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
                f1 = Offset.getY-impl(v) - this.bottom + CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
                f2 = CornerRadius.getX-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
                f3 = CornerRadius.getY-impl(roundRect0.getBottomRightCornerRadius-kKHJgLs());
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            if(Offset.getX-impl(v) < this.left + CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs()) && Offset.getY-impl(v) > this.bottom - CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs())) {
                f = Offset.getX-impl(v) - this.left - CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
                f1 = Offset.getY-impl(v) - this.bottom + CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
                f2 = CornerRadius.getX-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
                f3 = CornerRadius.getY-impl(roundRect0.getBottomLeftCornerRadius-kKHJgLs());
                return f / f2 * (f / f2) + f1 / f3 * (f1 / f3) <= 1.0f;
            }
            return true;
        }
        return false;
    }

    public final RoundRect copy-MDFrsts(float f, float f1, float f2, float f3, long v, long v1, long v2, long v3) {
        return new RoundRect(f, f1, f2, f3, v, v1, v2, v3, null);
    }

    public static RoundRect copy-MDFrsts$default(RoundRect roundRect0, float f, float f1, float f2, float f3, long v, long v1, long v2, long v3, int v4, Object object0) {
        float f4 = (v4 & 1) == 0 ? f : roundRect0.left;
        float f5 = (v4 & 2) == 0 ? f1 : roundRect0.top;
        float f6 = (v4 & 4) == 0 ? f2 : roundRect0.right;
        float f7 = (v4 & 8) == 0 ? f3 : roundRect0.bottom;
        long v5 = (v4 & 16) == 0 ? v : roundRect0.topLeftCornerRadius;
        long v6 = (v4 & 0x20) == 0 ? v1 : roundRect0.topRightCornerRadius;
        long v7 = (v4 & 0x40) == 0 ? v2 : roundRect0.bottomRightCornerRadius;
        return (v4 & 0x80) == 0 ? roundRect0.copy-MDFrsts(f4, f5, f6, f7, v5, v6, v7, v3) : roundRect0.copy-MDFrsts(f4, f5, f6, f7, v5, v6, v7, roundRect0.bottomLeftCornerRadius);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RoundRect)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.left, ((RoundRect)object0).left)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.top, ((RoundRect)object0).top)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.right, ((RoundRect)object0).right)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.bottom, ((RoundRect)object0).bottom)) {
            return false;
        }
        if(!CornerRadius.equals-impl0(this.topLeftCornerRadius, ((RoundRect)object0).topLeftCornerRadius)) {
            return false;
        }
        if(!CornerRadius.equals-impl0(this.topRightCornerRadius, ((RoundRect)object0).topRightCornerRadius)) {
            return false;
        }
        return CornerRadius.equals-impl0(this.bottomRightCornerRadius, ((RoundRect)object0).bottomRightCornerRadius) ? CornerRadius.equals-impl0(this.bottomLeftCornerRadius, ((RoundRect)object0).bottomLeftCornerRadius) : false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final long getBottomLeftCornerRadius-kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    public final long getBottomRightCornerRadius-kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.top;
    }

    public final long getTopLeftCornerRadius-kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    public final long getTopRightCornerRadius-kKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public static final RoundRect getZero() {
        return RoundRect.Companion.getZero();
    }

    @Override
    public int hashCode() {
        return ((((((Float.floatToIntBits(this.left) * 0x1F + Float.floatToIntBits(this.top)) * 0x1F + Float.floatToIntBits(this.right)) * 0x1F + Float.floatToIntBits(this.bottom)) * 0x1F + CornerRadius.hashCode-impl(this.topLeftCornerRadius)) * 0x1F + CornerRadius.hashCode-impl(this.topRightCornerRadius)) * 0x1F + CornerRadius.hashCode-impl(this.bottomRightCornerRadius)) * 0x1F + CornerRadius.hashCode-impl(this.bottomLeftCornerRadius);
    }

    private final float minRadius(float f, float f1, float f2, float f3) {
        float f4 = f1 + f2;
        if(f4 > f3) {
            return f4 == 0.0f ? f : Math.min(f, f3 / f4);
        }
        return f;
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect0 = this._scaledRadiiRect;
        if(roundRect0 == null) {
            float f = this.minRadius(this.minRadius(this.minRadius(this.minRadius(1.0f, CornerRadius.getY-impl(this.getBottomLeftCornerRadius-kKHJgLs()), CornerRadius.getY-impl(this.getTopLeftCornerRadius-kKHJgLs()), this.getHeight()), CornerRadius.getX-impl(this.getTopLeftCornerRadius-kKHJgLs()), CornerRadius.getX-impl(this.getTopRightCornerRadius-kKHJgLs()), this.getWidth()), CornerRadius.getY-impl(this.getTopRightCornerRadius-kKHJgLs()), CornerRadius.getY-impl(this.getBottomRightCornerRadius-kKHJgLs()), this.getHeight()), CornerRadius.getX-impl(this.getBottomRightCornerRadius-kKHJgLs()), CornerRadius.getX-impl(this.getBottomLeftCornerRadius-kKHJgLs()), this.getWidth());
            roundRect0 = new RoundRect(this.getLeft() * f, this.getTop() * f, this.getRight() * f, this.getBottom() * f, CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.getTopLeftCornerRadius-kKHJgLs()) * f, CornerRadius.getY-impl(this.getTopLeftCornerRadius-kKHJgLs()) * f), CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.getTopRightCornerRadius-kKHJgLs()) * f, CornerRadius.getY-impl(this.getTopRightCornerRadius-kKHJgLs()) * f), CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.getBottomRightCornerRadius-kKHJgLs()) * f, CornerRadius.getY-impl(this.getBottomRightCornerRadius-kKHJgLs()) * f), CornerRadiusKt.CornerRadius(CornerRadius.getX-impl(this.getBottomLeftCornerRadius-kKHJgLs()) * f, CornerRadius.getY-impl(this.getBottomLeftCornerRadius-kKHJgLs()) * f), null);
            this._scaledRadiiRect = roundRect0;
        }
        return roundRect0;
    }

    @Override
    public String toString() {
        long v = this.getTopLeftCornerRadius-kKHJgLs();
        long v1 = this.getTopRightCornerRadius-kKHJgLs();
        long v2 = this.getBottomRightCornerRadius-kKHJgLs();
        long v3 = this.getBottomLeftCornerRadius-kKHJgLs();
        String s = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if(CornerRadius.equals-impl0(v, v1) && CornerRadius.equals-impl0(v1, v2) && CornerRadius.equals-impl0(v2, v3)) {
            return CornerRadius.getX-impl(v) == CornerRadius.getY-impl(v) ? "RoundRect(rect=" + s + ", radius=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1) + ')' : "RoundRect(rect=" + s + ", x=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getX-impl(v), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(CornerRadius.getY-impl(v), 1) + ')';
        }
        return "RoundRect(rect=" + s + ", topLeft=" + CornerRadius.toString-impl(v) + ", topRight=" + CornerRadius.toString-impl(v1) + ", bottomRight=" + CornerRadius.toString-impl(v2) + ", bottomLeft=" + CornerRadius.toString-impl(v3) + ')';
    }
}

