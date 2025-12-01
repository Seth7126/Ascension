package com.androidnative.gcm;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.ActivityManager;
import android.app.IntentService;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import androidx.core.app.NotificationCompat.BigTextStyle;
import androidx.core.app.NotificationCompat.Builder;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.unity3d.player.UnityPlayer;
import java.util.Iterator;
import java.util.StringTokenizer;
import org.json.JSONException;
import org.json.JSONObject;

public class GcmIntentService extends IntentService {
    public static final int NOTIFICATION_ID = 1;
    public static final String TAG = "AndroidNative";
    Builder builder;
    private NotificationManager mNotificationManager;

    public GcmIntentService() {
        super("GcmIntentService");
    }

    public void SaveMessgaBundle(Bundle bundle0) {
        SharedPreferences.Editor sharedPreferences$Editor0 = this.getApplicationContext().getSharedPreferences("MyPref", 0).edit();
        sharedPreferences$Editor0.putString("property_message", bundle0.toString());
        sharedPreferences$Editor0.commit();
        Log.i("AndroidNative", "Push Notification Saved");
    }

    public static boolean isForegroundRunning(Context context0) {
        int v;
        Iterator iterator0 = ((ActivityManager)context0.getSystemService("activity")).getRunningAppProcesses().iterator();
    alab1:
        while(true) {
            do {
                v = 0;
                if(!iterator0.hasNext()) {
                    break alab1;
                }
                Object object0 = iterator0.next();
                ActivityManager.RunningAppProcessInfo activityManager$RunningAppProcessInfo0 = (ActivityManager.RunningAppProcessInfo)object0;
                if(activityManager$RunningAppProcessInfo0.importance != 100) {
                    continue alab1;
                }
                String[] arr_s = activityManager$RunningAppProcessInfo0.pkgList;
            label_7:
            }
            while(v >= arr_s.length);
            if(!arr_s[v].equals("com.playdekgames.android.Ascension")) {
                ++v;
                goto label_7;
            }
            return true;
        }
        return false;
    }

    @Override  // android.app.IntentService
    protected void onHandleIntent(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        String s = GoogleCloudMessaging.getInstance(this).getMessageType(intent0);
        Log.d("AndroidNative", "GcmIntentService onHandleIntent " + intent0.getAction());
        if(!bundle0.isEmpty() && !"send_error".equals(s) && !"deleted_messages".equals(s) && "gcm".equals(s)) {
            this.sendNotification(intent0, bundle0);
            Log.i("AndroidNative", "Received: " + bundle0.toString());
        }
        GcmBroadcastReceiver.completeWakefulIntent(intent0);
    }

