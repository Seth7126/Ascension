package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001A\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u000F\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u0010\u00109\u001A\u00020:2\b\b\u0002\u0010;\u001A\u00020\u0006J\u0006\u0010<\u001A\u00020=J\u0006\u0010>\u001A\u00020=J\u0006\u0010?\u001A\u00020=J\u0006\u0010@\u001A\u00020=J\f\u0010A\u001A\b\u0012\u0004\u0012\u00020C0BJ\u0010\u0010D\u001A\u0004\u0018\u00010\u00012\u0006\u0010;\u001A\u00020\u0006J\u0010\u0010\u000F\u001A\u0004\u0018\u00010\u00012\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010\u0012\u001A\u00020\u00062\u0006\u0010;\u001A\u00020\u0006J\u0010\u0010E\u001A\u0004\u0018\u00010\u00012\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010\u0014\u001A\u00020\u00062\u0006\u00109\u001A\u00020:J\u000E\u0010\u0014\u001A\u00020\u00062\u0006\u0010;\u001A\u00020\u0006J\u0010\u0010\u0018\u001A\u0004\u0018\u00010\u00012\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010\u001A\u001A\u00020\u00062\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010F\u001A\u00020$2\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010(\u001A\u00020$2\u0006\u0010;\u001A\u00020\u0006J\b\u0010G\u001A\u0004\u0018\u00010\u0001J\u0010\u0010H\u001A\u0004\u0018\u00010\u00012\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010)\u001A\u00020\u00062\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010+\u001A\u00020\u00062\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010I\u001A\u00020\u00062\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010J\u001A\u00020=2\u0006\u0010;\u001A\u00020\u0006J\u000E\u0010K\u001A\u00020=2\u0006\u0010;\u001A\u00020\u0006J\u0006\u0010L\u001A\u00020\u0006J\u0006\u0010M\u001A\u00020=J\u0006\u0010N\u001A\u00020=J\u0006\u0010O\u001A\u00020=J\u0016\u0010P\u001A\u0004\u0018\u00010\u0001*\u00020!2\u0006\u0010;\u001A\u00020\u0006H\u0002J\u0016\u0010H\u001A\u0004\u0018\u00010\u0001*\u00020!2\u0006\u0010;\u001A\u00020\u0006H\u0002J\u0016\u0010Q\u001A\u0004\u0018\u00010\u0001*\u00020!2\u0006\u0010;\u001A\u00020\u0006H\u0002R\u001E\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0006@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001E\u0010\n\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0006@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\tR\u000E\u0010\f\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u00018F\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\tR\u0011\u0010\u0014\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\tR\u0013\u0010\u0016\u001A\u0004\u0018\u00010\u00018F\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0011R\u0013\u0010\u0018\u001A\u0004\u0018\u00010\u00018F\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u0011R\u0011\u0010\u001A\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\tR\u0011\u0010\u001C\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b\u001D\u0010\tR\u0011\u0010\u001E\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010\tR\u000E\u0010 \u001A\u00020!X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\"\u001A\u00020\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010#\u001A\u00020$8F\u00A2\u0006\u0006\u001A\u0004\b%\u0010&R\u0011\u0010\'\u001A\u00020$8F\u00A2\u0006\u0006\u001A\u0004\b\'\u0010&R\u0011\u0010(\u001A\u00020$8F\u00A2\u0006\u0006\u001A\u0004\b(\u0010&R\u0011\u0010)\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b*\u0010\tR\u001E\u0010+\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0006@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010\tR\u0011\u0010-\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b.\u0010\tR\u0011\u0010/\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b0\u0010\tR\u0011\u00101\u001A\u00020\u00068F\u00A2\u0006\u0006\u001A\u0004\b2\u0010\tR\u0018\u00103\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000104X\u0082\u0004\u00A2\u0006\u0004\n\u0002\u00105R\u000E\u00106\u001A\u00020\u0006X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001A\u00020\u0003X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b7\u00108\u00A8\u0006R"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "<set-?>", "", "currentEnd", "getCurrentEnd", "()I", "currentGroup", "getCurrentGroup", "currentSlot", "currentSlotEnd", "emptyCount", "groupAux", "getGroupAux", "()Ljava/lang/Object;", "groupEnd", "getGroupEnd", "groupKey", "getGroupKey", "groupNode", "getGroupNode", "groupObjectKey", "getGroupObjectKey", "groupSize", "getGroupSize", "groupSlotCount", "getGroupSlotCount", "groupSlotIndex", "getGroupSlotIndex", "groups", "", "groupsSize", "inEmpty", "", "getInEmpty", "()Z", "isGroupEnd", "isNode", "nodeCount", "getNodeCount", "parent", "getParent", "parentNodes", "getParentNodes", "size", "getSize", "slot", "getSlot", "slots", "", "[Ljava/lang/Object;", "slotsSize", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "anchor", "Landroidx/compose/runtime/Anchor;", "index", "beginEmpty", "", "close", "endEmpty", "endGroup", "extractKeys", "", "Landroidx/compose/runtime/KeyInfo;", "get", "groupGet", "hasObjectKey", "next", "node", "parentOf", "reposition", "restoreParent", "skipGroup", "skipToGroupEnd", "startGroup", "startNode", "aux", "objectKey", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SlotReader {
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;
    private int emptyCount;
    private final int[] groups;
    private final int groupsSize;
    private int parent;
    private final Object[] slots;
    private final int slotsSize;
    private final SlotTable table;

    public SlotReader(SlotTable slotTable0) {
        Intrinsics.checkNotNullParameter(slotTable0, "table");
        super();
        this.table = slotTable0;
        this.groups = slotTable0.getGroups();
        int v = slotTable0.getGroupsSize();
        this.groupsSize = v;
        this.slots = slotTable0.getSlots();
        this.slotsSize = slotTable0.getSlotsSize();
        this.currentEnd = v;
        this.parent = -1;
    }

    public final Anchor anchor(int v) {
        ArrayList arrayList0 = this.table.getAnchors$runtime_release();
        int v1 = SlotTableKt.search(arrayList0, v, this.groupsSize);
        if(v1 < 0) {
            Anchor anchor0 = new Anchor(v);
            arrayList0.add(-(v1 + 1), anchor0);
            return anchor0;
        }
        Object object0 = arrayList0.get(v1);
        Intrinsics.checkNotNullExpressionValue(object0, "get(location)");
        return (Anchor)object0;
    }

    public static Anchor anchor$default(SlotReader slotReader0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotReader0.currentGroup;
        }
        return slotReader0.anchor(v);
    }

    // 去混淆评级： 低(20)
    private final Object aux(int[] arr_v, int v) {
        return SlotTableKt.hasAux(arr_v, v) ? this.slots[SlotTableKt.auxIndex(arr_v, v)] : Composer.Companion.getEmpty();
    }

    public final void beginEmpty() {
        ++this.emptyCount;
    }

    public final void close() {
        this.table.close$runtime_release(this);
    }

    public final void endEmpty() {
        int v = this.emptyCount;
        if(v <= 0) {
            throw new IllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount = v - 1;
    }

    public final void endGroup() {
        if(this.emptyCount == 0) {
            if(this.currentGroup != this.currentEnd) {
                throw new IllegalArgumentException("endGroup() not called at the end of a group");
            }
            int v = SlotTableKt.parentAnchor(this.groups, this.parent);
            this.parent = v;
            this.currentEnd = v >= 0 ? v + SlotTableKt.groupSize(this.groups, v) : this.groupsSize;
        }
    }

    public final List extractKeys() {
        List list0 = new ArrayList();
        if(this.emptyCount > 0) {
            return list0;
        }
        int v = this.currentGroup;
        for(int v1 = 0; v < this.currentEnd; ++v1) {
            list0.add(new KeyInfo(SlotTableKt.key(this.groups, v), this.objectKey(this.groups, v), v, (SlotTableKt.isNode(this.groups, v) ? 1 : SlotTableKt.nodeCount(this.groups, v)), v1));
            v += SlotTableKt.groupSize(this.groups, v);
        }
        return list0;
    }

    public final Object get(int v) {
        int v1 = this.currentSlot + v;
        return v1 >= this.currentSlotEnd ? Composer.Companion.getEmpty() : this.slots[v1];
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int v = this.currentGroup;
        return v < this.currentEnd ? this.aux(this.groups, v) : 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        return this.currentGroup >= this.currentEnd ? 0 : SlotTableKt.key(this.groups, this.currentGroup);
    }

    public final Object getGroupNode() {
        return this.currentGroup >= this.currentEnd ? null : this.node(this.groups, this.currentGroup);
    }

    public final Object getGroupObjectKey() {
        return this.currentGroup >= this.currentEnd ? null : this.objectKey(this.groups, this.currentGroup);
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int getGroupSlotCount() {
        int v = this.currentGroup;
        int v1 = SlotTableKt.slotAnchor(this.groups, v);
        return v + 1 >= this.groupsSize ? this.slotsSize - v1 : SlotTableKt.dataAnchor(this.groups, v + 1) - v1;
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getNodeCount() {
        return SlotTableKt.nodeCount(this.groups, this.currentGroup);
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        return this.parent < 0 ? 0 : SlotTableKt.nodeCount(this.groups, this.parent);
    }

    public final int getSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    public final Object groupAux(int v) {
        return this.aux(this.groups, v);
    }

    public final int groupEnd(int v) {
        return v + SlotTableKt.groupSize(this.groups, v);
    }

    public final Object groupGet(int v) {
        int v1 = this.currentGroup;
        int v2 = SlotTableKt.slotAnchor(this.groups, v1) + v;
        return v2 >= (v1 + 1 >= this.groupsSize ? this.slotsSize : SlotTableKt.dataAnchor(this.groups, v1 + 1)) ? Composer.Companion.getEmpty() : this.slots[v2];
    }

    public final int groupKey(int v) {
        return SlotTableKt.key(this.groups, v);
    }

    public final int groupKey(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        if(anchor0.getValid()) {
            int v = this.table.anchorIndex(anchor0);
            return SlotTableKt.key(this.groups, v);
        }
        return 0;
    }

    public final Object groupObjectKey(int v) {
        return this.objectKey(this.groups, v);
    }

    public final int groupSize(int v) {
        return SlotTableKt.groupSize(this.groups, v);
    }

    public final boolean hasObjectKey(int v) {
        return SlotTableKt.hasObjectKey(this.groups, v);
    }

    public final boolean isGroupEnd() {
        return this.getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return SlotTableKt.isNode(this.groups, this.currentGroup);
    }

    public final boolean isNode(int v) {
        return SlotTableKt.isNode(this.groups, v);
    }

    public final Object next() {
        if(this.emptyCount <= 0) {
            int v = this.currentSlot;
            if(v < this.currentSlotEnd) {
                this.currentSlot = v + 1;
                return this.slots[v];
            }
        }
        return Composer.Companion.getEmpty();
    }

    // 去混淆评级： 低(20)
    private final Object node(int[] arr_v, int v) {
        return SlotTableKt.isNode(arr_v, v) ? this.slots[SlotTableKt.nodeIndex(arr_v, v)] : Composer.Companion.getEmpty();
    }

    // 去混淆评级： 低(20)
    public final Object node(int v) {
        return SlotTableKt.isNode(this.groups, v) ? this.node(this.groups, v) : null;
    }

    public final int nodeCount(int v) {
        return SlotTableKt.nodeCount(this.groups, v);
    }

    // 去混淆评级： 低(20)
    private final Object objectKey(int[] arr_v, int v) {
        return SlotTableKt.hasObjectKey(arr_v, v) ? this.slots[SlotTableKt.objectKeyIndex(arr_v, v)] : null;
    }

    public final int parent(int v) {
        return SlotTableKt.parentAnchor(this.groups, v);
    }

    public final int parentOf(int v) {
        if(v < 0 || v >= this.groupsSize) {
            throw new IllegalArgumentException(("Invalid group index " + v).toString());
        }
        return SlotTableKt.parentAnchor(this.groups, v);
    }

    public final void reposition(int v) {
        if(this.emptyCount != 0) {
            throw new IllegalArgumentException("Cannot reposition while in an empty region");
        }
        this.currentGroup = v;
        int v1 = v >= this.groupsSize ? -1 : SlotTableKt.parentAnchor(this.groups, v);
        this.parent = v1;
        this.currentEnd = v1 < 0 ? this.groupsSize : v1 + SlotTableKt.groupSize(this.groups, v1);
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final void restoreParent(int v) {
        int v1 = SlotTableKt.groupSize(this.groups, v) + v;
        int v2 = this.currentGroup;
        if(v2 < v || v2 > v1) {
            throw new IllegalArgumentException(("Index " + v + " is not a parent of " + v2).toString());
        }
        this.parent = v;
        this.currentEnd = v1;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int skipGroup() {
        int v = 1;
        if(this.emptyCount != 0) {
            throw new IllegalArgumentException("Cannot skip while in an empty region");
        }
        if(!SlotTableKt.isNode(this.groups, this.currentGroup)) {
            v = SlotTableKt.nodeCount(this.groups, this.currentGroup);
        }
        this.currentGroup += SlotTableKt.groupSize(this.groups, this.currentGroup);
        return v;
    }

    public final void skipToGroupEnd() {
        if(this.emptyCount != 0) {
            throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
    }

    public final void startGroup() {
        if(this.emptyCount <= 0) {
            if(SlotTableKt.parentAnchor(this.groups, this.currentGroup) != this.parent) {
                throw new IllegalArgumentException("Invalid slot table detected");
            }
            this.parent = this.currentGroup;
            this.currentEnd = this.currentGroup + SlotTableKt.groupSize(this.groups, this.currentGroup);
            int v = this.currentGroup;
            this.currentGroup = v + 1;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, v);
            this.currentSlotEnd = v < this.groupsSize - 1 ? SlotTableKt.dataAnchor(this.groups, v + 1) : this.slotsSize;
        }
    }

    public final void startNode() {
        if(this.emptyCount <= 0) {
            if(!SlotTableKt.isNode(this.groups, this.currentGroup)) {
                throw new IllegalArgumentException("Expected a node group");
            }
            this.startGroup();
        }
    }
}

