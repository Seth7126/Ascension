package com.google.android.gms.games.internal;

final class zzq extends zzz {
    private final zzar zzds;

    zzq(zzar zzf$zzar0) {
        this.zzds = zzf$zzar0;
        super(null);
    }

    @Override  // com.google.android.gms.common.api.internal.ListenerHolder$Notifier
    public final void notifyListener(Object object0) {
        this.zzds.accept(object0);
    }
}

