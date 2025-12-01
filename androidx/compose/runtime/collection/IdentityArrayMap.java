package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\u0004\b\u0001\u0010\u00032\u00020\u0002B\u000F\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0006J\u0016\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0002\u0010\u0018J\u0012\u0010\u0019\u001A\u00020\u00052\b\u0010\u0017\u001A\u0004\u0018\u00010\u0002H\u0002J\"\u0010\u001A\u001A\u00020\u00052\u0006\u0010\u001B\u001A\u00020\u00052\b\u0010\u0017\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u001C\u001A\u00020\u0005H\u0002JD\u0010\u001D\u001A\u00020\u001E26\u0010\u001F\u001A2\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0017\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u001E0 H\u0086\b\u00F8\u0001\u0000J\u0018\u0010$\u001A\u0004\u0018\u00018\u00012\u0006\u0010\u0017\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0002\u0010%J\u0006\u0010&\u001A\u00020\u0016J\u0006\u0010\'\u001A\u00020\u0016J\u0013\u0010(\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00028\u0000\u00A2\u0006\u0002\u0010\u0018J/\u0010)\u001A\u00020\u001E2!\u0010\u001F\u001A\u001D\u0012\u0013\u0012\u00118\u0001\u00A2\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00160*H\u0086\b\u00F8\u0001\u0000J\u001E\u0010+\u001A\u00020\u001E2\u0006\u0010\u0017\u001A\u00028\u00002\u0006\u0010#\u001A\u00028\u0001H\u0086\u0002\u00A2\u0006\u0002\u0010,R$\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bX\u0080\u000E\u00A2\u0006\u0010\n\u0002\u0010\r\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001A\u0010\u000E\u001A\u00020\u0005X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0006R$\u0010\u0012\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\bX\u0080\u000E\u00A2\u0006\u0010\n\u0002\u0010\r\u001A\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006-"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "Key", "", "Value", "capacity", "", "(I)V", "keys", "", "getKeys$runtime_release", "()[Ljava/lang/Object;", "setKeys$runtime_release", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "getSize$runtime_release", "()I", "setSize$runtime_release", "values", "getValues$runtime_release", "setValues$runtime_release", "contains", "", "key", "(Ljava/lang/Object;)Z", "find", "findExactIndex", "midIndex", "keyHash", "forEach", "", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "isNotEmpty", "remove", "removeValueIf", "Lkotlin/Function1;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IdentityArrayMap {
    private Object[] keys;
    private int size;
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public IdentityArrayMap(int v) {
        this.keys = new Object[v];
        this.values = new Object[v];
    }

    public IdentityArrayMap(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            v = 16;
        }
        this(v);
    }

    public final boolean contains(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        return this.find(object0) >= 0;
    }

    private final int find(Object object0) {
        int v = ActualJvm_jvmKt.identityHashCode(object0);
        int v1 = this.size - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            Object object1 = this.keys[v3];
            int v4 = ActualJvm_jvmKt.identityHashCode(object1) - v;
            if(v4 < 0) {
                v2 = v3 + 1;
                continue;
            }
            if(v4 > 0) {
                v1 = v3 - 1;
                continue;
            }
            return object0 == object1 ? v3 : this.findExactIndex(v3, object0, v);
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
        int v = this.getSize$runtime_release();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = this.getKeys$runtime_release()[v1];
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
                }
                function20.invoke(object0, this.getValues$runtime_release()[v1]);
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
    }

    public final Object get(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        int v = this.find(object0);
        return v < 0 ? null : this.values[v];
    }

    public final Object[] getKeys$runtime_release() {
        return this.keys;
    }

    public final int getSize$runtime_release() {
        return this.size;
    }

    public final Object[] getValues$runtime_release() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    public final boolean remove(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "key");
        int v = this.find(object0);
        if(v >= 0) {
            int v1 = this.size;
            Object[] arr_object = this.keys;
            Object[] arr_object1 = this.values;
            ArraysKt.copyInto(arr_object, arr_object, v, v + 1, v1);
            ArraysKt.copyInto(arr_object1, arr_object1, v, v + 1, v1);
            arr_object[v1] = null;
            arr_object1[v1] = null;
            this.size = v1 - 1;
            return true;
        }
        return false;
    }

    public final void removeValueIf(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = this.getSize$runtime_release();
        int v1 = 0;
        if(v > 0) {
            int v2 = 0;
            while(true) {
                Object object0 = this.getValues$runtime_release()[v1];
                if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                    if(v2 != v1) {
                        this.getKeys$runtime_release()[v2] = this.getKeys$runtime_release()[v1];
                        this.getValues$runtime_release()[v2] = object0;
                    }
                    ++v2;
                }
                if(v1 + 1 >= v) {
                    break;
                }
                ++v1;
            }
            v1 = v2;
        }
        if(this.getSize$runtime_release() > v1) {
            int v3 = this.getSize$runtime_release();
            if(v1 < v3) {
                for(int v4 = v1; true; ++v4) {
                    this.getKeys$runtime_release()[v4] = null;
                    this.getValues$runtime_release()[v4] = null;
                    if(v4 + 1 >= v3) {
                        break;
                    }
                }
            }
            this.setSize$runtime_release(v1);
        }
    }

    public final void set(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(object0, "key");
        int v = this.find(object0);
        if(v >= 0) {
            this.values[v] = object1;
            return;
        }
        int v1 = this.size;
        Object[] arr_object = this.keys;
        boolean z = v1 == arr_object.length;
        Object[] arr_object1 = z ? new Object[v1 * 2] : arr_object;
        ArraysKt.copyInto(arr_object, arr_object1, -v, -(v + 1), v1);
        if(z) {
            ArraysKt.copyInto$default(this.keys, arr_object1, 0, 0, -(v + 1), 6, null);
        }
        arr_object1[-(v + 1)] = object0;
        this.keys = arr_object1;
        Object[] arr_object2 = z ? new Object[this.size * 2] : this.values;
        ArraysKt.copyInto(this.values, arr_object2, -v, -(v + 1), this.size);
        if(z) {
            ArraysKt.copyInto$default(this.values, arr_object2, 0, 0, -(v + 1), 6, null);
        }
        arr_object2[-(v + 1)] = object1;
        this.values = arr_object2;
        ++this.size;
    }

    public final void setKeys$runtime_release(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.keys = arr_object;
    }

    public final void setSize$runtime_release(int v) {
        this.size = v;
    }

    public final void setValues$runtime_release(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.values = arr_object;
    }
}

