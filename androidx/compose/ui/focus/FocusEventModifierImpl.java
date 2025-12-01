package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0003\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u0005H\u0016R\u001D\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/focus/FocusEventModifierImpl;", "Landroidx/compose/ui/focus/FocusEventModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "onFocusEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusState;", "", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getOnFocusEvent", "()Lkotlin/jvm/functions/Function1;", "focusState", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FocusEventModifierImpl extends InspectorValueInfo implements FocusEventModifier {
    private final Function1 onFocusEvent;

    public FocusEventModifierImpl(Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(function10, "onFocusEvent");
        Intrinsics.checkNotNullParameter(function11, "inspectorInfo");
        super(function11);
        this.onFocusEvent = function10;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final Function1 getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override  // androidx.compose.ui.focus.FocusEventModifier
    public void onFocusEvent(FocusState focusState0) {
        Intrinsics.checkNotNullParameter(focusState0, "focusState");
        this.onFocusEvent.invoke(focusState0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

