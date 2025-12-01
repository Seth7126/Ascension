package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u001E\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001D\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0001¢\u0006\u0002\b\bJ\u001D\u0010\t\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0001¢\u0006\u0002\b\nJ%\u0010\u000B\u001A\u00020\u00042\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0001¢\u0006\u0002\b\u000EJ%\u0010\u000F\u001A\u00020\u00102\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u00122\n\u0010\u0013\u001A\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0002\b\u0014J\u0019\u0010\u0015\u001A\u00020\u00062\n\u0010\u0011\u001A\u0006\u0012\u0002\b\u00030\u0012H\u0001¢\u0006\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$runtime_release", "checkPositionIndex", "checkPositionIndex$runtime_release", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$runtime_release", "orderedEquals", "", "c", "", "other", "orderedEquals$runtime_release", "orderedHashCode", "orderedHashCode$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ListImplementation {
    public static final ListImplementation INSTANCE;

    static {
        ListImplementation.INSTANCE = new ListImplementation();
    }

    @JvmStatic
    public static final void checkElementIndex$runtime_release(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
        }
    }

    @JvmStatic
    public static final void checkPositionIndex$runtime_release(int v, int v1) {
        if(v < 0 || v > v1) {
            throw new IndexOutOfBoundsException("index: " + v + ", size: " + v1);
        }
    }

    @JvmStatic
    public static final void checkRangeIndexes$runtime_release(int v, int v1, int v2) {
        if(v < 0 || v1 > v2) {
            throw new IndexOutOfBoundsException("fromIndex: " + v + ", toIndex: " + v1 + ", size: " + v2);
        }
        if(v > v1) {
            throw new IllegalArgumentException("fromIndex: " + v + " > toIndex: " + v1);
        }
    }

    @JvmStatic
    public static final boolean orderedEquals$runtime_release(Collection collection0, Collection collection1) {
        Intrinsics.checkNotNullParameter(collection0, "c");
        Intrinsics.checkNotNullParameter(collection1, "other");
        if(collection0.size() != collection1.size()) {
            return false;
        }
        Iterator iterator0 = collection1.iterator();
        for(Object object0: collection0) {
            Object object1 = iterator0.next();
            if(!Intrinsics.areEqual(object0, object1)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    @JvmStatic
    public static final int orderedHashCode$runtime_release(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "c");
        int v = 1;
        for(Object object0: collection0) {
            v = v * 0x1F + (object0 == null ? 0 : object0.hashCode());
        }
        return v;
    }
}

