package androidx.compose.ui.platform;

import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/WrapperRenderNodeLayerHelperMethods;", "", "()V", "onDescendantInvalidated", "", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class WrapperRenderNodeLayerHelperMethods {
    public static final WrapperRenderNodeLayerHelperMethods INSTANCE;

    static {
        WrapperRenderNodeLayerHelperMethods.INSTANCE = new WrapperRenderNodeLayerHelperMethods();
    }

    public final void onDescendantInvalidated(AndroidComposeView androidComposeView0) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "ownerView");
        ViewParent viewParent0 = androidComposeView0.getParent();
        if(viewParent0 != null) {
            viewParent0.onDescendantInvalidated(androidComposeView0, androidComposeView0);
        }
    }
}

