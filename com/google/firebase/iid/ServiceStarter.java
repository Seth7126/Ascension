package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Parcelable;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

public class ServiceStarter {
    public static final String ACTION_MESSAGING_EVENT = "com.google.firebase.MESSAGING_EVENT";
    public static final int ERROR_UNKNOWN = 500;
    public static final int SUCCESS = -1;
    private String firebaseMessagingServiceClassName;
    private Boolean hasAccessNetworkStatePermission;
    private Boolean hasWakeLockPermission;
    private static ServiceStarter instance;
    private final Queue messagingEvents;

    private ServiceStarter() {
        this.firebaseMessagingServiceClassName = null;
        this.hasWakeLockPermission = null;
        this.hasAccessNetworkStatePermission = null;
        this.messagingEvents = new ArrayDeque();
    }

    public static PendingIntent createMessagingPendingIntent(Context context0, int v, Intent intent0, int v1) {
        return PendingIntent.getBroadcast(context0, v, ServiceStarter.wrapServiceIntent(context0, "com.google.firebase.MESSAGING_EVENT", intent0), v1);
    }

    private int doStartService(Context context0, Intent intent0) {
        ComponentName componentName0;
        String s = this.resolveServiceClassName(context0, intent0);
        if(s != null) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                String s1 = String.valueOf(s);
                Log.d("FirebaseInstanceId", (s1.length() == 0 ? new String("Restricting intent to a specific service: ") : "Restricting intent to a specific service: " + s1));
            }
            intent0.setClassName("com.playdekgames.android.Ascension", s);
        }
        try {
            if(this.hasWakeLockPermission(context0)) {
                componentName0 = WakeLockHolder.startWakefulService(context0, intent0);
            }
            else {
                componentName0 = context0.startService(intent0);
                Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
            }
            if(componentName0 == null) {
                Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                return 404;
            }
            return -1;
        }
        catch(SecurityException securityException0) {
            Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", securityException0);
            return 401;
        }
        catch(IllegalStateException illegalStateException0) {
            Log.e("FirebaseInstanceId", "Failed to start service while in background: " + illegalStateException0);
            return 402;
        }
    }

    public static ServiceStarter getInstance() {
        synchronized(ServiceStarter.class) {
            if(ServiceStarter.instance == null) {
                ServiceStarter.instance = new ServiceStarter();
            }
            return ServiceStarter.instance;
        }
    }

    public Intent getMessagingEvent() {
        return (Intent)this.messagingEvents.poll();
    }

    boolean hasAccessNetworkStatePermission(Context context0) {
        if(this.hasAccessNetworkStatePermission == null) {
            this.hasAccessNetworkStatePermission = Boolean.valueOf(context0.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if(!this.hasWakeLockPermission.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasAccessNetworkStatePermission.booleanValue();
    }

    boolean hasWakeLockPermission(Context context0) {
        if(this.hasWakeLockPermission == null) {
            this.hasWakeLockPermission = Boolean.valueOf(context0.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if(!this.hasWakeLockPermission.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.hasWakeLockPermission.booleanValue();
    }

    private String resolveServiceClassName(Context context0, Intent intent0) {
        synchronized(this) {
            String s = this.firebaseMessagingServiceClassName;
            if(s != null) {
                return s;
            }
            ResolveInfo resolveInfo0 = context0.getPackageManager().resolveService(intent0, 0);
            if(resolveInfo0 != null && resolveInfo0.serviceInfo != null) {
                ServiceInfo serviceInfo0 = resolveInfo0.serviceInfo;
                if("com.playdekgames.android.Ascension".equals(serviceInfo0.packageName) && serviceInfo0.name != null) {
                    if(serviceInfo0.name.startsWith(".")) {
                        String s1 = String.valueOf(serviceInfo0.name);
                        this.firebaseMessagingServiceClassName = s1.length() == 0 ? new String("com.playdekgames.android.Ascension") : "com.playdekgames.android.Ascension" + s1;
                    }
                    else {
                        this.firebaseMessagingServiceClassName = serviceInfo0.name;
                    }
                    return this.firebaseMessagingServiceClassName;
                }
                Log.e("FirebaseInstanceId", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo0.packageName + "/" + serviceInfo0.name);
                return null;
            }
            Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        }
    }

    public static void setForTesting(ServiceStarter serviceStarter0) {
        ServiceStarter.instance = serviceStarter0;
    }

    public int startMessagingService(Context context0, Intent intent0) {
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Starting service");
        }
        this.messagingEvents.offer(intent0);
        Intent intent1 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent1.setPackage("com.playdekgames.android.Ascension");
        return this.doStartService(context0, intent1);
    }

    public static void startMessagingServiceViaReceiver(Context context0, Intent intent0) {
        context0.sendBroadcast(ServiceStarter.wrapServiceIntent(context0, "com.google.firebase.MESSAGING_EVENT", intent0));
    }

    public static Intent unwrapServiceIntent(Intent intent0) {
        Parcelable parcelable0 = intent0.getParcelableExtra("wrapped_intent");
        return parcelable0 instanceof Intent ? ((Intent)parcelable0) : null;
    }

    private static Intent wrapServiceIntent(Context context0, String s, Intent intent0) {
        Intent intent1 = new Intent(context0, FirebaseInstanceIdReceiver.class);
        intent1.setAction(s);
        intent1.putExtra("wrapped_intent", intent0);
        return intent1;
    }
}

