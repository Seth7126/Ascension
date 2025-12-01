package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001BR\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\u0007\u0012\u0006\u0010\f\u001A\u00020\t\u0012\u0006\u0010\r\u001A\u00020\u000E\u0012\b\b\u0002\u0010\u000F\u001A\u00020\u0010\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0011Jm\u0010!\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\"\u001A\u00020\u00052\b\b\u0002\u0010#\u001A\u00020\u00072\b\b\u0002\u0010$\u001A\u00020\t2\b\b\u0002\u0010%\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\u00072\b\b\u0002\u0010\f\u001A\u00020\t2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u0010\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b&\u0010\'J\b\u0010(\u001A\u00020)H\u0016R\u0011\u0010\r\u001A\u00020\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013R\u001C\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0016\u001A\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0006\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0016\u001A\u0004\b\u0017\u0010\u0015R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u001C\u0010\u000B\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u0016\u001A\u0004\b\u001A\u0010\u0015R\u0011\u0010\f\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0019R\u0011\u0010\n\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u0015R\u001C\u0010\u000F\u001A\u00020\u0010\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010\u001F\u001A\u0004\b\u001D\u0010\u001ER\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010\u0015\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006*"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "id", "Landroidx/compose/ui/input/pointer/PointerId;", "uptimeMillis", "", "position", "Landroidx/compose/ui/geometry/Offset;", "pressed", "", "previousUptimeMillis", "previousPosition", "previousPressed", "consumed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getId-J3iCeTQ", "()J", "J", "getPosition-F1C5BW0", "getPressed", "()Z", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "getPreviousUptimeMillis", "getType-T8wyACA", "()I", "I", "getUptimeMillis", "copy", "currentTime", "currentPosition", "currentPressed", "previousTime", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInputChange {
    private final ConsumedData consumed;
    private final long id;
    private final long position;
    private final boolean pressed;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final int type;
    private final long uptimeMillis;

    private PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5) {
        this.id = v;
        this.uptimeMillis = v1;
        this.position = v2;
        this.pressed = z;
        this.previousUptimeMillis = v3;
        this.previousPosition = v4;
        this.previousPressed = z1;
        this.consumed = consumedData0;
        this.type = v5;
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, int v6, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, v3, v4, z1, consumedData0, ((v6 & 0x100) == 0 ? v5 : 1), null);
    }

    public PointerInputChange(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, z, v3, v4, z1, consumedData0, v5);
    }

    public final PointerInputChange copy-Ezr-O64(long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5) {
        Intrinsics.checkNotNullParameter(consumedData0, "consumed");
        return new PointerInputChange(v, v1, v2, z, v3, v4, z1, consumedData0, v5, null);
    }

    public static PointerInputChange copy-Ezr-O64$default(PointerInputChange pointerInputChange0, long v, long v1, long v2, boolean z, long v3, long v4, boolean z1, ConsumedData consumedData0, int v5, int v6, Object object0) {
        long v7 = (v6 & 1) == 0 ? v : pointerInputChange0.getId-J3iCeTQ();
        long v8 = (v6 & 2) == 0 ? v1 : pointerInputChange0.uptimeMillis;
        long v9 = (v6 & 4) == 0 ? v2 : pointerInputChange0.getPosition-F1C5BW0();
        boolean z2 = (v6 & 8) == 0 ? z : pointerInputChange0.pressed;
        long v10 = (v6 & 16) == 0 ? v3 : pointerInputChange0.previousUptimeMillis;
        long v11 = (v6 & 0x20) == 0 ? v4 : pointerInputChange0.getPreviousPosition-F1C5BW0();
        boolean z3 = (v6 & 0x40) == 0 ? z1 : pointerInputChange0.previousPressed;
        ConsumedData consumedData1 = (v6 & 0x80) == 0 ? consumedData0 : pointerInputChange0.consumed;
        return (v6 & 0x100) == 0 ? pointerInputChange0.copy-Ezr-O64(v7, v8, v9, z2, v10, v11, z3, consumedData1, v5) : pointerInputChange0.copy-Ezr-O64(v7, v8, v9, z2, v10, v11, z3, consumedData1, pointerInputChange0.getType-T8wyACA());
    }

    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    public final long getId-J3iCeTQ() {
        return this.id;
    }

    public final long getPosition-F1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final long getPreviousPosition-F1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    public final int getType-T8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @Override
    public String toString() {
        return "PointerInputChange(id=" + PointerId.toString-impl(this.getId-J3iCeTQ()) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + Offset.toString-impl(this.getPosition-F1C5BW0()) + ", pressed=" + this.pressed + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + Offset.toString-impl(this.getPreviousPosition-F1C5BW0()) + ", previousPressed=" + this.previousPressed + ", consumed=" + this.consumed + ", type=" + PointerType.toString-impl(this.getType-T8wyACA()) + ')';
    }
}

