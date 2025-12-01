package androidx.compose.ui.platform;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.Context;
import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\b2\u0006\u0010\t\u001A\u00020\nH\u0002J\u0014\u0010\u000B\u001A\u0004\u0018\u00010\n2\b\u0010\f\u001A\u0004\u0018\u00010\bH\u0002J\n\u0010\r\u001A\u0004\u0018\u00010\nH\u0016J\u0006\u0010\u000E\u001A\u00020\u000FJ\u0010\u0010\u0010\u001A\u00020\u00112\u0006\u0010\t\u001A\u00020\nH\u0016R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/platform/AndroidClipboardManager;", "Landroidx/compose/ui/platform/ClipboardManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "clipboardManager", "Landroid/content/ClipboardManager;", "convertAnnotatedStringToCharSequence", "", "annotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "convertCharSequenceToAnnotatedString", "charSequence", "getText", "hasText", "", "setText", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidClipboardManager implements ClipboardManager {
    private final android.content.ClipboardManager clipboardManager;

    public AndroidClipboardManager(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        Object object0 = context0.getSystemService("clipboard");
        if(object0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        this.clipboardManager = (android.content.ClipboardManager)object0;
    }

    private final CharSequence convertAnnotatedStringToCharSequence(AnnotatedString annotatedString0) {
        return annotatedString0.getText();
    }

    private final AnnotatedString convertCharSequenceToAnnotatedString(CharSequence charSequence0) {
        return charSequence0 == null ? null : new AnnotatedString(charSequence0.toString(), null, null, 6, null);
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    public AnnotatedString getText() {
        if(this.clipboardManager.hasPrimaryClip()) {
            ClipData clipData0 = this.clipboardManager.getPrimaryClip();
            Intrinsics.checkNotNull(clipData0);
            return this.convertCharSequenceToAnnotatedString(clipData0.getItemAt(0).getText());
        }
        return null;
    }

    public final boolean hasText() {
        ClipDescription clipDescription0 = this.clipboardManager.getPrimaryClipDescription();
        return clipDescription0 == null ? false : clipDescription0.hasMimeType("text/plain");
    }

    @Override  // androidx.compose.ui.platform.ClipboardManager
    public void setText(AnnotatedString annotatedString0) {
        Intrinsics.checkNotNullParameter(annotatedString0, "annotatedString");
        ClipData clipData0 = ClipData.newPlainText("plain text", this.convertAnnotatedStringToCharSequence(annotatedString0));
        this.clipboardManager.setPrimaryClip(clipData0);
    }
}

