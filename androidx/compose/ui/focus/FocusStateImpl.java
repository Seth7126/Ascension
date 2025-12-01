package androidx.compose.ui.focus;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0014\u0010\u0004\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/focus/FocusStateImpl;", "", "Landroidx/compose/ui/focus/FocusState;", "(Ljava/lang/String;I)V", "hasFocus", "", "getHasFocus", "()Z", "isCaptured", "isFocused", "Active", "ActiveParent", "Captured", "Disabled", "Inactive", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public enum FocusStateImpl implements FocusState {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            arr_v[FocusStateImpl.Captured.ordinal()] = 1;
            arr_v[FocusStateImpl.Active.ordinal()] = 2;
            arr_v[FocusStateImpl.ActiveParent.ordinal()] = 3;
            arr_v[FocusStateImpl.Inactive.ordinal()] = 4;
            arr_v[FocusStateImpl.Disabled.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    Active,
    ActiveParent,
    Captured,
    Disabled,
    Inactive;

    private static final FocusStateImpl[] $values() [...] // Inlined contents

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean getHasFocus() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 3: {
                return true;
            }
            case 1: 
            case 2: 
            case 4: 
            case 5: {
                return false;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean isCaptured() {
        switch(this) {
            case 1: {
                return true;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: {
                return false;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @Override  // androidx.compose.ui.focus.FocusState
    public boolean isFocused() {
        switch(WhenMappings.$EnumSwitchMapping$0[this.ordinal()]) {
            case 1: 
            case 2: {
                return true;
            }
            case 3: 
            case 4: 
            case 5: {
                return false;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}

