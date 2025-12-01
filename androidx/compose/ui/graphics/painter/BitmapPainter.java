package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B$\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u0010\u0010\u0013\u001A\u00020\u00142\u0006\u0010\t\u001A\u00020\nH\u0014J\u0012\u0010\u0015\u001A\u00020\u00142\b\u0010\u000B\u001A\u0004\u0018\u00010\fH\u0014J\u0013\u0010\u0016\u001A\u00020\u00142\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001A\u00020\u001AH\u0016J\b\u0010\u001B\u001A\u00020\u001CH\u0016J%\u0010\u001D\u001A\u00020\u00072\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001E\u0010\u001FJ\f\u0010 \u001A\u00020!*\u00020\"H\u0014R\u000E\u0010\t\u001A\u00020\nX\u0082\u000E¢\u0006\u0002\n\u0000R\u0010\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0082\u000E¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001D\u0010\r\u001A\u00020\u000E8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001A\u0004\b\u000F\u0010\u0010R\u0019\u0010\u0011\u001A\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012R\u0019\u0010\u0004\u001A\u00020\u0005X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012R\u0019\u0010\u0006\u001A\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0012\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "srcOffset", "Landroidx/compose/ui/unit/IntOffset;", "srcSize", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/graphics/ImageBitmap;JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "size", "J", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "validateSize", "validateSize-N5eqBDc", "(JJ)J", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class BitmapPainter extends Painter {
    private float alpha;
    private ColorFilter colorFilter;
    private final ImageBitmap image;
    private final long size;
    private final long srcOffset;
    private final long srcSize;

    private BitmapPainter(ImageBitmap imageBitmap0, long v, long v1) {
        this.image = imageBitmap0;
        this.srcOffset = v;
        this.srcSize = v1;
        this.size = this.validateSize-N5eqBDc(v, v1);
        this.alpha = 1.0f;
    }

    public BitmapPainter(ImageBitmap imageBitmap0, long v, long v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            v = 0L;
        }
        if((v2 & 4) != 0) {
            v1 = IntSizeKt.IntSize(imageBitmap0.getWidth(), imageBitmap0.getHeight());
        }
        this(imageBitmap0, v, v1, null);
    }

    public BitmapPainter(ImageBitmap imageBitmap0, long v, long v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(imageBitmap0, v, v1);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyAlpha(float f) {
        this.alpha = f;
        return true;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected boolean applyColorFilter(ColorFilter colorFilter0) {
        this.colorFilter = colorFilter0;
        return true;
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BitmapPainter)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.image, ((BitmapPainter)object0).image)) {
            return false;
        }
        return IntOffset.equals-impl0(this.srcOffset, ((BitmapPainter)object0).srcOffset) ? IntSize.equals-impl0(this.srcSize, ((BitmapPainter)object0).srcSize) : false;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return IntSizeKt.toSize-ozmzZPI(this.size);
    }

    @Override
    public int hashCode() {
        return (this.image.hashCode() * 0x1F + IntOffset.hashCode-impl(this.srcOffset)) * 0x1F + IntSize.hashCode-impl(this.srcSize);
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        long v = IntSizeKt.IntSize(MathKt.roundToInt(Size.getWidth-impl(drawScope0.getSize-NH-jbRc())), MathKt.roundToInt(Size.getHeight-impl(drawScope0.getSize-NH-jbRc())));
        DefaultImpls.drawImage-9jGpkUE$default(drawScope0, this.image, this.srcOffset, this.srcSize, 0L, v, this.alpha, null, this.colorFilter, 0, 328, null);
    }

    @Override
    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + IntOffset.toString-impl(this.srcOffset) + ", srcSize=" + IntSize.toString-impl(this.srcSize) + ')';
    }

    private final long validateSize-N5eqBDc(long v, long v1) {
        if(((int)(v >> 0x20)) < 0 || ((int)(v & 0xFFFFFFFFL)) < 0 || ((int)(v1 >> 0x20)) < 0 || ((int)(v1 & 0xFFFFFFFFL)) < 0 || ((int)(v1 >> 0x20)) > this.image.getWidth() || ((int)(v1 & 0xFFFFFFFFL)) > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return v1;
    }
}

