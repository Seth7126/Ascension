package kotlin.reflect;

import kotlin.Metadata;

@Metadata(k = 3, mv = {1, 5, 1})
public final class TypesJVMKt.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;
    public static final int[] $EnumSwitchMapping$1;

    static {
        int[] arr_v = new int[KVariance.values().length];
        TypesJVMKt.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[KVariance.IN.ordinal()] = 1;
        arr_v[KVariance.INVARIANT.ordinal()] = 2;
        arr_v[KVariance.OUT.ordinal()] = 3;
        int[] arr_v1 = new int[KVariance.values().length];
        TypesJVMKt.WhenMappings.$EnumSwitchMapping$1 = arr_v1;
        arr_v1[KVariance.INVARIANT.ordinal()] = 1;
        arr_v1[KVariance.IN.ordinal()] = 2;
        arr_v1[KVariance.OUT.ordinal()] = 3;
    }
}

