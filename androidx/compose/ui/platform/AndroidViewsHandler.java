package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0011H\u0016J\u0016\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u00072\u0006\u0010\u0015\u001A\u00020\u0016J\u001E\u0010\u0017\u001A\u0004\u0018\u00010\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u001A2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001CH\u0016J\u0018\u0010\u001D\u001A\u00020\u00132\u0006\u0010\u001E\u001A\u00020\u001F2\u0006\u0010 \u001A\u00020\u001FH\u0017J0\u0010!\u001A\u00020\u00132\u0006\u0010\"\u001A\u00020\u000F2\u0006\u0010#\u001A\u00020$2\u0006\u0010%\u001A\u00020$2\u0006\u0010&\u001A\u00020$2\u0006\u0010\'\u001A\u00020$H\u0014J\u0018\u0010(\u001A\u00020\u00132\u0006\u0010)\u001A\u00020$2\u0006\u0010*\u001A\u00020$H\u0014J\b\u0010+\u001A\u00020\u0013H\u0017R-\u0010\u0005\u001A\u001E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR-\u0010\f\u001A\u001E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00070\u0006j\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0007`\t¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000B¨\u0006,"}, d2 = {"Landroidx/compose/ui/platform/AndroidViewsHandler;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "holderToLayoutNode", "Ljava/util/HashMap;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "layoutNodeToHolder", "getLayoutNodeToHolder", "dispatchTouchEvent", "", "ev", "Landroid/view/MotionEvent;", "drawView", "", "view", "canvas", "Landroid/graphics/Canvas;", "invalidateChildInParent", "", "location", "", "dirty", "Landroid/graphics/Rect;", "onDescendantInvalidated", "child", "Landroid/view/View;", "target", "onLayout", "changed", "l", "", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "requestLayout", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidViewsHandler extends ViewGroup {
    private final HashMap holderToLayoutNode;
    private final HashMap layoutNodeToHolder;

    public AndroidViewsHandler(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.setClipChildren(false);
        this.holderToLayoutNode = new HashMap();
        this.layoutNodeToHolder = new HashMap();
    }

    @Override  // android.view.ViewGroup
    public boolean dispatchTouchEvent(MotionEvent motionEvent0) {
        return true;
    }

    public final void drawView(AndroidViewHolder androidViewHolder0, Canvas canvas0) {
        Intrinsics.checkNotNullParameter(androidViewHolder0, "view");
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        androidViewHolder0.draw(canvas0);
    }

    public final HashMap getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override  // android.view.ViewGroup
    public ViewParent invalidateChildInParent(int[] arr_v, Rect rect0) {
        return null;
    }

    public Void invalidateChildInParent(int[] arr_v, Rect rect0) [...] // Inlined contents

    @Override  // android.view.ViewGroup
    public void onDescendantInvalidated(View view0, View view1) {
        Intrinsics.checkNotNullParameter(view0, "child");
        Intrinsics.checkNotNullParameter(view1, "target");
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
        Set set0 = this.holderToLayoutNode.keySet();
        Intrinsics.checkNotNullExpressionValue(set0, "holderToLayoutNode.keys");
        for(Object object0: set0) {
            ((AndroidViewHolder)object0).layout(((AndroidViewHolder)object0).getLeft(), ((AndroidViewHolder)object0).getTop(), ((AndroidViewHolder)object0).getRight(), ((AndroidViewHolder)object0).getBottom());
        }
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        if(View.MeasureSpec.getMode(v) != 0x40000000 || View.MeasureSpec.getMode(v1) != 0x40000000) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.setMeasuredDimension(View.MeasureSpec.getSize(v), View.MeasureSpec.getSize(v1));
        Set set0 = this.holderToLayoutNode.keySet();
        Intrinsics.checkNotNullExpressionValue(set0, "holderToLayoutNode.keys");
        for(Object object0: set0) {
            ((AndroidViewHolder)object0).remeasure();
        }
    }

    @Override  // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.cleanupLayoutState(this);
        int v = this.getChildCount();
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                View view0 = this.getChildAt(v1);
                LayoutNode layoutNode0 = (LayoutNode)this.holderToLayoutNode.get(view0);
                if(view0.isLayoutRequested() && layoutNode0 != null) {
                    layoutNode0.requestRemeasure$ui_release();
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
    }
}

