package com.voxelbusters.android.essentialkit.features.notificationservices;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.voxelbusters.android.essentialkit.features.notificationservices.datatypes.Notification;
import com.voxelbusters.android.essentialkit.features.notificationservices.datatypes.TimeIntervalNotificationTrigger;
import com.voxelbusters.android.essentialkit.utilities.Logger;
import java.util.Date;

public class AlarmScheduler {
    public static String ALARM_EVENT_FOR_NOTIFICATION = "EVENT_FOR_NOTIFICATION";
    public static String DATA = "DATA";
    public static String EVENT_TYPE = "EVENT_TYPE";
    public final String TAG;
    private Context context;

    static {
    }

    public AlarmScheduler(Context context0) {
        this.TAG = "[Native Plugins : AlarmEventReceiver]";
        this.context = context0;
    }

    public void cancel(Notification notification0) {
        Intent intent0 = new Intent(this.context, AlarmBroadcastReceiver.class);
        String s = notification0.getPersistenceId();
        intent0.setData(Uri.parse(("custom://" + s)));
        intent0.setAction(s);
        PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.context, 0, intent0, (Build.VERSION.SDK_INT < 30 ? 0x20000000 : 0x24000000));
        AlarmManager alarmManager0 = (AlarmManager)this.context.getSystemService("alarm");
        Logger.debug((pendingIntent0 + " " + Uri.parse(("custom://" + s))));
        if(pendingIntent0 != null) {
            alarmManager0.cancel(pendingIntent0);
        }
        NotificationStore.deleteScheduledNotification(this.context, notification0);
    }

    public void cancel(String s) {
        Notification notification0 = null;
        for(Object object0: NotificationStore.getScheduledNotifications(this.context)) {
            Notification notification1 = (Notification)object0;
            if(notification1.id.equals(s)) {
                notification0 = notification1;
                break;
            }
        }
        if(notification0 != null) {
            this.cancel(notification0);
            NotificationStore.deleteScheduledNotification(this.context, notification0);
        }
    }

    public void schedule(Notification notification0, IScheduleNotificationListener iNotificationServices$IScheduleNotificationListener0) {
        try {
            this.cancel(notification0.id);
            Intent intent0 = new Intent(this.context, AlarmBroadcastReceiver.class);
            intent0.setData(Uri.parse(("custom://" + notification0.getPersistenceId())));
            intent0.setAction(notification0.getPersistenceId());
            Bundle bundle0 = new Bundle();
            bundle0.putParcelable("DATA", notification0);
            bundle0.putString("EVENT_TYPE", "EVENT_FOR_NOTIFICATION");
            intent0.putExtra("bundle", bundle0);
            int v = Build.VERSION.SDK_INT <= 30 ? 0 : 0x4000000;
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.context.getApplicationContext(), 0, intent0, v);
            AlarmManager alarmManager0 = (AlarmManager)this.context.getSystemService("alarm");
            TimeIntervalNotificationTrigger timeIntervalNotificationTrigger0 = (TimeIntervalNotificationTrigger)notification0.trigger;
            Date date0 = timeIntervalNotificationTrigger0 == null ? new Date(System.currentTimeMillis()) : timeIntervalNotificationTrigger0.getNextTriggerDate();
            System.out.println("Alarm scheduling in secs : " + (date0.getTime() - System.currentTimeMillis()));
            if(Build.VERSION.SDK_INT < 23) {
                alarmManager0.setExact(0, date0.getTime(), pendingIntent0);
            }
            else {
                alarmManager0.setExactAndAllowWhileIdle(0, date0.getTime(), pendingIntent0);
            }
            NotificationStore.saveScheduledNotification(this.context, notification0);
            if(iNotificationServices$IScheduleNotificationListener0 != null) {
                iNotificationServices$IScheduleNotificationListener0.onSuccess();
            }
        }
        catch(Exception exception0) {
            Logger.error(("Failed scheduling notification : " + exception0.getMessage()));
            if(iNotificationServices$IScheduleNotificationListener0 != null) {
                iNotificationServices$IScheduleNotificationListener0.onFailure("Failed scheduling notification");
            }
        }
    }
}

