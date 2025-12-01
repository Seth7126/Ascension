package androidx.compose.ui.text.platform.extensions;

import android.graphics.Typeface;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.TypefaceAdapter;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0002\u001A$\u0010\u0006\u001A\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\b\u001A\u00020\tH\u0000\u001A\f\u0010\n\u001A\u00020\u000B*\u00020\u0003H\u0000¨\u0006\f"}, d2 = {"createTypeface", "Landroid/graphics/Typeface;", "style", "Landroidx/compose/ui/text/SpanStyle;", "typefaceAdapter", "Landroidx/compose/ui/text/platform/TypefaceAdapter;", "applySpanStyle", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "density", "Landroidx/compose/ui/unit/Density;", "hasFontAttributes", "", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextPaintExtensions_androidKt {
    public static final SpanStyle applySpanStyle(AndroidTextPaint androidTextPaint0, SpanStyle spanStyle0, TypefaceAdapter typefaceAdapter0, Density density0) {
        Intrinsics.checkNotNullParameter(androidTextPaint0, "<this>");
        Intrinsics.checkNotNullParameter(spanStyle0, "style");
        Intrinsics.checkNotNullParameter(typefaceAdapter0, "typefaceAdapter");
        Intrinsics.checkNotNullParameter(density0, "density");
        long v = TextUnit.getType-UIouoOA(spanStyle0.getFontSize-XSAIIZE());
        if(TextUnitType.equals-impl0(v, 0x100000000L)) {
            androidTextPaint0.setTextSize(density0.toPx--R2X_6o(spanStyle0.getFontSize-XSAIIZE()));
        }
        else if(TextUnitType.equals-impl0(v, 0x200000000L)) {
            androidTextPaint0.setTextSize(androidTextPaint0.getTextSize() * TextUnit.getValue-impl(spanStyle0.getFontSize-XSAIIZE()));
        }
        if(TextPaintExtensions_androidKt.hasFontAttributes(spanStyle0)) {
            androidTextPaint0.setTypeface(TextPaintExtensions_androidKt.createTypeface(spanStyle0, typefaceAdapter0));
        }
        boolean z = false;
        if(spanStyle0.getLocaleList() != null && !Intrinsics.areEqual(spanStyle0.getLocaleList(), LocaleList.Companion.getCurrent())) {
            if(Build.VERSION.SDK_INT >= 24) {
                LocaleListHelperMethods.INSTANCE.setTextLocales(androidTextPaint0, spanStyle0.getLocaleList());
            }
            else {
                androidTextPaint0.setTextLocale(LocaleExtensions_androidKt.toJavaLocale((spanStyle0.getLocaleList().isEmpty() ? Locale.Companion.getCurrent() : spanStyle0.getLocaleList().get(0))));
            }
        }
        if(TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(spanStyle0.getLetterSpacing-XSAIIZE()), 0x200000000L)) {
            androidTextPaint0.setLetterSpacing(TextUnit.getValue-impl(spanStyle0.getLetterSpacing-XSAIIZE()));
        }
        if(spanStyle0.getFontFeatureSettings() != null && !Intrinsics.areEqual(spanStyle0.getFontFeatureSettings(), "")) {
            androidTextPaint0.setFontFeatureSettings(spanStyle0.getFontFeatureSettings());
        }
        if(spanStyle0.getTextGeometricTransform() != null && !Intrinsics.areEqual(spanStyle0.getTextGeometricTransform(), TextGeometricTransform.Companion.getNone$ui_text_release())) {
            androidTextPaint0.setTextScaleX(androidTextPaint0.getTextScaleX() * spanStyle0.getTextGeometricTransform().getScaleX());
            androidTextPaint0.setTextSkewX(androidTextPaint0.getTextSkewX() + spanStyle0.getTextGeometricTransform().getSkewX());
        }
        androidTextPaint0.setColor-8_81llA(spanStyle0.getColor-0d7_KjU());
        androidTextPaint0.setShadow(spanStyle0.getShadow());
        androidTextPaint0.setTextDecoration(spanStyle0.getTextDecoration());
        long v1 = !TextUnitType.equals-impl0(TextUnit.getType-UIouoOA(spanStyle0.getLetterSpacing-XSAIIZE()), 0x100000000L) || TextUnit.getValue-impl(spanStyle0.getLetterSpacing-XSAIIZE()) == 0.0f ? 0x7FC00000L : spanStyle0.getLetterSpacing-XSAIIZE();
        long v2 = Color.equals-impl0(spanStyle0.getBackground-0d7_KjU(), 0L) ? 16L : spanStyle0.getBackground-0d7_KjU();
        BaselineShift baselineShift0 = spanStyle0.getBaselineShift-5SSeXJ0();
        if(baselineShift0 != null) {
            z = BaselineShift.equals-impl0(baselineShift0.unbox-impl(), 0.0f);
        }
        return z ? new SpanStyle(0L, 0L, null, null, null, null, null, v1, null, null, null, v2, null, null, 0x367F, null) : new SpanStyle(0L, 0L, null, null, null, null, null, v1, spanStyle0.getBaselineShift-5SSeXJ0(), null, null, v2, null, null, 0x367F, null);
    }

    private static final Typeface createTypeface(SpanStyle spanStyle0, TypefaceAdapter typefaceAdapter0) {
        FontFamily fontFamily0 = spanStyle0.getFontFamily();
        FontWeight fontWeight0 = spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight();
        FontStyle fontStyle0 = spanStyle0.getFontStyle-4Lr2A7w();
        int v = fontStyle0 == null ? 0 : fontStyle0.unbox-impl();
        FontSynthesis fontSynthesis0 = spanStyle0.getFontSynthesis-ZQGJjVo();
        return fontSynthesis0 == null ? typefaceAdapter0.create-DPcqOEQ(fontFamily0, fontWeight0, v, 1) : typefaceAdapter0.create-DPcqOEQ(fontFamily0, fontWeight0, v, fontSynthesis0.unbox-impl());
    }

    public static final boolean hasFontAttributes(SpanStyle spanStyle0) {
        Intrinsics.checkNotNullParameter(spanStyle0, "<this>");
        return spanStyle0.getFontFamily() != null || spanStyle0.getFontStyle-4Lr2A7w() != null || spanStyle0.getFontWeight() != null;
    }
}

