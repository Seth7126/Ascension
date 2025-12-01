package androidx.compose.ui.text.input;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\u0018\u0000 52\u00020\u0001:\u00015B\u001A\b\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0006B\u0018\u0012\u0006\u0010\u0002\u001A\u00020\u0007\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\bJ\r\u0010\u001C\u001A\u00020\u001DH\u0000\u00A2\u0006\u0002\b\u001EJ\r\u0010\u001F\u001A\u00020\u001DH\u0000\u00A2\u0006\u0002\b J\u001D\u0010!\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\n2\u0006\u0010#\u001A\u00020\nH\u0000\u00A2\u0006\u0002\b$J\u0016\u0010%\u001A\u00020&2\u0006\u0010\'\u001A\u00020\nH\u0080\u0002\u00A2\u0006\u0002\b(J\r\u0010)\u001A\u00020*H\u0000\u00A2\u0006\u0002\b+J%\u0010,\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\n2\u0006\u0010#\u001A\u00020\n2\u0006\u0010\u0002\u001A\u00020\u0007H\u0000\u00A2\u0006\u0002\b-J%\u0010,\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\n2\u0006\u0010#\u001A\u00020\n2\u0006\u0010\u0002\u001A\u00020\u0003H\u0000\u00A2\u0006\u0002\b-J\u001D\u0010.\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\n2\u0006\u0010#\u001A\u00020\nH\u0000\u00A2\u0006\u0002\b/J\u001D\u00100\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\n2\u0006\u0010#\u001A\u00020\nH\u0000\u00A2\u0006\u0002\b1J\r\u00102\u001A\u00020\u0007H\u0000\u00A2\u0006\u0002\b3J\b\u00104\u001A\u00020\u0003H\u0016R\u001E\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\n@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u001E\u0010\u000E\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\n@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR$\u0010\u0010\u001A\u00020\n2\u0006\u0010\u0010\u001A\u00020\n8@@@X\u0080\u000E\u00A2\u0006\f\u001A\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013R\u000E\u0010\u0014\u001A\u00020\u0015X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001A\u00020\n8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b\u0017\u0010\rR\u001E\u0010\u0018\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\n@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\rR\u001E\u0010\u001A\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\n@BX\u0080\u000E\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00A8\u00066"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer;", "", "text", "", "selection", "Landroidx/compose/ui/text/TextRange;", "(Ljava/lang/String;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/ui/text/AnnotatedString;", "(Landroidx/compose/ui/text/AnnotatedString;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "", "compositionEnd", "getCompositionEnd$ui_text_release", "()I", "compositionStart", "getCompositionStart$ui_text_release", "cursor", "getCursor$ui_text_release", "setCursor$ui_text_release", "(I)V", "gapBuffer", "Landroidx/compose/ui/text/input/PartialGapBuffer;", "length", "getLength$ui_text_release", "selectionEnd", "getSelectionEnd$ui_text_release", "selectionStart", "getSelectionStart$ui_text_release", "cancelComposition", "", "cancelComposition$ui_text_release", "commitComposition", "commitComposition$ui_text_release", "delete", "start", "end", "delete$ui_text_release", "get", "", "index", "get$ui_text_release", "hasComposition", "", "hasComposition$ui_text_release", "replace", "replace$ui_text_release", "setComposition", "setComposition$ui_text_release", "setSelection", "setSelection$ui_text_release", "toAnnotatedString", "toAnnotatedString$ui_text_release", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class EditingBuffer {
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/input/EditingBuffer$Companion;", "", "()V", "NOWHERE", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion = null;
    public static final int NOWHERE = -1;
    private int compositionEnd;
    private int compositionStart;
    private final PartialGapBuffer gapBuffer;
    private int selectionEnd;
    private int selectionStart;

    static {
        EditingBuffer.Companion = new Companion(null);
    }

    private EditingBuffer(AnnotatedString annotatedString0, long v) {
        this.gapBuffer = new PartialGapBuffer(annotatedString0.getText());
        this.selectionStart = TextRange.getMin-impl(v);
        this.selectionEnd = TextRange.getMax-impl(v);
        this.compositionStart = -1;
        this.compositionEnd = -1;
        int v1 = TextRange.getMin-impl(v);
        int v2 = TextRange.getMax-impl(v);
        if(v1 < 0 || v1 > annotatedString0.length()) {
            throw new IndexOutOfBoundsException("start (" + v1 + ") offset is outside of text region " + annotatedString0.length());
        }
        if(v2 < 0 || v2 > annotatedString0.length()) {
            throw new IndexOutOfBoundsException("end (" + v2 + ") offset is outside of text region " + annotatedString0.length());
        }
        if(v1 > v2) {
            throw new IllegalArgumentException("Do not set reversed range: " + v1 + " > " + v2);
        }
    }

    public EditingBuffer(AnnotatedString annotatedString0, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(annotatedString0, v);
    }

    private EditingBuffer(String s, long v) {
        this(new AnnotatedString(s, null, null, 6, null), v, null);
    }

    public EditingBuffer(String s, long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, v);
    }

    public final void cancelComposition$ui_text_release() {
        this.replace$ui_text_release(this.compositionStart, this.compositionEnd, "");
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void commitComposition$ui_text_release() {
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void delete$ui_text_release(int v, int v1) {
        long v2 = TextRangeKt.TextRange(v, v1);
        this.gapBuffer.replace(v, v1, "");
        long v3 = EditingBufferKt.updateRangeAfterDelete-pWDy79M(TextRangeKt.TextRange(this.selectionStart, this.selectionEnd), v2);
        this.selectionStart = TextRange.getMin-impl(v3);
        this.selectionEnd = TextRange.getMax-impl(v3);
        if(this.hasComposition$ui_text_release()) {
            long v4 = EditingBufferKt.updateRangeAfterDelete-pWDy79M(TextRangeKt.TextRange(this.compositionStart, this.compositionEnd), v2);
            if(TextRange.getCollapsed-impl(v4)) {
                this.commitComposition$ui_text_release();
                return;
            }
            this.compositionStart = TextRange.getMin-impl(v4);
            this.compositionEnd = TextRange.getMax-impl(v4);
        }
    }

    public final char get$ui_text_release(int v) {
        return this.gapBuffer.get(v);
    }

    public final int getCompositionEnd$ui_text_release() {
        return this.compositionEnd;
    }

    public final int getCompositionStart$ui_text_release() {
        return this.compositionStart;
    }

    public final int getCursor$ui_text_release() {
        return this.selectionStart == this.selectionEnd ? this.selectionEnd : -1;
    }

    public final int getLength$ui_text_release() {
        return this.gapBuffer.getLength();
    }

    public final int getSelectionEnd$ui_text_release() {
        return this.selectionEnd;
    }

    public final int getSelectionStart$ui_text_release() {
        return this.selectionStart;
    }

    public final boolean hasComposition$ui_text_release() {
        return this.compositionStart != -1;
    }

    public final void replace$ui_text_release(int v, int v1, AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "text");
        this.replace$ui_text_release(v, v1, annotatedString0.getText());
    }

    public final void replace$ui_text_release(int v, int v1, String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        if(v < 0 || v > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if(v1 < 0 || v1 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if(v > v1) {
            throw new IllegalArgumentException("Do not set reversed range: " + v + " > " + v1);
        }
        this.gapBuffer.replace(v, v1, s);
        this.selectionStart = s.length() + v;
        this.selectionEnd = v + s.length();
        this.compositionStart = -1;
        this.compositionEnd = -1;
    }

    public final void setComposition$ui_text_release(int v, int v1) {
        if(v < 0 || v > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if(v1 < 0 || v1 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if(v >= v1) {
            throw new IllegalArgumentException("Do not set reversed or empty range: " + v + " > " + v1);
        }
        this.compositionStart = v;
        this.compositionEnd = v1;
    }

    public final void setCursor$ui_text_release(int v) {
        this.setSelection$ui_text_release(v, v);
    }

    public final void setSelection$ui_text_release(int v, int v1) {
        if(v < 0 || v > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("start (" + v + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if(v1 < 0 || v1 > this.gapBuffer.getLength()) {
            throw new IndexOutOfBoundsException("end (" + v1 + ") offset is outside of text region " + this.gapBuffer.getLength());
        }
        if(v > v1) {
            throw new IllegalArgumentException("Do not set reversed range: " + v + " > " + v1);
        }
        this.selectionStart = v;
        this.selectionEnd = v1;
    }

    public final AnnotatedString toAnnotatedString$ui_text_release() {
        return new AnnotatedString(this.toString(), null, null, 6, null);
    }

    @Override
    public String toString() {
        return this.gapBuffer.toString();
    }
}

