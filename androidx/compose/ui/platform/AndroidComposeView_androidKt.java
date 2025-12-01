package androidx.compose.ui.platform;

import android.content.res.Configuration;
import android.graphics.Rect;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A5\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00142\u0006\u0010\u0015\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0014H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001A\u0010\u0010\u0019\u001A\u00020\u000B2\u0006\u0010\u001A\u001A\u00020\u0014H\u0002\u001A!\u0010\u001B\u001A\u00020\u001C*\u00020\u00122\u0006\u0010\u001D\u001A\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001E\u0010\u001F\u001A!\u0010 \u001A\u00020\u001C*\u00020\u00122\u0006\u0010\u001D\u001A\u00020\u0012H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001F\u001A\f\u0010\"\u001A\u00020#*\u00020$H\u0002\"0\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006@\u0006X\u0087\u000E¢\u0006\u0014\n\u0000\u0012\u0004\b\u0004\u0010\u0005\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\"\u0018\u0010\n\u001A\u00020\u000B*\u00020\f8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\r\u0010\u000E\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006%"}, d2 = {"textInputServiceFactory", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "Landroidx/compose/ui/text/input/TextInputService;", "getTextInputServiceFactory$annotations", "()V", "getTextInputServiceFactory", "()Lkotlin/jvm/functions/Function1;", "setTextInputServiceFactory", "(Lkotlin/jvm/functions/Function1;)V", "localeLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroid/content/res/Configuration;", "getLocaleLayoutDirection", "(Landroid/content/res/Configuration;)Landroidx/compose/ui/unit/LayoutDirection;", "dot", "", "m1", "Landroidx/compose/ui/graphics/Matrix;", "row", "", "m2", "column", "dot-p89u6pk", "([FI[FI)F", "layoutDirectionFromInt", "layoutDirection", "invertTo", "", "other", "invertTo-JiSxe2E", "([F[F)V", "preTransform", "preTransform-JiSxe2E", "toRect", "Landroid/graphics/Rect;", "Landroidx/compose/ui/geometry/Rect;", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidComposeView_androidKt {
    private static Function1 textInputServiceFactory;

    static {
        AndroidComposeView_androidKt.textInputServiceFactory = AndroidComposeView_androidKt.textInputServiceFactory.1.INSTANCE;
    }

    private static final float dot-p89u6pk(float[] arr_f, int v, float[] arr_f1, int v1) {
        return arr_f[v * 4] * arr_f1[v1] + arr_f[v * 4 + 1] * arr_f1[v1 + 4] + arr_f[v * 4 + 2] * arr_f1[v1 + 8] + arr_f[v * 4 + 3] * arr_f1[v1 + 12];
    }

    public static final LayoutDirection getLocaleLayoutDirection(Configuration configuration0) {
        Intrinsics.checkNotNullParameter(configuration0, "<this>");
        return AndroidComposeView_androidKt.layoutDirectionFromInt(configuration0.getLayoutDirection());
    }

    public static final Function1 getTextInputServiceFactory() {
        return AndroidComposeView_androidKt.textInputServiceFactory;
    }

    @InternalComposeUiApi
    public static void getTextInputServiceFactory$annotations() {
    }

    private static final void invertTo-JiSxe2E(float[] arr_f, float[] arr_f1) {
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
        arr_f1[0] = (f5 * f27 - f6 * f26 + f7 * f25) * (1.0f / f28);
        arr_f1[1] = (-f1 * f27 + f2 * f26 - f3 * f25) * (1.0f / f28);
        arr_f1[2] = (f13 * f21 - f14 * f20 + f15 * f19) * (1.0f / f28);
        arr_f1[3] = (-f9 * f21 + f10 * f20 - f11 * f19) * (1.0f / f28);
        arr_f1[4] = (-f4 * f27 + f6 * f24 - f7 * f23) * (1.0f / f28);
        arr_f1[5] = (f27 * f - f2 * f24 + f3 * f23) * (1.0f / f28);
        arr_f1[6] = (-f12 * f21 + f14 * f18 - f15 * f17) * (1.0f / f28);
        arr_f1[7] = (f21 * f8 - f10 * f18 + f11 * f17) * (1.0f / f28);
        arr_f1[8] = (f4 * f26 - f5 * f24 + f7 * f22) * (1.0f / f28);
        arr_f1[9] = (-f * f26 + f24 * f1 - f3 * f22) * (1.0f / f28);
        arr_f1[10] = (f12 * f20 - f13 * f18 + f15 * f16) * (1.0f / f28);
        arr_f1[11] = (-f8 * f20 + f18 * f9 - f11 * f16) * (1.0f / f28);
        arr_f1[12] = (-f4 * f25 + f5 * f23 - f6 * f22) * (1.0f / f28);
        arr_f1[13] = (f * f25 - f1 * f23 + f2 * f22) * (1.0f / f28);
        arr_f1[14] = (-f12 * f19 + f13 * f17 - f14 * f16) * (1.0f / f28);
        arr_f1[15] = (f8 * f19 - f9 * f17 + f10 * f16) * (1.0f / f28);
    }

    private static final LayoutDirection layoutDirectionFromInt(int v) {
        switch(v) {
            case 0: {
                return LayoutDirection.Ltr;
            }
            case 1: {
                return LayoutDirection.Rtl;
            }
            default: {
                return LayoutDirection.Ltr;
            }
        }
    }

    private static final void preTransform-JiSxe2E(float[] arr_f, float[] arr_f1) {
        float f = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 0, arr_f, 0);
        float f1 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 0, arr_f, 1);
        float f2 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 0, arr_f, 2);
        float f3 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 0, arr_f, 3);
        float f4 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 1, arr_f, 0);
        float f5 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 1, arr_f, 1);
        float f6 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 1, arr_f, 2);
        float f7 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 1, arr_f, 3);
        float f8 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 2, arr_f, 0);
        float f9 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 2, arr_f, 1);
        float f10 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 2, arr_f, 2);
        float f11 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 2, arr_f, 3);
        float f12 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 3, arr_f, 0);
        float f13 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 3, arr_f, 1);
        float f14 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 3, arr_f, 2);
        float f15 = AndroidComposeView_androidKt.dot-p89u6pk(arr_f1, 3, arr_f, 3);
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

    public static final void setTextInputServiceFactory(Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        AndroidComposeView_androidKt.textInputServiceFactory = function10;
    }

    private static final Rect toRect(androidx.compose.ui.geometry.Rect rect0) {
        return new Rect(((int)rect0.getLeft()), ((int)rect0.getTop()), ((int)rect0.getRight()), ((int)rect0.getBottom()));
    }
}

