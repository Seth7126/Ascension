package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawTransform.DefaultImpls;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b&\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\u0016\u0010C\u001A\u00020\u00132\u0006\u0010D\u001A\u00020#2\u0006\u0010E\u001A\u00020\u0001J\u001E\u0010F\u001A\u00020\u00132\u0006\u0010G\u001A\u00020#2\u0006\u0010H\u001A\u00020#2\u0006\u0010I\u001A\u00020#J\u0016\u0010J\u001A\u00020\u00132\u0006\u0010D\u001A\u00020#2\u0006\u0010I\u001A\u00020#J\b\u0010K\u001A\u00020\u001CH\u0016J\b\u0010L\u001A\u00020\u0013H\u0002J\b\u0010M\u001A\u00020\u0013H\u0002J\f\u0010N\u001A\u00020\u0013*\u00020OH\u0016R\u0014\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00010\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E\u00A2\u0006\u0002\n\u0000R0\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u001B\u0010\u000F\u001A\u0004\u0018\u00010\u0010X\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0011R4\u0010\u0014\u001A\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u000E\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012@PX\u0090\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u000E\u0010\u0019\u001A\u00020\u001AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u001B\u001A\u00020\u001AX\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0007\u001A\u00020\u001C@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u0011\u0010\"\u001A\u00020#8F\u00A2\u0006\u0006\u001A\u0004\b$\u0010%R\u0010\u0010&\u001A\u0004\u0018\u00010\'X\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010)\u001A\u00020(2\u0006\u0010\u0007\u001A\u00020(@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001A\u00020(2\u0006\u0010\u0007\u001A\u00020(@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u00101\u001A\u00020(2\u0006\u0010\u0007\u001A\u00020(@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b2\u0010+\"\u0004\b3\u0010-R$\u00104\u001A\u00020(2\u0006\u0010\u0007\u001A\u00020(@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b5\u0010+\"\u0004\b6\u0010-R$\u00107\u001A\u00020(2\u0006\u0010\u0007\u001A\u00020(@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b8\u0010+\"\u0004\b9\u0010-R$\u0010:\u001A\u00020(2\u0006\u0010\u0007\u001A\u00020(@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010+\"\u0004\b<\u0010-R$\u0010=\u001A\u00020(2\u0006\u0010\u0007\u001A\u00020(@FX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b>\u0010+\"\u0004\b?\u0010-R\u0014\u0010@\u001A\u00020\u001A8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bA\u0010B\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006P"}, d2 = {"Landroidx/compose/ui/graphics/vector/GroupComponent;", "Landroidx/compose/ui/graphics/vector/VNode;", "()V", "children", "", "clipPath", "Landroidx/compose/ui/graphics/Path;", "value", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "clipPathData", "getClipPathData", "()Ljava/util/List;", "setClipPathData", "(Ljava/util/List;)V", "groupMatrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "Lkotlin/Function0;", "", "invalidateListener", "getInvalidateListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "setInvalidateListener$ui_release", "(Lkotlin/jvm/functions/Function0;)V", "isClipPathDirty", "", "isMatrixDirty", "", "name", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "numChildren", "", "getNumChildren", "()I", "parser", "Landroidx/compose/ui/graphics/vector/PathParser;", "", "pivotX", "getPivotX", "()F", "setPivotX", "(F)V", "pivotY", "getPivotY", "setPivotY", "rotation", "getRotation", "setRotation", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "willClipPath", "getWillClipPath", "()Z", "insertAt", "index", "instance", "move", "from", "to", "count", "remove", "toString", "updateClipPath", "updateMatrix", "draw", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class GroupComponent extends VNode {
    private final List children;
    private Path clipPath;
    private List clipPathData;
    private float[] groupMatrix;
    private Function0 invalidateListener;
    private boolean isClipPathDirty;
    private boolean isMatrixDirty;
    private String name;
    private PathParser parser;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private float scaleX;
    private float scaleY;
    private float translationX;
    private float translationY;

    public GroupComponent() {
        super(null);
        this.children = new ArrayList();
        this.clipPathData = VectorKt.getEmptyPath();
        this.isClipPathDirty = true;
        this.name = "";
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.isMatrixDirty = true;
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void draw(DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        if(this.isMatrixDirty) {
            this.updateMatrix();
            this.isMatrixDirty = false;
        }
        if(this.isClipPathDirty) {
            this.updateClipPath();
            this.isClipPathDirty = false;
        }
        DrawContext drawContext0 = drawScope0.getDrawContext();
        long v1 = drawContext0.getSize-NH-jbRc();
        drawContext0.getCanvas().save();
        DrawTransform drawTransform0 = drawContext0.getTransform();
        float[] arr_f = this.groupMatrix;
        if(arr_f != null) {
            drawTransform0.transform-58bKbWc(arr_f);
        }
        Path path0 = this.clipPath;
        if(this.getWillClipPath() && path0 != null) {
            DefaultImpls.clipPath-mtrdD-E$default(drawTransform0, path0, 0, 2, null);
        }
        List list0 = this.children;
        int v2 = list0.size();
        if(v2 - 1 >= 0) {
            for(int v = 0; true; ++v) {
                ((VNode)list0.get(v)).draw(drawScope0);
                if(v + 1 > v2 - 1) {
                    break;
                }
            }
        }
        drawContext0.getCanvas().restore();
        drawContext0.setSize-uvyYCjk(v1);
    }

    public final List getClipPathData() {
        return this.clipPathData;
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public Function0 getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final String getName() [...] // 潜在的解密器

    public final int getNumChildren() {
        return this.children.size();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    private final boolean getWillClipPath() {
        return !this.clipPathData.isEmpty();
    }

    public final void insertAt(int v, VNode vNode0) {
        Intrinsics.checkNotNullParameter(vNode0, "instance");
        if(v < this.getNumChildren()) {
            this.children.set(v, vNode0);
        }
        else {
            this.children.add(vNode0);
        }
        vNode0.setInvalidateListener$ui_release(this.getInvalidateListener$ui_release());
        this.invalidate();
    }

    public final void move(int v, int v1, int v2) {
        int v3 = 0;
        if(v > v1) {
            while(v3 < v2) {
                VNode vNode0 = (VNode)this.children.get(v);
                this.children.remove(v);
                this.children.add(v1, vNode0);
                ++v1;
                ++v3;
            }
        }
        else {
            while(v3 < v2) {
                VNode vNode1 = (VNode)this.children.get(v);
                this.children.remove(v);
                this.children.add(v1 - 1, vNode1);
                ++v3;
            }
        }
        this.invalidate();
    }

    public final void remove(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            if(v < this.children.size()) {
                ((VNode)this.children.get(v)).setInvalidateListener$ui_release(null);
                this.children.remove(v);
            }
        }
        this.invalidate();
    }

    public final void setClipPathData(List list0) {
        Intrinsics.checkNotNullParameter(list0, "value");
        this.clipPathData = list0;
        this.isClipPathDirty = true;
        this.invalidate();
    }

    @Override  // androidx.compose.ui.graphics.vector.VNode
    public void setInvalidateListener$ui_release(Function0 function00) {
        this.invalidateListener = function00;
        List list0 = this.children;
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                ((VNode)list0.get(v1)).setInvalidateListener$ui_release(function00);
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
    }

    public final void setName(String s) {
        Intrinsics.checkNotNullParameter(s, "value");
        this.name = s;
        this.invalidate();
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        this.isMatrixDirty = true;
        this.invalidate();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        this.isMatrixDirty = true;
        this.invalidate();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        this.isMatrixDirty = true;
        this.invalidate();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        this.isMatrixDirty = true;
        this.invalidate();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        this.isMatrixDirty = true;
        this.invalidate();
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
        this.isMatrixDirty = true;
        this.invalidate();
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
        this.isMatrixDirty = true;
        this.invalidate();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("VGroup: ");
        stringBuilder0.append(this.name);
        List list0 = this.children;
        int v = list0.size();
        if(v - 1 >= 0) {
            for(int v1 = 0; true; ++v1) {
                VNode vNode0 = (VNode)list0.get(v1);
                stringBuilder0.append("\t");
                stringBuilder0.append(vNode0.toString());
                stringBuilder0.append("\n");
                if(v1 + 1 > v - 1) {
                    break;
                }
            }
        }
        String s = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "sb.toString()");
        return s;
    }

    private final void updateClipPath() {
        if(this.getWillClipPath()) {
            PathParser pathParser0 = this.parser;
            if(pathParser0 == null) {
                pathParser0 = new PathParser();
                this.parser = pathParser0;
            }
            else {
                pathParser0.clear();
            }
            Path path0 = this.clipPath;
            if(path0 == null) {
                path0 = AndroidPath_androidKt.Path();
                this.clipPath = path0;
            }
            else {
                path0.reset();
            }
            pathParser0.addPathNodes(this.clipPathData).toPath(path0);
        }
    }

    private final void updateMatrix() {
        float[] arr_f = this.groupMatrix;
        if(arr_f == null) {
            arr_f = Matrix.constructor-impl$default(null, 1, null);
            this.groupMatrix = arr_f;
        }
        else {
            Matrix.reset-impl(arr_f);
        }
        Matrix.translate-impl$default(arr_f, this.pivotX + this.translationX, this.pivotY + this.translationY, 0.0f, 4, null);
        Matrix.rotateZ-impl(arr_f, this.rotation);
        Matrix.scale-impl(arr_f, this.scaleX, this.scaleY, 1.0f);
        Matrix.translate-impl$default(arr_f, -this.pivotX, -this.pivotY, 0.0f, 4, null);
    }
}

