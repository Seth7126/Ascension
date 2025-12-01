package com.google.firebase.iid;

import android.os.IBinder;

final class MessengerIpcClient.Connection..Lambda.2 implements Runnable {
    private final Connection arg$1;
    private final IBinder arg$2;

    MessengerIpcClient.Connection..Lambda.2(Connection messengerIpcClient$Connection0, IBinder iBinder0) {
        this.arg$1 = messengerIpcClient$Connection0;
        this.arg$2 = iBinder0;
    }

    @Override
    public final void run() {
        this.arg$1.lambda$onServiceConnected$0$MessengerIpcClient$Connection(this.arg$2);
    }
}

