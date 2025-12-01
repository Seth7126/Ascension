package androidx.compose.ui.text.font;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001C\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJ-\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\r2\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\u000EJ3\u0010\u0003\u001A\u00020\u00042\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u00040\u00102\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\u0011\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "fontList", "", "(Ljava/lang/Iterable;Landroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class FontMatcher {
    public Font matchFont-RetOiIg(FontFamily fontFamily0, FontWeight fontWeight0, int v) {
        Intrinsics.checkNotNullParameter(fontFamily0, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        if(!(fontFamily0 instanceof FontListFontFamily)) {
            throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
        }
        return this.matchFont-RetOiIg(((FontListFontFamily)fontFamily0), fontWeight0, v);
    }

    public Font matchFont-RetOiIg(FontListFontFamily fontListFontFamily0, FontWeight fontWeight0, int v) {
        Intrinsics.checkNotNullParameter(fontListFontFamily0, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        return this.matchFont-RetOiIg(fontListFontFamily0.getFonts(), fontWeight0, v);
    }

    public Font matchFont-RetOiIg(Iterable iterable0, FontWeight fontWeight0, int v) {
        Object object19;
        Object object16;
        Object object10;
        Font font0;
        Object object4;
        int v1;
        Intrinsics.checkNotNullParameter(iterable0, "fontList");
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        Collection collection0 = new ArrayList();
        Iterator iterator0 = iterable0.iterator();
        while(true) {
            v1 = 1;
            if(!iterator0.hasNext()) {
                break;
            }
            Object object0 = iterator0.next();
            if(Intrinsics.areEqual(((Font)object0).getWeight(), fontWeight0) && FontStyle.equals-impl0(((Font)object0).getStyle-_-LCdwA(), v)) {
                collection0.add(object0);
            }
        }
        if(!((List)collection0).isEmpty() != 0) {
            return (Font)((List)collection0).get(0);
        }
        Collection collection1 = new ArrayList();
        for(Object object1: iterable0) {
            if(FontStyle.equals-impl0(((Font)object1).getStyle-_-LCdwA(), v)) {
                collection1.add(object1);
            }
        }
        if(!((List)collection1).isEmpty() != 0) {
            iterable0 = (List)collection1;
        }
        Object object2 = null;
        if(fontWeight0.compareTo(FontWeight.Companion.getW400()) < 0) {
            Collection collection2 = new ArrayList();
            for(Object object3: iterable0) {
                if(((Font)object3).getWeight().compareTo(fontWeight0) <= 0) {
                    collection2.add(object3);
                }
            }
            if(((List)collection2).isEmpty()) {
                object4 = null;
            }
            else {
                object4 = ((List)collection2).get(0);
                Comparable comparable0 = ((Font)object4).getWeight();
                int v2 = CollectionsKt.getLastIndex(((List)collection2));
                if(1 <= v2) {
                    for(int v3 = 1; true; ++v3) {
                        Object object5 = ((List)collection2).get(v3);
                        Comparable comparable1 = ((Font)object5).getWeight();
                        if(comparable0.compareTo(comparable1) < 0) {
                            object4 = object5;
                            comparable0 = comparable1;
                        }
                        if(v3 == v2) {
                            break;
                        }
                    }
                }
            }
            font0 = (Font)object4;
            if(font0 == null) {
                Collection collection3 = new ArrayList();
                for(Object object6: iterable0) {
                    if(((Font)object6).getWeight().compareTo(fontWeight0) > 0) {
                        collection3.add(object6);
                    }
                }
                if(!((List)collection3).isEmpty()) {
                    Object object7 = ((List)collection3).get(0);
                    Comparable comparable2 = ((Font)object7).getWeight();
                    int v4 = CollectionsKt.getLastIndex(((List)collection3));
                    if(1 <= v4) {
                        while(true) {
                            Object object8 = ((List)collection3).get(v1);
                            Comparable comparable3 = ((Font)object8).getWeight();
                            if(comparable2.compareTo(comparable3) > 0) {
                                object7 = object8;
                                comparable2 = comparable3;
                            }
                            if(v1 == v4) {
                                break;
                            }
                            ++v1;
                        }
                    }
                    object2 = object7;
                }
                font0 = (Font)object2;
            }
        }
        else if(fontWeight0.compareTo(FontWeight.Companion.getW500()) > 0) {
            Collection collection4 = new ArrayList();
            for(Object object9: iterable0) {
                if(((Font)object9).getWeight().compareTo(fontWeight0) >= 0) {
                    collection4.add(object9);
                }
            }
            if(((List)collection4).isEmpty()) {
                object10 = null;
            }
            else {
                object10 = ((List)collection4).get(0);
                Comparable comparable4 = ((Font)object10).getWeight();
                int v5 = CollectionsKt.getLastIndex(((List)collection4));
                if(1 <= v5) {
                    for(int v6 = 1; true; ++v6) {
                        Object object11 = ((List)collection4).get(v6);
                        Comparable comparable5 = ((Font)object11).getWeight();
                        if(comparable4.compareTo(comparable5) > 0) {
                            object10 = object11;
                            comparable4 = comparable5;
                        }
                        if(v6 == v5) {
                            break;
                        }
                    }
                }
            }
            font0 = (Font)object10;
            if(font0 == null) {
                Collection collection5 = new ArrayList();
                for(Object object12: iterable0) {
                    if(((Font)object12).getWeight().compareTo(fontWeight0) < 0) {
                        collection5.add(object12);
                    }
                }
                if(!((List)collection5).isEmpty()) {
                    Object object13 = ((List)collection5).get(0);
                    Comparable comparable6 = ((Font)object13).getWeight();
                    int v7 = CollectionsKt.getLastIndex(((List)collection5));
                    if(1 <= v7) {
                        while(true) {
                            Object object14 = ((List)collection5).get(v1);
                            Comparable comparable7 = ((Font)object14).getWeight();
                            if(comparable6.compareTo(comparable7) < 0) {
                                object13 = object14;
                                comparable6 = comparable7;
                            }
                            if(v1 == v7) {
                                break;
                            }
                            ++v1;
                        }
                    }
                    object2 = object13;
                }
                font0 = (Font)object2;
            }
        }
        else {
            Collection collection6 = new ArrayList();
            for(Object object15: iterable0) {
                if(((Font)object15).getWeight().compareTo(fontWeight0) >= 0 && ((Font)object15).getWeight().compareTo(FontWeight.Companion.getW500()) <= 0) {
                    collection6.add(object15);
                }
            }
            if(((List)collection6).isEmpty()) {
                object16 = null;
            }
            else {
                object16 = ((List)collection6).get(0);
                Comparable comparable8 = ((Font)object16).getWeight();
                int v8 = CollectionsKt.getLastIndex(((List)collection6));
                if(1 <= v8) {
                    for(int v9 = 1; true; ++v9) {
                        Object object17 = ((List)collection6).get(v9);
                        Comparable comparable9 = ((Font)object17).getWeight();
                        if(comparable8.compareTo(comparable9) > 0) {
                            object16 = object17;
                            comparable8 = comparable9;
                        }
                        if(v9 == v8) {
                            break;
                        }
                    }
                }
            }
            font0 = (Font)object16;
            if(font0 == null) {
                Collection collection7 = new ArrayList();
                for(Object object18: iterable0) {
                    if(((Font)object18).getWeight().compareTo(fontWeight0) < 0) {
                        collection7.add(object18);
                    }
                }
                if(((List)collection7).isEmpty()) {
                    object19 = null;
                }
                else {
                    object19 = ((List)collection7).get(0);
                    Comparable comparable10 = ((Font)object19).getWeight();
                    int v10 = CollectionsKt.getLastIndex(((List)collection7));
                    if(1 <= v10) {
                        for(int v11 = 1; true; ++v11) {
                            Object object20 = ((List)collection7).get(v11);
                            Comparable comparable11 = ((Font)object20).getWeight();
                            if(comparable10.compareTo(comparable11) < 0) {
                                object19 = object20;
                                comparable10 = comparable11;
                            }
                            if(v11 == v10) {
                                break;
                            }
                        }
                    }
                }
                font0 = (Font)object19;
                if(font0 == null) {
                    Collection collection8 = new ArrayList();
                    for(Object object21: iterable0) {
                        if(((Font)object21).getWeight().compareTo(FontWeight.Companion.getW500()) > 0) {
                            collection8.add(object21);
                        }
                    }
                    if(!((List)collection8).isEmpty()) {
                        Object object22 = ((List)collection8).get(0);
                        Comparable comparable12 = ((Font)object22).getWeight();
                        int v12 = CollectionsKt.getLastIndex(((List)collection8));
                        if(1 <= v12) {
                            while(true) {
                                Object object23 = ((List)collection8).get(v1);
                                Comparable comparable13 = ((Font)object23).getWeight();
                                if(comparable12.compareTo(comparable13) > 0) {
                                    object22 = object23;
                                    comparable12 = comparable13;
                                }
                                if(v1 == v12) {
                                    break;
                                }
                                ++v1;
                            }
                        }
                        object2 = object22;
                    }
                    font0 = (Font)object2;
                }
            }
        }
        if(font0 == null) {
            throw new IllegalStateException("Cannot match any font");
        }
        return font0;
    }
}

