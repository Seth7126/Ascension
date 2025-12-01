package kotlin.coroutines.intrinsics;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/coroutines/intrinsics/CoroutineSingletons;", "", "(Ljava/lang/String;I)V", "COROUTINE_SUSPENDED", "UNDECIDED", "RESUMED", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class CoroutineSingletons extends Enum {
    private static final CoroutineSingletons[] $VALUES;
    public static final enum CoroutineSingletons COROUTINE_SUSPENDED;
    public static final enum CoroutineSingletons RESUMED;
    public static final enum CoroutineSingletons UNDECIDED;

    static {
        CoroutineSingletons[] arr_coroutineSingletons = new CoroutineSingletons[3];
        CoroutineSingletons.COROUTINE_SUSPENDED = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
        arr_coroutineSingletons[0] = CoroutineSingletons.COROUTINE_SUSPENDED;
        CoroutineSingletons.UNDECIDED = new CoroutineSingletons("UNDECIDED", 1);
        arr_coroutineSingletons[1] = CoroutineSingletons.UNDECIDED;
        CoroutineSingletons.RESUMED = new CoroutineSingletons("RESUMED", 2);
        arr_coroutineSingletons[2] = CoroutineSingletons.RESUMED;
        CoroutineSingletons.$VALUES = arr_coroutineSingletons;
    }

    private CoroutineSingletons(String s, int v) {
        super(s, v);
    }

    public static CoroutineSingletons valueOf(String s) {
        return (CoroutineSingletons)Enum.valueOf(CoroutineSingletons.class, s);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[])CoroutineSingletons.$VALUES.clone();
    }
}

