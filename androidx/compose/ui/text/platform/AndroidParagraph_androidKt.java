package androidx.compose.ui.text.platform;

import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A(\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0000\u001Ah\u0010\u0000\u001A\u00020\u00012\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0012\u0010\u000E\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000F2\u0012\u0010\u0012\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u000F2\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u0017H\u0000\u001A\u001D\u0010\u0018\u001A\u00020\u00052\b\u0010\u0019\u001A\u0004\u0018\u00010\u001AH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\b\u001B\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"ActualParagraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "maxLines", "", "ellipsis", "", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "toLayoutAlign", "align", "Landroidx/compose/ui/text/style/TextAlign;", "toLayoutAlign-AMY3VfE", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidParagraph_androidKt {
    public static final Paragraph ActualParagraph(ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, float f) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics0, "paragraphIntrinsics");
        return new AndroidParagraph(((AndroidParagraphIntrinsics)paragraphIntrinsics0), v, z, f);
    }

    public static final Paragraph ActualParagraph(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        return new AndroidParagraph(new AndroidParagraphIntrinsics(s, textStyle0, list0, list1, new TypefaceAdapter(null, font$ResourceLoader0, 1, null), density0), v, z, f);
    }

    // 去混淆评级： 低(23)
    private static final int toLayoutAlign-AMY3VfE(TextAlign textAlign0) {
        if((textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 1))) {
            return 3;
        }
        if((textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 2))) {
            return 4;
        }
        if((textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 3))) {
            return 2;
        }
        if(!(textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 5))) {
            return (textAlign0 == null ? false : TextAlign.equals-impl0(textAlign0.unbox-impl(), 6)) ? 1 : 0;
        }
        return 0;
    }
}

