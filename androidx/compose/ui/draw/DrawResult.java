package androidx.compose.ui.draw;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B \b\u0000\u0012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0002\u0010\u0007R+\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u000B"}, d2 = {"Landroidx/compose/ui/draw/DrawResult;", "", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)V", "getBlock$ui_release", "()Lkotlin/jvm/functions/Function1;", "setBlock$ui_release", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DrawResult {
    public static final int $stable = 8;
    private Function1 block;

    static {
    }

    public DrawResult(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "block");
        super();
        this.block = function10;
    }

    public final Function1 getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.block = function10;
    }
}

