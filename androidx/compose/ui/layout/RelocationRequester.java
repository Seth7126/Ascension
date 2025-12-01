package androidx.compose.ui.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;

@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001A\u00020\tR\u001A\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/layout/RelocationRequester;", "", "()V", "modifiers", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/ui/layout/RelocationRequesterModifier;", "getModifiers$ui_release", "()Landroidx/compose/runtime/collection/MutableVector;", "bringIntoView", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RelocationRequester {
    public static final int $stable;
    private final MutableVector modifiers;

    static {
        RelocationRequester.$stable = MutableVector.$stable;
    }

    public RelocationRequester() {
        this.modifiers = new MutableVector(new RelocationRequesterModifier[16], 0);
    }

    public final void bringIntoView() {
        MutableVector mutableVector0 = this.modifiers;
        int v = mutableVector0.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector0.getContent();
            int v1 = 0;
            while(true) {
                ((RelocationRequesterModifier)arr_object[v1]).bringIntoView();
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
    }

    public final MutableVector getModifiers$ui_release() {
        return this.modifiers;
    }
}

