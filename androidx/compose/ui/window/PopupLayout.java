package androidx.compose.ui.window;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.KeyEvent.DispatcherState;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager.LayoutParams;
import android.view.WindowManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.R.id;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector.DefaultImpls;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u00B0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002BE\u0012\u000E\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u0011\u00A2\u0006\u0002\u0010\u0012J\r\u0010S\u001A\u00020\u0005H\u0017\u00A2\u0006\u0002\u0010TJ\u0010\u0010U\u001A\u00020\u00052\u0006\u0010V\u001A\u00020#H\u0002J\b\u0010W\u001A\u00020,H\u0002J\u0006\u0010X\u001A\u00020\u0005J\u0010\u0010Y\u001A\u00020\u00142\u0006\u0010Z\u001A\u00020[H\u0016J5\u0010\\\u001A\u00020\u00052\u0006\u0010]\u001A\u00020\u00142\u0006\u0010^\u001A\u00020#2\u0006\u0010_\u001A\u00020#2\u0006\u0010`\u001A\u00020#2\u0006\u0010a\u001A\u00020#H\u0010\u00A2\u0006\u0002\bbJ\u001D\u0010c\u001A\u00020\u00052\u0006\u0010d\u001A\u00020#2\u0006\u0010e\u001A\u00020#H\u0010\u00A2\u0006\u0002\bfJ\u0012\u0010g\u001A\u00020\u00142\b\u0010Z\u001A\u0004\u0018\u00010hH\u0016J\u0010\u0010i\u001A\u00020\u00052\u0006\u0010j\u001A\u00020\u0014H\u0002J&\u0010\u001E\u001A\u00020\u00052\u0006\u0010k\u001A\u00020l2\u0011\u0010\u001B\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u001A\u00A2\u0006\u0002\u0010mJ\u0010\u0010n\u001A\u00020\u00052\u0006\u0010o\u001A\u00020\u0014H\u0002J\u0010\u0010p\u001A\u00020\u00052\u0006\u0010q\u001A\u00020#H\u0016J\u0010\u0010r\u001A\u00020\u00052\u0006\u0010s\u001A\u00020tH\u0002J\u0006\u0010u\u001A\u00020\u0005J\u0010\u0010v\u001A\u00020\u00052\u0006\u0010q\u001A\u000205H\u0002J.\u0010w\u001A\u00020\u00052\u000E\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010q\u001A\u000205J\u0006\u0010x\u001A\u00020\u0005J\f\u0010y\u001A\u00020-*\u00020zH\u0002R\u001B\u0010\u0013\u001A\u00020\u00148FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0015\u0010\u0016R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000RA\u0010\u001B\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u001A2\u0011\u0010\u0019\u001A\r\u0012\u0004\u0012\u00020\u00050\u0004\u00A2\u0006\u0002\b\u001A8B@BX\u0082\u008E\u0002\u00A2\u0006\u0012\n\u0004\b \u0010!\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u0014\u0010\"\u001A\u00020#8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010%R\u0014\u0010&\u001A\u00020#8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\'\u0010%R\u0019\u0010(\u001A\u00020)X\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010*R\u0016\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010+\u001A\u00020,X\u0082\u0004\u00A2\u0006\u0002\n\u0000R/\u0010.\u001A\u0004\u0018\u00010-2\b\u0010\u0019\u001A\u0004\u0018\u00010-8F@FX\u0086\u008E\u0002\u00A2\u0006\u0012\n\u0004\b3\u0010!\u001A\u0004\b/\u00100\"\u0004\b1\u00102R\u001A\u00104\u001A\u000205X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b6\u00107\"\u0004\b8\u00109R8\u0010;\u001A\u0004\u0018\u00010:2\b\u0010\u0019\u001A\u0004\u0018\u00010:8F@FX\u0086\u008E\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0012\n\u0004\b@\u0010!\u001A\u0004\b<\u0010=\"\u0004\b>\u0010?R\u000E\u0010A\u001A\u00020BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010C\u001A\u00020\u000FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001E\u0010H\u001A\u00020\u00142\u0006\u0010\u0019\u001A\u00020\u0014@RX\u0094\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\bI\u0010\u0016R\u0014\u0010J\u001A\u00020\u00018VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bK\u0010LR\u001A\u0010\b\u001A\u00020\tX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bM\u0010N\"\u0004\bO\u0010PR\u000E\u0010Q\u001A\u00020RX\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006{"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "onDismissRequest", "Lkotlin/Function0;", "", "properties", "Landroidx/compose/ui/window/PopupProperties;", "testTag", "", "composeView", "Landroid/view/View;", "density", "Landroidx/compose/ui/unit/Density;", "initialPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "popupId", "Ljava/util/UUID;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/window/PopupProperties;Ljava/lang/String;Landroid/view/View;Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/window/PopupPositionProvider;Ljava/util/UUID;)V", "canCalculatePosition", "", "getCanCalculatePosition", "()Z", "canCalculatePosition$delegate", "Landroidx/compose/runtime/State;", "<set-?>", "Landroidx/compose/runtime/Composable;", "content", "getContent", "()Lkotlin/jvm/functions/Function2;", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "displayHeight", "", "getDisplayHeight", "()I", "displayWidth", "getDisplayWidth", "maxSupportedElevation", "Landroidx/compose/ui/unit/Dp;", "F", "params", "Landroid/view/WindowManager$LayoutParams;", "Landroidx/compose/ui/unit/IntRect;", "parentBounds", "getParentBounds", "()Landroidx/compose/ui/unit/IntRect;", "setParentBounds", "(Landroidx/compose/ui/unit/IntRect;)V", "parentBounds$delegate", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Landroidx/compose/ui/unit/IntSize;", "popupContentSize", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/IntSize;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/IntSize;)V", "popupContentSize$delegate", "popupLayoutHelper", "Landroidx/compose/ui/window/PopupLayoutHelper;", "positionProvider", "getPositionProvider", "()Landroidx/compose/ui/window/PopupPositionProvider;", "setPositionProvider", "(Landroidx/compose/ui/window/PopupPositionProvider;)V", "shouldCreateCompositionOnAttachedToWindow", "getShouldCreateCompositionOnAttachedToWindow", "subCompositionView", "getSubCompositionView", "()Landroidx/compose/ui/platform/AbstractComposeView;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "windowManager", "Landroid/view/WindowManager;", "Content", "(Landroidx/compose/runtime/Composer;I)V", "applyNewFlags", "flags", "createLayoutParams", "dismiss", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "internalOnLayout", "changed", "left", "top", "right", "bottom", "internalOnLayout$ui_release", "internalOnMeasure", "widthMeasureSpec", "heightMeasureSpec", "internalOnMeasure$ui_release", "onTouchEvent", "Landroid/view/MotionEvent;", "setClippingEnabled", "clippingEnabled", "parent", "Landroidx/compose/runtime/CompositionContext;", "(Landroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)V", "setIsFocusable", "isFocusable", "setLayoutDirection", "layoutDirection", "setSecurePolicy", "securePolicy", "Landroidx/compose/ui/window/SecureFlagPolicy;", "show", "superSetLayoutDirection", "updateParameters", "updatePosition", "toIntBounds", "Landroid/graphics/Rect;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
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

    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final float maxSupportedElevation;
    private Function0 onDismissRequest;
    private final WindowManager.LayoutParams params;
    private final MutableState parentBounds$delegate;
    private LayoutDirection parentLayoutDirection;
    private final MutableState popupContentSize$delegate;
    private final PopupLayoutHelper popupLayoutHelper;
    private PopupPositionProvider positionProvider;
    private PopupProperties properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private String testTag;
    private final WindowManager windowManager;

    static {
    }

    public PopupLayout(Function0 function00, PopupProperties popupProperties0, String s, View view0, Density density0, PopupPositionProvider popupPositionProvider0, UUID uUID0) {
        Intrinsics.checkNotNullParameter(popupProperties0, "properties");
        Intrinsics.checkNotNullParameter(s, "testTag");
        Intrinsics.checkNotNullParameter(view0, "composeView");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(popupPositionProvider0, "initialPositionProvider");
        Intrinsics.checkNotNullParameter(uUID0, "popupId");
        Context context0 = view0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "composeView.context");
        super(context0, null, 0, 6, null);
        this.onDismissRequest = function00;
        this.properties = popupProperties0;
        this.testTag = s;
        this.composeView = view0;
        Object object0 = view0.getContext().getSystemService("window");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        this.windowManager = (WindowManager)object0;
        this.params = this.createLayoutParams();
        this.positionProvider = popupPositionProvider0;
        this.parentLayoutDirection = LayoutDirection.Ltr;
        this.parentBounds$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.popupContentSize$delegate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.canCalculatePosition$delegate = SnapshotStateKt.derivedStateOf(new Function0() {
            {
                PopupLayout.this = popupLayout0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return Boolean.valueOf(this.invoke());
            }

            public final boolean invoke() {
                return PopupLayout.this.getParentBounds() != null && PopupLayout.this.getPopupContentSize-bOM6tXw() != null;
            }
        });
        this.maxSupportedElevation = 30.0f;
        PopupLayoutHelper popupLayoutHelper0 = Build.VERSION.SDK_INT >= 29 ? new PopupLayoutHelperImpl29() : new PopupLayoutHelperImpl();
        this.popupLayoutHelper = popupLayoutHelper0;
        this.setId(0x1020002);
        ViewTreeLifecycleOwner.set(this, ViewTreeLifecycleOwner.get(view0));
        ViewTreeViewModelStoreOwner.set(this, ViewTreeViewModelStoreOwner.get(view0));
        ViewTreeSavedStateRegistryOwner.set(this, ViewTreeSavedStateRegistryOwner.get(view0));
        this.setTag(id.compose_view_saveable_id_tag, "Popup:" + uUID0);
        this.setClipChildren(false);
        this.setElevation(density0.toPx-0680j_4(30.0f));
        this.setOutlineProvider(new androidx.compose.ui.window.PopupLayout.2());
        this.content$delegate = SnapshotStateKt.mutableStateOf$default(ComposableSingletons.AndroidPopup_androidKt.INSTANCE.getLambda-1$ui_release(), null, 2, null);

        @Metadata(d1 = {"\u0000\u001D\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/window/PopupLayout$2", "Landroid/view/ViewOutlineProvider;", "getOutline", "", "view", "Landroid/view/View;", "result", "Landroid/graphics/Outline;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public final class androidx.compose.ui.window.PopupLayout.2 extends ViewOutlineProvider {
            @Override  // android.view.ViewOutlineProvider
            public void getOutline(View view0, Outline outline0) {
                Intrinsics.checkNotNullParameter(view0, "view");
                Intrinsics.checkNotNullParameter(outline0, "result");
                outline0.setRect(0, 0, view0.getWidth(), view0.getHeight());
                outline0.setAlpha(0.0f);
            }
        }

    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void Content(Composer composer0, int v) {
        Composer composer1 = composer0.startRestartGroup(-1107815806);
        ComposerKt.sourceInformation(composer1, "C(Content)432@17238L9:AndroidPopup.android.kt#2oxthz");
        this.getContent().invoke(composer1, 0);
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new Function2(v) {
                final int $$changed;
                final PopupLayout $tmp0_rcvr;

                {
                    this.$tmp0_rcvr = popupLayout0;
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

    private final void applyNewFlags(int v) {
        this.params.flags = v;
        this.windowManager.updateViewLayout(this, this.params);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams windowManager$LayoutParams0 = new WindowManager.LayoutParams();
        windowManager$LayoutParams0.gravity = 0x800033;
        windowManager$LayoutParams0.flags |= 0x40000;
        windowManager$LayoutParams0.type = 1000;
        windowManager$LayoutParams0.token = this.composeView.getApplicationWindowToken();
        windowManager$LayoutParams0.width = -2;
        windowManager$LayoutParams0.height = -2;
        windowManager$LayoutParams0.format = -3;
        return windowManager$LayoutParams0;
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.windowManager.removeViewImmediate(this);
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchKeyEvent(KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "event");
        if(keyEvent0.getKeyCode() != 4 || !this.properties.getDismissOnBackPress() || this.getKeyDispatcherState() == null) {
            return super.dispatchKeyEvent(keyEvent0);
        }
        if(keyEvent0.getAction() == 0 && keyEvent0.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyEvent$DispatcherState0 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState0 != null) {
                keyEvent$DispatcherState0.startTracking(keyEvent0, this);
            }
            return true;
        }
        if(keyEvent0.getAction() == 1) {
            KeyEvent.DispatcherState keyEvent$DispatcherState1 = this.getKeyDispatcherState();
            if(keyEvent$DispatcherState1 != null && keyEvent$DispatcherState1.isTracking(keyEvent0) && !keyEvent0.isCanceled()) {
                Function0 function00 = this.onDismissRequest;
                if(function00 != null) {
                    function00.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent0);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean)this.canCalculatePosition$delegate.getValue()).booleanValue();
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

    public final IntRect getParentBounds() {
        return (IntRect)this.parentBounds$delegate.getValue();
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public final IntSize getPopupContentSize-bOM6tXw() {
        return (IntSize)this.popupContentSize$delegate.getValue();
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override  // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return DefaultImpls.getViewRoot(this);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z, int v, int v1, int v2, int v3) {
        super.internalOnLayout$ui_release(z, v, v1, v2, v3);
        View view0 = this.getChildAt(0);
        if(view0 == null) {
            return;
        }
        this.params.width = view0.getMeasuredWidth();
        this.params.height = view0.getMeasuredHeight();
        this.windowManager.updateViewLayout(this, this.params);
    }

    @Override  // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int v, int v1) {
        if(this.properties.getUsePlatformDefaultWidth()) {
            super.internalOnMeasure$ui_release(v, v1);
            return;
        }
        super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(this.getDisplayWidth(), 0x80000000), View.MeasureSpec.makeMeasureSpec(this.getDisplayHeight(), 0x80000000));
    }

    @Override  // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent0) {
        boolean z;
        if(!this.properties.getDismissOnClickOutside()) {
            return super.onTouchEvent(motionEvent0);
        }
        if(motionEvent0 == null) {
            z = false;
        }
        else if(motionEvent0.getAction() == 0) {
            z = true;
        }
        else {
            z = false;
        }
        if(z && (motionEvent0.getX() < 0.0f || motionEvent0.getX() >= ((float)this.getWidth()) || motionEvent0.getY() < 0.0f || motionEvent0.getY() >= ((float)this.getHeight()))) {
            Function0 function00 = this.onDismissRequest;
            if(function00 != null) {
                function00.invoke();
            }
            return true;
        }
        if(motionEvent0 != null && motionEvent0.getAction() == 4) {
            Function0 function01 = this.onDismissRequest;
            if(function01 != null) {
                function01.invoke();
            }
            return true;
        }
        return super.onTouchEvent(motionEvent0);
    }

    private final void setClippingEnabled(boolean z) {
        this.applyNewFlags((z ? this.params.flags & 0xFFFFFDFF : this.params.flags | 0x200));
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
    }

    private final void setIsFocusable(boolean z) {
        this.applyNewFlags((z ? this.params.flags & -9 : this.params.flags | 8));
    }

    @Override  // android.view.View
    public void setLayoutDirection(int v) {
    }

    public final void setParentBounds(IntRect intRect0) {
        this.parentBounds$delegate.setValue(intRect0);
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "<set-?>");
        this.parentLayoutDirection = layoutDirection0;
    }

    public final void setPopupContentSize-fhxjrPA(IntSize intSize0) {
        this.popupContentSize$delegate.setValue(intSize0);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider0) {
        Intrinsics.checkNotNullParameter(popupPositionProvider0, "<set-?>");
        this.positionProvider = popupPositionProvider0;
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy0) {
        this.applyNewFlags((SecureFlagPolicy_androidKt.shouldApplySecureFlag(secureFlagPolicy0, AndroidPopup_androidKt.isFlagSecureEnabled(this.composeView)) ? this.params.flags | 0x2000 : this.params.flags & 0xFFFFDFFF));
    }

    public final void setTestTag(String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.testTag = s;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection0) {
        switch(layoutDirection0) {
            case 1: 
            case 2: {
                return;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final IntRect toIntBounds(Rect rect0) {
        return new IntRect(rect0.left, rect0.top, rect0.right, rect0.bottom);
    }

    public final void updateParameters(Function0 function00, PopupProperties popupProperties0, String s, LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(popupProperties0, "properties");
        Intrinsics.checkNotNullParameter(s, "testTag");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        this.onDismissRequest = function00;
        this.properties = popupProperties0;
        this.testTag = s;
        this.setIsFocusable(popupProperties0.getFocusable());
        this.setSecurePolicy(popupProperties0.getSecurePolicy());
        this.setClippingEnabled(popupProperties0.getClippingEnabled());
        this.superSetLayoutDirection(layoutDirection0);
    }

    public final void updatePosition() {
        IntRect intRect0 = this.getParentBounds();
        if(intRect0 == null) {
            return;
        }
        IntSize intSize0 = this.getPopupContentSize-bOM6tXw();
        if(intSize0 == null) {
            return;
        }
        Rect rect0 = new Rect();
        this.composeView.getWindowVisibleDisplayFrame(rect0);
        IntRect intRect1 = this.toIntBounds(rect0);
        long v = IntSizeKt.IntSize(intRect1.getWidth(), intRect1.getHeight());
        long v1 = this.positionProvider.calculatePosition-llwVHH4(intRect0, v, this.parentLayoutDirection, intSize0.unbox-impl());
        this.params.x = (int)(v1 >> 0x20);
        this.params.y = (int)(v1 & 0xFFFFFFFFL);
        if(this.properties.getExcludeFromSystemGesture()) {
            this.popupLayoutHelper.setGestureExclusionRects(this, ((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)));
        }
        this.windowManager.updateViewLayout(this, this.params);
    }
}

