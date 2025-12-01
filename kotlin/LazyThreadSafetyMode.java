package kotlin;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", "NONE", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class LazyThreadSafetyMode extends Enum {
    private static final LazyThreadSafetyMode[] $VALUES;
    public static final enum LazyThreadSafetyMode NONE;
    public static final enum LazyThreadSafetyMode PUBLICATION;
    public static final enum LazyThreadSafetyMode SYNCHRONIZED;

    static {
        LazyThreadSafetyMode[] arr_lazyThreadSafetyMode = new LazyThreadSafetyMode[3];
        LazyThreadSafetyMode.SYNCHRONIZED = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
        arr_lazyThreadSafetyMode[0] = LazyThreadSafetyMode.SYNCHRONIZED;
        LazyThreadSafetyMode.PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1);
        arr_lazyThreadSafetyMode[1] = LazyThreadSafetyMode.PUBLICATION;
        LazyThreadSafetyMode.NONE = new LazyThreadSafetyMode("NONE", 2);
        arr_lazyThreadSafetyMode[2] = LazyThreadSafetyMode.NONE;
        LazyThreadSafetyMode.$VALUES = arr_lazyThreadSafetyMode;
    }

    private LazyThreadSafetyMode(String s, int v) {
        super(s, v);
    }

    public static LazyThreadSafetyMode valueOf(String s) {
        return (LazyThreadSafetyMode)Enum.valueOf(LazyThreadSafetyMode.class, s);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[])LazyThreadSafetyMode.$VALUES.clone();
    }
}

