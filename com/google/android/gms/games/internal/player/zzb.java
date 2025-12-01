package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

public final class zzb extends DataBufferRef implements zza {
    private final zzd zzg;

    public zzb(DataHolder dataHolder0, int v, zzd zzd0) {
        super(dataHolder0, v);
        this.zzg = zzd0;
    }

    @Override  // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object object0) {
        return MostRecentGameInfoEntity.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return new MostRecentGameInfoEntity(this);
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        return MostRecentGameInfoEntity.zza(this);
    }

    @Override
    public final String toString() {
        return MostRecentGameInfoEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        ((MostRecentGameInfoEntity)(((zza)this.freeze()))).writeToParcel(parcel0, v);
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final String zzbx() {
        return this.getString(this.zzg.zzir);
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final String zzby() {
        return this.getString(this.zzg.zzis);
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final long zzbz() {
        return this.getLong(this.zzg.zzit);
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final Uri zzca() {
        return this.parseUri(this.zzg.zziu);
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final Uri zzcb() {
        return this.parseUri(this.zzg.zziv);
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final Uri zzcc() {
        return this.parseUri(this.zzg.zziw);
    }
}

