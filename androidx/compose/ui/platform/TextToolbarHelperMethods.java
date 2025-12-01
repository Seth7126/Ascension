package androidx.compose.ui.platform;

import android.view.ActionMode.Callback;
import android.view.ActionMode;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0007J \u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH\u0007¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/TextToolbarHelperMethods;", "", "()V", "invalidateContentRect", "", "actionMode", "Landroid/view/ActionMode;", "startActionMode", "view", "Landroid/view/View;", "actionModeCallback", "Landroid/view/ActionMode$Callback;", "type", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextToolbarHelperMethods {
    public static final TextToolbarHelperMethods INSTANCE;

    static {
        TextToolbarHelperMethods.INSTANCE = new TextToolbarHelperMethods();
    }

    public final void invalidateContentRect(ActionMode actionMode0) {
        Intrinsics.checkNotNullParameter(actionMode0, "actionMode");
        actionMode0.invalidateContentRect();
    }

    public final ActionMode startActionMode(View view0, ActionMode.Callback actionMode$Callback0, int v) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(actionMode$Callback0, "actionModeCallback");
        ActionMode actionMode0 = view0.startActionMode(actionMode$Callback0, v);
        Intrinsics.checkNotNullExpressionValue(actionMode0, "view.startActionMode(\n            actionModeCallback,\n            type\n        )");
        return actionMode0;
    }
}

