package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.AbstractMutableSet;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0017\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001AJ\u000E\u0010\u001B\u001A\b\u0012\u0004\u0012\u00028\u00000\u001CH\u0016J\b\u0010\u001D\u001A\u00020\u001EH\u0016J\u0016\u0010\u001F\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u001AJ\u000F\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000!H\u0096\u0002J\u0015\u0010\"\u001A\u00020\u00182\u0006\u0010\u0019\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001AR\u001C\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR \u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000F0\u000EX\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001A\u0004\u0018\u00010\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006#"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "E", "Lkotlin/collections/AbstractMutableSet;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet$Builder;", "set", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSet;)V", "firstElement", "", "getFirstElement$runtime_release", "()Ljava/lang/Object;", "setFirstElement$runtime_release", "(Ljava/lang/Object;)V", "hashMapBuilder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "getHashMapBuilder$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "lastElement", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "clear", "", "contains", "iterator", "", "remove", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentOrderedSetBuilder extends AbstractMutableSet implements Builder {
    private Object firstElement;
    private final PersistentHashMapBuilder hashMapBuilder;
    private Object lastElement;
    private PersistentOrderedSet set;

    public PersistentOrderedSetBuilder(PersistentOrderedSet persistentOrderedSet0) {
        Intrinsics.checkNotNullParameter(persistentOrderedSet0, "set");
        super();
        this.set = persistentOrderedSet0;
        this.firstElement = persistentOrderedSet0.getFirstElement$runtime_release();
        this.lastElement = this.set.getLastElement$runtime_release();
        this.hashMapBuilder = this.set.getHashMap$runtime_release().builder();
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public boolean add(Object object0) {
        if(this.hashMapBuilder.containsKey(object0)) {
            return false;
        }
        if(this.isEmpty()) {
            this.firstElement = object0;
            this.lastElement = object0;
            Links links0 = new Links();
            this.hashMapBuilder.put(object0, links0);
            return true;
        }
        Object object1 = this.hashMapBuilder.get(this.lastElement);
        Intrinsics.checkNotNull(object1);
        Object object2 = this.lastElement;
        Links links1 = ((Links)object1).withNext(object0);
        this.hashMapBuilder.put(object2, links1);
        Links links2 = new Links(this.lastElement);
        this.hashMapBuilder.put(object0, links2);
        this.lastElement = object0;
        return true;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection$Builder
    public PersistentCollection build() {
        return this.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet$Builder
    public PersistentSet build() {
        PersistentOrderedSet persistentOrderedSet0;
        PersistentHashMap persistentHashMap0 = this.hashMapBuilder.build();
        if(persistentHashMap0 == this.set.getHashMap$runtime_release()) {
            boolean z = this.firstElement != this.set.getFirstElement$runtime_release();
            boolean z1 = this.lastElement == this.set.getLastElement$runtime_release();
            persistentOrderedSet0 = this.set;
        }
        else {
            persistentOrderedSet0 = new PersistentOrderedSet(this.firstElement, this.lastElement, persistentHashMap0);
        }
        this.set = persistentOrderedSet0;
        return persistentOrderedSet0;
    }

    @Override
    public void clear() {
        this.hashMapBuilder.clear();
        this.firstElement = EndOfChain.INSTANCE;
        this.lastElement = EndOfChain.INSTANCE;
    }

    @Override
    public boolean contains(Object object0) {
        return this.hashMapBuilder.containsKey(object0);
    }

    public final Object getFirstElement$runtime_release() {
        return this.firstElement;
    }

    public final PersistentHashMapBuilder getHashMapBuilder$runtime_release() {
        return this.hashMapBuilder;
    }

    @Override  // kotlin.collections.AbstractMutableSet
    public int getSize() {
        return this.hashMapBuilder.size();
    }

    @Override
    public Iterator iterator() {
        return new PersistentOrderedSetMutableIterator(this);
    }

    @Override
    public boolean remove(Object object0) {
        Links links0 = (Links)this.hashMapBuilder.remove(object0);
        if(links0 == null) {
            return false;
        }
        if(links0.getHasPrevious()) {
            Object object1 = this.hashMapBuilder.get(links0.getPrevious());
            Intrinsics.checkNotNull(object1);
            Links links1 = ((Links)object1).withNext(links0.getNext());
            this.hashMapBuilder.put(links0.getPrevious(), links1);
        }
        else {
            this.firstElement = links0.getNext();
        }
        if(links0.getHasNext()) {
            Object object2 = this.hashMapBuilder.get(links0.getNext());
            Intrinsics.checkNotNull(object2);
            Links links2 = ((Links)object2).withPrevious(links0.getPrevious());
            this.hashMapBuilder.put(links0.getNext(), links2);
            return true;
        }
        this.lastElement = links0.getPrevious();
        return true;
    }

    public final void setFirstElement$runtime_release(Object object0) {
        this.firstElement = object0;
    }
}

