package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.iid.FirebaseInstanceId;

public class MessagingAnalytics {
    private static final DataEncoder dataEncoder;

    static {
        JsonDataEncoderBuilder jsonDataEncoderBuilder0 = new JsonDataEncoderBuilder();
        FirelogAnalyticsEventWrapperEncoder firelogAnalyticsEvent$FirelogAnalyticsEventWrapperEncoder0 = new FirelogAnalyticsEventWrapperEncoder();
        JsonDataEncoderBuilder jsonDataEncoderBuilder1 = jsonDataEncoderBuilder0.registerEncoder(FirelogAnalyticsEventWrapper.class, firelogAnalyticsEvent$FirelogAnalyticsEventWrapperEncoder0);
        FirelogAnalyticsEventEncoder firelogAnalyticsEvent$FirelogAnalyticsEventEncoder0 = new FirelogAnalyticsEventEncoder();
        MessagingAnalytics.dataEncoder = jsonDataEncoderBuilder1.registerEncoder(FirelogAnalyticsEvent.class, firelogAnalyticsEvent$FirelogAnalyticsEventEncoder0).build();
    }

    static boolean deliveryMetricsExportToBigQueryEnabled() {
        try {
            FirebaseApp.getInstance();
        }
        catch(IllegalStateException unused_ex) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
        Context context0 = FirebaseApp.getInstance().getApplicationContext();
        SharedPreferences sharedPreferences0 = context0.getSharedPreferences("com.google.firebase.messaging", 0);
        if(sharedPreferences0.contains("export_to_big_query")) {
            return sharedPreferences0.getBoolean("export_to_big_query", false);
        }
        try {
            PackageManager packageManager0 = context0.getPackageManager();
            if(packageManager0 != null) {
                ApplicationInfo applicationInfo0 = packageManager0.getApplicationInfo("com.playdekgames.android.Ascension", 0x80);
                return applicationInfo0 == null || applicationInfo0.metaData == null || !applicationInfo0.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled") ? false : applicationInfo0.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
            }
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
        }
        return false;
    }

    static String getCollapseKey(Intent intent0) {
        return intent0.getStringExtra("collapse_key");
    }

    static String getComposerId(Intent intent0) {
        return intent0.getStringExtra("google.c.a.c_id");
    }

    static String getComposerLabel(Intent intent0) {
        return intent0.getStringExtra("google.c.a.c_l");
    }

    static String getInstanceId() {
        return FirebaseInstanceId.getInstance(FirebaseApp.getInstance()).getId();
    }

    static String getMessageChannel(Intent intent0) {
        return intent0.getStringExtra("google.c.a.m_c");
    }

    static String getMessageId(Intent intent0) {
        String s = intent0.getStringExtra("google.message_id");
        return s == null ? intent0.getStringExtra("message_id") : s;
    }

    static String getMessageLabel(Intent intent0) {
        return intent0.getStringExtra("google.c.a.m_l");
    }

    private static int getMessagePriority(String s) {
        if("high".equals(s)) {
            return 1;
        }
        return "normal".equals(s) ? 2 : 0;
    }

    static String getMessageTime(Intent intent0) {
        return intent0.getStringExtra("google.c.a.ts");
    }

    static String getMessageTypeForFirelog(Intent intent0) {
        return intent0.getExtras() == null || !NotificationParams.isNotification(intent0.getExtras()) ? "DATA_MESSAGE" : "DISPLAY_NOTIFICATION";
    }

    static String getMessageTypeForScion(Intent intent0) {
        return intent0.getExtras() == null || !NotificationParams.isNotification(intent0.getExtras()) ? "data" : "display";
    }

    static String getPackageName() {
        return "com.playdekgames.android.Ascension";
    }

    static int getPriority(Intent intent0) {
        String s = intent0.getStringExtra("google.delivered_priority");
        if(s == null) {
            if("1".equals(intent0.getStringExtra("google.priority_reduced"))) {
                return 2;
            }
            s = intent0.getStringExtra("google.priority");
        }
        return MessagingAnalytics.getMessagePriority(s);
    }

    static String getProjectNumber() {
        FirebaseApp firebaseApp0 = FirebaseApp.getInstance();
        String s = firebaseApp0.getOptions().getGcmSenderId();
        if(s != null) {
            return s;
        }
        String s1 = firebaseApp0.getOptions().getApplicationId();
        if(!s1.startsWith("1:")) {
            return s1;
        }
        String[] arr_s = s1.split(":");
        if(arr_s.length < 2) {
            return null;
        }
        String s2 = arr_s[1];
        return s2.isEmpty() ? null : s2;
    }

    static String getTopic(Intent intent0) {
        String s = intent0.getStringExtra("from");
        return s == null || !s.startsWith("/topics/") ? null : s;
    }

    static int getTtl(Intent intent0) {
        Object object0 = intent0.getExtras().get("google.ttl");
        if(object0 instanceof Integer) {
            return (int)(((Integer)object0));
        }
        if(object0 instanceof String) {
            try {
                return Integer.parseInt(((String)object0));
            }
            catch(NumberFormatException unused_ex) {
                Log.w("FirebaseMessaging", "Invalid TTL: " + object0);
            }
        }
        return 0;
    }

