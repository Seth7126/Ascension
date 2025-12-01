package androidx.compose.ui;

import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bç\u0080\u0001\u0018\u0000 \u000B2\u00020\u0001:\u0003\u000B\f\rJ-\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\bH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/Alignment;", "", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "Companion", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface Alignment {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u001C\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\u001C\u0010\b\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\n\u0010\u0002\u001A\u0004\b\u000B\u0010\fR\u001C\u0010\r\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u000E\u0010\u0002\u001A\u0004\b\u000F\u0010\fR\u001C\u0010\u0010\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0011\u0010\u0002\u001A\u0004\b\u0012\u0010\fR\u001C\u0010\u0013\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0014\u0010\u0002\u001A\u0004\b\u0015\u0010\fR\u001C\u0010\u0016\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001A\u0004\b\u0018\u0010\fR\u001C\u0010\u0019\u001A\u00020\u001A8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u001B\u0010\u0002\u001A\u0004\b\u001C\u0010\u001DR\u001C\u0010\u001E\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\u001F\u0010\u0002\u001A\u0004\b \u0010\fR\u001C\u0010!\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b\"\u0010\u0002\u001A\u0004\b#\u0010\u0007R\u001C\u0010$\u001A\u00020\u001A8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b%\u0010\u0002\u001A\u0004\b&\u0010\u001DR\u001C\u0010\'\u001A\u00020\u001A8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b(\u0010\u0002\u001A\u0004\b)\u0010\u001DR\u001C\u0010*\u001A\u00020\u00048\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b+\u0010\u0002\u001A\u0004\b,\u0010\u0007R\u001C\u0010-\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b.\u0010\u0002\u001A\u0004\b/\u0010\fR\u001C\u00100\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b1\u0010\u0002\u001A\u0004\b2\u0010\fR\u001C\u00103\u001A\u00020\t8\u0006X\u0087\u0004\u00A2\u0006\u000E\n\u0000\u0012\u0004\b4\u0010\u0002\u001A\u0004\b5\u0010\f\u00A8\u00066"}, d2 = {"Landroidx/compose/ui/Alignment$Companion;", "", "()V", "Bottom", "Landroidx/compose/ui/Alignment$Vertical;", "getBottom$annotations", "getBottom", "()Landroidx/compose/ui/Alignment$Vertical;", "BottomCenter", "Landroidx/compose/ui/Alignment;", "getBottomCenter$annotations", "getBottomCenter", "()Landroidx/compose/ui/Alignment;", "BottomEnd", "getBottomEnd$annotations", "getBottomEnd", "BottomStart", "getBottomStart$annotations", "getBottomStart", "Center", "getCenter$annotations", "getCenter", "CenterEnd", "getCenterEnd$annotations", "getCenterEnd", "CenterHorizontally", "Landroidx/compose/ui/Alignment$Horizontal;", "getCenterHorizontally$annotations", "getCenterHorizontally", "()Landroidx/compose/ui/Alignment$Horizontal;", "CenterStart", "getCenterStart$annotations", "getCenterStart", "CenterVertically", "getCenterVertically$annotations", "getCenterVertically", "End", "getEnd$annotations", "getEnd", "Start", "getStart$annotations", "getStart", "Top", "getTop$annotations", "getTop", "TopCenter", "getTopCenter$annotations", "getTopCenter", "TopEnd", "getTopEnd$annotations", "getTopEnd", "TopStart", "getTopStart$annotations", "getTopStart", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;
        private static final Vertical Bottom;
        private static final Alignment BottomCenter;
        private static final Alignment BottomEnd;
        private static final Alignment BottomStart;
        private static final Alignment Center;
        private static final Alignment CenterEnd;
        private static final Horizontal CenterHorizontally;
        private static final Alignment CenterStart;
        private static final Vertical CenterVertically;
        private static final Horizontal End;
        private static final Horizontal Start;
        private static final Vertical Top;
        private static final Alignment TopCenter;
        private static final Alignment TopEnd;
        private static final Alignment TopStart;

        static {
            Companion.$$INSTANCE = new Companion();
            Companion.TopStart = new BiasAlignment(-1.0f, -1.0f);
            Companion.TopCenter = new BiasAlignment(0.0f, -1.0f);
            Companion.TopEnd = new BiasAlignment(1.0f, -1.0f);
            Companion.CenterStart = new BiasAlignment(-1.0f, 0.0f);
            Companion.Center = new BiasAlignment(0.0f, 0.0f);
            Companion.CenterEnd = new BiasAlignment(1.0f, 0.0f);
            Companion.BottomStart = new BiasAlignment(-1.0f, 1.0f);
            Companion.BottomCenter = new BiasAlignment(0.0f, 1.0f);
            Companion.BottomEnd = new BiasAlignment(1.0f, 1.0f);
            Companion.Top = new androidx.compose.ui.BiasAlignment.Vertical(-1.0f);
            Companion.CenterVertically = new androidx.compose.ui.BiasAlignment.Vertical(0.0f);
            Companion.Bottom = new androidx.compose.ui.BiasAlignment.Vertical(1.0f);
            Companion.Start = new androidx.compose.ui.BiasAlignment.Horizontal(-1.0f);
            Companion.CenterHorizontally = new androidx.compose.ui.BiasAlignment.Horizontal(0.0f);
            Companion.End = new androidx.compose.ui.BiasAlignment.Horizontal(1.0f);
        }

        public final Vertical getBottom() {
            return Companion.Bottom;
        }

        public static void getBottom$annotations() {
        }

        public final Alignment getBottomCenter() {
            return Companion.BottomCenter;
        }

        public static void getBottomCenter$annotations() {
        }

        public final Alignment getBottomEnd() {
            return Companion.BottomEnd;
        }

        public static void getBottomEnd$annotations() {
        }

        public final Alignment getBottomStart() {
            return Companion.BottomStart;
        }

        public static void getBottomStart$annotations() {
        }

        public final Alignment getCenter() {
            return Companion.Center;
        }

        public static void getCenter$annotations() {
        }

        public final Alignment getCenterEnd() {
            return Companion.CenterEnd;
        }

        public static void getCenterEnd$annotations() {
        }

        public final Horizontal getCenterHorizontally() {
            return Companion.CenterHorizontally;
        }

        public static void getCenterHorizontally$annotations() {
        }

        public final Alignment getCenterStart() {
            return Companion.CenterStart;
        }

        public static void getCenterStart$annotations() {
        }

        public final Vertical getCenterVertically() {
            return Companion.CenterVertically;
        }

        public static void getCenterVertically$annotations() {
        }

        public final Horizontal getEnd() {
            return Companion.End;
        }

        public static void getEnd$annotations() {
        }

        public final Horizontal getStart() {
            return Companion.Start;
        }

        public static void getStart$annotations() {
        }

        public final Vertical getTop() {
            return Companion.Top;
        }

        public static void getTop$annotations() {
        }

        public final Alignment getTopCenter() {
            return Companion.TopCenter;
        }

        public static void getTopCenter$annotations() {
        }

        public final Alignment getTopEnd() {
            return Companion.TopEnd;
        }

        public static void getTopEnd$annotations() {
        }

        public final Alignment getTopStart() {
            return Companion.TopStart;
        }

        public static void getTopStart$annotations() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bç\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0007H&¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Alignment$Horizontal;", "", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface Horizontal {
        int align(int arg1, int arg2, LayoutDirection arg3);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0003H&¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/Alignment$Vertical;", "", "align", "", "size", "space", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public interface Vertical {
        int align(int arg1, int arg2);
    }

    public static final Companion Companion;

    static {
        Alignment.Companion = Companion.$$INSTANCE;
    }

    long align-KFBX0sM(long arg1, long arg2, LayoutDirection arg3);
}

