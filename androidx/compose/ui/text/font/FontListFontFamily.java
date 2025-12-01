package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0015\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u0003H\u0096\u0003J\u0017\u0010\u000F\u001A\u00020\r2\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0096\u0001J\u0013\u0010\u0012\u001A\u00020\r2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014H\u0096\u0002J\u0011\u0010\u0015\u001A\u00020\u00032\u0006\u0010\u0016\u001A\u00020\tH\u0096\u0003J\b\u0010\u0017\u001A\u00020\tH\u0016J\u0011\u0010\u0018\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u0003H\u0096\u0001J\t\u0010\u0019\u001A\u00020\rH\u0096\u0001J\u000F\u0010\u001A\u001A\b\u0012\u0004\u0012\u00020\u00030\u001BH\u0096\u0003J\u0011\u0010\u001C\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u0003H\u0096\u0001J\u000F\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00030\u001EH\u0096\u0001J\u0017\u0010\u001D\u001A\b\u0012\u0004\u0012\u00020\u00030\u001E2\u0006\u0010\u0016\u001A\u00020\tH\u0096\u0001J\u001F\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010 \u001A\u00020\t2\u0006\u0010!\u001A\u00020\tH\u0096\u0001J\b\u0010\"\u001A\u00020#H\u0016R\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001A\u00020\tX\u0096\u0005¢\u0006\u0006\u001A\u0004\b\n\u0010\u000B¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamily;", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "", "Landroidx/compose/ui/text/font/Font;", "fonts", "(Ljava/util/List;)V", "getFonts", "()Ljava/util/List;", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "", "equals", "other", "", "get", "index", "hashCode", "indexOf", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "subList", "fromIndex", "toIndex", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FontListFontFamily extends FileBasedFontFamily implements List, KMappedMarker {
    private final List fonts;

    public FontListFontFamily(List list0) {
        Intrinsics.checkNotNullParameter(list0, "fonts");
        super(null);
        this.fonts = list0;
        if(!list0.isEmpty() == 0) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
        HashSet hashSet0 = new HashSet(list0.size());
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = list0.get(v1);
                if(hashSet0.add(new Pair(((Font)object0).getWeight(), FontStyle.box-impl(((Font)object0).getStyle-_-LCdwA())))) {
                    arrayList0.add(object0);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        if(arrayList0.size() != this.fonts.size()) {
            throw new IllegalStateException("There cannot be two fonts with the same FontWeight and FontStyle in the same FontFamily");
        }
    }

    public void add(int v, Font font0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void add(int v, Object object0) {
        this.add(v, ((Font)object0));
    }

    public boolean add(Font font0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        return this.add(((Font)object0));
    }

    @Override
    public boolean addAll(int v, Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Font font0) {
        Intrinsics.checkNotNullParameter(font0, "element");
        return this.fonts.contains(font0);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Font ? this.contains(((Font)object0)) : false;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.fonts.containsAll(collection0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof FontListFontFamily ? Intrinsics.areEqual(this.fonts, ((FontListFontFamily)object0).fonts) : false;
    }

    public Font get(int v) {
        return (Font)this.fonts.get(v);
    }

    @Override
    public Object get(int v) {
        return this.get(v);
    }

    public final List getFonts() {
        return this.fonts;
    }

    public int getSize() {
        return this.fonts.size();
    }

    @Override
    public int hashCode() {
        return this.fonts.hashCode();
    }

    public int indexOf(Font font0) {
        Intrinsics.checkNotNullParameter(font0, "element");
        return this.fonts.indexOf(font0);
    }

    @Override
    public final int indexOf(Object object0) {
        return object0 instanceof Font ? this.indexOf(((Font)object0)) : -1;
    }

    @Override
    public boolean isEmpty() {
        return this.fonts.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.fonts.iterator();
    }

    public int lastIndexOf(Font font0) {
        Intrinsics.checkNotNullParameter(font0, "element");
        return this.fonts.lastIndexOf(font0);
    }

    @Override
    public final int lastIndexOf(Object object0) {
        return object0 instanceof Font ? this.lastIndexOf(((Font)object0)) : -1;
    }

    @Override
    public ListIterator listIterator() {
        return this.fonts.listIterator();
    }

    @Override
    public ListIterator listIterator(int v) {
        return this.fonts.listIterator(v);
    }

    public Font remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object remove(int v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean remove(Object object0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean removeAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Font set(int v, Font font0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Object set(int v, Object object0) {
        return this.set(v, ((Font)object0));
    }

    @Override
    public final int size() {
        return this.getSize();
    }

    @Override
    public void sort(Comparator comparator0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public List subList(int v, int v1) {
        return this.fonts.subList(v, v1);
    }

    @Override
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    @Override
    public Object[] toArray(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "array");
        return CollectionToArray.toArray(this, arr_object);
    }

    @Override
    public String toString() {
        return "FontListFontFamily(fonts=" + this.fonts + ')';
    }
}

