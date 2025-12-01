package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001A\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001A\u0010\u0003\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u0006\"\u0004\b\u000B\u0010\bR\u001A\u0010\f\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u0006\"\u0004\b\u000E\u0010\bR\u001A\u0010\u000F\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001A\u0010\u0012\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001A\u0010\u0015\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001A\u0010\u0018\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u0006\"\u0004\b\u001A\u0010\bR\u001A\u0010\u001B\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u0006\"\u0004\b\u001D\u0010\b¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/focus/FocusOrder;", "", "()V", "down", "Landroidx/compose/ui/focus/FocusRequester;", "getDown", "()Landroidx/compose/ui/focus/FocusRequester;", "setDown", "(Landroidx/compose/ui/focus/FocusRequester;)V", "end", "getEnd", "setEnd", "left", "getLeft", "setLeft", "next", "getNext", "setNext", "previous", "getPrevious", "setPrevious", "right", "getRight", "setRight", "start", "getStart", "setStart", "up", "getUp", "setUp", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FocusOrder {
    public static final int $stable = 8;
    private FocusRequester down;
    private FocusRequester end;
    private FocusRequester left;
    private FocusRequester next;
    private FocusRequester previous;
    private FocusRequester right;
    private FocusRequester start;
    private FocusRequester up;

    static {
    }

    public FocusOrder() {
        this.next = FocusRequester.Companion.getDefault();
        this.previous = FocusRequester.Companion.getDefault();
        this.up = FocusRequester.Companion.getDefault();
        this.down = FocusRequester.Companion.getDefault();
        this.left = FocusRequester.Companion.getDefault();
        this.right = FocusRequester.Companion.getDefault();
        this.start = FocusRequester.Companion.getDefault();
        this.end = FocusRequester.Companion.getDefault();
    }

    public final FocusRequester getDown() {
        return this.down;
    }

    public final FocusRequester getEnd() {
        return this.end;
    }

    public final FocusRequester getLeft() {
        return this.left;
    }

    public final FocusRequester getNext() {
        return this.next;
    }

    public final FocusRequester getPrevious() {
        return this.previous;
    }

    public final FocusRequester getRight() {
        return this.right;
    }

    public final FocusRequester getStart() {
        return this.start;
    }

    public final FocusRequester getUp() {
        return this.up;
    }

    public final void setDown(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.down = focusRequester0;
    }

    public final void setEnd(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.end = focusRequester0;
    }

    public final void setLeft(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.left = focusRequester0;
    }

    public final void setNext(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.next = focusRequester0;
    }

    public final void setPrevious(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.previous = focusRequester0;
    }

    public final void setRight(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.right = focusRequester0;
    }

    public final void setStart(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.start = focusRequester0;
    }

    public final void setUp(FocusRequester focusRequester0) {
        Intrinsics.checkNotNullParameter(focusRequester0, "<set-?>");
        this.up = focusRequester0;
    }
}

