package com.google.android.gms.internal.games;

final class zzgl extends zzgk {
    private final zzgj zznm;

    zzgl() {
        this.zznm = new zzgj();
    }

    @Override  // com.google.android.gms.internal.games.zzgk
    public final void zza(Throwable throwable0, Throwable throwable1) {
        if(throwable1 == throwable0) {
            throw new IllegalArgumentException("Self suppression is not allowed.", throwable1);
        }
        if(throwable1 == null) {
            throw new NullPointerException("The suppressed exception cannot be null.");
        }
        this.zznm.zza(throwable0, true).add(throwable1);
    }
}

