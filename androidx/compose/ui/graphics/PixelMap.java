package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\u0007\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0005¢\u0006\u0002\u0010\tJ)\u0010\u0011\u001A\u00020\u00122\u0006\u0010\u0013\u001A\u00020\u00052\u0006\u0010\u0014\u001A\u00020\u0005H\u0086\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0007\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0011\u0010\b\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\rR\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0010\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001E0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/graphics/PixelMap;", "", "buffer", "", "width", "", "height", "bufferOffset", "stride", "([IIIII)V", "getBuffer", "()[I", "getBufferOffset", "()I", "getHeight", "getStride", "getWidth", "get", "Landroidx/compose/ui/graphics/Color;", "x", "y", "get-WaAFU9c", "(II)J", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class PixelMap {
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] arr_v, int v, int v1, int v2, int v3) {
        Intrinsics.checkNotNullParameter(arr_v, "buffer");
        super();
        this.buffer = arr_v;
        this.width = v;
        this.height = v1;
        this.bufferOffset = v2;
        this.stride = v3;
    }

    public final long get-WaAFU9c(int v, int v1) {
        return ColorKt.Color(this.buffer[this.bufferOffset + v1 * this.stride + v]);
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}

