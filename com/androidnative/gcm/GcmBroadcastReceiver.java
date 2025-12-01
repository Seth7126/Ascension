package com.androidnative.gcm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.util.Log;
import androidx.legacy.content.WakefulBroadcastReceiver;

public class GcmBroadcastReceiver extends WakefulBroadcastReceiver {
    public static final String ACTION_OPEN = "com.androidnative.push.intent.OPEN";
    public static final String ACTION_RECEIVE = "com.androidnative.push.intent.RECEIVE";

    @Override  // android.content.BroadcastReceiver
    public void onReceive(Context context0, Intent intent0) {
        Log.d("AndroidNative", "GcmBroadcastReceiver onReceive");
        String s = intent0.getAction();
        Log.d("AndroidNative", "GcmBroadcastReceiver onReceive " + s);
        if(s.equals("com.androidnative.push.intent.OPEN")) {
            Bundle bundle0 = intent0.getExtras();
            SharedPreferences.Editor sharedPreferences$Editor0 = context0.getSharedPreferences("AN_PushNotificationBundle", 0).edit();
            sharedPreferences$Editor0.putString("ANDROID_NATIVE_GCM_DATA", bundle0.getString("data"));
            sharedPreferences$Editor0.apply();
            context0.startActivity(context0.getPackageManager().getLaunchIntentForPackage("com.playdekgames.android.Ascension"));
            return;
        }
        GcmBroadcastReceiver.startWakefulService(context0, intent0.setComponent(new ComponentName("com.playdekgames.android.Ascension", "com.androidnative.gcm.GcmIntentService")));
        this.setResultCode(-1);
    }
}

