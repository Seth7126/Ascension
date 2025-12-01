package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0002\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0001H\u0000¨\u0006\u0007"}, d2 = {"lowestBitOf", "", "bits", "", "binarySearch", "", "value", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotIdSetKt {
    public static final int binarySearch(int[] arr_v, int v) {
        Intrinsics.checkNotNullParameter(arr_v, "<this>");
        int v1 = arr_v.length - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            int v4 = arr_v[v3];
            if(v > v4) {
                v2 = v3 + 1;
                continue;
            }
            if(v < v4) {
                v1 = v3 - 1;
                continue;
            }
            return v3;
        }
        return -(v2 + 1);
    }

    private static final int lowestBitOf(long v) {
        int v1;
        if((0xFFFFFFFFL & v) == 0L) {
            v1 = 0x20;
            v >>= 0x20;
        }
        else {
            v1 = 0;
        }
        if((0xFFFFL & v) == 0L) {
            v1 += 16;
            v >>= 16;
        }
        if((0xFFL & v) == 0L) {
            v1 += 8;
            v >>= 8;
        }
        if((15L & v) == 0L) {
            v1 += 4;
            v >>= 4;
        }
        if((1L & v) != 0L) {
            return v1;
        }
        if((2L & v) != 0L) {
            return v1 + 1;
        }
        if((4L & v) != 0L) {
            return v1 + 2;
        }
        return (v & 8L) == 0L ? -1 : v1 + 3;
    }
}

