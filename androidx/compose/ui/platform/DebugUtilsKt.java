package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u001A\u0010\u0000\u001A\u00020\u00012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0080\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0004"}, d2 = {"ifDebug", "", "block", "Lkotlin/Function0;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class DebugUtilsKt {
    public static final void ifDebug(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "block");
        function00.invoke();
    }
}

