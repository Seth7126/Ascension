package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.EndOfChain;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000F\b\u0016\u0012\u0006\u0010\u0003\u001A\u00028\u0000¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\u0006B!\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002¢\u0006\u0002\u0010\bJ\u0016\u0010\u0014\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0015\u001A\u0004\u0018\u00010\u0002J\u0016\u0010\u0016\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0017\u001A\u0004\u0018\u00010\u0002J\u0019\u0010\u0018\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0019\u001A\u00028\u0000¢\u0006\u0002\u0010\u001AR\u0011\u0010\t\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\r\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\fR\u0013\u0010\u0007\u001A\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0013\u0010\u0005\u001A\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0003\u001A\u00028\u0000¢\u0006\n\n\u0002\u0010\u0013\u001A\u0004\b\u0012\u0010\u0010¨\u0006\u001B"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "V", "", "value", "(Ljava/lang/Object;)V", "previous", "(Ljava/lang/Object;Ljava/lang/Object;)V", "next", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "hasNext", "", "getHasNext", "()Z", "hasPrevious", "getHasPrevious", "getNext", "()Ljava/lang/Object;", "getPrevious", "getValue", "Ljava/lang/Object;", "withNext", "newNext", "withPrevious", "newPrevious", "withValue", "newValue", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/persistentOrderedMap/LinkedValue;", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LinkedValue {
    private final Object next;
    private final Object previous;
    private final Object value;

    public LinkedValue(Object object0) {
        this(object0, EndOfChain.INSTANCE, EndOfChain.INSTANCE);
    }

    public LinkedValue(Object object0, Object object1) {
        this(object0, object1, EndOfChain.INSTANCE);
    }

    public LinkedValue(Object object0, Object object1, Object object2) {
        this.value = object0;
        this.previous = object1;
        this.next = object2;
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

    public final Object getValue() {
        return this.value;
    }

    public final LinkedValue withNext(Object object0) {
        return new LinkedValue(this.value, this.previous, object0);
    }

    public final LinkedValue withPrevious(Object object0) {
        return new LinkedValue(this.value, object0, this.next);
    }

    public final LinkedValue withValue(Object object0) {
        return new LinkedValue(object0, this.previous, this.next);
    }
}

