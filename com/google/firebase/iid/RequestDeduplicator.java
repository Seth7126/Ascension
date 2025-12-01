package com.google.firebase.iid;

import android.util.Log;
import android.util.Pair;
import androidx.collection.ArrayMap;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import java.util.concurrent.Executor;

class RequestDeduplicator {
    interface GetTokenRequest {
        Task start();
    }

    private final Executor executor;
    private final Map getTokenRequests;

    RequestDeduplicator(Executor executor0) {
        this.getTokenRequests = new ArrayMap();
        this.executor = executor0;
    }

    Task getOrStartGetTokenRequest(String s, String s1, GetTokenRequest requestDeduplicator$GetTokenRequest0) {
        synchronized(this) {
            Pair pair0 = new Pair(s, s1);
            Task task0 = (Task)this.getTokenRequests.get(pair0);
            if(task0 != null) {
                if(Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Joining ongoing request for: " + pair0);
                }
                return task0;
            }
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Making new request for: " + pair0);
            }
            Task task1 = requestDeduplicator$GetTokenRequest0.start();
            RequestDeduplicator..Lambda.0 requestDeduplicator$$Lambda$00 = (Task task0) -> synchronized(this) {
                this.getTokenRequests.remove(pair0);
                return task0;
            };
            Task task2 = task1.continueWithTask(this.executor, requestDeduplicator$$Lambda$00);
            this.getTokenRequests.put(pair0, task2);
            return task2;
        }
    }

    // 检测为 Lambda 实现
    final Task lambda$getOrStartGetTokenRequest$0$RequestDeduplicator(Pair pair0, Task task0) throws Exception [...]
}

