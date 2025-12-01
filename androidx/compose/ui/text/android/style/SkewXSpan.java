package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u0010\u0010\u000B\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/style/SkewXSpan;", "Landroid/text/style/MetricAffectingSpan;", "skewX", "", "(F)V", "getSkewX", "()F", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "updateMeasureState", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class SkewXSpan extends MetricAffectingSpan {
    private final float skewX;

    public SkewXSpan(float f) {
        this.skewX = f;
    }

    public final float getSkewX() {
        return this.skewX;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        float f = textPaint0.getTextSkewX();
        textPaint0.setTextSkewX(this.skewX + f);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        float f = textPaint0.getTextSkewX();
        textPaint0.setTextSkewX(this.skewX + f);
    }
}

