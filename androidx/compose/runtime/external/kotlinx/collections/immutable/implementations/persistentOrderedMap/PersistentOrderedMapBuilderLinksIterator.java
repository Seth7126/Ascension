package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003B#\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b¢\u0006\u0002\u0010\tJ\b\u0010\u001A\u001A\u00020\u001BH\u0002J\b\u0010\u001C\u001A\u00020\u001BH\u0002J\b\u0010\u001D\u001A\u00020\u001BH\u0002J\t\u0010\u001E\u001A\u00020\u0019H\u0096\u0002J\u000F\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002J\b\u0010 \u001A\u00020\u001BH\u0016R \u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bX\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u000E\u0010\f\u001A\u00020\rX\u0082\u000E¢\u0006\u0002\n\u0000R\u001A\u0010\u000E\u001A\u00020\rX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001C\u0010\u0013\u001A\u0004\u0018\u00010\u0006X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0018\u001A\u00020\u0019X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilderLinksIterator;", "K", "V", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "nextKey", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;)V", "getBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/PersistentOrderedMapBuilder;", "expectedModCount", "", "index", "getIndex$runtime_release", "()I", "setIndex$runtime_release", "(I)V", "lastIteratedKey", "getLastIteratedKey$runtime_release", "()Ljava/lang/Object;", "setLastIteratedKey$runtime_release", "(Ljava/lang/Object;)V", "nextWasInvoked", "", "checkForComodification", "", "checkHasNext", "checkNextWasInvoked", "hasNext", "next", "remove", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class PersistentOrderedMapBuilderLinksIterator implements Iterator, KMutableIterator {
    private final PersistentOrderedMapBuilder builder;
    private int expectedModCount;
    private int index;
    private Object lastIteratedKey;
    private Object nextKey;
    private boolean nextWasInvoked;

    public PersistentOrderedMapBuilderLinksIterator(Object object0, PersistentOrderedMapBuilder persistentOrderedMapBuilder0) {
        Intrinsics.checkNotNullParameter(persistentOrderedMapBuilder0, "builder");
        super();
        this.nextKey = object0;
        this.builder = persistentOrderedMapBuilder0;
        this.lastIteratedKey = EndOfChain.INSTANCE;
        this.expectedModCount = persistentOrderedMapBuilder0.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if(this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkHasNext() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
    }

    private final void checkNextWasInvoked() {
        if(!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    public final PersistentOrderedMapBuilder getBuilder$runtime_release() {
        return this.builder;
    }

    public final int getIndex$runtime_release() {
        return this.index;
    }

    public final Object getLastIteratedKey$runtime_release() {
        return this.lastIteratedKey;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.builder.size();
    }

    public LinkedValue next() {
        this.checkForComodification();
        this.checkHasNext();
        this.lastIteratedKey = this.nextKey;
        this.nextWasInvoked = true;
        ++this.index;
        Object object0 = this.builder.getHashMapBuilder$runtime_release().get(this.nextKey);
        if(object0 == null) {
            throw new ConcurrentModificationException("Hash code of a key (" + this.nextKey + ") has changed after it was added to the persistent map.");
        }
        this.nextKey = ((LinkedValue)object0).getNext();
        return (LinkedValue)object0;
    }

    @Override
    public Object next() {
        return this.next();
    }

    @Override
    public void remove() {
        this.checkNextWasInvoked();
        Map map0 = this.builder;
        Object object0 = this.lastIteratedKey;
        if(map0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        }
        TypeIntrinsics.asMutableMap(map0).remove(object0);
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        --this.index;
    }

    public final void setIndex$runtime_release(int v) {
        this.index = v;
    }

    public final void setLastIteratedKey$runtime_release(Object object0) {
        this.lastIteratedKey = object0;
    }
}

