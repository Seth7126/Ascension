package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001B\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\u0002\u0010\u0007J\u001A\u0010\u001F\u001A\u0004\u0018\u00010\u00042\u0006\u0010 \u001A\u00020\u00062\b\u0010!\u001A\u0004\u0018\u00010\u0001J\u000E\u0010\"\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0004J\u000E\u0010$\u001A\u00020%2\u0006\u0010#\u001A\u00020\u0004J\u0016\u0010&\u001A\u00020\'2\u0006\u0010#\u001A\u00020\u00042\u0006\u0010(\u001A\u00020\u0006J\u001E\u0010)\u001A\u00020\'2\u0006\u0010*\u001A\u00020\u00062\u0006\u0010+\u001A\u00020\u00062\u0006\u0010,\u001A\u00020\u0006J\u0016\u0010-\u001A\u00020\'2\u0006\u0010*\u001A\u00020\u00062\u0006\u0010+\u001A\u00020\u0006J\u000E\u0010.\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0004J\u0016\u0010/\u001A\u00020%2\u0006\u00100\u001A\u00020\u00062\u0006\u00101\u001A\u00020\u0006J\u000E\u00102\u001A\u00020\u00062\u0006\u0010#\u001A\u00020\u0004R\u001A\u0010\b\u001A\u00020\u0006X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR*\u0010\r\u001A\u001E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000F0\u000Ej\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000F`\u0010X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012RW\u0010\u0013\u001A>\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u00150\u000Ej\u001E\u0012\u0004\u0012\u00020\u0001\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0014j\b\u0012\u0004\u0012\u00020\u0004`\u0015`\u00108FX\u0086\u0084\u0002\u00A2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0005\u001A\u00020\u0006\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\nR\u0017\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00040\u001C8F\u00A2\u0006\u0006\u001A\u0004\b\u001D\u0010\u0012R\u0014\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u00063"}, d2 = {"Landroidx/compose/runtime/Pending;", "", "keyInfos", "", "Landroidx/compose/runtime/KeyInfo;", "startIndex", "", "(Ljava/util/List;I)V", "groupIndex", "getGroupIndex", "()I", "setGroupIndex", "(I)V", "groupInfos", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupInfo;", "Lkotlin/collections/HashMap;", "getKeyInfos", "()Ljava/util/List;", "keyMap", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "getKeyMap", "()Ljava/util/HashMap;", "keyMap$delegate", "Lkotlin/Lazy;", "getStartIndex", "used", "", "getUsed", "usedKeys", "getNext", "key", "dataKey", "nodePositionOf", "keyInfo", "recordUsed", "", "registerInsert", "", "insertIndex", "registerMoveNode", "from", "to", "count", "registerMoveSlot", "slotPositionOf", "updateNodeCount", "group", "newCount", "updatedNodeCountOf", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class Pending {
    private int groupIndex;
    private final HashMap groupInfos;
    private final List keyInfos;
    private final Lazy keyMap$delegate;
    private final int startIndex;
    private final List usedKeys;

    static {
    }

    public Pending(List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "keyInfos");
        super();
        this.keyInfos = list0;
        this.startIndex = v;
        if(v < 0) {
            throw new IllegalArgumentException("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        HashMap hashMap0 = new HashMap();
        int v2 = this.getKeyInfos().size();
        if(v2 > 0) {
            int v3 = 0;
            for(int v1 = 0; true; ++v1) {
                KeyInfo keyInfo0 = (KeyInfo)this.getKeyInfos().get(v1);
                hashMap0.put(keyInfo0.getLocation(), new GroupInfo(v1, v3, keyInfo0.getNodes()));
                v3 += keyInfo0.getNodes();
                if(v1 + 1 >= v2) {
                    break;
                }
            }
        }
        this.groupInfos = hashMap0;
        this.keyMap$delegate = LazyKt.lazy(new Function0() {
            {
                Pending.this = pending0;
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }

            public final HashMap invoke() {
                HashMap hashMap0 = ComposerKt.multiMap();
                Pending pending0 = Pending.this;
                int v = pending0.getKeyInfos().size();
                if(v > 0) {
                    for(int v1 = 0; true; ++v1) {
                        KeyInfo keyInfo0 = (KeyInfo)pending0.getKeyInfos().get(v1);
                        ComposerKt.put(hashMap0, ComposerKt.getJoinedKey(keyInfo0), keyInfo0);
                        if(v1 + 1 >= v) {
                            break;
                        }
                    }
                }
                return hashMap0;
            }
        });
    }

    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List getKeyInfos() {
        return this.keyInfos;
    }

    public final HashMap getKeyMap() {
        return (HashMap)this.keyMap$delegate.getValue();
    }

    public final KeyInfo getNext(int v, Object object0) {
        if(object0 != null) {
            JoinedKey joinedKey0 = new JoinedKey(v, object0);
            return (KeyInfo)ComposerKt.pop(this.getKeyMap(), joinedKey0);
        }
        return (KeyInfo)ComposerKt.pop(this.getKeyMap(), v);
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List getUsed() {
        return this.usedKeys;
    }

    public final int nodePositionOf(KeyInfo keyInfo0) {
        Intrinsics.checkNotNullParameter(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = (GroupInfo)this.groupInfos.get(keyInfo0.getLocation());
        return groupInfo0 == null ? -1 : groupInfo0.getNodeIndex();
    }

    public final boolean recordUsed(KeyInfo keyInfo0) {
        Intrinsics.checkNotNullParameter(keyInfo0, "keyInfo");
        return this.usedKeys.add(keyInfo0);
    }

    public final void registerInsert(KeyInfo keyInfo0, int v) {
        Intrinsics.checkNotNullParameter(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = new GroupInfo(-1, v, 0);
        this.groupInfos.put(keyInfo0.getLocation(), groupInfo0);
    }

    public final void registerMoveNode(int v, int v1, int v2) {
        if(v > v1) {
            Collection collection0 = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(collection0, "groupInfos.values");
            for(Object object0: collection0) {
                GroupInfo groupInfo0 = (GroupInfo)object0;
                int v3 = groupInfo0.getNodeIndex();
                if(v <= v3 && v3 < v + v2) {
                    groupInfo0.setNodeIndex(v3 - v + v1);
                }
                else if(v1 <= v3 && v3 < v) {
                    groupInfo0.setNodeIndex(v3 + v2);
                }
            }
            return;
        }
        if(v1 > v) {
            Collection collection1 = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(collection1, "groupInfos.values");
            for(Object object1: collection1) {
                GroupInfo groupInfo1 = (GroupInfo)object1;
                int v4 = groupInfo1.getNodeIndex();
                if(v <= v4 && v4 < v + v2) {
                    groupInfo1.setNodeIndex(v4 - v + v1);
                }
                else if(v + 1 <= v4 && v4 < v1) {
                    groupInfo1.setNodeIndex(v4 - v2);
                }
            }
        }
    }

    public final void registerMoveSlot(int v, int v1) {
        if(v > v1) {
            Collection collection0 = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(collection0, "groupInfos.values");
            for(Object object0: collection0) {
                GroupInfo groupInfo0 = (GroupInfo)object0;
                int v2 = groupInfo0.getSlotIndex();
                if(v2 == v) {
                    groupInfo0.setSlotIndex(v1);
                }
                else if(v1 <= v2 && v2 < v) {
                    groupInfo0.setSlotIndex(v2 + 1);
                }
            }
            return;
        }
        if(v1 > v) {
            Collection collection1 = this.groupInfos.values();
            Intrinsics.checkNotNullExpressionValue(collection1, "groupInfos.values");
            for(Object object1: collection1) {
                GroupInfo groupInfo1 = (GroupInfo)object1;
                int v3 = groupInfo1.getSlotIndex();
                if(v3 == v) {
                    groupInfo1.setSlotIndex(v1);
                }
                else if(v + 1 <= v3 && v3 < v1) {
                    groupInfo1.setSlotIndex(v3 - 1);
                }
            }
        }
    }

    public final void setGroupIndex(int v) {
        this.groupIndex = v;
    }

    public final int slotPositionOf(KeyInfo keyInfo0) {
        Intrinsics.checkNotNullParameter(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = (GroupInfo)this.groupInfos.get(keyInfo0.getLocation());
        return groupInfo0 == null ? -1 : groupInfo0.getSlotIndex();
    }

    public final boolean updateNodeCount(int v, int v1) {
        GroupInfo groupInfo0 = (GroupInfo)this.groupInfos.get(v);
        if(groupInfo0 != null) {
            int v2 = groupInfo0.getNodeIndex();
            int v3 = v1 - groupInfo0.getNodeCount();
            groupInfo0.setNodeCount(v1);
            if(v3 != 0) {
                Collection collection0 = this.groupInfos.values();
                Intrinsics.checkNotNullExpressionValue(collection0, "groupInfos.values");
                for(Object object0: collection0) {
                    GroupInfo groupInfo1 = (GroupInfo)object0;
                    if(groupInfo1.getNodeIndex() >= v2 && !Intrinsics.areEqual(groupInfo1, groupInfo0)) {
                        groupInfo1.setNodeIndex(groupInfo1.getNodeIndex() + v3);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int updatedNodeCountOf(KeyInfo keyInfo0) {
        Intrinsics.checkNotNullParameter(keyInfo0, "keyInfo");
        GroupInfo groupInfo0 = (GroupInfo)this.groupInfos.get(keyInfo0.getLocation());
        return groupInfo0 == null ? keyInfo0.getNodes() : groupInfo0.getNodeCount();
    }
}

