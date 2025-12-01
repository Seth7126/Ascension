package androidx.compose.ui.focus;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.ModifiedFocusNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u001A\u0010\u0004\u001A\u00020\u0005*\u00020\u00062\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0000\u001A\u001E\u0010\n\u001A\u0004\u0018\u00010\t*\u00020\u00062\u000E\b\u0002\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00060\fH\u0000\"\u0014\u0010\u0000\u001A\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001A\u0004\b\u0002\u0010\u0003¨\u0006\r"}, d2 = {"FOCUS_TAG", "", "getFOCUS_TAG", "()Ljava/lang/String;", "findFocusableChildren", "", "Landroidx/compose/ui/node/LayoutNode;", "focusableChildren", "", "Landroidx/compose/ui/node/ModifiedFocusNode;", "searchChildrenForFocusNode", "queue", "Landroidx/compose/runtime/collection/MutableVector;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class FocusNodeUtilsKt {
    private static final String FOCUS_TAG = "Compose Focus";

    static {
    }

    public static final void findFocusableChildren(LayoutNode layoutNode0, List list0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        Intrinsics.checkNotNullParameter(list0, "focusableChildren");
        ModifiedFocusNode modifiedFocusNode0 = layoutNode0.getOuterLayoutNodeWrapper$ui_release().findNextFocusWrapper();
        if((modifiedFocusNode0 == null ? null : Boolean.valueOf(list0.add(modifiedFocusNode0))) == null) {
            List list1 = layoutNode0.getChildren$ui_release();
            int v = list1.size();
            if(v - 1 >= 0) {
                for(int v1 = 0; true; ++v1) {
                    FocusNodeUtilsKt.findFocusableChildren(((LayoutNode)list1.get(v1)), list0);
                    if(v1 + 1 > v - 1) {
                        break;
                    }
                }
            }
        }
    }

    // 去混淆评级： 低(20)
    public static final String getFOCUS_TAG() [...] // 潜在的解密器

    public static final ModifiedFocusNode searchChildrenForFocusNode(LayoutNode layoutNode0, MutableVector mutableVector0) {
        Intrinsics.checkNotNullParameter(layoutNode0, "<this>");
        Intrinsics.checkNotNullParameter(mutableVector0, "queue");
        MutableVector mutableVector1 = layoutNode0.get_children$ui_release();
        int v = mutableVector1.getSize();
        if(v > 0) {
            Object[] arr_object = mutableVector1.getContent();
            int v1 = 0;
            while(true) {
                LayoutNode layoutNode1 = (LayoutNode)arr_object[v1];
                ModifiedFocusNode modifiedFocusNode0 = layoutNode1.getOuterLayoutNodeWrapper$ui_release().findNextFocusWrapper();
                if(modifiedFocusNode0 != null) {
                    return modifiedFocusNode0;
                }
                mutableVector0.add(layoutNode1);
                ++v1;
                if(v1 >= v) {
                    break;
                }
            }
        }
        while(mutableVector0.isNotEmpty()) {
            ModifiedFocusNode modifiedFocusNode1 = FocusNodeUtilsKt.searchChildrenForFocusNode(((LayoutNode)mutableVector0.removeAt(0)), mutableVector0);
            if(modifiedFocusNode1 != null) {
                return modifiedFocusNode1;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    public static ModifiedFocusNode searchChildrenForFocusNode$default(LayoutNode layoutNode0, MutableVector mutableVector0, int v, Object object0) {
        if((v & 1) != 0) {
            mutableVector0 = new MutableVector(new LayoutNode[16], 0);
        }
        return FocusNodeUtilsKt.searchChildrenForFocusNode(layoutNode0, mutableVector0);
    }
}

