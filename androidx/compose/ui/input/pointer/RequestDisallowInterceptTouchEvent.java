package androidx.compose.ui.input.pointer;

import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0011\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u0002H\u0096\u0002R\u001C\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "Lkotlin/Function1;", "", "", "()V", "pointerInteropFilter", "Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "getPointerInteropFilter$ui_release", "()Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "setPointerInteropFilter$ui_release", "(Landroidx/compose/ui/input/pointer/PointerInteropFilter;)V", "invoke", "disallowIntercept", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RequestDisallowInterceptTouchEvent implements Function1 {
    public static final int $stable = 8;
    private PointerInteropFilter pointerInteropFilter;

    static {
    }

    public final PointerInteropFilter getPointerInteropFilter$ui_release() {
        return this.pointerInteropFilter;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((Boolean)object0).booleanValue());
        return Unit.INSTANCE;
    }

    public void invoke(boolean z) {
        PointerInteropFilter pointerInteropFilter0 = this.pointerInteropFilter;
        if(pointerInteropFilter0 != null) {
            pointerInteropFilter0.setDisallowIntercept$ui_release(z);
        }
    }

    public final void setPointerInteropFilter$ui_release(PointerInteropFilter pointerInteropFilter0) {
        this.pointerInteropFilter = pointerInteropFilter0;
    }
}

