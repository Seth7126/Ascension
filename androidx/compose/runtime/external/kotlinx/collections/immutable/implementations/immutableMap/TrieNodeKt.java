package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0018\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\u0001H\u0000\u001AE\u0010\t\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n2\u0006\u0010\u000E\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u0002H\f2\u0006\u0010\u0010\u001A\u0002H\rH\u0002¢\u0006\u0002\u0010\u0011\u001A)\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n2\u0006\u0010\u000E\u001A\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0013\u001A)\u0010\u0014\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n2\u0006\u0010\u0015\u001A\u00020\u0001H\u0002¢\u0006\u0002\u0010\u0013\u001AA\u0010\u0016\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n2\u0006\u0010\u000E\u001A\u00020\u00012\u0006\u0010\u0015\u001A\u00020\u00012\u000E\u0010\u0017\u001A\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0002\u0010\u0019\u001AM\u0010\u001A\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\r*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\n2\u0006\u0010\u0015\u001A\u00020\u00012\u0006\u0010\u000E\u001A\u00020\u00012\u0006\u0010\u000F\u001A\u0002H\f2\u0006\u0010\u0010\u001A\u0002H\rH\u0002¢\u0006\u0002\u0010\u001B\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001C"}, d2 = {"ENTRY_SIZE", "", "LOG_MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR", "MAX_BRANCHING_FACTOR_MINUS_ONE", "MAX_SHIFT", "indexSegment", "index", "shift", "insertEntryAtIndex", "", "", "K", "V", "keyIndex", "key", "value", "([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "removeEntryAtIndex", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "removeNodeAtIndex", "nodeIndex", "replaceEntryWithNode", "newNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "([Ljava/lang/Object;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)[Ljava/lang/Object;", "replaceNodeWithEntry", "([Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TrieNodeKt {
    public static final int ENTRY_SIZE = 2;
    public static final int LOG_MAX_BRANCHING_FACTOR = 5;
    public static final int MAX_BRANCHING_FACTOR = 0x20;
    public static final int MAX_BRANCHING_FACTOR_MINUS_ONE = 0x1F;
    public static final int MAX_SHIFT = 30;

    public static final int indexSegment(int v, int v1) [...] // Inlined contents

    private static final Object[] insertEntryAtIndex(Object[] arr_object, int v, Object object0, Object object1) {
        Object[] arr_object1 = new Object[arr_object.length + 2];
        ArraysKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt.copyInto(arr_object, arr_object1, v + 2, v, arr_object.length);
        arr_object1[v] = object0;
        arr_object1[v + 1] = object1;
        return arr_object1;
    }

    private static final Object[] removeEntryAtIndex(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[arr_object.length - 2];
        ArraysKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt.copyInto(arr_object, arr_object1, v, v + 2, arr_object.length);
        return arr_object1;
    }

    private static final Object[] removeNodeAtIndex(Object[] arr_object, int v) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        ArraysKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt.copyInto(arr_object, arr_object1, v, v + 1, arr_object.length);
        return arr_object1;
    }

    private static final Object[] replaceEntryWithNode(Object[] arr_object, int v, int v1, TrieNode trieNode0) {
        Object[] arr_object1 = new Object[arr_object.length - 1];
        ArraysKt.copyInto$default(arr_object, arr_object1, 0, 0, v, 6, null);
        ArraysKt.copyInto(arr_object, arr_object1, v, v + 2, v1);
        arr_object1[v1 - 2] = trieNode0;
        ArraysKt.copyInto(arr_object, arr_object1, v1 - 1, v1, arr_object.length);
        return arr_object1;
    }

    private static final Object[] replaceNodeWithEntry(Object[] arr_object, int v, int v1, Object object0, Object object1) {
        Object[] arr_object1 = Arrays.copyOf(arr_object, arr_object.length + 1);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
        ArraysKt.copyInto(arr_object1, arr_object1, v + 2, v + 1, arr_object.length);
        ArraysKt.copyInto(arr_object1, arr_object1, v1 + 2, v1, v);
        arr_object1[v1] = object0;
        arr_object1[v1 + 1] = object1;
        return arr_object1;
    }
}

