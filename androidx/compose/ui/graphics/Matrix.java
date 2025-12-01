package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001D\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0087@\u0018\u0000 G2\u00020\u0001:\u0001GB\u0014\u0012\b\b\u0002\u0010\u0002\u001A\u00020\u0003\u00F8\u0001\u0000\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u0001H\u00D6\u0003\u00A2\u0006\u0004\b\u000B\u0010\fJ \u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0010H\u0086\n\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001A\u00020\u0010H\u00D6\u0001\u00A2\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001A\u00020\u0018\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u0015\u0010\u001B\u001A\u00020\u00182\u0006\u0010\u001C\u001A\u00020\u001D\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001B\u0010\u001B\u001A\u00020 2\u0006\u0010!\u001A\u00020 \u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b\"\u0010#J\u0015\u0010\u001B\u001A\u00020$2\u0006\u0010\u001C\u001A\u00020$\u00A2\u0006\u0004\b\u001E\u0010%J\r\u0010&\u001A\u00020\u0018\u00A2\u0006\u0004\b\'\u0010\u001AJ\u0015\u0010(\u001A\u00020\u00182\u0006\u0010)\u001A\u00020\u000E\u00A2\u0006\u0004\b*\u0010+J\u0015\u0010,\u001A\u00020\u00182\u0006\u0010)\u001A\u00020\u000E\u00A2\u0006\u0004\b-\u0010+J\u0015\u0010.\u001A\u00020\u00182\u0006\u0010)\u001A\u00020\u000E\u00A2\u0006\u0004\b/\u0010+J+\u00100\u001A\u00020\u00182\b\b\u0002\u00101\u001A\u00020\u000E2\b\b\u0002\u00102\u001A\u00020\u000E2\b\b\u0002\u00103\u001A\u00020\u000E\u00A2\u0006\u0004\b4\u00105J(\u00106\u001A\u00020\u00182\u0006\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u00107\u001A\u00020\u000EH\u0086\n\u00A2\u0006\u0004\b8\u00109J\u001B\u0010:\u001A\u00020\u00182\u0006\u0010;\u001A\u00020\u0000\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b<\u0010=J\u001E\u0010>\u001A\u00020\u00182\u0006\u0010?\u001A\u00020\u0000H\u0086\u0002\u00F8\u0001\u0000\u00F8\u0001\u0001\u00A2\u0006\u0004\b@\u0010=J\u000F\u0010A\u001A\u00020BH\u0016\u00A2\u0006\u0004\bC\u0010DJ+\u0010E\u001A\u00020\u00182\b\b\u0002\u00101\u001A\u00020\u000E2\b\b\u0002\u00102\u001A\u00020\u000E2\b\b\u0002\u00103\u001A\u00020\u000E\u00A2\u0006\u0004\bF\u00105R\u0011\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002\u00F8\u0001\u0000\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b\u00A1\u001E0\u0001\u00A8\u0006H"}, d2 = {"Landroidx/compose/ui/graphics/Matrix;", "", "values", "", "constructor-impl", "([F)[F", "getValues", "()[F", "equals", "", "other", "equals-impl", "([FLjava/lang/Object;)Z", "get", "", "row", "", "column", "get-impl", "([FII)F", "hashCode", "hashCode-impl", "([F)I", "invert", "", "invert-impl", "([F)V", "map", "rect", "Landroidx/compose/ui/geometry/MutableRect;", "map-impl", "([FLandroidx/compose/ui/geometry/MutableRect;)V", "Landroidx/compose/ui/geometry/Offset;", "point", "map-MK-Hz9U", "([FJ)J", "Landroidx/compose/ui/geometry/Rect;", "([FLandroidx/compose/ui/geometry/Rect;)Landroidx/compose/ui/geometry/Rect;", "reset", "reset-impl", "rotateX", "degrees", "rotateX-impl", "([FF)V", "rotateY", "rotateY-impl", "rotateZ", "rotateZ-impl", "scale", "x", "y", "z", "scale-impl", "([FFFF)V", "set", "v", "set-impl", "([FIIF)V", "setFrom", "matrix", "setFrom-58bKbWc", "([F[F)V", "timesAssign", "m", "timesAssign-58bKbWc", "toString", "", "toString-impl", "([F)Ljava/lang/String;", "translate", "translate-impl", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class Matrix {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000B\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000E\u0010\u0003\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0005\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0006\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u0007\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\b\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\t\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\n\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u000B\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\f\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\r\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000E\u0010\u000E\u001A\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/graphics/Matrix$Companion;", "", "()V", "Perspective0", "", "Perspective1", "Perspective2", "ScaleX", "ScaleY", "ScaleZ", "SkewX", "SkewY", "TranslateX", "TranslateY", "TranslateZ", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final Companion Companion = null;
    public static final int Perspective0 = 3;
    public static final int Perspective1 = 7;
    public static final int Perspective2 = 15;
    public static final int ScaleX = 0;
    public static final int ScaleY = 5;
    public static final int ScaleZ = 10;
    public static final int SkewX = 4;
    public static final int SkewY = 1;
    public static final int TranslateX = 12;
    public static final int TranslateY = 13;
    public static final int TranslateZ = 14;
    private final float[] values;

    static {
        Matrix.Companion = new Companion(null);
    }

    private Matrix(float[] arr_f) {
        this.values = arr_f;
    }

    public static final Matrix box-impl(float[] arr_f) {
        return new Matrix(arr_f);
    }

    public static float[] constructor-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "values");
        return arr_f;
    }

    public static float[] constructor-impl$default(float[] arr_f, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            arr_f = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return Matrix.constructor-impl(arr_f);
    }

    @Override
    public boolean equals(Object object0) {
        return Matrix.equals-impl(this.unbox-impl(), object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(float[] arr_f, Object object0) {
        return object0 instanceof Matrix ? Intrinsics.areEqual(arr_f, ((Matrix)object0).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(float[] arr_f, float[] arr_f1) {
        return Intrinsics.areEqual(arr_f, arr_f1);
    }

    public static final float get-impl(float[] arr_f, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        return arr_f[v * 4 + v1];
    }

    public final float[] getValues() {
        return this.unbox-impl();
    }

    @Override
    public int hashCode() {
        return Matrix.hashCode-impl(this.unbox-impl());
    }

    public static int hashCode-impl(float[] arr_f) {
        return Arrays.hashCode(arr_f);
    }

    public static final void invert-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        float f = arr_f[0];
        float f1 = arr_f[1];
        float f2 = arr_f[2];
        float f3 = arr_f[3];
        float f4 = arr_f[4];
        float f5 = arr_f[5];
        float f6 = arr_f[6];
        float f7 = arr_f[7];
        float f8 = arr_f[8];
        float f9 = arr_f[9];
        float f10 = arr_f[10];
        float f11 = arr_f[11];
        float f12 = arr_f[12];
        float f13 = arr_f[13];
        float f14 = arr_f[14];
        float f15 = arr_f[15];
        float f16 = f * f5 - f1 * f4;
        float f17 = f * f6 - f2 * f4;
        float f18 = f * f7 - f3 * f4;
        float f19 = f1 * f6 - f2 * f5;
        float f20 = f1 * f7 - f3 * f5;
        float f21 = f2 * f7 - f3 * f6;
        float f22 = f8 * f13 - f9 * f12;
        float f23 = f8 * f14 - f10 * f12;
        float f24 = f8 * f15 - f11 * f12;
        float f25 = f9 * f14 - f10 * f13;
        float f26 = f9 * f15 - f11 * f13;
        float f27 = f10 * f15 - f11 * f14;
        float f28 = f16 * f27 - f17 * f26 + f18 * f25 + f19 * f24 - f20 * f23 + f21 * f22;
        if(f28 == 0.0f) {
            return;
        }
        arr_f[0] = (f5 * f27 - f6 * f26 + f7 * f25) * (1.0f / f28);
        arr_f[1] = (-f1 * f27 + f2 * f26 - f3 * f25) * (1.0f / f28);
        arr_f[2] = (f13 * f21 - f14 * f20 + f15 * f19) * (1.0f / f28);
        arr_f[3] = (-f9 * f21 + f10 * f20 - f11 * f19) * (1.0f / f28);
        arr_f[4] = (-f4 * f27 + f6 * f24 - f7 * f23) * (1.0f / f28);
        arr_f[5] = (f27 * f - f2 * f24 + f3 * f23) * (1.0f / f28);
        arr_f[6] = (-f12 * f21 + f14 * f18 - f15 * f17) * (1.0f / f28);
        arr_f[7] = (f21 * f8 - f10 * f18 + f11 * f17) * (1.0f / f28);
        arr_f[8] = (f4 * f26 - f5 * f24 + f7 * f22) * (1.0f / f28);
        arr_f[9] = (-f * f26 + f24 * f1 - f3 * f22) * (1.0f / f28);
        arr_f[10] = (f12 * f20 - f13 * f18 + f15 * f16) * (1.0f / f28);
        arr_f[11] = (-f8 * f20 + f18 * f9 - f11 * f16) * (1.0f / f28);
        arr_f[12] = (-f4 * f25 + f5 * f23 - f6 * f22) * (1.0f / f28);
        arr_f[13] = (f * f25 - f1 * f23 + f2 * f22) * (1.0f / f28);
        arr_f[14] = (-f12 * f19 + f13 * f17 - f14 * f16) * (1.0f / f28);
        arr_f[15] = (f8 * f19 - f9 * f17 + f10 * f16) * (1.0f / f28);
    }

    public static final long map-MK-Hz9U(float[] arr_f, long v) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        float f = Offset.getX-impl(v);
        float f1 = Offset.getY-impl(v);
        float f2 = arr_f[3] * f + arr_f[7] * f1 + arr_f[15];
        float f3 = f2 == 0.0f ? 0.0f : 1.0f / f2;
        return OffsetKt.Offset((arr_f[0] * f + arr_f[4] * f1 + arr_f[12]) * f3, f3 * (arr_f[1] * f + arr_f[5] * f1 + arr_f[13]));
    }

    public static final Rect map-impl(float[] arr_f, Rect rect0) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        Intrinsics.checkNotNullParameter(rect0, "rect");
        long v = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getLeft(), rect0.getTop()));
        long v1 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getLeft(), rect0.getBottom()));
        long v2 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getRight(), rect0.getTop()));
        long v3 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(rect0.getRight(), rect0.getBottom()));
        return new Rect(Math.min(Math.min(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.min(Offset.getX-impl(v2), Offset.getX-impl(v3))), Math.min(Math.min(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.min(Offset.getY-impl(v2), Offset.getY-impl(v3))), Math.max(Math.max(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.max(Offset.getX-impl(v2), Offset.getX-impl(v3))), Math.max(Math.max(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.max(Offset.getY-impl(v2), Offset.getY-impl(v3))));
    }

    public static final void map-impl(float[] arr_f, MutableRect mutableRect0) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        Intrinsics.checkNotNullParameter(mutableRect0, "rect");
        long v = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getLeft(), mutableRect0.getTop()));
        long v1 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getLeft(), mutableRect0.getBottom()));
        long v2 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getRight(), mutableRect0.getTop()));
        long v3 = Matrix.map-MK-Hz9U(arr_f, OffsetKt.Offset(mutableRect0.getRight(), mutableRect0.getBottom()));
        mutableRect0.setLeft(Math.min(Math.min(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.min(Offset.getX-impl(v2), Offset.getX-impl(v3))));
        mutableRect0.setTop(Math.min(Math.min(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.min(Offset.getY-impl(v2), Offset.getY-impl(v3))));
        mutableRect0.setRight(Math.max(Math.max(Offset.getX-impl(v), Offset.getX-impl(v1)), Math.max(Offset.getX-impl(v2), Offset.getX-impl(v3))));
        mutableRect0.setBottom(Math.max(Math.max(Offset.getY-impl(v), Offset.getY-impl(v1)), Math.max(Offset.getY-impl(v2), Offset.getY-impl(v3))));
    }

    public static final void reset-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        for(int v = 0; true; ++v) {
            for(int v1 = 0; true; ++v1) {
                arr_f[v1 * 4 + v] = v == v1 ? 1.0f : 0.0f;
                if(v1 + 1 > 3) {
                    break;
                }
            }
            if(v + 1 > 3) {
                break;
            }
        }
    }

    public static final void rotateX-impl(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[1];
        float f5 = f4 * f2 - arr_f[2] * f3;
        float f6 = f4 * f3 + arr_f[2] * f2;
        float f7 = arr_f[5];
        float f8 = f7 * f2 - arr_f[6] * f3;
        float f9 = f7 * f3 + arr_f[6] * f2;
        float f10 = arr_f[9];
        float f11 = f10 * f2 - arr_f[10] * f3;
        float f12 = f10 * f3 + arr_f[10] * f2;
        float f13 = arr_f[13];
        float f14 = f13 * f2 - arr_f[14] * f3;
        float f15 = f13 * f3 + arr_f[14] * f2;
        arr_f[1] = f5;
        arr_f[2] = f6;
        arr_f[5] = f8;
        arr_f[6] = f9;
        arr_f[9] = f11;
        arr_f[10] = f12;
        arr_f[13] = f14;
        arr_f[14] = f15;
    }

    public static final void rotateY-impl(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[0];
        float f5 = f4 * f2 + arr_f[2] * f3;
        float f6 = -f4 * f3 + arr_f[2] * f2;
        float f7 = arr_f[4];
        float f8 = f7 * f2 + arr_f[6] * f3;
        float f9 = -f7 * f3 + arr_f[6] * f2;
        float f10 = arr_f[8];
        float f11 = f10 * f2 + arr_f[10] * f3;
        float f12 = -f10 * f3 + arr_f[10] * f2;
        float f13 = arr_f[12];
        float f14 = f13 * f2 + arr_f[14] * f3;
        float f15 = -f13 * f3 + arr_f[14] * f2;
        arr_f[0] = f5;
        arr_f[2] = f6;
        arr_f[4] = f8;
        arr_f[6] = f9;
        arr_f[8] = f11;
        arr_f[10] = f12;
        arr_f[12] = f14;
        arr_f[14] = f15;
    }

    public static final void rotateZ-impl(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        double f1 = ((double)f) * 3.141593 / 180.0;
        float f2 = (float)Math.cos(f1);
        float f3 = (float)Math.sin(f1);
        float f4 = arr_f[0];
        float f5 = f2 * f4 + f3 * arr_f[4];
        float f6 = f4 * -f3 + arr_f[4] * f2;
        float f7 = arr_f[1];
        float f8 = f2 * f7 + f3 * arr_f[5];
        float f9 = f7 * -f3 + arr_f[5] * f2;
        float f10 = arr_f[2];
        float f11 = f2 * f10 + f3 * arr_f[6];
        float f12 = f10 * -f3 + arr_f[6] * f2;
        float f13 = arr_f[3];
        float f14 = f2 * f13 + f3 * arr_f[7];
        float f15 = -f3 * f13 + f2 * arr_f[7];
        arr_f[0] = f5;
        arr_f[1] = f8;
        arr_f[2] = f11;
        arr_f[3] = f14;
        arr_f[4] = f6;
        arr_f[5] = f9;
        arr_f[6] = f12;
        arr_f[7] = f15;
    }

    public static final void scale-impl(float[] arr_f, float f, float f1, float f2) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        arr_f[0] *= f;
        arr_f[1] *= f;
        arr_f[2] *= f;
        arr_f[3] *= f;
        arr_f[4] *= f1;
        arr_f[5] *= f1;
        arr_f[6] *= f1;
        arr_f[7] *= f1;
        arr_f[8] *= f2;
        arr_f[9] *= f2;
        arr_f[10] *= f2;
        arr_f[11] *= f2;
    }

    public static void scale-impl$default(float[] arr_f, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = 1.0f;
        }
        if((v & 2) != 0) {
            f1 = 1.0f;
        }
        if((v & 4) != 0) {
            f2 = 1.0f;
        }
        Matrix.scale-impl(arr_f, f, f1, f2);
    }

    public static final void set-impl(float[] arr_f, int v, int v1, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        arr_f[v * 4 + v1] = f;
    }

    public static final void setFrom-58bKbWc(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        Intrinsics.checkNotNullParameter(arr_f1, "matrix");
        for(int v = 0; true; ++v) {
            arr_f[v] = arr_f1[v];
            if(v + 1 > 15) {
                break;
            }
        }
    }

    public static final void timesAssign-58bKbWc(float[] arr_f, float[] arr_f1) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        Intrinsics.checkNotNullParameter(arr_f1, "m");
        float f = MatrixKt.dot-p89u6pk(arr_f, 0, arr_f1, 0);
        float f1 = MatrixKt.dot-p89u6pk(arr_f, 0, arr_f1, 1);
        float f2 = MatrixKt.dot-p89u6pk(arr_f, 0, arr_f1, 2);
        float f3 = MatrixKt.dot-p89u6pk(arr_f, 0, arr_f1, 3);
        float f4 = MatrixKt.dot-p89u6pk(arr_f, 1, arr_f1, 0);
        float f5 = MatrixKt.dot-p89u6pk(arr_f, 1, arr_f1, 1);
        float f6 = MatrixKt.dot-p89u6pk(arr_f, 1, arr_f1, 2);
        float f7 = MatrixKt.dot-p89u6pk(arr_f, 1, arr_f1, 3);
        float f8 = MatrixKt.dot-p89u6pk(arr_f, 2, arr_f1, 0);
        float f9 = MatrixKt.dot-p89u6pk(arr_f, 2, arr_f1, 1);
        float f10 = MatrixKt.dot-p89u6pk(arr_f, 2, arr_f1, 2);
        float f11 = MatrixKt.dot-p89u6pk(arr_f, 2, arr_f1, 3);
        float f12 = MatrixKt.dot-p89u6pk(arr_f, 3, arr_f1, 0);
        float f13 = MatrixKt.dot-p89u6pk(arr_f, 3, arr_f1, 1);
        float f14 = MatrixKt.dot-p89u6pk(arr_f, 3, arr_f1, 2);
        float f15 = MatrixKt.dot-p89u6pk(arr_f, 3, arr_f1, 3);
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
    }

    @Override
    public String toString() {
        return Matrix.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(float[] arr_f) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        return StringsKt.trimIndent(("\n            |" + arr_f[0] + ' ' + arr_f[1] + ' ' + arr_f[2] + ' ' + arr_f[3] + "|\n            |" + arr_f[4] + ' ' + arr_f[5] + ' ' + arr_f[6] + ' ' + arr_f[7] + "|\n            |" + arr_f[8] + ' ' + arr_f[9] + ' ' + arr_f[10] + ' ' + arr_f[11] + "|\n            |" + arr_f[12] + ' ' + arr_f[13] + ' ' + arr_f[14] + ' ' + arr_f[15] + "|\n        "));
    }

    public static final void translate-impl(float[] arr_f, float f, float f1, float f2) {
        Intrinsics.checkNotNullParameter(arr_f, "arg0");
        float f3 = arr_f[0] * f + arr_f[4] * f1 + arr_f[8] * f2 + arr_f[12];
        float f4 = arr_f[1] * f + arr_f[5] * f1 + arr_f[9] * f2 + arr_f[13];
        float f5 = arr_f[2] * f + arr_f[6] * f1 + arr_f[10] * f2 + arr_f[14];
        float f6 = arr_f[3] * f + arr_f[7] * f1 + arr_f[11] * f2 + arr_f[15];
        arr_f[12] = f3;
        arr_f[13] = f4;
        arr_f[14] = f5;
        arr_f[15] = f6;
    }

    public static void translate-impl$default(float[] arr_f, float f, float f1, float f2, int v, Object object0) {
        if((v & 1) != 0) {
            f = 0.0f;
        }
        if((v & 2) != 0) {
            f1 = 0.0f;
        }
        if((v & 4) != 0) {
            f2 = 0.0f;
        }
        Matrix.translate-impl(arr_f, f, f1, f2);
    }

    public final float[] unbox-impl() {
        return this.values;
    }
}

