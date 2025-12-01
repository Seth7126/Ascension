package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.WakeLockHolder;
import com.google.firebase.iid.WithinAppServiceBinder.IntentHandler;
import com.google.firebase.iid.WithinAppServiceBinder;
import java.util.concurrent.ExecutorService;

public abstract class EnhancedIntentService extends Service {
    private Binder binder;
    final ExecutorService executor;
    private int lastStartId;
    private final Object lock;
    private int runningTasks;

    public EnhancedIntentService() {
        this.executor = FcmExecutors.newIntentHandleExecutor();
        this.lock = new Object();
        this.runningTasks = 0;
    }

    private void finishTask(Intent intent0) {
        if(intent0 != null) {
            WakeLockHolder.completeWakefulIntent(intent0);
        }
        synchronized(this.lock) {
            int v1 = this.runningTasks - 1;
            this.runningTasks = v1;
            if(v1 == 0) {
                this.stopSelfResultHook(this.lastStartId);
            }
        }
    }

    protected Intent getStartCommandIntent(Intent intent0) {
        return intent0;
    }

    public abstract void handleIntent(Intent arg1);

    public boolean handleIntentOnMainThread(Intent intent0) {
        return false;
    }

    // 检测为 Lambda 实现
    final void lambda$onStartCommand$1$EnhancedIntentService(Intent intent0, Task task0) [...]

    // 检测为 Lambda 实现
    final void lambda$processIntent$0$EnhancedIntentService(Intent intent0, TaskCompletionSource taskCompletionSource0) [...]

    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        synchronized(this) {
            if(Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if(this.binder == null) {
                this.binder = new WithinAppServiceBinder((Intent intent0) -> {
                    if(EnhancedIntentService.this.handleIntentOnMainThread(intent0)) {
                        return Tasks.forResult(null);
                    }
                    TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
                    EnhancedIntentService..Lambda.0 enhancedIntentService$$Lambda$00 = () -> try {
                        EnhancedIntentService.this.handleIntent(intent0);
                    }
                    finally {
                        taskCompletionSource0.setResult(null);
                    };
                    EnhancedIntentService.this.executor.execute(enhancedIntentService$$Lambda$00);
                    return taskCompletionSource0.getTask();
                });
            }
            return this.binder;
        }

        class com.google.firebase.messaging.EnhancedIntentService.1 implements IntentHandler {
            @Override  // com.google.firebase.iid.WithinAppServiceBinder$IntentHandler
            public Task handle(Intent intent0) {
                return EnhancedIntentService.this.processIntent(intent0);
            }
        }

    }

    @Override  // android.app.Service
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override  // android.app.Service
    public final int onStartCommand(Intent intent0, int v, int v1) {
        synchronized(this.lock) {
            this.lastStartId = v1;
            ++this.runningTasks;
        }
        Intent intent1 = this.getStartCommandIntent(intent0);
        if(intent1 == null) {
            this.finishTask(intent0);
            return 2;
        }
        Task task0 = this.processIntent(intent1);
        if(task0.isComplete()) {
            this.finishTask(intent0);
            return 2;
        }
        EnhancedIntentService..Lambda.2 enhancedIntentService$$Lambda$20 = (Task task0) -> this.finishTask(intent0);
        task0.addOnCompleteListener(EnhancedIntentService..Lambda.1.$instance, enhancedIntentService$$Lambda$20);
        return 3;
    }

    // 检测为 Lambda 实现
    private Task processIntent(Intent intent0) [...]

    boolean stopSelfResultHook(int v) {
        return this.stopSelfResult(v);
    }
}

