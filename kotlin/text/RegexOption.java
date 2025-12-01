package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001A\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0005\u001A\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001A\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lkotlin/text/RegexOption;", "", "Lkotlin/text/FlagEnum;", "value", "", "mask", "(Ljava/lang/String;III)V", "getMask", "()I", "getValue", "IGNORE_CASE", "MULTILINE", "LITERAL", "UNIX_LINES", "COMMENTS", "DOT_MATCHES_ALL", "CANON_EQ", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class RegexOption extends Enum implements FlagEnum {
    private static final RegexOption[] $VALUES;
    public static final enum RegexOption CANON_EQ;
    public static final enum RegexOption COMMENTS;
    public static final enum RegexOption DOT_MATCHES_ALL;
    public static final enum RegexOption IGNORE_CASE;
    public static final enum RegexOption LITERAL;
    public static final enum RegexOption MULTILINE;
    public static final enum RegexOption UNIX_LINES;
    private final int mask;
    private final int value;

    static {
        RegexOption[] arr_regexOption = new RegexOption[7];
        RegexOption.IGNORE_CASE = new RegexOption("IGNORE_CASE", 0, 2, 0, 2, null);
        arr_regexOption[0] = RegexOption.IGNORE_CASE;
        RegexOption.MULTILINE = new RegexOption("MULTILINE", 1, 8, 0, 2, null);
        arr_regexOption[1] = RegexOption.MULTILINE;
        RegexOption.LITERAL = new RegexOption("LITERAL", 2, 16, 0, 2, null);
        arr_regexOption[2] = RegexOption.LITERAL;
        RegexOption.UNIX_LINES = new RegexOption("UNIX_LINES", 3, 1, 0, 2, null);
        arr_regexOption[3] = RegexOption.UNIX_LINES;
        RegexOption.COMMENTS = new RegexOption("COMMENTS", 4, 4, 0, 2, null);
        arr_regexOption[4] = RegexOption.COMMENTS;
        RegexOption.DOT_MATCHES_ALL = new RegexOption("DOT_MATCHES_ALL", 5, 0x20, 0, 2, null);
        arr_regexOption[5] = RegexOption.DOT_MATCHES_ALL;
        RegexOption.CANON_EQ = new RegexOption("CANON_EQ", 6, 0x80, 0, 2, null);
        arr_regexOption[6] = RegexOption.CANON_EQ;
        RegexOption.$VALUES = arr_regexOption;
    }

    private RegexOption(String s, int v, int v1, int v2) {
        super(s, v);
        this.value = v1;
        this.mask = v2;
    }

    RegexOption(String s, int v, int v1, int v2, int v3, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v3 & 2) != 0) {
            v2 = v1;
        }
        this(s, v, v1, v2);
    }

    @Override  // kotlin.text.FlagEnum
    public int getMask() {
        return this.mask;
    }

    @Override  // kotlin.text.FlagEnum
    public int getValue() {
        return this.value;
    }

    public static RegexOption valueOf(String s) {
        return (RegexOption)Enum.valueOf(RegexOption.class, s);
    }

    public static RegexOption[] values() {
        return (RegexOption[])RegexOption.$VALUES.clone();
    }
}

