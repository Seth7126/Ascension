package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0001\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u0010\u0010\u000B\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\f\u0010\f\u001A\u00020\b*\u00020\nH\u0002R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/android/style/LetterSpacingSpanPx;", "Landroid/text/style/MetricAffectingSpan;", "letterSpacing", "", "(F)V", "getLetterSpacing", "()F", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "updateMeasureState", "updatePaint", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LetterSpacingSpanPx extends MetricAffectingSpan {
    private final float letterSpacing;

    public LetterSpacingSpanPx(float f) {
        this.letterSpacing = f;
    }

    public final float getLetterSpacing() {
        return this.letterSpacing;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        this.updatePaint(textPaint0);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        this.updatePaint(textPaint0);
    }

    private final void updatePaint(TextPaint textPaint0) {
        float f = textPaint0.getTextSize() * textPaint0.getTextScaleX();
        if(f != 0.0f) {
            textPaint0.setLetterSpacing(this.letterSpacing / f);
        }
    }
}

