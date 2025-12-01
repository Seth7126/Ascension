package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001A:\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u0002H\b0\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000F\u001A:\u0010\u0010\u001A\u0002H\b\"\u0004\b\u0000\u0010\b2!\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u0002H\b0\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000F\u001A@\u0010\u0007\u001A\u0002H\b\"\u0004\b\u0000\u0010\b*\u00020\u00012#\b\u0004\u0010\t\u001A\u001D\u0012\u0013\u0012\u00110\u000B¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000E\u0012\u0004\u0012\u0002H\b0\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0011\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"monotonicFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "getMonotonicFrameClock", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;", "withFrameMillis", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeMillis", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withFrameNanos", "(Landroidx/compose/runtime/MonotonicFrameClock;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class MonotonicFrameClockKt {
    public static final MonotonicFrameClock getMonotonicFrameClock(CoroutineContext coroutineContext0) {
        Intrinsics.checkNotNullParameter(coroutineContext0, "<this>");
        MonotonicFrameClock monotonicFrameClock0 = (MonotonicFrameClock)coroutineContext0.get(MonotonicFrameClock.Key);
        if(monotonicFrameClock0 == null) {
            throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        }
        return monotonicFrameClock0;
    }

    @ExperimentalComposeApi
    public static void getMonotonicFrameClock$annotations(CoroutineContext coroutineContext0) {
    }

    public static final Object withFrameMillis(MonotonicFrameClock monotonicFrameClock0, Function1 function10, Continuation continuation0) {
        return monotonicFrameClock0.withFrameNanos(new Function1(function10) {
            final Function1 $onFrame;

            {
                this.$onFrame = function10;
                super(1);
            }

            public final Object invoke(long v) {
                return this.$onFrame.invoke(((long)(v / 1000000L)));
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).longValue());
            }
        }, continuation0);
    }

    public static final Object withFrameMillis(Function1 function10, Continuation continuation0) {
        return MonotonicFrameClockKt.getMonotonicFrameClock(continuation0.getContext()).withFrameNanos(new androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis.2(function10), continuation0);
    }

    private static final Object withFrameMillis$$forInline(MonotonicFrameClock monotonicFrameClock0, Function1 function10, Continuation continuation0) {
        return monotonicFrameClock0.withFrameNanos(new androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis.2(function10), continuation0);
    }

    public static final Object withFrameNanos(Function1 function10, Continuation continuation0) {
        return MonotonicFrameClockKt.getMonotonicFrameClock(continuation0.getContext()).withFrameNanos(function10, continuation0);
    }
}

