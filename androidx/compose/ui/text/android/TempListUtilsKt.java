package androidx.compose.ui.text.android;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001F\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001A;\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001A`\u0010\u0006\u001A\u0002H\u0007\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b\"\u0010\b\u0002\u0010\u0007*\n\u0012\u0006\b\u0000\u0012\u0002H\b0\t*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\n\u001A\u0002H\u00072\u0012\u0010\u000B\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u0005H\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0002\u0010\f\u001AM\u0010\r\u001A\b\u0012\u0004\u0012\u0002H\b0\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0018\u0010\u000B\u001A\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0\u000EH\u0080\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000F"}, d2 = {"fastForEach", "", "T", "", "action", "Lkotlin/Function1;", "fastMapTo", "C", "R", "", "destination", "transform", "(Ljava/util/List;Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;", "fastZipWithNext", "Lkotlin/Function2;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TempListUtilsKt {
    public static final void fastForEach(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "action");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                function10.invoke(list0.get(v1));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    public static final Collection fastMapTo(List list0, Collection collection0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(collection0, "destination");
        Intrinsics.checkNotNullParameter(function10, "transform");
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                collection0.add(function10.invoke(list0.get(v1)));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return collection0;
    }

    public static final List fastZipWithNext(List list0, Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "transform");
        switch(list0.size()) {
            case 0: 
            case 1: {
                return CollectionsKt.emptyList();
            }
            default: {
                List list1 = new ArrayList();
                int v = 0;
                Object object0 = list0.get(0);
                int v1 = CollectionsKt.getLastIndex(list0);
                if(v1 > 0) {
                    while(true) {
                        ++v;
                        Object object1 = list0.get(v);
                        list1.add(function20.invoke(object0, object1));
                        if(v >= v1) {
                            break;
                        }
                        object0 = object1;
                    }
                }
                return list1;
            }
        }
    }
}

