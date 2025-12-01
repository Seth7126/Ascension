package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0002B\u0005\u00A2\u0006\u0002\u0010\u0003J\u001B\u0010\"\u001A\u00020#2\u0006\u0010$\u001A\u00020\u00022\u0006\u0010%\u001A\u00028\u0000\u00A2\u0006\u0002\u0010&J\u0006\u0010\'\u001A\u00020(J\u0011\u0010)\u001A\u00020#2\u0006\u0010*\u001A\u00020\u0002H\u0086\u0002J\u0012\u0010+\u001A\u00020\u000E2\b\u0010$\u001A\u0004\u0018\u00010\u0002H\u0002J\"\u0010,\u001A\u00020\u000E2\u0006\u0010-\u001A\u00020\u000E2\b\u0010$\u001A\u0004\u0018\u00010\u00022\u0006\u0010.\u001A\u00020\u000EH\u0002J7\u0010/\u001A\u00020(2\u0006\u0010$\u001A\u00020\u00022!\u00100\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020(01H\u0086\b\u00F8\u0001\u0000J\u0016\u00104\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010$\u001A\u00020\u0002H\u0002J\u001B\u00105\u001A\u00020#2\u0006\u0010$\u001A\u00020\u00022\u0006\u0010%\u001A\u00028\u0000\u00A2\u0006\u0002\u0010&J/\u00106\u001A\u00020(2!\u00107\u001A\u001D\u0012\u0013\u0012\u00118\u0000\u00A2\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020#01H\u0086\b\u00F8\u0001\u0000J\u0016\u00108\u001A\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u00109\u001A\u00020\u000EH\u0002J\u0011\u0010:\u001A\u00020\u00022\u0006\u00109\u001A\u00020\u000EH\u0082\bR4\u0010\u0004\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00060\u00058\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0016\n\u0002\u0010\f\u0012\u0004\b\u0007\u0010\u0003\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR$\u0010\r\u001A\u00020\u000E8\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\b\u000F\u0010\u0003\u001A\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001A\u00020\u00158\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0003\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR.\u0010\u001B\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00058\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0016\n\u0002\u0010!\u0012\u0004\b\u001C\u0010\u0003\u001A\u0004\b\u001D\u0010\u001E\"\u0004\b\u001F\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006;"}, d2 = {"Landroidx/compose/runtime/collection/IdentityScopeMap;", "T", "", "()V", "scopeSets", "", "Landroidx/compose/runtime/collection/IdentityArraySet;", "getScopeSets$annotations", "getScopeSets", "()[Landroidx/compose/runtime/collection/IdentityArraySet;", "setScopeSets", "([Landroidx/compose/runtime/collection/IdentityArraySet;)V", "[Landroidx/compose/runtime/collection/IdentityArraySet;", "size", "", "getSize$annotations", "getSize", "()I", "setSize", "(I)V", "valueOrder", "", "getValueOrder$annotations", "getValueOrder", "()[I", "setValueOrder", "([I)V", "values", "getValues$annotations", "getValues", "()[Ljava/lang/Object;", "setValues", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "add", "", "value", "scope", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "", "contains", "element", "find", "findExactIndex", "midIndex", "valueHash", "forEachScopeOf", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "getOrCreateIdentitySet", "remove", "removeValueIf", "predicate", "scopeSetAt", "index", "valueAt", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class IdentityScopeMap {
    private IdentityArraySet[] scopeSets;
    private int size;
    private int[] valueOrder;
    private Object[] values;

    public IdentityScopeMap() {
        int[] arr_v = new int[50];
        for(int v = 0; v < 50; ++v) {
            arr_v[v] = v;
        }
        this.valueOrder = arr_v;
        this.values = new Object[50];
        this.scopeSets = new IdentityArraySet[50];
    }

    public final boolean add(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(object0, "value");
        Intrinsics.checkNotNullParameter(object1, "scope");
        return this.getOrCreateIdentitySet(object0).add(object1);
    }

    public final void clear() {
        int v = this.scopeSets.length;
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                IdentityArraySet identityArraySet0 = this.scopeSets[v1];
                if(identityArraySet0 != null) {
                    identityArraySet0.clear();
                }
                this.valueOrder[v1] = v1;
                this.values[v1] = null;
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        this.size = 0;
    }

    public final boolean contains(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "element");
        return this.find(object0) >= 0;
    }

    private final int find(Object object0) {
        int v = ActualJvm_jvmKt.identityHashCode(object0);
        int v1 = this.size - 1;
        int v2 = 0;
        while(v2 <= v1) {
            int v3 = v2 + v1 >>> 1;
            Object object1 = this.getValues()[this.getValueOrder()[v3]];
            Intrinsics.checkNotNull(object1);
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
                Object object1 = this.getValues()[this.getValueOrder()[v2]];
                Intrinsics.checkNotNull(object1);
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
                Object object2 = this.getValues()[this.getValueOrder()[v3]];
                Intrinsics.checkNotNull(object2);
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

    public final void forEachScopeOf(Object object0, Function1 function10) {
        Intrinsics.checkNotNullParameter(object0, "value");
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = this.find(object0);
        if(v >= 0) {
            for(Object object1: this.scopeSetAt(v)) {
                function10.invoke(object1);
            }
        }
    }

    private final IdentityArraySet getOrCreateIdentitySet(Object object0) {
        int v;
        if(this.size > 0) {
            v = this.find(object0);
            if(v >= 0) {
                return this.scopeSetAt(v);
            }
        }
        else {
            v = -1;
        }
        int v1 = this.size;
        int[] arr_v = this.valueOrder;
        if(v1 < arr_v.length) {
            int v2 = arr_v[v1];
            this.values[v2] = object0;
            IdentityArraySet identityArraySet0 = this.scopeSets[v2];
            if(identityArraySet0 == null) {
                identityArraySet0 = new IdentityArraySet();
                this.getScopeSets()[v2] = identityArraySet0;
            }
            int v3 = this.size;
            if(-(v + 1) < v3) {
                ArraysKt.copyInto(this.valueOrder, this.valueOrder, -v, -(v + 1), v3);
            }
            this.valueOrder[-(v + 1)] = v2;
            ++this.size;
            return identityArraySet0;
        }
        int v4 = arr_v.length * 2;
        Object[] arr_object = Arrays.copyOf(this.scopeSets, v4);
        Intrinsics.checkNotNullExpressionValue(arr_object, "java.util.Arrays.copyOf(this, newSize)");
        this.scopeSets = (IdentityArraySet[])arr_object;
        IdentityArraySet identityArraySet1 = new IdentityArraySet();
        this.scopeSets[v1] = identityArraySet1;
        Object[] arr_object1 = Arrays.copyOf(this.values, v4);
        Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
        this.values = arr_object1;
        arr_object1[v1] = object0;
        int[] arr_v1 = new int[v4];
        int v5 = this.size + 1;
        if(v5 < v4) {
            while(true) {
                arr_v1[v5] = v5;
                if(v5 + 1 >= v4) {
                    break;
                }
                ++v5;
            }
        }
        int v6 = this.size;
        if(-(v + 1) < v6) {
            ArraysKt.copyInto(this.valueOrder, arr_v1, -v, -(v + 1), v6);
        }
        arr_v1[-(v + 1)] = v1;
        if(-(v + 1) > 0) {
            ArraysKt.copyInto$default(this.valueOrder, arr_v1, 0, 0, -(v + 1), 6, null);
        }
        this.valueOrder = arr_v1;
        ++this.size;
        return identityArraySet1;
    }

    public final IdentityArraySet[] getScopeSets() {
        return this.scopeSets;
    }

    public static void getScopeSets$annotations() {
    }

    public final int getSize() {
        return this.size;
    }

    public static void getSize$annotations() {
    }

    public final int[] getValueOrder() {
        return this.valueOrder;
    }

    public static void getValueOrder$annotations() {
    }

    public final Object[] getValues() {
        return this.values;
    }

    public static void getValues$annotations() {
    }

    public final boolean remove(Object object0, Object object1) {
        Intrinsics.checkNotNullParameter(object0, "value");
        Intrinsics.checkNotNullParameter(object1, "scope");
        int v = this.find(object0);
        if(v >= 0) {
            int v1 = this.valueOrder[v];
            IdentityArraySet identityArraySet0 = this.scopeSets[v1];
            if(identityArraySet0 == null) {
                return false;
            }
            boolean z = identityArraySet0.remove(object1);
            if(identityArraySet0.size() == 0) {
                int v2 = this.size;
                if(v + 1 < v2) {
                    ArraysKt.copyInto(this.valueOrder, this.valueOrder, v, v + 1, v2);
                }
                int v3 = this.size;
                this.valueOrder[v3 - 1] = v1;
                this.values[v1] = null;
                this.size = v3 - 1;
            }
            return z;
        }
        return false;
    }

    public final void removeValueIf(Function1 function10) {
        int v7;
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        int v1 = 0;
        if(v > 0) {
            int v2 = 0;
            int v3 = 0;
            while(true) {
                int v4 = this.getValueOrder()[v2];
                IdentityArraySet identityArraySet0 = this.getScopeSets()[v4];
                Intrinsics.checkNotNull(identityArraySet0);
                int v5 = identityArraySet0.size();
                if(v5 > 0) {
                    int v6 = 0;
                    v7 = 0;
                    Object object0;
                    while((object0 = identityArraySet0.getValues()[v6]) != null) {
                        if(!((Boolean)function10.invoke(object0)).booleanValue()) {
                            if(v7 != v6) {
                                identityArraySet0.getValues()[v7] = object0;
                            }
                            ++v7;
                        }
                        if(v6 + 1 >= v5) {
                            goto label_24;
                        }
                        ++v6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                }
                else {
                    v7 = 0;
                }
            label_24:
                int v8 = identityArraySet0.size();
                if(v7 < v8) {
                    for(int v9 = v7; true; ++v9) {
                        identityArraySet0.getValues()[v9] = null;
                        if(v9 + 1 >= v8) {
                            break;
                        }
                    }
                }
                identityArraySet0.setSize(v7);
                if(identityArraySet0.size() > 0) {
                    if(v3 != v2) {
                        int v10 = this.getValueOrder()[v3];
                        this.getValueOrder()[v3] = v4;
                        this.getValueOrder()[v2] = v10;
                    }
                    ++v3;
                }
                if(v2 + 1 >= v) {
                    v1 = v3;
                    break;
                }
                ++v2;
            }
        }
        int v11 = this.getSize();
        if(v1 < v11) {
            for(int v12 = v1; true; ++v12) {
                this.getValues()[this.getValueOrder()[v12]] = null;
                if(v12 + 1 >= v11) {
                    break;
                }
            }
        }
        this.setSize(v1);
    }

    private final IdentityArraySet scopeSetAt(int v) {
        IdentityArraySet identityArraySet0 = this.scopeSets[this.valueOrder[v]];
        Intrinsics.checkNotNull(identityArraySet0);
        return identityArraySet0;
    }

    public final void setScopeSets(IdentityArraySet[] arr_identityArraySet) {
        Intrinsics.checkNotNullParameter(arr_identityArraySet, "<set-?>");
        this.scopeSets = arr_identityArraySet;
    }

    public final void setSize(int v) {
        this.size = v;
    }

    public final void setValueOrder(int[] arr_v) {
        Intrinsics.checkNotNullParameter(arr_v, "<set-?>");
        this.valueOrder = arr_v;
    }

    public final void setValues(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.values = arr_object;
    }

    private final Object valueAt(int v) {
        Object object0 = this.getValues()[this.getValueOrder()[v]];
        Intrinsics.checkNotNull(object0);
        return object0;
    }
}

