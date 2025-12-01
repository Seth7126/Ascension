package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001A\u00020\u0007H\u0016J\n\u0010\b\u001A\u0004\u0018\u00010\u0007H\u0005R\u0012\u0010\u0003\u001A\u00020\u0000X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "toString", "", "toStringInternalImpl", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class MainCoroutineDispatcher extends CoroutineDispatcher {
    public abstract MainCoroutineDispatcher getImmediate();

    @Override  // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String s = this.toStringInternalImpl();
        return s == null ? DebugStringsKt.getClassSimpleName(this) + '@' + DebugStringsKt.getHexAddress(this) : s;
    }

    protected final String toStringInternalImpl() {
        MainCoroutineDispatcher mainCoroutineDispatcher1;
        MainCoroutineDispatcher mainCoroutineDispatcher0 = Dispatchers.getMain();
        if(this == mainCoroutineDispatcher0) {
            return "Dispatchers.Main";
        }
        try {
            mainCoroutineDispatcher1 = null;
            mainCoroutineDispatcher1 = mainCoroutineDispatcher0.getImmediate();
        }
        catch(UnsupportedOperationException unused_ex) {
        }
        return this == mainCoroutineDispatcher1 ? "Dispatchers.Main.immediate" : null;
    }
}

