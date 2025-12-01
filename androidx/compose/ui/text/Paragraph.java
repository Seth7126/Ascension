package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u001D\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u000FH&J\u0010\u0010 \u001A\u00020\u00182\u0006\u0010\u001F\u001A\u00020\u000FH&J\u0010\u0010!\u001A\u00020\u00182\u0006\u0010\u001F\u001A\u00020\u000FH&J\u0018\u0010\"\u001A\u00020\u00072\u0006\u0010\u001F\u001A\u00020\u000F2\u0006\u0010#\u001A\u00020\u0003H&J\u0010\u0010$\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u000FH&J\u001A\u0010&\u001A\u00020\u000F2\u0006\u0010%\u001A\u00020\u000F2\b\b\u0002\u0010\'\u001A\u00020\u0003H&J\u0010\u0010(\u001A\u00020\u000F2\u0006\u0010\u001F\u001A\u00020\u000FH&J\u0010\u0010)\u001A\u00020\u000F2\u0006\u0010*\u001A\u00020\u0007H&J\u0010\u0010+\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u000FH&J\u0010\u0010,\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u000FH&J\u0010\u0010-\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u000FH&J\u0010\u0010.\u001A\u00020\u000F2\u0006\u0010%\u001A\u00020\u000FH&J\u0010\u0010/\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u000FH&J\u0010\u00100\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u000FH&J\u001D\u00101\u001A\u00020\u000F2\u0006\u00102\u001A\u000203H&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b4\u00105J\u0010\u00106\u001A\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u000FH&J\u0018\u00107\u001A\u0002082\u0006\u00109\u001A\u00020\u000F2\u0006\u0010:\u001A\u00020\u000FH&J \u0010;\u001A\u00020<2\u0006\u0010\u001F\u001A\u00020\u000FH&\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\b=\u0010>J\u0010\u0010?\u001A\u00020\u00032\u0006\u0010%\u001A\u00020\u000FH&J?\u0010@\u001A\u00020A2\u0006\u0010B\u001A\u00020C2\b\b\u0002\u0010D\u001A\u00020E2\n\b\u0002\u0010F\u001A\u0004\u0018\u00010G2\n\b\u0002\u0010H\u001A\u0004\u0018\u00010IH&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bJ\u0010KR\u0012\u0010\u0002\u001A\u00020\u0003X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\tR\u0012\u0010\f\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\r\u0010\tR\u0012\u0010\u000E\u001A\u00020\u000FX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0013\u0010\tR\u0012\u0010\u0014\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0015\u0010\tR\u001A\u0010\u0016\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0019\u0010\u001AR\u0012\u0010\u001B\u001A\u00020\u0007X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\t\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/text/Paragraph;", "", "didExceedMaxLines", "", "getDidExceedMaxLines", "()Z", "firstBaseline", "", "getFirstBaseline", "()F", "height", "getHeight", "lastBaseline", "getLastBaseline", "lineCount", "", "getLineCount", "()I", "maxIntrinsicWidth", "getMaxIntrinsicWidth", "minIntrinsicWidth", "getMinIntrinsicWidth", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "width", "getWidth", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineHeight", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getLineWidth", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "isLineEllipsized", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "color", "Landroidx/compose/ui/graphics/Color;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "paint-RPmYEkk", "(Landroidx/compose/ui/graphics/Canvas;JLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;)V", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Paragraph {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static int getLineEnd$default(Paragraph paragraph0, int v, boolean z, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLineEnd");
            }
            if((v1 & 2) != 0) {
                z = false;
            }
            return paragraph0.getLineEnd(v, z);
        }

        public static void paint-RPmYEkk$default(Paragraph paragraph0, Canvas canvas0, long v, Shadow shadow0, TextDecoration textDecoration0, int v1, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: paint-RPmYEkk");
            }
            if((v1 & 2) != 0) {
                v = 16L;
            }
            paragraph0.paint-RPmYEkk(canvas0, v, ((v1 & 4) == 0 ? shadow0 : null), ((v1 & 8) == 0 ? textDecoration0 : null));
        }
    }

    ResolvedTextDirection getBidiRunDirection(int arg1);

    Rect getBoundingBox(int arg1);

    Rect getCursorRect(int arg1);

    boolean getDidExceedMaxLines();

    float getFirstBaseline();

    float getHeight();

    float getHorizontalPosition(int arg1, boolean arg2);

    float getLastBaseline();

    float getLineBottom(int arg1);

    int getLineCount();

    int getLineEnd(int arg1, boolean arg2);

    int getLineForOffset(int arg1);

    int getLineForVerticalPosition(float arg1);

    float getLineHeight(int arg1);

    float getLineLeft(int arg1);

    float getLineRight(int arg1);

    int getLineStart(int arg1);

    float getLineTop(int arg1);

    float getLineWidth(int arg1);

    float getMaxIntrinsicWidth();

    float getMinIntrinsicWidth();

    int getOffsetForPosition-k-4lQ0M(long arg1);

    ResolvedTextDirection getParagraphDirection(int arg1);

    Path getPathForRange(int arg1, int arg2);

    List getPlaceholderRects();

    float getWidth();

    long getWordBoundary--jx7JFs(int arg1);

    boolean isLineEllipsized(int arg1);

    void paint-RPmYEkk(Canvas arg1, long arg2, Shadow arg3, TextDecoration arg4);
}

