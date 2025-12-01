package androidx.compose.ui.input.pointer.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001B\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000F\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001A\u00020\u0004HÆ\u0003J#\u0010\r\u001A\u00020\u00002\u000E\b\u0002\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u0004HÆ\u0001J\u0013\u0010\u000E\u001A\u00020\u000F2\b\u0010\u0010\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001A\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001A\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PolynomialFit;", "", "coefficients", "", "", "confidence", "(Ljava/util/List;F)V", "getCoefficients", "()Ljava/util/List;", "getConfidence", "()F", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PolynomialFit {
    private final List coefficients;
    private final float confidence;

    public PolynomialFit(List list0, float f) {
        Intrinsics.checkNotNullParameter(list0, "coefficients");
        super();
        this.coefficients = list0;
        this.confidence = f;
    }

    public final List component1() {
        return this.coefficients;
    }

    public final float component2() {
        return this.confidence;
    }

    public final PolynomialFit copy(List list0, float f) {
        Intrinsics.checkNotNullParameter(list0, "coefficients");
        return new PolynomialFit(list0, f);
    }

    public static PolynomialFit copy$default(PolynomialFit polynomialFit0, List list0, float f, int v, Object object0) {
        if((v & 1) != 0) {
            list0 = polynomialFit0.coefficients;
        }
        if((v & 2) != 0) {
            f = polynomialFit0.confidence;
        }
        return polynomialFit0.copy(list0, f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof PolynomialFit)) {
            return false;
        }
        return Intrinsics.areEqual(this.coefficients, ((PolynomialFit)object0).coefficients) ? Intrinsics.areEqual(this.confidence, ((PolynomialFit)object0).confidence) : false;
    }

    public final List getCoefficients() {
        return this.coefficients;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    @Override
    public int hashCode() {
        return this.coefficients.hashCode() * 0x1F + Float.floatToIntBits(this.confidence);
    }

    @Override
    public String toString() {
        return "PolynomialFit(coefficients=" + this.coefficients + ", confidence=" + this.confidence + ')';
    }
}

