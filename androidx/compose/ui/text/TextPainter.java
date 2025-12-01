package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas.DefaultImpls;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextPainter {
    public static final TextPainter INSTANCE;

    static {
        TextPainter.INSTANCE = new TextPainter();
    }

    public final void paint(Canvas canvas0, TextLayoutResult textLayoutResult0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(textLayoutResult0, "textLayoutResult");
        boolean z = textLayoutResult0.getHasVisualOverflow() && TextOverflow.equals-impl0(textLayoutResult0.getLayoutInput().getOverflow-gIe3tQ8(), 1);
        if(z) {
            Rect rect0 = RectKt.Rect-tz77jQw(0L, SizeKt.Size(((int)(textLayoutResult0.getSize-YbymL2g() >> 0x20)), ((int)(textLayoutResult0.getSize-YbymL2g() & 0xFFFFFFFFL))));
            canvas0.save();
            DefaultImpls.clipRect-mtrdD-E$default(canvas0, rect0, 0, 2, null);
        }
        try {
            textLayoutResult0.getMultiParagraph().paint-RPmYEkk(canvas0, textLayoutResult0.getLayoutInput().getStyle().getColor-0d7_KjU(), textLayoutResult0.getLayoutInput().getStyle().getShadow(), textLayoutResult0.getLayoutInput().getStyle().getTextDecoration());
        }
        catch(Throwable throwable0) {
            if(z) {
                canvas0.restore();
            }
            throw throwable0;
        }
        if(z) {
            canvas0.restore();
        }
    }
}

