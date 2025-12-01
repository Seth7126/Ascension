package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J)\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u000E\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0015J\u0006\u0010\u0016\u001A\u00020\nJ\u0006\u0010\u0017\u001A\u00020\nJ\u001B\u0010\u0018\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001AR\u0014\u0010\u0005\u001A\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/input/pointer/HitPathTracker;", "", "rootCoordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "root", "Landroidx/compose/ui/input/pointer/NodeParent;", "getRoot$ui_release", "()Landroidx/compose/ui/input/pointer/NodeParent;", "addHitPath", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerInputFilters", "", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "addHitPath-KNwqfcY", "(JLjava/util/List;)V", "dispatchChanges", "", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "processCancel", "removeDetachedPointerInputFilters", "removeHitPath", "removeHitPath-0FcD4WY", "(J)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class HitPathTracker {
    private final NodeParent root;
    private final LayoutCoordinates rootCoordinates;

    public HitPathTracker(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "rootCoordinates");
        super();
        this.rootCoordinates = layoutCoordinates0;
        this.root = new NodeParent();
    }

    public final void addHitPath-KNwqfcY(long v, List list0) {
        Object object1;
        Intrinsics.checkNotNullParameter(list0, "pointerInputFilters");
        NodeParent nodeParent0 = this.root;
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            boolean z = true;
            int v2 = 0;
            while(true) {
                PointerInputFilter pointerInputFilter0 = (PointerInputFilter)list0.get(v2);
                if(z) {
                    MutableVector mutableVector0 = nodeParent0.getChildren();
                    int v3 = mutableVector0.getSize();
                    if(v3 > 0) {
                        Object[] arr_object = mutableVector0.getContent();
                        int v4 = 0;
                        while(true) {
                            Object object0 = arr_object[v4];
                            if(Intrinsics.areEqual(((Node)object0).getPointerInputFilter(), pointerInputFilter0)) {
                                object1 = object0;
                                goto label_21;
                            }
                            if(v4 + 1 >= v3) {
                                break;
                            }
                            ++v4;
                        }
                    }
                    object1 = null;
                label_21:
                    if(((Node)object1) == null) {
                        z = false;
                    }
                    else {
                        if(!((Node)object1).getPointerIds().contains(PointerId.box-impl(v))) {
                            ((Node)object1).getPointerIds().add(PointerId.box-impl(v));
                        }
                        nodeParent0 = (Node)object1;
                        goto label_31;
                    }
                }
                Node node0 = new Node(pointerInputFilter0);
                node0.getPointerIds().add(PointerId.box-impl(v));
                nodeParent0.getChildren().add(node0);
                nodeParent0 = node0;
            label_31:
                if(v2 + 1 > v1 - 1) {
                    break;
                }
                ++v2;
            }
        }
    }

    public final boolean dispatchChanges(InternalPointerEvent internalPointerEvent0) {
        Intrinsics.checkNotNullParameter(internalPointerEvent0, "internalPointerEvent");
        boolean z = this.root.dispatchMainEventPass(internalPointerEvent0.getChanges(), this.rootCoordinates, internalPointerEvent0);
        return this.root.dispatchFinalEventPass() || z;
    }

    public final NodeParent getRoot$ui_release() {
        return this.root;
    }

    public final void processCancel() {
        this.root.dispatchCancel();
        this.root.clear();
    }

    public final void removeDetachedPointerInputFilters() {
        this.root.removeDetachedPointerInputFilters();
    }

    public final void removeHitPath-0FcD4WY(long v) {
        this.root.recursivelyRemovePointerId-0FcD4WY(v);
    }
}

