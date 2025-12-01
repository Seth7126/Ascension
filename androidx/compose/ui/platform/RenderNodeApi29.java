package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import androidx.compose.ui.graphics.Canvas.DefaultImpls;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u001A\n\u0002\u0018\u0002\n\u0002\b\u001A\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u0010\u0010N\u001A\u00020O2\u0006\u0010P\u001A\u00020QH\u0016J\b\u0010R\u001A\u00020SH\u0016J\u0010\u0010T\u001A\u00020O2\u0006\u0010U\u001A\u00020VH\u0016J\u0010\u0010W\u001A\u00020O2\u0006\u0010U\u001A\u00020VH\u0016J\u0010\u0010X\u001A\u00020O2\u0006\u0010Y\u001A\u00020\rH\u0016J\u0010\u0010Z\u001A\u00020O2\u0006\u0010Y\u001A\u00020\rH\u0016J.\u0010[\u001A\u00020O2\u0006\u0010\\\u001A\u00020]2\b\u0010^\u001A\u0004\u0018\u00010_2\u0012\u0010`\u001A\u000E\u0012\u0004\u0012\u00020b\u0012\u0004\u0012\u00020O0aH\u0016J\u0010\u0010c\u001A\u00020\u00132\u0006\u0010d\u001A\u00020\u0013H\u0016J\u0012\u0010e\u001A\u00020O2\b\u0010f\u001A\u0004\u0018\u00010gH\u0016J(\u0010h\u001A\u00020\u00132\u0006\u0010#\u001A\u00020\r2\u0006\u0010@\u001A\u00020\r2\u0006\u0010/\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\rH\u0016R$\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u0014\u0010\f\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\u000E\u0010\u000FR$\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000BR$\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0005\u001A\u00020\u00138V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001A\u00020\u00132\u0006\u0010\u0005\u001A\u00020\u00138V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u001A\u0010\u0016\"\u0004\b\u001B\u0010\u0018R$\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u001D\u0010\t\"\u0004\b\u001E\u0010\u000BR\u0014\u0010\u001F\u001A\u00020\u00138VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b \u0010\u0016R\u0014\u0010!\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\"\u0010\u000FR\u0014\u0010#\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010\u000FR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010&R$\u0010\'\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b(\u0010\t\"\u0004\b)\u0010\u000BR$\u0010*\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b+\u0010\t\"\u0004\b,\u0010\u000BR\u000E\u0010-\u001A\u00020.X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0014\u0010/\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b0\u0010\u000FR$\u00101\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b2\u0010\t\"\u0004\b3\u0010\u000BR$\u00104\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b5\u0010\t\"\u0004\b6\u0010\u000BR$\u00107\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b8\u0010\t\"\u0004\b9\u0010\u000BR$\u0010:\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b;\u0010\t\"\u0004\b<\u0010\u000BR$\u0010=\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b>\u0010\t\"\u0004\b?\u0010\u000BR\u0014\u0010@\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010\u000FR$\u0010B\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bC\u0010\t\"\u0004\bD\u0010\u000BR$\u0010E\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bF\u0010\t\"\u0004\bG\u0010\u000BR\u0014\u0010H\u001A\u00020I8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bJ\u0010KR\u0014\u0010L\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010\u000F\u00A8\u0006i"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi29;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "bottom", "", "getBottom", "()I", "cameraDistance", "getCameraDistance", "setCameraDistance", "", "clipToBounds", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "clipToOutline", "getClipToOutline", "setClipToOutline", "elevation", "getElevation", "setElevation", "hasDisplayList", "getHasDisplayList", "height", "getHeight", "left", "getLeft", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "renderNode", "Landroid/graphics/RenderNode;", "right", "getRight", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "top", "getTop", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "uniqueId", "", "getUniqueId", "()J", "width", "getWidth", "drawInto", "", "canvas", "Landroid/graphics/Canvas;", "dumpRenderNodeData", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "getInverseMatrix", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "offsetLeftAndRight", "offset", "offsetTopAndBottom", "record", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "setHasOverlappingRendering", "hasOverlappingRendering", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RenderNodeApi29 implements DeviceRenderNode {
    private final AndroidComposeView ownerView;
    private final RenderNode renderNode;

    public RenderNodeApi29(AndroidComposeView androidComposeView0) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "ownerView");
        super();
        this.ownerView = androidComposeView0;
        this.renderNode = new RenderNode("Compose");
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        canvas0.drawRenderNode(this.renderNode);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(this.renderNode.getUniqueId(), this.renderNode.getLeft(), this.renderNode.getTop(), this.renderNode.getRight(), this.renderNode.getBottom(), this.renderNode.getWidth(), this.renderNode.getHeight(), this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), this.renderNode.getRotationZ(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.renderNode.getClipToBounds(), this.renderNode.getAlpha());
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.renderNode.getBottom();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return this.renderNode.getCameraDistance();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.renderNode.getClipToBounds();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToOutline() {
        return this.renderNode.getClipToOutline();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getElevation() {
        return this.renderNode.getElevation();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getHasDisplayList() {
        return this.renderNode.hasDisplayList();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.renderNode.getHeight();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        this.renderNode.getInverseMatrix(matrix0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.renderNode.getLeft();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void getMatrix(Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        this.renderNode.getMatrix(matrix0);
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotX() {
        return this.renderNode.getPivotX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getPivotY() {
        return this.renderNode.getPivotY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getRight() {
        return this.renderNode.getRight();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationX() {
        return this.renderNode.getRotationX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationY() {
        return this.renderNode.getRotationY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getRotationZ() {
        return this.renderNode.getRotationZ();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleX() {
        return this.renderNode.getScaleX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getScaleY() {
        return this.renderNode.getScaleY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getTop() {
        return this.renderNode.getTop();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationX() {
        return this.renderNode.getTranslationX();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getTranslationY() {
        return this.renderNode.getTranslationY();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public long getUniqueId() {
        return this.renderNode.getUniqueId();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.renderNode.getWidth();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int v) {
        this.renderNode.offsetLeftAndRight(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int v) {
        this.renderNode.offsetTopAndBottom(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void record(CanvasHolder canvasHolder0, Path path0, Function1 function10) {
        Intrinsics.checkNotNullParameter(canvasHolder0, "canvasHolder");
        Intrinsics.checkNotNullParameter(function10, "drawBlock");
        RecordingCanvas recordingCanvas0 = this.renderNode.beginRecording();
        Intrinsics.checkNotNullExpressionValue(recordingCanvas0, "renderNode.beginRecording()");
        Canvas canvas0 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
        canvasHolder0.getAndroidCanvas().setInternalCanvas(recordingCanvas0);
        androidx.compose.ui.graphics.Canvas canvas1 = canvasHolder0.getAndroidCanvas();
        if(path0 != null) {
            canvas1.save();
            DefaultImpls.clipPath-mtrdD-E$default(canvas1, path0, 0, 2, null);
        }
        function10.invoke(canvas1);
        if(path0 != null) {
            canvas1.restore();
        }
        canvasHolder0.getAndroidCanvas().setInternalCanvas(canvas0);
        this.renderNode.endRecording();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f) {
        this.renderNode.setAlpha(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f) {
        this.renderNode.setCameraDistance(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z) {
        this.renderNode.setClipToBounds(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToOutline(boolean z) {
        this.renderNode.setClipToOutline(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setElevation(float f) {
        this.renderNode.setElevation(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setHasOverlappingRendering(boolean z) {
        return this.renderNode.setHasOverlappingRendering(z);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setOutline(Outline outline0) {
        this.renderNode.setOutline(outline0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotX(float f) {
        this.renderNode.setPivotX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setPivotY(float f) {
        this.renderNode.setPivotY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean setPosition(int v, int v1, int v2, int v3) {
        return this.renderNode.setPosition(v, v1, v2, v3);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationX(float f) {
        this.renderNode.setRotationX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationY(float f) {
        this.renderNode.setRotationY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setRotationZ(float f) {
        this.renderNode.setRotationZ(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f) {
        this.renderNode.setScaleX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f) {
        this.renderNode.setScaleY(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationX(float f) {
        this.renderNode.setTranslationX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setTranslationY(float f) {
        this.renderNode.setTranslationY(f);
    }
}

