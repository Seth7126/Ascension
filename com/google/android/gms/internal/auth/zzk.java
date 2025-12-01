package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class zzk extends zzn {
    private final zzj zzaf;

    zzk(zzj zzj0) {
        this.zzaf = zzj0;
        super();
    }

    @Override  // com.google.android.gms.internal.auth.zzn
    public final void zzc(Account account0) {
        this.zzaf.setResult(new zzo((account0 == null ? zzh.zzad : Status.RESULT_SUCCESS), account0));
    }
}

