package androidx.compose.ui.graphics;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u0014\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\b\u001A\u00020\t\u00A2\u0006\u0004\b\n\u0010\u000BJ\r\u0010\f\u001A\u00020\t\u00A2\u0006\u0004\b\r\u0010\u000BJ5\u0010\u000E\u001A\u00020\u000F2\u0006\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u0012H\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u001A\u0010\u0017\u001A\u00020\u00182\b\u0010\u0019\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u001A\u0010\u001BJ \u0010\u001C\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u0012H\u0086\n\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0010\u0010\u001F\u001A\u00020\u0012H\u00D6\u0001\u00A2\u0006\u0004\b \u0010!J\r\u0010\"\u001A\u00020\t\u00A2\u0006\u0004\b#\u0010\u000BJP\u0010$\u001A\u00020\t2\u0006\u0010%\u001A\u00020\u000F26\u0010&\u001A2\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(*\u0012\u0013\u0012\u00110\u000F\u00A2\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\t0\'H\u0082\b\u00A2\u0006\u0004\b,\u0010-J\u001B\u0010.\u001A\u00020\t2\u0006\u0010/\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b0\u00101J(\u0010.\u001A\u00020\t2\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0014\u001A\u00020\u00122\u0006\u00102\u001A\u00020\u000FH\u0086\n\u00A2\u0006\u0004\b3\u00104J\u0015\u00105\u001A\u00020\t2\u0006\u0010%\u001A\u00020\u000F\u00A2\u0006\u0004\b6\u00107J\u0015\u00108\u001A\u00020\t2\u0006\u0010%\u001A\u00020\u000F\u00A2\u0006\u0004\b9\u00107J\u0015\u0010:\u001A\u00020\t2\u0006\u0010%\u001A\u00020\u000F\u00A2\u0006\u0004\b;\u00107J\u0015\u0010<\u001A\u00020\t2\u0006\u0010=\u001A\u00020\u000F\u00A2\u0006\u0004\b>\u00107J-\u0010?\u001A\u00020\t2\u0006\u0010@\u001A\u00020\u000F2\u0006\u0010A\u001A\u00020\u000F2\u0006\u0010B\u001A\u00020\u000F2\u0006\u0010C\u001A\u00020\u000F\u00A2\u0006\u0004\bD\u0010EJ\u001E\u0010F\u001A\u00020\t2\u0006\u0010G\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\bH\u00101J\u0010\u0010I\u001A\u00020JH\u00D6\u0001\u00A2\u0006\u0004\bK\u0010LR\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u00F8\u0001\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006M"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "convertRgbToYuv", "", "convertRgbToYuv-impl", "([F)V", "convertYuvToRgb", "convertYuvToRgb-impl", "dot", "", "m1", "row", "", "m2", "column", "dot-Me4OoYI", "([F[FI[FI)F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "reset", "reset-impl", "rotateInternal", "degrees", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "cosine", "sine", "rotateInternal-impl", "([FFLkotlin/jvm/functions/Function2;)V", "set", "src", "set-jHG-Opc", "([F[F)V", "v", "set-impl", "([FIIF)V", "setToRotateBlue", "setToRotateBlue-impl", "([FF)V", "setToRotateGreen", "setToRotateGreen-impl", "setToRotateRed", "setToRotateRed-impl", "setToSaturation", "sat", "setToSaturation-impl", "setToScale", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "timesAssign", "colorMatrix", "timesAssign-jHG-Opc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class ColorMatrix {
    private final float[] values;

    private ColorMatrix(float[] arr_f) {
        this.values = arr_f;
    }

    public static final ColorMatrix box-impl(float[] arr_f) {
        return new ColorMatrix(arr_f);
    }

    public static float[] constructor-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "values");
        return arr_f;
    }

    public static float[] constructor-impl$default(float[] arr_f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            arr_f = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return ColorMatrix.constructor-impl(arr_f);
    }

    public static final void convertRgbToYuv-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ColorMatrix.reset-impl(arr_f);
        arr_f[0] = 0.299f;
        arr_f[1] = 0.587f;
        arr_f[2] = 0.114f;
        arr_f[5] = -0.16874f;
        arr_f[6] = -0.33126f;
        arr_f[7] = 0.5f;
        arr_f[10] = 0.5f;
        arr_f[11] = -0.41869f;
        arr_f[12] = -0.08131f;
    }

    public static final void convertYuvToRgb-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ColorMatrix.reset-impl(arr_f);
        arr_f[2] = 1.402f;
        arr_f[5] = 1.0f;
        arr_f[6] = -0.34414f;
        arr_f[7] = -0.71414f;
        arr_f[10] = 1.0f;
        arr_f[11] = 1.772f;
        arr_f[12] = 0.0f;
    }

    private static final float dot-Me4OoYI(float[] arr_f, float[] arr_f1, int v, float[] arr_f2, int v1) {
        return arr_f1[v * 5] * arr_f2[v1] + arr_f1[v * 5 + 1] * arr_f2[v1 + 5] + arr_f1[v * 5 + 2] * arr_f2[v1 + 10] + arr_f1[v * 5 + 3] * arr_f2[v1 + 15];
    }

    @Override
    public boolean equals(Object object0) {
        return ColorMatrix.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(float[] arr_f, Object object0) {
        return object0 instanceof ColorMatrix ? Intrinsics.areEqual(arr_f, ((ColorMatrix)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(float[] arr_f, float[] arr_f1) {
        return Intrinsics.areEqual(arr_f, arr_f1);
    }

    public static final float get-impl(float[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        return arr_f[v * 5 + v1];
    }

    public final float[] getValues() {
        return this.unbox-impl();
    }

    @Override
    public int hashCode() {
        return ColorMatrix.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(float[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    public static final void reset-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ArraysKt.fill$default(arr_f, 0.0f, 0, 0, 6, null);
        arr_f[0] = 1.0f;
        arr_f[12] = 1.0f;
        arr_f[6] = 1.0f;
        arr_f[18] = 1.0f;
    }

    private static final void rotateInternal-impl(float[] arr_f, float f, Function2 function20) {
        ColorMatrix.reset-impl(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        function20.invoke(((float)Math.cos(f1)), ((float)Math.sin(f1)));
    }

    public static final void set-impl(float[] arr_f, int v, int v1, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        arr_f[v * 5 + v1] = f;
    }

    public static final void set-jHG-Opc(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        Intrinsics.checkNotNullParameter(arr_f1, "src");
        ArraysKt.copyInto$default(arr_f1, arr_f, 0, 0, 0, 14, null);
    }

    public static final void setToRotateBlue-impl(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ColorMatrix.reset-impl(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[6] = f2;
        arr_f[0] = f2;
        arr_f[1] = f3;
        arr_f[5] = -f3;
    }

    public static final void setToRotateGreen-impl(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ColorMatrix.reset-impl(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[12] = f2;
        arr_f[0] = f2;
        arr_f[2] = -f3;
        arr_f[10] = f3;
    }

    public static final void setToRotateRed-impl(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ColorMatrix.reset-impl(arr_f);
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        arr_f[12] = f2;
        arr_f[6] = f2;
        arr_f[7] = f3;
        arr_f[11] = -f3;
    }

    public static final void setToSaturation-impl(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ColorMatrix.reset-impl(arr_f);
        float f1 = 0.213f * (1.0f - f);
        float f2 = 0.715f * (1.0f - f);
        float f3 = (1.0f - f) * 0.072f;
        arr_f[0] = f1 + f;
        arr_f[1] = f2;
        arr_f[2] = f3;
        arr_f[5] = f1;
        arr_f[6] = f2 + f;
        arr_f[7] = f3;
        arr_f[10] = f1;
        arr_f[11] = f2;
        arr_f[12] = f3 + f;
    }

    public static final void setToScale-impl(float[] arr_f, float f, float f1, float f2, float f3) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        ColorMatrix.reset-impl(arr_f);
        arr_f[0] = f;
        arr_f[6] = f1;
        arr_f[12] = f2;
        arr_f[18] = f3;
    }

    public static final void timesAssign-jHG-Opc(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        Intrinsics.checkNotNullParameter(arr_f1, "colorMatrix");
        float f = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 0, arr_f1, 0);
        float f1 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 0, arr_f1, 1);
        float f2 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 0, arr_f1, 2);
        float f3 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 0, arr_f1, 3);
        float f4 = arr_f[0] * arr_f1[4] + arr_f[1] * arr_f1[9] + arr_f[2] * arr_f1[14] + arr_f[3] * arr_f1[19] + arr_f[4];
        float f5 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 1, arr_f1, 0);
        float f6 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 1, arr_f1, 1);
        float f7 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 1, arr_f1, 2);
        float f8 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 1, arr_f1, 3);
        float f9 = arr_f[5] * arr_f1[4] + arr_f[6] * arr_f1[9] + arr_f[7] * arr_f1[14] + arr_f[8] * arr_f1[19] + arr_f[9];
        float f10 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 2, arr_f1, 0);
        float f11 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 2, arr_f1, 1);
        float f12 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 2, arr_f1, 2);
        float f13 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 2, arr_f1, 3);
        float f14 = arr_f[10] * arr_f1[4] + arr_f[11] * arr_f1[9] + arr_f[12] * arr_f1[14] + arr_f[13] * arr_f1[19] + arr_f[14];
        float f15 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 3, arr_f1, 0);
        float f16 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 3, arr_f1, 1);
        float f17 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 3, arr_f1, 2);
        float f18 = ColorMatrix.dot-Me4OoYI(arr_f, arr_f, 3, arr_f1, 3);
        float f19 = arr_f[15] * arr_f1[4] + arr_f[16] * arr_f1[9] + arr_f[17] * arr_f1[14] + arr_f[18] * arr_f1[19] + arr_f[19];
        arr_f[0] = f;
        arr_f[1] = f1;
        arr_f[2] = f2;
        arr_f[3] = f3;
        arr_f[4] = f4;
        arr_f[5] = f5;
        arr_f[6] = f6;
        arr_f[7] = f7;
        arr_f[8] = f8;
        arr_f[9] = f9;
        arr_f[10] = f10;
        arr_f[11] = f11;
        arr_f[12] = f12;
        arr_f[13] = f13;
        arr_f[14] = f14;
        arr_f[15] = f15;
        arr_f[16] = f16;
        arr_f[17] = f17;
        arr_f[18] = f18;
        arr_f[19] = f19;
    }

    @Override
    public String toString() {
        return ColorMatrix.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(float[] arr_f) {
        return "ColorMatrix(values=" + Arrays.toString(arr_f) + ')';
    }

    public final float[] unbox-impl() {
        return this.values;
    }
}

