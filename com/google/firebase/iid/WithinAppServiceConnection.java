package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WithinAppServiceConnection implements ServiceConnection {
    static class BindRequest {
        final Intent intent;
        private final TaskCompletionSource taskCompletionSource;

        BindRequest(Intent intent0) {
            this.taskCompletionSource = new TaskCompletionSource();
            this.intent = intent0;
        }

        void arrangeTimeout(ScheduledExecutorService scheduledExecutorService0) {
            this.getTask().addOnCompleteListener(scheduledExecutorService0, (Task task0) -> scheduledExecutorService0.schedule(() -> {
                Log.w("FirebaseInstanceId", "Service took too long to process intent: " + this.intent.getAction() + " App may get closed.");
                this.finish();
            }, 9000L, TimeUnit.MILLISECONDS).cancel(false));
        }

        void finish() {
            this.taskCompletionSource.trySetResult(null);
        }

        Task getTask() {
            return this.taskCompletionSource.getTask();
        }

        // 检测为 Lambda 实现
        final void lambda$arrangeTimeout$0$WithinAppServiceConnection$BindRequest() [...]

        // 检测为 Lambda 实现
        static final void lambda$arrangeTimeout$1$WithinAppServiceConnection$BindRequest(ScheduledFuture scheduledFuture0, Task task0) [...]
    }

    private WithinAppServiceBinder binder;
    private boolean connectionInProgress;
    private final Intent connectionIntent;
    private final Context context;
    private final Queue intentQueue;
    private final ScheduledExecutorService scheduledExecutorService;

    public WithinAppServiceConnection(Context context0, String s) {
        this(context0, s, new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    WithinAppServiceConnection(Context context0, String s, ScheduledExecutorService scheduledExecutorService0) {
        this.intentQueue = new ArrayDeque();
        this.connectionInProgress = false;
        this.context = context0.getApplicationContext();
        this.connectionIntent = new Intent(s).setPackage("com.playdekgames.android.Ascension");
        this.scheduledExecutorService = scheduledExecutorService0;
    }

    private void finishAllInQueue() {
        while(!this.intentQueue.isEmpty()) {
            ((BindRequest)this.intentQueue.poll()).finish();
        }
    }

    private void flushQueue() {
        synchronized(this) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "flush queue called");
            }
            while(!this.intentQueue.isEmpty()) {
                if(Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "found intent to be delivered");
                }
                if(this.binder != null && this.binder.isBinderAlive()) {
                    if(Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", "binder is alive, sending the intent.");
                    }
                    BindRequest withinAppServiceConnection$BindRequest0 = (BindRequest)this.intentQueue.poll();
                    this.binder.send(withinAppServiceConnection$BindRequest0);
                    continue;
                }
                this.startConnectionIfNeeded();
                return;
            }
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "onServiceConnected: " + componentName0);
            }
            this.connectionInProgress = false;
            if(!(iBinder0 instanceof WithinAppServiceBinder)) {
                Log.e("FirebaseInstanceId", "Invalid service connection: " + iBinder0);
                this.finishAllInQueue();
                return;
            }
            this.binder = (WithinAppServiceBinder)iBinder0;
            this.flushQueue();
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName0) {
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "onServiceDisconnected: " + componentName0);
        }
        this.flushQueue();
    }

    public Task sendIntent(Intent intent0) {
        synchronized(this) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "new intent queued in the bind-strategy delivery");
            }
            BindRequest withinAppServiceConnection$BindRequest0 = new BindRequest(intent0);
            withinAppServiceConnection$BindRequest0.arrangeTimeout(this.scheduledExecutorService);
            this.intentQueue.add(withinAppServiceConnection$BindRequest0);
            this.flushQueue();
            return withinAppServiceConnection$BindRequest0.getTask();
        }
    }

    private void startConnectionIfNeeded() {
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "binder is dead. start connection? " + !this.connectionInProgress);
        }
        if(this.connectionInProgress) {
            return;
        }
        try {
            this.connectionInProgress = true;
            if(ConnectionTracker.getInstance().bindService(this.context, this.connectionIntent, this, 65)) {
                return;
            }
            Log.e("FirebaseInstanceId", "binding to the service failed");
        }
        catch(SecurityException securityException0) {
            Log.e("FirebaseInstanceId", "Exception while binding the service", securityException0);
        }
        this.connectionInProgress = false;
        this.finishAllInQueue();
    }
}

