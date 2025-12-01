package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J-\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0017\u0010\f\u001A\u0013\u0012\u0004\u0012\u00020\u000E\u0012\u0004\u0012\u00020\t0\r¢\u0006\u0002\b\u000FH\u0086\bø\u0001\u0000R\u001C\u0010\u0003\u001A\u00020\u00048\u0000X\u0081\u0004¢\u0006\u000E\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001A\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/CanvasHolder;", "", "()V", "androidCanvas", "Landroidx/compose/ui/graphics/AndroidCanvas;", "getAndroidCanvas$annotations", "getAndroidCanvas", "()Landroidx/compose/ui/graphics/AndroidCanvas;", "drawInto", "", "targetCanvas", "Landroid/graphics/Canvas;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Canvas;", "Lkotlin/ExtensionFunctionType;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class CanvasHolder {
    private final AndroidCanvas androidCanvas;

    public CanvasHolder() {
        this.androidCanvas = new AndroidCanvas();
    }

    public final void drawInto(Canvas canvas0, Function1 function10) {
        Intrinsics.checkNotNullParameter(canvas0, "targetCanvas");
        Intrinsics.checkNotNullParameter(function10, "block");
        this.getAndroidCanvas().setInternalCanvas(canvas0);
        function10.invoke(this.getAndroidCanvas());
        this.getAndroidCanvas().setInternalCanvas(this.getAndroidCanvas().getInternalCanvas());
    }

    public final AndroidCanvas getAndroidCanvas() {
        return this.androidCanvas;
    }

    public static void getAndroidCanvas$annotations() {
    }
}

