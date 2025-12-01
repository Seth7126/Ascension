package androidx.compose.ui.text;

import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u001E\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005\u001A+\u0010\u0006\u001A\u0002H\u0007\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001A\u0002H\u00072\u0006\u0010\t\u001A\u0002H\u00072\u0006\u0010\u0004\u001A\u00020\u0005H\u0000¢\u0006\u0002\u0010\n\u001A-\u0010\u000B\u001A\u00020\f2\u0006\u0010\b\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u0005H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000F\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"lerp", "Landroidx/compose/ui/text/SpanStyle;", "start", "stop", "fraction", "", "lerpDiscrete", "T", "a", "b", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "lerpTextUnitInheritable", "Landroidx/compose/ui/unit/TextUnit;", "t", "lerpTextUnitInheritable-C3pnCVY", "(JJF)J", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SpanStyleKt {
    public static final SpanStyle lerp(SpanStyle spanStyle0, SpanStyle spanStyle1, float f) {
        Intrinsics.checkNotNullParameter(spanStyle0, "start");
        Intrinsics.checkNotNullParameter(spanStyle1, "stop");
        long v = ColorKt.lerp-jxsXWHM(spanStyle0.getColor-0d7_KjU(), spanStyle1.getColor-0d7_KjU(), f);
        long v1 = SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(spanStyle0.getFontSize-XSAIIZE(), spanStyle1.getFontSize-XSAIIZE(), f);
        FontWeight fontWeight0 = FontWeightKt.lerp((spanStyle0.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle0.getFontWeight()), (spanStyle1.getFontWeight() == null ? FontWeight.Companion.getNormal() : spanStyle1.getFontWeight()), f);
        long v2 = SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(spanStyle0.getLetterSpacing-XSAIIZE(), spanStyle1.getLetterSpacing-XSAIIZE(), f);
        BaselineShift baselineShift0 = spanStyle0.getBaselineShift-5SSeXJ0();
        BaselineShift baselineShift1 = spanStyle1.getBaselineShift-5SSeXJ0();
        TextGeometricTransform textGeometricTransform0 = TextGeometricTransformKt.lerp((spanStyle0.getTextGeometricTransform() == null ? TextGeometricTransform.Companion.getNone$ui_text_release() : spanStyle0.getTextGeometricTransform()), (spanStyle1.getTextGeometricTransform() == null ? TextGeometricTransform.Companion.getNone$ui_text_release() : spanStyle1.getTextGeometricTransform()), f);
        long v3 = ColorKt.lerp-jxsXWHM(spanStyle0.getBackground-0d7_KjU(), spanStyle1.getBackground-0d7_KjU(), f);
        Shadow shadow0 = ShadowKt.lerp((spanStyle0.getShadow() == null ? new Shadow(0L, 0L, 0.0f, 7, null) : spanStyle0.getShadow()), (spanStyle1.getShadow() == null ? new Shadow(0L, 0L, 0.0f, 7, null) : spanStyle1.getShadow()), f);
        return new SpanStyle(v, v1, fontWeight0, ((FontStyle)SpanStyleKt.lerpDiscrete(spanStyle0.getFontStyle-4Lr2A7w(), spanStyle1.getFontStyle-4Lr2A7w(), f)), ((FontSynthesis)SpanStyleKt.lerpDiscrete(spanStyle0.getFontSynthesis-ZQGJjVo(), spanStyle1.getFontSynthesis-ZQGJjVo(), f)), ((FontFamily)SpanStyleKt.lerpDiscrete(spanStyle0.getFontFamily(), spanStyle1.getFontFamily(), f)), ((String)SpanStyleKt.lerpDiscrete(spanStyle0.getFontFeatureSettings(), spanStyle1.getFontFeatureSettings(), f)), v2, BaselineShift.box-impl(BaselineShiftKt.lerp-jWV1Mfo((baselineShift0 == null ? 0.0f : baselineShift0.unbox-impl()), (baselineShift1 == null ? 0.0f : baselineShift1.unbox-impl()), f)), textGeometricTransform0, ((LocaleList)SpanStyleKt.lerpDiscrete(spanStyle0.getLocaleList(), spanStyle1.getLocaleList(), f)), v3, ((TextDecoration)SpanStyleKt.lerpDiscrete(spanStyle0.getTextDecoration(), spanStyle1.getTextDecoration(), f)), shadow0, null);
    }

    public static final Object lerpDiscrete(Object object0, Object object1, float f) {
        return ((double)f) < 0.5 ? object0 : object1;
    }

    // 去混淆评级： 低(20)
    public static final long lerpTextUnitInheritable-C3pnCVY(long v, long v1, float f) {
        return TextUnitKt.isUnspecified--R2X_6o(v) || TextUnitKt.isUnspecified--R2X_6o(v1) ? ((TextUnit)SpanStyleKt.lerpDiscrete(TextUnit.box-impl(v), TextUnit.box-impl(v1), f)).unbox-impl() : TextUnitKt.lerp-C3pnCVY(v, v1, f);
    }
}

