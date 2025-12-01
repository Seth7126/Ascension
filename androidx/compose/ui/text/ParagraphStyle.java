package androidx.compose.ui.text;

import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000E\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B6\u0012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007\u0012\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tø\u0001\u0000¢\u0006\u0002\u0010\nJA\u0010\u0014\u001A\u00020\u00002\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\n\b\u0002\u0010\b\u001A\u0004\u0018\u00010\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001A\u001A\u00020\u001BH\u0016J\u0014\u0010\u001C\u001A\u00020\u00002\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u0000H\u0007J\u0011\u0010\u001D\u001A\u00020\u00002\u0006\u0010\u0019\u001A\u00020\u0000H\u0087\u0002J\b\u0010\u001E\u001A\u00020\u001FH\u0016R\u001C\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\r\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\u0002\u001A\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001A\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/ParagraphStyle;", "", "textAlign", "Landroidx/compose/ui/text/style/TextAlign;", "textDirection", "Landroidx/compose/ui/text/style/TextDirection;", "lineHeight", "Landroidx/compose/ui/unit/TextUnit;", "textIndent", "Landroidx/compose/ui/text/style/TextIndent;", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLineHeight-XSAIIZE", "()J", "J", "getTextAlign-buA522U", "()Landroidx/compose/ui/text/style/TextAlign;", "getTextDirection-mmuk1to", "()Landroidx/compose/ui/text/style/TextDirection;", "getTextIndent", "()Landroidx/compose/ui/text/style/TextIndent;", "copy", "copy-Elsmlbk", "(Landroidx/compose/ui/text/style/TextAlign;Landroidx/compose/ui/text/style/TextDirection;JLandroidx/compose/ui/text/style/TextIndent;)Landroidx/compose/ui/text/ParagraphStyle;", "equals", "", "other", "hashCode", "", "merge", "plus", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ParagraphStyle {
    private final long lineHeight;
    private final TextAlign textAlign;
    private final TextDirection textDirection;
    private final TextIndent textIndent;

    private ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0) {
        this.textAlign = textAlign0;
        this.textDirection = textDirection0;
        this.lineHeight = v;
        this.textIndent = textIndent0;
        if(!TextUnit.equals-impl0(this.getLineHeight-XSAIIZE(), 0x7FC00000L) && TextUnit.getValue-impl(this.getLineHeight-XSAIIZE()) < 0.0f) {
            throw new IllegalStateException(("lineHeight can\'t be negative (" + TextUnit.getValue-impl(this.getLineHeight-XSAIIZE()) + ')').toString());
        }
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            v = 0x7FC00000L;
        }
        this(((v1 & 1) == 0 ? textAlign0 : null), ((v1 & 2) == 0 ? textDirection0 : null), v, ((v1 & 8) == 0 ? textIndent0 : null), null);
    }

    public ParagraphStyle(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(textAlign0, textDirection0, v, textIndent0);
    }

    public final ParagraphStyle copy-Elsmlbk(TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0) {
        return new ParagraphStyle(textAlign0, textDirection0, v, textIndent0, null);
    }

    public static ParagraphStyle copy-Elsmlbk$default(ParagraphStyle paragraphStyle0, TextAlign textAlign0, TextDirection textDirection0, long v, TextIndent textIndent0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            textAlign0 = paragraphStyle0.getTextAlign-buA522U();
        }
        if((v1 & 2) != 0) {
            textDirection0 = paragraphStyle0.getTextDirection-mmuk1to();
        }
        if((v1 & 4) != 0) {
            v = paragraphStyle0.getLineHeight-XSAIIZE();
        }
        if((v1 & 8) != 0) {
            textIndent0 = paragraphStyle0.textIndent;
        }
        return paragraphStyle0.copy-Elsmlbk(textAlign0, textDirection0, v, textIndent0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ParagraphStyle)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTextAlign-buA522U(), ((ParagraphStyle)object0).getTextAlign-buA522U())) {
            return false;
        }
        if(!Intrinsics.areEqual(this.getTextDirection-mmuk1to(), ((ParagraphStyle)object0).getTextDirection-mmuk1to())) {
            return false;
        }
        return TextUnit.equals-impl0(this.getLineHeight-XSAIIZE(), ((ParagraphStyle)object0).getLineHeight-XSAIIZE()) ? Intrinsics.areEqual(this.textIndent, ((ParagraphStyle)object0).textIndent) : false;
    }

    public final long getLineHeight-XSAIIZE() {
        return this.lineHeight;
    }

    public final TextAlign getTextAlign-buA522U() {
        return this.textAlign;
    }

    public final TextDirection getTextDirection-mmuk1to() {
        return this.textDirection;
    }

    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    @Override
    public int hashCode() {
        TextAlign textAlign0 = this.getTextAlign-buA522U();
        int v = 0;
        int v1 = textAlign0 == null ? 0 : TextAlign.hashCode-impl(textAlign0.unbox-impl());
        TextDirection textDirection0 = this.getTextDirection-mmuk1to();
        int v2 = textDirection0 == null ? 0 : TextDirection.hashCode-impl(textDirection0.unbox-impl());
        int v3 = TextUnit.hashCode-impl(this.getLineHeight-XSAIIZE());
        TextIndent textIndent0 = this.textIndent;
        if(textIndent0 != null) {
            v = textIndent0.hashCode();
        }
        return ((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v;
    }

    // 去混淆评级： 中等(60)
    public final ParagraphStyle merge(ParagraphStyle paragraphStyle0) {
        return paragraphStyle0 == null ? this : new ParagraphStyle((paragraphStyle0.getTextAlign-buA522U() == null ? this.getTextAlign-buA522U() : paragraphStyle0.getTextAlign-buA522U()), (paragraphStyle0.getTextDirection-mmuk1to() == null ? this.getTextDirection-mmuk1to() : paragraphStyle0.getTextDirection-mmuk1to()), (TextUnitKt.isUnspecified--R2X_6o(paragraphStyle0.getLineHeight-XSAIIZE()) ? this.getLineHeight-XSAIIZE() : paragraphStyle0.getLineHeight-XSAIIZE()), (paragraphStyle0.textIndent == null ? this.textIndent : paragraphStyle0.textIndent), null);
    }

    public static ParagraphStyle merge$default(ParagraphStyle paragraphStyle0, ParagraphStyle paragraphStyle1, int v, Object object0) {
        if((v & 1) != 0) {
            paragraphStyle1 = null;
        }
        return paragraphStyle0.merge(paragraphStyle1);
    }

    public final ParagraphStyle plus(ParagraphStyle paragraphStyle0) {
        Intrinsics.checkNotNullParameter(paragraphStyle0, "other");
        return this.merge(paragraphStyle0);
    }

    @Override
    public String toString() {
        return "ParagraphStyle(textAlign=" + this.getTextAlign-buA522U() + ", textDirection=" + this.getTextDirection-mmuk1to() + ", lineHeight=" + TextUnit.toString-impl(this.getLineHeight-XSAIIZE()) + ", textIndent=" + this.textIndent + ')';
    }
}

