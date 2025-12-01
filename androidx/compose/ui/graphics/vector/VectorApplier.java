package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.AbstractApplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0016J\u0018\u0010\n\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\u0002H\u0016J \u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\b2\u0006\u0010\r\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\bH\u0016J\b\u0010\u000F\u001A\u00020\u0006H\u0014J\u0018\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\bH\u0016J\f\u0010\u0011\u001A\u00020\u0012*\u00020\u0002H\u0002¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorApplier;", "Landroidx/compose/runtime/AbstractApplier;", "Landroidx/compose/ui/graphics/vector/VNode;", "root", "(Landroidx/compose/ui/graphics/vector/VNode;)V", "insertBottomUp", "", "index", "", "instance", "insertTopDown", "move", "from", "to", "count", "onClear", "remove", "asGroup", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class VectorApplier extends AbstractApplier {
    public static final int $stable;

    static {
    }

    public VectorApplier(VNode vNode0) {
        Intrinsics.checkNotNullParameter(vNode0, "root");
        super(vNode0);
    }

    private final GroupComponent asGroup(VNode vNode0) {
        if(!(vNode0 instanceof GroupComponent)) {
            throw new IllegalStateException("Cannot only insert VNode into Group");
        }
        return (GroupComponent)vNode0;
    }

    public void insertBottomUp(int v, VNode vNode0) {
        Intrinsics.checkNotNullParameter(vNode0, "instance");
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertBottomUp(int v, Object object0) {
        this.insertBottomUp(v, ((VNode)object0));
    }

    public void insertTopDown(int v, VNode vNode0) {
        Intrinsics.checkNotNullParameter(vNode0, "instance");
        this.asGroup(((VNode)this.getCurrent())).insertAt(v, vNode0);
    }

    @Override  // androidx.compose.runtime.Applier
    public void insertTopDown(int v, Object object0) {
        this.insertTopDown(v, ((VNode)object0));
    }

    @Override  // androidx.compose.runtime.Applier
    public void move(int v, int v1, int v2) {
        this.asGroup(((VNode)this.getCurrent())).move(v, v1, v2);
    }

    @Override  // androidx.compose.runtime.AbstractApplier
    protected void onClear() {
        GroupComponent groupComponent0 = this.asGroup(((VNode)this.getRoot()));
        groupComponent0.remove(0, groupComponent0.getNumChildren());
    }

    @Override  // androidx.compose.runtime.Applier
    public void remove(int v, int v1) {
        this.asGroup(((VNode)this.getCurrent())).remove(v, v1);
    }
}

