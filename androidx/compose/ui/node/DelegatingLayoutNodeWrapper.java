package androidx.compose.ui.node;

import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.input.nestedscroll.NestedScrollDelegatingWrapper;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.JvmActuals_jvmKt;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u009E\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0015\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00028\u0000\u00A2\u0006\u0002\u0010\u0006J\u0010\u0010!\u001A\u00020\"2\u0006\u0010#\u001A\u00020$H\u0016J\n\u0010%\u001A\u0004\u0018\u00010&H\u0016J\n\u0010\'\u001A\u0004\u0018\u00010(H\u0016J\n\u0010)\u001A\u0004\u0018\u00010&H\u0016J\n\u0010*\u001A\u0004\u0018\u00010(H\u0016J\n\u0010+\u001A\u0004\u0018\u00010,H\u0016J\n\u0010-\u001A\u0004\u0018\u00010&H\u0016J\n\u0010.\u001A\u0004\u0018\u00010(H\u0016J\n\u0010/\u001A\u0004\u0018\u00010,H\u0016J+\u00100\u001A\u0002012\u0006\u00102\u001A\u0002032\f\u00104\u001A\b\u0012\u0004\u0012\u00020605H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b7\u00108J+\u00109\u001A\u0002012\u0006\u00102\u001A\u0002032\f\u0010:\u001A\b\u0012\u0004\u0012\u00020;05H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b<\u00108J\u0010\u0010=\u001A\u00020\"2\u0006\u0010>\u001A\u00020\"H\u0016J\u0010\u0010?\u001A\u00020\"2\u0006\u0010@\u001A\u00020\"H\u0016J\u001D\u0010A\u001A\u00020B2\u0006\u0010C\u001A\u00020DH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bE\u0010FJ\u0010\u0010G\u001A\u00020\"2\u0006\u0010>\u001A\u00020\"H\u0016J\u0010\u0010H\u001A\u00020\"2\u0006\u0010@\u001A\u00020\"H\u0016J\u0010\u0010I\u001A\u0002012\u0006\u0010J\u001A\u00020KH\u0014J@\u0010L\u001A\u0002012\u0006\u0010M\u001A\u00020N2\u0006\u0010O\u001A\u00020P2\u0019\u0010Q\u001A\u0015\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u000201\u0018\u00010R\u00A2\u0006\u0002\bTH\u0014\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bU\u0010VJ\u000E\u0010W\u001A\u0002012\u0006\u0010\u0005\u001A\u00020\u0002R\u001A\u0010\u0007\u001A\u00020\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\u0005\u001A\u00028\u0000X\u0096\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0014\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001A\u0004\u0018\u00010\u00168VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0019\u001A\u00020\bX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\t\"\u0004\b\u001B\u0010\u000BR$\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u001C\u001A\u00020\u0003@VX\u0090\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 \u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006X"}, d2 = {"Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "T", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "wrapped", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/Modifier$Element;)V", "isChained", "", "()Z", "setChained", "(Z)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "getModifier", "()Landroidx/compose/ui/Modifier$Element;", "setModifier", "(Landroidx/compose/ui/Modifier$Element;)V", "Landroidx/compose/ui/Modifier$Element;", "parentData", "", "getParentData", "()Ljava/lang/Object;", "toBeReusedForSameModifier", "getToBeReusedForSameModifier", "setToBeReusedForSameModifier", "<set-?>", "getWrapped$ui_release", "()Landroidx/compose/ui/node/LayoutNodeWrapper;", "setWrapped", "(Landroidx/compose/ui/node/LayoutNodeWrapper;)V", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "findLastFocusWrapper", "Landroidx/compose/ui/node/ModifiedFocusNode;", "findLastKeyInputWrapper", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "findNextFocusWrapper", "findNextKeyInputWrapper", "findNextNestedScrollWrapper", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDelegatingWrapper;", "findPreviousFocusWrapper", "findPreviousKeyInputWrapper", "findPreviousNestedScrollWrapper", "hitTest", "", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "hitPointerInputFilters", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "hitTest-3MmeM6k", "(JLjava/util/List;)V", "hitTestSemantics", "hitSemanticsWrappers", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "hitTestSemantics-3MmeM6k", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "placeAt", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "setModifierTo", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class DelegatingLayoutNodeWrapper extends LayoutNodeWrapper {
    private boolean isChained;
    private Element modifier;
    private boolean toBeReusedForSameModifier;
    private LayoutNodeWrapper wrapped;

    public DelegatingLayoutNodeWrapper(LayoutNodeWrapper layoutNodeWrapper0, Element modifier$Element0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(modifier$Element0, "modifier");
        super(layoutNodeWrapper0.getLayoutNode$ui_release());
        this.wrapped = layoutNodeWrapper0;
        this.modifier = modifier$Element0;
        this.getWrapped$ui_release().setWrappedBy$ui_release(this);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public int calculateAlignmentLine(AlignmentLine alignmentLine0) {
        Intrinsics.checkNotNullParameter(alignmentLine0, "alignmentLine");
        return this.getWrapped$ui_release().get(alignmentLine0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedFocusNode findLastFocusWrapper() {
        ModifiedFocusNode modifiedFocusNode0 = this.findNextFocusWrapper();
        ModifiedFocusNode modifiedFocusNode1 = null;
        while(modifiedFocusNode0 != null) {
            modifiedFocusNode1 = modifiedFocusNode0;
            modifiedFocusNode0 = modifiedFocusNode0.getWrapped$ui_release().findNextFocusWrapper();
        }
        return modifiedFocusNode1;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedKeyInputNode findLastKeyInputWrapper() {
        ModifiedKeyInputNode modifiedKeyInputNode0 = this.getLayoutNode$ui_release().getInnerLayoutNodeWrapper$ui_release().findPreviousKeyInputWrapper();
        return modifiedKeyInputNode0 == this ? null : modifiedKeyInputNode0;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedFocusNode findNextFocusWrapper() {
        return this.getWrapped$ui_release().findNextFocusWrapper();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return this.getWrapped$ui_release().findNextKeyInputWrapper();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public NestedScrollDelegatingWrapper findNextNestedScrollWrapper() {
        return this.getWrapped$ui_release().findNextNestedScrollWrapper();
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

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public MeasureScope getMeasureScope() {
        return this.getWrapped$ui_release().getMeasureScope();
    }

    public Element getModifier() {
        return this.modifier;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public Object getParentData() {
        return this.getWrapped$ui_release().getParentData();
    }

    public final boolean getToBeReusedForSameModifier() {
        return this.toBeReusedForSameModifier;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public LayoutNodeWrapper getWrapped$ui_release() {
        return this.wrapped;
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void hitTest-3MmeM6k(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitPointerInputFilters");
        if(this.withinLayerBounds-k-4lQ0M(v)) {
            this.getWrapped$ui_release().hitTest-3MmeM6k(this.getWrapped$ui_release().fromParentPosition-MK-Hz9U(v), list0);
        }
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void hitTestSemantics-3MmeM6k(long v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "hitSemanticsWrappers");
        if(this.withinLayerBounds-k-4lQ0M(v)) {
            this.getWrapped$ui_release().hitTestSemantics-3MmeM6k(this.getWrapped$ui_release().fromParentPosition-MK-Hz9U(v), list0);
        }
    }

    public final boolean isChained() {
        return this.isChained;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicHeight(int v) {
        return this.getWrapped$ui_release().maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int maxIntrinsicWidth(int v) {
        return this.getWrapped$ui_release().maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.Measurable
    public Placeable measure-BRTryo0(long v) {
        this.setMeasurementConstraints-BRTryo0(v);
        this.setMeasureResult$ui_release(new MeasureResult() {
            private final Map alignmentLines;
            private final int height;
            private final int width;

            {
                DelegatingLayoutNodeWrapper delegatingLayoutNodeWrapper0 = this.getWrapped$ui_release().measure-BRTryo0(v);  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.width = delegatingLayoutNodeWrapper0.getWrapped$ui_release().getMeasureResult().getWidth();
                this.height = delegatingLayoutNodeWrapper0.getWrapped$ui_release().getMeasureResult().getHeight();
                this.alignmentLines = MapsKt.emptyMap();
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public Map getAlignmentLines() {
                return this.alignmentLines;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override  // androidx.compose.ui.layout.MeasureResult
            public void placeChildren() {
                long v = this.getWrapped$ui_release().measure-BRTryo0(v).getApparentToRealOffset-nOcc-ac();
                PlacementScope.place-70tqf50$default(PlacementScope.Companion, this.$placeable, IntOffsetKt.IntOffset(-((int)(v >> 0x20)), -((int)(v & 0xFFFFFFFFL))), 0.0f, 2, null);
            }
        });
        return this;
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicHeight(int v) {
        return this.getWrapped$ui_release().minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.IntrinsicMeasurable
    public int minIntrinsicWidth(int v) {
        return this.getWrapped$ui_release().minIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    protected void performDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        this.getWrapped$ui_release().draw(canvas0);
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    protected void placeAt-f8xVGno(long v, float f, Function1 function10) {
        super.placeAt-f8xVGno(v, f, function10);
        LayoutNodeWrapper layoutNodeWrapper0 = this.getWrappedBy$ui_release();
        if(layoutNodeWrapper0 != null && layoutNodeWrapper0.isShallowPlacing()) {
            return;
        }
        int v1 = IntSize.getWidth-impl(this.getMeasuredSize-YbymL2g());
        LayoutDirection layoutDirection0 = this.getMeasureScope().getLayoutDirection();
        LayoutDirection layoutDirection1 = PlacementScope.Companion.getParentLayoutDirection();
        PlacementScope.parentWidth = v1;
        PlacementScope.parentLayoutDirection = layoutDirection0;
        this.getMeasureResult().placeChildren();
        PlacementScope.parentWidth = 0;
        PlacementScope.parentLayoutDirection = layoutDirection1;
    }

    public final void setChained(boolean z) {
        this.isChained = z;
    }

    public void setModifier(Element modifier$Element0) {
        Intrinsics.checkNotNullParameter(modifier$Element0, "<set-?>");
        this.modifier = modifier$Element0;
    }

    public final void setModifierTo(Element modifier$Element0) {
        Intrinsics.checkNotNullParameter(modifier$Element0, "modifier");
        if(modifier$Element0 != this.getModifier()) {
            if(!Intrinsics.areEqual(JvmActuals_jvmKt.nativeClass(modifier$Element0), JvmActuals_jvmKt.nativeClass(this.getModifier()))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.setModifier(modifier$Element0);
        }
    }

    public final void setToBeReusedForSameModifier(boolean z) {
        this.toBeReusedForSameModifier = z;
    }

    public void setWrapped(LayoutNodeWrapper layoutNodeWrapper0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "<set-?>");
        this.wrapped = layoutNodeWrapper0;
    }
}

