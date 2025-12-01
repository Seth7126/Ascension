package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000l\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001A\u0016\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006\u001A\"\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\b2\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u001A%\u0010\t\u001A\u00020\u00012\u0017\u0010\n\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000B\u00A2\u0006\u0002\b\u000EH\u0086\b\u00F8\u0001\u0000\u001A(\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u00122\u0006\u0010\u0015\u001A\u00020\u0012H\u0000\u001A\b\u0010\u0016\u001A\u00020\u0001H\u0000\u001A@\u0010\u0017\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001A0\u00190\u0018\"\u0004\b\u0000\u0010\u001A2\u0014\u0010\u001B\u001A\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u0002H\u001A0\u00190\u00182\u0006\u0010\u001C\u001A\u00020\u00122\u0006\u0010\u001D\u001A\u00020\u0012H\u0002\u001A(\u0010\u001E\u001A\u00020\u00102\u0006\u0010\u001F\u001A\u00020\u00122\u0006\u0010 \u001A\u00020\u00122\u0006\u0010!\u001A\u00020\u00122\u0006\u0010\"\u001A\u00020\u0012H\u0000\u001A\u0014\u0010#\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001A\u00020%\u001A\u0014\u0010&\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001A\u00020%\u001A(\u0010\'\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00190\u0018*\u00020\u00012\u0006\u0010\u001C\u001A\u00020\u00122\u0006\u0010\u001D\u001A\u00020\u0012H\u0002\u001Ad\u0010(\u001A\b\u0012\u0004\u0012\u0002H\u001A0\u0018\"\u0004\b\u0000\u0010\u001A*\u00020\u00012\u0006\u0010)\u001A\u00020\u00062>\b\u0004\u0010*\u001A8\u0012\u0013\u0012\u00110\u0001\u00A2\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(.\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00060\u0019\u00A2\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u0002H\u001A0+H\u0080\b\u00F8\u0001\u0000\u001A \u0010/\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00190\u0018*\u00020\u00012\u0006\u0010)\u001A\u00020\u0006H\u0000\u001A\u001C\u00100\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u001C\u001A\u00020\u00122\u0006\u0010\u001D\u001A\u00020\u0012H\u0002\u001A\u0014\u00101\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001A\u00020%\u001A\u0014\u00102\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010$\u001A\u00020%\u001AB\u00103\u001A\u0002H4\"\b\b\u0000\u00104*\u000205*\u00020\f2\u0006\u00106\u001A\u0002072\u0019\b\u0004\u0010*\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000B\u00A2\u0006\u0002\b\u000EH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u00108\u001AJ\u00103\u001A\u0002H4\"\b\b\u0000\u00104*\u000205*\u00020\f2\u0006\u00109\u001A\u00020\u00042\u0006\u0010:\u001A\u00020\u00042\u0019\b\u0004\u0010*\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000B\u00A2\u0006\u0002\b\u000EH\u0087\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010;\u001AB\u0010<\u001A\u0002H4\"\b\b\u0000\u00104*\u000205*\u00020\f2\u0006\u0010=\u001A\u00020\u00062\u0019\b\u0004\u0010*\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000B\u00A2\u0006\u0002\b\u000EH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010>\u001AB\u0010<\u001A\u0002H4\"\b\b\u0000\u00104*\u000205*\u00020\f2\u0006\u0010=\u001A\u00020\b2\u0019\b\u0004\u0010*\u001A\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H40\u000B\u00A2\u0006\u0002\b\u000EH\u0086\b\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010?\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006@"}, d2 = {"EmptyAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "AnnotatedString", "text", "", "paragraphStyle", "Landroidx/compose/ui/text/ParagraphStyle;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "buildAnnotatedString", "builder", "Lkotlin/Function1;", "Landroidx/compose/ui/text/AnnotatedString$Builder;", "", "Lkotlin/ExtensionFunctionType;", "contains", "", "baseStart", "", "baseEnd", "targetStart", "targetEnd", "emptyAnnotatedString", "filterRanges", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "T", "ranges", "start", "end", "intersect", "lStart", "lEnd", "rStart", "rEnd", "capitalize", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "decapitalize", "getLocalStyles", "mapEachParagraphStyle", "defaultParagraphStyle", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "annotatedString", "normalizedParagraphStyles", "substringWithoutParagraphStyles", "toLowerCase", "toUpperCase", "withAnnotation", "R", "", "ttsAnnotation", "Landroidx/compose/ui/text/TtsAnnotation;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/TtsAnnotation;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tag", "annotation", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "withStyle", "style", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/ParagraphStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "(Landroidx/compose/ui/text/AnnotatedString$Builder;Landroidx/compose/ui/text/SpanStyle;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AnnotatedStringKt {
    private static final AnnotatedString EmptyAnnotatedString;

    static {
        AnnotatedStringKt.EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);
    }

    public static final AnnotatedString AnnotatedString(String s, ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(paragraphStyle0, "paragraphStyle");
        return new AnnotatedString(s, CollectionsKt.emptyList(), CollectionsKt.listOf(new Range(paragraphStyle0, 0, s.length())));
    }

    public static final AnnotatedString AnnotatedString(String s, SpanStyle spanStyle0, ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(spanStyle0, "spanStyle");
        List list0 = CollectionsKt.listOf(new Range(spanStyle0, 0, s.length()));
        return paragraphStyle0 == null ? new AnnotatedString(s, list0, CollectionsKt.emptyList()) : new AnnotatedString(s, list0, CollectionsKt.listOf(new Range(paragraphStyle0, 0, s.length())));
    }

    public static AnnotatedString AnnotatedString$default(String s, SpanStyle spanStyle0, ParagraphStyle paragraphStyle0, int v, Object object0) {
        if((v & 4) != 0) {
            paragraphStyle0 = null;
        }
        return AnnotatedStringKt.AnnotatedString(s, spanStyle0, paragraphStyle0);
    }

    public static final AnnotatedString buildAnnotatedString(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "builder");
        Builder annotatedString$Builder0 = new Builder(0, 1, null);
        function10.invoke(annotatedString$Builder0);
        return annotatedString$Builder0.toAnnotatedString();
    }

    public static final AnnotatedString capitalize(AnnotatedString annotatedString0, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new Function3(localeList0) {
            final LocaleList $localeList;

            {
                this.$localeList = localeList0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }

            public final String invoke(String s, int v, int v1) {
                Intrinsics.checkNotNullParameter(s, "str");
                if(v == 0) {
                    String s1 = s.substring(0, v1);
                    Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return StringKt.capitalize(s1, this.$localeList);
                }
                String s2 = s.substring(v, v1);
                Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return s2;
            }
        });
    }

    public static AnnotatedString capitalize$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.capitalize(annotatedString0, localeList0);
    }

    public static final boolean contains(int v, int v1, int v2, int v3) {
        if(v <= v2 && v3 <= v1) {
            return v1 == v3 ? (v2 == v3 ? 1 : 0) == (v == v1 ? 1 : 0) : true;
        }
        return false;
    }

    public static final AnnotatedString decapitalize(AnnotatedString annotatedString0, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new Function3(localeList0) {
            final LocaleList $localeList;

            {
                this.$localeList = localeList0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }

            public final String invoke(String s, int v, int v1) {
                Intrinsics.checkNotNullParameter(s, "str");
                if(v == 0) {
                    String s1 = s.substring(0, v1);
                    Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    return StringKt.decapitalize(s1, this.$localeList);
                }
                String s2 = s.substring(v, v1);
                Intrinsics.checkNotNullExpressionValue(s2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return s2;
            }
        });
    }

    public static AnnotatedString decapitalize$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.decapitalize(annotatedString0, localeList0);
    }

    public static final AnnotatedString emptyAnnotatedString() {
        return AnnotatedStringKt.EmptyAnnotatedString;
    }

    private static final List filterRanges(List list0, int v, int v1) {
        if(v > v1) {
            throw new IllegalArgumentException(("start (" + v + ") should be less than or equal to end (" + v1 + ')').toString());
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v3 = list0.size();
        if(v3 - 1 >= 0) {
            for(int v4 = 0; true; ++v4) {
                Object object0 = list0.get(v4);
                if(AnnotatedStringKt.intersect(v, v1, ((Range)object0).getStart(), ((Range)object0).getEnd())) {
                    arrayList0.add(object0);
                }
                if(v4 + 1 > v3 - 1) {
                    break;
                }
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        if(v5 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                Object object1 = arrayList0.get(v2);
                arrayList1.add(new Range(((Range)object1).getItem(), Math.max(v, ((Range)object1).getStart()) - v, Math.min(v1, ((Range)object1).getEnd()) - v, ((Range)object1).getTag()));
                if(v2 + 1 > v5 - 1) {
                    break;
                }
            }
        }
        return arrayList1;
    }

    private static final List getLocalStyles(AnnotatedString annotatedString0, int v, int v1) {
        if(v == v1) {
            return CollectionsKt.emptyList();
        }
        if(v == 0 && v1 >= annotatedString0.getText().length()) {
            return annotatedString0.getSpanStyles();
        }
        List list0 = annotatedString0.getSpanStyles();
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v4 = 0; true; ++v4) {
                Object object0 = list0.get(v4);
                if(AnnotatedStringKt.intersect(v, v1, ((Range)object0).getStart(), ((Range)object0).getEnd())) {
                    arrayList0.add(object0);
                }
                if(v4 + 1 > v2 - 1) {
                    break;
                }
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v5 = arrayList0.size();
        if(v5 - 1 >= 0) {
            for(int v3 = 0; true; ++v3) {
                Object object1 = arrayList0.get(v3);
                arrayList1.add(new Range(((Range)object1).getItem(), RangesKt.coerceIn(((Range)object1).getStart(), v, v1) - v, RangesKt.coerceIn(((Range)object1).getEnd(), v, v1) - v));
                if(v3 + 1 > v5 - 1) {
                    break;
                }
            }
        }
        return arrayList1;
    }

    // 去混淆评级： 低(20)
    public static final boolean intersect(int v, int v1, int v2, int v3) {
        return Math.max(v, v2) < Math.min(v1, v3) || AnnotatedStringKt.contains(v, v1, v2, v3) || AnnotatedStringKt.contains(v2, v3, v, v1);
    }

    public static final List mapEachParagraphStyle(AnnotatedString annotatedString0, ParagraphStyle paragraphStyle0, Function2 function20) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(paragraphStyle0, "defaultParagraphStyle");
        Intrinsics.checkNotNullParameter(function20, "block");
        List list0 = AnnotatedStringKt.normalizedParagraphStyles(annotatedString0, paragraphStyle0);
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Object object0 = list0.get(v1);
                arrayList0.add(function20.invoke(AnnotatedStringKt.substringWithoutParagraphStyles(annotatedString0, ((Range)object0).getStart(), ((Range)object0).getEnd()), ((Range)object0)));
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        return arrayList0;
    }

    public static final List normalizedParagraphStyles(AnnotatedString annotatedString0, ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(paragraphStyle0, "defaultParagraphStyle");
        int v = annotatedString0.getText().length();
        List list0 = annotatedString0.getParagraphStyles();
        List list1 = new ArrayList();
        int v1 = list0.size();
        int v2 = 0;
        if(v1 - 1 >= 0) {
            int v3 = 0;
            while(true) {
                int v4 = v2 + 1;
                Range annotatedString$Range0 = (Range)list0.get(v2);
                ParagraphStyle paragraphStyle1 = (ParagraphStyle)annotatedString$Range0.component1();
                int v5 = annotatedString$Range0.component2();
                v2 = annotatedString$Range0.component3();
                if(v5 != v3) {
                    list1.add(new Range(paragraphStyle0, v3, v5));
                }
                list1.add(new Range(paragraphStyle0.merge(paragraphStyle1), v5, v2));
                if(v4 > v1 - 1) {
                    break;
                }
                v3 = v2;
                v2 = v4;
            }
        }
        if(v2 != v) {
            list1.add(new Range(paragraphStyle0, v2, v));
        }
        if(list1.isEmpty()) {
            list1.add(new Range(paragraphStyle0, 0, 0));
        }
        return list1;
    }

    private static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString0, int v, int v1) {
        if(v != v1) {
            String s = annotatedString0.getText();
            if(s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String s1 = s.substring(v, v1);
            Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return new AnnotatedString(s1, AnnotatedStringKt.getLocalStyles(annotatedString0, v, v1), null, 4, null);
        }
        return new AnnotatedString("", AnnotatedStringKt.getLocalStyles(annotatedString0, v, v1), null, 4, null);
    }

    public static final AnnotatedString toLowerCase(AnnotatedString annotatedString0, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new Function3(localeList0) {
            final LocaleList $localeList;

            {
                this.$localeList = localeList0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }

            public final String invoke(String s, int v, int v1) {
                Intrinsics.checkNotNullParameter(s, "str");
                String s1 = s.substring(v, v1);
                Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return StringKt.toLowerCase(s1, this.$localeList);
            }
        });
    }

    public static AnnotatedString toLowerCase$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.toLowerCase(annotatedString0, localeList0);
    }

    public static final AnnotatedString toUpperCase(AnnotatedString annotatedString0, LocaleList localeList0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(localeList0, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString0, new Function3(localeList0) {
            final LocaleList $localeList;

            {
                this.$localeList = localeList0;
                super(3);
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((String)object0), ((Number)object1).intValue(), ((Number)object2).intValue());
            }

            public final String invoke(String s, int v, int v1) {
                Intrinsics.checkNotNullParameter(s, "str");
                String s1 = s.substring(v, v1);
                Intrinsics.checkNotNullExpressionValue(s1, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return StringKt.toUpperCase(s1, this.$localeList);
            }
        });
    }

    public static AnnotatedString toUpperCase$default(AnnotatedString annotatedString0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            localeList0 = LocaleList.Companion.getCurrent();
        }
        return AnnotatedStringKt.toUpperCase(annotatedString0, localeList0);
    }

    @ExperimentalTextApi
    public static final Object withAnnotation(Builder annotatedString$Builder0, TtsAnnotation ttsAnnotation0, Function1 function10) {
        Intrinsics.checkNotNullParameter(annotatedString$Builder0, "<this>");
        Intrinsics.checkNotNullParameter(ttsAnnotation0, "ttsAnnotation");
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = annotatedString$Builder0.pushTtsAnnotation(ttsAnnotation0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    @ExperimentalTextApi
    public static final Object withAnnotation(Builder annotatedString$Builder0, String s, String s1, Function1 function10) {
        Intrinsics.checkNotNullParameter(annotatedString$Builder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "tag");
        Intrinsics.checkNotNullParameter(s1, "annotation");
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = annotatedString$Builder0.pushStringAnnotation(s, s1);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    public static final Object withStyle(Builder annotatedString$Builder0, ParagraphStyle paragraphStyle0, Function1 function10) {
        Intrinsics.checkNotNullParameter(annotatedString$Builder0, "<this>");
        Intrinsics.checkNotNullParameter(paragraphStyle0, "style");
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = annotatedString$Builder0.pushStyle(paragraphStyle0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }

    public static final Object withStyle(Builder annotatedString$Builder0, SpanStyle spanStyle0, Function1 function10) {
        Intrinsics.checkNotNullParameter(annotatedString$Builder0, "<this>");
        Intrinsics.checkNotNullParameter(spanStyle0, "style");
        Intrinsics.checkNotNullParameter(function10, "block");
        int v = annotatedString$Builder0.pushStyle(spanStyle0);
        try {
            return function10.invoke(annotatedString$Builder0);
        }
        finally {
            annotatedString$Builder0.pop(v);
        }
    }
}

