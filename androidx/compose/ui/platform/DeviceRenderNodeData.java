package androidx.compose.ui.platform;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\bF\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u00AD\u0001\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005\u0012\u0006\u0010\t\u001A\u00020\u0005\u0012\u0006\u0010\n\u001A\u00020\u0005\u0012\u0006\u0010\u000B\u001A\u00020\f\u0012\u0006\u0010\r\u001A\u00020\f\u0012\u0006\u0010\u000E\u001A\u00020\f\u0012\u0006\u0010\u000F\u001A\u00020\f\u0012\u0006\u0010\u0010\u001A\u00020\f\u0012\u0006\u0010\u0011\u001A\u00020\f\u0012\u0006\u0010\u0012\u001A\u00020\f\u0012\u0006\u0010\u0013\u001A\u00020\f\u0012\u0006\u0010\u0014\u001A\u00020\f\u0012\u0006\u0010\u0015\u001A\u00020\f\u0012\u0006\u0010\u0016\u001A\u00020\f\u0012\u0006\u0010\u0017\u001A\u00020\u0018\u0012\u0006\u0010\u0019\u001A\u00020\u0018\u0012\u0006\u0010\u001A\u001A\u00020\f\u00A2\u0006\u0002\u0010\u001BJ\t\u0010E\u001A\u00020\u0003H\u00C6\u0003J\t\u0010F\u001A\u00020\fH\u00C6\u0003J\t\u0010G\u001A\u00020\fH\u00C6\u0003J\t\u0010H\u001A\u00020\fH\u00C6\u0003J\t\u0010I\u001A\u00020\fH\u00C6\u0003J\t\u0010J\u001A\u00020\fH\u00C6\u0003J\t\u0010K\u001A\u00020\fH\u00C6\u0003J\t\u0010L\u001A\u00020\fH\u00C6\u0003J\t\u0010M\u001A\u00020\fH\u00C6\u0003J\t\u0010N\u001A\u00020\fH\u00C6\u0003J\t\u0010O\u001A\u00020\u0018H\u00C6\u0003J\t\u0010P\u001A\u00020\u0005H\u00C6\u0003J\t\u0010Q\u001A\u00020\u0018H\u00C6\u0003J\t\u0010R\u001A\u00020\fH\u00C6\u0003J\t\u0010S\u001A\u00020\u0005H\u00C6\u0003J\t\u0010T\u001A\u00020\u0005H\u00C6\u0003J\t\u0010U\u001A\u00020\u0005H\u00C6\u0003J\t\u0010V\u001A\u00020\u0005H\u00C6\u0003J\t\u0010W\u001A\u00020\u0005H\u00C6\u0003J\t\u0010X\u001A\u00020\fH\u00C6\u0003J\t\u0010Y\u001A\u00020\fH\u00C6\u0003J\u00DB\u0001\u0010Z\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00052\b\b\u0002\u0010\u0007\u001A\u00020\u00052\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u00052\b\b\u0002\u0010\n\u001A\u00020\u00052\b\b\u0002\u0010\u000B\u001A\u00020\f2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\f2\b\b\u0002\u0010\u0010\u001A\u00020\f2\b\b\u0002\u0010\u0011\u001A\u00020\f2\b\b\u0002\u0010\u0012\u001A\u00020\f2\b\b\u0002\u0010\u0013\u001A\u00020\f2\b\b\u0002\u0010\u0014\u001A\u00020\f2\b\b\u0002\u0010\u0015\u001A\u00020\f2\b\b\u0002\u0010\u0016\u001A\u00020\f2\b\b\u0002\u0010\u0017\u001A\u00020\u00182\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\fH\u00C6\u0001J\u0013\u0010[\u001A\u00020\u00182\b\u0010\\\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003J\t\u0010]\u001A\u00020\u0005H\u00D6\u0001J\t\u0010^\u001A\u00020_H\u00D6\u0001R\u001A\u0010\u001A\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001C\u0010\u001D\"\u0004\b\u001E\u0010\u001FR\u0011\u0010\b\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R\u001A\u0010\u0014\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\"\u0010\u001D\"\u0004\b#\u0010\u001FR\u001A\u0010\u0019\u001A\u00020\u0018X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001A\u0010\u0017\u001A\u00020\u0018X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010%\"\u0004\b)\u0010\'R\u001A\u0010\u0010\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b*\u0010\u001D\"\u0004\b+\u0010\u001FR\u0011\u0010\n\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010!R\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b-\u0010!R\u001A\u0010\u0015\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b.\u0010\u001D\"\u0004\b/\u0010\u001FR\u001A\u0010\u0016\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b0\u0010\u001D\"\u0004\b1\u0010\u001FR\u0011\u0010\u0007\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b2\u0010!R\u001A\u0010\u0012\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b3\u0010\u001D\"\u0004\b4\u0010\u001FR\u001A\u0010\u0013\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b5\u0010\u001D\"\u0004\b6\u0010\u001FR\u001A\u0010\u0011\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b7\u0010\u001D\"\u0004\b8\u0010\u001FR\u001A\u0010\u000B\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b9\u0010\u001D\"\u0004\b:\u0010\u001FR\u001A\u0010\r\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010\u001D\"\u0004\b<\u0010\u001FR\u0011\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b=\u0010!R\u001A\u0010\u000E\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b>\u0010\u001D\"\u0004\b?\u0010\u001FR\u001A\u0010\u000F\u001A\u00020\fX\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b@\u0010\u001D\"\u0004\bA\u0010\u001FR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\bB\u0010CR\u0011\u0010\t\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\bD\u0010!\u00A8\u0006`"}, d2 = {"Landroidx/compose/ui/platform/DeviceRenderNodeData;", "", "uniqueId", "", "left", "", "top", "right", "bottom", "width", "height", "scaleX", "", "scaleY", "translationX", "translationY", "elevation", "rotationZ", "rotationX", "rotationY", "cameraDistance", "pivotX", "pivotY", "clipToOutline", "", "clipToBounds", "alpha", "(JIIIIIIFFFFFFFFFFFZZF)V", "getAlpha", "()F", "setAlpha", "(F)V", "getBottom", "()I", "getCameraDistance", "setCameraDistance", "getClipToBounds", "()Z", "setClipToBounds", "(Z)V", "getClipToOutline", "setClipToOutline", "getElevation", "setElevation", "getHeight", "getLeft", "getPivotX", "setPivotX", "getPivotY", "setPivotY", "getRight", "getRotationX", "setRotationX", "getRotationY", "setRotationY", "getRotationZ", "setRotationZ", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTop", "getTranslationX", "setTranslationX", "getTranslationY", "setTranslationY", "getUniqueId", "()J", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DeviceRenderNodeData {
    private float alpha;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public DeviceRenderNodeData(long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11) {
        this.uniqueId = v;
        this.left = v1;
        this.top = v2;
        this.right = v3;
        this.bottom = v4;
        this.width = v5;
        this.height = v6;
        this.scaleX = f;
        this.scaleY = f1;
        this.translationX = f2;
        this.translationY = f3;
        this.elevation = f4;
        this.rotationZ = f5;
        this.rotationX = f6;
        this.rotationY = f7;
        this.cameraDistance = f8;
        this.pivotX = f9;
        this.pivotY = f10;
        this.clipToOutline = z;
        this.clipToBounds = z1;
        this.alpha = f11;
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final float component13() {
        return this.rotationZ;
    }

    public final float component14() {
        return this.rotationX;
    }

    public final float component15() {
        return this.rotationY;
    }

    public final float component16() {
        return this.cameraDistance;
    }

    public final float component17() {
        return this.pivotX;
    }

    public final float component18() {
        return this.pivotY;
    }

    public final boolean component19() {
        return this.clipToOutline;
    }

    public final int component2() {
        return this.left;
    }

    public final boolean component20() {
        return this.clipToBounds;
    }

    public final float component21() {
        return this.alpha;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    public final DeviceRenderNodeData copy(long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11) {
        return new DeviceRenderNodeData(v, v1, v2, v3, v4, v5, v6, f, f1, f2, f3, f4, f5, f6, f7, f8, f9, f10, z, z1, f11);
    }

    public static DeviceRenderNodeData copy$default(DeviceRenderNodeData deviceRenderNodeData0, long v, int v1, int v2, int v3, int v4, int v5, int v6, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, boolean z, boolean z1, float f11, int v7, Object object0) {
        long v8 = (v7 & 1) == 0 ? v : deviceRenderNodeData0.uniqueId;
        int v9 = (v7 & 2) == 0 ? v1 : deviceRenderNodeData0.left;
        int v10 = (v7 & 4) == 0 ? v2 : deviceRenderNodeData0.top;
        int v11 = (v7 & 8) == 0 ? v3 : deviceRenderNodeData0.right;
        int v12 = (v7 & 16) == 0 ? v4 : deviceRenderNodeData0.bottom;
        int v13 = (v7 & 0x20) == 0 ? v5 : deviceRenderNodeData0.width;
        int v14 = (v7 & 0x40) == 0 ? v6 : deviceRenderNodeData0.height;
        float f12 = (v7 & 0x80) == 0 ? f : deviceRenderNodeData0.scaleX;
        float f13 = (v7 & 0x100) == 0 ? f1 : deviceRenderNodeData0.scaleY;
        float f14 = (v7 & 0x200) == 0 ? f2 : deviceRenderNodeData0.translationX;
        float f15 = (v7 & 0x400) == 0 ? f3 : deviceRenderNodeData0.translationY;
        float f16 = (v7 & 0x800) == 0 ? f4 : deviceRenderNodeData0.elevation;
        float f17 = (v7 & 0x1000) == 0 ? f5 : deviceRenderNodeData0.rotationZ;
        float f18 = (v7 & 0x2000) == 0 ? f6 : deviceRenderNodeData0.rotationX;
        float f19 = (v7 & 0x4000) == 0 ? f7 : deviceRenderNodeData0.rotationY;
        float f20 = (v7 & 0x8000) == 0 ? f8 : deviceRenderNodeData0.cameraDistance;
        float f21 = (v7 & 0x10000) == 0 ? f9 : deviceRenderNodeData0.pivotX;
        float f22 = (v7 & 0x20000) == 0 ? f10 : deviceRenderNodeData0.pivotY;
        boolean z2 = (v7 & 0x40000) == 0 ? z : deviceRenderNodeData0.clipToOutline;
        boolean z3 = (v7 & 0x80000) == 0 ? z1 : deviceRenderNodeData0.clipToBounds;
        return (v7 & 0x100000) == 0 ? deviceRenderNodeData0.copy(v8, v9, v10, v11, v12, v13, v14, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, z2, z3, f11) : deviceRenderNodeData0.copy(v8, v9, v10, v11, v12, v13, v14, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, z2, z3, deviceRenderNodeData0.alpha);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData0 = (DeviceRenderNodeData)object0;
        if(this.uniqueId != deviceRenderNodeData0.uniqueId) {
            return false;
        }
        if(this.left != deviceRenderNodeData0.left) {
            return false;
        }
        if(this.top != deviceRenderNodeData0.top) {
            return false;
        }
        if(this.right != deviceRenderNodeData0.right) {
            return false;
        }
        if(this.bottom != deviceRenderNodeData0.bottom) {
            return false;
        }
        if(this.width != deviceRenderNodeData0.width) {
            return false;
        }
        if(this.height != deviceRenderNodeData0.height) {
            return false;
        }
        if(!Intrinsics.areEqual(this.scaleX, deviceRenderNodeData0.scaleX)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.scaleY, deviceRenderNodeData0.scaleY)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.translationX, deviceRenderNodeData0.translationX)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.translationY, deviceRenderNodeData0.translationY)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.elevation, deviceRenderNodeData0.elevation)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.rotationZ, deviceRenderNodeData0.rotationZ)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.rotationX, deviceRenderNodeData0.rotationX)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.rotationY, deviceRenderNodeData0.rotationY)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.cameraDistance, deviceRenderNodeData0.cameraDistance)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.pivotX, deviceRenderNodeData0.pivotX)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.pivotY, deviceRenderNodeData0.pivotY)) {
            return false;
        }
        if(this.clipToOutline != deviceRenderNodeData0.clipToOutline) {
            return false;
        }
        return this.clipToBounds == deviceRenderNodeData0.clipToBounds ? Intrinsics.areEqual(this.alpha, deviceRenderNodeData0.alpha) : false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override
    public int hashCode() {
        int v = (((((((((((((((((((int)(this.uniqueId ^ this.uniqueId >>> 0x20)) * 0x1F + this.left) * 0x1F + this.top) * 0x1F + this.right) * 0x1F + this.bottom) * 0x1F + this.width) * 0x1F + this.height) * 0x1F + Float.floatToIntBits(this.scaleX)) * 0x1F + Float.floatToIntBits(this.scaleY)) * 0x1F + Float.floatToIntBits(this.translationX)) * 0x1F + Float.floatToIntBits(this.translationY)) * 0x1F + Float.floatToIntBits(this.elevation)) * 0x1F + Float.floatToIntBits(this.rotationZ)) * 0x1F + Float.floatToIntBits(this.rotationX)) * 0x1F + Float.floatToIntBits(this.rotationY)) * 0x1F + Float.floatToIntBits(this.cameraDistance)) * 0x1F + Float.floatToIntBits(this.pivotX)) * 0x1F + Float.floatToIntBits(this.pivotY)) * 0x1F;
        int v1 = this.clipToOutline;
        int v2 = 1;
        if(v1) {
            v1 = 1;
        }
        if(!this.clipToBounds) {
            v2 = false;
        }
        return ((v + v1) * 0x1F + v2) * 0x1F + Float.floatToIntBits(this.alpha);
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    @Override
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ')';
    }
}

