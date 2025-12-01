package androidx.compose.ui.text.input;

import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001A\u00020\rJ\u0006\u0010\u000E\u001A\u00020\rJI\u0010\u000F\u001A\u00020\u00072\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00132\u0018\u0010\u0014\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0004\u0012\u00020\r0\u00152\u0012\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0015H\u0016ø\u0001\u0000J\u0010\u0010\u001A\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u0007H\u0016R\"\u0010\u0005\u001A\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001A\u0004\u0018\u00010\u00078@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "platformTextInputService", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "(Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "_currentInputSession", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/ui/text/input/TextInputSession;", "Landroidx/compose/ui/text/AtomicReference;", "currentInputSession", "getCurrentInputSession$ui_text_release", "()Landroidx/compose/ui/text/input/TextInputSession;", "hideSoftwareKeyboard", "", "showSoftwareKeyboard", "startInput", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "imeOptions", "Landroidx/compose/ui/text/input/ImeOptions;", "onEditCommand", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/ImeAction;", "stopInput", "session", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class TextInputService {
    private final AtomicReference _currentInputSession;
    private final PlatformTextInputService platformTextInputService;

    public TextInputService(PlatformTextInputService platformTextInputService0) {
        Intrinsics.checkNotNullParameter(platformTextInputService0, "platformTextInputService");
        super();
        this.platformTextInputService = platformTextInputService0;
        this._currentInputSession = new AtomicReference(null);
    }

    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return (TextInputSession)this._currentInputSession.get();
    }

    public final void hideSoftwareKeyboard() {
        this.platformTextInputService.hideSoftwareKeyboard();
    }

    public final void showSoftwareKeyboard() {
        if(this._currentInputSession.get() != null) {
            this.platformTextInputService.showSoftwareKeyboard();
        }
    }

    public TextInputSession startInput(TextFieldValue textFieldValue0, ImeOptions imeOptions0, Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "value");
        Intrinsics.checkNotNullParameter(imeOptions0, "imeOptions");
        Intrinsics.checkNotNullParameter(function10, "onEditCommand");
        Intrinsics.checkNotNullParameter(function11, "onImeActionPerformed");
        this.platformTextInputService.startInput(textFieldValue0, imeOptions0, function10, function11);
        TextInputSession textInputSession0 = new TextInputSession(this, this.platformTextInputService);
        this._currentInputSession.set(textInputSession0);
        return textInputSession0;
    }

    public void stopInput(TextInputSession textInputSession0) {
        Intrinsics.checkNotNullParameter(textInputSession0, "session");
        if(PainterModifier..ExternalSyntheticBackport0.m(this._currentInputSession, textInputSession0, null)) {
            this.platformTextInputService.stopInput();
        }
    }
}

