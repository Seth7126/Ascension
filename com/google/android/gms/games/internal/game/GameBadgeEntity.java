package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.games.internal.GamesDowngradeableSafeParcel;

public final class GameBadgeEntity extends GamesDowngradeableSafeParcel implements zza {
    static final class com.google.android.gms.games.internal.game.GameBadgeEntity.zza extends zzb {
        @Override  // com.google.android.gms.games.internal.game.zzb
        public final Object createFromParcel(Parcel parcel0) {
            return this.zzd(parcel0);
        }

        @Override  // com.google.android.gms.games.internal.game.zzb
        public final GameBadgeEntity zzd(Parcel parcel0) {
            if(!GameBadgeEntity.zzb(GameBadgeEntity.getUnparcelClientVersion()) && !GameBadgeEntity.canUnparcelSafely(GameBadgeEntity.class.getCanonicalName())) {
                int v = parcel0.readInt();
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                String s2 = parcel0.readString();
                return s2 == null ? new GameBadgeEntity(v, s, s1, null) : new GameBadgeEntity(v, s, s1, Uri.parse(s2));
            }
            return super.zzd(parcel0);
        }
    }

    public static final Parcelable.Creator CREATOR;
    private String description;
    private int type;
    private String zzbe;
    private Uri zzm;

    static {
        GameBadgeEntity.CREATOR = new com.google.android.gms.games.internal.game.GameBadgeEntity.zza();
    }

    GameBadgeEntity(int v, String s, String s1, Uri uri0) {
        this.type = v;
        this.zzbe = s;
        this.description = s1;
        this.zzm = uri0;
    }

    @Override
    public final boolean equals(Object object0) {
        if(object0 instanceof zza) {
            return this == object0 ? true : Objects.equal(((zza)object0).getType(), this.getTitle()) && Objects.equal(((zza)object0).getDescription(), this.getIconImageUri());
        }
        return false;
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        return this;
    }

    @Override  // com.google.android.gms.games.internal.game.zza
    public final String getDescription() {
        return this.description;
    }

    @Override  // com.google.android.gms.games.internal.game.zza
    public final Uri getIconImageUri() {
        return this.zzm;
    }

    @Override  // com.google.android.gms.games.internal.game.zza
    public final String getTitle() {
        return this.zzbe;
    }

    @Override  // com.google.android.gms.games.internal.game.zza
    public final int getType() {
        return this.type;
    }

    @Override
    public final int hashCode() {
        return Objects.hashCode(new Object[]{this.getType(), this.getTitle(), this.getDescription(), this.getIconImageUri()});
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final boolean isDataValid() {
        return true;
    }

    @Override
    public final String toString() {
        return Objects.toStringHelper(this).add("Type", this.getType()).add("Title", this.getTitle()).add("Description", this.getDescription()).add("IconImageUri", this.getIconImageUri()).toString();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        if(!this.shouldDowngrade()) {
            int v1 = SafeParcelWriter.beginObjectHeader(parcel0);
            SafeParcelWriter.writeInt(parcel0, 1, this.type);
            SafeParcelWriter.writeString(parcel0, 2, this.zzbe, false);
            SafeParcelWriter.writeString(parcel0, 3, this.description, false);
            SafeParcelWriter.writeParcelable(parcel0, 4, this.zzm, v, false);
            SafeParcelWriter.finishObjectHeader(parcel0, v1);
            return;
        }
        parcel0.writeInt(this.type);
        parcel0.writeString(this.zzbe);
        parcel0.writeString(this.description);
        parcel0.writeString((this.zzm == null ? null : this.zzm.toString()));
    }
}

