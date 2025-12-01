package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A8\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001A8\u0010\b\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001A \u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\nH\u0000\u001A\u001A\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0003\u001A\u00020\u00102\b\u0010\u0004\u001A\u0004\u0018\u00010\u0010H\u0000\u001A\u0018\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0003\u001A\u00020\u00112\u0006\u0010\u0004\u001A\u00020\u0011H\u0000\u001A\u0018\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0003\u001A\u00020\n2\u0006\u0010\u0004\u001A\u00020\nH\u0000\u001A\u0010\u0010\u0012\u001A\u00020\n2\u0006\u0010\u0013\u001A\u00020\nH\u0000\u001A\u0018\u0010\u0014\u001A\u00020\n2\u0006\u0010\u0015\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00020\nH\u0000\u001A\u0018\u0010\u0017\u001A\u00020\n2\u0006\u0010\u0015\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00020\nH\u0000\u001A\u0018\u0010\u0018\u001A\u00020\n2\u0006\u0010\u0015\u001A\u00020\n2\u0006\u0010\u0016\u001A\u00020\nH\u0000\u001A8\u0010\u0019\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001AH\u0010\u0019\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001A8\u0010\u001C\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001AH\u0010\u001C\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u00012\u0006\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u001A\u001A\u00020\u00012\u0006\u0010\u001B\u001A\u00020\u00012\u0006\u0010\u0007\u001A\u00020\u0001H\u0000\u001A\u001E\u0010\u001D\u001A\u00020\u001E*\u00020\u001E2\u0006\u0010\u001F\u001A\u00020\u00112\b\b\u0002\u0010 \u001A\u00020!H\u0007\u001A+\u0010\"\u001A\u00020#*\u00020\u001E2\b\b\u0002\u0010$\u001A\u00020\u001E2\b\b\u0002\u0010%\u001A\u00020&\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\'\u0010(\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006)"}, d2 = {"absRcpResponse", "", "x", "a", "b", "c", "d", "g", "absResponse", "chromaticAdaptation", "", "matrix", "srcWhitePoint", "dstWhitePoint", "compare", "", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "inverse3x3", "m", "mul3x3", "lhs", "rhs", "mul3x3Diag", "mul3x3Float3", "rcpResponse", "e", "f", "response", "adapt", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "whitePoint", "adaptation", "Landroidx/compose/ui/graphics/colorspace/Adaptation;", "connect", "Landroidx/compose/ui/graphics/colorspace/Connector;", "destination", "intent", "Landroidx/compose/ui/graphics/colorspace/RenderIntent;", "connect-YBCOT_4", "(Landroidx/compose/ui/graphics/colorspace/ColorSpace;Landroidx/compose/ui/graphics/colorspace/ColorSpace;I)Landroidx/compose/ui/graphics/colorspace/Connector;", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ColorSpaceKt {
    public static final double absRcpResponse(double f, double f1, double f2, double f3, double f4, double f5) {
        return f < 0.0 ? Math.copySign(ColorSpaceKt.rcpResponse(-f, f1, f2, f3, f4, f5), f) : Math.copySign(ColorSpaceKt.rcpResponse(f, f1, f2, f3, f4, f5), f);
    }

    public static final double absResponse(double f, double f1, double f2, double f3, double f4, double f5) {
        return f < 0.0 ? Math.copySign(ColorSpaceKt.response(-f, f1, f2, f3, f4, f5), f) : Math.copySign(ColorSpaceKt.response(f, f1, f2, f3, f4, f5), f);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace0, WhitePoint whitePoint0) {
        Intrinsics.checkNotNullParameter(colorSpace0, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        return ColorSpaceKt.adapt$default(colorSpace0, whitePoint0, null, 2, null);
    }

    public static final ColorSpace adapt(ColorSpace colorSpace0, WhitePoint whitePoint0, Adaptation adaptation0) {
        Intrinsics.checkNotNullParameter(colorSpace0, "<this>");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        Intrinsics.checkNotNullParameter(adaptation0, "adaptation");
        if(!ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L) || ColorSpaceKt.compare(((Rgb)colorSpace0).getWhitePoint(), whitePoint0)) {
            return colorSpace0;
        }
        float[] arr_f = whitePoint0.toXyz$ui_graphics_release();
        return new Rgb(((Rgb)colorSpace0), ColorSpaceKt.mul3x3(ColorSpaceKt.chromaticAdaptation(adaptation0.getTransform$ui_graphics_release(), ((Rgb)colorSpace0).getWhitePoint().toXyz$ui_graphics_release(), arr_f), ((Rgb)colorSpace0).getTransform$ui_graphics_release()), whitePoint0);
    }

    public static ColorSpace adapt$default(ColorSpace colorSpace0, WhitePoint whitePoint0, Adaptation adaptation0, int v, Object object0) {
        if((v & 2) != 0) {
            adaptation0 = Adaptation.Companion.getBradford();
        }
        return ColorSpaceKt.adapt(colorSpace0, whitePoint0, adaptation0);
    }

    public static final float[] chromaticAdaptation(float[] arr_f, float[] arr_f1, float[] arr_f2) {
        Intrinsics.checkNotNullParameter(arr_f, "matrix");
        Intrinsics.checkNotNullParameter(arr_f1, "srcWhitePoint");
        Intrinsics.checkNotNullParameter(arr_f2, "dstWhitePoint");
        float[] arr_f3 = ColorSpaceKt.mul3x3Float3(arr_f, arr_f1);
        float[] arr_f4 = ColorSpaceKt.mul3x3Float3(arr_f, arr_f2);
        float[] arr_f5 = {arr_f4[0] / arr_f3[0], arr_f4[1] / arr_f3[1], arr_f4[2] / arr_f3[2]};
        return ColorSpaceKt.mul3x3(ColorSpaceKt.inverse3x3(arr_f), ColorSpaceKt.mul3x3Diag(arr_f5, arr_f));
    }

    public static final boolean compare(TransferParameters transferParameters0, TransferParameters transferParameters1) {
        Intrinsics.checkNotNullParameter(transferParameters0, "a");
        return transferParameters1 != null && Math.abs(transferParameters0.getA() - transferParameters1.getA()) < 0.001 && Math.abs(transferParameters0.getB() - transferParameters1.getB()) < 0.001 && Math.abs(transferParameters0.getC() - transferParameters1.getC()) < 0.001 && Math.abs(transferParameters0.getD() - transferParameters1.getD()) < 0.002 && Math.abs(transferParameters0.getE() - transferParameters1.getE()) < 0.001 && Math.abs(transferParameters0.getF() - transferParameters1.getF()) < 0.001 && Math.abs(transferParameters0.getGamma() - transferParameters1.getGamma()) < 0.001;
    }

    public static final boolean compare(WhitePoint whitePoint0, WhitePoint whitePoint1) {
        Intrinsics.checkNotNullParameter(whitePoint0, "a");
        Intrinsics.checkNotNullParameter(whitePoint1, "b");
        return whitePoint0 == whitePoint1 ? true : Math.abs(whitePoint0.getX() - whitePoint1.getX()) < 0.001f && Math.abs(whitePoint0.getY() - whitePoint1.getY()) < 0.001f;
    }

    public static final boolean compare(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "a");
        Intrinsics.checkNotNullParameter(arr_f1, "b");
        if(arr_f == arr_f1) {
            return true;
        }
        int v = arr_f.length - 1;
        if(v >= 0) {
            for(int v1 = 0; true; ++v1) {
                if(Float.compare(arr_f[v1], arr_f1[v1]) != 0 && Math.abs(arr_f[v1] - arr_f1[v1]) > 0.001f) {
                    return false;
                }
                if(v1 + 1 > v) {
                    break;
                }
            }
        }
        return true;
    }

    public static final Connector connect-YBCOT_4(ColorSpace colorSpace0, ColorSpace colorSpace1, int v) {
        Intrinsics.checkNotNullParameter(colorSpace0, "$this$connect");
        Intrinsics.checkNotNullParameter(colorSpace1, "destination");
        if(colorSpace0 == colorSpace1) {
            return Connector.Companion.identity$ui_graphics_release(colorSpace0);
        }
        return ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L) && ColorModel.equals-impl0(colorSpace1.getModel-xdoWZVw(), 0x300000000L) ? new RgbConnector(((Rgb)colorSpace0), ((Rgb)colorSpace1), v, null) : new Connector(colorSpace0, colorSpace1, v, null);
    }

    public static Connector connect-YBCOT_4$default(ColorSpace colorSpace0, ColorSpace colorSpace1, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            colorSpace1 = ColorSpaces.INSTANCE.getSrgb();
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return ColorSpaceKt.connect-YBCOT_4(colorSpace0, colorSpace1, v);
    }

    public static final float[] inverse3x3(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "m");
        float f = arr_f[0];
        float f1 = arr_f[3];
        float f2 = arr_f[6];
        float f3 = arr_f[1];
        float f4 = arr_f[4];
        float f5 = arr_f[7];
        float f6 = arr_f[2];
        float f7 = arr_f[5];
        float f8 = arr_f[8];
        float f9 = f4 * f8 - f5 * f7;
        float f10 = f5 * f6 - f3 * f8;
        float f11 = f3 * f7 - f4 * f6;
        float f12 = f * f9 + f1 * f10 + f2 * f11;
        float[] arr_f1 = new float[arr_f.length];
        arr_f1[0] = f9 / f12;
        arr_f1[1] = f10 / f12;
        arr_f1[2] = f11 / f12;
        arr_f1[3] = (f2 * f7 - f1 * f8) / f12;
        arr_f1[4] = (f8 * f - f2 * f6) / f12;
        arr_f1[5] = (f6 * f1 - f7 * f) / f12;
        arr_f1[6] = (f1 * f5 - f2 * f4) / f12;
        arr_f1[7] = (f2 * f3 - f5 * f) / f12;
        arr_f1[8] = (f * f4 - f1 * f3) / f12;
        return arr_f1;
    }

    public static final float[] mul3x3(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "lhs");
        Intrinsics.checkNotNullParameter(arr_f1, "rhs");
        float[] arr_f2 = new float[9];
        float f = arr_f[0] * arr_f1[0];
        float f1 = arr_f[3];
        float f2 = arr_f1[1];
        float f3 = arr_f[6];
        float f4 = arr_f1[2];
        arr_f2[0] = f + f1 * f2 + f3 * f4;
        float f5 = arr_f[1];
        float f6 = arr_f1[0];
        float f7 = arr_f[4];
        float f8 = arr_f[7];
        arr_f2[1] = f5 * f6 + f2 * f7 + f8 * f4;
        float f9 = arr_f[2] * f6;
        float f10 = arr_f[5];
        float f11 = f9 + arr_f1[1] * f10;
        float f12 = arr_f[8];
        arr_f2[2] = f11 + f4 * f12;
        float f13 = arr_f[0];
        float f14 = arr_f1[3] * f13;
        float f15 = arr_f1[4];
        float f16 = arr_f1[5];
        arr_f2[3] = f14 + f1 * f15 + f3 * f16;
        float f17 = arr_f[1];
        float f18 = arr_f1[3];
        arr_f2[4] = f17 * f18 + f7 * f15 + f8 * f16;
        float f19 = arr_f[2];
        arr_f2[5] = f18 * f19 + f10 * arr_f1[4] + f16 * f12;
        float f20 = f13 * arr_f1[6];
        float f21 = arr_f[3];
        float f22 = arr_f1[7];
        float f23 = arr_f1[8];
        arr_f2[6] = f20 + f21 * f22 + f3 * f23;
        float f24 = arr_f1[6];
        arr_f2[7] = f17 * f24 + arr_f[4] * f22 + f8 * f23;
        arr_f2[8] = f19 * f24 + arr_f[5] * arr_f1[7] + f12 * f23;
        return arr_f2;
    }

    public static final float[] mul3x3Diag(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "lhs");
        Intrinsics.checkNotNullParameter(arr_f1, "rhs");
        float[] arr_f2 = new float[9];
        arr_f2[0] = arr_f[0] * arr_f1[0];
        arr_f2[1] = arr_f[1] * arr_f1[1];
        arr_f2[2] = arr_f[2] * arr_f1[2];
        float f = arr_f[0];
        arr_f2[3] = arr_f1[3] * f;
        float f1 = arr_f[1];
        arr_f2[4] = arr_f1[4] * f1;
        float f2 = arr_f[2];
        arr_f2[5] = arr_f1[5] * f2;
        arr_f2[6] = f * arr_f1[6];
        arr_f2[7] = f1 * arr_f1[7];
        arr_f2[8] = f2 * arr_f1[8];
        return arr_f2;
    }

    public static final float[] mul3x3Float3(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "lhs");
        Intrinsics.checkNotNullParameter(arr_f1, "rhs");
        float f = arr_f1[0];
        float f1 = arr_f1[1];
        float f2 = arr_f1[2];
        arr_f1[0] = arr_f[0] * f + arr_f[3] * f1 + arr_f[6] * f2;
        arr_f1[1] = arr_f[1] * f + arr_f[4] * f1 + arr_f[7] * f2;
        arr_f1[2] = arr_f[2] * f + arr_f[5] * f1 + arr_f[8] * f2;
        return arr_f1;
    }

    public static final double rcpResponse(double f, double f1, double f2, double f3, double f4, double f5) {
        return f >= f4 * f3 ? (Math.pow(f, 1.0 / f5) - f2) / f1 : f / f3;
    }

    public static final double rcpResponse(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7) {
        return f >= f4 * f3 ? (Math.pow(f - f5, 1.0 / f7) - f2) / f1 : (f - f6) / f3;
    }

    public static final double response(double f, double f1, double f2, double f3, double f4, double f5) {
        return f >= f4 ? Math.pow(f1 * f + f2, f5) : f * f3;
    }

    public static final double response(double f, double f1, double f2, double f3, double f4, double f5, double f6, double f7) {
        return f >= f4 ? Math.pow(f1 * f + f2, f7) + f5 : f3 * f + f6;
    }
}

