package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0004J-\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001A\u00020\u0017H\u0016J\b\u0010\u0018\u001A\u00020\u0019H\u0016R\u001C\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/graphics/SolidColor;", "Landroidx/compose/ui/graphics/Brush;", "value", "Landroidx/compose/ui/graphics/Color;", "(JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getValue-0d7_KjU", "()J", "J", "applyTo", "", "size", "Landroidx/compose/ui/geometry/Size;", "p", "Landroidx/compose/ui/graphics/Paint;", "alpha", "", "applyTo-Pq9zytI", "(JLandroidx/compose/ui/graphics/Paint;F)V", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SolidColor extends Brush {
    private final long value;

    private SolidColor(long v) {
        super(null);
        this.value = v;
    }

    public SolidColor(long v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v);
    }

    @Override  // androidx.compose.ui.graphics.Brush
    public void applyTo-Pq9zytI(long v, Paint paint0, float f) {
        Intrinsics.checkNotNullParameter(paint0, "p");
        paint0.setAlpha(1.0f);
        paint0.setColor-8_81llA((f == 1.0f ? this.getValue-0d7_KjU() : Color.copy-wmQWz5c$default(this.getValue-0d7_KjU(), Color.getAlpha-impl(this.getValue-0d7_KjU()) * f, 0.0f, 0.0f, 0.0f, 14, null)));
        if(paint0.getShader() != null) {
            paint0.setShader(null);
        }
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof SolidColor ? Color.equals-impl0(this.getValue-0d7_KjU(), ((SolidColor)object0).getValue-0d7_KjU()) : false;
    }

    public final long getValue-0d7_KjU() {
        return this.value;
    }

    @Override
    public int hashCode() {
        return Color.hashCode-impl(this.getValue-0d7_KjU());
    }

    @Override
    public String toString() {
        return "SolidColor(value=" + Color.toString-impl(this.getValue-0d7_KjU()) + ')';
    }
}

