package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001E\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\bJ\r\u0010&\u001A\u00020\u0011H\'\u00A2\u0006\u0002\u0010\'J\u0012\u0010(\u001A\u00020\u00112\b\u0010)\u001A\u0004\u0018\u00010*H\u0016J\u001C\u0010(\u001A\u00020\u00112\b\u0010)\u001A\u0004\u0018\u00010*2\b\u0010+\u001A\u0004\u0018\u00010,H\u0016J\u001A\u0010(\u001A\u00020\u00112\b\u0010)\u001A\u0004\u0018\u00010*2\u0006\u0010-\u001A\u00020\u0007H\u0016J$\u0010(\u001A\u00020\u00112\b\u0010)\u001A\u0004\u0018\u00010*2\u0006\u0010-\u001A\u00020\u00072\b\u0010+\u001A\u0004\u0018\u00010,H\u0016J\"\u0010(\u001A\u00020\u00112\b\u0010)\u001A\u0004\u0018\u00010*2\u0006\u0010.\u001A\u00020\u00072\u0006\u0010/\u001A\u00020\u0007H\u0016J$\u00100\u001A\u00020\u000E2\b\u0010)\u001A\u0004\u0018\u00010*2\u0006\u0010-\u001A\u00020\u00072\b\u0010+\u001A\u0004\u0018\u00010,H\u0014J,\u00100\u001A\u00020\u000E2\b\u0010)\u001A\u0004\u0018\u00010*2\u0006\u0010-\u001A\u00020\u00072\b\u0010+\u001A\u0004\u0018\u00010,2\u0006\u00101\u001A\u00020\u000EH\u0014J\b\u00102\u001A\u00020\u0011H\u0002J\u0006\u00103\u001A\u00020\u0011J\u0006\u00104\u001A\u00020\u0011J\b\u00105\u001A\u00020\u0011H\u0002J5\u00106\u001A\u00020\u00112\u0006\u00107\u001A\u00020\u000E2\u0006\u00108\u001A\u00020\u00072\u0006\u00109\u001A\u00020\u00072\u0006\u0010:\u001A\u00020\u00072\u0006\u0010;\u001A\u00020\u0007H\u0010\u00A2\u0006\u0002\b<J\u001D\u0010=\u001A\u00020\u00112\u0006\u0010>\u001A\u00020\u00072\u0006\u0010?\u001A\u00020\u0007H\u0010\u00A2\u0006\u0002\b@J\b\u0010A\u001A\u00020\u0011H\u0014J0\u0010B\u001A\u00020\u00112\u0006\u00107\u001A\u00020\u000E2\u0006\u00108\u001A\u00020\u00072\u0006\u00109\u001A\u00020\u00072\u0006\u0010:\u001A\u00020\u00072\u0006\u0010;\u001A\u00020\u0007H\u0004J\u0018\u0010C\u001A\u00020\u00112\u0006\u0010>\u001A\u00020\u00072\u0006\u0010?\u001A\u00020\u0007H\u0004J\u0010\u0010D\u001A\u00020\u00112\u0006\u0010E\u001A\u00020\u0007H\u0016J\b\u0010F\u001A\u00020\nH\u0002J\u0010\u0010G\u001A\u00020\u00112\b\u0010H\u001A\u0004\u0018\u00010\nJ\u000E\u0010I\u001A\u00020\u00112\u0006\u0010J\u001A\u00020KR\u0010\u0010\t\u001A\u0004\u0018\u00010\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u000EX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010\u000F\u001A\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0082\u000E\u00A2\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001A\u0004\u0018\u00010\n2\b\u0010\u0017\u001A\u0004\u0018\u00010\n@BX\u0082\u000E\u00A2\u0006\b\n\u0000\"\u0004\b\u0019\u0010\u001AR\"\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\b\u0010\u0017\u001A\u0004\u0018\u00010\u001B@BX\u0082\u000E\u00A2\u0006\b\n\u0000\"\u0004\b\u001D\u0010\u001ER\u0014\u0010\u001F\u001A\u00020\u000E8TX\u0094\u0004\u00A2\u0006\u0006\u001A\u0004\b \u0010\u0016R,\u0010!\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\u000E8\u0006@FX\u0087\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0013\u001A\u0004\b#\u0010\u0016\"\u0004\b$\u0010%\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "cachedViewTreeCompositionContext", "Landroidx/compose/runtime/CompositionContext;", "composition", "Landroidx/compose/runtime/Composition;", "creatingComposition", "", "disposeViewCompositionStrategy", "Lkotlin/Function0;", "", "getDisposeViewCompositionStrategy$annotations", "()V", "hasComposition", "getHasComposition", "()Z", "value", "parentContext", "setParentContext", "(Landroidx/compose/runtime/CompositionContext;)V", "Landroid/os/IBinder;", "previousAttachedWindowToken", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "showLayoutBounds", "getShowLayoutBounds$annotations", "getShowLayoutBounds", "setShowLayoutBounds", "(Z)V", "Content", "(Landroidx/compose/runtime/Composer;I)V", "addView", "child", "Landroid/view/View;", "params", "Landroid/view/ViewGroup$LayoutParams;", "index", "width", "height", "addViewInLayout", "preventRequestLayout", "checkAddView", "createComposition", "disposeComposition", "ensureCompositionCreated", "internalOnLayout", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "onAttachedToWindow", "onLayout", "onMeasure", "onRtlPropertiesChanged", "layoutDirection", "resolveParentCompositionContext", "setParentCompositionContext", "parent", "setViewCompositionStrategy", "strategy", "Landroidx/compose/ui/platform/ViewCompositionStrategy;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private CompositionContext cachedViewTreeCompositionContext;
    private Composition composition;
    private boolean creatingComposition;
    private Function0 disposeViewCompositionStrategy;
    private CompositionContext parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    static {
    }

    public AbstractComposeView(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public AbstractComposeView(Context context0, AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public AbstractComposeView(Context context0, AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.setClipChildren(false);
        this.setClipToPadding(false);
        this.disposeViewCompositionStrategy = DisposeOnDetachedFromWindow.INSTANCE.installFor(this);
    }

    public AbstractComposeView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    public abstract void Content(Composer arg1, int arg2);

    @Override  // android.view.ViewGroup
    public void addView(View view0) {
        this.checkAddView();
        super.addView(view0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v) {
        this.checkAddView();
        super.addView(view0, v);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, int v1) {
        this.checkAddView();
        super.addView(view0, v, v1);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.checkAddView();
        super.addView(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    public void addView(View view0, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.checkAddView();
        super.addView(view0, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected boolean addViewInLayout(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0) {
        this.checkAddView();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0);
    }

    @Override  // android.view.ViewGroup
    protected boolean addViewInLayout(View view0, int v, ViewGroup.LayoutParams viewGroup$LayoutParams0, boolean z) {
        this.checkAddView();
        return super.addViewInLayout(view0, v, viewGroup$LayoutParams0, z);
    }

    private final void checkAddView() {
        if(!this.creatingComposition) {
            throw new UnsupportedOperationException("Cannot add views to " + this.getClass().getSimpleName() + "; only Compose content is supported");
        }
    }

    public final void createComposition() {
        if(this.parentContext == null && !this.isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        this.ensureCompositionCreated();
    }

    public final void disposeComposition() {
        Composition composition0 = this.composition;
        if(composition0 != null) {
            composition0.dispose();
        }
        this.composition = null;
        this.requestLayout();
    }

    private final void ensureCompositionCreated() {
        if(this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.setContent(this, this.resolveParentCompositionContext(), ComposableLambdaKt.composableLambdaInstance(0xC541D49B, true, new Function2() {
                    {
                        AbstractComposeView.this = abstractComposeView0;
                        super(2);
                    }

                    @Override  // kotlin.jvm.functions.Function2
                    public Object invoke(Object object0, Object object1) {
                        this.invoke(((Composer)object0), ((Number)object1).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer0, int v) {
                        ComposerKt.sourceInformation(composer0, "C227@9710L9:ComposeView.android.kt#itgzvw");
                        if((v & 11 ^ 2) == 0 && composer0.getSkipping()) {
                            composer0.skipToGroupEnd();
                            return;
                        }
                        AbstractComposeView.this.Content(composer0, 8);
                    }
                }));
                this.creatingComposition = false;
            }
            catch(Throwable throwable0) {
                this.creatingComposition = false;
                throw throwable0;
            }
        }
    }

    private static void getDisposeViewCompositionStrategy$annotations() {
    }

    public final boolean getHasComposition() {
        return this.composition != null;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    @InternalComposeUiApi
    public static void getShowLayoutBounds$annotations() {
    }

    public void internalOnLayout$ui_release(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.layout(this.getPaddingLeft(), this.getPaddingTop(), v2 - v - this.getPaddingRight(), v3 - v1 - this.getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int v, int v1) {
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            super.onMeasure(v, v1);
            return;
        }
        int v2 = Math.max(0, View.MeasureSpec.getSize(v) - this.getPaddingLeft() - this.getPaddingRight());
        int v3 = Math.max(0, View.MeasureSpec.getSize(v1) - this.getPaddingTop() - this.getPaddingBottom());
        view0.measure(View.MeasureSpec.makeMeasureSpec(v2, View.MeasureSpec.getMode(v)), View.MeasureSpec.makeMeasureSpec(v3, View.MeasureSpec.getMode(v1)));
        this.setMeasuredDimension(view0.getMeasuredWidth() + this.getPaddingLeft() + this.getPaddingRight(), view0.getMeasuredHeight() + this.getPaddingTop() + this.getPaddingBottom());
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setPreviousAttachedWindowToken(this.getWindowToken());
        if(this.getShouldCreateCompositionOnAttachedToWindow()) {
            this.ensureCompositionCreated();
        }
    }

    @Override  // android.view.ViewGroup
    protected final void onLayout(boolean z, int v, int v1, int v2, int v3) {
        this.internalOnLayout$ui_release(z, v, v1, v2, v3);
    }

    @Override  // android.view.View
    protected final void onMeasure(int v, int v1) {
        this.ensureCompositionCreated();
        this.internalOnMeasure$ui_release(v, v1);
    }

    @Override  // android.view.View
    public void onRtlPropertiesChanged(int v) {
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            view0.setLayoutDirection(v);
        }
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext0 = this.parentContext;
        if(compositionContext0 == null) {
            CompositionContext compositionContext1 = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            if(compositionContext1 == null) {
                compositionContext1 = null;
            }
            else {
                this.cachedViewTreeCompositionContext = compositionContext1;
            }
            if(compositionContext1 == null) {
                compositionContext1 = this.cachedViewTreeCompositionContext;
                if(compositionContext1 == null) {
                    compositionContext0 = WindowRecomposer_androidKt.getWindowRecomposer(this);
                    this.cachedViewTreeCompositionContext = compositionContext0;
                    return compositionContext0;
                }
            }
            return compositionContext1;
        }
        return compositionContext0;
    }

    public final void setParentCompositionContext(CompositionContext compositionContext0) {
        this.setParentContext(compositionContext0);
    }

    private final void setParentContext(CompositionContext compositionContext0) {
        if(this.parentContext != compositionContext0) {
            this.parentContext = compositionContext0;
            if(compositionContext0 != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition0 = this.composition;
            if(composition0 != null) {
                composition0.dispose();
                this.composition = null;
                if(this.isAttachedToWindow()) {
                    this.ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder0) {
        if(this.previousAttachedWindowToken != iBinder0) {
            this.previousAttachedWindowToken = iBinder0;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        View view0 = this.getChildAt(0);
        if(view0 != null) {
            ((Owner)view0).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy0) {
        Intrinsics.checkNotNullParameter(viewCompositionStrategy0, "strategy");
        Function0 function00 = this.disposeViewCompositionStrategy;
        if(function00 != null) {
            function00.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy0.installFor(this);
    }
}

