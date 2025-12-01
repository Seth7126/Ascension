package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0002\u0010\bJ\u0015\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0014J\u001D\u0010\u0011\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0017J\u001E\u0010\u0018\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u00062\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0016J\u0016\u0010\u0018\u001A\u00020\u00122\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0016J\b\u0010\u001B\u001A\u00020\u0015H\u0016J\u0016\u0010\u001C\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010\u0014J\u0016\u0010\u001D\u001A\u00020\u00122\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0016J\u0016\u0010\u001E\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u0006H\u0096\u0002\u00A2\u0006\u0002\u0010\u001FJ\u0015\u0010 \u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010!J\b\u0010\"\u001A\u00020\u0012H\u0016J\u000F\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002J\u0015\u0010%\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010!J\u000E\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\'H\u0016J\u0016\u0010&\u001A\b\u0012\u0004\u0012\u00028\u00000\'2\u0006\u0010\u0016\u001A\u00020\u0006H\u0016J\u0015\u0010(\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010\u0014J\u0016\u0010)\u001A\u00020\u00122\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0016J\u0015\u0010*\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u0006H\u0016\u00A2\u0006\u0002\u0010\u001FJ\u0016\u0010+\u001A\u00020\u00122\f\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001AH\u0016J\u001E\u0010,\u001A\u00028\u00002\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0013\u001A\u00028\u0000H\u0096\u0002\u00A2\u0006\u0002\u0010-J\u001E\u0010.\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016J\b\u0010/\u001A\u00020\u0015H\u0002R\u000E\u0010\t\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u001E\u0010\u000E\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0006@RX\u0096\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010\u00A8\u00060"}, d2 = {"Landroidx/compose/runtime/snapshots/SubList;", "T", "", "parentList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "fromIndex", "", "toIndex", "(Landroidx/compose/runtime/snapshots/SnapshotStateList;II)V", "modification", "offset", "getParentList", "()Landroidx/compose/runtime/snapshots/SnapshotStateList;", "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "validateModification", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SubList implements List, KMutableList {
    private int modification;
    private final int offset;
    private final SnapshotStateList parentList;
    private int size;

    public SubList(SnapshotStateList snapshotStateList0, int v, int v1) {
        Intrinsics.checkNotNullParameter(snapshotStateList0, "parentList");
        super();
        this.parentList = snapshotStateList0;
        this.offset = v;
        this.modification = snapshotStateList0.getModification$runtime_release();
        this.size = v1 - v;
    }

    @Override
    public void add(int v, Object object0) {
        this.validateModification();
        this.parentList.add(this.offset + v, object0);
        this.size = this.size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
    }

    @Override
    public boolean add(Object object0) {
        this.validateModification();
        this.parentList.add(this.offset + this.size(), object0);
        this.size = this.size() + 1;
        this.modification = this.parentList.getModification$runtime_release();
        return true;
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.validateModification();
        boolean z = this.parentList.addAll(v + this.offset, collection0);
        if(z) {
            this.size = this.size() + collection0.size();
            this.modification = this.parentList.getModification$runtime_release();
        }
        return z;
    }

    @Override
    public boolean addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.addAll(this.size(), collection0);
    }

    @Override
    public void clear() {
        if(this.size() > 0) {
            this.validateModification();
            this.parentList.removeRange(this.offset, this.size() + this.offset);
            this.size = 0;
            this.modification = this.parentList.getModification$runtime_release();
        }
    }

    @Override
    public boolean contains(Object object0) {
        return this.indexOf(object0) >= 0;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(!collection0.isEmpty()) {
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
        }
        return true;
    }

    @Override
    public Object get(int v) {
        this.validateModification();
        SnapshotStateListKt.validateRange(v, this.size());
        return this.parentList.get(this.offset + v);
    }

    public final SnapshotStateList getParentList() {
        return this.parentList;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int indexOf(Object object0) {
        this.validateModification();
        Iterator iterator0 = RangesKt.until(this.offset, this.size() + this.offset).iterator();
        while(iterator0.hasNext()) {
            int v = ((IntIterator)iterator0).nextInt();
            if(Intrinsics.areEqual(object0, this.getParentList().get(v))) {
                return v - this.offset;
            }
            if(false) {
                break;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override
    public int lastIndexOf(Object object0) {
        this.validateModification();
        for(int v = this.offset + this.size() - 1; v >= this.offset; --v) {
            if(Intrinsics.areEqual(object0, this.parentList.get(v))) {
                return v - this.offset;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override
    public ListIterator listIterator(int v) {
        this.validateModification();
        IntRef ref$IntRef0 = new IntRef();
        ref$IntRef0.element = v - 1;
        return new Object() {
            public Void add(Object object0) {
                SnapshotStateListKt.modificationError();
                throw new KotlinNothingValueException();
            }

            @Override
            public void add(Object object0) {
                this.add(object0);
                throw new KotlinNothingValueException();
            }

            @Override
            public boolean hasNext() {
                return this.element < SubList.this.size() - 1;
            }

            @Override
            public boolean hasPrevious() {
                return this.element >= 0;
            }

            @Override
            public Object next() {
                int v = this.element + 1;
                SnapshotStateListKt.validateRange(v, SubList.this.size());
                this.element = v;
                return SubList.this.get(v);
            }

            @Override
            public int nextIndex() {
                return this.element + 1;
            }

            @Override
            public Object previous() {
                int v = this.element;
                SnapshotStateListKt.validateRange(v, SubList.this.size());
                this.element = v - 1;
                return SubList.this.get(v);
            }

            @Override
            public int previousIndex() {
                return this.element;
            }

            public Void remove() {
                SnapshotStateListKt.modificationError();
                throw new KotlinNothingValueException();
            }

            @Override
            public void remove() {
                this.remove();
                throw new KotlinNothingValueException();
            }

            public Void set(Object object0) {
                SnapshotStateListKt.modificationError();
                throw new KotlinNothingValueException();
            }

            @Override
            public void set(Object object0) {
                this.set(object0);
                throw new KotlinNothingValueException();
            }
        };
    }

    @Override
    public final Object remove(int v) {
        return this.removeAt(v);
    }

    @Override
    public boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.remove(v);
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Iterator iterator0 = collection0.iterator();
    alab1:
        while(true) {
            for(z = false; true; z = true) {
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                if(!this.remove(object0) && !z) {
                    break;
                }
            }
        }
        return z;
    }

    public Object removeAt(int v) {
        this.validateModification();
        Object object0 = this.parentList.remove(this.offset + v);
        this.size = this.size() - 1;
        this.modification = this.getParentList().getModification$runtime_release();
        return object0;
    }

    @Override
    public boolean retainAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        this.validateModification();
        int v = this.offset + this.size() - 1;
        boolean z = false;
        while(v >= this.offset) {
            if(!collection0.contains(this.parentList.get(v))) {
                if(!z) {
                    z = true;
                }
                this.parentList.remove(v);
                this.size = this.size() - 1;
            }
            --v;
        }
        if(z) {
            this.modification = this.parentList.getModification$runtime_release();
        }
        return z;
    }

    @Override
    public Object set(int v, Object object0) {
        SnapshotStateListKt.validateRange(v, this.size());
        this.validateModification();
        Object object1 = this.parentList.set(v + this.offset, object0);
        this.modification = this.parentList.getModification$runtime_release();
        return object1;
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public List subList(int v, int v1) {
        if(v < 0 || v > v1 || v1 > this.size()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.validateModification();
        return new SubList(this.parentList, v + this.offset, v1 + this.offset);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }

    private final void validateModification() {
        if(this.parentList.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }
}

