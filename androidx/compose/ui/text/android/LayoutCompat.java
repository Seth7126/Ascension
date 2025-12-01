package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u00C7\u0002\u0018\u00002\u00020\u0001:\u0005+,-./B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u0004X\u0080T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u000FX\u0080T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0004X\u0080T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0011\u001A\u00020\u000FX\u0080T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001A\u00020\u0014X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0016R\u000E\u0010\u0017\u001A\u00020\u0018X\u0080T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0019\u001A\u00020\u0018X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001A\u001A\u00020\u0004X\u0080T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001B\u001A\u00020\u0004X\u0080T\u00A2\u0006\u0002\n\u0000R\u0014\u0010\u001C\u001A\u00020\u001DX\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u001FR\u000E\u0010 \u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010!\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\"\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010#\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010$\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010%\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010&\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010\'\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010(\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010)\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000R\u000E\u0010*\u001A\u00020\u0004X\u0086T\u00A2\u0006\u0002\n\u0000\u00A8\u00060"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat;", "", "()V", "ALIGN_CENTER", "", "ALIGN_LEFT", "ALIGN_NORMAL", "ALIGN_OPPOSITE", "ALIGN_RIGHT", "BREAK_STRATEGY_BALANCED", "BREAK_STRATEGY_HIGH_QUALITY", "BREAK_STRATEGY_SIMPLE", "DEFAULT_ALIGNMENT", "DEFAULT_BREAK_STRATEGY", "DEFAULT_FALLBACK_LINE_SPACING", "", "DEFAULT_HYPHENATION_FREQUENCY", "DEFAULT_INCLUDE_PADDING", "DEFAULT_JUSTIFICATION_MODE", "DEFAULT_LAYOUT_ALIGNMENT", "Landroid/text/Layout$Alignment;", "getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release", "()Landroid/text/Layout$Alignment;", "DEFAULT_LINESPACING_EXTRA", "", "DEFAULT_LINESPACING_MULTIPLIER", "DEFAULT_MAX_LINES", "DEFAULT_TEXT_DIRECTION", "DEFAULT_TEXT_DIRECTION_HEURISTIC", "Landroid/text/TextDirectionHeuristic;", "getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release", "()Landroid/text/TextDirectionHeuristic;", "HYPHENATION_FREQUENCY_FULL", "HYPHENATION_FREQUENCY_NONE", "HYPHENATION_FREQUENCY_NORMAL", "JUSTIFICATION_MODE_INTER_WORD", "JUSTIFICATION_MODE_NONE", "TEXT_DIRECTION_ANY_RTL_LTR", "TEXT_DIRECTION_FIRST_STRONG_LTR", "TEXT_DIRECTION_FIRST_STRONG_RTL", "TEXT_DIRECTION_LOCALE", "TEXT_DIRECTION_LTR", "TEXT_DIRECTION_RTL", "BreakStrategy", "HyphenationFrequency", "JustificationMode", "TextDirection", "TextLayoutAlignment", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutCompat {
    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$BreakStrategy;", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface BreakStrategy {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$HyphenationFrequency;", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface HyphenationFrequency {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$JustificationMode;", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface JustificationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextDirection;", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/LayoutCompat$TextLayoutAlignment;", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface TextLayoutAlignment {
    }

    public static final int ALIGN_CENTER = 2;
    public static final int ALIGN_LEFT = 3;
    public static final int ALIGN_NORMAL = 0;
    public static final int ALIGN_OPPOSITE = 1;
    public static final int ALIGN_RIGHT = 4;
    public static final int BREAK_STRATEGY_BALANCED = 2;
    public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
    public static final int BREAK_STRATEGY_SIMPLE = 0;
    public static final int DEFAULT_ALIGNMENT = 0;
    public static final int DEFAULT_BREAK_STRATEGY = 0;
    public static final boolean DEFAULT_FALLBACK_LINE_SPACING = true;
    public static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    public static final boolean DEFAULT_INCLUDE_PADDING = true;
    public static final int DEFAULT_JUSTIFICATION_MODE = 0;
    private static final Layout.Alignment DEFAULT_LAYOUT_ALIGNMENT = null;
    public static final float DEFAULT_LINESPACING_EXTRA = 0.0f;
    public static final float DEFAULT_LINESPACING_MULTIPLIER = 1.0f;
    public static final int DEFAULT_MAX_LINES = 0x7FFFFFFF;
    public static final int DEFAULT_TEXT_DIRECTION = 2;
    private static final TextDirectionHeuristic DEFAULT_TEXT_DIRECTION_HEURISTIC = null;
    public static final int HYPHENATION_FREQUENCY_FULL = 2;
    public static final int HYPHENATION_FREQUENCY_NONE = 0;
    public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
    public static final LayoutCompat INSTANCE = null;
    public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
    public static final int JUSTIFICATION_MODE_NONE = 0;
    public static final int TEXT_DIRECTION_ANY_RTL_LTR = 4;
    public static final int TEXT_DIRECTION_FIRST_STRONG_LTR = 2;
    public static final int TEXT_DIRECTION_FIRST_STRONG_RTL = 3;
    public static final int TEXT_DIRECTION_LOCALE = 5;
    public static final int TEXT_DIRECTION_LTR = 0;
    public static final int TEXT_DIRECTION_RTL = 1;

    static {
        LayoutCompat.INSTANCE = new LayoutCompat();
        LayoutCompat.DEFAULT_LAYOUT_ALIGNMENT = Layout.Alignment.ALIGN_NORMAL;
        TextDirectionHeuristic textDirectionHeuristic0 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        Intrinsics.checkNotNullExpressionValue(textDirectionHeuristic0, "FIRSTSTRONG_LTR");
        LayoutCompat.DEFAULT_TEXT_DIRECTION_HEURISTIC = textDirectionHeuristic0;
    }

    public final Layout.Alignment getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release() {
        return LayoutCompat.DEFAULT_LAYOUT_ALIGNMENT;
    }

    public final TextDirectionHeuristic getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release() {
        return LayoutCompat.DEFAULT_TEXT_DIRECTION_HEURISTIC;
    }
}

