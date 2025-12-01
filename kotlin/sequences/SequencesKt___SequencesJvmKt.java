package kotlin.sequences;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001F\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A(\u0010\u0000\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001AA\u0010\u0005\u001A\u0002H\u0006\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0007\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001A\u0002H\u00062\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\t\u001A5\u0010\n\u001A\u00020\u000B\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u000B0\u000EH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u000F\u001A5\u0010\n\u001A\u00020\u0010\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00012\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u00020\u00100\u000EH\u0087\bø\u0001\u0000¢\u0006\u0002\b\u0011\u001A&\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\f0\u0013\"\u000E\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0014*\b\u0012\u0004\u0012\u0002H\f0\u0001\u001A8\u0010\u0012\u001A\b\u0012\u0004\u0012\u0002H\f0\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00012\u001A\u0010\u0015\u001A\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u0016j\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"filterIsInstance", "Lkotlin/sequences/Sequence;", "R", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "sumOf", "Ljava/math/BigDecimal;", "T", "selector", "Lkotlin/Function1;", "sumOfBigDecimal", "Ljava/math/BigInteger;", "sumOfBigInteger", "toSortedSet", "Ljava/util/SortedSet;", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/sequences/SequencesKt")
class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
    public static final Sequence filterIsInstance(Sequence sequence0, Class class0) {
        Intrinsics.checkNotNullParameter(sequence0, "$this$filterIsInstance");
        Intrinsics.checkNotNullParameter(class0, "klass");
        Sequence sequence1 = SequencesKt.filter(sequence0, new Function1(class0) {
            final Class $klass;

            {
                this.$klass = class0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Boolean.valueOf(this.invoke(object0));
            }

            public final boolean invoke(Object object0) {
                return this.$klass.isInstance(object0);
            }
        });
        if(sequence1 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
        }
        return sequence1;
    }

    public static final Collection filterIsInstanceTo(Sequence sequence0, Collection collection0, Class class0) {
        Intrinsics.checkNotNullParameter(sequence0, "$this$filterIsInstanceTo");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(class0, "klass");
        for(Object object0: sequence0) {
            if(class0.isInstance(object0)) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    private static final BigDecimal sumOfBigDecimal(Sequence sequence0, Function1 function10) {
        BigDecimal bigDecimal0 = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimal0, "BigDecimal.valueOf(this.toLong())");
        for(Object object0: sequence0) {
            bigDecimal0 = bigDecimal0.add(((BigDecimal)function10.invoke(object0)));
            Intrinsics.checkNotNullExpressionValue(bigDecimal0, "this.add(other)");
        }
        return bigDecimal0;
    }

    private static final BigInteger sumOfBigInteger(Sequence sequence0, Function1 function10) {
        BigInteger bigInteger0 = BigInteger.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigInteger0, "BigInteger.valueOf(this.toLong())");
        for(Object object0: sequence0) {
            bigInteger0 = bigInteger0.add(((BigInteger)function10.invoke(object0)));
            Intrinsics.checkNotNullExpressionValue(bigInteger0, "this.add(other)");
        }
        return bigInteger0;
    }

    public static final SortedSet toSortedSet(Sequence sequence0) {
        Intrinsics.checkNotNullParameter(sequence0, "$this$toSortedSet");
        return (SortedSet)SequencesKt.toCollection(sequence0, new TreeSet());
    }

    public static final SortedSet toSortedSet(Sequence sequence0, Comparator comparator0) {
        Intrinsics.checkNotNullParameter(sequence0, "$this$toSortedSet");
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        return (SortedSet)SequencesKt.toCollection(sequence0, new TreeSet(comparator0));
    }
}

