package androidx.compose.ui.graphics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001A%\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001A%\u0010\u0006\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0003\u001A\u00020\u0001H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\b"}, d2 = {"max", "Landroidx/compose/ui/graphics/Float16;", "x", "y", "max-AoSsdG0", "(SS)S", "min", "min-AoSsdG0", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class Float16Kt {
    public static final short max-AoSsdG0(short v, short v1) {
        if(!Float16.isNaN-impl(v) && !Float16.isNaN-impl(v1)) {
            return Float16.compareTo-41bOqos(v, v1) >= 0 ? v : v1;
        }
        return 0x7E00;
    }

    public static final short min-AoSsdG0(short v, short v1) {
        if(!Float16.isNaN-impl(v) && !Float16.isNaN-impl(v1)) {
            return Float16.compareTo-41bOqos(v, v1) <= 0 ? v : v1;
        }
        return 0x7E00;
    }
}

