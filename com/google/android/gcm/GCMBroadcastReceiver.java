package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class GCMBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "GCMBroadcastReceiver";
    private static boolean mReceiverSet;

    static {
    }

    // 去混淆评级： 低(20)
    static final String getDefaultIntentServiceClassName(Context context0) {
        return "com.playdekgames.android.Ascension.GCMIntentService";
    }

    protected String getGCMIntentServiceClassName(Context context0) {
        return GCMBroadcastReceiver.getDefaultIntentServiceClassName(context0);
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        Log.v("GCMBroadcastReceiver", "onReceive: " + intent0.getAction());
        if(!GCMBroadcastReceiver.mReceiverSet) {
            GCMBroadcastReceiver.mReceiverSet = true;
            String s = this.getClass().getName();
            if(!s.equals("com.google.android.gcm.GCMBroadcastReceiver")) {
                GCMRegistrar.setRetryReceiverClassName(s);
            }
        }
        String s1 = this.getGCMIntentServiceClassName(context0);
        Log.v("GCMBroadcastReceiver", "GCM IntentService class: " + s1);
        GCMBaseIntentService.runIntentInService(context0, intent0, s1);
        this.setResult(-1, null, null);
    }
}

