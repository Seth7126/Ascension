package androidx.compose.ui;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001A9\u0010\u0000\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001A\u0002H\u00022\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002\u00A2\u0006\u0002\u0010\t\u001A_\u0010\n\u001A\u000E\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000B\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r*\b\u0012\u0004\u0012\u0002H\u00020\u000E2\u001E\u0010\u0006\u001A\u001A\u0012\u0004\u0012\u0002H\u0002\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u0002H\f\u0012\u0004\u0012\u0002H\r0\u000F0\u0007H\u0080\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001A}\u0010\u0010\u001A\u0002H\u0011\"\u0004\b\u0000\u0010\u0002\"\f\b\u0001\u0010\u0011*\u00060\u0003j\u0002`\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u000E2\u0006\u0010\u0012\u001A\u0002H\u00112\b\b\u0002\u0010\u0013\u001A\u00020\b2\b\b\u0002\u0010\u0014\u001A\u00020\b2\b\b\u0002\u0010\u0015\u001A\u00020\b2\b\b\u0002\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\b2\u0016\b\u0002\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002\u00A2\u0006\u0002\u0010\u0019\u001Ab\u0010\u001A\u001A\u00020\u001B\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000E2\b\b\u0002\u0010\u0013\u001A\u00020\b2\b\b\u0002\u0010\u0014\u001A\u00020\b2\b\b\u0002\u0010\u0015\u001A\u00020\b2\b\b\u0002\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\b2\u0016\b\u0002\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000\u001AI\u0010\u001C\u001A\b\u0012\u0004\u0012\u0002H\u001D0\u000E\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001D*\b\u0012\u0004\u0012\u0002H\u00020\u000E2\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u001D0\u0007H\u0080\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u001A_\u0010\u001E\u001A\u0002H\u001F\"\u0004\b\u0000\u0010\u001F\"\b\b\u0001\u0010\u0002*\u0002H\u001F*\b\u0012\u0004\u0012\u0002H\u00020\u000E2\'\u0010 \u001A#\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001F0!H\u0080\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u00A2\u0006\u0002\u0010%\u001A\u007F\u0010&\u001A\b\u0012\u0004\u0012\u0002H\r0\u000E\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001D\"\u0004\b\u0002\u0010\r*\b\u0012\u0004\u0012\u0002H\u00020\u000E2\f\u0010\'\u001A\b\u0012\u0004\u0012\u0002H\u001D0\u000E26\u0010\u0006\u001A2\u0012\u0013\u0012\u0011H\u0002\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b((\u0012\u0013\u0012\u0011H\u001D\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b()\u0012\u0004\u0012\u0002H\r0!H\u0080\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001AM\u0010*\u001A\b\u0012\u0004\u0012\u0002H\u001D0\u000E\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u001D*\b\u0012\u0004\u0012\u0002H\u00020\u000E2\u0018\u0010\u0006\u001A\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u001D0!H\u0080\b\u00F8\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006+"}, d2 = {"appendElement", "", "T", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "element", "transform", "Lkotlin/Function1;", "", "(Ljava/lang/Appendable;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "fastAssociate", "", "K", "V", "", "Lkotlin/Pair;", "fastJoinTo", "A", "buffer", "separator", "prefix", "postfix", "limit", "", "truncated", "(Ljava/util/List;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "fastJoinToString", "", "fastMapNotNull", "R", "fastReduce", "S", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "fastZip", "other", "a", "b", "fastZipWithNext", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TempListUtilsKt {
    private static final void appendElement(Appendable appendable0, Object object0, Function1 function10) {
        if(function10 != null) {
            appendable0.append(((CharSequence)function10.invoke(object0)));
            return;
        }
        if((object0 == null ? true : object0 instanceof CharSequence)) {
            appendable0.append(((CharSequence)object0));
            return;
        }
        if(object0 instanceof Character) {
            appendable0.append(((Character)object0).charValue());
            return;
        }
        appendable0.append(String.valueOf(object0));
    }

    public static final Map fastAssociate(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Pair pair0 = (Pair)function10.invoke(list0.get(v1));
                linkedHashMap0.put(pair0.getFirst(), pair0.getSecond());
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return linkedHashMap0;
    }

    private static final Appendable fastJoinTo(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10) {
        appendable0.append(charSequence1);
        int v1 = list0.size();
        int v2 = 0;
        if(v1 - 1 >= 0) {
            int v3 = 0;
            while(true) {
                Object object0 = list0.get(v2);
                ++v3;
                if(v3 > 1) {
                    appendable0.append(charSequence0);
                }
                if(v >= 0 && v3 > v) {
                    break;
                }
                TempListUtilsKt.appendElement(appendable0, object0, function10);
                if(v2 + 1 > v1 - 1) {
                    break;
                }
                ++v2;
            }
            v2 = v3;
        }
        if(v >= 0 && v2 > v) {
            appendable0.append(charSequence3);
        }
        appendable0.append(charSequence2);
        return appendable0;
    }

    static Appendable fastJoinTo$default(List list0, Appendable appendable0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        CharSequence charSequence4 = (v1 & 2) == 0 ? charSequence0 : ", ";
        CharSequence charSequence5 = (v1 & 4) == 0 ? charSequence1 : "";
        CharSequence charSequence6 = (v1 & 8) == 0 ? charSequence2 : "";
        int v2 = (v1 & 16) == 0 ? v : -1;
        if((v1 & 0x20) != 0) {
            return (v1 & 0x40) == 0 ? TempListUtilsKt.fastJoinTo(list0, appendable0, charSequence4, charSequence5, charSequence6, v2, "...", function10) : TempListUtilsKt.fastJoinTo(list0, appendable0, charSequence4, charSequence5, charSequence6, v2, "...", null);
        }
        return (v1 & 0x40) == 0 ? TempListUtilsKt.fastJoinTo(list0, appendable0, charSequence4, charSequence5, charSequence6, v2, charSequence3, function10) : TempListUtilsKt.fastJoinTo(list0, appendable0, charSequence4, charSequence5, charSequence6, v2, charSequence3, null);
    }

    public static final String fastJoinToString(List list0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(charSequence0, "separator");
        Intrinsics.checkNotNullParameter(charSequence1, "prefix");
        Intrinsics.checkNotNullParameter(charSequence2, "postfix");
        Intrinsics.checkNotNullParameter(charSequence3, "truncated");
        String s = ((StringBuilder)TempListUtilsKt.fastJoinTo(list0, new StringBuilder(), charSequence0, charSequence1, charSequence2, v, charSequence3, function10)).toString();
        Intrinsics.checkNotNullExpressionValue(s, "fastJoinTo(StringBuilder(), separator, prefix, postfix, limit, truncated, transform)\n        .toString()");
        return s;
    }

    public static String fastJoinToString$default(List list0, CharSequence charSequence0, CharSequence charSequence1, CharSequence charSequence2, int v, CharSequence charSequence3, Function1 function10, int v1, Object object0) {
        if((v1 & 1) != 0) {
            charSequence0 = ", ";
        }
        if((v1 & 2) != 0) {
            charSequence1 = "";
        }
        if((v1 & 4) != 0) {
            charSequence2 = "";
        }
        if((v1 & 16) != 0) {
            charSequence3 = "...";
        }
        if((v1 & 0x20) != 0) {
            function10 = null;
        }
        return TempListUtilsKt.fastJoinToString(list0, charSequence0, charSequence1, charSequence2, ((v1 & 8) == 0 ? v : -1), charSequence3, function10);
    }

    public static final List fastMapNotNull(List list0, Function1 function10) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "transform");
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = function10.invoke(list0.get(v1));
                if(object0 != null) {
                    arrayList0.add(object0);
                }
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public static final Object fastReduce(List list0, Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(function20, "operation");
        if(list0.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can\'t be reduced.");
        }
        Object object0 = CollectionsKt.first(list0);
        int v = CollectionsKt.getLastIndex(list0);
        if(1 <= v) {
            for(int v1 = 1; true; ++v1) {
                object0 = function20.invoke(object0, list0.get(v1));
                if(v1 == v) {
                    break;
                }
            }
        }
        return object0;
    }

    public static final List fastZip(List list0, List list1, Function2 function20) {
        Intrinsics.checkNotNullParameter(list0, "<this>");
        Intrinsics.checkNotNullParameter(list1, "other");
        Intrinsics.checkNotNullParameter(function20, "transform");
        int v = Math.min(list0.size(), list1.size());
        ArrayList arrayList0 = new ArrayList(v);
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                arrayList0.add(function20.invoke(list0.get(v1), list1.get(v1)));
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        return arrayList0;
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

