package com.voxelbusters.android.essentialkit.features.notificationservices.datatypes;

import android.content.Context;

public class NotificationChannel {
    private Context context;

    public NotificationChannel(Context context0) {
        this.context = context0;
    }

    public boolean create(String channelId, String name, int importance) {
        return false;
    }
}

