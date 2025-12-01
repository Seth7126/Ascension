package androidx.compose.ui.focus;

import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u001A\f\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\u0016\u0010\u0003\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u0001H\u0000\u001A\f\u0010\u0005\u001A\u00020\u0001*\u00020\u0002H\u0000\u001A\u0014\u0010\u0006\u001A\u00020\u0007*\u00020\u00022\u0006\u0010\b\u001A\u00020\u0001H\u0002\u001A\u0016\u0010\t\u001A\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u0001H\u0000\u001A\u001C\u0010\n\u001A\u00020\u0001*\u00020\u00022\u0006\u0010\u000B\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0001H\u0002\u001A\f\u0010\f\u001A\u00020\u0001*\u00020\u0002H\u0002¨\u0006\r"}, d2 = {"captureFocus", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "clearFocus", "forcedClear", "freeFocus", "grantFocus", "", "propagateFocus", "requestFocus", "requestFocusForChild", "childNode", "requestFocusForOwner", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FocusTransactionsKt {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            arr_v[FocusStateImpl.Active.ordinal()] = 1;
            arr_v[FocusStateImpl.Captured.ordinal()] = 2;
            arr_v[FocusStateImpl.Disabled.ordinal()] = 3;
            arr_v[FocusStateImpl.ActiveParent.ordinal()] = 4;
            arr_v[FocusStateImpl.Inactive.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final boolean captureFocus(ModifiedFocusNode modifiedFocusNode0) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "<this>");
        int v = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode0.getFocusState().ordinal()];
        if(v != 1) {
            return v == 2;
        }
        modifiedFocusNode0.setFocusState(FocusStateImpl.Captured);
        return true;
    }

    public static final boolean clearFocus(ModifiedFocusNode modifiedFocusNode0, boolean z) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "<this>");
        switch(modifiedFocusNode0.getFocusState()) {
            case 1: {
                modifiedFocusNode0.setFocusState(FocusStateImpl.Inactive);
                break;
            }
            case 2: {
                if(z) {
                    modifiedFocusNode0.setFocusState(FocusStateImpl.Inactive);
                    return true;
                }
                return false;
            }
            case 4: {
                ModifiedFocusNode modifiedFocusNode1 = modifiedFocusNode0.getFocusedChild();
                if(modifiedFocusNode1 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if(FocusTransactionsKt.clearFocus(modifiedFocusNode1, z)) {
                    modifiedFocusNode0.setFocusState(FocusStateImpl.Inactive);
                    modifiedFocusNode0.setFocusedChild(null);
                    return true;
                }
                return false;
            }
            case 3: 
            case 5: {
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }

    public static boolean clearFocus$default(ModifiedFocusNode modifiedFocusNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return FocusTransactionsKt.clearFocus(modifiedFocusNode0, z);
    }

    public static final boolean freeFocus(ModifiedFocusNode modifiedFocusNode0) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "<this>");
        int v = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode0.getFocusState().ordinal()];
        if(v != 1) {
            if(v != 2) {
                return false;
            }
            modifiedFocusNode0.setFocusState(FocusStateImpl.Active);
        }
        return true;
    }

    private static final void grantFocus(ModifiedFocusNode modifiedFocusNode0, boolean z) {
        ModifiedFocusNode modifiedFocusNode1 = (ModifiedFocusNode)CollectionsKt.firstOrNull(modifiedFocusNode0.focusableChildren());
        if(modifiedFocusNode1 != null && z) {
            modifiedFocusNode0.setFocusState(FocusStateImpl.ActiveParent);
            modifiedFocusNode0.setFocusedChild(modifiedFocusNode1);
            FocusTransactionsKt.grantFocus(modifiedFocusNode1, true);
            return;
        }
        modifiedFocusNode0.setFocusState(FocusStateImpl.Active);
    }

    public static final void requestFocus(ModifiedFocusNode modifiedFocusNode0, boolean z) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "<this>");
        switch(modifiedFocusNode0.getFocusState()) {
            case 1: 
            case 2: 
            case 3: {
                modifiedFocusNode0.sendOnFocusEvent(modifiedFocusNode0.getFocusState());
                break;
            }
            case 4: {
                ModifiedFocusNode modifiedFocusNode2 = modifiedFocusNode0.getFocusedChild();
                if(modifiedFocusNode2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if(z) {
                    modifiedFocusNode0.sendOnFocusEvent(modifiedFocusNode0.getFocusState());
                    return;
                }
                if(FocusTransactionsKt.clearFocus$default(modifiedFocusNode2, false, 1, null)) {
                    FocusTransactionsKt.grantFocus(modifiedFocusNode0, false);
                    modifiedFocusNode0.setFocusedChild(null);
                    return;
                }
                break;
            }
            case 5: {
                ModifiedFocusNode modifiedFocusNode1 = modifiedFocusNode0.findParentFocusNode$ui_release();
                if(modifiedFocusNode1 != null) {
                    FocusTransactionsKt.requestFocusForChild(modifiedFocusNode1, modifiedFocusNode0, z);
                    return;
                }
                else if(FocusTransactionsKt.requestFocusForOwner(modifiedFocusNode0)) {
                    FocusTransactionsKt.grantFocus(modifiedFocusNode0, z);
                    return;
                }
                break;
            }
        }
    }

    public static void requestFocus$default(ModifiedFocusNode modifiedFocusNode0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        FocusTransactionsKt.requestFocus(modifiedFocusNode0, z);
    }

    private static final boolean requestFocusForChild(ModifiedFocusNode modifiedFocusNode0, ModifiedFocusNode modifiedFocusNode1, boolean z) {
        if(modifiedFocusNode0.focusableChildren().contains(modifiedFocusNode1)) {
            switch(modifiedFocusNode0.getFocusState()) {
                case 1: {
                    modifiedFocusNode0.setFocusState(FocusStateImpl.ActiveParent);
                    modifiedFocusNode0.setFocusedChild(modifiedFocusNode1);
                    FocusTransactionsKt.grantFocus(modifiedFocusNode1, z);
                    return true;
                }
                case 2: {
                    return false;
                }
                case 3: {
                    throw new IllegalStateException("non root FocusNode needs a focusable parent");
                }
                case 4: {
                    ModifiedFocusNode modifiedFocusNode3 = modifiedFocusNode0.getFocusedChild();
                    if(modifiedFocusNode3 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    if(FocusTransactionsKt.clearFocus$default(modifiedFocusNode3, false, 1, null)) {
                        modifiedFocusNode0.setFocusedChild(modifiedFocusNode1);
                        FocusTransactionsKt.grantFocus(modifiedFocusNode1, z);
                        return true;
                    }
                    return false;
                }
                case 5: {
                    ModifiedFocusNode modifiedFocusNode2 = modifiedFocusNode0.findParentFocusNode$ui_release();
                    if(modifiedFocusNode2 == null) {
                        if(!FocusTransactionsKt.requestFocusForOwner(modifiedFocusNode0)) {
                            return false;
                        }
                        modifiedFocusNode0.setFocusState(FocusStateImpl.Active);
                        return FocusTransactionsKt.requestFocusForChild(modifiedFocusNode0, modifiedFocusNode1, z);
                    }
                    return FocusTransactionsKt.requestFocusForChild(modifiedFocusNode2, modifiedFocusNode0, false) ? FocusTransactionsKt.requestFocusForChild(modifiedFocusNode0, modifiedFocusNode1, z) : false;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        throw new IllegalStateException("Non child node cannot request focus.");
    }

    private static final boolean requestFocusForOwner(ModifiedFocusNode modifiedFocusNode0) {
        Owner owner0 = modifiedFocusNode0.getLayoutNode$ui_release().getOwner$ui_release();
        if(owner0 == null) {
            throw new IllegalArgumentException("Owner not initialized.");
        }
        return owner0.requestFocus();
    }
}

