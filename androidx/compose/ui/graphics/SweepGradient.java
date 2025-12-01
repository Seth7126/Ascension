package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001B2\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005ø\u0001\u0000¢\u0006\u0002\u0010\tJ!\u0010\u000B\u001A\u00060\fj\u0002`\r2\u0006\u0010\u000E\u001A\u00020\u000FH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001A\u00020\u00132\b\u0010\u0014\u001A\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001A\u00020\u0017H\u0016J\b\u0010\u0018\u001A\u00020\u0019H\u0016R\u0019\u0010\u0002\u001A\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\nR\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/graphics/SweepGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "center", "Landroidx/compose/ui/geometry/Offset;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class SweepGradient extends ShaderBrush {
    private final long center;
    private final List colors;
    private final List stops;

    private SweepGradient(long v, List list0, List list1) {
        this.center = v;
        this.colors = list0;
        this.stops = list1;
    }

    public SweepGradient(long v, List list0, List list1, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v1 & 4) != 0) {
            list1 = null;
        }
        this(v, list0, list1, null);
    }

    public SweepGradient(long v, List list0, List list1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, list0, list1);
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    public Shader createShader-uvyYCjk(long v) {
        if(OffsetKt.isUnspecified-k-4lQ0M(this.center)) {
            return ShaderKt.SweepGradientShader-9KIMszo(SizeKt.getCenter-uvyYCjk(v), this.colors, this.stops);
        }
        float f = Offset.getX-impl(this.center) == Infinityf ? Size.getWidth-impl(v) : Offset.getX-impl(this.center);
        return Offset.getY-impl(this.center) == Infinityf ? ShaderKt.SweepGradientShader-9KIMszo(OffsetKt.Offset(f, Size.getHeight-impl(v)), this.colors, this.stops) : ShaderKt.SweepGradientShader-9KIMszo(OffsetKt.Offset(f, Offset.getY-impl(this.center)), this.colors, this.stops);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SweepGradient)) {
            return false;
        }
        if(!Offset.equals-impl0(this.center, ((SweepGradient)object0).center)) {
            return false;
        }
        return Intrinsics.areEqual(this.colors, ((SweepGradient)object0).colors) ? Intrinsics.areEqual(this.stops, ((SweepGradient)object0).stops) : false;
    }

    @Override
    public int hashCode() {
        int v = Offset.hashCode-impl(this.center);
        int v1 = this.colors.hashCode();
        return this.stops == null ? (v * 0x1F + v1) * 0x1F : (v * 0x1F + v1) * 0x1F + this.stops.hashCode();
    }

    // 去混淆评级： 中等(60)
    @Override
    public String toString() {
        return OffsetKt.isSpecified-k-4lQ0M(this.center) ? "SweepGradient(" + ("center=" + Offset.toString-impl(this.center) + ", ") + "colors=" + this.colors + ", stops=" + this.stops + ')' : "SweepGradient(colors=" + this.colors + ", stops=" + this.stops + ')';
    }
}

