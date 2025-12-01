package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001A\u0010\u0010\u0000\u001A\u00020\u0001*\u00060\u0002j\u0002`\u0003H\u0001¨\u0006\u0004"}, d2 = {"shortName", "", "Ljava/util/concurrent/TimeUnit;", "Lkotlin/time/DurationUnit;", "kotlin-stdlib"}, k = 5, mv = {1, 5, 1}, xi = 1, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends DurationUnitKt__DurationUnitJvmKt {
    public static final String shortName(TimeUnit timeUnit0) {
        Intrinsics.checkNotNullParameter(timeUnit0, "$this$shortName");
        switch(DurationUnitKt.WhenMappings.$EnumSwitchMapping$0[timeUnit0.ordinal()]) {
            case 1: {
                return "ns";
            }
            case 2: {
                return "us";
            }
            case 3: {
                return "ms";
            }
            case 4: {
                return "s";
            }
            case 5: {
                return "m";
            }
            case 6: {
                return "h";
            }
            case 7: {
                return "d";
            }
            default: {
                throw new IllegalStateException(("Unknown unit: " + timeUnit0).toString());
            }
        }
    }
}

