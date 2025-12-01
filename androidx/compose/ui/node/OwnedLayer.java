package androidx.compose.ui.node;

import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.GraphicLayerInfo;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H&J\u0010\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H&J\b\u0010\u0007\u001A\u00020\u0003H&J\u001D\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000E\u001A\u00020\u00032\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\tH&J%\u0010\u0012\u001A\u00020\u000B2\u0006\u0010\u0013\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\tH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001D\u0010\u0016\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u0017H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001D\u0010\u001A\u001A\u00020\u00032\u0006\u0010\u001B\u001A\u00020\u001CH&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001D\u0010\u0019J\b\u0010\u001E\u001A\u00020\u0003H&J\u008D\u0001\u0010\u001F\u001A\u00020\u00032\u0006\u0010 \u001A\u00020!2\u0006\u0010\"\u001A\u00020!2\u0006\u0010#\u001A\u00020!2\u0006\u0010$\u001A\u00020!2\u0006\u0010%\u001A\u00020!2\u0006\u0010&\u001A\u00020!2\u0006\u0010\'\u001A\u00020!2\u0006\u0010(\u001A\u00020!2\u0006\u0010)\u001A\u00020!2\u0006\u0010*\u001A\u00020!2\u0006\u0010+\u001A\u00020,2\u0006\u0010-\u001A\u00020.2\u0006\u0010/\u001A\u00020\t2\u0006\u00100\u001A\u0002012\u0006\u00102\u001A\u000203H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u00066"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "Landroidx/compose/ui/layout/GraphicLayerInfo;", "destroy", "", "drawLayer", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "invalidate", "isInLayer", "", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "updateDisplayList", "updateLayerProperties", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "updateLayerProperties-dRfWZ4U", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface OwnedLayer extends GraphicLayerInfo {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        @ExperimentalComposeUiApi
        public static long getOwnerViewId(OwnedLayer ownedLayer0) {
            Intrinsics.checkNotNullParameter(ownedLayer0, "this");
            return androidx.compose.ui.layout.GraphicLayerInfo.DefaultImpls.getOwnerViewId(ownedLayer0);
        }
    }

    void destroy();

    void drawLayer(Canvas arg1);

    void invalidate();

    boolean isInLayer-k-4lQ0M(long arg1);

    void mapBounds(MutableRect arg1, boolean arg2);

    long mapOffset-8S9VItk(long arg1, boolean arg2);

    void move--gyyYBs(long arg1);

    void resize-ozmzZPI(long arg1);

    void updateDisplayList();

    void updateLayerProperties-dRfWZ4U(float arg1, float arg2, float arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9, float arg10, long arg11, Shape arg12, boolean arg13, LayoutDirection arg14, Density arg15);
}

