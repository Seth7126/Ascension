package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H\u0016J\u0013\u0010\u0014\u001A\u00020\u00152\b\u0010\u0016\u001A\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001A\u00020\u0005H\u0016J\b\u0010\u0019\u001A\u00020\u0003H\u0016R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/text/input/SetComposingTextCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "text", "", "newCursorPosition", "", "(Ljava/lang/String;I)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;I)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getNewCursorPosition", "()I", "getText", "()Ljava/lang/String;", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SetComposingTextCommand implements EditCommand {
    private final AnnotatedString annotatedString;
    private final int newCursorPosition;

    public SetComposingTextCommand(AnnotatedString annotatedString0, int v) {
        Intrinsics.checkNotNullParameter(annotatedString0, "annotatedString");
        super();
        this.annotatedString = annotatedString0;
        this.newCursorPosition = v;
    }

    public SetComposingTextCommand(String s, int v) {
        Intrinsics.checkNotNullParameter(s, "text");
        this(new AnnotatedString(s, null, null, 6, null), v);
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer0) {
        Intrinsics.checkNotNullParameter(editingBuffer0, "buffer");
        if(editingBuffer0.hasComposition$ui_text_release()) {
            int v = editingBuffer0.getCompositionStart$ui_text_release();
            editingBuffer0.replace$ui_text_release(editingBuffer0.getCompositionStart$ui_text_release(), editingBuffer0.getCompositionEnd$ui_text_release(), this.getText());
            if(this.getText().length() > 0) {
                editingBuffer0.setComposition$ui_text_release(v, this.getText().length() + v);
            }
        }
        else {
            int v1 = editingBuffer0.getSelectionStart$ui_text_release();
            editingBuffer0.replace$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release(), editingBuffer0.getSelectionEnd$ui_text_release(), this.getText());
            if(this.getText().length() > 0) {
                editingBuffer0.setComposition$ui_text_release(v1, this.getText().length() + v1);
            }
        }
        int v2 = editingBuffer0.getCursor$ui_text_release();
        editingBuffer0.setCursor$ui_text_release(RangesKt.coerceIn((this.newCursorPosition <= 0 ? v2 + this.newCursorPosition - this.getText().length() : v2 + this.newCursorPosition - 1), 0, editingBuffer0.getLength$ui_text_release()));
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SetComposingTextCommand)) {
            return false;
        }
        return Intrinsics.areEqual(this.getText(), ((SetComposingTextCommand)object0).getText()) ? this.newCursorPosition == ((SetComposingTextCommand)object0).newCursorPosition : false;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final int getNewCursorPosition() {
        return this.newCursorPosition;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    @Override
    public int hashCode() {
        return this.getText().hashCode() * 0x1F + this.newCursorPosition;
    }

    @Override
    public String toString() {
        return "SetComposingTextCommand(text=\'" + this.getText() + "\', newCursorPosition=" + this.newCursorPosition + ')';
    }
}

