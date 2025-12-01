package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001A1\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001A\f\u0010\n\u001A\u00020\u000B*\u00020\u0001H\u0007\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FontKt {
    public static final Font Font-RetOiIg(int v, FontWeight fontWeight0, int v1) {
        Intrinsics.checkNotNullParameter(fontWeight0, "weight");
        return new ResourceFont(v, fontWeight0, v1, null);
    }

    public static Font Font-RetOiIg$default(int v, FontWeight fontWeight0, int v1, int v2, Object object0) {
        if((v2 & 2) != 0) {
            fontWeight0 = FontWeight.Companion.getNormal();
        }
        if((v2 & 4) != 0) {
            v1 = 0;
        }
        return FontKt.Font-RetOiIg(v, fontWeight0, v1);
    }

    public static final FontFamily toFontFamily(Font font0) {
        Intrinsics.checkNotNullParameter(font0, "<this>");
        return FontFamilyKt.FontFamily(new Font[]{font0});
    }
}

