package androidx.compose.ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.compose.ui.text.android.InternalPlatformTextApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001(B5\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\u0005¢\u0006\u0002\u0010\nJR\u0010\u0018\u001A\u00020\u00192\u0006\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001D2\u0006\u0010\u001E\u001A\u00020\u00052\u0006\u0010\u001F\u001A\u00020\u00052\u0006\u0010 \u001A\u00020\u00032\u0006\u0010!\u001A\u00020\u00052\u0006\u0010\"\u001A\u00020\u00052\u0006\u0010#\u001A\u00020\u00052\u0006\u0010$\u001A\u00020%H\u0016J4\u0010&\u001A\u00020\u00052\u0006\u0010$\u001A\u00020%2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001D2\u0006\u0010\u001E\u001A\u00020\u00052\u0006\u0010\u001F\u001A\u00020\u00052\b\u0010\'\u001A\u0004\u0018\u00010\fH\u0017R\u001E\u0010\r\u001A\u00020\f2\u0006\u0010\u000B\u001A\u00020\f@BX\u0086.¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u000E\u0010\u0006\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\u00058F@BX\u0086\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u000E\u0010\u0007\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0013\u001A\u00020\u0014X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0015\u0010\u0012R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0016\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\u00058F@BX\u0086\u000E¢\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0012R\u000E\u0010\u0004\u001A\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan;", "Landroid/text/style/ReplacementSpan;", "width", "", "widthUnit", "", "height", "heightUnit", "pxPerSp", "verticalAlign", "(FIFIFI)V", "<set-?>", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetrics", "getFontMetrics", "()Landroid/graphics/Paint$FontMetricsInt;", "heightPx", "getHeightPx", "()I", "isLaidOut", "", "getVerticalAlign", "widthPx", "getWidthPx", "draw", "", "canvas", "Landroid/graphics/Canvas;", "text", "", "start", "end", "x", "top", "y", "bottom", "paint", "Landroid/graphics/Paint;", "getSize", "fm", "Companion", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PlaceholderSpan extends ReplacementSpan {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u000E\u000FB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion;", "", "()V", "ALIGN_ABOVE_BASELINE", "", "ALIGN_BOTTOM", "ALIGN_CENTER", "ALIGN_TEXT_BOTTOM", "ALIGN_TEXT_CENTER", "ALIGN_TEXT_TOP", "ALIGN_TOP", "UNIT_EM", "UNIT_SP", "UNIT_UNSPECIFIED", "Unit", "VerticalAlign", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        @Retention(RetentionPolicy.SOURCE)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion$Unit;", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface Unit {
        }

        @Retention(RetentionPolicy.SOURCE)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/android/style/PlaceholderSpan$Companion$VerticalAlign;", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface VerticalAlign {
        }

        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int ALIGN_ABOVE_BASELINE = 0;
    public static final int ALIGN_BOTTOM = 2;
    public static final int ALIGN_CENTER = 3;
    public static final int ALIGN_TEXT_BOTTOM = 5;
    public static final int ALIGN_TEXT_CENTER = 6;
    public static final int ALIGN_TEXT_TOP = 4;
    public static final int ALIGN_TOP = 1;
    public static final Companion Companion = null;
    public static final int UNIT_EM = 1;
    public static final int UNIT_SP = 0;
    public static final int UNIT_UNSPECIFIED = 2;
    private Paint.FontMetricsInt fontMetrics;
    private final float height;
    private int heightPx;
    private final int heightUnit;
    private boolean isLaidOut;
    private final float pxPerSp;
    private final int verticalAlign;
    private final float width;
    private int widthPx;
    private final int widthUnit;

    static {
        PlaceholderSpan.Companion = new Companion(null);
    }

    public PlaceholderSpan(float f, int v, float f1, int v1, float f2, int v2) {
        this.width = f;
        this.widthUnit = v;
        this.height = f1;
        this.heightUnit = v1;
        this.pxPerSp = f2;
        this.verticalAlign = v2;
    }

    @Override  // android.text.style.ReplacementSpan
    public void draw(Canvas canvas0, CharSequence charSequence0, int v, int v1, float f, int v2, int v3, int v4, Paint paint0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(paint0, "paint");
    }

    public final Paint.FontMetricsInt getFontMetrics() {
        Paint.FontMetricsInt paint$FontMetricsInt0 = this.fontMetrics;
        if(paint$FontMetricsInt0 != null) {
            return paint$FontMetricsInt0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fontMetrics");
        throw null;
    }

    public final int getHeightPx() {
        if(!this.isLaidOut) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.heightPx;
    }

    @Override  // android.text.style.ReplacementSpan
    public int getSize(Paint paint0, CharSequence charSequence0, int v, int v1, Paint.FontMetricsInt paint$FontMetricsInt0) {
        int v2;
        float f1;
        Intrinsics.checkNotNullParameter(paint0, "paint");
        this.isLaidOut = true;
        float f = paint0.getTextSize();
        Paint.FontMetricsInt paint$FontMetricsInt1 = paint0.getFontMetricsInt();
        Intrinsics.checkNotNullExpressionValue(paint$FontMetricsInt1, "paint.fontMetricsInt");
        this.fontMetrics = paint$FontMetricsInt1;
        if(this.getFontMetrics().descent <= this.getFontMetrics().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        switch(this.widthUnit) {
            case 0: {
                f1 = this.width * this.pxPerSp;
                break;
            }
            case 1: {
                f1 = this.width * f;
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported unit.");
            }
        }
        this.widthPx = PlaceholderSpanKt.ceilToInt(f1);
        switch(this.heightUnit) {
            case 0: {
                v2 = PlaceholderSpanKt.ceilToInt(this.height * this.pxPerSp);
                break;
            }
            case 1: {
                v2 = PlaceholderSpanKt.ceilToInt(this.height * f);
                break;
            }
            default: {
                throw new IllegalArgumentException("Unsupported unit.");
            }
        }
        this.heightPx = v2;
        if(paint$FontMetricsInt0 != null) {
            paint$FontMetricsInt0.ascent = this.getFontMetrics().ascent;
            paint$FontMetricsInt0.descent = this.getFontMetrics().descent;
            paint$FontMetricsInt0.leading = this.getFontMetrics().leading;
            switch(this.getVerticalAlign()) {
                case 0: {
                    if(paint$FontMetricsInt0.ascent > -this.getHeightPx()) {
                        paint$FontMetricsInt0.ascent = -this.getHeightPx();
                    }
                    break;
                }
                case 1: 
                case 4: {
                    if(paint$FontMetricsInt0.ascent + this.getHeightPx() > paint$FontMetricsInt0.descent) {
                        paint$FontMetricsInt0.descent = paint$FontMetricsInt0.ascent + this.getHeightPx();
                    }
                    break;
                }
                case 2: 
                case 5: {
                    if(paint$FontMetricsInt0.ascent > paint$FontMetricsInt0.descent - this.getHeightPx()) {
                        paint$FontMetricsInt0.ascent = paint$FontMetricsInt0.descent - this.getHeightPx();
                    }
                    break;
                }
                case 3: 
                case 6: {
                    if(paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent < this.getHeightPx()) {
                        paint$FontMetricsInt0.ascent -= (this.getHeightPx() - (paint$FontMetricsInt0.descent - paint$FontMetricsInt0.ascent)) / 2;
                        paint$FontMetricsInt0.descent = paint$FontMetricsInt0.ascent + this.getHeightPx();
                    }
                    break;
                }
                default: {
                    throw new IllegalArgumentException("Unknown verticalAlign.");
                }
            }
            paint$FontMetricsInt0.top = Math.min(this.getFontMetrics().top, paint$FontMetricsInt0.ascent);
            paint$FontMetricsInt0.bottom = Math.max(this.getFontMetrics().bottom, paint$FontMetricsInt0.descent);
        }
        return this.getWidthPx();
    }

    public final int getVerticalAlign() {
        return this.verticalAlign;
    }

    public final int getWidthPx() {
        if(!this.isLaidOut) {
            throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
        }
        return this.widthPx;
    }
}

