package androidx.compose.runtime.external.kotlinx.collections.immutable;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001\bJ\u001E\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "E", "", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableCollection;", "subList", "fromIndex", "", "toIndex", "SubList", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ImmutableList extends ImmutableCollection, List, KMappedMarker {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static ImmutableList subList(ImmutableList immutableList0, int v, int v1) {
            Intrinsics.checkNotNullParameter(immutableList0, "this");
            return new SubList(immutableList0, v, v1);
        }
    }

    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0006\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0002\u0010\bJ\u0016\u0010\r\u001A\u00028\u00012\u0006\u0010\u000E\u001A\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u000FJ\u001E\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0016R\u000E\u0010\t\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0014\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList$SubList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Lkotlin/collections/AbstractList;", "source", "fromIndex", "", "toIndex", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;II)V", "_size", "size", "getSize", "()I", "get", "index", "(I)Ljava/lang/Object;", "subList", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class SubList extends AbstractList implements ImmutableList {
        private int _size;
        private final int fromIndex;
        private final ImmutableList source;
        private final int toIndex;

        public SubList(ImmutableList immutableList0, int v, int v1) {
            Intrinsics.checkNotNullParameter(immutableList0, "source");
            super();
            this.source = immutableList0;
            this.fromIndex = v;
            this.toIndex = v1;
            ListImplementation.checkRangeIndexes$runtime_release(v, v1, immutableList0.size());
            this._size = v1 - v;
        }

        @Override  // kotlin.collections.AbstractList
        public Object get(int v) {
            ListImplementation.checkElementIndex$runtime_release(v, this._size);
            return this.source.get(this.fromIndex + v);
        }

        @Override  // kotlin.collections.AbstractList
        public int getSize() {
            return this._size;
        }

        @Override  // androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList
        public ImmutableList subList(int v, int v1) {
            ListImplementation.checkRangeIndexes$runtime_release(v, v1, this._size);
            return new SubList(this.source, v + this.fromIndex, this.fromIndex + v1);
        }

        @Override  // kotlin.collections.AbstractList
        public List subList(int v, int v1) {
            return this.subList(v, v1);
        }
    }

    ImmutableList subList(int arg1, int arg2);
}

