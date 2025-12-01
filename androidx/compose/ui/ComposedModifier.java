package androidx.compose.ui;

import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B<\u0012\u0017\u0010\u0003\u001A\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007\u0012\u001C\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0002\b\n¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\u000BR)\u0010\b\u001A\u0018\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\u0002\b\n¢\u0006\u0002\b\u0007¢\u0006\n\n\u0002\u0010\u000E\u001A\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/ComposedModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "factory", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "getFactory", "()Lkotlin/jvm/functions/Function3;", "Lkotlin/jvm/functions/Function3;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class ComposedModifier extends InspectorValueInfo implements Element {
    private final Function3 factory;

    public ComposedModifier(Function1 function10, Function3 function30) {
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        Intrinsics.checkNotNullParameter(function30, "factory");
        super(function10);
        this.factory = function30;
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

    public final Function3 getFactory() {
        return this.factory;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

