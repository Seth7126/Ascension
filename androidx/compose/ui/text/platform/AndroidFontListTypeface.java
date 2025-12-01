package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001F2\u00020\u0001:\u0001\u001FB@\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u001C\b\u0002\u0010\u0006\u001A\u0016\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000B\u001A\u00020\fø\u0001\u0000¢\u0006\u0002\u0010\rJ-\u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0019\u001A\u00020\t2\u0006\u0010\u001A\u001A\u00020\n2\u0006\u0010\u001B\u001A\u00020\u001CH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\u001ER\u0014\u0010\u0002\u001A\u00020\u000EX\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0013\u0010\u000B\u001A\u00020\f¢\u0006\n\n\u0002\b\u0013\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontListFontFamily;", "context", "Landroid/content/Context;", "necessaryStyles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "loadedTypefaces", "", "Landroidx/compose/ui/text/font/Font;", "Landroid/graphics/Typeface;", "getNativeTypeface", "fontWeight", "fontStyle", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidFontListTypeface implements AndroidTypeface {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "()V", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }
    }

    private static final Companion Companion;
    private final FontFamily fontFamily;
    private static final FontMatcher fontMatcher;
    private final FontMatcher fontMatcher$1;
    private final Map loadedTypefaces;

    static {
        AndroidFontListTypeface.Companion = new Companion(null);
        AndroidFontListTypeface.fontMatcher = new FontMatcher();
    }

    public AndroidFontListTypeface(FontListFontFamily fontListFontFamily0, Context context0, List list0, FontMatcher fontMatcher0) {
        Intrinsics.checkNotNullParameter(fontListFontFamily0, "fontFamily");
        List list1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(fontMatcher0, "fontMatcher");
        super();
        this.fontMatcher$1 = fontMatcher0;
        if(list0 == null) {
            list1 = null;
        }
        else {
            ArrayList arrayList0 = new ArrayList(list0.size());
            int v1 = list0.size();
            if(v1 - 1 >= 0) {
                for(int v2 = 0; true; ++v2) {
                    Object object0 = list0.get(v2);
                    arrayList0.add(this.getFontMatcher().matchFont-RetOiIg(fontListFontFamily0, ((FontWeight)((Pair)object0).component1()), ((FontStyle)((Pair)object0).component2()).unbox-impl()));
                    if(v2 + 1 > v1 - 1) {
                        break;
                    }
                }
            }
            list1 = CollectionsKt.toList(new LinkedHashSet(arrayList0));
        }
        if(list1 == null) {
            list1 = fontListFontFamily0.getFonts();
        }
        Map map0 = new LinkedHashMap();
        int v3 = list1.size();
        if(v3 - 1 >= 0) {
            for(int v = 0; true; ++v) {
                Font font0 = (Font)list1.get(v);
                try {
                    Intrinsics.checkNotNullExpressionValue(font0, "it");
                    map0.put(font0, AndroidTypefaceCache.INSTANCE.getOrCreate(context0, font0));
                }
                catch(Exception unused_ex) {
                    throw new IllegalStateException("Cannot create Typeface from " + font0);
                }
                if(v + 1 > v3 - 1) {
                    break;
                }
            }
        }
        this.loadedTypefaces = map0;
        this.fontFamily = fontListFontFamily0;
    }

    public AndroidFontListTypeface(FontListFontFamily fontListFontFamily0, Context context0, List list0, FontMatcher fontMatcher0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            list0 = null;
        }
        if((v & 8) != 0) {
            fontMatcher0 = AndroidFontListTypeface.fontMatcher;
        }
        this(fontListFontFamily0, context0, list0, fontMatcher0);
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    public Typeface getNativeTypeface-PYhJU0U(FontWeight fontWeight0, int v, int v1) {
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        Iterable iterable0 = this.loadedTypefaces.keySet();
        Font font0 = this.fontMatcher$1.matchFont-RetOiIg(iterable0, fontWeight0, v);
        Object object0 = this.loadedTypefaces.get(font0);
        if(((Typeface)object0) == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        return (!Intrinsics.areEqual(font0.getWeight(), fontWeight0) || !FontStyle.equals-impl0(font0.getStyle-_-LCdwA(), v)) && !FontSynthesis.equals-impl0(v1, 0) ? TypefaceAdapter.Companion.synthesize-Wqqsr6A(((Typeface)object0), font0, fontWeight0, v, v1) : ((Typeface)object0);
    }
}

