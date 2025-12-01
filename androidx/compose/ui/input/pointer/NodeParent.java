package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001A\u00020\tJ\b\u0010\n\u001A\u00020\tH\u0016J\b\u0010\u000B\u001A\u00020\fH\u0016J/\u0010\r\u001A\u00020\f2\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000F2\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0015H\u0016ø\u0001\u0000J\u001B\u0010\u0016\u001A\u00020\t2\u0006\u0010\u0017\u001A\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001A\u001A\u00020\tR\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "()V", "children", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/input/pointer/Node;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "clear", "", "dispatchCancel", "dispatchFinalEventPass", "", "dispatchMainEventPass", "changes", "", "Landroidx/compose/ui/input/pointer/PointerId;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "parentCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "recursivelyRemovePointerId", "pointerId", "recursivelyRemovePointerId-0FcD4WY", "(J)V", "removeDetachedPointerInputFilters", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class NodeParent {
    private final MutableVector children;

    public NodeParent() {
        this.children = new MutableVector(new Node[16], 0);
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector mutableVector0 = this.children;
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
    }

    public boolean dispatchFinalEventPass() {
        MutableVector mutableVector0 = this.children;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            boolean z = false;
            do {
                z = ((Node)arr_object[v1]).dispatchFinalEventPass() || z;
                ++v1;
            }
            while(v1 < v);
            return z;
        }
        return false;
    }

    public boolean dispatchMainEventPass(Map map0, LayoutCoordinates layoutCoordinates0, InternalPointerEvent internalPointerEvent0) {
        Intrinsics.checkNotNullParameter(map0, "changes");
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "parentCoordinates");
        Intrinsics.checkNotNullParameter(internalPointerEvent0, "internalPointerEvent");
        MutableVector mutableVector0 = this.children;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            boolean z = false;
            do {
                z = ((Node)arr_object[v1]).dispatchMainEventPass(map0, layoutCoordinates0, internalPointerEvent0) || z;
                ++v1;
            }
            while(v1 < v);
            return z;
        }
        return false;
    }

    public final MutableVector getChildren() {
        return this.children;
    }

    public final void recursivelyRemovePointerId-0FcD4WY(long v) {
        int v1 = 0;
        while(v1 < this.children.getSize()) {
            Node node0 = (Node)this.children.getContent()[v1];
            node0.getPointerIds().remove(PointerId.box-impl(v));
            if(node0.getPointerIds().isEmpty()) {
                this.children.removeAt(v1);
            }
            else {
                node0.recursivelyRemovePointerId-0FcD4WY(v);
                ++v1;
            }
        }
    }

    public final void removeDetachedPointerInputFilters() {
        int v = 0;
        while(v < this.children.getSize()) {
            Node node0 = (Node)this.children.getContent()[v];
            if(node0.getPointerInputFilter().isAttached$ui_release()) {
                ++v;
                node0.removeDetachedPointerInputFilters();
            }
            else {
                this.children.removeAt(v);
                node0.dispatchCancel();
            }
        }
    }
}

