package androidx.compose.ui.graphics.colorspace;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000B\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0011\u0018\u0000 H2\u00020\u0001:\u0001HB?\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u00A2\u0006\u0002\u0010\nBW\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0002\u0010\u0011B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u00A2\u0006\u0002\u0010\u0014B\'\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u00A2\u0006\u0002\u0010\u0015B/\b\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u0012\u001A\u00020\u0013\u0012\u0006\u0010\u0016\u001A\u00020\u0017\u00A2\u0006\u0002\u0010\u0018B\u001F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0019\u001A\u00020\b\u00A2\u0006\u0002\u0010\u001AB\'\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u0019\u001A\u00020\b\u00A2\u0006\u0002\u0010\u001BB?\b\u0010\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\r\u0012\u0006\u0010\u0019\u001A\u00020\b\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0016\u001A\u00020\u0017\u00A2\u0006\u0002\u0010\u001CB\u001F\b\u0010\u0012\u0006\u0010\u001D\u001A\u00020\u0000\u0012\u0006\u0010\u001E\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\r\u00A2\u0006\u0002\u0010\u001FBs\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u000B\u001A\u00020\u0005\u0012\u0006\u0010\f\u001A\u00020\r\u0012\b\u0010\u001E\u001A\u0004\u0018\u00010\u0005\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000E\u001A\u00020\u000F\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\b\u0010 \u001A\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0016\u001A\u00020\u0017\u00A2\u0006\u0002\u0010!J\u0013\u00106\u001A\u00020*2\b\u00107\u001A\u0004\u0018\u000108H\u0096\u0002J\u001E\u00109\u001A\u00020\u00052\u0006\u0010:\u001A\u00020\u000F2\u0006\u0010;\u001A\u00020\u000F2\u0006\u0010<\u001A\u00020\u000FJ\u000E\u00109\u001A\u00020\u00052\u0006\u0010=\u001A\u00020\u0005J\u0010\u0010>\u001A\u00020\u00052\u0006\u0010=\u001A\u00020\u0005H\u0016J\u0006\u0010?\u001A\u00020\u0005J\u000E\u0010?\u001A\u00020\u00052\u0006\u0010&\u001A\u00020\u0005J\u0010\u0010@\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020\u0017H\u0016J\u0010\u0010B\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020\u0017H\u0016J\u0006\u0010C\u001A\u00020\u0005J\u000E\u0010C\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\u0005J\u0006\u0010D\u001A\u00020\u0005J\u000E\u0010D\u001A\u00020\u00052\u0006\u0010\u001E\u001A\u00020\u0005J\b\u0010E\u001A\u00020\u0017H\u0016J\u001E\u0010F\u001A\u00020\u00052\u0006\u0010:\u001A\u00020\u000F2\u0006\u0010;\u001A\u00020\u000F2\u0006\u0010<\u001A\u00020\u000FJ\u000E\u0010F\u001A\u00020\u00052\u0006\u0010=\u001A\u00020\u0005J\u0010\u0010G\u001A\u00020\u00052\u0006\u0010=\u001A\u00020\u0005H\u0016R\u001D\u0010\t\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b\"\u0010#R \u0010$\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b%\u0010#R\u0014\u0010&\u001A\u00020\u0005X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\'\u0010(R\u0014\u0010)\u001A\u00020*X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b)\u0010+R\u0014\u0010,\u001A\u00020*X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b,\u0010+R\u000E\u0010\u0010\u001A\u00020\u000FX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u000FX\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u001D\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u00A2\u0006\b\n\u0000\u001A\u0004\b-\u0010#R \u0010.\u001A\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b/\u0010#R\u0014\u0010\u000B\u001A\u00020\u0005X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b0\u0010(R\u0013\u0010 \u001A\u0004\u0018\u00010\u0013\u00A2\u0006\b\n\u0000\u001A\u0004\b1\u00102R\u0014\u0010\u001E\u001A\u00020\u0005X\u0080\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b3\u0010(R\u0011\u0010\f\u001A\u00020\r\u00A2\u0006\b\n\u0000\u001A\u0004\b4\u00105\u00A8\u0006I"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "name", "", "toXYZ", "", "oetf", "Lkotlin/Function1;", "", "eotf", "(Ljava/lang/String;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "primaries", "whitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "min", "", "max", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FF)V", "function", "Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;)V", "id", "", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;Landroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "gamma", "(Ljava/lang/String;[FD)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;D)V", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;DFFI)V", "colorSpace", "transform", "(Landroidx/compose/ui/graphics/colorspace/Rgb;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;)V", "transferParameters", "(Ljava/lang/String;[FLandroidx/compose/ui/graphics/colorspace/WhitePoint;[FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FFLandroidx/compose/ui/graphics/colorspace/TransferParameters;I)V", "getEotf", "()Lkotlin/jvm/functions/Function1;", "eotfOrig", "getEotfOrig$ui_graphics_release", "inverseTransform", "getInverseTransform$ui_graphics_release", "()[F", "isSrgb", "", "()Z", "isWideGamut", "getOetf", "oetfOrig", "getOetfOrig$ui_graphics_release", "getPrimaries$ui_graphics_release", "getTransferParameters", "()Landroidx/compose/ui/graphics/colorspace/TransferParameters;", "getTransform$ui_graphics_release", "getWhitePoint", "()Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "equals", "other", "", "fromLinear", "r", "g", "b", "v", "fromXyz", "getInverseTransform", "getMaxValue", "component", "getMinValue", "getPrimaries", "getTransform", "hashCode", "toLinear", "toXyz", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class Rgb extends ColorSpace {
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0002J8\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\u00052\u0012\u0010\r\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0015\u0010\u000F\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\tH\u0000¢\u0006\u0002\b\u0011J\u0010\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\tH\u0002J\u0018\u0010\u0014\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0015\u001A\u00020\u0013H\u0002J\u0018\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00020\t2\u0006\u0010\u0018\u001A\u00020\tH\u0002J(\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u001A\u001A\u00020\u00072\u0006\u0010\u001B\u001A\u00020\u00072\u0006\u0010\u001C\u001A\u00020\u00072\u0006\u0010\u001D\u001A\u00020\u0007H\u0002JX\u0010\u001E\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0015\u001A\u00020\u00132\u0012\u0010\u001F\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010 \u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001A\u00020\u00072\u0006\u0010\"\u001A\u00020\u00072\u0006\u0010#\u001A\u00020$H\u0002J \u0010%\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010!\u001A\u00020\u00072\u0006\u0010\"\u001A\u00020\u0007H\u0002J\u0010\u0010&\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\tH\u0002R\u001A\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\'"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Rgb$Companion;", "", "()V", "DoubleIdentity", "Lkotlin/Function1;", "", "area", "", "primaries", "", "compare", "", "point", "a", "b", "computePrimaries", "toXYZ", "computePrimaries$ui_graphics_release", "computeWhitePoint", "Landroidx/compose/ui/graphics/colorspace/WhitePoint;", "computeXYZMatrix", "whitePoint", "contains", "p1", "p2", "cross", "ax", "ay", "bx", "by", "isSrgb", "OETF", "EOTF", "min", "max", "id", "", "isWideGamut", "xyPrimaries", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final float area(float[] arr_f) [...] // 潜在的解密器

        private final boolean compare(double f, Function1 function10, Function1 function11) {
            return Math.abs(((Number)function10.invoke(f)).doubleValue() - ((Number)function11.invoke(f)).doubleValue()) <= 0.001;
        }

        public final float[] computePrimaries$ui_graphics_release(float[] arr_f) {
            Intrinsics.checkNotNullParameter(arr_f, "toXYZ");
            float[] arr_f1 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{1.0f, 0.0f, 0.0f});
            float[] arr_f2 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{0.0f, 1.0f, 0.0f});
            float[] arr_f3 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{0.0f, 0.0f, 1.0f});
            float f = arr_f1[0];
            float f1 = arr_f1[1];
            float f2 = f + f1 + arr_f1[2];
            float f3 = arr_f2[0] + arr_f2[1] + arr_f2[2];
            float f4 = arr_f3[0] + arr_f3[1] + arr_f3[2];
            return new float[]{f / f2, f1 / f2, arr_f2[0] / f3, arr_f2[1] / f3, arr_f3[0] / f4, arr_f3[1] / f4};
        }

        private final WhitePoint computeWhitePoint(float[] arr_f) {
            float[] arr_f1 = ColorSpaceKt.mul3x3Float3(arr_f, new float[]{1.0f, 1.0f, 1.0f});
            float f = arr_f1[0];
            float f1 = arr_f1[1];
            float f2 = f + f1 + arr_f1[2];
            return new WhitePoint(f / f2, f1 / f2);
        }

        private final float[] computeXYZMatrix(float[] arr_f, WhitePoint whitePoint0) {
            float f = arr_f[0];
            float f1 = arr_f[1];
            float f2 = arr_f[2];
            float f3 = arr_f[3];
            float f4 = arr_f[4];
            float f5 = arr_f[5];
            float f6 = whitePoint0.getX();
            float f7 = whitePoint0.getY();
            float f8 = (1.0f - f) / f1;
            float f9 = f / f1;
            float f10 = f2 / f3 - f9;
            float f11 = f6 / f7 - f9;
            float f12 = (1.0f - f2) / f3 - f8;
            float f13 = f4 / f5 - f9;
            float f14 = (((1.0f - f6) / f7 - f8) * f10 - f11 * f12) / (((1.0f - f4) / f5 - f8) * f10 - f12 * f13);
            float f15 = (f11 - f13 * f14) / f10;
            float f16 = 1.0f - f15 - f14;
            return new float[]{f16 / f1 * f, f16, f16 / f1 * (1.0f - f - f1), f15 / f3 * f2, f15, f15 / f3 * (1.0f - f2 - f3), f14 / f5 * f4, f14, f14 / f5 * (1.0f - f4 - f5)};
        }

        private final boolean contains(float[] arr_f, float[] arr_f1) {
            float f = arr_f[0] - arr_f1[0];
            float f1 = arr_f[1] - arr_f1[1];
            float f2 = arr_f[2] - arr_f1[2];
            float f3 = arr_f[3] - arr_f1[3];
            float f4 = arr_f[4] - arr_f1[4];
            float f5 = arr_f[5] - arr_f1[5];
            return this.cross(f, f1, arr_f1[0] - arr_f1[4], arr_f1[1] - arr_f1[5]) >= 0.0f && this.cross(arr_f1[0] - arr_f1[2], arr_f1[1] - arr_f1[3], f, f1) >= 0.0f && this.cross(f2, f3, arr_f1[2] - arr_f1[0], arr_f1[3] - arr_f1[1]) >= 0.0f && this.cross(arr_f1[2] - arr_f1[4], arr_f1[3] - arr_f1[5], f2, f3) >= 0.0f && this.cross(f4, f5, arr_f1[4] - arr_f1[2], arr_f1[5] - arr_f1[3]) >= 0.0f && this.cross(arr_f1[4] - arr_f1[0], arr_f1[5] - arr_f1[1], f4, f5) >= 0.0f;
        }

        private final float cross(float f, float f1, float f2, float f3) {
            return f * f3 - f1 * f2;
        }

        private final boolean isSrgb(float[] arr_f, WhitePoint whitePoint0, Function1 function10, Function1 function11, float f, float f1, int v) {
            if(v == 0) {
                return true;
            }
            if(!ColorSpaceKt.compare(arr_f, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release())) {
                return false;
            }
            if(!ColorSpaceKt.compare(whitePoint0, Illuminant.INSTANCE.getD65())) {
                return false;
            }
            if(f != 0.0f) {
                return false;
            }
            if(f1 != 1.0f) {
                return false;
            }
            Rgb rgb0 = ColorSpaces.INSTANCE.getSrgb();
            for(double f2 = 0.0; f2 <= 1.0; f2 += 0.003922) {
                if(!this.compare(f2, function10, rgb0.getOetfOrig$ui_graphics_release())) {
                    return false;
                }
                if(!this.compare(f2, function11, rgb0.getEotfOrig$ui_graphics_release())) {
                    return false;
                }
            }
            return true;
        }

        // 去混淆评级： 低(30)
        private final boolean isWideGamut(float[] arr_f, float f, float f1) {
            return this.area(arr_f) / 0.1582f > 0.9f && this.contains(arr_f, ColorSpaces.INSTANCE.getSrgbPrimaries$ui_graphics_release()) || f < 0.0f && f1 > 1.0f;
        }

        private final float[] xyPrimaries(float[] arr_f) {
            float[] arr_f1 = new float[6];
            if(arr_f.length == 9) {
                float f = arr_f[0];
                float f1 = arr_f[1];
                float f2 = f + f1 + arr_f[2];
                arr_f1[0] = f / f2;
                arr_f1[1] = f1 / f2;
                float f3 = arr_f[3];
                float f4 = arr_f[4];
                float f5 = f3 + f4 + arr_f[5];
                arr_f1[2] = f3 / f5;
                arr_f1[3] = f4 / f5;
                float f6 = arr_f[6];
                float f7 = arr_f[7];
                float f8 = f6 + f7 + arr_f[8];
                arr_f1[4] = f6 / f8;
                arr_f1[5] = f7 / f8;
                return arr_f1;
            }
            ArraysKt.copyInto$default(arr_f, arr_f1, 0, 0, 6, 6, null);
            return arr_f1;
        }
    }

    public static final Companion Companion;
    private static final Function1 DoubleIdentity;
    private final Function1 eotf;
    private final Function1 eotfOrig;
    private final float[] inverseTransform;
    private final boolean isSrgb;
    private final boolean isWideGamut;
    private final float max;
    private final float min;
    private final Function1 oetf;
    private final Function1 oetfOrig;
    private final float[] primaries;
    private final TransferParameters transferParameters;
    private final float[] transform;
    private final WhitePoint whitePoint;

    static {
        Rgb.Companion = new Companion(null);
        Rgb.DoubleIdentity = Rgb.Companion.DoubleIdentity.1.INSTANCE;
    }

    public Rgb(Rgb rgb0, float[] arr_f, WhitePoint whitePoint0) {
        Intrinsics.checkNotNullParameter(rgb0, "colorSpace");
        Intrinsics.checkNotNullParameter(arr_f, "transform");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        this(rgb0.getName(), rgb0.primaries, whitePoint0, arr_f, rgb0.oetfOrig, rgb0.eotfOrig, rgb0.min, rgb0.max, rgb0.transferParameters, -1);
    }

    public Rgb(String s, float[] arr_f, double f) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "toXYZ");
        this(s, Rgb.Companion.computePrimaries$ui_graphics_release(arr_f), Rgb.Companion.computeWhitePoint(arr_f), f, 0.0f, 1.0f, -1);
    }

    public Rgb(String s, float[] arr_f, TransferParameters transferParameters0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "toXYZ");
        Intrinsics.checkNotNullParameter(transferParameters0, "function");
        this(s, Rgb.Companion.computePrimaries$ui_graphics_release(arr_f), Rgb.Companion.computeWhitePoint(arr_f), transferParameters0, -1);
    }

    public Rgb(String s, float[] arr_f, WhitePoint whitePoint0, double f) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        this(s, arr_f, whitePoint0, f, 0.0f, 1.0f, -1);
    }

    public Rgb(String s, float[] arr_f, WhitePoint whitePoint0, double f, float f1, float f2, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        int v1 = Double.compare(f, 1.0);
        Function1 function10 = v1 == 0 ? Rgb.DoubleIdentity : new Function1() {
            final double $gamma;

            {
                this.$gamma = f;
                super(1);
            }

            public final double invoke(double f) {
                if(f < 0.0) {
                    f = 0.0;
                }
                return Math.pow(f, 1.0 / this.$gamma);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        };
        Function1 function11 = v1 == 0 ? Rgb.DoubleIdentity : new Function1() {
            final double $gamma;

            {
                this.$gamma = f;
                super(1);
            }

            public final double invoke(double f) {
                if(f < 0.0) {
                    f = 0.0;
                }
                return Math.pow(f, this.$gamma);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        };
        this(s, arr_f, whitePoint0, null, function10, function11, f1, f2, new TransferParameters(f, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0x60, null), v);
    }

    public Rgb(String s, float[] arr_f, WhitePoint whitePoint0, TransferParameters transferParameters0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        Intrinsics.checkNotNullParameter(transferParameters0, "function");
        this(s, arr_f, whitePoint0, transferParameters0, -1);
    }

    public Rgb(String s, float[] arr_f, WhitePoint whitePoint0, TransferParameters transferParameters0, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        Intrinsics.checkNotNullParameter(transferParameters0, "function");
        Function1 function10 = transferParameters0.getE() != 0.0 || transferParameters0.getF() != 0.0 ? new Function1() {
            final TransferParameters $function;

            {
                this.$function = transferParameters0;
                super(1);
            }

            public final double invoke(double f) {
                return ColorSpaceKt.rcpResponse(f, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getE(), this.$function.getF(), this.$function.getGamma());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        } : new Function1() {
            final TransferParameters $function;

            {
                this.$function = transferParameters0;
                super(1);
            }

            public final double invoke(double f) {
                return ColorSpaceKt.rcpResponse(f, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getGamma());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        };
        Function1 function11 = transferParameters0.getE() != 0.0 || transferParameters0.getF() != 0.0 ? new Function1() {
            final TransferParameters $function;

            {
                this.$function = transferParameters0;
                super(1);
            }

            public final double invoke(double f) {
                return ColorSpaceKt.response(f, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getE(), this.$function.getF(), this.$function.getGamma());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        } : new Function1() {
            final TransferParameters $function;

            {
                this.$function = transferParameters0;
                super(1);
            }

            public final double invoke(double f) {
                return ColorSpaceKt.response(f, this.$function.getA(), this.$function.getB(), this.$function.getC(), this.$function.getD(), this.$function.getGamma());
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        };
        this(s, arr_f, whitePoint0, null, function10, function11, 0.0f, 1.0f, transferParameters0, v);
    }

    public Rgb(String s, float[] arr_f, WhitePoint whitePoint0, Function1 function10, Function1 function11, float f, float f1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        Intrinsics.checkNotNullParameter(function10, "oetf");
        Intrinsics.checkNotNullParameter(function11, "eotf");
        this(s, arr_f, whitePoint0, null, function10, function11, f, f1, null, -1);
    }

    public Rgb(String s, float[] arr_f, WhitePoint whitePoint0, float[] arr_f1, Function1 function10, Function1 function11, float f, float f1, TransferParameters transferParameters0, int v) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "primaries");
        Intrinsics.checkNotNullParameter(whitePoint0, "whitePoint");
        Intrinsics.checkNotNullParameter(function10, "oetf");
        Intrinsics.checkNotNullParameter(function11, "eotf");
        super(s, 0x300000000L, v, null);
        this.whitePoint = whitePoint0;
        this.min = f;
        this.max = f1;
        this.transferParameters = transferParameters0;
        this.oetfOrig = function10;
        this.oetf = new Function1() {
            {
                Rgb.this = rgb0;
                super(1);
            }

            public final double invoke(double f) {
                return RangesKt.coerceIn(((Number)Rgb.this.getOetfOrig$ui_graphics_release().invoke(f)).doubleValue(), Rgb.this.min, Rgb.this.max);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        };
        this.eotfOrig = function11;
        this.eotf = new Function1() {
            {
                Rgb.this = rgb0;
                super(1);
            }

            public final double invoke(double f) {
                return ((Number)Rgb.this.getEotfOrig$ui_graphics_release().invoke(RangesKt.coerceIn(f, Rgb.this.min, Rgb.this.max))).doubleValue();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).doubleValue());
            }
        };
        if(arr_f.length != 6 && arr_f.length != 9) {
            throw new IllegalArgumentException("The color space\'s primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if(f >= f1) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f1 + "; min must be strictly < max");
        }
        Companion rgb$Companion0 = Rgb.Companion;
        float[] arr_f2 = rgb$Companion0.xyPrimaries(arr_f);
        this.primaries = arr_f2;
        if(arr_f1 == null) {
            this.transform = rgb$Companion0.computeXYZMatrix(arr_f2, whitePoint0);
        }
        else if(arr_f1.length == 9) {
            this.transform = arr_f1;
        }
        else {
            throw new IllegalArgumentException("Transform must have 9 entries! Has " + ((int)arr_f1.length));
        }
        this.inverseTransform = ColorSpaceKt.inverse3x3(this.transform);
        this.isWideGamut = rgb$Companion0.isWideGamut(arr_f2, f, f1);
        this.isSrgb = rgb$Companion0.isSrgb(arr_f2, whitePoint0, function10, function11, f, f1, v);
    }

    public Rgb(String s, float[] arr_f, Function1 function10, Function1 function11) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_f, "toXYZ");
        Intrinsics.checkNotNullParameter(function10, "oetf");
        Intrinsics.checkNotNullParameter(function11, "eotf");
        this(s, Rgb.Companion.computePrimaries$ui_graphics_release(arr_f), Rgb.Companion.computeWhitePoint(arr_f), null, function10, function11, 0.0f, 1.0f, null, -1);
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 == null || !Intrinsics.areEqual(Reflection.getOrCreateKotlinClass(this.getClass()), Reflection.getOrCreateKotlinClass(object0.getClass())) || !super.equals(object0)) {
            return false;
        }
        if(Float.compare(((Rgb)object0).min, this.min) != 0) {
            return false;
        }
        if(Float.compare(((Rgb)object0).max, this.max) != 0) {
            return false;
        }
        if(!Intrinsics.areEqual(this.whitePoint, ((Rgb)object0).whitePoint)) {
            return false;
        }
        if(!Arrays.equals(this.primaries, ((Rgb)object0).primaries)) {
            return false;
        }
        TransferParameters transferParameters0 = this.transferParameters;
        if(transferParameters0 != null) {
            return Intrinsics.areEqual(transferParameters0, ((Rgb)object0).transferParameters);
        }
        if(((Rgb)object0).transferParameters == null) {
            return true;
        }
        return Intrinsics.areEqual(this.oetfOrig, ((Rgb)object0).oetfOrig) ? Intrinsics.areEqual(this.eotfOrig, ((Rgb)object0).eotfOrig) : false;
    }

    public final float[] fromLinear(float f, float f1, float f2) {
        return this.fromLinear(new float[]{f, f1, f2});
    }

    public final float[] fromLinear(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        arr_f[0] = (float)((Number)this.oetf.invoke(((double)arr_f[0]))).doubleValue();
        arr_f[1] = (float)((Number)this.oetf.invoke(((double)arr_f[1]))).doubleValue();
        arr_f[2] = (float)((Number)this.oetf.invoke(((double)arr_f[2]))).doubleValue();
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        ColorSpaceKt.mul3x3Float3(this.inverseTransform, arr_f);
        arr_f[0] = (float)((Number)this.oetf.invoke(((double)arr_f[0]))).doubleValue();
        arr_f[1] = (float)((Number)this.oetf.invoke(((double)arr_f[1]))).doubleValue();
        arr_f[2] = (float)((Number)this.oetf.invoke(((double)arr_f[2]))).doubleValue();
        return arr_f;
    }

    public final Function1 getEotf() {
        return this.eotf;
    }

    public final Function1 getEotfOrig$ui_graphics_release() {
        return this.eotfOrig;
    }

    public final float[] getInverseTransform() {
        float[] arr_f = Arrays.copyOf(this.inverseTransform, this.inverseTransform.length);
        Intrinsics.checkNotNullExpressionValue(arr_f, "java.util.Arrays.copyOf(this, size)");
        return arr_f;
    }

    public final float[] getInverseTransform(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "inverseTransform");
        return ArraysKt.copyInto$default(this.inverseTransform, arr_f, 0, 0, 0, 14, null);
    }

    public final float[] getInverseTransform$ui_graphics_release() {
        return this.inverseTransform;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int v) {
        return this.max;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float getMinValue(int v) {
        return this.min;
    }

    public final Function1 getOetf() {
        return this.oetf;
    }

    public final Function1 getOetfOrig$ui_graphics_release() {
        return this.oetfOrig;
    }

    public final float[] getPrimaries() {
        float[] arr_f = Arrays.copyOf(this.primaries, this.primaries.length);
        Intrinsics.checkNotNullExpressionValue(arr_f, "java.util.Arrays.copyOf(this, size)");
        return arr_f;
    }

    public final float[] getPrimaries(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "primaries");
        return ArraysKt.copyInto$default(this.primaries, arr_f, 0, 0, 0, 14, null);
    }

    public final float[] getPrimaries$ui_graphics_release() {
        return this.primaries;
    }

    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    public final float[] getTransform() {
        float[] arr_f = Arrays.copyOf(this.transform, this.transform.length);
        Intrinsics.checkNotNullExpressionValue(arr_f, "java.util.Arrays.copyOf(this, size)");
        return arr_f;
    }

    public final float[] getTransform(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "transform");
        return ArraysKt.copyInto$default(this.transform, arr_f, 0, 0, 0, 14, null);
    }

    public final float[] getTransform$ui_graphics_release() {
        return this.transform;
    }

    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public int hashCode() {
        int v = super.hashCode();
        int v1 = this.whitePoint.hashCode();
        int v2 = Arrays.hashCode(this.primaries);
        int v3 = 0;
        int v4 = this.min == 0.0f ? 0 : Float.floatToIntBits(this.min);
        int v5 = this.max == 0.0f ? 0 : Float.floatToIntBits(this.max);
        TransferParameters transferParameters0 = this.transferParameters;
        if(transferParameters0 != null) {
            v3 = transferParameters0.hashCode();
        }
        int v6 = ((((v * 0x1F + v1) * 0x1F + v2) * 0x1F + v4) * 0x1F + v5) * 0x1F + v3;
        return this.transferParameters == null ? (v6 * 0x1F + this.oetfOrig.hashCode()) * 0x1F + this.eotfOrig.hashCode() : v6;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isSrgb() {
        return this.isSrgb;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return this.isWideGamut;
    }

    public final float[] toLinear(float f, float f1, float f2) {
        return this.toLinear(new float[]{f, f1, f2});
    }

    public final float[] toLinear(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        arr_f[0] = (float)((Number)this.eotf.invoke(((double)arr_f[0]))).doubleValue();
        arr_f[1] = (float)((Number)this.eotf.invoke(((double)arr_f[1]))).doubleValue();
        arr_f[2] = (float)((Number)this.eotf.invoke(((double)arr_f[2]))).doubleValue();
        return arr_f;
    }

    @Override  // androidx.compose.ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "v");
        arr_f[0] = (float)((Number)this.eotf.invoke(((double)arr_f[0]))).doubleValue();
        arr_f[1] = (float)((Number)this.eotf.invoke(((double)arr_f[1]))).doubleValue();
        arr_f[2] = (float)((Number)this.eotf.invoke(((double)arr_f[2]))).doubleValue();
        return ColorSpaceKt.mul3x3Float3(this.transform, arr_f);
    }
}

