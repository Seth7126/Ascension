package androidx.activity.compose;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A.\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00062\u0011\u0010\u0007\u001A\r\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0002\b\t¢\u0006\u0002\u0010\n\u001A\f\u0010\u000B\u001A\u00020\u0003*\u00020\u0004H\u0002\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"DefaultActivityContentLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "setContent", "", "Landroidx/activity/ComponentActivity;", "parent", "Landroidx/compose/runtime/CompositionContext;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Landroidx/activity/ComponentActivity;Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setOwners", "activity-compose_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ComponentActivityKt {
    private static final ViewGroup.LayoutParams DefaultActivityContentLayoutParams;

    static {
        ComponentActivityKt.DefaultActivityContentLayoutParams = new ViewGroup.LayoutParams(-2, -2);
    }

    public static final void setContent(ComponentActivity componentActivity0, CompositionContext compositionContext0, Function2 function20) {
        Intrinsics.checkNotNullParameter(componentActivity0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "content");
        View view0 = ((ViewGroup)componentActivity0.getWindow().getDecorView().findViewById(0x1020002)).getChildAt(0);
        ComposeView composeView0 = view0 instanceof ComposeView ? ((ComposeView)view0) : null;
        if(composeView0 != null) {
            composeView0.setParentCompositionContext(compositionContext0);
            composeView0.setContent(function20);
            return;
        }
        ComposeView composeView1 = new ComposeView(componentActivity0, null, 0, 6, null);
        composeView1.setParentCompositionContext(compositionContext0);
        composeView1.setContent(function20);
        ComponentActivityKt.setOwners(componentActivity0);
        componentActivity0.setContentView(composeView1, ComponentActivityKt.DefaultActivityContentLayoutParams);
    }

    public static void setContent$default(ComponentActivity componentActivity0, CompositionContext compositionContext0, Function2 function20, int v, Object object0) {
        if((v & 1) != 0) {
            compositionContext0 = null;
        }
        ComponentActivityKt.setContent(componentActivity0, compositionContext0, function20);
    }

    private static final void setOwners(ComponentActivity componentActivity0) {
        View view0 = componentActivity0.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(view0, "window.decorView");
        if(ViewTreeLifecycleOwner.get(view0) == null) {
            ViewTreeLifecycleOwner.set(view0, componentActivity0);
        }
        if(ViewTreeViewModelStoreOwner.get(view0) == null) {
            ViewTreeViewModelStoreOwner.set(view0, componentActivity0);
        }
        if(ViewTreeSavedStateRegistryOwner.get(view0) == null) {
            ViewTreeSavedStateRegistryOwner.set(view0, componentActivity0);
        }
    }
}

