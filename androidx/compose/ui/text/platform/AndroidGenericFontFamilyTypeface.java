package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.collection.SparseArrayCompat;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J-\u0010\u000E\u001A\n \u000F*\u0004\u0018\u00010\u000B0\u000B2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u0018H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ#\u0010\u001B\u001A\u00020\u000B2\u0006\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u0015R\u0014\u0010\u0002\u001A\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u000E\u0010\b\u001A\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\r8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidGenericFontFamilyTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/GenericFontFamily;", "(Landroidx/compose/ui/text/font/GenericFontFamily;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "lock", "", "nativeTypeface", "Landroid/graphics/Typeface;", "styledCache", "Landroidx/collection/SparseArrayCompat;", "buildStyledTypeface", "kotlin.jvm.PlatformType", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "buildStyledTypeface-FO1MlWM", "(Landroidx/compose/ui/text/font/FontWeight;I)Landroid/graphics/Typeface;", "getNativeTypeface", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getOrPut", "getOrPut-FO1MlWM", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidGenericFontFamilyTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final Object lock;
    private final Typeface nativeTypeface;
    private final SparseArrayCompat styledCache;

    public AndroidGenericFontFamilyTypeface(GenericFontFamily genericFontFamily0) {
        Intrinsics.checkNotNullParameter(genericFontFamily0, "fontFamily");
        super();
        this.fontFamily = genericFontFamily0;
        Typeface typeface0 = Typeface.create(genericFontFamily0.getName(), 0);
        Intrinsics.checkNotNull(typeface0);
        this.nativeTypeface = typeface0;
        this.lock = new Object();
        this.styledCache = new SparseArrayCompat(4);
    }

    private final Typeface buildStyledTypeface-FO1MlWM(FontWeight fontWeight0, int v) {
        if(Build.VERSION.SDK_INT < 28) {
            int v1 = TypefaceAdapter.Companion.getTypefaceStyle-FO1MlWM(fontWeight0, v);
            return Typeface.create(this.nativeTypeface, v1);
        }
        return TypefaceAdapterHelperMethods.INSTANCE.create(this.nativeTypeface, fontWeight0.getWeight(), FontStyle.equals-impl0(v, 1));
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    public Typeface getNativeTypeface-PYhJU0U(FontWeight fontWeight0, int v, int v1) {
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        return this.getOrPut-FO1MlWM(fontWeight0, v);
    }

    public final Typeface getOrPut-FO1MlWM(FontWeight fontWeight0, int v) {
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        int v1 = fontWeight0.getWeight() << 1 | FontStyle.equals-impl0(v, 1);
        synchronized(this.lock) {
            Typeface typeface0 = (Typeface)this.styledCache.get(v1);
            if(typeface0 == null) {
                typeface0 = this.buildStyledTypeface-FO1MlWM(fontWeight0, v);
                this.styledCache.append(v1, typeface0);
                Intrinsics.checkNotNullExpressionValue(typeface0, "buildStyledTypeface(fontWeight, fontStyle).also {\n                styledCache.append(key, it)\n            }");
            }
            return typeface0;
        }
    }
}

