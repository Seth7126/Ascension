package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.intl.AndroidLocale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.unit.Density;
import androidx.core.text.TextUtilsCompat;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AP\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0012\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0012\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\b0\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0000\u001A+\u0010\u0010\u001A\u00020\u00112\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u0015H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u0016\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"ActualParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "resolveTextDirectionHeuristics", "", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "resolveTextDirectionHeuristics-9GRLPo0", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidParagraphIntrinsics_androidKt {
    public static final ParagraphIntrinsics ActualParagraphIntrinsics(String s, TextStyle textStyle0, List list0, List list1, Density density0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        return new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, new TypefaceAdapter(null, font$ResourceLoader0, 1, null), density0);
    }

    public static final int resolveTextDirectionHeuristics-9GRLPo0(TextDirection textDirection0, LocaleList localeList0) {
        int v = textDirection0 == null ? 3 : textDirection0.unbox-impl();
        if(!TextDirection.equals-impl0(v, 4)) {
            if(TextDirection.equals-impl0(v, 5)) {
                return 3;
            }
            if(TextDirection.equals-impl0(v, 1)) {
                return 0;
            }
            if(TextDirection.equals-impl0(v, 2)) {
                return 1;
            }
            if(!TextDirection.equals-impl0(v, 3)) {
                throw new IllegalStateException("Invalid TextDirection.");
            }
            Locale locale0 = localeList0 == null ? null : ((AndroidLocale)localeList0.get(0).getPlatformLocale$ui_text_release()).getJavaLocale();
            if(locale0 == null) {
                locale0 = Locale.getDefault();
            }
            int v1 = TextUtilsCompat.getLayoutDirectionFromLocale(locale0);
            return v1 != 0 && v1 == 1 ? 3 : 2;
        }
        return 2;
    }

    public static int resolveTextDirectionHeuristics-9GRLPo0$default(TextDirection textDirection0, LocaleList localeList0, int v, Object object0) {
        if((v & 1) != 0) {
            textDirection0 = null;
        }
        if((v & 2) != 0) {
            localeList0 = null;
        }
        return AndroidParagraphIntrinsics_androidKt.resolveTextDirectionHeuristics-9GRLPo0(textDirection0, localeList0);
    }
}

