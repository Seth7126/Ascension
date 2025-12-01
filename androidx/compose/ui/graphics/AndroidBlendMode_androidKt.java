package androidx.compose.ui.graphics;

import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A\u0017\u0010\u0000\u001A\u00020\u0001*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001A\u0019\u0010\u0005\u001A\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u001A\u0019\u0010\t\u001A\u00020\n*\u00020\u0002H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidBlendMode_androidKt {
    // 去混淆评级： 低(30)
    public static final boolean isSupported-s9anfk8(int v) {
        return Build.VERSION.SDK_INT >= 29 || BlendMode.equals-impl0(v, 3) || AndroidBlendMode_androidKt.toPorterDuffMode-s9anfk8(v) != PorterDuff.Mode.SRC_OVER;
    }

    public static final android.graphics.BlendMode toAndroidBlendMode-s9anfk8(int v) {
        if(BlendMode.equals-impl0(v, 0)) {
            return android.graphics.BlendMode.CLEAR;
        }
        if(BlendMode.equals-impl0(v, 1)) {
            return android.graphics.BlendMode.SRC;
        }
        if(BlendMode.equals-impl0(v, 2)) {
            return android.graphics.BlendMode.DST;
        }
        if(BlendMode.equals-impl0(v, 3)) {
            return android.graphics.BlendMode.SRC_OVER;
        }
        if(BlendMode.equals-impl0(v, 4)) {
            return android.graphics.BlendMode.DST_OVER;
        }
        if(BlendMode.equals-impl0(v, 5)) {
            return android.graphics.BlendMode.SRC_IN;
        }
        if(BlendMode.equals-impl0(v, 6)) {
            return android.graphics.BlendMode.DST_IN;
        }
        if(BlendMode.equals-impl0(v, 7)) {
            return android.graphics.BlendMode.SRC_OUT;
        }
        if(BlendMode.equals-impl0(v, 8)) {
            return android.graphics.BlendMode.DST_OUT;
        }
        if(BlendMode.equals-impl0(v, 9)) {
            return android.graphics.BlendMode.SRC_ATOP;
        }
        if(BlendMode.equals-impl0(v, 10)) {
            return android.graphics.BlendMode.DST_ATOP;
        }
        if(BlendMode.equals-impl0(v, 11)) {
            return android.graphics.BlendMode.XOR;
        }
        if(BlendMode.equals-impl0(v, 12)) {
            return android.graphics.BlendMode.PLUS;
        }
        if(BlendMode.equals-impl0(v, 13)) {
            return android.graphics.BlendMode.MODULATE;
        }
        if(BlendMode.equals-impl0(v, 14)) {
            return android.graphics.BlendMode.SCREEN;
        }
        if(BlendMode.equals-impl0(v, 15)) {
            return android.graphics.BlendMode.OVERLAY;
        }
        if(BlendMode.equals-impl0(v, 16)) {
            return android.graphics.BlendMode.DARKEN;
        }
        if(BlendMode.equals-impl0(v, 17)) {
            return android.graphics.BlendMode.LIGHTEN;
        }
        if(BlendMode.equals-impl0(v, 18)) {
            return android.graphics.BlendMode.COLOR_DODGE;
        }
        if(BlendMode.equals-impl0(v, 19)) {
            return android.graphics.BlendMode.COLOR_BURN;
        }
        if(BlendMode.equals-impl0(v, 20)) {
            return android.graphics.BlendMode.HARD_LIGHT;
        }
        if(BlendMode.equals-impl0(v, 21)) {
            return android.graphics.BlendMode.SOFT_LIGHT;
        }
        if(BlendMode.equals-impl0(v, 22)) {
            return android.graphics.BlendMode.DIFFERENCE;
        }
        if(BlendMode.equals-impl0(v, 23)) {
            return android.graphics.BlendMode.EXCLUSION;
        }
        if(BlendMode.equals-impl0(v, 24)) {
            return android.graphics.BlendMode.MULTIPLY;
        }
        if(BlendMode.equals-impl0(v, 25)) {
            return android.graphics.BlendMode.HUE;
        }
        if(BlendMode.equals-impl0(v, 26)) {
            return android.graphics.BlendMode.SATURATION;
        }
        if(BlendMode.equals-impl0(v, 27)) {
            return android.graphics.BlendMode.COLOR;
        }
        return BlendMode.equals-impl0(v, 28) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final PorterDuff.Mode toPorterDuffMode-s9anfk8(int v) {
        if(BlendMode.equals-impl0(v, 0)) {
            return PorterDuff.Mode.CLEAR;
        }
        if(BlendMode.equals-impl0(v, 1)) {
            return PorterDuff.Mode.SRC;
        }
        if(BlendMode.equals-impl0(v, 2)) {
            return PorterDuff.Mode.DST;
        }
        if(BlendMode.equals-impl0(v, 3)) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if(BlendMode.equals-impl0(v, 4)) {
            return PorterDuff.Mode.DST_OVER;
        }
        if(BlendMode.equals-impl0(v, 5)) {
            return PorterDuff.Mode.SRC_IN;
        }
        if(BlendMode.equals-impl0(v, 6)) {
            return PorterDuff.Mode.DST_IN;
        }
        if(BlendMode.equals-impl0(v, 7)) {
            return PorterDuff.Mode.SRC_OUT;
        }
        if(BlendMode.equals-impl0(v, 8)) {
            return PorterDuff.Mode.DST_OUT;
        }
        if(BlendMode.equals-impl0(v, 9)) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        if(BlendMode.equals-impl0(v, 10)) {
            return PorterDuff.Mode.DST_ATOP;
        }
        if(BlendMode.equals-impl0(v, 11)) {
            return PorterDuff.Mode.XOR;
        }
        if(BlendMode.equals-impl0(v, 12)) {
            return PorterDuff.Mode.ADD;
        }
        if(BlendMode.equals-impl0(v, 14)) {
            return PorterDuff.Mode.SCREEN;
        }
        if(BlendMode.equals-impl0(v, 15)) {
            return PorterDuff.Mode.OVERLAY;
        }
        if(BlendMode.equals-impl0(v, 16)) {
            return PorterDuff.Mode.DARKEN;
        }
        if(BlendMode.equals-impl0(v, 17)) {
            return PorterDuff.Mode.LIGHTEN;
        }
        return BlendMode.equals-impl0(v, 13) ? PorterDuff.Mode.MULTIPLY : PorterDuff.Mode.SRC_OVER;
    }
}

