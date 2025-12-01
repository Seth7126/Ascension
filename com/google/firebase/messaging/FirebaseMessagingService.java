package com.google.firebase.messaging;

import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.MessengerIpcClient;
import com.google.firebase.iid.ServiceStarter;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseMessagingService extends EnhancedIntentService {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    private static final Queue recentlyReceivedMessageIds;

    static {
        FirebaseMessagingService.recentlyReceivedMessageIds = new ArrayDeque(10);
    }

    private Task ackMessage(String s) {
        if(TextUtils.isEmpty(s)) {
            return Tasks.forResult(null);
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("google.message_id", s);
        return MessengerIpcClient.getInstance(this).sendOneWayRequest(2, bundle0);
    }

    private boolean alreadyReceivedMessage(String s) {
        if(TextUtils.isEmpty(s)) {
            return false;
        }
        Queue queue0 = FirebaseMessagingService.recentlyReceivedMessageIds;
        if(queue0.contains(s)) {
            if(Log.isLoggable("FirebaseMessaging", 3)) {
                String s1 = String.valueOf(s);
                Log.d("FirebaseMessaging", (s1.length() == 0 ? new String("Received duplicate message: ") : "Received duplicate message: " + s1));
            }
            return true;
        }
        if(queue0.size() >= 10) {
            queue0.remove();
        }
        queue0.add(s);
        return false;
    }

    private void dispatchMessage(Intent intent0) {
        Bundle bundle0 = intent0.getExtras();
        if(bundle0 == null) {
            bundle0 = new Bundle();
        }
        bundle0.remove("androidx.content.wakelockid");
        if(NotificationParams.isNotification(bundle0)) {
            NotificationParams notificationParams0 = new NotificationParams(bundle0);
            ExecutorService executorService0 = FcmExecutors.newNetworkIOExecutor();
            DisplayNotification displayNotification0 = new DisplayNotification(this, notificationParams0, executorService0);
            try {
                if(displayNotification0.handleNotification()) {
                    return;
                }
            }
            finally {
                executorService0.shutdown();
            }
            if(MessagingAnalytics.shouldUploadScionMetrics(intent0)) {
                MessagingAnalytics.logNotificationForeground(intent0);
            }
        }
        this.onMessageReceived(new RemoteMessage(bundle0));
    }

    long getAckTimeoutMillis() {
        return TimeUnit.SECONDS.toMillis(1L);
    }

    private String getMessageId(Intent intent0) {
        String s = intent0.getStringExtra("google.message_id");
        return s == null ? intent0.getStringExtra("message_id") : s;
    }

    @Override  // com.google.firebase.messaging.EnhancedIntentService
    protected Intent getStartCommandIntent(Intent intent0) {
        return ServiceStarter.getInstance().getMessagingEvent();
    }

    @Override  // com.google.firebase.messaging.EnhancedIntentService
    public void handleIntent(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.c2dm.intent.RECEIVE".equals(s) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(s)) {
            if(!"com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(s)) {
                if("com.google.firebase.messaging.NEW_TOKEN".equals(s)) {
                    this.onNewToken(intent0.getStringExtra("token"));
                    return;
                }
                String s1 = intent0.getAction();
                Log.d("FirebaseMessaging", (s1.length() == 0 ? new String("Unknown intent action: ") : "Unknown intent action: " + s1));
            }
            else if(MessagingAnalytics.shouldUploadScionMetrics(intent0)) {
                MessagingAnalytics.logNotificationDismiss(intent0);
                return;
            }
            return;
        }
        this.handleMessageIntent(intent0);
    }

    @Override  // com.google.firebase.messaging.EnhancedIntentService
    public boolean handleIntentOnMainThread(Intent intent0) {
        if("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent0.getAction())) {
            this.handleNotificationOpen(intent0);
            return true;
        }
        return false;
    }

    private void handleMessageIntent(Intent intent0) {
        String s = intent0.getStringExtra("google.message_id");
        Task task0 = this.ackMessage(s);
        if(!this.alreadyReceivedMessage(s)) {
            this.passMessageIntentToSdk(intent0);
        }
        try {
            Tasks.await(task0, this.getAckTimeoutMillis(), TimeUnit.MILLISECONDS);
        }
        catch(ExecutionException | InterruptedException | TimeoutException executionException0) {
            Log.w("FirebaseMessaging", "Message ack failed: " + executionException0);
        }
    }

    private void handleNotificationOpen(Intent intent0) {
        PendingIntent pendingIntent0 = (PendingIntent)intent0.getParcelableExtra("pending_intent");
        if(pendingIntent0 != null) {
            try {
                pendingIntent0.send();
            }
            catch(PendingIntent.CanceledException unused_ex) {
                Log.e("FirebaseMessaging", "Notification pending intent canceled");
            }
        }
        if(MessagingAnalytics.shouldUploadScionMetrics(intent0)) {
            MessagingAnalytics.logNotificationOpen(intent0);
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(RemoteMessage remoteMessage0) {
    }

    public void onMessageSent(String s) {
    }

    public void onNewToken(String s) {
    }

    public void onSendError(String s, Exception exception0) {
    }

    private void passMessageIntentToSdk(Intent intent0) {
        String s = intent0.getStringExtra("message_type");
        if(s == null) {
            s = "gcm";
        }
        s.hashCode();
        switch(s) {
            case "deleted_messages": {
                return;
            }
            case "gcm": {
                if(MessagingAnalytics.shouldUploadScionMetrics(intent0)) {
                    MessagingAnalytics.logNotificationReceived(intent0, null);
                }
                if(MessagingAnalytics.shouldUploadFirelogAnalytics(intent0)) {
                    TransportFactory transportFactory0 = FirebaseMessaging.getTransportFactory();
                    if(transportFactory0 == null) {
                        Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    }
                    else {
                        Encoding encoding0 = Encoding.of("json");
                        MessagingAnalytics.logNotificationReceived(intent0, transportFactory0.getTransport("FCM_CLIENT_EVENT_LOGGING", String.class, encoding0, FirebaseMessagingService..Lambda.0.$instance));
                    }
                }
                this.dispatchMessage(intent0);
                return;
            }
            case "send_error": {
                this.onSendError(this.getMessageId(intent0), new SendException(intent0.getStringExtra("error")));
                return;
            }
            case "send_event": {
                this.onMessageSent(intent0.getStringExtra("google.message_id"));
                return;
            }
            default: {
                String s1 = String.valueOf(s);
                Log.w("FirebaseMessaging", (s1.length() == 0 ? new String("Received message with unknown type: ") : "Received message with unknown type: " + s1));
            }
        }
    }
}

