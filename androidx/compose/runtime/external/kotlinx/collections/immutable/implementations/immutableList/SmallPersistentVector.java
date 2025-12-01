package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u0000 (*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001(B\u0015\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00A2\u0006\u0002\u0010\u0007J\u001B\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0010J#\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0006\u0010\u0011\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0012J$\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0006\u0010\u0011\u001A\u00020\n2\f\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001C\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001D\u0010\u0017\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001A\u00020\nH\u0002\u00A2\u0006\u0002\u0010\u0018J\u000E\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0016J\u0016\u0010\u001B\u001A\u00028\u00002\u0006\u0010\u0011\u001A\u00020\nH\u0096\u0002\u00A2\u0006\u0002\u0010\u001CJ\u0015\u0010\u001D\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001EJ\u0015\u0010\u001F\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001EJ\u0016\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0011\u001A\u00020\nH\u0016J\"\u0010\"\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0$H\u0016J\u0016\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0006\u0010\u0011\u001A\u00020\nH\u0016J#\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00000\u000E2\u0006\u0010\u0011\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0012R\u0018\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004\u00A2\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001A\u00020\n8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\f\u00A8\u0006)"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "buffer", "", "", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "", "getSize", "()I", "add", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "addAll", "c", "", "elements", "bufferOfSize", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "listIterator", "", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "set", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SmallPersistentVector extends AbstractPersistentList implements ImmutableList {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final SmallPersistentVector EMPTY;
    private final Object[] buffer;

    static {
        SmallPersistentVector.Companion = new Companion(null);
        SmallPersistentVector.EMPTY = new SmallPersistentVector(new Object[0]);
    }

    public SmallPersistentVector(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "buffer");
        super();
        this.buffer = arr_object;
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
        if(this.size() < 0x20) {
            Object[] arr_object = this.bufferOfSize(this.size() + 1);
            ArraysKt.copyInto$default(this.buffer, arr_object, 0, 0, v, 6, null);
            ArraysKt.copyInto(this.buffer, arr_object, v + 1, v, this.size());
            arr_object[v] = object0;
            return new SmallPersistentVector(arr_object);
        }
        Object[] arr_object1 = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, size)");
        ArraysKt.copyInto(this.buffer, arr_object1, v + 1, v, this.size() - 1);
        arr_object1[v] = object0;
        return new PersistentVector(arr_object1, UtilsKt.presizedBufferWith(this.buffer[0x1F]), this.size() + 1, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList add(Object object0) {
        if(this.size() < 0x20) {
            Object[] arr_object = Arrays.copyOf(this.buffer, this.size() + 1);
            Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
            arr_object[this.size()] = object0;
            return new SmallPersistentVector(arr_object);
        }
        Object[] arr_object1 = UtilsKt.presizedBufferWith(object0);
        return new PersistentVector(this.buffer, arr_object1, this.size() + 1, 0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public PersistentList addAll(int v, Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "c");
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        if(this.size() + collection0.size() <= 0x20) {
            Object[] arr_object = this.bufferOfSize(this.size() + collection0.size());
            ArraysKt.copyInto$default(this.buffer, arr_object, 0, 0, v, 6, null);
            ArraysKt.copyInto(this.buffer, arr_object, collection0.size() + v, v, this.size());
            for(Object object0: collection0) {
                arr_object[v] = object0;
                ++v;
            }
            return new SmallPersistentVector(arr_object);
        }
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(v, collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList
    public PersistentList addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(this.size() + collection0.size() <= 0x20) {
            Object[] arr_object = Arrays.copyOf(this.buffer, this.size() + collection0.size());
            Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
            int v = this.size();
            for(Object object0: collection0) {
                arr_object[v] = object0;
                ++v;
            }
            return new SmallPersistentVector(arr_object);
        }
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(collection0);
        return persistentList$Builder0.build();
    }

    private final Object[] bufferOfSize(int v) {
        return new Object[v];
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder builder() {
        return this.builder();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public Builder builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override  // kotlin.collections.AbstractList
    public Object get(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        return this.buffer[v];
    }

    @Override  // kotlin.collections.AbstractList
    public int getSize() {
        return this.buffer.length;
    }

    @Override  // kotlin.collections.AbstractList
    public int indexOf(Object object0) {
        return ArraysKt.indexOf(this.buffer, object0);
    }

    @Override  // kotlin.collections.AbstractList
    public int lastIndexOf(Object object0) {
        return ArraysKt.lastIndexOf(this.buffer, object0);
    }

    @Override  // kotlin.collections.AbstractList
    public ListIterator listIterator(int v) {
        ListImplementation.checkPositionIndex$runtime_release(v, this.size());
        return new BufferIterator(this.buffer, v, this.size());
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Function1 function10) {
        return this.removeAll(function10);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList removeAll(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        Object[] arr_object = this.buffer;
        int v = this.size();
        int v1 = this.size();
        if(v1 > 0) {
            boolean z = false;
            for(int v2 = 0; true; ++v2) {
                Object object0 = this.buffer[v2];
                if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                    if(z) {
                        arr_object[v] = object0;
                        ++v;
                    }
                }
                else if(!z) {
                    arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
                    Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
                    z = true;
                    v = v2;
                }
                if(v2 + 1 >= v1) {
                    break;
                }
            }
        }
        if(v == this.size()) {
            return this;
        }
        return v == 0 ? SmallPersistentVector.EMPTY : new SmallPersistentVector(ArraysKt.copyOfRange(arr_object, 0, v));
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList removeAt(int v) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        if(this.size() == 1) {
            return SmallPersistentVector.EMPTY;
        }
        Object[] arr_object = Arrays.copyOf(this.buffer, this.size() - 1);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
        ArraysKt.copyInto(this.buffer, arr_object, v, v + 1, this.size());
        return new SmallPersistentVector(arr_object);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList set(int v, Object object0) {
        ListImplementation.checkElementIndex$runtime_release(v, this.size());
        Object[] arr_object = Arrays.copyOf(this.buffer, this.buffer.length);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, size)");
        arr_object[v] = object0;
        return new SmallPersistentVector(arr_object);
    }
}

