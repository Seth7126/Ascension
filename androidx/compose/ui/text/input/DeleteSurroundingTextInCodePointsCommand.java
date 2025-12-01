package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001A\u00020\u0003H\u0016J\b\u0010\u0012\u001A\u00020\u0013H\u0016R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/DeleteSurroundingTextInCodePointsCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "lengthBeforeCursor", "", "lengthAfterCursor", "(II)V", "getLengthAfterCursor", "()I", "getLengthBeforeCursor", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DeleteSurroundingTextInCodePointsCommand implements EditCommand {
    private final int lengthAfterCursor;
    private final int lengthBeforeCursor;

    public DeleteSurroundingTextInCodePointsCommand(int v, int v1) {
        this.lengthBeforeCursor = v;
        this.lengthAfterCursor = v1;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer0) {
        int v3;
        Intrinsics.checkNotNullParameter(editingBuffer0, "buffer");
        int v = this.lengthBeforeCursor;
        int v1 = 0;
        if(v > 0) {
            int v2 = 0;
            v3 = 0;
            do {
                ++v2;
                ++v3;
                v3 = editingBuffer0.getSelectionStart$ui_text_release() <= v3 || !EditCommandKt.isSurrogatePair(editingBuffer0.get$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release() - v3 - 1), editingBuffer0.get$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release() - v3)) ? v3 + 1 : v3 + 1;
            }
            while(v3 != editingBuffer0.getSelectionStart$ui_text_release() && v2 < v);
        }
        else {
            v3 = 0;
        }
        int v4 = this.lengthAfterCursor;
        if(v4 > 0) {
            int v5 = 0;
            do {
                ++v1;
                ++v5;
                v5 = editingBuffer0.getSelectionEnd$ui_text_release() + v5 >= editingBuffer0.getLength$ui_text_release() || !EditCommandKt.isSurrogatePair(editingBuffer0.get$ui_text_release(editingBuffer0.getSelectionEnd$ui_text_release() + v5 - 1), editingBuffer0.get$ui_text_release(editingBuffer0.getSelectionEnd$ui_text_release() + v5)) ? v5 + 1 : v5 + 1;
            }
            while(editingBuffer0.getSelectionEnd$ui_text_release() + v5 != editingBuffer0.getLength$ui_text_release() && v1 < v4);
            v1 = v5;
        }
        editingBuffer0.delete$ui_text_release(editingBuffer0.getSelectionEnd$ui_text_release(), editingBuffer0.getSelectionEnd$ui_text_release() + v1);
        editingBuffer0.delete$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release() - v3, editingBuffer0.getSelectionStart$ui_text_release());
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeleteSurroundingTextInCodePointsCommand)) {
            return false;
        }
        return this.lengthBeforeCursor == ((DeleteSurroundingTextInCodePointsCommand)object0).lengthBeforeCursor ? this.lengthAfterCursor == ((DeleteSurroundingTextInCodePointsCommand)object0).lengthAfterCursor : false;
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
        return "DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=" + this.lengthBeforeCursor + ", lengthAfterCursor=" + this.lengthAfterCursor + ')';
    }
}

