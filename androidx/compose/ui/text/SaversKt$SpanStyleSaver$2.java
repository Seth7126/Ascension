package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\n"}, d2 = {"", "it", "Landroidx/compose/ui/text/SpanStyle;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
final class SaversKt.SpanStyleSaver.2 extends Lambda implements Function1 {
    public static final SaversKt.SpanStyleSaver.2 INSTANCE;

    static {
        SaversKt.SpanStyleSaver.2.INSTANCE = new SaversKt.SpanStyleSaver.2();
    }

    SaversKt.SpanStyleSaver.2() {
        super(1);
    }

    public final SpanStyle invoke(Object object0) {
        TextDecoration textDecoration0;
        Color color1;
        LocaleList localeList0;
        TextGeometricTransform textGeometricTransform0;
        BaselineShift baselineShift0;
        TextUnit textUnit1;
        FontWeight fontWeight0;
        TextUnit textUnit0;
        Color color0;
        Intrinsics.checkNotNullParameter(object0, "it");
        Object object1 = ((List)object0).get(0);
        Saver saver0 = SaversKt.getSaver(Color.Companion);
        if(Intrinsics.areEqual(object1, Boolean.FALSE)) {
            color0 = null;
        }
        else if(object1 != null) {
            color0 = (Color)saver0.restore(object1);
        }
        else {
            color0 = null;
        }
        Intrinsics.checkNotNull(color0);
        long v = color0.unbox-impl();
        Object object2 = ((List)object0).get(1);
        Saver saver1 = SaversKt.getSaver(TextUnit.Companion);
        if(Intrinsics.areEqual(object2, Boolean.FALSE)) {
            textUnit0 = null;
        }
        else if(object2 != null) {
            textUnit0 = (TextUnit)saver1.restore(object2);
        }
        else {
            textUnit0 = null;
        }
        Intrinsics.checkNotNull(textUnit0);
        long v1 = textUnit0.unbox-impl();
        Object object3 = ((List)object0).get(2);
        Saver saver2 = SaversKt.getSaver(FontWeight.Companion);
        if(Intrinsics.areEqual(object3, Boolean.FALSE)) {
            fontWeight0 = null;
        }
        else {
            fontWeight0 = object3 == null ? null : ((FontWeight)saver2.restore(object3));
        }
        Object object4 = ((List)object0).get(3);
        FontStyle fontStyle0 = object4 == null ? null : ((FontStyle)object4);
        Object object5 = ((List)object0).get(4);
        FontSynthesis fontSynthesis0 = object5 == null ? null : ((FontSynthesis)object5);
        Object object6 = ((List)object0).get(6);
        String s = object6 == null ? null : ((String)object6);
        Object object7 = ((List)object0).get(7);
        Saver saver3 = SaversKt.getSaver(TextUnit.Companion);
        if(Intrinsics.areEqual(object7, Boolean.FALSE)) {
            textUnit1 = null;
        }
        else if(object7 != null) {
            textUnit1 = (TextUnit)saver3.restore(object7);
        }
        else {
            textUnit1 = null;
        }
        Intrinsics.checkNotNull(textUnit1);
        long v2 = textUnit1.unbox-impl();
        Object object8 = ((List)object0).get(8);
        Saver saver4 = SaversKt.getSaver(BaselineShift.Companion);
        if(Intrinsics.areEqual(object8, Boolean.FALSE)) {
            baselineShift0 = null;
        }
        else {
            baselineShift0 = object8 == null ? null : ((BaselineShift)saver4.restore(object8));
        }
        Object object9 = ((List)object0).get(9);
        Saver saver5 = SaversKt.getSaver(TextGeometricTransform.Companion);
        if(Intrinsics.areEqual(object9, Boolean.FALSE)) {
            textGeometricTransform0 = null;
        }
        else {
            textGeometricTransform0 = object9 == null ? null : ((TextGeometricTransform)saver5.restore(object9));
        }
        Object object10 = ((List)object0).get(10);
        Saver saver6 = SaversKt.getSaver(LocaleList.Companion);
        if(Intrinsics.areEqual(object10, Boolean.FALSE)) {
            localeList0 = null;
        }
        else {
            localeList0 = object10 == null ? null : ((LocaleList)saver6.restore(object10));
        }
        Object object11 = ((List)object0).get(11);
        Saver saver7 = SaversKt.getSaver(Color.Companion);
        if(Intrinsics.areEqual(object11, Boolean.FALSE)) {
            color1 = null;
        }
        else if(object11 != null) {
            color1 = (Color)saver7.restore(object11);
        }
        else {
            color1 = null;
        }
        Intrinsics.checkNotNull(color1);
        long v3 = color1.unbox-impl();
        Object object12 = ((List)object0).get(12);
        Saver saver8 = SaversKt.getSaver(TextDecoration.Companion);
        if(Intrinsics.areEqual(object12, Boolean.FALSE)) {
            textDecoration0 = null;
        }
        else {
            textDecoration0 = object12 == null ? null : ((TextDecoration)saver8.restore(object12));
        }
        Object object13 = ((List)object0).get(13);
        Saver saver9 = SaversKt.getSaver(Shadow.Companion);
        if(Intrinsics.areEqual(object13, Boolean.FALSE)) {
            return new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, null, 0x20, null);
        }
        return object13 == null ? new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, null, 0x20, null) : new SpanStyle(v, v1, fontWeight0, fontStyle0, fontSynthesis0, null, s, v2, baselineShift0, textGeometricTransform0, localeList0, v3, textDecoration0, ((Shadow)saver9.restore(object13)), 0x20, null);
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        return this.invoke(object0);
    }
}

