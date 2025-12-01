package androidx.compose.ui.node;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001C\u001A\u00020\u001D2\b\b\u0002\u0010\u001E\u001A\u00020\bJ%\u0010\u001F\u001A\u00020\b2\u0006\u0010 \u001A\u00020\u00032\u0006\u0010\u0017\u001A\u00020\u0018H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\"J\u0006\u0010#\u001A\u00020\bJ\u000E\u0010$\u001A\u00020\u001D2\u0006\u0010%\u001A\u00020\u0003J\u000E\u0010&\u001A\u00020\b2\u0006\u0010 \u001A\u00020\u0003J\u000E\u0010\'\u001A\u00020\b2\u0006\u0010 \u001A\u00020\u0003J\u001B\u0010(\u001A\u00020\u001D2\u0006\u0010)\u001A\u00020\u0018ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b*\u0010+R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\n\u0010\u000BR \u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\r8F@BX\u0086\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u000E\u0010\u0011\u001A\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00030\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0015\u001A\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0017\u001A\u0004\u0018\u00010\u0018X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0002\n\u0000R\u0018\u0010\u0019\u001A\u00020\b*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/MeasureAndLayoutDelegate;", "", "root", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "consistencyChecker", "Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "duringMeasureLayout", "", "hasPendingMeasureOrLayout", "getHasPendingMeasureOrLayout", "()Z", "<set-?>", "", "measureIteration", "getMeasureIteration", "()J", "onPositionedDispatcher", "Landroidx/compose/ui/node/OnPositionedDispatcher;", "postponedMeasureRequests", "", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSet;", "rootConstraints", "Landroidx/compose/ui/unit/Constraints;", "canAffectParent", "getCanAffectParent", "(Landroidx/compose/ui/node/LayoutNode;)Z", "dispatchOnPositionedCallbacks", "", "forceDispatch", "doRemeasure", "layoutNode", "doRemeasure-0kLqBqw", "(Landroidx/compose/ui/node/LayoutNode;J)Z", "measureAndLayout", "onNodeDetached", "node", "requestRelayout", "requestRemeasure", "updateRootConstraints", "constraints", "updateRootConstraints-BRTryo0", "(J)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MeasureAndLayoutDelegate {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutState.values().length];
            arr_v[LayoutState.Measuring.ordinal()] = 1;
            arr_v[LayoutState.NeedsRemeasure.ordinal()] = 2;
            arr_v[LayoutState.LayingOut.ordinal()] = 3;
            arr_v[LayoutState.NeedsRelayout.ordinal()] = 4;
            arr_v[LayoutState.Ready.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private final LayoutTreeConsistencyChecker consistencyChecker;
    private boolean duringMeasureLayout;
    private long measureIteration;
    private final OnPositionedDispatcher onPositionedDispatcher;
    private final List postponedMeasureRequests;
    private final DepthSortedSet relayoutNodes;
    private final LayoutNode root;
    private Constraints rootConstraints;

    public MeasureAndLayoutDelegate(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "root");
        super();
        this.root = layoutNode0;
        this.relayoutNodes = new DepthSortedSet(false);
        this.onPositionedDispatcher = new OnPositionedDispatcher();
        this.measureIteration = 1L;
        this.postponedMeasureRequests = new ArrayList();
        this.consistencyChecker = null;
    }

    public final void dispatchOnPositionedCallbacks(boolean z) {
        if(z) {
            this.onPositionedDispatcher.onRootNodePositioned(this.root);
        }
        this.onPositionedDispatcher.dispatch();
    }

    public static void dispatchOnPositionedCallbacks$default(MeasureAndLayoutDelegate measureAndLayoutDelegate0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        measureAndLayoutDelegate0.dispatchOnPositionedCallbacks(z);
    }

    private final boolean doRemeasure-0kLqBqw(LayoutNode layoutNode0, long v) {
        boolean z = layoutNode0 == this.root ? layoutNode0.remeasure-_Sx5XlM$ui_release(Constraints.box-impl(v)) : LayoutNode.remeasure-_Sx5XlM$ui_release$default(layoutNode0, null, 1, null);
        LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
        if(z) {
            if(layoutNode1 == null) {
                return true;
            }
            if(layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock) {
                this.requestRemeasure(layoutNode1);
                return false;
            }
            if(layoutNode0.getMeasuredByParent$ui_release() != UsageByParent.InLayoutBlock) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.requestRelayout(layoutNode1);
            return false;
        }
        return false;
    }

    // 去混淆评级： 低(20)
    private final boolean getCanAffectParent(LayoutNode layoutNode0) {
        return layoutNode0.getLayoutState$ui_release() == LayoutState.NeedsRemeasure && (layoutNode0.getMeasuredByParent$ui_release() == UsageByParent.InMeasureBlock || layoutNode0.getAlignmentLines$ui_release().getRequired$ui_release());
    }

    public final boolean getHasPendingMeasureOrLayout() {
        return !this.relayoutNodes.isEmpty();
    }

    public final long getMeasureIteration() {
        if(!this.duringMeasureLayout) {
            throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
        }
        return this.measureIteration;
    }

    public final boolean measureAndLayout() {
        boolean z;
        if(!this.root.isAttached() || !this.root.isPlaced() || !this.duringMeasureLayout == 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Constraints constraints0 = this.rootConstraints;
        if(constraints0 == null) {
            return false;
        }
        long v = constraints0.unbox-impl();
        if(!this.relayoutNodes.isEmpty() != 0) {
            try {
                this.duringMeasureLayout = true;
                DepthSortedSet depthSortedSet0 = this.relayoutNodes;
                z = false;
                while(!depthSortedSet0.isEmpty() != 0) {
                    LayoutNode layoutNode0 = depthSortedSet0.pop();
                    if(layoutNode0.isPlaced() || this.getCanAffectParent(layoutNode0) || layoutNode0.getAlignmentLines$ui_release().getRequired$ui_release()) {
                        if(layoutNode0.getLayoutState$ui_release() == LayoutState.NeedsRemeasure && this.doRemeasure-0kLqBqw(layoutNode0, v)) {
                            z = true;
                        }
                        if(layoutNode0.getLayoutState$ui_release() == LayoutState.NeedsRelayout && layoutNode0.isPlaced()) {
                            if(layoutNode0 == this.root) {
                                layoutNode0.place$ui_release(0, 0);
                            }
                            else {
                                layoutNode0.replace$ui_release();
                            }
                            this.onPositionedDispatcher.onNodePositioned(layoutNode0);
                            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.consistencyChecker;
                            if(layoutTreeConsistencyChecker0 != null) {
                                layoutTreeConsistencyChecker0.assertConsistent();
                            }
                        }
                        this.measureIteration = this.getMeasureIteration() + 1L;
                        if(!this.postponedMeasureRequests.isEmpty() != 0) {
                            List list0 = this.postponedMeasureRequests;
                            int v2 = list0.size() - 1;
                            if(v2 >= 0) {
                                for(int v3 = 0; true; ++v3) {
                                    LayoutNode layoutNode1 = (LayoutNode)list0.get(v3);
                                    if(layoutNode1.isAttached()) {
                                        this.requestRemeasure(layoutNode1);
                                    }
                                    if(v3 + 1 > v2) {
                                        break;
                                    }
                                }
                            }
                            this.postponedMeasureRequests.clear();
                        }
                    }
                }
            }
            finally {
                this.duringMeasureLayout = false;
            }
            LayoutTreeConsistencyChecker layoutTreeConsistencyChecker1 = this.consistencyChecker;
            if(layoutTreeConsistencyChecker1 != null) {
                layoutTreeConsistencyChecker1.assertConsistent();
            }
            return z;
        }
        return false;
    }

    public final void onNodeDetached(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        this.relayoutNodes.remove(layoutNode0);
    }

    public final boolean requestRelayout(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        switch(layoutNode0.getLayoutState$ui_release()) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.consistencyChecker;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                }
                return false;
            }
            case 5: {
                layoutNode0.setLayoutState$ui_release(LayoutState.NeedsRelayout);
                if(layoutNode0.isPlaced()) {
                    LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                    LayoutState layoutNode$LayoutState0 = layoutNode1 == null ? null : layoutNode1.getLayoutState$ui_release();
                    if(layoutNode$LayoutState0 != LayoutState.NeedsRemeasure && layoutNode$LayoutState0 != LayoutState.NeedsRelayout) {
                        this.relayoutNodes.add(layoutNode0);
                    }
                }
                return !this.duringMeasureLayout;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final boolean requestRemeasure(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        switch(WhenMappings.$EnumSwitchMapping$0[layoutNode0.getLayoutState$ui_release().ordinal()]) {
            case 1: 
            case 2: {
                break;
            }
            case 3: {
                this.postponedMeasureRequests.add(layoutNode0);
                LayoutTreeConsistencyChecker layoutTreeConsistencyChecker0 = this.consistencyChecker;
                if(layoutTreeConsistencyChecker0 != null) {
                    layoutTreeConsistencyChecker0.assertConsistent();
                }
                break;
            }
            case 4: 
            case 5: {
                if(this.duringMeasureLayout && layoutNode0.getWasMeasuredDuringThisIteration$ui_release()) {
                    this.postponedMeasureRequests.add(layoutNode0);
                    return !this.duringMeasureLayout;
                }
                layoutNode0.setLayoutState$ui_release(LayoutState.NeedsRemeasure);
                if(layoutNode0.isPlaced() || this.getCanAffectParent(layoutNode0)) {
                    LayoutNode layoutNode1 = layoutNode0.getParent$ui_release();
                    if((layoutNode1 == null ? null : layoutNode1.getLayoutState$ui_release()) != LayoutState.NeedsRemeasure) {
                        this.relayoutNodes.add(layoutNode0);
                    }
                }
                return !this.duringMeasureLayout;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return false;
    }

    public final void updateRootConstraints-BRTryo0(long v) {
        if(!(this.rootConstraints == null ? false : Constraints.equals-impl0(this.rootConstraints.unbox-impl(), v))) {
            if(!this.duringMeasureLayout == 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.rootConstraints = Constraints.box-impl(v);
            this.root.setLayoutState$ui_release(LayoutState.NeedsRemeasure);
            this.relayoutNodes.add(this.root);
        }
    }
}

