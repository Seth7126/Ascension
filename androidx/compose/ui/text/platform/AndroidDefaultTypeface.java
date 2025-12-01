package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0003\u001A\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidDefaultTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "()V", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getNativeTypeface", "Landroid/graphics/Typeface;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidDefaultTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;

    public AndroidDefaultTypeface() {
        this.fontFamily = FontFamily.Companion.getDefault();
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    public Typeface getNativeTypeface-PYhJU0U(FontWeight fontWeight0, int v, int v1) {
        Intrinsics.checkNotNullParameter(fontWeight0, "fontWeight");
        if(Build.VERSION.SDK_INT < 28) {
            Typeface typeface0 = Typeface.defaultFromStyle(TypefaceAdapter.Companion.getTypefaceStyle-FO1MlWM(fontWeight0, v));
            Intrinsics.checkNotNullExpressionValue(typeface0, "{\n            Typeface.defaultFromStyle(\n                TypefaceAdapter.getTypefaceStyle(fontWeight, fontStyle)\n            )\n        }");
            return typeface0;
        }
        Typeface typeface1 = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(typeface1, "DEFAULT");
        return TypefaceAdapterHelperMethods.INSTANCE.create(typeface1, fontWeight0.getWeight(), FontStyle.equals-impl0(v, 1));
    }
}

