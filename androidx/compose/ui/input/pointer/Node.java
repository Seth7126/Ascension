package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J/\u0010\u0013\u001A\u00020\u00142\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0019H\u0002ø\u0001\u0000J\b\u0010\u001A\u001A\u00020\u0014H\u0002J\b\u0010\u001B\u001A\u00020\u0014H\u0016J\b\u0010\u001C\u001A\u00020\u001DH\u0016J\u0017\u0010\u001E\u001A\u00020\u001D2\f\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00140 H\u0082\bJ/\u0010!\u001A\u00020\u001D2\u0012\u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00120\u00162\u0006\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0019H\u0016ø\u0001\u0000J\b\u0010\"\u001A\u00020#H\u0016R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u001A\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u000B0\nø\u0001\u0000¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001D\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000B\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/ui/input/pointer/Node;", "Landroidx/compose/ui/input/pointer/NodeParent;", "pointerInputFilter", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "(Landroidx/compose/ui/input/pointer/PointerInputFilter;)V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerIds", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/PointerId;", "getPointerIds", "()Landroidx/compose/runtime/collection/MutableVector;", "getPointerInputFilter", "()Landroidx/compose/ui/input/pointer/PointerInputFilter;", "relevantChanges", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "buildCache", "", "changes", "", "parentCoordinates", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "clearCache", "dispatchCancel", "dispatchFinalEventPass", "", "dispatchIfNeeded", "block", "Lkotlin/Function0;", "dispatchMainEventPass", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Node extends NodeParent {
    private LayoutCoordinates coordinates;
    private PointerEvent pointerEvent;
    private final MutableVector pointerIds;
    private final PointerInputFilter pointerInputFilter;
    private final Map relevantChanges;

    public Node(PointerInputFilter pointerInputFilter0) {
        Intrinsics.checkNotNullParameter(pointerInputFilter0, "pointerInputFilter");
        super();
        this.pointerInputFilter = pointerInputFilter0;
        this.pointerIds = new MutableVector(new PointerId[16], 0);
        this.relevantChanges = new LinkedHashMap();
    }

    private final void buildCache(Map map0, LayoutCoordinates layoutCoordinates0, InternalPointerEvent internalPointerEvent0) {
        if(!this.pointerInputFilter.isAttached$ui_release()) {
            return;
        }
        this.coordinates = this.pointerInputFilter.getLayoutCoordinates$ui_release();
        for(Object object0: map0.entrySet()) {
            long v = ((PointerId)((Map.Entry)object0).getKey()).unbox-impl();
            PointerInputChange pointerInputChange0 = (PointerInputChange)((Map.Entry)object0).getValue();
            PointerId pointerId0 = PointerId.box-impl(v);
            if(this.pointerIds.contains(pointerId0)) {
                PointerId pointerId1 = PointerId.box-impl(v);
                LayoutCoordinates layoutCoordinates1 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates1);
                long v1 = layoutCoordinates1.localPositionOf-R5De75A(layoutCoordinates0, pointerInputChange0.getPreviousPosition-F1C5BW0());
                LayoutCoordinates layoutCoordinates2 = this.coordinates;
                Intrinsics.checkNotNull(layoutCoordinates2);
                PointerInputChange pointerInputChange1 = PointerInputChange.copy-Ezr-O64$default(pointerInputChange0, 0L, 0L, layoutCoordinates2.localPositionOf-R5De75A(layoutCoordinates0, pointerInputChange0.getPosition-F1C5BW0()), false, 0L, v1, false, null, 0, 475, null);
                this.relevantChanges.put(pointerId1, pointerInputChange1);
            }
        }
        if(this.relevantChanges.isEmpty()) {
            return;
        }
        this.pointerEvent = new PointerEvent(CollectionsKt.toList(this.relevantChanges.values()), internalPointerEvent0);
    }

    private final void clearCache() {
        this.relevantChanges.clear();
        this.coordinates = null;
        this.pointerEvent = null;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public void dispatchCancel() {
        MutableVector mutableVector0 = this.getChildren();
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((Node)arr_object[v1]).dispatchCancel();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.pointerInputFilter.onCancel();
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchFinalEventPass() {
        int v = 0;
        if(!this.relevantChanges.isEmpty() && this.getPointerInputFilter().isAttached$ui_release()) {
            PointerEvent pointerEvent0 = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent0);
            LayoutCoordinates layoutCoordinates0 = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates0);
            long v1 = layoutCoordinates0.getSize-YbymL2g();
            this.getPointerInputFilter().onPointerEvent-H0pRuoY(pointerEvent0, PointerEventPass.Final, v1);
            if(this.getPointerInputFilter().isAttached$ui_release()) {
                MutableVector mutableVector0 = this.getChildren();
                int v2 = mutableVector0.getSize();
                if(v2 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    while(true) {
                        ((Node)arr_object[v]).dispatchFinalEventPass();
                        ++v;
                        if(v >= v2) {
                            break;
                        }
                    }
                }
            }
            v = 1;
        }
        this.clearCache();
        return v != 0;
    }

    private final boolean dispatchIfNeeded(Function0 function00) {
        if(this.relevantChanges.isEmpty()) {
            return false;
        }
        if(!this.getPointerInputFilter().isAttached$ui_release()) {
            return false;
        }
        function00.invoke();
        return true;
    }

    @Override  // androidx.compose.ui.input.pointer.NodeParent
    public boolean dispatchMainEventPass(Map map0, LayoutCoordinates layoutCoordinates0, InternalPointerEvent internalPointerEvent0) {
        Intrinsics.checkNotNullParameter(map0, "changes");
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent0, "internalPointerEvent");
        this.buildCache(map0, layoutCoordinates0, internalPointerEvent0);
        int v = 0;
        if(!this.relevantChanges.isEmpty() && this.getPointerInputFilter().isAttached$ui_release()) {
            PointerEvent pointerEvent0 = this.pointerEvent;
            Intrinsics.checkNotNull(pointerEvent0);
            LayoutCoordinates layoutCoordinates1 = this.coordinates;
            Intrinsics.checkNotNull(layoutCoordinates1);
            long v1 = layoutCoordinates1.getSize-YbymL2g();
            this.getPointerInputFilter().onPointerEvent-H0pRuoY(pointerEvent0, PointerEventPass.Initial, v1);
            if(this.getPointerInputFilter().isAttached$ui_release()) {
                MutableVector mutableVector0 = this.getChildren();
                int v2 = mutableVector0.getSize();
                if(v2 > 0) {
                    Object[] arr_object = mutableVector0.getContent();
                    while(true) {
                        Node node0 = (Node)arr_object[v];
                        LayoutCoordinates layoutCoordinates2 = this.coordinates;
                        Intrinsics.checkNotNull(layoutCoordinates2);
                        node0.dispatchMainEventPass(this.relevantChanges, layoutCoordinates2, internalPointerEvent0);
                        ++v;
                        if(v >= v2) {
                            break;
                        }
                    }
                }
            }
            if(this.getPointerInputFilter().isAttached$ui_release()) {
                this.getPointerInputFilter().onPointerEvent-H0pRuoY(pointerEvent0, PointerEventPass.Main, v1);
            }
            v = 1;
        }
        return v != 0;
    }

    public final MutableVector getPointerIds() {
        return this.pointerIds;
    }

    public final PointerInputFilter getPointerInputFilter() {
        return this.pointerInputFilter;
    }

    @Override
    public String toString() {
        return "Node(pointerInputFilter=" + this.pointerInputFilter + ", children=" + this.getChildren() + ", pointerIds=" + this.pointerIds + ')';
    }
}

