package kotlin.internal;

import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.internal.jdk8.JDK8PlatformImplementations;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\u001A \u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u0005H\u0001\u001A\"\u0010\b\u001A\u0002H\t\"\n\b\u0000\u0010\t\u0018\u0001*\u00020\n2\u0006\u0010\u000B\u001A\u00020\nH\u0083\b¢\u0006\u0002\u0010\f\u001A\b\u0010\r\u001A\u00020\u0005H\u0002\"\u0010\u0010\u0000\u001A\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u000E"}, d2 = {"IMPLEMENTATIONS", "Lkotlin/internal/PlatformImplementations;", "apiVersionIsAtLeast", "", "major", "", "minor", "patch", "castToBaseType", "T", "", "instance", "(Ljava/lang/Object;)Ljava/lang/Object;", "getJavaVersion", "kotlin-stdlib"}, k = 2, mv = {1, 5, 1})
public final class PlatformImplementationsKt {
    public static final PlatformImplementations IMPLEMENTATIONS;

    static {
        PlatformImplementations platformImplementations0;
        int v = PlatformImplementationsKt.getJavaVersion();
        if(v >= 0x10008) {
            try {
                Object object0 = JDK8PlatformImplementations.class.newInstance();
                Intrinsics.checkNotNullExpressionValue(object0, "Class.forName(\"kotlin.in…entations\").newInstance()");
                if(object0 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                }
                else {
                    try {
                        platformImplementations0 = (PlatformImplementations)object0;
                        PlatformImplementationsKt.IMPLEMENTATIONS = platformImplementations0;
                        return;
                    }
                    catch(ClassCastException classCastException0) {
                    }
                }
                Throwable throwable0 = new ClassCastException("Instance classloader: " + object0.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(classCastException0);
                Intrinsics.checkNotNullExpressionValue(throwable0, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                throw throwable0;
            }
            catch(ClassNotFoundException unused_ex) {
                try {
                    Object object1 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                    Intrinsics.checkNotNullExpressionValue(object1, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if(object1 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    else {
                        try {
                            platformImplementations0 = (PlatformImplementations)object1;
                            PlatformImplementationsKt.IMPLEMENTATIONS = platformImplementations0;
                            return;
                        }
                        catch(ClassCastException classCastException1) {
                        }
                    }
                    Throwable throwable1 = new ClassCastException("Instance classloader: " + object1.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(classCastException1);
                    Intrinsics.checkNotNullExpressionValue(throwable1, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw throwable1;
                }
                catch(ClassNotFoundException unused_ex) {
                    goto label_22;
                }
            }
        }
        else {
        label_22:
            if(v >= 0x10007) {
                try {
                    Object object2 = JDK7PlatformImplementations.class.newInstance();
                    Intrinsics.checkNotNullExpressionValue(object2, "Class.forName(\"kotlin.in…entations\").newInstance()");
                    if(object2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                    }
                    else {
                        try {
                            platformImplementations0 = (PlatformImplementations)object2;
                            PlatformImplementationsKt.IMPLEMENTATIONS = platformImplementations0;
                            return;
                        }
                        catch(ClassCastException classCastException2) {
                        }
                    }
                    Throwable throwable2 = new ClassCastException("Instance classloader: " + object2.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(classCastException2);
                    Intrinsics.checkNotNullExpressionValue(throwable2, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                    throw throwable2;
                }
                catch(ClassNotFoundException unused_ex) {
                    try {
                        Object object3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                        Intrinsics.checkNotNullExpressionValue(object3, "Class.forName(\"kotlin.in…entations\").newInstance()");
                        if(object3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.internal.PlatformImplementations");
                        }
                        else {
                            try {
                                platformImplementations0 = (PlatformImplementations)object3;
                                PlatformImplementationsKt.IMPLEMENTATIONS = platformImplementations0;
                                return;
                            }
                            catch(ClassCastException classCastException3) {
                            }
                        }
                        Throwable throwable3 = new ClassCastException("Instance classloader: " + object3.getClass().getClassLoader() + ", base type classloader: " + PlatformImplementations.class.getClassLoader()).initCause(classCastException3);
                        Intrinsics.checkNotNullExpressionValue(throwable3, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
                        throw throwable3;
                    }
                    catch(ClassNotFoundException unused_ex) {
                        platformImplementations0 = new PlatformImplementations();
                        PlatformImplementationsKt.IMPLEMENTATIONS = platformImplementations0;
                        return;
                    }
                }
            }
            else {
                platformImplementations0 = new PlatformImplementations();
            }
        }
        PlatformImplementationsKt.IMPLEMENTATIONS = platformImplementations0;
    }

    public static final boolean apiVersionIsAtLeast(int v, int v1, int v2) [...] // 潜在的解密器

    private static final Object castToBaseType(Object object0) {
        try {
            Intrinsics.reifiedOperationMarker(1, "T");
            return object0;
        }
        catch(ClassCastException classCastException0) {
            ClassLoader classLoader0 = object0.getClass().getClassLoader();
            Intrinsics.reifiedOperationMarker(4, "T");
            Throwable throwable0 = new ClassCastException("Instance classloader: " + classLoader0 + ", base type classloader: " + Object.class.getClassLoader()).initCause(classCastException0);
            Intrinsics.checkNotNullExpressionValue(throwable0, "ClassCastException(\"Inst…baseTypeCL\").initCause(e)");
            throw throwable0;
        }
    }

    // 去混淆评级： 低(23)
    private static final int getJavaVersion() {
        int v = StringsKt.indexOf$default("0.9", '.', 0, false, 6, null);
        if(v < 0) {
            try {
                return Integer.parseInt("0.9") * 0x10000;
            }
            catch(NumberFormatException unused_ex) {
                return 0x10006;
            }
        }
        boolean z = StringsKt.indexOf$default("0.9", '.', v + 1, false, 4, null) >= 0;
        Intrinsics.checkNotNullExpressionValue("0", "(this as java.lang.Strin…ing(startIndex, endIndex)");
        Intrinsics.checkNotNullExpressionValue("9", "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return 9;
    }
}

