package com.google.firebase.iid;

final class MessengerIpcClient.Connection..Lambda.3 implements Runnable {
    private final Connection arg$1;

    MessengerIpcClient.Connection..Lambda.3(Connection messengerIpcClient$Connection0) {
        this.arg$1 = messengerIpcClient$Connection0;
    }

    @Override
    public final void run() {
        this.arg$1.lambda$scheduleSendingRequests$2$MessengerIpcClient$Connection();
    }
}

