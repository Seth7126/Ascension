package androidx.compose.ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.Path;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b0\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010F\u001A\u00020G2\u0006\u0010H\u001A\u00020IH&J\b\u0010J\u001A\u00020KH&J\u0010\u0010L\u001A\u00020G2\u0006\u0010M\u001A\u00020NH&J\u0010\u0010O\u001A\u00020G2\u0006\u0010M\u001A\u00020NH&J\u0010\u0010P\u001A\u00020G2\u0006\u0010Q\u001A\u00020\tH&J\u0010\u0010R\u001A\u00020G2\u0006\u0010Q\u001A\u00020\tH&J.\u0010S\u001A\u00020G2\u0006\u0010T\u001A\u00020U2\b\u0010V\u001A\u0004\u0018\u00010W2\u0012\u0010X\u001A\u000E\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020G0YH&J\u0010\u0010[\u001A\u00020\u00102\u0006\u0010\\\u001A\u00020\u0010H&J\u0012\u0010]\u001A\u00020G2\b\u0010^\u001A\u0004\u0018\u00010_H&J(\u0010`\u001A\u00020\u00102\u0006\u0010\u001F\u001A\u00020\t2\u0006\u00108\u001A\u00020\t2\u0006\u0010\'\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\tH&R\u0018\u0010\u0002\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\n\u0010\u000BR\u0018\u0010\f\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\r\u0010\u0005\"\u0004\b\u000E\u0010\u0007R\u0018\u0010\u000F\u001A\u00020\u0010X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001A\u00020\u0010X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0018\u0010\u0018\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\u0019\u0010\u0005\"\u0004\b\u001A\u0010\u0007R\u0012\u0010\u001B\u001A\u00020\u0010X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001C\u0010\u0012R\u0012\u0010\u001D\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b\u001E\u0010\u000BR\u0012\u0010\u001F\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b \u0010\u000BR\u0018\u0010!\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b\"\u0010\u0005\"\u0004\b#\u0010\u0007R\u0018\u0010$\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b%\u0010\u0005\"\u0004\b&\u0010\u0007R\u0012\u0010\'\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b(\u0010\u000BR\u0018\u0010)\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b*\u0010\u0005\"\u0004\b+\u0010\u0007R\u0018\u0010,\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b-\u0010\u0005\"\u0004\b.\u0010\u0007R\u0018\u0010/\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b0\u0010\u0005\"\u0004\b1\u0010\u0007R\u0018\u00102\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b3\u0010\u0005\"\u0004\b4\u0010\u0007R\u0018\u00105\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b6\u0010\u0005\"\u0004\b7\u0010\u0007R\u0012\u00108\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\b9\u0010\u000BR\u0018\u0010:\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b;\u0010\u0005\"\u0004\b<\u0010\u0007R\u0018\u0010=\u001A\u00020\u0003X\u00A6\u000E\u00A2\u0006\f\u001A\u0004\b>\u0010\u0005\"\u0004\b?\u0010\u0007R\u0012\u0010@\u001A\u00020AX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bB\u0010CR\u0012\u0010D\u001A\u00020\tX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bE\u0010\u000B\u00A8\u0006a"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNode;", "", "alpha", "", "getAlpha", "()F", "setAlpha", "(F)V", "bottom", "", "getBottom", "()I", "cameraDistance", "getCameraDistance", "setCameraDistance", "clipToBounds", "", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "clipToOutline", "getClipToOutline", "setClipToOutline", "elevation", "getElevation", "setElevation", "hasDisplayList", "getHasDisplayList", "height", "getHeight", "left", "getLeft", "pivotX", "getPivotX", "setPivotX", "pivotY", "getPivotY", "setPivotY", "right", "getRight", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "top", "getTop", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "uniqueId", "", "getUniqueId", "()J", "width", "getWidth", "drawInto", "", "canvas", "Landroid/graphics/Canvas;", "dumpRenderNodeData", "Landroidx/compose/ui/platform/DeviceRenderNodeData;", "getInverseMatrix", "matrix", "Landroid/graphics/Matrix;", "getMatrix", "offsetLeftAndRight", "offset", "offsetTopAndBottom", "record", "canvasHolder", "Landroidx/compose/ui/graphics/CanvasHolder;", "clipPath", "Landroidx/compose/ui/graphics/Path;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "setHasOverlappingRendering", "hasOverlappingRendering", "setOutline", "outline", "Landroid/graphics/Outline;", "setPosition", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface DeviceRenderNode {
    void drawInto(Canvas arg1);

    DeviceRenderNodeData dumpRenderNodeData();

    float getAlpha();

    int getBottom();

    float getCameraDistance();

    boolean getClipToBounds();

    boolean getClipToOutline();

    float getElevation();

    boolean getHasDisplayList();

    int getHeight();

    void getInverseMatrix(Matrix arg1);

    int getLeft();

    void getMatrix(Matrix arg1);

    float getPivotX();

    float getPivotY();

    int getRight();

    float getRotationX();

    float getRotationY();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    int getTop();

    float getTranslationX();

    float getTranslationY();

    long getUniqueId();

    int getWidth();

    void offsetLeftAndRight(int arg1);

    void offsetTopAndBottom(int arg1);

    void record(CanvasHolder arg1, Path arg2, Function1 arg3);

    void setAlpha(float arg1);

    void setCameraDistance(float arg1);

    void setClipToBounds(boolean arg1);

    void setClipToOutline(boolean arg1);

    void setElevation(float arg1);

    boolean setHasOverlappingRendering(boolean arg1);

    void setOutline(Outline arg1);

    void setPivotX(float arg1);

    void setPivotY(float arg1);

    boolean setPosition(int arg1, int arg2, int arg3, int arg4);

    void setRotationX(float arg1);

    void setRotationY(float arg1);

    void setRotationZ(float arg1);

    void setScaleX(float arg1);

    void setScaleY(float arg1);

    void setTranslationX(float arg1);

    void setTranslationY(float arg1);
}

