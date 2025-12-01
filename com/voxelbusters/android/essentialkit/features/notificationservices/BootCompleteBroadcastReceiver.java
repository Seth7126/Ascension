package com.voxelbusters.android.essentialkit.features.notificationservices;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.voxelbusters.android.essentialkit.features.notificationservices.datatypes.Notification;
import com.voxelbusters.android.essentialkit.utilities.Logger;

public class BootCompleteBroadcastReceiver extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        try {
            Logger.debug("Received broadcast on boot complete message...");
            for(Object object0: NotificationStore.getScheduledNotifications(context0)) {
                new AlarmScheduler(context0).schedule(((Notification)object0), null);
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Logger.error("Error on receiving Boot complete broadcast");
        }
    }
}

