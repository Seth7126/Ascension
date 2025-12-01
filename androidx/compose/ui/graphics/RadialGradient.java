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

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\b\u0007\u0018\u00002\u00020\u0001BD\b\u0000\u0012\f\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\u0006\u0010\t\u001A\u00020\u0006\u0012\b\b\u0002\u0010\n\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0002\u0010\fJ!\u0010\u000F\u001A\u00060\u0010j\u0002`\u00112\u0006\u0010\u0012\u001A\u00020\u0013H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001A\u00020\u00172\b\u0010\u0018\u001A\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001A\u001A\u00020\u001BH\u0016J\b\u0010\u001C\u001A\u00020\u001DH\u0016R\u0019\u0010\u0007\u001A\u00020\bX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\rR\u0017\u0010\u0002\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001A\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\n\u001A\u00020\u000BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000E\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001E"}, d2 = {"Landroidx/compose/ui/graphics/RadialGradient;", "Landroidx/compose/ui/graphics/ShaderBrush;", "colors", "", "Landroidx/compose/ui/graphics/Color;", "stops", "", "center", "Landroidx/compose/ui/geometry/Offset;", "radius", "tileMode", "Landroidx/compose/ui/graphics/TileMode;", "(Ljava/util/List;Ljava/util/List;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", "other", "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class RadialGradient extends ShaderBrush {
    private final long center;
    private final List colors;
    private final float radius;
    private final List stops;
    private final int tileMode;

    private RadialGradient(List list0, List list1, long v, float f, int v1) {
        this.colors = list0;
        this.stops = list1;
        this.center = v;
        this.radius = f;
        this.tileMode = v1;
    }

    public RadialGradient(List list0, List list1, long v, float f, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0, ((v2 & 2) == 0 ? list1 : null), v, f, ((v2 & 16) == 0 ? v1 : 0), null);
    }

    public RadialGradient(List list0, List list1, long v, float f, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        this(list0, list1, v, f, v1);
    }

    @Override  // androidx.compose.ui.graphics.ShaderBrush
    public Shader createShader-uvyYCjk(long v) {
        float f1;
        float f;
        if(OffsetKt.isUnspecified-k-4lQ0M(this.center)) {
            long v1 = SizeKt.getCenter-uvyYCjk(v);
            f = Offset.getX-impl(v1);
            f1 = Offset.getY-impl(v1);
        }
        else {
            f = Offset.getX-impl(this.center) == Infinityf ? Size.getWidth-impl(v) : Offset.getX-impl(this.center);
            f1 = Offset.getY-impl(this.center) == Infinityf ? Size.getHeight-impl(v) : Offset.getY-impl(this.center);
        }
        long v2 = OffsetKt.Offset(f, f1);
        return this.radius == Infinityf ? ShaderKt.RadialGradientShader-8uybcMk(v2, Size.getMinDimension-impl(v) / 2.0f, this.colors, this.stops, this.tileMode) : ShaderKt.RadialGradientShader-8uybcMk(v2, this.radius, this.colors, this.stops, this.tileMode);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof RadialGradient)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.colors, ((RadialGradient)object0).colors)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.stops, ((RadialGradient)object0).stops)) {
            return false;
        }
        if(!Offset.equals-impl0(this.center, ((RadialGradient)object0).center)) {
            return false;
        }
        return this.radius == ((RadialGradient)object0).radius ? TileMode.equals-impl0(this.tileMode, ((RadialGradient)object0).tileMode) : false;
    }

    @Override
    public int hashCode() {
        int v = this.colors.hashCode();
        return this.stops == null ? ((v * 961 + Offset.hashCode-impl(this.center)) * 0x1F + Float.floatToIntBits(this.radius)) * 0x1F + this.tileMode : (((v * 0x1F + this.stops.hashCode()) * 0x1F + Offset.hashCode-impl(this.center)) * 0x1F + Float.floatToIntBits(this.radius)) * 0x1F + this.tileMode;
    }

    @Override
    public String toString() {
        String s = "";
        String s1 = OffsetKt.isSpecified-k-4lQ0M(this.center) ? "center=" + Offset.toString-impl(this.center) + ", " : "";
        if(!Float.isInfinite(this.radius) && !Float.isNaN(this.radius)) {
            s = "radius=" + this.radius + ", ";
        }
        return "RadialGradient(colors=" + this.colors + ", stops=" + this.stops + ", " + s1 + s + "tileMode=" + TileMode.toString-impl(this.tileMode) + ')';
    }
}

