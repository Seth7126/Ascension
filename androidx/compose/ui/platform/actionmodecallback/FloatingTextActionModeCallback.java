package androidx.compose.ui.platform.actionmodecallback;

import android.graphics.Rect;
import android.view.ActionMode.Callback2;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001C\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\t\u001A\u0004\u0018\u00010\nH\u0016J\u001C\u0010\u000B\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\f\u001A\u0004\u0018\u00010\rH\u0016J\u0012\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016J&\u0010\u0010\u001A\u00020\u000F2\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014H\u0016J\u001C\u0010\u0015\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\b\u0010\f\u001A\u0004\u0018\u00010\rH\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/FloatingTextActionModeCallback;", "Landroid/view/ActionMode$Callback2;", "callback", "Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "(Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;)V", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onGetContentRect", "view", "Landroid/view/View;", "outRect", "Landroid/graphics/Rect;", "onPrepareActionMode", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FloatingTextActionModeCallback extends ActionMode.Callback2 {
    private final TextActionModeCallback callback;

    public FloatingTextActionModeCallback(TextActionModeCallback textActionModeCallback0) {
        Intrinsics.checkNotNullParameter(textActionModeCallback0, "callback");
        super();
        this.callback = textActionModeCallback0;
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onActionItemClicked(ActionMode actionMode0, MenuItem menuItem0) {
        return this.callback.onActionItemClicked(actionMode0, menuItem0);
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onCreateActionMode(ActionMode actionMode0, Menu menu0) {
        return this.callback.onCreateActionMode(actionMode0, menu0);
    }

    @Override  // android.view.ActionMode$Callback
    public void onDestroyActionMode(ActionMode actionMode0) {
    }

    @Override  // android.view.ActionMode$Callback2
    public void onGetContentRect(ActionMode actionMode0, View view0, Rect rect0) {
        androidx.compose.ui.geometry.Rect rect1 = this.callback.getRect();
        if(rect0 != null) {
            rect0.set(((int)rect1.getLeft()), ((int)rect1.getTop()), ((int)rect1.getRight()), ((int)rect1.getBottom()));
        }
    }

    @Override  // android.view.ActionMode$Callback
    public boolean onPrepareActionMode(ActionMode actionMode0, Menu menu0) {
        return false;
    }
}

