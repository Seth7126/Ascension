package androidx.compose.ui.text.input;

import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB*\b\u0016\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0007B&\u0012\u0006\u0010\b\u001A\u00020\t\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\nJ3\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0014\u001A\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\n\b\u0002\u0010\u0006\u001A\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0017J\u0013\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001B\u001A\u00020\u001CH\u0016J\b\u0010\u001D\u001A\u00020\u0003H\u0016R\u0011\u0010\b\u001A\u00020\t¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u001C\u0010\u0004\u001A\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0011\u001A\u0004\b\u000F\u0010\u0010R\u0011\u0010\u0002\u001A\u00020\u00038F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u0013\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "composition", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnnotatedString", "()Landroidx/compose/ui/text/AnnotatedString;", "getComposition-MzsxiRA", "()Landroidx/compose/ui/text/TextRange;", "getSelection-d9O1mEE", "()J", "J", "getText", "()Ljava/lang/String;", "copy", "copy-3r_uNRQ", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "(Ljava/lang/String;JLandroidx/compose/ui/text/TextRange;)Landroidx/compose/ui/text/input/TextFieldValue;", "equals", "", "other", "hashCode", "", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextFieldValue {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001D\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/text/input/TextFieldValue$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/ui/text/input/TextFieldValue;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final Saver getSaver() {
            return TextFieldValue.Saver;
        }
    }

    public static final Companion Companion;
    private static final Saver Saver;
    private final AnnotatedString annotatedString;
    private final TextRange composition;
    private final long selection;

    static {
        TextFieldValue.Companion = new Companion(null);
        TextFieldValue.Saver = SaverKt.Saver(TextFieldValue.Companion.Saver.1.INSTANCE, TextFieldValue.Companion.Saver.2.INSTANCE);
    }

    private TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0) {
        this.annotatedString = annotatedString0;
        this.selection = TextRangeKt.constrain-8ffj60Q(v, 0, this.getText().length());
        this.composition = textRange0 == null ? null : TextRange.box-impl(TextRangeKt.constrain-8ffj60Q(textRange0.unbox-impl(), 0, this.getText().length()));
    }

    public TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            textRange0 = null;
        }
        this(annotatedString0, v, textRange0, null);
    }

    public TextFieldValue(AnnotatedString annotatedString0, long v, TextRange textRange0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, v, textRange0);
    }

    private TextFieldValue(String s, long v, TextRange textRange0) {
        this(new AnnotatedString(s, null, null, 6, null), v, textRange0, null);
    }

    public TextFieldValue(String s, long v, TextRange textRange0, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 1) != 0) {
            s = "";
        }
        if((v1 & 2) != 0) {
            v = 0L;
        }
        if((v1 & 4) != 0) {
            textRange0 = null;
        }
        this(s, v, textRange0, null);
    }

    public TextFieldValue(String s, long v, TextRange textRange0, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, v, textRange0);
    }

    public final TextFieldValue copy-3r_uNRQ(AnnotatedString annotatedString0, long v, TextRange textRange0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "annotatedString");
        return new TextFieldValue(annotatedString0, v, textRange0, null);
    }

    public final TextFieldValue copy-3r_uNRQ(String s, long v, TextRange textRange0) {
        Intrinsics.checkNotNullParameter(s, "text");
        return new TextFieldValue(new AnnotatedString(s, null, null, 6, null), v, textRange0, null);
    }

    public static TextFieldValue copy-3r_uNRQ$default(TextFieldValue textFieldValue0, AnnotatedString annotatedString0, long v, TextRange textRange0, int v1, Object object0) {
        if((v1 & 1) != 0) {
            annotatedString0 = textFieldValue0.annotatedString;
        }
        if((v1 & 2) != 0) {
            v = textFieldValue0.getSelection-d9O1mEE();
        }
        if((v1 & 4) != 0) {
            textRange0 = textFieldValue0.getComposition-MzsxiRA();
        }
        return textFieldValue0.copy-3r_uNRQ(annotatedString0, v, textRange0);
    }

    public static TextFieldValue copy-3r_uNRQ$default(TextFieldValue textFieldValue0, String s, long v, TextRange textRange0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            v = textFieldValue0.getSelection-d9O1mEE();
        }
        if((v1 & 4) != 0) {
            textRange0 = textFieldValue0.getComposition-MzsxiRA();
        }
        return textFieldValue0.copy-3r_uNRQ(s, v, textRange0);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof TextFieldValue ? TextRange.equals-impl0(this.getSelection-d9O1mEE(), ((TextFieldValue)object0).getSelection-d9O1mEE()) && Intrinsics.areEqual(this.getComposition-MzsxiRA(), ((TextFieldValue)object0).getComposition-MzsxiRA()) && Intrinsics.areEqual(this.annotatedString, ((TextFieldValue)object0).annotatedString) : false;
    }

    public final AnnotatedString getAnnotatedString() {
        return this.annotatedString;
    }

    public final TextRange getComposition-MzsxiRA() {
        return this.composition;
    }

    public final long getSelection-d9O1mEE() {
        return this.selection;
    }

    public final String getText() {
        return this.annotatedString.getText();
    }

    @Override
    public int hashCode() {
        int v = this.annotatedString.hashCode();
        int v1 = TextRange.hashCode-impl(this.getSelection-d9O1mEE());
        TextRange textRange0 = this.getComposition-MzsxiRA();
        return textRange0 == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + TextRange.hashCode-impl(textRange0.unbox-impl());
    }

    @Override
    public String toString() {
        return "TextFieldValue(text=\'" + this.annotatedString + "\', selection=" + TextRange.toString-impl(this.getSelection-d9O1mEE()) + ", composition=" + this.getComposition-MzsxiRA() + ')';
    }
}

