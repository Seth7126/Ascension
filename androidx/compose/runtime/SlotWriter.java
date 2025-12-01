package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b0\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u000E\u0010/\u001A\u0002002\u0006\u00101\u001A\u00020\nJ\u0010\u00102\u001A\u00020\u00072\b\b\u0002\u00103\u001A\u00020\nJ\u000E\u00104\u001A\u00020\n2\u0006\u00102\u001A\u00020\u0007J\u0006\u00105\u001A\u000200J\u0006\u00106\u001A\u000200J \u00107\u001A\u00020\n2\u0006\u00102\u001A\u00020\n2\u0006\u00108\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\nH\u0002J\u0010\u00109\u001A\u00020\n2\u0006\u00103\u001A\u00020\nH\u0002J\u0010\u0010:\u001A\u00020\n2\u0006\u00109\u001A\u00020\nH\u0002J(\u0010;\u001A\u00020\n2\u0006\u00103\u001A\u00020\n2\u0006\u0010<\u001A\u00020\n2\u0006\u00108\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\nH\u0002J\u0006\u0010=\u001A\u00020\nJ\u0006\u0010>\u001A\u000200J\u000E\u0010?\u001A\u0002002\u0006\u00102\u001A\u00020\u0007J\u000E\u0010?\u001A\u0002002\u0006\u00103\u001A\u00020\nJ \u0010@\u001A\u0002002\u0006\u0010\"\u001A\u00020\n2\u0006\u0010=\u001A\u00020\n2\u0006\u0010A\u001A\u00020\nH\u0002J\u0010\u0010B\u001A\u0004\u0018\u00010\u00012\u0006\u00103\u001A\u00020\nJ\u0010\u0010C\u001A\u00020\n2\u0006\u00103\u001A\u00020\nH\u0002J\u000E\u0010D\u001A\u00020\n2\u0006\u00103\u001A\u00020\nJ\u0010\u0010E\u001A\u0004\u0018\u00010\u00012\u0006\u00103\u001A\u00020\nJ\u000E\u0010F\u001A\u00020\n2\u0006\u00103\u001A\u00020\nJ\u000E\u0010G\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010HJ\u0006\u0010I\u001A\u00020JJ\u0010\u0010K\u001A\u0002002\b\u0010L\u001A\u0004\u0018\u00010\u0001J\u0010\u0010M\u001A\u0002002\u0006\u0010$\u001A\u00020\nH\u0002J\u0018\u0010N\u001A\u0002002\u0006\u0010$\u001A\u00020\n2\u0006\u0010O\u001A\u00020\nH\u0002J\u000E\u0010P\u001A\b\u0012\u0004\u0012\u00020\n0QH\u0002J \u0010R\u001A\u0002002\u0006\u0010S\u001A\u00020\n2\u0006\u0010T\u001A\u00020\n2\u0006\u0010$\u001A\u00020\nH\u0002J\u001C\u0010U\u001A\b\u0012\u0004\u0012\u00020\u00070Q2\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u00103\u001A\u00020\nJ\u000E\u0010V\u001A\u0002002\u0006\u0010W\u001A\u00020\nJ\u0010\u0010X\u001A\u0002002\u0006\u00103\u001A\u00020\nH\u0002J\u0018\u0010Y\u001A\u0002002\u0006\u00103\u001A\u00020\n2\u0006\u0010O\u001A\u00020\nH\u0002J\u0010\u0010Z\u001A\u0004\u0018\u00010\u00012\u0006\u00102\u001A\u00020\u0007J\u0010\u0010Z\u001A\u0004\u0018\u00010\u00012\u0006\u00103\u001A\u00020\nJ\u000E\u0010\"\u001A\u00020\n2\u0006\u00102\u001A\u00020\u0007J\u000E\u0010\"\u001A\u00020\n2\u0006\u00103\u001A\u00020\nJ\u0010\u0010[\u001A\u00020\n2\u0006\u00103\u001A\u00020\nH\u0002J\u0018\u0010\\\u001A\u00020\n2\u0006\u00103\u001A\u00020\n2\u0006\u0010<\u001A\u00020\nH\u0002J\u0018\u0010]\u001A\u00020\u000E2\u0006\u0010<\u001A\u00020\n2\u0006\u0010$\u001A\u00020\nH\u0002J\u0006\u0010^\u001A\u00020\u000EJ\u0018\u0010_\u001A\u00020\u000E2\u0006\u0010`\u001A\u00020\n2\u0006\u0010a\u001A\u00020\nH\u0002J \u0010b\u001A\u0002002\u0006\u0010`\u001A\u00020\n2\u0006\u0010a\u001A\u00020\n2\u0006\u0010O\u001A\u00020\nH\u0002J\b\u0010c\u001A\u00020\nH\u0002J\b\u0010d\u001A\u000200H\u0002J\u000E\u0010e\u001A\u0002002\u0006\u00102\u001A\u00020\u0007J\u0010\u0010f\u001A\u0002002\b\u0010L\u001A\u0004\u0018\u00010\u0001J\u001A\u0010f\u001A\u0004\u0018\u00010\u00012\u0006\u00103\u001A\u00020\n2\b\u0010L\u001A\u0004\u0018\u00010\u0001J\b\u0010g\u001A\u0004\u0018\u00010\u0001J\u0006\u0010h\u001A\u00020\nJ\u0006\u0010i\u001A\u000200J\u0018\u0010j\u001A\u0002002\u0006\u0010k\u001A\u00020\n2\b\u0010l\u001A\u0004\u0018\u00010\u0001J\"\u0010j\u001A\u0002002\u0006\u0010k\u001A\u00020\n2\b\u0010m\u001A\u0004\u0018\u00010\u00012\b\u0010l\u001A\u0004\u0018\u00010\u0001J\u0006\u0010n\u001A\u000200J\u000E\u0010n\u001A\u0002002\u0006\u0010k\u001A\u00020\nJ\u0018\u0010n\u001A\u0002002\u0006\u0010k\u001A\u00020\n2\b\u0010o\u001A\u0004\u0018\u00010\u0001J,\u0010n\u001A\u0002002\u0006\u0010k\u001A\u00020\n2\b\u0010m\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u001F\u001A\u00020\u000E2\b\u0010l\u001A\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010p\u001A\u0002002\b\u0010k\u001A\u0004\u0018\u00010\u0001J\u001A\u0010p\u001A\u0002002\b\u0010k\u001A\u0004\u0018\u00010\u00012\b\u0010Z\u001A\u0004\u0018\u00010\u0001J\b\u0010q\u001A\u00020JH\u0016J\u0012\u0010r\u001A\u0004\u0018\u00010\u00012\b\u0010L\u001A\u0004\u0018\u00010\u0001J\u0018\u0010s\u001A\u0002002\u0006\u0010t\u001A\u00020\n2\u0006\u0010u\u001A\u00020\nH\u0002J\u0010\u0010v\u001A\u0002002\b\u0010L\u001A\u0004\u0018\u00010\u0001J\u0018\u0010w\u001A\u0002002\u0006\u00102\u001A\u00020\u00072\b\u0010L\u001A\u0004\u0018\u00010\u0001J\u0010\u0010w\u001A\u0002002\b\u0010L\u001A\u0004\u0018\u00010\u0001J\u001A\u0010x\u001A\u0002002\u0006\u00103\u001A\u00020\n2\b\u0010L\u001A\u0004\u0018\u00010\u0001H\u0002J\u0010\u0010y\u001A\u0002002\b\u0010L\u001A\u0004\u0018\u00010\u0001J\r\u0010z\u001A\u000200H\u0000\u00A2\u0006\u0002\b{J\r\u0010|\u001A\u000200H\u0000\u00A2\u0006\u0002\b}J\u0014\u0010~\u001A\u00020\n*\u00020\u001C2\u0006\u0010\u007F\u001A\u00020\nH\u0002J\u0014\u00109\u001A\u00020\n*\u00020\u001C2\u0006\u0010\u007F\u001A\u00020\nH\u0002J\u0013\u0010\u0080\u0001\u001A\b\u0012\u0004\u0012\u00020\n0Q*\u00020\u001CH\u0002J\u001B\u0010\u0081\u0001\u001A\u000200*\b0\u0082\u0001j\u0003`\u0083\u00012\u0006\u00103\u001A\u00020\nH\u0002J\u0015\u0010\u0084\u0001\u001A\u00020\n*\u00020\u001C2\u0006\u0010\u007F\u001A\u00020\nH\u0002J\u0014\u0010\"\u001A\u00020\n*\u00020\u001C2\u0006\u00103\u001A\u00020\nH\u0002J\u0015\u0010\u0085\u0001\u001A\u00020\n*\u00020\u001C2\u0006\u0010\u007F\u001A\u00020\nH\u0002J\u001D\u0010\u0086\u0001\u001A\u000200*\u00020\u001C2\u0006\u0010\u007F\u001A\u00020\n2\u0006\u00109\u001A\u00020\nH\u0002R\u001E\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\t\u001A\u00020\n8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u001E\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u000E@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u001E\u0010\u0012\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\n@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\fR\u000E\u0010\u0014\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0015\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0016\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0017\u001A\u00020\u0018X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0019\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001A\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001B\u001A\u00020\u001CX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001D\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u001E\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u0011R\u0011\u0010\u001F\u001A\u00020\u000E8F\u00A2\u0006\u0006\u001A\u0004\b\u001F\u0010\u0011R\u000E\u0010 \u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010!\u001A\u00020\u0018X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001E\u0010\"\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\n@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010\fR\u0014\u0010$\u001A\u00020\n8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010\fR\u0018\u0010&\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\'X\u0082\u000E\u00A2\u0006\u0004\n\u0002\u0010(R\u000E\u0010)\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010*\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010+\u001A\u00020\nX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010,\u001A\u00020\u0018X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001A\u00020\u0003X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b-\u0010.\u00A8\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "", "table", "Landroidx/compose/runtime/SlotTable;", "(Landroidx/compose/runtime/SlotTable;)V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "capacity", "", "getCapacity", "()I", "<set-?>", "", "closed", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "currentGroupEnd", "currentSlot", "currentSlotEnd", "endStack", "Landroidx/compose/runtime/IntStack;", "groupGapLen", "groupGapStart", "groups", "", "insertCount", "isGroupEnd", "isNode", "nodeCount", "nodeCountStack", "parent", "getParent", "size", "getSize$runtime_release", "slots", "", "[Ljava/lang/Object;", "slotsGapLen", "slotsGapOwner", "slotsGapStart", "startStack", "getTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "advanceBy", "", "amount", "anchor", "index", "anchorIndex", "beginInsert", "close", "dataAnchorToDataIndex", "gapLen", "dataIndex", "dataIndexToDataAddress", "dataIndexToDataAnchor", "gapStart", "endGroup", "endInsert", "ensureStarted", "fixParentAnchorsFor", "firstChild", "groupAux", "groupIndexToAddress", "groupKey", "groupObjectKey", "groupSize", "groupSlots", "", "groupsAsString", "", "insertAux", "value", "insertGroups", "insertSlots", "group", "keys", "", "moveAnchors", "originalLocation", "newLocation", "moveFrom", "moveGroup", "offset", "moveGroupGapTo", "moveSlotGapTo", "node", "parentAnchorToIndex", "parentIndexToAnchor", "removeAnchors", "removeGroup", "removeGroups", "start", "len", "removeSlots", "restoreCurrentGroupEnd", "saveCurrentGroupEnd", "seek", "set", "skip", "skipGroup", "skipToGroupEnd", "startData", "key", "aux", "objectKey", "startGroup", "dataKey", "startNode", "toString", "update", "updateAnchors", "previousGapStart", "newGapStart", "updateAux", "updateNode", "updateNodeOfGroup", "updateParentNode", "verifyDataAnchors", "verifyDataAnchors$runtime_release", "verifyParentAnchors", "verifyParentAnchors$runtime_release", "auxIndex", "address", "dataIndexes", "groupAsString", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "nodeIndex", "slotIndex", "updateDataIndex", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SlotWriter {
    private ArrayList anchors;
    private boolean closed;
    private int currentGroup;
    private int currentGroupEnd;
    private int currentSlot;
    private int currentSlotEnd;
    private final IntStack endStack;
    private int groupGapLen;
    private int groupGapStart;
    private int[] groups;
    private int insertCount;
    private int nodeCount;
    private final IntStack nodeCountStack;
    private int parent;
    private Object[] slots;
    private int slotsGapLen;
    private int slotsGapOwner;
    private int slotsGapStart;
    private final IntStack startStack;
    private final SlotTable table;

    public SlotWriter(SlotTable slotTable0) {
        Intrinsics.checkNotNullParameter(slotTable0, "table");
        super();
        this.table = slotTable0;
        this.groups = slotTable0.getGroups();
        this.slots = slotTable0.getSlots();
        this.anchors = slotTable0.getAnchors$runtime_release();
        this.groupGapStart = slotTable0.getGroupsSize();
        this.groupGapLen = this.groups.length / 5 - slotTable0.getGroupsSize();
        this.currentGroupEnd = slotTable0.getGroupsSize();
        this.slotsGapStart = slotTable0.getSlotsSize();
        this.slotsGapLen = this.slots.length - slotTable0.getSlotsSize();
        this.slotsGapOwner = slotTable0.getGroupsSize();
        this.startStack = new IntStack();
        this.endStack = new IntStack();
        this.nodeCountStack = new IntStack();
        this.parent = -1;
    }

    public final void advanceBy(int v) {
        if(v < 0) {
            throw new IllegalArgumentException("Cannot seek backwards");
        }
        if(this.insertCount > 0) {
            throw new IllegalStateException("Cannot call seek() while inserting");
        }
        int v1 = this.currentGroup + v;
        if(v1 >= this.parent && v1 <= this.currentGroupEnd) {
            this.currentGroup = v1;
            int v2 = this.dataIndex(this.groups, this.groupIndexToAddress(v1));
            this.currentSlot = v2;
            this.currentSlotEnd = v2;
            return;
        }
        ComposerKt.composeRuntimeError(("Cannot seek outside the current group (" + this.getParent() + '-' + this.currentGroupEnd + ')').toString());
        throw new KotlinNothingValueException();
    }

    public final Anchor anchor(int v) {
        ArrayList arrayList0 = this.anchors;
        int v1 = SlotTableKt.search(arrayList0, v, this.getSize$runtime_release());
        if(v1 < 0) {
            if(v > this.groupGapStart) {
                v = -(this.getSize$runtime_release() - v);
            }
            Anchor anchor0 = new Anchor(v);
            arrayList0.add(-(v1 + 1), anchor0);
            return anchor0;
        }
        Object object0 = arrayList0.get(v1);
        Intrinsics.checkNotNullExpressionValue(object0, "get(location)");
        return (Anchor)object0;
    }

    public static Anchor anchor$default(SlotWriter slotWriter0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = slotWriter0.currentGroup;
        }
        return slotWriter0.anchor(v);
    }

    public final int anchorIndex(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        int v = anchor0.getLocation$runtime_release();
        return v >= 0 ? v : v + this.getSize$runtime_release();
    }

    private final int auxIndex(int[] arr_v, int v) {
        return this.dataIndex(arr_v, v) + SlotTableKt.countOneBits(SlotTableKt.groupInfo(arr_v, v) >> 29);
    }

    public final void beginInsert() {
        int v = this.insertCount;
        this.insertCount = v + 1;
        if(v == 0) {
            this.saveCurrentGroupEnd();
        }
    }

    public final void close() {
        this.closed = true;
        this.moveGroupGapTo(this.getSize$runtime_release());
        this.moveSlotGapTo(this.slots.length - this.slotsGapLen, this.groupGapStart);
        this.table.close$runtime_release(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors);
    }

    private final int dataAnchorToDataIndex(int v, int v1, int v2) {
        return v >= 0 ? v : v2 - v1 + v + 1;
    }

    private final int dataIndex(int v) {
        return this.dataIndex(this.groups, this.groupIndexToAddress(v));
    }

    private final int dataIndex(int[] arr_v, int v) {
        return v < this.getCapacity() ? this.dataAnchorToDataIndex(SlotTableKt.dataAnchor(arr_v, v), this.slotsGapLen, this.slots.length) : this.slots.length - this.slotsGapLen;
    }

    private final int dataIndexToDataAddress(int v) {
        return v < this.slotsGapStart ? v : v + this.slotsGapLen;
    }

    private final int dataIndexToDataAnchor(int v, int v1, int v2, int v3) {
        return v <= v1 ? v : -(v3 - v2 - v + 1);
    }

    private final List dataIndexes(int[] arr_v) {
        List list0 = SlotTableKt.dataAnchors$default(this.groups, 0, 1, null);
        List list1 = CollectionsKt.plus(CollectionsKt.slice(list0, RangesKt.until(0, this.groupGapStart)), CollectionsKt.slice(list0, RangesKt.until(this.groupGapStart + this.groupGapLen, arr_v.length / 5)));
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v1 = list1.size();
        if(v1 - 1 >= 0) {
            for(int v = 0; true; ++v) {
                arrayList0.add(this.dataAnchorToDataIndex(((Number)list1.get(v)).intValue(), this.slotsGapLen, this.slots.length));
                if(v + 1 > v1 - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public final int endGroup() {
        int v = 1;
        int v1 = 0;
        boolean z = this.insertCount > 0;
        int v2 = this.currentGroup;
        int v3 = this.currentGroupEnd;
        int v4 = this.parent;
        int v5 = this.groupIndexToAddress(v4);
        int v6 = this.nodeCount;
        int v7 = v2 - v4;
        boolean z1 = SlotTableKt.isNode(this.groups, v5);
        if(z) {
            SlotTableKt.updateGroupSize(this.groups, v5, v7);
            SlotTableKt.updateNodeCount(this.groups, v5, v6);
            int v8 = this.nodeCountStack.pop();
            if(!z1) {
                v = v6;
            }
            this.nodeCount = v8 + v;
            this.parent = this.parent(this.groups, v4);
            return v6;
        }
        if(v2 != v3) {
            throw new IllegalArgumentException("Expected to be at the end of a group");
        }
        int v9 = SlotTableKt.groupSize(this.groups, v5);
        int v10 = SlotTableKt.nodeCount(this.groups, v5);
        SlotTableKt.updateGroupSize(this.groups, v5, v7);
        SlotTableKt.updateNodeCount(this.groups, v5, v6);
        int v11 = this.startStack.pop();
        this.restoreCurrentGroupEnd();
        this.parent = v11;
        int v12 = this.parent(this.groups, v4);
        int v13 = this.nodeCountStack.pop();
        this.nodeCount = v13;
        if(v12 == v11) {
            if(!z1) {
                v1 = v6 - v10;
            }
            this.nodeCount = v13 + v1;
            return v6;
        }
        int v14 = v7 - v9;
        int v15 = z1 ? 0 : v6 - v10;
        if(v14 != 0 || v15 != 0) {
            while(v12 != 0 && v12 != v11 && (v15 != 0 || v14 != 0)) {
                int v16 = this.groupIndexToAddress(v12);
                if(v14 != 0) {
                    int v17 = SlotTableKt.groupSize(this.groups, v16);
                    SlotTableKt.updateGroupSize(this.groups, v16, v17 + v14);
                }
                if(v15 != 0) {
                    SlotTableKt.updateNodeCount(this.groups, v16, SlotTableKt.nodeCount(this.groups, v16) + v15);
                }
                if(SlotTableKt.isNode(this.groups, v16)) {
                    v15 = 0;
                }
                v12 = this.parent(this.groups, v12);
            }
        }
        this.nodeCount += v15;
        return v6;
    }

    public final void endInsert() {
        int v = this.insertCount;
        if(v <= 0) {
            throw new IllegalStateException("Unbalanced begin/end insert");
        }
        this.insertCount = v - 1;
        if(v - 1 == 0) {
            if(this.nodeCountStack.getSize() == this.startStack.getSize()) {
                this.restoreCurrentGroupEnd();
                return;
            }
            ComposerKt.composeRuntimeError("startGroup/endGroup mismatch while inserting");
            throw new KotlinNothingValueException();
        }
    }

    public final void ensureStarted(int v) {
        if(this.insertCount > 0) {
            throw new IllegalArgumentException("Cannot call ensureStarted() while inserting");
        }
        int v1 = this.parent;
        if(v1 != v) {
            if(v < v1 || v >= this.currentGroupEnd) {
                throw new IllegalArgumentException(("Started group must be a subgroup of the group at " + v1).toString());
            }
            int v2 = this.currentGroup;
            int v3 = this.currentSlot;
            int v4 = this.currentSlotEnd;
            this.currentGroup = v;
            this.startGroup();
            this.currentGroup = v2;
            this.currentSlot = v3;
            this.currentSlotEnd = v4;
        }
    }

    public final void ensureStarted(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        this.ensureStarted(anchor0.toIndexFor(this));
    }

    private final void fixParentAnchorsFor(int v, int v1, int v2) {
        int v3 = this.parentIndexToAnchor(v, this.groupGapStart);
        while(v2 < v1) {
            SlotTableKt.updateParentAnchor(this.groups, this.groupIndexToAddress(v2), v3);
            int v4 = SlotTableKt.groupSize(this.groups, this.groupIndexToAddress(v2)) + v2;
            this.fixParentAnchorsFor(v2, v4, v2 + 1);
            v2 = v4;
        }
    }

    private final int getCapacity() {
        return this.groups.length / 5;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getSize$runtime_release() {
        return this.getCapacity() - this.groupGapLen;
    }

    public final SlotTable getTable$runtime_release() {
        return this.table;
    }

    private final void groupAsString(StringBuilder stringBuilder0, int v) {
        int v1 = this.groupIndexToAddress(v);
        stringBuilder0.append("Group(");
        if(v < 10) {
            stringBuilder0.append(' ');
        }
        if(v < 100) {
            stringBuilder0.append(' ');
        }
        if(v < 1000) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append(v);
        stringBuilder0.append('#');
        stringBuilder0.append(SlotTableKt.groupSize(this.groups, v1));
        stringBuilder0.append('^');
        stringBuilder0.append(this.parentAnchorToIndex(SlotTableKt.parentAnchor(this.groups, v1)));
        stringBuilder0.append(": key=");
        stringBuilder0.append(SlotTableKt.key(this.groups, v1));
        stringBuilder0.append(", nodes=");
        stringBuilder0.append(SlotTableKt.nodeCount(this.groups, v1));
        stringBuilder0.append(", dataAnchor=");
        stringBuilder0.append(SlotTableKt.dataAnchor(this.groups, v1));
        stringBuilder0.append(", parentAnchor=");
        stringBuilder0.append(SlotTableKt.parentAnchor(this.groups, v1));
        stringBuilder0.append(")");
    }

    public final Object groupAux(int v) {
        int v1 = this.groupIndexToAddress(v);
        if(SlotTableKt.hasAux(this.groups, v1)) {
            Object[] arr_object = this.slots;
            return arr_object[this.auxIndex(this.groups, v1)];
        }
        return Composer.Companion.getEmpty();
    }

    private final int groupIndexToAddress(int v) {
        return v < this.groupGapStart ? v : v + this.groupGapLen;
    }

    public final int groupKey(int v) {
        return SlotTableKt.key(this.groups, this.groupIndexToAddress(v));
    }

    public final Object groupObjectKey(int v) {
        int v1 = this.groupIndexToAddress(v);
        return SlotTableKt.hasObjectKey(this.groups, v1) ? this.slots[SlotTableKt.objectKeyIndex(this.groups, v1)] : null;
    }

    public final int groupSize(int v) {
        return SlotTableKt.groupSize(this.groups, this.groupIndexToAddress(v));
    }

    public final Iterator groupSlots() {
        return new Object() {
            private int current;

            {
                int v = this.dataIndex(this.groups, this.groupIndexToAddress(this.currentGroup + this.groupSize(this.currentGroup)));  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                int v1 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.current = v;
            }

            public final int getCurrent() {
                return this.current;
            }

            @Override
            public boolean hasNext() {
                return this.current < this;
            }

            @Override
            public Object next() {
                if(this.hasNext()) {
                    int v = this.current;
                    this.current = v + 1;
                    return SlotWriter.this.slots[SlotWriter.this.dataIndexToDataAddress(v)];
                }
                return null;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            public final void setCurrent(int v) {
                this.current = v;
            }
        };
    }

    public final String groupsAsString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        int v = this.getSize$runtime_release();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                this.groupAsString(stringBuilder0, v1);
                stringBuilder0.append('\n');
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void insertAux(Object object0) {
        if(this.insertCount >= 0) {
            int v = this.parent;
            int v1 = this.groupIndexToAddress(v);
            if(!SlotTableKt.hasAux(this.groups, v1) != 0) {
                this.insertSlots(1, v);
                int v2 = this.auxIndex(this.groups, v1);
                int v3 = this.dataIndexToDataAddress(v2);
                int v4 = this.currentSlot;
                if(v4 > v2) {
                    int v5 = v4 - v2;
                    if(v5 >= 3) {
                        throw new IllegalStateException("Moving more than two slot not supported");
                    }
                    if(v5 > 1) {
                        this.slots[v3 + 2] = this.slots[v3 + 1];
                    }
                    this.slots[v3 + 1] = this.slots[v3];
                }
                SlotTableKt.addAux(this.groups, v1);
                this.slots[v3] = object0;
                ++this.currentSlot;
                return;
            }
            ComposerKt.composeRuntimeError("Group already has auxiliary data");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot insert auxiliary data when not inserting");
        throw new KotlinNothingValueException();
    }

    private final void insertGroups(int v) {
        if(v > 0) {
            int v1 = this.currentGroup;
            this.moveGroupGapTo(v1);
            int v2 = this.groupGapStart;
            int v3 = this.groupGapLen;
            int[] arr_v = this.groups;
            int v4 = arr_v.length / 5;
            int v5 = v4 - v3;
            int v6 = 0;
            if(v3 < v) {
                int v7 = Math.max(Math.max(v4 * 2, v5 + v), 0x20);
                int[] arr_v1 = new int[v7 * 5];
                int v8 = v7 - v5;
                ArraysKt.copyInto(arr_v, arr_v1, 0, 0, v2 * 5);
                ArraysKt.copyInto(arr_v, arr_v1, (v2 + v8) * 5, (v3 + v2) * 5, v4 * 5);
                this.groups = arr_v1;
                v3 = v8;
            }
            int v9 = this.currentGroupEnd;
            if(v9 >= v2) {
                this.currentGroupEnd = v9 + v;
            }
            int v10 = v2 + v;
            this.groupGapStart = v10;
            this.groupGapLen = v3 - v;
            int v11 = v5 <= 0 ? 0 : this.dataIndex(v1 + v);
            if(this.slotsGapOwner >= v2) {
                v6 = this.slotsGapStart;
            }
            int v12 = this.dataIndexToDataAnchor(v11, v6, this.slotsGapLen, this.slots.length);
            if(v2 < v10) {
                for(int v13 = v2; true; ++v13) {
                    SlotTableKt.updateDataAnchor(this.groups, v13, v12);
                    if(v13 + 1 >= v10) {
                        break;
                    }
                }
            }
            int v14 = this.slotsGapOwner;
            if(v14 >= v2) {
                this.slotsGapOwner = v14 + v;
            }
        }
    }

    private final void insertSlots(int v, int v1) {
        if(v > 0) {
            this.moveSlotGapTo(this.currentSlot, v1);
            int v2 = this.slotsGapStart;
            int v3 = this.slotsGapLen;
            if(v3 < v) {
                Object[] arr_object = this.slots;
                int v4 = arr_object.length - v3;
                int v5 = Math.max(Math.max(arr_object.length * 2, v4 + v), 0x20);
                Object[] arr_object1 = new Object[v5];
                for(int v6 = 0; v6 < v5; ++v6) {
                    arr_object1[v6] = null;
                }
                int v7 = v5 - v4;
                ArraysKt.copyInto(arr_object, arr_object1, 0, 0, v2);
                ArraysKt.copyInto(arr_object, arr_object1, v2 + v7, v3 + v2, arr_object.length);
                this.slots = arr_object1;
                v3 = v7;
            }
            int v8 = this.currentSlotEnd;
            if(v8 >= v2) {
                this.currentSlotEnd = v8 + v;
            }
            this.slotsGapStart = v2 + v;
            this.slotsGapLen = v3 - v;
        }
    }

    public final boolean isGroupEnd() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final boolean isNode() {
        return this.currentGroup < this.currentGroupEnd && SlotTableKt.isNode(this.groups, this.groupIndexToAddress(this.currentGroup));
    }

    private final List keys() {
        List list0 = SlotTableKt.keys$default(this.groups, 0, 1, null);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = list0.get(v1);
                ((Number)object0).intValue();
                if(v1 < this.groupGapStart || v1 >= this.groupGapStart + this.groupGapLen) {
                    arrayList0.add(object0);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    private final void moveAnchors(int v, int v1, int v2) {
        int v3 = this.getSize$runtime_release();
        int v4 = SlotTableKt.locationOf(this.anchors, v, v3);
        List list0 = new ArrayList();
        if(v4 >= 0) {
            while(v4 < this.anchors.size()) {
                Object object0 = this.anchors.get(v4);
                Intrinsics.checkNotNullExpressionValue(object0, "anchors[index]");
                int v5 = this.anchorIndex(((Anchor)object0));
                if(v5 < v || v5 >= v2 + v) {
                    break;
                }
                list0.add(((Anchor)object0));
                this.anchors.remove(v4);
            }
        }
        int v6 = list0.size();
        if(v6 - 1 >= 0) {
            for(int v7 = 0; true; ++v7) {
                Anchor anchor0 = (Anchor)list0.get(v7);
                int v8 = this.anchorIndex(anchor0) + (v1 - v);
                if(v8 >= this.groupGapStart) {
                    anchor0.setLocation$runtime_release(-(v3 - v8));
                }
                else {
                    anchor0.setLocation$runtime_release(v8);
                }
                int v9 = SlotTableKt.locationOf(this.anchors, v8, v3);
                this.anchors.add(v9, anchor0);
                if(v7 + 1 > v6 - 1) {
                    break;
                }
            }
        }
    }

    public final List moveFrom(SlotTable slotTable0, int v) {
        int v25;
        List list0;
        int v19;
        int v18;
        int v16;
        Intrinsics.checkNotNullParameter(slotTable0, "table");
        if(this.insertCount > 0) {
            if(v == 0 && this.currentGroup == 0 && this.table.getGroupsSize() == 0) {
                int[] arr_v = this.groups;
                Object[] arr_object = this.slots;
                ArrayList arrayList0 = this.anchors;
                int[] arr_v1 = slotTable0.getGroups();
                int v1 = slotTable0.getGroupsSize();
                Object[] arr_object1 = slotTable0.getSlots();
                int v2 = slotTable0.getSlotsSize();
                this.groups = arr_v1;
                this.slots = arr_object1;
                this.anchors = slotTable0.getAnchors$runtime_release();
                this.groupGapStart = v1;
                this.groupGapLen = arr_v1.length / 5 - v1;
                this.slotsGapStart = v2;
                this.slotsGapLen = arr_object1.length - v2;
                this.slotsGapOwner = v1;
                slotTable0.setTo$runtime_release(arr_v, 0, arr_object, 0, arrayList0);
                return this.anchors;
            }
            try(SlotWriter slotWriter0 = slotTable0.openWriter()) {
                int v3 = slotWriter0.groupSize(v);
                int v4 = v + v3;
                int v5 = slotWriter0.dataIndex(v);
                int v6 = slotWriter0.dataIndex(v4);
                int v7 = v6 - v5;
                this.insertGroups(v3);
                this.insertSlots(v7, this.getCurrentGroup());
                int[] arr_v2 = this.groups;
                int v8 = this.getCurrentGroup();
                ArraysKt.copyInto(slotWriter0.groups, arr_v2, v8 * 5, v * 5, v4 * 5);
                Object[] arr_object2 = this.slots;
                int v9 = this.currentSlot;
                ArraysKt.copyInto(slotWriter0.slots, arr_object2, v9, v5, v6);
                SlotTableKt.updateParentAnchor(arr_v2, v8, this.getParent());
                int v10 = v8 - v;
                int v11 = v3 + v8;
                int v12 = v9 - this.dataIndex(arr_v2, v8);
                int v13 = this.slotsGapOwner;
                int v14 = this.slotsGapLen;
                if(v8 < v11) {
                    int v15 = v8;
                    while(true) {
                        if(v15 == v8) {
                            v16 = v7;
                        }
                        else {
                            v16 = v7;
                            SlotTableKt.updateParentAnchor(arr_v2, v15, SlotTableKt.parentAnchor(arr_v2, v15) + v10);
                        }
                        int v17 = this.dataIndex(arr_v2, v15);
                        if(v13 < v15) {
                            v18 = v12;
                            v19 = 0;
                        }
                        else {
                            v18 = v12;
                            v19 = this.slotsGapStart;
                        }
                        SlotTableKt.updateDataAnchor(arr_v2, v15, this.dataIndexToDataAnchor(v17 + v12, v19, v14, arr_object2.length));
                        if(v15 == v13) {
                            ++v13;
                        }
                        if(v15 + 1 >= v11) {
                            break;
                        }
                        ++v15;
                        v12 = v18;
                        v7 = v16;
                    }
                }
                else {
                    v16 = v7;
                }
                this.slotsGapOwner = v13;
                int v20 = SlotTableKt.locationOf(slotTable0.getAnchors$runtime_release(), v, slotTable0.getGroupsSize());
                int v21 = SlotTableKt.locationOf(slotTable0.getAnchors$runtime_release(), v4, slotTable0.getGroupsSize());
                if(v20 < v21) {
                    ArrayList arrayList1 = slotTable0.getAnchors$runtime_release();
                    ArrayList arrayList2 = new ArrayList(v21 - v20);
                    if(v20 < v21) {
                        for(int v22 = v20; true; ++v22) {
                            Object object0 = arrayList1.get(v22);
                            Intrinsics.checkNotNullExpressionValue(object0, "sourceAnchors[anchorIndex]");
                            ((Anchor)object0).setLocation$runtime_release(((Anchor)object0).getLocation$runtime_release() + v10);
                            arrayList2.add(((Anchor)object0));
                            if(v22 + 1 >= v21) {
                                break;
                            }
                        }
                    }
                    this.getTable$runtime_release().getAnchors$runtime_release().addAll(SlotTableKt.locationOf(this.anchors, this.getCurrentGroup(), this.getSize$runtime_release()), arrayList2);
                    arrayList1.subList(v20, v21).clear();
                    list0 = arrayList2;
                }
                else {
                    list0 = CollectionsKt.emptyList();
                }
                int v23 = slotWriter0.parent(v);
                if(v23 >= 0) {
                    slotWriter0.startGroup();
                    slotWriter0.advanceBy(v23 - slotWriter0.getCurrentGroup());
                    slotWriter0.startGroup();
                }
                slotWriter0.advanceBy(v - slotWriter0.getCurrentGroup());
                boolean z = slotWriter0.removeGroup();
                if(v23 >= 0) {
                    slotWriter0.skipToGroupEnd();
                    slotWriter0.endGroup();
                    slotWriter0.skipToGroupEnd();
                    slotWriter0.endGroup();
                }
                if(!z != 0) {
                    int v24 = this.nodeCount;
                    v25 = SlotTableKt.isNode(arr_v2, v8) ? 1 : SlotTableKt.nodeCount(arr_v2, v8);
                    this.nodeCount = v24 + v25;
                    this.currentGroup = v11;
                    this.currentSlot = v9 + v16;
                    return list0;
                }
                ComposerKt.composeRuntimeError("Unexpectedly removed anchors");
                throw new KotlinNothingValueException();
            }
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public final void moveGroup(int v) {
        if(this.insertCount != 0) {
            throw new IllegalArgumentException("Cannot move a group while inserting");
        }
        if(v < 0) {
            throw new IllegalArgumentException("Parameter offset is out of bounds");
        }
        if(v == 0) {
            return;
        }
        int v1 = this.currentGroup;
        int v2 = this.parent;
        int v3 = this.currentGroupEnd;
        int v4 = v;
        int v5 = v1;
        while(v4 > 0) {
            v5 += SlotTableKt.groupSize(this.groups, this.groupIndexToAddress(v5));
            if(v5 > v3) {
                throw new IllegalArgumentException("Parameter offset is out of bounds");
            }
            --v4;
        }
        int v6 = SlotTableKt.groupSize(this.groups, this.groupIndexToAddress(v5));
        int v7 = this.currentSlot;
        int v8 = this.dataIndex(this.groups, this.groupIndexToAddress(v5));
        int v9 = v5 + v6;
        int v10 = this.dataIndex(this.groups, this.groupIndexToAddress(v9));
        int v11 = v10 - v8;
        this.insertSlots(v11, Math.max(this.currentGroup - 1, 0));
        this.insertGroups(v6);
        int[] arr_v = this.groups;
        int v12 = this.groupIndexToAddress(v9);
        ArraysKt.copyInto(arr_v, arr_v, this.groupIndexToAddress(v1) * 5, v12 * 5, v6 * 5 + v12 * 5);
        if(v11 > 0) {
            ArraysKt.copyInto(this.slots, this.slots, v7, this.dataIndexToDataAddress(v8 + v11), this.dataIndexToDataAddress(v10 + v11));
        }
        int v13 = v8 + v11;
        int v14 = this.slotsGapStart;
        int v15 = this.slotsGapLen;
        int v16 = this.slotsGapOwner;
        int v17 = v1 + v6;
        if(v1 < v17) {
            for(int v18 = v1; true; ++v18) {
                int v19 = this.groupIndexToAddress(v18);
                this.updateDataIndex(arr_v, v19, this.dataIndexToDataAnchor(this.dataIndex(arr_v, v19) - (v13 - v7), (v16 >= v19 ? v14 : 0), v15, this.slots.length));
                if(v18 + 1 >= v17) {
                    break;
                }
            }
        }
        this.moveAnchors(v9, v1, v6);
        if(!this.removeGroups(v9, v6) != 0) {
            this.fixParentAnchorsFor(v2, this.currentGroupEnd, v1);
            if(v11 > 0) {
                this.removeSlots(v13, v11, v9 - 1);
            }
            return;
        }
        ComposerKt.composeRuntimeError("Unexpectedly removed anchors");
        throw new KotlinNothingValueException();
    }

    private final void moveGroupGapTo(int v) {
        boolean z = true;
        int v1 = this.groupGapLen;
        int v2 = this.groupGapStart;
        if(v2 != v) {
            if(!this.anchors.isEmpty() != 0) {
                this.updateAnchors(v2, v);
            }
            if(v1 > 0) {
                int[] arr_v = this.groups;
                if(v < v2) {
                    ArraysKt.copyInto(arr_v, arr_v, v1 * 5 + v * 5, v * 5, v2 * 5);
                }
                else {
                    ArraysKt.copyInto(arr_v, arr_v, v2 * 5, v2 * 5 + v1 * 5, v * 5 + v1 * 5);
                }
            }
            if(v < v2) {
                v2 = v + v1;
            }
            int v3 = this.getCapacity();
            if(v2 >= v3) {
                z = false;
            }
            ComposerKt.runtimeCheck(z);
            while(v2 < v3) {
                int v4 = SlotTableKt.parentAnchor(this.groups, v2);
                int v5 = this.parentIndexToAnchor(this.parentAnchorToIndex(v4), v);
                if(v5 != v4) {
                    SlotTableKt.updateParentAnchor(this.groups, v2, v5);
                }
                ++v2;
                if(v2 == v) {
                    v2 += v1;
                }
            }
        }
        this.groupGapStart = v;
    }

    private final void moveSlotGapTo(int v, int v1) {
        int v2 = this.slotsGapLen;
        int v3 = this.slotsGapStart;
        int v4 = this.slotsGapOwner;
        if(v3 != v) {
            Object[] arr_object = this.slots;
            if(v < v3) {
                ArraysKt.copyInto(arr_object, arr_object, v + v2, v, v3);
            }
            else {
                ArraysKt.copyInto(arr_object, arr_object, v3, v3 + v2, v + v2);
            }
            ArraysKt.fill(arr_object, null, v, v + v2);
        }
        int v5 = Math.min(v1 + 1, this.getSize$runtime_release());
        if(v4 != v5) {
            int v6 = this.slots.length - v2;
            if(v5 < v4) {
                int v7 = this.groupIndexToAddress(v5);
                int v8 = this.groupIndexToAddress(v4);
                int v9 = this.groupGapStart;
                while(v7 < v8) {
                    int v10 = SlotTableKt.dataAnchor(this.groups, v7);
                    if(v10 >= 0) {
                        SlotTableKt.updateDataAnchor(this.groups, v7, -(v6 - v10 + 1));
                        ++v7;
                        if(v7 != v9) {
                            continue;
                        }
                        v7 += this.groupGapLen;
                        continue;
                    }
                    ComposerKt.composeRuntimeError("Unexpected anchor value, expected a positive anchor");
                    throw new KotlinNothingValueException();
                }
            }
            else {
                int v11 = this.groupIndexToAddress(v4);
                int v12 = this.groupIndexToAddress(v5);
                while(v11 < v12) {
                    int v13 = SlotTableKt.dataAnchor(this.groups, v11);
                    if(v13 < 0) {
                        SlotTableKt.updateDataAnchor(this.groups, v11, v13 + v6 + 1);
                        ++v11;
                        if(v11 != this.groupGapStart) {
                            continue;
                        }
                        v11 += this.groupGapLen;
                        continue;
                    }
                    ComposerKt.composeRuntimeError("Unexpected anchor value, expected a negative anchor");
                    throw new KotlinNothingValueException();
                }
            }
            this.slotsGapOwner = v5;
        }
        this.slotsGapStart = v;
    }

    public final Object node(int v) {
        int v1 = this.groupIndexToAddress(v);
        if(SlotTableKt.isNode(this.groups, v1)) {
            Object[] arr_object = this.slots;
            return arr_object[this.dataIndexToDataAddress(this.nodeIndex(this.groups, v1))];
        }
        return null;
    }

    public final Object node(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        return this.node(anchor0.toIndexFor(this));
    }

    private final int nodeIndex(int[] arr_v, int v) {
        return this.dataIndex(arr_v, v);
    }

    private final int parent(int[] arr_v, int v) {
        return this.parentAnchorToIndex(SlotTableKt.parentAnchor(arr_v, this.groupIndexToAddress(v)));
    }

    public final int parent(int v) {
        return this.parent(this.groups, v);
    }

    public final int parent(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        return anchor0.getValid() ? this.parent(this.groups, this.anchorIndex(anchor0)) : -1;
    }

    private final int parentAnchorToIndex(int v) {
        return v > -2 ? v : this.getSize$runtime_release() + v + 2;
    }

    private final int parentIndexToAnchor(int v, int v1) {
        return v < v1 ? v : -(this.getSize$runtime_release() - v + 2);
    }

    private final boolean removeAnchors(int v, int v1) {
        int v2 = v1 + v;
        int v3 = SlotTableKt.locationOf(this.anchors, v2, this.getCapacity() - this.groupGapLen);
        if(v3 >= this.anchors.size()) {
            --v3;
        }
        int v4 = v3 + 1;
        boolean z = false;
        int v5 = 0;
        while(v3 >= 0) {
            Object object0 = this.anchors.get(v3);
            Intrinsics.checkNotNullExpressionValue(object0, "anchors[index]");
            Anchor anchor0 = (Anchor)object0;
            int v6 = this.anchorIndex(anchor0);
            if(v6 < v) {
                break;
            }
            if(v6 < v2) {
                anchor0.setLocation$runtime_release(0x80000000);
                if(v5 == 0) {
                    v5 = v3 + 1;
                }
                v4 = v3;
            }
            --v3;
        }
        if(v4 < v5) {
            z = true;
            this.anchors.subList(v4, v5).clear();
        }
        return z;
    }

    public final boolean removeGroup() {
        if(this.insertCount != 0) {
            throw new IllegalArgumentException("Cannot remove group while inserting");
        }
        int v = this.currentGroup;
        int v1 = this.currentSlot;
        int v2 = this.skipGroup();
        boolean z = this.removeGroups(v, this.currentGroup - v);
        this.removeSlots(v1, this.currentSlot - v1, v - 1);
        this.currentGroup = v;
        this.currentSlot = v1;
        this.nodeCount -= v2;
        return z;
    }

    private final boolean removeGroups(int v, int v1) {
        boolean z = false;
        if(v1 > 0) {
            ArrayList arrayList0 = this.anchors;
            this.moveGroupGapTo(v);
            if(!arrayList0.isEmpty() != 0) {
                z = this.removeAnchors(v, v1);
            }
            this.groupGapStart = v;
            this.groupGapLen += v1;
            int v2 = this.slotsGapOwner;
            if(v2 > v) {
                this.slotsGapOwner = v2 - v1;
            }
            int v3 = this.currentGroupEnd;
            if(v3 >= v) {
                this.currentGroupEnd = v3 - v1;
            }
        }
        return z;
    }

    private final void removeSlots(int v, int v1, int v2) {
        if(v1 > 0) {
            int v3 = this.slotsGapLen;
            int v4 = v + v1;
            this.moveSlotGapTo(v4, v2);
            this.slotsGapStart = v;
            this.slotsGapLen = v3 + v1;
            ArraysKt.fill(this.slots, null, v, v4);
            int v5 = this.currentSlotEnd;
            if(v5 >= v) {
                this.currentSlotEnd = v5 - v1;
            }
        }
    }

    private final int restoreCurrentGroupEnd() {
        int v = this.getCapacity() - this.groupGapLen - this.endStack.pop();
        this.currentGroupEnd = v;
        return v;
    }

    private final void saveCurrentGroupEnd() {
        this.endStack.push(this.getCapacity() - this.groupGapLen - this.currentGroupEnd);
    }

    public final void seek(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        this.advanceBy(anchor0.toIndexFor(this) - this.currentGroup);
    }

    public final Object set(int v, Object object0) {
        int v1 = this.groupIndexToAddress(this.currentGroup);
        int v2 = this.slotIndex(this.groups, v1);
        int v3 = v2 + v;
        if(v3 >= v2 && v3 < this.dataIndex(this.groups, this.groupIndexToAddress(this.currentGroup + 1))) {
            int v4 = this.dataIndexToDataAddress(v3);
            Object[] arr_object = this.slots;
            Object object1 = arr_object[v4];
            arr_object[v4] = object0;
            return object1;
        }
        ComposerKt.composeRuntimeError(("Write to an invalid slot index " + v + " for group " + this.getCurrentGroup()).toString());
        throw new KotlinNothingValueException();
    }

    public final void set(Object object0) {
        int v = this.currentSlot;
        if(v <= this.currentSlotEnd) {
            this.slots[this.dataIndexToDataAddress(v - 1)] = object0;
            return;
        }
        ComposerKt.composeRuntimeError("Writing to an invalid slot");
        throw new KotlinNothingValueException();
    }

    public final Object skip() {
        if(this.insertCount > 0) {
            this.insertSlots(1, this.parent);
        }
        int v = this.currentSlot;
        this.currentSlot = v + 1;
        return this.slots[this.dataIndexToDataAddress(v)];
    }

    public final int skipGroup() {
        int v = this.groupIndexToAddress(this.currentGroup);
        int v1 = this.currentGroup + SlotTableKt.groupSize(this.groups, v);
        this.currentGroup = v1;
        this.currentSlot = this.dataIndex(this.groups, this.groupIndexToAddress(v1));
        return SlotTableKt.isNode(this.groups, v) ? 1 : SlotTableKt.nodeCount(this.groups, v);
    }

    public final void skipToGroupEnd() {
        this.currentGroup = this.currentGroupEnd;
        this.currentSlot = this.dataIndex(this.groups, this.groupIndexToAddress(this.currentGroupEnd));
    }

    private final int slotIndex(int[] arr_v, int v) {
        return v < this.getCapacity() ? this.dataAnchorToDataIndex(SlotTableKt.slotAnchor(arr_v, v), this.slotsGapLen, this.slots.length) : this.slots.length - this.slotsGapLen;
    }

    public final void startData(int v, Object object0) {
        this.startGroup(v, Composer.Companion.getEmpty(), false, object0);
    }

    public final void startData(int v, Object object0, Object object1) {
        this.startGroup(v, object0, false, object1);
    }

    private final void startGroup(int v, Object object0, boolean z, Object object1) {
        int v7;
        boolean z1 = this.insertCount > 0;
        this.nodeCountStack.push(this.nodeCount);
        if(z1) {
            this.insertGroups(1);
            int v1 = this.currentGroup;
            int v2 = this.groupIndexToAddress(v1);
            int v3 = object0 == Composer.Companion.getEmpty() ? 0 : 1;
            int v4 = ((int)z) || object1 == Composer.Companion.getEmpty() ? 0 : 1;
            SlotTableKt.initGroup(this.groups, v2, v, ((int)z), v3, v4, this.parent, this.currentSlot);
            this.currentSlotEnd = this.currentSlot;
            int v5 = ((int)z) + v3 + v4;
            if(v5 > 0) {
                this.insertSlots(v5, v1);
                Object[] arr_object = this.slots;
                int v6 = this.currentSlot;
                if(((int)z) != 0) {
                    arr_object[v6] = object1;
                    ++v6;
                }
                if(v3 != 0) {
                    arr_object[v6] = object0;
                    ++v6;
                }
                if(v4 != 0) {
                    arr_object[v6] = object1;
                    ++v6;
                }
                this.currentSlot = v6;
            }
            this.nodeCount = 0;
            v7 = v1 + 1;
            this.parent = v1;
            this.currentGroup = v7;
        }
        else {
            this.startStack.push(this.parent);
            this.saveCurrentGroupEnd();
            int v8 = this.currentGroup;
            int v9 = this.groupIndexToAddress(v8);
            if(!Intrinsics.areEqual(object1, Composer.Companion.getEmpty())) {
                if(((int)z)) {
                    this.updateNode(object1);
                }
                else {
                    this.updateAux(object1);
                }
            }
            this.currentSlot = this.slotIndex(this.groups, v9);
            this.currentSlotEnd = this.dataIndex(this.groups, this.groupIndexToAddress(this.currentGroup + 1));
            this.nodeCount = SlotTableKt.nodeCount(this.groups, v9);
            this.parent = v8;
            this.currentGroup = v8 + 1;
            v7 = v8 + SlotTableKt.groupSize(this.groups, v9);
        }
        this.currentGroupEnd = v7;
    }

    public final void startGroup() {
        if(this.insertCount != 0) {
            throw new IllegalArgumentException("Key must be supplied when inserting");
        }
        this.startGroup(0, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }

    public final void startGroup(int v) {
        this.startGroup(v, Composer.Companion.getEmpty(), false, Composer.Companion.getEmpty());
    }

    public final void startGroup(int v, Object object0) {
        this.startGroup(v, object0, false, Composer.Companion.getEmpty());
    }

    public final void startNode(Object object0) {
        this.startGroup(0x7D, object0, true, Composer.Companion.getEmpty());
    }

    public final void startNode(Object object0, Object object1) {
        this.startGroup(0x7D, object0, true, object1);
    }

    @Override
    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + this.getSize$runtime_release() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final Object update(Object object0) {
        Object object1 = this.skip();
        this.set(object0);
        return object1;
    }

    private final void updateAnchors(int v, int v1) {
        int v2 = this.getCapacity() - this.groupGapLen;
        if(v < v1) {
            for(int v3 = SlotTableKt.locationOf(this.anchors, v, v2); v3 < this.anchors.size(); ++v3) {
                Object object0 = this.anchors.get(v3);
                Intrinsics.checkNotNullExpressionValue(object0, "anchors[index]");
                int v4 = ((Anchor)object0).getLocation$runtime_release();
                if(v4 >= 0) {
                    return;
                }
                int v5 = v4 + v2;
                if(v5 >= v1) {
                    return;
                }
                ((Anchor)object0).setLocation$runtime_release(v5);
            }
        }
        else {
            for(int v6 = SlotTableKt.locationOf(this.anchors, v1, v2); v6 < this.anchors.size(); ++v6) {
                Object object1 = this.anchors.get(v6);
                Intrinsics.checkNotNullExpressionValue(object1, "anchors[index]");
                int v7 = ((Anchor)object1).getLocation$runtime_release();
                if(v7 < 0) {
                    break;
                }
                ((Anchor)object1).setLocation$runtime_release(-(v2 - v7));
            }
        }
    }

    public final void updateAux(Object object0) {
        int v = this.groupIndexToAddress(this.currentGroup);
        if(SlotTableKt.hasAux(this.groups, v)) {
            Object[] arr_object = this.slots;
            arr_object[this.dataIndexToDataAddress(this.auxIndex(this.groups, v))] = object0;
            return;
        }
        ComposerKt.composeRuntimeError("Updating the data of a group that was not created with a data slot");
        throw new KotlinNothingValueException();
    }

    private final void updateDataIndex(int[] arr_v, int v, int v1) {
        SlotTableKt.updateDataAnchor(arr_v, v, this.dataIndexToDataAnchor(v1, this.slotsGapStart, this.slotsGapLen, this.slots.length));
    }

    public final void updateNode(Anchor anchor0, Object object0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        this.updateNodeOfGroup(anchor0.toIndexFor(this), object0);
    }

    public final void updateNode(Object object0) {
        this.updateNodeOfGroup(this.currentGroup, object0);
    }

    private final void updateNodeOfGroup(int v, Object object0) {
        int v1 = this.groupIndexToAddress(v);
        if(v1 < this.groups.length && SlotTableKt.isNode(this.groups, v1)) {
            Object[] arr_object = this.slots;
            arr_object[this.dataIndexToDataAddress(this.nodeIndex(this.groups, v1))] = object0;
            return;
        }
        ComposerKt.composeRuntimeError(("Updating the node of a group at " + v + " that was not created with as a node group").toString());
        throw new KotlinNothingValueException();
    }

    public final void updateParentNode(Object object0) {
        this.updateNodeOfGroup(this.parent, object0);
    }

    public final void verifyDataAnchors$runtime_release() {
        int v7;
        int v = this.slotsGapOwner;
        int v1 = this.slots.length - this.slotsGapLen;
        int v2 = this.getSize$runtime_release();
        if(v2 > 0) {
            int v3 = 0;
            boolean z = false;
            for(int v4 = 0; true; v4 = v7) {
                int v5 = this.groupIndexToAddress(v3);
                int v6 = SlotTableKt.dataAnchor(this.groups, v5);
                v7 = this.dataIndex(this.groups, v5);
                if(v7 < v4) {
                    throw new IllegalStateException(("Data index out of order at " + v3 + ", previous = " + v4 + ", current = " + v7).toString());
                }
                if(v7 > v1) {
                    break;
                }
                if(v6 < 0 && !z) {
                    if(v != v3) {
                        throw new IllegalStateException(("Expected the slot gap owner to be " + v + " found gap at " + v3).toString());
                    }
                    z = true;
                }
                if(v3 + 1 >= v2) {
                    return;
                }
                ++v3;
            }
            throw new IllegalStateException(("Data index, " + v7 + ", out of bound at " + v3).toString());
        }
    }

    public final void verifyParentAnchors$runtime_release() {
        int v = this.groupGapStart;
        int v1 = this.groupGapLen;
        int v2 = this.getCapacity();
        if(v > 0) {
            int v3 = 0;
            while(SlotTableKt.parentAnchor(this.groups, v3) > -2) {
                if(v3 + 1 >= v) {
                    goto label_10;
                }
                ++v3;
            }
            throw new IllegalStateException(("Expected a start relative anchor at " + v3).toString());
        }
    label_10:
        int v4 = v1 + v;
        if(v4 < v2) {
            while(true) {
                int v5 = SlotTableKt.parentAnchor(this.groups, v4);
                if(this.parentAnchorToIndex(v5) >= v) {
                    if(v5 <= -2) {
                        goto label_17;
                    }
                }
                else if(v5 <= -2) {
                    throw new IllegalStateException(("Expected a start relative anchor at " + v4).toString());
                }
                else {
                label_17:
                    if(v4 + 1 >= v2) {
                        break;
                    }
                    ++v4;
                    continue;
                }
                throw new IllegalStateException(("Expected an end relative anchor at " + v4).toString());
            }
        }
    }
}

