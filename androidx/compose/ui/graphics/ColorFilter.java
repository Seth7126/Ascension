package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0013\b\u0000\u0012\n\u0010\u0002\u001A\u00060\u0003j\u0002`\u0004¢\u0006\u0002\u0010\u0005R\u0018\u0010\u0002\u001A\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter;", "", "nativeColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "(Landroid/graphics/ColorFilter;)V", "getNativeColorFilter$ui_graphics_release", "()Landroid/graphics/ColorFilter;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class ColorFilter {
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001D\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\b\u001A\u00020\u00042\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\'\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000F\u001A\u00020\n2\b\b\u0002\u0010\u0010\u001A\u00020\u0011H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ColorFilter$Companion;", "", "()V", "colorMatrix", "Landroidx/compose/ui/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/ColorMatrix;", "colorMatrix-jHG-Opc", "([F)Landroidx/compose/ui/graphics/ColorFilter;", "lighting", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "lighting--OWjLjI", "(JJ)Landroidx/compose/ui/graphics/ColorFilter;", "tint", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "tint-xETnrds", "(JI)Landroidx/compose/ui/graphics/ColorFilter;", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final ColorFilter colorMatrix-jHG-Opc(float[] arr_f) {
            Intrinsics.checkNotNullParameter(arr_f, "colorMatrix");
            return AndroidColorFilter_androidKt.actualColorMatrixColorFilter-jHG-Opc(arr_f);
        }

        public final ColorFilter lighting--OWjLjI(long v, long v1) {
            return AndroidColorFilter_androidKt.actualLightingColorFilter--OWjLjI(v, v1);
        }

        public final ColorFilter tint-xETnrds(long v, int v1) {
            return AndroidColorFilter_androidKt.actualTintColorFilter-xETnrds(v, v1);
        }

        public static ColorFilter tint-xETnrds$default(Companion colorFilter$Companion0, long v, int v1, int v2, Object object0) {
            if((v2 & 2) != 0) {
                v1 = 5;
            }
            return colorFilter$Companion0.tint-xETnrds(v, v1);
        }
    }

    public static final Companion Companion;
    private final android.graphics.ColorFilter nativeColorFilter;

    static {
        ColorFilter.Companion = new Companion(null);
    }

    public ColorFilter(android.graphics.ColorFilter colorFilter0) {
        Intrinsics.checkNotNullParameter(colorFilter0, "nativeColorFilter");
        super();
        this.nativeColorFilter = colorFilter0;
    }

    public final android.graphics.ColorFilter getNativeColorFilter$ui_graphics_release() {
        return this.nativeColorFilter;
    }
}

