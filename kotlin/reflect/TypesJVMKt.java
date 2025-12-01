package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0000\u001A\"\u0010\n\u001A\u00020\u00012\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\f2\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u00070\u000EH\u0003\u001A\u0010\u0010\u000F\u001A\u00020\u00102\u0006\u0010\u0011\u001A\u00020\u0001H\u0002\u001A\u0016\u0010\u0012\u001A\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0013\u001A\u00020\u0014H\u0003\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006\"\u001E\u0010\u0000\u001A\u00020\u0001*\u00020\u00078BX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\b\u001A\u0004\b\u0005\u0010\t¨\u0006\u0015"}, d2 = {"javaType", "Ljava/lang/reflect/Type;", "Lkotlin/reflect/KType;", "getJavaType$annotations", "(Lkotlin/reflect/KType;)V", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "Lkotlin/reflect/KTypeProjection;", "(Lkotlin/reflect/KTypeProjection;)V", "(Lkotlin/reflect/KTypeProjection;)Ljava/lang/reflect/Type;", "createPossiblyInnerType", "jClass", "Ljava/lang/Class;", "arguments", "", "typeToString", "", "type", "computeJavaType", "forceWrapper", "", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class TypesJVMKt {
    public static final Type access$computeJavaType(KType kType0, boolean z) {
        return TypesJVMKt.computeJavaType(kType0, z);
    }

    private static final Type computeJavaType(KType kType0, boolean z) {
        KClassifier kClassifier0 = kType0.getClassifier();
        if(kClassifier0 instanceof KTypeParameter) {
            return new TypeVariableImpl(((KTypeParameter)kClassifier0));
        }
        if(!(kClassifier0 instanceof KClass)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + kType0);
        }
        Class class0 = z ? JvmClassMappingKt.getJavaObjectType(((KClass)kClassifier0)) : JvmClassMappingKt.getJavaClass(((KClass)kClassifier0));
        List list0 = kType0.getArguments();
        if(list0.isEmpty()) {
            return class0;
        }
        if(class0.isArray()) {
            Class class1 = class0.getComponentType();
            Intrinsics.checkNotNullExpressionValue(class1, "jClass.componentType");
            if(class1.isPrimitive()) {
                return class0;
            }
            KTypeProjection kTypeProjection0 = (KTypeProjection)CollectionsKt.singleOrNull(list0);
            if(kTypeProjection0 == null) {
                throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType0);
            }
            KVariance kVariance0 = kTypeProjection0.component1();
            KType kType1 = kTypeProjection0.component2();
            if(kVariance0 != null) {
                switch(kVariance0) {
                    case 1: {
                        break;
                    }
                    case 2: 
                    case 3: {
                        Intrinsics.checkNotNull(kType1);
                        Type type0 = TypesJVMKt.computeJavaType$default(kType1, false, 1, null);
                        return !(type0 instanceof Class) ? new GenericArrayTypeImpl(type0) : class0;
                    }
                    default: {
                        throw new NoWhenBranchMatchedException();
                    }
                }
            }
            return class0;
        }
        return TypesJVMKt.createPossiblyInnerType(class0, list0);
    }

    static Type computeJavaType$default(KType kType0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        return TypesJVMKt.computeJavaType(kType0, z);
    }

    private static final Type createPossiblyInnerType(Class class0, List list0) {
        Class class1 = class0.getDeclaringClass();
        if(class1 != null) {
            if(Modifier.isStatic(class0.getModifiers())) {
                ArrayList arrayList0 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list0, 10));
                for(Object object0: list0) {
                    arrayList0.add(TypesJVMKt.getJavaType(((KTypeProjection)object0)));
                }
                return new ParameterizedTypeImpl(class0, class1, arrayList0);
            }
            TypeVariable[] arr_typeVariable = class0.getTypeParameters();
            Type type0 = TypesJVMKt.createPossiblyInnerType(class1, list0.subList(arr_typeVariable.length, list0.size()));
            Iterable iterable0 = list0.subList(0, arr_typeVariable.length);
            ArrayList arrayList1 = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable0, 10));
            for(Object object1: iterable0) {
                arrayList1.add(TypesJVMKt.getJavaType(((KTypeProjection)object1)));
            }
            return new ParameterizedTypeImpl(class0, type0, arrayList1);
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list0, 10));
        for(Object object2: list0) {
            arrayList2.add(TypesJVMKt.getJavaType(((KTypeProjection)object2)));
        }
        return new ParameterizedTypeImpl(class0, null, arrayList2);
    }

    public static final Type getJavaType(KType kType0) {
        Intrinsics.checkNotNullParameter(kType0, "$this$javaType");
        if(kType0 instanceof KTypeBase) {
            Type type0 = ((KTypeBase)kType0).getJavaType();
            return type0 == null ? TypesJVMKt.computeJavaType$default(kType0, false, 1, null) : type0;
        }
        return TypesJVMKt.computeJavaType$default(kType0, false, 1, null);
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection0) {
        KVariance kVariance0 = kTypeProjection0.getVariance();
        if(kVariance0 != null) {
            KType kType0 = kTypeProjection0.getType();
            Intrinsics.checkNotNull(kType0);
            switch(kVariance0) {
                case 1: {
                    return TypesJVMKt.computeJavaType(kType0, true);
                }
                case 2: {
                    return new WildcardTypeImpl(null, TypesJVMKt.computeJavaType(kType0, true));
                }
                case 3: {
                    return new WildcardTypeImpl(TypesJVMKt.computeJavaType(kType0, true), null);
                }
                default: {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        return WildcardTypeImpl.Companion.getSTAR();
    }

    public static void getJavaType$annotations(KType kType0) {
    }

    private static void getJavaType$annotations(KTypeProjection kTypeProjection0) {
    }

    private static final String typeToString(Type type0) {
        String s;
        if(type0 instanceof Class) {
            if(((Class)type0).isArray()) {
                Sequence sequence0 = SequencesKt.generateSequence(type0, kotlin.reflect.TypesJVMKt.typeToString.unwrap.1.INSTANCE);
                s = ((Class)SequencesKt.last(sequence0)).getName() + StringsKt.repeat("[]", SequencesKt.count(sequence0));
            }
            else {
                s = ((Class)type0).getName();
            }
            Intrinsics.checkNotNullExpressionValue(s, "if (type.isArray) {\n    …\n        } else type.name");
            return s;
        }
        return type0.toString();

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001A\u0012\u0012\u0002\b\u0003 \u0002*\b\u0012\u0002\b\u0003\u0018\u00010\u00010\u00012\n\u0010\u0003\u001A\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "p1", "invoke"}, k = 3, mv = {1, 5, 1})
        final class kotlin.reflect.TypesJVMKt.typeToString.unwrap.1 extends FunctionReferenceImpl implements Function1 {
            public static final kotlin.reflect.TypesJVMKt.typeToString.unwrap.1 INSTANCE;

            static {
                kotlin.reflect.TypesJVMKt.typeToString.unwrap.1.INSTANCE = new kotlin.reflect.TypesJVMKt.typeToString.unwrap.1();
            }

            kotlin.reflect.TypesJVMKt.typeToString.unwrap.1() {
                super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
            }

            public final Class invoke(Class class0) {
                Intrinsics.checkNotNullParameter(class0, "p1");
                return class0.getComponentType();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Class)object0));
            }
        }

    }
}

