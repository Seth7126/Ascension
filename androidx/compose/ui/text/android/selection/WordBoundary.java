package androidx.compose.ui.text.android.selection;

import androidx.compose.ui.text.android.InternalPlatformTextApi;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000E\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\nJ\u000E\u0010\f\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\nR\u000E\u0010\u0007\u001A\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/selection/WordBoundary;", "", "locale", "Ljava/util/Locale;", "text", "", "(Ljava/util/Locale;Ljava/lang/CharSequence;)V", "wordIterator", "Landroidx/compose/ui/text/android/selection/WordIterator;", "getWordEnd", "", "offset", "getWordStart", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class WordBoundary {
    private final WordIterator wordIterator;

    public WordBoundary(Locale locale0, CharSequence charSequence0) {
        Intrinsics.checkNotNullParameter(locale0, "locale");
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        super();
        this.wordIterator = new WordIterator(charSequence0, 0, charSequence0.length(), locale0);
    }

    public final int getWordEnd(int v) {
        int v1 = this.wordIterator.nextBoundary(v);
        int v2 = this.wordIterator.isAfterPunctuation(v1) ? this.wordIterator.getPunctuationEnd(v) : this.wordIterator.getNextWordEndOnTwoWordBoundary(v);
        return v2 == -1 ? v : v2;
    }

    public final int getWordStart(int v) {
        int v1 = this.wordIterator.prevBoundary(v);
        int v2 = this.wordIterator.isOnPunctuation(v1) ? this.wordIterator.getPunctuationBeginning(v) : this.wordIterator.getPrevWordBeginningOnTwoWordsBoundary(v);
        return v2 == -1 ? v : v2;
    }
}

