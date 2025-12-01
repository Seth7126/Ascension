package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001A\u00028\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000E\u0010\b\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\tJ\r\u0010\n\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\tR\u0010\u0010\u0003\u001A\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\u000B"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SingleElementListIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "element", "index", "", "(Ljava/lang/Object;I)V", "Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "previous", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SingleElementListIterator extends AbstractListIterator {
    private final Object element;

    public SingleElementListIterator(Object object0, int v) {
        super(v, 1);
        this.element = object0;
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        this.checkHasNext$runtime_release();
        this.setIndex(this.getIndex() + 1);
        return this.element;
    }

    @Override
    public Object previous() {
        this.checkHasPrevious$runtime_release();
        this.setIndex(this.getIndex() - 1);
        return this.element;
    }
}

