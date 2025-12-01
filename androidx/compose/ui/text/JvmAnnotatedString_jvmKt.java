package androidx.compose.ui.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref.ObjectRef;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\u001A0\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0003\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002\u001A,\u0010\t\u001A\u00020\n*\u00020\n2\u001E\u0010\t\u001A\u001A\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u000BH\u0000¨\u0006\r"}, d2 = {"collectRangeTransitions", "", "T", "ranges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "target", "Ljava/util/SortedSet;", "", "transform", "Landroidx/compose/ui/text/AnnotatedString;", "Lkotlin/Function3;", "", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class JvmAnnotatedString_jvmKt {
    private static final void collectRangeTransitions(List list0, SortedSet sortedSet0) {
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Range annotatedString$Range0 = (Range)list0.get(v1);
                sortedSet0.add(annotatedString$Range0.getStart());
                sortedSet0.add(annotatedString$Range0.getEnd());
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    public static final AnnotatedString transform(AnnotatedString annotatedString0, Function3 function30) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(function30, "transform");
        Integer[] arr_integer = new Integer[2];
        arr_integer[0] = 0;
        arr_integer[1] = annotatedString0.getText().length();
        TreeSet treeSet0 = SetsKt.sortedSetOf(arr_integer);
        JvmAnnotatedString_jvmKt.collectRangeTransitions(annotatedString0.getSpanStyles(), treeSet0);
        JvmAnnotatedString_jvmKt.collectRangeTransitions(annotatedString0.getParagraphStyles(), treeSet0);
        ObjectRef ref$ObjectRef0 = new ObjectRef();
        ref$ObjectRef0.element = "";
        Map map0 = MapsKt.mutableMapOf(new Pair[]{TuplesKt.to(0, 0)});
        CollectionsKt.windowed$default(treeSet0, 2, 0, false, new Function1(ref$ObjectRef0, function30, annotatedString0, map0) {
            final Map $offsetMap;
            final ObjectRef $resultStr;
            final AnnotatedString $this_transform;
            final Function3 $transform;

            {
                this.$resultStr = ref$ObjectRef0;
                this.$transform = function30;
                this.$this_transform = annotatedString0;
                this.$offsetMap = map0;
                super(1);
            }

            public final Integer invoke(List list0) {
                Intrinsics.checkNotNullParameter(list0, "$dstr$start$end");
                int v = ((Number)list0.get(0)).intValue();
                int v1 = ((Number)list0.get(1)).intValue();
                this.$resultStr.element = Intrinsics.stringPlus(((String)this.$resultStr.element), this.$transform.invoke(this.$this_transform.getText(), v, v1));
                return (Integer)this.$offsetMap.put(v1, ((String)this.$resultStr.element).length());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((List)object0));
            }
        }, 6, null);
        List list0 = annotatedString0.getSpanStyles();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v1 = list0.size();
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                Object object0 = list0.get(v2);
                Object object1 = map0.get(((Range)object0).getStart());
                Intrinsics.checkNotNull(object1);
                Object object2 = map0.get(((Range)object0).getEnd());
                Intrinsics.checkNotNull(object2);
                arrayList0.add(new Range(((Range)object0).getItem(), ((Number)object1).intValue(), ((Number)object2).intValue()));
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        List list1 = annotatedString0.getParagraphStyles();
        ArrayList arrayList1 = new ArrayList(list1.size());
        int v3 = list1.size();
        if(v3 - 1 >= 0) {
            for(int v4 = 0; true; ++v4) {
                Object object3 = list1.get(v4);
                Object object4 = map0.get(((Range)object3).getStart());
                Intrinsics.checkNotNull(object4);
                Object object5 = map0.get(((Range)object3).getEnd());
                Intrinsics.checkNotNull(object5);
                arrayList1.add(new Range(((Range)object3).getItem(), ((Number)object4).intValue(), ((Number)object5).intValue()));
                if(v4 + 1 > v3 - 1) {
                    break;
                }
            }
        }
        List list2 = annotatedString0.getAnnotations$ui_text_release();
        ArrayList arrayList2 = new ArrayList(list2.size());
        int v5 = list2.size();
        if(v5 - 1 >= 0) {
            for(int v = 0; true; ++v) {
                Object object6 = list2.get(v);
                Object object7 = map0.get(((Range)object6).getStart());
                Intrinsics.checkNotNull(object7);
                Object object8 = map0.get(((Range)object6).getEnd());
                Intrinsics.checkNotNull(object8);
                arrayList2.add(new Range(((Range)object6).getItem(), ((Number)object7).intValue(), ((Number)object8).intValue()));
                if(v + 1 > v5 - 1) {
                    break;
                }
            }
        }
        return new AnnotatedString(((String)ref$ObjectRef0.element), arrayList0, arrayList1, arrayList2);
    }
}

