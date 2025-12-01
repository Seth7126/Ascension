package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.platform.AndroidParagraph_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A*\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n\u001An\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000E2\u0014\b\u0002\u0010\u000F\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0014\b\u0002\u0010\u0013\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00110\u00102\b\b\u0002\u0010\u0006\u001A\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0018\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"DefaultMaxLines", "", "Paragraph", "Landroidx/compose/ui/text/Paragraph;", "paragraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "maxLines", "ellipsis", "", "width", "", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ParagraphKt {
    public static final int DefaultMaxLines = 0x7FFFFFFF;

    public static final Paragraph Paragraph(ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, float f) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics0, "paragraphIntrinsics");
        return AndroidParagraph_androidKt.ActualParagraph(paragraphIntrinsics0, v, z, f);
    }

    public static final Paragraph Paragraph(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        return AndroidParagraph_androidKt.ActualParagraph(s, textStyle0, list0, list1, v, z, f, density0, font$ResourceLoader0);
    }

    public static Paragraph Paragraph$default(ParagraphIntrinsics paragraphIntrinsics0, int v, boolean z, float f, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = 0x7FFFFFFF;
        }
        if((v1 & 4) != 0) {
            z = false;
        }
        return ParagraphKt.Paragraph(paragraphIntrinsics0, v, z, f);
    }

    public static Paragraph Paragraph$default(String s, TextStyle textStyle0, List list0, List list1, int v, boolean z, float f, Density density0, ResourceLoader font$ResourceLoader0, int v1, Object object0) {
        List list2 = (v1 & 4) == 0 ? list0 : CollectionsKt.emptyList();
        List list3 = (v1 & 8) == 0 ? list1 : CollectionsKt.emptyList();
        int v2 = (v1 & 16) == 0 ? v : 0x7FFFFFFF;
        return (v1 & 0x20) == 0 ? ParagraphKt.Paragraph(s, textStyle0, list2, list3, v2, z, f, density0, font$ResourceLoader0) : ParagraphKt.Paragraph(s, textStyle0, list2, list3, v2, false, f, density0, font$ResourceLoader0);
    }
}

