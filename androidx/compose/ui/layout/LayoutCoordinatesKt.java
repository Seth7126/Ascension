package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\n\u0010\u0000\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0003\u001A\u00020\u0001*\u00020\u0002\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0002\u001A\f\u0010\u0005\u001A\u00020\u0002*\u00020\u0002H\u0000\u001A\u0012\u0010\u0006\u001A\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001A\u0012\u0010\t\u001A\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u001A\u0012\u0010\n\u001A\u00020\u0007*\u00020\u0002ø\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000B"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRoot", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<this>");
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates();
        return layoutCoordinates1 == null ? new Rect(0.0f, 0.0f, ((float)IntSize.getWidth-impl(layoutCoordinates0.getSize-YbymL2g())), ((float)IntSize.getHeight-impl(layoutCoordinates0.getSize-YbymL2g()))) : DefaultImpls.localBoundingBoxOf$default(layoutCoordinates1, layoutCoordinates0, false, 2, null);
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<this>");
        return DefaultImpls.localBoundingBoxOf$default(LayoutCoordinatesKt.findRoot(layoutCoordinates0), layoutCoordinates0, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<this>");
        LayoutCoordinates layoutCoordinates1 = LayoutCoordinatesKt.findRoot(layoutCoordinates0);
        Rect rect0 = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates0);
        long v = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(rect0.getLeft(), rect0.getTop()));
        long v1 = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(rect0.getRight(), rect0.getTop()));
        long v2 = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(rect0.getRight(), rect0.getBottom()));
        long v3 = layoutCoordinates1.localToWindow-MK-Hz9U(OffsetKt.Offset(rect0.getLeft(), rect0.getBottom()));
        return new Rect(ComparisonsKt.minOf(Offset.getX-impl(v), new float[]{Offset.getX-impl(v1), Offset.getX-impl(v3), Offset.getX-impl(v2)}), ComparisonsKt.minOf(Offset.getY-impl(v), new float[]{Offset.getY-impl(v1), Offset.getY-impl(v3), Offset.getY-impl(v2)}), ComparisonsKt.maxOf(Offset.getX-impl(v), new float[]{Offset.getX-impl(v1), Offset.getX-impl(v3), Offset.getX-impl(v2)}), ComparisonsKt.maxOf(Offset.getY-impl(v), new float[]{Offset.getY-impl(v1), Offset.getY-impl(v3), Offset.getY-impl(v2)}));
    }

    public static final LayoutCoordinates findRoot(LayoutCoordinates layoutCoordinates0) {
        LayoutNodeWrapper layoutNodeWrapper2;
        LayoutCoordinates layoutCoordinates2;
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<this>");
        for(LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates(); true; layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates()) {
            layoutCoordinates2 = layoutCoordinates0;
            layoutCoordinates0 = layoutCoordinates1;
            if(layoutCoordinates0 == null) {
                break;
            }
        }
        LayoutNodeWrapper layoutNodeWrapper0 = layoutCoordinates2 instanceof LayoutNodeWrapper ? ((LayoutNodeWrapper)layoutCoordinates2) : null;
        if(layoutNodeWrapper0 == null) {
            return layoutCoordinates2;
        }
        for(LayoutNodeWrapper layoutNodeWrapper1 = layoutNodeWrapper0.getWrappedBy$ui_release(); true; layoutNodeWrapper1 = layoutNodeWrapper0.getWrappedBy$ui_release()) {
            layoutNodeWrapper2 = layoutNodeWrapper0;
            layoutNodeWrapper0 = layoutNodeWrapper1;
            if(layoutNodeWrapper0 == null) {
                break;
            }
        }
        return layoutNodeWrapper2;
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<this>");
        LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates();
        return layoutCoordinates1 == null ? 0L : layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, 0L);
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<this>");
        return layoutCoordinates0.localToRoot-MK-Hz9U(0L);
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "<this>");
        return layoutCoordinates0.localToWindow-MK-Hz9U(0L);
    }
}

