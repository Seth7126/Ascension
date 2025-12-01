package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0011\b\u0016\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0004B\u0019\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001A\u00020\u00002\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001J\u0010\u0010\u0012\u001A\u00020\u00002\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001R\u0011\u0010\u0007\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u0011\u0010\u000B\u001A\u00020\b8F¢\u0006\u0006\u001A\u0004\b\f\u0010\nR\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0013\u0010\u0003\u001A\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u000E¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedSet/Links;", "", "()V", "previous", "(Ljava/lang/Object;)V", "next", "(Ljava/lang/Object;Ljava/lang/Object;)V", "hasNext", "", "getHasNext", "()Z", "hasPrevious", "getHasPrevious", "getNext", "()Ljava/lang/Object;", "getPrevious", "withNext", "newNext", "withPrevious", "newPrevious", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Links {
    private final Object next;
    private final Object previous;

    public Links() {
        this(EndOfChain.INSTANCE, EndOfChain.INSTANCE);
    }

    public Links(Object object0) {
        this(object0, EndOfChain.INSTANCE);
    }

    public Links(Object object0, Object object1) {
        this.previous = object0;
        this.next = object1;
    }

    public final boolean getHasNext() {
        return this.next != EndOfChain.INSTANCE;
    }

    public final boolean getHasPrevious() {
        return this.previous != EndOfChain.INSTANCE;
    }

    public final Object getNext() {
        return this.next;
    }

    public final Object getPrevious() {
        return this.previous;
    }

    public final Links withNext(Object object0) {
        return new Links(this.previous, object0);
    }

    public final Links withPrevious(Object object0) {
        return new Links(object0, this.next);
    }
}

