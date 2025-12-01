package androidx.compose.ui.platform;

import android.os.Build.VERSION;
import android.view.ActionMode;
import android.view.View;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.platform.actionmodecallback.FloatingTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.PrimaryTextActionModeCallback;
import androidx.compose.ui.platform.actionmodecallback.TextActionModeCallback;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000E\u001A\u00020\u000FH\u0016Jh\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u00122\u0014\u0010\u0013\u001A\u0010\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0014\u0010\u0016\u001A\u0010\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0014\u0010\u0017\u001A\u0010\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u0014j\u0004\u0018\u0001`\u00152\u0014\u0010\u0018\u001A\u0010\u0012\u0004\u0012\u00020\u000F\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u001E\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@RX\u0096\u000E¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u000E\u0010\f\u001A\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidTextToolbar;", "Landroidx/compose/ui/platform/TextToolbar;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "actionMode", "Landroid/view/ActionMode;", "<set-?>", "Landroidx/compose/ui/platform/TextToolbarStatus;", "status", "getStatus", "()Landroidx/compose/ui/platform/TextToolbarStatus;", "textActionModeCallback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "hide", "", "showMenu", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/ActionCallback;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidTextToolbar implements TextToolbar {
    private ActionMode actionMode;
    private TextToolbarStatus status;
    private final TextActionModeCallback textActionModeCallback;
    private final View view;

    public AndroidTextToolbar(View view0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super();
        this.view = view0;
        this.textActionModeCallback = new TextActionModeCallback(null, null, null, null, null, 0x1F, null);
        this.status = TextToolbarStatus.Hidden;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public TextToolbarStatus getStatus() {
        return this.status;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void hide() {
        this.status = TextToolbarStatus.Hidden;
        ActionMode actionMode0 = this.actionMode;
        if(actionMode0 != null) {
            actionMode0.finish();
        }
        this.actionMode = null;
    }

    @Override  // androidx.compose.ui.platform.TextToolbar
    public void showMenu(Rect rect0, Function0 function00, Function0 function01, Function0 function02, Function0 function03) {
        ActionMode actionMode1;
        Intrinsics.checkNotNullParameter(rect0, "rect");
        this.textActionModeCallback.setRect(rect0);
        this.textActionModeCallback.setOnCopyRequested(function00);
        this.textActionModeCallback.setOnCutRequested(function02);
        this.textActionModeCallback.setOnPasteRequested(function01);
        this.textActionModeCallback.setOnSelectAllRequested(function03);
        ActionMode actionMode0 = this.actionMode;
        if(actionMode0 == null) {
            this.status = TextToolbarStatus.Shown;
            if(Build.VERSION.SDK_INT >= 23) {
                FloatingTextActionModeCallback floatingTextActionModeCallback0 = new FloatingTextActionModeCallback(this.textActionModeCallback);
                actionMode1 = TextToolbarHelperMethods.INSTANCE.startActionMode(this.view, floatingTextActionModeCallback0, 1);
            }
            else {
                PrimaryTextActionModeCallback primaryTextActionModeCallback0 = new PrimaryTextActionModeCallback(this.textActionModeCallback);
                actionMode1 = this.view.startActionMode(primaryTextActionModeCallback0);
            }
            this.actionMode = actionMode1;
            return;
        }
        if(actionMode0 != null) {
            actionMode0.invalidate();
        }
    }
}

