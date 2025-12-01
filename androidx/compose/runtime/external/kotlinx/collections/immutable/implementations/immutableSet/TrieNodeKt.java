package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\u001A\u0018\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001A7\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\"\u0004\b\u0000\u0010\u000B*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\f\u001A\u0002H\u000BH\u0002¢\u0006\u0002\u0010\r\u001AL\u0010\u000E\u001A\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u000E\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\b\b\u0002\u0010\u0010\u001A\u00020\u00012\u0016\b\u0002\u0010\u0011\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b¢\u0006\u0002\u0010\u0014\u001A)\u0010\u0015\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t*\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0016\u001A\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0017\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"LOG_MAX_BRANCHING_FACTOR", "", "MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "indexSegment", "index", "shift", "addElementAtIndex", "", "", "E", "element", "([Ljava/lang/Object;ILjava/lang/Object;)[Ljava/lang/Object;", "filterTo", "newArray", "newArrayOffset", "predicate", "Lkotlin/Function1;", "", "([Ljava/lang/Object;[Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)I", "removeCellAtIndex", "cellIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TrieNodeKt {
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 0x20;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 0x1F;
    public static final int MAX_SHIFT = 30;

    private static final Object[] addElementAtIndex(Object[] arr_object, int v, Object object0) {
        Object[] arr_object1 = new Object[arr_object.length + 1];
        ArraysKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt.copyInto(arr_object, arr_object1, v + 1, v, arr_object.length);
        arr_object1[v] = object0;
        return arr_object1;
    }

    private static final int filterTo(Object[] arr_object, Object[] arr_object1, int v, Function1 function10) {
        int v2 = 0;
        for(int v1 = 0; v1 < arr_object.length; ++v1) {
            if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                arr_object1[v + v2] = arr_object[v1];
                ++v2;
            }
        }
        return v2;
    }

    static int filterTo$default(Object[] arr_object, Object[] arr_object1, int v, Function1 function10, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0;
        }
        if((v1 & 4) != 0) {
            function10 = androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1.INSTANCE;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < arr_object.length; ++v2) {
            if(((Boolean)function10.invoke(arr_object[v2])).booleanValue()) {
                arr_object1[v + v3] = arr_object[v2];
                ++v3;
            }
        }
        return v3;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0000\u0010\u0003\u001A\u00020\u00022\b\u0010\u0001\u001A\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1 extends Lambda implements Function1 {
            public static final androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1 INSTANCE;

            static {
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1.INSTANCE = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1();
            }

            public androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeKt.filterTo.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(object0));
            }

            public final boolean invoke(Object object0) {
                return object0 != TrieNode.Companion.getEMPTY$runtime_release();
            }
        }

    }

    public static final int indexSegment(int v, int v1) [...] // Inlined contents

    private static final Object[] removeCellAtIndex(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        ArraysKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt.copyInto(arr_object, arr_object1, v, v + 1, arr_object.length);
        return arr_object1;
    }
}

