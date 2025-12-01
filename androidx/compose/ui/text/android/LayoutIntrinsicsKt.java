package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm;
import androidx.compose.ui.text.android.style.LetterSpacingSpanPx;
import java.text.BreakIterator;
import java.util.Comparator;
import java.util.PriorityQueue;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0000\u001A \u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00012\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0005H\u0002¨\u0006\u000B"}, d2 = {"minIntrinsicWidth", "", "text", "", "paint", "Landroid/text/TextPaint;", "shouldIncreaseMaxIntrinsic", "", "desiredWidth", "charSequence", "textPaint", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutIntrinsicsKt {
    public static final float minIntrinsicWidth(CharSequence charSequence0, TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(textPaint0, "paint");
        BreakIterator breakIterator0 = BreakIterator.getLineInstance(textPaint0.getTextLocale());
        breakIterator0.setText(new CharSequenceCharacterIterator(charSequence0, 0, charSequence0.length()));
        PriorityQueue priorityQueue0 = new PriorityQueue(10, (Object object0, Object object1) -> this.compare(((Pair)object0), ((Pair)object1)));
        int v = breakIterator0.next();
        for(int v1 = 0; v != -1; v1 = v2) {
            if(priorityQueue0.size() < 10) {
                priorityQueue0.add(new Pair(v1, v));
            }
            else {
                Pair pair0 = (Pair)priorityQueue0.peek();
                if(pair0 != null && ((Number)pair0.getSecond()).intValue() - ((Number)pair0.getFirst()).intValue() < v - v1) {
                    priorityQueue0.poll();
                    priorityQueue0.add(new Pair(v1, v));
                }
            }
            int v2 = v;
            v = breakIterator0.next();
        }
        float f = 0.0f;
        for(Object object0: priorityQueue0) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence0, ((Number)((Pair)object0).component1()).intValue(), ((Number)((Pair)object0).component2()).intValue(), textPaint0));
        }
        return f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001A\u00020\u00012&\u0010\u0003\u001A\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u00002&\u0010\u0004\u001A\"\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001 \u0002*\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lkotlin/Pair;", "", "kotlin.jvm.PlatformType", "left", "right", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class androidx.compose.ui.text.android.LayoutIntrinsicsKt.minIntrinsicWidth.longestWordCandidates.1 implements Comparator {
            public static final androidx.compose.ui.text.android.LayoutIntrinsicsKt.minIntrinsicWidth.longestWordCandidates.1 INSTANCE;

            static {
                androidx.compose.ui.text.android.LayoutIntrinsicsKt.minIntrinsicWidth.longestWordCandidates.1.INSTANCE = new androidx.compose.ui.text.android.LayoutIntrinsicsKt.minIntrinsicWidth.longestWordCandidates.1();
            }

            androidx.compose.ui.text.android.LayoutIntrinsicsKt.minIntrinsicWidth.longestWordCandidates.1() {
                super();
            }

            // 检测为 Lambda 实现
            @Override
            public int compare(Object object0, Object object1) [...]

            public final int compare(Pair pair0, Pair pair1) {
                return ((Number)pair0.getSecond()).intValue() - ((Number)pair0.getFirst()).intValue() - (((Number)pair1.getSecond()).intValue() - ((Number)pair1.getFirst()).intValue());
            }
        }

    }

    // 去混淆评级： 中等(50)
    private static final boolean shouldIncreaseMaxIntrinsic(float f, CharSequence charSequence0, TextPaint textPaint0) {
        return f == 0.0f || !(charSequence0 instanceof Spanned) ? false : textPaint0.getLetterSpacing() != 0.0f || SpannedExtensionsKt.hasSpan(((Spanned)charSequence0), LetterSpacingSpanPx.class) || SpannedExtensionsKt.hasSpan(((Spanned)charSequence0), LetterSpacingSpanEm.class);
    }
}

