package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u001F\b\u0002\u0018\u00002\u00020\u0001B\u00A5\u0001\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u000B\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u000E\u001A\u00020\u0005\u0012\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001A\u00020\u0005\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u0012\u0006\u0010\u0014\u001A\u00020\u0013\u0012\u0006\u0010\u0015\u001A\u00020\u0005\u0012\u0006\u0010\u0016\u001A\u00020\u0017\u0012\u0006\u0010\u0018\u001A\u00020\u0017\u0012\u0006\u0010\u0019\u001A\u00020\u0005\u0012\u0006\u0010\u001A\u001A\u00020\u0005\u0012\b\u0010\u001B\u001A\u0004\u0018\u00010\u001C\u0012\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u00A2\u0006\u0002\u0010\u001ER\u0011\u0010\f\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010 R\u0011\u0010\u0019\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\"R\u0013\u0010\u000F\u001A\u0004\u0018\u00010\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010$R\u0011\u0010\u0011\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010\"R\u0011\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b&\u0010\"R\u0011\u0010\u001A\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010\"R\u0011\u0010\u0016\u001A\u00020\u0017\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010)R\u0011\u0010\u0015\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010\"R\u0013\u0010\u001B\u001A\u0004\u0018\u00010\u001C\u00A2\u0006\b\n\u0000\u001A\u0004\b+\u0010,R\u0011\u0010\u0014\u001A\u00020\u0013\u00A2\u0006\b\n\u0000\u001A\u0004\b-\u0010.R\u0011\u0010\u0012\u001A\u00020\u0013\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u0010.R\u0011\u0010\u000E\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b0\u0010\"R\u0011\u0010\u0007\u001A\u00020\b\u00A2\u0006\b\n\u0000\u001A\u0004\b1\u00102R\u0013\u0010\u001D\u001A\u0004\u0018\u00010\u001C\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u0010,R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b4\u0010\"R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u00106R\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b7\u00108R\u0011\u0010\u0018\u001A\u00020\u0017\u00A2\u0006\b\n\u0000\u001A\u0004\b9\u0010)R\u0011\u0010\t\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b:\u0010\"\u00A8\u0006;"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutParams;", "", "text", "", "start", "", "end", "paint", "Landroid/text/TextPaint;", "width", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "hyphenationFrequency", "leftIndents", "", "rightIndents", "(Ljava/lang/CharSequence;IILandroid/text/TextPaint;ILandroid/text/TextDirectionHeuristic;Landroid/text/Layout$Alignment;ILandroid/text/TextUtils$TruncateAt;IFFIZZII[I[I)V", "getAlignment", "()Landroid/text/Layout$Alignment;", "getBreakStrategy", "()I", "getEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "getEllipsizedWidth", "getEnd", "getHyphenationFrequency", "getIncludePadding", "()Z", "getJustificationMode", "getLeftIndents", "()[I", "getLineSpacingExtra", "()F", "getLineSpacingMultiplier", "getMaxLines", "getPaint", "()Landroid/text/TextPaint;", "getRightIndents", "getStart", "getText", "()Ljava/lang/CharSequence;", "getTextDir", "()Landroid/text/TextDirectionHeuristic;", "getUseFallbackLineSpacing", "getWidth", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class StaticLayoutParams {
    private final Layout.Alignment alignment;
    private final int breakStrategy;
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int end;
    private final int hyphenationFrequency;
    private final boolean includePadding;
    private final int justificationMode;
    private final int[] leftIndents;
    private final float lineSpacingExtra;
    private final float lineSpacingMultiplier;
    private final int maxLines;
    private final TextPaint paint;
    private final int[] rightIndents;
    private final int start;
    private final CharSequence text;
    private final TextDirectionHeuristic textDir;
    private final boolean useFallbackLineSpacing;
    private final int width;

    public StaticLayoutParams(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int[] arr_v, int[] arr_v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(textPaint0, "paint");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic0, "textDir");
        Intrinsics.checkNotNullParameter(layout$Alignment0, "alignment");
        super();
        this.text = charSequence0;
        this.start = v;
        this.end = v1;
        this.paint = textPaint0;
        this.width = v2;
        this.textDir = textDirectionHeuristic0;
        this.alignment = layout$Alignment0;
        this.maxLines = v3;
        this.ellipsize = textUtils$TruncateAt0;
        this.ellipsizedWidth = v4;
        this.lineSpacingMultiplier = f;
        this.lineSpacingExtra = f1;
        this.justificationMode = v5;
        this.includePadding = z;
        this.useFallbackLineSpacing = z1;
        this.breakStrategy = v6;
        this.hyphenationFrequency = v7;
        this.leftIndents = arr_v;
        this.rightIndents = arr_v1;
        if(v < 0 || v > v1 || (v1 < 0 || v1 > charSequence0.length()) || v3 < 0 || v2 < 0 || (v4 < 0 || f < 0.0f)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public StaticLayoutParams(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int[] arr_v, int[] arr_v1, int v8, DefaultConstructorMarker defaultConstructorMarker0) {
        this(charSequence0, ((v8 & 2) == 0 ? v : 0), v1, textPaint0, v2, textDirectionHeuristic0, layout$Alignment0, v3, textUtils$TruncateAt0, v4, f, f1, v5, z, z1, v6, v7, arr_v, arr_v1);
    }

    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final TextPaint getPaint() {
        return this.paint;
    }

    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    public final int getStart() {
        return this.start;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    public final int getWidth() {
        return this.width;
    }
}

