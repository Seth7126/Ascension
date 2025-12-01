package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable.PlacementScope.Companion;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\u0002\u0010\u0007J\u0011\u00101\u001A\u00020\"2\u0006\u00102\u001A\u000203H\u0096\u0002J\u0010\u00104\u001A\u00020\"2\u0006\u00105\u001A\u00020\"H\u0016J\u0010\u00106\u001A\u00020\"2\u0006\u00107\u001A\u00020\"H\u0016J\u001D\u00108\u001A\u00020\u00022\u0006\u00109\u001A\u00020\u000FH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b:\u0010;J\u0010\u0010<\u001A\u00020\"2\u0006\u00105\u001A\u00020\"H\u0016J\u0010\u0010=\u001A\u00020\"2\u0006\u00107\u001A\u00020\"H\u0016J\b\u0010>\u001A\u00020\u0015H\u0002J@\u0010?\u001A\u00020\u00152\u0006\u0010@\u001A\u00020\u00182\u0006\u0010A\u001A\u00020\u001B2\u0019\u0010B\u001A\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u00A2\u0006\u0002\b\u0016H\u0014\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bC\u0010DJ\u0006\u0010E\u001A\u00020\u0015J\u001B\u0010F\u001A\u00020\t2\u0006\u00109\u001A\u00020\u000F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bG\u0010HJ\u0006\u0010I\u001A\u00020\u0015R\u001A\u0010\b\u001A\u00020\tX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\u001C\u0010\u000E\u001A\u0004\u0018\u00010\u000F8F\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001A\u0015\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013\u00A2\u0006\u0002\b\u0016X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001A\u00020\u0018X\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0019R\u000E\u0010\u001A\u001A\u00020\u001BX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001E\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u001C\u001A\u00020\u001D@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010 R\u0014\u0010!\u001A\u00020\"8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010$R\u000E\u0010%\u001A\u00020\tX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010&\u001A\u00020\"8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\'\u0010$R\u001A\u0010\u0005\u001A\u00020\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010-\u001A\u0004\u0018\u00010,2\b\u0010\u001C\u001A\u0004\u0018\u00010,@RX\u0096\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b.\u0010/R\u000E\u00100\u001A\u00020\tX\u0082\u000E\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006J"}, d2 = {"Landroidx/compose/ui/node/OuterMeasurablePlaceable;", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "outerWrapper", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "duringAlignmentLinesQuery", "", "getDuringAlignmentLinesQuery$ui_release", "()Z", "setDuringAlignmentLinesQuery$ui_release", "(Z)V", "lastConstraints", "Landroidx/compose/ui/unit/Constraints;", "getLastConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "lastLayerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "lastPosition", "Landroidx/compose/ui/unit/IntOffset;", "J", "lastZIndex", "", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "measuredHeight", "", "getMeasuredHeight", "()I", "measuredOnce", "measuredWidth", "getMeasuredWidth", "getOuterWrapper", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setOuterWrapper", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "", "parentData", "getParentData", "()Ljava/lang/Object;", "placedOnce", "get", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "constraints", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "onIntrinsicsQueried", "placeAt", "position", "zIndex", "layerBlock", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "recalculateParentData", "remeasure", "remeasure-BRTryo0", "(J)Z", "replace", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class OuterMeasurablePlaceable extends Placeable implements Measurable {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            arr_v[LayoutState.Measuring.ordinal()] = 1;
            arr_v[LayoutState.LayingOut.ordinal()] = 2;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private boolean duringAlignmentLinesQuery;
    private Function1 lastLayerBlock;
    private long lastPosition;
    private float lastZIndex;
    private final LayoutNode layoutNode;
    private long measureIteration;
    private boolean measuredOnce;
    private LayoutNodeWrapper outerWrapper;
    private Object parentData;
    private boolean placedOnce;

    public OuterMeasurablePlaceable(LayoutNode layoutNode0, LayoutNodeWrapper layoutNodeWrapper0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "outerWrapper");
        super();
        this.layoutNode = layoutNode0;
        this.outerWrapper = layoutNodeWrapper0;
        this.lastPosition = 0L;
        this.measureIteration = -1L;
    }

    @Override  // androidx.compose.ui.layout.Measured
    public int get(AlignmentLine alignmentLine0) {
        Intrinsics.checkNotNullParameter(alignmentLine0, "alignmentLine");
        LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release();
        LayoutState layoutNode$LayoutState0 = null;
        if((layoutNode0 == null ? null : layoutNode0.getLayoutState$ui_release()) == LayoutState.Measuring) {
            this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(true);
        }
        else {
            LayoutNode layoutNode1 = this.layoutNode.getParent$ui_release();
            if(layoutNode1 != null) {
                layoutNode$LayoutState0 = layoutNode1.getLayoutState$ui_release();
            }
            if(layoutNode$LayoutState0 == LayoutState.LayingOut) {
                this.layoutNode.getAlignmentLines$ui_release().setUsedDuringParentLayout$ui_release(true);
            }
        }
        this.duringAlignmentLinesQuery = true;
        int v = this.outerWrapper.get(alignmentLine0);
        this.duringAlignmentLinesQuery = false;
        return v;
    }

    public final boolean getDuringAlignmentLinesQuery$ui_release() {
        return this.duringAlignmentLinesQuery;
    }

    // 去混淆评级： 低(20)
    public final Constraints getLastConstraints-DWUhwKw() {
        return this.measuredOnce ? Constraints.box-impl(this.getMeasurementConstraints-msEJaDk()) : null;
    }

    public final long getMeasureIteration() {
        return this.measureIteration;
    }

    @Override  // androidx.compose.ui.layout.Placeable
    public int getMeasuredHeight() {
        return this.outerWrapper.getMeasuredHeight();
    }

    @Override  // androidx.compose.ui.layout.Placeable
    public int getMeasuredWidth() {
        return this.outerWrapper.getMeasuredWidth();
    }

    public final LayoutNodeWrapper getOuterWrapper() {
        return this.outerWrapper;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.parentData;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        this.onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        this.onIntrinsicsQueried();
        return this.outerWrapper.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public Placeable measure-BRTryo0(long v) {
        UsageByParent layoutNode$UsageByParent0;
        LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release();
        LayoutState layoutNode$LayoutState0 = layoutNode0 == null ? null : layoutNode0.getLayoutState$ui_release();
        if(layoutNode$LayoutState0 == null) {
            layoutNode$LayoutState0 = LayoutState.LayingOut;
        }
        LayoutNode layoutNode1 = this.layoutNode;
        switch(layoutNode$LayoutState0) {
            case 1: {
                layoutNode$UsageByParent0 = UsageByParent.InMeasureBlock;
                break;
            }
            case 2: {
                layoutNode$UsageByParent0 = UsageByParent.InLayoutBlock;
                break;
            }
            default: {
                throw new IllegalStateException("Measurable could be only measured from the parent\'s measure or layout block.Parents state is " + layoutNode$LayoutState0);
            }
        }
        layoutNode1.setMeasuredByParent$ui_release(layoutNode$UsageByParent0);
        this.remeasure-BRTryo0(v);
        return this;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        this.onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        this.onIntrinsicsQueried();
        return this.outerWrapper.minIntrinsicWidth(v);
    }

    private final void onIntrinsicsQueried() {
        this.layoutNode.requestRemeasure$ui_release();
    }

    @Override  // androidx.compose.ui.layout.Placeable
    protected void placeAt-f8xVGno(long v, float f, Function1 function10) {
        this.placedOnce = true;
        this.lastPosition = v;
        this.lastZIndex = f;
        this.lastLayerBlock = function10;
        this.layoutNode.getAlignmentLines$ui_release().setUsedByModifierLayout$ui_release(false);
        Companion placeable$PlacementScope$Companion0 = PlacementScope.Companion;
        if(function10 == null) {
            placeable$PlacementScope$Companion0.place-70tqf50(this.getOuterWrapper(), v, this.lastZIndex);
            return;
        }
        placeable$PlacementScope$Companion0.placeWithLayer-aW-9-wM(this.getOuterWrapper(), v, this.lastZIndex, function10);
    }

    public final void recalculateParentData() {
        this.parentData = this.outerWrapper.getParentData();
    }

    public final boolean remeasure-BRTryo0(long v) {
        Owner owner0 = LayoutNodeKt.requireOwner(this.layoutNode);
        long v1 = owner0.getMeasureIteration();
        LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release();
        boolean z = true;
        this.layoutNode.setCanMultiMeasure$ui_release(this.layoutNode.getCanMultiMeasure$ui_release() || layoutNode0 != null && layoutNode0.getCanMultiMeasure$ui_release());
        if(this.measureIteration == v1 && !this.layoutNode.getCanMultiMeasure$ui_release()) {
            throw new IllegalStateException("measure() may not be called multiple times on the same Measurable");
        }
        this.measureIteration = owner0.getMeasureIteration();
        if(this.layoutNode.getLayoutState$ui_release() != LayoutState.NeedsRemeasure && Constraints.equals-impl0(this.getMeasurementConstraints-msEJaDk(), v)) {
            return false;
        }
        this.layoutNode.getAlignmentLines$ui_release().setUsedByModifierMeasurement$ui_release(false);
        MutableVector mutableVector0 = this.layoutNode.get_children$ui_release();
        int v2 = mutableVector0.getSize();
        if(v2 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v3 = 0;
            while(true) {
                ((LayoutNode)arr_object[v3]).getAlignmentLines$ui_release().setUsedDuringParentMeasurement$ui_release(false);
                ++v3;
                if(v3 >= v2) {
                    break;
                }
            }
        }
        this.measuredOnce = true;
        this.layoutNode.setLayoutState$ui_release(LayoutState.Measuring);
        this.setMeasurementConstraints-BRTryo0(v);
        long v4 = this.outerWrapper.getSize-YbymL2g();
        OwnerSnapshotObserver ownerSnapshotObserver0 = owner0.getSnapshotObserver();
        Function0 function00 = new Function0(v) {
            final long $constraints;

            {
                OuterMeasurablePlaceable.this = outerMeasurablePlaceable0;
                this.$constraints = v;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                this.invoke();
                return Unit.INSTANCE;
            }

            public final void invoke() {
                OuterMeasurablePlaceable.this.getOuterWrapper().measure-BRTryo0(this.$constraints);
            }
        };
        ownerSnapshotObserver0.observeMeasureSnapshotReads$ui_release(this.layoutNode, function00);
        if(this.layoutNode.getLayoutState$ui_release() == LayoutState.Measuring) {
            this.layoutNode.setLayoutState$ui_release(LayoutState.NeedsRelayout);
        }
        if(IntSize.equals-impl0(this.outerWrapper.getSize-YbymL2g(), v4) && this.outerWrapper.getWidth() == this.getWidth() && this.outerWrapper.getHeight() == this.getHeight()) {
            z = false;
        }
        this.setMeasuredSize-ozmzZPI(IntSizeKt.IntSize(this.outerWrapper.getWidth(), this.outerWrapper.getHeight()));
        return z;
    }

    public final void replace() {
        if(!this.placedOnce) {
            throw new IllegalStateException("Check failed.");
        }
        this.placeAt-f8xVGno(this.lastPosition, this.lastZIndex, this.lastLayerBlock);
    }

    public final void setDuringAlignmentLinesQuery$ui_release(boolean z) {
        this.duringAlignmentLinesQuery = z;
    }

    public final void setOuterWrapper(LayoutNodeWrapper layoutNodeWrapper0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "<set-?>");
        this.outerWrapper = layoutNodeWrapper0;
    }
}

