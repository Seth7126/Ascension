package androidx.compose.ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\u001A1\u0010\u0000\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u001AO\u0010\n\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000F2\u0006\u0010\u0013\u001A\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001AO\u0010\u0016\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\u00122\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000F2\u0006\u0010\u0013\u001A\u00020\u0006H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001A\u001A?\u0010\u001B\u001A\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001A\u00020\f2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000FH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u001D\u001A)\u0010\u001E\u001A\u00020\u001F2\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\u00100\u000F2\u000E\u0010\u0011\u001A\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000FH\u0002ø\u0001\u0000\u001A\u0015\u0010 \u001A\u00020!*\b\u0012\u0004\u0012\u00020\u00100\u000FH\u0002ø\u0001\u0000*\n\u0010\"\"\u00020\u00012\u00020\u0001\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006#"}, d2 = {"ActualImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualLinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualSweepGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "validateColorStops", "", "toIntArray", "", "Shader", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidShader_androidKt {
    public static final Shader ActualImageShader-F49vj9s(ImageBitmap imageBitmap0, int v, int v1) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v1));
    }

    public static final Shader ActualLinearGradientShader-VjE6UOU(long v, long v1, List list0, List list1, int v2) {
        Intrinsics.checkNotNullParameter(list0, "colors");
        AndroidShader_androidKt.validateColorStops(list0, list1);
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        float f2 = Offset.getX-impl(v1);
        float f3 = Offset.getY-impl(v1);
        int[] arr_v = AndroidShader_androidKt.toIntArray(list0);
        return list1 == null ? new LinearGradient(f, f1, f2, f3, arr_v, null, AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v2)) : new LinearGradient(f, f1, f2, f3, arr_v, CollectionsKt.toFloatArray(list1), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v2));
    }

    public static final Shader ActualRadialGradientShader-8uybcMk(long v, float f, List list0, List list1, int v1) {
        Intrinsics.checkNotNullParameter(list0, "colors");
        AndroidShader_androidKt.validateColorStops(list0, list1);
        float f1 = Offset.getX-impl(v);
        float f2 = Offset.getY-impl(v);
        int[] arr_v = AndroidShader_androidKt.toIntArray(list0);
        return list1 == null ? new RadialGradient(f1, f2, f, arr_v, null, AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v1)) : new RadialGradient(f1, f2, f, arr_v, CollectionsKt.toFloatArray(list1), AndroidTileMode_androidKt.toAndroidTileMode-0vamqd0(v1));
    }

    public static final Shader ActualSweepGradientShader-9KIMszo(long v, List list0, List list1) {
        Intrinsics.checkNotNullParameter(list0, "colors");
        AndroidShader_androidKt.validateColorStops(list0, list1);
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        int[] arr_v = AndroidShader_androidKt.toIntArray(list0);
        return list1 == null ? new SweepGradient(f, f1, arr_v, null) : new SweepGradient(f, f1, arr_v, CollectionsKt.toFloatArray(list1));
    }

    private static final int[] toIntArray(List list0) {
        int v = list0.size();
        int[] arr_v = new int[v];
        for(int v1 = 0; v1 < v; ++v1) {
            arr_v[v1] = ColorKt.toArgb-8_81llA(((Color)list0.get(v1)).unbox-impl());
        }
        return arr_v;
    }

    private static final void validateColorStops(List list0, List list1) {
        if(list1 == null) {
            if(list0.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
            return;
        }
        if(list0.size() != list1.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }
}

