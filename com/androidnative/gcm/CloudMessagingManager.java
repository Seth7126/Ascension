package com.androidnative.gcm;

import android.app.NotificationManager;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.util.Log;
import com.androidnative.gms.utils.AnUtility;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.unity3d.player.UnityPlayer;
import java.io.IOException;

public class CloudMessagingManager {
    public static final String DATA_KEY = "ANDROID_NATIVE_GCM_DATA";
    public static final String LARGE_ICON_NAME = "LARGE_ICON_NAME";
    public static final String MESSAGE_SERVICE_LISTNER_NAME = "GoogleCloudMessageService";
    public static final String NOTIFICATION_COLOR = "NOTIFICATION_COLOR";
    public static final String PN_PREFS_KEY = "AN_PushNotificationBundle";
    public static final String PROPERTY_MESSAGE = "property_message";
    public static final String REPLACE_OLD_WITH_NEW = "REPLACE_OLD_WITH_NEW";
    private String SENDER_ID;
    public static final String SHOW_WHEN_APP_FOREGROUND = "SHOW_WHEN_APP_FOREGROUND";
    public static final String SMALL_ICON_NAME = "SMALL_ICON_NAME";
    public static final String SOUND_NAME = "SOUND_NAME";
    public static final String SOUND_SILENT = "SILENT";
    static final String TAG = "AndroidNative";
    public static final String VIBRATION = "VIBRATION";
    private static CloudMessagingManager _inctance;
    private GoogleCloudMessaging gcm;
    private String regid;

    static {
    }

    public CloudMessagingManager() {
        this.SENDER_ID = "Your-Sender-ID";
        this.gcm = GoogleCloudMessaging.getInstance(AnUtility.GetLauncherActivity());
    }

    public static void GCMLoadLastMessage() {
        try {
            CloudMessagingManager.GetInstance().LoadLastMessage();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError GCMLoadLastMessage: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void GCMRemoveLastMessageInfo() {
        try {
            CloudMessagingManager.GetInstance().RemoveLastMessageInfo();
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError GCMLoadLastMessage: " + noClassDefFoundError0.getMessage());
        }
    }

    public static void GCMRgisterDevice(String s) {
        try {
            CloudMessagingManager.GetInstance().registerDevice(s);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError GCMRgisterDevice: " + noClassDefFoundError0.getMessage());
        }
    }

    public static CloudMessagingManager GetInstance() {
        if(CloudMessagingManager._inctance == null) {
            CloudMessagingManager._inctance = new CloudMessagingManager();
        }
        return CloudMessagingManager._inctance;
    }

    public static void HideAllNotifications() {
        ((NotificationManager)AnUtility.GetApplicationContex().getSystemService("notification")).cancelAll();
    }

    public void InitNotificationParams(String s, String s1, String s2, boolean z, boolean z1, boolean z2, String s3) {
        SharedPreferences sharedPreferences0 = AnUtility.GetLauncherActivity().getSharedPreferences("AN_PushNotificationBundle", 0);
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.putString("SMALL_ICON_NAME", s);
        sharedPreferences$Editor0.putString("LARGE_ICON_NAME", s1);
        sharedPreferences$Editor0.putString("SOUND_NAME", s2);
        sharedPreferences$Editor0.putBoolean("VIBRATION", z);
        sharedPreferences$Editor0.putBoolean("SHOW_WHEN_APP_FOREGROUND", z1);
        sharedPreferences$Editor0.putBoolean("REPLACE_OLD_WITH_NEW", z2);
        sharedPreferences$Editor0.putString("NOTIFICATION_COLOR", s3);
        if(sharedPreferences0.contains("ANDROID_NATIVE_GCM_DATA")) {
            String s4 = sharedPreferences0.getString("ANDROID_NATIVE_GCM_DATA", "");
            try {
                UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "GCMNotificationLaunchedCallback", s4);
                Log.d("AndroidNative", "[sendPushCallback] data: " + s4);
            }
            catch(UnsatisfiedLinkError unused_ex) {
                Log.d("AndroidNative", "Trying to call GCM push received callback, but the App closed!");
            }
            sharedPreferences$Editor0.remove("ANDROID_NATIVE_GCM_DATA");
        }
        sharedPreferences$Editor0.apply();
    }

    public static void InitPushNotifications(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        try {
            CloudMessagingManager.GetInstance().InitNotificationParams(s, s1, s2, Boolean.parseBoolean(s3), Boolean.parseBoolean(s4), Boolean.parseBoolean(s5), s6);
        }
        catch(NoClassDefFoundError noClassDefFoundError0) {
            Log.d("AndroidNative", "NoClassDefFoundError InitPushNotifications: " + noClassDefFoundError0.getMessage());
        }
    }

    public void LoadLastMessage() {
        UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "OnLastMessageLoaded", AnUtility.GetLauncherActivity().getApplicationContext().getSharedPreferences("MyPref", 0).getString("property_message", ""));
    }

    public void RemoveLastMessageInfo() {
        SharedPreferences.Editor sharedPreferences$Editor0 = AnUtility.GetLauncherActivity().getApplicationContext().getSharedPreferences("MyPref", 0).edit();
        sharedPreferences$Editor0.remove("property_message");
        sharedPreferences$Editor0.apply();
    }

    public void registerDevice(String s) {
        if(AnUtility.checkPlayServices()) {
            this.SENDER_ID = s;
            this.registerInBackground();
            return;
        }
        Log.i("AndroidNative", "No valid Google Play Services APK found.");
        UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "OnRegistrationFailed", "");
    }

    private void registerInBackground() {
        new AsyncTask() {
            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.doInBackground(((Void[])arr_object));
            }

            protected String doInBackground(Void[] arr_void) {
                try {
                    String s = CloudMessagingManager.this.gcm.register(new String[]{CloudMessagingManager.this.SENDER_ID});
                    CloudMessagingManager.this.regid = s;
                    CloudMessagingManager.this.sendRegistrationIdToBackend();
                    return "Registration ID = " + CloudMessagingManager.this.regid;
                }
                catch(IOException iOException0) {
                    Log.i("AndroidNative", "registerInBackground error.");
                    UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "OnRegistrationFailed", "");
                    return "Error :" + iOException0.getMessage();
                }
            }

            @Override  // android.os.AsyncTask
            protected void onPostExecute(Object object0) {
                this.onPostExecute(((String)object0));
            }

            protected void onPostExecute(String s) {
                Log.i("AndroidNative", "GCM: SENDER ID: " + CloudMessagingManager.this.SENDER_ID);
                Log.i("AndroidNative", "GCM: " + s);
            }
        }.execute(new Void[]{null, null, null});
    }

    private void sendRegistrationIdToBackend() {
        UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "OnRegistrationReviced", this.regid);
    }
}

