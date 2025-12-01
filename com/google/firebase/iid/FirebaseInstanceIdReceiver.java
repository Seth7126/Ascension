package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ExecutorService;

public final class FirebaseInstanceIdReceiver extends WakefulBroadcastReceiver {
    private final ExecutorService processorExecutor;

    public FirebaseInstanceIdReceiver() {
        this.processorExecutor = FirebaseIidExecutors.newCachedSingleThreadExecutor();
    }

    // 检测为 Lambda 实现
    static final void lambda$onReceiveInternal$0$FirebaseInstanceIdReceiver(boolean z, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0, Task task0) [...]

    private static Intent normalizeIntent(Context context0, Intent intent0) {
        Intent intent1 = ServiceStarter.unwrapServiceIntent(intent0);
        if(intent1 != null) {
            intent0 = intent1;
        }
        intent0.setComponent(null);
        intent0.setPackage("com.playdekgames.android.Ascension");
        return intent0;
    }

    @Override  // android.content.BroadcastReceiver
    public final void onReceive(Context context0, Intent intent0) {
        if(intent0 == null) {
            return;
        }
        this.onReceiveInternal(context0, FirebaseInstanceIdReceiver.normalizeIntent(context0, intent0));
    }

    private final void onReceiveInternal(Context context0, Intent intent0) {
        IidBroadcastProcessor iidBroadcastProcessor0 = "google.com/iid".equals(intent0.getStringExtra("from")) ? new IidBroadcastProcessor(this.processorExecutor) : new FcmBroadcastProcessor(context0, this.processorExecutor);
        boolean z = this.isOrderedBroadcast();
        BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0 = this.goAsync();
        Task task0 = iidBroadcastProcessor0.process(intent0);
        FirebaseInstanceIdReceiver..Lambda.0 firebaseInstanceIdReceiver$$Lambda$00 = (Task task0) -> {
            if(z) {
                broadcastReceiver$PendingResult0.setResultCode((task0.isSuccessful() ? ((int)(((Integer)task0.getResult()))) : 500));
            }
            broadcastReceiver$PendingResult0.finish();
        };
        task0.addOnCompleteListener(this.processorExecutor, firebaseInstanceIdReceiver$$Lambda$00);
    }
}

