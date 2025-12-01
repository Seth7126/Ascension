package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0016\u0010\u0000\u001A\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\u0000¨\u0006\u0003"}, d2 = {"ThreadLocal", "Landroidx/compose/runtime/ThreadLocal;", "T", "runtime_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ExpectKt {
    public static final ThreadLocal ThreadLocal() {
        return new ThreadLocal(androidx.compose.runtime.ExpectKt.ThreadLocal.1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.runtime.ExpectKt.ThreadLocal.1 extends Lambda implements Function0 {
            public static final androidx.compose.runtime.ExpectKt.ThreadLocal.1 INSTANCE;

            static {
                androidx.compose.runtime.ExpectKt.ThreadLocal.1.INSTANCE = new androidx.compose.runtime.ExpectKt.ThreadLocal.1();
            }

            androidx.compose.runtime.ExpectKt.ThreadLocal.1() {
                super(0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return null;
            }
        }

    }
}

