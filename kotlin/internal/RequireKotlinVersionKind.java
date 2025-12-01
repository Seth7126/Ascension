package kotlin.internal;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0081\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/internal/RequireKotlinVersionKind;", "", "(Ljava/lang/String;I)V", "LANGUAGE_VERSION", "COMPILER_VERSION", "API_VERSION", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class RequireKotlinVersionKind extends Enum {
    private static final RequireKotlinVersionKind[] $VALUES;
    public static final enum RequireKotlinVersionKind API_VERSION;
    public static final enum RequireKotlinVersionKind COMPILER_VERSION;
    public static final enum RequireKotlinVersionKind LANGUAGE_VERSION;

    static {
        RequireKotlinVersionKind[] arr_requireKotlinVersionKind = new RequireKotlinVersionKind[3];
        RequireKotlinVersionKind.LANGUAGE_VERSION = new RequireKotlinVersionKind("LANGUAGE_VERSION", 0);
        arr_requireKotlinVersionKind[0] = RequireKotlinVersionKind.LANGUAGE_VERSION;
        RequireKotlinVersionKind.COMPILER_VERSION = new RequireKotlinVersionKind("COMPILER_VERSION", 1);
        arr_requireKotlinVersionKind[1] = RequireKotlinVersionKind.COMPILER_VERSION;
        RequireKotlinVersionKind.API_VERSION = new RequireKotlinVersionKind("API_VERSION", 2);
        arr_requireKotlinVersionKind[2] = RequireKotlinVersionKind.API_VERSION;
        RequireKotlinVersionKind.$VALUES = arr_requireKotlinVersionKind;
    }

    private RequireKotlinVersionKind(String s, int v) {
        super(s, v);
    }

    public static RequireKotlinVersionKind valueOf(String s) {
        return (RequireKotlinVersionKind)Enum.valueOf(RequireKotlinVersionKind.class, s);
    }

    public static RequireKotlinVersionKind[] values() {
        return (RequireKotlinVersionKind[])RequireKotlinVersionKind.$VALUES.clone();
    }
}

