package androidx.compose.ui.text.android;

import android.text.BoringLayout.Metrics;
import android.text.BoringLayout;
import android.text.Layout.Alignment;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JP\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\u000E2\b\b\u0002\u0010\u000F\u001A\u00020\u00102\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001A\u00020\nJ\"\u0010\u0014\u001A\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001A\u00020\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/BoringLayoutFactory;", "", "()V", "create", "Landroid/text/BoringLayout;", "text", "", "paint", "Landroid/text/TextPaint;", "width", "", "metrics", "Landroid/text/BoringLayout$Metrics;", "alignment", "Landroid/text/Layout$Alignment;", "includePadding", "", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "measure", "textDir", "Landroid/text/TextDirectionHeuristic;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class BoringLayoutFactory {
    public static final BoringLayoutFactory INSTANCE;

    static {
        BoringLayoutFactory.INSTANCE = new BoringLayoutFactory();
    }

    public final BoringLayout create(CharSequence charSequence0, TextPaint textPaint0, int v, BoringLayout.Metrics boringLayout$Metrics0, Layout.Alignment layout$Alignment0, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(textPaint0, "paint");
        Intrinsics.checkNotNullParameter(boringLayout$Metrics0, "metrics");
        Intrinsics.checkNotNullParameter(layout$Alignment0, "alignment");
        if(v < 0 || v1 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return textUtils$TruncateAt0 == null ? new BoringLayout(charSequence0, textPaint0, v, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z) : new BoringLayout(charSequence0, textPaint0, v, layout$Alignment0, 1.0f, 0.0f, boringLayout$Metrics0, z, textUtils$TruncateAt0, v1);
    }

    public static BoringLayout create$default(BoringLayoutFactory boringLayoutFactory0, CharSequence charSequence0, TextPaint textPaint0, int v, BoringLayout.Metrics boringLayout$Metrics0, Layout.Alignment layout$Alignment0, boolean z, TextUtils.TruncateAt textUtils$TruncateAt0, int v1, int v2, Object object0) {
        Layout.Alignment layout$Alignment1 = (v2 & 16) == 0 ? layout$Alignment0 : Layout.Alignment.ALIGN_NORMAL;
        boolean z1 = (v2 & 0x20) == 0 ? z : true;
        TextUtils.TruncateAt textUtils$TruncateAt1 = (v2 & 0x40) == 0 ? textUtils$TruncateAt0 : null;
        return (v2 & 0x80) == 0 ? boringLayoutFactory0.create(charSequence0, textPaint0, v, boringLayout$Metrics0, layout$Alignment1, z1, textUtils$TruncateAt1, v1) : boringLayoutFactory0.create(charSequence0, textPaint0, v, boringLayout$Metrics0, layout$Alignment1, z1, textUtils$TruncateAt1, v);
    }

    public final BoringLayout.Metrics measure(CharSequence charSequence0, TextPaint textPaint0, TextDirectionHeuristic textDirectionHeuristic0) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic0, "textDir");
        return textDirectionHeuristic0.isRtl(charSequence0, 0, charSequence0.length()) ? null : BoringLayout.isBoring(charSequence0, textPaint0, null);
    }
}

