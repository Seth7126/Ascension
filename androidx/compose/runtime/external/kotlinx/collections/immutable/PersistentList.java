package androidx.compose.runtime.external.kotlinx.collections.immutable;

import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\u0019J\u001B\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0006J#\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00028\u0000H&¢\u0006\u0002\u0010\tJ$\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001A\u00020\b2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00028\u00000\fH&J\u001C\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\fH&J\u000E\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u000FH&J\u000E\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H&J\u001B\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001A\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\"\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H&J\u001C\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\fH&J\u0016\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001A\u00020\bH&J\u001C\u0010\u0017\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00028\u00000\fH&J#\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00028\u0000H&¢\u0006\u0002\u0010\t¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection;", "add", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "addAll", "c", "", "elements", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "clear", "remove", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "retainAll", "set", "Builder", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface PersistentList extends ImmutableList, PersistentCollection {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u000E\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentCollection$Builder;", "build", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface Builder extends androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection.Builder, List, KMutableList {
        PersistentList build();
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static ImmutableList subList(PersistentList persistentList0, int v, int v1) {
            Intrinsics.checkNotNullParameter(persistentList0, "this");
            return androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList.DefaultImpls.subList(persistentList0, v, v1);
        }
    }

    PersistentList add(int arg1, Object arg2);

    PersistentList add(Object arg1);

    PersistentList addAll(int arg1, Collection arg2);

    PersistentList addAll(Collection arg1);

    Builder builder();

    PersistentList clear();

    PersistentList remove(Object arg1);

    PersistentList removeAll(Collection arg1);

    PersistentList removeAll(Function1 arg1);

    PersistentList removeAt(int arg1);

    PersistentList retainAll(Collection arg1);

    PersistentList set(int arg1, Object arg2);
}

