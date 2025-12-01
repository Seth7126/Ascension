package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class ScreenshotEntity extends zzb implements Parcelable, Freezable {
    public static final Parcelable.Creator CREATOR;
    private final int height;
    private final Uri uri;
    private final int width;

    static {
        ScreenshotEntity.CREATOR = new zzc();
    }

    public ScreenshotEntity(Uri uri0, int v, int v1) {
        this.uri = uri0;
        this.width = v;
        this.height = v1;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof ScreenshotEntity) {
            return this == object0 ? true : Objects.equal(((ScreenshotEntity)object0).uri, this.uri) && Objects.equal(((ScreenshotEntity)object0).width, this.width) && Objects.equal(((ScreenshotEntity)object0).height, this.height);
        }
        return false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.uri, this.width, this.height});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("Uri", this.uri).add("Width", this.width).add("Height", this.height).toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeParcelable(parcel0, 1, this.uri, v, false);
        SafeParcelWriter.writeInt(parcel0, 2, this.width);
        SafeParcelWriter.writeInt(parcel0, 3, this.height);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }
}

