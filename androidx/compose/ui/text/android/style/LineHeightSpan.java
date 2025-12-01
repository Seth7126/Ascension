package androidx.compose.ui.text.android.style;

import android.graphics.Paint.FontMetricsInt;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J8\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u000E\u001A\u00020\u000FH\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/android/style/LineHeightSpan;", "Landroid/text/style/LineHeightSpan;", "lineHeight", "", "(I)V", "getLineHeight", "()I", "chooseHeight", "", "text", "", "start", "end", "spanstartVertical", "fontMetricsInt", "Landroid/graphics/Paint$FontMetricsInt;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LineHeightSpan implements android.text.style.LineHeightSpan {
    private final int lineHeight;

    public LineHeightSpan(int v) {
        this.lineHeight = v;
    }

    @Override  // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence charSequence0, int v, int v1, int v2, int v3, Paint.FontMetricsInt paint$FontMetricsInt0) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(paint$FontMetricsInt0, "fontMetricsInt");
        int v4 = paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent;
        if(v4 <= 0) {
            return;
        }
        paint$FontMetricsInt0.descent = (int)Math.ceil(((double)paint$FontMetricsInt0.descent) * ((double)(((float)this.lineHeight) * 1.0f / ((float)v4))));
        paint$FontMetricsInt0.ascent = paint$FontMetricsInt0.descent - this.lineHeight;
    }

    public final int getLineHeight() {
        return this.lineHeight;
    }
}

