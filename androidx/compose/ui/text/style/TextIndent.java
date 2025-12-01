package androidx.compose.ui.text.style;

import androidx.compose.ui.unit.TextUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001C\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0005J\'\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001A\u00020\u0011H\u0016J\b\u0010\u0012\u001A\u00020\u0013H\u0016R\u001C\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001A\u0004\b\u0006\u0010\u0007R\u001C\u0010\u0004\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\b\u001A\u0004\b\t\u0010\u0007\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent;", "", "firstLine", "Landroidx/compose/ui/unit/TextUnit;", "restLine", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFirstLine-XSAIIZE", "()J", "J", "getRestLine-XSAIIZE", "copy", "copy-NB67dxo", "(JJ)Landroidx/compose/ui/text/style/TextIndent;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextIndent {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/style/TextIndent$Companion;", "", "()V", "None", "Landroidx/compose/ui/text/style/TextIndent;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/text/style/TextIndent;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final TextIndent getNone() {
            return TextIndent.None;
        }

        public static void getNone$annotations() {
        }
    }

    public static final Companion Companion;
    private static final TextIndent None;
    private final long firstLine;
    private final long restLine;

    static {
        TextIndent.Companion = new Companion(null);
        TextIndent.None = new TextIndent(0L, 0L, 3, null);
    }

    private TextIndent(long v, long v1) {
        this.firstLine = v;
        this.restLine = v1;
    }

    public TextIndent(long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 1) != 0) {
            v = 0x100000000L;
        }
        if((v2 & 2) != 0) {
            v1 = 0x100000000L;
        }
        this(v, v1, null);
    }

    public TextIndent(long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1);
    }

    public final TextIndent copy-NB67dxo(long v, long v1) {
        return new TextIndent(v, v1, null);
    }

    public static TextIndent copy-NB67dxo$default(TextIndent textIndent0, long v, long v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = textIndent0.getFirstLine-XSAIIZE();
        }
        if((v2 & 2) != 0) {
            v1 = textIndent0.getRestLine-XSAIIZE();
        }
        return textIndent0.copy-NB67dxo(v, v1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TextIndent)) {
            return false;
        }
        return TextUnit.equals-impl0(this.getFirstLine-XSAIIZE(), ((TextIndent)object0).getFirstLine-XSAIIZE()) ? TextUnit.equals-impl0(this.getRestLine-XSAIIZE(), ((TextIndent)object0).getRestLine-XSAIIZE()) : false;
    }

    public final long getFirstLine-XSAIIZE() {
        return this.firstLine;
    }

    public final long getRestLine-XSAIIZE() {
        return this.restLine;
    }

    @Override
    public int hashCode() {
        return TextUnit.hashCode-impl(this.getFirstLine-XSAIIZE()) * 0x1F + TextUnit.hashCode-impl(this.getRestLine-XSAIIZE());
    }

    @Override
    public String toString() {
        return "TextIndent(firstLine=" + TextUnit.toString-impl(this.getFirstLine-XSAIIZE()) + ", restLine=" + TextUnit.toString-impl(this.getRestLine-XSAIIZE()) + ')';
    }
}

