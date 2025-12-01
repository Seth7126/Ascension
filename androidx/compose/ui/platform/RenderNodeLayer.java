package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build.VERSION;
import android.view.View;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001[B/\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\t\u00A2\u0006\u0002\u0010\nJ\b\u0010+\u001A\u00020\u0007H\u0016J\u0010\u0010,\u001A\u00020\u00072\u0006\u0010-\u001A\u00020\u0006H\u0016J\b\u0010.\u001A\u00020\u0007H\u0016J\u001D\u0010/\u001A\u00020\u00102\u0006\u00100\u001A\u000201H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b2\u00103J\u0018\u00104\u001A\u00020\u00072\u0006\u00105\u001A\u0002062\u0006\u00107\u001A\u00020\u0010H\u0016J%\u00108\u001A\u0002012\u0006\u00109\u001A\u0002012\u0006\u00107\u001A\u00020\u0010H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b:\u0010;J\u001D\u0010<\u001A\u00020\u00072\u0006\u00100\u001A\u00020=H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b>\u0010?J\u001D\u0010@\u001A\u00020\u00072\u0006\u0010A\u001A\u00020BH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bC\u0010?J\b\u0010D\u001A\u00020\u0007H\u0002J\b\u0010E\u001A\u00020\u0007H\u0016J\u008D\u0001\u0010F\u001A\u00020\u00072\u0006\u0010G\u001A\u00020H2\u0006\u0010I\u001A\u00020H2\u0006\u0010J\u001A\u00020H2\u0006\u0010K\u001A\u00020H2\u0006\u0010L\u001A\u00020H2\u0006\u0010M\u001A\u00020H2\u0006\u0010N\u001A\u00020H2\u0006\u0010O\u001A\u00020H2\u0006\u0010P\u001A\u00020H2\u0006\u0010Q\u001A\u00020H2\u0006\u0010(\u001A\u00020)2\u0006\u0010R\u001A\u00020S2\u0006\u0010T\u001A\u00020\u00102\u0006\u0010U\u001A\u00020V2\u0006\u0010W\u001A\u00020XH\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bY\u0010ZR\u000E\u0010\u000B\u001A\u00020\fX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001D\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u000E\u0010\u000F\u001A\u00020\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0017\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u000E\u0010\u0013\u001A\u00020\u0010X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001E\u0010\u0015\u001A\u00020\u00102\u0006\u0010\u0014\u001A\u00020\u0010@BX\u0082\u000E\u00A2\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001A\u00020\u00198VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001A\u0010\u001BR\u000E\u0010\u001C\u001A\u00020\u001DX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001E\u001A\u00020\u001FX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R\u001A\u0010\"\u001A\u00020\u00198VX\u0097\u0004\u00A2\u0006\f\u0012\u0004\b#\u0010$\u001A\u0004\b%\u0010\u001BR\u000E\u0010&\u001A\u00020\'X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0019\u0010(\u001A\u00020)X\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010*\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006\\"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer;", "Landroidx/compose/ui/node/OwnedLayer;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "", "invalidateParentLayer", "Lkotlin/Function0;", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "getDrawBlock", "()Lkotlin/jvm/functions/Function1;", "drawnWithZ", "", "getInvalidateParentLayer", "()Lkotlin/jvm/functions/Function0;", "isDestroyed", "value", "isDirty", "setDirty", "(Z)V", "layerId", "", "getLayerId", "()J", "matrixCache", "Landroidx/compose/ui/platform/RenderNodeMatrixCache;", "outlineResolver", "Landroidx/compose/ui/platform/OutlineResolver;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerViewId", "getOwnerViewId$annotations", "()V", "getOwnerViewId", "renderNode", "Landroidx/compose/ui/platform/DeviceRenderNode;", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "destroy", "drawLayer", "canvas", "invalidate", "isInLayer", "position", "Landroidx/compose/ui/geometry/Offset;", "isInLayer-k-4lQ0M", "(J)Z", "mapBounds", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "inverse", "mapOffset", "point", "mapOffset-8S9VItk", "(JZ)J", "move", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "resize", "size", "Landroidx/compose/ui/unit/IntSize;", "resize-ozmzZPI", "triggerRepaint", "updateDisplayList", "updateLayerProperties", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "density", "Landroidx/compose/ui/unit/Density;", "updateLayerProperties-dRfWZ4U", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/unit/Density;)V", "UniqueDrawingIdApi29", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RenderNodeLayer implements OwnedLayer {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29;", "", "()V", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    static final class UniqueDrawingIdApi29 {
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeLayer$UniqueDrawingIdApi29$Companion;", "", "()V", "getUniqueDrawingId", "", "view", "Landroid/view/View;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
        public static final class Companion {
            private Companion() {
            }

            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }

            @JvmStatic
            public final long getUniqueDrawingId(View view0) {
                Intrinsics.checkNotNullParameter(view0, "view");
                return view0.getUniqueDrawingId();
            }
        }

        public static final Companion Companion;

        static {
            UniqueDrawingIdApi29.Companion = new Companion(null);
        }

        @JvmStatic
        public static final long getUniqueDrawingId(View view0) {
            return UniqueDrawingIdApi29.Companion.getUniqueDrawingId(view0);
        }
    }

    private final CanvasHolder canvasHolder;
    private final Function1 drawBlock;
    private boolean drawnWithZ;
    private final Function0 invalidateParentLayer;
    private boolean isDestroyed;
    private boolean isDirty;
    private final RenderNodeMatrixCache matrixCache;
    private final OutlineResolver outlineResolver;
    private final AndroidComposeView ownerView;
    private final DeviceRenderNode renderNode;
    private long transformOrigin;

    public RenderNodeLayer(AndroidComposeView androidComposeView0, Function1 function10, Function0 function00) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "ownerView");
        Intrinsics.checkNotNullParameter(function10, "drawBlock");
        Intrinsics.checkNotNullParameter(function00, "invalidateParentLayer");
        super();
        this.ownerView = androidComposeView0;
        this.drawBlock = function10;
        this.invalidateParentLayer = function00;
        this.outlineResolver = new OutlineResolver(androidComposeView0.getDensity());
        this.matrixCache = new RenderNodeMatrixCache();
        this.canvasHolder = new CanvasHolder();
        this.transformOrigin = 0x3F0000003F000000L;
        DeviceRenderNode deviceRenderNode0 = Build.VERSION.SDK_INT >= 29 ? new RenderNodeApi29(androidComposeView0) : new RenderNodeApi23(androidComposeView0);
        deviceRenderNode0.setHasOverlappingRendering(true);
        this.renderNode = deviceRenderNode0;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void destroy() {
        this.isDestroyed = true;
        this.setDirty(false);
        this.ownerView.requestClearInvalidObservations();
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void drawLayer(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        android.graphics.Canvas canvas1 = AndroidCanvas_androidKt.getNativeCanvas(canvas0);
        boolean z = false;
        if(canvas1.isHardwareAccelerated()) {
            this.updateDisplayList();
            if(this.renderNode.getElevation() > 0.0f) {
                z = true;
            }
            this.drawnWithZ = z;
            if(z) {
                canvas0.enableZ();
            }
            this.renderNode.drawInto(canvas1);
            if(this.drawnWithZ) {
                canvas0.disableZ();
            }
        }
        else {
            this.drawBlock.invoke(canvas0);
            this.setDirty(false);
        }
    }

    public final Function1 getDrawBlock() {
        return this.drawBlock;
    }

    public final Function0 getInvalidateParentLayer() {
        return this.invalidateParentLayer;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getLayerId() {
        return this.renderNode.getUniqueId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override  // androidx.compose.ui.layout.GraphicLayerInfo
    public long getOwnerViewId() {
        return Build.VERSION.SDK_INT < 29 ? -1L : UniqueDrawingIdApi29.Companion.getUniqueDrawingId(this.ownerView);
    }

    @ExperimentalComposeUiApi
    public static void getOwnerViewId$annotations() {
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void invalidate() {
        if(!this.isDirty && !this.isDestroyed) {
            this.ownerView.invalidate();
            this.setDirty(true);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public boolean isInLayer-k-4lQ0M(long v) {
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        if(this.renderNode.getClipToBounds()) {
            return 0.0f <= f && f < ((float)this.renderNode.getWidth()) && 0.0f <= f1 && f1 < ((float)this.renderNode.getHeight());
        }
        return this.renderNode.getClipToOutline() ? this.outlineResolver.isInOutline-k-4lQ0M(v) : true;
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void mapBounds(MutableRect mutableRect0, boolean z) {
        Intrinsics.checkNotNullParameter(mutableRect0, "rect");
        if(z) {
            Matrix.map-impl(this.matrixCache.getInverseMatrix-GrdbGEg(this.renderNode), mutableRect0);
            return;
        }
        Matrix.map-impl(this.matrixCache.getMatrix-GrdbGEg(this.renderNode), mutableRect0);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.ui.node.OwnedLayer
    public long mapOffset-8S9VItk(long v, boolean z) {
        return z ? Matrix.map-MK-Hz9U(this.matrixCache.getInverseMatrix-GrdbGEg(this.renderNode), v) : Matrix.map-MK-Hz9U(this.matrixCache.getMatrix-GrdbGEg(this.renderNode), v);
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void move--gyyYBs(long v) {
        int v1 = this.renderNode.getLeft();
        int v2 = this.renderNode.getTop();
        if(v1 != ((int)(v >> 0x20)) || v2 != ((int)(v & 0xFFFFFFFFL))) {
            this.renderNode.offsetLeftAndRight(((int)(v >> 0x20)) - v1);
            this.renderNode.offsetTopAndBottom(((int)(v & 0xFFFFFFFFL)) - v2);
            this.triggerRepaint();
            this.matrixCache.invalidate();
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void resize-ozmzZPI(long v) {
        this.renderNode.setPivotX(TransformOrigin.getPivotFractionX-impl(this.transformOrigin) * ((float)(((int)(v >> 0x20)))));
        this.renderNode.setPivotY(TransformOrigin.getPivotFractionY-impl(this.transformOrigin) * ((float)(((int)(v & 0xFFFFFFFFL)))));
        int v1 = this.renderNode.getLeft();
        int v2 = this.renderNode.getTop();
        int v3 = this.renderNode.getLeft();
        int v4 = this.renderNode.getTop();
        if(this.renderNode.setPosition(v1, v2, v3 + ((int)(v >> 0x20)), v4 + ((int)(v & 0xFFFFFFFFL)))) {
            this.outlineResolver.update-uvyYCjk(SizeKt.Size(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL))));
            Outline outline0 = this.outlineResolver.getOutline();
            this.renderNode.setOutline(outline0);
            this.invalidate();
            this.matrixCache.invalidate();
        }
    }

    private final void setDirty(boolean z) {
        if(z != this.isDirty) {
            this.isDirty = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void triggerRepaint() {
        if(Build.VERSION.SDK_INT >= 26) {
            WrapperRenderNodeLayerHelperMethods.INSTANCE.onDescendantInvalidated(this.ownerView);
            return;
        }
        this.ownerView.invalidate();
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateDisplayList() {
        if(this.isDirty || !this.renderNode.getHasDisplayList()) {
            this.setDirty(false);
            Path path0 = this.renderNode.getClipToOutline() ? this.outlineResolver.getClipPath() : null;
            this.renderNode.record(this.canvasHolder, path0, this.drawBlock);
        }
    }

    @Override  // androidx.compose.ui.node.OwnedLayer
    public void updateLayerProperties-dRfWZ4U(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, LayoutDirection layoutDirection0, Density density0) {
        Intrinsics.checkNotNullParameter(shape0, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(density0, "density");
        this.transformOrigin = v;
        int v1 = 1;
        int v2 = !this.renderNode.getClipToOutline() || this.outlineResolver.getClipPath() == null ? 0 : 1;
        this.renderNode.setScaleX(f);
        this.renderNode.setScaleY(f1);
        this.renderNode.setAlpha(f2);
        this.renderNode.setTranslationX(f3);
        this.renderNode.setTranslationY(f4);
        this.renderNode.setElevation(f5);
        this.renderNode.setRotationZ(f8);
        this.renderNode.setRotationX(f6);
        this.renderNode.setRotationY(f7);
        this.renderNode.setCameraDistance(f9);
        float f10 = TransformOrigin.getPivotFractionX-impl(v) * ((float)this.renderNode.getWidth());
        this.renderNode.setPivotX(f10);
        float f11 = TransformOrigin.getPivotFractionY-impl(v) * ((float)this.renderNode.getHeight());
        this.renderNode.setPivotY(f11);
        this.renderNode.setClipToOutline(z && shape0 != RectangleShapeKt.getRectangleShape());
        this.renderNode.setClipToBounds(z && shape0 == RectangleShapeKt.getRectangleShape());
        float f12 = this.renderNode.getAlpha();
        boolean z1 = this.renderNode.getClipToOutline();
        float f13 = this.renderNode.getElevation();
        boolean z2 = this.outlineResolver.update(shape0, f12, z1, f13, layoutDirection0, density0);
        Outline outline0 = this.outlineResolver.getOutline();
        this.renderNode.setOutline(outline0);
        if(!this.renderNode.getClipToOutline() || this.outlineResolver.getClipPath() == null) {
            v1 = 0;
        }
        if(v2 != v1 || v1 != 0 && z2) {
            this.invalidate();
        }
        else {
            this.triggerRepaint();
        }
        if(!this.drawnWithZ && this.renderNode.getElevation() > 0.0f) {
            this.invalidateParentLayer.invoke();
        }
        this.matrixCache.invalidate();
    }
}

