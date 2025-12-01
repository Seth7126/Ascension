package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext.Element;
import kotlin.coroutines.CoroutineContext.Key;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ5\u0010\u0006\u001A\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u001C\u0010\b\u001A\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00070\n\u0012\u0006\u0012\u0004\u0018\u00010\u000B0\tH¦@ø\u0001\u0000¢\u0006\u0002\u0010\fR\u0018\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u00038VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "onInfiniteOperation", "R", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Key", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface InfiniteAnimationPolicy extends Element {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static Object fold(InfiniteAnimationPolicy infiniteAnimationPolicy0, Object object0, Function2 function20) {
            Intrinsics.checkNotNullParameter(infiniteAnimationPolicy0, "this");
            Intrinsics.checkNotNullParameter(function20, "operation");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.fold(infiniteAnimationPolicy0, object0, function20);
        }

        public static Element get(InfiniteAnimationPolicy infiniteAnimationPolicy0, Key coroutineContext$Key0) {
            Intrinsics.checkNotNullParameter(infiniteAnimationPolicy0, "this");
            Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.get(infiniteAnimationPolicy0, coroutineContext$Key0);
        }

        public static Key getKey(InfiniteAnimationPolicy infiniteAnimationPolicy0) {
            Intrinsics.checkNotNullParameter(infiniteAnimationPolicy0, "this");
            return InfiniteAnimationPolicy.Key;
        }

        public static CoroutineContext minusKey(InfiniteAnimationPolicy infiniteAnimationPolicy0, Key coroutineContext$Key0) {
            Intrinsics.checkNotNullParameter(infiniteAnimationPolicy0, "this");
            Intrinsics.checkNotNullParameter(coroutineContext$Key0, "key");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.minusKey(infiniteAnimationPolicy0, coroutineContext$Key0);
        }

        public static CoroutineContext plus(InfiniteAnimationPolicy infiniteAnimationPolicy0, CoroutineContext coroutineContext0) {
            Intrinsics.checkNotNullParameter(infiniteAnimationPolicy0, "this");
            Intrinsics.checkNotNullParameter(coroutineContext0, "context");
            return kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(infiniteAnimationPolicy0, coroutineContext0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InfiniteAnimationPolicy$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/compose/ui/platform/InfiniteAnimationPolicy;", "()V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class androidx.compose.ui.platform.InfiniteAnimationPolicy.Key implements Key {
        static final androidx.compose.ui.platform.InfiniteAnimationPolicy.Key $$INSTANCE;

        static {
            androidx.compose.ui.platform.InfiniteAnimationPolicy.Key.$$INSTANCE = new androidx.compose.ui.platform.InfiniteAnimationPolicy.Key();
        }
    }

    public static final androidx.compose.ui.platform.InfiniteAnimationPolicy.Key Key;

    static {
        InfiniteAnimationPolicy.Key = androidx.compose.ui.platform.InfiniteAnimationPolicy.Key.$$INSTANCE;
    }

    @Override  // kotlin.coroutines.CoroutineContext$Element
    Key getKey();

    Object onInfiniteOperation(Function1 arg1, Continuation arg2);
}

