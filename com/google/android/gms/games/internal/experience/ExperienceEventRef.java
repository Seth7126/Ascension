package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.games.Game;

public final class ExperienceEventRef extends DataBufferRef implements ExperienceEvent {
    @Override  // android.os.Parcelable
    public final int describeContents() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final boolean equals(Object object0) {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.common.data.Freezable
    public final Object freeze() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Game getGame() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final Uri getIconImageUri() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String getIconImageUrl() {
        return this.getString("icon_url");
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int getType() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.common.data.DataBufferRef
    public final int hashCode() {
        throw new NoSuchMethodError();
    }

    @Override
    public final String toString() {
        throw new NoSuchMethodError();
    }

    @Override  // android.os.Parcelable
    public final void writeToParcel(Parcel parcel0, int v) {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbq() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbr() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final String zzbs() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbt() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbu() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final long zzbv() {
        throw new NoSuchMethodError();
    }

    @Override  // com.google.android.gms.games.internal.experience.ExperienceEvent
    public final int zzbw() {
        throw new NoSuchMethodError();
    }
}

