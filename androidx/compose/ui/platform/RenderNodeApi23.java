package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.graphics.Canvas.DefaultImpls;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u001B\n\u0002\u0018\u0002\n\u0002\b\u001C\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 n2\u00020\u0001:\u0001nB\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004J\u0010\u0010S\u001A\u00020T2\u0006\u0010U\u001A\u00020VH\u0016J\b\u0010W\u001A\u00020XH\u0016J\u0010\u0010Y\u001A\u00020T2\u0006\u0010Z\u001A\u00020[H\u0016J\u0010\u0010\\\u001A\u00020T2\u0006\u0010Z\u001A\u00020[H\u0016J\u0010\u0010]\u001A\u00020T2\u0006\u0010^\u001A\u00020\rH\u0016J\u0010\u0010_\u001A\u00020T2\u0006\u0010^\u001A\u00020\rH\u0016J.\u0010`\u001A\u00020T2\u0006\u0010a\u001A\u00020b2\b\u0010c\u001A\u0004\u0018\u00010d2\u0012\u0010e\u001A\u000E\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020T0fH\u0016J\u0010\u0010h\u001A\u00020\u00152\u0006\u0010i\u001A\u00020\u0015H\u0016J\u0012\u0010j\u001A\u00020T2\b\u0010k\u001A\u0004\u0018\u00010lH\u0016J(\u0010m\u001A\u00020\u00152\u0006\u0010%\u001A\u00020\r2\u0006\u0010D\u001A\u00020\r2\u0006\u00102\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\rH\u0016R$\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u00020\rX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000BR$\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u0015@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR$\u0010\u001B\u001A\u00020\u00152\u0006\u0010\u0005\u001A\u00020\u00158V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u001C\u0010\u0018\"\u0004\b\u001D\u0010\u001AR$\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u001F\u0010\t\"\u0004\b \u0010\u000BR\u0014\u0010!\u001A\u00020\u00158VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b\"\u0010\u0018R\u0014\u0010#\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\b$\u0010\u000FR\u001A\u0010%\u001A\u00020\rX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\u000F\"\u0004\b\'\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010)R$\u0010*\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b+\u0010\t\"\u0004\b,\u0010\u000BR$\u0010-\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b.\u0010\t\"\u0004\b/\u0010\u000BR\u000E\u00100\u001A\u000201X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001A\u00102\u001A\u00020\rX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u0010\u000F\"\u0004\b4\u0010\u0011R$\u00105\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b6\u0010\t\"\u0004\b7\u0010\u000BR$\u00108\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b9\u0010\t\"\u0004\b:\u0010\u000BR$\u0010;\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b<\u0010\t\"\u0004\b=\u0010\u000BR$\u0010>\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b?\u0010\t\"\u0004\b@\u0010\u000BR$\u0010A\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bB\u0010\t\"\u0004\bC\u0010\u000BR\u001A\u0010D\u001A\u00020\rX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\bE\u0010\u000F\"\u0004\bF\u0010\u0011R$\u0010G\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bH\u0010\t\"\u0004\bI\u0010\u000BR$\u0010J\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u00068V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bK\u0010\t\"\u0004\bL\u0010\u000BR\u0014\u0010M\u001A\u00020N8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bO\u0010PR\u0014\u0010Q\u001A\u00020\r8VX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bR\u0010\u000F\u00A8\u0006o"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23;", "Landroidx/compose/ui/platform/DeviceRenderNode;", "ownerView", "Landroidx/compose/ui/platform/AndroidComposeView;", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "bottom", "", "getBottom", "()I", "setBottom", "(I)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "", "clipToBounds", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "clipToOutline", "getClipToOutline", "setClipToOutline", "elevation", "getElevation", "setElevation", "hasDisplayList", "getHasDisplayList", "height", "getHeight", "left", "getLeft", "setLeft", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "renderNode", "Landroid/view/RenderNode;", "right", "getRight", "setRight", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "top", "getTop", "setTop", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "uniqueId", "", "getUniqueId", "()J", "width", "getWidth", "drawInto", "", "canvas", "Landroid/graphics/Canvas;", "dumpRenderNodeData", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "getInverseMatrix", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "offsetLeftAndRight", "offset", "offsetTopAndBottom", "record", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "setHasOverlappingRendering", "hasOverlappingRendering", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RenderNodeApi23 implements DeviceRenderNode {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u001A\u0010\u0005\u001A\u00020\u0004X\u0080\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeApi23$Companion;", "", "()V", "needToValidateAccess", "", "testFailCreateRenderNode", "getTestFailCreateRenderNode$ui_release", "()Z", "setTestFailCreateRenderNode$ui_release", "(Z)V", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final boolean getTestFailCreateRenderNode$ui_release() {
            return false;
        }

        public final void setTestFailCreateRenderNode$ui_release(boolean z) {
            RenderNodeApi23.testFailCreateRenderNode = z;
        }
    }

    public static final Companion Companion;
    private int bottom;
    private boolean clipToBounds;
    private int left;
    private static boolean needToValidateAccess;
    private final AndroidComposeView ownerView;
    private final RenderNode renderNode;
    private int right;
    private static boolean testFailCreateRenderNode;
    private int top;

    static {
        RenderNodeApi23.Companion = new Companion(null);
        RenderNodeApi23.needToValidateAccess = true;
    }

    public RenderNodeApi23(AndroidComposeView androidComposeView0) {
        Intrinsics.checkNotNullParameter(androidComposeView0, "ownerView");
        super();
        this.ownerView = androidComposeView0;
        RenderNode renderNode0 = RenderNode.create("Compose", androidComposeView0);
        Intrinsics.checkNotNullExpressionValue(renderNode0, "create(\"Compose\", ownerView)");
        this.renderNode = renderNode0;
        if(RenderNodeApi23.needToValidateAccess) {
            renderNode0.setScaleX(renderNode0.getScaleX());
            renderNode0.setScaleY(renderNode0.getScaleY());
            renderNode0.setTranslationX(renderNode0.getTranslationX());
            renderNode0.setTranslationY(renderNode0.getTranslationY());
            renderNode0.setElevation(renderNode0.getElevation());
            renderNode0.setRotation(renderNode0.getRotation());
            renderNode0.setRotationX(renderNode0.getRotationX());
            renderNode0.setRotationY(renderNode0.getRotationY());
            renderNode0.setCameraDistance(renderNode0.getCameraDistance());
            renderNode0.setPivotX(renderNode0.getPivotX());
            renderNode0.setPivotY(renderNode0.getPivotY());
            renderNode0.setClipToOutline(renderNode0.getClipToOutline());
            renderNode0.setClipToBounds(false);
            renderNode0.setAlpha(renderNode0.getAlpha());
            renderNode0.isValid();
            renderNode0.setLeftTopRightBottom(0, 0, 0, 0);
            renderNode0.offsetLeftAndRight(0);
            renderNode0.offsetTopAndBottom(0);
            RenderNodeApi23.needToValidateAccess = false;
        }
        if(RenderNodeApi23.testFailCreateRenderNode) {
            throw new NoClassDefFoundError();
        }
    }

    public static final boolean access$getTestFailCreateRenderNode$cp() [...] // 潜在的解密器

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void drawInto(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "canvas");
        ((DisplayListCanvas)canvas0).drawRenderNode(this.renderNode);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public DeviceRenderNodeData dumpRenderNodeData() {
        return new DeviceRenderNodeData(0L, 0, 0, 0, 0, 0, 0, this.renderNode.getScaleX(), this.renderNode.getScaleY(), this.renderNode.getTranslationX(), this.renderNode.getTranslationY(), this.renderNode.getElevation(), this.renderNode.getRotation(), this.renderNode.getRotationX(), this.renderNode.getRotationY(), this.renderNode.getCameraDistance(), this.renderNode.getPivotX(), this.renderNode.getPivotY(), this.renderNode.getClipToOutline(), this.getClipToBounds(), this.renderNode.getAlpha());
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getAlpha() {
        return this.renderNode.getAlpha();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getBottom() {
        return this.bottom;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public float getCameraDistance() {
        return -this.renderNode.getCameraDistance();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public boolean getClipToBounds() {
        return this.clipToBounds;
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
        return this.renderNode.isValid();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getHeight() {
        return this.getBottom() - this.getTop();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void getInverseMatrix(Matrix matrix0) {
        Intrinsics.checkNotNullParameter(matrix0, "matrix");
        this.renderNode.getInverseMatrix(matrix0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getLeft() {
        return this.left;
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
        return this.right;
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
        return this.renderNode.getRotation();
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
        return this.top;
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
        return 0L;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public int getWidth() {
        return this.getRight() - this.getLeft();
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetLeftAndRight(int v) {
        this.setLeft(this.getLeft() + v);
        this.setRight(this.getRight() + v);
        this.renderNode.offsetLeftAndRight(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void offsetTopAndBottom(int v) {
        this.setTop(this.getTop() + v);
        this.setBottom(this.getBottom() + v);
        this.renderNode.offsetTopAndBottom(v);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void record(CanvasHolder canvasHolder0, Path path0, Function1 function10) {
        Intrinsics.checkNotNullParameter(canvasHolder0, "canvasHolder");
        Intrinsics.checkNotNullParameter(function10, "drawBlock");
        int v = this.getWidth();
        int v1 = this.getHeight();
        DisplayListCanvas displayListCanvas0 = this.renderNode.start(v, v1);
        Intrinsics.checkNotNullExpressionValue(displayListCanvas0, "renderNode.start(width, height)");
        Canvas canvas0 = canvasHolder0.getAndroidCanvas().getInternalCanvas();
        canvasHolder0.getAndroidCanvas().setInternalCanvas(((Canvas)displayListCanvas0));
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
        this.renderNode.end(displayListCanvas0);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setAlpha(float f) {
        this.renderNode.setAlpha(f);
    }

    public void setBottom(int v) {
        this.bottom = v;
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setCameraDistance(float f) {
        this.renderNode.setCameraDistance(-f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setClipToBounds(boolean z) {
        this.clipToBounds = z;
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

    public void setLeft(int v) {
        this.left = v;
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
        this.setLeft(v);
        this.setTop(v1);
        this.setRight(v2);
        this.setBottom(v3);
        return this.renderNode.setLeftTopRightBottom(v, v1, v2, v3);
    }

    public void setRight(int v) {
        this.right = v;
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
        this.renderNode.setRotation(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleX(float f) {
        this.renderNode.setScaleX(f);
    }

    @Override  // androidx.compose.ui.platform.DeviceRenderNode
    public void setScaleY(float f) {
        this.renderNode.setScaleY(f);
    }

    public void setTop(int v) {
        this.top = v;
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

