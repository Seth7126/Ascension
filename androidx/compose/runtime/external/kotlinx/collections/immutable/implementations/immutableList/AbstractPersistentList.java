package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.Builder;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList.DefaultImpls;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0005¢\u0006\u0002\u0010\u0004J$\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001A\u00020\u00072\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001C\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000E\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\u0016\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u000FJ\u0016\u0010\u0010\u001A\u00020\r2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u000F\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096\u0002J\u000E\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016J\u001B\u0010\u0015\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u000E\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001C\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001C\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u001E\u0010\u0019\u001A\b\u0012\u0004\u0012\u00028\u00000\u001A2\u0006\u0010\u001B\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u0007H\u0016¨\u0006\u001D"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/collections/AbstractList;", "()V", "addAll", "index", "", "c", "", "elements", "clear", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "", "listIterator", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAll", "retainAll", "subList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class AbstractPersistentList extends AbstractList implements PersistentList {
    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection addAll(Collection collection0) {
        return this.addAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList addAll(int v, Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "c");
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(v, collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        Builder persistentList$Builder0 = this.builder();
        persistentList$Builder0.addAll(collection0);
        return persistentList$Builder0.build();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection clear() {
        return this.clear();
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList clear() {
        return UtilsKt.persistentVectorOf();
    }

    @Override  // kotlin.collections.AbstractCollection
    public boolean contains(Object object0) {
        return this.indexOf(object0) != -1;
    }

    @Override  // kotlin.collections.AbstractCollection
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

    @Override  // kotlin.collections.AbstractList
    public Iterator iterator() {
        return this.listIterator();
    }

    @Override  // kotlin.collections.AbstractList
    public ListIterator listIterator() {
        return this.listIterator(0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection remove(Object object0) {
        return this.remove(object0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList remove(Object object0) {
        int v = this.indexOf(object0);
        return v != -1 ? this.removeAt(v) : this;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection removeAll(Collection collection0) {
        return this.removeAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList removeAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.removeAll(new Function1() {
            final Collection $elements;

            {
                this.$elements = collection0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(object0));
            }

            public final boolean invoke(Object object0) {
                return this.$elements.contains(object0);
            }
        });
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public PersistentCollection retainAll(Collection collection0) {
        return this.retainAll(collection0);
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    public PersistentList retainAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.removeAll(new Function1() {
            final Collection $elements;

            {
                this.$elements = collection0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(object0));
            }

            public final boolean invoke(Object object0) {
                return !this.$elements.contains(object0);
            }
        });
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
    public ImmutableList subList(int v, int v1) {
        return DefaultImpls.subList(this, v, v1);
    }

    @Override  // kotlin.collections.AbstractList
    public List subList(int v, int v1) {
        return this.subList(v, v1);
    }
}

