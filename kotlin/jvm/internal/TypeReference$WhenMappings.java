package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.reflect.KVariance;

@Metadata(k = 3, mv = {1, 5, 1})
public final class TypeReference.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[KVariance.values().length];
        TypeReference.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[KVariance.INVARIANT.ordinal()] = 1;
        arr_v[KVariance.IN.ordinal()] = 2;
        arr_v[KVariance.OUT.ordinal()] = 3;
    }
}

