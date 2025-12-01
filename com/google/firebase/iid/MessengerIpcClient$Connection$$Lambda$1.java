package com.google.firebase.iid;

final class MessengerIpcClient.Connection..Lambda.1 implements Runnable {
    private final Connection arg$1;

    MessengerIpcClient.Connection..Lambda.1(Connection messengerIpcClient$Connection0) {
        this.arg$1 = messengerIpcClient$Connection0;
    }

    @Override
    public final void run() {
        this.arg$1.timeoutConnection();
    }
}

