package androidx.compose.ui.input.key;

import android.view.KeyEvent;
import androidx.compose.ui.Modifier.Element.DefaultImpls;
import androidx.compose.ui.Modifier.Element;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.ModifiedKeyInputNode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B4\u0012\u0014\u0010\u0002\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001B\u0010\u0011\u001A\u00020\u00052\u0006\u0010\u0012\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001A\u0010\b\u001A\u00020\tX\u0086.¢\u0006\u000E\n\u0000\u001A\u0004\b\n\u0010\u000B\"\u0004\b\f\u0010\rR\"\u0010\u0002\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\"\u0010\u0006\u001A\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003ø\u0001\u0000¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\u000F\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputModifier;", "Landroidx/compose/ui/Modifier$Element;", "onKeyEvent", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "onPreviewKeyEvent", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "keyInputNode", "Landroidx/compose/ui/node/ModifiedKeyInputNode;", "getKeyInputNode", "()Landroidx/compose/ui/node/ModifiedKeyInputNode;", "setKeyInputNode", "(Landroidx/compose/ui/node/ModifiedKeyInputNode;)V", "getOnKeyEvent", "()Lkotlin/jvm/functions/Function1;", "getOnPreviewKeyEvent", "processKeyInput", "keyEvent", "processKeyInput-ZmokQxo", "(Landroid/view/KeyEvent;)Z", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class KeyInputModifier implements Element {
    public ModifiedKeyInputNode keyInputNode;
    private final Function1 onKeyEvent;
    private final Function1 onPreviewKeyEvent;

    public KeyInputModifier(Function1 function10, Function1 function11) {
        this.onKeyEvent = function10;
        this.onPreviewKeyEvent = function11;
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

    public final ModifiedKeyInputNode getKeyInputNode() {
        ModifiedKeyInputNode modifiedKeyInputNode0 = this.keyInputNode;
        if(modifiedKeyInputNode0 != null) {
            return modifiedKeyInputNode0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyInputNode");
        throw null;
    }

    public final Function1 getOnKeyEvent() {
        return this.onKeyEvent;
    }

    public final Function1 getOnPreviewKeyEvent() {
        return this.onPreviewKeyEvent;
    }

    public final boolean processKeyInput-ZmokQxo(KeyEvent keyEvent0) {
        Intrinsics.checkNotNullParameter(keyEvent0, "keyEvent");
        ModifiedFocusNode modifiedFocusNode0 = this.getKeyInputNode().findPreviousFocusWrapper();
        ModifiedKeyInputNode modifiedKeyInputNode0 = null;
        if(modifiedFocusNode0 != null) {
            ModifiedFocusNode modifiedFocusNode1 = FocusTraversalKt.findActiveFocusNode(modifiedFocusNode0);
            if(modifiedFocusNode1 != null) {
                modifiedKeyInputNode0 = modifiedFocusNode1.findLastKeyInputWrapper();
            }
        }
        if(modifiedKeyInputNode0 == null) {
            throw new IllegalStateException("KeyEvent can\'t be processed because this key input node is not active.");
        }
        return modifiedKeyInputNode0.propagatePreviewKeyEvent-ZmokQxo(keyEvent0) ? true : modifiedKeyInputNode0.propagateKeyEvent-ZmokQxo(keyEvent0);
    }

    public final void setKeyInputNode(ModifiedKeyInputNode modifiedKeyInputNode0) {
        Intrinsics.checkNotNullParameter(modifiedKeyInputNode0, "<set-?>");
        this.keyInputNode = modifiedKeyInputNode0;
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }
}

