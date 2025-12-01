package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0019\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0$J\u0006\u0010%\u001A\u00020&J\r\u0010\'\u001A\u00020&H\u0000¢\u0006\u0002\b(J\r\u0010)\u001A\u00020&H\u0000¢\u0006\u0002\b*R\u001A\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\t\u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001A\u0010\u000F\u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000ER\u0014\u0010\u0012\u001A\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\fR\u0010\u0010\u0014\u001A\u0004\u0018\u00010\u0003X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001A\u00020\n8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u0016\u0010\fR\u001A\u0010\u0017\u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u000ER\u001A\u0010\u001A\u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\f\"\u0004\b\u001C\u0010\u000ER\u001A\u0010\u001D\u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\f\"\u0004\b\u001F\u0010\u000ER\u001A\u0010 \u001A\u00020\nX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\f\"\u0004\b\"\u0010\u000E¨\u0006+"}, d2 = {"Landroidx/compose/ui/node/LayoutNodeAlignmentLines;", "", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "", "dirty", "", "getDirty$ui_release", "()Z", "setDirty$ui_release", "(Z)V", "previousUsedDuringParentLayout", "getPreviousUsedDuringParentLayout$ui_release", "setPreviousUsedDuringParentLayout$ui_release", "queried", "getQueried$ui_release", "queryOwner", "required", "getRequired$ui_release", "usedByModifierLayout", "getUsedByModifierLayout$ui_release", "setUsedByModifierLayout$ui_release", "usedByModifierMeasurement", "getUsedByModifierMeasurement$ui_release", "setUsedByModifierMeasurement$ui_release", "usedDuringParentLayout", "getUsedDuringParentLayout$ui_release", "setUsedDuringParentLayout$ui_release", "usedDuringParentMeasurement", "getUsedDuringParentMeasurement$ui_release", "setUsedDuringParentMeasurement$ui_release", "getLastCalculation", "", "recalculate", "", "recalculateQueryOwner", "recalculateQueryOwner$ui_release", "reset", "reset$ui_release", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutNodeAlignmentLines {
    private final Map alignmentLines;
    private boolean dirty;
    private final LayoutNode layoutNode;
    private boolean previousUsedDuringParentLayout;
    private LayoutNode queryOwner;
    private boolean usedByModifierLayout;
    private boolean usedByModifierMeasurement;
    private boolean usedDuringParentLayout;
    private boolean usedDuringParentMeasurement;

    public LayoutNodeAlignmentLines(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        super();
        this.layoutNode = layoutNode0;
        this.dirty = true;
        this.alignmentLines = new HashMap();
    }

    public final boolean getDirty$ui_release() {
        return this.dirty;
    }

    public final Map getLastCalculation() {
        return this.alignmentLines;
    }

    public final boolean getPreviousUsedDuringParentLayout$ui_release() {
        return this.previousUsedDuringParentLayout;
    }

    // 去混淆评级： 低(40)
    public final boolean getQueried$ui_release() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean getRequired$ui_release() {
        this.recalculateQueryOwner$ui_release();
        return this.queryOwner != null;
    }

    public final boolean getUsedByModifierLayout$ui_release() {
        return this.usedByModifierLayout;
    }

    public final boolean getUsedByModifierMeasurement$ui_release() {
        return this.usedByModifierMeasurement;
    }

    public final boolean getUsedDuringParentLayout$ui_release() {
        return this.usedDuringParentLayout;
    }

    public final boolean getUsedDuringParentMeasurement$ui_release() {
        return this.usedDuringParentMeasurement;
    }

    public final void recalculate() {
        this.alignmentLines.clear();
        MutableVector mutableVector0 = this.layoutNode.get_children$ui_release();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.isPlaced()) {
                    if(layoutNode0.getAlignmentLines$ui_release().getDirty$ui_release()) {
                        layoutNode0.layoutChildren$ui_release();
                    }
                    for(Object object0: layoutNode0.getAlignmentLines$ui_release().alignmentLines.entrySet()) {
                        LayoutNodeAlignmentLines.recalculate$addAlignmentLine(this, ((AlignmentLine)((Map.Entry)object0).getKey()), ((Number)((Map.Entry)object0).getValue()).intValue(), layoutNode0.getInnerLayoutNodeWrapper$ui_release());
                    }
                    LayoutNodeWrapper layoutNodeWrapper0 = layoutNode0.getInnerLayoutNodeWrapper$ui_release().getWrappedBy$ui_release();
                    Intrinsics.checkNotNull(layoutNodeWrapper0);
                    while(!Intrinsics.areEqual(layoutNodeWrapper0, this.layoutNode.getInnerLayoutNodeWrapper$ui_release())) {
                        for(Object object1: layoutNodeWrapper0.getProvidedAlignmentLines()) {
                            LayoutNodeAlignmentLines.recalculate$addAlignmentLine(this, ((AlignmentLine)object1), layoutNodeWrapper0.get(((AlignmentLine)object1)), layoutNodeWrapper0);
                        }
                        layoutNodeWrapper0 = layoutNodeWrapper0.getWrappedBy$ui_release();
                        Intrinsics.checkNotNull(layoutNodeWrapper0);
                    }
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        Map map0 = this.layoutNode.getInnerLayoutNodeWrapper$ui_release().getMeasureResult().getAlignmentLines();
        this.alignmentLines.putAll(map0);
        this.dirty = false;
    }

    private static final void recalculate$addAlignmentLine(LayoutNodeAlignmentLines layoutNodeAlignmentLines0, AlignmentLine alignmentLine0, int v, LayoutNodeWrapper layoutNodeWrapper0) {
        long v1 = OffsetKt.Offset(v, v);
        while(true) {
            v1 = layoutNodeWrapper0.toParentPosition-MK-Hz9U(v1);
            layoutNodeWrapper0 = layoutNodeWrapper0.getWrappedBy$ui_release();
            Intrinsics.checkNotNull(layoutNodeWrapper0);
            if(Intrinsics.areEqual(layoutNodeWrapper0, layoutNodeAlignmentLines0.layoutNode.getInnerLayoutNodeWrapper$ui_release())) {
                break;
            }
            if(layoutNodeWrapper0.getProvidedAlignmentLines().contains(alignmentLine0)) {
                float f = (float)layoutNodeWrapper0.get(alignmentLine0);
                v1 = OffsetKt.Offset(f, f);
            }
        }
        int v2 = alignmentLine0 instanceof HorizontalAlignmentLine ? MathKt.roundToInt(Offset.getY-impl(v1)) : MathKt.roundToInt(Offset.getX-impl(v1));
        Map map0 = layoutNodeAlignmentLines0.alignmentLines;
        if(map0.containsKey(alignmentLine0)) {
            v2 = AlignmentLineKt.merge(alignmentLine0, ((Number)MapsKt.getValue(layoutNodeAlignmentLines0.alignmentLines, alignmentLine0)).intValue(), v2);
        }
        map0.put(alignmentLine0, v2);
    }

    public final void recalculateQueryOwner$ui_release() {
        if(this.getQueried$ui_release()) {
            this.queryOwner = this.layoutNode;
            return;
        }
        LayoutNode layoutNode0 = this.layoutNode.getParent$ui_release();
        if(layoutNode0 == null) {
            return;
        }
        LayoutNode layoutNode1 = layoutNode0.getAlignmentLines$ui_release().queryOwner;
        if(layoutNode1 != null && layoutNode1.getAlignmentLines$ui_release().getQueried$ui_release()) {
            this.queryOwner = layoutNode1;
        }
        else {
            LayoutNode layoutNode2 = this.queryOwner;
            if(layoutNode2 != null && !layoutNode2.getAlignmentLines$ui_release().getQueried$ui_release()) {
                LayoutNode layoutNode3 = layoutNode2.getParent$ui_release();
                if(layoutNode3 != null) {
                    LayoutNodeAlignmentLines layoutNodeAlignmentLines0 = layoutNode3.getAlignmentLines$ui_release();
                    if(layoutNodeAlignmentLines0 != null) {
                        layoutNodeAlignmentLines0.recalculateQueryOwner$ui_release();
                    }
                }
                LayoutNode layoutNode4 = layoutNode2.getParent$ui_release();
                if(layoutNode4 == null) {
                    layoutNode1 = null;
                }
                else {
                    LayoutNodeAlignmentLines layoutNodeAlignmentLines1 = layoutNode4.getAlignmentLines$ui_release();
                    layoutNode1 = layoutNodeAlignmentLines1 == null ? null : layoutNodeAlignmentLines1.queryOwner;
                }
                this.queryOwner = layoutNode1;
            }
        }
    }

    public final void reset$ui_release() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void setDirty$ui_release(boolean z) {
        this.dirty = z;
    }

    public final void setPreviousUsedDuringParentLayout$ui_release(boolean z) {
        this.previousUsedDuringParentLayout = z;
    }

    public final void setUsedByModifierLayout$ui_release(boolean z) {
        this.usedByModifierLayout = z;
    }

    public final void setUsedByModifierMeasurement$ui_release(boolean z) {
        this.usedByModifierMeasurement = z;
    }

    public final void setUsedDuringParentLayout$ui_release(boolean z) {
        this.usedDuringParentLayout = z;
    }

    public final void setUsedDuringParentMeasurement$ui_release(boolean z) {
        this.usedDuringParentMeasurement = z;
    }
}

