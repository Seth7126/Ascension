package androidx.compose.ui.text.android;

import android.text.StaticLayout.Builder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory26;", "", "()V", "setJustificationMode", "", "builder", "Landroid/text/StaticLayout$Builder;", "justificationMode", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class StaticLayoutFactory26 {
    public static final StaticLayoutFactory26 INSTANCE;

    static {
        StaticLayoutFactory26.INSTANCE = new StaticLayoutFactory26();
    }

    public final void setJustificationMode(StaticLayout.Builder staticLayout$Builder0, int v) {
        Intrinsics.checkNotNullParameter(staticLayout$Builder0, "builder");
        staticLayout$Builder0.setJustificationMode(v);
    }
}

