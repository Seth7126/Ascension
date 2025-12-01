package androidx.compose.ui;

import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001D\u001EB\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J-\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0012\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u0014\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001A\u00020\u00162\b\u0010\u0017\u001A\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001A\u00020\u001AHÖ\u0001J\t\u0010\u001B\u001A\u00020\u001CHÖ\u0001R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/BiasAlignment;", "Landroidx/compose/ui/Alignment;", "horizontalBias", "", "verticalBias", "(FF)V", "getHorizontalBias", "()F", "getVerticalBias", "align", "Landroidx/compose/ui/unit/IntOffset;", "size", "Landroidx/compose/ui/unit/IntSize;", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "align-KFBX0sM", "(JJLandroidx/compose/ui/unit/LayoutDirection;)J", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Horizontal", "Vertical", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class BiasAlignment implements Alignment {
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\nH\u0016J\t\u0010\u000B\u001A\u00020\u0003HÂ\u0003J\u0013\u0010\f\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Horizontal;", "Landroidx/compose/ui/Alignment$Horizontal;", "bias", "", "(F)V", "align", "", "size", "space", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Horizontal implements androidx.compose.ui.Alignment.Horizontal {
        private final float bias;

        public Horizontal(float f) {
            this.bias = f;
        }

        @Override  // androidx.compose.ui.Alignment$Horizontal
        public int align(int v, int v1, LayoutDirection layoutDirection0) {
            Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
            return layoutDirection0 == LayoutDirection.Ltr ? MathKt.roundToInt(((float)(v1 - v)) / 2.0f * (this.bias + 1.0f)) : MathKt.roundToInt(((float)(v1 - v)) / 2.0f * (-1.0f * this.bias + 1.0f));
        }

        private final float component1() {
            return this.bias;
        }

        public final Horizontal copy(float f) {
            return new Horizontal(f);
        }

        public static Horizontal copy$default(Horizontal biasAlignment$Horizontal0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAlignment$Horizontal0.bias;
            }
            return biasAlignment$Horizontal0.copy(f);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Horizontal ? Intrinsics.areEqual(this.bias, ((Horizontal)object0).bias) : false;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.bias);
        }

        @Override
        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u0006H\u0016J\t\u0010\t\u001A\u00020\u0003HÂ\u0003J\u0013\u0010\n\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u000B\u001A\u00020\f2\b\u0010\r\u001A\u0004\u0018\u00010\u000EHÖ\u0003J\t\u0010\u000F\u001A\u00020\u0006HÖ\u0001J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/BiasAlignment$Vertical;", "Landroidx/compose/ui/Alignment$Vertical;", "bias", "", "(F)V", "align", "", "size", "space", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Vertical implements androidx.compose.ui.Alignment.Vertical {
        private final float bias;

        public Vertical(float f) {
            this.bias = f;
        }

        @Override  // androidx.compose.ui.Alignment$Vertical
        public int align(int v, int v1) {
            return MathKt.roundToInt(((float)(v1 - v)) / 2.0f * (this.bias + 1.0f));
        }

        private final float component1() {
            return this.bias;
        }

        public final Vertical copy(float f) {
            return new Vertical(f);
        }

        public static Vertical copy$default(Vertical biasAlignment$Vertical0, float f, int v, Object object0) {
            if((v & 1) != 0) {
                f = biasAlignment$Vertical0.bias;
            }
            return biasAlignment$Vertical0.copy(f);
        }

        @Override
        public boolean equals(Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Vertical ? Intrinsics.areEqual(this.bias, ((Vertical)object0).bias) : false;
        }

        @Override
        public int hashCode() {
            return Float.floatToIntBits(this.bias);
        }

        @Override
        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    private final float horizontalBias;
    private final float verticalBias;

    public BiasAlignment(float f, float f1) {
        this.horizontalBias = f;
        this.verticalBias = f1;
    }

    @Override  // androidx.compose.ui.Alignment
    public long align-KFBX0sM(long v, long v1, LayoutDirection layoutDirection0) {
        Intrinsics.checkNotNullParameter(layoutDirection0, "layoutDirection");
        return layoutDirection0 == LayoutDirection.Ltr ? IntOffsetKt.IntOffset(MathKt.roundToInt(((float)(((int)(v1 >> 0x20)) - ((int)(v >> 0x20)))) / 2.0f * (this.horizontalBias + 1.0f)), MathKt.roundToInt(((float)(((int)(v1 & 0xFFFFFFFFL)) - ((int)(v & 0xFFFFFFFFL)))) / 2.0f * (this.verticalBias + 1.0f))) : IntOffsetKt.IntOffset(MathKt.roundToInt(((float)(((int)(v1 >> 0x20)) - ((int)(v >> 0x20)))) / 2.0f * (-1.0f * this.horizontalBias + 1.0f)), MathKt.roundToInt(((float)(((int)(v1 & 0xFFFFFFFFL)) - ((int)(v & 0xFFFFFFFFL)))) / 2.0f * (this.verticalBias + 1.0f)));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    public final BiasAlignment copy(float f, float f1) {
        return new BiasAlignment(f, f1);
    }

    public static BiasAlignment copy$default(BiasAlignment biasAlignment0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = biasAlignment0.horizontalBias;
        }
        if((v & 2) != 0) {
            f1 = biasAlignment0.verticalBias;
        }
        return biasAlignment0.copy(f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof BiasAlignment)) {
            return false;
        }
        return Intrinsics.areEqual(this.horizontalBias, ((BiasAlignment)object0).horizontalBias) ? Intrinsics.areEqual(this.verticalBias, ((BiasAlignment)object0).verticalBias) : false;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.horizontalBias) * 0x1F + Float.floatToIntBits(this.verticalBias);
    }

    @Override
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}

