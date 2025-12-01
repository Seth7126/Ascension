package com.google.android.gms.games;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects.ToStringHelper;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class zzm extends zzb implements PlayerRelationshipInfo {
    public static final Parcelable.Creator CREATOR;
    private int zzcb;
    private String zzcc;
    private String zzcd;
    private String zzce;

    static {
        zzm.CREATOR = new zzl();
    }

    public zzm(int v, String s, String s1, String s2) {
        this.zzcb = v;
        this.zzcc = s;
        this.zzcd = s1;
        this.zzce = s2;
    }

    public zzm(PlayerRelationshipInfo playerRelationshipInfo0) {
        this.zzcb = playerRelationshipInfo0.getFriendStatus();
        this.zzcc = playerRelationshipInfo0.zzq();
        this.zzcd = playerRelationshipInfo0.zzr();
        this.zzce = playerRelationshipInfo0.zzs();
    }

    @Override
    public final boolean equals(Object object0) {
        return zzm.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final int getFriendStatus() {
        return this.zzcb;
    }

    @Override
    public final int hashCode() {
        return zzm.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return zzm.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeInt(parcel0, 1, this.getFriendStatus());
        SafeParcelWriter.writeString(parcel0, 2, this.zzcc, false);
        SafeParcelWriter.writeString(parcel0, 3, this.zzcd, false);
        SafeParcelWriter.writeString(parcel0, 4, this.zzce, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    static int zza(PlayerRelationshipInfo playerRelationshipInfo0) {
        return Objects.hashCode(new Object[]{playerRelationshipInfo0.getFriendStatus(), playerRelationshipInfo0.zzq(), playerRelationshipInfo0.zzr(), playerRelationshipInfo0.zzs()});
    }

    static boolean zza(PlayerRelationshipInfo playerRelationshipInfo0, Object object0) {
        if(!(object0 instanceof PlayerRelationshipInfo)) {
            return false;
        }
        return object0 == playerRelationshipInfo0 ? true : ((PlayerRelationshipInfo)object0).getFriendStatus() == playerRelationshipInfo0.getFriendStatus() && Objects.equal(((PlayerRelationshipInfo)object0).zzq(), playerRelationshipInfo0.zzq()) && Objects.equal(((PlayerRelationshipInfo)object0).zzr(), playerRelationshipInfo0.zzr()) && Objects.equal(((PlayerRelationshipInfo)object0).zzs(), playerRelationshipInfo0.zzs());
    }

    static String zzb(PlayerRelationshipInfo playerRelationshipInfo0) {
        ToStringHelper objects$ToStringHelper0 = Objects.toStringHelper(playerRelationshipInfo0);
        objects$ToStringHelper0.add("FriendStatus", playerRelationshipInfo0.getFriendStatus());
        if(playerRelationshipInfo0.zzq() != null) {
            objects$ToStringHelper0.add("Nickname", playerRelationshipInfo0.zzq());
        }
        if(playerRelationshipInfo0.zzr() != null) {
            objects$ToStringHelper0.add("InvitationNickname", playerRelationshipInfo0.zzr());
        }
        if(playerRelationshipInfo0.zzs() != null) {
            objects$ToStringHelper0.add("NicknameAbuseReportToken", playerRelationshipInfo0.zzr());
        }
        return objects$ToStringHelper0.toString();
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzq() {
        return this.zzcc;
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzr() {
        return this.zzcd;
    }

    @Override  // com.google.android.gms.games.PlayerRelationshipInfo
    public final String zzs() {
        return this.zzce;
    }
}

