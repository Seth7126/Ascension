package kotlin.annotation;

import kotlin.Metadata;

// 部分失败：枚举糖化
// 枚举按原样呈现，而不是糖化为Java 5枚举。
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000Bj\u0002\b\fj\u0002\b\rj\u0002\b\u000Ej\u0002\b\u000Fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lkotlin/annotation/AnnotationTarget;", "", "(Ljava/lang/String;I)V", "CLASS", "ANNOTATION_CLASS", "TYPE_PARAMETER", "PROPERTY", "FIELD", "LOCAL_VARIABLE", "VALUE_PARAMETER", "CONSTRUCTOR", "FUNCTION", "PROPERTY_GETTER", "PROPERTY_SETTER", "TYPE", "EXPRESSION", "FILE", "TYPEALIAS", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class AnnotationTarget extends Enum {
    private static final AnnotationTarget[] $VALUES;
    public static final enum AnnotationTarget ANNOTATION_CLASS;
    public static final enum AnnotationTarget CLASS;
    public static final enum AnnotationTarget CONSTRUCTOR;
    public static final enum AnnotationTarget EXPRESSION;
    public static final enum AnnotationTarget FIELD;
    public static final enum AnnotationTarget FILE;
    public static final enum AnnotationTarget FUNCTION;
    public static final enum AnnotationTarget LOCAL_VARIABLE;
    public static final enum AnnotationTarget PROPERTY;
    public static final enum AnnotationTarget PROPERTY_GETTER;
    public static final enum AnnotationTarget PROPERTY_SETTER;
    public static final enum AnnotationTarget TYPE;
    public static final enum AnnotationTarget TYPEALIAS;
    public static final enum AnnotationTarget TYPE_PARAMETER;
    public static final enum AnnotationTarget VALUE_PARAMETER;

    static {
        AnnotationTarget[] arr_annotationTarget = new AnnotationTarget[15];
        AnnotationTarget.CLASS = new AnnotationTarget("CLASS", 0);
        arr_annotationTarget[0] = AnnotationTarget.CLASS;
        AnnotationTarget.ANNOTATION_CLASS = new AnnotationTarget("ANNOTATION_CLASS", 1);
        arr_annotationTarget[1] = AnnotationTarget.ANNOTATION_CLASS;
        AnnotationTarget.TYPE_PARAMETER = new AnnotationTarget("TYPE_PARAMETER", 2);
        arr_annotationTarget[2] = AnnotationTarget.TYPE_PARAMETER;
        AnnotationTarget.PROPERTY = new AnnotationTarget("PROPERTY", 3);
        arr_annotationTarget[3] = AnnotationTarget.PROPERTY;
        AnnotationTarget.FIELD = new AnnotationTarget("FIELD", 4);
        arr_annotationTarget[4] = AnnotationTarget.FIELD;
        AnnotationTarget.LOCAL_VARIABLE = new AnnotationTarget("LOCAL_VARIABLE", 5);
        arr_annotationTarget[5] = AnnotationTarget.LOCAL_VARIABLE;
        AnnotationTarget.VALUE_PARAMETER = new AnnotationTarget("VALUE_PARAMETER", 6);
        arr_annotationTarget[6] = AnnotationTarget.VALUE_PARAMETER;
        AnnotationTarget.CONSTRUCTOR = new AnnotationTarget("CONSTRUCTOR", 7);
        arr_annotationTarget[7] = AnnotationTarget.CONSTRUCTOR;
        AnnotationTarget.FUNCTION = new AnnotationTarget("FUNCTION", 8);
        arr_annotationTarget[8] = AnnotationTarget.FUNCTION;
        AnnotationTarget.PROPERTY_GETTER = new AnnotationTarget("PROPERTY_GETTER", 9);
        arr_annotationTarget[9] = AnnotationTarget.PROPERTY_GETTER;
        AnnotationTarget.PROPERTY_SETTER = new AnnotationTarget("PROPERTY_SETTER", 10);
        arr_annotationTarget[10] = AnnotationTarget.PROPERTY_SETTER;
        AnnotationTarget.TYPE = new AnnotationTarget("TYPE", 11);
        arr_annotationTarget[11] = AnnotationTarget.TYPE;
        AnnotationTarget.EXPRESSION = new AnnotationTarget("EXPRESSION", 12);
        arr_annotationTarget[12] = AnnotationTarget.EXPRESSION;
        AnnotationTarget.FILE = new AnnotationTarget("FILE", 13);
        arr_annotationTarget[13] = AnnotationTarget.FILE;
        AnnotationTarget.TYPEALIAS = new AnnotationTarget("TYPEALIAS", 14);
        arr_annotationTarget[14] = AnnotationTarget.TYPEALIAS;
        AnnotationTarget.$VALUES = arr_annotationTarget;
    }

    private AnnotationTarget(String s, int v) {
        super(s, v);
    }

    public static AnnotationTarget valueOf(String s) {
        return (AnnotationTarget)Enum.valueOf(AnnotationTarget.class, s);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[])AnnotationTarget.$VALUES.clone();
    }
}

