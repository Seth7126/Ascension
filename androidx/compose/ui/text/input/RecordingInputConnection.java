package androidx.compose.ui.text.input;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\bJ\u0010\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u0010H\u0002J\b\u0010 \u001A\u00020\u0007H\u0016J\b\u0010!\u001A\u00020\u0007H\u0002J\u0010\u0010\"\u001A\u00020\u00072\u0006\u0010#\u001A\u00020\fH\u0016J\b\u0010$\u001A\u00020\u001EH\u0016J\u0012\u0010%\u001A\u00020\u00072\b\u0010&\u001A\u0004\u0018\u00010\'H\u0016J\"\u0010(\u001A\u00020\u00072\u0006\u0010)\u001A\u00020*2\u0006\u0010+\u001A\u00020\f2\b\u0010,\u001A\u0004\u0018\u00010-H\u0016J\u0012\u0010.\u001A\u00020\u00072\b\u0010/\u001A\u0004\u0018\u000100H\u0016J\u001A\u00101\u001A\u00020\u00072\b\u0010&\u001A\u0004\u0018\u0001022\u0006\u00103\u001A\u00020\fH\u0016J\u0018\u00104\u001A\u00020\u00072\u0006\u00105\u001A\u00020\f2\u0006\u00106\u001A\u00020\fH\u0016J\u0018\u00107\u001A\u00020\u00072\u0006\u00105\u001A\u00020\f2\u0006\u00106\u001A\u00020\fH\u0016J\b\u00108\u001A\u00020\u0007H\u0016J\b\u00109\u001A\u00020\u0007H\u0002J\u0017\u0010:\u001A\u00020\u00072\f\u0010;\u001A\b\u0012\u0004\u0012\u00020\u001E0<H\u0082\bJ\b\u0010=\u001A\u00020\u0007H\u0016J\u0010\u0010>\u001A\u00020\f2\u0006\u0010?\u001A\u00020\fH\u0016J\u001A\u0010@\u001A\u00020A2\b\u0010B\u001A\u0004\u0018\u00010C2\u0006\u0010+\u001A\u00020\fH\u0016J\n\u0010D\u001A\u0004\u0018\u00010EH\u0016J\u0012\u0010F\u001A\u0004\u0018\u0001022\u0006\u0010+\u001A\u00020\fH\u0016J\u0018\u0010G\u001A\u0002022\u0006\u0010H\u001A\u00020\f2\u0006\u0010+\u001A\u00020\fH\u0016J\u0018\u0010I\u001A\u0002022\u0006\u0010H\u001A\u00020\f2\u0006\u0010+\u001A\u00020\fH\u0016J\u0010\u0010J\u001A\u00020\u001E2\u0006\u0010K\u001A\u00020LH\u0002J\u0010\u0010M\u001A\u00020\u00072\u0006\u0010N\u001A\u00020\fH\u0016J\u0010\u0010O\u001A\u00020\u00072\u0006\u0010P\u001A\u00020\fH\u0016J\u001C\u0010Q\u001A\u00020\u00072\b\u0010R\u001A\u0004\u0018\u00010L2\b\u0010S\u001A\u0004\u0018\u00010-H\u0016J\u0010\u0010T\u001A\u00020\u00072\u0006\u0010U\u001A\u00020\u0007H\u0016J\u0010\u0010V\u001A\u00020\u00072\u0006\u0010W\u001A\u00020\fH\u0016J\u0010\u0010X\u001A\u00020\u00072\u0006\u0010Y\u001A\u00020ZH\u0016J\u0018\u0010[\u001A\u00020\u00072\u0006\u0010\\\u001A\u00020\f2\u0006\u0010]\u001A\u00020\fH\u0016J\u001A\u0010^\u001A\u00020\u00072\b\u0010&\u001A\u0004\u0018\u0001022\u0006\u00103\u001A\u00020\fH\u0016J\u0018\u0010_\u001A\u00020\u00072\u0006\u0010\\\u001A\u00020\f2\u0006\u0010]\u001A\u00020\fH\u0016J\u001E\u0010`\u001A\u00020\u001E2\u0006\u0010a\u001A\u00020\u00032\u0006\u0010b\u001A\u00020c2\u0006\u0010d\u001A\u00020eR\u0011\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u000E\u0010\u000B\u001A\u00020\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000FX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u000E\u0010\u0013\u001A\u00020\u0007X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\u0007X\u0082\u000E\u00A2\u0006\u0002\n\u0000R,\u0010\u0016\u001A\u00020\u00032\u0006\u0010\u0015\u001A\u00020\u00038\u0000@@X\u0081\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C\u00A8\u0006f"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "initState", "Landroidx/compose/ui/text/input/TextFieldValue;", "eventCallback", "Landroidx/compose/ui/text/input/InputEventCallback2;", "autoCorrect", "", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "getAutoCorrect", "()Z", "batchDepth", "", "currentExtractedTextRequestToken", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "extractedTextMonitorMode", "isActive", "value", "mTextFieldValue", "getMTextFieldValue$ui_release$annotations", "()V", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "addEditCommandWithBatch", "", "editCommand", "beginBatchEdit", "beginBatchEditInternal", "clearMetaKeyStates", "states", "closeConnection", "commitCompletion", "text", "Landroid/view/inputmethod/CompletionInfo;", "commitContent", "inputContentInfo", "Landroid/view/inputmethod/InputContentInfo;", "flags", "opts", "Landroid/os/Bundle;", "commitCorrection", "correctionInfo", "Landroid/view/inputmethod/CorrectionInfo;", "commitText", "", "newCursorPosition", "deleteSurroundingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "endBatchEdit", "endBatchEditInternal", "ensureActive", "block", "Lkotlin/Function0;", "finishComposingText", "getCursorCapsMode", "reqModes", "getExtractedText", "Landroid/view/inputmethod/ExtractedText;", "request", "Landroid/view/inputmethod/ExtractedTextRequest;", "getHandler", "Landroid/os/Handler;", "getSelectedText", "getTextAfterCursor", "maxChars", "getTextBeforeCursor", "logDebug", "message", "", "performContextMenuAction", "id", "performEditorAction", "editorAction", "performPrivateCommand", "action", "data", "reportFullscreenMode", "enabled", "requestCursorUpdates", "cursorUpdateMode", "sendKeyEvent", "event", "Landroid/view/KeyEvent;", "setComposingRegion", "start", "end", "setComposingText", "setSelection", "updateInputState", "state", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RecordingInputConnection implements InputConnection {
    private final boolean autoCorrect;
    private int batchDepth;
    private int currentExtractedTextRequestToken;
    private final List editCommands;
    private final InputEventCallback2 eventCallback;
    private boolean extractedTextMonitorMode;
    private boolean isActive;
    private TextFieldValue mTextFieldValue;

    public RecordingInputConnection(TextFieldValue textFieldValue0, InputEventCallback2 inputEventCallback20, boolean z) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "initState");
        Intrinsics.checkNotNullParameter(inputEventCallback20, "eventCallback");
        super();
        this.eventCallback = inputEventCallback20;
        this.autoCorrect = z;
        this.mTextFieldValue = textFieldValue0;
        this.editCommands = new ArrayList();
        this.isActive = true;
    }

    private final void addEditCommandWithBatch(EditCommand editCommand0) {
        this.beginBatchEditInternal();
        try {
            this.editCommands.add(editCommand0);
        }
        finally {
            this.endBatchEditInternal();
        }
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        return this.isActive ? this.beginBatchEditInternal() : false;
    }

    private final boolean beginBatchEditInternal() {
        ++this.batchDepth;
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int v) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.editCommands.clear();
        this.batchDepth = 0;
        this.isActive = false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo0) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
        Intrinsics.checkNotNullParameter(inputContentInfo0, "inputContentInfo");
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo0) {
        return this.isActive ? this.getAutoCorrect() : false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence0, int v) {
        boolean z = this.isActive;
        if(z) {
            this.addEditCommandWithBatch(new CommitTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int v, int v1) {
        if(this.isActive) {
            this.addEditCommandWithBatch(new DeleteSurroundingTextCommand(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        if(this.isActive) {
            this.addEditCommandWithBatch(new DeleteSurroundingTextInCodePointsCommand(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return this.endBatchEditInternal();
    }

    private final boolean endBatchEditInternal() {
        int v = this.batchDepth - 1;
        this.batchDepth = v;
        if(v == 0 && !this.editCommands.isEmpty() != 0) {
            List list0 = CollectionsKt.toMutableList(this.editCommands);
            this.eventCallback.onEditCommands(list0);
            this.editCommands.clear();
        }
        return this.batchDepth > 0;
    }

    private final boolean ensureActive(Function0 function00) {
        boolean z = this.isActive;
        if(z) {
            function00.invoke();
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        if(this.isActive) {
            this.addEditCommandWithBatch(new FinishComposingTextCommand());
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.autoCorrect;
    }

    @Override  // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int v) {
        return TextUtils.getCapsMode(this.mTextFieldValue.getText(), TextRange.getMin-impl(this.mTextFieldValue.getSelection-d9O1mEE()), v);
    }

    public final InputEventCallback2 getEventCallback() {
        return this.eventCallback;
    }

    @Override  // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest0, int v) {
        boolean z = true;
        int v1 = 0;
        if((v & 1) == 0) {
            z = false;
        }
        this.extractedTextMonitorMode = z;
        if(z) {
            if(extractedTextRequest0 != null) {
                v1 = extractedTextRequest0.token;
            }
            this.currentExtractedTextRequestToken = v1;
        }
        return InputState_androidKt.toExtractedText(this.mTextFieldValue);
    }

    @Override  // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.mTextFieldValue;
    }

    public static void getMTextFieldValue$ui_release$annotations() {
    }

    @Override  // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int v) {
        return TextRange.getCollapsed-impl(this.mTextFieldValue.getSelection-d9O1mEE()) ? null : TextFieldValueKt.getSelectedText(this.mTextFieldValue).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int v, int v1) {
        return TextFieldValueKt.getTextAfterSelection(this.mTextFieldValue, v).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int v, int v1) {
        return TextFieldValueKt.getTextBeforeSelection(this.mTextFieldValue, v).toString();
    }

    private final void logDebug(String s) {
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int v) {
        if(this.isActive) {
            Log.w("RecordingIC", "performContextMenuAction is not supported");
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int v) {
        int v1;
        if(this.isActive) {
            if(v == 0) {
                v1 = 1;
            }
            else {
                switch(v) {
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    case 3: {
                        v1 = 3;
                        break;
                    }
                    case 4: {
                        v1 = 4;
                        break;
                    }
                    case 5: {
                        v1 = 6;
                        break;
                    }
                    case 6: {
                        v1 = 7;
                        break;
                    }
                    case 7: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + v);
                        v1 = 1;
                    }
                }
            }
            this.getEventCallback().onImeAction-KlQnJC8(v1);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String s, Bundle bundle0) {
        return this.isActive;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int v) {
        if(this.isActive) {
            Log.w("RecordingIC", "requestCursorUpdates is not supported");
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "event");
        if(this.isActive) {
            this.getEventCallback().onKeyEvent(keyEvent0);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int v, int v1) {
        boolean z = this.isActive;
        if(z) {
            this.addEditCommandWithBatch(new SetComposingRegionCommand(v, v1));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence0, int v) {
        boolean z = this.isActive;
        if(z) {
            this.addEditCommandWithBatch(new SetComposingTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(TextFieldValue textFieldValue0) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "value");
        this.mTextFieldValue = textFieldValue0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setSelection(int v, int v1) {
        if(this.isActive) {
            this.addEditCommandWithBatch(new SetSelectionCommand(v, v1));
            return true;
        }
        return false;
    }

    public final void updateInputState(TextFieldValue textFieldValue0, InputMethodManager inputMethodManager0, View view0) {
        Intrinsics.checkNotNullParameter(textFieldValue0, "state");
        Intrinsics.checkNotNullParameter(inputMethodManager0, "inputMethodManager");
        Intrinsics.checkNotNullParameter(view0, "view");
        if(!this.isActive) {
            return;
        }
        this.setMTextFieldValue$ui_release(textFieldValue0);
        if(this.extractedTextMonitorMode) {
            inputMethodManager0.updateExtractedText(view0, this.currentExtractedTextRequestToken, InputState_androidKt.toExtractedText(textFieldValue0));
        }
        TextRange textRange0 = textFieldValue0.getComposition-MzsxiRA();
        TextRange textRange1 = textFieldValue0.getComposition-MzsxiRA();
        inputMethodManager0.updateSelection(view0, TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()), TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()), (textRange0 == null ? -1 : TextRange.getMin-impl(textRange0.unbox-impl())), (textRange1 == null ? -1 : TextRange.getMax-impl(textRange1.unbox-impl())));
    }
}

