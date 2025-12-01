package androidx.compose.ui.text.input;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0002¨\u0006\u0005"}, d2 = {"isSurrogatePair", "", "high", "", "low", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class EditCommandKt {
    // 去混淆评级： 低(20)
    private static final boolean isSurrogatePair(char c, char c1) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c1);
    }
}

