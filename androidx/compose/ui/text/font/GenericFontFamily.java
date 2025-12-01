package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000F\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/font/GenericFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class GenericFontFamily extends SystemFontFamily {
    private final String name;

    public GenericFontFamily(String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        super(null);
        this.name = s;
    }

    public final String getName() {
        return this.name;
    }
}

