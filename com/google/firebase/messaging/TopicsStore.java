package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class TopicsStore {
    private final SharedPreferences sharedPreferences;
    private final Executor syncExecutor;
    private SharedPreferencesQueue topicOperationsQueue;
    private static WeakReference topicsStoreWeakReference;

    private TopicsStore(SharedPreferences sharedPreferences0, Executor executor0) {
        this.syncExecutor = executor0;
        this.sharedPreferences = sharedPreferences0;
    }

    final boolean addTopicOperation(TopicOperation topicOperation0) {
        synchronized(this) {
            return this.topicOperationsQueue.add(topicOperation0.serialize());
        }
    }

    public static TopicsStore getInstance(Context context0, Executor executor0) {
        synchronized(TopicsStore.class) {
            TopicsStore topicsStore0 = TopicsStore.topicsStoreWeakReference == null ? null : ((TopicsStore)TopicsStore.topicsStoreWeakReference.get());
            if(topicsStore0 == null) {
                topicsStore0 = new TopicsStore(context0.getSharedPreferences("com.google.android.gms.appid", 0), executor0);
                topicsStore0.initStore();
                TopicsStore.topicsStoreWeakReference = new WeakReference(topicsStore0);
            }
            return topicsStore0;
        }
    }

    final TopicOperation getNextTopicOperation() {
        synchronized(this) {
            return TopicOperation.from(this.topicOperationsQueue.peek());
        }
    }

    private final void initStore() {
        synchronized(this) {
            this.topicOperationsQueue = SharedPreferencesQueue.createInstance(this.sharedPreferences, "topic_operation_queue", ",", this.syncExecutor);
        }
    }

    final boolean removeTopicOperation(TopicOperation topicOperation0) {
        synchronized(this) {
            return this.topicOperationsQueue.remove(topicOperation0.serialize());
        }
    }
}

