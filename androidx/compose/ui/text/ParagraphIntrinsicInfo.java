package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001A\u00020\u0003HÆ\u0003J\t\u0010\u000E\u001A\u00020\u0005HÆ\u0003J\t\u0010\u000F\u001A\u00020\u0005HÆ\u0003J\'\u0010\u0010\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001A\u00020\u00122\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001A\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001A\u00020\u0016HÖ\u0001R\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/ParagraphIntrinsicInfo;", "", "intrinsics", "Landroidx/compose/ui/text/ParagraphIntrinsics;", "startIndex", "", "endIndex", "(Landroidx/compose/ui/text/ParagraphIntrinsics;II)V", "getEndIndex", "()I", "getIntrinsics", "()Landroidx/compose/ui/text/ParagraphIntrinsics;", "getStartIndex", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ParagraphIntrinsicInfo {
    private final int endIndex;
    private final ParagraphIntrinsics intrinsics;
    private final int startIndex;

    public ParagraphIntrinsicInfo(ParagraphIntrinsics paragraphIntrinsics0, int v, int v1) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics0, "intrinsics");
        super();
        this.intrinsics = paragraphIntrinsics0;
        this.startIndex = v;
        this.endIndex = v1;
    }

    public final ParagraphIntrinsics component1() {
        return this.intrinsics;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final ParagraphIntrinsicInfo copy(ParagraphIntrinsics paragraphIntrinsics0, int v, int v1) {
        Intrinsics.checkNotNullParameter(paragraphIntrinsics0, "intrinsics");
        return new ParagraphIntrinsicInfo(paragraphIntrinsics0, v, v1);
    }

    public static ParagraphIntrinsicInfo copy$default(ParagraphIntrinsicInfo paragraphIntrinsicInfo0, ParagraphIntrinsics paragraphIntrinsics0, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            paragraphIntrinsics0 = paragraphIntrinsicInfo0.intrinsics;
        }
        if((v2 & 2) != 0) {
            v = paragraphIntrinsicInfo0.startIndex;
        }
        if((v2 & 4) != 0) {
            v1 = paragraphIntrinsicInfo0.endIndex;
        }
        return paragraphIntrinsicInfo0.copy(paragraphIntrinsics0, v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphIntrinsicInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.intrinsics, ((ParagraphIntrinsicInfo)object0).intrinsics)) {
            return false;
        }
        return this.startIndex == ((ParagraphIntrinsicInfo)object0).startIndex ? this.endIndex == ((ParagraphIntrinsicInfo)object0).endIndex : false;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final ParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    @Override
    public int hashCode() {
        return (this.intrinsics.hashCode() * 0x1F + this.startIndex) * 0x1F + this.endIndex;
    }

    @Override
    public String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.intrinsics + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ')';
    }
}

