package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000F2\u00020\u0001:\u0001\u000FJ:\u0010\u0006\u001A\u0002H\u0007\"\u0004\b\u0000\u0010\u00072!\u0010\b\u001A\u001D\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000B\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u0002H\u00070\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000ER\u0018\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "withFrameNanos", "R", "onFrame", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Key", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface MonotonicFrameClock extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object fold(MonotonicFrameClock monotonicFrameClock0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(monotonicFrameClock0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(monotonicFrameClock0, object0, function20);
        }

        public static Element get(MonotonicFrameClock monotonicFrameClock0, Key coroutineContext$Key0) {
            Intrinsics.checkNotNullParameter(monotonicFrameClock0, "this");
            Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(monotonicFrameClock0, coroutineContext$Key0);
        }

        public static Key getKey(MonotonicFrameClock monotonicFrameClock0) {
            Intrinsics.checkNotNullParameter(monotonicFrameClock0, "this");
            return MonotonicFrameClock.Key;
        }

        public static CoroutineContext minusKey(MonotonicFrameClock monotonicFrameClock0, Key coroutineContext$Key0) {
            Intrinsics.checkNotNullParameter(monotonicFrameClock0, "this");
            Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(monotonicFrameClock0, coroutineContext$Key0);
        }

        public static CoroutineContext plus(MonotonicFrameClock monotonicFrameClock0, CoroutineContext coroutineContext0) {
            Intrinsics.checkNotNullParameter(monotonicFrameClock0, "this");
            Intrinsics.checkNotNullParameter(coroutineContext0, "context");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(monotonicFrameClock0, coroutineContext0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/MonotonicFrameClock$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/runtime/MonotonicFrameClock;", "()V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class androidx.compose.runtime.MonotonicFrameClock.Key implements Key {
        static final androidx.compose.runtime.MonotonicFrameClock.Key $$INSTANCE;

        static {
            androidx.compose.runtime.MonotonicFrameClock.Key.$$INSTANCE = new androidx.compose.runtime.MonotonicFrameClock.Key();
        }
    }

    public static final androidx.compose.runtime.MonotonicFrameClock.Key Key;

    static {
        MonotonicFrameClock.Key = androidx.compose.runtime.MonotonicFrameClock.Key.$$INSTANCE;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    Key getKey();

    Object withFrameNanos(Function1 arg1, Continuation arg2);
}

