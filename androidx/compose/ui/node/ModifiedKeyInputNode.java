package androidx.compose.ui.node;

import android.view.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001A\u00020\u0000H\u0016J\b\u0010\b\u001A\u00020\u0000H\u0016J\u001B\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u000E\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/node/ModifiedKeyInputNode;", "Landroidx/compose/ui/node/DelegatingLayoutNodeWrapper;", "Landroidx/compose/ui/input/key/KeyInputModifier;", "wrapped", "Landroidx/compose/ui/node/LayoutNodeWrapper;", "modifier", "(Landroidx/compose/ui/node/LayoutNodeWrapper;Landroidx/compose/ui/input/key/KeyInputModifier;)V", "findNextKeyInputWrapper", "findPreviousKeyInputWrapper", "propagateKeyEvent", "", "keyEvent", "Landroidx/compose/ui/input/key/KeyEvent;", "propagateKeyEvent-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "propagatePreviewKeyEvent", "propagatePreviewKeyEvent-ZmokQxo", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ModifiedKeyInputNode extends DelegatingLayoutNodeWrapper {
    public ModifiedKeyInputNode(LayoutNodeWrapper layoutNodeWrapper0, KeyInputModifier keyInputModifier0) {
        Intrinsics.checkNotNullParameter(layoutNodeWrapper0, "wrapped");
        Intrinsics.checkNotNullParameter(keyInputModifier0, "modifier");
        super(layoutNodeWrapper0, keyInputModifier0);
        keyInputModifier0.setKeyInputNode(this);
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public ModifiedKeyInputNode findNextKeyInputWrapper() {
        return this;
    }

    @Override  // androidx.compose.ui.node.DelegatingLayoutNodeWrapper
    public ModifiedKeyInputNode findPreviousKeyInputWrapper() {
        return this;
    }

    public final boolean propagateKeyEvent-ZmokQxo(KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "keyEvent");
        Function1 function10 = ((KeyInputModifier)this.getModifier()).getOnKeyEvent();
        Boolean boolean0 = function10 == null ? null : ((Boolean)function10.invoke(androidx.compose.ui.input.key.KeyEvent.box-impl(keyEvent0)));
        if(Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
            return boolean0.booleanValue();
        }
        ModifiedKeyInputNode modifiedKeyInputNode0 = this.findParentKeyInputNode$ui_release();
        return modifiedKeyInputNode0 == null ? false : modifiedKeyInputNode0.propagateKeyEvent-ZmokQxo(keyEvent0);
    }

    public final boolean propagatePreviewKeyEvent-ZmokQxo(KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "keyEvent");
        ModifiedKeyInputNode modifiedKeyInputNode0 = this.findParentKeyInputNode$ui_release();
        Boolean boolean0 = modifiedKeyInputNode0 == null ? null : Boolean.valueOf(modifiedKeyInputNode0.propagatePreviewKeyEvent-ZmokQxo(keyEvent0));
        if(Intrinsics.areEqual(boolean0, Boolean.TRUE)) {
            return boolean0.booleanValue();
        }
        Function1 function10 = ((KeyInputModifier)this.getModifier()).getOnPreviewKeyEvent();
        if(function10 != null) {
            Boolean boolean1 = (Boolean)function10.invoke(androidx.compose.ui.input.key.KeyEvent.box-impl(keyEvent0));
            return boolean1 == null ? false : boolean1.booleanValue();
        }
        return false;
    }
}

