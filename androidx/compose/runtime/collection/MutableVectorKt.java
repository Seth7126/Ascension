package androidx.compose.runtime.collection;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u001A!\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\b\b\u0002\u0010\u0003\u001A\u00020\u0004H\u0086\b\u001AC\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0006\u0010\u0005\u001A\u00020\u00042\u0014\b\b\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00020\u0007H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001A\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001H\u0086\b\u001A0\u0010\b\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u00012\u0012\u0010\t\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\n\"\u0002H\u0002H\u0086\b¢\u0006\u0002\u0010\u000B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"MutableVector", "Landroidx/compose/runtime/collection/MutableVector;", "T", "capacity", "", "size", "init", "Lkotlin/Function1;", "mutableVectorOf", "elements", "", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MutableVectorKt {
    public static final MutableVector MutableVector(int v) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[v], 0);
    }

    public static final MutableVector MutableVector(int v, Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "init");
        Intrinsics.reifiedOperationMarker(0, "T");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function10.invoke(v1);
        }
        return new MutableVector(arr_object, v);
    }

    public static MutableVector MutableVector$default(int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[v], 0);
    }

    public static final MutableVector mutableVectorOf() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[16], 0);
    }

    public static final MutableVector mutableVectorOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        return new MutableVector(arr_object, arr_object.length);
    }
}

