package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\b\u0012\u0004\u0012\u0002H\u00030\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u000B\u0010\u0014\u001A\u00028\u0000¢\u0006\u0002\u0010\u0015J\u0016\u0010\u0016\u001A\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0017J\t\u0010\u0018\u001A\u00020\u0019H\u0096\u0002J\u0006\u0010\u001A\u001A\u00020\u0019J\u0006\u0010\u001B\u001A\u00020\u0019J\u0006\u0010\u001C\u001A\u00020\u001DJ\u0006\u0010\u001E\u001A\u00020\u001DJ#\u0010\u001F\u001A\u00020\u001D2\u000E\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\r\u001A\u00020\u000E¢\u0006\u0002\u0010 J+\u0010\u001F\u001A\u00020\u001D2\u000E\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0002\u0010!R0\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00072\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007@BX\u0084\u000E¢\u0006\n\n\u0002\u0010\f\u001A\u0004\b\n\u0010\u000BR\u000E\u0010\r\u001A\u00020\u000EX\u0082\u000E¢\u0006\u0002\n\u0000R\u001A\u0010\u000F\u001A\u00020\u000EX\u0084\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "K", "V", "T", "", "()V", "<set-?>", "", "", "buffer", "getBuffer", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "dataSize", "", "index", "getIndex", "()I", "setIndex", "(I)V", "currentKey", "()Ljava/lang/Object;", "currentNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "hasNext", "", "hasNextKey", "hasNextNode", "moveToNextKey", "", "moveToNextNode", "reset", "([Ljava/lang/Object;I)V", "([Ljava/lang/Object;II)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class TrieNodeBaseIterator implements Iterator, KMappedMarker {
    private Object[] buffer;
    private int dataSize;
    private int index;

    public TrieNodeBaseIterator() {
        this.buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    }

    public final Object currentKey() {
        return this.buffer[this.index];
    }

    public final TrieNode currentNode() {
        this.hasNextNode();
        Object object0 = this.buffer[this.index];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        }
        return (TrieNode)object0;
    }

    protected final Object[] getBuffer() {
        return this.buffer;
    }

    protected final int getIndex() {
        return this.index;
    }

    @Override
    public boolean hasNext() {
        return this.hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    public final boolean hasNextNode() {
        return this.index < this.buffer.length;
    }

    public final void moveToNextKey() {
        this.index += 2;
    }

    public final void moveToNextNode() {
        this.hasNextNode();
        ++this.index;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this.reset(arr_object, v, 0);
    }

    public final void reset(Object[] arr_object, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this.buffer = arr_object;
        this.dataSize = v;
        this.index = v1;
    }

    protected final void setIndex(int v) {
        this.index = v;
    }
}

