package androidx.compose.ui.graphics.colorspace;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0005\b\u00C6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00A2\u0006\u0002\u0010\u0002J\u0016\u0010;\u001A\u00020\u00102\u0006\u0010<\u001A\u00020=H\u0080\b\u00A2\u0006\u0002\b>J\u0018\u0010?\u001A\u0004\u0018\u00010\u00102\u0006\u0010@\u001A\u00020)2\u0006\u0010A\u001A\u00020%R\u0011\u0010\u0003\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u0006R\u0011\u0010\u000B\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\u0006R\u0011\u0010\u000F\u001A\u00020\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001A\u00020\u0010\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0014\u0010\u0012R\u001C\u0010\u0015\u001A\b\u0012\u0004\u0012\u00020\u00100\u0016X\u0080\u0004\u00A2\u0006\n\n\u0002\u0010\u0019\u001A\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001A\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001B\u0010\u0006R\u0011\u0010\u001C\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001D\u0010\u0006R\u0011\u0010\u001E\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001F\u0010\u0006R\u0011\u0010 \u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b!\u0010\u0006R\u0011\u0010\"\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b#\u0010\u0006R\u000E\u0010$\u001A\u00020%X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u0011\u0010&\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010\u0006R\u0014\u0010(\u001A\u00020)X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b*\u0010+R\u0014\u0010,\u001A\u00020\u0010X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b-\u0010\u0012R\u0011\u0010.\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u0010\u0006R\u0011\u00100\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b1\u0010\u0006R\u0011\u00102\u001A\u00020\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u0010\u0006R\u0014\u00104\u001A\u00020)X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b5\u0010+R\u0014\u00106\u001A\u00020%X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b7\u00108R\u0014\u00109\u001A\u00020\u0004X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b:\u0010\u0006\u00A8\u0006B"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/ColorSpaces;", "", "()V", "Aces", "Landroidx/compose/ui/graphics/colorspace/Rgb;", "getAces", "()Landroidx/compose/ui/graphics/colorspace/Rgb;", "Acescg", "getAcescg", "AdobeRgb", "getAdobeRgb", "Bt2020", "getBt2020", "Bt709", "getBt709", "CieLab", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getCieLab", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "CieXyz", "getCieXyz", "ColorSpacesArray", "", "getColorSpacesArray$ui_graphics_release", "()[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "[Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "DciP3", "getDciP3", "DisplayP3", "getDisplayP3", "ExtendedSrgb", "getExtendedSrgb", "LinearExtendedSrgb", "getLinearExtendedSrgb", "LinearSrgb", "getLinearSrgb", "NoneTransferParameters", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Ntsc1953", "getNtsc1953", "Ntsc1953Primaries", "", "getNtsc1953Primaries$ui_graphics_release", "()[F", "Oklab", "getOklab$ui_graphics_release", "ProPhotoRgb", "getProPhotoRgb", "SmpteC", "getSmpteC", "Srgb", "getSrgb", "SrgbPrimaries", "getSrgbPrimaries$ui_graphics_release", "SrgbTransferParameters", "getSrgbTransferParameters$ui_graphics_release", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "Unspecified", "getUnspecified$ui_graphics_release", "getColorSpace", "id", "", "getColorSpace$ui_graphics_release", "match", "toXYZD50", "function", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ColorSpaces {
    private static final Rgb Aces;
    private static final Rgb Acescg;
    private static final Rgb AdobeRgb;
    private static final Rgb Bt2020;
    private static final Rgb Bt709;
    private static final ColorSpace CieLab;
    private static final ColorSpace CieXyz;
    private static final ColorSpace[] ColorSpacesArray;
    private static final Rgb DciP3;
    private static final Rgb DisplayP3;
    private static final Rgb ExtendedSrgb;
    public static final ColorSpaces INSTANCE;
    private static final Rgb LinearExtendedSrgb;
    private static final Rgb LinearSrgb;
    private static final TransferParameters NoneTransferParameters;
    private static final Rgb Ntsc1953;
    private static final float[] Ntsc1953Primaries;
    private static final ColorSpace Oklab;
    private static final Rgb ProPhotoRgb;
    private static final Rgb SmpteC;
    private static final Rgb Srgb;
    private static final float[] SrgbPrimaries;
    private static final TransferParameters SrgbTransferParameters;
    private static final Rgb Unspecified;

    static {
        ColorSpaces.INSTANCE = new ColorSpaces();
        float[] arr_f = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        ColorSpaces.SrgbPrimaries = arr_f;
        float[] arr_f1 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        ColorSpaces.Ntsc1953Primaries = arr_f1;
        TransferParameters transferParameters0 = new TransferParameters(2.4, 0.947867, 0.052133, 0.077399, 0.04045, 0.0, 0.0, 0x60, null);
        ColorSpaces.SrgbTransferParameters = transferParameters0;
        TransferParameters transferParameters1 = new TransferParameters(2.2, 0.947867, 0.052133, 0.077399, 0.04045, 0.0, 0.0, 0x60, null);
        ColorSpaces.NoneTransferParameters = transferParameters1;
        Rgb rgb0 = new Rgb("sRGB IEC61966-2.1", arr_f, Illuminant.INSTANCE.getD65(), transferParameters0, 0);
        ColorSpaces.Srgb = rgb0;
        Rgb rgb1 = new Rgb("sRGB IEC61966-2.1 (Linear)", arr_f, Illuminant.INSTANCE.getD65(), 1.0, 0.0f, 1.0f, 1);
        ColorSpaces.LinearSrgb = rgb1;
        Rgb rgb2 = new Rgb("scRGB-nl IEC 61966-2-2:2003", arr_f, Illuminant.INSTANCE.getD65(), null, ColorSpaces.ExtendedSrgb.1.INSTANCE, ColorSpaces.ExtendedSrgb.2.INSTANCE, -0.799f, 2.399f, transferParameters0, 2);
        ColorSpaces.ExtendedSrgb = rgb2;
        Rgb rgb3 = new Rgb("scRGB IEC 61966-2-2:2003", arr_f, Illuminant.INSTANCE.getD65(), 1.0, -0.5f, 7.499f, 3);
        ColorSpaces.LinearExtendedSrgb = rgb3;
        TransferParameters transferParameters2 = new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null);
        Rgb rgb4 = new Rgb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), transferParameters2, 4);
        ColorSpaces.Bt709 = rgb4;
        TransferParameters transferParameters3 = new TransferParameters(2.222222, 0.90967, 0.09033, 0.222222, 0.08145, 0.0, 0.0, 0x60, null);
        Rgb rgb5 = new Rgb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, Illuminant.INSTANCE.getD65(), transferParameters3, 5);
        ColorSpaces.Bt2020 = rgb5;
        WhitePoint whitePoint0 = new WhitePoint(0.314f, 0.351f);
        Rgb rgb6 = new Rgb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, whitePoint0, 2.6, 0.0f, 1.0f, 6);
        ColorSpaces.DciP3 = rgb6;
        Rgb rgb7 = new Rgb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), transferParameters0, 7);
        ColorSpaces.DisplayP3 = rgb7;
        Rgb rgb8 = new Rgb("NTSC (1953)", arr_f1, Illuminant.INSTANCE.getC(), new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null), 8);
        ColorSpaces.Ntsc1953 = rgb8;
        TransferParameters transferParameters4 = new TransferParameters(2.222222, 0.909918, 0.090082, 0.222222, 0.081, 0.0, 0.0, 0x60, null);
        Rgb rgb9 = new Rgb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, Illuminant.INSTANCE.getD65(), transferParameters4, 9);
        ColorSpaces.SmpteC = rgb9;
        Rgb rgb10 = new Rgb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, Illuminant.INSTANCE.getD65(), 2.2, 0.0f, 1.0f, 10);
        ColorSpaces.AdobeRgb = rgb10;
        TransferParameters transferParameters5 = new TransferParameters(1.8, 1.0, 0.0, 0.0625, 0.031248, 0.0, 0.0, 0x60, null);
        Rgb rgb11 = new Rgb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 0.0001f}, Illuminant.INSTANCE.getD50(), transferParameters5, 11);
        ColorSpaces.ProPhotoRgb = rgb11;
        Rgb rgb12 = new Rgb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 0.0001f, -0.077f}, Illuminant.INSTANCE.getD60(), 1.0, -65504.0f, 65504.0f, 12);
        ColorSpaces.Aces = rgb12;
        Rgb rgb13 = new Rgb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, Illuminant.INSTANCE.getD60(), 1.0, -65504.0f, 65504.0f, 13);
        ColorSpaces.Acescg = rgb13;
        Xyz xyz0 = new Xyz("Generic XYZ", 14);
        ColorSpaces.CieXyz = xyz0;
        Lab lab0 = new Lab("Generic L*a*b*", 15);
        ColorSpaces.CieLab = lab0;
        Rgb rgb14 = new Rgb("None", arr_f, Illuminant.INSTANCE.getD65(), transferParameters1, 16);
        ColorSpaces.Unspecified = rgb14;
        Oklab oklab0 = new Oklab("Oklab", 17);
        ColorSpaces.Oklab = oklab0;
        ColorSpaces.ColorSpacesArray = new ColorSpace[]{rgb0, rgb1, rgb2, rgb3, rgb4, rgb5, rgb6, rgb7, rgb8, rgb9, rgb10, rgb11, rgb12, rgb13, xyz0, lab0, rgb14, oklab0};
    }

    public final Rgb getAces() {
        return ColorSpaces.Aces;
    }

    public final Rgb getAcescg() {
        return ColorSpaces.Acescg;
    }

    public final Rgb getAdobeRgb() {
        return ColorSpaces.AdobeRgb;
    }

    public final Rgb getBt2020() {
        return ColorSpaces.Bt2020;
    }

    public final Rgb getBt709() {
        return ColorSpaces.Bt709;
    }

    public final ColorSpace getCieLab() {
        return ColorSpaces.CieLab;
    }

    public final ColorSpace getCieXyz() {
        return ColorSpaces.CieXyz;
    }

    public final ColorSpace getColorSpace$ui_graphics_release(int v) {
        return this.getColorSpacesArray$ui_graphics_release()[v];
    }

    public final ColorSpace[] getColorSpacesArray$ui_graphics_release() {
        return ColorSpaces.ColorSpacesArray;
    }

    public final Rgb getDciP3() {
        return ColorSpaces.DciP3;
    }

    public final Rgb getDisplayP3() {
        return ColorSpaces.DisplayP3;
    }

    public final Rgb getExtendedSrgb() {
        return ColorSpaces.ExtendedSrgb;
    }

    public final Rgb getLinearExtendedSrgb() {
        return ColorSpaces.LinearExtendedSrgb;
    }

    public final Rgb getLinearSrgb() {
        return ColorSpaces.LinearSrgb;
    }

    public final Rgb getNtsc1953() {
        return ColorSpaces.Ntsc1953;
    }

    public final float[] getNtsc1953Primaries$ui_graphics_release() {
        return ColorSpaces.Ntsc1953Primaries;
    }

    public final ColorSpace getOklab$ui_graphics_release() {
        return ColorSpaces.Oklab;
    }

    public final Rgb getProPhotoRgb() {
        return ColorSpaces.ProPhotoRgb;
    }

    public final Rgb getSmpteC() {
        return ColorSpaces.SmpteC;
    }

    public final Rgb getSrgb() {
        return ColorSpaces.Srgb;
    }

    public final float[] getSrgbPrimaries$ui_graphics_release() {
        return ColorSpaces.SrgbPrimaries;
    }

    public final TransferParameters getSrgbTransferParameters$ui_graphics_release() {
        return ColorSpaces.SrgbTransferParameters;
    }

    public final Rgb getUnspecified$ui_graphics_release() {
        return ColorSpaces.Unspecified;
    }

    public final ColorSpace match(float[] arr_f, TransferParameters transferParameters0) {
        Intrinsics.checkNotNullParameter(arr_f, "toXYZD50");
        Intrinsics.checkNotNullParameter(transferParameters0, "function");
        ColorSpace[] arr_colorSpace = ColorSpaces.ColorSpacesArray;
        int v = 0;
        while(v < arr_colorSpace.length) {
            ColorSpace colorSpace0 = arr_colorSpace[v];
            ++v;
            if(ColorModel.equals-impl0(colorSpace0.getModel-xdoWZVw(), 0x300000000L)) {
                Rgb rgb0 = (Rgb)ColorSpaceKt.adapt$default(colorSpace0, Illuminant.INSTANCE.getD50(), null, 2, null);
                if(ColorSpaceKt.compare(arr_f, rgb0.getTransform$ui_graphics_release()) && ColorSpaceKt.compare(transferParameters0, rgb0.getTransferParameters())) {
                    return colorSpace0;
                }
                if(false) {
                    break;
                }
            }
        }
        return null;
    }
}

