package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

public class FcmBroadcastProcessor implements BroadcastProcessor {
    private final Context context;
    private final ExecutorService executor;
    private static WithinAppServiceConnection fcmServiceConn;
    private static final Object lock;

    static {
        FcmBroadcastProcessor.lock = new Object();
    }

    public FcmBroadcastProcessor(Context context0, ExecutorService executorService0) {
        this.context = context0;
        this.executor = executorService0;
    }

    private static Task bindToMessagingService(Context context0, Intent intent0) {
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return FcmBroadcastProcessor.getServiceConnection(context0, "com.google.firebase.MESSAGING_EVENT").sendIntent(intent0).continueWith(FirebaseIidExecutors.directExecutor(), FcmBroadcastProcessor..Lambda.2.$instance);
    }

    private static WithinAppServiceConnection getServiceConnection(Context context0, String s) {
        synchronized(FcmBroadcastProcessor.lock) {
            if(FcmBroadcastProcessor.fcmServiceConn == null) {
                FcmBroadcastProcessor.fcmServiceConn = new WithinAppServiceConnection(context0, s);
            }
            return FcmBroadcastProcessor.fcmServiceConn;
        }
    }

    static final Integer lambda$bindToMessagingService$3$FcmBroadcastProcessor(Task task0) throws Exception {
        return -1;
    }

    // 检测为 Lambda 实现
    static final Integer lambda$startMessagingService$0$FcmBroadcastProcessor(Context context0, Intent intent0) throws Exception [...]

    static final Integer lambda$startMessagingService$1$FcmBroadcastProcessor(Task task0) throws Exception {
        return 403;
    }

    // 去混淆评级： 低(40)
    // 检测为 Lambda 实现
    static final Task lambda$startMessagingService$2$FcmBroadcastProcessor(Context context0, Intent intent0, Task task0) throws Exception [...]

    @Override  // com.google.firebase.iid.BroadcastProcessor
    public Task process(Intent intent0) {
        String s = intent0.getStringExtra("gcm.rawData64");
        if(s != null) {
            intent0.putExtra("rawData", Base64.decode(s, 0));
            intent0.removeExtra("gcm.rawData64");
        }
        return this.startMessagingService(this.context, intent0);
    }

    public static void reset() {
        synchronized(FcmBroadcastProcessor.lock) {
            FcmBroadcastProcessor.fcmServiceConn = null;
        }
    }

    public Task startMessagingService(Context context0, Intent intent0) {
        if((intent0.getFlags() & 0x10000000) == 0) {
            return FcmBroadcastProcessor.bindToMessagingService(context0, intent0);
        }
        FcmBroadcastProcessor..Lambda.0 fcmBroadcastProcessor$$Lambda$00 = () -> ServiceStarter.getInstance().startMessagingService(context0, intent0);
        Task task0 = Tasks.call(this.executor, fcmBroadcastProcessor$$Lambda$00);
        FcmBroadcastProcessor..Lambda.1 fcmBroadcastProcessor$$Lambda$10 = (Task task0) -> // 去混淆评级： 低(40)
        (((int)(((Integer)task0.getResult()))) == 402 ? FcmBroadcastProcessor.bindToMessagingService(context0, intent0).continueWith(FirebaseIidExecutors.directExecutor(), FcmBroadcastProcessor..Lambda.3.$instance) : task0);
        return task0.continueWithTask(this.executor, fcmBroadcastProcessor$$Lambda$10);
    }
}

