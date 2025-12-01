package androidx.compose.ui.text.android;

import android.text.Layout.Alignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0006\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\bR\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/android/TextAlignmentAdapter;", "", "()V", "ALIGN_LEFT_FRAMEWORK", "Landroid/text/Layout$Alignment;", "ALIGN_RIGHT_FRAMEWORK", "get", "value", "", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextAlignmentAdapter {
    private static final Layout.Alignment ALIGN_LEFT_FRAMEWORK;
    private static final Layout.Alignment ALIGN_RIGHT_FRAMEWORK;
    public static final TextAlignmentAdapter INSTANCE;

    static {
        TextAlignmentAdapter.INSTANCE = new TextAlignmentAdapter();
        Layout.Alignment[] arr_layout$Alignment = Layout.Alignment.values();
        Layout.Alignment layout$Alignment0 = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment layout$Alignment1 = Layout.Alignment.ALIGN_NORMAL;
        int v = 0;
        while(v < arr_layout$Alignment.length) {
            Layout.Alignment layout$Alignment2 = arr_layout$Alignment[v];
            ++v;
            if(Intrinsics.areEqual(layout$Alignment2.name(), "ALIGN_LEFT")) {
                layout$Alignment0 = layout$Alignment2;
            }
            else if(Intrinsics.areEqual(layout$Alignment2.name(), "ALIGN_RIGHT")) {
                layout$Alignment1 = layout$Alignment2;
            }
        }
        TextAlignmentAdapter.ALIGN_LEFT_FRAMEWORK = layout$Alignment0;
        TextAlignmentAdapter.ALIGN_RIGHT_FRAMEWORK = layout$Alignment1;
    }

    public final Layout.Alignment get(int v) {
        switch(v) {
            case 0: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            case 1: {
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            case 2: {
                return Layout.Alignment.ALIGN_CENTER;
            }
            case 3: {
                return TextAlignmentAdapter.ALIGN_LEFT_FRAMEWORK;
            }
            case 4: {
                return TextAlignmentAdapter.ALIGN_RIGHT_FRAMEWORK;
            }
            default: {
                return Layout.Alignment.ALIGN_NORMAL;
            }
        }
    }
}

