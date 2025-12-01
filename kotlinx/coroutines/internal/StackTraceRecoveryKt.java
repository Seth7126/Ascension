package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001A\u0014\u0010\u0006\u001A\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001A\u00020\u0001H\u0007\u001A9\u0010\n\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f2\u0006\u0010\r\u001A\u0002H\u000B2\u0006\u0010\u000E\u001A\u0002H\u000B2\u0010\u0010\u000F\u001A\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002\u00A2\u0006\u0002\u0010\u0011\u001A\u001E\u0010\u0012\u001A\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001A\u00060\u0014j\u0002`\u0015H\u0002\u001A1\u0010\u0016\u001A\u00020\u00172\u0010\u0010\u0018\u001A\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000E\u001A\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002\u00A2\u0006\u0002\u0010\u001A\u001A\u0019\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\fH\u0080H\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u001E\u001A+\u0010\u001F\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f2\u0006\u0010\u001D\u001A\u0002H\u000B2\n\u0010\u0013\u001A\u00060\u0014j\u0002`\u0015H\u0002\u00A2\u0006\u0002\u0010 \u001A\u001F\u0010!\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f2\u0006\u0010\u001D\u001A\u0002H\u000BH\u0000\u00A2\u0006\u0002\u0010\"\u001A,\u0010!\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f2\u0006\u0010\u001D\u001A\u0002H\u000B2\n\u0010\u0013\u001A\u0006\u0012\u0002\b\u00030#H\u0080\b\u00A2\u0006\u0002\u0010$\u001A \u0010%\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f2\u0006\u0010\u001D\u001A\u0002H\u000BH\u0080\b\u00A2\u0006\u0002\u0010\"\u001A\u001F\u0010&\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f2\u0006\u0010\u001D\u001A\u0002H\u000BH\u0000\u00A2\u0006\u0002\u0010\"\u001A1\u0010\'\u001A\u0018\u0012\u0004\u0012\u0002H\u000B\u0012\u000E\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190(\"\b\b\u0000\u0010\u000B*\u00020\f*\u0002H\u000BH\u0002\u00A2\u0006\u0002\u0010)\u001A\u001C\u0010*\u001A\u00020+*\u00060\u0007j\u0002`\b2\n\u0010,\u001A\u00060\u0007j\u0002`\bH\u0002\u001A#\u0010-\u001A\u00020.*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u0010/\u001A\u00020\u0001H\u0002\u00A2\u0006\u0002\u00100\u001A\u0014\u00101\u001A\u00020\u0017*\u00020\f2\u0006\u0010\r\u001A\u00020\fH\u0000\u001A\u0010\u00102\u001A\u00020+*\u00060\u0007j\u0002`\bH\u0000\u001A\u001B\u00103\u001A\u0002H\u000B\"\b\b\u0000\u0010\u000B*\u00020\f*\u0002H\u000BH\u0002\u00A2\u0006\u0002\u0010\"\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001A\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0082T\u00A2\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001A\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000*\f\b\u0000\u00104\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00105\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u00066"}, d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class StackTraceRecoveryKt {
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName = null;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        String s = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        String s1 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        String s2 = BaseContinuationImpl.class.getCanonicalName();
        if(Result.exceptionOrNull-impl(s2) == null) {
            s1 = s2;
        }
        StackTraceRecoveryKt.baseContinuationImplClassName = s1;
        String s3 = StackTraceRecoveryKt.class.getCanonicalName();
        if(Result.exceptionOrNull-impl(s3) == null) {
            s = s3;
        }
        StackTraceRecoveryKt.stackTraceRecoveryClassName = s;
    }

    public static void CoroutineStackFrame$annotations() {
    }

    public static void StackTraceElement$annotations() {
    }

    public static final Throwable access$recoverFromStackFrame(Throwable throwable0, CoroutineStackFrame coroutineStackFrame0) {
        return StackTraceRecoveryKt.recoverFromStackFrame(throwable0, coroutineStackFrame0);
    }

    public static final StackTraceElement artificialFrame(String s) {
        return new StackTraceElement("\b\b\b(" + s, "\b", "\b", -1);
    }

    private static final Pair causeAndStacktrace(Throwable throwable0) {
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null && Intrinsics.areEqual(throwable1.getClass(), throwable0.getClass())) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                if(StackTraceRecoveryKt.isArtificial(arr_stackTraceElement[v])) {
                    return TuplesKt.to(throwable1, arr_stackTraceElement);
                }
            }
            return TuplesKt.to(throwable0, new StackTraceElement[0]);
        }
        return TuplesKt.to(throwable0, new StackTraceElement[0]);
    }

    private static final Throwable createFinalException(Throwable throwable0, Throwable throwable1, ArrayDeque arrayDeque0) {
        arrayDeque0.addFirst(StackTraceRecoveryKt.artificialFrame("Coroutine boundary"));
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        int v = StackTraceRecoveryKt.frameIndex(arr_stackTraceElement, StackTraceRecoveryKt.baseContinuationImplClassName);
        int v1 = 0;
        if(v == -1) {
            Object[] arr_object = arrayDeque0.toArray(new StackTraceElement[0]);
            if(arr_object == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throwable1.setStackTrace(((StackTraceElement[])arr_object));
            return throwable1;
        }
        StackTraceElement[] arr_stackTraceElement1 = new StackTraceElement[arrayDeque0.size() + v];
        if(v > 0) {
            for(int v2 = 0; true; ++v2) {
                arr_stackTraceElement1[v2] = arr_stackTraceElement[v2];
                if(v2 + 1 >= v) {
                    break;
                }
            }
        }
        for(Object object0: arrayDeque0) {
            arr_stackTraceElement1[v1 + v] = (StackTraceElement)object0;
            ++v1;
        }
        throwable1.setStackTrace(arr_stackTraceElement1);
        return throwable1;
    }

    private static final ArrayDeque createStackTrace(CoroutineStackFrame coroutineStackFrame0) {
        ArrayDeque arrayDeque0 = new ArrayDeque();
        StackTraceElement stackTraceElement0 = coroutineStackFrame0.getStackTraceElement();
        if(stackTraceElement0 != null) {
            arrayDeque0.add(stackTraceElement0);
        }
        while(true) {
            if(!(coroutineStackFrame0 instanceof CoroutineStackFrame)) {
                coroutineStackFrame0 = null;
            }
            coroutineStackFrame0 = coroutineStackFrame0 == null ? null : coroutineStackFrame0.getCallerFrame();
            if(coroutineStackFrame0 == null) {
                break;
            }
            StackTraceElement stackTraceElement1 = coroutineStackFrame0.getStackTraceElement();
            if(stackTraceElement1 != null) {
                arrayDeque0.add(stackTraceElement1);
            }
        }
        return arrayDeque0;
    }

    // 去混淆评级： 低(30)
    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement0, StackTraceElement stackTraceElement1) {
        return stackTraceElement0.getLineNumber() == stackTraceElement1.getLineNumber() && Intrinsics.areEqual(stackTraceElement0.getMethodName(), stackTraceElement1.getMethodName()) && Intrinsics.areEqual(stackTraceElement0.getFileName(), stackTraceElement1.getFileName()) && Intrinsics.areEqual(stackTraceElement0.getClassName(), stackTraceElement1.getClassName());
    }

    private static final int frameIndex(StackTraceElement[] arr_stackTraceElement, String s) {
        int v = 0;
        while(v < arr_stackTraceElement.length) {
            if(!Intrinsics.areEqual(s, arr_stackTraceElement[v].getClassName())) {
                ++v;
                continue;
            }
            return v;
        }
        return -1;
    }

    public static final void initCause(Throwable throwable0, Throwable throwable1) {
        throwable0.initCause(throwable1);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement0) {
        return StringsKt.startsWith$default(stackTraceElement0.getClassName(), "\b\b\b", false, 2, null);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] arr_stackTraceElement, ArrayDeque arrayDeque0) {
        int v;
        for(v = 0; true; ++v) {
            if(v >= arr_stackTraceElement.length) {
                v = -1;
                break;
            }
            if(StackTraceRecoveryKt.isArtificial(arr_stackTraceElement[v])) {
                break;
            }
        }
        int v1 = arr_stackTraceElement.length - 1;
        if(v + 1 <= v1) {
            while(true) {
                if(StackTraceRecoveryKt.elementWiseEquals(arr_stackTraceElement[v1], ((StackTraceElement)arrayDeque0.getLast()))) {
                    arrayDeque0.removeLast();
                }
                arrayDeque0.addFirst(arr_stackTraceElement[v1]);
                if(v1 == v + 1) {
                    break;
                }
                --v1;
            }
        }
    }

    // 去混淆评级： 低(40)
    public static final Object recoverAndThrow(Throwable throwable0, Continuation continuation0) {
        throw throwable0;
    }

    // 去混淆评级： 低(40)
    private static final Object recoverAndThrow$$forInline(Throwable throwable0, Continuation continuation0) {
        throw throwable0;
    }

    private static final Throwable recoverFromStackFrame(Throwable throwable0, CoroutineStackFrame coroutineStackFrame0) {
        Pair pair0 = StackTraceRecoveryKt.causeAndStacktrace(throwable0);
        Throwable throwable1 = (Throwable)pair0.component1();
        StackTraceElement[] arr_stackTraceElement = (StackTraceElement[])pair0.component2();
        Throwable throwable2 = ExceptionsConstuctorKt.tryCopyException(throwable1);
        if(throwable2 == null) {
            return throwable0;
        }
        if(!Intrinsics.areEqual(throwable2.getMessage(), throwable1.getMessage())) {
            return throwable0;
        }
        ArrayDeque arrayDeque0 = StackTraceRecoveryKt.createStackTrace(coroutineStackFrame0);
        if(arrayDeque0.isEmpty()) {
            return throwable0;
        }
        if(throwable1 != throwable0) {
            StackTraceRecoveryKt.mergeRecoveredTraces(arr_stackTraceElement, arrayDeque0);
        }
        return StackTraceRecoveryKt.createFinalException(throwable1, throwable2, arrayDeque0);
    }

    // 去混淆评级： 低(30)
    public static final Throwable recoverStackTrace(Throwable throwable0) {
        return throwable0;
    }

    // 去混淆评级： 低(40)
    public static final Throwable recoverStackTrace(Throwable throwable0, Continuation continuation0) {
        return throwable0;
    }

    private static final Throwable sanitizeStackTrace(Throwable throwable0) {
        StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
        int v = StackTraceRecoveryKt.frameIndex(arr_stackTraceElement, StackTraceRecoveryKt.stackTraceRecoveryClassName);
        int v1 = StackTraceRecoveryKt.frameIndex(arr_stackTraceElement, StackTraceRecoveryKt.baseContinuationImplClassName);
        int v3 = arr_stackTraceElement.length - v - (v1 == -1 ? 0 : arr_stackTraceElement.length - v1);
        StackTraceElement[] arr_stackTraceElement1 = new StackTraceElement[v3];
        for(int v2 = 0; v2 < v3; ++v2) {
            arr_stackTraceElement1[v2] = v2 == 0 ? StackTraceRecoveryKt.artificialFrame("Coroutine boundary") : arr_stackTraceElement[v + 1 + v2 - 1];
        }
        throwable0.setStackTrace(arr_stackTraceElement1);
        return throwable0;
    }

    // 去混淆评级： 低(30)
    public static final Throwable unwrap(Throwable throwable0) {
        return throwable0;
    }

    public static final Throwable unwrapImpl(Throwable throwable0) {
        Throwable throwable1 = throwable0.getCause();
        if(throwable1 != null && Intrinsics.areEqual(throwable1.getClass(), throwable0.getClass())) {
            StackTraceElement[] arr_stackTraceElement = throwable0.getStackTrace();
            for(int v = 0; v < arr_stackTraceElement.length; ++v) {
                if(StackTraceRecoveryKt.isArtificial(arr_stackTraceElement[v])) {
                    return throwable1;
                }
            }
            return throwable0;
        }
        return throwable0;
    }
}

