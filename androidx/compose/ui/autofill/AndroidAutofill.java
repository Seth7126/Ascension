package androidx.compose.ui.autofill;

import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0012H\u0016J\u0010\u0010\u0013\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0012H\u0016R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000E¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/autofill/AndroidAutofill;", "Landroidx/compose/ui/autofill/Autofill;", "view", "Landroid/view/View;", "autofillTree", "Landroidx/compose/ui/autofill/AutofillTree;", "(Landroid/view/View;Landroidx/compose/ui/autofill/AutofillTree;)V", "autofillManager", "Landroid/view/autofill/AutofillManager;", "getAutofillManager", "()Landroid/view/autofill/AutofillManager;", "getAutofillTree", "()Landroidx/compose/ui/autofill/AutofillTree;", "getView", "()Landroid/view/View;", "cancelAutofillForNode", "", "autofillNode", "Landroidx/compose/ui/autofill/AutofillNode;", "requestAutofillForNode", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidAutofill implements Autofill {
    private final AutofillManager autofillManager;
    private final AutofillTree autofillTree;
    private final View view;

    public AndroidAutofill(View view0, AutofillTree autofillTree0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(autofillTree0, "autofillTree");
        super();
        this.view = view0;
        this.autofillTree = autofillTree0;
        AutofillManager autofillManager0 = (AutofillManager)view0.getContext().getSystemService(AutofillManager.class);
        if(autofillManager0 == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.autofillManager = autofillManager0;
        view0.setImportantForAutofill(1);
    }

    @Override  // androidx.compose.ui.autofill.Autofill
    public void cancelAutofillForNode(AutofillNode autofillNode0) {
        Intrinsics.checkNotNullParameter(autofillNode0, "autofillNode");
        int v = autofillNode0.getId();
        this.autofillManager.notifyViewExited(this.view, v);
    }

    public final AutofillManager getAutofillManager() {
        return this.autofillManager;
    }

    public final AutofillTree getAutofillTree() {
        return this.autofillTree;
    }

    public final View getView() {
        return this.view;
    }

    @Override  // androidx.compose.ui.autofill.Autofill
    public void requestAutofillForNode(AutofillNode autofillNode0) {
        Intrinsics.checkNotNullParameter(autofillNode0, "autofillNode");
        AutofillManager autofillManager0 = this.autofillManager;
        View view0 = this.view;
        int v = autofillNode0.getId();
        Rect rect0 = autofillNode0.getBoundingBox();
        android.graphics.Rect rect1 = rect0 == null ? null : RectHelper_androidKt.toAndroidRect(rect0);
        if(rect1 == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        autofillManager0.notifyViewEntered(view0, v, rect1);
    }
}

