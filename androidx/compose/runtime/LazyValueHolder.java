package androidx.compose.runtime;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u001B\u0010\u0006\u001A\u00028\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\u000B\u001A\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/LazyValueHolder;", "T", "Landroidx/compose/runtime/State;", "valueProducer", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "current", "getCurrent", "()Ljava/lang/Object;", "current$delegate", "Lkotlin/Lazy;", "value", "getValue", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LazyValueHolder implements State {
    private final Lazy current$delegate;

    static {
    }

    public LazyValueHolder(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "valueProducer");
        super();
        this.current$delegate = LazyKt.lazy(function00);
    }

    private final Object getCurrent() {
        return this.current$delegate.getValue();
    }

    @Override  // androidx.compose.runtime.State
    public Object getValue() {
        return this.getCurrent();
    }
}

