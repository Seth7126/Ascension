package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0001H\n"}, d2 = {"Landroidx/compose/runtime/saveable/SaverScope;", "Landroidx/compose/ui/text/SpanStyle;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.SpanStyleSaver.1 extends Lambda implements Function2 {
    public static final SaversKt.SpanStyleSaver.1 INSTANCE;

    static {
        SaversKt.SpanStyleSaver.1.INSTANCE = new SaversKt.SpanStyleSaver.1();
    }

    SaversKt.SpanStyleSaver.1() {
        super(2);
    }

    public final Object invoke(SaverScope saverScope0, SpanStyle spanStyle0) {
        Intrinsics.checkNotNullParameter(saverScope0, "$this$Saver");
        Intrinsics.checkNotNullParameter(spanStyle0, "it");
        return CollectionsKt.arrayListOf(new Object[]{SaversKt.save(Color.box-impl(spanStyle0.getColor-0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope0), SaversKt.save(TextUnit.box-impl(spanStyle0.getFontSize-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope0), SaversKt.save(spanStyle0.getFontWeight(), SaversKt.getSaver(FontWeight.Companion), saverScope0), SaversKt.save(spanStyle0.getFontStyle-4Lr2A7w()), SaversKt.save(spanStyle0.getFontSynthesis-ZQGJjVo()), -1, SaversKt.save(spanStyle0.getFontFeatureSettings()), SaversKt.save(TextUnit.box-impl(spanStyle0.getLetterSpacing-XSAIIZE()), SaversKt.getSaver(TextUnit.Companion), saverScope0), SaversKt.save(spanStyle0.getBaselineShift-5SSeXJ0(), SaversKt.getSaver(BaselineShift.Companion), saverScope0), SaversKt.save(spanStyle0.getTextGeometricTransform(), SaversKt.getSaver(TextGeometricTransform.Companion), saverScope0), SaversKt.save(spanStyle0.getLocaleList(), SaversKt.getSaver(LocaleList.Companion), saverScope0), SaversKt.save(Color.box-impl(spanStyle0.getBackground-0d7_KjU()), SaversKt.getSaver(Color.Companion), saverScope0), SaversKt.save(spanStyle0.getTextDecoration(), SaversKt.getSaver(TextDecoration.Companion), saverScope0), SaversKt.save(spanStyle0.getShadow(), SaversKt.getSaver(Shadow.Companion), saverScope0)});
    }

    @Override  // kotlin.jvm.functions.Function2
    public Object invoke(Object object0, Object object1) {
        return this.invoke(((SaverScope)object0), ((SpanStyle)object1));
    }
}

