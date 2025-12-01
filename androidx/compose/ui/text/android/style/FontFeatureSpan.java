package androidx.compose.ui.text.android.style;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016J\u0010\u0010\u000B\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/android/style/FontFeatureSpan;", "Landroid/text/style/MetricAffectingSpan;", "fontFeatureSettings", "", "(Ljava/lang/String;)V", "getFontFeatureSettings", "()Ljava/lang/String;", "updateDrawState", "", "textPaint", "Landroid/text/TextPaint;", "updateMeasureState", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FontFeatureSpan extends MetricAffectingSpan {
    private final String fontFeatureSettings;

    public FontFeatureSpan(String s) {
        Intrinsics.checkNotNullParameter(s, "fontFeatureSettings");
        super();
        this.fontFeatureSettings = s;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    @Override  // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        textPaint0.setFontFeatureSettings(this.fontFeatureSettings);
    }

    @Override  // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint0) {
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        textPaint0.setFontFeatureSettings(this.fontFeatureSettings);
    }
}

