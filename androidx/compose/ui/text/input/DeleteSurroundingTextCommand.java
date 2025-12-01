package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001A\u00020\u0003H\u0016J\b\u0010\u0012\u001A\u00020\u0013H\u0016R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "lengthBeforeCursor", "", "lengthAfterCursor", "(II)V", "getLengthAfterCursor", "()I", "getLengthBeforeCursor", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DeleteSurroundingTextCommand implements EditCommand {
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextCommand(int v, int v1) {
        this.lengthBeforeCursor = v;
        this.lengthAfterCursor = v1;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer0) {
        Intrinsics.checkNotNullParameter(editingBuffer0, "buffer");
        int v = editingBuffer0.getLength$ui_text_release();
        editingBuffer0.delete$ui_text_release(editingBuffer0.getSelectionEnd$ui_text_release(), Math.min(editingBuffer0.getSelectionEnd$ui_text_release() + this.lengthAfterCursor, v));
        editingBuffer0.delete$ui_text_release(Math.max(0, editingBuffer0.getSelectionStart$ui_text_release() - this.lengthBeforeCursor), editingBuffer0.getSelectionStart$ui_text_release());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeleteSurroundingTextCommand)) {
            return false;
        }
        return this.lengthBeforeCursor == ((DeleteSurroundingTextCommand)object0).lengthBeforeCursor ? this.lengthAfterCursor == ((DeleteSurroundingTextCommand)object0).lengthAfterCursor : false;
    }

    public final int getLengthAfterCursor() {
        return this.lengthAfterCursor;
    }

    public final int getLengthBeforeCursor() {
        return this.lengthBeforeCursor;
    }

    @Override
    public int hashCode() {
        return this.lengthBeforeCursor * 0x1F + this.lengthAfterCursor;
    }

    @Override
    public String toString() {
        return "DeleteSurroundingTextCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}

