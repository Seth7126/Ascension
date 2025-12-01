package androidx.compose.ui.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u001F\n\u0002\b\u0003\n\u0002\u0010\u000F\n\u0002\b\u0003\u001A;\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001A;\u0010\u0006\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001AB\u0010\u0007\u001A\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u0010\b\u001A;\u0010\t\u001A\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001AA\u0010\f\u001A\u00020\n\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\n0\rH\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001AG\u0010\u000F\u001A\b\u0012\u0004\u0012\u0002H\u00100\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001A`\u0010\u0012\u001A\u0002H\u0013\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0010\"\u0010\b\u0002\u0010\u0013*\n\u0012\u0006\b\u0000\u0012\u0002H\u00100\u0014*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0015\u001A\u0002H\u00132\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0002\u0010\u0016\u001AR\u0010\u0017\u001A\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002\"\u000E\b\u0001\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u0018*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00100\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u0010\b\u001A;\u0010\u001A\u001A\u00020\u000E\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0019\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u000E0\u0005H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006\u001B"}, d2 = {"fastAll", "", "T", "", "predicate", "Lkotlin/Function1;", "fastAny", "fastFirstOrNull", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "fastForEach", "", "action", "fastForEachIndexed", "Lkotlin/Function2;", "", "fastMap", "R", "transform", "fastMapTo", "C", "", "destination", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastMaxBy", "", "selector", "fastSumBy", "ui-util_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ListUtilsKt {
    public static final boolean fastAll(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(!((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                    return false;
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return true;
    }

    public static final boolean fastAny(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(((Boolean)function10.invoke(list0.get(v1))).booleanValue()) {
                    return true;
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return false;
    }

    public static final Object fastFirstOrNull(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = list0.get(v1);
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return null;
    }

    public static final void fastForEach(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                function10.invoke(list0.get(v1));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    public static final void fastForEachIndexed(List list0, Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "action");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                function20.invoke(v1, list0.get(v1));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    public static final List fastMap(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                arrayList0.add(function10.invoke(list0.get(v1)));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public static final Collection fastMapTo(List list0, Collection collection0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                collection0.add(function10.invoke(list0.get(v1)));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return collection0;
    }

    public static final Object fastMaxBy(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        if(list0.isEmpty()) {
            return null;
        }
        Object object0 = list0.get(0);
        Comparable comparable0 = (Comparable)function10.invoke(object0);
        int v = CollectionsKt.getLastIndex(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                Object object1 = list0.get(v1);
                Comparable comparable1 = (Comparable)function10.invoke(object1);
                if(comparable0.compareTo(comparable1) < 0) {
                    object0 = object1;
                    comparable0 = comparable1;
                }
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    public static final int fastSumBy(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v = list0.size();
        if(v - 1 >= 0) {
            int v2 = 0;
            for(int v1 = 0; true; ++v1) {
                v2 += ((Number)function10.invoke(list0.get(v1))).intValue();
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
            return v2;
        }
        return 0;
    }
}

