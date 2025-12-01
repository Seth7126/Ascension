package kotlin.reflect;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/reflect/KVisibility;", "", "(Ljava/lang/String;I)V", "PUBLIC", "PROTECTED", "INTERNAL", "PRIVATE", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class KVisibility extends Enum {
    private static final KVisibility[] $VALUES;
    public static final enum KVisibility INTERNAL;
    public static final enum KVisibility PRIVATE;
    public static final enum KVisibility PROTECTED;
    public static final enum KVisibility PUBLIC;

    static {
        KVisibility[] arr_kVisibility = new KVisibility[4];
        KVisibility.PUBLIC = new KVisibility("PUBLIC", 0);
        arr_kVisibility[0] = KVisibility.PUBLIC;
        KVisibility.PROTECTED = new KVisibility("PROTECTED", 1);
        arr_kVisibility[1] = KVisibility.PROTECTED;
        KVisibility.INTERNAL = new KVisibility("INTERNAL", 2);
        arr_kVisibility[2] = KVisibility.INTERNAL;
        KVisibility.PRIVATE = new KVisibility("PRIVATE", 3);
        arr_kVisibility[3] = KVisibility.PRIVATE;
        KVisibility.$VALUES = arr_kVisibility;
    }

    private KVisibility(String s, int v) {
        super(s, v);
    }

    public static KVisibility valueOf(String s) {
        return (KVisibility)Enum.valueOf(KVisibility.class, s);
    }

    public static KVisibility[] values() {
        return (KVisibility[])KVisibility.$VALUES.clone();
    }
}

