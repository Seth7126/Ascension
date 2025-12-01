package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000E\u001A\u00020\u000FH\u0016J\b\u0010\u0010\u001A\u00020\u0011H\u0016R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/text/input/TransformedText;", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/input/OffsetMapping;)V", "getOffsetMapping", "()Landroidx/compose/ui/text/input/OffsetMapping;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "equals", "", "other", "hashCode", "", "toString", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TransformedText {
    private final OffsetMapping offsetMapping;
    private final AnnotatedString text;

    public TransformedText(AnnotatedString annotatedString0, OffsetMapping offsetMapping0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "text");
        Intrinsics.checkNotNullParameter(offsetMapping0, "offsetMapping");
        super();
        this.text = annotatedString0;
        this.offsetMapping = offsetMapping0;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransformedText)) {
            return false;
        }
        return Intrinsics.areEqual(this.text, ((TransformedText)object0).text) ? Intrinsics.areEqual(this.offsetMapping, ((TransformedText)object0).offsetMapping) : false;
    }

    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    @Override
    public int hashCode() {
        return this.text.hashCode() * 0x1F + this.offsetMapping.hashCode();
    }

    @Override
    public String toString() {
        return "TransformedText(text=" + this.text + ", offsetMapping=" + this.offsetMapping + ')';
    }
}

