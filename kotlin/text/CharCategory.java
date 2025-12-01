package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\f\n\u0002\b \b\u0086\u0001\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u000EH\u0086\u0002R\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\t\u0010\nj\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001Aj\u0002\b\u001Bj\u0002\b\u001Cj\u0002\b\u001Dj\u0002\b\u001Ej\u0002\b\u001Fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b\'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,¨\u0006."}, d2 = {"Lkotlin/text/CharCategory;", "", "value", "", "code", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getValue", "()I", "contains", "", "char", "", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class CharCategory extends Enum {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u00020\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/text/CharCategory$Companion;", "", "()V", "valueOf", "Lkotlin/text/CharCategory;", "category", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final CharCategory valueOf(int v) {
            if(v >= 0 && 16 >= v) {
                return CharCategory.values()[v];
            }
            if(18 > v || 30 < v) {
                throw new IllegalArgumentException("Category #" + v + " is not defined.");
            }
            return CharCategory.values()[v - 1];
        }
    }

    private static final CharCategory[] $VALUES;
    public static final enum CharCategory COMBINING_SPACING_MARK;
    public static final enum CharCategory CONNECTOR_PUNCTUATION;
    public static final enum CharCategory CONTROL;
    public static final enum CharCategory CURRENCY_SYMBOL;
    public static final Companion Companion;
    public static final enum CharCategory DASH_PUNCTUATION;
    public static final enum CharCategory DECIMAL_DIGIT_NUMBER;
    public static final enum CharCategory ENCLOSING_MARK;
    public static final enum CharCategory END_PUNCTUATION;
    public static final enum CharCategory FINAL_QUOTE_PUNCTUATION;
    public static final enum CharCategory FORMAT;
    public static final enum CharCategory INITIAL_QUOTE_PUNCTUATION;
    public static final enum CharCategory LETTER_NUMBER;
    public static final enum CharCategory LINE_SEPARATOR;
    public static final enum CharCategory LOWERCASE_LETTER;
    public static final enum CharCategory MATH_SYMBOL;
    public static final enum CharCategory MODIFIER_LETTER;
    public static final enum CharCategory MODIFIER_SYMBOL;
    public static final enum CharCategory NON_SPACING_MARK;
    public static final enum CharCategory OTHER_LETTER;
    public static final enum CharCategory OTHER_NUMBER;
    public static final enum CharCategory OTHER_PUNCTUATION;
    public static final enum CharCategory OTHER_SYMBOL;
    public static final enum CharCategory PARAGRAPH_SEPARATOR;
    public static final enum CharCategory PRIVATE_USE;
    public static final enum CharCategory SPACE_SEPARATOR;
    public static final enum CharCategory START_PUNCTUATION;
    public static final enum CharCategory SURROGATE;
    public static final enum CharCategory TITLECASE_LETTER;
    public static final enum CharCategory UNASSIGNED;
    public static final enum CharCategory UPPERCASE_LETTER;
    private final String code;
    private final int value;

    static {
        CharCategory[] arr_charCategory = new CharCategory[30];
        CharCategory.UNASSIGNED = new CharCategory("UNASSIGNED", 0, 0, "Cn");
        arr_charCategory[0] = CharCategory.UNASSIGNED;
        CharCategory.UPPERCASE_LETTER = new CharCategory("UPPERCASE_LETTER", 1, 1, "Lu");
        arr_charCategory[1] = CharCategory.UPPERCASE_LETTER;
        CharCategory.LOWERCASE_LETTER = new CharCategory("LOWERCASE_LETTER", 2, 2, "Ll");
        arr_charCategory[2] = CharCategory.LOWERCASE_LETTER;
        CharCategory.TITLECASE_LETTER = new CharCategory("TITLECASE_LETTER", 3, 3, "Lt");
        arr_charCategory[3] = CharCategory.TITLECASE_LETTER;
        CharCategory.MODIFIER_LETTER = new CharCategory("MODIFIER_LETTER", 4, 4, "Lm");
        arr_charCategory[4] = CharCategory.MODIFIER_LETTER;
        CharCategory.OTHER_LETTER = new CharCategory("OTHER_LETTER", 5, 5, "Lo");
        arr_charCategory[5] = CharCategory.OTHER_LETTER;
        CharCategory.NON_SPACING_MARK = new CharCategory("NON_SPACING_MARK", 6, 6, "Mn");
        arr_charCategory[6] = CharCategory.NON_SPACING_MARK;
        CharCategory.ENCLOSING_MARK = new CharCategory("ENCLOSING_MARK", 7, 7, "Me");
        arr_charCategory[7] = CharCategory.ENCLOSING_MARK;
        CharCategory.COMBINING_SPACING_MARK = new CharCategory("COMBINING_SPACING_MARK", 8, 8, "Mc");
        arr_charCategory[8] = CharCategory.COMBINING_SPACING_MARK;
        CharCategory.DECIMAL_DIGIT_NUMBER = new CharCategory("DECIMAL_DIGIT_NUMBER", 9, 9, "Nd");
        arr_charCategory[9] = CharCategory.DECIMAL_DIGIT_NUMBER;
        CharCategory.LETTER_NUMBER = new CharCategory("LETTER_NUMBER", 10, 10, "Nl");
        arr_charCategory[10] = CharCategory.LETTER_NUMBER;
        CharCategory.OTHER_NUMBER = new CharCategory("OTHER_NUMBER", 11, 11, "No");
        arr_charCategory[11] = CharCategory.OTHER_NUMBER;
        CharCategory.SPACE_SEPARATOR = new CharCategory("SPACE_SEPARATOR", 12, 12, "Zs");
        arr_charCategory[12] = CharCategory.SPACE_SEPARATOR;
        CharCategory.LINE_SEPARATOR = new CharCategory("LINE_SEPARATOR", 13, 13, "Zl");
        arr_charCategory[13] = CharCategory.LINE_SEPARATOR;
        CharCategory.PARAGRAPH_SEPARATOR = new CharCategory("PARAGRAPH_SEPARATOR", 14, 14, "Zp");
        arr_charCategory[14] = CharCategory.PARAGRAPH_SEPARATOR;
        CharCategory.CONTROL = new CharCategory("CONTROL", 15, 15, "Cc");
        arr_charCategory[15] = CharCategory.CONTROL;
        CharCategory.FORMAT = new CharCategory("FORMAT", 16, 16, "Cf");
        arr_charCategory[16] = CharCategory.FORMAT;
        CharCategory.PRIVATE_USE = new CharCategory("PRIVATE_USE", 17, 18, "Co");
        arr_charCategory[17] = CharCategory.PRIVATE_USE;
        CharCategory.SURROGATE = new CharCategory("SURROGATE", 18, 19, "Cs");
        arr_charCategory[18] = CharCategory.SURROGATE;
        CharCategory.DASH_PUNCTUATION = new CharCategory("DASH_PUNCTUATION", 19, 20, "Pd");
        arr_charCategory[19] = CharCategory.DASH_PUNCTUATION;
        CharCategory.START_PUNCTUATION = new CharCategory("START_PUNCTUATION", 20, 21, "Ps");
        arr_charCategory[20] = CharCategory.START_PUNCTUATION;
        CharCategory.END_PUNCTUATION = new CharCategory("END_PUNCTUATION", 21, 22, "Pe");
        arr_charCategory[21] = CharCategory.END_PUNCTUATION;
        CharCategory.CONNECTOR_PUNCTUATION = new CharCategory("CONNECTOR_PUNCTUATION", 22, 23, "Pc");
        arr_charCategory[22] = CharCategory.CONNECTOR_PUNCTUATION;
        CharCategory.OTHER_PUNCTUATION = new CharCategory("OTHER_PUNCTUATION", 23, 24, "Po");
        arr_charCategory[23] = CharCategory.OTHER_PUNCTUATION;
        CharCategory.MATH_SYMBOL = new CharCategory("MATH_SYMBOL", 24, 25, "Sm");
        arr_charCategory[24] = CharCategory.MATH_SYMBOL;
        CharCategory.CURRENCY_SYMBOL = new CharCategory("CURRENCY_SYMBOL", 25, 26, "Sc");
        arr_charCategory[25] = CharCategory.CURRENCY_SYMBOL;
        CharCategory.MODIFIER_SYMBOL = new CharCategory("MODIFIER_SYMBOL", 26, 27, "Sk");
        arr_charCategory[26] = CharCategory.MODIFIER_SYMBOL;
        CharCategory.OTHER_SYMBOL = new CharCategory("OTHER_SYMBOL", 27, 28, "So");
        arr_charCategory[27] = CharCategory.OTHER_SYMBOL;
        CharCategory.INITIAL_QUOTE_PUNCTUATION = new CharCategory("INITIAL_QUOTE_PUNCTUATION", 28, 29, "Pi");
        arr_charCategory[28] = CharCategory.INITIAL_QUOTE_PUNCTUATION;
        CharCategory.FINAL_QUOTE_PUNCTUATION = new CharCategory("FINAL_QUOTE_PUNCTUATION", 29, 30, "Pf");
        arr_charCategory[29] = CharCategory.FINAL_QUOTE_PUNCTUATION;
        CharCategory.$VALUES = arr_charCategory;
        CharCategory.Companion = new Companion(null);
    }

    private CharCategory(String s, int v, int v1, String s1) {
        super(s, v);
        this.value = v1;
        this.code = s1;
    }

    public final boolean contains(char c) {
        return Character.getType(c) == this.value;
    }

    public final String getCode() {
        return this.code;
    }

    public final int getValue() {
        return this.value;
    }

    public static CharCategory valueOf(String s) {
        return (CharCategory)Enum.valueOf(CharCategory.class, s);
    }

    public static CharCategory[] values() {
        return (CharCategory[])CharCategory.$VALUES.clone();
    }
}

