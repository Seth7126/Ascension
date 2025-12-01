package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.collection.LruCache;
import androidx.compose.ui.text.font.AndroidFont;
import androidx.compose.ui.text.font.DefaultFontFamily;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.ResourceFont;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\b\u0010\u0018\u0000 \u001F2\u00020\u0001:\u0002\u001E\u001FB\u0017\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J?\u0010\u000B\u001A\u00020\f2\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u00102\b\b\u0002\u0010\u0011\u001A\u00020\u00122\b\b\u0002\u0010\u0013\u001A\u00020\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\u0011\u001A\u00020\u00122\b\b\u0002\u0010\u000F\u001A\u00020\u00102\u0006\u0010\r\u001A\u00020\u00172\b\b\u0002\u0010\u0013\u001A\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J5\u0010\u000B\u001A\u00020\f2\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u001B2\b\b\u0002\u0010\u000F\u001A\u00020\u00102\b\b\u0002\u0010\u0011\u001A\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u001DR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter;", "", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "(Landroidx/compose/ui/text/font/FontMatcher;Landroidx/compose/ui/text/font/Font$ResourceLoader;)V", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "getResourceLoader", "()Landroidx/compose/ui/text/font/Font$ResourceLoader;", "create", "Landroid/graphics/Typeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "create-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "create-xC2X5gM", "(ILandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontListFontFamily;I)Landroid/graphics/Typeface;", "genericFontFamily", "", "create-RetOiIg", "(Ljava/lang/String;Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "CacheKey", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class TypefaceAdapter {
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B,\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\tø\u0001\u0000¢\u0006\u0002\u0010\nJ\u000B\u0010\u0013\u001A\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÆ\u0003J\u0019\u0010\u0015\u001A\u00020\u0007HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u000EJ\u0019\u0010\u0017\u001A\u00020\tHÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u000EJ@\u0010\u0019\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\tHÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001A\u0010\u001BJ\u0013\u0010\u001C\u001A\u00020\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001F\u001A\u00020 HÖ\u0001J\t\u0010!\u001A\u00020\"HÖ\u0001R\u0013\u0010\u0002\u001A\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\r\u0010\u000ER\u001C\u0010\b\u001A\u00020\tø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\u0010\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontStyle-_-LCdwA", "()I", "I", "getFontSynthesis-GVVA2EU", "getFontWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "component1", "component2", "component3", "component3-_-LCdwA", "component4", "component4-GVVA2EU", "copy", "copy-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class CacheKey {
        private final FontFamily fontFamily;
        private final int fontStyle;
        private final int fontSynthesis;
        private final FontWeight fontWeight;

        private CacheKey(FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1) {
            this.fontFamily = fontFamily0;
            this.fontWeight = fontWeight0;
            this.fontStyle = v;
            this.fontSynthesis = v1;
        }

        public CacheKey(FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v2 & 1) != 0) {
                fontFamily0 = null;
            }
            this(fontFamily0, fontWeight0, v, v1, null);
        }

        public CacheKey(FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
            this(fontFamily0, fontWeight0, v, v1);
        }

        public final FontFamily component1() {
            return this.fontFamily;
        }

        public final FontWeight component2() {
            return this.fontWeight;
        }

        public final int component3-_-LCdwA() {
            return this.fontStyle;
        }

        public final int component4-GVVA2EU() {
            return this.fontSynthesis;
        }

        public final CacheKey copy-DPcqOEQ(FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1) {
            Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
            return new CacheKey(fontFamily0, fontWeight0, v, v1, null);
        }

        public static CacheKey copy-DPcqOEQ$default(CacheKey typefaceAdapter$CacheKey0, FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, int v2, Object object0) {
            if((v2 & 1) != 0) {
                fontFamily0 = typefaceAdapter$CacheKey0.fontFamily;
            }
            if((v2 & 2) != 0) {
                fontWeight0 = typefaceAdapter$CacheKey0.fontWeight;
            }
            if((v2 & 4) != 0) {
                v = typefaceAdapter$CacheKey0.fontStyle;
            }
            if((v2 & 8) != 0) {
                v1 = typefaceAdapter$CacheKey0.fontSynthesis;
            }
            return typefaceAdapter$CacheKey0.copy-DPcqOEQ(fontFamily0, fontWeight0, v, v1);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof CacheKey)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.fontFamily, ((CacheKey)object0).fontFamily)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.fontWeight, ((CacheKey)object0).fontWeight)) {
                return false;
            }
            return FontStyle.equals-impl0(this.fontStyle, ((CacheKey)object0).fontStyle) ? FontSynthesis.equals-impl0(this.fontSynthesis, ((CacheKey)object0).fontSynthesis) : false;
        }

        public final FontFamily getFontFamily() {
            return this.fontFamily;
        }

        public final int getFontStyle-_-LCdwA() {
            return this.fontStyle;
        }

        public final int getFontSynthesis-GVVA2EU() {
            return this.fontSynthesis;
        }

        public final FontWeight getFontWeight() {
            return this.fontWeight;
        }

        @Override
        public int hashCode() {
            return this.fontFamily == null ? (this.fontWeight.hashCode() * 0x1F + this.fontStyle) * 0x1F + this.fontSynthesis : ((this.fontFamily.hashCode() * 0x1F + this.fontWeight.hashCode()) * 0x1F + this.fontStyle) * 0x1F + this.fontSynthesis;
        }

        @Override
        public String toString() {
            return "CacheKey(fontFamily=" + this.fontFamily + ", fontWeight=" + this.fontWeight + ", fontStyle=" + FontStyle.toString-impl(this.fontStyle) + ", fontSynthesis=" + FontSynthesis.toString-impl(this.fontSynthesis) + ')';
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u000Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0013H\u0002J;\u0010\u0015\u001A\u00020\b2\u0006\u0010\u0016\u001A\u00020\b2\u0006\u0010\u0017\u001A\u00020\u00182\u0006\u0010\r\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0019\u001A\u00020\u001Aø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001CR\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001D\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/text/platform/TypefaceAdapter$Companion;", "", "()V", "ANDROID_BOLD", "Landroidx/compose/ui/text/font/FontWeight;", "typefaceCache", "Landroidx/collection/LruCache;", "Landroidx/compose/ui/text/platform/TypefaceAdapter$CacheKey;", "Landroid/graphics/Typeface;", "getTypefaceCache", "()Landroidx/collection/LruCache;", "getTypefaceStyle", "", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "getTypefaceStyle-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)I", "isBold", "", "isItalic", "synthesize", "typeface", "font", "Landroidx/compose/ui/text/font/Font;", "fontSynthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesize-Wqqsr6A", "(Landroid/graphics/Typeface;Landroidx/compose/ui/text/font/Font;Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final LruCache getTypefaceCache() {
            return TypefaceAdapter.typefaceCache;
        }

        private final int getTypefaceStyle(boolean z, boolean z1) {
            if(z1 && z) {
                return 3;
            }
            if(z) {
                return 1;
            }
            return z1 ? 2 : 0;
        }

        // 去混淆评级： 低(20)
        public final int getTypefaceStyle-FO1MlWM(FontWeight fontWeight0, int v) {
            Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
            return fontWeight0.compareTo(TypefaceAdapter.ANDROID_BOLD) < 0 ? this.getTypefaceStyle(false, FontStyle.equals-impl0(v, 1)) : this.getTypefaceStyle(true, FontStyle.equals-impl0(v, 1));
        }

        public final Typeface synthesize-Wqqsr6A(Typeface typeface0, Font font0, FontWeight fontWeight0, int v, int v1) {
            Intrinsics.checkNotNullParameter(typeface0, "typeface");
            Intrinsics.checkNotNullParameter(font0, "font");
            Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
            boolean z = true;
            boolean z1 = FontSynthesis.isWeightOn-impl$ui_text_release(v1) && fontWeight0.compareTo(TypefaceAdapter.ANDROID_BOLD) >= 0 && font0.getWeight().compareTo(TypefaceAdapter.ANDROID_BOLD) < 0;
            boolean z2 = FontSynthesis.isStyleOn-impl$ui_text_release(v1) && !FontStyle.equals-impl0(v, font0.getStyle-_-LCdwA());
            if(!z2 && !z1) {
                return typeface0;
            }
            if(Build.VERSION.SDK_INT < 28) {
                if(!z2 || !FontStyle.equals-impl0(v, 1)) {
                    z = false;
                }
                Typeface typeface1 = Typeface.create(typeface0, this.getTypefaceStyle(z1, z));
                Intrinsics.checkNotNullExpressionValue(typeface1, "{\n                val targetStyle = getTypefaceStyle(\n                    isBold = synthesizeWeight,\n                    isItalic = synthesizeStyle && fontStyle == FontStyle.Italic\n                )\n                Typeface.create(typeface, targetStyle)\n            }");
                return typeface1;
            }
            int v2 = z1 ? fontWeight0.getWeight() : font0.getWeight().getWeight();
            if(z2) {
                return TypefaceAdapterHelperMethods.INSTANCE.create(typeface0, v2, FontStyle.equals-impl0(v, 1));
            }
            boolean z3 = FontStyle.equals-impl0(font0.getStyle-_-LCdwA(), 1);
            return TypefaceAdapterHelperMethods.INSTANCE.create(typeface0, v2, z3);
        }
    }

    private static final FontWeight ANDROID_BOLD;
    public static final Companion Companion;
    private final FontMatcher fontMatcher;
    private final ResourceLoader resourceLoader;
    private static final LruCache typefaceCache;

    static {
        TypefaceAdapter.Companion = new Companion(null);
        TypefaceAdapter.ANDROID_BOLD = FontWeight.Companion.getW600();
        TypefaceAdapter.typefaceCache = new LruCache(16);
    }

    public TypefaceAdapter(FontMatcher fontMatcher0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(fontMatcher0, "fontMatcher");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        super();
        this.fontMatcher = fontMatcher0;
        this.resourceLoader = font$ResourceLoader0;
    }

    public TypefaceAdapter(FontMatcher fontMatcher0, ResourceLoader font$ResourceLoader0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            fontMatcher0 = new FontMatcher();
        }
        this(fontMatcher0, font$ResourceLoader0);
    }

    public Typeface create-DPcqOEQ(FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1) {
        Typeface typeface1;
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        CacheKey typefaceAdapter$CacheKey0 = new CacheKey(fontFamily0, fontWeight0, v, v1, null);
        LruCache lruCache0 = TypefaceAdapter.typefaceCache;
        Typeface typeface0 = (Typeface)lruCache0.get(typefaceAdapter$CacheKey0);
        if(typeface0 != null) {
            return typeface0;
        }
        if(fontFamily0 instanceof FontListFontFamily) {
            typeface1 = this.create-xC2X5gM(v, fontWeight0, ((FontListFontFamily)fontFamily0), v1);
        }
        else {
            if(fontFamily0 instanceof GenericFontFamily) {
                typeface1 = this.create-RetOiIg(((GenericFontFamily)fontFamily0).getName(), fontWeight0, v);
                lruCache0.put(typefaceAdapter$CacheKey0, typeface1);
                return typeface1;
            }
            if(fontFamily0 instanceof DefaultFontFamily || fontFamily0 == null) {
                typeface1 = this.create-RetOiIg(null, fontWeight0, v);
            }
            else if(fontFamily0 instanceof LoadedFontFamily) {
                typeface1 = ((AndroidTypeface)((LoadedFontFamily)fontFamily0).getTypeface()).getNativeTypeface-PYhJU0U(fontWeight0, v, v1);
            }
            else {
                throw new NoWhenBranchMatchedException();
            }
        }
        lruCache0.put(typefaceAdapter$CacheKey0, typeface1);
        return typeface1;
    }

    public static Typeface create-DPcqOEQ$default(TypefaceAdapter typefaceAdapter0, FontFamily fontFamily0, FontWeight fontWeight0, int v, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-DPcqOEQ");
        }
        if((v2 & 1) != 0) {
            fontFamily0 = null;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 1;
        }
        return typefaceAdapter0.create-DPcqOEQ(fontFamily0, fontWeight0, v, v1);
    }

    private final Typeface create-RetOiIg(String s, FontWeight fontWeight0, int v) {
        if(FontStyle.equals-impl0(v, 0) && Intrinsics.areEqual(fontWeight0, FontWeight.Companion.getNormal()) && (s == null || s.length() == 0)) {
            Typeface typeface0 = Typeface.DEFAULT;
            Intrinsics.checkNotNullExpressionValue(typeface0, "DEFAULT");
            return typeface0;
        }
        if(Build.VERSION.SDK_INT < 28) {
            int v1 = TypefaceAdapter.Companion.getTypefaceStyle-FO1MlWM(fontWeight0, v);
            Typeface typeface1 = s != null && s.length() != 0 ? Typeface.create(s, v1) : Typeface.defaultFromStyle(v1);
            Intrinsics.checkNotNullExpressionValue(typeface1, "{\n            val targetStyle = getTypefaceStyle(fontWeight, fontStyle)\n            if (genericFontFamily.isNullOrEmpty()) {\n                Typeface.defaultFromStyle(targetStyle)\n            } else {\n                Typeface.create(genericFontFamily, targetStyle)\n            }\n        }");
            return typeface1;
        }
        Typeface typeface2 = s == null ? Typeface.DEFAULT : Typeface.create(s, 0);
        Intrinsics.checkNotNullExpressionValue(typeface2, "familyTypeface");
        return TypefaceAdapterHelperMethods.INSTANCE.create(typeface2, fontWeight0.getWeight(), FontStyle.equals-impl0(v, 1));
    }

    static Typeface create-RetOiIg$default(TypefaceAdapter typefaceAdapter0, String s, FontWeight fontWeight0, int v, int v1, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-RetOiIg");
        }
        if((v1 & 1) != 0) {
            s = null;
        }
        if((v1 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v1 & 4) != 0) {
            v = 0;
        }
        return typefaceAdapter0.create-RetOiIg(s, fontWeight0, v);
    }

    private final Typeface create-xC2X5gM(int v, FontWeight fontWeight0, FontListFontFamily fontListFontFamily0, int v1) {
        Typeface typeface0;
        Font font0 = this.fontMatcher.matchFont-RetOiIg(fontListFontFamily0, fontWeight0, v);
        try {
            if(font0 instanceof ResourceFont) {
                typeface0 = (Typeface)this.resourceLoader.load(font0);
                return FontSynthesis.equals-impl0(v1, 0) || Intrinsics.areEqual(fontWeight0, font0.getWeight()) && FontStyle.equals-impl0(v, font0.getStyle-_-LCdwA()) ? typeface0 : TypefaceAdapter.Companion.synthesize-Wqqsr6A(typeface0, font0, fontWeight0, v, v1);
            }
            if(!(font0 instanceof AndroidFont)) {
                throw new IllegalStateException("Unknown font type: " + font0);
            }
            typeface0 = ((AndroidFont)font0).getTypeface();
            return FontSynthesis.equals-impl0(v1, 0) || Intrinsics.areEqual(fontWeight0, font0.getWeight()) && FontStyle.equals-impl0(v, font0.getStyle-_-LCdwA()) ? typeface0 : TypefaceAdapter.Companion.synthesize-Wqqsr6A(typeface0, font0, fontWeight0, v, v1);
        }
        catch(Exception exception0) {
            throw new IllegalStateException("Cannot create Typeface from " + font0, exception0);
        }
    }

    static Typeface create-xC2X5gM$default(TypefaceAdapter typefaceAdapter0, int v, FontWeight fontWeight0, FontListFontFamily fontListFontFamily0, int v1, int v2, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create-xC2X5gM");
        }
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v2 & 8) != 0) {
            v1 = 1;
        }
        return typefaceAdapter0.create-xC2X5gM(v, fontWeight0, fontListFontFamily0, v1);
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    public final ResourceLoader getResourceLoader() {
        return this.resourceLoader;
    }
}

