package kotlin.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001B\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001A\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0017\u001A\u00020\u0013H\u0002J\u0013\u0010\u0018\u001A\u00020\b2\b\u0010\u0019\u001A\u0004\u0018\u00010\u001AH\u0096\u0002J\b\u0010\u001B\u001A\u00020\u001CH\u0016J\b\u0010\u001D\u001A\u00020\u0013H\u0016J\f\u0010\u0017\u001A\u00020\u0013*\u00020\u0006H\u0002R\u001A\u0010\n\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000E\u0010\rR\u0014\u0010\u0002\u001A\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0007\u001A\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001A\u0004\b\u0007\u0010\u0011R\u001C\u0010\u0012\u001A\u00020\u0013*\u0006\u0012\u0002\b\u00030\u00148BX\u0082\u0004¢\u0006\u0006\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u001E"}, d2 = {"Lkotlin/jvm/internal/TypeReference;", "Lkotlin/reflect/KType;", "classifier", "Lkotlin/reflect/KClassifier;", "arguments", "", "Lkotlin/reflect/KTypeProjection;", "isMarkedNullable", "", "(Lkotlin/reflect/KClassifier;Ljava/util/List;Z)V", "annotations", "", "getAnnotations", "()Ljava/util/List;", "getArguments", "getClassifier", "()Lkotlin/reflect/KClassifier;", "()Z", "arrayClassName", "", "Ljava/lang/Class;", "getArrayClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "asString", "equals", "other", "", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
public final class TypeReference implements KType {
    private final List arguments;
    private final KClassifier classifier;
    private final boolean isMarkedNullable;

    public TypeReference(KClassifier kClassifier0, List list0, boolean z) {
        Intrinsics.checkNotNullParameter(kClassifier0, "classifier");
        Intrinsics.checkNotNullParameter(list0, "arguments");
        super();
        this.classifier = kClassifier0;
        this.arguments = list0;
        this.isMarkedNullable = z;
    }

    private final String asString() {
        String s;
        KClassifier kClassifier0 = this.getClassifier();
        Class class0 = null;
        if(!(kClassifier0 instanceof KClass)) {
            kClassifier0 = null;
        }
        if(((KClass)kClassifier0) != null) {
            class0 = JvmClassMappingKt.getJavaClass(((KClass)kClassifier0));
        }
        if(class0 == null) {
            s = this.getClassifier().toString();
        }
        else {
            s = class0.isArray() ? this.getArrayClassName(class0) : class0.getName();
        }
        String s1 = "";
        String s2 = this.getArguments().isEmpty() ? "" : CollectionsKt.joinToString$default(this.getArguments(), ", ", "<", ">", 0, null, new Function1() {
            {
                TypeReference.this = typeReference0;
                super(1);
            }

            public final CharSequence invoke(KTypeProjection kTypeProjection0) {
                Intrinsics.checkNotNullParameter(kTypeProjection0, "it");
                return TypeReference.this.asString(kTypeProjection0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((KTypeProjection)object0));
            }
        }, 24, null);
        if(this.isMarkedNullable()) {
            s1 = "?";
        }
        return s + s2 + s1;
    }

    private final String asString(KTypeProjection kTypeProjection0) {
        String s;
        if(kTypeProjection0.getVariance() == null) {
            return "*";
        }
        KType kType0 = kTypeProjection0.getType() instanceof TypeReference ? kTypeProjection0.getType() : null;
        if(((TypeReference)kType0) == null) {
            s = String.valueOf(kTypeProjection0.getType());
        }
        else {
            s = ((TypeReference)kType0).asString();
            if(s == null) {
                s = String.valueOf(kTypeProjection0.getType());
            }
        }
        KVariance kVariance0 = kTypeProjection0.getVariance();
        if(kVariance0 != null) {
            switch(TypeReference.WhenMappings.$EnumSwitchMapping$0[kVariance0.ordinal()]) {
                case 1: {
                    return s;
                }
                case 2: {
                    return "in " + s;
                }
                case 3: {
                    return "out " + s;
                }
            }
        }
        throw new NoWhenBranchMatchedException();
    }

    // 去混淆评级： 低(30)
    @Override
    public boolean equals(Object object0) {
        return object0 instanceof TypeReference && Intrinsics.areEqual(this.getClassifier(), ((TypeReference)object0).getClassifier()) && Intrinsics.areEqual(this.getArguments(), ((TypeReference)object0).getArguments()) && this.isMarkedNullable() == ((TypeReference)object0).isMarkedNullable();
    }

    @Override  // kotlin.reflect.KAnnotatedElement
    public List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    @Override  // kotlin.reflect.KType
    public List getArguments() {
        return this.arguments;
    }

    private final String getArrayClassName(Class class0) {
        if(Intrinsics.areEqual(class0, boolean[].class)) {
            return "kotlin.BooleanArray";
        }
        if(Intrinsics.areEqual(class0, char[].class)) {
            return "kotlin.CharArray";
        }
        if(Intrinsics.areEqual(class0, byte[].class)) {
            return "kotlin.ByteArray";
        }
        if(Intrinsics.areEqual(class0, short[].class)) {
            return "kotlin.ShortArray";
        }
        if(Intrinsics.areEqual(class0, int[].class)) {
            return "kotlin.IntArray";
        }
        if(Intrinsics.areEqual(class0, float[].class)) {
            return "kotlin.FloatArray";
        }
        if(Intrinsics.areEqual(class0, long[].class)) {
            return "kotlin.LongArray";
        }
        return Intrinsics.areEqual(class0, double[].class) ? "kotlin.DoubleArray" : "kotlin.Array";
    }

    @Override  // kotlin.reflect.KType
    public KClassifier getClassifier() {
        return this.classifier;
    }

    @Override
    public int hashCode() {
        return (this.getClassifier().hashCode() * 0x1F + this.getArguments().hashCode()) * 0x1F + Boolean.valueOf(this.isMarkedNullable()).hashCode();
    }

    @Override  // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override
    public String toString() {
        return this.asString() + " (Kotlin reflection is not available)";
    }
}

