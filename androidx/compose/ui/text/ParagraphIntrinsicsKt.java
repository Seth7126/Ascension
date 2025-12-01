package androidx.compose.ui.text;

import androidx.compose.ui.text.font.Font.ResourceLoader;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics_androidKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001AR\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0014\b\u0002\u0010\n\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000B0\b0\u00072\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000F¨\u0006\u0010"}, d2 = {"ParagraphIntrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "text", "", "style", "Landroidx/compose/ui/text/TextStyle;", "spanStyles", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/SpanStyle;", "placeholders", "Landroidx/compose/ui/text/Placeholder;", "density", "Landroidx/compose/ui/unit/Density;", "resourceLoader", "Landroidx/compose/ui/text/font/Font$ResourceLoader;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ParagraphIntrinsicsKt {
    public static final ParagraphIntrinsics ParagraphIntrinsics(String s, TextStyle textStyle0, List list0, List list1, Density density0, ResourceLoader font$ResourceLoader0) {
        Intrinsics.checkNotNullParameter(s, "text");
        Intrinsics.checkNotNullParameter(textStyle0, "style");
        Intrinsics.checkNotNullParameter(list0, "spanStyles");
        Intrinsics.checkNotNullParameter(list1, "placeholders");
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(font$ResourceLoader0, "resourceLoader");
        return AndroidParagraphIntrinsics_androidKt.ActualParagraphIntrinsics(s, textStyle0, list0, list1, density0, font$ResourceLoader0);
    }

    public static ParagraphIntrinsics ParagraphIntrinsics$default(String s, TextStyle textStyle0, List list0, List list1, Density density0, ResourceLoader font$ResourceLoader0, int v, Object object0) {
        if((v & 4) != 0) {
            list0 = CollectionsKt.emptyList();
        }
        if((v & 8) != 0) {
            list1 = CollectionsKt.emptyList();
        }
        return ParagraphIntrinsicsKt.ParagraphIntrinsics(s, textStyle0, list0, list1, density0, font$ResourceLoader0);
    }
}

