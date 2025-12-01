package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0006\u0010\u0017\u001A\u00020\u0018J\u0016\u0010\u0019\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0016J\u0016\u0010\u001B\u001A\u00020\u00142\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u001DH\u0016J\u0012\u0010\u001E\u001A\u00020\u00062\b\u0010\u0015\u001A\u0004\u0018\u00010\u0002H\u0002J\"\u0010\u001F\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u00062\b\u0010\u0015\u001A\u0004\u0018\u00010\u00022\u0006\u0010!\u001A\u00020\u0006H\u0002J+\u0010\"\u001A\u00020\u00182\u0012\u0010#\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00180$H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010%\u001A\u00028\u00002\u0006\u0010&\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0002\u0010\'J\b\u0010(\u001A\u00020\u0014H\u0016J\u0006\u0010)\u001A\u00020\u0014J\u000F\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000+H\u0096\u0002J\u0013\u0010,\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00028\u0000¢\u0006\u0002\u0010\u0016J \u0010-\u001A\u00020\u00182\u0012\u0010.\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140$H\u0086\bø\u0001\u0000R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR.\u0010\u000B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0000@\u0000X\u0081\u000E¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b\r\u0010\u0004\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArraySet;", "T", "", "", "()V", "size", "", "getSize", "()I", "setSize", "(I)V", "values", "", "getValues$annotations", "getValues", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "add", "", "value", "(Ljava/lang/Object;)Z", "clear", "", "contains", "element", "containsAll", "elements", "", "find", "findExactIndex", "midIndex", "valueHash", "forEach", "block", "Lkotlin/Function1;", "get", "index", "(I)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "iterator", "", "remove", "removeValueIf", "predicate", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IdentityArraySet implements Set, KMappedMarker {
    private int size;
    private Object[] values;

    public IdentityArraySet() {
        this.values = new Object[16];
    }

    @Override
    public final boolean add(Object object0) {
        int v;
        Intrinsics.checkNotNullParameter(object0, "value");
        if(this.size() > 0) {
            v = this.find(object0);
            if(v >= 0) {
                return false;
            }
        }
        else {
            v = -1;
        }
        Object[] arr_object = this.values;
        if(this.size() == arr_object.length) {
            Object[] arr_object1 = new Object[arr_object.length * 2];
            ArraysKt.copyInto(arr_object, arr_object1, -v, -(v + 1), this.size());
            ArraysKt.copyInto$default(this.values, arr_object1, 0, 0, -(v + 1), 6, null);
            this.values = arr_object1;
        }
        else {
            ArraysKt.copyInto(arr_object, arr_object, -v, -(v + 1), this.size());
        }
        this.values[-(v + 1)] = object0;
        this.setSize(this.size() + 1);
        return true;
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        int v = this.size();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                this.values[v1] = null;
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        this.setSize(0);
    }

    @Override
    public boolean contains(Object object0) {
        return object0 == null ? false : this.find(object0) >= 0;
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

    private final int find(Object object0) {
        int v = this.size() - 1;
        int v1 = ActualJvm_jvmKt.identityHashCode(object0);
        int v2 = 0;
        while(v2 <= v) {
            int v3 = v2 + v >>> 1;
            Object object1 = this.get(v3);
            int v4 = ActualJvm_jvmKt.identityHashCode(object1) - v1;
            if(v4 < 0) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v = v3 - 1;
                continue;
            }
            return object1 == object0 ? v3 : this.findExactIndex(v3, object0, v1);
        }
        return -(v2 + 1);
    }

    private final int findExactIndex(int v, Object object0, int v1) {
        int v2 = v - 1;
        if(v2 >= 0) {
            while(true) {
                Object object1 = this.values[v2];
                if(object1 == object0) {
                    return v2;
                }
                if(ActualJvm_jvmKt.identityHashCode(object1) != v1 || v2 - 1 < 0) {
                    break;
                }
                --v2;
            }
        }
        int v3 = v + 1;
        int v4 = this.size();
        if(v3 < v4) {
            while(true) {
                Object object2 = this.values[v3];
                if(object2 == object0) {
                    return v3;
                }
                if(ActualJvm_jvmKt.identityHashCode(object2) != v1) {
                    return -(v3 + 1);
                }
                if(v3 + 1 >= v4) {
                    break;
                }
                ++v3;
            }
        }
        return -(this.size() + 1);
    }

    public final void forEach(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = this.size();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                function10.invoke(this.get(v1));
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
    }

    public final Object get(int v) {
        Object object0 = this.values[v];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        }
        return object0;
    }

    public int getSize() {
        return this.size;
    }

    public final Object[] getValues() {
        return this.values;
    }

    public static void getValues$annotations() {
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    public final boolean isNotEmpty() {
        return this.size() > 0;
    }

    @Override
    public Iterator iterator() {
        return new Object() {
            private int index;

            public final int getIndex() {
                return this.index;
            }

            @Override
            public boolean hasNext() {
                return this.index < IdentityArraySet.this.size();
            }

            @Override
            public Object next() {
                int v = this.index;
                this.index = v + 1;
                Object object0 = IdentityArraySet.this.getValues()[v];
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                return object0;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setIndex(int v) {
                this.index = v;
            }
        };
    }

    @Override
    public final boolean remove(Object object0) {
        if(object0 == null) {
            return false;
        }
        int v = this.find(object0);
        if(v >= 0) {
            if(v < this.size() - 1) {
                ArraysKt.copyInto(this.values, this.values, v, v + 1, this.size());
            }
            this.setSize(this.size() - 1);
            this.values[this.size()] = null;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeValueIf(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.size();
        int v1 = 0;
        if(v > 0) {
            int v2 = 0;
            while(true) {
                Object object0 = this.getValues()[v1];
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                    if(v2 != v1) {
                        this.getValues()[v2] = object0;
                    }
                    ++v2;
                }
                if(v1 + 1 >= v) {
                    v1 = v2;
                    break;
                }
                ++v1;
            }
        }
        int v3 = this.size();
        if(v1 < v3) {
            for(int v4 = v1; true; ++v4) {
                this.getValues()[v4] = null;
                if(v4 + 1 >= v3) {
                    break;
                }
            }
        }
        this.setSize(v1);
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void setSize(int v) {
        this.size = v;
    }

    public final void setValues(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.values = arr_object;
    }

    @Override
    public final int size() {
        return this.getSize();
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
}

