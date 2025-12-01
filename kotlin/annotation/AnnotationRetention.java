package kotlin.annotation;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/annotation/AnnotationRetention;", "", "(Ljava/lang/String;I)V", "SOURCE", "BINARY", "RUNTIME", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class AnnotationRetention extends Enum {
    private static final AnnotationRetention[] $VALUES;
    public static final enum AnnotationRetention BINARY;
    public static final enum AnnotationRetention RUNTIME;
    public static final enum AnnotationRetention SOURCE;

    static {
        AnnotationRetention[] arr_annotationRetention = new AnnotationRetention[3];
        AnnotationRetention.SOURCE = new AnnotationRetention("SOURCE", 0);
        arr_annotationRetention[0] = AnnotationRetention.SOURCE;
        AnnotationRetention.BINARY = new AnnotationRetention("BINARY", 1);
        arr_annotationRetention[1] = AnnotationRetention.BINARY;
        AnnotationRetention.RUNTIME = new AnnotationRetention("RUNTIME", 2);
        arr_annotationRetention[2] = AnnotationRetention.RUNTIME;
        AnnotationRetention.$VALUES = arr_annotationRetention;
    }

    private AnnotationRetention(String s, int v) {
        super(s, v);
    }

    public static AnnotationRetention valueOf(String s) {
        return (AnnotationRetention)Enum.valueOf(AnnotationRetention.class, s);
    }

    public static AnnotationRetention[] values() {
        return (AnnotationRetention[])AnnotationRetention.$VALUES.clone();
    }
}

