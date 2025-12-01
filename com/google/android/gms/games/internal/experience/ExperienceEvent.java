package com.google.android.gms.games.internal.experience;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;

public interface ExperienceEvent extends Parcelable, Freezable {
    Game getGame();

    Uri getIconImageUri();

    @Deprecated
    String getIconImageUrl();

    int getType();

    String zzbq();

    String zzbr();

    String zzbs();

    long zzbt();

    long zzbu();

    long zzbv();

    int zzbw();
}

