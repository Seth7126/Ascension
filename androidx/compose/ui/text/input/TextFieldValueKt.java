package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\u0012\u0010\u0003\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005\u001A\u0012\u0010\u0006\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005¨\u0006\u0007"}, d2 = {"getSelectedText", "Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextAfterSelection", "maxChars", "", "getTextBeforeSelection", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextFieldValueKt {
    public static final AnnotatedString getSelectedText(TextFieldValue textFieldValue0) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "<this>");
        return textFieldValue0.getAnnotatedString().subSequence-5zc-tL8(textFieldValue0.getSelection-d9O1mEE());
    }

    public static final AnnotatedString getTextAfterSelection(TextFieldValue textFieldValue0, int v) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "<this>");
        return textFieldValue0.getAnnotatedString().subSequence(TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()), Math.min(TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()) + v, textFieldValue0.getText().length()));
    }

    public static final AnnotatedString getTextBeforeSelection(TextFieldValue textFieldValue0, int v) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "<this>");
        return textFieldValue0.getAnnotatedString().subSequence(Math.max(0, TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()) - v), TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()));
    }
}

