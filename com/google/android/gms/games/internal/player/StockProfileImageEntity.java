package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class StockProfileImageEntity extends zzb implements StockProfileImage {
    public static final Parcelable.Creator CREATOR;
    private final String zzjl;
    private final Uri zzjm;

    static {
        StockProfileImageEntity.CREATOR = new zzf();
    }

    public StockProfileImageEntity(String s, Uri uri0) {
        this.zzjl = s;
        this.zzjm = uri0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(!(object0 instanceof StockProfileImage)) {
            return false;
        }
        if(object0 == this) {
            return true;
        }
        String s = ((StockProfileImage)object0).getImageUrl();
        if(Objects.equal(this.zzjl, s)) {
            Uri uri0 = ((StockProfileImage)object0).zzcd();
            return Objects.equal(this.zzjm, uri0);
        }
        return false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.internal.player.StockProfileImage
    public final String getImageUrl() {
        return this.zzjl;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.zzjl, this.zzjm});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("ImageId", this.zzjl).add("ImageUri", this.zzjm).toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.getImageUrl(), false);
        SafeParcelWriter.writeParcelable(parcel0, 2, this.zzjm, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    @Override  // com.google.android.gms.games.internal.player.StockProfileImage
    public final Uri zzcd() {
        return this.zzjm;
    }
}

