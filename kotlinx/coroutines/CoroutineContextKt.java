package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\b\u0010\u000B\u001A\u00020\fH\u0000\u001A8\u0010\r\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\n\u0010\u000F\u001A\u0006\u0012\u0002\b\u00030\u00102\b\u0010\u0011\u001A\u0004\u0018\u00010\u00122\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u0014H\u0080\b¢\u0006\u0002\u0010\u0015\u001A4\u0010\u0016\u001A\u0002H\u000E\"\u0004\b\u0000\u0010\u000E2\u0006\u0010\u0017\u001A\u00020\b2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00122\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u0002H\u000E0\u0014H\u0080\b¢\u0006\u0002\u0010\u0018\u001A\u0014\u0010\u0019\u001A\u00020\b*\u00020\u001A2\u0006\u0010\u0017\u001A\u00020\bH\u0007\u001A\u0013\u0010\u001B\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u001C*\u00020\u001DH\u0080\u0010\u001A(\u0010\u001E\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u001C*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\u0017\u001A\u00020\b2\b\u0010\u001F\u001A\u0004\u0018\u00010\u0012H\u0000\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001A\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u001A\u0010\u0007\u001A\u0004\u0018\u00010\u0001*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\n¨\u0006 "}, d2 = {"COROUTINES_SCHEDULER_PROPERTY_NAME", "", "DEBUG_THREAD_NAME_SEPARATOR", "useCoroutinesScheduler", "", "getUseCoroutinesScheduler", "()Z", "coroutineName", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineName", "(Lkotlin/coroutines/CoroutineContext;)Ljava/lang/String;", "createDefaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "withContinuationContext", "T", "continuation", "Lkotlin/coroutines/Continuation;", "countOrElement", "", "block", "Lkotlin/Function0;", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "withCoroutineContext", "context", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "newCoroutineContext", "Lkotlinx/coroutines/CoroutineScope;", "undispatchedCompletion", "Lkotlinx/coroutines/UndispatchedCoroutine;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "updateUndispatchedCompletion", "oldValue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class CoroutineContextKt {
    public static final String COROUTINES_SCHEDULER_PROPERTY_NAME = "kotlinx.coroutines.scheduler";
    private static final String DEBUG_THREAD_NAME_SEPARATOR = " @";
    private static final boolean useCoroutinesScheduler;

    static {
        boolean z;
        String s = SystemPropsKt.systemProp("kotlinx.coroutines.scheduler");
        if(s == null) {
            z = true;
        }
        else {
            switch(s) {
                case "": 
                case "on": {
                    z = true;
                    break;
                }
                case "off": {
                    z = false;
                    break;
                }
                default: {
                    throw new IllegalStateException(("System property \'kotlinx.coroutines.scheduler\' has unrecognized value \'" + s + '\'').toString());
                }
            }
        }
        CoroutineContextKt.useCoroutinesScheduler = z;
    }

    public static final CoroutineDispatcher createDefaultDispatcher() {
        return CoroutineContextKt.useCoroutinesScheduler ? DefaultScheduler.INSTANCE : CommonPool.INSTANCE;
    }

    // 去混淆评级： 低(30)
    public static final String getCoroutineName(CoroutineContext coroutineContext0) {
        return null;
    }

    public static final boolean getUseCoroutinesScheduler() {
        return CoroutineContextKt.useCoroutinesScheduler;
    }

    public static final CoroutineContext newCoroutineContext(CoroutineScope coroutineScope0, CoroutineContext coroutineContext0) {
        CoroutineContext coroutineContext1 = coroutineScope0.getCoroutineContext().plus(coroutineContext0);
        return coroutineContext1 == Dispatchers.getDefault() || coroutineContext1.get(ContinuationInterceptor.Key) != null ? coroutineContext1 : coroutineContext1.plus(Dispatchers.getDefault());
    }

    public static final UndispatchedCoroutine undispatchedCompletion(CoroutineStackFrame coroutineStackFrame0) {
        do {
            if(coroutineStackFrame0 instanceof DispatchedCoroutine) {
                return null;
            }
            coroutineStackFrame0 = coroutineStackFrame0.getCallerFrame();
            if(coroutineStackFrame0 == null) {
                return null;
            }
        }
        while(!(coroutineStackFrame0 instanceof UndispatchedCoroutine));
        return (UndispatchedCoroutine)coroutineStackFrame0;
    }

    public static final UndispatchedCoroutine updateUndispatchedCompletion(Continuation continuation0, CoroutineContext coroutineContext0, Object object0) {
        if(!(continuation0 instanceof CoroutineStackFrame)) {
            return null;
        }
        if(coroutineContext0.get(UndispatchedMarker.INSTANCE) == null) {
            return null;
        }
        UndispatchedCoroutine undispatchedCoroutine0 = CoroutineContextKt.undispatchedCompletion(((CoroutineStackFrame)continuation0));
        if(undispatchedCoroutine0 != null) {
            undispatchedCoroutine0.saveThreadContext(coroutineContext0, object0);
        }
        return undispatchedCoroutine0;
    }

    public static final Object withContinuationContext(Continuation continuation0, Object object0, Function0 function00) {
        CoroutineContext coroutineContext0 = continuation0.getContext();
        Object object1 = ThreadContextKt.updateThreadContext(coroutineContext0, object0);
        UndispatchedCoroutine undispatchedCoroutine0 = object1 == ThreadContextKt.NO_THREAD_ELEMENTS ? null : CoroutineContextKt.updateUndispatchedCompletion(continuation0, coroutineContext0, object1);
        try {
            return function00.invoke();
        }
        finally {
            if(undispatchedCoroutine0 == null || undispatchedCoroutine0.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(coroutineContext0, object1);
            }
        }
    }

    public static final Object withCoroutineContext(CoroutineContext coroutineContext0, Object object0, Function0 function00) {
        Object object1 = ThreadContextKt.updateThreadContext(coroutineContext0, object0);
        try {
            return function00.invoke();
        }
        finally {
            ThreadContextKt.restoreThreadContext(coroutineContext0, object1);
        }
    }
}

