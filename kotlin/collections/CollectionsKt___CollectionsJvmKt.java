package kotlin.collections;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001F\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A(\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001AA\u0010\u0006\u001A\u0002H\u0007\"\u0010\b\u0000\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\b\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\t\u001A\u0002H\u00072\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0005¢\u0006\u0002\u0010\n\u001A\u0016\u0010\u000B\u001A\u00020\f\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u000E\u001A5\u0010\u000F\u001A\u00020\u0010\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00100\u0012H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0013\u001A5\u0010\u000F\u001A\u00020\u0014\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u0002H\r\u0012\u0004\u0012\u00020\u00140\u0012H\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0015\u001A&\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\r0\u0017\"\u000E\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u0018*\b\u0012\u0004\u0012\u0002H\r0\u0003\u001A8\u0010\u0016\u001A\b\u0012\u0004\u0012\u0002H\r0\u0017\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u00032\u001A\u0010\u0019\u001A\u0016\u0012\u0006\b\u0000\u0012\u0002H\r0\u001Aj\n\u0012\u0006\b\u0000\u0012\u0002H\r`\u001B\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001C"}, d2 = {"filterIsInstance", "", "R", "", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "reverse", "", "T", "", "sumOf", "Ljava/math/BigDecimal;", "selector", "Lkotlin/Function1;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt___CollectionsJvmKt extends CollectionsKt__ReversedViewsKt {
    public static final List filterIsInstance(Iterable iterable0, Class class0) {
        Intrinsics.checkNotNullParameter(iterable0, "$this$filterIsInstance");
        Intrinsics.checkNotNullParameter(class0, "klass");
        return (List)CollectionsKt.filterIsInstanceTo(iterable0, new ArrayList(), class0);
    }

    public static final Collection filterIsInstanceTo(Iterable iterable0, Collection collection0, Class class0) {
        Intrinsics.checkNotNullParameter(iterable0, "$this$filterIsInstanceTo");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(class0, "klass");
        for(Object object0: iterable0) {
            if(class0.isInstance(object0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    public static final void reverse(List list0) {
        Intrinsics.checkNotNullParameter(list0, "$this$reverse");
        Collections.reverse(list0);
    }

    private static final BigDecimal sumOfBigDecimal(Iterable iterable0, Function1 function10) {
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal0, "BigDecimal.valueOf(this.toLong())");
        for(Object object0: iterable0) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(object0)));
            Intrinsics.checkNotNullExpressionValue(bigDecimal0, "this.add(other)");
        }
        return bigDecimal0;
    }

    private static final BigInteger sumOfBigInteger(Iterable iterable0, Function1 function10) {
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger0, "BigInteger.valueOf(this.toLong())");
        for(Object object0: iterable0) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(object0)));
            Intrinsics.checkNotNullExpressionValue(bigInteger0, "this.add(other)");
        }
        return bigInteger0;
    }

    public static final SortedSet toSortedSet(Iterable iterable0) {
        Intrinsics.checkNotNullParameter(iterable0, "$this$toSortedSet");
        return (SortedSet)CollectionsKt.toCollection(iterable0, new TreeSet());
    }

    public static final SortedSet toSortedSet(Iterable iterable0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(iterable0, "$this$toSortedSet");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return (SortedSet)CollectionsKt.toCollection(iterable0, new TreeSet(comparator0));
    }
}

