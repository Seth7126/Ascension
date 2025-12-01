package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u000B\u0010\t\u001A\u00028\u0000¢\u0006\u0002\u0010\nJ\u000E\u0010\u000B\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\fJ\u0006\u0010\r\u001A\u00020\u000EJ\u0006\u0010\u000F\u001A\u00020\u000EJ\u0006\u0010\u0010\u001A\u00020\u000EJ\u0006\u0010\u0011\u001A\u00020\u0012J\u000B\u0010\u0013\u001A\u00028\u0000¢\u0006\u0002\u0010\nJ%\u0010\u0014\u001A\u00020\u00122\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\u0015R\u0018\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u000E¢\u0006\u0004\n\u0002\u0010\u0006R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNodeIterator;", "E", "", "()V", "buffer", "", "[Ljava/lang/Object;", "index", "", "currentElement", "()Ljava/lang/Object;", "currentNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "hasNextCell", "", "hasNextElement", "hasNextNode", "moveToNextCell", "", "nextElement", "reset", "([Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TrieNodeIterator {
    private Object[] buffer;
    private int index;

    public TrieNodeIterator() {
        this.buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer();
    }

    public final Object currentElement() {
        this.hasNextElement();
        return this.buffer[this.index];
    }

    public final TrieNode currentNode() {
        this.hasNextNode();
        Object object0 = this.buffer[this.index];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        }
        return (TrieNode)object0;
    }

    public final boolean hasNextCell() {
        return this.index < this.buffer.length;
    }

    // 去混淆评级： 低(20)
    public final boolean hasNextElement() {
        return this.hasNextCell() && !(this.buffer[this.index] instanceof TrieNode);
    }

    // 去混淆评级： 低(20)
    public final boolean hasNextNode() {
        return this.hasNextCell() && this.buffer[this.index] instanceof TrieNode;
    }

    public final void moveToNextCell() {
        ++this.index;
    }

    public final Object nextElement() {
        this.hasNextElement();
        int v = this.index;
        this.index = v + 1;
        return this.buffer[v];
    }

    public final void reset(Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this.buffer = arr_object;
        this.index = v;
    }

    public static void reset$default(TrieNodeIterator trieNodeIterator0, Object[] arr_object, int v, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        trieNodeIterator0.reset(arr_object, v);
    }
}

