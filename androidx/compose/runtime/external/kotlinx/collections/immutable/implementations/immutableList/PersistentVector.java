package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B5\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0002\u0010\u000BJ\u001B\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0011J#\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0013J\u001D\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0012\u001A\u00020\tH\u0002\u00A2\u0006\u0002\u0010\u0015J\u000E\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0016J\u0016\u0010\u0018\u001A\u00028\u00002\u0006\u0010\u0012\u001A\u00020\tH\u0096\u0002\u00A2\u0006\u0002\u0010\u0019JG\u0010\u001A\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\t2\b\u0010\u0010\u001A\u0004\u0018\u00010\u00062\u0006\u0010\u001C\u001A\u00020\u001DH\u0002\u00A2\u0006\u0002\u0010\u001EJ5\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010 \u001A\u00020\t2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0006H\u0002\u00A2\u0006\u0002\u0010!J\u0016\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0012\u001A\u00020\tH\u0016J?\u0010$\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010%\u001A\u00020\u001DH\u0002\u00A2\u0006\u0002\u0010&J3\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001A\u00020\t2\u0006\u0010\u001B\u001A\u00020\tH\u0002\u00A2\u0006\u0002\u0010)JC\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000E\u0010+\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000E\u0010,\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002\u00A2\u0006\u0002\u0010-J?\u0010.\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0010\u0004\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\u0006\u0010\u001B\u001A\u00020\t2\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\u0002\u00A2\u0006\u0002\u0010/J\"\u00100\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0012\u00101\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020302H\u0016J\u0016\u00104\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001A\u00020\tH\u0016J=\u00105\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010%\u001A\u00020\u001DH\u0002\u00A2\u0006\u0002\u0010&J;\u00106\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010(\u001A\u00020\t2\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\tH\u0002\u00A2\u0006\u0002\u00107J\b\u0010(\u001A\u00020\tH\u0002J#\u00108\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0013J?\u00109\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u001B\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\t2\b\u0010:\u001A\u0004\u0018\u00010\u0006H\u0002\u00A2\u0006\u0002\u0010;R\u0018\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00A2\u0006\u0004\n\u0002\u0010\fR\u000E\u0010\n\u001A\u00020\tX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\b\u001A\u00020\tX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0018\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00A2\u0006\u0004\n\u0002\u0010\f\u00A8\u0006<"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "root", "", "", "tail", "size", "", "rootShift", "([Ljava/lang/Object;[Ljava/lang/Object;II)V", "[Ljava/lang/Object;", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "bufferFor", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVectorBuilder;", "get", "(I)Ljava/lang/Object;", "insertIntoRoot", "shift", "elementCarry", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;", "([Ljava/lang/Object;IILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "insertIntoTail", "tailIndex", "([Ljava/lang/Object;ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "listIterator", "", "pullLastBuffer", "tailCarry", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/ObjectRef;)[Ljava/lang/Object;", "pullLastBufferFromRoot", "rootSize", "([Ljava/lang/Object;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "pushFilledTail", "filledTail", "newTail", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/PersistentVector;", "pushTail", "([Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "removeFromRootAt", "removeFromTailAt", "([Ljava/lang/Object;III)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "set", "setInRoot", "e", "([Ljava/lang/Object;IILjava/lang/Object;)[Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PersistentVector extends AbstractPersistentList implements PersistentList {
    private final Object[] root;
    private final int rootShift;
    private final int size;
    private final Object[] tail;

    public PersistentVector(Object[] arr_object, Object[] arr_object1, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_object, "root");
        Intrinsics.checkNotNullParameter(arr_object1, "tail");
        super();
        this.root = arr_object;
        this.tail = arr_object1;
        this.size = v;
        this.rootShift = v1;
        if(this.size() <= 0x20) {
            throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + this.size()).toString());
        }
        boolean z = this.size() - (this.size() - 1 & 0xFFFFFFE0) <= RangesKt.coerceAtMost(arr_object1.length, 0x20);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection add(Object object0) {
        return this.add(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList add(int v, Object object0) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        if(v == this.size()) {
            return this.add(object0);
        }
        int v1 = this.rootSize();
        if(v >= v1) {
            return this.insertIntoTail(this.root, v - v1, object0);
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        return this.insertIntoTail(this.insertIntoRoot(this.root, this.rootShift, v, object0, objectRef0), 0, objectRef0.getValue());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList add(Object object0) {
        int v = this.size() - this.rootSize();
        if(v < 0x20) {
            Object[] arr_object = Arrays.copyOf(this.tail, 0x20);
            Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
            arr_object[v] = object0;
            return new PersistentVector(this.root, arr_object, this.size() + 1, this.rootShift);
        }
        Object[] arr_object1 = UtilsKt.presizedBufferWith(object0);
        return this.pushFilledTail(this.root, this.tail, arr_object1);
    }

    private final Object[] bufferFor(int v) {
        if(this.rootSize() <= v) {
            return this.tail;
        }
        Object[] arr_object = this.root;
        for(int v1 = this.rootShift; v1 > 0; v1 -= 5) {
            Object object0 = arr_object[v >> v1 & 0x1F];
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            arr_object = (Object[])object0;
        }
        return arr_object;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder builder() {
        return this.builder();
    }

    public PersistentVectorBuilder builder() {
        return new PersistentVectorBuilder(this, this.root, this.tail, this.rootShift);
    }

    @Override  // kotlin.collections.AbstractList
    public Object get(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        return this.bufferFor(v)[v & 0x1F];
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.size;
    }

    private final Object[] insertIntoRoot(Object[] arr_object, int v, int v1, Object object0, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        if(v == 0) {
            if(v2 == 0) {
                arr_object1 = new Object[0x20];
            }
            else {
                arr_object1 = Arrays.copyOf(arr_object, 0x20);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
            }
            ArraysKt.copyInto(arr_object, arr_object1, v2 + 1, v2, 0x1F);
            objectRef0.setValue(arr_object[0x1F]);
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
        Object object1 = arr_object[v2];
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        arr_object2[v2] = this.insertIntoRoot(((Object[])object1), v - 5, v1, object0, objectRef0);
        int v3 = v2 + 1;
        if(v3 < 0x20) {
            while(arr_object2[v3] != null) {
                Object object2 = arr_object[v3];
                if(object2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                arr_object2[v3] = this.insertIntoRoot(((Object[])object2), v - 5, 0, objectRef0.getValue(), objectRef0);
                if(v3 + 1 < 0x20) {
                    ++v3;
                    continue;
                }
                return arr_object2;
            }
        }
        return arr_object2;
    }

    private final PersistentVector insertIntoTail(Object[] arr_object, int v, Object object0) {
        int v1 = this.size() - this.rootSize();
        Object[] arr_object1 = Arrays.copyOf(this.tail, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
        if(v1 < 0x20) {
            ArraysKt.copyInto(this.tail, arr_object1, v + 1, v, v1);
            arr_object1[v] = object0;
            return new PersistentVector(arr_object, arr_object1, this.size() + 1, this.rootShift);
        }
        Object object1 = this.tail[0x1F];
        ArraysKt.copyInto(this.tail, arr_object1, v + 1, v, v1 - 1);
        arr_object1[v] = object0;
        return this.pushFilledTail(arr_object, arr_object1, UtilsKt.presizedBufferWith(object1));
    }

    @Override  // kotlin.collections.AbstractList
    public ListIterator listIterator(int v) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        return new PersistentVectorIterator(this.root, this.tail, v, this.size(), this.rootShift / 5 + 1);
    }

    private final Object[] pullLastBuffer(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        if(v == 5) {
            objectRef0.setValue(arr_object[v2]);
            arr_object1 = null;
        }
        else {
            Object object0 = arr_object[v2];
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            arr_object1 = this.pullLastBuffer(((Object[])object0), v - 5, v1, objectRef0);
        }
        if(arr_object1 == null && v2 == 0) {
            return null;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
        arr_object2[v2] = arr_object1;
        return arr_object2;
    }

    private final PersistentList pullLastBufferFromRoot(Object[] arr_object, int v, int v1) {
        if(v1 == 0) {
            if(arr_object.length == 33) {
                arr_object = Arrays.copyOf(arr_object, 0x20);
                Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
            }
            return new SmallPersistentVector(arr_object);
        }
        ObjectRef objectRef0 = new ObjectRef(null);
        Object[] arr_object1 = this.pullLastBuffer(arr_object, v1, v - 1, objectRef0);
        Intrinsics.checkNotNull(arr_object1);
        Object object0 = objectRef0.getValue();
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        if(arr_object1[1] == null) {
            Object object1 = arr_object1[0];
            if(object1 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            return new PersistentVector(((Object[])object1), ((Object[])object0), v, v1 - 5);
        }
        return new PersistentVector(arr_object1, ((Object[])object0), v, v1);
    }

    private final PersistentVector pushFilledTail(Object[] arr_object, Object[] arr_object1, Object[] arr_object2) {
        return this.size() >> 5 <= 1 << this.rootShift ? new PersistentVector(this.pushTail(arr_object, this.rootShift, arr_object1), arr_object2, this.size() + 1, this.rootShift) : new PersistentVector(this.pushTail(UtilsKt.presizedBufferWith(arr_object), this.rootShift + 5, arr_object1), arr_object2, this.size() + 1, this.rootShift + 5);
    }

    private final Object[] pushTail(Object[] arr_object, int v, Object[] arr_object1) {
        Object[] arr_object2;
        int v1 = this.size() - 1 >> v & 0x1F;
        if(arr_object == null) {
            arr_object2 = null;
        }
        else {
            arr_object2 = Arrays.copyOf(arr_object, 0x20);
            Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
        }
        if(arr_object2 == null) {
            arr_object2 = new Object[0x20];
        }
        if(v == 5) {
            arr_object2[v1] = arr_object1;
            return arr_object2;
        }
        arr_object2[v1] = this.pushTail(((Object[])arr_object2[v1]), v - 5, arr_object1);
        return arr_object2;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Function1 function10) {
        return this.removeAll(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList removeAll(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        PersistentVectorBuilder persistentVectorBuilder0 = this.builder();
        persistentVectorBuilder0.removeAllWithPredicate(function10);
        return persistentVectorBuilder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList removeAt(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        int v1 = this.rootSize();
        if(v >= v1) {
            return this.removeFromTailAt(this.root, v1, this.rootShift, v - v1);
        }
        ObjectRef objectRef0 = new ObjectRef(this.tail[0]);
        return this.removeFromTailAt(this.removeFromRootAt(this.root, this.rootShift, v, objectRef0), v1, this.rootShift, 0);
    }

    private final Object[] removeFromRootAt(Object[] arr_object, int v, int v1, ObjectRef objectRef0) {
        Object[] arr_object1;
        int v2 = v1 >> v & 0x1F;
        int v3 = 0x1F;
        if(v == 0) {
            if(v2 == 0) {
                arr_object1 = new Object[0x20];
            }
            else {
                arr_object1 = Arrays.copyOf(arr_object, 0x20);
                Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
            }
            ArraysKt.copyInto(arr_object, arr_object1, v2, v2 + 1, 0x20);
            arr_object1[0x1F] = objectRef0.getValue();
            objectRef0.setValue(arr_object[v2]);
            return arr_object1;
        }
        if(arr_object[0x1F] == null) {
            v3 = this.rootSize() - 1 >> v & 0x1F;
        }
        Object[] arr_object2 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object2, "java.util.Arrays.copyOf(this, newSize)");
        if(v2 + 1 <= v3) {
            while(true) {
                Object object0 = arr_object2[v3];
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                }
                arr_object2[v3] = this.removeFromRootAt(((Object[])object0), v - 5, 0, objectRef0);
                if(v3 == v2 + 1) {
                    break;
                }
                --v3;
            }
        }
        Object object1 = arr_object2[v2];
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        arr_object2[v2] = this.removeFromRootAt(((Object[])object1), v - 5, v1, objectRef0);
        return arr_object2;
    }

    private final PersistentList removeFromTailAt(Object[] arr_object, int v, int v1, int v2) {
        int v3 = this.size() - v;
        if(v3 == 1) {
            return this.pullLastBufferFromRoot(arr_object, v, v1);
        }
        Object[] arr_object1 = Arrays.copyOf(this.tail, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
        if(v2 < v3 - 1) {
            ArraysKt.copyInto(this.tail, arr_object1, v2, v2 + 1, v3);
        }
        arr_object1[v3 - 1] = null;
        return new PersistentVector(arr_object, arr_object1, v + v3 - 1, v1);
    }

    private final int rootSize() {
        return this.size() - 1 & 0xFFFFFFE0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList set(int v, Object object0) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        if(this.rootSize() <= v) {
            Object[] arr_object = Arrays.copyOf(this.tail, 0x20);
            Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
            arr_object[v & 0x1F] = object0;
            return new PersistentVector(this.root, arr_object, this.size(), this.rootShift);
        }
        return new PersistentVector(this.setInRoot(this.root, this.rootShift, v, object0), this.tail, this.size(), this.rootShift);
    }

    private final Object[] setInRoot(Object[] arr_object, int v, int v1, Object object0) {
        int v2 = v1 >> v & 0x1F;
        Object[] arr_object1 = Arrays.copyOf(arr_object, 0x20);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
        if(v == 0) {
            arr_object1[v2] = object0;
            return arr_object1;
        }
        Object object1 = arr_object1[v2];
        if(object1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        arr_object1[v2] = this.setInRoot(((Object[])object1), v - 5, v1, object0);
        return arr_object1;
    }
}

