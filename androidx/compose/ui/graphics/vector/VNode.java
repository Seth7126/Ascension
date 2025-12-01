package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001A\u00020\u0005J\f\u0010\u000B\u001A\u00020\u0005*\u00020\fH&R\"\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u0090\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u0082\u0001\u0003\r\u000E\u000F¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/vector/VNode;", "", "()V", "invalidateListener", "Lkotlin/Function0;", "", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "invalidate", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Landroidx/compose/ui/graphics/vector/VectorComponent;", "Landroidx/compose/ui/graphics/vector/PathComponent;", "Landroidx/compose/ui/graphics/vector/GroupComponent;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public abstract class VNode {
    public static final int $stable = 8;
    private Function0 invalidateListener;

    static {
    }

    private VNode() {
    }

    public VNode(DefaultConstructorMarker defaultConstructorMarker0) {
    }

    public abstract void draw(DrawScope arg1);

    public Function0 getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        Function0 function00 = this.getInvalidateListener$ui_release();
        if(function00 != null) {
            function00.invoke();
        }
    }

    public void setInvalidateListener$ui_release(Function0 function00) {
        this.invalidateListener = function00;
    }
}

