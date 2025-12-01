package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006:\u0001bB\u001D\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u000B\u00A2\u0006\u0002\u0010\fJ\u0019\u0010&\u001A\u00020\'2\u0006\u0010(\u001A\u00020\u0003H\u0082@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010)J\u0010\u0010*\u001A\u00020\'2\u0006\u0010+\u001A\u00020,H\u0002J\b\u0010-\u001A\u00020\'H\u0002J\u001F\u0010.\u001A\u00020\'2\f\u0010/\u001A\b\u0012\u0004\u0012\u00028\u000000H\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0002\u00101J\u0010\u00102\u001A\u00020\'2\u0006\u00103\u001A\u00020\u0012H\u0002J\b\u00104\u001A\u00020\u0003H\u0014J\u001D\u00105\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000E2\u0006\u00106\u001A\u00020\bH\u0014\u00A2\u0006\u0002\u00107J\b\u00108\u001A\u00020\'H\u0002J\u0019\u00109\u001A\u00020\'2\u0006\u0010:\u001A\u00028\u0000H\u0096@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010;J\u0019\u0010<\u001A\u00020\'2\u0006\u0010:\u001A\u00028\u0000H\u0082@\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010;J\u0012\u0010=\u001A\u00020\'2\b\u0010>\u001A\u0004\u0018\u00010\u000FH\u0002J1\u0010?\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\'\u0018\u00010@0\u000E2\u0014\u0010A\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\'\u0018\u00010@0\u000EH\u0002\u00A2\u0006\u0002\u0010BJ&\u0010C\u001A\b\u0012\u0004\u0012\u00028\u00000D2\u0006\u0010E\u001A\u00020F2\u0006\u0010G\u001A\u00020\b2\u0006\u0010\n\u001A\u00020\u000BH\u0016J\u0012\u0010H\u001A\u0004\u0018\u00010\u000F2\u0006\u0010I\u001A\u00020\u0012H\u0002J7\u0010J\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u000F0\u000E2\u0010\u0010K\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u000F\u0018\u00010\u000E2\u0006\u0010L\u001A\u00020\b2\u0006\u0010M\u001A\u00020\bH\u0002\u00A2\u0006\u0002\u0010NJ\b\u0010O\u001A\u00020\'H\u0016J\u0015\u0010P\u001A\u00020Q2\u0006\u0010:\u001A\u00028\u0000H\u0016\u00A2\u0006\u0002\u0010RJ\u0015\u0010S\u001A\u00020Q2\u0006\u0010:\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010RJ\u0015\u0010T\u001A\u00020Q2\u0006\u0010:\u001A\u00028\u0000H\u0002\u00A2\u0006\u0002\u0010RJ\u0010\u0010U\u001A\u00020\u00122\u0006\u0010(\u001A\u00020\u0003H\u0002J\u0012\u0010V\u001A\u0004\u0018\u00010\u000F2\u0006\u0010(\u001A\u00020\u0003H\u0002J(\u0010W\u001A\u00020\'2\u0006\u0010X\u001A\u00020\u00122\u0006\u0010Y\u001A\u00020\u00122\u0006\u0010Z\u001A\u00020\u00122\u0006\u0010[\u001A\u00020\u0012H\u0002J%\u0010\\\u001A\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\'\u0018\u00010@0\u000E2\u0006\u0010]\u001A\u00020\u0012H\u0000\u00A2\u0006\u0004\b^\u0010_J\r\u0010`\u001A\u00020\u0012H\u0000\u00A2\u0006\u0002\baR\u001A\u0010\r\u001A\f\u0012\u0006\u0012\u0004\u0018\u00010\u000F\u0018\u00010\u000EX\u0082\u000E\u00A2\u0006\u0004\n\u0002\u0010\u0010R\u000E\u0010\t\u001A\u00020\bX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001A\u00020\u00128BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014R\u000E\u0010\u0015\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001A\u00020\u00128BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0014R\u000E\u0010\u0018\u001A\u00020\u0012X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001A\u00020\u00128BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\u0014R\u000E\u0010\u001B\u001A\u00020\bX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00000\u001D8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u001FR\u000E\u0010 \u001A\u00020\u0012X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010!\u001A\u00020\b8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b\"\u0010#R\u0014\u0010$\u001A\u00020\b8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b%\u0010#\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u0006c"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", "T", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "replay", "", "bufferCapacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(IILkotlinx/coroutines/channels/BufferOverflow;)V", "buffer", "", "", "[Ljava/lang/Object;", "bufferEndIndex", "", "getBufferEndIndex", "()J", "bufferSize", "head", "getHead", "minCollectorIndex", "queueEndIndex", "getQueueEndIndex", "queueSize", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "replayIndex", "replaySize", "getReplaySize", "()I", "totalSize", "getTotalSize", "awaitValue", "", "slot", "(Lkotlinx/coroutines/flow/SharedFlowSlot;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelEmitter", "emitter", "Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "cleanupTailLocked", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "correctCollectorIndexesOnDropOldest", "newHead", "createSlot", "createSlotArray", "size", "(I)[Lkotlinx/coroutines/flow/SharedFlowSlot;", "dropOldestLocked", "emit", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSuspend", "enqueueLocked", "item", "findSlotsToResumeLocked", "Lkotlin/coroutines/Continuation;", "resumesIn", "([Lkotlin/coroutines/Continuation;)[Lkotlin/coroutines/Continuation;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "getPeekedValueLockedAt", "index", "growBuffer", "curBuffer", "curSize", "newSize", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "resetReplayCache", "tryEmit", "", "(Ljava/lang/Object;)Z", "tryEmitLocked", "tryEmitNoCollectorsLocked", "tryPeekLocked", "tryTakeValue", "updateBufferLocked", "newReplayIndex", "newMinCollectorIndex", "newBufferEndIndex", "newQueueEndIndex", "updateCollectorIndexLocked", "oldIndex", "updateCollectorIndexLocked$kotlinx_coroutines_core", "(J)[Lkotlin/coroutines/Continuation;", "updateNewCollectorIndexLocked", "updateNewCollectorIndexLocked$kotlinx_coroutines_core", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SharedFlowImpl extends AbstractSharedFlow implements CancellableFlow, MutableSharedFlow, FusibleFlow {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000BJ\b\u0010\f\u001A\u00020\nH\u0016R\u0016\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001A\u00020\u00058\u0006@\u0006X\u0087\u000E¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "flow", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "index", "", "value", "", "cont", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/SharedFlowImpl;JLjava/lang/Object;Lkotlin/coroutines/Continuation;)V", "dispose", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class Emitter implements DisposableHandle {
        public final Continuation cont;
        public final SharedFlowImpl flow;
        public long index;
        public final Object value;

        public Emitter(SharedFlowImpl sharedFlowImpl0, long v, Object object0, Continuation continuation0) {
            this.flow = sharedFlowImpl0;
            this.index = v;
            this.value = object0;
            this.cont = continuation0;
        }

        @Override  // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[BufferOverflow.values().length];
            arr_v[BufferOverflow.SUSPEND.ordinal()] = 1;
            arr_v[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            arr_v[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    public SharedFlowImpl(int v, int v1, BufferOverflow bufferOverflow0) {
        this.replay = v;
        this.bufferCapacity = v1;
        this.onBufferOverflow = bufferOverflow0;
    }

    public static final Object access$awaitValue(SharedFlowImpl sharedFlowImpl0, SharedFlowSlot sharedFlowSlot0, Continuation continuation0) {
        return sharedFlowImpl0.awaitValue(sharedFlowSlot0, continuation0);
    }

    public static final Object access$emitSuspend(SharedFlowImpl sharedFlowImpl0, Object object0, Continuation continuation0) {
        return sharedFlowImpl0.emitSuspend(object0, continuation0);
    }

    private final Object awaitValue(SharedFlowSlot sharedFlowSlot0, Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        synchronized(this) {
            if(this.tryPeekLocked(sharedFlowSlot0) < 0L) {
                sharedFlowSlot0.cont = cancellableContinuationImpl0;
            }
            else {
                cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
            }
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    // 检测为 Lambda 实现
    private final void cancelEmitter(Emitter sharedFlowImpl$Emitter0) [...]

    private final void cleanupTailLocked() {
        if(this.bufferCapacity == 0 && this.queueSize <= 1) {
            return;
        }
        Object[] arr_object = this.buffer;
        Intrinsics.checkNotNull(arr_object);
        while(this.queueSize > 0 && SharedFlowKt.access$getBufferAt(arr_object, this.getHead() + ((long)this.getTotalSize()) - 1L) == SharedFlowKt.NO_VALUE) {
            --this.queueSize;
            SharedFlowKt.access$setBufferAt(arr_object, this.getHead() + ((long)this.getTotalSize()), null);
        }
    }

    @Override  // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector0, Continuation continuation0) {
        FlowCollector flowCollector1;
        Job job1;
        Job job0;
        SharedFlowImpl sharedFlowImpl0;
        SharedFlowSlot sharedFlowSlot0;
        kotlinx.coroutines.flow.SharedFlowImpl.collect.1 sharedFlowImpl$collect$10;
        if(continuation0 instanceof kotlinx.coroutines.flow.SharedFlowImpl.collect.1) {
            sharedFlowImpl$collect$10 = (kotlinx.coroutines.flow.SharedFlowImpl.collect.1)continuation0;
            if((sharedFlowImpl$collect$10.label & 0x80000000) == 0) {
                sharedFlowImpl$collect$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
                    int label;
                    Object result;

                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object object0) {
                        this.result = object0;
                        this.label |= 0x80000000;
                        return continuation0.collect(null, this);
                    }
                };
            }
            else {
                sharedFlowImpl$collect$10.label ^= 0x80000000;
            }
        }
        else {
            sharedFlowImpl$collect$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                int label;
                Object result;

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object object0) {
                    this.result = object0;
                    this.label |= 0x80000000;
                    return continuation0.collect(null, this);
                }
            };
        }
        Object object0 = sharedFlowImpl$collect$10.result;
        Object object1 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(sharedFlowImpl$collect$10.label) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                sharedFlowSlot0 = (SharedFlowSlot)this.allocateSlot();
                try {
                    if(flowCollector0 instanceof SubscribedFlowCollector) {
                        sharedFlowImpl$collect$10.L$0 = this;
                        sharedFlowImpl$collect$10.L$1 = flowCollector0;
                        sharedFlowImpl$collect$10.L$2 = sharedFlowSlot0;
                        sharedFlowImpl$collect$10.label = 1;
                        if(((SubscribedFlowCollector)flowCollector0).onSubscription(sharedFlowImpl$collect$10) == object1) {
                            return object1;
                        }
                    }
                    sharedFlowImpl0 = this;
                    job0 = (Job)sharedFlowImpl$collect$10.getContext().get(Job.Key);
                    goto label_45;
                }
                catch(Throwable throwable0) {
                    sharedFlowImpl0 = this;
                    break;
                }
            }
            case 1: {
                sharedFlowSlot0 = (SharedFlowSlot)sharedFlowImpl$collect$10.L$2;
                flowCollector0 = (FlowCollector)sharedFlowImpl$collect$10.L$1;
                sharedFlowImpl0 = (SharedFlowImpl)sharedFlowImpl$collect$10.L$0;
                try {
                    ResultKt.throwOnFailure(object0);
                    job0 = (Job)sharedFlowImpl$collect$10.getContext().get(Job.Key);
                    goto label_45;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 2: {
                job1 = (Job)sharedFlowImpl$collect$10.L$3;
                sharedFlowSlot0 = (SharedFlowSlot)sharedFlowImpl$collect$10.L$2;
                flowCollector1 = (FlowCollector)sharedFlowImpl$collect$10.L$1;
                sharedFlowImpl0 = (SharedFlowImpl)sharedFlowImpl$collect$10.L$0;
                try {
                    ResultKt.throwOnFailure(object0);
                    goto label_47;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            case 3: {
                job1 = (Job)sharedFlowImpl$collect$10.L$3;
                sharedFlowSlot0 = (SharedFlowSlot)sharedFlowImpl$collect$10.L$2;
                flowCollector1 = (FlowCollector)sharedFlowImpl$collect$10.L$1;
                sharedFlowImpl0 = (SharedFlowImpl)sharedFlowImpl$collect$10.L$0;
                try {
                    ResultKt.throwOnFailure(object0);
                    while(true) {
                        job0 = job1;
                        flowCollector0 = flowCollector1;
                    label_45:
                        flowCollector1 = flowCollector0;
                        job1 = job0;
                    label_47:
                        Object object2 = sharedFlowImpl0.tryTakeValue(sharedFlowSlot0);
                        if(object2 == SharedFlowKt.NO_VALUE) {
                            break;
                        }
                        if(job1 != null) {
                            JobKt.ensureActive(job1);
                        }
                        sharedFlowImpl$collect$10.L$0 = sharedFlowImpl0;
                        sharedFlowImpl$collect$10.L$1 = flowCollector1;
                        sharedFlowImpl$collect$10.L$2 = sharedFlowSlot0;
                        sharedFlowImpl$collect$10.L$3 = job1;
                        sharedFlowImpl$collect$10.label = 3;
                        if(flowCollector1.emit(object2, sharedFlowImpl$collect$10) != object1) {
                            continue;
                        }
                        return object1;
                    }
                    sharedFlowImpl$collect$10.L$0 = sharedFlowImpl0;
                    sharedFlowImpl$collect$10.L$1 = flowCollector1;
                    sharedFlowImpl$collect$10.L$2 = sharedFlowSlot0;
                    sharedFlowImpl$collect$10.L$3 = job1;
                    sharedFlowImpl$collect$10.label = 2;
                    if(sharedFlowImpl0.awaitValue(sharedFlowSlot0, sharedFlowImpl$collect$10) != object1) {
                        goto label_47;
                    }
                    return object1;
                }
                catch(Throwable throwable0) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        sharedFlowImpl0.freeSlot(sharedFlowSlot0);
        throw throwable0;
    }

    private final void correctCollectorIndexesOnDropOldest(long v) {
        if(AbstractSharedFlow.access$getNCollectors(this) != 0) {
            AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = AbstractSharedFlow.access$getSlots(this);
            if(arr_abstractSharedFlowSlot != null) {
                for(int v1 = 0; v1 < arr_abstractSharedFlowSlot.length; ++v1) {
                    AbstractSharedFlowSlot abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v1];
                    if(abstractSharedFlowSlot0 != null && ((SharedFlowSlot)abstractSharedFlowSlot0).index >= 0L && ((SharedFlowSlot)abstractSharedFlowSlot0).index < v) {
                        ((SharedFlowSlot)abstractSharedFlowSlot0).index = v;
                    }
                }
            }
        }
        this.minCollectorIndex = v;
    }

    protected SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public AbstractSharedFlowSlot createSlot() {
        return this.createSlot();
    }

    protected SharedFlowSlot[] createSlotArray(int v) {
        return new SharedFlowSlot[v];
    }

    @Override  // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public AbstractSharedFlowSlot[] createSlotArray(int v) {
        return this.createSlotArray(v);
    }

    private final void dropOldestLocked() {
        Object[] arr_object = this.buffer;
        Intrinsics.checkNotNull(arr_object);
        SharedFlowKt.setBufferAt(arr_object, this.getHead(), null);
        --this.bufferSize;
        long v = this.getHead();
        if(this.replayIndex < v + 1L) {
            this.replayIndex = v + 1L;
        }
        if(this.minCollectorIndex < v + 1L) {
            this.correctCollectorIndexesOnDropOldest(v + 1L);
        }
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public Object emit(Object object0, Continuation continuation0) {
        if(this.tryEmit(object0)) {
            return Unit.INSTANCE;
        }
        Object object1 = this.emitSuspend(object0, continuation0);
        return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    private final Object emitSuspend(Object object0, Continuation continuation0) {
        Emitter sharedFlowImpl$Emitter0;
        Continuation[] arr_continuation1;
        CancellableContinuationImpl cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
        cancellableContinuationImpl0.initCancellability();
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized(this) {
            if(this.tryEmitLocked(object0)) {
                cancellableContinuationImpl0.resumeWith(Unit.INSTANCE);
                arr_continuation1 = this.findSlotsToResumeLocked(arr_continuation);
                sharedFlowImpl$Emitter0 = null;
            }
            else {
                Emitter sharedFlowImpl$Emitter1 = () -> synchronized(this) {
                    if(this.index < this.getHead()) {
                        return;
                    }
                    Object[] arr_object = this.buffer;
                    Intrinsics.checkNotNull(arr_object);
                    if(SharedFlowKt.access$getBufferAt(arr_object, this.index) != this) {
                        return;
                    }
                    SharedFlowKt.access$setBufferAt(arr_object, this.index, SharedFlowKt.NO_VALUE);
                    this.cleanupTailLocked();
                };
                this.enqueueLocked(sharedFlowImpl$Emitter1);
                ++this.queueSize;
                if(this.bufferCapacity == 0) {
                    arr_continuation = this.findSlotsToResumeLocked(arr_continuation);
                }
                arr_continuation1 = arr_continuation;
                sharedFlowImpl$Emitter0 = sharedFlowImpl$Emitter1;
            }
        }
        if(sharedFlowImpl$Emitter0 != null) {
            CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl0, sharedFlowImpl$Emitter0);
        }
        int v1 = 0;
        while(v1 < arr_continuation1.length) {
            Continuation continuation1 = arr_continuation1[v1];
            ++v1;
            if(continuation1 != null) {
                continuation1.resumeWith(Unit.INSTANCE);
            }
        }
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    private final void enqueueLocked(Object object0) {
        int v = this.getTotalSize();
        Object[] arr_object = this.buffer;
        if(arr_object == null) {
            arr_object = this.growBuffer(null, 0, 2);
        }
        else if(v >= arr_object.length) {
            arr_object = this.growBuffer(arr_object, v, arr_object.length * 2);
        }
        SharedFlowKt.setBufferAt(arr_object, this.getHead() + ((long)v), object0);
    }

    private final Continuation[] findSlotsToResumeLocked(Continuation[] arr_continuation) {
        int v = arr_continuation.length;
        if(AbstractSharedFlow.access$getNCollectors(this) != 0) {
            AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = AbstractSharedFlow.access$getSlots(this);
            if(arr_abstractSharedFlowSlot != null) {
                for(int v1 = 0; v1 < arr_abstractSharedFlowSlot.length; ++v1) {
                    AbstractSharedFlowSlot abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v1];
                    if(abstractSharedFlowSlot0 != null) {
                        Continuation continuation0 = ((SharedFlowSlot)abstractSharedFlowSlot0).cont;
                        if(continuation0 != null && this.tryPeekLocked(((SharedFlowSlot)abstractSharedFlowSlot0)) >= 0L) {
                            if(v >= arr_continuation.length) {
                                arr_continuation = Arrays.copyOf(arr_continuation, Math.max(2, arr_continuation.length * 2));
                                Intrinsics.checkNotNullExpressionValue(arr_continuation, "java.util.Arrays.copyOf(this, newSize)");
                            }
                            arr_continuation[v] = continuation0;
                            ((SharedFlowSlot)abstractSharedFlowSlot0).cont = null;
                            ++v;
                        }
                    }
                }
            }
        }
        return arr_continuation;
    }

    @Override  // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow fuse(CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        return SharedFlowKt.fuseSharedFlow(this, coroutineContext0, v, bufferOverflow0);
    }

    private final long getBufferEndIndex() {
        return this.getHead() + ((long)this.bufferSize);
    }

    private final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object getPeekedValueLockedAt(long v) {
        Object[] arr_object = this.buffer;
        Intrinsics.checkNotNull(arr_object);
        Object object0 = SharedFlowKt.getBufferAt(arr_object, v);
        return object0 instanceof Emitter ? ((Emitter)object0).value : object0;
    }

    private final long getQueueEndIndex() {
        return this.getHead() + ((long)this.bufferSize) + ((long)this.queueSize);
    }

    @Override  // kotlinx.coroutines.flow.SharedFlow
    public List getReplayCache() {
        synchronized(this) {
            int v1 = this.getReplaySize();
            if(v1 == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList0 = new ArrayList(v1);
            Object[] arr_object = this.buffer;
            Intrinsics.checkNotNull(arr_object);
            if(v1 > 0) {
                for(int v2 = 0; true; ++v2) {
                    arrayList0.add(SharedFlowKt.getBufferAt(arr_object, this.replayIndex + ((long)v2)));
                    if(v2 + 1 >= v1) {
                        break;
                    }
                }
            }
            return arrayList0;
        }
    }

    private final int getReplaySize() {
        return (int)(this.getHead() + ((long)this.bufferSize) - this.replayIndex);
    }

    private final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] arr_object, int v, int v1) {
        if(v1 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] arr_object1 = new Object[v1];
        this.buffer = arr_object1;
        if(arr_object == null) {
            return arr_object1;
        }
        long v3 = this.getHead();
        if(v > 0) {
            for(int v2 = 0; true; ++v2) {
                long v4 = ((long)v2) + v3;
                SharedFlowKt.setBufferAt(arr_object1, v4, SharedFlowKt.getBufferAt(arr_object, v4));
                if(v2 + 1 >= v) {
                    break;
                }
            }
        }
        return arr_object1;
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        synchronized(this) {
            this.updateBufferLocked(this.getBufferEndIndex(), this.minCollectorIndex, this.getBufferEndIndex(), this.getQueueEndIndex());
        }
    }

    @Override  // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(Object object0) {
        boolean z;
        int v = 0;
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized(this) {
            if(this.tryEmitLocked(object0)) {
                arr_continuation = this.findSlotsToResumeLocked(arr_continuation);
                z = true;
            }
            else {
                z = false;
            }
        }
        while(v < arr_continuation.length) {
            Continuation continuation0 = arr_continuation[v];
            ++v;
            if(continuation0 != null) {
                continuation0.resumeWith(Unit.INSTANCE);
            }
        }
        return z;
    }

    private final boolean tryEmitLocked(Object object0) {
        if(this.getNCollectors() == 0) {
            return this.tryEmitNoCollectorsLocked(object0);
        }
        if(this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            switch(WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()]) {
                case 1: {
                    return false;
                }
                case 2: {
                    return true;
                }
            }
        }
        this.enqueueLocked(object0);
        int v = this.bufferSize + 1;
        this.bufferSize = v;
        if(v > this.bufferCapacity) {
            this.dropOldestLocked();
        }
        if(this.getReplaySize() > this.replay) {
            this.updateBufferLocked(this.replayIndex + 1L, this.minCollectorIndex, this.getBufferEndIndex(), this.getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(Object object0) {
        if(this.replay == 0) {
            return true;
        }
        this.enqueueLocked(object0);
        int v = this.bufferSize + 1;
        this.bufferSize = v;
        if(v > this.replay) {
            this.dropOldestLocked();
        }
        this.minCollectorIndex = this.getHead() + ((long)this.bufferSize);
        return true;
    }

    private final long tryPeekLocked(SharedFlowSlot sharedFlowSlot0) {
        long v = sharedFlowSlot0.index;
        if(v < this.getBufferEndIndex()) {
            return v;
        }
        if(this.bufferCapacity > 0) {
            return -1L;
        }
        if(v > this.getHead()) {
            return -1L;
        }
        return this.queueSize == 0 ? -1L : v;
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot0) {
        Symbol symbol0;
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized(this) {
            long v1 = this.tryPeekLocked(sharedFlowSlot0);
            if(v1 < 0L) {
                symbol0 = SharedFlowKt.NO_VALUE;
            }
            else {
                long v2 = sharedFlowSlot0.index;
                Object object0 = this.getPeekedValueLockedAt(v1);
                sharedFlowSlot0.index = v1 + 1L;
                arr_continuation = this.updateCollectorIndexLocked$kotlinx_coroutines_core(v2);
                symbol0 = object0;
            }
        }
        int v3 = 0;
        while(v3 < arr_continuation.length) {
            Continuation continuation0 = arr_continuation[v3];
            ++v3;
            if(continuation0 != null) {
                continuation0.resumeWith(Unit.INSTANCE);
            }
        }
        return symbol0;
    }

    private final void updateBufferLocked(long v, long v1, long v2, long v3) {
        long v4 = Math.min(v1, v);
        long v5 = this.getHead();
        if(v5 < v4) {
            while(true) {
                Object[] arr_object = this.buffer;
                Intrinsics.checkNotNull(arr_object);
                SharedFlowKt.setBufferAt(arr_object, v5, null);
                if(v5 + 1L >= v4) {
                    break;
                }
                ++v5;
            }
        }
        this.replayIndex = v;
        this.minCollectorIndex = v1;
        this.bufferSize = (int)(v2 - v4);
        this.queueSize = (int)(v3 - v2);
    }

    public final Continuation[] updateCollectorIndexLocked$kotlinx_coroutines_core(long v) {
        long v10;
        if(v > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long v1 = this.getHead();
        long v2 = this.bufferCapacity != 0 || this.queueSize <= 0 ? ((long)this.bufferSize) + v1 : ((long)this.bufferSize) + v1 + 1L;
        if(AbstractSharedFlow.access$getNCollectors(this) != 0) {
            AbstractSharedFlowSlot[] arr_abstractSharedFlowSlot = AbstractSharedFlow.access$getSlots(this);
            if(arr_abstractSharedFlowSlot != null) {
                for(int v3 = 0; v3 < arr_abstractSharedFlowSlot.length; ++v3) {
                    AbstractSharedFlowSlot abstractSharedFlowSlot0 = arr_abstractSharedFlowSlot[v3];
                    if(abstractSharedFlowSlot0 != null && ((SharedFlowSlot)abstractSharedFlowSlot0).index >= 0L && ((SharedFlowSlot)abstractSharedFlowSlot0).index < v2) {
                        v2 = ((SharedFlowSlot)abstractSharedFlowSlot0).index;
                    }
                }
            }
        }
        if(v2 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long v4 = this.getBufferEndIndex();
        int v5 = this.getNCollectors() <= 0 ? this.queueSize : Math.min(this.queueSize, this.bufferCapacity - ((int)(v4 - v2)));
        Continuation[] arr_continuation = AbstractSharedFlowKt.EMPTY_RESUMES;
        long v6 = ((long)this.queueSize) + v4;
        if(v5 > 0) {
            arr_continuation = new Continuation[v5];
            Object[] arr_object = this.buffer;
            Intrinsics.checkNotNull(arr_object);
            if(v4 < v6) {
                long v7 = v4;
                int v8 = 0;
                while(true) {
                    long v9 = v4 + 1L;
                    Object object0 = SharedFlowKt.getBufferAt(arr_object, v4);
                    if(object0 == SharedFlowKt.NO_VALUE) {
                        v10 = v2;
                    }
                    else {
                        if(object0 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                        }
                        v10 = v2;
                        arr_continuation[v8] = ((Emitter)object0).cont;
                        SharedFlowKt.setBufferAt(arr_object, v4, SharedFlowKt.NO_VALUE);
                        SharedFlowKt.setBufferAt(arr_object, v7, ((Emitter)object0).value);
                        v4 = v7 + 1L;
                        if(v8 + 1 >= v5) {
                            break;
                        }
                        ++v8;
                        v7 = v4;
                    }
                    if(v9 >= v6) {
                        v4 = v7;
                        break;
                    }
                    v4 = v9;
                    v2 = v10;
                }
            }
            else {
                v10 = v2;
            }
        }
        else {
            v10 = v2;
        }
        long v11 = this.getNCollectors() == 0 ? v4 : v10;
        long v12 = Math.max(this.replayIndex, v4 - ((long)Math.min(this.replay, ((int)(v4 - v1)))));
        if(this.bufferCapacity == 0 && v12 < v6) {
            Object[] arr_object1 = this.buffer;
            Intrinsics.checkNotNull(arr_object1);
            if(Intrinsics.areEqual(SharedFlowKt.getBufferAt(arr_object1, v12), SharedFlowKt.NO_VALUE)) {
                ++v4;
                ++v12;
            }
        }
        this.updateBufferLocked(v12, v11, v4, v6);
        this.cleanupTailLocked();
        return (1 ^ (arr_continuation.length == 0 ? 1 : 0)) == 0 ? arr_continuation : this.findSlotsToResumeLocked(arr_continuation);
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long v = this.replayIndex;
        if(v < this.minCollectorIndex) {
            this.minCollectorIndex = v;
        }
        return v;
    }
}

