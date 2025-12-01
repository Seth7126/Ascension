package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u001B\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001A\u00020\u000EH\u0002J\b\u0010\u0012\u001A\u00020\u000EH\u0002J\u000E\u0010\u0013\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\r\u0010\u0015\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0016\u001A\u00020\u000EH\u0016J\b\u0010\u0017\u001A\u00020\u000EH\u0002J\u0015\u0010\u0018\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0019\u001A\u00020\u000EH\u0002R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u0016\u0010\u000B\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\fX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorMutableIterator;", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "index", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;I)V", "expectedModCount", "lastIteratedIndex", "trieIterator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "add", "", "element", "(Ljava/lang/Object;)V", "checkForComodification", "checkHasIterated", "next", "()Ljava/lang/Object;", "previous", "remove", "reset", "set", "setupTrieIterator", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentVectorMutableIterator extends AbstractListIterator implements ListIterator, KMutableListIterator {
    private final PersistentVectorBuilder builder;
    private int expectedModCount;
    private int lastIteratedIndex;
    private TrieIterator trieIterator;

    public PersistentVectorMutableIterator(PersistentVectorBuilder persistentVectorBuilder0, int v) {
        Intrinsics.checkNotNullParameter(persistentVectorBuilder0, "builder");
        super(v, persistentVectorBuilder0.size());
        this.builder = persistentVectorBuilder0;
        this.expectedModCount = persistentVectorBuilder0.getModCount$runtime_release();
        this.lastIteratedIndex = -1;
        this.setupTrieIterator();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void add(Object object0) {
        this.checkForComodification();
        int v = this.getIndex();
        this.builder.add(v, object0);
        this.setIndex(this.getIndex() + 1);
        this.reset();
    }

    private final void checkForComodification() {
        if(this.expectedModCount != this.builder.getModCount$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasIterated() {
        if(this.lastIteratedIndex == -1) {
            throw new IllegalStateException();
        }
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.checkForComodification();
        this.checkHasNext$runtime_release();
        this.lastIteratedIndex = this.getIndex();
        TrieIterator trieIterator0 = this.trieIterator;
        if(trieIterator0 == null) {
            int v = this.getIndex();
            this.setIndex(v + 1);
            return this.builder.getTail$runtime_release()[v];
        }
        if(trieIterator0.hasNext()) {
            this.setIndex(this.getIndex() + 1);
            return trieIterator0.next();
        }
        int v1 = this.getIndex();
        this.setIndex(v1 + 1);
        return this.builder.getTail$runtime_release()[v1 - trieIterator0.getSize()];
    }

    @Override
    public Object previous() {
        this.checkForComodification();
        this.checkHasPrevious$runtime_release();
        this.lastIteratedIndex = this.getIndex() - 1;
        TrieIterator trieIterator0 = this.trieIterator;
        if(trieIterator0 == null) {
            this.setIndex(this.getIndex() - 1);
            return this.builder.getTail$runtime_release()[this.getIndex()];
        }
        if(this.getIndex() > trieIterator0.getSize()) {
            this.setIndex(this.getIndex() - 1);
            return this.builder.getTail$runtime_release()[this.getIndex() - trieIterator0.getSize()];
        }
        this.setIndex(this.getIndex() - 1);
        return trieIterator0.previous();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void remove() {
        this.checkForComodification();
        this.checkHasIterated();
        this.builder.remove(this.lastIteratedIndex);
        if(this.lastIteratedIndex < this.getIndex()) {
            this.setIndex(this.lastIteratedIndex);
        }
        this.reset();
    }

    private final void reset() {
        this.setSize(this.builder.size());
        this.expectedModCount = this.builder.getModCount$runtime_release();
        this.lastIteratedIndex = -1;
        this.setupTrieIterator();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public void set(Object object0) {
        this.checkForComodification();
        this.checkHasIterated();
        this.builder.set(this.lastIteratedIndex, object0);
        this.expectedModCount = this.builder.getModCount$runtime_release();
        this.setupTrieIterator();
    }

    private final void setupTrieIterator() {
        Object[] arr_object = this.builder.getRoot$runtime_release();
        if(arr_object == null) {
            this.trieIterator = null;
            return;
        }
        int v = UtilsKt.rootSize(this.builder.size());
        int v1 = RangesKt.coerceAtMost(this.getIndex(), v);
        int v2 = this.builder.getRootShift$runtime_release() / 5 + 1;
        TrieIterator trieIterator0 = this.trieIterator;
        if(trieIterator0 == null) {
            this.trieIterator = new TrieIterator(arr_object, v1, v, v2);
            return;
        }
        Intrinsics.checkNotNull(trieIterator0);
        trieIterator0.reset$runtime_release(arr_object, v1, v, v2);
    }
}

