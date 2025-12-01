package kotlin;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/DeprecationLevel;", "", "(Ljava/lang/String;I)V", "WARNING", "ERROR", "HIDDEN", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class DeprecationLevel extends Enum {
    private static final DeprecationLevel[] $VALUES;
    public static final enum DeprecationLevel ERROR;
    public static final enum DeprecationLevel HIDDEN;
    public static final enum DeprecationLevel WARNING;

    static {
        DeprecationLevel[] arr_deprecationLevel = new DeprecationLevel[3];
        DeprecationLevel.WARNING = new DeprecationLevel("WARNING", 0);
        arr_deprecationLevel[0] = DeprecationLevel.WARNING;
        DeprecationLevel.ERROR = new DeprecationLevel("ERROR", 1);
        arr_deprecationLevel[1] = DeprecationLevel.ERROR;
        DeprecationLevel.HIDDEN = new DeprecationLevel("HIDDEN", 2);
        arr_deprecationLevel[2] = DeprecationLevel.HIDDEN;
        DeprecationLevel.$VALUES = arr_deprecationLevel;
    }

    private DeprecationLevel(String s, int v) {
        super(s, v);
    }

    public static DeprecationLevel valueOf(String s) {
        return (DeprecationLevel)Enum.valueOf(DeprecationLevel.class, s);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[])DeprecationLevel.$VALUES.clone();
    }
}

