package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001A\u0006\u0010\u0000\u001A\u00020\u0001\u001A\r\u0010\u0002\u001A\u00020\u0003*\u00020\u0001H\u0086\b\u001A\n\u0010\u0004\u001A\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, d2 = {"Path", "Landroidx/compose/ui/graphics/Path;", "asAndroidPath", "Landroid/graphics/Path;", "asComposePath", "ui-graphics_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidPath_androidKt {
    public static final Path Path() {
        return new AndroidPath(null, 1, null);
    }

    public static final android.graphics.Path asAndroidPath(Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return ((AndroidPath)path0).getInternalPath();
    }

    public static final Path asComposePath(android.graphics.Path path0) {
        Intrinsics.checkNotNullParameter(path0, "<this>");
        return new AndroidPath(path0);
    }
}

