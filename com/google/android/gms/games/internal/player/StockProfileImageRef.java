package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;

public class StockProfileImageRef extends DataBufferRef implements StockProfileImage {
    @Override  // android.os.Parcelable
    public int describeContents() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public Object freeze() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.player.StockProfileImage
    public String getImageUrl() {
        return this.getString("image_url");
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.player.StockProfileImage
    public final Uri zzcd() {
        throw new NoSuchMethodError();
    }
}

