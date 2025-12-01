package androidx.compose.ui.text.android;

import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÄ\u0001\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\n2\b\b\u0002\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\n2\b\b\u0002\u0010\u000F\u001A\u00020\u00102\b\b\u0002\u0010\u0011\u001A\u00020\u00122\b\b\u0003\u0010\u0013\u001A\u00020\n2\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00152\b\b\u0003\u0010\u0016\u001A\u00020\n2\b\b\u0003\u0010\u0017\u001A\u00020\u00182\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\n2\b\b\u0002\u0010\u001B\u001A\u00020\u001C2\b\b\u0002\u0010\u001D\u001A\u00020\u001C2\b\b\u0002\u0010\u001E\u001A\u00020\n2\b\b\u0002\u0010\u001F\u001A\u00020\n2\n\b\u0002\u0010 \u001A\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010!R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory;", "", "()V", "delegate", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "create", "Landroid/text/StaticLayout;", "text", "", "start", "", "end", "paint", "Landroid/text/TextPaint;", "width", "textDir", "Landroid/text/TextDirectionHeuristic;", "alignment", "Landroid/text/Layout$Alignment;", "maxLines", "ellipsize", "Landroid/text/TextUtils$TruncateAt;", "ellipsizedWidth", "lineSpacingMultiplier", "", "lineSpacingExtra", "justificationMode", "includePadding", "", "useFallbackLineSpacing", "breakStrategy", "hyphenationFrequency", "leftIndents", "", "rightIndents", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class StaticLayoutFactory {
    public static final StaticLayoutFactory INSTANCE;
    private static final StaticLayoutFactoryImpl delegate;

    static {
        StaticLayoutFactory.INSTANCE = new StaticLayoutFactory();
        StaticLayoutFactoryImpl staticLayoutFactoryImpl0 = Build.VERSION.SDK_INT >= 23 ? new StaticLayoutFactory23() : new StaticLayoutFactoryPre21();
        StaticLayoutFactory.delegate = staticLayoutFactoryImpl0;
    }

    public final StaticLayout create(CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int[] arr_v, int[] arr_v1) {
        Intrinsics.checkNotNullParameter(charSequence0, "text");
        Intrinsics.checkNotNullParameter(textPaint0, "paint");
        Intrinsics.checkNotNullParameter(textDirectionHeuristic0, "textDir");
        Intrinsics.checkNotNullParameter(layout$Alignment0, "alignment");
        StaticLayoutParams staticLayoutParams0 = new StaticLayoutParams(charSequence0, v, v1, textPaint0, v2, textDirectionHeuristic0, layout$Alignment0, v3, textUtils$TruncateAt0, v4, f, f1, v5, z, z1, v6, v7, arr_v, arr_v1);
        return StaticLayoutFactory.delegate.create(staticLayoutParams0);
    }

    public static StaticLayout create$default(StaticLayoutFactory staticLayoutFactory0, CharSequence charSequence0, int v, int v1, TextPaint textPaint0, int v2, TextDirectionHeuristic textDirectionHeuristic0, Layout.Alignment layout$Alignment0, int v3, TextUtils.TruncateAt textUtils$TruncateAt0, int v4, float f, float f1, int v5, boolean z, boolean z1, int v6, int v7, int[] arr_v, int[] arr_v1, int v8, Object object0) {
        int v9 = (v8 & 2) == 0 ? v : 0;
        int v10 = (v8 & 4) == 0 ? v1 : charSequence0.length();
        TextDirectionHeuristic textDirectionHeuristic1 = (v8 & 0x20) == 0 ? textDirectionHeuristic0 : LayoutCompat.INSTANCE.getDEFAULT_TEXT_DIRECTION_HEURISTIC$ui_text_release();
        Layout.Alignment layout$Alignment1 = (v8 & 0x40) == 0 ? layout$Alignment0 : LayoutCompat.INSTANCE.getDEFAULT_LAYOUT_ALIGNMENT$ui_text_release();
        int v11 = (v8 & 0x80) == 0 ? v3 : 0x7FFFFFFF;
        TextUtils.TruncateAt textUtils$TruncateAt1 = (v8 & 0x100) == 0 ? textUtils$TruncateAt0 : null;
        int v12 = (v8 & 0x200) == 0 ? v4 : v2;
        float f2 = (v8 & 0x400) == 0 ? f : 1.0f;
        float f3 = (v8 & 0x800) == 0 ? f1 : 0.0f;
        int v13 = (v8 & 0x1000) == 0 ? v5 : 0;
        boolean z2 = (v8 & 0x2000) == 0 ? z : true;
        boolean z3 = (v8 & 0x4000) == 0 ? z1 : true;
        int v14 = (0x8000 & v8) == 0 ? v6 : 0;
        int v15 = (0x10000 & v8) == 0 ? v7 : 0;
        int[] arr_v2 = (0x20000 & v8) == 0 ? arr_v : null;
        return (v8 & 0x40000) == 0 ? staticLayoutFactory0.create(charSequence0, v9, v10, textPaint0, v2, textDirectionHeuristic1, layout$Alignment1, v11, textUtils$TruncateAt1, v12, f2, f3, v13, z2, z3, v14, v15, arr_v2, arr_v1) : staticLayoutFactory0.create(charSequence0, v9, v10, textPaint0, v2, textDirectionHeuristic1, layout$Alignment1, v11, textUtils$TruncateAt1, v12, f2, f3, v13, z2, z3, v14, v15, arr_v2, null);
    }
}

