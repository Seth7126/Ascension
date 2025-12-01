package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u000E\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\n\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\fH\u0002J\u0010\u0010\r\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u000B\u001A\u00020\fJ\u0018\u0010\u000E\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001J\u0018\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u000B\u001A\u00020\f2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "size", "", "keys", "", "values", "", "(I[J[Ljava/lang/Object;)V", "[Ljava/lang/Object;", "find", "key", "", "get", "newWith", "value", "trySet", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ThreadMap {
    private final long[] keys;
    private final int size;
    private final Object[] values;

    public ThreadMap(int v, long[] arr_v, Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_v, "keys");
        Intrinsics.checkNotNullParameter(arr_object, "values");
        super();
        this.size = v;
        this.keys = arr_v;
        this.values = arr_object;
    }

    private final int find(long v) {
        int v1 = 0;
        int v2 = this.size - 1;
        switch(v2) {
            case -1: {
                return -1;
            }
            case 0: {
                long v5 = this.keys[0];
                if(v5 == v) {
                    return 0;
                }
                return v5 <= v ? -1 : -2;
            }
            default: {
                while(v1 <= v2) {
                    int v3 = v1 + v2 >>> 1;
                    int v4 = Long.compare(this.keys[v3] - v, 0L);
                    if(v4 < 0) {
                        v1 = v3 + 1;
                        continue;
                    }
                    if(v4 > 0) {
                        v2 = v3 - 1;
                        continue;
                    }
                    return v3;
                }
                return -(v1 + 1);
            }
        }
    }

    public final Object get(long v) {
        int v1 = this.find(v);
        return v1 < 0 ? null : this.values[v1];
    }

    public final ThreadMap newWith(long v, Object object0) {
        int v1 = this.size;
        Object[] arr_object = this.values;
        int v2 = 0;
        int v4 = 0;
        for(int v3 = 0; v3 < arr_object.length; ++v3) {
            if(arr_object[v3] != null) {
                ++v4;
            }
        }
        long[] arr_v = new long[v4 + 1];
        Object[] arr_object1 = new Object[v4 + 1];
        if(v4 + 1 > 1) {
            int v5;
            for(v5 = 0; v2 < v4 + 1 && v5 < v1; ++v5) {
                long v6 = this.keys[v5];
                Object object1 = this.values[v5];
                if(v6 > v) {
                    arr_v[v2] = v;
                    arr_object1[v2] = object0;
                    ++v2;
                    break;
                }
                if(object1 != null) {
                    arr_v[v2] = v6;
                    arr_object1[v2] = object1;
                    ++v2;
                }
            }
            if(v5 == v1) {
                arr_v[v4] = v;
                arr_object1[v4] = object0;
                return new ThreadMap(v4 + 1, arr_v, arr_object1);
            }
            while(v2 < v4 + 1) {
                long v7 = this.keys[v5];
                Object object2 = this.values[v5];
                if(object2 != null) {
                    arr_v[v2] = v7;
                    arr_object1[v2] = object2;
                    ++v2;
                }
                ++v5;
            }
            return new ThreadMap(v4 + 1, arr_v, arr_object1);
        }
        arr_v[0] = v;
        arr_object1[0] = object0;
        return new ThreadMap(v4 + 1, arr_v, arr_object1);
    }

    public final boolean trySet(long v, Object object0) {
        int v1 = this.find(v);
        if(v1 < 0) {
            return false;
        }
        this.values[v1] = object0;
        return true;
    }
}

