package androidx.compose.ui.semantics;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates.DefaultImpls;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0010\u0011B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u0000H\u0096\u0002R\u000E\u0010\u0006\u001A\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001A\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0014\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u000B¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder;", "", "subtreeRoot", "Landroidx/compose/ui/node/LayoutNode;", "node", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutNode;)V", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "location", "Landroidx/compose/ui/geometry/Rect;", "getNode$ui_release", "()Landroidx/compose/ui/node/LayoutNode;", "getSubtreeRoot$ui_release", "compareTo", "", "other", "Companion", "ComparisonStrategy", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class NodeLocationHolder implements Comparable {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$Companion;", "", "()V", "comparisonStrategy", "Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "getComparisonStrategy$ui_release", "()Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "setComparisonStrategy$ui_release", "(Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final ComparisonStrategy getComparisonStrategy$ui_release() {
            return NodeLocationHolder.comparisonStrategy;
        }

        public final void setComparisonStrategy$ui_release(ComparisonStrategy nodeLocationHolder$ComparisonStrategy0) {
            Intrinsics.checkNotNullParameter(nodeLocationHolder$ComparisonStrategy0, "<set-?>");
            NodeLocationHolder.comparisonStrategy = nodeLocationHolder$ComparisonStrategy0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/semantics/NodeLocationHolder$ComparisonStrategy;", "", "(Ljava/lang/String;I)V", "Stripe", "Location", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static enum ComparisonStrategy {
        Stripe,
        Location;

        private static final ComparisonStrategy[] $values() [...] // Inlined contents
    }

    public static final Companion Companion;
    private static ComparisonStrategy comparisonStrategy;
    private final LayoutDirection layoutDirection;
    private final Rect location;
    private final LayoutNode node;
    private final LayoutNode subtreeRoot;

    static {
        NodeLocationHolder.Companion = new Companion(null);
        NodeLocationHolder.comparisonStrategy = ComparisonStrategy.Stripe;
    }

    public NodeLocationHolder(LayoutNode layoutNode0, LayoutNode layoutNode1) {
        Intrinsics.checkNotNullParameter(layoutNode0, "subtreeRoot");
        Intrinsics.checkNotNullParameter(layoutNode1, "node");
        super();
        this.subtreeRoot = layoutNode0;
        this.node = layoutNode1;
        this.layoutDirection = layoutNode0.getLayoutDirection();
        LayoutNodeWrapper layoutNodeWrapper0 = layoutNode0.getInnerLayoutNodeWrapper$ui_release();
        LayoutNodeWrapper layoutNodeWrapper1 = SemanticsSortKt.findWrapperToGetBounds(layoutNode1);
        this.location = !layoutNodeWrapper0.isAttached() || !layoutNodeWrapper1.isAttached() ? null : DefaultImpls.localBoundingBoxOf$default(layoutNodeWrapper0, layoutNodeWrapper1, false, 2, null);
    }

    public int compareTo(NodeLocationHolder nodeLocationHolder0) {
        Intrinsics.checkNotNullParameter(nodeLocationHolder0, "other");
        if(this.location == null) {
            return 1;
        }
        if(nodeLocationHolder0.location == null) {
            return -1;
        }
        if(NodeLocationHolder.comparisonStrategy == ComparisonStrategy.Stripe) {
            if(this.location.getBottom() - nodeLocationHolder0.location.getTop() <= 0.0f) {
                return -1;
            }
            if(this.location.getTop() - nodeLocationHolder0.location.getBottom() >= 0.0f) {
                return 1;
            }
        }
        if(this.layoutDirection == LayoutDirection.Ltr) {
            int v = Float.compare(this.location.getLeft() - nodeLocationHolder0.location.getLeft(), 0.0f);
            if(v != 0) {
                return v >= 0 ? 1 : -1;
            }
        }
        else {
            int v1 = Float.compare(this.location.getRight() - nodeLocationHolder0.location.getRight(), 0.0f);
            if(v1 != 0) {
                return v1 < 0 ? 1 : -1;
            }
        }
        int v2 = Float.compare(this.location.getTop() - nodeLocationHolder0.location.getTop(), 0.0f);
        if(v2 != 0) {
            return v2 >= 0 ? 1 : -1;
        }
        int v3 = Float.compare(this.location.getHeight() - nodeLocationHolder0.location.getHeight(), 0.0f);
        if(v3 != 0) {
            return v3 < 0 ? 1 : -1;
        }
        int v4 = Float.compare(this.location.getWidth() - nodeLocationHolder0.location.getWidth(), 0.0f);
        if(v4 != 0) {
            return v4 < 0 ? 1 : -1;
        }
        Rect rect0 = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(this.node));
        Rect rect1 = LayoutCoordinatesKt.boundsInRoot(SemanticsSortKt.findWrapperToGetBounds(nodeLocationHolder0.node));
        Function1 function10 = new Function1() {
            final Rect $view1Bounds;

            {
                this.$view1Bounds = rect0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "it");
                LayoutNodeWrapper layoutNodeWrapper0 = SemanticsSortKt.findWrapperToGetBounds(layoutNode0);
                if(layoutNodeWrapper0.isAttached()) {
                    Rect rect0 = LayoutCoordinatesKt.boundsInRoot(layoutNodeWrapper0);
                    return !Intrinsics.areEqual(this.$view1Bounds, rect0);
                }
                return false;
            }
        };
        LayoutNode layoutNode0 = SemanticsSortKt.findNodeByPredicateTraversal(this.node, function10);
        Function1 function11 = new Function1() {
            final Rect $view2Bounds;

            {
                this.$view2Bounds = rect0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(((LayoutNode)object0)));
            }

            public final boolean invoke(LayoutNode layoutNode0) {
                Intrinsics.checkNotNullParameter(layoutNode0, "it");
                LayoutNodeWrapper layoutNodeWrapper0 = SemanticsSortKt.findWrapperToGetBounds(layoutNode0);
                if(layoutNodeWrapper0.isAttached()) {
                    Rect rect0 = LayoutCoordinatesKt.boundsInRoot(layoutNodeWrapper0);
                    return !Intrinsics.areEqual(this.$view2Bounds, rect0);
                }
                return false;
            }
        };
        LayoutNode layoutNode1 = SemanticsSortKt.findNodeByPredicateTraversal(nodeLocationHolder0.node, function11);
        if(layoutNode0 != null && layoutNode1 != null) {
            return new NodeLocationHolder(this.subtreeRoot, layoutNode0).compareTo(new NodeLocationHolder(nodeLocationHolder0.subtreeRoot, layoutNode1));
        }
        return layoutNode0 == null ? -1 : 1;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((NodeLocationHolder)object0));
    }

    public final LayoutNode getNode$ui_release() {
        return this.node;
    }

    public final LayoutNode getSubtreeRoot$ui_release() {
        return this.subtreeRoot;
    }
}

