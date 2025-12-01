package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CopyableThrowable;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u001A*\u0010\n\u001A\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0006j\u0004\u0018\u0001`\u00072\n\u0010\u000B\u001A\u0006\u0012\u0002\b\u00030\fH\u0002\u001A1\u0010\r\u001A\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00072\u0014\b\u0004\u0010\u000E\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0006H\u0082\b\u001A!\u0010\u000F\u001A\u0004\u0018\u0001H\u0010\"\b\b\u0000\u0010\u0010*\u00020\u00052\u0006\u0010\u0011\u001A\u0002H\u0010H\u0000¢\u0006\u0002\u0010\u0012\u001A\u001B\u0010\u0013\u001A\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\b\b\u0002\u0010\u0014\u001A\u00020\tH\u0082\u0010\u001A\u0018\u0010\u0015\u001A\u00020\t*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0016\u001A\u00020\tH\u0002\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"4\u0010\u0002\u001A(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006j\u0002`\u00070\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000E\u0010\b\u001A\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00062\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0006¨\u0006\u0018"}, d2 = {"cacheLock", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "exceptionCtors", "Ljava/util/WeakHashMap;", "Ljava/lang/Class;", "", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/Ctor;", "throwableFields", "", "createConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "E", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 0x30)
public final class ExceptionsConstuctorKt {
    private static final ReentrantReadWriteLock cacheLock;
    private static final WeakHashMap exceptionCtors;
    private static final int throwableFields;

    static {
        ExceptionsConstuctorKt.throwableFields = ExceptionsConstuctorKt.fieldsCountOrDefault(Throwable.class, -1);
        ExceptionsConstuctorKt.cacheLock = new ReentrantReadWriteLock();
        ExceptionsConstuctorKt.exceptionCtors = new WeakHashMap();
    }

