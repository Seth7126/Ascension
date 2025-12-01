package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.SnapshotThreadLocal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000B\u001A\b\u0010\"\u001A\u00020\bH\u0002\u001A6\u0010\"\u001A\u0002H#\"\u0004\b\u0000\u0010#2!\u0010$\u001A\u001D\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H#0\u000FH\u0002\u00A2\u0006\u0002\u0010%\u001A\'\u0010&\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\'2\u0006\u0010(\u001A\u0002H#2\u0006\u0010)\u001A\u00020\u0007H\u0001\u00A2\u0006\u0002\u0010*\u001A\b\u0010+\u001A\u00020\u0007H\u0000\u001AB\u0010,\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000F2\u0014\u0010-\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000F2\u0014\u0010.\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000FH\u0002\u001AB\u0010/\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000F2\u0014\u00100\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000F2\u0014\u0010.\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u000FH\u0002\u001A\u0018\u00101\u001A\u00020\b2\u0006\u0010)\u001A\u00020\u00072\u0006\u00102\u001A\u000203H\u0001\u001A.\u00104\u001A\u0010\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020\'\u0018\u0001052\u0006\u0010+\u001A\u0002062\u0006\u00107\u001A\u0002062\u0006\u00108\u001A\u00020\u0010H\u0002\u001A\b\u00109\u001A\u00020:H\u0002\u001A1\u0010;\u001A\u0004\u0018\u0001H#\"\b\b\u0000\u0010#*\u00020\'2\u0006\u0010(\u001A\u0002H#2\u0006\u0010<\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0010H\u0002\u00A2\u0006\u0002\u0010=\u001A%\u0010>\u001A\u0002H#\"\u0004\b\u0000\u0010#2\f\u0010$\u001A\b\u0012\u0004\u0012\u0002H#0?H\u0081\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010@\u001A>\u0010A\u001A\u0002H#\"\u0004\b\u0000\u0010#2\u0006\u0010B\u001A\u00020\u00072!\u0010$\u001A\u001D\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H#0\u000FH\u0002\u00A2\u0006\u0002\u0010C\u001A:\u0010D\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\u00072!\u0010$\u001A\u001D\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u0002H#0\u000FH\u0002\u00A2\u0006\u0002\u0010E\u001A\"\u0010F\u001A\u0004\u0018\u00010\'2\u0006\u00102\u001A\u0002032\u0006\u0010<\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0010H\u0002\u001A \u0010G\u001A\u00020H2\u0006\u0010I\u001A\u00020\'2\u0006\u0010)\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0010H\u0002\u001A \u0010G\u001A\u00020H2\u0006\u0010+\u001A\u00020\u00012\u0006\u0010J\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u0010H\u0002\u001A\u0010\u0010K\u001A\u00020\b2\u0006\u0010)\u001A\u00020\u0007H\u0002\u001A+\u0010L\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\'*\u0002H#2\u0006\u00102\u001A\u0002032\u0006\u0010)\u001A\u00020\u0007H\u0000\u00A2\u0006\u0002\u0010M\u001A+\u0010N\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\'*\u0002H#2\u0006\u00102\u001A\u0002032\u0006\u0010)\u001A\u00020\u0007H\u0000\u00A2\u0006\u0002\u0010M\u001AN\u0010O\u001A\u0002HP\"\b\b\u0000\u0010#*\u00020\'\"\u0004\b\u0001\u0010P*\u0002H#2\u0006\u00102\u001A\u0002032\u0006\u0010Q\u001A\u0002H#2\u0017\u0010$\u001A\u0013\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002HP0\u000F\u00A2\u0006\u0002\bRH\u0080\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010S\u001A3\u0010T\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\'*\u0002H#2\u0006\u00102\u001A\u0002032\u0006\u0010)\u001A\u00020\u00072\u0006\u0010Q\u001A\u0002H#H\u0000\u00A2\u0006\u0002\u0010U\u001A!\u0010;\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\'*\u0002H#2\u0006\u00102\u001A\u000203\u00A2\u0006\u0002\u0010V\u001A)\u0010;\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\'*\u0002H#2\u0006\u00102\u001A\u0002032\u0006\u0010)\u001A\u00020\u0007\u00A2\u0006\u0002\u0010M\u001AH\u0010W\u001A\u0002HP\"\b\b\u0000\u0010#*\u00020\'\"\u0004\b\u0001\u0010P*\u0002H#2!\u0010$\u001A\u001D\u0012\u0013\u0012\u0011H#\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b((\u0012\u0004\u0012\u0002HP0\u000FH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010X\u001AF\u0010Y\u001A\u0002HP\"\b\b\u0000\u0010#*\u00020\'\"\u0004\b\u0001\u0010P*\u0002H#2\u0006\u00102\u001A\u0002032\u0017\u0010$\u001A\u0013\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002HP0\u000F\u00A2\u0006\u0002\bRH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010Z\u001AN\u0010Y\u001A\u0002HP\"\b\b\u0000\u0010#*\u00020\'\"\u0004\b\u0001\u0010P*\u0002H#2\u0006\u00102\u001A\u0002032\u0006\u0010)\u001A\u00020\u00072\u0017\u0010$\u001A\u0013\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002HP0\u000F\u00A2\u0006\u0002\bRH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010[\u001A+\u0010\\\u001A\u0002H#\"\b\b\u0000\u0010#*\u00020\'*\u0002H#2\u0006\u00102\u001A\u0002032\u0006\u0010)\u001A\u00020\u0007H\u0001\u00A2\u0006\u0002\u0010M\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\",\u0010\u0002\u001A \u0012\u001C\u0012\u001A\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00040\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000\".\u0010\t\u001A\"\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000B0\u000B0\nj\u0010\u0012\f\u0012\n \f*\u0004\u0018\u00010\u000B0\u000B`\rX\u0082\u0004\u00A2\u0006\u0002\n\u0000\")\u0010\u000E\u001A\u001D\u0012\u0013\u0012\u00110\u0010\u00A2\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\b0\u000FX\u0082\u0004\u00A2\u0006\u0002\n\u0000\" \u0010\u0014\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u000F0\u0003X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u001C\u0010\u0015\u001A\u00020\u00068\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u000E\u0010\u001A\u001A\u00020\u0001X\u0082\u000E\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u001B\u001A\u00020\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000\"\u001C\u0010\u001C\u001A\u00020\u00078\u0000X\u0081\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u001D\u0010\u0017\u001A\u0004\b\u001E\u0010\u001F\"\u0014\u0010 \u001A\b\u0012\u0004\u0012\u00020\u00070!X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006]"}, d2 = {"INVALID_SNAPSHOT", "", "applyObservers", "", "Lkotlin/Function2;", "", "", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "currentGlobalSnapshot", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "emptyLambda", "Lkotlin/Function1;", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "Lkotlin/ParameterName;", "name", "invalid", "globalWriteObservers", "lock", "getLock$annotations", "()V", "getLock", "()Ljava/lang/Object;", "nextSnapshotId", "openSnapshots", "snapshotInitializer", "getSnapshotInitializer$annotations", "getSnapshotInitializer", "()Landroidx/compose/runtime/snapshots/Snapshot;", "threadSnapshot", "Landroidx/compose/runtime/SnapshotThreadLocal;", "advanceGlobalSnapshot", "T", "block", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "current", "Landroidx/compose/runtime/snapshots/StateRecord;", "r", "snapshot", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "currentSnapshot", "mergedReadObserver", "readObserver", "parentObserver", "mergedWriteObserver", "writeObserver", "notifyWrite", "state", "Landroidx/compose/runtime/snapshots/StateObject;", "optimisticMerges", "", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "readError", "", "readable", "id", "(Landroidx/compose/runtime/snapshots/StateRecord;ILandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "sync", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "takeNewGlobalSnapshot", "previousGlobalSnapshot", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "takeNewSnapshot", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "used", "valid", "", "data", "candidateSnapshot", "validateOpen", "newOverwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "newWritableRecord", "overwritable", "R", "candidate", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "overwritableRecord", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "withCurrent", "(Landroidx/compose/runtime/snapshots/StateRecord;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writable", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writableRecord", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SnapshotKt {
    private static final int INVALID_SNAPSHOT;
    private static final List applyObservers;
    private static final AtomicReference currentGlobalSnapshot;
    private static final Function1 emptyLambda;
    private static final List globalWriteObservers;
    private static final Object lock;
    private static int nextSnapshotId;
    private static SnapshotIdSet openSnapshots;
    private static final Snapshot snapshotInitializer;
    private static final SnapshotThreadLocal threadSnapshot;

    static {
        SnapshotKt.emptyLambda = SnapshotKt.emptyLambda.1.INSTANCE;
        SnapshotKt.threadSnapshot = new SnapshotThreadLocal();
        SnapshotKt.lock = new Object();
        SnapshotKt.openSnapshots = SnapshotIdSet.Companion.getEMPTY();
        SnapshotKt.nextSnapshotId = 1;
        SnapshotKt.applyObservers = new ArrayList();
        SnapshotKt.globalWriteObservers = new ArrayList();
        SnapshotKt.nextSnapshotId = 3;
        GlobalSnapshot globalSnapshot0 = new GlobalSnapshot(2, SnapshotIdSet.Companion.getEMPTY());
        SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(globalSnapshot0.getId());
        AtomicReference atomicReference0 = new AtomicReference(globalSnapshot0);
        SnapshotKt.currentGlobalSnapshot = atomicReference0;
        Object object0 = atomicReference0.get();
        Intrinsics.checkNotNullExpressionValue(object0, "currentGlobalSnapshot.get()");
        SnapshotKt.snapshotInitializer = (Snapshot)object0;
    }

    public static final int access$getNextSnapshotId$p() [...] // 潜在的解密器

    private static final Object advanceGlobalSnapshot(Function1 function10) {
        List list0;
        Object object1;
        GlobalSnapshot globalSnapshot0 = (GlobalSnapshot)SnapshotKt.currentGlobalSnapshot.get();
        synchronized(SnapshotKt.getLock()) {
            Intrinsics.checkNotNullExpressionValue(globalSnapshot0, "previousGlobalSnapshot");
            object1 = SnapshotKt.takeNewGlobalSnapshot(globalSnapshot0, function10);
        }
        Set set0 = globalSnapshot0.getModified$runtime_release();
        if(set0 != null) {
            synchronized(SnapshotKt.getLock()) {
                list0 = CollectionsKt.toMutableList(SnapshotKt.applyObservers);
            }
            int v2 = list0.size();
            if(v2 - 1 >= 0) {
                for(int v3 = 0; true; ++v3) {
                    ((Function2)list0.get(v3)).invoke(set0, globalSnapshot0);
                    if(v3 + 1 > v2 - 1) {
                        break;
                    }
                }
            }
        }
        return object1;
    }

    private static final void advanceGlobalSnapshot() {
        SnapshotKt.advanceGlobalSnapshot(androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2.INSTANCE);

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2 extends Lambda implements Function1 {
            public static final androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2 INSTANCE;

            static {
                androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2.INSTANCE = new androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2();
            }

            androidx.compose.runtime.snapshots.SnapshotKt.advanceGlobalSnapshot.2() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((SnapshotIdSet)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(SnapshotIdSet snapshotIdSet0) {
                Intrinsics.checkNotNullParameter(snapshotIdSet0, "it");
            }
        }

    }

    public static final StateRecord current(StateRecord stateRecord0, Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "r");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        StateRecord stateRecord1 = SnapshotKt.readable(stateRecord0, snapshot0.getId(), snapshot0.getInvalid$runtime_release());
        if(stateRecord1 != null) {
            return stateRecord1;
        }
        SnapshotKt.readError();
        throw new KotlinNothingValueException();
    }

    public static final Snapshot currentSnapshot() {
        Snapshot snapshot0 = (Snapshot)SnapshotKt.threadSnapshot.get();
        if(snapshot0 == null) {
            Object object0 = SnapshotKt.currentGlobalSnapshot.get();
            Intrinsics.checkNotNullExpressionValue(object0, "currentGlobalSnapshot.get()");
            return (Snapshot)object0;
        }
        return snapshot0;
    }

    public static final Object getLock() {
        return SnapshotKt.lock;
    }

    public static void getLock$annotations() {
    }

    public static final Snapshot getSnapshotInitializer() {
        return SnapshotKt.snapshotInitializer;
    }

    public static void getSnapshotInitializer$annotations() {
    }

    private static final Function1 mergedReadObserver(Function1 function10, Function1 function11) {
        if(function10 != null && function11 != null && !Intrinsics.areEqual(function10, function11)) {
            return new Function1(function10, function11) {
                final Function1 $parentObserver;
                final Function1 $readObserver;

                {
                    this.$readObserver = function10;
                    this.$parentObserver = function11;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(object0);
                    return Unit.INSTANCE;
                }

                public final void invoke(Object object0) {
                    Intrinsics.checkNotNullParameter(object0, "state");
                    this.$readObserver.invoke(object0);
                    this.$parentObserver.invoke(object0);
                }
            };
        }
        return function10 == null ? function11 : function10;
    }

    private static final Function1 mergedWriteObserver(Function1 function10, Function1 function11) {
        if(function10 != null && function11 != null && !Intrinsics.areEqual(function10, function11)) {
            return new Function1(function10, function11) {
                final Function1 $parentObserver;
                final Function1 $writeObserver;

                {
                    this.$writeObserver = function10;
                    this.$parentObserver = function11;
                    super(1);
                }

                @Override  // kotlin.jvm.functions.Function1
                public Object invoke(Object object0) {
                    this.invoke(object0);
                    return Unit.INSTANCE;
                }

                public final void invoke(Object object0) {
                    Intrinsics.checkNotNullParameter(object0, "state");
                    this.$writeObserver.invoke(object0);
                    this.$parentObserver.invoke(object0);
                }
            };
        }
        return function10 == null ? function11 : function10;
    }

    public static final StateRecord newOverwritableRecord(StateRecord stateRecord0, StateObject stateObject0, Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        StateRecord stateRecord1 = SnapshotKt.used(stateObject0, snapshot0.getId(), SnapshotKt.openSnapshots);
        if(stateRecord1 == null) {
            stateRecord1 = null;
        }
        else {
            stateRecord1.setSnapshotId$runtime_release(0x7FFFFFFF);
        }
        if(stateRecord1 == null) {
            stateRecord1 = stateRecord0.create();
            stateRecord1.setSnapshotId$runtime_release(0x7FFFFFFF);
            stateRecord1.setNext$runtime_release(stateObject0.getFirstStateRecord());
            stateObject0.prependStateRecord(stateRecord1);
        }
        return stateRecord1;
    }

    public static final StateRecord newWritableRecord(StateRecord stateRecord0, StateObject stateObject0, Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        StateRecord stateRecord1 = SnapshotKt.newOverwritableRecord(stateRecord0, stateObject0, snapshot0);
        stateRecord1.assign(stateRecord0);
        stateRecord1.setSnapshotId$runtime_release(snapshot0.getId());
        return stateRecord1;
    }

    public static final void notifyWrite(Snapshot snapshot0, StateObject stateObject0) {
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Function1 function10 = snapshot0.getWriteObserver$runtime_release();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
    }

    private static final Map optimisticMerges(MutableSnapshot mutableSnapshot0, MutableSnapshot mutableSnapshot1, SnapshotIdSet snapshotIdSet0) {
        Set set0 = mutableSnapshot1.getModified$runtime_release();
        int v = mutableSnapshot0.getId();
        if(set0 == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSet1 = mutableSnapshot1.getInvalid$runtime_release().set(mutableSnapshot1.getId()).or(mutableSnapshot1.getPreviousIds$runtime_release());
        HashMap hashMap0 = null;
        for(Object object0: set0) {
            StateObject stateObject0 = (StateObject)object0;
            StateRecord stateRecord0 = stateObject0.getFirstStateRecord();
            StateRecord stateRecord1 = SnapshotKt.readable(stateRecord0, v, snapshotIdSet0);
            if(stateRecord1 == null) {
                continue;
            }
            StateRecord stateRecord2 = SnapshotKt.readable(stateRecord0, v, snapshotIdSet1);
            if(stateRecord2 == null || Intrinsics.areEqual(stateRecord1, stateRecord2)) {
                continue;
            }
            StateRecord stateRecord3 = SnapshotKt.readable(stateRecord0, mutableSnapshot1.getId(), mutableSnapshot1.getInvalid$runtime_release());
            if(stateRecord3 != null) {
                StateRecord stateRecord4 = stateObject0.mergeRecords(stateRecord2, stateRecord1, stateRecord3);
                if(stateRecord4 != null) {
                    Map map0 = hashMap0;
                    if(map0 == null) {
                        hashMap0 = new HashMap();
                        map0 = hashMap0;
                    }
                    map0.put(stateRecord1, stateRecord4);
                    continue;
                }
                return null;
            }
            SnapshotKt.readError();
            throw new KotlinNothingValueException();
        }
        return hashMap0;
    }

    public static final Object overwritable(StateRecord stateRecord0, StateObject stateObject0, StateRecord stateRecord1, Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(stateRecord1, "candidate");
        Intrinsics.checkNotNullParameter(function10, "block");
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            object1 = function10.invoke(SnapshotKt.overwritableRecord(stateRecord0, stateObject0, snapshot0, stateRecord1));
        }
        SnapshotKt.notifyWrite(snapshot0, stateObject0);
        return object1;
    }

    public static final StateRecord overwritableRecord(StateRecord stateRecord0, StateObject stateObject0, Snapshot snapshot0, StateRecord stateRecord1) {
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        Intrinsics.checkNotNullParameter(stateRecord1, "candidate");
        if(snapshot0.getReadOnly()) {
            snapshot0.recordModified$runtime_release(stateObject0);
        }
        int v = snapshot0.getId();
        if(stateRecord1.getSnapshotId$runtime_release() == v) {
            return stateRecord1;
        }
        StateRecord stateRecord2 = SnapshotKt.newOverwritableRecord(stateRecord0, stateObject0, snapshot0);
        stateRecord2.setSnapshotId$runtime_release(v);
        snapshot0.recordModified$runtime_release(stateObject0);
        return stateRecord2;
    }

    // 去混淆评级： 低(20)
    private static final Void readError() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    private static final StateRecord readable(StateRecord stateRecord0, int v, SnapshotIdSet snapshotIdSet0) {
        StateRecord stateRecord1 = null;
        while(stateRecord0 != null) {
            if(SnapshotKt.valid(stateRecord0, v, snapshotIdSet0) && (stateRecord1 == null || stateRecord1.getSnapshotId$runtime_release() < stateRecord0.getSnapshotId$runtime_release())) {
                stateRecord1 = stateRecord0;
            }
            stateRecord0 = stateRecord0.getNext$runtime_release();
        }
        return stateRecord1 == null ? null : stateRecord1;
    }

    public static final StateRecord readable(StateRecord stateRecord0, StateObject stateObject0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        return SnapshotKt.readable(stateRecord0, stateObject0, SnapshotKt.currentSnapshot());
    }

    public static final StateRecord readable(StateRecord stateRecord0, StateObject stateObject0, Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        Function1 function10 = snapshot0.getReadObserver$runtime_release();
        if(function10 != null) {
            function10.invoke(stateObject0);
        }
        StateRecord stateRecord1 = SnapshotKt.readable(stateRecord0, snapshot0.getId(), snapshot0.getInvalid$runtime_release());
        if(stateRecord1 != null) {
            return stateRecord1;
        }
        SnapshotKt.readError();
        throw new KotlinNothingValueException();
    }

    public static final Object sync(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        synchronized(SnapshotKt.getLock()) {
            return function00.invoke();
        }
    }

    private static final Object takeNewGlobalSnapshot(Snapshot snapshot0, Function1 function10) {
        Object object0 = function10.invoke(SnapshotKt.openSnapshots.clear(snapshot0.getId()));
        synchronized(SnapshotKt.getLock()) {
            SnapshotKt.nextSnapshotId = 3;
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.clear(snapshot0.getId());
            GlobalSnapshot globalSnapshot0 = new GlobalSnapshot(2, SnapshotKt.openSnapshots);
            SnapshotKt.currentGlobalSnapshot.set(globalSnapshot0);
            SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(2);
            return object0;
        }
    }

    private static final Snapshot takeNewSnapshot(Function1 function10) {
        return (Snapshot)SnapshotKt.advanceGlobalSnapshot(new Function1(function10) {
            final Function1 $block;

            {
                this.$block = function10;
                super(1);
            }

            public final Snapshot invoke(SnapshotIdSet snapshotIdSet0) {
                Intrinsics.checkNotNullParameter(snapshotIdSet0, "invalid");
                Snapshot snapshot0 = (Snapshot)this.$block.invoke(snapshotIdSet0);
                synchronized(SnapshotKt.getLock()) {
                    SnapshotKt.openSnapshots = SnapshotKt.openSnapshots.set(snapshot0.getId());
                    return snapshot0;
                }
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((SnapshotIdSet)object0));
            }
        });
    }

    private static final StateRecord used(StateObject stateObject0, int v, SnapshotIdSet snapshotIdSet0) {
        StateRecord stateRecord0 = stateObject0.getFirstStateRecord();
        int v1 = snapshotIdSet0.lowest(v);
        StateRecord stateRecord1 = null;
        while(stateRecord0 != null) {
            if(stateRecord0.getSnapshotId$runtime_release() == 0) {
                return stateRecord0;
            }
            if(SnapshotKt.valid(stateRecord0, v1, snapshotIdSet0)) {
                if(stateRecord1 == null) {
                    stateRecord1 = stateRecord0;
                    goto label_11;
                }
                return stateRecord0.getSnapshotId$runtime_release() < stateRecord1.getSnapshotId$runtime_release() ? stateRecord0 : stateRecord1;
            }
        label_11:
            stateRecord0 = stateRecord0.getNext$runtime_release();
        }
        return null;
    }

    private static final boolean valid(int v, int v1, SnapshotIdSet snapshotIdSet0) {
        return v1 != 0 && v1 <= v && !snapshotIdSet0.get(v1);
    }

    private static final boolean valid(StateRecord stateRecord0, int v, SnapshotIdSet snapshotIdSet0) {
        return SnapshotKt.valid(v, stateRecord0.getSnapshotId$runtime_release(), snapshotIdSet0);
    }

    private static final void validateOpen(Snapshot snapshot0) {
        if(!SnapshotKt.openSnapshots.get(snapshot0.getId())) {
            throw new IllegalStateException("Snapshot is not open");
        }
    }

    public static final Object withCurrent(StateRecord stateRecord0, Function1 function10) {
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        return function10.invoke(SnapshotKt.current(stateRecord0, Snapshot.Companion.getCurrent()));
    }

    public static final Object writable(StateRecord stateRecord0, StateObject stateObject0, Snapshot snapshot0, Function1 function10) {
        Object object1;
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        Intrinsics.checkNotNullParameter(function10, "block");
        synchronized(SnapshotKt.getLock()) {
            object1 = function10.invoke(SnapshotKt.writableRecord(stateRecord0, stateObject0, snapshot0));
        }
        SnapshotKt.notifyWrite(snapshot0, stateObject0);
        return object1;
    }

    public static final Object writable(StateRecord stateRecord0, StateObject stateObject0, Function1 function10) {
        Object object1;
        Snapshot snapshot0;
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(function10, "block");
        synchronized(SnapshotKt.getLock()) {
            snapshot0 = Snapshot.Companion.getCurrent();
            object1 = function10.invoke(SnapshotKt.writableRecord(stateRecord0, stateObject0, snapshot0));
        }
        SnapshotKt.notifyWrite(snapshot0, stateObject0);
        return object1;
    }

    public static final StateRecord writableRecord(StateRecord stateRecord0, StateObject stateObject0, Snapshot snapshot0) {
        Intrinsics.checkNotNullParameter(stateRecord0, "<this>");
        Intrinsics.checkNotNullParameter(stateObject0, "state");
        Intrinsics.checkNotNullParameter(snapshot0, "snapshot");
        if(snapshot0.getReadOnly()) {
            snapshot0.recordModified$runtime_release(stateObject0);
        }
        StateRecord stateRecord1 = SnapshotKt.readable(stateRecord0, snapshot0.getId(), snapshot0.getInvalid$runtime_release());
        if(stateRecord1 != null) {
            if(stateRecord1.getSnapshotId$runtime_release() == snapshot0.getId()) {
                return stateRecord1;
            }
            StateRecord stateRecord2 = SnapshotKt.newWritableRecord(stateRecord0, stateObject0, snapshot0);
            snapshot0.recordModified$runtime_release(stateObject0);
            return stateRecord2;
        }
        SnapshotKt.readError();
        throw new KotlinNothingValueException();
    }
}

