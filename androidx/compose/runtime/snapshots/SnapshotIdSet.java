package androidx.compose.runtime.snapshots;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B)\b\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000E\u0010\n\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0000J\u000E\u0010\f\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\u0002J\u000E\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\r\u001A\u00020\u0002J\u000F\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002J\u000E\u0010\u0012\u001A\u00020\u00022\u0006\u0010\u0013\u001A\u00020\u0002J\u000E\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u000B\u001A\u00020\u0000J\u000E\u0010\u0015\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\u0002J\b\u0010\u0016\u001A\u00020\u0017H\u0016R\u0010\u0010\u0007\u001A\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "", "", "upperSet", "", "lowerSet", "lowerBound", "belowBound", "", "(JJI[I)V", "andNot", "bits", "clear", "bit", "get", "", "iterator", "", "lowest", "default", "or", "set", "toString", "", "Companion", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotIdSet implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "getEMPTY", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final SnapshotIdSet getEMPTY() {
            return SnapshotIdSet.EMPTY;
        }
    }

    public static final Companion Companion;
    private static final SnapshotIdSet EMPTY;
    private final int[] belowBound;
    private final int lowerBound;
    private final long lowerSet;
    private final long upperSet;

    static {
        SnapshotIdSet.Companion = new Companion(null);
        SnapshotIdSet.EMPTY = new SnapshotIdSet(0L, 0L, 0, null);
    }

    private SnapshotIdSet(long v, long v1, int v2, int[] arr_v) {
        this.upperSet = v;
        this.lowerSet = v1;
        this.lowerBound = v2;
        this.belowBound = arr_v;
    }

    public final SnapshotIdSet andNot(SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "bits");
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.EMPTY;
        if(snapshotIdSet0 == snapshotIdSet1) {
            return this;
        }
        if(this == snapshotIdSet1) {
            return snapshotIdSet1;
        }
        int v = this.lowerBound;
        if(snapshotIdSet0.lowerBound == v) {
            int[] arr_v = this.belowBound;
            if(snapshotIdSet0.belowBound == arr_v) {
                return new SnapshotIdSet(this.upperSet & ~snapshotIdSet0.upperSet, this.lowerSet & ~snapshotIdSet0.lowerSet, v, arr_v);
            }
        }
        SnapshotIdSet snapshotIdSet2 = this;
        for(Object object0: snapshotIdSet0) {
            snapshotIdSet2 = snapshotIdSet2.clear(((Number)object0).intValue());
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet clear(int v) {
        int v1 = this.lowerBound;
        int v2 = v - v1;
        if(v2 >= 0 && v2 < 0x40) {
            return (this.lowerSet & 1L << v2) == 0L ? this : new SnapshotIdSet(this.upperSet, this.lowerSet & ~(1L << v2), v1, this.belowBound);
        }
        if(v2 >= 0x40 && v2 < 0x80) {
            long v3 = 1L << v2 - 0x40;
            return (this.upperSet & v3) == 0L ? this : new SnapshotIdSet(this.upperSet & ~v3, this.lowerSet, v1, this.belowBound);
        }
        if(v2 < 0) {
            int[] arr_v = this.belowBound;
            if(arr_v != null) {
                int v4 = SnapshotIdSetKt.binarySearch(arr_v, v);
                if(v4 >= 0) {
                    int v5 = arr_v.length - 1;
                    if(v5 == 0) {
                        return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, null);
                    }
                    int[] arr_v1 = new int[v5];
                    if(v4 > 0) {
                        ArraysKt.copyInto(arr_v, arr_v1, 0, 0, v4);
                    }
                    if(v4 < v5) {
                        ArraysKt.copyInto(arr_v, arr_v1, v4, v4 + 1, v5 + 1);
                    }
                    return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, arr_v1);
                }
            }
        }
        return this;
    }

    public final boolean get(int v) {
        int v1 = v - this.lowerBound;
        if(v1 >= 0 && v1 < 0x40) {
            return (1L << v1 & this.lowerSet) != 0L;
        }
        if(v1 >= 0x40 && v1 < 0x80) {
            return (1L << v1 - 0x40 & this.upperSet) != 0L;
        }
        return v1 <= 0 ? this.belowBound != null && SnapshotIdSetKt.binarySearch(this.belowBound, v) >= 0 : false;
    }

    @Override
    public Iterator iterator() {
        return SequencesKt.sequence(new Function2(null) {
            int I$0;
            int I$1;
            private Object L$0;
            Object L$1;
            int label;

            {
                SnapshotIdSet.this = snapshotIdSet0;
                super(2, continuation0);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object object0, Continuation continuation0) {
                androidx.compose.runtime.snapshots.SnapshotIdSet.iterator.1 snapshotIdSet$iterator$10 = new androidx.compose.runtime.snapshots.SnapshotIdSet.iterator.1(SnapshotIdSet.this, continuation0);
                snapshotIdSet$iterator$10.L$0 = object0;
                return snapshotIdSet$iterator$10;
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((SequenceScope)object0), ((Continuation)object1));
            }

            public final Object invoke(SequenceScope sequenceScope0, Continuation continuation0) {
                return ((androidx.compose.runtime.snapshots.SnapshotIdSet.iterator.1)this.create(sequenceScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
            }

            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object object0) {
                int v6;
                int v4;
                SequenceScope sequenceScope3;
                int v3;
                SequenceScope sequenceScope2;
                int v1;
                int[] arr_v1;
                int v;
                SequenceScope sequenceScope1;
                SequenceScope sequenceScope0;
                Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch(this.label) {
                    case 0: {
                        ResultKt.throwOnFailure(object0);
                        sequenceScope0 = (SequenceScope)this.L$0;
                        int[] arr_v = SnapshotIdSet.this.belowBound;
                        if(arr_v != null) {
                            sequenceScope1 = sequenceScope0;
                            v = arr_v.length;
                            arr_v1 = arr_v;
                            v1 = 0;
                            goto label_17;
                        }
                        goto label_29;
                    }
                    case 1: {
                        v = this.I$1;
                        v1 = this.I$0;
                        arr_v1 = (int[])this.L$1;
                        sequenceScope1 = (SequenceScope)this.L$0;
                        ResultKt.throwOnFailure(object0);
                    label_17:
                        while(v1 < v) {
                            int v2 = arr_v1[v1];
                            ++v1;
                            this.L$0 = sequenceScope1;
                            this.L$1 = arr_v1;
                            this.I$0 = v1;
                            this.I$1 = v;
                            this.label = 1;
                            if(sequenceScope1.yield(Boxing.boxInt(v2), this) == object1) {
                                return object1;
                            }
                            if(false) {
                                break;
                            }
                        }
                        sequenceScope0 = sequenceScope1;
                    label_29:
                        if(SnapshotIdSet.this.lowerSet == 0L) {
                            goto label_38;
                        }
                        else {
                            sequenceScope2 = sequenceScope0;
                            v3 = 0;
                            goto label_42;
                        }
                        break;
                    }
                    case 2: {
                        v3 = this.I$0;
                        sequenceScope2 = (SequenceScope)this.L$0;
                        ResultKt.throwOnFailure(object0);
                        while(true) {
                            if(v3 >= 0x40) {
                                sequenceScope0 = sequenceScope2;
                            label_38:
                                if(SnapshotIdSet.this.upperSet == 0L) {
                                    return Unit.INSTANCE;
                                }
                                sequenceScope3 = sequenceScope0;
                                v4 = 0;
                                goto label_58;
                            }
                        label_42:
                            if((SnapshotIdSet.this.lowerSet & 1L << v3) != 0L) {
                                this.L$0 = sequenceScope2;
                                this.L$1 = null;
                                this.I$0 = v3 + 1;
                                this.label = 2;
                                if(sequenceScope2.yield(Boxing.boxInt(v3 + SnapshotIdSet.this.lowerBound), this) == object1) {
                                    return object1;
                                }
                            }
                            ++v3;
                        }
                    }
                    case 3: {
                        int v5 = this.I$0;
                        sequenceScope3 = (SequenceScope)this.L$0;
                        ResultKt.throwOnFailure(object0);
                        v6 = v5;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                    }
                }
                do {
                    do {
                        v4 = v6;
                        if(v4 >= 0x40) {
                            return Unit.INSTANCE;
                        }
                    label_58:
                        v6 = v4 + 1;
                    }
                    while((SnapshotIdSet.this.upperSet & 1L << v4) == 0L);
                    this.L$0 = sequenceScope3;
                    this.L$1 = null;
                    this.I$0 = v6;
                    this.label = 3;
                }
                while(sequenceScope3.yield(Boxing.boxInt(v4 + 0x40 + SnapshotIdSet.this.lowerBound), this) != object1);
                return object1;
            }
        }).iterator();
    }

    public final int lowest(int v) {
        int[] arr_v = this.belowBound;
        if(arr_v != null) {
            return arr_v[0];
        }
        long v1 = this.lowerSet;
        if(v1 != 0L) {
            return this.lowerBound + SnapshotIdSetKt.lowestBitOf(v1);
        }
        return this.upperSet == 0L ? v : this.lowerBound + 0x40 + SnapshotIdSetKt.lowestBitOf(this.upperSet);
    }

    public final SnapshotIdSet or(SnapshotIdSet snapshotIdSet0) {
        Intrinsics.checkNotNullParameter(snapshotIdSet0, "bits");
        SnapshotIdSet snapshotIdSet1 = SnapshotIdSet.EMPTY;
        if(snapshotIdSet0 == snapshotIdSet1) {
            return this;
        }
        if(this == snapshotIdSet1) {
            return snapshotIdSet0;
        }
        int v = this.lowerBound;
        if(snapshotIdSet0.lowerBound == v) {
            int[] arr_v = this.belowBound;
            if(snapshotIdSet0.belowBound == arr_v) {
                return new SnapshotIdSet(this.upperSet | snapshotIdSet0.upperSet, this.lowerSet | snapshotIdSet0.lowerSet, v, arr_v);
            }
        }
        if(this.belowBound == null) {
            for(Object object0: this) {
                snapshotIdSet0 = snapshotIdSet0.set(((Number)object0).intValue());
            }
            return snapshotIdSet0;
        }
        SnapshotIdSet snapshotIdSet2 = this;
        for(Object object1: snapshotIdSet0) {
            snapshotIdSet2 = snapshotIdSet2.set(((Number)object1).intValue());
        }
        return snapshotIdSet2;
    }

    public final SnapshotIdSet set(int v) {
        int v1 = this.lowerBound;
        int v2 = v - v1;
        if(v2 >= 0 && v2 < 0x40) {
            return (this.lowerSet & 1L << v2) == 0L ? new SnapshotIdSet(this.upperSet, this.lowerSet | 1L << v2, v1, this.belowBound) : this;
        }
        if(v2 >= 0x40 && v2 < 0x80) {
            long v3 = 1L << v2 - 0x40;
            return (this.upperSet & v3) == 0L ? new SnapshotIdSet(this.upperSet | v3, this.lowerSet, v1, this.belowBound) : this;
        }
        if(v2 < 0x80) {
            int[] arr_v2 = this.belowBound;
            if(arr_v2 == null) {
                return new SnapshotIdSet(this.upperSet, this.lowerSet, v1, new int[]{v});
            }
            int v11 = SnapshotIdSetKt.binarySearch(arr_v2, v);
            if(v11 < 0) {
                int[] arr_v3 = new int[arr_v2.length + 1];
                ArraysKt.copyInto(arr_v2, arr_v3, 0, 0, -(v11 + 1));
                ArraysKt.copyInto(arr_v2, arr_v3, -v11, -(v11 + 1), arr_v2.length);
                arr_v3[-(v11 + 1)] = v;
                return new SnapshotIdSet(this.upperSet, this.lowerSet, this.lowerBound, arr_v3);
            }
        }
        else if(!this.get(v)) {
            int v4 = this.lowerBound;
            int v5 = (v + 1) / 0x40 * 0x40;
            long v6 = this.lowerSet;
            long v7 = this.upperSet;
            List list0 = null;
            while(v4 < v5) {
                if(v6 != 0L) {
                    if(list0 == null) {
                        list0 = new ArrayList();
                        int[] arr_v = this.belowBound;
                        if(arr_v != null) {
                            int v8 = arr_v.length;
                            for(int v9 = 0; v9 < v8; ++v9) {
                                list0.add(((int)arr_v[v9]));
                            }
                        }
                    }
                    for(int v10 = 0; v10 < 0x40; ++v10) {
                        if((1L << v10 & v6) != 0L) {
                            list0.add(((int)(v10 + v4)));
                        }
                    }
                }
                if(v7 == 0L) {
                    v4 = v5;
                    v6 = 0L;
                    break;
                }
                v4 += 0x40;
                v6 = v7;
                v7 = 0L;
            }
            int[] arr_v1 = list0 == null ? null : CollectionsKt.toIntArray(list0);
            return arr_v1 == null ? new SnapshotIdSet(v7, v6, v4, this.belowBound).set(v) : new SnapshotIdSet(v7, v6, v4, arr_v1).set(v);
        }
        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        stringBuilder0.append(" [");
        ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(this, 10));
        for(Object object0: this) {
            arrayList0.add(String.valueOf(((Number)object0).intValue()));
        }
        stringBuilder0.append(ListUtilsKt.fastJoinToString$default(arrayList0, null, null, null, 0, null, null, 0x3F, null));
        stringBuilder0.append(']');
        return stringBuilder0.toString();
    }
}

