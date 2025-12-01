package androidx.compose.ui.focus;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\u001A5\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u001A5\u0010\r\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\f\u001A\f\u0010\u0012\u001A\u00020\u0006*\u00020\u0006H\u0002\u001A1\u0010\u0013\u001A\u0004\u0018\u00010\u0014*\b\u0012\u0004\u0012\u00020\u00140\u00152\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\nH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001A\f\u0010\u0019\u001A\u00020\u0006*\u00020\u0006H\u0002\u001A#\u0010\u001A\u001A\u0004\u0018\u00010\u0014*\u00020\u00142\u0006\u0010\t\u001A\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001B\u0010\u001C\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"invalidFocusDirection", "", "noActiveChild", "beamBeats", "", "source", "Landroidx/compose/ui/geometry/Rect;", "rect1", "rect2", "direction", "Landroidx/compose/ui/focus/FocusDirection;", "beamBeats-I7lrPNg", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;I)Z", "isBetterCandidate", "proposedCandidate", "currentCandidate", "focusedRect", "isBetterCandidate-I7lrPNg", "bottomRight", "findBestCandidate", "Landroidx/compose/ui/node/ModifiedFocusNode;", "", "focusRect", "findBestCandidate-4WY_MpI", "(Ljava/util/List;Landroidx/compose/ui/geometry/Rect;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "topLeft", "twoDimensionalFocusSearch", "twoDimensionalFocusSearch-Mxy_nc0", "(Landroidx/compose/ui/node/ModifiedFocusNode;I)Landroidx/compose/ui/node/ModifiedFocusNode;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class TwoDimensionalFocusSearchKt {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[FocusStateImpl.values().length];
            arr_v[FocusStateImpl.Inactive.ordinal()] = 1;
            arr_v[FocusStateImpl.Disabled.ordinal()] = 2;
            arr_v[FocusStateImpl.ActiveParent.ordinal()] = 3;
            arr_v[FocusStateImpl.Active.ordinal()] = 4;
            arr_v[FocusStateImpl.Captured.ordinal()] = 5;
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    private static final String invalidFocusDirection = "This function should only be used for 2-D focus search";
    private static final String noActiveChild = "ActiveParent must have a focusedChild";

    // 去混淆评级： 低(30)
    private static final boolean beamBeats-I7lrPNg(Rect rect0, Rect rect1, Rect rect2, int v) {
        if(!TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$inSourceBeam(rect2, v, rect0) && TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$inSourceBeam(rect1, v, rect0)) {
            return TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$isInDirectionOfSearch(rect2, v, rect0) ? FocusDirection.equals-impl0(v, 3) || FocusDirection.equals-impl0(v, 4) || TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistance-2(rect1, v, rect0) < TwoDimensionalFocusSearchKt.beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(rect2, v, rect0) : true;
        }
        return false;
    }

    // 去混淆评级： 低(32)
    private static final boolean beamBeats_I7lrPNg$inSourceBeam(Rect rect0, int v, Rect rect1) {
        if((FocusDirection.equals-impl0(v, 3) ? true : FocusDirection.equals-impl0(v, 4))) {
            return rect0.getBottom() > rect1.getTop() && rect0.getTop() < rect1.getBottom();
        }
        if(!(FocusDirection.equals-impl0(v, 5) ? true : FocusDirection.equals-impl0(v, 6))) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return rect0.getRight() > rect1.getLeft() && rect0.getLeft() < rect1.getRight();
    }

    private static final boolean beamBeats_I7lrPNg$isInDirectionOfSearch(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.equals-impl0(v, 3)) {
            return rect1.getLeft() >= rect0.getRight();
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            return rect1.getRight() <= rect0.getLeft();
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return rect1.getTop() >= rect0.getBottom();
        }
        if(!FocusDirection.equals-impl0(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return rect1.getBottom() <= rect0.getTop();
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistance-2(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.equals-impl0(v, 3)) {
            return Math.max(0.0f, rect1.getLeft() - rect0.getRight());
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            return Math.max(0.0f, rect0.getLeft() - rect1.getRight());
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return Math.max(0.0f, rect1.getTop() - rect0.getBottom());
        }
        if(!FocusDirection.equals-impl0(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return Math.max(0.0f, rect0.getTop() - rect1.getBottom());
    }

    private static final float beamBeats_I7lrPNg$majorAxisDistanceToFarEdge(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.equals-impl0(v, 3)) {
            return Math.max(1.0f, rect1.getLeft() - rect0.getLeft());
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            return Math.max(1.0f, rect0.getRight() - rect1.getRight());
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return Math.max(1.0f, rect1.getTop() - rect0.getTop());
        }
        if(!FocusDirection.equals-impl0(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return Math.max(1.0f, rect0.getBottom() - rect1.getBottom());
    }

    private static final Rect bottomRight(Rect rect0) {
        return new Rect(rect0.getRight(), rect0.getBottom(), rect0.getRight(), rect0.getBottom());
    }

    private static final ModifiedFocusNode findBestCandidate-4WY_MpI(List list0, Rect rect0, int v) {
        Rect rect1;
        if(FocusDirection.equals-impl0(v, 3)) {
            rect1 = rect0.translate(rect0.getWidth() + 1.0f, 0.0f);
        }
        else {
            if(FocusDirection.equals-impl0(v, 4)) {
                rect1 = rect0.translate(-(rect0.getWidth() + 1.0f), 0.0f);
                goto label_11;
            }
            if(FocusDirection.equals-impl0(v, 5)) {
                rect1 = rect0.translate(0.0f, rect0.getHeight() + 1.0f);
            }
            else if(FocusDirection.equals-impl0(v, 6)) {
                rect1 = rect0.translate(0.0f, -(rect0.getHeight() + 1.0f));
            }
            else {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
        }
    label_11:
        int v1 = list0.size();
        ModifiedFocusNode modifiedFocusNode0 = null;
        if(v1 - 1 >= 0) {
            for(int v2 = 0; true; ++v2) {
                ModifiedFocusNode modifiedFocusNode1 = (ModifiedFocusNode)list0.get(v2);
                Rect rect2 = modifiedFocusNode1.focusRect();
                if(TwoDimensionalFocusSearchKt.isBetterCandidate-I7lrPNg(rect2, rect1, rect0, v)) {
                    modifiedFocusNode0 = modifiedFocusNode1;
                    rect1 = rect2;
                }
                if(v2 + 1 > v1 - 1) {
                    break;
                }
            }
        }
        return modifiedFocusNode0;
    }

    private static final boolean isBetterCandidate-I7lrPNg(Rect rect0, Rect rect1, Rect rect2, int v) {
        if(TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$isCandidate(rect0, v, rect2)) {
            return TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$isCandidate(rect1, v, rect2) ? TwoDimensionalFocusSearchKt.beamBeats-I7lrPNg(rect2, rect0, rect1, v) || !TwoDimensionalFocusSearchKt.beamBeats-I7lrPNg(rect2, rect1, rect0, v) && TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$weightedDistance(v, rect2, rect0) < TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$weightedDistance(v, rect2, rect1) : true;
        }
        return false;
    }

    private static final boolean isBetterCandidate_I7lrPNg$isCandidate(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.equals-impl0(v, 3)) {
            return (rect1.getRight() > rect0.getRight() || rect1.getLeft() >= rect0.getRight()) && rect1.getLeft() > rect0.getLeft();
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            return (rect1.getLeft() < rect0.getLeft() || rect1.getRight() <= rect0.getLeft()) && rect1.getRight() < rect0.getRight();
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return (rect1.getBottom() > rect0.getBottom() || rect1.getTop() >= rect0.getBottom()) && rect1.getTop() > rect0.getTop();
        }
        if(!FocusDirection.equals-impl0(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return (rect1.getTop() < rect0.getTop() || rect1.getBottom() <= rect0.getTop()) && rect1.getBottom() < rect0.getBottom();
    }

    private static final float isBetterCandidate_I7lrPNg$majorAxisDistance(Rect rect0, int v, Rect rect1) {
        if(FocusDirection.equals-impl0(v, 3)) {
            return Math.max(0.0f, rect1.getLeft() - rect0.getRight());
        }
        if(FocusDirection.equals-impl0(v, 4)) {
            return Math.max(0.0f, rect0.getLeft() - rect1.getRight());
        }
        if(FocusDirection.equals-impl0(v, 5)) {
            return Math.max(0.0f, rect1.getTop() - rect0.getBottom());
        }
        if(!FocusDirection.equals-impl0(v, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return Math.max(0.0f, rect0.getTop() - rect1.getBottom());
    }

    private static final float isBetterCandidate_I7lrPNg$minorAxisDistance(Rect rect0, int v, Rect rect1) {
        boolean z = true;
        if((FocusDirection.equals-impl0(v, 3) ? true : FocusDirection.equals-impl0(v, 4))) {
            return rect1.getTop() + rect1.getHeight() / 2.0f - (rect0.getTop() + rect0.getHeight() / 2.0f);
        }
        if(!FocusDirection.equals-impl0(v, 5)) {
            z = FocusDirection.equals-impl0(v, 6);
        }
        if(!z) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        return rect1.getLeft() + rect1.getWidth() / 2.0f - (rect0.getLeft() + rect0.getWidth() / 2.0f);
    }

    private static final long isBetterCandidate_I7lrPNg$weightedDistance(int v, Rect rect0, Rect rect1) {
        long v1 = (long)Math.abs(TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$majorAxisDistance(rect1, v, rect0));
        long v2 = (long)Math.abs(TwoDimensionalFocusSearchKt.isBetterCandidate_I7lrPNg$minorAxisDistance(rect1, v, rect0));
        return 13L * v1 * v1 + v2 * v2;
    }

    private static final Rect topLeft(Rect rect0) {
        return new Rect(rect0.getLeft(), rect0.getTop(), rect0.getLeft(), rect0.getTop());
    }

    public static final ModifiedFocusNode twoDimensionalFocusSearch-Mxy_nc0(ModifiedFocusNode modifiedFocusNode0, int v) {
        Rect rect0 = null;
        Intrinsics.checkNotNullParameter(modifiedFocusNode0, "$this$twoDimensionalFocusSearch");
        int v1 = WhenMappings.$EnumSwitchMapping$0[modifiedFocusNode0.getFocusState().ordinal()];
        boolean z = true;
        if(v1 != 1) {
            switch(v1) {
                case 2: {
                    return null;
                }
                case 3: {
                    ModifiedFocusNode modifiedFocusNode1 = modifiedFocusNode0.getFocusedChild();
                    if(modifiedFocusNode1 == null) {
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                    if(modifiedFocusNode1.getFocusState() == FocusStateImpl.ActiveParent) {
                        ModifiedFocusNode modifiedFocusNode2 = TwoDimensionalFocusSearchKt.twoDimensionalFocusSearch-Mxy_nc0(modifiedFocusNode1, v);
                        if(modifiedFocusNode2 != null) {
                            return modifiedFocusNode2;
                        }
                    }
                    ModifiedFocusNode modifiedFocusNode3 = FocusTraversalKt.findActiveFocusNode(modifiedFocusNode0);
                    if(modifiedFocusNode3 != null) {
                        rect0 = modifiedFocusNode3.focusRect();
                    }
                    if(rect0 == null) {
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                    return TwoDimensionalFocusSearchKt.findBestCandidate-4WY_MpI(modifiedFocusNode0.focusableChildren(), rect0, v);
                }
                case 4: 
                case 5: {
                    List list0 = modifiedFocusNode0.focusableChildren();
                    if(list0.size() <= 1) {
                        return (ModifiedFocusNode)CollectionsKt.firstOrNull(list0);
                    }
                    if((FocusDirection.equals-impl0(v, 4) ? true : FocusDirection.equals-impl0(v, 6))) {
                        return TwoDimensionalFocusSearchKt.findBestCandidate-4WY_MpI(list0, TwoDimensionalFocusSearchKt.topLeft(modifiedFocusNode0.focusRect()), v);
                    }
                    if(!FocusDirection.equals-impl0(v, 3)) {
                        z = FocusDirection.equals-impl0(v, 5);
                    }
                    if(!z) {
                        throw new IllegalStateException("This function should only be used for 2-D focus search");
                    }
                    return TwoDimensionalFocusSearchKt.findBestCandidate-4WY_MpI(list0, TwoDimensionalFocusSearchKt.bottomRight(modifiedFocusNode0.focusRect()), v);
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return modifiedFocusNode0;
    }
}