    // 去混淆评级： 低(20)
    static String getUseDeviceTime(Intent intent0) {
        return intent0.hasExtra("google.c.a.udt") ? intent0.getStringExtra("google.c.a.udt") : null;
    }

    private static boolean isDirectBootMessage(Intent intent0) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent0.getAction());
    }

    public static void logNotificationDismiss(Intent intent0) {
        MessagingAnalytics.logToScion("_nd", intent0);
    }

    public static void logNotificationForeground(Intent intent0) {
        MessagingAnalytics.logToScion("_nf", intent0);
    }

    public static void logNotificationOpen(Intent intent0) {
        MessagingAnalytics.setUserPropertyIfRequired(intent0);
        MessagingAnalytics.logToScion("_no", intent0);
    }

    public static void logNotificationReceived(Intent intent0, Transport transport0) {
        MessagingAnalytics.logToScion("_nr", intent0);
        if(transport0 != null) {
            MessagingAnalytics.logToFirelog("MESSAGE_DELIVERED", intent0, transport0);
        }
    }

    private static void logToFirelog(String s, Intent intent0, Transport transport0) {
        FirelogAnalyticsEventWrapper firelogAnalyticsEvent$FirelogAnalyticsEventWrapper0 = new FirelogAnalyticsEventWrapper(new FirelogAnalyticsEvent(s, intent0));
        try {
            transport0.send(Event.ofTelemetry(MessagingAnalytics.dataEncoder.encode(firelogAnalyticsEvent$FirelogAnalyticsEventWrapper0)));
        }
        catch(EncodingException unused_ex) {
            Log.d("FirebaseMessaging", "Failed to encode big query analytics payload. Skip sending");
        }
    }

    static void logToScion(String s, Intent intent0) {
        Bundle bundle0 = new Bundle();
        String s1 = MessagingAnalytics.getComposerId(intent0);
        if(s1 != null) {
            bundle0.putString("_nmid", s1);
        }
        String s2 = MessagingAnalytics.getComposerLabel(intent0);
        if(s2 != null) {
            bundle0.putString("_nmn", s2);
        }
        String s3 = MessagingAnalytics.getMessageLabel(intent0);
        if(!TextUtils.isEmpty(s3)) {
            bundle0.putString("label", s3);
        }
        String s4 = MessagingAnalytics.getMessageChannel(intent0);
        if(!TextUtils.isEmpty(s4)) {
            bundle0.putString("message_channel", s4);
        }
        String s5 = MessagingAnalytics.getTopic(intent0);
        if(s5 != null) {
            bundle0.putString("_nt", s5);
        }
        String s6 = MessagingAnalytics.getMessageTime(intent0);
        if(s6 != null) {
            try {
                bundle0.putInt("_nmt", Integer.parseInt(s6));
            }
            catch(NumberFormatException numberFormatException0) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", numberFormatException0);
            }
        }
        String s7 = MessagingAnalytics.getUseDeviceTime(intent0);
        if(s7 != null) {
            try {
                bundle0.putInt("_ndt", Integer.parseInt(s7));
            }
            catch(NumberFormatException numberFormatException1) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", numberFormatException1);
            }
        }
        String s8 = MessagingAnalytics.getMessageTypeForScion(intent0);
        if("_nr".equals(s) || "_nf".equals(s)) {
            bundle0.putString("_nmc", s8);
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Logging to scion event=" + s + " scionPayload=" + bundle0);
        }
        AnalyticsConnector analyticsConnector0 = (AnalyticsConnector)FirebaseApp.getInstance().get(AnalyticsConnector.class);
        if(analyticsConnector0 != null) {
            analyticsConnector0.logEvent("fcm", s, bundle0);
            return;
        }
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }

    static void setDeliveryMetricsExportToBigQuery(boolean z) {
        FirebaseApp.getInstance().getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", z).apply();
    }

    private static void setUserPropertyIfRequired(Intent intent0) {
        if(intent0 == null) {
            return;
        }
        if("1".equals(intent0.getStringExtra("google.c.a.tc"))) {
            AnalyticsConnector analyticsConnector0 = (AnalyticsConnector)FirebaseApp.getInstance().get(AnalyticsConnector.class);
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
            }
            if(analyticsConnector0 != null) {
                String s = intent0.getStringExtra("google.c.a.c_id");
                analyticsConnector0.setUserProperty("fcm", "_ln", s);
                Bundle bundle0 = new Bundle();
                bundle0.putString("source", "Firebase");
                bundle0.putString("medium", "notification");
                bundle0.putString("campaign", s);
                analyticsConnector0.logEvent("fcm", "_cmp", bundle0);
                return;
            }
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        if(Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
        }
    }

    public static boolean shouldUploadFirelogAnalytics(Intent intent0) {
        return intent0 == null || MessagingAnalytics.isDirectBootMessage(intent0) ? false : MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    public static boolean shouldUploadScionMetrics(Intent intent0) {
        return intent0 == null || MessagingAnalytics.isDirectBootMessage(intent0) ? false : "1".equals(intent0.getStringExtra("google.c.a.e"));
    }
}

