package androidx.compose.ui.text.input;

import androidx.compose.ui.text.InternalTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@InternalTextApi
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0010\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u0006H\u0086\u0002J\u001E\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0002\u001A\u00020\u0003J\b\u0010\u0017\u001A\u00020\u0003H\u0016R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001A\u0004\u0018\u00010\tX\u0082\u000E¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u000B\u0010\fR\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0004¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "text", "", "(Ljava/lang/String;)V", "bufEnd", "", "bufStart", "buffer", "Landroidx/compose/ui/text/input/GapBuffer;", "length", "getLength", "()I", "getText", "()Ljava/lang/String;", "setText", "get", "", "index", "replace", "", "start", "end", "toString", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PartialGapBuffer {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "()V", "BUF_SIZE", "", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int BUF_SIZE = 0xFF;
    public static final Companion Companion = null;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 0x40;
    private int bufEnd;
    private int bufStart;
    private GapBuffer buffer;
    private String text;

    static {
        PartialGapBuffer.Companion = new Companion(null);
    }

    public PartialGapBuffer(String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        super();
        this.text = s;
        this.bufStart = -1;
        this.bufEnd = -1;
    }

    public final char get(int v) {
        GapBuffer gapBuffer0 = this.buffer;
        if(gapBuffer0 == null) {
            return this.text.charAt(v);
        }
        if(v < this.bufStart) {
            return this.text.charAt(v);
        }
        int v1 = gapBuffer0.length();
        return v >= v1 + this.bufStart ? this.text.charAt(v - (v1 - this.bufEnd + this.bufStart)) : gapBuffer0.get(v - this.bufStart);
    }

    public final int getLength() {
        return this.buffer == null ? this.text.length() : this.text.length() - (this.bufEnd - this.bufStart) + this.buffer.length();
    }

    public final String getText() {
        return this.text;
    }

    public final void replace(int v, int v1, String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        GapBuffer gapBuffer0 = this.buffer;
        if(gapBuffer0 == null) {
            int v2 = Math.max(0xFF, s.length() + 0x80);
            char[] arr_c = new char[v2];
            int v3 = Math.min(v, 0x40);
            int v4 = Math.min(this.text.length() - v1, 0x40);
            int v5 = v - v3;
            GapBufferKt.toCharArray(this.text, arr_c, 0, v5, v);
            int v6 = v2 - v4;
            int v7 = v1 + v4;
            GapBufferKt.toCharArray(this.text, arr_c, v6, v1, v7);
            GapBufferKt.toCharArray$default(s, arr_c, v3, 0, 0, 12, null);
            this.buffer = new GapBuffer(arr_c, v3 + s.length(), v6);
            this.bufStart = v5;
            this.bufEnd = v7;
            return;
        }
        int v8 = v - this.bufStart;
        int v9 = v1 - this.bufStart;
        if(v8 >= 0 && v9 <= gapBuffer0.length()) {
            gapBuffer0.replace(v8, v9, s);
            return;
        }
        this.text = this.toString();
        this.buffer = null;
        this.bufStart = -1;
        this.bufEnd = -1;
        this.replace(v, v1, s);
    }

    public final void setText(String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.text = s;
    }

    @Override
    public String toString() {
        GapBuffer gapBuffer0 = this.buffer;
        if(gapBuffer0 == null) {
            return this.text;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.text, 0, this.bufStart);
        gapBuffer0.append(stringBuilder0);
        stringBuilder0.append(this.text, this.bufEnd, this.text.length());
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
        return s;
    }
}

