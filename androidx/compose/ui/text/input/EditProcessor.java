package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\f\u001A\u00020\b2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000EJ\u0018\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\b2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014J\u0006\u0010\u0015\u001A\u00020\bR\u001E\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0004@BX\u0080\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u001E\u0010\t\u001A\u00020\b2\u0006\u0010\u0003\u001A\u00020\b@BX\u0080\u000E¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000B¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/input/EditProcessor;", "", "()V", "<set-?>", "Landroidx/compose/ui/text/input/EditingBuffer;", "mBuffer", "getMBuffer$ui_text_release", "()Landroidx/compose/ui/text/input/EditingBuffer;", "Landroidx/compose/ui/text/input/TextFieldValue;", "mBufferState", "getMBufferState$ui_text_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "apply", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "reset", "", "value", "textInputSession", "Landroidx/compose/ui/text/input/TextInputSession;", "toTextFieldValue", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class EditProcessor {
    private EditingBuffer mBuffer;
    private TextFieldValue mBufferState;

    public EditProcessor() {
        this.mBufferState = new TextFieldValue(AnnotatedStringKt.emptyAnnotatedString(), 0L, null, null);
        this.mBuffer = new EditingBuffer(this.mBufferState.getAnnotatedString(), this.mBufferState.getSelection-d9O1mEE(), null);
    }

    public final TextFieldValue apply(List list0) {
        Intrinsics.checkNotNullParameter(list0, "editCommands");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                ((EditCommand)list0.get(v1)).applyTo(this.getMBuffer$ui_text_release());
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        TextFieldValue textFieldValue0 = new TextFieldValue(this.mBuffer.toAnnotatedString$ui_text_release(), TextRangeKt.TextRange(this.mBuffer.getSelectionStart$ui_text_release(), this.mBuffer.getSelectionEnd$ui_text_release()), (this.mBuffer.hasComposition$ui_text_release() ? TextRange.box-impl(TextRangeKt.TextRange(this.mBuffer.getCompositionStart$ui_text_release(), this.mBuffer.getCompositionEnd$ui_text_release())) : null), null);
        this.mBufferState = textFieldValue0;
        return textFieldValue0;
    }

    public final EditingBuffer getMBuffer$ui_text_release() {
        return this.mBuffer;
    }

    public final TextFieldValue getMBufferState$ui_text_release() {
        return this.mBufferState;
    }

    public final void reset(TextFieldValue textFieldValue0, TextInputSession textInputSession0) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "value");
        if(!Intrinsics.areEqual(this.mBufferState.getAnnotatedString(), textFieldValue0.getAnnotatedString())) {
            this.mBuffer = new EditingBuffer(textFieldValue0.getAnnotatedString(), textFieldValue0.getSelection-d9O1mEE(), null);
        }
        else if(!TextRange.equals-impl0(this.mBufferState.getSelection-d9O1mEE(), textFieldValue0.getSelection-d9O1mEE())) {
            this.mBuffer.setSelection$ui_text_release(TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()), TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()));
        }
        if(textFieldValue0.getComposition-MzsxiRA() == null) {
            this.mBuffer.commitComposition$ui_text_release();
        }
        else if(!TextRange.getCollapsed-impl(textFieldValue0.getComposition-MzsxiRA().unbox-impl())) {
            this.mBuffer.setComposition$ui_text_release(TextRange.getMin-impl(textFieldValue0.getComposition-MzsxiRA().unbox-impl()), TextRange.getMax-impl(textFieldValue0.getComposition-MzsxiRA().unbox-impl()));
        }
        TextFieldValue textFieldValue1 = this.mBufferState;
        this.mBufferState = textFieldValue0;
        if(textInputSession0 != null) {
            textInputSession0.updateState(textFieldValue1, textFieldValue0);
        }
    }

    public final TextFieldValue toTextFieldValue() {
        return this.mBufferState;
    }
}

