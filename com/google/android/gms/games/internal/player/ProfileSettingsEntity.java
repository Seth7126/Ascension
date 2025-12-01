package com.google.android.gms.games.internal.player;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.Players.zza;
import com.google.android.gms.games.internal.zzb;

public class ProfileSettingsEntity extends zzb implements zza {
    public static final Parcelable.Creator CREATOR;
    private final boolean zzbh;
    private final String zzbj;
    private final Status zzdw;
    private final boolean zzhp;
    private final boolean zzhq;
    private final StockProfileImageEntity zzhr;
    private final boolean zzhs;
    private final boolean zzht;
    private final int zzhu;
    private final boolean zzhv;
    private final boolean zzhw;
    private final int zzhx;
    private final int zzhy;

    static {
        ProfileSettingsEntity.CREATOR = new zze();
    }

    ProfileSettingsEntity(Status status0, String s, boolean z, boolean z1, boolean z2, StockProfileImageEntity stockProfileImageEntity0, boolean z3, boolean z4, int v, boolean z5, boolean z6, int v1, int v2) {
        this.zzdw = status0;
        this.zzbj = s;
        this.zzhp = z;
        this.zzbh = z1;
        this.zzhq = z2;
        this.zzhr = stockProfileImageEntity0;
        this.zzhs = z3;
        this.zzht = z4;
        this.zzhu = v;
        this.zzhv = z5;
        this.zzhw = z6;
        this.zzhx = v1;
        this.zzhy = v2;
    }

    @Override
    public boolean equals(Object object0) {
        if(!(object0 instanceof zza)) {
            return false;
        }
        if(this == object0) {
            return true;
        }
        String s = ((zza)object0).zzk();
        if(Objects.equal(this.zzbj, s)) {
            Boolean boolean0 = Boolean.valueOf(((zza)object0).zzv());
            if(Objects.equal(Boolean.valueOf(this.zzhp), boolean0)) {
                Boolean boolean1 = Boolean.valueOf(((zza)object0).zzn());
                if(Objects.equal(Boolean.valueOf(this.zzbh), boolean1)) {
                    Boolean boolean2 = Boolean.valueOf(((zza)object0).zzt());
                    if(Objects.equal(Boolean.valueOf(this.zzhq), boolean2)) {
                        Status status0 = ((zza)object0).getStatus();
                        if(Objects.equal(this.zzdw, status0)) {
                            StockProfileImage stockProfileImage0 = ((zza)object0).zzu();
                            if(Objects.equal(this.zzhr, stockProfileImage0)) {
                                Boolean boolean3 = Boolean.valueOf(((zza)object0).zzw());
                                if(Objects.equal(Boolean.valueOf(this.zzhs), boolean3)) {
                                    Boolean boolean4 = Boolean.valueOf(((zza)object0).zzx());
                                    if(Objects.equal(Boolean.valueOf(this.zzht), boolean4)) {
                                        int v = ((zza)object0).zzaa();
                                        if(this.zzhu == v) {
                                            boolean z = ((zza)object0).zzy();
                                            if(this.zzhv == z) {
                                                boolean z1 = ((zza)object0).zzz();
                                                if(this.zzhw == z1) {
                                                    int v1 = ((zza)object0).zzab();
                                                    if(this.zzhx == v1) {
                                                        int v2 = ((zza)object0).zzac();
                                                        return this.zzhy == v2;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override  // com.google.android.gms.common.api.Result
    public Status getStatus() {
        return this.zzdw;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zzbj, Boolean.valueOf(this.zzhp), Boolean.valueOf(this.zzbh), Boolean.valueOf(this.zzhq), this.zzdw, this.zzhr, Boolean.valueOf(this.zzhs), Boolean.valueOf(this.zzht), this.zzhu, Boolean.valueOf(this.zzhv), Boolean.valueOf(this.zzhw), this.zzhx, this.zzhy});
    }

    @Override
    public String toString() {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(this).add("GamerTag", this.zzbj).add("IsGamerTagExplicitlySet", Boolean.valueOf(this.zzhp)).add("IsProfileVisible", Boolean.valueOf(this.zzbh)).add("IsVisibilityExplicitlySet", Boolean.valueOf(this.zzhq)).add("Status", this.zzdw).add("StockProfileImage", this.zzhr).add("IsProfileDiscoverable", Boolean.valueOf(this.zzhs)).add("AutoSignIn", Boolean.valueOf(this.zzht)).add("httpErrorCode", this.zzhu).add("IsSettingsChangesProhibited", Boolean.valueOf(this.zzhv));
        char[] arr_c = {'\u0080', '«', '«', '®', '¶', '\u0085', '±', '¨', '¤', '­', '£', '\u0088', '­', 'µ', '¨', '³', '¤', '²'};
        for(int v1 = 0; v1 < 18; ++v1) {
            arr_c[v1] = (char)(arr_c[v1] - 0x3F);
        }
        ToStringHelper objects$ToStringHelper1 = objects$ToStringHelper0.add("AllowFriendInvites", Boolean.valueOf(this.zzhw)).add("ProfileVisibility", this.zzhx);
        char[] arr_c1 = {'¦', '«', '®', '¡', ' ', '«', '\u009E', '¥', '±', '¨', '¤', '­', '£', '²', '\u009E', '«', '¨', '²', '³', '\u009E', 'µ', '¨', '²', '¨', '¡', '¨', '«', '¨', '³', '¸'};
        for(int v = 0; v < 30; ++v) {
            arr_c1[v] = (char)(arr_c1[v] - 0x3F);
        }
        return objects$ToStringHelper1.add(new String(arr_c1), this.zzhy).toString();
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.getStatus(), v, false);
        SafeParcelWriter.writeString(parcel0, 2, this.zzbj, false);
        SafeParcelWriter.writeBoolean(parcel0, 3, this.zzhp);
        SafeParcelWriter.writeBoolean(parcel0, 4, this.zzbh);
        SafeParcelWriter.writeBoolean(parcel0, 5, this.zzhq);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.zzhr, v, false);
        SafeParcelWriter.writeBoolean(parcel0, 7, this.zzhs);
        SafeParcelWriter.writeBoolean(parcel0, 8, this.zzht);
        SafeParcelWriter.writeInt(parcel0, 9, this.zzhu);
        SafeParcelWriter.writeBoolean(parcel0, 10, this.zzhv);
        SafeParcelWriter.writeBoolean(parcel0, 11, this.zzhw);
        SafeParcelWriter.writeInt(parcel0, 12, this.zzhx);
        SafeParcelWriter.writeInt(parcel0, 13, this.zzhy);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final int zzaa() {
        return this.zzhu;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final int zzab() {
        return this.zzhx;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final int zzac() {
        return this.zzhy;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final String zzk() {
        return this.zzbj;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final boolean zzn() {
        return this.zzbh;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final boolean zzt() {
        return this.zzhq;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final StockProfileImage zzu() {
        return this.zzhr;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final boolean zzv() {
        return this.zzhp;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final boolean zzw() {
        return this.zzhs;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final boolean zzx() {
        return this.zzht;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final boolean zzy() {
        return this.zzhv;
    }

    @Override  // com.google.android.gms.games.Players$zza
    public final boolean zzz() {
        return this.zzhw;
    }
}

