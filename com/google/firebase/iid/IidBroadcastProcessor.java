package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;

class IidBroadcastProcessor implements BroadcastProcessor {
    private final ExecutorService executor;

    IidBroadcastProcessor(ExecutorService executorService0) {
        this.executor = executorService0;
    }

    // 检测为 Lambda 实现
    static final Integer lambda$process$0$IidBroadcastProcessor(Intent intent0) throws Exception [...]

    @Override  // com.google.firebase.iid.BroadcastProcessor
    public Task process(Intent intent0) {
        IidBroadcastProcessor..Lambda.0 iidBroadcastProcessor$$Lambda$00 = () -> IidBroadcastProcessor.processImpl(intent0);
        return Tasks.call(this.executor, iidBroadcastProcessor$$Lambda$00);
    }

    private static int processImpl(Intent intent0) {
        String s = intent0.getStringExtra("CMD");
        if(s != null) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Received command: " + s + " - " + intent0.getExtras());
            }
            if("RST".equals(s) || "RST_FULL".equals(s)) {
                FirebaseInstanceId.getInstance().resetStorageAndScheduleSync();
            }
            else if("SYNC".equals(s)) {
                FirebaseInstanceId.getInstance().forceTokenRefresh();
                return -1;
            }
        }
        return -1;
    }
}

