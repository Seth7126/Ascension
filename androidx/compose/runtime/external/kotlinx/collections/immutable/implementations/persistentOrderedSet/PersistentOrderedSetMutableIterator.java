package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001A\u00020\u000EH\u0002J\b\u0010\u000F\u001A\u00020\u000EH\u0002J\u000E\u0010\u0010\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001A\u00020\u000EH\u0016R\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001A\u0004\u0018\u00018\u0000X\u0082\u000E¢\u0006\u0004\n\u0002\u0010\nR\u000E\u0010\u000B\u001A\u00020\fX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetIterator;", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/PersistentOrderedSetBuilder;)V", "expectedModCount", "", "lastIteratedElement", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "next", "()Ljava/lang/Object;", "remove", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentOrderedSetMutableIterator extends PersistentOrderedSetIterator implements Iterator, KMutableIterator {
    private final PersistentOrderedSetBuilder builder;
    private int expectedModCount;
    private Object lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentOrderedSetMutableIterator(PersistentOrderedSetBuilder persistentOrderedSetBuilder0) {
        Intrinsics.checkNotNullParameter(persistentOrderedSetBuilder0, "builder");
        super(persistentOrderedSetBuilder0.getFirstElement$runtime_release(), persistentOrderedSetBuilder0.getHashMapBuilder$runtime_release());
        this.builder = persistentOrderedSetBuilder0;
        this.expectedModCount = persistentOrderedSetBuilder0.getHashMapBuilder$runtime_release().getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if(this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if(!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public Object next() {
        this.checkForComodification();
        Object object0 = super.next();
        this.lastIteratedElement = object0;
        this.nextWasInvoked = true;
        return object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.PersistentOrderedSetIterator
    public void remove() {
        this.checkNextWasInvoked();
        Collection collection0 = this.builder;
        Object object0 = this.lastIteratedElement;
        if(collection0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        }
        TypeIntrinsics.asMutableCollection(collection0).remove(object0);
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getHashMapBuilder$runtime_release().getModCount$runtime_release();
        this.setIndex$runtime_release(this.getIndex$runtime_release() - 1);
    }
}

