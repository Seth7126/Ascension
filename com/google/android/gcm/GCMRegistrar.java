package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GCMRegistrar {
    private static final String BACKOFF_MS = "backoff_ms";
    private static final int DEFAULT_BACKOFF_MS = 3000;
    public static final long DEFAULT_ON_SERVER_LIFESPAN_MS = 604800000L;
    private static final String GSF_PACKAGE = "com.google.android.gsf";
    private static final String PREFERENCES = "com.google.android.gcm";
    private static final String PROPERTY_APP_VERSION = "appVersion";
    private static final String PROPERTY_ON_SERVER = "onServer";
    private static final String PROPERTY_ON_SERVER_EXPIRATION_TIME = "onServerExpirationTime";
    private static final String PROPERTY_ON_SERVER_LIFESPAN = "onServerLifeSpan";
    private static final String PROPERTY_REG_ID = "regId";
    private static final String TAG = "GCMRegistrar";
    private static GCMBroadcastReceiver sRetryReceiver;
    private static String sRetryReceiverClassName;

    private GCMRegistrar() {
        throw new UnsupportedOperationException();
    }

    public static void checkDevice(Context context0) {
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            packageManager0.getPackageInfo("com.google.android.gsf", 0);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
        }
    }

    public static void checkManifest(Context context0) {
        ActivityInfo[] arr_activityInfo;
        PackageManager packageManager0 = context0.getPackageManager();
        try {
            packageManager0.getPermissionInfo("com.playdekgames.android.Ascension.permission.C2D_MESSAGE", 0x1000);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new IllegalStateException("Application does not define permission com.playdekgames.android.Ascension.permission.C2D_MESSAGE");
        }
        try {
            arr_activityInfo = packageManager0.getPackageInfo("com.playdekgames.android.Ascension", 2).receivers;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            throw new IllegalStateException("Could not get receivers for package com.playdekgames.android.Ascension");
        }
        if(arr_activityInfo == null || arr_activityInfo.length == 0) {
            throw new IllegalStateException("No receiver for package com.playdekgames.android.Ascension");
        }
        if(Log.isLoggable("GCMRegistrar", 2)) {
            Log.v("GCMRegistrar", "number of receivers for com.playdekgames.android.Ascension: " + arr_activityInfo.length);
        }
        HashSet hashSet0 = new HashSet();
        for(int v = 0; v < arr_activityInfo.length; ++v) {
            ActivityInfo activityInfo0 = arr_activityInfo[v];
            if("com.google.android.c2dm.permission.SEND".equals(activityInfo0.permission)) {
                hashSet0.add(activityInfo0.name);
            }
        }
        if(hashSet0.isEmpty()) {
            throw new IllegalStateException("No receiver allowed to receive com.google.android.c2dm.permission.SEND");
        }
        GCMRegistrar.checkReceiver(context0, hashSet0, "com.google.android.c2dm.intent.REGISTRATION");
        GCMRegistrar.checkReceiver(context0, hashSet0, "com.google.android.c2dm.intent.RECEIVE");
    }

    private static void checkReceiver(Context context0, Set set0, String s) {
        PackageManager packageManager0 = context0.getPackageManager();
        Intent intent0 = new Intent(s);
        intent0.setPackage("com.playdekgames.android.Ascension");
        List list0 = packageManager0.queryBroadcastReceivers(intent0, 0x20);
        if(list0.isEmpty()) {
            throw new IllegalStateException("No receivers for action " + s);
        }
        if(Log.isLoggable("GCMRegistrar", 2)) {
            Log.v("GCMRegistrar", "Found " + list0.size() + " receivers for action " + s);
        }
        for(Object object0: list0) {
            String s1 = ((ResolveInfo)object0).activityInfo.name;
            if(!set0.contains(s1)) {
                throw new IllegalStateException("Receiver " + s1 + " is not set with permission com.google.android.c2dm.permission.SEND");
            }
            if(false) {
                break;
            }
        }
    }

    static String clearRegistrationId(Context context0) {
        return GCMRegistrar.setRegistrationId(context0, "");
    }

    private static int getAppVersion(Context context0) {
        try {
            return context0.getPackageManager().getPackageInfo("com.playdekgames.android.Ascension", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException packageManager$NameNotFoundException0) {
            throw new RuntimeException("Coult not get package name: " + packageManager$NameNotFoundException0);
        }
    }

    static int getBackoff(Context context0) {
        return GCMRegistrar.getGCMPreferences(context0).getInt("backoff_ms", 3000);
    }

    static String getFlatSenderIds(String[] arr_s) {
        if(arr_s == null || arr_s.length == 0) {
            throw new IllegalArgumentException("No senderIds");
        }
        StringBuilder stringBuilder0 = new StringBuilder(arr_s[0]);
        for(int v = 1; v < arr_s.length; ++v) {
            stringBuilder0.append(',');
            stringBuilder0.append(arr_s[v]);
        }
        return stringBuilder0.toString();
    }

    private static SharedPreferences getGCMPreferences(Context context0) {
        return context0.getSharedPreferences("com.google.android.gcm", 0);
    }

    public static long getRegisterOnServerLifespan(Context context0) {
        return GCMRegistrar.getGCMPreferences(context0).getLong("onServerLifeSpan", 604800000L);
    }

    public static String getRegistrationId(Context context0) {
        SharedPreferences sharedPreferences0 = GCMRegistrar.getGCMPreferences(context0);
        String s = sharedPreferences0.getString("regId", "");
        int v = sharedPreferences0.getInt("appVersion", 0x80000000);
        int v1 = GCMRegistrar.getAppVersion(context0);
        if(v != 0x80000000 && v != v1) {
            Log.v("GCMRegistrar", "App version changed from " + v + " to " + v1 + "; resetting registration id");
            GCMRegistrar.clearRegistrationId(context0);
            return "";
        }
        return s;
    }

    static void internalRegister(Context context0, String[] arr_s) {
        String s = GCMRegistrar.getFlatSenderIds(arr_s);
        Log.v("GCMRegistrar", "Registering app com.playdekgames.android.Ascension of senders " + s);
        Intent intent0 = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent0.setPackage("com.google.android.gsf");
        intent0.putExtra("app", PendingIntent.getBroadcast(context0, 0, new Intent(), 0));
        intent0.putExtra("sender", s);
        context0.startService(intent0);
    }

    static void internalUnregister(Context context0) {
        Log.v("GCMRegistrar", "Unregistering app com.playdekgames.android.Ascension");
        Intent intent0 = new Intent("com.google.android.c2dm.intent.UNREGISTER");
        intent0.setPackage("com.google.android.gsf");
        intent0.putExtra("app", PendingIntent.getBroadcast(context0, 0, new Intent(), 0));
        context0.startService(intent0);
    }

    public static boolean isRegistered(Context context0) {
        return GCMRegistrar.getRegistrationId(context0).length() > 0;
    }

    public static boolean isRegisteredOnServer(Context context0) {
        SharedPreferences sharedPreferences0 = GCMRegistrar.getGCMPreferences(context0);
        boolean z = sharedPreferences0.getBoolean("onServer", false);
        Log.v("GCMRegistrar", "Is registered on server: " + z);
        if(z) {
            long v = sharedPreferences0.getLong("onServerExpirationTime", -1L);
            if(System.currentTimeMillis() > v) {
                Log.v("GCMRegistrar", "flag expired on: " + new Timestamp(v));
                return false;
            }
        }
        return z;
    }

    public static void onDestroy(Context context0) {
        synchronized(GCMRegistrar.class) {
            if(GCMRegistrar.sRetryReceiver != null) {
                Log.v("GCMRegistrar", "Unregistering receiver");
                context0.unregisterReceiver(GCMRegistrar.sRetryReceiver);
                GCMRegistrar.sRetryReceiver = null;
            }
        }
    }

    public static void register(Context context0, String[] arr_s) {
        GCMRegistrar.resetBackoff(context0);
        GCMRegistrar.internalRegister(context0, arr_s);
    }

    static void resetBackoff(Context context0) {
        Log.d("GCMRegistrar", "resetting backoff for com.playdekgames.android.Ascension");
        GCMRegistrar.setBackoff(context0, 3000);
    }

    static void setBackoff(Context context0, int v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = GCMRegistrar.getGCMPreferences(context0).edit();
        sharedPreferences$Editor0.putInt("backoff_ms", v);
        sharedPreferences$Editor0.commit();
    }

    public static void setRegisterOnServerLifespan(Context context0, long v) {
        SharedPreferences.Editor sharedPreferences$Editor0 = GCMRegistrar.getGCMPreferences(context0).edit();
        sharedPreferences$Editor0.putLong("onServerLifeSpan", v);
        sharedPreferences$Editor0.commit();
    }

    public static void setRegisteredOnServer(Context context0, boolean z) {
        SharedPreferences.Editor sharedPreferences$Editor0 = GCMRegistrar.getGCMPreferences(context0).edit();
        sharedPreferences$Editor0.putBoolean("onServer", z);
        long v = System.currentTimeMillis() + GCMRegistrar.getRegisterOnServerLifespan(context0);
        Log.v("GCMRegistrar", "Setting registeredOnServer status as " + z + " until " + new Timestamp(v));
        sharedPreferences$Editor0.putLong("onServerExpirationTime", v);
        sharedPreferences$Editor0.commit();
    }

    static String setRegistrationId(Context context0, String s) {
        SharedPreferences sharedPreferences0 = GCMRegistrar.getGCMPreferences(context0);
        String s1 = sharedPreferences0.getString("regId", "");
        int v = GCMRegistrar.getAppVersion(context0);
        Log.v("GCMRegistrar", "Saving regId on app version " + v);
        SharedPreferences.Editor sharedPreferences$Editor0 = sharedPreferences0.edit();
        sharedPreferences$Editor0.putString("regId", s);
        sharedPreferences$Editor0.putInt("appVersion", v);
        sharedPreferences$Editor0.commit();
        return s1;
    }

    static void setRetryBroadcastReceiver(Context context0) {
        synchronized(GCMRegistrar.class) {
            if(GCMRegistrar.sRetryReceiver == null) {
                String s = GCMRegistrar.sRetryReceiverClassName;
                if(s == null) {
                    Log.e("GCMRegistrar", "internal error: retry receiver class not set yet");
                    GCMRegistrar.sRetryReceiver = new GCMBroadcastReceiver();
                }
                else {
                    try {
                        GCMRegistrar.sRetryReceiver = (GCMBroadcastReceiver)Class.forName(s).newInstance();
                    }
                    catch(Exception unused_ex) {
                        Log.e("GCMRegistrar", "Could not create instance of " + GCMRegistrar.sRetryReceiverClassName + ". Using " + "com.google.android.gcm.GCMBroadcastReceiver" + " directly.");
                        GCMRegistrar.sRetryReceiver = new GCMBroadcastReceiver();
                    }
                }
                IntentFilter intentFilter0 = new IntentFilter("com.google.android.gcm.intent.RETRY");
                intentFilter0.addCategory("com.playdekgames.android.Ascension");
                Log.v("GCMRegistrar", "Registering receiver");
                context0.registerReceiver(GCMRegistrar.sRetryReceiver, intentFilter0, "com.playdekgames.android.Ascension.permission.C2D_MESSAGE", null);
            }
        }
    }

    static void setRetryReceiverClassName(String s) {
        Log.v("GCMRegistrar", "Setting the name of retry receiver class to " + s);
        GCMRegistrar.sRetryReceiverClassName = s;
    }

    public static void unregister(Context context0) {
        GCMRegistrar.resetBackoff(context0);
        GCMRegistrar.internalUnregister(context0);
    }
}

