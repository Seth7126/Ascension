package androidx.compose.ui.draw;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A5\u0010\u0000\u001A\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u0007H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\n"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ShadowKt {
    public static final Modifier shadow-ziNgDLE(Modifier modifier0, float f, Shape shape0, boolean z) {
        Intrinsics.checkNotNullParameter(modifier0, "$this$shadow");
        Intrinsics.checkNotNullParameter(shape0, "shape");
        return Dp.compareTo-0680j_4(f, 0.0f) <= 0 && !z ? modifier0 : ComposedModifierKt.composed(modifier0, InspectableValueKt.getNoInspectorInfo(), new Function3(f, shape0, z) {
            final boolean $clip;
            final float $elevation;
            final Shape $shape;

            {
                this.$elevation = f;
                this.$shape = shape0;
                this.$clip = z;
                super(3);
            }

            public final Modifier invoke(Modifier modifier0, Composer composer0, int v) {
                Intrinsics.checkNotNullParameter(modifier0, "$this$composed");
                composer0.startReplaceableGroup(0xD320B2ED);
                Modifier modifier1 = GraphicsLayerModifierKt.graphicsLayer(modifier0, new Function1(this.$shape, this.$clip) {
                    final boolean $clip;
                    final float $elevation;
                    final Shape $shape;

                    {
                        this.$elevation = f;
                        this.$shape = shape0;
                        this.$clip = z;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((GraphicsLayerScope)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(GraphicsLayerScope graphicsLayerScope0) {
                        Intrinsics.checkNotNullParameter(graphicsLayerScope0, "$this$graphicsLayer");
                        graphicsLayerScope0.setShadowElevation(graphicsLayerScope0.toPx-0680j_4(this.$elevation));
                        graphicsLayerScope0.setShape(this.$shape);
                        graphicsLayerScope0.setClip(this.$clip);
                    }
                });
                composer0.endReplaceableGroup();
                return modifier1;
            }

            @Override  // kotlin.jvm.functions.Function3
            public Object invoke(Object object0, Object object1, Object object2) {
                return this.invoke(((Modifier)object0), ((Composer)object1), ((Number)object2).intValue());
            }
        });

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001A\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public final class androidx.compose.ui.draw.ShadowKt.shadow-ziNgDLE..inlined.debugInspectorInfo.1 extends Lambda implements Function1 {
            final boolean $clip$inlined;
            final float $elevation$inlined;
            final Shape $shape$inlined;

            public androidx.compose.ui.draw.ShadowKt.shadow-ziNgDLE..inlined.debugInspectorInfo.1(float f, Shape shape0, boolean z) {
                this.$elevation$inlined = f;
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
                inspectorInfo0.setName("shadow");
                inspectorInfo0.getProperties().set("elevation", Dp.box-impl(this.$elevation$inlined));
                inspectorInfo0.getProperties().set("shape", this.$shape$inlined);
                inspectorInfo0.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
            }
        }

    }

    public static Modifier shadow-ziNgDLE$default(Modifier modifier0, float f, Shape shape0, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            shape0 = RectangleShapeKt.getRectangleShape();
        }
        if((v & 4) != 0) {
            z = false;
            if(Dp.compareTo-0680j_4(f, 0.0f) > 0) {
                z = true;
            }
        }
        return ShadowKt.shadow-ziNgDLE(modifier0, f, shape0, z);
    }
}

