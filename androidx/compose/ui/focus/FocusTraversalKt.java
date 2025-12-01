package androidx.compose.ui.focus;

import androidx.compose.ui.node.LayoutNodeWrapper;
import androidx.compose.ui.node.ModifiedFocusNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A)\u0010\u0002\u001A\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001A\u000E\u0010\u000B\u001A\u0004\u0018\u00010\u0004*\u00020\u0004H\u0000\u001A!\u0010\f\u001A\u00020\r*\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000F\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0010"}, d2 = {"invalidFocusDirection", "", "customFocusSearch", "Landroidx/compose/ui/focus/FocusRequester;", "Landroidx/compose/ui/node/ModifiedFocusNode;", "focusDirection", "Landroidx/compose/ui/focus/FocusDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "customFocusSearch--OM-vw8", "(Landroidx/compose/ui/node/ModifiedFocusNode;ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/focus/FocusRequester;", "findActiveFocusNode", "moveFocus", "", "moveFocus-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Z", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FocusTraversalKt {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;
        public static final int[] $EnumSwitchMapping$1;

        static {
            int[] arr_v = new int[LayoutDirection.values().length];
            arr_v[LayoutDirection.Rtl.ordinal()] = 1;
            arr_v[LayoutDirection.Ltr.ordinal()] = 2;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
            int[] arr_v1 = new int[FocusStateImpl.values().length];
            arr_v1[FocusStateImpl.Active.ordinal()] = 1;
            arr_v1[FocusStateImpl.Captured.ordinal()] = 2;
            arr_v1[FocusStateImpl.ActiveParent.ordinal()] = 3;
            arr_v1[FocusStateImpl.Inactive.ordinal()] = 4;
            arr_v1[FocusStateImpl.Disabled.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        }
    }

    private static final String invalidFocusDirection = "Invalid FocusDirection";

    private static final FocusRequester customFocusSearch--OM-vw8(ModifiedFocusNode modifiedFocusNode0, int v, LayoutDirection layoutDirection0) {
        FocusRequester focusRequester0;
        FocusOrder focusOrder0 = new FocusOrder();
        LayoutNodeWrapper layoutNodeWrapper0 = modifiedFocusNode0.getWrappedBy$ui_release();
        if(layoutNodeWrapper0 != null) {
            layoutNodeWrapper0.populateFocusOrder(focusOrder0);
        }
        if(FocusDirection.equals-impl0(v, 1)) {
            return focusOrder0.getNext();
        }
        if(FocusDirection.equals-impl0(v, 2)) {
            return focusOrder0.getPrevious();
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return focusOrder0.getUp();
        }
        if(FocusDirection.equals-impl0(v, 6)) {
            return focusOrder0.getDown();
        }
        if(FocusDirection.equals-impl0(v, 3)) {
            switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                case 1: {
                    focusRequester0 = focusOrder0.getEnd();
                    break;
                }
                case 2: {
                    focusRequester0 = focusOrder0.getStart();
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(Intrinsics.areEqual(focusRequester0, FocusRequester.Companion.getDefault())) {
                focusRequester0 = null;
            }
            return focusRequester0 == null ? focusOrder0.getLeft() : focusRequester0;
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                case 1: {
                    focusRequester0 = focusOrder0.getStart();
                    break;
                }
                case 2: {
                    focusRequester0 = focusOrder0.getEnd();
                    break;
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if(Intrinsics.areEqual(focusRequester0, FocusRequester.Companion.getDefault())) {
                focusRequester0 = null;
            }
            return focusRequester0 == null ? focusOrder0.getRight() : focusRequester0;
        }
        if(FocusDirection.equals-impl0(v, 7)) {
            return FocusRequester.Companion.getDefault();
        }
        if(!FocusDirection.equals-impl0(v, 8)) {
            throw new IllegalStateException("Invalid FocusDirection");
        }
        return FocusRequester.Companion.getDefault();
    }

    public static final ModifiedFocusNode findActiveFocusNode(ModifiedFocusNode modifiedFocusNode0) {
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "<this>");
        switch(modifiedFocusNode0.getFocusState()) {
            case 1: 
            case 2: {
                return modifiedFocusNode0;
            }
            case 3: {
                ModifiedFocusNode modifiedFocusNode1 = modifiedFocusNode0.getFocusedChild();
                return modifiedFocusNode1 == null ? null : FocusTraversalKt.findActiveFocusNode(modifiedFocusNode1);
            }
            case 4: 
            case 5: {
                return null;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static final boolean moveFocus-Mxy_nc0(ModifiedFocusNode modifiedFocusNode0, int v) {
        int v1;
        ModifiedFocusNode modifiedFocusNode2;
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "$this$moveFocus");
        LayoutDirection layoutDirection0 = LayoutDirection.Ltr;
        ModifiedFocusNode modifiedFocusNode1 = FocusTraversalKt.findActiveFocusNode(modifiedFocusNode0);
        if(modifiedFocusNode1 == null) {
            return false;
        }
        FocusRequester focusRequester0 = FocusTraversalKt.customFocusSearch--OM-vw8(modifiedFocusNode1, v, layoutDirection0);
        if(!Intrinsics.areEqual(focusRequester0, FocusRequester.Companion.getDefault())) {
            focusRequester0.requestFocus();
            return true;
        }
        if((FocusDirection.equals-impl0(v, 1) ? true : FocusDirection.equals-impl0(v, 2))) {
            modifiedFocusNode2 = null;
        }
        else {
            if((((FocusDirection.equals-impl0(v, 3) ? true : FocusDirection.equals-impl0(v, 4)) ? true : FocusDirection.equals-impl0(v, 5)) ? true : FocusDirection.equals-impl0(v, 6))) {
                modifiedFocusNode2 = TwoDimensionalFocusSearchKt.twoDimensionalFocusSearch-Mxy_nc0(modifiedFocusNode0, v);
                goto label_25;
            }
            if(FocusDirection.equals-impl0(v, 7)) {
                switch(WhenMappings.$EnumSwitchMapping$0[layoutDirection0.ordinal()]) {
                    case 1: {
                        v1 = 3;
                        break;
                    }
                    case 2: {
                        v1 = 4;
                        break;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                modifiedFocusNode2 = TwoDimensionalFocusSearchKt.twoDimensionalFocusSearch-Mxy_nc0(modifiedFocusNode1, v1);
            }
            else if(FocusDirection.equals-impl0(v, 8)) {
                modifiedFocusNode2 = modifiedFocusNode1.findParentFocusNode$ui_release();
            }
            else {
                throw new IllegalStateException("Invalid FocusDirection");
            }
        }
    label_25:
        if(modifiedFocusNode2 == null) {
            return false;
        }
        FocusTransactionsKt.requestFocus(modifiedFocusNode2, false);
        return true;
    }
}

