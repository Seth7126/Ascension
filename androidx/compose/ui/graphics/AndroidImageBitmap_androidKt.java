package androidx.compose.ui.graphics;

import android.graphics.Bitmap.Config;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001A=\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\b2\u0006\u0010\t\u001A\u00020\nH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u001A\n\u0010\r\u001A\u00020\u000E*\u00020\u0001\u001A\n\u0010\u000F\u001A\u00020\u0001*\u00020\u000E\u001A\u0019\u0010\u0010\u001A\u00020\u0011*\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001A\u0014\u0010\u0014\u001A\u00020\u0006*\u00020\u0011H\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0016"}, d2 = {"ActualImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "width", "", "height", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "ActualImageBitmap-x__-hDU", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroidx/compose/ui/graphics/ImageBitmap;", "asAndroidBitmap", "Landroid/graphics/Bitmap;", "asImageBitmap", "toBitmapConfig", "Landroid/graphics/Bitmap$Config;", "toBitmapConfig-1JJdX4A", "(I)Landroid/graphics/Bitmap$Config;", "toImageConfig", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidImageBitmap_androidKt {
    public static final ImageBitmap ActualImageBitmap-x__-hDU(int v, int v1, int v2, boolean z, ColorSpace colorSpace0) {
        Intrinsics.checkNotNullParameter(colorSpace0, "colorSpace");
        Bitmap.Config bitmap$Config0 = AndroidImageBitmap_androidKt.toBitmapConfig-1JJdX4A(v2);
        if(Build.VERSION.SDK_INT >= 26) {
            return new AndroidImageBitmap(Api26Bitmap.Companion.createBitmap-x__-hDU$ui_graphics_release(v, v1, v2, z, colorSpace0));
        }
        Bitmap bitmap0 = Bitmap.createBitmap(null, v, v1, bitmap$Config0);
        Intrinsics.checkNotNullExpressionValue(bitmap0, "createBitmap(\n            null as DisplayMetrics?,\n            width,\n            height,\n            bitmapConfig\n        )");
        bitmap0.setHasAlpha(z);
        return new AndroidImageBitmap(bitmap0);
    }

    public static final Bitmap asAndroidBitmap(ImageBitmap imageBitmap0) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "<this>");
        if(!(imageBitmap0 instanceof AndroidImageBitmap)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
        }
        return ((AndroidImageBitmap)imageBitmap0).getBitmap$ui_graphics_release();
    }

    public static final ImageBitmap asImageBitmap(Bitmap bitmap0) {
        Intrinsics.checkNotNullParameter(bitmap0, "<this>");
        return new AndroidImageBitmap(bitmap0);
    }

    public static final Bitmap.Config toBitmapConfig-1JJdX4A(int v) {
        if(ImageBitmapConfig.equals-impl0(v, 0)) {
            return Bitmap.Config.ARGB_8888;
        }
        if(ImageBitmapConfig.equals-impl0(v, 1)) {
            return Bitmap.Config.ALPHA_8;
        }
        if(ImageBitmapConfig.equals-impl0(v, 2)) {
            return Bitmap.Config.RGB_565;
        }
        if(Build.VERSION.SDK_INT >= 26 && ImageBitmapConfig.equals-impl0(v, 3)) {
            return Bitmap.Config.RGBA_F16;
        }
        return Build.VERSION.SDK_INT < 26 || !ImageBitmapConfig.equals-impl0(v, 4) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE;
    }

    public static final int toImageConfig(Bitmap.Config bitmap$Config0) {
        Intrinsics.checkNotNullParameter(bitmap$Config0, "<this>");
        if(bitmap$Config0 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if(bitmap$Config0 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if(bitmap$Config0 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        if(Build.VERSION.SDK_INT >= 26 && bitmap$Config0 == Bitmap.Config.RGBA_F16) {
            return 3;
        }
        return Build.VERSION.SDK_INT < 26 || bitmap$Config0 != Bitmap.Config.HARDWARE ? 0 : 4;
    }
}

