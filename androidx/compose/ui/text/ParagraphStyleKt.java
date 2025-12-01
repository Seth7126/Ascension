package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001A \u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"lerp", "Landroidx/compose/ui/text/ParagraphStyle;", "start", "stop", "fraction", "", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ParagraphStyleKt {
    public static final ParagraphStyle lerp(ParagraphStyle paragraphStyle0, ParagraphStyle paragraphStyle1, float f) {
        Intrinsics.checkNotNullParameter(paragraphStyle0, "start");
        Intrinsics.checkNotNullParameter(paragraphStyle1, "stop");
        return new ParagraphStyle(((TextAlign)SpanStyleKt.lerpDiscrete(paragraphStyle0.getTextAlign-buA522U(), paragraphStyle1.getTextAlign-buA522U(), f)), ((TextDirection)SpanStyleKt.lerpDiscrete(paragraphStyle0.getTextDirection-mmuk1to(), paragraphStyle1.getTextDirection-mmuk1to(), f)), SpanStyleKt.lerpTextUnitInheritable-C3pnCVY(paragraphStyle0.getLineHeight-XSAIIZE(), paragraphStyle1.getLineHeight-XSAIIZE(), f), TextIndentKt.lerp((paragraphStyle0.getTextIndent() == null ? new TextIndent(0L, 0L, 3, null) : paragraphStyle0.getTextIndent()), (paragraphStyle1.getTextIndent() == null ? new TextIndent(0L, 0L, 3, null) : paragraphStyle1.getTextIndent()), f), null);
    }
}

