package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u008A\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000F\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00A2\u0006\u0002\u0010\u0004J\u000E\u0010+\u001A\u00020\u00152\u0006\u0010,\u001A\u00020\u0007J\u0006\u0010-\u001A\u00020.J\u0015\u0010/\u001A\u0002002\u0006\u00101\u001A\u000202H\u0000\u00A2\u0006\u0002\b3JW\u0010/\u001A\u0002002\u0006\u0010)\u001A\u0002042\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u00152\u000E\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\u001D2\u0006\u0010#\u001A\u00020\u00152\u0016\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0000\u00A2\u0006\u0004\b3\u00105J\u000E\u00106\u001A\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u000E\u00108\u001A\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u000F\u00109\u001A\b\u0012\u0004\u0012\u00020\u00030:H\u0096\u0002J\u000E\u0010;\u001A\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u000E\u0010<\u001A\b\u0012\u0004\u0012\u00020\u001507H\u0002J\u0006\u0010=\u001A\u000202J\u0006\u0010>\u001A\u000204J\u000E\u0010?\u001A\u00020\u001A2\u0006\u0010,\u001A\u00020\u0007J\u000E\u0010@\u001A\b\u0012\u0004\u0012\u00020\u001507H\u0002J:\u0010A\u001A\u0002HB\"\u0004\b\u0000\u0010B2!\u0010C\u001A\u001D\u0012\u0013\u0012\u001102\u00A2\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(1\u0012\u0004\u0012\u0002HB0DH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010GJO\u0010H\u001A\u0002002\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u00152\u000E\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\u001D2\u0006\u0010#\u001A\u00020\u00152\u0016\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bH\u0000\u00A2\u0006\u0004\bI\u0010JJ\u001D\u0010K\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E072\u0006\u0010L\u001A\u00020\u0015H\u0000\u00A2\u0006\u0002\bMJ\u0006\u0010N\u001A\u000200J:\u0010O\u001A\u0002HB\"\u0004\b\u0000\u0010B2!\u0010C\u001A\u001D\u0012\u0013\u0012\u001104\u00A2\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b()\u0012\u0004\u0012\u0002HB0DH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010GJ \u0010P\u001A\u00020\u0015*\u00060Qj\u0002`R2\u0006\u0010S\u001A\u00020\u00152\u0006\u0010T\u001A\u00020\u0015H\u0002R*\u0010\u0005\u001A\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bX\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR\u001E\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\u0011@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u0014R\u001E\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u0015@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001A\u00020\u001A8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u001BR\u000E\u0010\u001C\u001A\u00020\u0015X\u0082\u000E\u00A2\u0006\u0002\n\u0000R0\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\u001D2\u000E\u0010\u0010\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\u001D@BX\u0086\u000E\u00A2\u0006\n\n\u0002\u0010\"\u001A\u0004\b \u0010!R\u001E\u0010#\u001A\u00020\u00152\u0006\u0010\u0010\u001A\u00020\u0015@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010\u0018R\u001A\u0010%\u001A\u00020\u0015X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\u0018\"\u0004\b\'\u0010(R\u001E\u0010)\u001A\u00020\u001A2\u0006\u0010\u0010\u001A\u00020\u001A@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010\u001B\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006U"}, d2 = {"Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/tooling/CompositionData;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "()V", "anchors", "Ljava/util/ArrayList;", "Landroidx/compose/runtime/Anchor;", "Lkotlin/collections/ArrayList;", "getAnchors$runtime_release", "()Ljava/util/ArrayList;", "setAnchors$runtime_release", "(Ljava/util/ArrayList;)V", "compositionGroups", "getCompositionGroups", "()Ljava/lang/Iterable;", "<set-?>", "", "groups", "getGroups", "()[I", "", "groupsSize", "getGroupsSize", "()I", "isEmpty", "", "()Z", "readers", "", "", "slots", "getSlots", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "slotsSize", "getSlotsSize", "version", "getVersion$runtime_release", "setVersion$runtime_release", "(I)V", "writer", "getWriter$runtime_release", "anchorIndex", "anchor", "asString", "", "close", "", "reader", "Landroidx/compose/runtime/SlotReader;", "close$runtime_release", "Landroidx/compose/runtime/SlotWriter;", "(Landroidx/compose/runtime/SlotWriter;[II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "dataIndexes", "", "groupSizes", "iterator", "", "keys", "nodes", "openReader", "openWriter", "ownsAnchor", "parentIndexes", "read", "T", "block", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "setTo", "setTo$runtime_release", "([II[Ljava/lang/Object;ILjava/util/ArrayList;)V", "slotsOf", "group", "slotsOf$runtime_release", "verifyWellFormed", "write", "emitGroup", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "index", "level", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SlotTable implements CompositionData, Iterable, KMappedMarker {
    private ArrayList anchors;
    private int[] groups;
    private int groupsSize;
    private int readers;
    private Object[] slots;
    private int slotsSize;
    private int version;
    private boolean writer;

    public SlotTable() {
        this.groups = new int[0];
        this.slots = new Object[0];
        this.anchors = new ArrayList();
    }

    public final int anchorIndex(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        if(!this.writer != 0) {
            if(!anchor0.getValid()) {
                throw new IllegalArgumentException("Anchor refers to a group that was removed");
            }
            return anchor0.getLocation$runtime_release();
        }
        ComposerKt.composeRuntimeError("Use active SlotWriter to determine anchor location instead");
        throw new KotlinNothingValueException();
    }

    public final String asString() {
        if(this.writer) {
            return super.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append('\n');
        int v = this.getGroupsSize();
        if(v > 0) {
            for(int v1 = 0; v1 < v; v1 += this.emitGroup(stringBuilder0, v1, 0)) {
            }
        }
        else {
            stringBuilder0.append("<EMPTY>");
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }

    public final void close$runtime_release(SlotReader slotReader0) {
        Intrinsics.checkNotNullParameter(slotReader0, "reader");
        if(slotReader0.getTable$runtime_release() != this || this.readers <= 0) {
            throw new IllegalArgumentException("Unexpected reader close()");
        }
        --this.readers;
    }

    public final void close$runtime_release(SlotWriter slotWriter0, int[] arr_v, int v, Object[] arr_object, int v1, ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(slotWriter0, "writer");
        Intrinsics.checkNotNullParameter(arr_v, "groups");
        Intrinsics.checkNotNullParameter(arr_object, "slots");
        Intrinsics.checkNotNullParameter(arrayList0, "anchors");
        if(slotWriter0.getTable$runtime_release() != this || !this.writer) {
            throw new IllegalArgumentException("Unexpected writer close()");
        }
        this.writer = false;
        this.setTo$runtime_release(arr_v, v, arr_object, v1, arrayList0);
    }

    private final List dataIndexes() {
        return SlotTableKt.dataAnchors(this.groups, this.groupsSize * 5);
    }

    private final int emitGroup(StringBuilder stringBuilder0, int v, int v1) {
        boolean z = false;
        for(int v2 = 0; v2 < v1; ++v2) {
            stringBuilder0.append(' ');
        }
        stringBuilder0.append("Group(");
        stringBuilder0.append(v);
        stringBuilder0.append(") key=");
        stringBuilder0.append(SlotTableKt.key(this.groups, v));
        int v3 = SlotTableKt.groupSize(this.groups, v);
        stringBuilder0.append(", nodes=");
        stringBuilder0.append(SlotTableKt.nodeCount(this.groups, v));
        stringBuilder0.append(", size=");
        stringBuilder0.append(v3);
        int v4 = SlotTable.emitGroup$dataIndex(this, v);
        int v5 = v + 1;
        int v6 = SlotTable.emitGroup$dataIndex(this, v5);
        if(v4 >= 0 && v4 <= v6) {
            z = true;
        }
        if(!z || v6 > this.slotsSize) {
            stringBuilder0.append(", *invalid data offsets " + v4 + '-' + v6 + '*');
        }
        else {
            if(SlotTableKt.hasObjectKey(this.groups, v)) {
                stringBuilder0.append(Intrinsics.stringPlus(" objectKey=", this.slots[SlotTableKt.objectKeyIndex(this.groups, v)]));
            }
            if(SlotTableKt.isNode(this.groups, v)) {
                stringBuilder0.append(Intrinsics.stringPlus(" node=", this.slots[SlotTableKt.nodeIndex(this.groups, v)]));
            }
            if(SlotTableKt.hasAux(this.groups, v)) {
                stringBuilder0.append(Intrinsics.stringPlus(" aux=", this.slots[SlotTableKt.auxIndex(this.groups, v)]));
            }
            int v7 = SlotTableKt.slotAnchor(this.groups, v);
            if(v7 < v6) {
                stringBuilder0.append(", slots=[");
                stringBuilder0.append(v7);
                stringBuilder0.append(": ");
                if(v7 < v6) {
                    for(int v8 = v7; true; ++v8) {
                        if(v8 != v7) {
                            stringBuilder0.append(", ");
                        }
                        stringBuilder0.append(String.valueOf(this.slots[v8]));
                        if(v8 + 1 >= v6) {
                            break;
                        }
                    }
                }
                stringBuilder0.append("]");
            }
        }
        stringBuilder0.append('\n');
        while(v5 < v + v3) {
            v5 += this.emitGroup(stringBuilder0, v5, v1 + 1);
        }
        return v3;
    }

    private static final int emitGroup$dataIndex(SlotTable slotTable0, int v) {
        return v < slotTable0.groupsSize ? SlotTableKt.dataAnchor(slotTable0.groups, v) : slotTable0.slotsSize;
    }

    public final ArrayList getAnchors$runtime_release() {
        return this.anchors;
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public Iterable getCompositionGroups() {
        return this;
    }

    public final int[] getGroups() {
        return this.groups;
    }

    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final Object[] getSlots() {
        return this.slots;
    }

    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final int getVersion$runtime_release() {
        return this.version;
    }

    public final boolean getWriter$runtime_release() {
        return this.writer;
    }

    private final List groupSizes() {
        return SlotTableKt.groupSizes(this.groups, this.groupsSize * 5);
    }

    @Override  // androidx.compose.runtime.tooling.CompositionData
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override
    public Iterator iterator() {
        return new GroupIterator(this, 0, this.groupsSize);
    }

    private final List keys() {
        return SlotTableKt.keys(this.groups, this.groupsSize * 5);
    }

    private final List nodes() {
        return SlotTableKt.nodeCounts(this.groups, this.groupsSize * 5);
    }

    public final SlotReader openReader() {
        if(this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        ++this.readers;
        return new SlotReader(this);
    }

    public final SlotWriter openWriter() {
        if(!this.writer != 0) {
            if(this.readers <= 0) {
                this.writer = true;
                ++this.version;
                return new SlotWriter(this);
            }
            ComposerKt.composeRuntimeError("Cannot start a writer when a reader is pending");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("Cannot start a writer when another writer is pending");
        throw new KotlinNothingValueException();
    }

    public final boolean ownsAnchor(Anchor anchor0) {
        Intrinsics.checkNotNullParameter(anchor0, "anchor");
        if(anchor0.getValid()) {
            int v = SlotTableKt.search(this.anchors, anchor0.getLocation$runtime_release(), this.groupsSize);
            return v >= 0 && Intrinsics.areEqual(this.getAnchors$runtime_release().get(v), anchor0);
        }
        return false;
    }

    private final List parentIndexes() {
        return SlotTableKt.parentAnchors(this.groups, this.groupsSize * 5);
    }

    public final Object read(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        try(SlotReader slotReader0 = this.openReader()) {
            return function10.invoke(slotReader0);
        }
    }

    public final void setAnchors$runtime_release(ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "<set-?>");
        this.anchors = arrayList0;
    }

    public final void setTo$runtime_release(int[] arr_v, int v, Object[] arr_object, int v1, ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arr_v, "groups");
        Intrinsics.checkNotNullParameter(arr_object, "slots");
        Intrinsics.checkNotNullParameter(arrayList0, "anchors");
        this.groups = arr_v;
        this.groupsSize = v;
        this.slots = arr_object;
        this.slotsSize = v1;
        this.anchors = arrayList0;
    }

    public final void setVersion$runtime_release(int v) {
        this.version = v;
    }

    public final List slotsOf$runtime_release(int v) {
        int v2;
        int v1 = SlotTableKt.dataAnchor(this.groups, v);
        if(v + 1 < this.groupsSize) {
            v2 = SlotTableKt.dataAnchor(this.groups, v + 1);
            return ArraysKt.toList(this.slots).subList(v1, v2);
        }
        v2 = this.slots.length;
        return ArraysKt.toList(this.slots).subList(v1, v2);
    }

    public final void verifyWellFormed() {
        IntRef ref$IntRef0 = new IntRef();
        int v = -1;
        if(this.groupsSize > 0) {
            while(ref$IntRef0.element < this.groupsSize) {
                SlotTable.verifyWellFormed$validateGroup(ref$IntRef0, this, -1, ref$IntRef0.element + SlotTableKt.groupSize(this.groups, ref$IntRef0.element));
            }
            if(ref$IntRef0.element != this.groupsSize) {
                throw new IllegalStateException(("Incomplete group at root " + ref$IntRef0.element + " expected to be " + this.getGroupsSize()).toString());
            }
        }
        List list0 = this.anchors;
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                int v3 = ((Anchor)list0.get(v2)).toIndexFor(this);
                if(v3 < 0 || v3 > this.getGroupsSize()) {
                    throw new IllegalArgumentException("Location out of bound");
                }
                if(v >= v3) {
                    break;
                }
                if(v2 + 1 > v1 - 1) {
                    return;
                }
                v = v3;
            }
            throw new IllegalArgumentException("Anchor is out of order");
        }
    }

    private static final int verifyWellFormed$validateGroup(IntRef ref$IntRef0, SlotTable slotTable0, int v, int v1) {
        int v2 = ref$IntRef0.element;
        ref$IntRef0.element = v2 + 1;
        int v3 = SlotTableKt.parentAnchor(slotTable0.groups, v2);
        if(v3 != v) {
            throw new IllegalStateException(("Invalid parent index detected at " + v2 + ", expected parent index to be " + v + " found " + v3).toString());
        }
        int v4 = SlotTableKt.groupSize(slotTable0.groups, v2) + v2;
        if(v4 > slotTable0.groupsSize) {
            throw new IllegalStateException(("A group extends past the end of the table at " + v2).toString());
        }
        if(v4 > v1) {
            throw new IllegalStateException(("A group extends past its parent group at " + v2).toString());
        }
        int v5 = SlotTableKt.dataAnchor(slotTable0.groups, v2);
        int v6 = v2 < slotTable0.groupsSize - 1 ? SlotTableKt.dataAnchor(slotTable0.groups, v2 + 1) : slotTable0.slotsSize;
        if(v6 > slotTable0.slots.length) {
            throw new IllegalStateException(("Slots for " + v2 + " extend past the end of the slot table").toString());
        }
        if(v5 > v6) {
            throw new IllegalStateException(("Invalid data anchor at " + v2).toString());
        }
        if(SlotTableKt.slotAnchor(slotTable0.groups, v2) > v6) {
            throw new IllegalStateException(("Slots start out of range at " + v2).toString());
        }
        if(v6 - v5 < SlotTableKt.isNode(slotTable0.groups, v2) + SlotTableKt.hasObjectKey(slotTable0.groups, v2) + SlotTableKt.hasAux(slotTable0.groups, v2)) {
            throw new IllegalStateException(("Not enough slots added for group " + v2).toString());
        }
        boolean z = SlotTableKt.isNode(slotTable0.groups, v2);
        if(z && slotTable0.slots[SlotTableKt.nodeIndex(slotTable0.groups, v2)] == null) {
            throw new IllegalStateException(("No node recorded for a node group at " + v2).toString());
        }
        int v7;
        for(v7 = 0; ref$IntRef0.element < v4; v7 += SlotTable.verifyWellFormed$validateGroup(ref$IntRef0, slotTable0, v2, v4)) {
        }
        int v8 = SlotTableKt.nodeCount(slotTable0.groups, v2);
        int v9 = SlotTableKt.groupSize(slotTable0.groups, v2);
        if(v8 != v7) {
            throw new IllegalStateException(("Incorrect node count detected at " + v2 + ", expected " + v8 + ", received " + v7).toString());
        }
        int v10 = ref$IntRef0.element - v2;
        if(v9 != v10) {
            throw new IllegalStateException(("Incorrect slot count detected at " + v2 + ", expected " + v9 + ", received " + v10).toString());
        }
        return z ? 1 : v7;
    }

    public final Object write(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        try(SlotWriter slotWriter0 = this.openWriter()) {
            return function10.invoke(slotWriter0);
        }
    }
}

