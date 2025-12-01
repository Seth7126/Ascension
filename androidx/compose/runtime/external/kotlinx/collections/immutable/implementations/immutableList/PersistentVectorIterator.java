package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\b¢\u0006\u0002\u0010\u000BJ\u000E\u0010\u000F\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010J\r\u0010\u0011\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010R\u0016\u0010\u0006\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0088\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0014\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u000EX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorIterator;", "T", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "root", "", "", "tail", "index", "", "size", "trieHeight", "([Ljava/lang/Object;[Ljava/lang/Object;III)V", "[Ljava/lang/Object;", "trieIterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "next", "()Ljava/lang/Object;", "previous", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentVectorIterator extends AbstractListIterator {
    private final Object[] tail;
    private final TrieIterator trieIterator;

    public PersistentVectorIterator(Object[] arr_object, Object[] arr_object1, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_object, "root");
        Intrinsics.checkNotNullParameter(arr_object1, "tail");
        super(v, v1);
        this.tail = arr_object1;
        int v3 = v1 - 1 & 0xFFFFFFE0;
        this.trieIterator = new TrieIterator(arr_object, RangesKt.coerceAtMost(v, v3), v3, v2);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.checkHasNext$runtime_release();
        if(this.trieIterator.hasNext()) {
            this.setIndex(this.getIndex() + 1);
            return this.trieIterator.next();
        }
        int v = this.getIndex();
        this.setIndex(v + 1);
        return this.tail[v - this.trieIterator.getSize()];
    }

    @Override
    public Object previous() {
        this.checkHasPrevious$runtime_release();
        if(this.getIndex() > this.trieIterator.getSize()) {
            this.setIndex(this.getIndex() - 1);
            return this.tail[this.getIndex() - this.trieIterator.getSize()];
        }
        this.setIndex(this.getIndex() - 1);
        return this.trieIterator.previous();
    }
}

