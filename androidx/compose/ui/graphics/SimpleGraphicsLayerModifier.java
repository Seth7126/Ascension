package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.PainterModifier..ExternalSyntheticBackport0;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier.DefaultImpls;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectorValueInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0089\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0006\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0004\u0012\u0006\u0010\b\u001A\u00020\u0004\u0012\u0006\u0010\t\u001A\u00020\u0004\u0012\u0006\u0010\n\u001A\u00020\u0004\u0012\u0006\u0010\u000B\u001A\u00020\u0004\u0012\u0006\u0010\f\u001A\u00020\u0004\u0012\u0006\u0010\r\u001A\u00020\u0004\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u0011\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u0012\u0017\u0010\u0014\u001A\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015\u00A2\u0006\u0002\b\u0018\u00F8\u0001\u0000\u00A2\u0006\u0002\u0010\u0019J\u0013\u0010\u001D\u001A\u00020\u00132\b\u0010\u001E\u001A\u0004\u0018\u00010\u001FH\u0096\u0002J\b\u0010 \u001A\u00020!H\u0016J\b\u0010\"\u001A\u00020#H\u0016J)\u0010$\u001A\u00020%*\u00020&2\u0006\u0010\'\u001A\u00020(2\u0006\u0010)\u001A\u00020*H\u0016\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b+\u0010,R\u000E\u0010\u0006\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0012\u001A\u00020\u0013X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001F\u0010\u001A\u001A\u0013\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u00170\u0015\u00A2\u0006\u0002\b\u0018X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0010\u001A\u00020\u0011X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0019\u0010\u000E\u001A\u00020\u000FX\u0082\u0004\u00F8\u0001\u0000\u00F8\u0001\u0001\u00F8\u0001\u0002\u00A2\u0006\u0004\n\u0002\u0010\u001CR\u000E\u0010\u0007\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0004X\u0082\u0004\u00A2\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\n\u0002\b!\u00A8\u0006-"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "J", "equals", "other", "", "hashCode", "", "toString", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class SimpleGraphicsLayerModifier extends InspectorValueInfo implements LayoutModifier {
    private final float alpha;
    private final float cameraDistance;
    private final boolean clip;
    private final Function1 layerBlock;
    private final float rotationX;
    private final float rotationY;
    private final float rotationZ;
    private final float scaleX;
    private final float scaleY;
    private final float shadowElevation;
    private final Shape shape;
    private final long transformOrigin;
    private final float translationX;
    private final float translationY;

    private SimpleGraphicsLayerModifier(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, Function1 function10) {
        super(function10);
        this.scaleX = f;
        this.scaleY = f1;
        this.alpha = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.shadowElevation = f5;
        this.rotationX = f6;
        this.rotationY = f7;
        this.rotationZ = f8;
        this.cameraDistance = f9;
        this.transformOrigin = v;
        this.shape = shape0;
        this.clip = z;
        this.layerBlock = new Function1() {
            {
                SimpleGraphicsLayerModifier.this = simpleGraphicsLayerModifier0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((GraphicsLayerScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(GraphicsLayerScope graphicsLayerScope0) {
                Intrinsics.checkNotNullParameter(graphicsLayerScope0, "$this$null");
                graphicsLayerScope0.setScaleX(SimpleGraphicsLayerModifier.this.scaleX);
                graphicsLayerScope0.setScaleY(SimpleGraphicsLayerModifier.this.scaleY);
                graphicsLayerScope0.setAlpha(SimpleGraphicsLayerModifier.this.alpha);
                graphicsLayerScope0.setTranslationX(SimpleGraphicsLayerModifier.this.translationX);
                graphicsLayerScope0.setTranslationY(SimpleGraphicsLayerModifier.this.translationY);
                graphicsLayerScope0.setShadowElevation(SimpleGraphicsLayerModifier.this.shadowElevation);
                graphicsLayerScope0.setRotationX(SimpleGraphicsLayerModifier.this.rotationX);
                graphicsLayerScope0.setRotationY(SimpleGraphicsLayerModifier.this.rotationY);
                graphicsLayerScope0.setRotationZ(SimpleGraphicsLayerModifier.this.rotationZ);
                graphicsLayerScope0.setCameraDistance(SimpleGraphicsLayerModifier.this.cameraDistance);
                graphicsLayerScope0.setTransformOrigin-__ExYCQ(SimpleGraphicsLayerModifier.this.transformOrigin);
                graphicsLayerScope0.setShape(SimpleGraphicsLayerModifier.this.shape);
                graphicsLayerScope0.setClip(SimpleGraphicsLayerModifier.this.clip);
            }
        };
    }

    public SimpleGraphicsLayerModifier(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, Function1 function10, DefaultConstructorMarker defaultConstructorMarker0) {
        this(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean all(Function1 function10) {
        return DefaultImpls.all(this, function10);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public boolean any(Function1 function10) {
        return DefaultImpls.any(this, function10);
    }

    // 去混淆评级： 低(35)
    @Override
    public boolean equals(Object object0) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier0 = object0 instanceof SimpleGraphicsLayerModifier ? ((SimpleGraphicsLayerModifier)object0) : null;
        if(simpleGraphicsLayerModifier0 == null) {
            return false;
        }
        return this.scaleX != simpleGraphicsLayerModifier0.scaleX || this.scaleY != simpleGraphicsLayerModifier0.scaleY || this.alpha != simpleGraphicsLayerModifier0.alpha || this.translationX != simpleGraphicsLayerModifier0.translationX || this.translationY != simpleGraphicsLayerModifier0.translationY || this.shadowElevation != simpleGraphicsLayerModifier0.shadowElevation || this.rotationX != simpleGraphicsLayerModifier0.rotationX || this.rotationY != simpleGraphicsLayerModifier0.rotationY || this.rotationZ != simpleGraphicsLayerModifier0.rotationZ ? false : this.cameraDistance == simpleGraphicsLayerModifier0.cameraDistance && TransformOrigin.equals-impl0(this.transformOrigin, simpleGraphicsLayerModifier0.transformOrigin) && Intrinsics.areEqual(this.shape, simpleGraphicsLayerModifier0.shape) && this.clip == simpleGraphicsLayerModifier0.clip;
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldIn(Object object0, Function2 function20) {
        return DefaultImpls.foldIn(this, object0, function20);
    }

    @Override  // androidx.compose.ui.Modifier$Element
    public Object foldOut(Object object0, Function2 function20) {
        return DefaultImpls.foldOut(this, object0, function20);
    }

    @Override
    public int hashCode() {
        return (((((((((((Float.floatToIntBits(this.scaleX) * 0x1F + Float.floatToIntBits(this.scaleY)) * 0x1F + Float.floatToIntBits(this.alpha)) * 0x1F + Float.floatToIntBits(this.translationX)) * 0x1F + Float.floatToIntBits(this.translationY)) * 0x1F + Float.floatToIntBits(this.shadowElevation)) * 0x1F + Float.floatToIntBits(this.rotationX)) * 0x1F + Float.floatToIntBits(this.rotationY)) * 0x1F + Float.floatToIntBits(this.rotationZ)) * 0x1F + Float.floatToIntBits(this.cameraDistance)) * 0x1F + TransformOrigin.hashCode-impl(this.transformOrigin)) * 0x1F + this.shape.hashCode()) * 0x1F + PainterModifier..ExternalSyntheticBackport0.m(this.clip);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.maxIntrinsicHeight(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.maxIntrinsicWidth(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public MeasureResult measure-3p2s80s(MeasureScope measureScope0, Measurable measurable0, long v) {
        Intrinsics.checkNotNullParameter(measureScope0, "$receiver");
        Intrinsics.checkNotNullParameter(measurable0, "measurable");
        Placeable placeable0 = measurable0.measure-BRTryo0(v);
        return androidx.compose.ui.layout.MeasureScope.DefaultImpls.layout$default(measureScope0, placeable0.getWidth(), placeable0.getHeight(), null, new Function1(this) {
            final Placeable $placeable;

            {
                this.$placeable = placeable0;
                SimpleGraphicsLayerModifier.this = simpleGraphicsLayerModifier0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((PlacementScope)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(PlacementScope placeable$PlacementScope0) {
                Intrinsics.checkNotNullParameter(placeable$PlacementScope0, "$this$layout");
                Function1 function10 = SimpleGraphicsLayerModifier.this.layerBlock;
                PlacementScope.placeWithLayer$default(placeable$PlacementScope0, this.$placeable, 0, 0, 0.0f, function10, 4, null);
            }
        }, 4, null);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.minIntrinsicHeight(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope0, IntrinsicMeasurable intrinsicMeasurable0, int v) {
        return DefaultImpls.minIntrinsicWidth(this, intrinsicMeasureScope0, intrinsicMeasurable0, v);
    }

    @Override  // androidx.compose.ui.Modifier
    public Modifier then(Modifier modifier0) {
        return DefaultImpls.then(this, modifier0);
    }

    @Override
    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + TransformOrigin.toString-impl(this.transformOrigin) + ", shape=" + this.shape + ", clip=" + this.clip + ')';
    }
}

