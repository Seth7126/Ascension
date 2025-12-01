package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001A\u00020\u0007H&Jp\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\n2\u0016\b\u0002\u0010\u000B\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0016\b\u0002\u0010\u000E\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0016\b\u0002\u0010\u000F\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fj\u0004\u0018\u0001`\r2\u0016\b\u0002\u0010\u0010\u001A\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fj\u0004\u0018\u0001`\rH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/TextToolbar;", "", "status", "Landroidx/compose/ui/platform/TextToolbarStatus;", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "hide", "", "showMenu", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/ActionCallback;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface TextToolbar {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void showMenu$default(TextToolbar textToolbar0, Rect rect0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showMenu");
            }
            textToolbar0.showMenu(rect0, ((v & 2) == 0 ? function00 : null), ((v & 4) == 0 ? function01 : null), ((v & 8) == 0 ? function02 : null), ((v & 16) == 0 ? function03 : null));
        }
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect arg1, Function0 arg2, Function0 arg3, Function0 arg4, Function0 arg5);
}

