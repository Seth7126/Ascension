package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0005B9\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u001E\u0010\b\u001A\u001A\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\n0\t¢\u0006\u0002\u0010\u000BJ\b\u0010\u0012\u001A\u00020\u0013H\u0002J\b\u0010\u0014\u001A\u00020\u0013H\u0002J\u000E\u0010\u0015\u001A\u00028\u0002H\u0096\u0002¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001A\u00020\u0013H\u0016J5\u0010\u0018\u001A\u00020\u00132\u0006\u0010\u0019\u001A\u00020\r2\u000E\u0010\u001A\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u001B2\u0006\u0010\u001C\u001A\u00028\u00002\u0006\u0010\u001D\u001A\u00020\rH\u0002¢\u0006\u0002\u0010\u001EJ\u001B\u0010\u001F\u001A\u00020\u00132\u0006\u0010\u001C\u001A\u00028\u00002\u0006\u0010 \u001A\u00028\u0001¢\u0006\u0002\u0010!R\u001A\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\rX\u0082\u000E¢\u0006\u0002\n\u0000R\u0012\u0010\u000E\u001A\u0004\u0018\u00018\u0000X\u0082\u000E¢\u0006\u0004\n\u0002\u0010\u000FR\u000E\u0010\u0010\u001A\u00020\u0011X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilderBaseIterator;", "K", "V", "T", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBaseIterator;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "path", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;[Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNodeBaseIterator;)V", "expectedModCount", "", "lastIteratedKey", "Ljava/lang/Object;", "nextWasInvoked", "", "checkForComodification", "", "checkNextWasInvoked", "next", "()Ljava/lang/Object;", "remove", "resetPath", "keyHash", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "key", "pathIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Ljava/lang/Object;I)V", "setValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class PersistentHashMapBuilderBaseIterator extends PersistentHashMapBaseIterator implements Iterator, KMutableIterator {
    private final PersistentHashMapBuilder builder;
    private int expectedModCount;
    private Object lastIteratedKey;
    private boolean nextWasInvoked;

    public PersistentHashMapBuilderBaseIterator(PersistentHashMapBuilder persistentHashMapBuilder0, TrieNodeBaseIterator[] arr_trieNodeBaseIterator) {
        Intrinsics.checkNotNullParameter(persistentHashMapBuilder0, "builder");
        Intrinsics.checkNotNullParameter(arr_trieNodeBaseIterator, "path");
        super(persistentHashMapBuilder0.getNode$runtime_release(), arr_trieNodeBaseIterator);
        this.builder = persistentHashMapBuilder0;
        this.expectedModCount = persistentHashMapBuilder0.getModCount$runtime_release();
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

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator
    public Object next() {
        this.checkForComodification();
        this.lastIteratedKey = this.currentKey();
        this.nextWasInvoked = true;
        return super.next();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBaseIterator
    public void remove() {
        this.checkNextWasInvoked();
        if(this.hasNext()) {
            Object object0 = this.currentKey();
            Map map0 = this.builder;
            Object object1 = this.lastIteratedKey;
            if(map0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            TypeIntrinsics.asMutableMap(map0).remove(object1);
            this.resetPath((object0 == null ? 0 : object0.hashCode()), this.builder.getNode$runtime_release(), object0, 0);
        }
        else {
            Map map1 = this.builder;
            Object object2 = this.lastIteratedKey;
            if(map1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
            }
            TypeIntrinsics.asMutableMap(map1).remove(object2);
        }
        this.lastIteratedKey = null;
        this.nextWasInvoked = false;
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }

    private final void resetPath(int v, TrieNode trieNode0, Object object0, int v1) {
        if(v1 * 5 > 30) {
            this.getPath()[v1].reset(trieNode0.getBuffer$runtime_release(), trieNode0.getBuffer$runtime_release().length, 0);
            while(!Intrinsics.areEqual(this.getPath()[v1].currentKey(), object0)) {
                this.getPath()[v1].moveToNextKey();
            }
            this.setPathLastIndex(v1);
            return;
        }
        int v2 = v >> v1 * 5 & 0x1F;
        if(trieNode0.hasEntryAt$runtime_release(1 << v2)) {
            this.getPath()[v1].reset(trieNode0.getBuffer$runtime_release(), trieNode0.entryCount$runtime_release() * 2, trieNode0.entryKeyIndex$runtime_release(1 << v2));
            this.setPathLastIndex(v1);
            return;
        }
        int v3 = trieNode0.nodeIndex$runtime_release(1 << v2);
        TrieNode trieNode1 = trieNode0.nodeAtIndex$runtime_release(v3);
        this.getPath()[v1].reset(trieNode0.getBuffer$runtime_release(), trieNode0.entryCount$runtime_release() * 2, v3);
        this.resetPath(v, trieNode1, object0, v1 + 1);
    }

    public final void setValue(Object object0, Object object1) {
        if(!this.builder.containsKey(object0)) {
            return;
        }
        if(this.hasNext()) {
            Object object2 = this.currentKey();
            this.builder.put(object0, object1);
            this.resetPath((object2 == null ? 0 : object2.hashCode()), this.builder.getNode$runtime_release(), object2, 0);
        }
        else {
            this.builder.put(object0, object1);
        }
        this.expectedModCount = this.builder.getModCount$runtime_release();
    }
}

