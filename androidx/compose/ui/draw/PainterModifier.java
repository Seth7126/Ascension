package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier.DefaultImpls;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BX\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\b\b\u0002\u0010\b\u001A\u00020\t\u0012\b\b\u0002\u0010\n\u001A\u00020\u000B\u0012\b\b\u0002\u0010\f\u001A\u00020\r\u0012\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\u000F\u0012\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011\u00A2\u0006\u0002\b\u0014\u00A2\u0006\u0002\u0010\u0015J\u001D\u0010$\u001A\u00020%2\u0006\u0010&\u001A\u00020%H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010(J\u0013\u0010)\u001A\u00020\u00072\b\u0010*\u001A\u0004\u0018\u00010+H\u0096\u0002J\b\u0010,\u001A\u00020-H\u0016J\u001D\u0010.\u001A\u00020/2\u0006\u00100\u001A\u00020/H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b1\u0010(J\b\u00102\u001A\u000203H\u0016J\f\u00104\u001A\u00020\u0013*\u000205H\u0016J\u0019\u00106\u001A\u00020\u0007*\u00020%H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b7\u00108J\u0019\u00109\u001A\u00020\u0007*\u00020%H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b:\u00108J\u001C\u0010;\u001A\u00020-*\u00020<2\u0006\u0010=\u001A\u00020>2\u0006\u0010?\u001A\u00020-H\u0016J\u001C\u0010@\u001A\u00020-*\u00020<2\u0006\u0010=\u001A\u00020>2\u0006\u0010A\u001A\u00020-H\u0016J)\u0010B\u001A\u00020C*\u00020D2\u0006\u0010=\u001A\u00020E2\u0006\u00100\u001A\u00020/H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bF\u0010GJ\u001C\u0010H\u001A\u00020-*\u00020<2\u0006\u0010=\u001A\u00020>2\u0006\u0010?\u001A\u00020-H\u0016J\u001C\u0010I\u001A\u00020-*\u00020<2\u0006\u0010=\u001A\u00020>2\u0006\u0010A\u001A\u00020-H\u0016R\u0011\u0010\b\u001A\u00020\t\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000E\u001A\u0004\u0018\u00010\u000F\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001A\u0010\u001BR\u0011\u0010\n\u001A\u00020\u000B\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u0011\u0010\u0004\u001A\u00020\u0005\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u001FR\u0011\u0010\u0006\u001A\u00020\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b \u0010!R\u0014\u0010\"\u001A\u00020\u00078BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b#\u0010!\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006J"}, d2 = {"Landroidx/compose/ui/draw/PainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;Lkotlin/jvm/functions/Function1;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getAlpha", "()F", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "getSizeToIntrinsics", "()Z", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "equals", "other", "", "hashCode", "", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class PainterModifier extends InspectorValueInfo implements DrawModifier, LayoutModifier {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;
    private final boolean sizeToIntrinsics;

    public PainterModifier(Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, Function1 function10) {
        Intrinsics.checkNotNullParameter(painter0, "painter");
        Intrinsics.checkNotNullParameter(alignment0, "alignment");
        Intrinsics.checkNotNullParameter(contentScale0, "contentScale");
        Intrinsics.checkNotNullParameter(function10, "inspectorInfo");
        super(function10);
        this.painter = painter0;
        this.sizeToIntrinsics = z;
        this.alignment = alignment0;
        this.contentScale = contentScale0;
        this.alpha = f;
        this.colorFilter = colorFilter0;
    }

    public PainterModifier(Painter painter0, boolean z, Alignment alignment0, ContentScale contentScale0, float f, ColorFilter colorFilter0, Function1 function10, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(painter0, z, ((v & 4) == 0 ? alignment0 : Alignment.Companion.getCenter()), ((v & 8) == 0 ? contentScale0 : ContentScale.Companion.getInside()), ((v & 16) == 0 ? f : 1.0f), ((v & 0x20) == 0 ? colorFilter0 : null), function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    private final long calculateScaledSize-E7KxVPU(long v) {
        if(this.getUseIntrinsicSize()) {
            long v1 = SizeKt.Size((this.hasSpecifiedAndFiniteWidth-uvyYCjk(this.painter.getIntrinsicSize-NH-jbRc()) ? Size.getWidth-impl(this.painter.getIntrinsicSize-NH-jbRc()) : Size.getWidth-impl(v)), (this.hasSpecifiedAndFiniteHeight-uvyYCjk(this.painter.getIntrinsicSize-NH-jbRc()) ? Size.getHeight-impl(this.painter.getIntrinsicSize-NH-jbRc()) : Size.getHeight-impl(v)));
            return Size.getWidth-impl(v) == 0.0f || Size.getHeight-impl(v) == 0.0f ? 0L : ScaleFactorKt.times-UQTWf7w(v1, this.contentScale.computeScaleFactor-H7hwNQA(v1, v));
        }
        return v;
    }

    @Override  // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope0) {
        long v3;
        Intrinsics.checkNotNullParameter(contentDrawScope0, "<this>");
        long v = this.painter.getIntrinsicSize-NH-jbRc();
        long v1 = SizeKt.Size((this.hasSpecifiedAndFiniteWidth-uvyYCjk(v) ? Size.getWidth-impl(v) : Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc())), (this.hasSpecifiedAndFiniteHeight-uvyYCjk(v) ? Size.getHeight-impl(v) : Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc())));
        if(Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc()) == 0.0f || Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc()) == 0.0f) {
            v3 = 0L;
        }
        else {
            long v2 = contentDrawScope0.getSize-NH-jbRc();
            v3 = ScaleFactorKt.times-UQTWf7w(v1, this.contentScale.computeScaleFactor-H7hwNQA(v1, v2));
        }
        long v4 = IntSizeKt.IntSize(MathKt.roundToInt(Size.getWidth-impl(v3)), MathKt.roundToInt(Size.getHeight-impl(v3)));
        long v5 = IntSizeKt.IntSize(MathKt.roundToInt(Size.getWidth-impl(contentDrawScope0.getSize-NH-jbRc())), MathKt.roundToInt(Size.getHeight-impl(contentDrawScope0.getSize-NH-jbRc())));
        LayoutDirection layoutDirection0 = contentDrawScope0.getLayoutDirection();
        long v6 = this.alignment.align-KFBX0sM(v4, v5, layoutDirection0);
        float f = (float)(((int)(v6 >> 0x20)));
        float f1 = (float)(((int)(v6 & 0xFFFFFFFFL)));
        contentDrawScope0.getDrawContext().getTransform().translate(f, f1);
        this.getPainter().draw-x_KDEd0(contentDrawScope0, v3, this.getAlpha(), this.getColorFilter());
        contentDrawScope0.getDrawContext().getTransform().translate(-f, -f1);
    }

    @Override
    public boolean equals(Object object0) {
        PainterModifier painterModifier0 = object0 instanceof PainterModifier ? ((PainterModifier)object0) : null;
        if(painterModifier0 == null) {
            return false;
        }
        return !Intrinsics.areEqual(this.painter, painterModifier0.painter) || this.sizeToIntrinsics != painterModifier0.sizeToIntrinsics || !Intrinsics.areEqual(this.alignment, painterModifier0.alignment) || !Intrinsics.areEqual(this.contentScale, painterModifier0.contentScale) ? false : this.alpha == painterModifier0.alpha && Intrinsics.areEqual(this.colorFilter, painterModifier0.colorFilter);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    // 去混淆评级： 中等(70)
    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics ? this.painter.getIntrinsicSize-NH-jbRc() != 0x7FC000007FC00000L : false;
    }

    private final boolean hasSpecifiedAndFiniteHeight-uvyYCjk(long v) {
        if(!Size.equals-impl0(v, 0x7FC000007FC00000L)) {
            float f = Size.getHeight-impl(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }

    private final boolean hasSpecifiedAndFiniteWidth-uvyYCjk(long v) {
        if(!Size.equals-impl0(v, 0x7FC000007FC00000L)) {
            float f = Size.getWidth-impl(v);
            return !Float.isInfinite(f) && !Float.isNaN(f);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int v = this.painter.hashCode();
        int v1 = PainterModifier..ExternalSyntheticBackport0.m(this.sizeToIntrinsics);
        int v2 = this.alignment.hashCode();
        int v3 = this.contentScale.hashCode();
        int v4 = Float.floatToIntBits(this.alpha);
        return this.colorFilter == null ? ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F : ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + this.colorFilter.hashCode();
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
        if(this.getUseIntrinsicSize()) {
            int v1 = intrinsicMeasurable0.maxIntrinsicHeight(Constraints.getMaxWidth-impl(this.modifyConstraints-ZezNO4M(ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.getHeight-impl(this.calculateScaledSize-E7KxVPU(SizeKt.Size(v, v1)))), v1);
        }
        return intrinsicMeasurable0.maxIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
        if(this.getUseIntrinsicSize()) {
            int v1 = intrinsicMeasurable0.maxIntrinsicWidth(Constraints.getMaxHeight-impl(this.modifyConstraints-ZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null))));
            return Math.max(MathKt.roundToInt(Size.getWidth-impl(this.calculateScaledSize-E7KxVPU(SizeKt.Size(v1, v)))), v1);
        }
        return intrinsicMeasurable0.maxIntrinsicWidth(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Intrinsics.checkNotNullParameter(measureScope0, "$receiver");
        Intrinsics.checkNotNullParameter(measurable0, "measurable");
        Placeable placeable0 = measurable0.measure-BRTryo0(this.modifyConstraints-ZezNO4M(v));
        return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new Function1() {
            final Placeable $placeable;

            {
                this.$placeable = placeable0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PlacementScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(PlacementScope placeable$PlacementScope0) {
                Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                PlacementScope.placeRelative$default(placeable$PlacementScope0, this.$placeable, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
        if(this.getUseIntrinsicSize()) {
            int v1 = intrinsicMeasurable0.minIntrinsicHeight(Constraints.getMaxWidth-impl(this.modifyConstraints-ZezNO4M(ConstraintsKt.Constraints$default(0, v, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.getHeight-impl(this.calculateScaledSize-E7KxVPU(SizeKt.Size(v, v1)))), v1);
        }
        return intrinsicMeasurable0.minIntrinsicHeight(v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope0, "<this>");
        Intrinsics.checkNotNullParameter(intrinsicMeasurable0, "measurable");
        if(this.getUseIntrinsicSize()) {
            int v1 = intrinsicMeasurable0.minIntrinsicWidth(Constraints.getMaxHeight-impl(this.modifyConstraints-ZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, v, 7, null))));
            return Math.max(MathKt.roundToInt(Size.getWidth-impl(this.calculateScaledSize-E7KxVPU(SizeKt.Size(v1, v)))), v1);
        }
        return intrinsicMeasurable0.minIntrinsicWidth(v);
    }

    private final long modifyConstraints-ZezNO4M(long v) {
        boolean z = true;
        boolean z1 = Constraints.getHasBoundedWidth-impl(v) && Constraints.getHasBoundedHeight-impl(v);
        if(!Constraints.getHasFixedWidth-impl(v) || !Constraints.getHasFixedHeight-impl(v)) {
            z = false;
        }
        if(!this.getUseIntrinsicSize() && z1 || z) {
            return Constraints.copy-Zbe2FdA$default(v, Constraints.getMaxWidth-impl(v), 0, Constraints.getMaxHeight-impl(v), 0, 10, null);
        }
        long v1 = this.painter.getIntrinsicSize-NH-jbRc();
        int v2 = this.hasSpecifiedAndFiniteWidth-uvyYCjk(v1) ? MathKt.roundToInt(Size.getWidth-impl(v1)) : Constraints.getMinWidth-impl(v);
        int v3 = this.hasSpecifiedAndFiniteHeight-uvyYCjk(v1) ? MathKt.roundToInt(Size.getHeight-impl(v1)) : Constraints.getMinHeight-impl(v);
        long v4 = this.calculateScaledSize-E7KxVPU(SizeKt.Size(ConstraintsKt.constrainWidth-K40F9xA(v, v2), ConstraintsKt.constrainHeight-K40F9xA(v, v3)));
        return Constraints.copy-Zbe2FdA$default(v, ConstraintsKt.constrainWidth-K40F9xA(v, MathKt.roundToInt(Size.getWidth-impl(v4))), 0, ConstraintsKt.constrainHeight-K40F9xA(v, MathKt.roundToInt(Size.getHeight-impl(v4))), 0, 10, null);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override
    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}

