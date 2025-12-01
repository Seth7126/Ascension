package androidx.compose.ui.text.platform;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.AnnotatedString.Range;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.InternalTextApi;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TtsAnnotation;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt;
import androidx.compose.ui.text.platform.extensions.TtsAnnotationExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A4\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0002\u001A\u001C\u0010\f\u001A\u00020\u0002*\u00020\r2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u000E\u001A\u00020\u000FH\u0007¨\u0006\u0010"}, d2 = {"setSpanStyle", "", "Landroid/text/SpannableString;", "spanStyle", "Landroidx/compose/ui/text/SpanStyle;", "start", "", "end", "density", "Landroidx/compose/ui/unit/Density;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "toAccessibilitySpannableString", "Landroidx/compose/ui/text/AnnotatedString;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidAccessibilitySpannableString_androidKt {
    private static final void setSpanStyle(SpannableString spannableString0, SpanStyle spanStyle0, int v, int v1, Density density0, TypefaceAdapter typefaceAdapter0) {
        SpannableExtensions_androidKt.setColor-RPmYEkk(spannableString0, spanStyle0.getColor-0d7_KjU(), v, v1);
        SpannableExtensions_androidKt.setFontSize-KmRG4DE(spannableString0, spanStyle0.getFontSize-XSAIIZE(), density0, v, v1);
        if(spanStyle0.getFontWeight() != null || spanStyle0.getFontStyle-4Lr2A7w() != null) {
            FontWeight fontWeight0 = spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight();
            FontStyle fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
            spannableString0.setSpan(new StyleSpan(TypefaceAdapter.Companion.getTypefaceStyle-FO1MlWM(fontWeight0, (fontStyle0 == null ? 0 : fontStyle0.unbox-impl()))), v, v1, 33);
        }
        if(spanStyle0.getFontFamily() != null) {
            if(spanStyle0.getFontFamily() instanceof GenericFontFamily) {
                spannableString0.setSpan(new TypefaceSpan(((GenericFontFamily)spanStyle0.getFontFamily()).getName()), v, v1, 33);
            }
            else if(Build.VERSION.SDK_INT >= 28) {
                FontSynthesis fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
                Typeface typeface0 = TypefaceAdapter.create-DPcqOEQ$default(typefaceAdapter0, spanStyle0.getFontFamily(), null, 0, (fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()), 6, null);
                spannableString0.setSpan(Api28Impl.INSTANCE.createTypefaceSpan(typeface0), v, v1, 33);
            }
        }
        if(spanStyle0.getTextDecoration() != null) {
            if(spanStyle0.getTextDecoration().contains(TextDecoration.Companion.getUnderline())) {
                spannableString0.setSpan(new UnderlineSpan(), v, v1, 33);
            }
            if(spanStyle0.getTextDecoration().contains(TextDecoration.Companion.getLineThrough())) {
                spannableString0.setSpan(new StrikethroughSpan(), v, v1, 33);
            }
        }
        if(spanStyle0.getTextGeometricTransform() != null) {
            spannableString0.setSpan(new ScaleXSpan(spanStyle0.getTextGeometricTransform().getScaleX()), v, v1, 33);
        }
        SpannableExtensions_androidKt.setLocaleList(spannableString0, spanStyle0.getLocaleList(), v, v1);
        SpannableExtensions_androidKt.setBackground-RPmYEkk(spannableString0, spanStyle0.getBackground-0d7_KjU(), v, v1);
    }

    @InternalTextApi
    public static final SpannableString toAccessibilitySpannableString(AnnotatedString annotatedString0, Density density0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "<this>");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        SpannableString spannableString0 = new SpannableString(annotatedString0.getText());
        TypefaceAdapter typefaceAdapter0 = new TypefaceAdapter(null, font$ResourceLoader0, 1, null);
        List list0 = annotatedString0.getSpanStyles();
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                Range annotatedString$Range0 = (Range)list0.get(v2);
                AndroidAccessibilitySpannableString_androidKt.setSpanStyle(spannableString0, ((SpanStyle)annotatedString$Range0.component1()), annotatedString$Range0.component2(), annotatedString$Range0.component3(), density0, typefaceAdapter0);
                if(v2 + 1 > v - 1) {
                    break;
                }
            }
        }
        List list1 = annotatedString0.getTtsAnnotations(0, annotatedString0.length());
        int v3 = list1.size();
        if(v3 - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                Range annotatedString$Range1 = (Range)list1.get(v1);
                spannableString0.setSpan(TtsAnnotationExtensions_androidKt.toSpan(((TtsAnnotation)annotatedString$Range1.component1())), annotatedString$Range1.component2(), annotatedString$Range1.component3(), 33);
                if(v1 + 1 > v3 - 1) {
                    break;
                }
            }
        }
        return spannableString0;
    }
}

