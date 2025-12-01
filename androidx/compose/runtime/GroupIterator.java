package androidx.compose.runtime;

import androidx.compose.runtime.tooling.CompositionGroup;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000F\u001A\u00020\u0010H\u0096\u0002J\t\u0010\u0011\u001A\u00020\u0002H\u0096\u0002J\b\u0010\u0012\u001A\u00020\u0013H\u0002R\u0011\u0010\u0007\u001A\u00020\u0006¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u000E\u0010\u000B\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u000E\u0010\u000E\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/GroupIterator;", "", "Landroidx/compose/runtime/tooling/CompositionGroup;", "table", "Landroidx/compose/runtime/SlotTable;", "start", "", "end", "(Landroidx/compose/runtime/SlotTable;II)V", "getEnd", "()I", "index", "getTable", "()Landroidx/compose/runtime/SlotTable;", "version", "hasNext", "", "next", "validateRead", "", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class GroupIterator implements Iterator, KMappedMarker {
    private final int end;
    private int index;
    private final SlotTable table;
    private final int version;

    public GroupIterator(SlotTable slotTable0, int v, int v1) {
        Intrinsics.checkNotNullParameter(slotTable0, "table");
        super();
        this.table = slotTable0;
        this.end = v1;
        this.index = v;
        this.version = slotTable0.getVersion$runtime_release();
        if(slotTable0.getWriter$runtime_release()) {
            throw new ConcurrentModificationException();
        }
    }

    public final int getEnd() {
        return this.end;
    }

    public final SlotTable getTable() {
        return this.table;
    }

    @Override
    public boolean hasNext() {
        return this.index < this.end;
    }

    public CompositionGroup next() {
        this.validateRead();
        int v = this.index;
        this.index = SlotTableKt.groupSize(this.table.getGroups(), v) + v;
        return new Object() {
            @Override  // androidx.compose.runtime.tooling.CompositionData
            public Iterable getCompositionGroups() {
                return this;
            }

            @Override  // androidx.compose.runtime.tooling.CompositionGroup
            public Iterable getData() {
                int v = SlotTableKt.dataAnchor(v.getTable().getGroups(), this.$group);
                return this.$group + 1 >= v.getTable().getGroupsSize() ? new Object() {
                    private int index;

                    {
                        int v = GroupIterator.this.getTable().getSlotsSize();  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        int v1 = GroupIterator.this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                        this.index = v;
                    }

                    public final int getIndex() {
                        return this.index;
                    }

                    @Override
                    public boolean hasNext() {
                        return this.index < GroupIterator.this;
                    }

                    @Override
                    public Iterator iterator() {
                        return this;
                    }

                    @Override
                    public Object next() {
                        Object object0 = this.index < 0 || this.index >= GroupIterator.this.getTable().getSlots().length ? null : GroupIterator.this.getTable().getSlots()[this.index];
                        this.setIndex(this.getIndex() + 1);
                        return object0;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }

                    public final void setIndex(int v) {
                        this.index = v;
                    }
                } : new Object() {
                    private int index;

                    public final int getIndex() {
                        return this.index;
                    }

                    @Override
                    public boolean hasNext() {
                        return this.index < GroupIterator.this;
                    }

                    @Override
                    public Iterator iterator() {
                        return this;
                    }

                    @Override
                    public Object next() {
                        Object object0 = this.index < 0 || this.index >= GroupIterator.this.getTable().getSlots().length ? null : GroupIterator.this.getTable().getSlots()[this.index];
                        this.setIndex(this.getIndex() + 1);
                        return object0;
                    }

                    @Override
                    public void remove() {
                        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                    }

                    public final void setIndex(int v) {
                        this.index = v;
                    }
                };
            }

            @Override  // androidx.compose.runtime.tooling.CompositionGroup
            public Object getKey() {
                if(SlotTableKt.hasObjectKey(v.getTable().getGroups(), this.$group)) {
                    Integer integer0 = v.getTable().getSlots()[SlotTableKt.objectKeyIndex(v.getTable().getGroups(), this.$group)];
                    Intrinsics.checkNotNull(integer0);
                    return integer0;
                }
                return SlotTableKt.key(v.getTable().getGroups(), this.$group);
            }

            // 去混淆评级： 低(20)
            @Override  // androidx.compose.runtime.tooling.CompositionGroup
            public Object getNode() {
                return SlotTableKt.isNode(v.getTable().getGroups(), this.$group) ? v.getTable().getSlots()[SlotTableKt.nodeIndex(v.getTable().getGroups(), this.$group)] : null;
            }

            @Override  // androidx.compose.runtime.tooling.CompositionGroup
            public String getSourceInfo() {
                if(SlotTableKt.hasAux(v.getTable().getGroups(), this.$group)) {
                    Object object0 = v.getTable().getSlots()[SlotTableKt.auxIndex(v.getTable().getGroups(), this.$group)];
                    return object0 instanceof String ? ((String)object0) : null;
                }
                return null;
            }

            @Override  // androidx.compose.runtime.tooling.CompositionData
            public boolean isEmpty() {
                return SlotTableKt.groupSize(v.getTable().getGroups(), this.$group) == 0;
            }

            @Override
            public Iterator iterator() {
                v.validateRead();
                int v = SlotTableKt.groupSize(v.getTable().getGroups(), this.$group);
                return new GroupIterator(v.getTable(), this.$group + 1, this.$group + v);
            }
        };
    }

    @Override
    public Object next() {
        return this.next();
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    private final void validateRead() {
        if(this.table.getVersion$runtime_release() != this.version) {
            throw new ConcurrentModificationException();
        }
    }
}

