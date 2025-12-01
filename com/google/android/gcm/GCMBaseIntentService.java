package com.google.android.gcm;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class GCMBaseIntentService extends IntentService {
    private static final String EXTRA_TOKEN = "token";
    private static final Object LOCK = null;
    private static final int MAX_BACKOFF_MS = 0;
    public static final String TAG = "GCMBaseIntentService";
    private static final String TOKEN = null;
    private static final String WAKELOCK_KEY = "GCM_LIB";
    private final String[] mSenderIds;
    private static int sCounter;
    private static final Random sRandom;
    private static PowerManager.WakeLock sWakeLock;

    static {
        GCMBaseIntentService.LOCK = GCMBaseIntentService.class;
        GCMBaseIntentService.sRandom = new Random();
        GCMBaseIntentService.MAX_BACKOFF_MS = (int)TimeUnit.SECONDS.toMillis(3600L);
        GCMBaseIntentService.TOKEN = "1001010101000000010110011010111010001011010010001000010010111010";
    }

    protected GCMBaseIntentService() {
        this("GCMIntentService-DynamicSenderIds-1", null);
    }

    private GCMBaseIntentService(String s, String[] arr_s) {
        super(s);
        this.mSenderIds = arr_s;
    }

    protected GCMBaseIntentService(String[] arr_s) {
        this(GCMBaseIntentService.getName(arr_s), arr_s);
    }

    private static String getName(String s) [...] // 潜在的解密器

    private static String getName(String[] arr_s) {
        return GCMBaseIntentService.getName(GCMRegistrar.getFlatSenderIds(arr_s));
    }

    protected String[] getSenderIds(Context context0) {
        String[] arr_s = this.mSenderIds;
        if(arr_s == null) {
            throw new IllegalStateException("sender id not set on constructor");
        }
        return arr_s;
    }

    private void handleRegistration(Context context0, Intent intent0) {
        String s = intent0.getStringExtra("registration_id");
        String s1 = intent0.getStringExtra("error");
        String s2 = intent0.getStringExtra("unregistered");
        Log.d("GCMBaseIntentService", "handleRegistration: registrationId = " + s + ", error = " + s1 + ", unregistered = " + s2);
        if(s != null) {
            GCMRegistrar.resetBackoff(context0);
            GCMRegistrar.setRegistrationId(context0, s);
            this.onRegistered(context0, s);
            return;
        }
        if(s2 != null) {
            GCMRegistrar.resetBackoff(context0);
            this.onUnregistered(context0, GCMRegistrar.clearRegistrationId(context0));
            return;
        }
        Log.d("GCMBaseIntentService", "Registration error: " + s1);
        if("SERVICE_NOT_AVAILABLE".equals(s1)) {
            int v = GCMRegistrar.getBackoff(context0);
            int v1 = v / 2 + GCMBaseIntentService.sRandom.nextInt(v);
            Log.d("GCMBaseIntentService", "Scheduling registration retry, backoff = " + v1 + " (" + v + ")");
            Intent intent1 = new Intent("com.google.android.gcm.intent.RETRY");
            intent1.putExtra("token", GCMBaseIntentService.TOKEN);
            PendingIntent pendingIntent0 = PendingIntent.getBroadcast(context0, 0, intent1, 0);
            ((AlarmManager)context0.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + ((long)v1), pendingIntent0);
            if(v < GCMBaseIntentService.MAX_BACKOFF_MS) {
                GCMRegistrar.setBackoff(context0, v * 2);
            }
        }
        else {
            this.onError(context0, s1);
        }
    }

    protected void onDeletedMessages(Context context0, int v) {
    }

    protected abstract void onError(Context arg1, String arg2);

    @Override  // android.app.IntentService
    public final void onHandleIntent(Intent intent0) {
        Context context0;
        try {
            context0 = this.getApplicationContext();
            String s = intent0.getAction();
            if(s.equals("com.google.android.c2dm.intent.REGISTRATION")) {
                goto label_38;
            }
            else if(s.equals("com.google.android.c2dm.intent.RECEIVE")) {
                String s1 = intent0.getStringExtra("message_type");
                if(s1 == null) {
                    this.onMessage(context0, intent0);
                }
                else if(s1.equals("deleted_messages")) {
                    String s2 = intent0.getStringExtra("total_deleted");
                    if(s2 != null) {
                        try {
                            Log.v("GCMBaseIntentService", "Received deleted messages notification: " + Integer.parseInt(s2));
                        }
                        catch(NumberFormatException unused_ex) {
                            Log.e("GCMBaseIntentService", "GCM returned invalid number of deleted messages: " + s2);
                        }
                    }
                }
                else {
                    Log.e("GCMBaseIntentService", "Received unknown special message: " + s1);
                }
            }
            else if(s.equals("com.google.android.gcm.intent.RETRY")) {
                String s3 = intent0.getStringExtra("token");
                if(!GCMBaseIntentService.TOKEN.equals(s3)) {
                    Log.e("GCMBaseIntentService", "Received invalid token: " + s3);
                    goto label_26;
                }
                if(GCMRegistrar.isRegistered(context0)) {
                    GCMRegistrar.internalUnregister(context0);
                }
                else {
                    GCMRegistrar.internalRegister(context0, this.getSenderIds(context0));
                }
            }
            goto label_54;
        }
        catch(Throwable throwable0) {
            goto label_42;
        }
    label_26:
        synchronized(GCMBaseIntentService.LOCK) {
            if(GCMBaseIntentService.sWakeLock == null) {
                Log.e("GCMBaseIntentService", "Wakelock reference is null");
            }
            else {
                Log.v("GCMBaseIntentService", "Releasing wakelock");
                GCMBaseIntentService.sWakeLock.release();
            }
        }
        return;
        try {
        label_38:
            GCMRegistrar.setRetryBroadcastReceiver(context0);
            this.handleRegistration(context0, intent0);
        }
        catch(Throwable throwable0) {
        label_42:
            synchronized(GCMBaseIntentService.LOCK) {
                if(GCMBaseIntentService.sWakeLock == null) {
                    Log.e("GCMBaseIntentService", "Wakelock reference is null");
                }
                else {
                    Log.v("GCMBaseIntentService", "Releasing wakelock");
                    GCMBaseIntentService.sWakeLock.release();
                }
            }
            throw throwable0;
        }
    label_54:
        synchronized(GCMBaseIntentService.LOCK) {
            if(GCMBaseIntentService.sWakeLock == null) {
                Log.e("GCMBaseIntentService", "Wakelock reference is null");
            }
            else {
                Log.v("GCMBaseIntentService", "Releasing wakelock");
                GCMBaseIntentService.sWakeLock.release();
            }
        }
    }

    protected abstract void onMessage(Context arg1, Intent arg2);

    protected boolean onRecoverableError(Context context0, String s) [...] // Inlined contents

    protected abstract void onRegistered(Context arg1, String arg2);

    protected abstract void onUnregistered(Context arg1, String arg2);

    static void runIntentInService(Context context0, Intent intent0, String s) {
        synchronized(GCMBaseIntentService.LOCK) {
            if(GCMBaseIntentService.sWakeLock == null) {
                GCMBaseIntentService.sWakeLock = ((PowerManager)context0.getSystemService("power")).newWakeLock(1, "GCM_LIB");
            }
        }
        Log.v("GCMBaseIntentService", "Acquiring wakelock");
        GCMBaseIntentService.sWakeLock.acquire();
        intent0.setClassName(context0, s);
        context0.startService(intent0);
    }
}

