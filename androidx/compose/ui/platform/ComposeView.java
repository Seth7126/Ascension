package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0015\u001A\u00020\fH\u0017¢\u0006\u0002\u0010\u0016J\u001E\u0010\u0017\u001A\u00020\f2\u0011\u0010\t\u001A\r\u0012\u0004\u0012\u00020\f0\u000B¢\u0006\u0002\b\r¢\u0006\u0002\u0010\u0018R!\u0010\t\u001A\u0015\u0012\u0011\u0012\u000F\u0012\u0004\u0012\u00020\f\u0018\u00010\u000B¢\u0006\u0002\b\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000E\u001A\u00020\u000F@RX\u0094\u000E¢\u0006\u000E\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "content", "Landroidx/compose/runtime/MutableState;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "<set-?>", "", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "Content", "(Landroidx/compose/runtime/Composer;I)V", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private final MutableState content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    static {
    }

    public ComposeView(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, null, 0, 6, null);
    }

    public ComposeView(Context context0, AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        this(context0, attributeSet0, 0, 4, null);
    }

    public ComposeView(Context context0, AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.content = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public ComposeView(Context context0, AttributeSet attributeSet0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            attributeSet0 = null;
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        this(context0, attributeSet0, v);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(2083048521);
        ComposerKt.sourceInformation(composer1, "C(Content):ComposeView.android.kt#itgzvw");
        Function2 function20 = (Function2)this.content.getValue();
        if(function20 == null) {
            composer1.startReplaceableGroup(0x8F0C191);
        }
        else {
            composer1.startReplaceableGroup(2083048560);
            ComposerKt.sourceInformation(composer1, "383@15056L8");
            function20.invoke(composer1, 0);
        }
        composer1.endReplaceableGroup();
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(v) {
                final int $$changed;
                final ComposeView $tmp0_rcvr;

                {
                    this.$tmp0_rcvr = composeView0;
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

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    protected static void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    public final void setContent(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "content");
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(function20);
        if(this.isAttachedToWindow()) {
            this.createComposition();
        }
    }
}

