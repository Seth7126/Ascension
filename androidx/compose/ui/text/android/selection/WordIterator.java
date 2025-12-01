package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u000E\b\u0000\u0018\u0000 \u001E2\u00020\u0001:\u0001\u001EB\'\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u0005H\u0002J\u0018\u0010\u000F\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u0010\u001A\u00020\u0011H\u0002J\u0018\u0010\u0012\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u0013\u001A\u00020\u0011H\u0002J\u000E\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u0005J\u000E\u0010\u0010\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u0005J\u000E\u0010\u0014\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u0005J\u000E\u0010\u0015\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u0005J\u0010\u0010\u0016\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\u0005H\u0002J\u000E\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\u0005J\u0010\u0010\u0018\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\u0005H\u0002J\u000E\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\u0005J\u0010\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\u0005H\u0002J\u0010\u0010\u001B\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\u0005H\u0002J\u000E\u0010\u001C\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u0005J\u000E\u0010\u001D\u001A\u00020\u00052\u0006\u0010\u000E\u001A\u00020\u0005R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u000BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator;", "", "charSequence", "", "start", "", "end", "locale", "Ljava/util/Locale;", "(Ljava/lang/CharSequence;IILjava/util/Locale;)V", "iterator", "Ljava/text/BreakIterator;", "checkOffsetIsValid", "", "offset", "getBeginning", "getPrevWordBeginningOnTwoWordsBoundary", "", "getEnd", "getNextWordEndOnTwoWordBoundary", "getPunctuationBeginning", "getPunctuationEnd", "isAfterLetterOrDigit", "isAfterPunctuation", "isOnLetterOrDigit", "isOnPunctuation", "isPunctuationEndBoundary", "isPunctuationStartBoundary", "nextBoundary", "prevBoundary", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class WordIterator {
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0004H\u0000¢\u0006\u0002\b\bR\u000E\u0010\u0003\u001A\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordIterator$Companion;", "", "()V", "WINDOW_WIDTH", "", "isPunctuation", "", "cp", "isPunctuation$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final boolean isPunctuation$ui_text_release(int v) {
            switch(Character.getType(v)) {
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 29: 
                case 30: {
                    return true;
                }
                default: {
                    return false;
                }
            }
        }
    }

    public static final Companion Companion = null;
    private static final int WINDOW_WIDTH = 50;
    private final CharSequence charSequence;
    private final int end;
    private final BreakIterator iterator;
    private final int start;

    static {
        WordIterator.Companion = new Companion(null);
    }

    public WordIterator(CharSequence charSequence0, int v, int v1, Locale locale0) {
        Intrinsics.checkNotNullParameter(charSequence0, "charSequence");
        super();
        this.charSequence = charSequence0;
        if(v < 0 || v > charSequence0.length()) {
            throw new IllegalArgumentException("input start index is outside the CharSequence");
        }
        if(v1 < 0 || v1 > charSequence0.length()) {
            throw new IllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator breakIterator0 = BreakIterator.getWordInstance(locale0);
        Intrinsics.checkNotNullExpressionValue(breakIterator0, "getWordInstance(locale)");
        this.iterator = breakIterator0;
        this.start = Math.max(0, v - 50);
        this.end = Math.min(charSequence0.length(), v1 + 50);
        breakIterator0.setText(new CharSequenceCharacterIterator(charSequence0, v, v1));
    }

    private final void checkOffsetIsValid(int v) {
        if(v > this.end || this.start > v) {
            throw new IllegalArgumentException(("Invalid offset: " + v + ". Valid range is [" + this.start + " , " + this.end + ']').toString());
        }
    }

    private final int getBeginning(int v, boolean z) {
        this.checkOffsetIsValid(v);
        if(this.isOnLetterOrDigit(v)) {
            return this.iterator.isBoundary(v) && (!this.isAfterLetterOrDigit(v) || !z) ? v : this.iterator.preceding(v);
        }
        return this.isAfterLetterOrDigit(v) ? this.iterator.preceding(v) : -1;
    }

    private final int getEnd(int v, boolean z) {
        this.checkOffsetIsValid(v);
        if(this.isAfterLetterOrDigit(v)) {
            return this.iterator.isBoundary(v) && (!this.isOnLetterOrDigit(v) || !z) ? v : this.iterator.following(v);
        }
        return this.isOnLetterOrDigit(v) ? this.iterator.following(v) : -1;
    }

    public final int getNextWordEndOnTwoWordBoundary(int v) {
        return this.getEnd(v, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int v) {
        return this.getBeginning(v, true);
    }

    public final int getPunctuationBeginning(int v) {
        this.checkOffsetIsValid(v);
        while(v != -1 && !this.isPunctuationStartBoundary(v)) {
            v = this.prevBoundary(v);
        }
        return v;
    }

    public final int getPunctuationEnd(int v) {
        this.checkOffsetIsValid(v);
        while(v != -1 && !this.isPunctuationEndBoundary(v)) {
            v = this.nextBoundary(v);
        }
        return v;
    }

    // 去混淆评级： 低(30)
    private final boolean isAfterLetterOrDigit(int v) {
        return v <= this.end && this.start + 1 <= v && Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, v));
    }

    public final boolean isAfterPunctuation(int v) {
        return v > this.end || this.start + 1 > v ? false : WordIterator.Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, v));
    }

    // 去混淆评级： 低(30)
    private final boolean isOnLetterOrDigit(int v) {
        return v < this.end && this.start <= v && Character.isLetterOrDigit(Character.codePointAt(this.charSequence, v));
    }

    // 去混淆评级： 低(20)
    public final boolean isOnPunctuation(int v) {
        return v >= this.end || this.start > v ? WordIterator.Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, v)) : false;
    }

    // 去混淆评级： 低(20)
    private final boolean isPunctuationEndBoundary(int v) {
        return !this.isOnPunctuation(v) && this.isAfterPunctuation(v);
    }

    // 去混淆评级： 低(20)
    private final boolean isPunctuationStartBoundary(int v) {
        return this.isOnPunctuation(v) && !this.isAfterPunctuation(v);
    }

    public final int nextBoundary(int v) {
        this.checkOffsetIsValid(v);
        return this.iterator.following(v);
    }

    public final int prevBoundary(int v) {
        this.checkOffsetIsValid(v);
        return this.iterator.preceding(v);
    }
}

