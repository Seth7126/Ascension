package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u000E2\u00020\u0001:\u0001\u000EB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001A\u00020\u0007J\u0010\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0005H\u0002J\u000E\u0010\n\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\u0005J\u000E\u0010\f\u001A\u00020\u00072\u0006\u0010\r\u001A\u00020\u0005R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher;", "", "()V", "layoutNodes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/node/LayoutNode;", "dispatch", "", "dispatchHierarchy", "layoutNode", "onNodePositioned", "node", "onRootNodePositioned", "rootNode", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class OnPositionedDispatcher {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion;", "", "()V", "DepthComparator", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/OnPositionedDispatcher$Companion$DepthComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        static final class DepthComparator implements Comparator {
            public static final DepthComparator INSTANCE;

            static {
                DepthComparator.INSTANCE = new DepthComparator();
            }

            public int compare(LayoutNode layoutNode0, LayoutNode layoutNode1) {
                Intrinsics.checkNotNullParameter(layoutNode0, "a");
                Intrinsics.checkNotNullParameter(layoutNode1, "b");
                int v = Intrinsics.compare(layoutNode1.getDepth$ui_release(), layoutNode0.getDepth$ui_release());
                return v == 0 ? Intrinsics.compare(layoutNode0.hashCode(), layoutNode1.hashCode()) : v;
            }

            // 检测为 Lambda 实现
            @Override
            public int compare(Object object0, Object object1) [...]
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion;
    private final MutableVector layoutNodes;

    static {
        OnPositionedDispatcher.Companion = new Companion(null);
    }

    public OnPositionedDispatcher() {
        this.layoutNodes = new MutableVector(new LayoutNode[16], 0);
    }

    public final void dispatch() {
        this.layoutNodes.sortWith((Object object0, Object object1) -> this.compare(((LayoutNode)object0), ((LayoutNode)object1)));
        MutableVector mutableVector0 = this.layoutNodes;
        int v = mutableVector0.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                LayoutNode layoutNode0 = (LayoutNode)arr_object[v1];
                if(layoutNode0.getNeedsOnPositionedDispatch$ui_release()) {
                    this.dispatchHierarchy(layoutNode0);
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        this.layoutNodes.clear();
    }

    private final void dispatchHierarchy(LayoutNode layoutNode0) {
        layoutNode0.dispatchOnPositionedCallbacks$ui_release();
        int v = 0;
        layoutNode0.setNeedsOnPositionedDispatch$ui_release(false);
        MutableVector mutableVector0 = layoutNode0.get_children$ui_release();
        int v1 = mutableVector0.getSize();
        if(v1 > 0) {
            Object[] arr_object = mutableVector0.getContent();
            while(true) {
                this.dispatchHierarchy(((LayoutNode)arr_object[v]));
                ++v;
                if(v >= v1) {
                    break;
                }
            }
        }
    }

    public final void onNodePositioned(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        this.layoutNodes.add(layoutNode0);
        layoutNode0.setNeedsOnPositionedDispatch$ui_release(true);
    }

    public final void onRootNodePositioned(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "rootNode");
        this.layoutNodes.clear();
        this.layoutNodes.add(layoutNode0);
        layoutNode0.setNeedsOnPositionedDispatch$ui_release(true);
    }
}

