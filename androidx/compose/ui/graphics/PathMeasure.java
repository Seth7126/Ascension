package androidx.compose.ui.graphics;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\u0007H&J\u001A\u0010\r\u001A\u00020\u000E2\b\u0010\u000F\u001A\u0004\u0018\u00010\u000B2\u0006\u0010\u0010\u001A\u00020\u0007H&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/graphics/PathMeasure;", "", "length", "", "getLength", "()F", "getSegment", "", "startDistance", "stopDistance", "destination", "Landroidx/compose/ui/graphics/Path;", "startWithMoveTo", "setPath", "", "path", "forceClosed", "ui-graphics_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public interface PathMeasure {
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 0x30)
    public static final class DefaultImpls {
        public static boolean getSegment$default(PathMeasure pathMeasure0, float f, float f1, Path path0, boolean z, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSegment");
            }
            if((v & 8) != 0) {
                z = true;
            }
            return pathMeasure0.getSegment(f, f1, path0, z);
        }
    }

    float getLength();

    boolean getSegment(float arg1, float arg2, Path arg3, boolean arg4);

    void setPath(Path arg1, boolean arg2);
}

