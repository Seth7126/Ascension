package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0012\n\u0002\u0010\u001C\n\u0002\b\u0007\u001A\u0010\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0001H\u0002\u001A\u0014\u0010\u0014\u001A\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u0014\u0010\u0018\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u0014\u0010\u0019\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u001C\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00010\u001B*\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u0001H\u0002\u001A;\u0010\u001D\u001A\u00020\u001E*\u0012\u0012\u0004\u0012\u00020\u001E0\u001Fj\b\u0012\u0004\u0012\u00020\u001E` 2\u0006\u0010!\u001A\u00020\u00012\u0006\u0010\"\u001A\u00020\u00012\f\u0010#\u001A\b\u0012\u0004\u0012\u00020\u001E0$H\u0082\b\u001A\u0014\u0010%\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u0014\u0010&\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u001C\u0010\'\u001A\b\u0012\u0004\u0012\u00020\u00010\u001B*\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u0001H\u0002\u001A\u0014\u0010(\u001A\u00020)*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u0014\u0010*\u001A\u00020)*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001AD\u0010+\u001A\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00012\u0006\u0010,\u001A\u00020\u00012\u0006\u0010-\u001A\u00020)2\u0006\u0010.\u001A\u00020)2\u0006\u0010/\u001A\u00020)2\u0006\u00100\u001A\u00020\u00012\u0006\u0010\u0019\u001A\u00020\u0001H\u0002\u001A\u0014\u0010-\u001A\u00020)*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u0014\u0010,\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u001C\u00101\u001A\b\u0012\u0004\u0012\u00020\u00010\u001B*\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u0001H\u0002\u001A,\u00102\u001A\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001E0\u001Fj\b\u0012\u0004\u0012\u00020\u001E` 2\u0006\u0010!\u001A\u00020\u00012\u0006\u0010\"\u001A\u00020\u0001H\u0002\u001A\u0014\u00103\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u001C\u00104\u001A\b\u0012\u0004\u0012\u00020\u00010\u001B*\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u0001H\u0002\u001A\u0014\u00105\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u0014\u00106\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u0014\u00100\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u001C\u00107\u001A\b\u0012\u0004\u0012\u00020\u00010\u001B*\u00020\u00162\b\b\u0002\u0010\u001C\u001A\u00020\u0001H\u0002\u001A,\u00108\u001A\u00020\u0001*\u0012\u0012\u0004\u0012\u00020\u001E0\u001Fj\b\u0012\u0004\u0012\u00020\u001E` 2\u0006\u00109\u001A\u00020\u00012\u0006\u0010\"\u001A\u00020\u0001H\u0002\u001A \u0010:\u001A\b\u0012\u0004\u0012\u00020\u00010\u001B*\u00020\u00162\f\u0010;\u001A\b\u0012\u0004\u0012\u00020\u00010<H\u0002\u001A\u0014\u0010=\u001A\u00020\u0001*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0001H\u0002\u001A\u001C\u0010>\u001A\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00012\u0006\u0010?\u001A\u00020\u0001H\u0002\u001A\u001C\u0010@\u001A\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0001H\u0002\u001A\u001C\u0010A\u001A\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0001H\u0002\u001A\u001C\u0010B\u001A\u00020\u0015*\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0001H\u0002\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0006\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0007\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\b\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\t\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\n\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000B\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\f\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\r\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000E\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u000F\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0010\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0011\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\u00A8\u0006C"}, d2 = {"Aux_Mask", "", "Aux_Shift", "DataAnchor_Offset", "GroupInfo_Offset", "Group_Fields_Size", "Key_Offset", "MinGroupGrowthSize", "MinSlotsGrowthSize", "NodeBit_Mask", "NodeCount_Mask", "NodeKey", "ObjectKey_Mask", "ObjectKey_Shift", "ParentAnchor_Offset", "Size_Offset", "Slots_Shift", "parentAnchorPivot", "countOneBits", "value", "addAux", "", "", "address", "auxIndex", "dataAnchor", "dataAnchors", "", "len", "getOrAdd", "Landroidx/compose/runtime/Anchor;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "index", "effectiveSize", "block", "Lkotlin/Function0;", "groupInfo", "groupSize", "groupSizes", "hasAux", "", "hasObjectKey", "initGroup", "key", "isNode", "hasDataKey", "hasData", "parentAnchor", "keys", "locationOf", "nodeCount", "nodeCounts", "nodeIndex", "objectKeyIndex", "parentAnchors", "search", "location", "slice", "indices", "", "slotAnchor", "updateDataAnchor", "anchor", "updateGroupSize", "updateNodeCount", "updateParentAnchor", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SlotTableKt {
    private static final int Aux_Mask = 0x10000000;
    private static final int Aux_Shift = 28;
    private static final int DataAnchor_Offset = 4;
    private static final int GroupInfo_Offset = 1;
    private static final int Group_Fields_Size = 5;
    private static final int Key_Offset = 0;
    private static final int MinGroupGrowthSize = 0x20;
    private static final int MinSlotsGrowthSize = 0x20;
    private static final int NodeBit_Mask = 0x40000000;
    private static final int NodeCount_Mask = 0x7FFFFFF;
    private static final int NodeKey = 0x7D;
    private static final int ObjectKey_Mask = 0x20000000;
    private static final int ObjectKey_Shift = 29;
    private static final int ParentAnchor_Offset = 2;
    private static final int Size_Offset = 3;
    private static final int Slots_Shift = 28;
    private static final int parentAnchorPivot = -2;

    private static final void addAux(int[] arr_v, int v) {
        int v1 = v * 5 + 1;
        arr_v[v1] |= 0x10000000;
    }

    private static final int auxIndex(int[] arr_v, int v) {
        return v * 5 < arr_v.length ? SlotTableKt.countOneBits(arr_v[v * 5 + 1] >> 29) + arr_v[v * 5 + 4] : arr_v.length;
    }

    private static final int countOneBits(int v) {
        switch(v) {
            case 0: {
                return 0;
            }
            case 1: 
            case 2: 
            case 4: {
                return 1;
            }
            case 3: 
            case 5: 
            case 6: {
                return 2;
            }
            default: {
                return 3;
            }
        }
    }

    private static final int dataAnchor(int[] arr_v, int v) {
        return arr_v[v * 5 + 4];
    }

    private static final List dataAnchors(int[] arr_v, int v) {
        return SlotTableKt.slice(arr_v, RangesKt.step(RangesKt.until(4, v), 5));
    }

    static List dataAnchors$default(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.dataAnchors(arr_v, v);
    }

    private static final Anchor getOrAdd(ArrayList arrayList0, int v, int v1, Function0 function00) {
        int v2 = SlotTableKt.search(arrayList0, v, v1);
        if(v2 < 0) {
            Anchor anchor0 = (Anchor)function00.invoke();
            arrayList0.add(-(v2 + 1), anchor0);
            return anchor0;
        }
        Object object0 = arrayList0.get(v2);
        Intrinsics.checkNotNullExpressionValue(object0, "get(location)");
        return (Anchor)object0;
    }

    private static final int groupInfo(int[] arr_v, int v) {
        return arr_v[v * 5 + 1];
    }

    private static final int groupSize(int[] arr_v, int v) {
        return arr_v[v * 5 + 3];
    }

    private static final List groupSizes(int[] arr_v, int v) {
        return SlotTableKt.slice(arr_v, RangesKt.step(RangesKt.until(3, v), 5));
    }

    static List groupSizes$default(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.groupSizes(arr_v, v);
    }

    private static final boolean hasAux(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x10000000) != 0;
    }

    private static final boolean hasObjectKey(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x20000000) != 0;
    }

    private static final void initGroup(int[] arr_v, int v, int v1, boolean z, boolean z1, boolean z2, int v2, int v3) {
        arr_v[v * 5] = v1;
        arr_v[v * 5 + 1] = (z ? 0x40000000 : 0) | (z1 ? 0x20000000 : 0) | (z2 ? 0x10000000 : 0);
        arr_v[v * 5 + 2] = v2;
        arr_v[v * 5 + 3] = 0;
        arr_v[v * 5 + 4] = v3;
    }

    private static final boolean isNode(int[] arr_v, int v) {
        return (arr_v[v * 5 + 1] & 0x40000000) != 0;
    }

    private static final int key(int[] arr_v, int v) {
        return arr_v[v * 5];
    }

    private static final List keys(int[] arr_v, int v) {
        return SlotTableKt.slice(arr_v, RangesKt.step(RangesKt.until(0, v), 5));
    }

    static List keys$default(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.keys(arr_v, v);
    }

    private static final int locationOf(ArrayList arrayList0, int v, int v1) {
        int v2 = SlotTableKt.search(arrayList0, v, v1);
        return v2 >= 0 ? v2 : -(v2 + 1);
    }

    private static final int nodeCount(int[] arr_v, int v) {
        return arr_v[v * 5 + 1] & 0x7FFFFFF;
    }

    private static final List nodeCounts(int[] arr_v, int v) {
        List list0 = SlotTableKt.slice(arr_v, RangesKt.step(RangesKt.until(1, v), 5));
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                arrayList0.add(((int)(((Number)list0.get(v2)).intValue() & 0x7FFFFFF)));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    static List nodeCounts$default(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.nodeCounts(arr_v, v);
    }

    private static final int nodeIndex(int[] arr_v, int v) {
        return arr_v[v * 5 + 4];
    }

    private static final int objectKeyIndex(int[] arr_v, int v) {
        return arr_v[v * 5 + 4] + SlotTableKt.countOneBits(arr_v[v * 5 + 1] >> 30);
    }

    private static final int parentAnchor(int[] arr_v, int v) {
        return arr_v[v * 5 + 2];
    }

    private static final List parentAnchors(int[] arr_v, int v) {
        return SlotTableKt.slice(arr_v, RangesKt.step(RangesKt.until(2, v), 5));
    }

    static List parentAnchors$default(int[] arr_v, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = arr_v.length;
        }
        return SlotTableKt.parentAnchors(arr_v, v);
    }

    private static final int search(ArrayList arrayList0, int v, int v1) {
        int v2 = arrayList0.size() - 1;
        int v3 = 0;
        while(v3 <= v2) {
            int v4 = v3 + v2 >>> 1;
            int v5 = ((Anchor)arrayList0.get(v4)).getLocation$runtime_release();
            if(v5 < 0) {
                v5 += v1;
            }
            int v6 = Intrinsics.compare(v5, v);
            if(v6 < 0) {
                v3 = v4 + 1;
                continue;
            }
            if(v6 > 0) {
                v2 = v4 - 1;
                continue;
            }
            return v4;
        }
        return -(v3 + 1);
    }

    private static final List slice(int[] arr_v, Iterable iterable0) {
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            list0.add(((int)arr_v[((Number)object0).intValue()]));
        }
        return list0;
    }

    private static final int slotAnchor(int[] arr_v, int v) {
        return arr_v[v * 5 + 4] + SlotTableKt.countOneBits(arr_v[v * 5 + 1] >> 28);
    }

    private static final void updateDataAnchor(int[] arr_v, int v, int v1) {
        arr_v[v * 5 + 4] = v1;
    }

    private static final void updateGroupSize(int[] arr_v, int v, int v1) {
        if(v1 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        arr_v[v * 5 + 3] = v1;
    }

    private static final void updateNodeCount(int[] arr_v, int v, int v1) {
        if(v1 < 0 || v1 >= 0x7FFFFFF) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int v2 = v * 5 + 1;
        arr_v[v2] = v1 | arr_v[v2] & 0xF8000000;
    }

    private static final void updateParentAnchor(int[] arr_v, int v, int v1) {
        arr_v[v * 5 + 2] = v1;
    }
}