    private static final Function1 createConstructor(Constructor constructor0) {
        Class[] arr_class = constructor0.getParameterTypes();
        if(arr_class.length != 0) {
            switch(arr_class.length) {
                case 1: {
                    Class class0 = arr_class[0];
                    if(Intrinsics.areEqual(class0, Throwable.class)) {
                        return new Function1(constructor0) {
                            final Constructor $constructor$inlined;

                            {
                                this.$constructor$inlined = constructor0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.invoke(((Throwable)object0));
                            }

                            public final Throwable invoke(Throwable throwable0) {
                                Object object1;
                                try {
                                    Object object0 = this.$constructor$inlined.newInstance(throwable0);
                                    if(object0 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                                    }
                                    object1 = Result.constructor-impl(((Throwable)object0));
                                }
                                catch(Throwable throwable1) {
                                    object1 = Result.constructor-impl(ResultKt.createFailure(throwable1));
                                }
                                if(Result.isFailure-impl(object1)) {
                                    object1 = null;
                                }
                                return (Throwable)object1;
                            }
                        };
                    }
                    if(Intrinsics.areEqual(class0, String.class)) {
                        return new Function1(constructor0) {
                            final Constructor $constructor$inlined;

                            {
                                this.$constructor$inlined = constructor0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.invoke(((Throwable)object0));
                            }

                            public final Throwable invoke(Throwable throwable0) {
                                Object object1;
                                try {
                                    Object object0 = this.$constructor$inlined.newInstance(throwable0.getMessage());
                                    if(object0 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                                    }
                                    ((Throwable)object0).initCause(throwable0);
                                    object1 = Result.constructor-impl(((Throwable)object0));
                                }
                                catch(Throwable throwable1) {
                                    object1 = Result.constructor-impl(ResultKt.createFailure(throwable1));
                                }
                                if(Result.isFailure-impl(object1)) {
                                    object1 = null;
                                }
                                return (Throwable)object1;
                            }
                        };
                    }
                    break;
                }
                case 2: {
                    if(Intrinsics.areEqual(arr_class[0], String.class) && Intrinsics.areEqual(arr_class[1], Throwable.class)) {
                        return new Function1(constructor0) {
                            final Constructor $constructor$inlined;

                            {
                                this.$constructor$inlined = constructor0;
                                super(1);
                            }

                            @Override  // kotlin.jvm.functions.Function1
                            public Object invoke(Object object0) {
                                return this.invoke(((Throwable)object0));
                            }

                            public final Throwable invoke(Throwable throwable0) {
                                Object object1;
                                try {
                                    Object object0 = this.$constructor$inlined.newInstance(throwable0.getMessage(), throwable0);
                                    if(object0 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                                    }
                                    object1 = Result.constructor-impl(((Throwable)object0));
                                }
                                catch(Throwable throwable1) {
                                    object1 = Result.constructor-impl(ResultKt.createFailure(throwable1));
                                }
                                if(Result.isFailure-impl(object1)) {
                                    object1 = null;
                                }
                                return (Throwable)object1;
                            }
                        };
                    }
                    break;
                }
                default: {
                    return null;
                }
            }
            return null;
        }
        return new Function1(constructor0) {
            final Constructor $constructor$inlined;

            {
                this.$constructor$inlined = constructor0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Throwable)object0));
            }

            public final Throwable invoke(Throwable throwable0) {
                Object object1;
                try {
                    Object object0 = this.$constructor$inlined.newInstance();
                    if(object0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                    }
                    ((Throwable)object0).initCause(throwable0);
                    object1 = Result.constructor-impl(((Throwable)object0));
                }
                catch(Throwable throwable1) {
                    object1 = Result.constructor-impl(ResultKt.createFailure(throwable1));
                }
                if(Result.isFailure-impl(object1)) {
                    object1 = null;
                }
                return (Throwable)object1;
            }
        };
    }

    private static final int fieldsCount(Class class0, int v) {
        do {
            Field[] arr_field = class0.getDeclaredFields();
            int v2 = 0;
            for(int v1 = 0; v1 < arr_field.length; ++v1) {
                if(!Modifier.isStatic(arr_field[v1].getModifiers()) != 0) {
                    ++v2;
                }
            }
            v += v2;
            class0 = class0.getSuperclass();
        }
        while(class0 != null);
        return v;
    }

    static int fieldsCount$default(Class class0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            v = 0;
        }
        return ExceptionsConstuctorKt.fieldsCount(class0, v);
    }

    private static final int fieldsCountOrDefault(Class class0, int v) {
        Integer integer0;
        JvmClassMappingKt.getKotlinClass(class0);
        try {
            integer0 = Result.constructor-impl(ExceptionsConstuctorKt.fieldsCount$default(class0, 0, 1, null));
        }
        catch(Throwable throwable0) {
            integer0 = Result.constructor-impl(ResultKt.createFailure(throwable0));
        }
        Integer integer1 = v;
        if(Result.isFailure-impl(integer0)) {
            integer0 = integer1;
        }
        return integer0.intValue();
    }

    private static final Function1 safeCtor(Function1 function10) {
        return new Function1(function10) {
            final Function1 $block;

            {
                this.$block = function10;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Throwable)object0));
            }

            public final Throwable invoke(Throwable throwable0) {
                Object object0;
                try {
                    object0 = Result.constructor-impl(((Throwable)this.$block.invoke(throwable0)));
                }
                catch(Throwable throwable1) {
                    object0 = Result.constructor-impl(ResultKt.createFailure(throwable1));
                }
                if(Result.isFailure-impl(object0)) {
                    object0 = null;
                }
                return (Throwable)object0;
            }
        };
    }

    public static final Throwable tryCopyException(Throwable throwable0) {
        Function1 function10;
        Object object0;
        if(throwable0 instanceof CopyableThrowable) {
            try {
                object0 = Result.constructor-impl(((CopyableThrowable)throwable0).createCopy());
            }
            catch(Throwable throwable1) {
                object0 = Result.constructor-impl(ResultKt.createFailure(throwable1));
            }
            return !Result.isFailure-impl(object0) ? object0 : null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock0 = ExceptionsConstuctorKt.cacheLock;
        ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock0 = reentrantReadWriteLock0.readLock();
        reentrantReadWriteLock$ReadLock0.lock();
        try {
            Class class0 = throwable0.getClass();
            function10 = (Function1)ExceptionsConstuctorKt.exceptionCtors.get(class0);
        }
        finally {
            reentrantReadWriteLock$ReadLock0.unlock();
        }
        if(function10 == null) {
            int v1 = 0;
            int v2 = ExceptionsConstuctorKt.fieldsCountOrDefault(throwable0.getClass(), 0);
            if(ExceptionsConstuctorKt.throwableFields != v2) {
                ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock1 = reentrantReadWriteLock0.readLock();
                int v3 = reentrantReadWriteLock0.getWriteHoldCount() == 0 ? reentrantReadWriteLock0.getReadHoldCount() : 0;
                for(int v4 = 0; v4 < v3; ++v4) {
                    reentrantReadWriteLock$ReadLock1.unlock();
                }
                ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock0 = reentrantReadWriteLock0.writeLock();
                reentrantReadWriteLock$WriteLock0.lock();
                try {
                    Class class1 = throwable0.getClass();
                    ExceptionsConstuctorKt.exceptionCtors.put(class1, kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.4.1.INSTANCE);
                    return null;
                }
                finally {
                    while(v1 < v3) {
                        reentrantReadWriteLock$ReadLock1.lock();
                        ++v1;
                    }
                    reentrantReadWriteLock$WriteLock0.unlock();
                }
            }
            Function1 function11 = null;
            for(Object object1: ArraysKt.sortedWith(throwable0.getClass().getConstructors(), new Comparator() {
                @Override
                public final int compare(Object object0, Object object1) {
                    Class[] arr_class = ((Constructor)object1).getParameterTypes();
                    Class[] arr_class1 = ((Constructor)object0).getParameterTypes();
                    return ComparisonsKt.compareValues(((int)arr_class.length), ((int)arr_class1.length));
                }
            })) {
                function11 = ExceptionsConstuctorKt.createConstructor(((Constructor)object1));
                if(function11 != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock1 = ExceptionsConstuctorKt.cacheLock;
            ReentrantReadWriteLock.ReadLock reentrantReadWriteLock$ReadLock2 = reentrantReadWriteLock1.readLock();
            int v6 = reentrantReadWriteLock1.getWriteHoldCount() == 0 ? reentrantReadWriteLock1.getReadHoldCount() : 0;
            for(int v7 = 0; v7 < v6; ++v7) {
                reentrantReadWriteLock$ReadLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock reentrantReadWriteLock$WriteLock1 = reentrantReadWriteLock1.writeLock();
            reentrantReadWriteLock$WriteLock1.lock();
            try {
                Map map0 = ExceptionsConstuctorKt.exceptionCtors;
                Class class2 = throwable0.getClass();
                Function1 function12 = function11 == null ? kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.5.1.INSTANCE : function11;
                map0.put(class2, function12);
            }
            finally {
                while(v1 < v6) {
                    reentrantReadWriteLock$ReadLock2.lock();
                    ++v1;
                }
                reentrantReadWriteLock$WriteLock1.unlock();
            }
            return function11 == null ? null : ((Throwable)function11.invoke(throwable0));
        }
        return (Throwable)function10.invoke(throwable0);

        @Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\n"}, d2 = {"", "E", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.4.1 extends Lambda implements Function1 {
            public static final kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.4.1 INSTANCE;

            static {
                kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.4.1.INSTANCE = new kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.4.1();
            }

            kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.4.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Throwable)object0));
            }

            public final Void invoke(Throwable throwable0) {
                return null;
            }
        }


        @Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\u0010\u0004\u001A\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u0000H\n"}, d2 = {"", "E", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        final class kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.5.1 extends Lambda implements Function1 {
            public static final kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.5.1 INSTANCE;

            static {
                kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.5.1.INSTANCE = new kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.5.1();
            }

            kotlinx.coroutines.internal.ExceptionsConstuctorKt.tryCopyException.5.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Throwable)object0));
            }

            public final Void invoke(Throwable throwable0) {
                return null;
            }
        }

    }
}

