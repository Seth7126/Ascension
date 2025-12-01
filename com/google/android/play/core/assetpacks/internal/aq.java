package com.google.android.play.core.assetpacks.internal;

public final class aq implements as {
    private static final Object a;
    private volatile as b;
    private volatile Object c;

    static {
        aq.a = new Object();
    }

    private aq(as as0) {
        this.c = aq.a;
        this.b = as0;
    }

    @Override  // com.google.android.play.core.assetpacks.internal.as
    public final Object a() {
        Object object0 = this.c;
        Object object1 = aq.a;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.c;
                if(object0 == object1) {
                    object0 = this.b.a();
                    Object object2 = this.c;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.c = object0;
                    this.b = null;
                }
                return object0;
            }
        }
        return object0;
    }

    public static as b(as as0) {
        as0.getClass();
        return as0 instanceof aq ? as0 : new aq(as0);
    }

    // 去混淆评级： 低(20)
    public static aq c(as as0) {
        return as0 instanceof aq ? ((aq)as0) : new aq(as0);
    }
}

