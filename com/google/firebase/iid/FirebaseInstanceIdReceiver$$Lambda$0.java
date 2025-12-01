package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class FirebaseInstanceIdReceiver..Lambda.0 implements OnCompleteListener {
    private final boolean arg$1;
    private final BroadcastReceiver.PendingResult arg$2;

    FirebaseInstanceIdReceiver..Lambda.0(boolean z, BroadcastReceiver.PendingResult broadcastReceiver$PendingResult0) {
        this.arg$1 = z;
        this.arg$2 = broadcastReceiver$PendingResult0;
    }

    @Override  // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task0) {
        FirebaseInstanceIdReceiver.lambda$onReceiveInternal$0$FirebaseInstanceIdReceiver(this.arg$1, this.arg$2, task0);
    }
}

