package androidx.compose.ui.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001A\u00020\u0019H\u0016J@\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u001B\u001A\u00020\u001C2\u0006\u0010\u001D\u001A\u00020\u00142\u0006\u0010\u001E\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u001F\u001A\u00020\u00142\u0006\u0010 \u001A\u00020\u0014H\u0016R\u0014\u0010\u0002\u001A\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\t\u0010\nR\u001D\u0010\u000B\u001A\u00020\f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u000ER\u0014\u0010\u0016\u001A\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0017\u0010\u000E\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "getBitmap$ui_graphics_release", "()Landroid/graphics/Bitmap;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "()I", "hasAlpha", "", "getHasAlpha", "()Z", "height", "", "getHeight", "width", "getWidth", "prepareToDraw", "", "readPixels", "buffer", "", "startX", "startY", "bufferOffset", "stride", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidImageBitmap implements ImageBitmap {
    private final Bitmap bitmap;

    public AndroidImageBitmap(Bitmap bitmap0) {
        Intrinsics.checkNotNullParameter(bitmap0, "bitmap");
        super();
        this.bitmap = bitmap0;
    }

    public final Bitmap getBitmap$ui_graphics_release() {
        return this.bitmap;
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public ColorSpace getColorSpace() {
        return Build.VERSION.SDK_INT >= 26 ? Api26Bitmap.Companion.composeColorSpace$ui_graphics_release(this.getBitmap$ui_graphics_release()) : ColorSpaces.INSTANCE.getSrgb();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getConfig-_sVssgQ() {
        Bitmap.Config bitmap$Config0 = this.bitmap.getConfig();
        Intrinsics.checkNotNullExpressionValue(bitmap$Config0, "bitmap.config");
        return AndroidImageBitmap_androidKt.toImageConfig(bitmap$Config0);
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.bitmap.hasAlpha();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.bitmap.prepareToDraw();
    }

    @Override  // androidx.compose.ui.graphics.ImageBitmap
    public void readPixels(int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5) {
        boolean z;
        Intrinsics.checkNotNullParameter(arr_v, "buffer");
        Bitmap bitmap0 = AndroidImageBitmap_androidKt.asAndroidBitmap(this);
        if(Build.VERSION.SDK_INT < 26 || bitmap0.getConfig() != Bitmap.Config.HARDWARE) {
            z = false;
        }
        else {
            bitmap0 = bitmap0.copy(Bitmap.Config.ARGB_8888, false);
            z = true;
        }
        bitmap0.getPixels(arr_v, v4, v5, v, v1, v2, v3);
        if(z) {
            bitmap0.recycle();
        }
    }
}

