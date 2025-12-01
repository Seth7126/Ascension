package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001A\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u009C\u0001\b\u0000\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001A\u00020\b\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000B\u001A\u00020\f\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\f\u0012\b\b\u0002\u0010\u0010\u001A\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001A\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001A\u00020\f\u0012\b\b\u0002\u0010\u0015\u001A\u00020\f\u0012\b\b\u0002\u0010\u0016\u001A\u00020\f\u0012\b\b\u0002\u0010\u0017\u001A\u00020\f\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0018J\u0013\u0010-\u001A\u00020.2\b\u0010/\u001A\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001A\u000202H\u0016R\u0013\u0010\t\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0019\u0010\u001AR\u0011\u0010\u000B\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u001CR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010 R\u001C\u0010\u0007\u001A\u00020\b\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010#\u001A\u0004\b!\u0010\"R\u0013\u0010\r\u001A\u0004\u0018\u00010\n\u00A2\u0006\b\n\u0000\u001A\u0004\b$\u0010\u001AR\u0011\u0010\u000E\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010\u001CR\u001C\u0010\u0010\u001A\u00020\u0011\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010#\u001A\u0004\b&\u0010\"R\u001C\u0010\u0012\u001A\u00020\u0013\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\n\n\u0002\u0010#\u001A\u0004\b\'\u0010\"R\u0011\u0010\u0014\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b(\u0010\u001CR\u0011\u0010\u000F\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b)\u0010\u001CR\u0011\u0010\u0016\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010\u001CR\u0011\u0010\u0017\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b+\u0010\u001CR\u0011\u0010\u0015\u001A\u00020\f\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010\u001C\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u00063"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorPath;", "Landroidx/compose/ui/graphics/vector/VectorNode;", "name", "", "pathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "trimPathStart", "trimPathEnd", "trimPathOffset", "(Ljava/lang/String;Ljava/util/List;ILandroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getFill", "()Landroidx/compose/ui/graphics/Brush;", "getFillAlpha", "()F", "getName", "()Ljava/lang/String;", "getPathData", "()Ljava/util/List;", "getPathFillType-Rg-k1Os", "()I", "I", "getStroke", "getStrokeAlpha", "getStrokeLineCap-KaPHkGw", "getStrokeLineJoin-LxFBmk8", "getStrokeLineMiter", "getStrokeLineWidth", "getTrimPathEnd", "getTrimPathOffset", "getTrimPathStart", "equals", "", "other", "", "hashCode", "", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class VectorPath extends VectorNode {
    private final Brush fill;
    private final float fillAlpha;
    private final String name;
    private final List pathData;
    private final int pathFillType;
    private final Brush stroke;
    private final float strokeAlpha;
    private final int strokeLineCap;
    private final int strokeLineJoin;
    private final float strokeLineMiter;
    private final float strokeLineWidth;
    private final float trimPathEnd;
    private final float trimPathOffset;
    private final float trimPathStart;

    private VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6) {
        super(null);
        this.name = s;
        this.pathData = list0;
        this.pathFillType = v;
        this.fill = brush0;
        this.fillAlpha = f;
        this.stroke = brush1;
        this.strokeAlpha = f1;
        this.strokeLineWidth = f2;
        this.strokeLineCap = v1;
        this.strokeLineJoin = v2;
        this.strokeLineMiter = f3;
        this.trimPathStart = f4;
        this.trimPathEnd = f5;
        this.trimPathOffset = f6;
    }

    // 去混淆评级： 低(20)
    public VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        this(((v3 & 1) == 0 ? s : ""), list0, v, ((v3 & 8) == 0 ? brush0 : null), ((v3 & 16) == 0 ? f : 1.0f), ((v3 & 0x20) == 0 ? brush1 : null), ((v3 & 0x40) == 0 ? f1 : 1.0f), ((v3 & 0x80) == 0 ? f2 : 0.0f), ((v3 & 0x100) == 0 ? v1 : 0), ((v3 & 0x200) == 0 ? v2 : 0), ((v3 & 0x400) == 0 ? f3 : 4.0f), ((v3 & 0x800) == 0 ? f4 : 0.0f), ((v3 & 0x1000) == 0 ? f5 : 1.0f), ((v3 & 0x2000) == 0 ? f6 : 0.0f), null);
    }

    public VectorPath(String s, List list0, int v, Brush brush0, float f, Brush brush1, float f1, float f2, int v1, int v2, float f3, float f4, float f5, float f6, DefaultConstructorMarker defaultConstructorMarker0) {
        this(s, list0, v, brush0, f, brush1, f1, f2, v1, v2, f3, f4, f5, f6);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(this.getClass()), Reflection.getOrCreateKotlinClass(object0.getClass())) || !Intrinsics.areEqual(this.name, ((VectorPath)object0).name)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.fill, ((VectorPath)object0).fill)) {
            return false;
        }
        if(this.fillAlpha != ((VectorPath)object0).fillAlpha) {
            return false;
        }
        if(!Intrinsics.areEqual(this.stroke, ((VectorPath)object0).stroke)) {
            return false;
        }
        if(this.strokeAlpha != ((VectorPath)object0).strokeAlpha) {
            return false;
        }
        if(this.strokeLineWidth != ((VectorPath)object0).strokeLineWidth) {
            return false;
        }
        if(!StrokeCap.equals-impl0(this.getStrokeLineCap-KaPHkGw(), ((VectorPath)object0).getStrokeLineCap-KaPHkGw())) {
            return false;
        }
        if(!StrokeJoin.equals-impl0(this.getStrokeLineJoin-LxFBmk8(), ((VectorPath)object0).getStrokeLineJoin-LxFBmk8())) {
            return false;
        }
        if(this.strokeLineMiter != ((VectorPath)object0).strokeLineMiter) {
            return false;
        }
        if(this.trimPathStart != ((VectorPath)object0).trimPathStart) {
            return false;
        }
        if(this.trimPathEnd != ((VectorPath)object0).trimPathEnd) {
            return false;
        }
        if(this.trimPathOffset != ((VectorPath)object0).trimPathOffset) {
            return false;
        }
        return PathFillType.equals-impl0(this.getPathFillType-Rg-k1Os(), ((VectorPath)object0).getPathFillType-Rg-k1Os()) ? Intrinsics.areEqual(this.pathData, ((VectorPath)object0).pathData) : false;
    }

    public final Brush getFill() {
        return this.fill;
    }

    public final float getFillAlpha() {
        return this.fillAlpha;
    }

    public final String getName() {
        return this.name;
    }

    public final List getPathData() {
        return this.pathData;
    }

    public final int getPathFillType-Rg-k1Os() {
        return this.pathFillType;
    }

    public final Brush getStroke() {
        return this.stroke;
    }

    public final float getStrokeAlpha() {
        return this.strokeAlpha;
    }

    public final int getStrokeLineCap-KaPHkGw() {
        return this.strokeLineCap;
    }

    public final int getStrokeLineJoin-LxFBmk8() {
        return this.strokeLineJoin;
    }

    public final float getStrokeLineMiter() {
        return this.strokeLineMiter;
    }

    public final float getStrokeLineWidth() {
        return this.strokeLineWidth;
    }

    public final float getTrimPathEnd() {
        return this.trimPathEnd;
    }

    public final float getTrimPathOffset() {
        return this.trimPathOffset;
    }

    public final float getTrimPathStart() {
        return this.trimPathStart;
    }

    @Override
    public int hashCode() {
        int v = this.name.hashCode();
        int v1 = this.pathData.hashCode();
        int v2 = 0;
        int v3 = this.fill == null ? 0 : this.fill.hashCode();
        int v4 = Float.floatToIntBits(this.fillAlpha);
        Brush brush0 = this.stroke;
        if(brush0 != null) {
            v2 = brush0.hashCode();
        }
        return ((((((((((((v * 0x1F + v1) * 0x1F + v3) * 0x1F + v4) * 0x1F + v2) * 0x1F + Float.floatToIntBits(this.strokeAlpha)) * 0x1F + Float.floatToIntBits(this.strokeLineWidth)) * 0x1F + this.getStrokeLineCap-KaPHkGw()) * 0x1F + this.getStrokeLineJoin-LxFBmk8()) * 0x1F + Float.floatToIntBits(this.strokeLineMiter)) * 0x1F + Float.floatToIntBits(this.trimPathStart)) * 0x1F + Float.floatToIntBits(this.trimPathEnd)) * 0x1F + Float.floatToIntBits(this.trimPathOffset)) * 0x1F + this.getPathFillType-Rg-k1Os();
    }
}

