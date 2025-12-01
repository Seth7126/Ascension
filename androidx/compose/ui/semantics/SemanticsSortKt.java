package androidx.compose.ui.semantics;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\"\u0010\u0000\u001A\u0004\u0018\u00010\u0001*\u00020\u00012\u0012\u0010\u0002\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001A\"\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006*\u00020\u00012\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\tH\u0000\u001A\f\u0010\n\u001A\u00020\u000B*\u00020\u0001H\u0000¨\u0006\f"}, d2 = {"findNodeByPredicateTraversal", "Landroidx/compose/ui/node/LayoutNode;", "predicate", "Lkotlin/Function1;", "", "findOneLayerOfSemanticsWrappersSortedByBounds", "", "Landroidx/compose/ui/semantics/SemanticsWrapper;", "list", "", "findWrapperToGetBounds", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SemanticsSortKt {
    public static final LayoutNode findNodeByPredicateTraversal(LayoutNode layoutNode0, Function1 function10) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        if(((Boolean)function10.invoke(layoutNode0)).booleanValue()) {
            return layoutNode0;
        }
        List list0 = layoutNode0.getChildren$ui_release();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                LayoutNode layoutNode1 = SemanticsSortKt.findNodeByPredicateTraversal(((LayoutNode)list0.get(v1)), function10);
                if(layoutNode1 != null) {
                    return layoutNode1;
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return null;
    }

    public static final List findOneLayerOfSemanticsWrappersSortedByBounds(LayoutNode layoutNode0, List list0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "list");
        if(!layoutNode0.isAttached()) {
            return list0;
        }
        ArrayList arrayList0 = new ArrayList();
        List list1 = layoutNode0.getChildren$ui_release();
        int v = list1.size();
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                LayoutNode layoutNode1 = (LayoutNode)list1.get(v2);
                if(layoutNode1.isAttached()) {
                    arrayList0.add(new NodeLocationHolder(layoutNode0, layoutNode1));
                }
                if(v2 + 1 > v - 1) {
                    break;
                }
            }
        }
        List list2 = SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(arrayList0);
        ArrayList arrayList1 = new ArrayList(list2.size());
        int v3 = list2.size();
        if(v3 - 1 >= 0) {
            for(int v4 = 0; true; ++v4) {
                arrayList1.add(((NodeLocationHolder)list2.get(v4)).getNode$ui_release());
                if(v4 + 1 > v3 - 1) {
                    break;
                }
            }
        }
        int v5 = arrayList1.size();
        if(v5 - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                LayoutNode layoutNode2 = (LayoutNode)arrayList1.get(v1);
                SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode2);
                if(semanticsWrapper0 == null) {
                    SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode2, list0);
                }
                else {
                    list0.add(semanticsWrapper0);
                }
                if(v1 + 1 > v5 - 1) {
                    break;
                }
            }
        }
        return list0;
    }

    public static List findOneLayerOfSemanticsWrappersSortedByBounds$default(LayoutNode layoutNode0, List list0, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = new ArrayList();
        }
        return SemanticsSortKt.findOneLayerOfSemanticsWrappersSortedByBounds(layoutNode0, list0);
    }

    private static final List findOneLayerOfSemanticsWrappersSortedByBounds$sortWithStrategy(List list0) {
        List list1;
        try {
            NodeLocationHolder.Companion.setComparisonStrategy$ui_release(ComparisonStrategy.Stripe);
            list1 = CollectionsKt.toMutableList(list0);
            CollectionsKt.sort(list1);
        }
        catch(IllegalArgumentException unused_ex) {
            NodeLocationHolder.Companion.setComparisonStrategy$ui_release(ComparisonStrategy.Location);
            list1 = CollectionsKt.toMutableList(list0);
            CollectionsKt.sort(list1);
        }
        return list1;
    }

    public static final LayoutNodeWrapper findWrapperToGetBounds(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        SemanticsWrapper semanticsWrapper0 = SemanticsNodeKt.getOuterMergingSemantics(layoutNode0);
        if(semanticsWrapper0 == null) {
            semanticsWrapper0 = SemanticsNodeKt.getOuterSemantics(layoutNode0);
            if(semanticsWrapper0 == null) {
                return layoutNode0.getInnerLayoutNodeWrapper$ui_release();
            }
        }
        return semanticsWrapper0;
    }
}

