package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001F\u0010\u000F\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u0014H\u0000¢\u0006\u0002\b\u0015J9\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0017\u001A\u00020\u00052\b\u0010\u0018\u001A\u0004\u0018\u00010\u00052\b\u0010\u0019\u001A\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010\u001AR+\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0081\u0004ø\u0001\u0000¢\u0006\u000E\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001A\u0004\b\b\u0010\tR\u000E\u0010\n\u001A\u00020\u000BX\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000E0\rX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "()V", "motionEventToComposePointerIdMap", "", "", "Landroidx/compose/ui/input/pointer/PointerId;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "getMotionEventToComposePointerIdMap$ui_release", "()Ljava/util/Map;", "nextId", "", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "convertToPointerInputEvent", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "motionEvent", "Landroid/view/MotionEvent;", "positionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "convertToPointerInputEvent$ui_release", "createPointerInputEventData", "index", "downIndex", "upIndex", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroid/view/MotionEvent;ILjava/lang/Integer;Ljava/lang/Integer;)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MotionEventAdapter {
    private final Map motionEventToComposePointerIdMap;
    private long nextId;
    private final List pointers;

    public MotionEventAdapter() {
        this.motionEventToComposePointerIdMap = new LinkedHashMap();
        this.pointers = new ArrayList();
    }

    public final PointerInputEvent convertToPointerInputEvent$ui_release(MotionEvent motionEvent0, PositionCalculator positionCalculator0) {
        Integer integer1;
        Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
        Intrinsics.checkNotNullParameter(positionCalculator0, "positionCalculator");
        Integer integer0 = null;
        if(motionEvent0.getActionMasked() == 3) {
            this.motionEventToComposePointerIdMap.clear();
            return null;
        }
        switch(motionEvent0.getActionMasked()) {
            case 0: {
                integer1 = 0;
                break;
            }
            case 5: {
                integer1 = motionEvent0.getActionIndex();
                break;
            }
            default: {
                integer1 = null;
            }
        }
        switch(motionEvent0.getActionMasked()) {
            case 1: {
                integer0 = 0;
                break;
            }
            case 6: {
                integer0 = motionEvent0.getActionIndex();
            }
        }
        this.pointers.clear();
        int v = motionEvent0.getPointerCount();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                PointerInputEventData pointerInputEventData0 = this.createPointerInputEventData(positionCalculator0, motionEvent0, v1, integer1, integer0);
                this.pointers.add(pointerInputEventData0);
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return new PointerInputEvent(motionEvent0.getEventTime(), this.pointers, motionEvent0);
    }

    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator0, MotionEvent motionEvent0, int v, Integer integer0, Integer integer1) {
        PointerId pointerId0;
        int v1 = motionEvent0.getPointerId(v);
        if(integer0 == null || v != ((int)integer0)) {
            pointerId0 = integer1 == null || v != ((int)integer1) ? ((PointerId)this.motionEventToComposePointerIdMap.get(v1)) : ((PointerId)this.motionEventToComposePointerIdMap.remove(v1));
        }
        else {
            long v2 = this.nextId;
            this.nextId = v2 + 1L;
            pointerId0 = PointerId.box-impl(v2);
            this.getMotionEventToComposePointerIdMap$ui_release().put(v1, PointerId.box-impl(pointerId0.unbox-impl()));
        }
        if(pointerId0 == null) {
            throw new IllegalStateException("Compose assumes that all pointer ids in MotionEvents are first provided alongside ACTION_DOWN or ACTION_POINTER_DOWN.  This appears not to have been the case");
        }
        return MotionEventAdapter_androidKt.createPointerInputEventData-VnAYq1g(positionCalculator0, pointerId0.unbox-impl(), motionEvent0.getEventTime(), motionEvent0, v, integer1);
    }

    public final Map getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }

    public static void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }
}

