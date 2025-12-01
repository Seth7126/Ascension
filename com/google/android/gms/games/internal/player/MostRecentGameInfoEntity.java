package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.zzb;

public final class MostRecentGameInfoEntity extends zzb implements zza {
    public static final Parcelable.Creator CREATOR;
    private final String zzhj;
    private final String zzhk;
    private final long zzhl;
    private final Uri zzhm;
    private final Uri zzhn;
    private final Uri zzho;

    static {
        MostRecentGameInfoEntity.CREATOR = new zzc();
    }

    public MostRecentGameInfoEntity(zza zza0) {
        this.zzhj = zza0.zzbx();
        this.zzhk = zza0.zzby();
        this.zzhl = zza0.zzbz();
        this.zzhm = zza0.zzca();
        this.zzhn = zza0.zzcb();
        this.zzho = zza0.zzcc();
    }

    MostRecentGameInfoEntity(String s, String s1, long v, Uri uri0, Uri uri1, Uri uri2) {
        this.zzhj = s;
        this.zzhk = s1;
        this.zzhl = v;
        this.zzhm = uri0;
        this.zzhn = uri1;
        this.zzho = uri2;
    }

    @Override
    public final boolean equals(Object object0) {
        return MostRecentGameInfoEntity.zza(this, object0);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override
    public final int hashCode() {
        return MostRecentGameInfoEntity.zza(this);
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return MostRecentGameInfoEntity.zzb(this);
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
        SafeParcelWriter.writeString(parcel0, 1, this.zzhj, false);
        SafeParcelWriter.writeString(parcel0, 2, this.zzhk, false);
        SafeParcelWriter.writeLong(parcel0, 3, this.zzhl);
        SafeParcelWriter.writeParcelable(parcel0, 4, this.zzhm, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 5, this.zzhn, v, false);
        SafeParcelWriter.writeParcelable(parcel0, 6, this.zzho, v, false);
        SafeParcelWriter.finishObjectHeader(parcel0, v1);
    }

    static int zza(zza zza0) {
        return Objects.hashCode(new Object[]{zza0.zzbx(), zza0.zzby(), zza0.zzbz(), zza0.zzca(), zza0.zzcb(), zza0.zzcc()});
    }

    // 去混淆评级： 低(26)
    static boolean zza(zza zza0, Object object0) {
        if(!(object0 instanceof zza)) {
            return false;
        }
        return zza0 == object0 ? true : Objects.equal(((zza)object0).zzbx(), zza0.zzbx()) && Objects.equal(((zza)object0).zzby(), zza0.zzby()) && Objects.equal(((zza)object0).zzbz(), zza0.zzbz()) && Objects.equal(((zza)object0).zzca(), zza0.zzca()) && Objects.equal(((zza)object0).zzcb(), zza0.zzcb()) && Objects.equal(((zza)object0).zzcc(), zza0.zzcc());
    }

    static String zzb(zza zza0) {
        return Objects.toStringHelper(zza0).add("GameId", zza0.zzbx()).add("GameName", zza0.zzby()).add("ActivityTimestampMillis", zza0.zzbz()).add("GameIconUri", zza0.zzca()).add("GameHiResUri", zza0.zzcb()).add("GameFeaturedUri", zza0.zzcc()).toString();
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final String zzbx() {
        return this.zzhj;
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final String zzby() {
        return this.zzhk;
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final long zzbz() {
        return this.zzhl;
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final Uri zzca() {
        return this.zzhm;
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final Uri zzcb() {
        return this.zzhn;
    }

    @Override  // com.google.android.gms.games.internal.player.zza
    public final Uri zzcc() {
        return this.zzho;
    }
}

