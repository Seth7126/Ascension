package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B-\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0007\u0012\u0006\u0010\t\u001A\u00020\u0007¢\u0006\u0002\u0010\nJ\r\u0010\u000F\u001A\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0010J\u0018\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u0007H\u0002J\u0010\u0010\u0014\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0007H\u0002J\u000E\u0010\u0016\u001A\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0010J\r\u0010\u0017\u001A\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J7\u0010\u0018\u001A\u00020\u00122\u000E\u0010\u0003\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\t\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\u0019\u0010\nR\u000E\u0010\t\u001A\u00020\u0007X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\fX\u0082\u000E¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u000E¢\u0006\u0004\n\u0002\u0010\u000E¨\u0006\u001A"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/TrieIterator;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractListIterator;", "root", "", "", "index", "", "size", "height", "([Ljava/lang/Object;III)V", "isInRightEdge", "", "path", "[Ljava/lang/Object;", "elementAtCurrentIndex", "()Ljava/lang/Object;", "fillPath", "", "startLevel", "fillPathIfNeeded", "indexPredicate", "next", "previous", "reset", "reset$runtime_release", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TrieIterator extends AbstractListIterator {
    private int height;
    private boolean isInRightEdge;
    private Object[] path;

    public TrieIterator(Object[] arr_object, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_object, "root");
        super(v, v1);
        this.height = v2;
        Object[] arr_object1 = new Object[v2];
        this.path = arr_object1;
        int v3 = v == v1 ? 1 : 0;
        this.isInRightEdge = v3;
        arr_object1[0] = arr_object;
        this.fillPath(v - v3, 1);
    }

    private final Object elementAtCurrentIndex() {
        int v = this.getIndex();
        Object object0 = this.path[this.height - 1];
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        }
        return ((Object[])object0)[v & 0x1F];
    }

    private final void fillPath(int v, int v1) {
        int v2 = (this.height - v1) * 5;
        while(v1 < this.height) {
            Object[] arr_object = this.path;
            Object object0 = arr_object[v1 - 1];
            if(object0 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            }
            arr_object[v1] = ((Object[])object0)[v >> v2 & 0x1F];
            v2 -= 5;
            ++v1;
        }
    }

    private final void fillPathIfNeeded(int v) {
        int v1;
        for(v1 = 0; UtilsKt.indexSegment(this.getIndex(), v1) == v; v1 += 5) {
        }
        if(v1 > 0) {
            int v2 = this.height - 1 - v1 / 5;
            this.fillPath(this.getIndex(), v2 + 1);
        }
    }

    @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator
    public Object next() {
        if(!this.hasNext()) {
            throw new NoSuchElementException();
        }
        Object object0 = this.elementAtCurrentIndex();
        this.setIndex(this.getIndex() + 1);
        if(this.getIndex() == this.getSize()) {
            this.isInRightEdge = true;
            return object0;
        }
        this.fillPathIfNeeded(0);
        return object0;
    }

    @Override
    public Object previous() {
        if(!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.setIndex(this.getIndex() - 1);
        if(this.isInRightEdge) {
            this.isInRightEdge = false;
            return this.elementAtCurrentIndex();
        }
        this.fillPathIfNeeded(0x1F);
        return this.elementAtCurrentIndex();
    }

    public final void reset$runtime_release(Object[] arr_object, int v, int v1, int v2) {
        Intrinsics.checkNotNullParameter(arr_object, "root");
        this.setIndex(v);
        this.setSize(v1);
        this.height = v2;
        if(this.path.length < v2) {
            this.path = new Object[v2];
        }
        int v3 = 0;
        this.path[0] = arr_object;
        if(v == v1) {
            v3 = 1;
        }
        this.isInRightEdge = v3;
        this.fillPath(v - v3, 1);
    }
}

