package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\b\u0000\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001A\u00028\u0000\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0013\u0010\u0005\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000E¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/ProvidedValue;", "T", "", "compositionLocal", "Landroidx/compose/runtime/CompositionLocal;", "value", "canOverride", "", "(Landroidx/compose/runtime/CompositionLocal;Ljava/lang/Object;Z)V", "getCanOverride", "()Z", "getCompositionLocal", "()Landroidx/compose/runtime/CompositionLocal;", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ProvidedValue {
    public static final int $stable;
    private final boolean canOverride;
    private final CompositionLocal compositionLocal;
    private final Object value;

    static {
    }

    public ProvidedValue(CompositionLocal compositionLocal0, Object object0, boolean z) {
        Intrinsics.checkNotNullParameter(compositionLocal0, "compositionLocal");
        super();
        this.compositionLocal = compositionLocal0;
        this.value = object0;
        this.canOverride = z;
    }

    public final boolean getCanOverride() {
        return this.canOverride;
    }

    public final CompositionLocal getCompositionLocal() {
        return this.compositionLocal;
    }

    public final Object getValue() {
        return this.value;
    }
}

