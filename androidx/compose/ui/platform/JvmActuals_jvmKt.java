package androidx.compose.ui.platform;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A\u001A\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u0001H\u0000\u001A\f\u0010\u0005\u001A\u00020\u0003*\u00020\u0003H\u0000*\f\b\u0000\u0010\u0006\"\u00020\u00072\u00020\u0007¨\u0006\b"}, d2 = {"simpleIdentityToString", "", "obj", "", "name", "nativeClass", "AtomicInt", "Ljava/util/concurrent/atomic/AtomicInteger;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class JvmActuals_jvmKt {
    public static final Object nativeClass(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "<this>");
        return object0.getClass();
    }

    public static final String simpleIdentityToString(Object object0, String s) {
        Intrinsics.checkNotNullParameter(object0, "obj");
        if(s == null) {
            s = object0.getClass().isAnonymousClass() ? object0.getClass().getName() : object0.getClass().getSimpleName();
        }
        String s1 = String.format("%07x", Arrays.copyOf(new Object[]{System.identityHashCode(object0)}, 1));
        Intrinsics.checkNotNullExpressionValue(s1, "java.lang.String.format(format, *args)");
        return s + '@' + s1;
    }
}

