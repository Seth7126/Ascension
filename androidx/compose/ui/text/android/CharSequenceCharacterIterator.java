package androidx.compose.ui.text.android;

import java.text.CharacterIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\t\u001A\u00020\nH\u0016J\b\u0010\u000B\u001A\u00020\fH\u0016J\b\u0010\r\u001A\u00020\fH\u0016J\b\u0010\u000E\u001A\u00020\u0005H\u0016J\b\u0010\u000F\u001A\u00020\u0005H\u0016J\b\u0010\u0010\u001A\u00020\u0005H\u0016J\b\u0010\u0011\u001A\u00020\fH\u0016J\t\u0010\u0012\u001A\u00020\fH\u0096\u0002J\b\u0010\u0013\u001A\u00020\fH\u0016J\u0010\u0010\u0014\u001A\u00020\f2\u0006\u0010\u0015\u001A\u00020\u0005H\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0005X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/text/android/CharSequenceCharacterIterator;", "Ljava/text/CharacterIterator;", "charSequence", "", "start", "", "end", "(Ljava/lang/CharSequence;II)V", "index", "clone", "", "current", "", "first", "getBeginIndex", "getEndIndex", "getIndex", "last", "next", "previous", "setIndex", "position", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CharSequenceCharacterIterator implements CharacterIterator {
    private final CharSequence charSequence;
    private final int end;
    private int index;
    private final int start;

    public CharSequenceCharacterIterator(CharSequence charSequence0, int v, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "charSequence");
        super();
        this.charSequence = charSequence0;
        this.start = v;
        this.end = v1;
        this.index = v;
    }

    @Override
    public Object clone() {
        try {
            Object object0 = CharacterIterator.super.clone();
            Intrinsics.checkNotNullExpressionValue(object0, "{\n            @Suppress(\"ABSTRACT_SUPER_CALL\")\n            super.clone()\n        }");
            return object0;
        }
        catch(CloneNotSupportedException unused_ex) {
            throw new InternalError();
        }
    }

    @Override
    public char current() {
        return this.index == this.end ? '\uFFFF' : this.charSequence.charAt(this.index);
    }

    @Override
    public char first() {
        this.index = this.start;
        return this.current();
    }

    @Override
    public int getBeginIndex() {
        return this.start;
    }

    @Override
    public int getEndIndex() {
        return this.end;
    }

    @Override
    public int getIndex() {
        return this.index;
    }

    @Override
    public char last() {
        int v = this.end;
        if(this.start == v) {
            this.index = v;
            return '\uFFFF';
        }
        this.index = v - 1;
        return this.charSequence.charAt(v - 1);
    }

    @Override
    public char next() {
        int v = this.index + 1;
        this.index = v;
        int v1 = this.end;
        if(v >= v1) {
            this.index = v1;
            return '\uFFFF';
        }
        return this.charSequence.charAt(v);
    }

    @Override
    public char previous() {
        int v = this.index;
        if(v <= this.start) {
            return '\uFFFF';
        }
        this.index = v - 1;
        return this.charSequence.charAt(v - 1);
    }

    @Override
    public char setIndex(int v) {
        if(v > this.end || this.start > v) {
            throw new IllegalArgumentException("invalid position");
        }
        this.index = v;
        return this.current();
    }
}

