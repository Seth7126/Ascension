package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001B\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\nH\u0014J\u0006\u0010\u000E\u001A\u00020\u000FJ\u0018\u0010\u0010\u001A\u00020\f2\u0006\u0010\u0003\u001A\u00020\u00042\b\u0010\u0011\u001A\u0004\u0018\u00010\nR\u0010\u0010\b\u001A\u0004\u0018\u00010\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001A\u0004\u0018\u00010\nX\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "savedContext", "savedOldValue", "", "afterResume", "", "state", "clearThreadContext", "", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class UndispatchedCoroutine extends ScopeCoroutine {
    private CoroutineContext savedContext;
    private Object savedOldValue;

    public UndispatchedCoroutine(CoroutineContext coroutineContext0, Continuation continuation0) {
        if(coroutineContext0.get(UndispatchedMarker.INSTANCE) == null) {
            coroutineContext0 = coroutineContext0.plus(UndispatchedMarker.INSTANCE);
        }
        super(coroutineContext0, continuation0);
    }

    @Override  // kotlinx.coroutines.internal.ScopeCoroutine
    protected void afterResume(Object object0) {
        CoroutineContext coroutineContext0 = this.savedContext;
        UndispatchedCoroutine undispatchedCoroutine0 = null;
        if(coroutineContext0 != null) {
            ThreadContextKt.restoreThreadContext(coroutineContext0, this.savedOldValue);
            this.savedContext = null;
            this.savedOldValue = null;
        }
        Object object1 = CompletionStateKt.recoverResult(object0, this.uCont);
        Continuation continuation0 = this.uCont;
        CoroutineContext coroutineContext1 = continuation0.getContext();
        Object object2 = ThreadContextKt.updateThreadContext(coroutineContext1, null);
        if(object2 != ThreadContextKt.NO_THREAD_ELEMENTS) {
            undispatchedCoroutine0 = CoroutineContextKt.updateUndispatchedCompletion(continuation0, coroutineContext1, object2);
        }
        try {
            this.uCont.resumeWith(object1);
        }
        finally {
            if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(coroutineContext1, object2);
            }
        }
    }

    public final boolean clearThreadContext() {
        if(this.savedContext == null) {
            return false;
        }
        this.savedContext = null;
        this.savedOldValue = null;
        return true;
    }

    public final void saveThreadContext(CoroutineContext coroutineContext0, Object object0) {
        this.savedContext = coroutineContext0;
        this.savedOldValue = object0;
    }
}

