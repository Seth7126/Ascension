package androidx.compose.ui.text.input;

import androidx.compose.ui.text.JvmCharHelpers_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EH\u0096\u0002J\b\u0010\u000F\u001A\u00020\u0003H\u0016J\b\u0010\u0010\u001A\u00020\u0011H\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/MoveCursorCommand;", "Landroidx/compose/ui/text/input/EditCommand;", "amount", "", "(I)V", "getAmount", "()I", "applyTo", "", "buffer", "Landroidx/compose/ui/text/input/EditingBuffer;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MoveCursorCommand implements EditCommand {
    private final int amount;

    public MoveCursorCommand(int v) {
        this.amount = v;
    }

    @Override  // androidx.compose.ui.text.input.EditCommand
    public void applyTo(EditingBuffer editingBuffer0) {
        int v3;
        Intrinsics.checkNotNullParameter(editingBuffer0, "buffer");
        if(editingBuffer0.getCursor$ui_text_release() == -1) {
            editingBuffer0.setCursor$ui_text_release(editingBuffer0.getSelectionStart$ui_text_release());
        }
        int v = editingBuffer0.getSelectionStart$ui_text_release();
        String s = editingBuffer0.toString();
        int v1 = this.amount;
        int v2 = 0;
        if(v1 > 0) {
            while(true) {
                ++v2;
                v3 = JvmCharHelpers_androidKt.findFollowingBreak(s, v);
                if(v3 == -1) {
                    editingBuffer0.setCursor$ui_text_release(v);
                    return;
                }
                if(v2 >= v1) {
                    break;
                }
                v = v3;
            }
            v = v3;
        }
        else if(-v1 > 0) {
            while(true) {
                ++v2;
                v3 = JvmCharHelpers_androidKt.findPrecedingBreak(s, v);
                if(v3 == -1) {
                    break;
                }
                if(v2 >= -v1) {
                    v = v3;
                    break;
                }
                v = v3;
            }
        }
        editingBuffer0.setCursor$ui_text_release(v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof MoveCursorCommand ? this.amount == ((MoveCursorCommand)object0).amount : false;
    }

    public final int getAmount() {
        return this.amount;
    }

    @Override
    public int hashCode() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "MoveCursorCommand(amount=" + this.amount + ')';
    }
}

