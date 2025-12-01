package androidx.core.app;

import android.app.AlarmManager.AlarmClockInfo;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build.VERSION;

public final class AlarmManagerCompat {
    public static void setAlarmClock(AlarmManager alarmManager0, long v, PendingIntent pendingIntent0, PendingIntent pendingIntent1) {
        alarmManager0.setAlarmClock(new AlarmManager.AlarmClockInfo(v, pendingIntent0), pendingIntent1);
    }

    public static void setAndAllowWhileIdle(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        if(Build.VERSION.SDK_INT >= 23) {
            alarmManager0.setAndAllowWhileIdle(v, v1, pendingIntent0);
            return;
        }
        alarmManager0.set(v, v1, pendingIntent0);
    }

    public static void setExact(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        alarmManager0.setExact(v, v1, pendingIntent0);
    }

    public static void setExactAndAllowWhileIdle(AlarmManager alarmManager0, int v, long v1, PendingIntent pendingIntent0) {
        if(Build.VERSION.SDK_INT >= 23) {
            alarmManager0.setExactAndAllowWhileIdle(v, v1, pendingIntent0);
            return;
        }
        AlarmManagerCompat.setExact(alarmManager0, v, v1, pendingIntent0);
    }
}

