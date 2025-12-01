package androidx.compose.runtime;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001A\u00020\u000BJ\u0006\u0010\f\u001A\u00020\rJ\u0006\u0010\u000E\u001A\u00020\rJ\u0006\u0010\u000F\u001A\u00020\u0004J\u000E\u0010\u000F\u001A\u00020\u00042\u0006\u0010\u0010\u001A\u00020\u0004J\u000E\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0004J\u0006\u0010\u0013\u001A\u00020\u0004J\u000E\u0010\u0014\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0004R\u0011\u0010\u0003\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/IntStack;", "", "()V", "size", "", "getSize", "()I", "slots", "", "tos", "clear", "", "isEmpty", "", "isNotEmpty", "peek", "index", "peekOr", "default", "pop", "push", "value", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IntStack {
    private int[] slots;
    private int tos;

    public IntStack() {
        this.slots = new int[10];
    }

    public final void clear() {
        this.tos = 0;
    }

    public final int getSize() {
        return this.tos;
    }

    public final boolean isEmpty() {
        return this.tos == 0;
    }

    public final boolean isNotEmpty() {
        return this.tos != 0;
    }

    public final int peek() {
        return this.slots[this.tos - 1];
    }

    public final int peek(int v) {
        return this.slots[v];
    }

    public final int peekOr(int v) {
        return this.tos <= 0 ? v : this.peek();
    }

    public final int pop() {
        int v = this.tos - 1;
        this.tos = v;
        return this.slots[v];
    }

    public final void push(int v) {
        int[] arr_v = this.slots;
        if(this.tos >= arr_v.length) {
            int[] arr_v1 = Arrays.copyOf(arr_v, arr_v.length * 2);
            Intrinsics.checkNotNullExpressionValue(arr_v1, "java.util.Arrays.copyOf(this, newSize)");
            this.slots = arr_v1;
        }
        int v1 = this.tos;
        this.tos = v1 + 1;
        this.slots[v1] = v;
    }
}

