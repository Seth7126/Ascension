package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0010\u0010\u0007\u001A\u00020\u00042\u0006\u0010\b\u001A\u00020\tH\u0000\u001A\u000E\u0010\n\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u0001\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010\u0002\u001A\u00060\u0001j\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001A\u0004\b\u0005\u0010\u0006*\n\u0010\f\"\u00020\u00012\u00020\u0001¨\u0006\r"}, d2 = {"EmptyCanvas", "Landroid/graphics/Canvas;", "nativeCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "Landroidx/compose/ui/graphics/Canvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "ActualCanvas", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "Canvas", "c", "NativeCanvas", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidCanvas_androidKt {
    private static final Canvas EmptyCanvas;

    static {
        AndroidCanvas_androidKt.EmptyCanvas = new Canvas();
    }

    public static final androidx.compose.ui.graphics.Canvas ActualCanvas(ImageBitmap imageBitmap0) {
        Intrinsics.checkNotNullParameter(imageBitmap0, "image");
        AndroidCanvas androidCanvas0 = new AndroidCanvas();
        androidCanvas0.setInternalCanvas(new Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(imageBitmap0)));
        return androidCanvas0;
    }

    public static final androidx.compose.ui.graphics.Canvas Canvas(Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "c");
        AndroidCanvas androidCanvas0 = new AndroidCanvas();
        androidCanvas0.setInternalCanvas(canvas0);
        return androidCanvas0;
    }

    public static final Canvas getNativeCanvas(androidx.compose.ui.graphics.Canvas canvas0) {
        Intrinsics.checkNotNullParameter(canvas0, "<this>");
        return ((AndroidCanvas)canvas0).getInternalCanvas();
    }
}

