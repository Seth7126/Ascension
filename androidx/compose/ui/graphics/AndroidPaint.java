package androidx.compose.ui.graphics;

import android.graphics.Shader;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0002J\f\u0010J\u001A\u00060$j\u0002`KH\u0016R\u0019\u0010\u0003\u001A\u00020\u0004X\u0082\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u0005R$\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00078V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR-\u0010\r\u001A\u00020\u00042\u0006\u0010\u0006\u001A\u00020\u00048V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R-\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u00138V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R(\u0010\u0019\u001A\u0004\u0018\u00010\u00182\b\u0010\u0006\u001A\u0004\u0018\u00010\u00188V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001DR-\u0010\u001F\u001A\u00020\u001E2\u0006\u0010\u0006\u001A\u00020\u001E8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\b \u0010\u000F\"\u0004\b!\u0010\u0011R\u0010\u0010\"\u001A\u0004\u0018\u00010\u0018X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010#\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0016\u0010%\u001A\n\u0018\u00010&j\u0004\u0018\u0001`\'X\u0082\u000E\u00A2\u0006\u0002\n\u0000R$\u0010)\u001A\u00020(2\u0006\u0010\u0006\u001A\u00020(8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b)\u0010*\"\u0004\b+\u0010,R(\u0010.\u001A\u0004\u0018\u00010-2\b\u0010\u0006\u001A\u0004\u0018\u00010-@VX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b/\u00100\"\u0004\b1\u00102R4\u00103\u001A\n\u0018\u00010&j\u0004\u0018\u0001`\'2\u000E\u0010\u0006\u001A\n\u0018\u00010&j\u0004\u0018\u0001`\'8V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\b4\u00105\"\u0004\b6\u00107R-\u00109\u001A\u0002082\u0006\u0010\u0006\u001A\u0002088V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\b:\u0010\u000F\"\u0004\b;\u0010\u0011R-\u0010=\u001A\u00020<2\u0006\u0010\u0006\u001A\u00020<8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\b>\u0010\u000F\"\u0004\b?\u0010\u0011R$\u0010@\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00078V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bA\u0010\n\"\u0004\bB\u0010\fR$\u0010C\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00078V@VX\u0096\u000E\u00A2\u0006\f\u001A\u0004\bD\u0010\n\"\u0004\bE\u0010\fR-\u0010G\u001A\u00020F2\u0006\u0010\u0006\u001A\u00020F8V@VX\u0096\u000E\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\f\u001A\u0004\bH\u0010\u000F\"\u0004\bI\u0010\u0011\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006L"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPaint;", "Landroidx/compose/ui/graphics/Paint;", "()V", "_blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "I", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "color", "Landroidx/compose/ui/graphics/Color;", "getColor-0d7_KjU", "()J", "setColor-8_81llA", "(J)V", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/FilterQuality;", "filterQuality", "getFilterQuality-f-v9h1I", "setFilterQuality-vDHp3xo", "internalColorFilter", "internalPaint", "Landroid/graphics/Paint;", "internalShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "", "isAntiAlias", "()Z", "setAntiAlias", "(Z)V", "Landroidx/compose/ui/graphics/PathEffect;", "pathEffect", "getPathEffect", "()Landroidx/compose/ui/graphics/PathEffect;", "setPathEffect", "(Landroidx/compose/ui/graphics/PathEffect;)V", "shader", "getShader", "()Landroid/graphics/Shader;", "setShader", "(Landroid/graphics/Shader;)V", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeCap", "getStrokeCap-KaPHkGw", "setStrokeCap-BeK7IIE", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeJoin", "getStrokeJoin-LxFBmk8", "setStrokeJoin-Ww9F2mQ", "strokeMiterLimit", "getStrokeMiterLimit", "setStrokeMiterLimit", "strokeWidth", "getStrokeWidth", "setStrokeWidth", "Landroidx/compose/ui/graphics/PaintingStyle;", "style", "getStyle-TiuSbCo", "setStyle-k9PVt8s", "asFrameworkPaint", "Landroidx/compose/ui/graphics/NativePaint;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidPaint implements Paint {
    private int _blendMode;
    private ColorFilter internalColorFilter;
    private android.graphics.Paint internalPaint;
    private Shader internalShader;
    private PathEffect pathEffect;

    public AndroidPaint() {
        this.internalPaint = AndroidPaint_androidKt.makeNativePaint();
        this._blendMode = 3;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public android.graphics.Paint asFrameworkPaint() {
        return this.internalPaint;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float getAlpha() {
        return AndroidPaint_androidKt.getNativeAlpha(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getBlendMode-0nO6VwU() {
        return this._blendMode;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public long getColor-0d7_KjU() {
        return AndroidPaint_androidKt.getNativeColor(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public ColorFilter getColorFilter() {
        return this.internalColorFilter;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getFilterQuality-f-v9h1I() {
        return AndroidPaint_androidKt.getNativeFilterQuality(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public PathEffect getPathEffect() {
        return this.pathEffect;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public Shader getShader() {
        return this.internalShader;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getStrokeCap-KaPHkGw() {
        return AndroidPaint_androidKt.getNativeStrokeCap(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getStrokeJoin-LxFBmk8() {
        return AndroidPaint_androidKt.getNativeStrokeJoin(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float getStrokeMiterLimit() {
        return AndroidPaint_androidKt.getNativeStrokeMiterLimit(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public float getStrokeWidth() {
        return AndroidPaint_androidKt.getNativeStrokeWidth(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public int getStyle-TiuSbCo() {
        return AndroidPaint_androidKt.getNativeStyle(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public boolean isAntiAlias() {
        return AndroidPaint_androidKt.getNativeAntiAlias(this.internalPaint);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setAlpha(float f) {
        AndroidPaint_androidKt.setNativeAlpha(this.internalPaint, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setAntiAlias(boolean z) {
        AndroidPaint_androidKt.setNativeAntiAlias(this.internalPaint, z);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setBlendMode-s9anfk8(int v) {
        this._blendMode = v;
        AndroidPaint_androidKt.setNativeBlendMode-GB0RdKg(this.internalPaint, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setColor-8_81llA(long v) {
        AndroidPaint_androidKt.setNativeColor-4WTKRHQ(this.internalPaint, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setColorFilter(ColorFilter colorFilter0) {
        this.internalColorFilter = colorFilter0;
        AndroidPaint_androidKt.setNativeColorFilter(this.internalPaint, colorFilter0);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setFilterQuality-vDHp3xo(int v) {
        AndroidPaint_androidKt.setNativeFilterQuality-50PEsBU(this.internalPaint, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setPathEffect(PathEffect pathEffect0) {
        AndroidPaint_androidKt.setNativePathEffect(this.internalPaint, pathEffect0);
        this.pathEffect = pathEffect0;
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setShader(Shader shader0) {
        this.internalShader = shader0;
        AndroidPaint_androidKt.setNativeShader(this.internalPaint, shader0);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeCap-BeK7IIE(int v) {
        AndroidPaint_androidKt.setNativeStrokeCap-CSYIeUk(this.internalPaint, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeJoin-Ww9F2mQ(int v) {
        AndroidPaint_androidKt.setNativeStrokeJoin-kLtJ_vA(this.internalPaint, v);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeMiterLimit(float f) {
        AndroidPaint_androidKt.setNativeStrokeMiterLimit(this.internalPaint, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStrokeWidth(float f) {
        AndroidPaint_androidKt.setNativeStrokeWidth(this.internalPaint, f);
    }

    @Override  // androidx.compose.ui.graphics.Paint
    public void setStyle-k9PVt8s(int v) {
        AndroidPaint_androidKt.setNativeStyle--5YerkU(this.internalPaint, v);
    }
}

