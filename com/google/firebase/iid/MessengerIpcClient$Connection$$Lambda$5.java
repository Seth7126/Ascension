package com.google.firebase.iid;

final class MessengerIpcClient.Connection..Lambda.5 implements Runnable {
    private final Connection arg$1;
    private final Request arg$2;

    MessengerIpcClient.Connection..Lambda.5(Connection messengerIpcClient$Connection0, Request messengerIpcClient$Request0) {
        this.arg$1 = messengerIpcClient$Connection0;
        this.arg$2 = messengerIpcClient$Request0;
    }

    @Override
    public final void run() {
        this.arg$1.lambda$scheduleSendingRequests$1$MessengerIpcClient$Connection(this.arg$2);
    }
}

