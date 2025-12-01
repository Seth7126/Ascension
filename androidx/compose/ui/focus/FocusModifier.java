package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier.Element.DefaultImpls;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0019\b\u0002\u0010\u0005\u001A\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0002\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0086.¢\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\u0004X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001C\u0010\u0016\u001A\u0004\u0018\u00010\fX\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u000E\"\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/focus/FocusModifier;", "Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "initialFocus", "Landroidx/compose/ui/focus/FocusStateImpl;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/focus/FocusStateImpl;Lkotlin/jvm/functions/Function1;)V", "focusNode", "Landroidx/compose/ui/node/ModifiedFocusNode;", "getFocusNode", "()Landroidx/compose/ui/node/ModifiedFocusNode;", "setFocusNode", "(Landroidx/compose/ui/node/ModifiedFocusNode;)V", "focusState", "getFocusState", "()Landroidx/compose/ui/focus/FocusStateImpl;", "setFocusState", "(Landroidx/compose/ui/focus/FocusStateImpl;)V", "focusedChild", "getFocusedChild", "setFocusedChild", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FocusModifier extends InspectorValueInfo implements Element {
    public ModifiedFocusNode focusNode;
    private FocusStateImpl focusState;
    private ModifiedFocusNode focusedChild;

    public FocusModifier(FocusStateImpl focusStateImpl0, Function1 function10) {
        Intrinsics.checkNotNullParameter(focusStateImpl0, "initialFocus");
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        super(function10);
        this.focusState = focusStateImpl0;
    }

    public FocusModifier(FocusStateImpl focusStateImpl0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            function10 = InspectableValueKt.getNoInspectorInfo();
        }
        this(focusStateImpl0, function10);
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

    public final ModifiedFocusNode getFocusNode() {
        ModifiedFocusNode modifiedFocusNode0 = this.focusNode;
        if(modifiedFocusNode0 != null) {
            return modifiedFocusNode0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusNode");
        throw null;
    }

    public final FocusStateImpl getFocusState() {
        return this.focusState;
    }

    public final ModifiedFocusNode getFocusedChild() {
        return this.focusedChild;
    }

    public final void setFocusNode(ModifiedFocusNode modifiedFocusNode0) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "<set-?>");
        this.focusNode = modifiedFocusNode0;
    }

    public final void setFocusState(FocusStateImpl focusStateImpl0) {
        Intrinsics.checkNotNullParameter(focusStateImpl0, "<set-?>");
        this.focusState = focusStateImpl0;
    }

    public final void setFocusedChild(ModifiedFocusNode modifiedFocusNode0) {
        this.focusedChild = modifiedFocusNode0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

