package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0017\u0010\u0003\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u0012\u0017\u0010\b\u001A\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\nJ\u0010\u0010\r\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\u0005H\u0016R\"\u0010\u0003\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderModifierImpl;", "Landroidx/compose/ui/focus/FocusOrderModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "focusOrderReceiver", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getFocusOrderReceiver", "()Lkotlin/jvm/functions/Function1;", "populateFocusOrder", "focusOrder", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FocusOrderModifierImpl extends InspectorValueInfo implements FocusOrderModifier {
    private final Function1 focusOrderReceiver;

    public FocusOrderModifierImpl(Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(function10, "focusOrderReceiver");
        Intrinsics.checkNotNullParameter(function11, "inspectorInfo");
        super(function11);
        this.focusOrderReceiver = function10;
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

    public final Function1 getFocusOrderReceiver() {
        return this.focusOrderReceiver;
    }

    @Override  // androidx.compose.ui.focus.FocusOrderModifier
    public void populateFocusOrder(FocusOrder focusOrder0) {
        Intrinsics.checkNotNullParameter(focusOrder0, "focusOrder");
        this.focusOrderReceiver.invoke(focusOrder0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

