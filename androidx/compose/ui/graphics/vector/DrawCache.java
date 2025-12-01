package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.CanvasKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope.DrawParams;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JD\u0010\u0015\u001A\u00020\u00162\u0006\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0017\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\b2\u0017\u0010\u0018\u001A\u0013\u0012\u0004\u0012\u00020\u001A\u0012\u0004\u0012\u00020\u00160\u0019¢\u0006\u0002\b\u001Bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001C\u0010\u001DJ$\u0010\u001E\u001A\u00020\u00162\u0006\u0010\u001F\u001A\u00020\u001A2\b\b\u0002\u0010 \u001A\u00020!2\n\b\u0002\u0010\"\u001A\u0004\u0018\u00010#J\f\u0010$\u001A\u00020\u0016*\u00020\u001AH\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001A\u0004\u0018\u00010\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\bX\u0082\u000E¢\u0006\u0002\n\u0000R&\u0010\t\u001A\u0004\u0018\u00010\n8\u0000@\u0000X\u0081\u000E¢\u0006\u0014\n\u0000\u0012\u0004\b\u000B\u0010\u0002\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u0010\u0010\u0010\u001A\u0004\u0018\u00010\u0011X\u0082\u000E¢\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001A\u00020\u0013X\u0082\u000Eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0014\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/ui/graphics/vector/DrawCache;", "", "()V", "cacheScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "cachedCanvas", "Landroidx/compose/ui/graphics/Canvas;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "mCachedImage", "Landroidx/compose/ui/graphics/ImageBitmap;", "getMCachedImage$annotations", "getMCachedImage", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setMCachedImage", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "scopeDensity", "Landroidx/compose/ui/unit/Density;", "size", "Landroidx/compose/ui/unit/IntSize;", "J", "drawCachedImage", "", "density", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/ExtensionFunctionType;", "drawCachedImage-CJJAR-o", "(JLandroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;Lkotlin/jvm/functions/Function1;)V", "drawInto", "target", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "clear", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class DrawCache {
    private final CanvasDrawScope cacheScope;
    private Canvas cachedCanvas;
    private LayoutDirection layoutDirection;
    private ImageBitmap mCachedImage;
    private Density scopeDensity;
    private long size;

    public DrawCache() {
        this.layoutDirection = LayoutDirection.Ltr;
        this.size = 0L;
        this.cacheScope = new CanvasDrawScope();
    }

    // 去混淆评级： 低(20)
    private final void clear(DrawScope drawScope0) {
        DefaultImpls.drawRect-n-J9OG0$default(drawScope0, 0xFF00000000000000L, 0L, 0L, 0.0f, null, null, 0, 62, null);
    }

    public final void drawCachedImage-CJJAR-o(long v, Density density0, LayoutDirection layoutDirection0, Function1 function10) {
        Intrinsics.checkNotNullParameter(density0, "density");
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        Intrinsics.checkNotNullParameter(function10, "block");
        this.scopeDensity = density0;
        this.layoutDirection = layoutDirection0;
        ImageBitmap imageBitmap0 = this.mCachedImage;
        Canvas canvas0 = this.cachedCanvas;
        if(imageBitmap0 == null || canvas0 == null || ((int)(v >> 0x20)) > imageBitmap0.getWidth() || ((int)(v & 0xFFFFFFFFL)) > imageBitmap0.getHeight()) {
            imageBitmap0 = ImageBitmapKt.ImageBitmap-x__-hDU$default(((int)(v >> 0x20)), ((int)(v & 0xFFFFFFFFL)), 0, false, null, 28, null);
            canvas0 = CanvasKt.Canvas(imageBitmap0);
            this.mCachedImage = imageBitmap0;
            this.cachedCanvas = canvas0;
        }
        this.size = v;
        DrawParams canvasDrawScope$DrawParams0 = this.cacheScope.getDrawParams();
        DrawParams canvasDrawScope$DrawParams1 = this.cacheScope.getDrawParams();
        canvasDrawScope$DrawParams1.setDensity(density0);
        canvasDrawScope$DrawParams1.setLayoutDirection(layoutDirection0);
        canvasDrawScope$DrawParams1.setCanvas(canvas0);
        canvasDrawScope$DrawParams1.setSize-uvyYCjk(IntSizeKt.toSize-ozmzZPI(v));
        canvas0.save();
        this.clear(this.cacheScope);
        function10.invoke(this.cacheScope);
        canvas0.restore();
        DrawParams canvasDrawScope$DrawParams2 = this.cacheScope.getDrawParams();
        canvasDrawScope$DrawParams2.setDensity(canvasDrawScope$DrawParams0.component1());
        canvasDrawScope$DrawParams2.setLayoutDirection(canvasDrawScope$DrawParams0.component2());
        canvasDrawScope$DrawParams2.setCanvas(canvasDrawScope$DrawParams0.component3());
        canvasDrawScope$DrawParams2.setSize-uvyYCjk(canvasDrawScope$DrawParams0.component4-NH-jbRc());
        imageBitmap0.prepareToDraw();
    }

    public final void drawInto(DrawScope drawScope0, float f, ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(drawScope0, "target");
        ImageBitmap imageBitmap0 = this.mCachedImage;
        if(imageBitmap0 == null) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        DefaultImpls.drawImage-9jGpkUE$default(drawScope0, imageBitmap0, 0L, this.size, 0L, 0L, f, null, colorFilter0, 0, 346, null);
    }

    public static void drawInto$default(DrawCache drawCache0, DrawScope drawScope0, float f, ColorFilter colorFilter0, int v, Object object0) {
        if((v & 2) != 0) {
            f = 1.0f;
        }
        if((v & 4) != 0) {
            colorFilter0 = null;
        }
        drawCache0.drawInto(drawScope0, f, colorFilter0);
    }

    public final ImageBitmap getMCachedImage() {
        return this.mCachedImage;
    }

    public static void getMCachedImage$annotations() {
    }

    public final void setMCachedImage(ImageBitmap imageBitmap0) {
        this.mCachedImage = imageBitmap0;
    }
}

