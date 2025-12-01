package androidx.compose.ui.input.pointer;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000FB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001A\u00020\bJ\u0016\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000ER\u001D\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "()V", "previousPointerInputData", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "clear", "", "produce", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "PointerInputData", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class PointerInputChangeEventProducer {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u001C\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\f\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "down", "", "(JJZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDown", "()Z", "getPositionOnScreen-F1C5BW0", "()J", "J", "getUptime", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final long uptime;

        private PointerInputData(long v, long v1, boolean z) {
            this.uptime = v;
            this.positionOnScreen = v1;
            this.down = z;
        }

        public PointerInputData(long v, long v1, boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
            this(v, v1, z);
        }

        public final boolean getDown() {
            return this.down;
        }

        public final long getPositionOnScreen-F1C5BW0() {
            return this.positionOnScreen;
        }

        public final long getUptime() {
            return this.uptime;
        }
    }

    private final Map previousPointerInputData;

    public PointerInputChangeEventProducer() {
        this.previousPointerInputData = new LinkedHashMap();
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent0, PositionCalculator positionCalculator0) {
        boolean z;
        long v3;
        long v2;
        Intrinsics.checkNotNullParameter(pointerInputEvent0, "pointerInputEvent");
        Intrinsics.checkNotNullParameter(positionCalculator0, "positionCalculator");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(pointerInputEvent0.getPointers().size());
        List list0 = pointerInputEvent0.getPointers();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                PointerInputEventData pointerInputEventData0 = (PointerInputEventData)list0.get(v1);
                PointerId pointerId0 = PointerId.box-impl(pointerInputEventData0.getId-J3iCeTQ());
                PointerInputData pointerInputChangeEventProducer$PointerInputData0 = (PointerInputData)this.previousPointerInputData.get(pointerId0);
                if(pointerInputChangeEventProducer$PointerInputData0 == null) {
                    v2 = pointerInputEventData0.getUptime();
                    v3 = pointerInputEventData0.getPosition-F1C5BW0();
                    z = false;
                }
                else {
                    v2 = pointerInputChangeEventProducer$PointerInputData0.getUptime();
                    z = pointerInputChangeEventProducer$PointerInputData0.getDown();
                    v3 = positionCalculator0.screenToLocal-MK-Hz9U(pointerInputChangeEventProducer$PointerInputData0.getPositionOnScreen-F1C5BW0());
                }
                linkedHashMap0.put(PointerId.box-impl(pointerInputEventData0.getId-J3iCeTQ()), new PointerInputChange(pointerInputEventData0.getId-J3iCeTQ(), pointerInputEventData0.getUptime(), pointerInputEventData0.getPosition-F1C5BW0(), pointerInputEventData0.getDown(), v2, v3, z, new ConsumedData(false, false, 3, null), pointerInputEventData0.getType-T8wyACA(), null));
                if(pointerInputEventData0.getDown()) {
                    PointerId pointerId1 = PointerId.box-impl(pointerInputEventData0.getId-J3iCeTQ());
                    PointerInputData pointerInputChangeEventProducer$PointerInputData1 = new PointerInputData(pointerInputEventData0.getUptime(), pointerInputEventData0.getPositionOnScreen-F1C5BW0(), pointerInputEventData0.getDown(), null);
                    this.previousPointerInputData.put(pointerId1, pointerInputChangeEventProducer$PointerInputData1);
                }
                else {
                    PointerId pointerId2 = PointerId.box-impl(pointerInputEventData0.getId-J3iCeTQ());
                    this.previousPointerInputData.remove(pointerId2);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return new InternalPointerEvent(linkedHashMap0, pointerInputEvent0);
    }
}

