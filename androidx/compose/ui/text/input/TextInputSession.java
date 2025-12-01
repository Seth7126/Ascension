package androidx.compose.ui.text.input;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\n\u001A\u00020\u000BJ\u0017\u0010\f\u001A\u00020\b2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000B0\u000EH\u0082\bJ\u0006\u0010\u000F\u001A\u00020\bJ\u000E\u0010\u0010\u001A\u00020\b2\u0006\u0010\u0011\u001A\u00020\u0012J\u0006\u0010\u0013\u001A\u00020\bJ\u0018\u0010\u0014\u001A\u00020\b2\b\u0010\u0015\u001A\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001A\u00020\u0016R\u0011\u0010\u0007\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\u0007\u0010\tR\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/input/TextInputSession;", "", "textInputService", "Landroidx/compose/ui/text/input/TextInputService;", "platformTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "isOpen", "", "()Z", "dispose", "", "ensureOpenSession", "block", "Lkotlin/Function0;", "hideSoftwareKeyboard", "notifyFocusedRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "showSoftwareKeyboard", "updateState", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "newValue", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextInputSession {
    private final PlatformTextInputService platformTextInputService;
    private final TextInputService textInputService;

    public TextInputSession(TextInputService textInputService0, PlatformTextInputService platformTextInputService0) {
        Intrinsics.checkNotNullParameter(textInputService0, "textInputService");
        Intrinsics.checkNotNullParameter(platformTextInputService0, "platformTextInputService");
        super();
        this.textInputService = textInputService0;
        this.platformTextInputService = platformTextInputService0;
    }

    public final void dispose() {
        this.textInputService.stopInput(this);
    }

    private final boolean ensureOpenSession(Function0 function00) {
        boolean z = this.isOpen();
        if(z) {
            function00.invoke();
        }
        return z;
    }

    public final boolean hideSoftwareKeyboard() {
        boolean z = this.isOpen();
        if(z) {
            this.platformTextInputService.hideSoftwareKeyboard();
        }
        return z;
    }

    public final boolean isOpen() {
        return Intrinsics.areEqual(this.textInputService.getCurrentInputSession$ui_text_release(), this);
    }

    public final boolean notifyFocusedRect(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        boolean z = this.isOpen();
        if(z) {
            this.platformTextInputService.notifyFocusedRect(rect0);
        }
        return z;
    }

    public final boolean showSoftwareKeyboard() {
        boolean z = this.isOpen();
        if(z) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
        return z;
    }

    public final boolean updateState(TextFieldValue textFieldValue0, TextFieldValue textFieldValue1) {
        Intrinsics.checkNotNullParameter(textFieldValue1, "newValue");
        boolean z = this.isOpen();
        if(z) {
            this.platformTextInputService.updateState(textFieldValue0, textFieldValue1);
        }
        return z;
    }
}

