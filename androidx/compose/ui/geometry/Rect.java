package androidx.compose.ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u001B\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0087\b\u0018\u0000 U2\u00020\u0001:\u0001UB%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0007J\t\u0010<\u001A\u00020\u0003H\u00C6\u0003J\t\u0010=\u001A\u00020\u0003H\u00C6\u0003J\t\u0010>\u001A\u00020\u0003H\u00C6\u0003J\t\u0010?\u001A\u00020\u0003H\u00C6\u0003J\u001B\u0010@\u001A\u00020\u001E2\u0006\u0010A\u001A\u00020\r\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bB\u0010CJ1\u0010D\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003H\u00C6\u0001J\u0010\u0010E\u001A\u00020\u00002\u0006\u0010F\u001A\u00020\u0003H\u0007J\u0013\u0010G\u001A\u00020\u001E2\b\u0010H\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010I\u001A\u00020JH\u00D6\u0001J\u0010\u0010K\u001A\u00020\u00002\u0006\u0010F\u001A\u00020\u0003H\u0007J\u0010\u0010L\u001A\u00020\u00002\u0006\u0010H\u001A\u00020\u0000H\u0007J\u000E\u0010M\u001A\u00020\u001E2\u0006\u0010H\u001A\u00020\u0000J\b\u0010N\u001A\u00020OH\u0016J\u001D\u0010P\u001A\u00020\u00002\u0006\u0010A\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bQ\u0010RJ\u0018\u0010P\u001A\u00020\u00002\u0006\u0010S\u001A\u00020\u00032\u0006\u0010T\u001A\u00020\u0003H\u0007R\u001C\u0010\u0006\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u000FR\u001A\u0010\u0012\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u000FR\u001A\u0010\u0014\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u000FR\u001A\u0010\u0016\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u000FR\u001A\u0010\u0018\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u000FR\u001A\u0010\u001A\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001B\u0010\t\u001A\u0004\b\u001C\u0010\u000BR\u001A\u0010\u001D\u001A\u00020\u001E8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\t\u001A\u0004\b\u001D\u0010 R\u001A\u0010!\u001A\u00020\u001E8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\"\u0010\t\u001A\u0004\b!\u0010 R\u001A\u0010#\u001A\u00020\u001E8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b$\u0010\t\u001A\u0004\b#\u0010 R\u001C\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b%\u0010\t\u001A\u0004\b&\u0010\u000BR\u0011\u0010\'\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b(\u0010\u000BR\u0011\u0010)\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b*\u0010\u000BR\u001C\u0010\u0005\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b+\u0010\t\u001A\u0004\b,\u0010\u000BR#\u0010-\u001A\u00020.8FX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u0012\u0004\b/\u0010\t\u001A\u0004\b0\u0010\u000FR\u001C\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b1\u0010\t\u001A\u0004\b2\u0010\u000BR\u001A\u00103\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b4\u0010\u000FR\u001A\u00105\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b6\u0010\u000FR\u001A\u00107\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b8\u0010\u000FR\u001A\u00109\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b:\u0010\t\u001A\u0004\b;\u0010\u000B\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006V"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom$annotations", "()V", "getBottom", "()F", "bottomCenter", "Landroidx/compose/ui/geometry/Offset;", "getBottomCenter-F1C5BW0", "()J", "bottomLeft", "getBottomLeft-F1C5BW0", "bottomRight", "getBottomRight-F1C5BW0", "center", "getCenter-F1C5BW0", "centerLeft", "getCenterLeft-F1C5BW0", "centerRight", "getCenterRight-F1C5BW0", "height", "getHeight$annotations", "getHeight", "isEmpty", "", "isEmpty$annotations", "()Z", "isFinite", "isFinite$annotations", "isInfinite", "isInfinite$annotations", "getLeft$annotations", "getLeft", "maxDimension", "getMaxDimension", "minDimension", "getMinDimension", "getRight$annotations", "getRight", "size", "Landroidx/compose/ui/geometry/Size;", "getSize-NH-jbRc$annotations", "getSize-NH-jbRc", "getTop$annotations", "getTop", "topCenter", "getTopCenter-F1C5BW0", "topLeft", "getTopLeft-F1C5BW0", "topRight", "getTopRight-F1C5BW0", "width", "getWidth$annotations", "getWidth", "component1", "component2", "component3", "component4", "contains", "offset", "contains-k-4lQ0M", "(J)Z", "copy", "deflate", "delta", "equals", "other", "hashCode", "", "inflate", "intersect", "overlaps", "toString", "", "translate", "translate-k-4lQ0M", "(J)Landroidx/compose/ui/geometry/Rect;", "translateX", "translateY", "Companion", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Rect {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/geometry/Rect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/geometry/Rect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Rect getZero() {
            return Rect.Zero;
        }

        public static void getZero$annotations() {
        }
    }

    public static final Companion Companion;
    private static final Rect Zero;
    private final float bottom;
    private final float left;
    private final float right;
    private final float top;

    static {
        Rect.Companion = new Companion(null);
        Rect.Zero = new Rect(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public Rect(float f, float f1, float f2, float f3) {
        this.left = f;
        this.top = f1;
        this.right = f2;
        this.bottom = f3;
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

    public final boolean contains-k-4lQ0M(long v) {
        return Offset.getX-impl(v) >= this.left && Offset.getX-impl(v) < this.right && Offset.getY-impl(v) >= this.top && Offset.getY-impl(v) < this.bottom;
    }

    public final Rect copy(float f, float f1, float f2, float f3) {
        return new Rect(f, f1, f2, f3);
    }

    public static Rect copy$default(Rect rect0, float f, float f1, float f2, float f3, int v, Object object0) {
        if((v & 1) != 0) {
            f = rect0.left;
        }
        if((v & 2) != 0) {
            f1 = rect0.top;
        }
        if((v & 4) != 0) {
            f2 = rect0.right;
        }
        if((v & 8) != 0) {
            f3 = rect0.bottom;
        }
        return rect0.copy(f, f1, f2, f3);
    }

    public final Rect deflate(float f) {
        return this.inflate(-f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof Rect)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.left, ((Rect)object0).left)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.top, ((Rect)object0).top)) {
            return false;
        }
        return Intrinsics.areEqual(this.right, ((Rect)object0).right) ? Intrinsics.areEqual(this.bottom, ((Rect)object0).bottom) : false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public static void getBottom$annotations() {
    }

    public final long getBottomCenter-F1C5BW0() {
        return OffsetKt.Offset(this.left + this.getWidth() / 2.0f, this.bottom);
    }

    public final long getBottomLeft-F1C5BW0() {
        return OffsetKt.Offset(this.left, this.bottom);
    }

    public final long getBottomRight-F1C5BW0() {
        return OffsetKt.Offset(this.right, this.bottom);
    }

    public final long getCenter-F1C5BW0() {
        return OffsetKt.Offset(this.left + this.getWidth() / 2.0f, this.top + this.getHeight() / 2.0f);
    }

    public final long getCenterLeft-F1C5BW0() {
        return OffsetKt.Offset(this.left, this.top + this.getHeight() / 2.0f);
    }

    public final long getCenterRight-F1C5BW0() {
        return OffsetKt.Offset(this.right, this.top + this.getHeight() / 2.0f);
    }

    public final float getHeight() {
        return this.bottom - this.top;
    }

    public static void getHeight$annotations() {
    }

    public final float getLeft() {
        return this.left;
    }

    public static void getLeft$annotations() {
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final float getRight() {
        return this.right;
    }

    public static void getRight$annotations() {
    }

    public final long getSize-NH-jbRc() {
        return SizeKt.Size(this.getWidth(), this.getHeight());
    }

    public static void getSize-NH-jbRc$annotations() {
    }

    public final float getTop() {
        return this.top;
    }

    public static void getTop$annotations() {
    }

    public final long getTopCenter-F1C5BW0() {
        return OffsetKt.Offset(this.left + this.getWidth() / 2.0f, this.top);
    }

    public final long getTopLeft-F1C5BW0() {
        return OffsetKt.Offset(this.left, this.top);
    }

    public final long getTopRight-F1C5BW0() {
        return OffsetKt.Offset(this.right, this.top);
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public static void getWidth$annotations() {
    }

    @Override
    public int hashCode() {
        return ((Float.floatToIntBits(this.left) * 0x1F + Float.floatToIntBits(this.top)) * 0x1F + Float.floatToIntBits(this.right)) * 0x1F + Float.floatToIntBits(this.bottom);
    }

    public final Rect inflate(float f) {
        return new Rect(this.left - f, this.top - f, this.right + f, this.bottom + f);
    }

    public final Rect intersect(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "other");
        return new Rect(Math.max(this.left, rect0.left), Math.max(this.top, rect0.top), Math.min(this.right, rect0.right), Math.min(this.bottom, rect0.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public static void isEmpty$annotations() {
    }

    // 去混淆评级： 中等(120)
    public final boolean isFinite() {
        return Float.isInfinite(this.left) || Float.isNaN(this.left) || (Float.isInfinite(this.top) || Float.isNaN(this.top)) || (Float.isInfinite(this.right) || Float.isNaN(this.right)) ? false : !Float.isInfinite(this.bottom) && !Float.isNaN(this.bottom);
    }

    public static void isFinite$annotations() {
    }

    public final boolean isInfinite() {
        return this.left >= Infinityf || this.top >= Infinityf || this.right >= Infinityf || this.bottom >= Infinityf;
    }

    public static void isInfinite$annotations() {
    }

    public final boolean overlaps(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "other");
        return this.right > rect0.left && rect0.right > this.left && this.bottom > rect0.top && rect0.bottom > this.top;
    }

    @Override
    public String toString() {
        return "Rect.fromLTRB(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    public final Rect translate(float f, float f1) {
        return new Rect(this.left + f, this.top + f1, this.right + f, this.bottom + f1);
    }

    public final Rect translate-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        float f2 = Offset.getX-impl(v);
        float f3 = Offset.getY-impl(v);
        return new Rect(this.left + f, this.top + f1, this.right + f2, this.bottom + f3);
    }
}

