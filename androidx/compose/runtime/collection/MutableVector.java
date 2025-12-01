package androidx.compose.runtime.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u001E\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003pqrB\u001F\b\u0001\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\u0002\u0010\bJ\u0013\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00028\u0000\u00A2\u0006\u0002\u0010\u001EJ\u001B\u0010\u001B\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00028\u0000\u00A2\u0006\u0002\u0010!J\u0017\u0010\"\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\bJ\u0019\u0010\"\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005\u00A2\u0006\u0002\u0010$J\u001C\u0010\"\u001A\u00020\u001C2\u0006\u0010 \u001A\u00020\u00072\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000J\u001C\u0010\"\u001A\u00020\u001C2\u0006\u0010 \u001A\u00020\u00072\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000%J\u001C\u0010\"\u001A\u00020\u001C2\u0006\u0010 \u001A\u00020\u00072\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000&J\u0014\u0010\"\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000%J\u0017\u0010\"\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000&H\u0086\bJ+\u0010\'\u001A\u00020\u001C2\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010*\u001A\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0006\u0010+\u001A\u00020\u001FJ\u0016\u0010,\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0002\u0010\u001EJ\u0014\u0010-\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010-\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010-\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000&J\u0014\u0010.\u001A\u00020\u001C2\f\u0010/\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000J\u000E\u00100\u001A\u00020\u001F2\u0006\u00101\u001A\u00020\u0007J\u000B\u00102\u001A\u00028\u0000\u00A2\u0006\u0002\u00103J0\u00102\u001A\u00028\u00002\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u00104J\u0010\u00105\u001A\u0004\u0018\u00018\u0000H\u0086\b\u00A2\u0006\u0002\u00103J2\u00105\u001A\u0004\u0018\u00018\u00002\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u00104JS\u00106\u001A\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001A\u0002H72\'\u00109\u001A#\u0012\u0013\u0012\u0011H7\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70:H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0002\u0010>Jh\u0010?\u001A\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001A\u0002H72<\u00109\u001A8\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0013\u0012\u0011H7\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70@H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0002\u0010AJS\u0010B\u001A\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001A\u0002H72\'\u00109\u001A#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H7\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u0002H70:H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0002\u0010>Jh\u0010C\u001A\u0002H7\"\u0004\b\u0001\u001072\u0006\u00108\u001A\u0002H72<\u00109\u001A8\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u0011H7\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b(=\u0012\u0004\u0012\u0002H70@H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u00A2\u0006\u0002\u0010AJ+\u0010D\u001A\u00020\u001F2\u0012\u0010E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001F0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u0010F\u001A\u00020\u001F2\u0018\u0010E\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001F0:H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010G\u001A\u00020\u001F2\u0012\u0010E\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001F0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J1\u0010H\u001A\u00020\u001F2\u0018\u0010E\u001A\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001F0:H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010I\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u0007H\u0086\n\u00A2\u0006\u0002\u0010JJ\u0013\u0010K\u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00028\u0000\u00A2\u0006\u0002\u0010LJ+\u0010M\u001A\u00020\u00072\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J+\u0010N\u001A\u00020\u00072\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010O\u001A\u00020\u001CJ\u0006\u0010P\u001A\u00020\u001CJ\u000B\u0010Q\u001A\u00028\u0000\u00A2\u0006\u0002\u00103J0\u0010Q\u001A\u00028\u00002\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u00104J\u0013\u0010R\u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00028\u0000\u00A2\u0006\u0002\u0010LJ\u0010\u0010S\u001A\u0004\u0018\u00018\u0000H\u0086\b\u00A2\u0006\u0002\u00103J2\u0010S\u001A\u0004\u0018\u00018\u00002\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u00104J>\u0010T\u001A\b\u0012\u0004\u0012\u0002H70\u0005\"\u0006\b\u0001\u00107\u0018\u00012\u0012\u0010U\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u0010VJS\u0010W\u001A\b\u0012\u0004\u0012\u0002H70\u0005\"\u0006\b\u0001\u00107\u0018\u00012\'\u0010U\u001A#\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u0002H70:H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u0010XJP\u0010Y\u001A\b\u0012\u0004\u0012\u0002H70\u0000\"\u0006\b\u0001\u00107\u0018\u00012)\u0010U\u001A%\u0012\u0013\u0012\u00110\u0007\u00A2\u0006\f\b;\u0012\b\b<\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H70:H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J;\u0010Z\u001A\b\u0012\u0004\u0012\u0002H70\u0000\"\u0006\b\u0001\u00107\u0018\u00012\u0014\u0010U\u001A\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u0001H70)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0016\u0010[\u001A\u00020\u001F2\u0006\u0010\u001D\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0002\u0010\\J\u0016\u0010]\u001A\u00020\u001F2\u0006\u0010\u001D\u001A\u00028\u0000H\u0086\n\u00A2\u0006\u0002\u0010\\J\u0013\u0010^\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00028\u0000\u00A2\u0006\u0002\u0010\u001EJ\u0014\u0010_\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000\u0000J\u0014\u0010_\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000%J\u0014\u0010_\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000&J\u0013\u0010`\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u0007\u00A2\u0006\u0002\u0010JJ\u0016\u0010a\u001A\u00020\u001F2\u0006\u0010b\u001A\u00020\u00072\u0006\u0010c\u001A\u00020\u0007J\u0014\u0010d\u001A\u00020\u001C2\f\u0010#\u001A\b\u0012\u0004\u0012\u00028\u00000%J+\u0010e\u001A\u00020\u001C2\u0012\u0010(\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001C0)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u001E\u0010f\u001A\u00028\u00002\u0006\u0010 \u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00028\u0000H\u0086\u0002\u00A2\u0006\u0002\u0010gJ\u001E\u0010h\u001A\u00020\u001F2\u0016\u0010i\u001A\u0012\u0012\u0004\u0012\u00028\u00000jj\b\u0012\u0004\u0012\u00028\u0000`kJ+\u0010l\u001A\u00020\u00072\u0012\u0010m\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070)H\u0086\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010n\u001A\u00020oH\u0001R.\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00058\u0000@\u0000X\u0081\u000E\u00A2\u0006\u0016\n\u0002\u0010\u000F\u0012\u0004\b\t\u0010\n\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u0012\u0010\u0010\u001A\u00020\u00118\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001A\u00020\u00078\u00C6\u0002\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001E\u0010\u0006\u001A\u00020\u00072\u0006\u0010\u0019\u001A\u00020\u0007@BX\u0086\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006s"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "content", "", "size", "", "([Ljava/lang/Object;I)V", "getContent$annotations", "()V", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "list", "", "<set-?>", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "([Ljava/lang/Object;)Z", "", "", "any", "predicate", "Lkotlin/Function1;", "asMutableList", "clear", "contains", "containsAll", "contentEquals", "other", "ensureCapacity", "capacity", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "map", "transform", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "minusAssign", "(Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "reversedAny", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "sortWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sumBy", "selector", "throwNoSuchElementException", "", "MutableVectorList", "SubList", "VectorListIterator", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class MutableVector implements RandomAccess {
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u00A2\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\rJ\u001D\u0010\n\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00072\u0006\u0010\f\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u0010J\u001E\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u000F\u001A\u00020\u00072\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001A\u00020\u000EH\u0016J\u0016\u0010\u0015\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00028\u0001H\u0096\u0002\u00A2\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001A\u00028\u00012\u0006\u0010\u000F\u001A\u00020\u0007H\u0096\u0002\u00A2\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001A\u00020\u00072\u0006\u0010\f\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u001AJ\b\u0010\u001B\u001A\u00020\u000BH\u0016J\u000F\u0010\u001C\u001A\b\u0012\u0004\u0012\u00028\u00010\u001DH\u0096\u0002J\u0015\u0010\u001E\u001A\u00020\u00072\u0006\u0010\f\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u001AJ\u000E\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001F\u001A\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000F\u001A\u00020\u0007H\u0016J\u0015\u0010!\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\rJ\u0016\u0010\"\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001A\u00028\u00012\u0006\u0010\u000F\u001A\u00020\u0007H\u0016\u00A2\u0006\u0002\u0010\u0018J\u0016\u0010$\u001A\u00020\u000B2\f\u0010\u0012\u001A\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001E\u0010%\u001A\u00028\u00012\u0006\u0010\u000F\u001A\u00020\u00072\u0006\u0010\f\u001A\u00028\u0001H\u0096\u0002\u00A2\u0006\u0002\u0010&J\u001E\u0010\'\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001A\u00020\u00072\u0006\u0010)\u001A\u00020\u0007H\u0016R\u0014\u0010\u0006\u001A\u00020\u00078VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006*"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", "T", "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "(Landroidx/compose/runtime/collection/MutableVector;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class MutableVectorList implements List, KMutableList {
        private final MutableVector vector;

        public MutableVectorList(MutableVector mutableVector0) {
            Intrinsics.checkNotNullParameter(mutableVector0, "vector");
            super();
            this.vector = mutableVector0;
        }

        @Override
        public void add(int v, Object object0) {
            this.vector.add(v, object0);
        }

        @Override
        public boolean add(Object object0) {
            return this.vector.add(object0);
        }

        @Override
        public boolean addAll(int v, Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return this.vector.addAll(v, collection0);
        }

        @Override
        public boolean addAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return this.vector.addAll(collection0);
        }

        @Override
        public void clear() {
            this.vector.clear();
        }

        @Override
        public boolean contains(Object object0) {
            return this.vector.contains(object0);
        }

        @Override
        public boolean containsAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return this.vector.containsAll(collection0);
        }

        @Override
        public Object get(int v) {
            return this.vector.getContent()[v];
        }

        public int getSize() {
            return this.vector.getSize();
        }

        @Override
        public int indexOf(Object object0) {
            return this.vector.indexOf(object0);
        }

        @Override
        public boolean isEmpty() {
            return this.vector.isEmpty();
        }

        @Override
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        public int lastIndexOf(Object object0) {
            return this.vector.lastIndexOf(object0);
        }

        @Override
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        public ListIterator listIterator(int v) {
            return new VectorListIterator(this, v);
        }

        @Override
        public final Object remove(int v) {
            return this.removeAt(v);
        }

        @Override
        public boolean remove(Object object0) {
            return this.vector.remove(object0);
        }

        @Override
        public boolean removeAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return this.vector.removeAll(collection0);
        }

        public Object removeAt(int v) {
            return this.vector.removeAt(v);
        }

        @Override
        public boolean retainAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            return this.vector.retainAll(collection0);
        }

        @Override
        public Object set(int v, Object object0) {
            return this.vector.set(v, object0);
        }

        @Override
        public final int size() {
            return this.getSize();
        }

        @Override
        public List subList(int v, int v1) {
            return new SubList(this, v, v1);
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
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0002\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u000EJ\u001D\u0010\u000B\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u0011J\u001E\u0010\u0012\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u00052\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001A\u00020\f2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001A\u00020\u000FH\u0016J\u0016\u0010\u0016\u001A\u00020\f2\u0006\u0010\r\u001A\u00028\u0001H\u0096\u0002\u00A2\u0006\u0002\u0010\u000EJ\u0016\u0010\u0017\u001A\u00020\f2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001A\u00028\u00012\u0006\u0010\u0010\u001A\u00020\u0005H\u0096\u0002\u00A2\u0006\u0002\u0010\u0019J\u0015\u0010\u001A\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u001BJ\b\u0010\u001C\u001A\u00020\fH\u0016J\u000F\u0010\u001D\u001A\b\u0012\u0004\u0012\u00028\u00010\u001EH\u0096\u0002J\u0015\u0010\u001F\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u001BJ\u000E\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001A\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001A\u00020\u0005H\u0016J\u0015\u0010\"\u001A\u00020\f2\u0006\u0010\r\u001A\u00028\u0001H\u0016\u00A2\u0006\u0002\u0010\u000EJ\u0016\u0010#\u001A\u00020\f2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001A\u00028\u00012\u0006\u0010\u0010\u001A\u00020\u0005H\u0016\u00A2\u0006\u0002\u0010\u0019J\u0016\u0010%\u001A\u00020\f2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001E\u0010&\u001A\u00028\u00012\u0006\u0010\u0010\u001A\u00020\u00052\u0006\u0010\r\u001A\u00028\u0001H\u0096\u0002\u00A2\u0006\u0002\u0010\'J\u001E\u0010(\u001A\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001A\u00020\u00052\u0006\u0010*\u001A\u00020\u0005H\u0016R\u000E\u0010\u0006\u001A\u00020\u0005X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\b\u001A\u00020\u00058VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\t\u0010\nR\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u00A8\u0006+"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", "T", "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class SubList implements List, KMutableList {
        private int end;
        private final List list;
        private final int start;

        public SubList(List list0, int v, int v1) {
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.list = list0;
            this.start = v;
            this.end = v1;
        }

        @Override
        public void add(int v, Object object0) {
            this.list.add(v + this.start, object0);
            ++this.end;
        }

        @Override
        public boolean add(Object object0) {
            int v = this.end;
            this.end = v + 1;
            this.list.add(v, object0);
            return true;
        }

        @Override
        public boolean addAll(int v, Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            this.list.addAll(v + this.start, collection0);
            this.end += collection0.size();
            return collection0.size() > 0;
        }

        @Override
        public boolean addAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            this.list.addAll(this.end, collection0);
            this.end += collection0.size();
            return collection0.size() > 0;
        }

        @Override
        public void clear() {
            int v = this.end - 1;
            int v1 = this.start;
            if(v1 <= v) {
                while(true) {
                    this.list.remove(v);
                    if(v == v1) {
                        break;
                    }
                    --v;
                }
            }
            this.end = this.start;
        }

        @Override
        public boolean contains(Object object0) {
            int v = this.start;
            int v1 = this.end;
            if(v < v1) {
                while(true) {
                    if(Intrinsics.areEqual(this.list.get(v), object0)) {
                        return true;
                    }
                    if(v + 1 >= v1) {
                        break;
                    }
                    ++v;
                }
            }
            return false;
        }

        @Override
        public boolean containsAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            for(Object object0: collection0) {
                if(!this.contains(object0)) {
                    return false;
                }
                if(false) {
                    break;
                }
            }
            return true;
        }

        @Override
        public Object get(int v) {
            return this.list.get(v + this.start);
        }

        public int getSize() {
            return this.end - this.start;
        }

        @Override
        public int indexOf(Object object0) {
            int v = this.start;
            int v1 = this.end;
            if(v < v1) {
                while(true) {
                    if(Intrinsics.areEqual(this.list.get(v), object0)) {
                        return v - this.start;
                    }
                    if(v + 1 >= v1) {
                        break;
                    }
                    ++v;
                }
            }
            return -1;
        }

        @Override
        public boolean isEmpty() {
            return this.end == this.start;
        }

        @Override
        public Iterator iterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        public int lastIndexOf(Object object0) {
            int v = this.end - 1;
            int v1 = this.start;
            if(v1 <= v) {
                while(true) {
                    if(Intrinsics.areEqual(this.list.get(v), object0)) {
                        return v - this.start;
                    }
                    if(v == v1) {
                        break;
                    }
                    --v;
                }
            }
            return -1;
        }

        @Override
        public ListIterator listIterator() {
            return new VectorListIterator(this, 0);
        }

        @Override
        public ListIterator listIterator(int v) {
            return new VectorListIterator(this, v);
        }

        @Override
        public final Object remove(int v) {
            return this.removeAt(v);
        }

        @Override
        public boolean remove(Object object0) {
            int v = this.start;
            int v1 = this.end;
            if(v < v1) {
                while(true) {
                    if(Intrinsics.areEqual(this.list.get(v), object0)) {
                        this.list.remove(v);
                        --this.end;
                        return true;
                    }
                    if(v + 1 >= v1) {
                        break;
                    }
                    ++v;
                }
            }
            return false;
        }

        @Override
        public boolean removeAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            int v = this.end;
            for(Object object0: collection0) {
                this.remove(object0);
            }
            return v != this.end;
        }

        public Object removeAt(int v) {
            Object object0 = this.list.remove(v + this.start);
            --this.end;
            return object0;
        }

        @Override
        public boolean retainAll(Collection collection0) {
            Intrinsics.checkNotNullParameter(collection0, "elements");
            int v = this.end;
            int v1 = v - 1;
            int v2 = this.start;
            if(v2 <= v1) {
                while(true) {
                    if(!collection0.contains(this.list.get(v1))) {
                        this.list.remove(v1);
                        --this.end;
                    }
                    if(v1 == v2) {
                        break;
                    }
                    --v1;
                }
            }
            return v != this.end;
        }

        @Override
        public Object set(int v, Object object0) {
            return this.list.set(v + this.start, object0);
        }

        @Override
        public final int size() {
            return this.getSize();
        }

        @Override
        public List subList(int v, int v1) {
            return new SubList(this, v, v1);
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
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001B\u0012\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000BJ\t\u0010\f\u001A\u00020\rH\u0096\u0002J\b\u0010\u000E\u001A\u00020\rH\u0016J\u000E\u0010\u000F\u001A\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0010J\b\u0010\u0011\u001A\u00020\u0006H\u0016J\r\u0010\u0012\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\b\u0010\u0013\u001A\u00020\u0006H\u0016J\b\u0010\u0014\u001A\u00020\tH\u0016J\u0015\u0010\u0015\u001A\u00020\t2\u0006\u0010\n\u001A\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000BR\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", "T", "", "list", "", "index", "", "(Ljava/util/List;I)V", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "runtime_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class VectorListIterator implements ListIterator, KMutableListIterator {
        private int index;
        private final List list;

        public VectorListIterator(List list0, int v) {
            Intrinsics.checkNotNullParameter(list0, "list");
            super();
            this.list = list0;
            this.index = v;
        }

        @Override
        public void add(Object object0) {
            this.list.add(this.index, object0);
            ++this.index;
        }

        @Override
        public boolean hasNext() {
            return this.index < this.list.size();
        }

        @Override
        public boolean hasPrevious() {
            return this.index > 0;
        }

        @Override
        public Object next() {
            int v = this.index;
            this.index = v + 1;
            return this.list.get(v);
        }

        @Override
        public int nextIndex() {
            return this.index;
        }

        @Override
        public Object previous() {
            int v = this.index - 1;
            this.index = v;
            return this.list.get(v);
        }

        @Override
        public int previousIndex() {
            return this.index - 1;
        }

        @Override
        public void remove() {
            int v = this.index - 1;
            this.index = v;
            this.list.remove(v);
        }

        @Override
        public void set(Object object0) {
            this.list.set(this.index, object0);
        }
    }

    public static final int $stable = 8;
    private Object[] content;
    private List list;
    private int size;

    static {
    }

    public MutableVector(Object[] arr_object, int v) {
        Intrinsics.checkNotNullParameter(arr_object, "content");
        super();
        this.content = arr_object;
        this.size = v;
    }

    public final void add(int v, Object object0) {
        this.ensureCapacity(this.size + 1);
        Object[] arr_object = this.content;
        int v1 = this.size;
        if(v != v1) {
            ArraysKt.copyInto(arr_object, arr_object, v + 1, v, v1);
        }
        arr_object[v] = object0;
        ++this.size;
    }

    public final boolean add(Object object0) {
        this.ensureCapacity(this.size + 1);
        int v = this.size;
        this.content[v] = object0;
        this.size = v + 1;
        return true;
    }

    public final boolean addAll(int v, MutableVector mutableVector0) {
        Intrinsics.checkNotNullParameter(mutableVector0, "elements");
        if(mutableVector0.isEmpty()) {
            return false;
        }
        this.ensureCapacity(this.size + mutableVector0.size);
        Object[] arr_object = this.content;
        int v1 = this.size;
        if(v != v1) {
            ArraysKt.copyInto(arr_object, arr_object, mutableVector0.size + v, v, v1);
        }
        ArraysKt.copyInto(mutableVector0.content, arr_object, v, 0, mutableVector0.size);
        this.size += mutableVector0.size;
        return true;
    }

    public final boolean addAll(int v, Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v1 = 0;
        if(collection0.isEmpty()) {
            return false;
        }
        this.ensureCapacity(this.size + collection0.size());
        Object[] arr_object = this.content;
        if(v != this.size) {
            ArraysKt.copyInto(arr_object, arr_object, collection0.size() + v, v, this.size);
        }
        for(Object object0: collection0) {
            if(v1 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arr_object[v1 + v] = object0;
            ++v1;
        }
        this.size += collection0.size();
        return true;
    }

    public final boolean addAll(int v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        if(list0.isEmpty()) {
            return false;
        }
        this.ensureCapacity(this.size + list0.size());
        Object[] arr_object = this.content;
        if(v != this.size) {
            ArraysKt.copyInto(arr_object, arr_object, list0.size() + v, v, this.size);
        }
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                arr_object[v + v1] = list0.get(v1);
                if(v1 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        this.size += list0.size();
        return true;
    }

    public final boolean addAll(MutableVector mutableVector0) {
        Intrinsics.checkNotNullParameter(mutableVector0, "elements");
        return this.addAll(this.getSize(), mutableVector0);
    }

    public final boolean addAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        return this.addAll(this.size, collection0);
    }

    public final boolean addAll(List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        return this.addAll(this.getSize(), list0);
    }

    public final boolean addAll(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "elements");
        if(arr_object.length == 0) {
            return false;
        }
        this.ensureCapacity(this.size + arr_object.length);
        ArraysKt.copyInto$default(arr_object, this.content, this.size, 0, 0, 12, null);
        return true;
    }

    public final boolean any(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return true;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return false;
    }

    public final List asMutableList() {
        List list0 = this.list;
        if(list0 == null) {
            list0 = new MutableVectorList(this);
            this.list = list0;
        }
        return list0;
    }

    public final void clear() {
        Object[] arr_object = this.content;
        int v = this.getSize() - 1;
        if(v >= 0) {
            while(true) {
                arr_object[v] = null;
                if(v - 1 < 0) {
                    break;
                }
                --v;
            }
        }
        this.size = 0;
    }

    public final boolean contains(Object object0) {
        int v = this.getSize();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(Intrinsics.areEqual(this.getContent()[v1], object0)) {
                    return true;
                }
                if(v1 == v - 1) {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean containsAll(MutableVector mutableVector0) {
        Intrinsics.checkNotNullParameter(mutableVector0, "elements");
        IntRange intRange0 = new IntRange(0, mutableVector0.getSize() - 1);
        int v = intRange0.getFirst();
        int v1 = intRange0.getLast();
        if(v <= v1) {
            while(true) {
                if(!this.contains(mutableVector0.getContent()[v])) {
                    return false;
                }
                if(v == v1) {
                    break;
                }
                ++v;
            }
        }
        return true;
    }

    public final boolean containsAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        for(Object object0: collection0) {
            if(!this.contains(object0)) {
                return false;
            }
            if(false) {
                break;
            }
        }
        return true;
    }

    public final boolean containsAll(List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(!this.contains(list0.get(v1))) {
                    return false;
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return true;
    }

    public final boolean contentEquals(MutableVector mutableVector0) {
        Intrinsics.checkNotNullParameter(mutableVector0, "other");
        if(mutableVector0.size != this.size) {
            return false;
        }
        int v = this.getSize();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(!Intrinsics.areEqual(mutableVector0.getContent()[v1], this.getContent()[v1])) {
                    return false;
                }
                if(v1 == v - 1) {
                    break;
                }
            }
        }
        return true;
    }

    public final void ensureCapacity(int v) {
        Object[] arr_object = this.content;
        if(arr_object.length < v) {
            Object[] arr_object1 = Arrays.copyOf(arr_object, Math.max(v, arr_object.length * 2));
            Intrinsics.checkNotNullExpressionValue(arr_object1, "java.util.Arrays.copyOf(this, newSize)");
            this.content = arr_object1;
        }
    }

    public final Object first() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.getContent()[0];
    }

    public final Object first(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        this.throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    // 去混淆评级： 低(20)
    public final Object firstOrNull() {
        return this.isEmpty() ? null : this.getContent()[0];
    }

    public final Object firstOrNull(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return null;
    }

    public final Object fold(Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                object0 = function20.invoke(object0, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object foldIndexed(Object object0, Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                object0 = function30.invoke(v1, object0, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object foldRight(Object object0, Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "operation");
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                object0 = function20.invoke(arr_object[v1], object0);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return object0;
    }

    public final Object foldRightIndexed(Object object0, Function3 function30) {
        Intrinsics.checkNotNullParameter(function30, "operation");
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                object0 = function30.invoke(v1, arr_object[v1], object0);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return object0;
    }

    public final void forEach(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                function10.invoke(arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void forEachIndexed(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                function20.invoke(v1, arr_object[v1]);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final void forEachReversed(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                function10.invoke(arr_object[v1]);
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
    }

    public final void forEachReversedIndexed(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "block");
        if(this.getSize() > 0) {
            int v = this.getSize() - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                function20.invoke(v, arr_object[v]);
                --v;
                if(v < 0) {
                    break;
                }
            }
        }
    }

    public final Object get(int v) {
        return this.getContent()[v];
    }

    public final Object[] getContent() {
        return this.content;
    }

    public static void getContent$annotations() {
    }

    public final IntRange getIndices() {
        return new IntRange(0, this.getSize() - 1);
    }

    public final int getLastIndex() {
        return this.getSize() - 1;
    }

    public final int getSize() {
        return this.size;
    }

    public final int indexOf(Object object0) {
        int v = this.size;
        if(v > 0) {
            Object[] arr_object = this.content;
            int v1 = 0;
            while(true) {
                if(Intrinsics.areEqual(object0, arr_object[v1])) {
                    return v1;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return -1;
    }

    public final int indexOfFirst(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v1 = 0;
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return v1;
                }
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        return -1;
    }

    public final int indexOfLast(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return v1;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size != 0;
    }

    public final Object last() {
        if(this.isEmpty()) {
            throw new NoSuchElementException("MutableVector is empty.");
        }
        return this.getContent()[this.getSize() - 1];
    }

    public final Object last(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        this.throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final int lastIndexOf(Object object0) {
        int v = this.size;
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.content;
            while(true) {
                if(Intrinsics.areEqual(object0, arr_object[v1])) {
                    return v1;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return -1;
    }

    // 去混淆评级： 低(20)
    public final Object lastOrNull() {
        return this.isEmpty() ? null : this.getContent()[this.getSize() - 1];
    }

    public final Object lastOrNull(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                Object object0 = arr_object[v1];
                if(((Boolean)function10.invoke(object0)).booleanValue()) {
                    return object0;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return null;
    }

    public final Object[] map(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "transform");
        int v = this.getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function10.invoke(this.getContent()[v1]);
        }
        return arr_object;
    }

    public final Object[] mapIndexed(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = this.getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        Object[] arr_object = new Object[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_object[v1] = function20.invoke(v1, this.getContent()[v1]);
        }
        return arr_object;
    }

    public final MutableVector mapIndexedNotNull(Function2 function20) {
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = this.getSize();
        int v1 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] arr_object = new Object[v];
        if(v > 0) {
            Object[] arr_object1 = this.getContent();
            int v2 = 0;
            do {
                Object object0 = function20.invoke(v1, arr_object1[v1]);
                if(object0 != null) {
                    arr_object[v2] = object0;
                    ++v2;
                }
                ++v1;
            }
            while(v1 < v);
            v1 = v2;
        }
        return new MutableVector(arr_object, v1);
    }

    public final MutableVector mapNotNull(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "transform");
        int v = this.getSize();
        int v1 = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] arr_object = new Object[v];
        if(v > 0) {
            Object[] arr_object1 = this.getContent();
            int v2 = 0;
            do {
                Object object0 = function10.invoke(arr_object1[v1]);
                if(object0 != null) {
                    arr_object[v2] = object0;
                    ++v2;
                }
                ++v1;
            }
            while(v1 < v);
            v1 = v2;
        }
        return new MutableVector(arr_object, v1);
    }

    public final void minusAssign(Object object0) {
        this.remove(object0);
    }

    public final void plusAssign(Object object0) {
        this.add(object0);
    }

    public final boolean remove(Object object0) {
        int v = this.indexOf(object0);
        if(v >= 0) {
            this.removeAt(v);
            return true;
        }
        return false;
    }

    public final boolean removeAll(MutableVector mutableVector0) {
        Intrinsics.checkNotNullParameter(mutableVector0, "elements");
        int v = this.size;
        int v1 = mutableVector0.getSize();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.remove(mutableVector0.getContent()[v2]);
                if(v2 == v1 - 1) {
                    break;
                }
            }
        }
        return v != this.size;
    }

    public final boolean removeAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        if(collection0.isEmpty()) {
            return false;
        }
        int v = this.size;
        for(Object object0: collection0) {
            this.remove(object0);
        }
        return v != this.size;
    }

    public final boolean removeAll(List list0) {
        Intrinsics.checkNotNullParameter(list0, "elements");
        int v = this.size;
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                this.remove(list0.get(v2));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        return v != this.size;
    }

    public final Object removeAt(int v) {
        Object[] arr_object = this.content;
        Object object0 = arr_object[v];
        if(v != this.getSize() - 1) {
            ArraysKt.copyInto(arr_object, arr_object, v, v + 1, this.size);
        }
        int v1 = this.size - 1;
        this.size = v1;
        arr_object[v1] = null;
        return object0;
    }

    public final void removeRange(int v, int v1) {
        if(v1 > v) {
            int v2 = this.size;
            if(v1 < v2) {
                ArraysKt.copyInto(this.content, this.content, v, v1, v2);
            }
            int v3 = this.size - (v1 - v);
            int v4 = this.getSize();
            if(v3 <= v4 - 1) {
                for(int v5 = v3; true; ++v5) {
                    this.content[v5] = null;
                    if(v5 == v4 - 1) {
                        break;
                    }
                }
            }
            this.size = v3;
        }
    }

    public final boolean retainAll(Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "elements");
        int v = this.size;
        int v1 = this.getSize() - 1;
        if(v1 >= 0) {
            while(true) {
                if(!collection0.contains(this.getContent()[v1])) {
                    this.removeAt(v1);
                }
                if(v1 - 1 < 0) {
                    break;
                }
                --v1;
            }
        }
        return v != this.size;
    }

    public final boolean reversedAny(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "predicate");
        int v = this.getSize();
        if(v > 0) {
            int v1 = v - 1;
            Object[] arr_object = this.getContent();
            while(true) {
                if(((Boolean)function10.invoke(arr_object[v1])).booleanValue()) {
                    return true;
                }
                --v1;
                if(v1 < 0) {
                    break;
                }
            }
        }
        return false;
    }

    public final Object set(int v, Object object0) {
        Object[] arr_object = this.content;
        Object object1 = arr_object[v];
        arr_object[v] = object0;
        return object1;
    }

    public final void setContent(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "<set-?>");
        this.content = arr_object;
    }

    public final void sortWith(Comparator comparator0) {
        Intrinsics.checkNotNullParameter(comparator0, "comparator");
        ArraysKt.sortWith(this.content, comparator0, 0, this.size);
    }

    public final int sumBy(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "selector");
        int v = this.getSize();
        int v1 = 0;
        if(v > 0) {
            Object[] arr_object = this.getContent();
            int v2 = 0;
            while(true) {
                v1 += ((Number)function10.invoke(arr_object[v2])).intValue();
                ++v2;
                if(v2 >= v) {
                    break;
                }
            }
        }
        return v1;
    }

    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }
}

