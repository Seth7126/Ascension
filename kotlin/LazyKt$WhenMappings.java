package kotlin;

@Metadata(k = 3, mv = {1, 5, 1})
public final class LazyKt.WhenMappings {
    public static final int[] $EnumSwitchMapping$0;

    static {
        int[] arr_v = new int[LazyThreadSafetyMode.values().length];
        LazyKt.WhenMappings.$EnumSwitchMapping$0 = arr_v;
        arr_v[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        arr_v[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        arr_v[LazyThreadSafetyMode.NONE.ordinal()] = 3;
    }
}

