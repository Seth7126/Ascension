package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0019\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u000E\u0010\b\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tJ\u0006\u0010\n\u001A\u00020\u0005R\u0010\u0010\u0003\u001A\u0004\u0018\u00010\u0001X\u0082\u000E¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "()V", "pendingFrameContinuation", "awaitFrameRequest", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrameLocked", "Lkotlin/coroutines/Continuation;", "takeFrameRequestLocked", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object object0, Continuation continuation0) {
        CancellableContinuation cancellableContinuation0;
        CancellableContinuationImpl cancellableContinuationImpl0;
        synchronized(object0) {
            if(this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                this.pendingFrameContinuation = RecomposerKt.FramePending;
                return Unit.INSTANCE;
            }
            cancellableContinuationImpl0 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation0), 1);
            cancellableContinuationImpl0.initCancellability();
            cancellableContinuation0 = cancellableContinuationImpl0;
            synchronized(object0) {
                if(this.pendingFrameContinuation == RecomposerKt.ProduceAnotherFrame) {
                    this.pendingFrameContinuation = RecomposerKt.FramePending;
                }
                else {
                    this.pendingFrameContinuation = cancellableContinuation0;
                    cancellableContinuation0 = null;
                }
            }
        }
        if(cancellableContinuation0 != null) {
            cancellableContinuation0.resumeWith(Unit.INSTANCE);
        }
        Object object1 = cancellableContinuationImpl0.getResult();
        if(object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation0);
        }
        return object1 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? object1 : Unit.INSTANCE;
    }

    public final Continuation requestFrameLocked() {
        Object object0 = this.pendingFrameContinuation;
        if(object0 instanceof Continuation) {
            this.pendingFrameContinuation = RecomposerKt.FramePending;
            return (Continuation)object0;
        }
        if((Intrinsics.areEqual(object0, RecomposerKt.ProduceAnotherFrame) ? true : Intrinsics.areEqual(object0, RecomposerKt.FramePending))) {
            return null;
        }
        if(object0 != null) {
            throw new IllegalStateException(("invalid pendingFrameContinuation " + object0).toString());
        }
        this.pendingFrameContinuation = RecomposerKt.ProduceAnotherFrame;
        return null;
    }

    public final void takeFrameRequestLocked() {
        if(this.pendingFrameContinuation != RecomposerKt.FramePending) {
            throw new IllegalStateException("frame not pending");
        }
        this.pendingFrameContinuation = null;
    }
}

