package com.google.android.gms.auth.api.accounttransfer;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.AnyClient;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi.Settings.Builder;
import com.google.android.gms.common.api.GoogleApi.Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.auth.zzab;
import com.google.android.gms.internal.auth.zzad;
import com.google.android.gms.internal.auth.zzaf;
import com.google.android.gms.internal.auth.zzah;
import com.google.android.gms.internal.auth.zzs;
import com.google.android.gms.internal.auth.zzu;
import com.google.android.gms.internal.auth.zzv;
import com.google.android.gms.internal.auth.zzy;
import com.google.android.gms.internal.auth.zzz;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public class AccountTransferClient extends GoogleApi {
    static class zza extends zzs {
        private zzb zzav;

        public zza(zzb accountTransferClient$zzb0) {
            this.zzav = accountTransferClient$zzb0;
        }

        @Override  // com.google.android.gms.internal.auth.zzs
        public final void onFailure(Status status0) {
            this.zzav.zza(status0);
        }
    }

    static abstract class zzb extends TaskApiCall {
        private TaskCompletionSource zzaw;

        private zzb() {
        }

        zzb(zzc zzc0) {
        }

        @Override  // com.google.android.gms.common.api.internal.TaskApiCall
        protected void doExecute(AnyClient api$AnyClient0, TaskCompletionSource taskCompletionSource0) throws RemoteException {
            this.zzaw = taskCompletionSource0;
            this.zza(((zzz)((zzu)api$AnyClient0).getService()));
        }

        protected final void setResult(Object object0) {
            this.zzaw.setResult(object0);
        }

        protected final void zza(Status status0) {
            AccountTransferClient.zza(this.zzaw, status0);
        }

        protected abstract void zza(zzz arg1) throws RemoteException;
    }

    static abstract class com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc extends zzb {
        zzy zzax;

        private com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc() {
            super(null);
            this.zzax = new zzk(this);
        }

        com.google.android.gms.auth.api.accounttransfer.AccountTransferClient.zzc(zzc zzc0) {
        }
    }

    private static final ClientKey zzaj;
    private static final AbstractClientBuilder zzak;
    private static final Api zzal;

    static {
        ClientKey api$ClientKey0 = new ClientKey();
        AccountTransferClient.zzaj = api$ClientKey0;
        zzc zzc0 = new zzc();
        AccountTransferClient.zzak = zzc0;
        AccountTransferClient.zzal = new Api("AccountTransfer.ACCOUNT_TRANSFER_API", zzc0, api$ClientKey0);
    }

    AccountTransferClient(Activity activity0) {
        Settings googleApi$Settings0 = new Builder().setMapper(new ApiExceptionMapper()).build();
        super(activity0, AccountTransferClient.zzal, null, googleApi$Settings0);
    }

    AccountTransferClient(Context context0) {
        Settings googleApi$Settings0 = new Builder().setMapper(new ApiExceptionMapper()).build();
        super(context0, AccountTransferClient.zzal, null, googleApi$Settings0);
    }

    public Task getDeviceMetaData(String s) {
        Preconditions.checkNotNull(s);
        return this.doRead(new zzg(this, new zzv(s)));
    }

    public Task notifyCompletion(String s, int v) {
        Preconditions.checkNotNull(s);
        return this.doWrite(new zzj(this, new zzab(s, v)));
    }

    public Task retrieveData(String s) {
        Preconditions.checkNotNull(s);
        return this.doRead(new zze(this, new zzad(s)));
    }

    public Task sendData(String s, byte[] arr_b) {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(arr_b);
        return this.doWrite(new zzd(this, new zzaf(s, arr_b)));
    }

    public Task showUserChallenge(String s, PendingIntent pendingIntent0) {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(pendingIntent0);
        return this.doWrite(new zzi(this, new zzah(s, pendingIntent0)));
    }

    private static void zza(TaskCompletionSource taskCompletionSource0, Status status0) {
        taskCompletionSource0.setException(new AccountTransferException(status0));
    }
}

