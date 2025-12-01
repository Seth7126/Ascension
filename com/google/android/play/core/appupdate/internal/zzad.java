package com.google.android.play.core.appupdate.internal;

public final class zzad implements zzaf {
    private static final Object zza;
    private volatile zzaf zzb;
    private volatile Object zzc;

    static {
        zzad.zza = new Object();
    }

    private zzad(zzaf zzaf0) {
        this.zzc = zzad.zza;
        this.zzb = zzaf0;
    }

    @Override  // com.google.android.play.core.appupdate.internal.zzaf
    public final Object zza() {
        Object object0 = this.zzc;
        Object object1 = zzad.zza;
        if(object0 == object1) {
            synchronized(this) {
                object0 = this.zzc;
                if(object0 == object1) {
                    object0 = this.zzb.zza();
                    Object object2 = this.zzc;
                    if(object2 != object1 && object2 != object0) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + object2 + " & " + object0 + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = object0;
                    this.zzb = null;
                }
                return object0;
            }
        }
        return object0;
    }

    public static zzaf zzb(zzaf zzaf0) {
        zzaf0.getClass();
        return zzaf0 instanceof zzad ? zzaf0 : new zzad(zzaf0);
    }
}