    private void sendNotification(Intent intent0, Bundle bundle0) {
        String s10;
        String s9;
        JSONException jSONException1;
        String s8;
        String s7;
        JSONObject jSONObject0;
        boolean z3;
        Log.i("AndroidNative", "Push Notification Sended: ");
        try {
            this.SaveMessgaBundle(bundle0);
            SharedPreferences sharedPreferences0 = this.getApplicationContext().getSharedPreferences("AN_PushNotificationBundle", 0);
            String s = sharedPreferences0.getString("SMALL_ICON_NAME", "");
            String s1 = sharedPreferences0.getString("LARGE_ICON_NAME", "");
            String s2 = sharedPreferences0.getString("SOUND_NAME", "");
            boolean z = sharedPreferences0.getBoolean("VIBRATION", false);
            boolean z1 = sharedPreferences0.getBoolean("SHOW_WHEN_APP_FOREGROUND", true);
            boolean z2 = sharedPreferences0.getBoolean("REPLACE_OLD_WITH_NEW", false);
            String s3 = sharedPreferences0.getString("NOTIFICATION_COLOR", "255|255|255|255");
            Log.d("AndroidNative", "Push Notification Show when App Is Foreground " + z1);
            if(z1 || !GcmIntentService.isForegroundRunning(this.getApplicationContext())) {
                z3 = true;
            }
            else {
                Log.d("AndroidNative", "App is Foreground, so don\'t show received push notification");
                z3 = false;
            }
            String s4 = bundle0.getString("title");
            String s5 = bundle0.getString("alert");
            String s6 = bundle0.getString("json");
            Log.d("AndroidNative", "GCM Push Notification data received " + s6);
            try {
                jSONObject0 = new JSONObject(s6);
                s7 = s3;
                s8 = jSONObject0.optString("big_picture_url");
                s7 = s3;
            }
            catch(JSONException jSONException0) {
                jSONException1 = jSONException0;
                s9 = "";
                goto label_34;
            }
            try {
                s10 = jSONObject0.optString("notification_alert");
                goto label_36;
            }
            catch(JSONException jSONException2) {
                jSONException1 = jSONException2;
                s9 = s8;
            }
        label_34:
            String s11 = null;
            goto label_42;
            try {
            label_36:
                Log.d("AndroidNative", "Big Picture Push Notification style detedted. Big Piucture URL: " + s8);
                goto label_45;
            }
            catch(JSONException jSONException3) {
                jSONException1 = jSONException3;
                s9 = s8;
                s11 = s10;
            }
        label_42:
            Log.d("AndroidNative", "Push Notification JSON parse error " + jSONException1.getMessage());
            s10 = s11;
            s8 = s9;
        label_45:
            this.mNotificationManager = (NotificationManager)this.getSystemService("notification");
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(s5);
            stringBuilder0.append("|");
            stringBuilder0.append(s6);
            if(z3) {
                Intent intent1 = new Intent("com.androidnative.push.intent.OPEN");
                intent1.putExtra("data", stringBuilder0.toString());
                int v = z2 ? 1 : ((int)System.currentTimeMillis());
                Log.d("AndroidNative", "Data retrived, requestID: " + v);
                PendingIntent pendingIntent0 = PendingIntent.getBroadcast(this.getApplicationContext(), 1, intent1, 0x8000000);
                Resources resources0 = this.getResources();
                int v1 = resources0.getIdentifier(s, "drawable", "com.playdekgames.android.Ascension");
                if(v1 == 0) {
                    v1 = 0x7F020000;  // bool:notification_services_uses_external_service
                }
                Builder notificationCompat$Builder0 = new Builder(this).setSmallIcon(v1).setContentTitle(s4).setContentText(s5);
                StringTokenizer stringTokenizer0 = new StringTokenizer(s7, "|");
                notificationCompat$Builder0.setColor(Color.argb(Integer.parseInt(stringTokenizer0.nextToken()), Integer.parseInt(stringTokenizer0.nextToken()), Integer.parseInt(stringTokenizer0.nextToken()), Integer.parseInt(stringTokenizer0.nextToken())));
                int v2 = resources0.getIdentifier(s1, "drawable", "com.playdekgames.android.Ascension");
                if(v2 != 0) {
                    notificationCompat$Builder0.setLargeIcon(BitmapFactory.decodeResource(resources0, v2));
                }
                if(s10 == null || !s10.equals("SILENT")) {
                    int v3 = resources0.getIdentifier(s2, "raw", "com.playdekgames.android.Ascension");
                    if(v3 == 0) {
                        notificationCompat$Builder0.setDefaults(5);
                    }
                    else {
                        Uri uri0 = Uri.parse(("android.resource://com.playdekgames.android.Ascension/" + v3));
                        notificationCompat$Builder0.setDefaults(4);
                        notificationCompat$Builder0.setSound(uri0);
                    }
                }
                else {
                    notificationCompat$Builder0.setDefaults(4);
                }
                if(z) {
                    notificationCompat$Builder0.setVibrate(new long[]{500L, 500L, 500L, 500L});
                }
                else {
                    notificationCompat$Builder0.setVibrate(new long[0]);
                }
                if(!s8.equals("")) {
                    new PictureLoadingTask(new PictureLoadingListener(v, notificationCompat$Builder0, this.mNotificationManager, pendingIntent0, s4, s5, s6)).execute(new String[]{s8});
                    return;
                }
                notificationCompat$Builder0.setStyle(new BigTextStyle().bigText(s5));
                notificationCompat$Builder0.setContentIntent(pendingIntent0).setAutoCancel(true);
                this.mNotificationManager.notify(v, notificationCompat$Builder0.build());
                ((PowerManager)this.getApplicationContext().getSystemService("power")).newWakeLock(0x10000000, "AndroidNative").acquire();
                try {
                    UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "GCMNotificationCallback", stringBuilder0.toString());
                    Log.d("AndroidNative", "[sendPushCallback] data: " + stringBuilder0.toString());
                }
                catch(UnsatisfiedLinkError unused_ex) {
                    Log.d("AndroidNative", "Trying to call GCM push received callback, but the App closed!");
                }
                return;
            }
            try {
                UnityPlayer.UnitySendMessage("GoogleCloudMessageService", "GCMNotificationCallback", stringBuilder0.toString());
                Log.d("AndroidNative", "[sendPushCallback] data: " + stringBuilder0.toString());
            }
            catch(UnsatisfiedLinkError unused_ex) {
                Log.d("AndroidNative", "Trying to call GCM push received callback, but the App closed!");
            }
        }
        catch(Exception exception0) {
            Log.d("AndroidNative", "Failed to schedule notification");
            exception0.printStackTrace();
        }
    }
}

