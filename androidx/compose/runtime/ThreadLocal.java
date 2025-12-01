package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0007J\u000F\u0010\u0003\u001A\u0004\u0018\u00018\u0000H\u0014¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000BR\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ThreadLocal;", "T", "Ljava/lang/ThreadLocal;", "initialValue", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "get", "()Ljava/lang/Object;", "set", "", "value", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class ThreadLocal extends java.lang.ThreadLocal {
    private final Function0 initialValue;

    public ThreadLocal(Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "initialValue");
        super();
        this.initialValue = function00;
    }

    @Override
    public Object get() {
        return super.get();
    }

    @Override
    protected Object initialValue() {
        return this.initialValue.invoke();
    }

    @Override
    public void set(Object object0) {
        super.set(object0);
    }
}

