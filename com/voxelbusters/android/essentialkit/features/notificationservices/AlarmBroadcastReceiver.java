package com.voxelbusters.android.essentialkit.features.notificationservices;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.voxelbusters.android.essentialkit.features.notificationservices.datatypes.Notification;
import com.voxelbusters.android.essentialkit.features.notificationservices.datatypes.TimeIntervalNotificationTrigger;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.util.Calendar;

public class AlarmBroadcastReceiver extends BroadcastReceiver {
    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        try {
            Bundle bundle0 = intent0.getBundleExtra("bundle");
            String s = bundle0.getString("EVENT_TYPE");
            Logger.debug("Received Alarm event ");
            if(s.equals("EVENT_FOR_NOTIFICATION")) {
                Notification notification0 = (Notification)bundle0.getParcelable("DATA");
                notification0.dispatch(context0);
                NotificationStore.deleteScheduledNotification(context0, notification0);
                if(notification0.trigger != null && notification0.trigger.repeat) {
                    TimeIntervalNotificationTrigger timeIntervalNotificationTrigger0 = (TimeIntervalNotificationTrigger)notification0.trigger;
                    Calendar.getInstance().add(14, ((int)timeIntervalNotificationTrigger0.timeInterval));
                    timeIntervalNotificationTrigger0.updateStartTimestamp(System.currentTimeMillis());
                    new AlarmScheduler(context0).schedule(notification0, null);
                }
            }
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Logger.error("Error on receiving Alarm notification");
        }
    }
}

