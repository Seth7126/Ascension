package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\bJ\'\u0010\'\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b(\u0010)J\u0013\u0010*\u001A\u00020\n2\b\u0010+\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\u000E\u0010,\u001A\u00020-2\u0006\u0010.\u001A\u00020\u001AJ\u000E\u0010/\u001A\u00020!2\u0006\u0010.\u001A\u00020\u001AJ\u000E\u00100\u001A\u00020!2\u0006\u0010.\u001A\u00020\u001AJ\u0016\u00101\u001A\u00020\u00102\u0006\u0010.\u001A\u00020\u001A2\u0006\u00102\u001A\u00020\nJ\u000E\u00103\u001A\u00020\u00102\u0006\u00104\u001A\u00020\u001AJ\u0018\u00105\u001A\u00020\u001A2\u0006\u00104\u001A\u00020\u001A2\b\b\u0002\u00106\u001A\u00020\nJ\u000E\u00107\u001A\u00020\u001A2\u0006\u0010.\u001A\u00020\u001AJ\u000E\u00108\u001A\u00020\u001A2\u0006\u00109\u001A\u00020\u0010J\u000E\u0010:\u001A\u00020\u00102\u0006\u00104\u001A\u00020\u001AJ\u000E\u0010;\u001A\u00020\u00102\u0006\u00104\u001A\u00020\u001AJ\u000E\u0010<\u001A\u00020\u001A2\u0006\u00104\u001A\u00020\u001AJ\u000E\u0010=\u001A\u00020\u00102\u0006\u00104\u001A\u00020\u001AJ\u001B\u0010>\u001A\u00020\u001A2\u0006\u0010?\u001A\u00020@\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bA\u0010BJ\u000E\u0010C\u001A\u00020-2\u0006\u0010.\u001A\u00020\u001AJ\u0016\u0010D\u001A\u00020E2\u0006\u0010F\u001A\u00020\u001A2\u0006\u0010G\u001A\u00020\u001AJ\u001E\u0010H\u001A\u00020I2\u0006\u0010.\u001A\u00020\u001A\u00F8\u0001\u0000\u00F8\u0001\u0002\u00F8\u0001\u0001\u00A2\u0006\u0004\bJ\u0010KJ\b\u0010L\u001A\u00020\u001AH\u0016J\u000E\u0010M\u001A\u00020\n2\u0006\u00104\u001A\u00020\u001AJ\b\u0010N\u001A\u00020OH\u0016R\u0011\u0010\t\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\r\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u000F\u001A\u00020\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001A\u00020\n8F\u00A2\u0006\u0006\u001A\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001A\u00020\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001A\u00020\u001A8F\u00A2\u0006\u0006\u001A\u0004\b\u001B\u0010\u001CR\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u001ER\u0019\u0010\u001F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010!0 \u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010#R\u001C\u0010\u0006\u001A\u00020\u0007\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010&\u001A\u0004\b$\u0010%\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006P"}, d2 = {"Landroidx/compose/ui/text/TextLayoutResult;", "", "layoutInput", "Landroidx/compose/ui/text/TextLayoutInput;", "multiParagraph", "Landroidx/compose/ui/text/MultiParagraph;", "size", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/text/TextLayoutInput;Landroidx/compose/ui/text/MultiParagraph;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "didOverflowHeight", "", "getDidOverflowHeight", "()Z", "didOverflowWidth", "getDidOverflowWidth", "firstBaseline", "", "getFirstBaseline", "()F", "hasVisualOverflow", "getHasVisualOverflow", "lastBaseline", "getLastBaseline", "getLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;", "lineCount", "", "getLineCount", "()I", "getMultiParagraph", "()Landroidx/compose/ui/text/MultiParagraph;", "placeholderRects", "", "Landroidx/compose/ui/geometry/Rect;", "getPlaceholderRects", "()Ljava/util/List;", "getSize-YbymL2g", "()J", "J", "copy", "copy-O0kMr_c", "(Landroidx/compose/ui/text/TextLayoutInput;J)Landroidx/compose/ui/text/TextLayoutResult;", "equals", "other", "getBidiRunDirection", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "offset", "getBoundingBox", "getCursorRect", "getHorizontalPosition", "usePrimaryDirection", "getLineBottom", "lineIndex", "getLineEnd", "visibleEnd", "getLineForOffset", "getLineForVerticalPosition", "vertical", "getLineLeft", "getLineRight", "getLineStart", "getLineTop", "getOffsetForPosition", "position", "Landroidx/compose/ui/geometry/Offset;", "getOffsetForPosition-k-4lQ0M", "(J)I", "getParagraphDirection", "getPathForRange", "Landroidx/compose/ui/graphics/Path;", "start", "end", "getWordBoundary", "Landroidx/compose/ui/text/TextRange;", "getWordBoundary--jx7JFs", "(I)J", "hashCode", "isLineEllipsized", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextLayoutResult {
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List placeholderRects;
    private final long size;

    private TextLayoutResult(TextLayoutInput textLayoutInput0, MultiParagraph multiParagraph0, long v) {
        this.layoutInput = textLayoutInput0;
        this.multiParagraph = multiParagraph0;
        this.size = v;
        this.firstBaseline = multiParagraph0.getFirstBaseline();
        this.lastBaseline = multiParagraph0.getLastBaseline();
        this.placeholderRects = multiParagraph0.getPlaceholderRects();
    }

    public TextLayoutResult(TextLayoutInput textLayoutInput0, MultiParagraph multiParagraph0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(textLayoutInput0, multiParagraph0, v);
    }

    public final TextLayoutResult copy-O0kMr_c(TextLayoutInput textLayoutInput0, long v) {
        Intrinsics.checkNotNullParameter(textLayoutInput0, "layoutInput");
        return new TextLayoutResult(textLayoutInput0, this.multiParagraph, v, null);
    }

    public static TextLayoutResult copy-O0kMr_c$default(TextLayoutResult textLayoutResult0, TextLayoutInput textLayoutInput0, long v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textLayoutInput0 = textLayoutResult0.layoutInput;
        }
        if((v1 & 2) != 0) {
            v = textLayoutResult0.getSize-YbymL2g();
        }
        return textLayoutResult0.copy-O0kMr_c(textLayoutInput0, v);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextLayoutResult)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.layoutInput, ((TextLayoutResult)object0).layoutInput)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.multiParagraph, ((TextLayoutResult)object0).multiParagraph)) {
            return false;
        }
        if(!IntSize.equals-impl0(this.getSize-YbymL2g(), ((TextLayoutResult)object0).getSize-YbymL2g())) {
            return false;
        }
        if(this.firstBaseline != ((TextLayoutResult)object0).firstBaseline) {
            return false;
        }
        return this.lastBaseline == ((TextLayoutResult)object0).lastBaseline ? Intrinsics.areEqual(this.placeholderRects, ((TextLayoutResult)object0).placeholderRects) : false;
    }

    public final ResolvedTextDirection getBidiRunDirection(int v) {
        return this.multiParagraph.getBidiRunDirection(v);
    }

    public final Rect getBoundingBox(int v) {
        return this.multiParagraph.getBoundingBox(v);
    }

    public final Rect getCursorRect(int v) {
        return this.multiParagraph.getCursorRect(v);
    }

    public final boolean getDidOverflowHeight() {
        return this.multiParagraph.getDidExceedMaxLines() || ((float)(((int)(this.getSize-YbymL2g() & 0xFFFFFFFFL)))) < this.multiParagraph.getHeight();
    }

    public final boolean getDidOverflowWidth() {
        return ((float)(((int)(this.getSize-YbymL2g() >> 0x20)))) < this.multiParagraph.getWidth();
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    // 去混淆评级： 低(20)
    public final boolean getHasVisualOverflow() {
        return this.getDidOverflowWidth() || this.getDidOverflowHeight();
    }

    public final float getHorizontalPosition(int v, boolean z) {
        return this.multiParagraph.getHorizontalPosition(v, z);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBottom(int v) {
        return this.multiParagraph.getLineBottom(v);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int v, boolean z) {
        return this.multiParagraph.getLineEnd(v, z);
    }

    public static int getLineEnd$default(TextLayoutResult textLayoutResult0, int v, boolean z, int v1, Object object0) {
        if((v1 & 2) != 0) {
            z = false;
        }
        return textLayoutResult0.getLineEnd(v, z);
    }

    public final int getLineForOffset(int v) {
        return this.multiParagraph.getLineForOffset(v);
    }

    public final int getLineForVerticalPosition(float f) {
        return this.multiParagraph.getLineForVerticalPosition(f);
    }

    public final float getLineLeft(int v) {
        return this.multiParagraph.getLineLeft(v);
    }

    public final float getLineRight(int v) {
        return this.multiParagraph.getLineRight(v);
    }

    public final int getLineStart(int v) {
        return this.multiParagraph.getLineStart(v);
    }

    public final float getLineTop(int v) {
        return this.multiParagraph.getLineTop(v);
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    public final int getOffsetForPosition-k-4lQ0M(long v) {
        return this.multiParagraph.getOffsetForPosition-k-4lQ0M(v);
    }

    public final ResolvedTextDirection getParagraphDirection(int v) {
        return this.multiParagraph.getParagraphDirection(v);
    }

    public final Path getPathForRange(int v, int v1) {
        return this.multiParagraph.getPathForRange(v, v1);
    }

    public final List getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final long getSize-YbymL2g() {
        return this.size;
    }

    public final long getWordBoundary--jx7JFs(int v) {
        return this.multiParagraph.getWordBoundary--jx7JFs(v);
    }

    @Override
    public int hashCode() {
        return ((((this.layoutInput.hashCode() * 0x1F + this.multiParagraph.hashCode()) * 0x1F + IntSize.hashCode-impl(this.getSize-YbymL2g())) * 0x1F + Float.floatToIntBits(this.firstBaseline)) * 0x1F + Float.floatToIntBits(this.lastBaseline)) * 0x1F + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int v) {
        return this.multiParagraph.isLineEllipsized(v);
    }

    @Override
    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + IntSize.toString-impl(this.getSize-YbymL2g()) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }
}

