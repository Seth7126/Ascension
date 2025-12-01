package androidx.compose.ui;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007R\u001C\u0010\b\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\t\u0010\u0002\u001A\u0004\b\n\u0010\u0007R\u001C\u0010\u000B\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\f\u0010\u0002\u001A\u0004\b\r\u0010\u0007R\u001C\u0010\u000E\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u000F\u0010\u0002\u001A\u0004\b\u0010\u0010\u0007R\u001C\u0010\u0011\u001A\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0013\u0010\u0002\u001A\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0016\u001A\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0017\u0010\u0002\u001A\u0004\b\u0018\u0010\u0015R\u001C\u0010\u0019\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u001A\u0010\u0002\u001A\u0004\b\u001B\u0010\u0007R\u001C\u0010\u001C\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u001D\u0010\u0002\u001A\u0004\b\u001E\u0010\u0007¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/AbsoluteAlignment;", "", "()V", "BottomLeft", "Landroidx/compose/ui/Alignment;", "getBottomLeft$annotations", "getBottomLeft", "()Landroidx/compose/ui/Alignment;", "BottomRight", "getBottomRight$annotations", "getBottomRight", "CenterLeft", "getCenterLeft$annotations", "getCenterLeft", "CenterRight", "getCenterRight$annotations", "getCenterRight", "Left", "Landroidx/compose/ui/Alignment$Horizontal;", "getLeft$annotations", "getLeft", "()Landroidx/compose/ui/Alignment$Horizontal;", "Right", "getRight$annotations", "getRight", "TopLeft", "getTopLeft$annotations", "getTopLeft", "TopRight", "getTopRight$annotations", "getTopRight", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AbsoluteAlignment {
    public static final int $stable;
    private static final Alignment BottomLeft;
    private static final Alignment BottomRight;
    private static final Alignment CenterLeft;
    private static final Alignment CenterRight;
    public static final AbsoluteAlignment INSTANCE;
    private static final Horizontal Left;
    private static final Horizontal Right;
    private static final Alignment TopLeft;
    private static final Alignment TopRight;

    static {
        AbsoluteAlignment.INSTANCE = new AbsoluteAlignment();
        AbsoluteAlignment.TopLeft = new BiasAbsoluteAlignment(-1.0f, -1.0f);
        AbsoluteAlignment.TopRight = new BiasAbsoluteAlignment(1.0f, -1.0f);
        AbsoluteAlignment.CenterLeft = new BiasAbsoluteAlignment(-1.0f, 0.0f);
        AbsoluteAlignment.CenterRight = new BiasAbsoluteAlignment(1.0f, 0.0f);
        AbsoluteAlignment.BottomLeft = new BiasAbsoluteAlignment(-1.0f, 1.0f);
        AbsoluteAlignment.BottomRight = new BiasAbsoluteAlignment(1.0f, 1.0f);
        AbsoluteAlignment.Left = new androidx.compose.ui.BiasAbsoluteAlignment.Horizontal(-1.0f);
        AbsoluteAlignment.Right = new androidx.compose.ui.BiasAbsoluteAlignment.Horizontal(1.0f);
    }

    public final Alignment getBottomLeft() {
        return AbsoluteAlignment.BottomLeft;
    }

    public static void getBottomLeft$annotations() {
    }

    public final Alignment getBottomRight() {
        return AbsoluteAlignment.BottomRight;
    }

    public static void getBottomRight$annotations() {
    }

    public final Alignment getCenterLeft() {
        return AbsoluteAlignment.CenterLeft;
    }

    public static void getCenterLeft$annotations() {
    }

    public final Alignment getCenterRight() {
        return AbsoluteAlignment.CenterRight;
    }

    public static void getCenterRight$annotations() {
    }

    public final Horizontal getLeft() {
        return AbsoluteAlignment.Left;
    }

    public static void getLeft$annotations() {
    }

    public final Horizontal getRight() {
        return AbsoluteAlignment.Right;
    }

    public static void getRight$annotations() {
    }

    public final Alignment getTopLeft() {
        return AbsoluteAlignment.TopLeft;
    }

    public static void getTopLeft$annotations() {
    }

    public final Alignment getTopRight() {
        return AbsoluteAlignment.TopRight;
    }

    public static void getTopRight$annotations() {
    }
}

