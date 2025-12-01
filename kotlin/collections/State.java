package kotlin.collections;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/collections/State;", "", "(Ljava/lang/String;I)V", "Ready", "NotReady", "Done", "Failed", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
final class State extends Enum {
    private static final State[] $VALUES;
    public static final enum State Done;
    public static final enum State Failed;
    public static final enum State NotReady;
    public static final enum State Ready;

    static {
        State[] arr_state = new State[4];
        State.Ready = new State("Ready", 0);
        arr_state[0] = State.Ready;
        State.NotReady = new State("NotReady", 1);
        arr_state[1] = State.NotReady;
        State.Done = new State("Done", 2);
        arr_state[2] = State.Done;
        State.Failed = new State("Failed", 3);
        arr_state[3] = State.Failed;
        State.$VALUES = arr_state;
    }

    private State(String s, int v) {
        super(s, v);
    }

    public static State valueOf(String s) {
        return (State)Enum.valueOf(State.class, s);
    }

    public static State[] values() {
        return (State[])State.$VALUES.clone();
    }
}

