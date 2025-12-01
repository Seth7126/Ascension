package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A\u001E\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\r\u001A\u0016\u0010\u000E\u001A\u00020\t2\u0006\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\u0011\u001A\'\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00112\b\u0010\u0015\u001A\u0004\u0018\u00010\u0013H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\"\u0013\u0010\u0000\u001A\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001A\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0004\u001A\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0006\u001A\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0007\u001A\u00020\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"DefaultBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "J", "DefaultColor", "DefaultFontSize", "Landroidx/compose/ui/unit/TextUnit;", "DefaultLetterSpacing", "DefaultLineHeight", "lerp", "Landroidx/compose/ui/text/TextStyle;", "start", "stop", "fraction", "", "resolveDefaults", "style", "direction", "Landroidx/compose/ui/unit/LayoutDirection;", "resolveTextDirection", "Landroidx/compose/ui/text/style/TextDirection;", "layoutDirection", "textDirection", "resolveTextDirection-Yj3eThk", "(Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/style/TextDirection;)I", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextStyleKt {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            arr_v[LayoutDirection.Ltr.ordinal()] = 1;
            arr_v[LayoutDirection.Rtl.ordinal()] = 2;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private static final long DefaultBackgroundColor;
    private static final long DefaultColor;
    private static final long DefaultFontSize;
    private static final long DefaultLetterSpacing;
    private static final long DefaultLineHeight;

    static {
        TextStyleKt.DefaultFontSize = 0x141600000L;
        TextStyleKt.DefaultLetterSpacing = 0x100000000L;
        TextStyleKt.DefaultBackgroundColor = 0L;
        TextStyleKt.DefaultLineHeight = 0x7FC00000L;
        TextStyleKt.DefaultColor = 0xFF00000000000000L;
    }

    public static final TextStyle lerp(TextStyle textStyle0, TextStyle textStyle1, float f) {
        Intrinsics.checkNotNullParameter(textStyle0, "start");
        Intrinsics.checkNotNullParameter(textStyle1, "stop");
        return new TextStyle(SpanStyleKt.lerp(textStyle0.toSpanStyle(), textStyle1.toSpanStyle(), f), ParagraphStyleKt.lerp(textStyle0.toParagraphStyle(), textStyle1.toParagraphStyle(), f));
    }

    public static final TextStyle resolveDefaults(TextStyle textStyle0, LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(layoutDirection0, "direction");
        long v = textStyle0.getColor-0d7_KjU();
        if(v == 16L) {
            v = TextStyleKt.DefaultColor;
        }
        long v1 = TextUnitKt.isUnspecified--R2X_6o(textStyle0.getFontSize-XSAIIZE()) ? TextStyleKt.DefaultFontSize : textStyle0.getFontSize-XSAIIZE();
        FontWeight fontWeight0 = textStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : textStyle0.getFontWeight();
        FontStyle fontStyle0 = textStyle0.getFontStyle-4Lr2A7w();
        FontStyle fontStyle1 = FontStyle.box-impl((fontStyle0 == null ? 0 : fontStyle0.unbox-impl()));
        FontSynthesis fontSynthesis0 = textStyle0.getFontSynthesis-ZQGJjVo();
        FontSynthesis fontSynthesis1 = FontSynthesis.box-impl((fontSynthesis0 == null ? 1 : fontSynthesis0.unbox-impl()));
        FontFamily fontFamily0 = textStyle0.getFontFamily();
        if(fontFamily0 == null) {
            fontFamily0 = FontFamily.Companion.getDefault();
        }
        BaselineShift baselineShift0 = textStyle0.getBaselineShift-5SSeXJ0();
        BaselineShift baselineShift1 = BaselineShift.box-impl((baselineShift0 == null ? 0.0f : baselineShift0.unbox-impl()));
        TextGeometricTransform textGeometricTransform0 = textStyle0.getTextGeometricTransform() == null ? TextGeometricTransform.Companion.getNone$ui_text_release() : textStyle0.getTextGeometricTransform();
        LocaleList localeList0 = textStyle0.getLocaleList() == null ? LocaleList.Companion.getCurrent() : textStyle0.getLocaleList();
        TextDecoration textDecoration0 = textStyle0.getTextDecoration() == null ? TextDecoration.Companion.getNone() : textStyle0.getTextDecoration();
        TextAlign textAlign0 = textStyle0.getTextAlign-buA522U();
        TextAlign textAlign1 = TextAlign.box-impl((textAlign0 == null ? 5 : textAlign0.unbox-impl()));
        TextDirection textDirection0 = TextDirection.box-impl(TextStyleKt.resolveTextDirection-Yj3eThk(layoutDirection0, textStyle0.getTextDirection-mmuk1to()));
        return new TextStyle(v, v1, fontWeight0, fontStyle1, fontSynthesis1, fontFamily0, (textStyle0.getFontFeatureSettings() == null ? "" : textStyle0.getFontFeatureSettings()), (TextUnitKt.isUnspecified--R2X_6o(textStyle0.getLetterSpacing-XSAIIZE()) ? TextStyleKt.DefaultLetterSpacing : textStyle0.getLetterSpacing-XSAIIZE()), baselineShift1, textGeometricTransform0, localeList0, (textStyle0.getBackground-0d7_KjU() == 16L ? TextStyleKt.DefaultBackgroundColor : textStyle0.getBackground-0d7_KjU()), textDecoration0, (textStyle0.getShadow() == null ? Shadow.Companion.getNone() : textStyle0.getShadow()), textAlign1, textDirection0, (TextUnitKt.isUnspecified--R2X_6o(textStyle0.getLineHeight-XSAIIZE()) ? TextStyleKt.DefaultLineHeight : textStyle0.getLineHeight-XSAIIZE()), (textStyle0.getTextIndent() == null ? TextIndent.Companion.getNone() : textStyle0.getTextIndent()), null);
    }

    public static final int resolveTextDirection-Yj3eThk(LayoutDirection layoutDirection0, TextDirection textDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        if((textDirection0 == null ? false : TextDirection.equals-impl0(textDirection0.unbox-impl(), 3))) {
            switch(layoutDirection0) {
                case 1: {
                    return 4;
                }
                case 2: {
                    return 5;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        if(textDirection0 == null) {
            switch(layoutDirection0) {
                case 1: {
                    return 1;
                }
                case 2: {
                    return 2;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return textDirection0.unbox-impl();
    }
}

