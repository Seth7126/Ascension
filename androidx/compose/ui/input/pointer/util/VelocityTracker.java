package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.VelocityKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J#\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000Eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0016\u0010\u0011\u001A\u00020\u0012ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001A\u00020\u0016H\u0002J\u0006\u0010\u0017\u001A\u00020\nR\u000E\u0010\u0003\u001A\u00020\u0004X\u0082\u000E¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "()V", "index", "", "samples", "", "Landroidx/compose/ui/input/pointer/util/PointAtTime;", "[Landroidx/compose/ui/input/pointer/util/PointAtTime;", "addPosition", "", "timeMillis", "", "position", "Landroidx/compose/ui/geometry/Offset;", "addPosition-Uv8p0NA", "(JJ)V", "calculateVelocity", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "getVelocityEstimate", "Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "resetTracking", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
public final class VelocityTracker {
    public static final int $stable = 8;
    private int index;
    private final PointAtTime[] samples;

    static {
    }

    public VelocityTracker() {
        PointAtTime[] arr_pointAtTime = new PointAtTime[20];
        for(int v = 0; v < 20; ++v) {
            arr_pointAtTime[v] = null;
        }
        this.samples = arr_pointAtTime;
    }

    public final void addPosition-Uv8p0NA(long v, long v1) {
        int v2 = (this.index + 1) % 20;
        this.index = v2;
        this.samples[v2] = new PointAtTime(v1, v, null);
    }

    public final long calculateVelocity-9UxMQ8M() {
        long v = this.getVelocityEstimate().getPixelsPerSecond-F1C5BW0();
        return VelocityKt.Velocity(Offset.getX-impl(v), Offset.getY-impl(v));
    }

    private final VelocityEstimate getVelocityEstimate() {
        List list0 = new ArrayList();
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        int v = this.index;
        PointAtTime pointAtTime0 = this.samples[v];
        if(pointAtTime0 == null) {
            return VelocityEstimate.Companion.getNone();
        }
        int v1 = 0;
        PointAtTime pointAtTime1 = pointAtTime0;
        PointAtTime pointAtTime2;
        while((pointAtTime2 = this.samples[v]) != null) {
            float f = (float)(pointAtTime0.getTime() - pointAtTime2.getTime());
            if(f > 100.0f || ((float)Math.abs(pointAtTime2.getTime() - pointAtTime1.getTime())) > 40.0f) {
                break;
            }
            long v2 = pointAtTime2.getPoint-F1C5BW0();
            list0.add(Offset.getX-impl(v2));
            list1.add(Offset.getY-impl(v2));
            list2.add(((float)(-f)));
            if(v == 0) {
                v = 20;
            }
            --v;
            ++v1;
            if(v1 >= 20) {
                pointAtTime1 = pointAtTime2;
                break;
            }
            pointAtTime1 = pointAtTime2;
        }
        if(v1 >= 3) {
            try {
                PolynomialFit polynomialFit0 = VelocityTrackerKt.polyFitLeastSquares(list2, list0, 2);
                PolynomialFit polynomialFit1 = VelocityTrackerKt.polyFitLeastSquares(list2, list1, 2);
                return new VelocityEstimate(OffsetKt.Offset(((Number)polynomialFit0.getCoefficients().get(1)).floatValue() * 1000.0f, ((Number)polynomialFit1.getCoefficients().get(1)).floatValue() * 1000.0f), polynomialFit0.getConfidence() * polynomialFit1.getConfidence(), pointAtTime0.getTime() - pointAtTime1.getTime(), Offset.minus-MK-Hz9U(pointAtTime0.getPoint-F1C5BW0(), pointAtTime1.getPoint-F1C5BW0()), null);
            }
            catch(IllegalArgumentException unused_ex) {
                return VelocityEstimate.Companion.getNone();
            }
        }
        return new VelocityEstimate(0L, 1.0f, pointAtTime0.getTime() - pointAtTime1.getTime(), Offset.minus-MK-Hz9U(pointAtTime0.getPoint-F1C5BW0(), pointAtTime1.getPoint-F1C5BW0()), null);
    }

    public final void resetTracking() {
        ArraysKt.fill$default(this.samples, null, 0, 0, 6, null);
    }
}

