package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0014\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001A\u0010\b\u001A\u00020\t2\b\u0010\n\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000E\u0010\u0005J\u000F\u0010\u000F\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig;", "", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
@JvmInline
public final class ImageBitmapConfig {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001C\u0010\u0003\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u0005\u0010\u0006R\u001C\u0010\b\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\t\u0010\u0006R\u001C\u0010\n\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000B\u0010\u0006R\u001C\u0010\f\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\r\u0010\u0006R\u001C\u0010\u000E\u001A\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001A\u0004\b\u000F\u0010\u0006\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/graphics/ImageBitmapConfig$Companion;", "", "()V", "Alpha8", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getAlpha8-_sVssgQ", "()I", "I", "Argb8888", "getArgb8888-_sVssgQ", "F16", "getF16-_sVssgQ", "Gpu", "getGpu-_sVssgQ", "Rgb565", "getRgb565-_sVssgQ", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        // 去混淆评级： 低(20)
        public final int getAlpha8-_sVssgQ() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getArgb8888-_sVssgQ() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getF16-_sVssgQ() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getGpu-_sVssgQ() [...] // 潜在的解密器

        // 去混淆评级： 低(20)
        public final int getRgb565-_sVssgQ() [...] // 潜在的解密器
    }

    private static final int Alpha8;
    private static final int Argb8888;
    public static final Companion Companion;
    private static final int F16;
    private static final int Gpu;
    private static final int Rgb565;
    private final int value;

    static {
        ImageBitmapConfig.Companion = new Companion(null);
        ImageBitmapConfig.Argb8888 = 0;
        ImageBitmapConfig.Alpha8 = 1;
        ImageBitmapConfig.Rgb565 = 2;
        ImageBitmapConfig.F16 = 3;
        ImageBitmapConfig.Gpu = 4;
    }

    private ImageBitmapConfig(int v) {
        this.value = v;
    }

    public static final int access$getAlpha8$cp() [...] // 潜在的解密器

    public static final int access$getArgb8888$cp() [...] // 潜在的解密器

    public static final int access$getF16$cp() [...] // 潜在的解密器

    public static final int access$getGpu$cp() [...] // 潜在的解密器

    public static final int access$getRgb565$cp() [...] // 潜在的解密器

    public static final ImageBitmapConfig box-impl(int v) {
        return new ImageBitmapConfig(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return ImageBitmapConfig.equals-impl(this.unbox-impl(), object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof ImageBitmapConfig ? v == ((ImageBitmapConfig)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public final int getValue() {
        return this.unbox-impl();
    }

    @Override
    public int hashCode() {
        return this.unbox-impl();
    }

    public static int hashCode-impl(int v) [...] // Inlined contents

    @Override
    public String toString() {
        return ImageBitmapConfig.toString-impl(this.unbox-impl());
    }

    public static String toString-impl(int v) {
        if(ImageBitmapConfig.equals-impl0(v, 0)) {
            return "Argb8888";
        }
        if(ImageBitmapConfig.equals-impl0(v, ImageBitmapConfig.Alpha8)) {
            return "Alpha8";
        }
        if(ImageBitmapConfig.equals-impl0(v, ImageBitmapConfig.Rgb565)) {
            return "Rgb565";
        }
        if(ImageBitmapConfig.equals-impl0(v, ImageBitmapConfig.F16)) {
            return "F16";
        }
        return ImageBitmapConfig.equals-impl0(v, ImageBitmapConfig.Gpu) ? "Gpu" : "Unknown";
    }

    public final int unbox-impl() {
        return this.value;
    }
}

