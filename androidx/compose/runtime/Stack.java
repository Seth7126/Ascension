package androidx.compose.runtime;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\u000B\u001A\u00020\fJ\u0006\u0010\r\u001A\u00020\u000EJ\u0006\u0010\u000F\u001A\u00020\u000EJ\u000B\u0010\u0010\u001A\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0010\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\b¢\u0006\u0002\u0010\u0013J\u000B\u0010\u0014\u001A\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0016\u001A\u00028\u0000¢\u0006\u0002\u0010\u0017J\u0011\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0002\u0010\u001AR\u001E\u0010\u0004\u001A\u0012\u0012\u0004\u0012\u00028\u00000\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/Stack;", "T", "", "()V", "backing", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "size", "", "getSize", "()I", "clear", "", "isEmpty", "", "isNotEmpty", "peek", "()Ljava/lang/Object;", "index", "(I)Ljava/lang/Object;", "pop", "push", "value", "(Ljava/lang/Object;)Z", "toArray", "", "()[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Stack {
    private final ArrayList backing;

    public Stack() {
        this.backing = new ArrayList();
    }

    public final void clear() {
        this.backing.clear();
    }

    public final int getSize() {
        return this.backing.size();
    }

    public final boolean isEmpty() {
        return this.backing.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !this.isEmpty();
    }

    public final Object peek() {
        int v = this.getSize();
        return this.backing.get(v - 1);
    }

    public final Object peek(int v) {
        return this.backing.get(v);
    }

    public final Object pop() {
        int v = this.getSize();
        return this.backing.remove(v - 1);
    }

    public final boolean push(Object object0) {
        return this.backing.add(object0);
    }

    public final Object[] toArray() {
        int v = this.backing.size();
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = this.backing.get(v1);
        }
        return arr_object;
    }
}

