package androidx.compose.ui.graphics.colorspace;

import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0003\u0012\u0006\u0010\u0007\u001A\u00020\u0003\u0012\b\b\u0002\u0010\b\u001A\u00020\u0003\u0012\b\b\u0002\u0010\t\u001A\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001A\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001A\u00020\u0003HÆ\u0003JO\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00032\b\b\u0002\u0010\u0006\u001A\u00020\u00032\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u00032\b\b\u0002\u0010\t\u001A\u00020\u0003HÆ\u0001J\u0013\u0010\u001B\u001A\u00020\u001C2\b\u0010\u001D\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001E\u001A\u00020\u001FHÖ\u0001J\t\u0010 \u001A\u00020!HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000B\u0010\fR\u0011\u0010\u0005\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\fR\u0011\u0010\u0007\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\fR\u0011\u0010\b\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0012\u0010\f¨\u0006\""}, d2 = {"Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "", "gamma", "", "a", "b", "c", "d", "e", "f", "(DDDDDDD)V", "getA", "()D", "getB", "getC", "getD", "getE", "getF", "getGamma", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class TransferParameters {
    private final double a;
    private final double b;
    private final double c;
    private final double d;
    private final double e;
    private final double f;
    private final double gamma;

    public TransferParameters(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        this.gamma = f;
        this.a = f1;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        if(Double.isNaN(f1) || Double.isNaN(f2) || Double.isNaN(f3) || Double.isNaN(f4) || Double.isNaN(f5) || Double.isNaN(f6) || Double.isNaN(f)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if(f4 < 0.0 || f4 > 1.0) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + f4);
        }
        if(f4 == 0.0 && (f1 == 0.0 || f == 0.0)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if(f4 >= 1.0 && f3 == 0.0) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if((f1 == 0.0 || f == 0.0) && f3 == 0.0) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if(f3 < 0.0) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if(f1 < 0.0 || f < 0.0) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public TransferParameters(double f, double f1, double f2, double f3, double f4, double f5, double f6, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(f, f1, f2, f3, f4, ((v & 0x20) == 0 ? f5 : 0.0), ((v & 0x40) == 0 ? f6 : 0.0));
    }

    public final double component1() {
        return this.gamma;
    }

    public final double component2() {
        return this.a;
    }

    public final double component3() {
        return this.b;
    }

    public final double component4() {
        return this.c;
    }

    public final double component5() {
        return this.d;
    }

    public final double component6() {
        return this.e;
    }

    public final double component7() {
        return this.f;
    }

    public final TransferParameters copy(double f, double f1, double f2, double f3, double f4, double f5, double f6) {
        return new TransferParameters(f, f1, f2, f3, f4, f5, f6);
    }

    public static TransferParameters copy$default(TransferParameters transferParameters0, double f, double f1, double f2, double f3, double f4, double f5, double f6, int v, Object object0) {
        double f7 = (v & 1) == 0 ? f : transferParameters0.gamma;
        double f8 = (v & 2) == 0 ? f1 : transferParameters0.a;
        double f9 = (v & 4) == 0 ? f2 : transferParameters0.b;
        double f10 = (v & 8) == 0 ? f3 : transferParameters0.c;
        double f11 = (v & 16) == 0 ? f4 : transferParameters0.d;
        double f12 = (v & 0x20) == 0 ? f5 : transferParameters0.e;
        return (v & 0x40) == 0 ? transferParameters0.copy(f7, f8, f9, f10, f11, f12, f6) : transferParameters0.copy(f7, f8, f9, f10, f11, f12, transferParameters0.f);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof TransferParameters)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.gamma, ((TransferParameters)object0).gamma)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((TransferParameters)object0).a)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.b, ((TransferParameters)object0).b)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.c, ((TransferParameters)object0).c)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.d, ((TransferParameters)object0).d)) {
            return false;
        }
        return Intrinsics.areEqual(this.e, ((TransferParameters)object0).e) ? Intrinsics.areEqual(this.f, ((TransferParameters)object0).f) : false;
    }

    public final double getA() {
        return this.a;
    }

    public final double getB() {
        return this.b;
    }

    public final double getC() {
        return this.c;
    }

    public final double getD() {
        return this.d;
    }

    public final double getE() {
        return this.e;
    }

    public final double getF() {
        return this.f;
    }

    public final double getGamma() {
        return this.gamma;
    }

    @Override
    public int hashCode() {
        return (((((PainterModifier..ExternalSyntheticBackport0.m(this.gamma) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.a)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.b)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.c)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.d)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.e)) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.f);
    }

    @Override
    public String toString() {
        return "TransferParameters(gamma=" + this.gamma + ", a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ')';
    }
}

