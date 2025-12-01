package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001A\n\u0002\u0010\u000B\n\u0002\b\u001F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000 _*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001_B\u001F\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u00A2\u0006\u0002\u0010\u0007B\'\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u000E\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006\u0012\b\u0010\b\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0002\u0010\nJ)\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u001CJ#\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010\u001FJ\b\u0010 \u001A\u00020\u0004H\u0002J\u001B\u0010!\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001A\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010\"J\u0015\u0010#\u001A\u00020$2\u0006\u0010\u001A\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010%J\u001B\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001A\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010\"J\u0016\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001A\u00020\u0004H\u0002J#\u0010)\u001A\u00020$2\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u0004\u00A2\u0006\u0002\u0010*J\u001C\u0010+\u001A\u00020$2\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001B\u001A\u00020\u0004J\u0015\u0010-\u001A\u00028\u00002\u0006\u0010.\u001A\u00020\u0004H\u0002\u00A2\u0006\u0002\u0010/J\u0016\u00100\u001A\u00020$2\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0010\u00101\u001A\u00020$2\u0006\u0010\u001E\u001A\u00020\u0004H\u0002J\u0015\u00102\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u0004H\u0000\u00A2\u0006\u0002\b3JE\u00104\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00105\u001A\u00020\u00042\u0006\u00106\u001A\u00028\u00002\u0006\u00107\u001A\u00020\u00042\u0006\u00108\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u00042\b\u00109\u001A\u0004\u0018\u00010\tH\u0002\u00A2\u0006\u0002\u0010:J=\u0010;\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001A\u00020\u00042\u0006\u0010=\u001A\u00020\u00042\u0006\u0010>\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u00042\b\u00109\u001A\u0004\u0018\u00010\tH\u0002\u00A2\u0006\u0002\u0010?J3\u0010@\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001A\u00020\u00042\u0006\u0010=\u001A\u00020\u00042\u0006\u0010>\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u0004H\u0002\u00A2\u0006\u0002\u0010AJ5\u0010B\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u00042\n\u0010C\u001A\u0006\u0012\u0002\b\u00030D\u00A2\u0006\u0002\u0010EJ6\u0010F\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010G\u001A\u00020H2\n\u0010C\u001A\u0006\u0012\u0002\b\u00030DJ+\u0010I\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u00109\u001A\u00020\tH\u0002\u00A2\u0006\u0002\u0010JJ\'\u0010K\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001A\u001A\u00028\u00002\n\u0010C\u001A\u0006\u0012\u0002\b\u00030DH\u0002\u00A2\u0006\u0002\u0010LJ,\u0010M\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001A\u00020H2\u0006\u00109\u001A\u00020\tH\u0002J\'\u0010N\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001A\u001A\u00028\u00002\n\u0010C\u001A\u0006\u0012\u0002\b\u00030DH\u0002\u00A2\u0006\u0002\u0010LJ(\u0010O\u001A\u0004\u0018\u00010\u00022\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001A\u00020H2\u0006\u00109\u001A\u00020\tH\u0002J\u001E\u0010P\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010(\u001A\u00020\u00042\u0006\u00109\u001A\u00020\tH\u0002J(\u0010Q\u001A\u0004\u0018\u00010\u00022\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010G\u001A\u00020H2\u0006\u00109\u001A\u00020\tH\u0002J;\u0010R\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010<\u001A\u00020\u00042\u0006\u0010=\u001A\u00020\u00042\u0006\u0010>\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u00109\u001A\u00020\tH\u0002\u00A2\u0006\u0002\u0010?J5\u0010S\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u00042\n\u0010C\u001A\u0006\u0012\u0002\b\u00030D\u00A2\u0006\u0002\u0010EJ2\u0010T\u001A\u0004\u0018\u00010\u00022\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010G\u001A\u00020H2\n\u0010C\u001A\u0006\u0012\u0002\b\u00030DJ&\u0010U\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u00042\u0006\u00109\u001A\u00020\tH\u0002J2\u0010W\u001A\u0004\u0018\u00010\u00022\f\u0010,\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001B\u001A\u00020\u00042\u0006\u0010G\u001A\u00020H2\n\u0010C\u001A\u0006\u0012\u0002\b\u00030DJ,\u0010X\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001A\u00020\u00042\f\u0010Z\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00109\u001A\u00020\tH\u0002J\u0016\u0010[\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010.\u001A\u00020\u0004H\u0002J)\u0010\\\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u001A\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\u0004\u00A2\u0006\u0002\u0010\u001CJ\u001E\u0010]\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001A\u00020\u00042\u0006\u0010\u001E\u001A\u00020\u0004H\u0002J$\u0010^\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010Y\u001A\u00020\u00042\f\u0010Z\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER$\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0006X\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0013\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001C\u0010\b\u001A\u0004\u0018\u00010\tX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00A8\u0006`"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "E", "", "bitmap", "", "buffer", "", "(I[Ljava/lang/Object;)V", "ownedBy", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "(I[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "getBitmap", "()I", "setBitmap", "(I)V", "getBuffer", "()[Ljava/lang/Object;", "setBuffer", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "getOwnedBy", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "setOwnedBy", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "add", "elementHash", "element", "shift", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "addElementAt", "positionMask", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "calculateSize", "collisionAdd", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "collisionContainsElement", "", "(Ljava/lang/Object;)Z", "collisionRemove", "collisionRemoveElementAtIndex", "i", "contains", "(ILjava/lang/Object;I)Z", "containsAll", "otherNode", "elementAtIndex", "index", "(I)Ljava/lang/Object;", "elementsIdentityEquals", "hasNoCellAt", "indexOfCellAt", "indexOfCellAt$runtime_release", "makeNode", "elementHash1", "element1", "elementHash2", "element2", "owner", "(ILjava/lang/Object;ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "makeNodeAtIndex", "elementIndex", "newElementHash", "newElement", "(IILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "moveElementToNode", "(IILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAdd", "mutator", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableAddAll", "intersectionSizeRef", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "mutableAddElementAt", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAdd", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/PersistentHashSetBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "mutableCollisionAddAll", "mutableCollisionRemove", "mutableCollisionRemoveAll", "mutableCollisionRemoveElementAtIndex", "mutableCollisionRetainAll", "mutableMoveElementToNode", "mutableRemove", "mutableRemoveAll", "mutableRemoveCellAtIndex", "cellIndex", "mutableRetainAll", "mutableUpdateNodeAtIndex", "nodeIndex", "newNode", "nodeAtIndex", "remove", "removeCellAtIndex", "updateNodeAtIndex", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TrieNode {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableSet/TrieNode;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final TrieNode EMPTY;
    private int bitmap;
    private Object[] buffer;
    private MutabilityOwnership ownedBy;

    static {
        TrieNode.Companion = new Companion(null);
        TrieNode.EMPTY = new TrieNode(0, new Object[0]);
    }

    public TrieNode(int v, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        this(v, arr_object, null);
    }

    public TrieNode(int v, Object[] arr_object, MutabilityOwnership mutabilityOwnership0) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        super();
        this.bitmap = v;
        this.buffer = arr_object;
        this.ownedBy = mutabilityOwnership0;
    }

    public final TrieNode add(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasNoCellAt(1 << v2)) {
            return this.addElementAt(1 << v2, object0);
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.buffer[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.nodeAtIndex(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.collisionAdd(object0) : trieNode0.add(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.updateNodeAtIndex(v3, trieNode1);
        }
        return Intrinsics.areEqual(object0, object1) ? this : this.moveElementToNode(v3, v, object0, v1);
    }

    private final TrieNode addElementAt(int v, Object object0) {
        Object[] arr_object = TrieNodeKt.addElementAtIndex(this.buffer, this.indexOfCellAt$runtime_release(v), object0);
        return new TrieNode(v | this.bitmap, arr_object);
    }

    private final int calculateSize() {
        if(this.bitmap == 0) {
            return this.buffer.length;
        }
        Object[] arr_object = this.buffer;
        int v = 0;
        int v1;
        for(v1 = 0; v < arr_object.length; v1 += (object0 instanceof TrieNode ? ((TrieNode)object0).calculateSize() : 1)) {
            Object object0 = arr_object[v];
            ++v;
        }
        return v1;
    }

    // 去混淆评级： 低(20)
    private final TrieNode collisionAdd(Object object0) {
        return this.collisionContainsElement(object0) ? this : new TrieNode(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, object0));
    }

    private final boolean collisionContainsElement(Object object0) {
        return ArraysKt.contains(this.buffer, object0);
    }

    private final TrieNode collisionRemove(Object object0) {
        int v = ArraysKt.indexOf(this.buffer, object0);
        return v == -1 ? this : this.collisionRemoveElementAtIndex(v);
    }

    private final TrieNode collisionRemoveElementAtIndex(int v) {
        return new TrieNode(0, TrieNodeKt.removeCellAtIndex(this.buffer, v));
    }

    public final boolean contains(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasNoCellAt(1 << v2)) {
            return false;
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.buffer[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.nodeAtIndex(v3);
            return v1 == 30 ? trieNode0.collisionContainsElement(object0) : trieNode0.contains(v, object0, v1 + 5);
        }
        return Intrinsics.areEqual(object0, object1);
    }

    public final boolean containsAll(TrieNode trieNode0, int v) {
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        if(this == trieNode0) {
            return true;
        }
        if(v > 30) {
            Object[] arr_object = trieNode0.buffer;
            for(int v1 = 0; v1 < arr_object.length; ++v1) {
                if(!ArraysKt.contains(this.getBuffer(), arr_object[v1])) {
                    return false;
                }
            }
            return true;
        }
        int v2 = this.bitmap & trieNode0.bitmap;
        if(v2 != trieNode0.bitmap) {
            return false;
        }
        while(v2 != 0) {
            int v3 = Integer.lowestOneBit(v2);
            Object object0 = this.getBuffer()[this.indexOfCellAt$runtime_release(v3)];
            Object object1 = trieNode0.getBuffer()[trieNode0.indexOfCellAt$runtime_release(v3)];
            boolean z = object0 instanceof TrieNode;
            boolean z1 = object1 instanceof TrieNode;
            if(z && z1) {
                if(object0 == null || object1 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
                if(!((TrieNode)object0).containsAll(((TrieNode)object1), v + 5)) {
                    return false;
                }
            }
            else if(z) {
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.containsAll$lambda-13>");
                }
                if(!((TrieNode)object0).contains((object1 == null ? 0 : object1.hashCode()), object1, v + 5)) {
                    return false;
                }
            }
            else {
                if(z1) {
                    return false;
                }
                if(!Intrinsics.areEqual(object0, object1)) {
                    return false;
                }
            }
            v2 ^= v3;
        }
        return true;
    }

    private final Object elementAtIndex(int v) {
        return this.buffer[v];
    }

    private final boolean elementsIdentityEquals(TrieNode trieNode0) {
        if(this == trieNode0) {
            return true;
        }
        if(this.bitmap != trieNode0.bitmap) {
            return false;
        }
        int v = this.buffer.length;
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                if(this.buffer[v1] != trieNode0.buffer[v1]) {
                    return false;
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return true;
    }

    public final int getBitmap() {
        return this.bitmap;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final MutabilityOwnership getOwnedBy() {
        return this.ownedBy;
    }

    private final boolean hasNoCellAt(int v) {
        return (v & this.bitmap) == 0;
    }

    public final int indexOfCellAt$runtime_release(int v) {
        return Integer.bitCount(v - 1 & this.bitmap);
    }

    private final TrieNode makeNode(int v, Object object0, int v1, Object object1, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(v2 > 30) {
            return new TrieNode(0, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        int v3 = v >> v2 & 0x1F;
        int v4 = v1 >> v2 & 0x1F;
        if(v3 != v4) {
            return v3 >= v4 ? new TrieNode(1 << v3 | 1 << v4, new Object[]{object1, object0}, mutabilityOwnership0) : new TrieNode(1 << v3 | 1 << v4, new Object[]{object0, object1}, mutabilityOwnership0);
        }
        return new TrieNode(1 << v3, new Object[]{this.makeNode(v, object0, v1, object1, v2 + 5, mutabilityOwnership0)}, mutabilityOwnership0);
    }

    private final TrieNode makeNodeAtIndex(int v, int v1, Object object0, int v2, MutabilityOwnership mutabilityOwnership0) {
        Object object1 = this.elementAtIndex(v);
        return object1 == null ? this.makeNode(0, null, v1, object0, v2 + 5, mutabilityOwnership0) : this.makeNode(object1.hashCode(), object1, v1, object0, v2 + 5, mutabilityOwnership0);
    }

    private final TrieNode moveElementToNode(int v, int v1, Object object0, int v2) {
        Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
        arr_object[v] = this.makeNodeAtIndex(v, v1, object0, v2, null);
        return new TrieNode(this.bitmap, arr_object);
    }

    public final TrieNode mutableAdd(int v, Object object0, int v1, PersistentHashSetBuilder persistentHashSetBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.hasNoCellAt(1 << v2)) {
            persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
            return this.mutableAddElementAt(1 << v2, object0, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.buffer[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.nodeAtIndex(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.mutableCollisionAdd(object0, persistentHashSetBuilder0) : trieNode0.mutableAdd(v, object0, v1 + 5, persistentHashSetBuilder0);
            return trieNode0 == trieNode1 ? this : this.mutableUpdateNodeAtIndex(v3, trieNode1, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        if(Intrinsics.areEqual(object0, object1)) {
            return this;
        }
        persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
        return this.mutableMoveElementToNode(v3, v, object0, v1, persistentHashSetBuilder0.getOwnership$runtime_release());
    }

    public final TrieNode mutableAddAll(TrieNode trieNode0, int v, DeltaCounter deltaCounter0, PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode3;
        int v7;
        TrieNode trieNode2;
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.setCount(deltaCounter0.getCount() + this.calculateSize());
            return this;
        }
        if(v > 30) {
            return this.mutableCollisionAddAll(trieNode0, deltaCounter0, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        int v1 = trieNode0.bitmap | this.bitmap;
        TrieNode trieNode1 = v1 != this.bitmap || !Intrinsics.areEqual(this.ownedBy, persistentHashSetBuilder0.getOwnership$runtime_release()) ? new TrieNode(v1, new Object[Integer.bitCount(v1)], persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
        int v2 = v1;
        int v3 = 0;
        while(v2 != 0) {
            int v4 = Integer.lowestOneBit(v2);
            int v5 = this.indexOfCellAt$runtime_release(v4);
            int v6 = trieNode0.indexOfCellAt$runtime_release(v4);
            Object[] arr_object = trieNode1.getBuffer();
            if(this.hasNoCellAt(v4)) {
                trieNode2 = trieNode0.getBuffer()[v6];
                v7 = v4;
            }
            else if(trieNode0.hasNoCellAt(v4)) {
                trieNode2 = this.getBuffer()[v5];
                v7 = v4;
            }
            else {
                Object object0 = this.getBuffer()[v5];
                Object object1 = trieNode0.getBuffer()[v6];
                boolean z = object0 instanceof TrieNode;
                boolean z1 = object1 instanceof TrieNode;
                if(z && z1) {
                    if(object0 == null || object1 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                    }
                    trieNode2 = ((TrieNode)object0).mutableAddAll(((TrieNode)object1), v + 5, deltaCounter0, persistentHashSetBuilder0);
                    v7 = v4;
                }
                else if(z) {
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                    }
                    trieNode3 = ((TrieNode)object0).mutableAdd((object1 == null ? 0 : object1.hashCode()), object1, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                    trieNode2 = trieNode3;
                    v7 = v4;
                }
                else if(z1) {
                    if(object1 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableAddAll$lambda-6>");
                    }
                    trieNode3 = ((TrieNode)object1).mutableAdd((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                    trieNode2 = trieNode3;
                    v7 = v4;
                }
                else if(Intrinsics.areEqual(object0, object1)) {
                    deltaCounter0.setCount(deltaCounter0.getCount() + 1);
                    trieNode2 = object0;
                    v7 = v4;
                }
                else {
                    v7 = v4;
                    trieNode2 = this.makeNode((object0 == null ? 0 : object0.hashCode()), object0, (object1 == null ? 0 : object1.hashCode()), object1, v + 5, persistentHashSetBuilder0.getOwnership$runtime_release());
                }
            }
            arr_object[v3] = trieNode2;
            ++v3;
            v2 ^= v7;
        }
        if(this.elementsIdentityEquals(trieNode1)) {
            return this;
        }
        return trieNode0.elementsIdentityEquals(trieNode1) ? trieNode0 : trieNode1;
    }

    private final TrieNode mutableAddElementAt(int v, Object object0, MutabilityOwnership mutabilityOwnership0) {
        int v1 = this.indexOfCellAt$runtime_release(v);
        if(this.ownedBy == mutabilityOwnership0) {
            this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, v1, object0);
            this.bitmap |= v;
            return this;
        }
        Object[] arr_object = TrieNodeKt.addElementAtIndex(this.buffer, v1, object0);
        return new TrieNode(v | this.bitmap, arr_object, mutabilityOwnership0);
    }

    private final TrieNode mutableCollisionAdd(Object object0, PersistentHashSetBuilder persistentHashSetBuilder0) {
        if(this.collisionContainsElement(object0)) {
            return this;
        }
        persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() + 1);
        if(this.ownedBy == persistentHashSetBuilder0.getOwnership$runtime_release()) {
            this.buffer = TrieNodeKt.addElementAtIndex(this.buffer, 0, object0);
            return this;
        }
        return new TrieNode(0, TrieNodeKt.addElementAtIndex(this.buffer, 0, object0), persistentHashSetBuilder0.getOwnership$runtime_release());
    }

    private final TrieNode mutableCollisionAddAll(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.buffer.length);
            return this;
        }
        Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length + trieNode0.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
        Object[] arr_object1 = trieNode0.buffer;
        int v1 = 0;
        for(int v = 0; v < arr_object1.length; ++v) {
            if(!this.collisionContainsElement(arr_object1[v]) != 0) {
                arr_object[this.buffer.length + v1] = arr_object1[v];
                ++v1;
            }
        }
        int v2 = v1 + this.buffer.length;
        deltaCounter0.plusAssign(arr_object.length - v2);
        if(v2 == this.buffer.length) {
            return this;
        }
        if(v2 == trieNode0.buffer.length) {
            return trieNode0;
        }
        if(v2 != arr_object.length) {
            arr_object = Arrays.copyOf(arr_object, v2);
            Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
        }
        if(Intrinsics.areEqual(this.ownedBy, mutabilityOwnership0)) {
            this.buffer = arr_object;
            return this;
        }
        return new TrieNode(0, arr_object, mutabilityOwnership0);
    }

    private final TrieNode mutableCollisionRemove(Object object0, PersistentHashSetBuilder persistentHashSetBuilder0) {
        int v = ArraysKt.indexOf(this.buffer, object0);
        if(v != -1) {
            persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() - 1);
            return this.mutableCollisionRemoveElementAtIndex(v, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        return this;
    }

    private final Object mutableCollisionRemoveAll(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.buffer.length);
            return TrieNode.EMPTY;
        }
        Object[] arr_object = Intrinsics.areEqual(mutabilityOwnership0, this.ownedBy) ? this.buffer : new Object[this.buffer.length];
        Object[] arr_object1 = this.buffer;
        int v1 = 0;
        for(int v = 0; v < arr_object1.length; ++v) {
            if(!trieNode0.collisionContainsElement(arr_object1[v]) != 0) {
                arr_object[v1] = arr_object1[v];
                ++v1;
            }
        }
        deltaCounter0.plusAssign(this.buffer.length - v1);
        if(v1 == 0) {
            return TrieNode.EMPTY;
        }
        if(v1 == 1) {
            return arr_object[0];
        }
        if(v1 == this.buffer.length) {
            return this;
        }
        if(v1 == arr_object.length) {
            return new TrieNode(0, arr_object, mutabilityOwnership0);
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, v1);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
        return new TrieNode(0, arr_object2, mutabilityOwnership0);
    }

    private final TrieNode mutableCollisionRemoveElementAtIndex(int v, MutabilityOwnership mutabilityOwnership0) {
        if(this.ownedBy == mutabilityOwnership0) {
            this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, v);
            return this;
        }
        return new TrieNode(0, TrieNodeKt.removeCellAtIndex(this.buffer, v), mutabilityOwnership0);
    }

    private final Object mutableCollisionRetainAll(TrieNode trieNode0, DeltaCounter deltaCounter0, MutabilityOwnership mutabilityOwnership0) {
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.buffer.length);
            return this;
        }
        Object[] arr_object = Intrinsics.areEqual(mutabilityOwnership0, this.ownedBy) ? this.buffer : new Object[Math.min(this.buffer.length, trieNode0.buffer.length)];
        Object[] arr_object1 = this.buffer;
        int v1 = 0;
        for(int v = 0; v < arr_object1.length; ++v) {
            if(trieNode0.collisionContainsElement(arr_object1[v])) {
                arr_object[v1] = arr_object1[v];
                ++v1;
            }
        }
        deltaCounter0.plusAssign(v1);
        if(v1 == 0) {
            return TrieNode.EMPTY;
        }
        if(v1 == 1) {
            return arr_object[0];
        }
        if(v1 == this.buffer.length) {
            return this;
        }
        if(v1 != trieNode0.buffer.length) {
            if(v1 == arr_object.length) {
                return new TrieNode(0, arr_object, mutabilityOwnership0);
            }
            Object[] arr_object2 = Arrays.copyOf(arr_object, v1);
            Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
            return new TrieNode(0, arr_object2, mutabilityOwnership0);
        }
        return trieNode0;
    }

    private final TrieNode mutableMoveElementToNode(int v, int v1, Object object0, int v2, MutabilityOwnership mutabilityOwnership0) {
        if(this.ownedBy == mutabilityOwnership0) {
            Object[] arr_object = this.buffer;
            arr_object[v] = this.makeNodeAtIndex(v, v1, object0, v2, mutabilityOwnership0);
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, size)");
        arr_object1[v] = this.makeNodeAtIndex(v, v1, object0, v2, mutabilityOwnership0);
        return new TrieNode(this.bitmap, arr_object1, mutabilityOwnership0);
    }

    public final TrieNode mutableRemove(int v, Object object0, int v1, PersistentHashSetBuilder persistentHashSetBuilder0) {
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        int v2 = v >> v1 & 0x1F;
        if(this.hasNoCellAt(1 << v2)) {
            return this;
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.buffer[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.nodeAtIndex(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.mutableCollisionRemove(object0, persistentHashSetBuilder0) : trieNode0.mutableRemove(v, object0, v1 + 5, persistentHashSetBuilder0);
            return this.ownedBy == persistentHashSetBuilder0.getOwnership$runtime_release() || trieNode0 != trieNode1 ? this.mutableUpdateNodeAtIndex(v3, trieNode1, persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
        }
        if(Intrinsics.areEqual(object0, object1)) {
            persistentHashSetBuilder0.setSize(persistentHashSetBuilder0.size() - 1);
            return this.mutableRemoveCellAtIndex(v3, 1 << v2, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        return this;
    }

    public final Object mutableRemoveAll(TrieNode trieNode0, int v, DeltaCounter deltaCounter0, PersistentHashSetBuilder persistentHashSetBuilder0) {
        TrieNode trieNode1;
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.calculateSize());
            return TrieNode.EMPTY;
        }
        if(v > 30) {
            return this.mutableCollisionRemoveAll(trieNode0, deltaCounter0, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        int v1 = this.bitmap & trieNode0.bitmap;
        if(v1 == 0) {
            return this;
        }
        if(Intrinsics.areEqual(this.ownedBy, persistentHashSetBuilder0.getOwnership$runtime_release())) {
            trieNode1 = this;
        }
        else {
            int v2 = this.bitmap;
            Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
            Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
            trieNode1 = new TrieNode(v2, arr_object, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        int v3 = this.bitmap;
        while(v1 != 0) {
            int v4 = Integer.lowestOneBit(v1);
            int v5 = this.indexOfCellAt$runtime_release(v4);
            TrieNode trieNode2 = this.getBuffer()[v5];
            Object object0 = trieNode0.getBuffer()[trieNode0.indexOfCellAt$runtime_release(v4)];
            boolean z = trieNode2 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                if(trieNode2 == null || object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                }
                trieNode2 = trieNode2.mutableRemoveAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                if(trieNode2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                }
                trieNode2.mutableRemove((object0 == null ? 0 : object0.hashCode()), object0, v + 5, persistentHashSetBuilder0);
            }
            else if(z1) {
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRemoveAll$lambda-11$lambda-10>");
                }
                if(((TrieNode)object0).contains((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, v + 5)) {
                    deltaCounter0.plusAssign(1);
                    trieNode2 = TrieNode.EMPTY;
                }
            }
            else if(Intrinsics.areEqual(trieNode2, object0)) {
                deltaCounter0.plusAssign(1);
                trieNode2 = TrieNode.EMPTY;
            }
            if(trieNode2 == TrieNode.EMPTY) {
                v3 ^= v4;
            }
            trieNode1.getBuffer()[v5] = trieNode2;
            v1 ^= v4;
        }
        int v6 = Integer.bitCount(v3);
        if(v3 == 0) {
            return TrieNode.EMPTY;
        }
        if(v3 == this.bitmap) {
            return trieNode1.elementsIdentityEquals(this) ? this : trieNode1;
        }
        if(v6 == 1 && v != 0) {
            trieNode1 = trieNode1.buffer[trieNode1.indexOfCellAt$runtime_release(v3)];
            return trieNode1 instanceof TrieNode ? new TrieNode(v3, new Object[]{trieNode1}, persistentHashSetBuilder0.getOwnership$runtime_release()) : trieNode1;
        }
        Object[] arr_object1 = new Object[v6];
        Object[] arr_object2 = trieNode1.buffer;
        int v7 = 0;
        for(int v8 = 0; v8 < arr_object2.length; ++v8) {
            if(arr_object2[v8] != TrieNode.Companion.getEMPTY$runtime_release()) {
                arr_object1[v7] = arr_object2[v8];
                ++v7;
            }
        }
        return new TrieNode(v3, arr_object1, persistentHashSetBuilder0.getOwnership$runtime_release());
    }

    private final TrieNode mutableRemoveCellAtIndex(int v, int v1, MutabilityOwnership mutabilityOwnership0) {
        if(this.ownedBy == mutabilityOwnership0) {
            this.buffer = TrieNodeKt.removeCellAtIndex(this.buffer, v);
            this.bitmap ^= v1;
            return this;
        }
        Object[] arr_object = TrieNodeKt.removeCellAtIndex(this.buffer, v);
        return new TrieNode(v1 ^ this.bitmap, arr_object, mutabilityOwnership0);
    }

    public final Object mutableRetainAll(TrieNode trieNode0, int v, DeltaCounter deltaCounter0, PersistentHashSetBuilder persistentHashSetBuilder0) {
        Intrinsics.checkNotNullParameter(trieNode0, "otherNode");
        Intrinsics.checkNotNullParameter(deltaCounter0, "intersectionSizeRef");
        Intrinsics.checkNotNullParameter(persistentHashSetBuilder0, "mutator");
        if(this == trieNode0) {
            deltaCounter0.plusAssign(this.calculateSize());
            return this;
        }
        if(v > 30) {
            return this.mutableCollisionRetainAll(trieNode0, deltaCounter0, persistentHashSetBuilder0.getOwnership$runtime_release());
        }
        int v1 = this.bitmap & trieNode0.bitmap;
        if(v1 == 0) {
            return TrieNode.EMPTY;
        }
        TrieNode trieNode1 = !Intrinsics.areEqual(this.ownedBy, persistentHashSetBuilder0.getOwnership$runtime_release()) || v1 != this.bitmap ? new TrieNode(v1, new Object[Integer.bitCount(v1)], persistentHashSetBuilder0.getOwnership$runtime_release()) : this;
        int v2 = v1;
        int v3 = 0;
        int v4 = 0;
        while(v2 != 0) {
            int v5 = Integer.lowestOneBit(v2);
            TrieNode trieNode2 = this.getBuffer()[this.indexOfCellAt$runtime_release(v5)];
            Object object0 = trieNode0.getBuffer()[trieNode0.indexOfCellAt$runtime_release(v5)];
            boolean z = trieNode2 instanceof TrieNode;
            boolean z1 = object0 instanceof TrieNode;
            if(z && z1) {
                if(trieNode2 == null || object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                }
                trieNode2 = trieNode2.mutableRetainAll(((TrieNode)object0), v + 5, deltaCounter0, persistentHashSetBuilder0);
            }
            else if(z) {
                if(trieNode2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                }
                if(trieNode2.contains((object0 == null ? 0 : object0.hashCode()), object0, v + 5)) {
                    deltaCounter0.plusAssign(1);
                    trieNode2 = object0;
                }
                else {
                    trieNode2 = TrieNode.EMPTY;
                }
            }
            else if(z1) {
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode.mutableRetainAll$lambda-9$lambda-8>");
                }
                if(((TrieNode)object0).contains((trieNode2 == null ? 0 : trieNode2.hashCode()), trieNode2, v + 5)) {
                    deltaCounter0.plusAssign(1);
                }
                else {
                    trieNode2 = TrieNode.EMPTY;
                }
            }
            else if(Intrinsics.areEqual(trieNode2, object0)) {
                deltaCounter0.plusAssign(1);
            }
            else {
                trieNode2 = TrieNode.EMPTY;
            }
            if(trieNode2 != TrieNode.EMPTY) {
                v3 |= v5;
            }
            trieNode1.getBuffer()[v4] = trieNode2;
            ++v4;
            v2 ^= v5;
        }
        int v6 = Integer.bitCount(v3);
        if(v3 == 0) {
            return TrieNode.EMPTY;
        }
        if(v3 == v1) {
            if(trieNode1.elementsIdentityEquals(this)) {
                return this;
            }
            return trieNode1.elementsIdentityEquals(trieNode0) ? trieNode0 : trieNode1;
        }
        if(v6 == 1 && v != 0) {
            TrieNode trieNode3 = trieNode1.buffer[trieNode1.indexOfCellAt$runtime_release(v3)];
            return trieNode3 instanceof TrieNode ? new TrieNode(v3, new Object[]{trieNode3}, persistentHashSetBuilder0.getOwnership$runtime_release()) : trieNode3;
        }
        Object[] arr_object = new Object[v6];
        Object[] arr_object1 = trieNode1.buffer;
        int v8 = 0;
        for(int v7 = 0; v7 < arr_object1.length; ++v7) {
            if(arr_object1[v7] != TrieNode.Companion.getEMPTY$runtime_release()) {
                arr_object[v8] = arr_object1[v7];
                ++v8;
            }
        }
        return new TrieNode(v3, arr_object, persistentHashSetBuilder0.getOwnership$runtime_release());
    }

    private final TrieNode mutableUpdateNodeAtIndex(int v, TrieNode trieNode0, MutabilityOwnership mutabilityOwnership0) {
        Object[] arr_object = trieNode0.buffer;
        if(arr_object.length == 1) {
            Object object0 = arr_object[0];
            if(!(object0 instanceof TrieNode)) {
                if(this.buffer.length == 1) {
                    trieNode0.bitmap = this.bitmap;
                    return trieNode0;
                }
                trieNode0 = object0;
            }
        }
        if(this.ownedBy == mutabilityOwnership0) {
            this.buffer[v] = trieNode0;
            return this;
        }
        Object[] arr_object1 = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.bitmap, arr_object1, mutabilityOwnership0);
    }

    private final TrieNode nodeAtIndex(int v) {
        Object object0 = this.buffer[v];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode>");
        }
        return (TrieNode)object0;
    }

    public final TrieNode remove(int v, Object object0, int v1) {
        int v2 = v >> v1 & 0x1F;
        if(this.hasNoCellAt(1 << v2)) {
            return this;
        }
        int v3 = this.indexOfCellAt$runtime_release(1 << v2);
        Object object1 = this.buffer[v3];
        if(object1 instanceof TrieNode) {
            TrieNode trieNode0 = this.nodeAtIndex(v3);
            TrieNode trieNode1 = v1 == 30 ? trieNode0.collisionRemove(object0) : trieNode0.remove(v, object0, v1 + 5);
            return trieNode0 == trieNode1 ? this : this.updateNodeAtIndex(v3, trieNode1);
        }
        return Intrinsics.areEqual(object0, object1) ? this.removeCellAtIndex(v3, 1 << v2) : this;
    }

    private final TrieNode removeCellAtIndex(int v, int v1) {
        Object[] arr_object = TrieNodeKt.removeCellAtIndex(this.buffer, v);
        return new TrieNode(v1 ^ this.bitmap, arr_object);
    }

    public final void setBitmap(int v) {
        this.bitmap = v;
    }

    public final void setBuffer(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.buffer = arr_object;
    }

    public final void setOwnedBy(MutabilityOwnership mutabilityOwnership0) {
        this.ownedBy = mutabilityOwnership0;
    }

    private final TrieNode updateNodeAtIndex(int v, TrieNode trieNode0) {
        Object[] arr_object = trieNode0.buffer;
        if(arr_object.length == 1) {
            Object object0 = arr_object[0];
            if(!(object0 instanceof TrieNode)) {
                if(this.buffer.length == 1) {
                    trieNode0.bitmap = this.bitmap;
                    return trieNode0;
                }
                trieNode0 = object0;
            }
        }
        Object[] arr_object1 = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, size)");
        arr_object1[v] = trieNode0;
        return new TrieNode(this.bitmap, arr_object1);
    }
}

