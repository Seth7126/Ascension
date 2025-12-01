package com.google.firebase.iid;

import android.os.Handler.Callback;
import android.os.Message;

final class MessengerIpcClient.Connection..Lambda.0 implements Handler.Callback {
    private final Connection arg$1;

    MessengerIpcClient.Connection..Lambda.0(Connection messengerIpcClient$Connection0) {
        this.arg$1 = messengerIpcClient$Connection0;
    }

    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        return this.arg$1.receivedResponse(message0);
    }
}

