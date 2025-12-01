package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A3\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"createTextLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "multiParagraph", "Landroidx/compose/ui/text/MultiParagraph;", "size", "Landroidx/compose/ui/unit/IntSize;", "createTextLayoutResult-H0pRuoY", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;J)Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextLayoutResultKt {
    @Deprecated(message = "Unused public function which was added for testing. The function does not do anything usable for Compose text APIs. The function is now deprecated and will be removed soon")
    public static final TextLayoutResult createTextLayoutResult-H0pRuoY(TextLayoutInput textLayoutInput0, MultiParagraph multiParagraph0, long v) {
        Intrinsics.checkNotNullParameter(textLayoutInput0, "layoutInput");
        Intrinsics.checkNotNullParameter(multiParagraph0, "multiParagraph");
        return new TextLayoutResult(textLayoutInput0, multiParagraph0, v, null);
    }

    public static TextLayoutResult createTextLayoutResult-H0pRuoY$default(TextLayoutInput textLayoutInput0, MultiParagraph multiParagraph0, long v, int v1, Object object0) {
        TextLayoutInput textLayoutInput1;
        if((v1 & 1) == 0) {
            textLayoutInput1 = textLayoutInput0;
        }
        else {
            AnnotatedString annotatedString0 = new AnnotatedString("", null, null, 6, null);
            TextStyle textStyle0 = new TextStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, 0x3FFFF, null);
            List list0 = CollectionsKt.emptyList();
            Density density0 = DensityKt.Density$default(1.0f, 0.0f, 2, null);
            androidx.compose.ui.text.TextLayoutResultKt.createTextLayoutResult.1 textLayoutResultKt$createTextLayoutResult$10 = new ResourceLoader() {
                @Override  // androidx.compose.ui.text.font.Font$ResourceLoader
                public Object load(Font font0) {
                    Intrinsics.checkNotNullParameter(font0, "font");
                    return false;
                }
            };
            long v2 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
            textLayoutInput1 = new TextLayoutInput(annotatedString0, textStyle0, list0, 1, false, 1, density0, LayoutDirection.Ltr, textLayoutResultKt$createTextLayoutResult$10, v2, null);
        }
        MultiParagraph multiParagraph1 = (v1 & 2) == 0 ? multiParagraph0 : new MultiParagraph(textLayoutInput1.getText(), textLayoutInput1.getStyle(), null, 0, false, 0.0f, textLayoutInput1.getDensity(), textLayoutInput1.getResourceLoader(), 28, null);
        return (v1 & 4) == 0 ? TextLayoutResultKt.createTextLayoutResult-H0pRuoY(textLayoutInput1, multiParagraph1, v) : TextLayoutResultKt.createTextLayoutResult-H0pRuoY(textLayoutInput1, multiParagraph1, 0L);
    }
}

