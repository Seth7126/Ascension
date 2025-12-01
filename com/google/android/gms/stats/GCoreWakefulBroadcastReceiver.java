package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;

public abstract class GCoreWakefulBroadcastReceiver extends WakefulBroadcastReceiver {
    private static String TAG = "GCoreWakefulBroadcastReceiver";

    static {
    }

    public static boolean completeWakefulIntent(Context context0, Intent intent0) {
        if(intent0 == null) {
            return false;
        }
        if(context0 != null) {
            return WakefulBroadcastReceiver.completeWakefulIntent(intent0);
        }
        String s = intent0.toUri(0);
        Log.w("GCoreWakefulBroadcastReceiver", (s.length() == 0 ? new String("context shouldn\'t be null. intent: ") : "context shouldn\'t be null. intent: " + s));
        return WakefulBroadcastReceiver.completeWakefulIntent(intent0);
    }
}

