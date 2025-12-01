package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001A(\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00012\n\u0010\u0003\u001A\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001A\u00060\u0004j\u0002`\u0005H\u0001\u001A(\u0010\u0000\u001A\u00020\u00072\u0006\u0010\u0002\u001A\u00020\u00072\n\u0010\u0003\u001A\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001A\u00060\u0004j\u0002`\u0005H\u0001\u001A(\u0010\b\u001A\u00020\u00072\u0006\u0010\u0002\u001A\u00020\u00072\n\u0010\u0003\u001A\u00060\u0004j\u0002`\u00052\n\u0010\u0006\u001A\u00060\u0004j\u0002`\u0005H\u0001*\u001E\b\u0007\u0010\t\"\u00020\u00042\u00020\u0004B\f\b\n\u0012\b\b\u000B\u0012\u0004\b\b(\fB\u0002\b\r¨\u0006\u000E"}, d2 = {"convertDurationUnit", "", "value", "sourceUnit", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "targetUnit", "", "convertDurationUnitOverflow", "DurationUnit", "Lkotlin/SinceKotlin;", "version", "1.3", "Lkotlin/time/ExperimentalTime;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitJvmKt {
    public static void DurationUnit$annotations() {
    }

    public static final double convertDurationUnit(double f, TimeUnit timeUnit0, TimeUnit timeUnit1) {
        Intrinsics.checkNotNullParameter(timeUnit0, "sourceUnit");
        Intrinsics.checkNotNullParameter(timeUnit1, "targetUnit");
        long v = timeUnit1.convert(1L, timeUnit0);
        return v <= 0L ? f / ((double)timeUnit0.convert(1L, timeUnit1)) : f * ((double)v);
    }

    public static final long convertDurationUnit(long v, TimeUnit timeUnit0, TimeUnit timeUnit1) {
        Intrinsics.checkNotNullParameter(timeUnit0, "sourceUnit");
        Intrinsics.checkNotNullParameter(timeUnit1, "targetUnit");
        return timeUnit1.convert(v, timeUnit0);
    }

    public static final long convertDurationUnitOverflow(long v, TimeUnit timeUnit0, TimeUnit timeUnit1) {
        Intrinsics.checkNotNullParameter(timeUnit0, "sourceUnit");
        Intrinsics.checkNotNullParameter(timeUnit1, "targetUnit");
        return timeUnit1.convert(v, timeUnit0);
    }
}

