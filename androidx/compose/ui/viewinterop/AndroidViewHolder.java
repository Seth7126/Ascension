package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Region;
import android.os.Looper;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope.DefaultImpls;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.ObjectRef;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b \u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u00A2\u0006\u0002\u0010\u0006J\u0012\u0010<\u001A\u00020\u000F2\b\u0010=\u001A\u0004\u0018\u00010>H\u0016J\n\u0010?\u001A\u0004\u0018\u00010@H\u0016J\u001E\u0010A\u001A\u0004\u0018\u00010B2\b\u0010\u0017\u001A\u0004\u0018\u00010\u00182\b\u0010C\u001A\u0004\u0018\u00010DH\u0016J \u0010E\u001A\u00020\u00112\u0006\u0010F\u001A\u00020\u00112\u0006\u0010G\u001A\u00020\u00112\u0006\u0010H\u001A\u00020\u0011H\u0002J\b\u0010I\u001A\u00020!H\u0014J\u0018\u0010J\u001A\u00020!2\u0006\u0010K\u001A\u0002062\u0006\u0010L\u001A\u000206H\u0016J\b\u0010M\u001A\u00020!H\u0014J0\u0010N\u001A\u00020!2\u0006\u0010O\u001A\u00020\u000F2\u0006\u0010P\u001A\u00020\u00112\u0006\u0010Q\u001A\u00020\u00112\u0006\u0010R\u001A\u00020\u00112\u0006\u0010S\u001A\u00020\u0011H\u0014J\u0018\u0010T\u001A\u00020!2\u0006\u0010U\u001A\u00020\u00112\u0006\u0010V\u001A\u00020\u0011H\u0014J\u0006\u0010W\u001A\u00020!J\u0010\u0010X\u001A\u00020!2\u0006\u0010Y\u001A\u00020\u000FH\u0016R$\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\b@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u000E\u0010\u000E\u001A\u00020\u000FX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0011X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001A\u00020\u0014\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u000E\u0010\u0017\u001A\u00020\u0018X\u0082\u0004\u00A2\u0006\u0002\n\u0000R$\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0007\u001A\u00020\u0019@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001A\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020!0 X\u0082\u0004\u00A2\u0006\u0002\n\u0000R(\u0010\"\u001A\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010\'\u001A\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010$\"\u0004\b)\u0010&R(\u0010*\u001A\u0010\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020!\u0018\u00010 X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b+\u0010$\"\u0004\b,\u0010&R\u0014\u0010-\u001A\b\u0012\u0004\u0012\u00020!0.X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010/\u001A\u000200X\u0082\u0004\u00A2\u0006\u0002\n\u0000R0\u00101\u001A\b\u0012\u0004\u0012\u00020!0.2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020!0.@DX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b2\u00103\"\u0004\b4\u00105R(\u00107\u001A\u0004\u0018\u0001062\b\u0010\u0007\u001A\u0004\u0018\u000106@@X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b8\u00109\"\u0004\b:\u0010;\u00A8\u0006Z"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;)V", "value", "Landroidx/compose/ui/unit/Density;", "density", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "hasUpdateBlock", "", "lastHeightMeasureSpec", "", "lastWidthMeasureSpec", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "location", "", "Landroidx/compose/ui/Modifier;", "modifier", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "onCommitAffectingUpdate", "Lkotlin/Function1;", "", "onDensityChanged", "getOnDensityChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnDensityChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "getOnModifierChanged$ui_release", "setOnModifierChanged$ui_release", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "runUpdate", "Lkotlin/Function0;", "snapshotObserver", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "update", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "view", "getView", "()Landroid/view/View;", "setView$ui_release", "(Landroid/view/View;)V", "gatherTransparentRegion", "region", "Landroid/graphics/Region;", "getLayoutParams", "Landroid/view/ViewGroup$LayoutParams;", "invalidateChildInParent", "Landroid/view/ViewParent;", "dirty", "Landroid/graphics/Rect;", "obtainMeasureSpec", "min", "max", "preferred", "onAttachedToWindow", "onDescendantInvalidated", "child", "target", "onDetachedFromWindow", "onLayout", "changed", "l", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "remeasure", "requestDisallowInterceptTouchEvent", "disallowIntercept", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class AndroidViewHolder extends ViewGroup {
    private Density density;
    private boolean hasUpdateBlock;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private final int[] location;
    private Modifier modifier;
    private final Function1 onCommitAffectingUpdate;
    private Function1 onDensityChanged;
    private Function1 onModifierChanged;
    private Function1 onRequestDisallowInterceptTouchEvent;
    private final Function0 runUpdate;
    private final SnapshotStateObserver snapshotObserver;
    private Function0 update;
    private View view;

    public AndroidViewHolder(Context context0, CompositionContext compositionContext0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        if(compositionContext0 != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext0);
        }
        this.setSaveFromParentEnabled(false);
        this.update = androidx.compose.ui.viewinterop.AndroidViewHolder.update.1.INSTANCE;
        this.modifier = Modifier.Companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.snapshotObserver = new SnapshotStateObserver(new Function1() {
            {
                AndroidViewHolder.this = androidViewHolder0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Function0)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Function0 function00) {
                Intrinsics.checkNotNullParameter(function00, "command");
                if(AndroidViewHolder.this.getHandler().getLooper() == Looper.myLooper()) {
                    function00.invoke();
                    return;
                }
                AndroidViewHolder.this.getHandler().post(new AndroidViewHolder_androidKt.sam.java_lang_Runnable.0(function00));
            }
        });
        this.onCommitAffectingUpdate = new Function1() {
            {
                AndroidViewHolder.this = androidViewHolder0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((AndroidViewHolder)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(AndroidViewHolder androidViewHolder0) {
                Intrinsics.checkNotNullParameter(androidViewHolder0, "it");
                AndroidViewHolder.this.getHandler().post(new AndroidViewHolder_androidKt.sam.java_lang_Runnable.0(AndroidViewHolder.this.runUpdate));
            }
        };
        this.runUpdate = new Function0() {
            {
                AndroidViewHolder.this = androidViewHolder0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                if(AndroidViewHolder.this.hasUpdateBlock) {
                    AndroidViewHolder.this.snapshotObserver.observeReads(AndroidViewHolder.this, AndroidViewHolder.this.onCommitAffectingUpdate, AndroidViewHolder.this.getUpdate());
                }
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = 0x80000000;
        this.lastHeightMeasureSpec = 0x80000000;
        LayoutNode layoutNode0 = new LayoutNode();
        Modifier modifier0 = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(Modifier.Companion, this), new Function1(this) {
            final LayoutNode $layoutNode;

            {
                this.$layoutNode = layoutNode0;
                AndroidViewHolder.this = androidViewHolder0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((DrawScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(DrawScope drawScope0) {
                Intrinsics.checkNotNullParameter(drawScope0, "$this$drawBehind");
                AndroidViewHolder androidViewHolder0 = AndroidViewHolder.this;
                Canvas canvas0 = drawScope0.getDrawContext().getCanvas();
                Owner owner0 = this.$layoutNode.getOwner$ui_release();
                AndroidComposeView androidComposeView0 = owner0 instanceof AndroidComposeView ? ((AndroidComposeView)owner0) : null;
                if(androidComposeView0 != null) {
                    androidComposeView0.drawAndroidView(androidViewHolder0, AndroidCanvas_androidKt.getNativeCanvas(canvas0));
                }
            }
        }), new Function1(layoutNode0) {
            final LayoutNode $layoutNode;
            final AndroidViewHolder $this_run;

            {
                this.$this_run = androidViewHolder0;
                this.$layoutNode = layoutNode0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((LayoutCoordinates)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(LayoutCoordinates layoutCoordinates0) {
                Intrinsics.checkNotNullParameter(layoutCoordinates0, "it");
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, this.$layoutNode);
            }
        });
        layoutNode0.setModifier(this.getModifier().then(modifier0));
        this.setOnModifierChanged$ui_release(new Function1(modifier0) {
            final Modifier $coreModifier;
            final LayoutNode $layoutNode;

            {
                this.$layoutNode = layoutNode0;
                this.$coreModifier = modifier0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Modifier)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Modifier modifier0) {
                Intrinsics.checkNotNullParameter(modifier0, "it");
                Modifier modifier1 = modifier0.then(this.$coreModifier);
                this.$layoutNode.setModifier(modifier1);
            }
        });
        layoutNode0.setDensity(this.getDensity());
        this.setOnDensityChanged$ui_release(new Function1() {
            final LayoutNode $layoutNode;

            {
                this.$layoutNode = layoutNode0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Density)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Density density0) {
                Intrinsics.checkNotNullParameter(density0, "it");
                this.$layoutNode.setDensity(density0);
            }
        });
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        layoutNode0.setOnAttach$ui_release(new Function1(layoutNode0, ref$ObjectRef0) {
            final LayoutNode $layoutNode;
            final AndroidViewHolder $this_run;
            final ObjectRef $viewRemovedOnDetach;

            {
                this.$this_run = androidViewHolder0;
                this.$layoutNode = layoutNode0;
                this.$viewRemovedOnDetach = ref$ObjectRef0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Owner)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Owner owner0) {
                Intrinsics.checkNotNullParameter(owner0, "owner");
                AndroidComposeView androidComposeView0 = owner0 instanceof AndroidComposeView ? ((AndroidComposeView)owner0) : null;
                if(androidComposeView0 != null) {
                    androidComposeView0.addAndroidView(this.$this_run, this.$layoutNode);
                }
                if(this.$viewRemovedOnDetach.element != null) {
                    this.$this_run.setView$ui_release(((View)this.$viewRemovedOnDetach.element));
                }
            }
        });
        layoutNode0.setOnDetach$ui_release(new Function1(ref$ObjectRef0) {
            final AndroidViewHolder $this_run;
            final ObjectRef $viewRemovedOnDetach;

            {
                this.$this_run = androidViewHolder0;
                this.$viewRemovedOnDetach = ref$ObjectRef0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Owner)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Owner owner0) {
                Intrinsics.checkNotNullParameter(owner0, "owner");
                AndroidComposeView androidComposeView0 = owner0 instanceof AndroidComposeView ? ((AndroidComposeView)owner0) : null;
                if(androidComposeView0 != null) {
                    androidComposeView0.removeAndroidView(this.$this_run);
                }
                this.$viewRemovedOnDetach.element = this.$this_run.getView();
                this.$this_run.setView$ui_release(null);
            }
        });
        layoutNode0.setMeasurePolicy(new MeasurePolicy() {
            private final int intrinsicHeight(int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = layoutNode0.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v1 = layoutNode0.obtainMeasureSpec(0, v, viewGroup$LayoutParams0.width);
                layoutNode0.measure(v1, 0);
                return layoutNode0.getMeasuredHeight();
            }

            private final int intrinsicWidth(int v) {
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = layoutNode0.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v1 = layoutNode0.obtainMeasureSpec(0, v, viewGroup$LayoutParams0.height);
                layoutNode0.measure(0, v1);
                return layoutNode0.getMeasuredWidth();
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return this.intrinsicHeight(v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return this.intrinsicWidth(v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public MeasureResult measure-3p2s80s(MeasureScope measureScope0, List list0, long v) {
                Intrinsics.checkNotNullParameter(measureScope0, "$receiver");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                if(Constraints.getMinWidth-impl(v) != 0) {
                    layoutNode0.getChildAt(0).setMinimumWidth(Constraints.getMinWidth-impl(v));
                }
                if(Constraints.getMinHeight-impl(v) != 0) {
                    layoutNode0.getChildAt(0).setMinimumHeight(Constraints.getMinHeight-impl(v));
                }
                int v1 = Constraints.getMinWidth-impl(v);
                int v2 = Constraints.getMaxWidth-impl(v);
                ViewGroup.LayoutParams viewGroup$LayoutParams0 = layoutNode0.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams0);
                int v3 = layoutNode0.obtainMeasureSpec(v1, v2, viewGroup$LayoutParams0.width);
                int v4 = Constraints.getMinHeight-impl(v);
                int v5 = Constraints.getMaxHeight-impl(v);
                ViewGroup.LayoutParams viewGroup$LayoutParams1 = layoutNode0.getLayoutParams();
                Intrinsics.checkNotNull(viewGroup$LayoutParams1);
                int v6 = layoutNode0.obtainMeasureSpec(v4, v5, viewGroup$LayoutParams1.height);
                layoutNode0.measure(v3, v6);
                return DefaultImpls.layout$default(measureScope0, layoutNode0.getMeasuredWidth(), layoutNode0.getMeasuredHeight(), null, new Function1(this.$layoutNode) {
                    final LayoutNode $layoutNode;
                    final AndroidViewHolder $this_run;

                    {
                        this.$this_run = androidViewHolder0;
                        this.$layoutNode = layoutNode0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((PlacementScope)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PlacementScope placeable$PlacementScope0) {
                        Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                        AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, this.$layoutNode);
                    }
                }, 4, null);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return this.intrinsicHeight(v);
            }

            @Override  // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, List list0, int v) {
                Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
                Intrinsics.checkNotNullParameter(list0, "measurables");
                return this.intrinsicWidth(v);
            }
        });
        this.layoutNode = layoutNode0;

        @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.viewinterop.AndroidViewHolder.update.1 extends Lambda implements Function0 {
            public static final androidx.compose.ui.viewinterop.AndroidViewHolder.update.1 INSTANCE;

            static {
                androidx.compose.ui.viewinterop.AndroidViewHolder.update.1.INSTANCE = new androidx.compose.ui.viewinterop.AndroidViewHolder.update.1();
            }

            androidx.compose.ui.viewinterop.AndroidViewHolder.update.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return Unit.INSTANCE;
            }

            public final void invoke() {
            }
        }

    }

    @Override  // android.view.ViewGroup
    public boolean gatherTransparentRegion(Region region0) {
        if(region0 == null) {
            return true;
        }
        this.getLocationInWindow(this.location);
        int v = this.location[0];
        region0.op(v, this.location[1], v + this.getWidth(), this.location[1] + this.getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override  // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = this.view == null ? null : this.view.getLayoutParams();
        return viewGroup$LayoutParams0 == null ? new ViewGroup.LayoutParams(-1, -1) : viewGroup$LayoutParams0;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final Function1 getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1 getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0 getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override  // android.view.ViewGroup
    public ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        super.invalidateChildInParent(arr_v, rect0);
        this.layoutNode.invalidateLayer$ui_release();
        return null;
    }

    private final int obtainMeasureSpec(int v, int v1, int v2) {
        if(v2 < 0 && v != v1) {
            if(v2 == -2 && v1 != 0x7FFFFFFF) {
                return View.MeasureSpec.makeMeasureSpec(v1, 0x80000000);
            }
            return v2 != -1 || v1 == 0x7FFFFFFF ? 0 : View.MeasureSpec.makeMeasureSpec(v1, 0x40000000);
        }
        return View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(v2, v, v1), 0x40000000);
    }

    @Override  // android.view.ViewGroup
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.snapshotObserver.start();
    }

    @Override  // android.view.ViewGroup
    public void onDescendantInvalidated(View view0, View view1) {
        Intrinsics.checkNotNullParameter(view0, "child");
        Intrinsics.checkNotNullParameter(view1, "target");
        super.onDescendantInvalidated(view0, view1);
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override  // android.view.ViewGroup
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.snapshotObserver.stop();
        this.snapshotObserver.clear();
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        View view0 = this.view;
        if(view0 != null) {
            view0.layout(0, 0, v2 - v, v3 - v1);
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        View view0 = this.view;
        if(view0 != null) {
            view0.measure(v, v1);
        }
        int v2 = 0;
        int v3 = this.view == null ? 0 : this.view.getMeasuredWidth();
        View view1 = this.view;
        if(view1 != null) {
            v2 = view1.getMeasuredHeight();
        }
        this.setMeasuredDimension(v3, v2);
        this.lastWidthMeasureSpec = v;
        this.lastHeightMeasureSpec = v1;
    }

    public final void remeasure() {
        int v = this.lastWidthMeasureSpec;
        if(v != 0x80000000) {
            int v1 = this.lastHeightMeasureSpec;
            if(v1 != 0x80000000) {
                this.measure(v, v1);
            }
        }
    }

    @Override  // android.view.ViewGroup
    public void requestDisallowInterceptTouchEvent(boolean z) {
        Function1 function10 = this.onRequestDisallowInterceptTouchEvent;
        if(function10 != null) {
            function10.invoke(Boolean.valueOf(z));
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final void setDensity(Density density0) {
        Intrinsics.checkNotNullParameter(density0, "value");
        if(density0 != this.density) {
            this.density = density0;
            Function1 function10 = this.onDensityChanged;
            if(function10 != null) {
                function10.invoke(density0);
            }
        }
    }

    public final void setModifier(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "value");
        if(modifier0 != this.modifier) {
            this.modifier = modifier0;
            Function1 function10 = this.onModifierChanged;
            if(function10 != null) {
                function10.invoke(modifier0);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1 function10) {
        this.onDensityChanged = function10;
    }

    public final void setOnModifierChanged$ui_release(Function1 function10) {
        this.onModifierChanged = function10;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1 function10) {
        this.onRequestDisallowInterceptTouchEvent = function10;
    }

    protected final void setUpdate(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "value");
        this.update = function00;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    public final void setView$ui_release(View view0) {
        if(view0 != this.view) {
            this.view = view0;
            this.removeAllViews();
            if(view0 != null) {
                this.addView(view0);
                this.runUpdate.invoke();
            }
        }
    }
}

