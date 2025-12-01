package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\b\u0010\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0015\b\u0016\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bB\u001F\b\u0000\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\t\u001A\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000BJ\u000F\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0011\u001A\u0004\u0018\u00010\nHÀ\u0003¢\u0006\u0002\b\u0012J%\u0010\u0013\u001A\u00020\u00002\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001A\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001R\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0016\u0010\t\u001A\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "(Ljava/util/List;)V", "motionEvent", "Landroid/view/MotionEvent;", "(Ljava/util/List;Landroid/view/MotionEvent;)V", "getChanges", "()Ljava/util/List;", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "component1", "component2", "component2$ui_release", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PointerEvent {
    public static final int $stable = 8;
    private final List changes;
    private final MotionEvent motionEvent;

    static {
    }

    public PointerEvent(List list0) {
        Intrinsics.checkNotNullParameter(list0, "changes");
        this(list0, null);
    }

    public PointerEvent(List list0, MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(list0, "changes");
        super();
        this.changes = list0;
        this.motionEvent = motionEvent0;
    }

    public PointerEvent(List list0, InternalPointerEvent internalPointerEvent0) {
        Intrinsics.checkNotNullParameter(list0, "changes");
        this(list0, (internalPointerEvent0 == null ? null : internalPointerEvent0.getMotionEvent()));
    }

    public final List component1() {
        return this.changes;
    }

    public final MotionEvent component2$ui_release() {
        return this.motionEvent;
    }

    public final PointerEvent copy(List list0, MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(list0, "changes");
        return new PointerEvent(list0, motionEvent0);
    }

    public static PointerEvent copy$default(PointerEvent pointerEvent0, List list0, MotionEvent motionEvent0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = pointerEvent0.changes;
        }
        if((v & 2) != 0) {
            motionEvent0 = pointerEvent0.motionEvent;
        }
        return pointerEvent0.copy(list0, motionEvent0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PointerEvent)) {
            return false;
        }
        return Intrinsics.areEqual(this.changes, ((PointerEvent)object0).changes) ? Intrinsics.areEqual(this.motionEvent, ((PointerEvent)object0).motionEvent) : false;
    }

    public final List getChanges() {
        return this.changes;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        return this.motionEvent;
    }

    @Override
    public int hashCode() {
        int v = this.changes.hashCode();
        return this.motionEvent == null ? v * 0x1F : v * 0x1F + this.motionEvent.hashCode();
    }

    @Override
    public String toString() {
        return "PointerEvent(changes=" + this.changes + ", motionEvent=" + this.motionEvent + ')';
    }
}

