package kotlin.reflect;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 5, 1})
public final class KTypeProjection.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[KVariance.values().length];
        KTypeProjection.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[KVariance.INVARIANT.ordinal()] = 1;
        arr_v[KVariance.IN.ordinal()] = 2;
        arr_v[KVariance.OUT.ordinal()] = 3;
    }
}

