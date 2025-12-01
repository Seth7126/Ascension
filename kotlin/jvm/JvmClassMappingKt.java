package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000B\n\u0002\u0010\u000B\n\u0002\u0010\u0011\n\u0002\b\u0002\u001A\u001F\u0010\u0018\u001A\u00020\u0019\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\r*\u0006\u0012\u0002\b\u00030\u001A¢\u0006\u0002\u0010\u001B\"\'\u0010\u0000\u001A\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u0002H\u00028F¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005\"-\u0010\u0006\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00018G¢\u0006\f\u0012\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B\"&\u0010\f\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\u0002H\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\n\u0010\u000E\";\u0010\f\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018Ç\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\u000F\u0010\t\u001A\u0004\b\u0010\u0010\u000B\"+\u0010\u0011\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001A\u0004\b\u0012\u0010\u000B\"-\u0010\u0013\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0007\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00018F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u000B\"+\u0010\u0015\u001A\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\r*\b\u0012\u0004\u0012\u0002H\u00020\u00078G¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001C"}, d2 = {"annotationClass", "Lkotlin/reflect/KClass;", "T", "", "getAnnotationClass", "(Ljava/lang/annotation/Annotation;)Lkotlin/reflect/KClass;", "java", "Ljava/lang/Class;", "getJavaClass$annotations", "(Lkotlin/reflect/KClass;)V", "getJavaClass", "(Lkotlin/reflect/KClass;)Ljava/lang/Class;", "javaClass", "", "(Ljava/lang/Object;)Ljava/lang/Class;", "getRuntimeClassOfKClassInstance$annotations", "getRuntimeClassOfKClassInstance", "javaObjectType", "getJavaObjectType", "javaPrimitiveType", "getJavaPrimitiveType", "kotlin", "getKotlinClass", "(Ljava/lang/Class;)Lkotlin/reflect/KClass;", "isArrayOf", "", "", "([Ljava/lang/Object;)Z", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class JvmClassMappingKt {
    public static final KClass getAnnotationClass(Annotation annotation0) {
        Intrinsics.checkNotNullParameter(annotation0, "$this$annotationClass");
        Class class0 = annotation0.annotationType();
        Intrinsics.checkNotNullExpressionValue(class0, "(this as java.lang.annot…otation).annotationType()");
        KClass kClass0 = JvmClassMappingKt.getKotlinClass(class0);
        if(kClass0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
        }
        return kClass0;
    }

    public static final Class getJavaClass(Object object0) {
        Intrinsics.checkNotNullParameter(object0, "$this$javaClass");
        Class class0 = object0.getClass();
        if(class0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        return class0;
    }

    public static final Class getJavaClass(KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "$this$java");
        Class class0 = ((ClassBasedDeclarationContainer)kClass0).getJClass();
        if(class0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        return class0;
    }

    public static void getJavaClass$annotations(KClass kClass0) {
    }

    public static final Class getJavaObjectType(KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "$this$javaObjectType");
        Class class0 = ((ClassBasedDeclarationContainer)kClass0).getJClass();
        if(!class0.isPrimitive()) {
            return class0;
        }
        String s = class0.getName();
        if(s != null) {
            switch(s) {
                case "boolean": {
                    class0 = Boolean.class;
                    break;
                }
                case "byte": {
                    class0 = Byte.class;
                    break;
                }
                case "char": {
                    class0 = Character.class;
                    break;
                }
                case "double": {
                    class0 = Double.class;
                    break;
                }
                case "float": {
                    class0 = Float.class;
                    break;
                }
                case "int": {
                    class0 = Integer.class;
                    break;
                }
                case "long": {
                    class0 = Long.class;
                    break;
                }
                case "short": {
                    class0 = Short.class;
                    break;
                }
                case "void": {
                    class0 = Void.class;
                }
            }
        }
        if(class0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
        }
        return class0;
    }

    public static final Class getJavaPrimitiveType(KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "$this$javaPrimitiveType");
        Class class0 = ((ClassBasedDeclarationContainer)kClass0).getJClass();
        if(class0.isPrimitive()) {
            return class0;
        }
        String s = class0.getName();
        if(s != null) {
            switch(s) {
                case "java.lang.Boolean": {
                    return Boolean.TYPE;
                }
                case "java.lang.Byte": {
                    return Byte.TYPE;
                }
                case "java.lang.Character": {
                    return Character.TYPE;
                }
                case "java.lang.Double": {
                    return Double.TYPE;
                }
                case "java.lang.Float": {
                    return Float.TYPE;
                }
                case "java.lang.Integer": {
                    return Integer.TYPE;
                }
                case "java.lang.Long": {
                    return Long.TYPE;
                }
                case "java.lang.Short": {
                    return Short.TYPE;
                }
                case "java.lang.Void": {
                    return Void.TYPE;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }

    public static final KClass getKotlinClass(Class class0) {
        Intrinsics.checkNotNullParameter(class0, "$this$kotlin");
        return Reflection.getOrCreateKotlinClass(class0);
    }

    public static final Class getRuntimeClassOfKClassInstance(KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "$this$javaClass");
        Class class0 = kClass0.getClass();
        if(class0 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>");
        }
        return class0;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Use \'java\' property to get Java class corresponding to this Kotlin class or cast this instance to Any if you really want to get the runtime Java class of this implementation of KClass.", replaceWith = @ReplaceWith(expression = "(this as Any).javaClass", imports = {}))
    public static void getRuntimeClassOfKClassInstance$annotations(KClass kClass0) {
    }

    public static final boolean isArrayOf(Object[] arr_object) {
        Intrinsics.checkNotNullParameter(arr_object, "$this$isArrayOf");
        Intrinsics.reifiedOperationMarker(4, "T");
        Class class0 = arr_object.getClass().getComponentType();
        return Object.class.isAssignableFrom(class0);
    }
}

