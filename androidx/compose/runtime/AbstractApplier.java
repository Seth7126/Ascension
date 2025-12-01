package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\b\'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000E\u001A\u00020\u000FJ\u0015\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001A\u00020\u000FH$J\b\u0010\u0013\u001A\u00020\u000FH\u0016J*\u0010\u0014\u001A\u00020\u000F*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u0016H\u0004J\"\u0010\u0019\u001A\u00020\u000F*\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u001A\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u0016H\u0004R&\u0010\u0006\u001A\u00028\u00002\u0006\u0010\u0005\u001A\u00028\u0000@TX\u0096\u000E¢\u0006\u0010\n\u0002\u0010\n\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0004R\u0013\u0010\u0003\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001A\u0004\b\u000B\u0010\bR\u0014\u0010\f\u001A\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/AbstractApplier;", "T", "Landroidx/compose/runtime/Applier;", "root", "(Ljava/lang/Object;)V", "<set-?>", "current", "getCurrent", "()Ljava/lang/Object;", "setCurrent", "Ljava/lang/Object;", "getRoot", "stack", "", "clear", "", "down", "node", "onClear", "up", "move", "from", "", "to", "count", "remove", "index", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class AbstractApplier implements Applier {
    public static final int $stable = 8;
    private Object current;
    private final Object root;
    private final List stack;

    static {
    }

    public AbstractApplier(Object object0) {
        this.root = object0;
        this.stack = new ArrayList();
        this.current = object0;
    }

    @Override  // androidx.compose.runtime.Applier
    public final void clear() {
        this.stack.clear();
        this.setCurrent(this.root);
        this.onClear();
    }

    @Override  // androidx.compose.runtime.Applier
    public void down(Object object0) {
        this.stack.add(this.getCurrent());
        this.setCurrent(object0);
    }

    @Override  // androidx.compose.runtime.Applier
    public Object getCurrent() {
        return this.current;
    }

    public final Object getRoot() {
        return this.root;
    }

    protected final void move(List list0, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        int v3 = v <= v1 ? v1 - v2 : v1;
        if(v2 == 1) {
            if(v != v1 + 1 && v != v1 - 1) {
                list0.add(v3, list0.remove(v));
                return;
            }
            list0.set(v, list0.set(v1, list0.get(v)));
            return;
        }
        List list1 = list0.subList(v, v2 + v);
        List list2 = CollectionsKt.toMutableList(list1);
        list1.clear();
        list0.addAll(v3, list2);
    }

    @Override  // androidx.compose.runtime.Applier
    public void onBeginChanges() {
        DefaultImpls.onBeginChanges(this);
    }

    protected abstract void onClear();

    @Override  // androidx.compose.runtime.Applier
    public void onEndChanges() {
        DefaultImpls.onEndChanges(this);
    }

    protected final void remove(List list0, int v, int v1) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        if(v1 == 1) {
            list0.remove(v);
            return;
        }
        list0.subList(v, v1 + v).clear();
    }

    protected void setCurrent(Object object0) {
        this.current = object0;
    }

    @Override  // androidx.compose.runtime.Applier
    public void up() {
        if(!this.stack.isEmpty() == 0) {
            throw new IllegalStateException("Check failed.");
        }
        this.setCurrent(this.stack.remove(this.stack.size() - 1));
    }
}

