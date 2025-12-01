package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u00C8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 j2\u00020\u00012\u00020\u0002:\u0001jB\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u0005J\u0010\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\u0016J\n\u0010\u0018\u001A\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001A\u001A\u0004\u0018\u00010\u001BH\u0016J\n\u0010\u001C\u001A\u0004\u0018\u00010\u0019H\u0016J\n\u0010\u001D\u001A\u0004\u0018\u00010\u001BH\u0016J\n\u0010\u001E\u001A\u0004\u0018\u00010\u001FH\u0016J\n\u0010 \u001A\u0004\u0018\u00010\u0019H\u0016J\n\u0010!\u001A\u0004\u0018\u00010\u001BH\u0016J\n\u0010\"\u001A\u0004\u0018\u00010\u001FH\u0016J\b\u0010#\u001A\u00020$H\u0014J+\u0010%\u001A\u00020&2\u0006\u0010\'\u001A\u00020(2\f\u0010)\u001A\b\u0012\u0004\u0012\u00020+0*H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b,\u0010-J+\u0010.\u001A\u00020&2\u0006\u0010\'\u001A\u00020(2\f\u0010/\u001A\b\u0012\u0004\u0012\u0002000*H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b1\u0010-J]\u00102\u001A\u00020&\"\u0004\b\u0000\u001032\u0006\u0010\'\u001A\u00020(2\f\u00104\u001A\b\u0012\u0004\u0012\u0002H30*2)\u00105\u001A%\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u0002H30*\u0012\u0004\u0012\u00020&06\u00A2\u0006\u0002\b7H\u0082\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b8\u00109J\u0010\u0010:\u001A\u00020\u00152\u0006\u0010;\u001A\u00020\u0015H\u0016J\u0010\u0010<\u001A\u00020\u00152\u0006\u0010=\u001A\u00020\u0015H\u0016J\u001D\u0010>\u001A\u00020?2\u0006\u0010@\u001A\u00020AH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001A\u00020\u00152\u0006\u0010;\u001A\u00020\u0015H\u0016J\u0010\u0010E\u001A\u00020\u00152\u0006\u0010=\u001A\u00020\u0015H\u0016J\u0010\u0010F\u001A\u00020&2\u0006\u0010G\u001A\u00020HH\u0014J@\u0010I\u001A\u00020&2\u0006\u0010J\u001A\u00020K2\u0006\u0010L\u001A\u00020\u00072\u0019\u0010M\u001A\u0015\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020&\u0018\u00010N\u00A2\u0006\u0002\b7H\u0014\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bP\u0010QJ\u001A\u0010R\u001A\u00020\u0015*\u00020SH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bT\u0010UJ\u001A\u0010R\u001A\u00020\u0015*\u00020VH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bW\u0010XJ\u001A\u0010Y\u001A\u00020S*\u00020VH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bZ\u0010[J\u001D\u0010Y\u001A\u00020S*\u00020\u0007H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\\\u0010]J\u001D\u0010Y\u001A\u00020S*\u00020\u0015H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b\\\u0010^J\u001A\u0010_\u001A\u00020\u0007*\u00020SH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b`\u0010]J\u001A\u0010_\u001A\u00020\u0007*\u00020VH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\ba\u0010[J\r\u0010b\u001A\u00020c*\u00020dH\u0097\u0001J\u001A\u0010e\u001A\u00020V*\u00020SH\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bf\u0010gJ\u001D\u0010e\u001A\u00020V*\u00020\u0007H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bh\u0010gJ\u001D\u0010e\u001A\u00020V*\u00020\u0015H\u0097\u0001\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bh\u0010iR\u0014\u0010\u0006\u001A\u00020\u00078\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u00078\u0016X\u0097\u0005\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u0014\u0010\f\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u0016\u0010\u0010\u001A\u0004\u0018\u00010\u00118VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006k"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "Landroidx/compose/ui/unit/Density;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "(Landroidx/compose/ui/node/LayoutNode;)V", "density", "", "getDensity", "()F", "fontScale", "getFontScale", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findLastKeyInputWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findNextFocusWrapper", "findNextKeyInputWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousFocusWrapper", "findPreviousKeyInputWrapper", "findPreviousNestedScrollWrapper", "getWrappedByCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "hitTest", "", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitPointerInputFilters", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-3MmeM6k", "hitTestSubtree", "T", "hitResult", "nodeHitTest", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "hitTestSubtree-9KIMszo", "(JLjava/util/List;Lkotlin/jvm/functions/Function3;)V", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "roundToPx", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-GaN1DYA", "(J)F", "toDp-u2uoSUM", "(F)F", "(I)F", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSp", "toSp-0xMU5do", "(F)J", "toSp-kPz2Gy4", "(I)J", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class InnerPlaceable extends LayoutNodeWrapper implements Density {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/InnerPlaceable$Companion;", "", "()V", "innerBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getInnerBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Paint getInnerBoundsPaint() {
            return InnerPlaceable.innerBoundsPaint;
        }
    }

    private final MeasureScope $$delegate_0;
    public static final Companion Companion;
    private static final Paint innerBoundsPaint;

    static {
        InnerPlaceable.Companion = new Companion(null);
        Paint paint0 = AndroidPaint_androidKt.Paint();
        paint0.setColor-8_81llA(0xFFFF000000000000L);
        paint0.setStrokeWidth(1.0f);
        paint0.setStyle-k9PVt8s(1);
        InnerPlaceable.innerBoundsPaint = paint0;
    }

    public InnerPlaceable(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "layoutNode");
        super(layoutNode0);
        this.$$delegate_0 = layoutNode0.getMeasureScope$ui_release();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(AlignmentLine alignmentLine0) {
        Intrinsics.checkNotNullParameter(alignmentLine0, "alignmentLine");
        Integer integer0 = (Integer)this.getLayoutNode$ui_release().calculateAlignmentLines$ui_release().get(alignmentLine0);
        return integer0 == null ? 0x80000000 : ((int)integer0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedFocusNode findLastFocusWrapper() {
        return this.findPreviousFocusWrapper();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedKeyInputNode findLastKeyInputWrapper() {
        return this.findPreviousKeyInputWrapper();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedFocusNode findNextFocusWrapper() {
        return null;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return null;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return null;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedFocusNode findPreviousFocusWrapper() {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getWrappedBy$ui_release();
        return layoutNodeWrapper0 == null ? null : layoutNodeWrapper0.findPreviousFocusWrapper();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedKeyInputNode findPreviousKeyInputWrapper() {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getWrappedBy$ui_release();
        return layoutNodeWrapper0 == null ? null : layoutNodeWrapper0.findPreviousKeyInputWrapper();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public NestedScrollDelegatingWrapper findPreviousNestedScrollWrapper() {
        LayoutNodeWrapper layoutNodeWrapper0 = this.getWrappedBy$ui_release();
        return layoutNodeWrapper0 == null ? null : layoutNodeWrapper0.findPreviousNestedScrollWrapper();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public MeasureScope getMeasureScope() {
        return this.getLayoutNode$ui_release().getMeasureScope$ui_release();
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return null;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    protected LayoutCoordinates getWrappedByCoordinates() {
        return this;
    }

    // This method was un-flattened
    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void hitTest-3MmeM6k(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitPointerInputFilters");
        if(this.withinLayerBounds-k-4lQ0M(v)) {
            int v1 = list0.size();
            MutableVector mutableVector0 = this.getLayoutNode$ui_release().getZSortedChildren();
            int v2 = mutableVector0.getSize();
            if(v2 > 0) {
                int v3 = v2 - 1;
                Object[] arr_object = mutableVector0.getContent();
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v3];
                    if(layoutNode0.isPlaced()) {
                        layoutNode0.hitTest-3MmeM6k$ui_release(v, list0);
                        if(list0.size() <= v1) {
                            goto label_12;
                        }
                        break;
                    }
                label_12:
                    --v3;
                    if(v3 < 0) {
                        break;
                    }
                }
            }
        }
    }

    // This method was un-flattened
    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void hitTestSemantics-3MmeM6k(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitSemanticsWrappers");
        if(this.withinLayerBounds-k-4lQ0M(v)) {
            int v1 = list0.size();
            MutableVector mutableVector0 = this.getLayoutNode$ui_release().getZSortedChildren();
            int v2 = mutableVector0.getSize();
            if(v2 > 0) {
                int v3 = v2 - 1;
                Object[] arr_object = mutableVector0.getContent();
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v3];
                    if(layoutNode0.isPlaced()) {
                        layoutNode0.hitTestSemantics-3MmeM6k$ui_release(v, list0);
                        if(list0.size() <= v1) {
                            goto label_12;
                        }
                        break;
                    }
                label_12:
                    --v3;
                    if(v3 < 0) {
                        break;
                    }
                }
            }
        }
    }

    // This method was un-flattened
    private final void hitTestSubtree-9KIMszo(long v, List list0, Function3 function30) {
        if(this.withinLayerBounds-k-4lQ0M(v)) {
            int v1 = list0.size();
            MutableVector mutableVector0 = this.getLayoutNode$ui_release().getZSortedChildren();
            int v2 = mutableVector0.getSize();
            if(v2 > 0) {
                int v3 = v2 - 1;
                Object[] arr_object = mutableVector0.getContent();
                while(true) {
                    LayoutNode layoutNode0 = (LayoutNode)arr_object[v3];
                    if(layoutNode0.isPlaced()) {
                        function30.invoke(layoutNode0, Offset.box-impl(v), list0);
                        if(list0.size() <= v1) {
                            goto label_11;
                        }
                        break;
                    }
                label_11:
                    --v3;
                    if(v3 < 0) {
                        break;
                    }
                }
            }
        }
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        return this.getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        return this.getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public Placeable measure-BRTryo0(long v) {
        this.setMeasurementConstraints-BRTryo0(v);
        MeasureResult measureResult0 = this.getLayoutNode$ui_release().getMeasurePolicy().measure-3p2s80s(this.getLayoutNode$ui_release().getMeasureScope$ui_release(), this.getLayoutNode$ui_release().getChildren$ui_release(), v);
        this.getLayoutNode$ui_release().handleMeasureResult$ui_release(measureResult0);
        return this;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        return this.getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        return this.getLayoutNode$ui_release().getIntrinsicsPolicy$ui_release().minIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    protected void performDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Owner owner0 = LayoutNodeKt.requireOwner(this.getLayoutNode$ui_release());
        MutableVector mutableVector0 = this.getLayoutNode$ui_release().getZSortedChildren();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.isPlaced()) {
                    layoutNode0.draw$ui_release(canvas0);
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        if(owner0.getShowLayoutBounds()) {
            this.drawBorder(canvas0, InnerPlaceable.innerBoundsPaint);
        }
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    protected void placeAt-f8xVGno(long v, float f, Function1 function10) {
        super.placeAt-f8xVGno(v, f, function10);
        LayoutNodeWrapper layoutNodeWrapper0 = this.getWrappedBy$ui_release();
        if(layoutNodeWrapper0 != null && layoutNodeWrapper0.isShallowPlacing()) {
            return;
        }
        this.getLayoutNode$ui_release().onNodePlaced$ui_release();
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx--R2X_6o(long v) {
        return this.$$delegate_0.roundToPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return this.$$delegate_0.roundToPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-GaN1DYA(long v) {
        return this.$$delegate_0.toDp-GaN1DYA(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return this.$$delegate_0.toDp-u2uoSUM(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return this.$$delegate_0.toDp-u2uoSUM(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx--R2X_6o(long v) {
        return this.$$delegate_0.toPx--R2X_6o(v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx-0680j_4(float f) {
        return this.$$delegate_0.toPx-0680j_4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect0) {
        Intrinsics.checkNotNullParameter(dpRect0, "<this>");
        return this.$$delegate_0.toRect(dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-0xMU5do(float f) {
        return this.$$delegate_0.toSp-0xMU5do(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return this.$$delegate_0.toSp-kPz2Gy4(f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return this.$$delegate_0.toSp-kPz2Gy4(v);
    }
}

