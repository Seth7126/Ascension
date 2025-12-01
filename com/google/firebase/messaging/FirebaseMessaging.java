package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.datatransport.TransportFactory;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.Metadata;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.UserAgentPublisher;

public class FirebaseMessaging {
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private final Context context;
    private final FirebaseInstanceId iid;
    private final Task topicsSubscriberTask;
    static TransportFactory transportFactory;

    FirebaseMessaging(FirebaseApp firebaseApp0, FirebaseInstanceId firebaseInstanceId0, UserAgentPublisher userAgentPublisher0, HeartBeatInfo heartBeatInfo0, FirebaseInstallationsApi firebaseInstallationsApi0, TransportFactory transportFactory0) {
        FirebaseMessaging.transportFactory = transportFactory0;
        this.iid = firebaseInstanceId0;
        Context context0 = firebaseApp0.getApplicationContext();
        this.context = context0;
        Task task0 = TopicsSubscriber.createInstance(firebaseApp0, firebaseInstanceId0, new Metadata(context0), userAgentPublisher0, heartBeatInfo0, firebaseInstallationsApi0, context0, FcmExecutors.newTopicsSyncExecutor());
        this.topicsSubscriberTask = task0;
        task0.addOnSuccessListener(FcmExecutors.newTopicsSyncTriggerExecutor(), (TopicsSubscriber topicsSubscriber0) -> if(this.isAutoInitEnabled()) {
            topicsSubscriber0.startTopicsSyncIfNecessary();
        });
    }

    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return MessagingAnalytics.deliveryMetricsExportToBigQueryEnabled();
    }

    public static FirebaseMessaging getInstance() {
        synchronized(FirebaseMessaging.class) {
            return FirebaseMessaging.getInstance(FirebaseApp.getInstance());
        }
    }

    static FirebaseMessaging getInstance(FirebaseApp firebaseApp0) {
        synchronized(FirebaseMessaging.class) {
            return (FirebaseMessaging)firebaseApp0.get(FirebaseMessaging.class);
        }
    }

    public static TransportFactory getTransportFactory() {
        return FirebaseMessaging.transportFactory;
    }

    public boolean isAutoInitEnabled() {
        return this.iid.isFcmAutoInitEnabled();
    }

    // 检测为 Lambda 实现
    final void lambda$new$0$FirebaseMessaging(TopicsSubscriber topicsSubscriber0) [...]

    // 检测为 Lambda 实现
    static final Task lambda$subscribeToTopic$1$FirebaseMessaging(String s, TopicsSubscriber topicsSubscriber0) throws Exception [...]

    // 检测为 Lambda 实现
    static final Task lambda$unsubscribeFromTopic$2$FirebaseMessaging(String s, TopicsSubscriber topicsSubscriber0) throws Exception [...]

    public void send(RemoteMessage remoteMessage0) {
        if(TextUtils.isEmpty(remoteMessage0.getTo())) {
            throw new IllegalArgumentException("Missing \'to\'");
        }
        Intent intent0 = new Intent("com.google.android.gcm.intent.SEND");
        Intent intent1 = new Intent();
        intent1.setPackage("com.google.example.invalidpackage");
        intent0.putExtra("app", PendingIntent.getBroadcast(this.context, 0, intent1, 0));
        intent0.setPackage("com.google.android.gms");
        remoteMessage0.populateSendMessageIntent(intent0);
        this.context.sendOrderedBroadcast(intent0, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z) {
        this.iid.setFcmAutoInitEnabled(z);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z) {
        MessagingAnalytics.setDeliveryMetricsExportToBigQuery(z);
    }

    public Task subscribeToTopic(String s) {
        FirebaseMessaging..Lambda.1 firebaseMessaging$$Lambda$10 = (TopicsSubscriber topicsSubscriber0) -> topicsSubscriber0.subscribeToTopic(s);
        return this.topicsSubscriberTask.onSuccessTask(firebaseMessaging$$Lambda$10);
    }

    public Task unsubscribeFromTopic(String s) {
        FirebaseMessaging..Lambda.2 firebaseMessaging$$Lambda$20 = (TopicsSubscriber topicsSubscriber0) -> topicsSubscriber0.unsubscribeFromTopic(s);
        return this.topicsSubscriberTask.onSuccessTask(firebaseMessaging$$Lambda$20);
    }
}

