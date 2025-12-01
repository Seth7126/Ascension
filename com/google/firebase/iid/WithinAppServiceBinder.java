package com.google.firebase.iid;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.Task;

public class WithinAppServiceBinder extends Binder {
    public interface IntentHandler {
        Task handle(Intent arg1);
    }

    private final IntentHandler intentHandler;

    public WithinAppServiceBinder(IntentHandler withinAppServiceBinder$IntentHandler0) {
        this.intentHandler = withinAppServiceBinder$IntentHandler0;
    }

    // 检测为 Lambda 实现
    static final void lambda$send$0$WithinAppServiceBinder(BindRequest withinAppServiceConnection$BindRequest0, Task task0) [...]

    void send(BindRequest withinAppServiceConnection$BindRequest0) {
        if(Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "service received new intent via bind strategy");
        }
        this.intentHandler.handle(withinAppServiceConnection$BindRequest0.intent).addOnCompleteListener(FirebaseIidExecutors.directExecutor(), (Task task0) -> withinAppServiceConnection$BindRequest0.finish());
    }
}

