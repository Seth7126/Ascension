package androidx.compose.ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\u0001¨\u0006\u0004"}, d2 = {"getTextDirectionHeuristic", "Landroid/text/TextDirectionHeuristic;", "textDirectionHeuristic", "", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TextLayoutKt {
    public static final TextDirectionHeuristic getTextDirectionHeuristic(int v) {
        TextDirectionHeuristic textDirectionHeuristic0;
        switch(v) {
            case 0: {
                textDirectionHeuristic0 = TextDirectionHeuristics.LTR;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "LTR");
                return textDirectionHeuristic0;
            }
            case 1: {
                textDirectionHeuristic0 = TextDirectionHeuristics.RTL;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "RTL");
                return textDirectionHeuristic0;
            }
            case 2: {
                textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "FIRSTSTRONG_LTR");
                return textDirectionHeuristic0;
            }
            case 3: {
                textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "FIRSTSTRONG_RTL");
                return textDirectionHeuristic0;
            }
            case 4: {
                textDirectionHeuristic0 = TextDirectionHeuristics.ANYRTL_LTR;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "ANYRTL_LTR");
                return textDirectionHeuristic0;
            }
            case 5: {
                textDirectionHeuristic0 = TextDirectionHeuristics.LOCALE;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "LOCALE");
                return textDirectionHeuristic0;
            }
            default: {
                textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "FIRSTSTRONG_LTR");
                return textDirectionHeuristic0;
            }
        }
    }
}

