package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016J\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u0012\u001A\u00020\nJ\u0006\u0010\u0013\u001A\u00020\nR\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/focus/FocusManagerImpl;", "Landroidx/compose/ui/focus/FocusManager;", "focusModifier", "Landroidx/compose/ui/focus/FocusModifier;", "(Landroidx/compose/ui/focus/FocusModifier;)V", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "clearFocus", "", "force", "", "moveFocus", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "moveFocus-3ESFkO8", "(I)Z", "releaseFocus", "takeFocus", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class FocusManagerImpl implements FocusManager {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            arr_v[FocusStateImpl.Active.ordinal()] = 1;
            arr_v[FocusStateImpl.ActiveParent.ordinal()] = 2;
            arr_v[FocusStateImpl.Captured.ordinal()] = 3;
            arr_v[FocusStateImpl.Disabled.ordinal()] = 4;
            arr_v[FocusStateImpl.Inactive.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private final FocusModifier focusModifier;

    public FocusManagerImpl() {
        this(null, 1, null);
    }

    public FocusManagerImpl(FocusModifier focusModifier0) {
        Intrinsics.checkNotNullParameter(focusModifier0, "focusModifier");
        super();
        this.focusModifier = focusModifier0;
    }

    public FocusManagerImpl(FocusModifier focusModifier0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            focusModifier0 = new FocusModifier(FocusStateImpl.Inactive, null, 2, null);
        }
        this(focusModifier0);
    }

    @Override  // androidx.compose.ui.focus.FocusManager
    public void clearFocus(boolean z) {
        boolean z1 = true;
        switch(this.focusModifier.getFocusState()) {
            case 1: 
            case 2: 
            case 3: {
                break;
            }
            case 4: 
            case 5: {
                z1 = false;
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        if(FocusTransactionsKt.clearFocus(this.focusModifier.getFocusNode(), z) && z1) {
            this.focusModifier.setFocusState(FocusStateImpl.Active);
        }
    }

    public final Modifier getModifier() {
        return this.focusModifier;
    }

    @Override  // androidx.compose.ui.focus.FocusManager
    public boolean moveFocus-3ESFkO8(int v) {
        return FocusTraversalKt.moveFocus-Mxy_nc0(this.focusModifier.getFocusNode(), v);
    }

    public final void releaseFocus() {
        FocusTransactionsKt.clearFocus(this.focusModifier.getFocusNode(), true);
    }

    public final void takeFocus() {
        if(this.focusModifier.getFocusState() == FocusStateImpl.Inactive) {
            this.focusModifier.setFocusState(FocusStateImpl.Active);
        }
    }
}

