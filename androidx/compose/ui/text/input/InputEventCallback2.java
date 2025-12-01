package androidx.compose.ui.text.input;

import android.view.KeyEvent;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u001D\u0010\u0007\u001A\u00020\u00032\u0006\u0010\b\u001A\u00020\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u000EH&\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/input/InputEventCallback2;", "", "onEditCommands", "", "editCommands", "", "Landroidx/compose/ui/text/input/EditCommand;", "onImeAction", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "onImeAction-KlQnJC8", "(I)V", "onKeyEvent", "event", "Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface InputEventCallback2 {
    void onEditCommands(List arg1);

    void onImeAction-KlQnJC8(int arg1);

    void onKeyEvent(KeyEvent arg1);
}

