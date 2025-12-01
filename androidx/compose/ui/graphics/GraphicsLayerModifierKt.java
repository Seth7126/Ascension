package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\u001A%\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0017\u0010\u0002\u001A\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007\u001A\u009B\u0001\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0007\u001A\u00020\b2\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\n\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\b2\b\b\u0002\u0010\f\u001A\u00020\b2\b\b\u0002\u0010\r\u001A\u00020\b2\b\b\u0002\u0010\u000E\u001A\u00020\b2\b\b\u0002\u0010\u000F\u001A\u00020\b2\b\b\u0002\u0010\u0010\u001A\u00020\b2\b\b\u0002\u0010\u0011\u001A\u00020\b2\b\b\u0002\u0010\u0012\u001A\u00020\u00132\b\b\u0002\u0010\u0014\u001A\u00020\u00152\b\b\u0002\u0010\u0016\u001A\u00020\u0017H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001A\f\u0010\u001A\u001A\u00020\u0001*\u00020\u0001H\u0007\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001B"}, d2 = {"graphicsLayer", "Landroidx/compose/ui/Modifier;", "block", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "", "Lkotlin/ExtensionFunctionType;", "scaleX", "", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "transformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "graphicsLayer-sKFY_QE", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "toolingGraphicsLayer", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class GraphicsLayerModifierKt {
    public static final Modifier graphicsLayer(Modifier modifier0, Function1 function10) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "block");
        return modifier0.then(new BlockGraphicsLayerModifier(function10, InspectableValueKt.getNoInspectorInfo()));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final Function1 $block$inlined;

            public androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer..inlined.debugInspectorInfo.1(Function1 function10) {
                this.$block$inlined = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("graphicsLayer");
                inspectorInfo0.getProperties().set("block", this.$block$inlined);
            }
        }

    }

    public static final Modifier graphicsLayer-sKFY_QE(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$graphicsLayer");
        Intrinsics.checkNotNullParameter(shape0, "shape");
        return modifier0.then(new SimpleGraphicsLayerModifier(f, f1, f2, f3, f4, f5, f6, f7, f8, f9, v, shape0, z, InspectableValueKt.getNoInspectorInfo(), null));

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer-sKFY_QE..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final float $alpha$inlined;
            final float $cameraDistance$inlined;
            final boolean $clip$inlined;
            final float $rotationX$inlined;
            final float $rotationY$inlined;
            final float $rotationZ$inlined;
            final float $scaleX$inlined;
            final float $scaleY$inlined;
            final float $shadowElevation$inlined;
            final Shape $shape$inlined;
            final long $transformOrigin$inlined;
            final float $translationX$inlined;
            final float $translationY$inlined;

            public androidx.compose.ui.graphics.GraphicsLayerModifierKt.graphicsLayer-sKFY_QE..inlined.debugInspectorInfo.1(float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z) {
                this.$scaleX$inlined = f;
                this.$scaleY$inlined = f1;
                this.$alpha$inlined = f2;
                this.$translationX$inlined = f3;
                this.$translationY$inlined = f4;
                this.$shadowElevation$inlined = f5;
                this.$rotationX$inlined = f6;
                this.$rotationY$inlined = f7;
                this.$rotationZ$inlined = f8;
                this.$cameraDistance$inlined = f9;
                this.$transformOrigin$inlined = v;
                this.$shape$inlined = shape0;
                this.$clip$inlined = z;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((InspectorInfo)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(InspectorInfo inspectorInfo0) {
                Intrinsics.checkNotNullParameter(inspectorInfo0, "$this$null");
                inspectorInfo0.setName("graphicsLayer");
                inspectorInfo0.getProperties().set("scaleX", this.$scaleX$inlined);
                inspectorInfo0.getProperties().set("scaleY", this.$scaleY$inlined);
                inspectorInfo0.getProperties().set("alpha", this.$alpha$inlined);
                inspectorInfo0.getProperties().set("translationX", this.$translationX$inlined);
                inspectorInfo0.getProperties().set("translationY", this.$translationY$inlined);
                inspectorInfo0.getProperties().set("shadowElevation", this.$shadowElevation$inlined);
                inspectorInfo0.getProperties().set("rotationX", this.$rotationX$inlined);
                inspectorInfo0.getProperties().set("rotationY", this.$rotationY$inlined);
                inspectorInfo0.getProperties().set("rotationZ", this.$rotationZ$inlined);
                inspectorInfo0.getProperties().set("cameraDistance", this.$cameraDistance$inlined);
                inspectorInfo0.getProperties().set("transformOrigin", TransformOrigin.box-impl(this.$transformOrigin$inlined));
                inspectorInfo0.getProperties().set("shape", this.$shape$inlined);
                inspectorInfo0.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
            }
        }

    }

    public static Modifier graphicsLayer-sKFY_QE$default(Modifier modifier0, float f, float f1, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, long v, Shape shape0, boolean z, int v1, Object object0) {
        float f10 = 1.0f;
        float f11 = (v1 & 1) == 0 ? f : 1.0f;
        float f12 = (v1 & 2) == 0 ? f1 : 1.0f;
        if((v1 & 4) == 0) {
            f10 = f2;
        }
        float f13 = 0.0f;
        float f14 = (v1 & 8) == 0 ? f3 : 0.0f;
        float f15 = (v1 & 16) == 0 ? f4 : 0.0f;
        float f16 = (v1 & 0x20) == 0 ? f5 : 0.0f;
        float f17 = (v1 & 0x40) == 0 ? f6 : 0.0f;
        float f18 = (v1 & 0x80) == 0 ? f7 : 0.0f;
        if((v1 & 0x100) == 0) {
            f13 = f8;
        }
        float f19 = (v1 & 0x200) == 0 ? f9 : 8.0f;
        long v2 = (v1 & 0x400) == 0 ? v : 0x3F0000003F000000L;
        Shape shape1 = (v1 & 0x800) == 0 ? shape0 : RectangleShapeKt.getRectangleShape();
        return (v1 & 0x1000) == 0 ? GraphicsLayerModifierKt.graphicsLayer-sKFY_QE(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, z) : GraphicsLayerModifierKt.graphicsLayer-sKFY_QE(modifier0, f11, f12, f10, f14, f15, f16, f17, f18, f13, f19, v2, shape1, false);
    }

    public static final Modifier toolingGraphicsLayer(Modifier modifier0) {
        Intrinsics.checkNotNullParameter(modifier0, "<this>");
        return modifier0;
    }
}

