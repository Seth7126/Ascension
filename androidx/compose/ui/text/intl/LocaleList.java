package androidx.compose.ui.text.intl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0003\b\u0007\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!B\u000F\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005B\u001B\b\u0016\u0012\u0012\u0010\u0006\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007\"\u00020\u0002¢\u0006\u0002\u0010\bB\u0013\u0012\f\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000BJ\u0011\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0002H\u0096\u0002J\u0016\u0010\u0015\u001A\u00020\u00132\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016J\u0013\u0010\u0017\u001A\u00020\u00132\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019H\u0096\u0002J\u0011\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u000FH\u0086\u0002J\b\u0010\u001C\u001A\u00020\u000FH\u0016J\b\u0010\u001D\u001A\u00020\u0013H\u0016J\u000F\u0010\u001E\u001A\b\u0012\u0004\u0012\u00020\u00020\u001FH\u0096\u0002J\b\u0010 \u001A\u00020\u0004H\u0016R\u0017\u0010\t\u001A\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u00020\u000FX\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList;", "", "Landroidx/compose/ui/text/intl/Locale;", "languageTags", "", "(Ljava/lang/String;)V", "locales", "", "([Landroidx/compose/ui/text/intl/Locale;)V", "localeList", "", "(Ljava/util/List;)V", "getLocaleList", "()Ljava/util/List;", "size", "", "getSize", "()I", "contains", "", "element", "containsAll", "elements", "equals", "other", "", "get", "i", "hashCode", "isEmpty", "iterator", "", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LocaleList implements Collection, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/intl/LocaleList$Companion;", "", "()V", "current", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final LocaleList getCurrent() {
            List list0 = PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent();
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v = list0.size();
            if(v - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    arrayList0.add(new Locale(((PlatformLocale)list0.get(v1))));
                    if(v1 + 1 > v - 1) {
                        break;
                    }
                }
            }
            return new LocaleList(arrayList0);
        }
    }

    public static final Companion Companion;
    private final List localeList;
    private final int size;

    static {
        LocaleList.Companion = new Companion(null);
    }

    public LocaleList(String s) {
        Intrinsics.checkNotNullParameter(s, "languageTags");
        List list0 = StringsKt.split$default(s, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                Object object0 = list0.get(v2);
                if(((String)object0) == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                arrayList0.add(StringsKt.trim(((String)object0)).toString());
                if(v2 + 1 > v - 1) {
                    break;
                }
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v3 = arrayList0.size();
        if(v3 - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                arrayList1.add(new Locale(((String)arrayList0.get(v1))));
                if(v1 + 1 > v3 - 1) {
                    break;
                }
            }
        }
        this(arrayList1);
    }

    public LocaleList(List list0) {
        Intrinsics.checkNotNullParameter(list0, "localeList");
        super();
        this.localeList = list0;
        this.size = list0.size();
    }

    public LocaleList(Locale[] arr_locale) {
        Intrinsics.checkNotNullParameter(arr_locale, "locales");
        this(ArraysKt.toList(arr_locale));
    }

    public boolean add(Locale locale0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean add(Object object0) {
        return this.add(((Locale)object0));
    }

    @Override
    public boolean addAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Locale locale0) {
        Intrinsics.checkNotNullParameter(locale0, "element");
        return this.localeList.contains(locale0);
    }

    @Override
    public final boolean contains(Object object0) {
        return object0 instanceof Locale ? this.contains(((Locale)object0)) : false;
    }

    @Override
    public boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.localeList.containsAll(collection0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof LocaleList ? Intrinsics.areEqual(this.localeList, ((LocaleList)object0).localeList) : false;
    }

    public final Locale get(int v) {
        return (Locale)this.localeList.get(v);
    }

    public final List getLocaleList() {
        return this.localeList;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int hashCode() {
        return this.localeList.hashCode();
    }

    @Override
    public boolean isEmpty() {
        return this.localeList.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return this.localeList.iterator();
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
    public boolean removeIf(Predicate predicate0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean retainAll(Collection collection0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.getSize();
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
        return "LocaleList(localeList=" + this.localeList + ')';
    }
}

