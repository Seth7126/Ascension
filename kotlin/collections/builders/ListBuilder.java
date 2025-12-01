package kotlin.collections.builders;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.collections.AbstractMutableList;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0015\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u0005:\u0001QB\u0007\b\u0016\u00A2\u0006\u0002\u0010\u0006B\u000F\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\b\u00A2\u0006\u0002\u0010\tBM\b\u0002\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u000B\u0012\u0006\u0010\f\u001A\u00020\b\u0012\u0006\u0010\r\u001A\u00020\b\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u000E\u0010\u0010\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u00A2\u0006\u0002\u0010\u0012J\u0015\u0010\u0017\u001A\u00020\u000F2\u0006\u0010\u0018\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0019J\u001D\u0010\u0017\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u001CJ\u001E\u0010\u001D\u001A\u00020\u000F2\u0006\u0010\u001B\u001A\u00020\b2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016J\u0016\u0010\u001D\u001A\u00020\u000F2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016J&\u0010 \u001A\u00020\u001A2\u0006\u0010!\u001A\u00020\b2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\u0006\u0010\"\u001A\u00020\bH\u0002J\u001D\u0010#\u001A\u00020\u001A2\u0006\u0010!\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010\u001CJ\f\u0010$\u001A\b\u0012\u0004\u0012\u00028\u00000%J\b\u0010&\u001A\u00020\u001AH\u0002J\b\u0010\'\u001A\u00020\u001AH\u0016J\u0014\u0010(\u001A\u00020\u000F2\n\u0010)\u001A\u0006\u0012\u0002\b\u00030%H\u0002J\u0010\u0010*\u001A\u00020\u001A2\u0006\u0010+\u001A\u00020\bH\u0002J\u0010\u0010,\u001A\u00020\u001A2\u0006\u0010\"\u001A\u00020\bH\u0002J\u0013\u0010-\u001A\u00020\u000F2\b\u0010)\u001A\u0004\u0018\u00010.H\u0096\u0002J\u0016\u0010/\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\bH\u0096\u0002\u00A2\u0006\u0002\u00100J\b\u00101\u001A\u00020\bH\u0016J\u0015\u00102\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u00103J\u0018\u00104\u001A\u00020\u001A2\u0006\u0010!\u001A\u00020\b2\u0006\u0010\"\u001A\u00020\bH\u0002J\b\u00105\u001A\u00020\u000FH\u0016J\u000F\u00106\u001A\b\u0012\u0004\u0012\u00028\u000007H\u0096\u0002J\u0015\u00108\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u00103J\u000E\u00109\u001A\b\u0012\u0004\u0012\u00028\u00000:H\u0016J\u0016\u00109\u001A\b\u0012\u0004\u0012\u00028\u00000:2\u0006\u0010\u001B\u001A\u00020\bH\u0016J\u0015\u0010;\u001A\u00020\u000F2\u0006\u0010\u0018\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0019J\u0016\u0010<\u001A\u00020\u000F2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016J\u0015\u0010=\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\bH\u0016\u00A2\u0006\u0002\u00100J\u0015\u0010>\u001A\u00028\u00002\u0006\u0010!\u001A\u00020\bH\u0002\u00A2\u0006\u0002\u00100J\u0018\u0010?\u001A\u00020\u001A2\u0006\u0010@\u001A\u00020\b2\u0006\u0010A\u001A\u00020\bH\u0002J\u0016\u0010B\u001A\u00020\u000F2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001FH\u0016J.\u0010C\u001A\u00020\b2\u0006\u0010@\u001A\u00020\b2\u0006\u0010A\u001A\u00020\b2\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u00028\u00000\u001F2\u0006\u0010D\u001A\u00020\u000FH\u0002J\u001E\u0010E\u001A\u00028\u00002\u0006\u0010\u001B\u001A\u00020\b2\u0006\u0010\u0018\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010FJ\u001E\u0010G\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010H\u001A\u00020\b2\u0006\u0010I\u001A\u00020\bH\u0016J\u0015\u0010J\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010.0\u000BH\u0016\u00A2\u0006\u0002\u0010KJ\'\u0010J\u001A\b\u0012\u0004\u0012\u0002HL0\u000B\"\u0004\b\u0001\u0010L2\f\u0010M\u001A\b\u0012\u0004\u0012\u0002HL0\u000BH\u0016\u00A2\u0006\u0002\u0010NJ\b\u0010O\u001A\u00020PH\u0016R\u0016\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u000BX\u0082\u000E\u00A2\u0006\u0004\n\u0002\u0010\u0013R\u0016\u0010\u0010\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u000FX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001A\u00020\b8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016\u00A8\u0006R"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "()V", "initialCapacity", "", "(I)V", "array", "", "offset", "length", "isReadOnly", "", "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "build", "", "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "equals", "", "get", "(I)Ljava/lang/Object;", "hashCode", "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "Itr", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class ListBuilder extends AbstractMutableList implements List, RandomAccess, KMutableList {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001D\b\u0016\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001A\u00020\u000EH\u0096\u0002J\b\u0010\u000F\u001A\u00020\u000EH\u0016J\u000E\u0010\u0010\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001A\u00020\u0006H\u0016J\r\u0010\u0013\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001A\u00020\u0006H\u0016J\b\u0010\u0015\u001A\u00020\nH\u0016J\u0015\u0010\u0016\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    static final class Itr implements ListIterator, KMutableListIterator {
        private int index;
        private int lastIndex;
        private final ListBuilder list;

        public Itr(ListBuilder listBuilder0, int v) {
            Intrinsics.checkNotNullParameter(listBuilder0, "list");
            super();
            this.list = listBuilder0;
            this.index = v;
            this.lastIndex = -1;
        }

        @Override
        public void add(Object object0) {
            int v = this.index;
            this.index = v + 1;
            this.list.add(v, object0);
            this.lastIndex = -1;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.list.length;
        }

        @Override
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override
        public Object next() {
            if(this.index >= this.list.length) {
                throw new NoSuchElementException();
            }
            int v = this.index;
            this.index = v + 1;
            this.lastIndex = v;
            return this.list.array[this.list.offset + this.lastIndex];
        }

        @Override
        public int nextIndex() {
            return this.index;
        }

        @Override
        public Object previous() {
            int v = this.index;
            if(v <= 0) {
                throw new NoSuchElementException();
            }
            this.index = v - 1;
            this.lastIndex = v - 1;
            return this.list.array[this.list.offset + this.lastIndex];
        }

        @Override
        public int previousIndex() {
            return this.index - 1;
        }

        @Override
        public void remove() {
            int v = this.lastIndex;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
            }
            this.list.remove(v);
            this.index = this.lastIndex;
            this.lastIndex = -1;
        }

        @Override
        public void set(Object object0) {
            int v = this.lastIndex;
            if(v == -1) {
                throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
            }
            this.list.set(v, object0);
        }
    }

    private Object[] array;
    private final ListBuilder backing;
    private boolean isReadOnly;
    private int length;
    private int offset;
    private final ListBuilder root;

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int v) {
        this(ListBuilderKt.arrayOfUninitializedElements(v), 0, 0, false, null, null);
    }

    private ListBuilder(Object[] arr_object, int v, int v1, boolean z, ListBuilder listBuilder0, ListBuilder listBuilder1) {
        this.array = arr_object;
        this.offset = v;
        this.length = v1;
        this.isReadOnly = z;
        this.backing = listBuilder0;
        this.root = listBuilder1;
    }

    public static final void access$setArray$p(ListBuilder listBuilder0, Object[] arr_object) {
        listBuilder0.array = arr_object;
    }

    public static final void access$setLength$p(ListBuilder listBuilder0, int v) {
        listBuilder0.length = v;
    }

    public static final void access$setOffset$p(ListBuilder listBuilder0, int v) {
        listBuilder0.offset = v;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public void add(int v, Object object0) {
        this.checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.length);
        this.addAtInternal(this.offset + v, object0);
    }

    @Override
    public boolean add(Object object0) {
        this.checkIsMutable();
        this.addAtInternal(this.offset + this.length, object0);
        return true;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.checkIsMutable();
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.length);
        int v1 = collection0.size();
        this.addAllInternal(this.offset + v, collection0, v1);
        return v1 > 0;
    }

    @Override
    public boolean addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.checkIsMutable();
        int v = collection0.size();
        this.addAllInternal(this.offset + this.length, collection0, v);
        return v > 0;
    }

    private final void addAllInternal(int v, Collection collection0, int v1) {
        ListBuilder listBuilder0 = this.backing;
        if(listBuilder0 != null) {
            listBuilder0.addAllInternal(v, collection0, v1);
            this.array = this.backing.array;
            this.length += v1;
            return;
        }
        this.insertAtInternal(v, v1);
        Iterator iterator0 = collection0.iterator();
        for(int v2 = 0; v2 < v1; ++v2) {
            Object[] arr_object = this.array;
            Object object0 = iterator0.next();
            arr_object[v + v2] = object0;
        }
    }

    private final void addAtInternal(int v, Object object0) {
        ListBuilder listBuilder0 = this.backing;
        if(listBuilder0 != null) {
            listBuilder0.addAtInternal(v, object0);
            this.array = this.backing.array;
            ++this.length;
            return;
        }
        this.insertAtInternal(v, 1);
        this.array[v] = object0;
    }

    public final List build() {
        if(this.backing != null) {
            throw new IllegalStateException();
        }
        this.checkIsMutable();
        this.isReadOnly = true;
        return this;
    }

    private final void checkIsMutable() {
        if(this.isReadOnly || this.root != null && this.root.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public void clear() {
        this.checkIsMutable();
        this.removeRangeInternal(this.offset, this.length);
    }

    private final boolean contentEquals(List list0) {
        return ListBuilderKt.access$subarrayContentEquals(this.array, this.offset, this.length, list0);
    }

    private final void ensureCapacity(int v) {
        if(this.backing != null) {
            throw new IllegalStateException();
        }
        if(v > this.array.length) {
            this.array = ListBuilderKt.copyOfUninitializedElements(this.array, ArrayDeque.Companion.newCapacity$kotlin_stdlib(this.array.length, v));
        }
    }

    private final void ensureExtraCapacity(int v) {
        this.ensureCapacity(this.length + v);
    }

    // 去混淆评级： 低(20)
    @Override
    public boolean equals(Object object0) {
        return object0 == this || object0 instanceof List && this.contentEquals(((List)object0));
    }

    @Override
    public Object get(int v) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.length);
        return this.array[this.offset + v];
    }

    @Override  // kotlin.collections.AbstractMutableList
    public int getSize() {
        return this.length;
    }

    @Override
    public int hashCode() {
        return ListBuilderKt.subarrayContentHashCode(this.array, this.offset, this.length);
    }

    @Override
    public int indexOf(Object object0) {
        for(int v = 0; v < this.length; ++v) {
            if(Intrinsics.areEqual(this.array[this.offset + v], object0)) {
                return v;
            }
        }
        return -1;
    }

    private final void insertAtInternal(int v, int v1) {
        this.ensureExtraCapacity(v1);
        ArraysKt.copyInto(this.array, this.array, v + v1, v, this.offset + this.length);
        this.length += v1;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public Iterator iterator() {
        return new Itr(this, 0);
    }

    @Override
    public int lastIndexOf(Object object0) {
        for(int v = this.length - 1; v >= 0; --v) {
            if(Intrinsics.areEqual(this.array[this.offset + v], object0)) {
                return v;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return new Itr(this, 0);
    }

    @Override
    public ListIterator listIterator(int v) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(v, this.length);
        return new Itr(this, v);
    }

    @Override
    public boolean remove(Object object0) {
        this.checkIsMutable();
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
        }
        return v >= 0;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.checkIsMutable();
        return this.retainOrRemoveAllInternal(this.offset, this.length, collection0, false) > 0;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object removeAt(int v) {
        this.checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.length);
        return this.removeAtInternal(this.offset + v);
    }

    private final Object removeAtInternal(int v) {
        ListBuilder listBuilder0 = this.backing;
        if(listBuilder0 != null) {
            Object object0 = listBuilder0.removeAtInternal(v);
            --this.length;
            return object0;
        }
        Object[] arr_object = this.array;
        Object object1 = arr_object[v];
        ArraysKt.copyInto(arr_object, arr_object, v, v + 1, this.offset + this.length);
        ListBuilderKt.resetAt(this.array, this.offset + this.length - 1);
        --this.length;
        return object1;
    }

    private final void removeRangeInternal(int v, int v1) {
        ListBuilder listBuilder0 = this.backing;
        if(listBuilder0 == null) {
            ArraysKt.copyInto(this.array, this.array, v, v + v1, this.length);
            ListBuilderKt.resetRange(this.array, this.length - v1, this.length);
        }
        else {
            listBuilder0.removeRangeInternal(v, v1);
        }
        this.length -= v1;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.checkIsMutable();
        return this.retainOrRemoveAllInternal(this.offset, this.length, collection0, true) > 0;
    }

    private final int retainOrRemoveAllInternal(int v, int v1, Collection collection0, boolean z) {
        ListBuilder listBuilder0 = this.backing;
        if(listBuilder0 != null) {
            int v2 = listBuilder0.retainOrRemoveAllInternal(v, v1, collection0, z);
            this.length -= v2;
            return v2;
        }
        int v3 = 0;
        int v4 = 0;
        while(v3 < v1) {
            int v5 = v + v3;
            if(collection0.contains(this.array[v5]) == z) {
                ++v3;
                this.array[v4 + v] = this.array[v5];
                ++v4;
            }
            else {
                ++v3;
            }
        }
        int v6 = v1 - v4;
        ArraysKt.copyInto(this.array, this.array, v + v4, v1 + v, this.length);
        ListBuilderKt.resetRange(this.array, this.length - v6, this.length);
        this.length -= v6;
        return v6;
    }

    @Override  // kotlin.collections.AbstractMutableList
    public Object set(int v, Object object0) {
        this.checkIsMutable();
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(v, this.length);
        Object[] arr_object = this.array;
        int v1 = this.offset;
        Object object1 = arr_object[v1 + v];
        arr_object[v1 + v] = object0;
        return object1;
    }

    @Override
    public List subList(int v, int v1) {
        AbstractList.Companion.checkRangeIndexes$kotlin_stdlib(v, v1, this.length);
        Object[] arr_object = this.array;
        int v2 = this.offset + v;
        boolean z = this.isReadOnly;
        return this.root == null ? new ListBuilder(arr_object, v2, v1 - v, z, this, this) : new ListBuilder(arr_object, v2, v1 - v, z, this, this.root);
    }

    @Override
    public Object[] toArray() {
        Object[] arr_object = ArraysKt.copyOfRange(this.array, this.offset, this.length + this.offset);
        if(arr_object == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        }
        return arr_object;
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "destination");
        int v = this.length;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOfRange(this.array, this.offset, v + this.offset, arr_object.getClass());
            Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOfR…h, destination.javaClass)");
            return arr_object1;
        }
        Object[] arr_object2 = this.array;
        if(arr_object2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        ArraysKt.copyInto(arr_object2, arr_object, 0, this.offset, v + this.offset);
        int v1 = this.length;
        if(arr_object.length > v1) {
            arr_object[v1] = null;
        }
        return arr_object;
    }

    @Override
    public String toString() {
        return ListBuilderKt.subarrayContentToString(this.array, this.offset, this.length);
    }
}

