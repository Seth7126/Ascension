package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001C\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B8\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\n\u0012\u0006\u0010\u000B\u001A\u00020\f\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\rJ\u0019\u0010\u0019\u001A\u00020\u0003H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001A\u0010\u0011J\t\u0010\u001B\u001A\u00020\u0005H\u00C6\u0003J\u0019\u0010\u001C\u001A\u00020\u0007H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001D\u0010\u0011J\u0019\u0010\u001E\u001A\u00020\u0007H\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u001F\u0010\u0011J\t\u0010 \u001A\u00020\nH\u00C6\u0003J\u0019\u0010!\u001A\u00020\fH\u00C6\u0003\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010\u0016JR\u0010#\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\fH\u00C6\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b$\u0010%J\u0013\u0010&\u001A\u00020\n2\b\u0010\'\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010(\u001A\u00020)H\u00D6\u0001J\t\u0010*\u001A\u00020+H\u00D6\u0001R\u0011\u0010\t\u001A\u00020\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0010\u0010\u0011R\u001C\u0010\b\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0013\u0010\u0011R\u001C\u0010\u0006\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0014\u0010\u0011R\u001C\u0010\u000B\u001A\u00020\f\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0017\u001A\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0011\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006,"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "position", "down", "", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "(JJJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDown", "()Z", "getId-J3iCeTQ", "()J", "J", "getPosition-F1C5BW0", "getPositionOnScreen-F1C5BW0", "getType-T8wyACA", "()I", "I", "getUptime", "component1", "component1-J3iCeTQ", "component2", "component3", "component3-F1C5BW0", "component4", "component4-F1C5BW0", "component5", "component6", "component6-T8wyACA", "copy", "copy-1boDhkU", "(JJJJZI)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "equals", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInputEventData {
    private final boolean down;
    private final long id;
    private final long position;
    private final long positionOnScreen;
    private final int type;
    private final long uptime;

    private PointerInputEventData(long v, long v1, long v2, long v3, boolean z, int v4) {
        this.id = v;
        this.uptime = v1;
        this.positionOnScreen = v2;
        this.position = v3;
        this.down = z;
        this.type = v4;
    }

    public PointerInputEventData(long v, long v1, long v2, long v3, boolean z, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, v3, z, v4);
    }

    public final long component1-J3iCeTQ() {
        return this.id;
    }

    public final long component2() {
        return this.uptime;
    }

    public final long component3-F1C5BW0() {
        return this.positionOnScreen;
    }

    public final long component4-F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final int component6-T8wyACA() {
        return this.type;
    }

    public final PointerInputEventData copy-1boDhkU(long v, long v1, long v2, long v3, boolean z, int v4) {
        return new PointerInputEventData(v, v1, v2, v3, z, v4, null);
    }

    public static PointerInputEventData copy-1boDhkU$default(PointerInputEventData pointerInputEventData0, long v, long v1, long v2, long v3, boolean z, int v4, int v5, Object object0) {
        long v6 = (v5 & 1) == 0 ? v : pointerInputEventData0.id;
        long v7 = (v5 & 2) == 0 ? v1 : pointerInputEventData0.uptime;
        long v8 = (v5 & 4) == 0 ? v2 : pointerInputEventData0.positionOnScreen;
        long v9 = (v5 & 8) == 0 ? v3 : pointerInputEventData0.position;
        boolean z1 = (v5 & 16) == 0 ? z : pointerInputEventData0.down;
        return (v5 & 0x20) == 0 ? pointerInputEventData0.copy-1boDhkU(v6, v7, v8, v9, z1, v4) : pointerInputEventData0.copy-1boDhkU(v6, v7, v8, v9, z1, pointerInputEventData0.type);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PointerInputEventData)) {
            return false;
        }
        if(!PointerId.equals-impl0(this.id, ((PointerInputEventData)object0).id)) {
            return false;
        }
        if(this.uptime != ((PointerInputEventData)object0).uptime) {
            return false;
        }
        if(!Offset.equals-impl0(this.positionOnScreen, ((PointerInputEventData)object0).positionOnScreen)) {
            return false;
        }
        if(!Offset.equals-impl0(this.position, ((PointerInputEventData)object0).position)) {
            return false;
        }
        return this.down == ((PointerInputEventData)object0).down ? PointerType.equals-impl0(this.type, ((PointerInputEventData)object0).type) : false;
    }

    public final boolean getDown() {
        return this.down;
    }

    public final long getId-J3iCeTQ() {
        return this.id;
    }

    public final long getPosition-F1C5BW0() {
        return this.position;
    }

    public final long getPositionOnScreen-F1C5BW0() {
        return this.positionOnScreen;
    }

    public final int getType-T8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    @Override
    public int hashCode() {
        int v = PointerId.hashCode-impl(this.id);
        int v1 = (int)(this.uptime ^ this.uptime >>> 0x20);
        int v2 = Offset.hashCode-impl(this.positionOnScreen);
        int v3 = Offset.hashCode-impl(this.position);
        int v4 = this.down;
        if(v4) {
            v4 = 1;
        }
        return ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + this.type;
    }

    @Override
    public String toString() {
        return "PointerInputEventData(id=" + PointerId.toString-impl(this.id) + ", uptime=" + this.uptime + ", positionOnScreen=" + Offset.toString-impl(this.positionOnScreen) + ", position=" + Offset.toString-impl(this.position) + ", down=" + this.down + ", type=" + PointerType.toString-impl(this.type) + ')';
    }
}

