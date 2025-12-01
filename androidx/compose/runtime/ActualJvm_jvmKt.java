package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0012\u0010\u0000\u001A\u00020\u00012\b\u0010\u0002\u001A\u0004\u0018\u00010\u0003H\u0000\u001A-\u0010\u0004\u001A\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001A\u00020\u00032\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u0002H\u00050\bH\u0081\bø\u0001\u0000¢\u0006\u0002\u0010\t*\u001E\b\u0000\u0010\n\u001A\u0004\b\u0000\u0010\u000B\"\b\u0012\u0004\u0012\u0002H\u000B0\f2\b\u0012\u0004\u0012\u0002H\u000B0\f*\f\b\u0000\u0010\r\"\u00020\u000E2\u00020\u000E\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000F"}, d2 = {"identityHashCode", "", "instance", "", "synchronized", "R", "lock", "block", "Lkotlin/Function0;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "AtomicReference", "V", "Ljava/util/concurrent/atomic/AtomicReference;", "TestOnly", "Lorg/jetbrains/annotations/TestOnly;", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ActualJvm_jvmKt {
    public static final int identityHashCode(Object object0) {
        return System.identityHashCode(object0);
    }

    public static final Object synchronized(Object object0, Function0 function00) {
        Intrinsics.checkNotNullParameter(object0, "lock");
        Intrinsics.checkNotNullParameter(function00, "block");
        synchronized(object0) {
            return function00.invoke();
        }
    }
}

