package kotlinx.coroutines.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001A\u00020\u0003H\u0016J\u001E\u0010\b\u001A\u0002H\t\"\u0004\b\u0000\u0010\t2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u0086\b¢\u0006\u0002\u0010\u000BR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/internal/Symbol;", "", "symbol", "", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "toString", "unbox", "T", "value", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Symbol {
    private final String symbol;

    public Symbol(String s) {
        this.symbol = s;
    }

    public final String getSymbol() {
        return this.symbol;
    }

    @Override
    public String toString() {
        return "<" + this.symbol + '>';
    }

    public final Object unbox(Object object0) {
        return object0 == this ? null : object0;
    }
}

