package kotlin.text;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\u0001\u0018\u0000 \u001B2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001BB\u000F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001A¨\u0006\u001C"}, d2 = {"Lkotlin/text/CharDirectionality;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class CharDirectionality extends Enum {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000E\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0005R\'\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001A\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lkotlin/text/CharDirectionality$Companion;", "", "()V", "directionalityMap", "", "", "Lkotlin/text/CharDirectionality;", "getDirectionalityMap", "()Ljava/util/Map;", "directionalityMap$delegate", "Lkotlin/Lazy;", "valueOf", "directionality", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        private final Map getDirectionalityMap() {
            return (Map)CharDirectionality.directionalityMap$delegate.getValue();
        }

        public final CharDirectionality valueOf(int v) {
            CharDirectionality charDirectionality0 = (CharDirectionality)this.getDirectionalityMap().get(v);
            if(charDirectionality0 == null) {
                throw new IllegalArgumentException("Directionality #" + v + " is not defined.");
            }
            return charDirectionality0;
        }
    }

    private static final CharDirectionality[] $VALUES;
    public static final enum CharDirectionality ARABIC_NUMBER;
    public static final enum CharDirectionality BOUNDARY_NEUTRAL;
    public static final enum CharDirectionality COMMON_NUMBER_SEPARATOR;
    public static final Companion Companion;
    public static final enum CharDirectionality EUROPEAN_NUMBER;
    public static final enum CharDirectionality EUROPEAN_NUMBER_SEPARATOR;
    public static final enum CharDirectionality EUROPEAN_NUMBER_TERMINATOR;
    public static final enum CharDirectionality LEFT_TO_RIGHT;
    public static final enum CharDirectionality LEFT_TO_RIGHT_EMBEDDING;
    public static final enum CharDirectionality LEFT_TO_RIGHT_OVERRIDE;
    public static final enum CharDirectionality NONSPACING_MARK;
    public static final enum CharDirectionality OTHER_NEUTRALS;
    public static final enum CharDirectionality PARAGRAPH_SEPARATOR;
    public static final enum CharDirectionality POP_DIRECTIONAL_FORMAT;
    public static final enum CharDirectionality RIGHT_TO_LEFT;
    public static final enum CharDirectionality RIGHT_TO_LEFT_ARABIC;
    public static final enum CharDirectionality RIGHT_TO_LEFT_EMBEDDING;
    public static final enum CharDirectionality RIGHT_TO_LEFT_OVERRIDE;
    public static final enum CharDirectionality SEGMENT_SEPARATOR;
    public static final enum CharDirectionality UNDEFINED;
    public static final enum CharDirectionality WHITESPACE;
    private static final Lazy directionalityMap$delegate;
    private final int value;

    static {
        CharDirectionality[] arr_charDirectionality = new CharDirectionality[20];
        CharDirectionality.UNDEFINED = new CharDirectionality("UNDEFINED", 0, -1);
        arr_charDirectionality[0] = CharDirectionality.UNDEFINED;
        CharDirectionality.LEFT_TO_RIGHT = new CharDirectionality("LEFT_TO_RIGHT", 1, 0);
        arr_charDirectionality[1] = CharDirectionality.LEFT_TO_RIGHT;
        CharDirectionality.RIGHT_TO_LEFT = new CharDirectionality("RIGHT_TO_LEFT", 2, 1);
        arr_charDirectionality[2] = CharDirectionality.RIGHT_TO_LEFT;
        CharDirectionality.RIGHT_TO_LEFT_ARABIC = new CharDirectionality("RIGHT_TO_LEFT_ARABIC", 3, 2);
        arr_charDirectionality[3] = CharDirectionality.RIGHT_TO_LEFT_ARABIC;
        CharDirectionality.EUROPEAN_NUMBER = new CharDirectionality("EUROPEAN_NUMBER", 4, 3);
        arr_charDirectionality[4] = CharDirectionality.EUROPEAN_NUMBER;
        CharDirectionality.EUROPEAN_NUMBER_SEPARATOR = new CharDirectionality("EUROPEAN_NUMBER_SEPARATOR", 5, 4);
        arr_charDirectionality[5] = CharDirectionality.EUROPEAN_NUMBER_SEPARATOR;
        CharDirectionality.EUROPEAN_NUMBER_TERMINATOR = new CharDirectionality("EUROPEAN_NUMBER_TERMINATOR", 6, 5);
        arr_charDirectionality[6] = CharDirectionality.EUROPEAN_NUMBER_TERMINATOR;
        CharDirectionality.ARABIC_NUMBER = new CharDirectionality("ARABIC_NUMBER", 7, 6);
        arr_charDirectionality[7] = CharDirectionality.ARABIC_NUMBER;
        CharDirectionality.COMMON_NUMBER_SEPARATOR = new CharDirectionality("COMMON_NUMBER_SEPARATOR", 8, 7);
        arr_charDirectionality[8] = CharDirectionality.COMMON_NUMBER_SEPARATOR;
        CharDirectionality.NONSPACING_MARK = new CharDirectionality("NONSPACING_MARK", 9, 8);
        arr_charDirectionality[9] = CharDirectionality.NONSPACING_MARK;
        CharDirectionality.BOUNDARY_NEUTRAL = new CharDirectionality("BOUNDARY_NEUTRAL", 10, 9);
        arr_charDirectionality[10] = CharDirectionality.BOUNDARY_NEUTRAL;
        CharDirectionality.PARAGRAPH_SEPARATOR = new CharDirectionality("PARAGRAPH_SEPARATOR", 11, 10);
        arr_charDirectionality[11] = CharDirectionality.PARAGRAPH_SEPARATOR;
        CharDirectionality.SEGMENT_SEPARATOR = new CharDirectionality("SEGMENT_SEPARATOR", 12, 11);
        arr_charDirectionality[12] = CharDirectionality.SEGMENT_SEPARATOR;
        CharDirectionality.WHITESPACE = new CharDirectionality("WHITESPACE", 13, 12);
        arr_charDirectionality[13] = CharDirectionality.WHITESPACE;
        CharDirectionality.OTHER_NEUTRALS = new CharDirectionality("OTHER_NEUTRALS", 14, 13);
        arr_charDirectionality[14] = CharDirectionality.OTHER_NEUTRALS;
        CharDirectionality.LEFT_TO_RIGHT_EMBEDDING = new CharDirectionality("LEFT_TO_RIGHT_EMBEDDING", 15, 14);
        arr_charDirectionality[15] = CharDirectionality.LEFT_TO_RIGHT_EMBEDDING;
        CharDirectionality.LEFT_TO_RIGHT_OVERRIDE = new CharDirectionality("LEFT_TO_RIGHT_OVERRIDE", 16, 15);
        arr_charDirectionality[16] = CharDirectionality.LEFT_TO_RIGHT_OVERRIDE;
        CharDirectionality.RIGHT_TO_LEFT_EMBEDDING = new CharDirectionality("RIGHT_TO_LEFT_EMBEDDING", 17, 16);
        arr_charDirectionality[17] = CharDirectionality.RIGHT_TO_LEFT_EMBEDDING;
        CharDirectionality.RIGHT_TO_LEFT_OVERRIDE = new CharDirectionality("RIGHT_TO_LEFT_OVERRIDE", 18, 17);
        arr_charDirectionality[18] = CharDirectionality.RIGHT_TO_LEFT_OVERRIDE;
        CharDirectionality.POP_DIRECTIONAL_FORMAT = new CharDirectionality("POP_DIRECTIONAL_FORMAT", 19, 18);
        arr_charDirectionality[19] = CharDirectionality.POP_DIRECTIONAL_FORMAT;
        CharDirectionality.$VALUES = arr_charDirectionality;
        CharDirectionality.Companion = new Companion(null);
        CharDirectionality.directionalityMap$delegate = LazyKt.lazy(CharDirectionality.Companion.directionalityMap.2.INSTANCE);
    }

    private CharDirectionality(String s, int v, int v1) {
        super(s, v);
        this.value = v1;
    }

    public final int getValue() {
        return this.value;
    }

    public static CharDirectionality valueOf(String s) {
        return (CharDirectionality)Enum.valueOf(CharDirectionality.class, s);
    }

    public static CharDirectionality[] values() {
        return (CharDirectionality[])CharDirectionality.$VALUES.clone();
    }
}

