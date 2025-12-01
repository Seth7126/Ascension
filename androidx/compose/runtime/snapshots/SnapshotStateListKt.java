package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001A\b\u0010\u0000\u001A\u00020\u0001H\u0002\u001A\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"modificationError", "", "validateRange", "", "index", "", "size", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotStateListKt {
    // 去混淆评级： 低(20)
    private static final Void modificationError() {
        throw new IllegalStateException("Cannot modify a state list through an iterator");
    }

    private static final void validateRange(int v, int v1) {
        if(v < 0 || v >= v1) {
            throw new IndexOutOfBoundsException("index (" + v + ") is out of bound of [0, " + v1 + ')');
        }
    }
}

