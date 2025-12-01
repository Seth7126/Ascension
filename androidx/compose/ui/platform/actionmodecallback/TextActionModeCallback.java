package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007\u0012\u0016\b\u0002\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007¢\u0006\u0002\u0010\u000BJ\u001A\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001D2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001FJ\u001A\u0010 \u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u001D2\b\u0010!\u001A\u0004\u0018\u00010\"J\u0006\u0010#\u001A\u00020\u0006J\u0006\u0010$\u001A\u00020\u001BR(\u0010\u0004\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR(\u0010\t\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000FR(\u0010\b\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000FR(\u0010\n\u001A\u0010\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000FR\u001A\u0010\u0002\u001A\u00020\u0003X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006%"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "onCopyRequested", "Lkotlin/Function0;", "", "Landroidx/compose/ui/platform/ActionCallback;", "onPasteRequested", "onCutRequested", "onSelectAllRequested", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getOnCopyRequested", "()Lkotlin/jvm/functions/Function0;", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "getOnCutRequested", "setOnCutRequested", "getOnPasteRequested", "setOnPasteRequested", "getOnSelectAllRequested", "setOnSelectAllRequested", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "onActionItemClicked", "", "mode", "Landroid/view/ActionMode;", "item", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "onPrepareActionMode", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TextActionModeCallback {
    private Function0 onCopyRequested;
    private Function0 onCutRequested;
    private Function0 onPasteRequested;
    private Function0 onSelectAllRequested;
    private Rect rect;

    public TextActionModeCallback() {
        this(null, null, null, null, null, 0x1F, null);
    }

    public TextActionModeCallback(Rect rect0, Function0 function00, Function0 function01, Function0 function02, Function0 function03) {
        Intrinsics.checkNotNullParameter(rect0, "rect");
        super();
        this.rect = rect0;
        this.onCopyRequested = function00;
        this.onPasteRequested = function01;
        this.onCutRequested = function02;
        this.onSelectAllRequested = function03;
    }

    public TextActionModeCallback(Rect rect0, Function0 function00, Function0 function01, Function0 function02, Function0 function03, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            rect0 = Rect.Companion.getZero();
        }
        this(rect0, ((v & 2) == 0 ? function00 : null), ((v & 4) == 0 ? function01 : null), ((v & 8) == 0 ? function02 : null), ((v & 16) == 0 ? function03 : null));
    }

    public final Function0 getOnCopyRequested() {
        return this.onCopyRequested;
    }

    public final Function0 getOnCutRequested() {
        return this.onCutRequested;
    }

    public final Function0 getOnPasteRequested() {
        return this.onPasteRequested;
    }

    public final Function0 getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(ActionMode actionMode0, MenuItem menuItem0) {
        Intrinsics.checkNotNull(menuItem0);
        switch(menuItem0.getItemId()) {
            case 0: {
                Function0 function00 = this.onCopyRequested;
                if(function00 != null) {
                    function00.invoke();
                }
                break;
            }
            case 1: {
                Function0 function01 = this.onPasteRequested;
                if(function01 != null) {
                    function01.invoke();
                }
                break;
            }
            case 2: {
                Function0 function02 = this.onCutRequested;
                if(function02 != null) {
                    function02.invoke();
                }
                break;
            }
            case 3: {
                Function0 function03 = this.onSelectAllRequested;
                if(function03 != null) {
                    function03.invoke();
                }
                break;
            }
            default: {
                return false;
            }
        }
        if(actionMode0 != null) {
            actionMode0.finish();
        }
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode0, Menu menu0) {
        if(menu0 == null || actionMode0 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if(this.onCopyRequested != null) {
            menu0.add(0, 0, 0, 0x1040001).setShowAsAction(1);
        }
        if(this.onPasteRequested != null) {
            menu0.add(0, 1, 1, 0x104000B).setShowAsAction(1);
        }
        if(this.onCutRequested != null) {
            menu0.add(0, 2, 2, 0x1040003).setShowAsAction(1);
        }
        if(this.onSelectAllRequested != null) {
            menu0.add(0, 3, 3, 0x104000D).setShowAsAction(1);
        }
        return true;
    }

    public final void onDestroyActionMode() {
    }

    public final boolean onPrepareActionMode() [...] // Inlined contents

    public final void setOnCopyRequested(Function0 function00) {
        this.onCopyRequested = function00;
    }

    public final void setOnCutRequested(Function0 function00) {
        this.onCutRequested = function00;
    }

    public final void setOnPasteRequested(Function0 function00) {
        this.onPasteRequested = function00;
    }

    public final void setOnSelectAllRequested(Function0 function00) {
        this.onSelectAllRequested = function00;
    }

    public final void setRect(Rect rect0) {
        Intrinsics.checkNotNullParameter(rect0, "<set-?>");
        this.rect = rect0;
    }
}

