package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 5, 1})
public final class DurationUnitKt.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[TimeUnit.values().length];
        DurationUnitKt.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[TimeUnit.NANOSECONDS.ordinal()] = 1;
        arr_v[TimeUnit.MICROSECONDS.ordinal()] = 2;
        arr_v[TimeUnit.MILLISECONDS.ordinal()] = 3;
        arr_v[TimeUnit.SECONDS.ordinal()] = 4;
        arr_v[TimeUnit.MINUTES.ordinal()] = 5;
        arr_v[TimeUnit.HOURS.ordinal()] = 6;
        arr_v[TimeUnit.DAYS.ordinal()] = 7;
    }
}

