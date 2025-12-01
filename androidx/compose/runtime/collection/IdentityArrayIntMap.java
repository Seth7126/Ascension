package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0019\u001A\u00020\u001A2\u0006\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u001C\u001A\u00020\fJ&\u0010\u001D\u001A\u00020\u001E2\u0018\u0010\u001F\u001A\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001E0 H\u0086\bø\u0001\u0000J\u0012\u0010!\u001A\u00020\f2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0001H\u0002J\"\u0010\"\u001A\u00020\f2\u0006\u0010#\u001A\u00020\f2\b\u0010\u001C\u001A\u0004\u0018\u00010\u00012\u0006\u0010$\u001A\u00020\fH\u0002J&\u0010%\u001A\u00020\u001A2\u0018\u0010&\u001A\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001A0 H\u0086\bø\u0001\u0000J\u0011\u0010\'\u001A\u00020\f2\u0006\u0010\u001B\u001A\u00020\u0001H\u0086\u0002J\u000E\u0010(\u001A\u00020\u001E2\u0006\u0010\u001B\u001A\u00020\u0001J&\u0010)\u001A\u00020\u001A2\u0018\u0010\u001F\u001A\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001E0 H\u0086\bø\u0001\u0000R.\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000@\u0000X\u0081\u000E¢\u0006\u0016\n\u0002\u0010\n\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000B\u001A\u00020\f8\u0000@\u0000X\u0081\u000E¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u0002\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001A\u00020\u00138\u0000@\u0000X\u0081\u000E¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006*"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", "()V", "keys", "", "getKeys$annotations", "getKeys", "()[Ljava/lang/Object;", "setKeys", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "", "getSize$annotations", "getSize", "()I", "setSize", "(I)V", "values", "", "getValues$annotations", "getValues", "()[I", "setValues", "([I)V", "add", "", "key", "value", "any", "", "predicate", "Lkotlin/Function2;", "find", "findExactIndex", "midIndex", "valueHash", "forEach", "block", "get", "remove", "removeValueIf", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IdentityArrayIntMap {
    private Object[] keys;
    private int size;
    private int[] values;

    public IdentityArrayIntMap() {
        this.keys = new Object[4];
        this.values = new int[4];
    }

    public final void add(Object object0, int v) {
        int v1;
        Intrinsics.checkNotNullParameter(object0, "key");
        if(this.size > 0) {
            v1 = this.find(object0);
            if(v1 >= 0) {
                this.values[v1] = v;
                return;
            }
        }
        else {
            v1 = -1;
        }
        int v2 = this.size;
        Object[] arr_object = this.keys;
        if(v2 == arr_object.length) {
            Object[] arr_object1 = new Object[arr_object.length * 2];
            int[] arr_v = new int[arr_object.length * 2];
            ArraysKt.copyInto(arr_object, arr_object1, -v1, -(v1 + 1), v2);
            ArraysKt.copyInto(this.values, arr_v, -v1, -(v1 + 1), this.size);
            ArraysKt.copyInto$default(this.keys, arr_object1, 0, 0, -(v1 + 1), 6, null);
            ArraysKt.copyInto$default(this.values, arr_v, 0, 0, -(v1 + 1), 6, null);
            this.keys = arr_object1;
            this.values = arr_v;
        }
        else {
            ArraysKt.copyInto(arr_object, arr_object, -v1, -(v1 + 1), v2);
            ArraysKt.copyInto(this.values, this.values, -v1, -(v1 + 1), this.size);
        }
        this.keys[-(v1 + 1)] = object0;
        this.values[-(v1 + 1)] = v;
        ++this.size;
    }

    public final boolean any(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = this.getSize();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = this.getKeys()[v1];
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                if(((Boolean)function20.invoke(object0, ((int)this.getValues()[v1]))).booleanValue()) {
                    return true;
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    private final int find(Object object0) {
        int v = this.size - 1;
        int v1 = ActualJvm_jvmKt.identityHashCode(object0);
        int v2 = 0;
        while(v2 <= v) {
            int v3 = v2 + v >>> 1;
            Object object1 = this.keys[v3];
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
                Object object1 = this.keys[v2];
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
        int v4 = this.size;
        if(v3 < v4) {
            while(true) {
                Object object2 = this.keys[v3];
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
        return -(this.size + 1);
    }

    public final void forEach(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        int v = this.getSize();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = this.getKeys()[v1];
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                function20.invoke(object0, ((int)this.getValues()[v1]));
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
    }

    public final int get(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        int v = this.find(object0);
        if(v < 0) {
            throw new IllegalStateException("Key not found");
        }
        return this.values[v];
    }

    public final Object[] getKeys() {
        return this.keys;
    }

    public static void getKeys$annotations() {
    }

    public final int getSize() {
        return this.size;
    }

    public static void getSize$annotations() {
    }

    public final int[] getValues() {
        return this.values;
    }

    public static void getValues$annotations() {
    }

    public final boolean remove(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        int v = this.find(object0);
        if(v >= 0) {
            int v1 = this.size;
            if(v < v1 - 1) {
                ArraysKt.copyInto(this.keys, this.keys, v, v + 1, v1);
                ArraysKt.copyInto(this.values, this.values, v, v + 1, this.size);
            }
            int v2 = this.size - 1;
            this.size = v2;
            this.keys[v2] = null;
            return true;
        }
        return false;
    }

    public final void removeValueIf(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "predicate");
        int v = this.getSize();
        int v1 = 0;
        if(v > 0) {
            int v2 = 0;
            while(true) {
                Object object0 = this.getKeys()[v1];
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Any");
                }
                int v3 = this.getValues()[v1];
                if(!((Boolean)function20.invoke(object0, v3)).booleanValue()) {
                    if(v2 != v1) {
                        this.getKeys()[v2] = object0;
                        this.getValues()[v2] = v3;
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
        int v4 = this.getSize();
        if(v1 < v4) {
            for(int v5 = v1; true; ++v5) {
                this.getKeys()[v5] = null;
                if(v5 + 1 >= v4) {
                    break;
                }
            }
        }
        this.setSize(v1);
    }

    public final void setKeys(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.keys = arr_object;
    }

    public final void setSize(int v) {
        this.size = v;
    }

    public final void setValues(int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<set-?>");
        this.values = arr_v;
    }
}

