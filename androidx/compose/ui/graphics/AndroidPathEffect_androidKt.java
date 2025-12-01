package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect.Style;
import android.graphics.PathDashPathEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001A\u0018\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0001H\u0000\u001A\u0010\u0010\u0004\u001A\u00020\u00012\u0006\u0010\u0005\u001A\u00020\u0006H\u0000\u001A\u0018\u0010\u0007\u001A\u00020\u00012\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u0006H\u0000\u001A5\u0010\u000B\u001A\u00020\u00012\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\u00062\u0006\u0010\u000F\u001A\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001A\n\u0010\u0013\u001A\u00020\u0014*\u00020\u0001\u001A\u0019\u0010\u0015\u001A\u00020\u0016*\u00020\u0010H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001A\n\u0010\u0019\u001A\u00020\u0001*\u00020\u0014\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"actualChainPathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "outer", "inner", "actualCornerPathEffect", "radius", "", "actualDashPathEffect", "intervals", "", "phase", "actualStampedPathEffect", "shape", "Landroidx/compose/ui/graphics/Path;", "advance", "style", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", "actualStampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "asAndroidPathEffect", "Landroid/graphics/PathEffect;", "toAndroidPathDashPathEffectStyle", "Landroid/graphics/PathDashPathEffect$Style;", "toAndroidPathDashPathEffectStyle-oQv6xUo", "(I)Landroid/graphics/PathDashPathEffect$Style;", "toComposePathEffect", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidPathEffect_androidKt {
    public static final PathEffect actualChainPathEffect(PathEffect pathEffect0, PathEffect pathEffect1) {
        Intrinsics.checkNotNullParameter(pathEffect0, "outer");
        Intrinsics.checkNotNullParameter(pathEffect1, "inner");
        return new AndroidPathEffect(new ComposePathEffect(((AndroidPathEffect)pathEffect0).getNativePathEffect(), ((AndroidPathEffect)pathEffect1).getNativePathEffect()));
    }

    public static final PathEffect actualCornerPathEffect(float f) {
        return new AndroidPathEffect(new CornerPathEffect(f));
    }

    public static final PathEffect actualDashPathEffect(float[] arr_f, float f) {
        Intrinsics.checkNotNullParameter(arr_f, "intervals");
        return new AndroidPathEffect(new DashPathEffect(arr_f, f));
    }

    public static final PathEffect actualStampedPathEffect-7aD1DOk(Path path0, float f, float f1, int v) {
        Intrinsics.checkNotNullParameter(path0, "shape");
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath)path0).getInternalPath(), f, f1, AndroidPathEffect_androidKt.toAndroidPathDashPathEffectStyle-oQv6xUo(v)));
    }

    public static final android.graphics.PathEffect asAndroidPathEffect(PathEffect pathEffect0) {
        Intrinsics.checkNotNullParameter(pathEffect0, "<this>");
        return ((AndroidPathEffect)pathEffect0).getNativePathEffect();
    }

    // 去混淆评级： 低(33)
    public static final PathDashPathEffect.Style toAndroidPathDashPathEffectStyle-oQv6xUo(int v) {
        if(StampedPathEffectStyle.equals-impl0(v, 2)) {
            return PathDashPathEffect.Style.MORPH;
        }
        return StampedPathEffectStyle.equals-impl0(v, 1) ? PathDashPathEffect.Style.ROTATE : PathDashPathEffect.Style.TRANSLATE;
    }

    public static final PathEffect toComposePathEffect(android.graphics.PathEffect pathEffect0) {
        Intrinsics.checkNotNullParameter(pathEffect0, "<this>");
        return new AndroidPathEffect(pathEffect0);
    }
}

