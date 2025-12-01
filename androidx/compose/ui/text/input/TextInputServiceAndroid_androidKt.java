package androidx.compose.ui.text.input;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H\u0002\u001A\u001C\u0010\u0007\u001A\u00020\b*\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000E"}, d2 = {"DEBUG_CLASS", "", "hasFlag", "", "bits", "", "flag", "update", "", "Landroid/view/inputmethod/EditorInfo;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextInputServiceAndroid_androidKt {
    private static final String DEBUG_CLASS = "TextInputServiceAndroid";

    private static final boolean hasFlag(int v, int v1) {
        return (v & v1) == v1;
    }

    public static final void update(EditorInfo editorInfo0, ImeOptions imeOptions0, TextFieldValue textFieldValue0) {
        Intrinsics.checkNotNullParameter(editorInfo0, "<this>");
        Intrinsics.checkNotNullParameter(imeOptions0, "imeOptions");
        Intrinsics.checkNotNullParameter(textFieldValue0, "textFieldValue");
        int v = imeOptions0.getImeAction-eUduSuo();
        int v1 = 6;
        if(ImeAction.equals-impl0(v, 1)) {
            if(imeOptions0.getSingleLine()) {
                goto label_28;
            }
            v1 = 0;
        }
        else {
            if(ImeAction.equals-impl0(v, 0)) {
                v1 = 1;
                goto label_28;
            }
            if(ImeAction.equals-impl0(v, 2)) {
                v1 = 2;
                goto label_28;
            }
            if(ImeAction.equals-impl0(v, 6)) {
                v1 = 5;
                goto label_28;
            }
            if(ImeAction.equals-impl0(v, 5)) {
                v1 = 7;
                goto label_28;
            }
            if(ImeAction.equals-impl0(v, 3)) {
                v1 = 3;
                goto label_28;
            }
            if(ImeAction.equals-impl0(v, 4)) {
                v1 = 4;
            }
            else if(ImeAction.equals-impl0(v, 7)) {
            }
            else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
    label_28:
        editorInfo0.imeOptions = v1;
        int v2 = imeOptions0.getKeyboardType-PjHm6EE();
        if(KeyboardType.equals-impl0(v2, 1)) {
            editorInfo0.inputType = 1;
        }
        else {
            if(KeyboardType.equals-impl0(v2, 2)) {
                editorInfo0.inputType = 1;
                editorInfo0.imeOptions |= 0x80000000;
                goto label_54;
            }
            if(KeyboardType.equals-impl0(v2, 3)) {
                editorInfo0.inputType = 2;
                goto label_54;
            }
            if(KeyboardType.equals-impl0(v2, 4)) {
                editorInfo0.inputType = 3;
                goto label_54;
            }
            if(KeyboardType.equals-impl0(v2, 5)) {
                editorInfo0.inputType = 17;
                goto label_54;
            }
            if(KeyboardType.equals-impl0(v2, 6)) {
                editorInfo0.inputType = 33;
                goto label_54;
            }
            if(KeyboardType.equals-impl0(v2, 7)) {
                editorInfo0.inputType = 0x81;
            }
            else if(KeyboardType.equals-impl0(v2, 8)) {
                editorInfo0.inputType = 18;
            }
            else {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
        }
    label_54:
        if(!imeOptions0.getSingleLine() && TextInputServiceAndroid_androidKt.hasFlag(editorInfo0.inputType, 1)) {
            editorInfo0.inputType |= 0x20000;
            if(ImeAction.equals-impl0(imeOptions0.getImeAction-eUduSuo(), 1)) {
                editorInfo0.imeOptions |= 0x40000000;
            }
        }
        if(TextInputServiceAndroid_androidKt.hasFlag(editorInfo0.inputType, 1)) {
            int v3 = imeOptions0.getCapitalization-IUNYP9k();
            if(KeyboardCapitalization.equals-impl0(v3, 1)) {
                editorInfo0.inputType |= 0x1000;
            }
            else if(KeyboardCapitalization.equals-impl0(v3, 2)) {
                editorInfo0.inputType |= 0x2000;
            }
            else if(KeyboardCapitalization.equals-impl0(v3, 3)) {
                editorInfo0.inputType |= 0x4000;
            }
            if(imeOptions0.getAutoCorrect()) {
                editorInfo0.inputType |= 0x8000;
            }
        }
        editorInfo0.initialSelStart = TextRange.getStart-impl(textFieldValue0.getSelection-d9O1mEE());
        editorInfo0.initialSelEnd = (int)(textFieldValue0.getSelection-d9O1mEE() & 0xFFFFFFFFL);
        EditorInfoCompat.setInitialSurroundingText(editorInfo0, textFieldValue0.getText());
        editorInfo0.imeOptions |= 0x2000000;
    }
}

