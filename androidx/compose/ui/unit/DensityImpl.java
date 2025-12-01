package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001A\u00020\u0003HÆ\u0003J\t\u0010\n\u001A\u00020\u0003HÆ\u0003J\u001D\u0010\u000B\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001A\u00020\r2\b\u0010\u000E\u001A\u0004\u0018\u00010\u000FHÖ\u0003J\t\u0010\u0010\u001A\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001A\u00020\u0013HÖ\u0001R\u0014\u0010\u0002\u001A\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001A\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0007¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/unit/DensityImpl;", "Landroidx/compose/ui/unit/Density;", "density", "", "fontScale", "(FF)V", "getDensity", "()F", "getFontScale", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-unit_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class DensityImpl implements Density {
    private final float density;
    private final float fontScale;

    public DensityImpl(float f, float f1) {
        this.density = f;
        this.fontScale = f1;
    }

    public final float component1() {
        return this.getDensity();
    }

    public final float component2() {
        return this.getFontScale();
    }

    public final DensityImpl copy(float f, float f1) {
        return new DensityImpl(f, f1);
    }

    public static DensityImpl copy$default(DensityImpl densityImpl0, float f, float f1, int v, Object object0) {
        if((v & 1) != 0) {
            f = densityImpl0.getDensity();
        }
        if((v & 2) != 0) {
            f1 = densityImpl0.getFontScale();
        }
        return densityImpl0.copy(f, f1);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof DensityImpl)) {
            return false;
        }
        return Intrinsics.areEqual(this.getDensity(), ((DensityImpl)object0).getDensity()) ? Intrinsics.areEqual(this.getFontScale(), ((DensityImpl)object0).getFontScale()) : false;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.density;
    }

    @Override  // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return this.fontScale;
    }

    @Override
    public int hashCode() {
        return Float.floatToIntBits(this.getDensity()) * 0x1F + Float.floatToIntBits(this.getFontScale());
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx--R2X_6o(long v) {
        return DefaultImpls.roundToPx--R2X_6o(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public int roundToPx-0680j_4(float f) {
        return DefaultImpls.roundToPx-0680j_4(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-GaN1DYA(long v) {
        return DefaultImpls.toDp-GaN1DYA(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(float f) {
        return DefaultImpls.toDp-u2uoSUM(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toDp-u2uoSUM(int v) {
        return DefaultImpls.toDp-u2uoSUM(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx--R2X_6o(long v) {
        return DefaultImpls.toPx--R2X_6o(this, v);
    }

    @Override  // androidx.compose.ui.unit.Density
    public float toPx-0680j_4(float f) {
        return DefaultImpls.toPx-0680j_4(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public Rect toRect(DpRect dpRect0) {
        return DefaultImpls.toRect(this, dpRect0);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-0xMU5do(float f) {
        return DefaultImpls.toSp-0xMU5do(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(float f) {
        return DefaultImpls.toSp-kPz2Gy4(this, f);
    }

    @Override  // androidx.compose.ui.unit.Density
    public long toSp-kPz2Gy4(int v) {
        return DefaultImpls.toSp-kPz2Gy4(this, v);
    }

    @Override
    public String toString() {
        return "DensityImpl(density=" + this.getDensity() + ", fontScale=" + this.getFontScale() + ')';
    }
}

