package androidx.compose.ui.text.platform;

import android.text.SpannableString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.platform.extensions.PlaceholderExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnitKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001AX\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0012\u0010\b\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\n0\t2\u0012\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t2\u0006\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u0011H\u0000¨\u0006\u0012"}, d2 = {"createCharSequence", "", "text", "", "contextFontSize", "", "contextTextStyle", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidParagraphHelper_androidKt {
    public static final CharSequence createCharSequence(String s, float f, TextStyle textStyle0, List list0, List list1, Density density0, TypefaceAdapter typefaceAdapter0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "contextTextStyle");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(typefaceAdapter0, "typefaceAdapter");
        if(list0.isEmpty() && list1.isEmpty() && Intrinsics.areEqual(textStyle0.getTextIndent(), TextIndent.Companion.getNone()) && TextUnitKt.isUnspecified--R2X_6o(textStyle0.getLineHeight-XSAIIZE())) {
            return s;
        }
        SpannableString spannableString0 = new SpannableString(s);
        SpannableExtensions_androidKt.setLineHeight-r9BaKPg(spannableString0, textStyle0.getLineHeight-XSAIIZE(), f, density0);
        SpannableExtensions_androidKt.setTextIndent(spannableString0, textStyle0.getTextIndent(), f, density0);
        SpannableExtensions_androidKt.setSpanStyles(spannableString0, textStyle0, list0, density0, typefaceAdapter0);
        PlaceholderExtensions_androidKt.setPlaceholders(spannableString0, list1, density0);
        return spannableString0;
    }
}

