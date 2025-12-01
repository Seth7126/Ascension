package androidx.compose.ui.graphics;

import android.graphics.Bitmap;
import android.graphics.ColorSpace.Named;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap;", "", "()V", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class Api26Bitmap {
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u00062\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\rH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u0011\u0010\u0010\u001A\u00020\r*\u00020\u0004H\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0010\u001A\u00020\r*\u00020\u0012H\u0000¢\u0006\u0002\b\u0011J\u0011\u0010\u0013\u001A\u00020\u0012*\u00020\rH\u0000¢\u0006\u0002\b\u0014\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/graphics/Api26Bitmap$Companion;", "", "()V", "createBitmap", "Landroid/graphics/Bitmap;", "width", "", "height", "bitmapConfig", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "hasAlpha", "", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "createBitmap-x__-hDU$ui_graphics_release", "(IIIZLandroidx/compose/ui/graphics/colorspace/ColorSpace;)Landroid/graphics/Bitmap;", "composeColorSpace", "composeColorSpace$ui_graphics_release", "Landroid/graphics/ColorSpace;", "toFrameworkColorSpace", "toFrameworkColorSpace$ui_graphics_release", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final ColorSpace composeColorSpace$ui_graphics_release(Bitmap bitmap0) {
            Intrinsics.checkNotNullParameter(bitmap0, "<this>");
            android.graphics.ColorSpace colorSpace0 = bitmap0.getColorSpace();
            return colorSpace0 == null ? ColorSpaces.INSTANCE.getSrgb() : this.composeColorSpace$ui_graphics_release(colorSpace0);
        }

        public final ColorSpace composeColorSpace$ui_graphics_release(android.graphics.ColorSpace colorSpace0) {
            Intrinsics.checkNotNullParameter(colorSpace0, "<this>");
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.SRGB))) {
                return ColorSpaces.INSTANCE.getSrgb();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.ACES))) {
                return ColorSpaces.INSTANCE.getAces();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.ACESCG))) {
                return ColorSpaces.INSTANCE.getAcescg();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.ADOBE_RGB))) {
                return ColorSpaces.INSTANCE.getAdobeRgb();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.BT2020))) {
                return ColorSpaces.INSTANCE.getBt2020();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.BT709))) {
                return ColorSpaces.INSTANCE.getBt709();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_LAB))) {
                return ColorSpaces.INSTANCE.getCieLab();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.CIE_XYZ))) {
                return ColorSpaces.INSTANCE.getCieXyz();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.DCI_P3))) {
                return ColorSpaces.INSTANCE.getDciP3();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.DISPLAY_P3))) {
                return ColorSpaces.INSTANCE.getDisplayP3();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB))) {
                return ColorSpaces.INSTANCE.getExtendedSrgb();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB))) {
                return ColorSpaces.INSTANCE.getLinearExtendedSrgb();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.LINEAR_SRGB))) {
                return ColorSpaces.INSTANCE.getLinearSrgb();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.NTSC_1953))) {
                return ColorSpaces.INSTANCE.getNtsc1953();
            }
            if(Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB))) {
                return ColorSpaces.INSTANCE.getProPhotoRgb();
            }
            return Intrinsics.areEqual(colorSpace0, android.graphics.ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? ColorSpaces.INSTANCE.getSmpteC() : ColorSpaces.INSTANCE.getSrgb();
        }

        public final Bitmap createBitmap-x__-hDU$ui_graphics_release(int v, int v1, int v2, boolean z, ColorSpace colorSpace0) {
            Intrinsics.checkNotNullParameter(colorSpace0, "colorSpace");
            Bitmap bitmap0 = Bitmap.createBitmap(null, v, v1, AndroidImageBitmap_androidKt.toBitmapConfig-1JJdX4A(v2), z, this.toFrameworkColorSpace$ui_graphics_release(colorSpace0));
            Intrinsics.checkNotNullExpressionValue(bitmap0, "createBitmap(\n                null,\n                width,\n                height,\n                bitmapConfig.toBitmapConfig(),\n                hasAlpha,\n                colorSpace.toFrameworkColorSpace()\n            )");
            return bitmap0;
        }

        public final android.graphics.ColorSpace toFrameworkColorSpace$ui_graphics_release(ColorSpace colorSpace0) {
            ColorSpace.Named colorSpace$Named0;
            Intrinsics.checkNotNullParameter(colorSpace0, "<this>");
            if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getSrgb())) {
                colorSpace$Named0 = ColorSpace.Named.SRGB;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getAces())) {
                colorSpace$Named0 = ColorSpace.Named.ACES;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getAcescg())) {
                colorSpace$Named0 = ColorSpace.Named.ACESCG;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getAdobeRgb())) {
                colorSpace$Named0 = ColorSpace.Named.ADOBE_RGB;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getBt2020())) {
                colorSpace$Named0 = ColorSpace.Named.BT2020;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getBt709())) {
                colorSpace$Named0 = ColorSpace.Named.BT709;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getCieLab())) {
                colorSpace$Named0 = ColorSpace.Named.CIE_LAB;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getCieXyz())) {
                colorSpace$Named0 = ColorSpace.Named.CIE_XYZ;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getDciP3())) {
                colorSpace$Named0 = ColorSpace.Named.DCI_P3;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getDisplayP3())) {
                colorSpace$Named0 = ColorSpace.Named.DISPLAY_P3;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getExtendedSrgb())) {
                colorSpace$Named0 = ColorSpace.Named.EXTENDED_SRGB;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getLinearExtendedSrgb())) {
                colorSpace$Named0 = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getLinearSrgb())) {
                colorSpace$Named0 = ColorSpace.Named.LINEAR_SRGB;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getNtsc1953())) {
                colorSpace$Named0 = ColorSpace.Named.NTSC_1953;
            }
            else if(Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getProPhotoRgb())) {
                colorSpace$Named0 = ColorSpace.Named.PRO_PHOTO_RGB;
            }
            else {
                colorSpace$Named0 = Intrinsics.areEqual(colorSpace0, ColorSpaces.INSTANCE.getSmpteC()) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB;
            }
            android.graphics.ColorSpace colorSpace1 = android.graphics.ColorSpace.get(colorSpace$Named0);
            Intrinsics.checkNotNullExpressionValue(colorSpace1, "get(frameworkNamedSpace)");
            return colorSpace1;
        }
    }

    public static final Companion Companion;

    static {
        Api26Bitmap.Companion = new Companion(null);
    }
}

