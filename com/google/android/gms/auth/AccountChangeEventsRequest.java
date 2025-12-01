package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    private final int zze;
    @Deprecated
    private String zzg;
    private int zzi;
    private Account zzk;

    static {
        AccountChangeEventsRequest.CREATOR = new zzb();
    }

    public AccountChangeEventsRequest() {
        this.zze = 1;
    }

    AccountChangeEventsRequest(int v, int v1, String s, Account account0) {
        this.zze = v;
        this.zzi = v1;
        this.zzg = s;
        if(account0 == null && !TextUtils.isEmpty(s)) {
            this.zzk = new Account(s, "com.google");
            return;
        }
        this.zzk = account0;
    }

    public Account getAccount() {
        return this.zzk;
    }

    @Deprecated
    public String getAccountName() {
        return this.zzg;
    }

    public int getEventIndex() {
        return this.zzi;
    }

    public AccountChangeEventsRequest setAccount(Account account0) {
        this.zzk = account0;
        return this;
    }

    @Deprecated
    public AccountChangeEventsRequest setAccountName(String s) {
        this.zzg = s;
        return this;
    }

    public AccountChangeEventsRequest setEventIndex(int v) {
        this.zzi = v;
        return this;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.zze);
        SafeParcelWriter.writeInt(parcel0, 2, this.zzi);
        SafeParcelWriter.writeString(parcel0, 3, this.zzg, false);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzk, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

