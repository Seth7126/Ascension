package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.R.id;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\bH\u0014J%\u0010\t\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0000¢\u0006\u0002\b\u000FJ0\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0017\u001A\u00020\u0014H\u0014J\u0018\u0010\u0018\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u00142\u0006\u0010\u001A\u001A\u00020\u0014H\u0014¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/platform/DrawChildContainer;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "dispatchDraw", "", "canvas", "Landroid/graphics/Canvas;", "drawChild", "Landroidx/compose/ui/graphics/Canvas;", "view", "Landroid/view/View;", "drawingTime", "", "drawChild$ui_release", "onLayout", "changed", "", "l", "", "t", "r", "b", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class DrawChildContainer extends ViewGroup {
    public DrawChildContainer(Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.setClipChildren(false);
        this.setTag(id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override  // android.view.ViewGroup
    protected void dispatchDraw(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        int v = this.getChildCount();
        boolean z = false;
        if(v > 0) {
            for(int v1 = 0; true; ++v1) {
                View view0 = this.getChildAt(v1);
                if(view0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
                }
                if(((ViewLayer)view0).isInvalidated()) {
                    z = true;
                    break;
                }
                if(v1 + 1 >= v) {
                    break;
                }
            }
        }
        if(z) {
            super.dispatchDraw(canvas0);
        }
    }

    public final void drawChild$ui_release(androidx.compose.ui.graphics.Canvas canvas0, View view0, long v) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        Intrinsics.checkNotNullParameter(view0, "view");
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas0), view0, v);
    }

    @Override  // android.view.ViewGroup
    protected void onLayout(boolean z, int v, int v1, int v2, int v3) {
    }

    @Override  // android.view.View
    protected void onMeasure(int v, int v1) {
        this.setMeasuredDimension(0, 0);
    }
}

