package androidx.compose.ui.input.pointer;

import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0016\u001A\u00020\u0017R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitResult", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "process", "Landroidx/compose/ui/input/pointer/ProcessResult;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "process-gBdvCQM", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)I", "processCancel", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInputEventProcessor {
    private final HitPathTracker hitPathTracker;
    private final List hitResult;
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer;
    private final LayoutNode root;

    public PointerInputEventProcessor(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "root");
        super();
        this.root = layoutNode0;
        this.hitPathTracker = new HitPathTracker(layoutNode0.getCoordinates());
        this.pointerInputChangeEventProducer = new PointerInputChangeEventProducer();
        this.hitResult = new ArrayList();
    }

    public final LayoutNode getRoot() {
        return this.root;
    }

    public final int process-gBdvCQM(PointerInputEvent pointerInputEvent0, PositionCalculator positionCalculator0) {
        Intrinsics.checkNotNullParameter(pointerInputEvent0, "pointerEvent");
        Intrinsics.checkNotNullParameter(positionCalculator0, "positionCalculator");
        InternalPointerEvent internalPointerEvent0 = this.pointerInputChangeEventProducer.produce(pointerInputEvent0, positionCalculator0);
        for(Object object0: internalPointerEvent0.getChanges().values()) {
            PointerInputChange pointerInputChange0 = (PointerInputChange)object0;
            if(PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange0)) {
                this.getRoot().hitTest-3MmeM6k$ui_release(pointerInputChange0.getPosition-F1C5BW0(), this.hitResult);
                if((true ^ this.hitResult.isEmpty()) != 0) {
                    this.hitPathTracker.addHitPath-KNwqfcY(pointerInputChange0.getId-J3iCeTQ(), this.hitResult);
                    this.hitResult.clear();
                }
            }
        }
        this.hitPathTracker.removeDetachedPointerInputFilters();
        boolean z = this.hitPathTracker.dispatchChanges(internalPointerEvent0);
        boolean z1 = false;
        for(Object object1: internalPointerEvent0.getChanges().values()) {
            PointerInputChange pointerInputChange1 = (PointerInputChange)object1;
            if(PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange1)) {
                this.hitPathTracker.removeHitPath-0FcD4WY(pointerInputChange1.getId-J3iCeTQ());
            }
            if(PointerEventKt.positionChangeConsumed(pointerInputChange1)) {
                z1 = true;
            }
        }
        return PointerInputEventProcessorKt.ProcessResult(z, z1);
    }

    public final void processCancel() {
        this.pointerInputChangeEventProducer.clear();
        this.hitPathTracker.processCancel();
    }
}

