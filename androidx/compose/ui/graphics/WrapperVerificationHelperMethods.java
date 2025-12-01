package androidx.compose.ui.graphics;

import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001A\u00020\u00042\n\u0010\u0005\u001A\u00060\u0006j\u0002`\u00072\u0006\u0010\b\u001A\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000B\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\f"}, d2 = {"Landroidx/compose/ui/graphics/WrapperVerificationHelperMethods;", "", "()V", "setBlendMode", "", "paint", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "mode", "Landroidx/compose/ui/graphics/BlendMode;", "setBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class WrapperVerificationHelperMethods {
    public static final WrapperVerificationHelperMethods INSTANCE;

    static {
        WrapperVerificationHelperMethods.INSTANCE = new WrapperVerificationHelperMethods();
    }

    public final void setBlendMode-GB0RdKg(Paint paint0, int v) {
        Intrinsics.checkNotNullParameter(paint0, "paint");
        paint0.setBlendMode(AndroidBlendMode_androidKt.toAndroidBlendMode-s9anfk8(v));
    }
}

