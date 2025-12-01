package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0082\b\u0018\u0000 !2\u00020\u0001:\u0001!B(\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007\u0012\u0006\u0010\b\u001A\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0019\u0010\u0011\u001A\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\rJ\t\u0010\u0013\u001A\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001A\u00020\u0007HÆ\u0003J\u0019\u0010\u0015\u001A\u00020\u0003HÆ\u0003ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\rJ>\u0010\u0017\u001A\u00020\u00002\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\u0003HÆ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001A\u001A\u00020\u001B2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001D\u001A\u00020\u001EHÖ\u0001J\t\u0010\u001F\u001A\u00020 HÖ\u0001R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\f\u0010\rR\u001C\u0010\b\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\u000E\u0010\rR\u001C\u0010\u0002\u001A\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u000F\u001A\u0004\b\u0010\u0010\r\u0082\u0002\u000F\n\u0002\b\u0019\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "", "pixelsPerSecond", "Landroidx/compose/ui/geometry/Offset;", "confidence", "", "durationMillis", "", "offset", "(JFJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getConfidence", "()F", "getDurationMillis", "()J", "getOffset-F1C5BW0", "J", "getPixelsPerSecond-F1C5BW0", "component1", "component1-F1C5BW0", "component2", "component3", "component4", "component4-F1C5BW0", "copy", "copy-PZAlG8E", "(JFJJ)Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
final class VelocityEstimate {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001A\u00020\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityEstimate$Companion;", "", "()V", "None", "Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "getNone", "()Landroidx/compose/ui/input/pointer/util/VelocityEstimate;", "ui_release"}, k = 1, mv = {1, 5, 1}, xi = 0x30)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final VelocityEstimate getNone() {
            return VelocityEstimate.None;
        }
    }

    public static final Companion Companion;
    private static final VelocityEstimate None;
    private final float confidence;
    private final long durationMillis;
    private final long offset;
    private final long pixelsPerSecond;

    static {
        VelocityEstimate.Companion = new Companion(null);
        VelocityEstimate.None = new VelocityEstimate(0L, 1.0f, 0L, 0L, null);
    }

    private VelocityEstimate(long v, float f, long v1, long v2) {
        this.pixelsPerSecond = v;
        this.confidence = f;
        this.durationMillis = v1;
        this.offset = v2;
    }

    public VelocityEstimate(long v, float f, long v1, long v2, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, f, v1, v2);
    }

    public final long component1-F1C5BW0() {
        return this.pixelsPerSecond;
    }

    public final float component2() {
        return this.confidence;
    }

    public final long component3() {
        return this.durationMillis;
    }

    public final long component4-F1C5BW0() {
        return this.offset;
    }

    public final VelocityEstimate copy-PZAlG8E(long v, float f, long v1, long v2) {
        return new VelocityEstimate(v, f, v1, v2, null);
    }

    public static VelocityEstimate copy-PZAlG8E$default(VelocityEstimate velocityEstimate0, long v, float f, long v1, long v2, int v3, Object object0) {
        long v4 = (v3 & 1) == 0 ? v : velocityEstimate0.pixelsPerSecond;
        float f1 = (v3 & 2) == 0 ? f : velocityEstimate0.confidence;
        long v5 = (v3 & 4) == 0 ? v1 : velocityEstimate0.durationMillis;
        return (v3 & 8) == 0 ? velocityEstimate0.copy-PZAlG8E(v4, f1, v5, v2) : velocityEstimate0.copy-PZAlG8E(v4, f1, v5, velocityEstimate0.offset);
    }

    @Override
    public boolean equals(Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof VelocityEstimate)) {
            return false;
        }
        if(!Offset.equals-impl0(this.pixelsPerSecond, ((VelocityEstimate)object0).pixelsPerSecond)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.confidence, ((VelocityEstimate)object0).confidence)) {
            return false;
        }
        return this.durationMillis == ((VelocityEstimate)object0).durationMillis ? Offset.equals-impl0(this.offset, ((VelocityEstimate)object0).offset) : false;
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final long getDurationMillis() {
        return this.durationMillis;
    }

    public final long getOffset-F1C5BW0() {
        return this.offset;
    }

    public final long getPixelsPerSecond-F1C5BW0() {
        return this.pixelsPerSecond;
    }

    @Override
    public int hashCode() {
        return ((Offset.hashCode-impl(this.pixelsPerSecond) * 0x1F + Float.floatToIntBits(this.confidence)) * 0x1F + ((int)(this.durationMillis ^ this.durationMillis >>> 0x20))) * 0x1F + Offset.hashCode-impl(this.offset);
    }

    @Override
    public String toString() {
        return "VelocityEstimate(pixelsPerSecond=" + Offset.toString-impl(this.pixelsPerSecond) + ", confidence=" + this.confidence + ", durationMillis=" + this.durationMillis + ", offset=" + Offset.toString-impl(this.offset) + ')';
    }
}

