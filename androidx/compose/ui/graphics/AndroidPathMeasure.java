package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000F\b\u0000\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u00062\u0006\u0010\r\u001A\u00020\u000E2\u0006\u0010\u000F\u001A\u00020\nH\u0016J\u001A\u0010\u0010\u001A\u00020\u00112\b\u0010\u0012\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\u0013\u001A\u00020\nH\u0016R\u000E\u0010\u0002\u001A\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001A\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0007\u0010\b¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/graphics/AndroidPathMeasure;", "Landroidx/compose/ui/graphics/PathMeasure;", "internalPathMeasure", "Landroid/graphics/PathMeasure;", "(Landroid/graphics/PathMeasure;)V", "length", "", "getLength", "()F", "getSegment", "", "startDistance", "stopDistance", "destination", "Landroidx/compose/ui/graphics/Path;", "startWithMoveTo", "setPath", "", "path", "forceClosed", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class AndroidPathMeasure implements PathMeasure {
    private final android.graphics.PathMeasure internalPathMeasure;

    public AndroidPathMeasure(android.graphics.PathMeasure pathMeasure0) {
        Intrinsics.checkNotNullParameter(pathMeasure0, "internalPathMeasure");
        super();
        this.internalPathMeasure = pathMeasure0;
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public float getLength() {
        return this.internalPathMeasure.getLength();
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public boolean getSegment(float f, float f1, Path path0, boolean z) {
        Intrinsics.checkNotNullParameter(path0, "destination");
        android.graphics.PathMeasure pathMeasure0 = this.internalPathMeasure;
        if(!(path0 instanceof AndroidPath)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return pathMeasure0.getSegment(f, f1, ((AndroidPath)path0).getInternalPath(), z);
    }

    @Override  // androidx.compose.ui.graphics.PathMeasure
    public void setPath(Path path0, boolean z) {
        android.graphics.Path path1;
        android.graphics.PathMeasure pathMeasure0 = this.internalPathMeasure;
        if(path0 == null) {
            path1 = null;
        }
        else if(path0 instanceof AndroidPath) {
            path1 = ((AndroidPath)path0).getInternalPath();
        }
        else {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        pathMeasure0.setPath(path1, z);
    }
}

