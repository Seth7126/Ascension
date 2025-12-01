package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\b\u0010\r\u001A\u00020\u000EH\u0014J\u0010\u0010\u000F\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\nH\u0016J\u0010\u0010\u0011\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\nH\u0016J\u001D\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u0016H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\nH\u0016J\u0010\u0010\u001A\u001A\u00020\n2\u0006\u0010\u0012\u001A\u00020\nH\u0016J\b\u0010\u001B\u001A\u00020\u0002H\u0002J\b\u0010\u001C\u001A\u00020\u001DH\u0016J\u0010\u0010\u001E\u001A\u00020\u001D2\u0006\u0010\u001F\u001A\u00020 H\u0014R\u0016\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bX\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/ModifiedLayoutNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/layout/LayoutModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/layout/LayoutModifier;)V", "modifierState", "Landroidx/compose/runtime/MutableState;", "calculateAlignmentLine", "", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getWrappedByCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "maxIntrinsicHeight", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/Placeable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-BRTryo0", "(J)Landroidx/compose/ui/layout/Placeable;", "minIntrinsicHeight", "minIntrinsicWidth", "modifierFromState", "onModifierChanged", "", "performDraw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifiedLayoutNode extends DelegatingLayoutNodeWrapper {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/ModifiedLayoutNode$Companion;", "", "()V", "modifierBoundsPaint", "Landroidx/compose/ui/graphics/Paint;", "getModifierBoundsPaint", "()Landroidx/compose/ui/graphics/Paint;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Paint getModifierBoundsPaint() {
            return ModifiedLayoutNode.modifierBoundsPaint;
        }
    }

    public static final Companion Companion;
    private static final Paint modifierBoundsPaint;
    private MutableState modifierState;

    static {
        ModifiedLayoutNode.Companion = new Companion(null);
        Paint paint0 = AndroidPaint_androidKt.Paint();
        paint0.setColor-8_81llA(0xFF0000FF00000000L);
        paint0.setStrokeWidth(1.0f);
        paint0.setStyle-k9PVt8s(1);
        ModifiedLayoutNode.modifierBoundsPaint = paint0;
    }

    public ModifiedLayoutNode(LayoutNodeWrapper layoutNodeWrapper0, LayoutModifier layoutModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(layoutModifier0, "modifier");
        super(layoutNodeWrapper0, layoutModifier0);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public int calculateAlignmentLine(AlignmentLine alignmentLine0) {
        Intrinsics.checkNotNullParameter(alignmentLine0, "alignmentLine");
        if(this.getMeasureResult().getAlignmentLines().containsKey(alignmentLine0)) {
            Integer integer0 = (Integer)this.getMeasureResult().getAlignmentLines().get(alignmentLine0);
            return integer0 == null ? 0x80000000 : ((int)integer0);
        }
        int v = this.getWrapped$ui_release().get(alignmentLine0);
        if(v == 0x80000000) {
            return 0x80000000;
        }
        this.setShallowPlacing(true);
        this.placeAt-f8xVGno(this.getPosition-nOcc-ac(), this.getZIndex(), this.getLayerBlock());
        this.setShallowPlacing(false);
        return alignmentLine0 instanceof HorizontalAlignmentLine ? v + IntOffset.getY-impl(this.getWrapped$ui_release().getPosition-nOcc-ac()) : v + IntOffset.getX-impl(this.getWrapped$ui_release().getPosition-nOcc-ac());
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    protected LayoutCoordinates getWrappedByCoordinates() {
        return this;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public int maxIntrinsicHeight(int v) {
        return this.modifierFromState().maxIntrinsicHeight(this.getMeasureScope(), this.getWrapped$ui_release(), v);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public int maxIntrinsicWidth(int v) {
        return this.modifierFromState().maxIntrinsicWidth(this.getMeasureScope(), this.getWrapped$ui_release(), v);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public Placeable measure-BRTryo0(long v) {
        this.setMeasurementConstraints-BRTryo0(v);
        this.setMeasureResult$ui_release(((LayoutModifier)this.getModifier()).measure-3p2s80s(this.getMeasureScope(), this.getWrapped$ui_release(), v));
        OwnedLayer ownedLayer0 = this.getLayer();
        if(ownedLayer0 != null) {
            ownedLayer0.resize-ozmzZPI(this.getMeasuredSize-YbymL2g());
        }
        return this;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public int minIntrinsicHeight(int v) {
        return this.modifierFromState().minIntrinsicHeight(this.getMeasureScope(), this.getWrapped$ui_release(), v);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public int minIntrinsicWidth(int v) {
        return this.modifierFromState().minIntrinsicWidth(this.getMeasureScope(), this.getWrapped$ui_release(), v);
    }

    private final LayoutModifier modifierFromState() {
        MutableState mutableState0 = this.modifierState == null ? SnapshotStateKt.mutableStateOf$default(this.getModifier(), null, 2, null) : this.modifierState;
        this.modifierState = mutableState0;
        return (LayoutModifier)mutableState0.getValue();
    }

    @Override  // androidx.compose.ui.node.LayoutNodeWrapper
    public void onModifierChanged() {
        super.onModifierChanged();
        MutableState mutableState0 = this.modifierState;
        if(mutableState0 != null) {
            mutableState0.setValue(this.getModifier());
        }
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    protected void performDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        this.getWrapped$ui_release().draw(canvas0);
        if(LayoutNodeKt.requireOwner(this.getLayoutNode$ui_release()).getShowLayoutBounds()) {
            this.drawBorder(canvas0, ModifiedLayoutNode.modifierBoundsPaint);
        }
    }
}

