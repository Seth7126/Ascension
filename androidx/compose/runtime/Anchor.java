package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\r\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000FJ\u000E\u0010\r\u001A\u00020\u00032\u0006\u0010\u0010\u001A\u00020\u0011R\u001A\u0010\u0005\u001A\u00020\u0003X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u0011\u0010\t\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/Anchor;", "", "loc", "", "(I)V", "location", "getLocation$runtime_release", "()I", "setLocation$runtime_release", "valid", "", "getValid", "()Z", "toIndexFor", "slots", "Landroidx/compose/runtime/SlotTable;", "writer", "Landroidx/compose/runtime/SlotWriter;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Anchor {
    private int location;

    public Anchor(int v) {
        this.location = v;
    }

    public final int getLocation$runtime_release() {
        return this.location;
    }

    public final boolean getValid() {
        return this.location != 0x80000000;
    }

    public final void setLocation$runtime_release(int v) {
        this.location = v;
    }

    public final int toIndexFor(SlotTable slotTable0) {
        Intrinsics.checkNotNullParameter(slotTable0, "slots");
        return slotTable0.anchorIndex(this);
    }

    public final int toIndexFor(SlotWriter slotWriter0) {
        Intrinsics.checkNotNullParameter(slotWriter0, "writer");
        return slotWriter0.anchorIndex(this);
    }
}

