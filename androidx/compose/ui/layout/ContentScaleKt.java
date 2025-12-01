package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001A%\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001A%\u0010\u0007\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\u0006\u001A%\u0010\t\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u0006\u001A%\u0010\u000B\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0003H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\u0006\u0082\u0002\u000B\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001¨\u0006\r"}, d2 = {"computeFillHeight", "", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeFillHeight-iLBOSCw", "(JJ)F", "computeFillMaxDimension", "computeFillMaxDimension-iLBOSCw", "computeFillMinDimension", "computeFillMinDimension-iLBOSCw", "computeFillWidth", "computeFillWidth-iLBOSCw", "ui_release"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ContentScaleKt {
    private static final float computeFillHeight-iLBOSCw(long v, long v1) {
        return Size.getHeight-impl(v1) / Size.getHeight-impl(v);
    }

    private static final float computeFillMaxDimension-iLBOSCw(long v, long v1) {
        return Math.max(ContentScaleKt.computeFillWidth-iLBOSCw(v, v1), ContentScaleKt.computeFillHeight-iLBOSCw(v, v1));
    }

    private static final float computeFillMinDimension-iLBOSCw(long v, long v1) {
        return Math.min(ContentScaleKt.computeFillWidth-iLBOSCw(v, v1), ContentScaleKt.computeFillHeight-iLBOSCw(v, v1));
    }

    private static final float computeFillWidth-iLBOSCw(long v, long v1) {
        return Size.getWidth-impl(v1) / Size.getWidth-impl(v);
    }
}

