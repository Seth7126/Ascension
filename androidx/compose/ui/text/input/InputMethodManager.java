package androidx.compose.ui.text.input;

import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\bH&J\u0010\u0010\t\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\bH&J \u0010\n\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH&J0\u0010\u000F\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\f2\u0006\u0010\u0011\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0013\u001A\u00020\fH&¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/text/input/InputMethodManager;", "", "hideSoftInputFromWindow", "", "windowToken", "Landroid/os/IBinder;", "restartInput", "view", "Landroid/view/View;", "showSoftInput", "updateExtractedText", "token", "", "extractedText", "Landroid/view/inputmethod/ExtractedText;", "updateSelection", "selectionStart", "selectionEnd", "compositionStart", "compositionEnd", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface InputMethodManager {
    void hideSoftInputFromWindow(IBinder arg1);

    void restartInput(View arg1);

    void showSoftInput(View arg1);

    void updateExtractedText(View arg1, int arg2, ExtractedText arg3);

    void updateSelection(View arg1, int arg2, int arg3, int arg4, int arg5);
}

