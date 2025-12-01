package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0018\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0019\u0010\u000B\u001A\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\f\u0010\bJ\t\u0010\r\u001A\u00020\u0005HÆ\u0003J*\u0010\u000E\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001A\u00020\u0017HÖ\u0001R\u001C\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\b\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointAtTime;", "", "point", "Landroidx/compose/ui/geometry/Offset;", "time", "", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getPoint-F1C5BW0", "()J", "J", "getTime", "component1", "component1-F1C5BW0", "component2", "copy", "copy-3MmeM6k", "(JJ)Landroidx/compose/ui/input/pointer/util/PointAtTime;", "equals", "", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class PointAtTime {
    private final long point;
    private final long time;

    private PointAtTime(long v, long v1) {
        this.point = v;
        this.time = v1;
    }

    public PointAtTime(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1);
    }

    public final long component1-F1C5BW0() {
        return this.point;
    }

    public final long component2() {
        return this.time;
    }

    public final PointAtTime copy-3MmeM6k(long v, long v1) {
        return new PointAtTime(v, v1, null);
    }

    public static PointAtTime copy-3MmeM6k$default(PointAtTime pointAtTime0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = pointAtTime0.point;
        }
        if((v2 & 2) != 0) {
            v1 = pointAtTime0.time;
        }
        return pointAtTime0.copy-3MmeM6k(v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PointAtTime)) {
            return false;
        }
        return Offset.equals-impl0(this.point, ((PointAtTime)object0).point) ? this.time == ((PointAtTime)object0).time : false;
    }

    public final long getPoint-F1C5BW0() {
        return this.point;
    }

    public final long getTime() {
        return this.time;
    }

    @Override
    public int hashCode() {
        return Offset.hashCode-impl(this.point) * 0x1F + ((int)(this.time ^ this.time >>> 0x20));
    }

    @Override
    public String toString() {
        return "PointAtTime(point=" + Offset.toString-impl(this.point) + ", time=" + this.time + ')';
    }
}

