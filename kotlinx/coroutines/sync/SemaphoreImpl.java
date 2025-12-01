package kotlinx.coroutines.sync;

import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u001EB\u0017\u0012\u0006\u0010\u0002\u001A\u00020\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001A\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001A\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001D\u0010\r\u001A\u00020\f2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001A\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000ER\u0016\u0010\u0017\u001A\u00020\u00018V@\u0016X\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\"\u0010\u001A\u001A\u000E\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001A\u0010\u001BR\u0016\u0010\u0002\u001A\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001C\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001D"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "tryResumeAcquire", "getAvailablePermits", "()I", "availablePermits", "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", "I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SemaphoreImpl implements Semaphore {
    volatile int _availablePermits;
    static final AtomicIntegerFieldUpdater _availablePermits$FU;
    private volatile long deqIdx;
    private static final AtomicLongFieldUpdater deqIdx$FU;
    private volatile long enqIdx;
    private static final AtomicLongFieldUpdater enqIdx$FU;
    private volatile Object head;
    private static final AtomicReferenceFieldUpdater head$FU;
    private final Function1 onCancellationRelease;
    private final int permits;
    private volatile Object tail;
    private static final AtomicReferenceFieldUpdater tail$FU;

    static {
        SemaphoreImpl.head$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "head");
        SemaphoreImpl.deqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");
        SemaphoreImpl.tail$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");
        SemaphoreImpl.enqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
        SemaphoreImpl._availablePermits$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");
    }

    public SemaphoreImpl(int v, int v1) {
        this.permits = v;
        this.deqIdx = 0L;
        this.enqIdx = 0L;
        if(v <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + v).toString());
        }
        if(v1 < 0 || v1 > v) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + v).toString());
        }
        SemaphoreSegment semaphoreSegment0 = new SemaphoreSegment(0L, null, 2);
        this.head = semaphoreSegment0;
        this.tail = semaphoreSegment0;
        this._availablePermits = v - v1;
        this.onCancellationRelease = new Function1() {
            {
                SemaphoreImpl.this = semaphoreImpl0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((Throwable)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(Throwable throwable0) {
                SemaphoreImpl.this.release();
            }
        };
    }

    public static final Object access$acquireSlowPath(SemaphoreImpl semaphoreImpl0, Continuation continuation0) {
        return semaphoreImpl0.acquireSlowPath(continuation0);
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    public Object acquire(Continuation continuation0) {
        if(SemaphoreImpl._availablePermits$FU.getAndDecrement(this) > 0) {
            return Unit.INSTANCE;
        }
        Object object0 = this.acquireSlowPath(continuation0);
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    private final Object acquireSlowPath(Continuation continuation0) {
        CancellableContinuationImpl cancellableContinuationImpl0 = CancellableContinuationKt.getOrCreateCancellableContinuation(IntrinsicsKt.intercepted(continuation0));
        while(!this.addAcquireToQueue(cancellableContinuationImpl0)) {
            if(SemaphoreImpl._availablePermits$FU.getAndDecrement(this) > 0) {
                cancellableContinuationImpl0.resume(Unit.INSTANCE, this.onCancellationRelease);
                break;
            }
            if(false) {
                break;
            }
        }
        Object object0 = cancellableContinuationImpl0.getResult();
        if(object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object0 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
    }

    // This method was un-flattened
    private final boolean addAcquireToQueue(CancellableContinuation cancellableContinuation0) {
        Segment segment2;
        Segment segment1;
        Object object0;
        Object object1;
        Segment segment0;
        SemaphoreSegment semaphoreSegment0 = (SemaphoreSegment)this.tail;
        long v = SemaphoreImpl.enqIdx$FU.getAndIncrement(this);
        do {
            segment0 = semaphoreSegment0;
        label_3:
            if(segment0.getId() < v / 16L || segment0.getRemoved()) {
                object1 = segment0.getNextOrClosed();
                if(object1 == ConcurrentLinkedListKt.CLOSED) {
                    object0 = ConcurrentLinkedListKt.CLOSED;
                }
                else {
                    goto label_29;
                }
            }
            else {
                object0 = segment0;
            }
            if(SegmentOrClosed.isClosed-impl(object0)) {
                goto label_21;
            }
            segment1 = SegmentOrClosed.getSegment-impl(object0);
        label_11:
            segment2 = (Segment)this.tail;
            if(segment2.getId() >= segment1.getId()) {
                goto label_21;
            }
        }
        while(!segment1.tryIncPointers$kotlinx_coroutines_core());
        if(!PainterModifier..ExternalSyntheticBackport0.m(SemaphoreImpl.tail$FU, this, segment2, segment1)) {
            if(!segment1.decPointers$kotlinx_coroutines_core()) {
                goto label_11;
            }
            segment1.remove();
            goto label_11;
        }
        else if(segment2.decPointers$kotlinx_coroutines_core()) {
            segment2.remove();
        }
    label_21:
        SemaphoreSegment semaphoreSegment1 = (SemaphoreSegment)SegmentOrClosed.getSegment-impl(object0);
        if(PainterModifier..ExternalSyntheticBackport0.m(semaphoreSegment1.acquirers, ((int)(v % 16L)), null, cancellableContinuation0)) {
            cancellableContinuation0.invokeOnCancellation(new CancelSemaphoreAcquisitionHandler(semaphoreSegment1, ((int)(v % 16L))));
            return true;
        }
        if(PainterModifier..ExternalSyntheticBackport0.m(semaphoreSegment1.acquirers, ((int)(v % 16L)), SemaphoreKt.PERMIT, SemaphoreKt.TAKEN)) {
            cancellableContinuation0.resume(Unit.INSTANCE, this.onCancellationRelease);
            return true;
        }
        return false;
    label_29:
        Segment segment3 = (Segment)(((ConcurrentLinkedListNode)object1));
        if(segment3 == null) {
            segment3 = SemaphoreKt.createSegment(segment0.getId() + 1L, ((SemaphoreSegment)segment0));
            if(!segment0.trySetNext(segment3)) {
                goto label_3;
            }
            if(segment0.getRemoved()) {
                segment0.remove();
            }
        }
        segment0 = segment3;
        goto label_3;
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
        return Math.max(this._availablePermits, 0);
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    public void release() {
        int v1;
    alab1:
        while(true) {
            do {
                int v = this._availablePermits;
                v1 = this.permits;
                if(v >= v1) {
                    break alab1;
                }
                if(!SemaphoreImpl._availablePermits$FU.compareAndSet(this, v, v + 1)) {
                    continue alab1;
                }
                if(v >= 0) {
                    return;
                }
            }
            while(!this.tryResumeNextFromQueue());
            return;
        }
        throw new IllegalStateException(("The number of released permits cannot be greater than " + v1).toString());
    }

    @Override  // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
        do {
            int v = this._availablePermits;
            if(v <= 0) {
                return false;
            }
        }
        while(!SemaphoreImpl._availablePermits$FU.compareAndSet(this, v, v - 1));
        return true;
    }

    private final boolean tryResumeAcquire(CancellableContinuation cancellableContinuation0) {
        Object object0 = cancellableContinuation0.tryResume(Unit.INSTANCE, null, this.onCancellationRelease);
        if(object0 == null) {
            return false;
        }
        cancellableContinuation0.completeResume(object0);
        return true;
    }

    // This method was un-flattened
    private final boolean tryResumeNextFromQueue() {
        Segment segment2;
        Segment segment1;
        Object object0;
        Object object1;
        Segment segment0;
        SemaphoreSegment semaphoreSegment0 = (SemaphoreSegment)this.head;
        long v = SemaphoreImpl.deqIdx$FU.getAndIncrement(this);
        do {
            segment0 = semaphoreSegment0;
        label_3:
            if(segment0.getId() < v / 16L || segment0.getRemoved()) {
                object1 = segment0.getNextOrClosed();
                if(object1 == ConcurrentLinkedListKt.CLOSED) {
                    object0 = ConcurrentLinkedListKt.CLOSED;
                }
                else {
                    goto label_35;
                }
            }
            else {
                object0 = segment0;
            }
            if(SegmentOrClosed.isClosed-impl(object0)) {
                goto label_22;
            }
            segment1 = SegmentOrClosed.getSegment-impl(object0);
        label_12:
            segment2 = (Segment)this.head;
            if(segment2.getId() >= segment1.getId()) {
                goto label_22;
            }
        }
        while(!segment1.tryIncPointers$kotlinx_coroutines_core());
        if(!PainterModifier..ExternalSyntheticBackport0.m(SemaphoreImpl.head$FU, this, segment2, segment1)) {
            if(!segment1.decPointers$kotlinx_coroutines_core()) {
                goto label_12;
            }
            segment1.remove();
            goto label_12;
        }
        else if(segment2.decPointers$kotlinx_coroutines_core()) {
            segment2.remove();
        }
    label_22:
        SemaphoreSegment semaphoreSegment1 = (SemaphoreSegment)SegmentOrClosed.getSegment-impl(object0);
        semaphoreSegment1.cleanPrev();
        if(semaphoreSegment1.getId() > v / 16L) {
            return false;
        }
        Object object2 = semaphoreSegment1.acquirers.getAndSet(((int)(v % 16L)), SemaphoreKt.PERMIT);
        if(object2 == null) {
            for(int v1 = 0; v1 < 100; ++v1) {
                if(semaphoreSegment1.acquirers.get(((int)(v % 16L))) == SemaphoreKt.TAKEN) {
                    return true;
                }
            }
            return !PainterModifier..ExternalSyntheticBackport0.m(semaphoreSegment1.acquirers, ((int)(v % 16L)), SemaphoreKt.PERMIT, SemaphoreKt.BROKEN);
        }
        return object2 == SemaphoreKt.CANCELLED ? false : this.tryResumeAcquire(((CancellableContinuation)object2));
    label_35:
        Segment segment3 = (Segment)(((ConcurrentLinkedListNode)object1));
        if(segment3 == null) {
            segment3 = SemaphoreKt.createSegment(segment0.getId() + 1L, ((SemaphoreSegment)segment0));
            if(!segment0.trySetNext(segment3)) {
                goto label_3;
            }
            if(segment0.getRemoved()) {
                segment0.remove();
            }
        }
        segment0 = segment3;
        goto label_3;
    }
}

