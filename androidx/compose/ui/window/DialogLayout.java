package androidx.compose.ui.window;

import android.content.Context;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\r\u0010#\u001A\u00020\nH\u0017¢\u0006\u0002\u0010$J5\u0010%\u001A\u00020\n2\u0006\u0010&\u001A\u00020\u00192\u0006\u0010\'\u001A\u00020\u00142\u0006\u0010(\u001A\u00020\u00142\u0006\u0010)\u001A\u00020\u00142\u0006\u0010*\u001A\u00020\u0014H\u0010¢\u0006\u0002\b+J\u001D\u0010,\u001A\u00020\n2\u0006\u0010-\u001A\u00020\u00142\u0006\u0010.\u001A\u00020\u0014H\u0010¢\u0006\u0002\b/J&\u0010\u000F\u001A\u00020\n2\u0006\u00100\u001A\u0002012\u0011\u0010\f\u001A\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000B¢\u0006\u0002\u00102RA\u0010\f\u001A\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000B2\u0011\u0010\b\u001A\r\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\b\u000B8B@BX\u0082\u008E\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0013\u001A\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001A\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0018\u0010\u0016R\u001E\u0010\u001A\u001A\u00020\u00192\u0006\u0010\b\u001A\u00020\u0019@RX\u0094\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001CR\u001A\u0010\u001D\u001A\u00020\u0019X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001C\"\u0004\b\u001F\u0010 R\u0014\u0010\u0005\u001A\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b!\u0010\"¨\u00063"}, d2 = {"Landroidx/compose/ui/window/DialogLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/window/DialogWindowProvider;", "context", "Landroid/content/Context;", "window", "Landroid/view/Window;", "(Landroid/content/Context;Landroid/view/Window;)V", "<set-?>", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "displayHeight", "", "getDisplayHeight", "()I", "displayWidth", "getDisplayWidth", "", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "usePlatformDefaultWidth", "getUsePlatformDefaultWidth", "setUsePlatformDefaultWidth", "(Z)V", "getWindow", "()Landroid/view/Window;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "internalOnLayout", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private final MutableState content$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    static {
    }

    public DialogLayout(Context context0, Window window0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(window0, "window");
        super(context0, null, 0, 6, null);
        this.window = window0;
        this.content$delegate = SnapshotStateKt.mutableStateOf$default(ComposableSingletons.AndroidDialog_androidKt.INSTANCE.getLambda-1$ui_release(), null, 2, null);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(0x9EF28B94);
        ComposerKt.sourceInformation(composer1, "C(Content)251@9454L9:AndroidDialog.android.kt#2oxthz");
        this.getContent().invoke(composer1, 0);
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(v) {
                final int $$changed;
                final DialogLayout $tmp0_rcvr;

                {
                    this.$tmp0_rcvr = dialogLayout0;
                    this.$$changed = v;
                    super(2);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    this.invoke(((Composer)object0), ((Number)object1).intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer0, int v) {
                    this.$tmp0_rcvr.Content(composer0, this.$$changed | 1);
                }
            });
        }
    }

    private final Function2 getContent() {
        return (Function2)this.content$delegate.getValue();
    }

    private final int getDisplayHeight() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return MathKt.roundToInt(((float)this.getContext().getResources().getConfiguration().screenHeightDp) * f);
    }

    private final int getDisplayWidth() {
        float f = this.getContext().getResources().getDisplayMetrics().density;
        return MathKt.roundToInt(((float)this.getContext().getResources().getConfiguration().screenWidthDp) * f);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    @Override  // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int v, int v1, int v2, int v3) {
        super.internalOnLayout$ui_release(z, v, v1, v2, v3);
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            return;
        }
        this.getWindow().setLayout(view0.getMeasuredWidth(), view0.getMeasuredHeight());
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int v, int v1) {
        if(this.usePlatformDefaultWidth) {
            super.internalOnMeasure$ui_release(v, v1);
            return;
        }
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), 0x80000000), View.MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), 0x80000000));
    }

    private final void setContent(Function2 function20) {
        this.content$delegate.setValue(function20);
    }

    public final void setContent(CompositionContext compositionContext0, Function2 function20) {
        Intrinsics.checkNotNullParameter(compositionContext0, "parent");
        Intrinsics.checkNotNullParameter(function20, "content");
        this.setParentCompositionContext(compositionContext0);
        this.setContent(function20);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.createComposition();
    }

    public final void setUsePlatformDefaultWidth(boolean z) {
        this.usePlatformDefaultWidth = z;
    }
}

