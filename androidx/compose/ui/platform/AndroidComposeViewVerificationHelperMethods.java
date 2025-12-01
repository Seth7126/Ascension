package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewVerificationHelperMethods;", "", "()V", "focusable", "", "view", "Landroid/view/View;", "", "defaultFocusHighlightEnabled", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidComposeViewVerificationHelperMethods {
    public static final AndroidComposeViewVerificationHelperMethods INSTANCE;

    static {
        AndroidComposeViewVerificationHelperMethods.INSTANCE = new AndroidComposeViewVerificationHelperMethods();
    }

    public final void focusable(View view0, int v, boolean z) {
        Intrinsics.checkNotNullParameter(view0, "view");
        view0.setFocusable(v);
        view0.setDefaultFocusHighlightEnabled(z);
    }
}

