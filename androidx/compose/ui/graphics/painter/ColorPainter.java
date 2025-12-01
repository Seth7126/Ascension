package androidx.compose.ui.graphics.painter;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope.DefaultImpls;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0005\u001A\u00020\u0006H\u0014J\u0012\u0010\u0011\u001A\u00020\u00102\b\u0010\n\u001A\u0004\u0018\u00010\u000BH\u0014J\u0013\u0010\u0012\u001A\u00020\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001A\u00020\u0016H\u0016J\b\u0010\u0017\u001A\u00020\u0018H\u0016J\f\u0010\u0019\u001A\u00020\u001A*\u00020\u001BH\u0014R\u000E\u0010\u0005\u001A\u00020\u0006X\u0082\u000E¢\u0006\u0002\n\u0000R\u001C\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001A\u0004\b\u0007\u0010\bR\u0010\u0010\n\u001A\u0004\u0018\u00010\u000BX\u0082\u000E¢\u0006\u0002\n\u0000R\u001F\u0010\f\u001A\u00020\rX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001A\u0004\b\u000E\u0010\b\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001C"}, d2 = {"Landroidx/compose/ui/graphics/painter/ColorPainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "color", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "alpha", "", "getColor-0d7_KjU", "()J", "J", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "intrinsicSize", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "applyAlpha", "", "applyColorFilter", "equals", "other", "", "hashCode", "", "toString", "", "onDraw", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ColorPainter extends Painter {
    private float alpha;
    private final long color;
    private ColorFilter colorFilter;
    private final long intrinsicSize;

    private ColorPainter(long v) {
        this.color = v;
        this.alpha = 1.0f;
        this.intrinsicSize = 0x7FC000007FC00000L;
    }

    public ColorPainter(long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v);
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
        return object0 instanceof ColorPainter ? Color.equals-impl0(this.getColor-0d7_KjU(), ((ColorPainter)object0).getColor-0d7_KjU()) : false;
    }

    public final long getColor-0d7_KjU() {
        return this.color;
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    public long getIntrinsicSize-NH-jbRc() {
        return this.intrinsicSize;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.getColor-0d7_KjU());
    }

    @Override  // androidx.compose.ui.graphics.painter.Painter
    protected void onDraw(DrawScope drawScope0) {
        Intrinsics.checkNotNullParameter(drawScope0, "<this>");
        DefaultImpls.drawRect-n-J9OG0$default(drawScope0, this.getColor-0d7_KjU(), 0L, 0L, this.alpha, null, this.colorFilter, 0, 86, null);
    }

    @Override
    public String toString() {
        return "ColorPainter(color=" + Color.toString-impl(this.getColor-0d7_KjU()) + ')';
    }
}

