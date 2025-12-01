package androidx.compose.ui.node;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000E\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0007J\u000E\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0014\u001A\u00020\u0007J\u0006\u0010\u0016\u001A\u00020\u0003J\t\u0010\u0017\u001A\u00020\u0003H\u0086\bJ\u0006\u0010\u0018\u001A\u00020\u0007J\"\u0010\u0019\u001A\u00020\u00132\u0014\b\u0004\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u001BH\u0086\bø\u0001\u0000J\u000E\u0010\u001C\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0007J\b\u0010\u001D\u001A\u00020\u001EH\u0016R\u001E\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\'\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000B0\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "extraAssertions", "", "(Z)V", "DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "mapOfOriginalDepth", "", "", "getMapOfOriginalDepth", "()Ljava/util/Map;", "mapOfOriginalDepth$delegate", "Lkotlin/Lazy;", "set", "Landroidx/compose/ui/node/TreeSet;", "add", "", "node", "contains", "isEmpty", "isNotEmpty", "pop", "popEach", "block", "Lkotlin/Function1;", "remove", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DepthSortedSet {
    private final Comparator DepthComparator;
    private final boolean extraAssertions;
    private final Lazy mapOfOriginalDepth$delegate;
    private final TreeSet set;

    static {
    }

    public DepthSortedSet() {
        this(false, 1, null);
    }

    public DepthSortedSet(boolean z) {
        this.extraAssertions = z;
        this.mapOfOriginalDepth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2.INSTANCE);
        Comparator comparator0 = new androidx.compose.ui.node.DepthSortedSet.DepthComparator.1();
        this.DepthComparator = comparator0;
        this.set = new TreeSet(comparator0);

        @Metadata(d1 = {"\u0000\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u0018\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"androidx/compose/ui/node/DepthSortedSet$DepthComparator$1", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/Comparator;", "compare", "", "l1", "l2", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public final class androidx.compose.ui.node.DepthSortedSet.DepthComparator.1 implements Comparator {
            public int compare(LayoutNode layoutNode0, LayoutNode layoutNode1) {
                Intrinsics.checkNotNullParameter(layoutNode0, "l1");
                Intrinsics.checkNotNullParameter(layoutNode1, "l2");
                int v = Intrinsics.compare(layoutNode0.getDepth$ui_release(), layoutNode1.getDepth$ui_release());
                return v == 0 ? Intrinsics.compare(layoutNode0.hashCode(), layoutNode1.hashCode()) : v;
            }

            @Override
            public int compare(Object object0, Object object1) {
                return this.compare(((LayoutNode)object0), ((LayoutNode)object1));
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "Landroidx/compose/ui/node/LayoutNode;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2 extends Lambda implements Function0 {
            public static final androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2 INSTANCE;

            static {
                androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2.INSTANCE = new androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2();
            }

            androidx.compose.ui.node.DepthSortedSet.mapOfOriginalDepth.2() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }

            public final Map invoke() {
                return new LinkedHashMap();
            }
        }

    }

    public DepthSortedSet(boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            z = true;
        }
        this(z);
    }

    public final void add(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        if(!layoutNode0.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        if(this.extraAssertions) {
            Integer integer0 = (Integer)this.getMapOfOriginalDepth().get(layoutNode0);
            if(integer0 == null) {
                this.getMapOfOriginalDepth().put(layoutNode0, layoutNode0.getDepth$ui_release());
            }
            else if(((int)integer0) != layoutNode0.getDepth$ui_release()) {
                throw new IllegalStateException("Check failed.");
            }
        }
        this.set.add(layoutNode0);
    }

    public final boolean contains(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        boolean z = this.set.contains(layoutNode0);
        if(this.extraAssertions && z != this.getMapOfOriginalDepth().containsKey(layoutNode0)) {
            throw new IllegalStateException("Check failed.");
        }
        return z;
    }

    private final Map getMapOfOriginalDepth() {
        return (Map)this.mapOfOriginalDepth$delegate.getValue();
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.isEmpty();
    }

    public final LayoutNode pop() {
        LayoutNode layoutNode0 = (LayoutNode)this.set.first();
        Intrinsics.checkNotNullExpressionValue(layoutNode0, "node");
        this.remove(layoutNode0);
        return layoutNode0;
    }

    public final void popEach(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        while(!this.isEmpty() != 0) {
            function10.invoke(this.pop());
        }
    }

    public final void remove(LayoutNode layoutNode0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "node");
        if(!layoutNode0.isAttached()) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z = this.set.remove(layoutNode0);
        if(this.extraAssertions) {
            Integer integer0 = (Integer)this.getMapOfOriginalDepth().remove(layoutNode0);
            if(z) {
                if(integer0 == null || ((int)integer0) != layoutNode0.getDepth$ui_release()) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            else if(integer0 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
    }

    @Override
    public String toString() {
        String s = this.set.toString();
        Intrinsics.checkNotNullExpressionValue(s, "set.toString()");
        return s;
    }
}

