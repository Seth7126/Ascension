package androidx.compose.ui.autofill;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/autofill/Autofill;", "", "cancelAutofillForNode", "", "autofillNode", "Landroidx/compose/ui/autofill/AutofillNode;", "requestAutofillForNode", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Autofill {
    void cancelAutofillForNode(AutofillNode arg1);

    void requestAutofillForNode(AutofillNode arg1);
}

