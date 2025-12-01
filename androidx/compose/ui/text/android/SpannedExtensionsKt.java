package androidx.compose.ui.text.android;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A\u0018\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0004H\u0000¨\u0006\u0005"}, d2 = {"hasSpan", "", "Landroid/text/Spanned;", "clazz", "Ljava/lang/Class;", "ui-text_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class SpannedExtensionsKt {
    public static final boolean hasSpan(Spanned spanned0, Class class0) {
        Intrinsics.checkNotNullParameter(spanned0, "<this>");
        Intrinsics.checkNotNullParameter(class0, "clazz");
        return spanned0.nextSpanTransition(-1, spanned0.length(), class0) != spanned0.length();
    }
}

