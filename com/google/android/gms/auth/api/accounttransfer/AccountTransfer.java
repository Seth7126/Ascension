package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzt;

public final class AccountTransfer {
    public static final String ACTION_ACCOUNT_EXPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_EXPORT_DATA_AVAILABLE";
    public static final String ACTION_ACCOUNT_IMPORT_DATA_AVAILABLE = "com.google.android.gms.auth.ACCOUNT_IMPORT_DATA_AVAILABLE";
    public static final String ACTION_START_ACCOUNT_EXPORT = "com.google.android.gms.auth.START_ACCOUNT_EXPORT";
    public static final String KEY_EXTRA_ACCOUNT_TYPE = "key_extra_account_type";
    private static final ClientKey zzaj;
    private static final AbstractClientBuilder zzak;
    private static final Api zzal;
    @Deprecated
    private static final zzb zzam;
    private static final zzq zzan;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        AccountTransfer.zzaj = api$ClientKey0;
        zza zza0 = new zza();
        AccountTransfer.zzak = zza0;
        AccountTransfer.zzal = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zza0, api$ClientKey0);
        AccountTransfer.zzam = new zzt();
        AccountTransfer.zzan = new zzt();
    }

    public static AccountTransferClient getAccountTransferClient(Activity activity0) {
        return new AccountTransferClient(activity0);
    }

    public static AccountTransferClient getAccountTransferClient(Context context0) {
        return new AccountTransferClient(context0);
    }
}

