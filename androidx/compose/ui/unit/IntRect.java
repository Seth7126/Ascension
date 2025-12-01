package androidx.compose.ui.unit;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u001F\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0001PB%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0007J\t\u00108\u001A\u00020\u0003H\u00C6\u0003J\t\u00109\u001A\u00020\u0003H\u00C6\u0003J\t\u0010:\u001A\u00020\u0003H\u00C6\u0003J\t\u0010;\u001A\u00020\u0003H\u00C6\u0003J\u001B\u0010<\u001A\u00020\u001E2\u0006\u0010=\u001A\u00020\r\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b>\u0010?J1\u0010@\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0003H\u00C6\u0001J\u0010\u0010A\u001A\u00020\u00002\u0006\u0010B\u001A\u00020\u0003H\u0007J\u0013\u0010C\u001A\u00020\u001E2\b\u0010D\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010E\u001A\u00020\u0003H\u00D6\u0001J\u0010\u0010F\u001A\u00020\u00002\u0006\u0010B\u001A\u00020\u0003H\u0007J\u0010\u0010G\u001A\u00020\u00002\u0006\u0010D\u001A\u00020\u0000H\u0007J\u000E\u0010H\u001A\u00020\u001E2\u0006\u0010D\u001A\u00020\u0000J\b\u0010I\u001A\u00020JH\u0016J\u001D\u0010K\u001A\u00020\u00002\u0006\u0010=\u001A\u00020\rH\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bL\u0010MJ\u0018\u0010K\u001A\u00020\u00002\u0006\u0010N\u001A\u00020\u00032\u0006\u0010O\u001A\u00020\u0003H\u0007R\u001C\u0010\u0006\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0011\u0010\u000FR\u001A\u0010\u0012\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u000FR\u001A\u0010\u0014\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u000FR\u001A\u0010\u0016\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u000FR\u001A\u0010\u0018\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u000FR\u001A\u0010\u001A\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001B\u0010\t\u001A\u0004\b\u001C\u0010\u000BR\u001A\u0010\u001D\u001A\u00020\u001E8FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\t\u001A\u0004\b\u001D\u0010 R\u001C\u0010\u0002\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b!\u0010\t\u001A\u0004\b\"\u0010\u000BR\u0011\u0010#\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b$\u0010\u000BR\u0011\u0010%\u001A\u00020\u00038F\u00A2\u0006\u0006\u001A\u0004\b&\u0010\u000BR\u001C\u0010\u0005\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\'\u0010\t\u001A\u0004\b(\u0010\u000BR#\u0010)\u001A\u00020*8FX\u0087\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u0012\u0004\b+\u0010\t\u001A\u0004\b,\u0010\u000FR\u001C\u0010\u0004\u001A\u00020\u00038\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b-\u0010\t\u001A\u0004\b.\u0010\u000BR\u001A\u0010/\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b0\u0010\u000FR\u001A\u00101\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b2\u0010\u000FR\u001A\u00103\u001A\u00020\r8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b4\u0010\u000FR\u001A\u00105\u001A\u00020\u00038FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b6\u0010\t\u001A\u0004\b7\u0010\u000B\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006Q"}, d2 = {"Landroidx/compose/ui/unit/IntRect;", "", "left", "", "top", "right", "bottom", "(IIII)V", "getBottom$annotations", "()V", "getBottom", "()I", "bottomCenter", "Landroidx/compose/ui/unit/IntOffset;", "getBottomCenter-nOcc-ac", "()J", "bottomLeft", "getBottomLeft-nOcc-ac", "bottomRight", "getBottomRight-nOcc-ac", "center", "getCenter-nOcc-ac", "centerLeft", "getCenterLeft-nOcc-ac", "centerRight", "getCenterRight-nOcc-ac", "height", "getHeight$annotations", "getHeight", "isEmpty", "", "isEmpty$annotations", "()Z", "getLeft$annotations", "getLeft", "maxDimension", "getMaxDimension", "minDimension", "getMinDimension", "getRight$annotations", "getRight", "size", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g$annotations", "getSize-YbymL2g", "getTop$annotations", "getTop", "topCenter", "getTopCenter-nOcc-ac", "topLeft", "getTopLeft-nOcc-ac", "topRight", "getTopRight-nOcc-ac", "width", "getWidth$annotations", "getWidth", "component1", "component2", "component3", "component4", "contains", "offset", "contains--gyyYBs", "(J)Z", "copy", "deflate", "delta", "equals", "other", "hashCode", "inflate", "intersect", "overlaps", "toString", "", "translate", "translate--gyyYBs", "(J)Landroidx/compose/ui/unit/IntRect;", "translateX", "translateY", "Companion", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IntRect {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/unit/IntRect$Companion;", "", "()V", "Zero", "Landroidx/compose/ui/unit/IntRect;", "getZero$annotations", "getZero", "()Landroidx/compose/ui/unit/IntRect;", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final IntRect getZero() {
            return IntRect.Zero;
        }

        public static void getZero$annotations() {
        }
    }

    public static final Companion Companion;
    private static final IntRect Zero;
    private final int bottom;
    private final int left;
    private final int right;
    private final int top;

    static {
        IntRect.Companion = new Companion(null);
        IntRect.Zero = new IntRect(0, 0, 0, 0);
    }

    public IntRect(int v, int v1, int v2, int v3) {
        this.left = v;
        this.top = v1;
        this.right = v2;
        this.bottom = v3;
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.right;
    }

    public final int component4() {
        return this.bottom;
    }

    public final boolean contains--gyyYBs(long v) {
        return ((int)(v >> 0x20)) >= this.left && ((int)(v >> 0x20)) < this.right && ((int)(v & 0xFFFFFFFFL)) >= this.top && ((int)(v & 0xFFFFFFFFL)) < this.bottom;
    }

    public final IntRect copy(int v, int v1, int v2, int v3) {
        return new IntRect(v, v1, v2, v3);
    }

    public static IntRect copy$default(IntRect intRect0, int v, int v1, int v2, int v3, int v4, Object object0) {
        if((v4 & 1) != 0) {
            v = intRect0.left;
        }
        if((v4 & 2) != 0) {
            v1 = intRect0.top;
        }
        if((v4 & 4) != 0) {
            v2 = intRect0.right;
        }
        if((v4 & 8) != 0) {
            v3 = intRect0.bottom;
        }
        return intRect0.copy(v, v1, v2, v3);
    }

    public final IntRect deflate(int v) {
        return this.inflate(-v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof IntRect)) {
            return false;
        }
        if(this.left != ((IntRect)object0).left) {
            return false;
        }
        if(this.top != ((IntRect)object0).top) {
            return false;
        }
        return this.right == ((IntRect)object0).right ? this.bottom == ((IntRect)object0).bottom : false;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public static void getBottom$annotations() {
    }

    public final long getBottomCenter-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.left + this.getWidth() / 2, this.bottom);
    }

    public final long getBottomLeft-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.left, this.bottom);
    }

    public final long getBottomRight-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.right, this.bottom);
    }

    public final long getCenter-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.left + this.getWidth() / 2, this.top + this.getHeight() / 2);
    }

    public final long getCenterLeft-nOcc-ac() {
        int v = this.getHeight();
        return IntOffsetKt.IntOffset(this.left, this.top + v / 2);
    }

    public final long getCenterRight-nOcc-ac() {
        int v = this.getHeight();
        return IntOffsetKt.IntOffset(this.right, this.top + v / 2);
    }

    public final int getHeight() {
        return this.bottom - this.top;
    }

    public static void getHeight$annotations() {
    }

    public final int getLeft() {
        return this.left;
    }

    public static void getLeft$annotations() {
    }

    public final int getMaxDimension() {
        return Math.max(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final int getMinDimension() {
        return Math.min(Math.abs(this.getWidth()), Math.abs(this.getHeight()));
    }

    public final int getRight() {
        return this.right;
    }

    public static void getRight$annotations() {
    }

    public final long getSize-YbymL2g() {
        return IntSizeKt.IntSize(this.getWidth(), this.getHeight());
    }

    public static void getSize-YbymL2g$annotations() {
    }

    public final int getTop() {
        return this.top;
    }

    public static void getTop$annotations() {
    }

    public final long getTopCenter-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.left + this.getWidth() / 2, this.top);
    }

    public final long getTopLeft-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.left, this.top);
    }

    public final long getTopRight-nOcc-ac() {
        return IntOffsetKt.IntOffset(this.right, this.top);
    }

    public final int getWidth() {
        return this.right - this.left;
    }

    public static void getWidth$annotations() {
    }

    @Override
    public int hashCode() {
        return ((this.left * 0x1F + this.top) * 0x1F + this.right) * 0x1F + this.bottom;
    }

    public final IntRect inflate(int v) {
        return new IntRect(this.left - v, this.top - v, this.right + v, this.bottom + v);
    }

    public final IntRect intersect(IntRect intRect0) {
        Intrinsics.checkNotNullParameter(intRect0, "other");
        return new IntRect(Math.max(this.left, intRect0.left), Math.max(this.top, intRect0.top), Math.min(this.right, intRect0.right), Math.min(this.bottom, intRect0.bottom));
    }

    public final boolean isEmpty() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public static void isEmpty$annotations() {
    }

    public final boolean overlaps(IntRect intRect0) {
        Intrinsics.checkNotNullParameter(intRect0, "other");
        return this.right > intRect0.left && intRect0.right > this.left && this.bottom > intRect0.top && intRect0.bottom > this.top;
    }

    @Override
    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + ')';
    }

    public final IntRect translate(int v, int v1) {
        return new IntRect(this.left + v, this.top + v1, this.right + v, this.bottom + v1);
    }

    public final IntRect translate--gyyYBs(long v) {
        return new IntRect(this.left + ((int)(v >> 0x20)), this.top + ((int)(v & 0xFFFFFFFFL)), this.right + ((int)(v >> 0x20)), this.bottom + ((int)(v & 0xFFFFFFFFL)));
    }
}

