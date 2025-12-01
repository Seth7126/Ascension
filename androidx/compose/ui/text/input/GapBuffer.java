package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001A\u00020\r2\n\u0010\u000E\u001A\u00060\u000Fj\u0002`\u0010J\u0018\u0010\u0011\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u0005H\u0002J\b\u0010\u0014\u001A\u00020\u0005H\u0002J\u0011\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0017\u001A\u00020\u0005H\u0086\u0002J\u0006\u0010\u0018\u001A\u00020\u0005J\u0010\u0010\u0019\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\u0005H\u0002J\u001E\u0010\u001B\u001A\u00020\r2\u0006\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u001C\u001A\u00020\u001DJ\b\u0010\u001E\u001A\u00020\u001DH\u0016R\u000E\u0010\b\u001A\u00020\u0003X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0005X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0005X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\u0005X\u0082\u000E¢\u0006\u0002\n\u0000¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/input/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", "append", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "delete", "start", "end", "gapLength", "get", "", "index", "length", "makeSureAvailableSpace", "requestSize", "replace", "text", "", "toString", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] arr_c, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_c, "initBuffer");
        super();
        this.capacity = arr_c.length;
        this.buffer = arr_c;
        this.gapStart = v;
        this.gapEnd = v1;
    }

    public final void append(StringBuilder stringBuilder0) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "builder");
        stringBuilder0.append(this.buffer, 0, this.gapStart);
        stringBuilder0.append(this.buffer, this.gapEnd, this.capacity - this.gapEnd);
    }

    private final void delete(int v, int v1) {
        int v2 = this.gapStart;
        if(v < v2 && v1 <= v2) {
            int v3 = v2 - v1;
            ArraysKt.copyInto(this.buffer, this.buffer, this.gapEnd - v3, v1, v2);
            this.gapStart = v;
            this.gapEnd -= v3;
            return;
        }
        if(v < v2 && v1 >= v2) {
            this.gapEnd = v1 + this.gapLength();
            this.gapStart = v;
            return;
        }
        int v4 = v + this.gapLength();
        int v5 = v4 - this.gapEnd;
        ArraysKt.copyInto(this.buffer, this.buffer, this.gapStart, this.gapEnd, v4);
        this.gapStart += v5;
        this.gapEnd = v1 + this.gapLength();
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    public final char get(int v) {
        return v >= this.gapStart ? this.buffer[v - this.gapStart + this.gapEnd] : this.buffer[v];
    }

    public final int length() {
        return this.capacity - this.gapLength();
    }

    private final void makeSureAvailableSpace(int v) {
        if(v <= this.gapLength()) {
            return;
        }
        int v1 = this.gapLength();
        int v2 = this.capacity;
        do {
            v2 *= 2;
        }
        while(v2 - this.capacity < v - v1);
        char[] arr_c = new char[v2];
        ArraysKt.copyInto(this.buffer, arr_c, 0, 0, this.gapStart);
        int v3 = this.capacity - this.gapEnd;
        int v4 = v2 - v3;
        ArraysKt.copyInto(this.buffer, arr_c, v4, this.gapEnd, v3 + this.gapEnd);
        this.buffer = arr_c;
        this.capacity = v2;
        this.gapEnd = v4;
    }

    public final void replace(int v, int v1, String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        this.makeSureAvailableSpace(s.length() - (v1 - v));
        this.delete(v, v1);
        GapBufferKt.toCharArray$default(s, this.buffer, this.gapStart, 0, 0, 12, null);
        this.gapStart += s.length();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(stringBuilder0);
        Intrinsics.checkNotNullExpressionValue("", "StringBuilder().apply { append(this) }.toString()");
        return "";
    }
}

