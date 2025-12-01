package androidx.compose.ui.window;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Outline;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.R.id;
import androidx.compose.ui.R.style;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector.DefaultImpls;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B;\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F¢\u0006\u0002\u0010\u0010J\b\u0010\u001A\u001A\u00020\u0005H\u0016J\u0006\u0010\u001B\u001A\u00020\u0005J\b\u0010\u001C\u001A\u00020\u0005H\u0016J\u0010\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020 H\u0016J&\u0010!\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020#2\u0011\u0010$\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b%¢\u0006\u0002\u0010&J\u0010\u0010\'\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\u000BH\u0002J\u0010\u0010(\u001A\u00020\u00052\u0006\u0010)\u001A\u00020*H\u0002J$\u0010+\u001A\u00020\u00052\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\u000BR\u000E\u0010\b\u001A\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0013\u001A\u00020\u0014X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0015R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001A\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0019\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/ui/window/DialogWrapper;", "Landroid/app/Dialog;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "onDismissRequest", "Lkotlin/Function0;", "", "properties", "Landroidx/compose/ui/window/DialogProperties;", "composeView", "Landroid/view/View;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "dialogId", "Ljava/util/UUID;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/DialogProperties;Landroid/view/View;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;Ljava/util/UUID;)V", "dialogLayout", "Landroidx/compose/ui/window/DialogLayout;", "maxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "subCompositionView", "Landroidx/compose/ui/platform/AbstractComposeView;", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "cancel", "disposeComposition", "onBackPressed", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setContent", "parentComposition", "Landroidx/compose/runtime/CompositionContext;", "children", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setLayoutDirection", "setSecurePolicy", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "updateParameters", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DialogWrapper extends Dialog implements ViewRootForInspector {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private final View composeView;
    private final DialogLayout dialogLayout;
    private final float maxSupportedElevation;
    private Function0 onDismissRequest;
    private DialogProperties properties;

    public DialogWrapper(Function0 function00, DialogProperties dialogProperties0, View view0, LayoutDirection layoutDirection0, Density density0, UUID uUID0) {
        Intrinsics.checkNotNullParameter(function00, "onDismissRequest");
        Intrinsics.checkNotNullParameter(dialogProperties0, "properties");
        Intrinsics.checkNotNullParameter(view0, "composeView");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(uUID0, "dialogId");
        super(new ContextThemeWrapper(view0.getContext(), style.DialogWindowTheme));
        this.onDismissRequest = function00;
        this.properties = dialogProperties0;
        this.composeView = view0;
        this.maxSupportedElevation = 30.0f;
        Window window0 = this.getWindow();
        if(window0 == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window0.requestFeature(1);
        window0.setBackgroundDrawableResource(0x106000D);
        Context context0 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "context");
        DialogLayout dialogLayout0 = new DialogLayout(context0, window0);
        dialogLayout0.setTag(id.compose_view_saveable_id_tag, "Dialog:" + uUID0);
        dialogLayout0.setClipChildren(false);
        dialogLayout0.setElevation(density0.toPx-0680j_4(30.0f));
        dialogLayout0.setOutlineProvider(new androidx.compose.ui.window.DialogWrapper.1.2());
        this.dialogLayout = dialogLayout0;
        View view1 = window0.getDecorView();
        ViewGroup viewGroup0 = view1 instanceof ViewGroup ? ((ViewGroup)view1) : null;
        if(viewGroup0 != null) {
            DialogWrapper._init_$disableClipping(viewGroup0);
        }
        this.setContentView(dialogLayout0);
        ViewTreeLifecycleOwner.set(dialogLayout0, ViewTreeLifecycleOwner.get(view0));
        ViewTreeViewModelStoreOwner.set(dialogLayout0, ViewTreeViewModelStoreOwner.get(view0));
        ViewTreeSavedStateRegistryOwner.set(dialogLayout0, ViewTreeSavedStateRegistryOwner.get(view0));
        this.updateParameters(this.onDismissRequest, this.properties, layoutDirection0);

        @Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/window/DialogWrapper$1$2", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "result", "Landroid/graphics/Outline;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public final class androidx.compose.ui.window.DialogWrapper.1.2 extends ViewOutlineProvider {
            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                Intrinsics.checkNotNullParameter(view0, "view");
                Intrinsics.checkNotNullParameter(outline0, "result");
                outline0.setRect(0, 0, view0.getWidth(), view0.getHeight());
                outline0.setAlpha(0.0f);
            }
        }

    }

    private static final void _init_$disableClipping(ViewGroup viewGroup0) {
        viewGroup0.setClipChildren(false);
        if(viewGroup0 instanceof DialogLayout) {
            return;
        }
        int v1 = viewGroup0.getChildCount();
        if(v1 > 0) {
            for(int v = 0; true; ++v) {
                View view0 = viewGroup0.getChildAt(v);
                ViewGroup viewGroup1 = view0 instanceof ViewGroup ? ((ViewGroup)view0) : null;
                if(viewGroup1 != null) {
                    DialogWrapper._init_$disableClipping(viewGroup1);
                }
                if(v + 1 >= v1) {
                    break;
                }
            }
        }
    }

    @Override  // android.app.Dialog
    public void cancel() {
    }

    public final void disposeComposition() {
        this.dialogLayout.disposeComposition();
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this.dialogLayout;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return DefaultImpls.getViewRoot(this);
    }

    @Override  // android.app.Dialog
    public void onBackPressed() {
        if(this.properties.getDismissOnBackPress()) {
            this.onDismissRequest.invoke();
        }
    }

    @Override  // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        Intrinsics.checkNotNullParameter(motionEvent0, "event");
        boolean z = super.onTouchEvent(motionEvent0);
        if(z && this.properties.getDismissOnClickOutside()) {
            this.onDismissRequest.invoke();
        }
        return z;
    }

    public final void setContent(CompositionContext compositionContext0, Function2 function20) {
        Intrinsics.checkNotNullParameter(compositionContext0, "parentComposition");
        Intrinsics.checkNotNullParameter(function20, "children");
        this.dialogLayout.setContent(compositionContext0, function20);
    }

    private final void setLayoutDirection(LayoutDirection layoutDirection0) {
        DialogLayout dialogLayout0 = this.dialogLayout;
        int v = WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()];
        int v1 = 1;
        if(v == 1) {
            v1 = 0;
        }
        else if(v != 2) {
            throw new NoWhenBranchMatchedException();
        }
        dialogLayout0.setLayoutDirection(v1);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy0) {
        boolean z = SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy0, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView));
        Window window0 = this.getWindow();
        Intrinsics.checkNotNull(window0);
        window0.setFlags((z ? 0x2000 : 0xFFFFDFFF), 0x2000);
    }

    public final void updateParameters(Function0 function00, DialogProperties dialogProperties0, LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(function00, "onDismissRequest");
        Intrinsics.checkNotNullParameter(dialogProperties0, "properties");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        this.onDismissRequest = function00;
        this.properties = dialogProperties0;
        this.setSecurePolicy(dialogProperties0.getSecurePolicy());
        this.setLayoutDirection(layoutDirection0);
        this.dialogLayout.setUsePlatformDefaultWidth(dialogProperties0.getUsePlatformDefaultWidth());
    }
}

