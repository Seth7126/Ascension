package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001A\u00020\u0003H\u0016J\b\u0010\u0012\u001A\u00020\u0013H\u0016R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/SetSelectionCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "start", "", "end", "(II)V", "getEnd", "()I", "getStart", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SetSelectionCommand implements EditCommand {
    private final int end;
    private final int start;

    public SetSelectionCommand(int v, int v1) {
        this.start = v;
        this.end = v1;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer0) {
        Intrinsics.checkNotNullParameter(editingBuffer0, "buffer");
        int v = editingBuffer0.getLength$ui_text_release();
        int v1 = RangesKt.coerceIn(this.start, 0, v);
        int v2 = editingBuffer0.getLength$ui_text_release();
        int v3 = RangesKt.coerceIn(this.end, 0, v2);
        if(v1 < v3) {
            editingBuffer0.setSelection$ui_text_release(v1, v3);
            return;
        }
        editingBuffer0.setSelection$ui_text_release(v3, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SetSelectionCommand)) {
            return false;
        }
        return this.start == ((SetSelectionCommand)object0).start ? this.end == ((SetSelectionCommand)object0).end : false;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    @Override
    public int hashCode() {
        return this.start * 0x1F + this.end;
    }

    @Override
    public String toString() {
        return "SetSelectionCommand(start=" + this.start + ", end=" + this.end + ')';
    }
}

