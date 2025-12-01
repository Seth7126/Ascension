package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000F\b\u0004\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\b\t\n¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "canLoadSynchronously", "", "(Z)V", "getCanLoadSynchronously", "()Z", "Companion", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class FontFamily {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001A\u00020\b¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nR\u0011\u0010\u000B\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u0006R\u0011\u0010\u000F\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "()V", "Cursive", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getCursive", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Default", "Landroidx/compose/ui/text/font/SystemFontFamily;", "getDefault", "()Landroidx/compose/ui/text/font/SystemFontFamily;", "Monospace", "getMonospace", "SansSerif", "getSansSerif", "Serif", "getSerif", "ui-text_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }
    }

    public static final Companion Companion;
    private static final GenericFontFamily Cursive;
    private static final SystemFontFamily Default;
    private static final GenericFontFamily Monospace;
    private static final GenericFontFamily SansSerif;
    private static final GenericFontFamily Serif;
    private final boolean canLoadSynchronously;

    static {
        FontFamily.Companion = new Companion(null);
        FontFamily.Default = new DefaultFontFamily();
        FontFamily.SansSerif = new GenericFontFamily("sans-serif");
        FontFamily.Serif = new GenericFontFamily("serif");
        FontFamily.Monospace = new GenericFontFamily("monospace");
        FontFamily.Cursive = new GenericFontFamily("cursive");
    }

    private FontFamily(boolean z) {
        this.canLoadSynchronously = z;
    }

    public FontFamily(boolean z, DefaultConstructorMarker defaultConstructorMarker0) {
        this(z);
    }

    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }
}

