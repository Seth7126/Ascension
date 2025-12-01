package androidx.compose.ui.graphics.colorspace;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001AB\"\b\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007B<\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\b\u001A\u00020\u0003\u0012\u0006\u0010\t\u001A\u00020\u0003\u0012\u0006\u0010\n\u001A\u00020\u0006\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0002\u0010\rJ\u001E\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0014\u001A\u00020\u00152\u0006\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0017\u001A\u00020\u0015J\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\u0018\u001A\u00020\fH\u0016R\u0011\u0010\u0004\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u000FR\u001C\u0010\n\u001A\u00020\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001A\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0013\u0010\u000FR\u0010\u0010\u000B\u001A\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector;", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "transformSource", "transformDestination", "renderIntent", "transform", "", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I[FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDestination", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getRenderIntent-uksYyKA", "()I", "I", "getSource", "r", "", "g", "b", "v", "Companion", "RgbConnector", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public class Connector {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\f\u001A\u00020\r2\u0006\u0010\u0005\u001A\u00020\u0006H\u0000¢\u0006\u0002\b\u000E\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$Companion;", "", "()V", "computeTransform", "", "source", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)[F", "identity", "Landroidx/compose/ui/graphics/colorspace/Connector;", "identity$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final float[] computeTransform-YBCOT_4(ColorSpace colorSpace0, ColorSpace colorSpace1, int v) {
            float[] arr_f1;
            if(!RenderIntent.equals-impl0(v, 3)) {
                return null;
            }
            boolean z = ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L);
            boolean z1 = ColorModel.equals-impl0(colorSpace1.getModel-xdoWZVw(), 0x300000000L);
            if(z && z1) {
                return null;
            }
            if(!z && !z1) {
                return null;
            }
            if(!z) {
                colorSpace0 = colorSpace1;
            }
            float[] arr_f = z ? ((Rgb)colorSpace0).getWhitePoint().toXyz$ui_graphics_release() : Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            if(z1) {
                arr_f1 = ((Rgb)colorSpace0).getWhitePoint().toXyz$ui_graphics_release();
                return new float[]{arr_f[0] / arr_f1[0], arr_f[1] / arr_f1[1], arr_f[2] / arr_f1[2]};
            }
            arr_f1 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
            return new float[]{arr_f[0] / arr_f1[0], arr_f[1] / arr_f1[1], arr_f[2] / arr_f1[2]};
        }

        public final Connector identity$ui_graphics_release(ColorSpace colorSpace0) {
            Intrinsics.checkNotNullParameter(colorSpace0, "source");
            return new Connector(1) {
                final ColorSpace $source;

                {
                    this.$source = colorSpace0;
                    super(colorSpace0, colorSpace0, v, null);
                }

                @Override  // androidx.compose.ui.graphics.colorspace.Connector
                public float[] transform(float[] arr_f) {
                    Intrinsics.checkNotNullParameter(arr_f, "v");
                    return arr_f;
                }
            };
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\"\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0005\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J-\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\u00032\u0006\u0010\f\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\tH\u0016R\u000E\u0010\u0004\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Connector$RgbConnector;", "Landroidx/compose/ui/graphics/colorspace/Connector;", "mSource", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "mDestination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "mTransform", "", "computeTransform", "source", "destination", "computeTransform-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/Rgb;Landroidx/compose/ui/graphics/colorspace/Rgb;I)[F", "transform", "v", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class RgbConnector extends Connector {
        private final Rgb mDestination;
        private final Rgb mSource;
        private final float[] mTransform;

        private RgbConnector(Rgb rgb0, Rgb rgb1, int v) {
            super(rgb0, rgb1, rgb0, rgb1, v, null, null);
            this.mSource = rgb0;
            this.mDestination = rgb1;
            this.mTransform = this.computeTransform-YBCOT_4(rgb0, rgb1, v);
        }

        public RgbConnector(Rgb rgb0, Rgb rgb1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            this(rgb0, rgb1, v);
        }

        private final float[] computeTransform-YBCOT_4(Rgb rgb0, Rgb rgb1, int v) {
            if(ColorSpaceKt.compare(rgb0.getWhitePoint(), rgb1.getWhitePoint())) {
                return ColorSpaceKt.mul3x3(rgb1.getInverseTransform$ui_graphics_release(), rgb0.getTransform$ui_graphics_release());
            }
            float[] arr_f = rgb0.getTransform$ui_graphics_release();
            float[] arr_f1 = rgb1.getInverseTransform$ui_graphics_release();
            float[] arr_f2 = rgb0.getWhitePoint().toXyz$ui_graphics_release();
            float[] arr_f3 = rgb1.getWhitePoint().toXyz$ui_graphics_release();
            if(!ColorSpaceKt.compare(rgb0.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                float[] arr_f4 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                float[] arr_f5 = Arrays.copyOf(arr_f4, arr_f4.length);
                Intrinsics.checkNotNullExpressionValue(arr_f5, "java.util.Arrays.copyOf(this, size)");
                arr_f = ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), arr_f2, arr_f5), rgb0.getTransform$ui_graphics_release());
            }
            if(!ColorSpaceKt.compare(rgb1.getWhitePoint(), Illuminant.INSTANCE.getD50())) {
                float[] arr_f6 = Illuminant.INSTANCE.getD50Xyz$ui_graphics_release();
                float[] arr_f7 = Arrays.copyOf(arr_f6, arr_f6.length);
                Intrinsics.checkNotNullExpressionValue(arr_f7, "java.util.Arrays.copyOf(this, size)");
                arr_f1 = ColorSpaceKt.inverse3x3(ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(Adaptation.Companion.getBradford().getTransform$ui_graphics_release(), arr_f3, arr_f7), rgb1.getTransform$ui_graphics_release()));
            }
            if(RenderIntent.equals-impl0(v, 3)) {
                arr_f = ColorSpaceKt.mul3x3Diag(new float[]{arr_f2[0] / arr_f3[0], arr_f2[1] / arr_f3[1], arr_f2[2] / arr_f3[2]}, arr_f);
            }
            return ColorSpaceKt.mul3x3(arr_f1, arr_f);
        }

        @Override  // androidx.compose.ui.graphics.colorspace.Connector
        public float[] transform(float[] arr_f) {
            Intrinsics.checkNotNullParameter(arr_f, "v");
            arr_f[0] = (float)((Number)this.mSource.getEotf().invoke(((double)arr_f[0]))).doubleValue();
            arr_f[1] = (float)((Number)this.mSource.getEotf().invoke(((double)arr_f[1]))).doubleValue();
            arr_f[2] = (float)((Number)this.mSource.getEotf().invoke(((double)arr_f[2]))).doubleValue();
            ColorSpaceKt.mul3x3Float3(this.mTransform, arr_f);
            arr_f[0] = (float)((Number)this.mDestination.getOetf().invoke(((double)arr_f[0]))).doubleValue();
            arr_f[1] = (float)((Number)this.mDestination.getOetf().invoke(((double)arr_f[1]))).doubleValue();
            arr_f[2] = (float)((Number)this.mDestination.getOetf().invoke(((double)arr_f[2]))).doubleValue();
            return arr_f;
        }
    }

    public static final Companion Companion;
    private final ColorSpace destination;
    private final int renderIntent;
    private final ColorSpace source;
    private final float[] transform;
    private final ColorSpace transformDestination;
    private final ColorSpace transformSource;

    static {
        Connector.Companion = new Companion(null);
    }

    // 去混淆评级： 低(40)
    private Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, int v) {
        this(colorSpace0, colorSpace1, (ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L) ? ColorSpaceKt.adapt$default(colorSpace0, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace0), (ColorModel.equals-impl0(colorSpace1.getModel-xdoWZVw(), 0x300000000L) ? ColorSpaceKt.adapt$default(colorSpace1, Illuminant.INSTANCE.getD50(), null, 2, null) : colorSpace1), v, Connector.Companion.computeTransform-YBCOT_4(colorSpace0, colorSpace1, v), null);
    }

    public Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(colorSpace0, colorSpace1, v);
    }

    private Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, ColorSpace colorSpace2, ColorSpace colorSpace3, int v, float[] arr_f) {
        this.source = colorSpace0;
        this.destination = colorSpace1;
        this.transformSource = colorSpace2;
        this.transformDestination = colorSpace3;
        this.renderIntent = v;
        this.transform = arr_f;
    }

    public Connector(ColorSpace colorSpace0, ColorSpace colorSpace1, ColorSpace colorSpace2, ColorSpace colorSpace3, int v, float[] arr_f, DefaultConstructorMarker defaultConstructorMarker0) {
        this(colorSpace0, colorSpace1, colorSpace2, colorSpace3, v, arr_f);
    }

    public final ColorSpace getDestination() {
        return this.destination;
    }

    public final int getRenderIntent-uksYyKA() {
        return this.renderIntent;
    }

    public final ColorSpace getSource() {
        return this.source;
    }

    public final float[] transform(float f, float f1, float f2) {
        return this.transform(new float[]{f, f1, f2});
    }

    public float[] transform(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        float[] arr_f1 = this.transformSource.toXyz(arr_f);
        float[] arr_f2 = this.transform;
        if(arr_f2 != null) {
            arr_f1[0] *= arr_f2[0];
            arr_f1[1] *= arr_f2[1];
            arr_f1[2] *= arr_f2[2];
        }
        return this.transformDestination.fromXyz(arr_f1);
    }
}

