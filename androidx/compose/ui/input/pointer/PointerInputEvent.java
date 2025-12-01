package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEvent;", "", "uptime", "", "pointers", "", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "motionEvent", "Landroid/view/MotionEvent;", "(JLjava/util/List;Landroid/view/MotionEvent;)V", "getMotionEvent", "()Landroid/view/MotionEvent;", "getPointers", "()Ljava/util/List;", "getUptime", "()J", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PointerInputEvent {
    private final MotionEvent motionEvent;
    private final List pointers;
    private final long uptime;

    public PointerInputEvent(long v, List list0, MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(list0, "pointers");
        Intrinsics.checkNotNullParameter(motionEvent0, "motionEvent");
        super();
        this.uptime = v;
        this.pointers = list0;
        this.motionEvent = motionEvent0;
    }

    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }
}

