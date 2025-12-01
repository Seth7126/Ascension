package com.google.android.gms.internal.firebase_messaging;

final class zzo extends zzn {
    private final zzm zza;

    zzo() {
        this.zza = new zzm();
    }

    @Override  // com.google.android.gms.internal.firebase_messaging.zzn
    public final void zza(Throwable throwable0, Throwable throwable1) {
        if(throwable1 == throwable0) {
            throw new IllegalArgumentException("Self suppression is not allowed.", throwable1);
        }
        if(throwable1 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.zza.zza(throwable0, true).add(throwable1);
    }
}

