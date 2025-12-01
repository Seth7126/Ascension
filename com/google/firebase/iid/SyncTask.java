package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager.WakeLock;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import javax.annotation.Nullable;

class SyncTask implements Runnable {
    static class ConnectivityChangeReceiver extends BroadcastReceiver {
        @Nullable
        private SyncTask task;

        public ConnectivityChangeReceiver(SyncTask syncTask0) {
            this.task = syncTask0;
        }

        @Override  // android.content.BroadcastReceiver
        public void onReceive(Context context0, Intent intent0) {
            SyncTask syncTask0 = this.task;
            if(syncTask0 == null) {
                return;
            }
            if(!syncTask0.isDeviceConnected()) {
                return;
            }
            if(FirebaseInstanceId.isDebugLogEnabled()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            this.task.iid.enqueueTaskWithDelaySeconds(this.task, 0L);
            this.task.getContext().unregisterReceiver(this);
            this.task = null;
        }

        public void registerReceiver() {
            if(FirebaseInstanceId.isDebugLogEnabled()) {
                Log.d("FirebaseInstanceId", "Connectivity change received registered");
            }
            IntentFilter intentFilter0 = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
            this.task.getContext().registerReceiver(this, intentFilter0);
        }
    }

    private final FirebaseInstanceId iid;
    private final long nextDelaySeconds;
    private final PowerManager.WakeLock syncWakeLock;

    SyncTask(FirebaseInstanceId firebaseInstanceId0, long v) {
        this.iid = firebaseInstanceId0;
        this.nextDelaySeconds = v;
        PowerManager.WakeLock powerManager$WakeLock0 = ((PowerManager)this.getContext().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.syncWakeLock = powerManager$WakeLock0;
        powerManager$WakeLock0.setReferenceCounted(false);
    }

    Context getContext() {
        return this.iid.getApp().getApplicationContext();
    }

    private void invokeOnTokenRefresh(String s) {
        if("[DEFAULT]".equals(this.iid.getApp().getName())) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                String s1 = this.iid.getApp().getName();
                Log.d("FirebaseInstanceId", (s1.length() == 0 ? new String("Invoking onNewToken for app: ") : "Invoking onNewToken for app: " + s1));
            }
            Intent intent0 = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent0.putExtra("token", s);
            ServiceStarter.startMessagingServiceViaReceiver(this.getContext(), intent0);
        }
    }

    boolean isDeviceConnected() {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)this.getContext().getSystemService("connectivity");
        NetworkInfo networkInfo0 = connectivityManager0 == null ? null : connectivityManager0.getActiveNetworkInfo();
        return networkInfo0 != null && networkInfo0.isConnected();
    }

    boolean maybeRefreshToken() throws IOException {
        Token store$Token0 = this.iid.getTokenWithoutTriggeringSync();
        if(!this.iid.tokenNeedsRefresh(store$Token0)) {
            return true;
        }
        try {
            String s = this.iid.blockingGetMasterToken();
            if(s == null) {
                Log.e("FirebaseInstanceId", "Token retrieval failed: null");
                return false;
            }
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Token successfully retrieved");
            }
            if(store$Token0 == null || !s.equals(store$Token0.token)) {
                this.invokeOnTokenRefresh(s);
            }
            return true;
        }
        catch(IOException iOException0) {
            if(GmsRpc.isErrorMessageForRetryableError(iOException0.getMessage())) {
                Log.w("FirebaseInstanceId", "Token retrieval failed: " + iOException0.getMessage() + ". Will retry token retrieval");
                return false;
            }
            if(iOException0.getMessage() != null) {
                throw iOException0;
            }
            Log.w("FirebaseInstanceId", "Token retrieval failed without exception message. Will retry token retrieval");
            return false;
        }
        catch(SecurityException unused_ex) {
            Log.w("FirebaseInstanceId", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override
    public void run() {
        if(ServiceStarter.getInstance().hasWakeLockPermission(this.getContext())) {
            this.syncWakeLock.acquire();
        }
        try {
            this.iid.setSyncScheduledOrRunning(true);
            if(!this.iid.isGmsCorePresent()) {
                goto label_16;
            }
            if(ServiceStarter.getInstance().hasAccessNetworkStatePermission(this.getContext()) && !this.isDeviceConnected()) {
                goto label_12;
            }
            if(this.maybeRefreshToken()) {
                this.iid.setSyncScheduledOrRunning(false);
            }
            else {
                this.iid.syncWithDelaySecondsInternal(this.nextDelaySeconds);
            }
        }
        catch(IOException iOException0) {
            goto label_19;
        }
        catch(Throwable throwable0) {
            goto label_25;
        }
        if(ServiceStarter.getInstance().hasWakeLockPermission(this.getContext())) {
            this.syncWakeLock.release();
            return;
            try {
            label_12:
                new ConnectivityChangeReceiver(this).registerReceiver();
            }
            catch(IOException iOException0) {
                goto label_19;
            }
            catch(Throwable throwable0) {
                goto label_25;
            }
            if(ServiceStarter.getInstance().hasWakeLockPermission(this.getContext())) {
                this.syncWakeLock.release();
            }
            return;
            try {
                try {
                label_16:
                    this.iid.setSyncScheduledOrRunning(false);
                    goto label_28;
                }
                catch(IOException iOException0) {
                }
            label_19:
                Log.e("FirebaseInstanceId", "Topic sync or token retrieval failed on hard failure exceptions: " + iOException0.getMessage() + ". Won\'t retry the operation.");
                this.iid.setSyncScheduledOrRunning(false);
            }
            catch(Throwable throwable0) {
                goto label_25;
            }
            if(ServiceStarter.getInstance().hasWakeLockPermission(this.getContext())) {
                this.syncWakeLock.release();
            }
        }
        return;
    label_25:
        if(ServiceStarter.getInstance().hasWakeLockPermission(this.getContext())) {
            this.syncWakeLock.release();
        }
        throw throwable0;
    label_28:
        if(ServiceStarter.getInstance().hasWakeLockPermission(this.getContext())) {
            this.syncWakeLock.release();
        }
    }
}

