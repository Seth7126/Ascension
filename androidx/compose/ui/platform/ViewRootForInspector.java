package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001A\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001A\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/ViewRootForInspector;", "", "subCompositionView", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "viewRoot", "Landroid/view/View;", "getViewRoot", "()Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ViewRootForInspector {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static AbstractComposeView getSubCompositionView(ViewRootForInspector viewRootForInspector0) {
            Intrinsics.checkNotNullParameter(viewRootForInspector0, "this");
            return null;
        }

        public static View getViewRoot(ViewRootForInspector viewRootForInspector0) {
            Intrinsics.checkNotNullParameter(viewRootForInspector0, "this");
            return null;
        }
    }

    AbstractComposeView getSubCompositionView();

    View getViewRoot();
}

