package kotlin.contracts;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/contracts/InvocationKind;", "", "(Ljava/lang/String;I)V", "AT_MOST_ONCE", "AT_LEAST_ONCE", "EXACTLY_ONCE", "UNKNOWN", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class InvocationKind extends Enum {
    private static final InvocationKind[] $VALUES;
    public static final enum InvocationKind AT_LEAST_ONCE;
    public static final enum InvocationKind AT_MOST_ONCE;
    public static final enum InvocationKind EXACTLY_ONCE;
    public static final enum InvocationKind UNKNOWN;

    static {
        InvocationKind[] arr_invocationKind = new InvocationKind[4];
        InvocationKind.AT_MOST_ONCE = new InvocationKind("AT_MOST_ONCE", 0);
        arr_invocationKind[0] = InvocationKind.AT_MOST_ONCE;
        InvocationKind.AT_LEAST_ONCE = new InvocationKind("AT_LEAST_ONCE", 1);
        arr_invocationKind[1] = InvocationKind.AT_LEAST_ONCE;
        InvocationKind.EXACTLY_ONCE = new InvocationKind("EXACTLY_ONCE", 2);
        arr_invocationKind[2] = InvocationKind.EXACTLY_ONCE;
        InvocationKind.UNKNOWN = new InvocationKind("UNKNOWN", 3);
        arr_invocationKind[3] = InvocationKind.UNKNOWN;
        InvocationKind.$VALUES = arr_invocationKind;
    }

    private InvocationKind(String s, int v) {
        super(s, v);
    }

    public static InvocationKind valueOf(String s) {
        return (InvocationKind)Enum.valueOf(InvocationKind.class, s);
    }

    public static InvocationKind[] values() {
        return (InvocationKind[])InvocationKind.$VALUES.clone();
    }
}

