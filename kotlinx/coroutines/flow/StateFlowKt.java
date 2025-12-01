package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001A\u001F\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001A\u0002H\b¢\u0006\u0002\u0010\n\u001A6\u0010\u000B\u001A\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\r2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H\u0000\u001A\u001A\u0010\u0014\u001A\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00110\u00072\u0006\u0010\u0016\u001A\u00020\u0011H\u0000\"\u0016\u0010\u0000\u001A\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001A\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u0017"}, d2 = {"NONE", "Lkotlinx/coroutines/internal/Symbol;", "getNONE$annotations", "()V", "PENDING", "getPENDING$annotations", "MutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "T", "value", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/MutableStateFlow;", "fuseStateFlow", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/StateFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "increment", "", "delta", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class StateFlowKt {
    private static final Symbol NONE;
    private static final Symbol PENDING;

    static {
        StateFlowKt.NONE = new Symbol("NONE");
        StateFlowKt.PENDING = new Symbol("PENDING");
    }

    public static final MutableStateFlow MutableStateFlow(Object object0) {
        if(object0 == null) {
            object0 = NullSurrogateKt.NULL;
        }
        return new StateFlowImpl(object0);
    }

    public static final Flow fuseStateFlow(StateFlow stateFlow0, CoroutineContext coroutineContext0, int v, BufferOverflow bufferOverflow0) {
        return (v >= 0 && v <= 1 || v == -2) && bufferOverflow0 == BufferOverflow.DROP_OLDEST ? stateFlow0 : SharedFlowKt.fuseSharedFlow(stateFlow0, coroutineContext0, v, bufferOverflow0);
    }

    private static void getNONE$annotations() {
    }

    private static void getPENDING$annotations() {
    }

    public static final void increment(MutableStateFlow mutableStateFlow0, int v) {
        do {
            int v1 = ((Number)mutableStateFlow0.getValue()).intValue();
        }
        while(!mutableStateFlow0.compareAndSet(v1, ((int)(v1 + v))));
    }
}

