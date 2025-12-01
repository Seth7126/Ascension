package androidx.compose.ui.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u001D\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0005\u0012\b\b\u0002\u0010\b\u001A\u00020\u0005\u0012\b\b\u0002\u0010\t\u001A\u00020\n\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u00A2\u0006\u0002\u0010\fJ\t\u0010\u001F\u001A\u00020\u0003H\u00C6\u0003J\t\u0010 \u001A\u00020\u0005H\u00C6\u0003J\t\u0010!\u001A\u00020\u0005H\u00C6\u0003J\t\u0010\"\u001A\u00020\u0005H\u00C6\u0003J\t\u0010#\u001A\u00020\u0005H\u00C6\u0003J\t\u0010$\u001A\u00020\nH\u00C6\u0003J\t\u0010%\u001A\u00020\nH\u00C6\u0003JO\u0010&\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\nH\u00C6\u0001J\u0013\u0010\'\u001A\u00020(2\b\u0010)\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010*\u001A\u00020\u0005H\u00D6\u0001J\t\u0010+\u001A\u00020,H\u00D6\u0001J\n\u0010-\u001A\u00020.*\u00020.J\n\u0010-\u001A\u00020/*\u00020/J\u0017\u0010-\u001A\u000200*\u000200\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b1\u00102J\n\u00103\u001A\u00020\u0005*\u00020\u0005J\n\u00104\u001A\u00020\u0005*\u00020\u0005J\n\u00105\u001A\u00020\n*\u00020\nJ\u0017\u00106\u001A\u000207*\u000207\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b8\u00102J\n\u00109\u001A\u00020\u0005*\u00020\u0005J\n\u0010:\u001A\u00020\u0005*\u00020\u0005J\n\u0010;\u001A\u00020\n*\u00020\nR\u001A\u0010\u000B\u001A\u00020\nX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\b\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0012\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001A\u00020\u00058F\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u0012R\u001A\u0010\u0007\u001A\u00020\u0005X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u0012\"\u0004\b\u001C\u0010\u0015R\u001A\u0010\t\u001A\u00020\nX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001D\u0010\u000E\"\u0004\b\u001E\u0010\u0010\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006<"}, d2 = {"Landroidx/compose/ui/text/ParagraphInfo;", "", "paragraph", "Landroidx/compose/ui/text/Paragraph;", "startIndex", "", "endIndex", "startLineIndex", "endLineIndex", "top", "", "bottom", "(Landroidx/compose/ui/text/Paragraph;IIIIFF)V", "getBottom", "()F", "setBottom", "(F)V", "getEndIndex", "()I", "getEndLineIndex", "setEndLineIndex", "(I)V", "length", "getLength", "getParagraph", "()Landroidx/compose/ui/text/Paragraph;", "getStartIndex", "getStartLineIndex", "setStartLineIndex", "getTop", "setTop", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "toGlobal", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/text/TextRange;", "toGlobal-GEjPoXI", "(J)J", "toGlobalIndex", "toGlobalLineIndex", "toGlobalYPosition", "toLocal", "Landroidx/compose/ui/geometry/Offset;", "toLocal-MK-Hz9U", "toLocalIndex", "toLocalLineIndex", "toLocalYPosition", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ParagraphInfo {
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1) {
        Intrinsics.checkNotNullParameter(paragraph0, "paragraph");
        super();
        this.paragraph = paragraph0;
        this.startIndex = v;
        this.endIndex = v1;
        this.startLineIndex = v2;
        this.endLineIndex = v3;
        this.top = f;
        this.bottom = f1;
    }

    public ParagraphInfo(Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1, int v4, DefaultConstructorMarker defaultConstructorMarker0) {
        this(paragraph0, v, v1, ((v4 & 8) == 0 ? v2 : -1), ((v4 & 16) == 0 ? v3 : -1), ((v4 & 0x20) == 0 ? f : -1.0f), ((v4 & 0x40) == 0 ? f1 : -1.0f));
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1) {
        Intrinsics.checkNotNullParameter(paragraph0, "paragraph");
        return new ParagraphInfo(paragraph0, v, v1, v2, v3, f, f1);
    }

    public static ParagraphInfo copy$default(ParagraphInfo paragraphInfo0, Paragraph paragraph0, int v, int v1, int v2, int v3, float f, float f1, int v4, Object object0) {
        if((v4 & 1) != 0) {
            paragraph0 = paragraphInfo0.paragraph;
        }
        if((v4 & 2) != 0) {
            v = paragraphInfo0.startIndex;
        }
        if((v4 & 4) != 0) {
            v1 = paragraphInfo0.endIndex;
        }
        if((v4 & 8) != 0) {
            v2 = paragraphInfo0.startLineIndex;
        }
        if((v4 & 16) != 0) {
            v3 = paragraphInfo0.endLineIndex;
        }
        if((v4 & 0x20) != 0) {
            f = paragraphInfo0.top;
        }
        if((v4 & 0x40) != 0) {
            f1 = paragraphInfo0.bottom;
        }
        return paragraphInfo0.copy(paragraph0, v, v1, v2, v3, f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.paragraph, ((ParagraphInfo)object0).paragraph)) {
            return false;
        }
        if(this.startIndex != ((ParagraphInfo)object0).startIndex) {
            return false;
        }
        if(this.endIndex != ((ParagraphInfo)object0).endIndex) {
            return false;
        }
        if(this.startLineIndex != ((ParagraphInfo)object0).startLineIndex) {
            return false;
        }
        if(this.endLineIndex != ((ParagraphInfo)object0).endLineIndex) {
            return false;
        }
        return Intrinsics.areEqual(this.top, ((ParagraphInfo)object0).top) ? Intrinsics.areEqual(this.bottom, ((ParagraphInfo)object0).bottom) : false;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    @Override
    public int hashCode() {
        return (((((this.paragraph.hashCode() * 0x1F + this.startIndex) * 0x1F + this.endIndex) * 0x1F + this.startLineIndex) * 0x1F + this.endLineIndex) * 0x1F + Float.floatToIntBits(this.top)) * 0x1F + Float.floatToIntBits(this.bottom);
    }

    public final void setBottom(float f) {
        this.bottom = f;
    }

    public final void setEndLineIndex(int v) {
        this.endLineIndex = v;
    }

    public final void setStartLineIndex(int v) {
        this.startLineIndex = v;
    }

    public final void setTop(float f) {
        this.top = f;
    }

    public final Rect toGlobal(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "<this>");
        return rect0.translate-k-4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    public final Path toGlobal(Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        path0.translate-k-4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path0;
    }

    public final long toGlobal-GEjPoXI(long v) {
        return TextRangeKt.TextRange(this.toGlobalIndex(((int)(v >> 0x20))), this.toGlobalIndex(((int)(v & 0xFFFFFFFFL))));
    }

    public final int toGlobalIndex(int v) {
        return v + this.startIndex;
    }

    public final int toGlobalLineIndex(int v) {
        return v + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f) {
        return f + this.top;
    }

    public final long toLocal-MK-Hz9U(long v) {
        return OffsetKt.Offset(Offset.getX-impl(v), Offset.getY-impl(v) - this.top);
    }

    public final int toLocalIndex(int v) {
        return RangesKt.coerceIn(v, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toLocalLineIndex(int v) {
        return v - this.startLineIndex;
    }

    public final float toLocalYPosition(float f) {
        return f - this.top;
    }

    @Override
    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }
}

