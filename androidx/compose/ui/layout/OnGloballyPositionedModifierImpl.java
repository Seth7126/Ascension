package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B2\u0012\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0017\u0010\u0007\u001A\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nJ\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001A\u00020\u0012H\u0016J\u0010\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0014\u001A\u00020\u0005H\u0016R\u001D\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\f¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedModifierImpl;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "callback", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "", "inspectorInfo", "Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getCallback", "()Lkotlin/jvm/functions/Function1;", "equals", "", "other", "", "hashCode", "", "onGloballyPositioned", "coordinates", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class OnGloballyPositionedModifierImpl extends InspectorValueInfo implements OnGloballyPositionedModifier {
    private final Function1 callback;

    public OnGloballyPositionedModifierImpl(Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(function10, "callback");
        Intrinsics.checkNotNullParameter(function11, "inspectorInfo");
        super(function11);
        this.callback = function10;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof OnGloballyPositionedModifierImpl ? Intrinsics.areEqual(this.callback, ((OnGloballyPositionedModifierImpl)object0).callback) : false;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final Function1 getCallback() {
        return this.callback;
    }

    @Override
    public int hashCode() {
        return this.callback.hashCode();
    }

    @Override  // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(LayoutCoordinates layoutCoordinates0) {
        Intrinsics.checkNotNullParameter(layoutCoordinates0, "coordinates");
        this.callback.invoke(layoutCoordinates0);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

