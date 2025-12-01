package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\bf\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CJ\b\u0010\u0013\u001A\u00020\u0014H&JL\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u00172\b\b\u0002\u0010\u0018\u001A\u00020\u000F2\b\b\u0002\u0010\u0019\u001A\u00020\u000F2\b\b\u0002\u0010\u0011\u001A\u00020\u000F2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u001A\u001A\u00020\u000F2\b\b\u0002\u0010\u001B\u001A\u00020\u000FH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u001B\u0010\u0006\u001A\u00020\u0007X¦\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0012\u0010\n\u001A\u00020\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0012\u0010\u000E\u001A\u00020\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\tR\u0012\u0010\u0011\u001A\u00020\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0012\u0010\t\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "config", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "()I", "hasAlpha", "", "getHasAlpha", "()Z", "height", "", "getHeight", "width", "getWidth", "prepareToDraw", "", "readPixels", "buffer", "", "startX", "startY", "bufferOffset", "stride", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface ImageBitmap {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmap$Companion;", "", "()V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        static final Companion $$INSTANCE;

        static {
            Companion.$$INSTANCE = new Companion();
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static void readPixels$default(ImageBitmap imageBitmap0, int[] arr_v, int v, int v1, int v2, int v3, int v4, int v5, int v6, Object object0) {
            int v7 = 0;
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readPixels");
            }
            int v8 = (v6 & 8) == 0 ? v2 : imageBitmap0.getWidth();
            int v9 = (v6 & 16) == 0 ? v3 : imageBitmap0.getHeight();
            if((v6 & 0x20) == 0) {
                v7 = v4;
            }
            imageBitmap0.readPixels(arr_v, ((v6 & 2) == 0 ? v : 0), ((v6 & 4) == 0 ? v1 : 0), v8, v9, v7, ((v6 & 0x40) == 0 ? v5 : v8));
        }
    }

    public static final Companion Companion;

    static {
        ImageBitmap.Companion = Companion.$$INSTANCE;
    }

    ColorSpace getColorSpace();

    int getConfig-_sVssgQ();

    boolean getHasAlpha();

    int getHeight();

    int getWidth();

    void prepareToDraw();

    void readPixels(int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);
}

