package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@InternalPlatformTextApi
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u001D\u0010\t\u001A\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000B\u0010\fR\u001B\u0010\u000F\u001A\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000E\u001A\u0004\b\u0011\u0010\u0012R\u001B\u0010\u0014\u001A\u00020\u00108FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000E\u001A\u0004\b\u0015\u0010\u0012¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/LayoutIntrinsics;", "", "charSequence", "", "textPaint", "Landroid/text/TextPaint;", "textDirectionHeuristic", "", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;I)V", "boringMetrics", "Landroid/text/BoringLayout$Metrics;", "getBoringMetrics", "()Landroid/text/BoringLayout$Metrics;", "boringMetrics$delegate", "Lkotlin/Lazy;", "maxIntrinsicWidth", "", "getMaxIntrinsicWidth", "()F", "maxIntrinsicWidth$delegate", "minIntrinsicWidth", "getMinIntrinsicWidth", "minIntrinsicWidth$delegate", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class LayoutIntrinsics {
    private final Lazy boringMetrics$delegate;
    private final Lazy maxIntrinsicWidth$delegate;
    private final Lazy minIntrinsicWidth$delegate;

    static {
    }

    public LayoutIntrinsics(CharSequence charSequence0, TextPaint textPaint0, int v) {
        Intrinsics.checkNotNullParameter(charSequence0, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint0, "textPaint");
        super();
        Function0 function00 = new Function0(charSequence0, textPaint0) {
            final CharSequence $charSequence;
            final int $textDirectionHeuristic;
            final TextPaint $textPaint;

            {
                this.$textDirectionHeuristic = v;
                this.$charSequence = charSequence0;
                this.$textPaint = textPaint0;
                super(0);
            }

            public final BoringLayout.Metrics invoke() {
                TextDirectionHeuristic textDirectionHeuristic0 = TextLayoutKt.getTextDirectionHeuristic(this.$textDirectionHeuristic);
                return BoringLayoutFactory.INSTANCE.measure(this.$charSequence, this.$textPaint, textDirectionHeuristic0);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.boringMetrics$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function00);
        Function0 function01 = new Function0(textPaint0) {
            final CharSequence $charSequence;
            final TextPaint $textPaint;

            {
                this.$charSequence = charSequence0;
                this.$textPaint = textPaint0;
                super(0);
            }

            public final float invoke() {
                return LayoutIntrinsicsKt.minIntrinsicWidth(this.$charSequence, this.$textPaint);
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.minIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function01);
        Function0 function02 = new Function0(charSequence0, textPaint0) {
            final CharSequence $charSequence;
            final TextPaint $textPaint;

            {
                LayoutIntrinsics.this = layoutIntrinsics0;
                this.$charSequence = charSequence0;
                this.$textPaint = textPaint0;
                super(0);
            }

            public final float invoke() {
                float f;
                BoringLayout.Metrics boringLayout$Metrics0 = LayoutIntrinsics.this.getBoringMetrics();
                Float float0 = boringLayout$Metrics0 == null ? null : ((float)boringLayout$Metrics0.width);
                if(float0 == null) {
                    int v = this.$charSequence.length();
                    f = Layout.getDesiredWidth(this.$charSequence, 0, v, this.$textPaint);
                    return LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(f, this.$charSequence, this.$textPaint) ? f + 0.5f : f;
                }
                f = (float)float0;
                return LayoutIntrinsicsKt.shouldIncreaseMaxIntrinsic(f, this.$charSequence, this.$textPaint) ? f + 0.5f : f;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.maxIntrinsicWidth$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, function02);
    }

    public final BoringLayout.Metrics getBoringMetrics() {
        return (BoringLayout.Metrics)this.boringMetrics$delegate.getValue();
    }

    public final float getMaxIntrinsicWidth() {
        return ((Number)this.maxIntrinsicWidth$delegate.getValue()).floatValue();
    }

    public final float getMinIntrinsicWidth() {
        return ((Number)this.minIntrinsicWidth$delegate.getValue()).floatValue();
    }
}

