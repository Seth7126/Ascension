package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001A\u00020\u000EH\u0002J\b\u0010\u000F\u001A\u00020\u000EH\u0002J\u0014\u0010\u0010\u001A\u00020\f2\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u0012H\u0002J\u000E\u0010\u0013\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001A\u00020\u000EH\u0016J1\u0010\u0016\u001A\u00020\u000E2\u0006\u0010\u0017\u001A\u00020\b2\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0018\u001A\u00028\u00002\u0006\u0010\u0019\u001A\u00020\bH\u0002¢\u0006\u0002\u0010\u001AR\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001A\u0004\u0018\u00018\u0000X\u0082\u000E¢\u0006\u0004\n\u0002\u0010\nR\u000E\u0010\u000B\u001A\u00020\fX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetMutableIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetIterator;", "", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)V", "expectedModCount", "", "lastIteratedElement", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "isCollision", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "next", "()Ljava/lang/Object;", "remove", "resetPath", "hashCode", "element", "pathIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;Ljava/lang/Object;I)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentHashSetMutableIterator extends PersistentHashSetIterator implements Iterator, KMutableIterator {
    private final PersistentHashSetBuilder builder;
    private int expectedModCount;
    private Object lastIteratedElement;
    private boolean nextWasInvoked;

    public PersistentHashSetMutableIterator(PersistentHashSetBuilder persistentHashSetBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "builder");
        super(persistentHashSetBuilder0.getNode$runtime_release());
        this.builder = persistentHashSetBuilder0;
        this.expectedModCount = persistentHashSetBuilder0.getModCount$runtime_release();
    }

    private final void checkForComodification() {
        if(this.builder.getModCount$runtime_release() != this.expectedModCount) {
            throw new ConcurrentModificationException();
        }
    }

    private final void checkNextWasInvoked() {
        if(!this.nextWasInvoked) {
            throw new IllegalStateException();
        }
    }

    private final boolean isCollision(TrieNode trieNode0) {
        return trieNode0.getBitmap() == 0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator
    public Object next() {
        this.checkForComodification();
        Object object0 = super.next();
        this.lastIteratedElement = object0;
        this.nextWasInvoked = true;
        return object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetIterator
    public void remove() {
        this.checkNextWasInvoked();
        if(this.hasNext()) {
            Object object0 = this.currentElement();
            Collection collection0 = this.builder;
            Object object1 = this.lastIteratedElement;
            if(collection0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            TypeIntrinsics.asMutableCollection(collection0).remove(object1);
            this.resetPath((object0 == null ? 0 : object0.hashCode()), this.builder.getNode$runtime_release(), object0, 0);
        }
        else {
            Collection collection1 = this.builder;
            Object object2 = this.lastIteratedElement;
            if(collection1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
            }
            TypeIntrinsics.asMutableCollection(collection1).remove(object2);
        }
        this.lastIteratedElement = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    private final void resetPath(int v, TrieNode trieNode0, Object object0, int v1) {
        if(this.isCollision(trieNode0)) {
            int v2 = ArraysKt.indexOf(trieNode0.getBuffer(), object0);
            ((TrieNodeIterator)this.getPath().get(v1)).reset(trieNode0.getBuffer(), v2);
            this.setPathLastIndex(v1);
            return;
        }
        int v3 = trieNode0.indexOfCellAt$runtime_release(1 << (v >> v1 * 5 & 0x1F));
        ((TrieNodeIterator)this.getPath().get(v1)).reset(trieNode0.getBuffer(), v3);
        Object object1 = trieNode0.getBuffer()[v3];
        if(object1 instanceof TrieNode) {
            this.resetPath(v, ((TrieNode)object1), object0, v1 + 1);
            return;
        }
        this.setPathLastIndex(v1);
    }
}

