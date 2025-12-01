package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector.DefaultImpls;
import androidx.compose.ui.platform.ViewRootForInspector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR@\u0010\f\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000B2\u0014\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000B@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001E\u0010\u0011\u001A\u0004\u0018\u00018\u0000X\u0080\u000E¢\u0006\u0010\n\u0002\u0010\u0016\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R<\u0010\u0018\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u000B2\u0012\u0010\n\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170\u000B@FX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u000E\"\u0004\b\u001A\u0010\u0010R\u0016\u0010\u001B\u001A\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u0013¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "T", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "context", "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;)V", "value", "Lkotlin/Function1;", "factory", "getFactory", "()Lkotlin/jvm/functions/Function1;", "setFactory", "(Lkotlin/jvm/functions/Function1;)V", "typedView", "getTypedView$ui_release", "()Landroid/view/View;", "setTypedView$ui_release", "(Landroid/view/View;)V", "Landroid/view/View;", "", "updateBlock", "getUpdateBlock", "setUpdateBlock", "viewRoot", "getViewRoot", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ViewFactoryHolder extends AndroidViewHolder implements ViewRootForInspector {
    private Function1 factory;
    private View typedView;
    private Function1 updateBlock;

    public ViewFactoryHolder(Context context0, CompositionContext compositionContext0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, compositionContext0);
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public ViewFactoryHolder(Context context0, CompositionContext compositionContext0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            compositionContext0 = null;
        }
        this(context0, compositionContext0);
    }

    public final Function1 getFactory() {
        return this.factory;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return DefaultImpls.getSubCompositionView(this);
    }

    public final View getTypedView$ui_release() {
        return this.typedView;
    }

    public final Function1 getUpdateBlock() {
        return this.updateBlock;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        ViewParent viewParent0 = this.getParent();
        return viewParent0 instanceof View ? ((View)viewParent0) : null;
    }

    public final void setFactory(Function1 function10) {
        this.factory = function10;
        if(function10 != null) {
            Context context0 = this.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "context");
            View view0 = (View)function10.invoke(context0);
            this.typedView = view0;
            this.setView$ui_release(view0);
        }
    }

    public final void setTypedView$ui_release(View view0) {
        this.typedView = view0;
    }

    public final void setUpdateBlock(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "value");
        this.updateBlock = function10;
        this.setUpdate(new Function0() {
            {
                ViewFactoryHolder.this = viewFactoryHolder0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                View view0 = ViewFactoryHolder.this.getTypedView$ui_release();
                if(view0 != null) {
                    ViewFactoryHolder.this.getUpdateBlock().invoke(view0);
                }
            }
        });
    }
}

