package kotlin.io;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/io/OnErrorAction;", "", "(Ljava/lang/String;I)V", "SKIP", "TERMINATE", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class OnErrorAction extends Enum {
    private static final OnErrorAction[] $VALUES;
    public static final enum OnErrorAction SKIP;
    public static final enum OnErrorAction TERMINATE;

    static {
        OnErrorAction[] arr_onErrorAction = new OnErrorAction[2];
        OnErrorAction.SKIP = new OnErrorAction("SKIP", 0);
        arr_onErrorAction[0] = OnErrorAction.SKIP;
        OnErrorAction.TERMINATE = new OnErrorAction("TERMINATE", 1);
        arr_onErrorAction[1] = OnErrorAction.TERMINATE;
        OnErrorAction.$VALUES = arr_onErrorAction;
    }

    private OnErrorAction(String s, int v) {
        super(s, v);
    }

    public static OnErrorAction valueOf(String s) {
        return (OnErrorAction)Enum.valueOf(OnErrorAction.class, s);
    }

    public static OnErrorAction[] values() {
        return (OnErrorAction[])OnErrorAction.$VALUES.clone();
    }
}

