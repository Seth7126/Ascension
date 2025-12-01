package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.internal.firebase-iid.zze;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Rpc {
    private static PendingIntent appPendingIntent;
    private final Context context;
    private final Metadata metadata;
    private Messenger outgoingMessenger;
    private FirebaseIidMessengerCompat outgoingMessengerCompat;
    private static int requestId;
    private final SimpleArrayMap responseCallbacks;
    private Messenger responseMessenger;
    private final ScheduledExecutorService timeoutExecutor;

    static {
    }

    public Rpc(Context context0, Metadata metadata0) {
        this.responseCallbacks = new SimpleArrayMap();
        this.context = context0;
        this.metadata = metadata0;
        this.responseMessenger = new Messenger(new zze(Looper.getMainLooper()) {
            @Override  // android.os.Handler
            public void handleMessage(Message message0) {
                Rpc.this.handleIncomingMessage(message0);
            }
        });
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor0.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor0.allowCoreThreadTimeOut(true);
        this.timeoutExecutor = scheduledThreadPoolExecutor0;
    }

    private static boolean gmsCoreRespondedWithMessenger(Bundle bundle0) {
        return bundle0 != null && bundle0.containsKey("google.messenger");
    }

    private void handleIidResponse(Intent intent0) {
        String s = intent0.getAction();
        if(!"com.google.android.c2dm.intent.REGISTRATION".equals(s)) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                String s1 = String.valueOf(s);
                Log.d("FirebaseInstanceId", (s1.length() == 0 ? new String("Unexpected response action: ") : "Unexpected response action: " + s1));
            }
            return;
        }
        String s2 = intent0.getStringExtra("registration_id");
        if(s2 == null) {
            s2 = intent0.getStringExtra("unregistered");
        }
        if(s2 == null) {
            this.processError(intent0);
            return;
        }
        Matcher matcher0 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(s2);
        if(!matcher0.matches()) {
            if(Log.isLoggable("FirebaseInstanceId", 3)) {
                String s3 = String.valueOf(s2);
                Log.d("FirebaseInstanceId", (s3.length() == 0 ? new String("Unexpected response string: ") : "Unexpected response string: " + s3));
            }
            return;
        }
        String s4 = matcher0.group(1);
        String s5 = matcher0.group(2);
        Bundle bundle0 = intent0.getExtras();
        bundle0.putString("registration_id", s5);
        this.setResponse(s4, bundle0);
    }

    private void handleIncomingMessage(Message message0) {
        if(message0 != null && message0.obj instanceof Intent) {
            Intent intent0 = (Intent)message0.obj;
            intent0.setExtrasClassLoader(new HandleOldParcelNameClassLoader());
            if(intent0.hasExtra("google.messenger")) {
                Parcelable parcelable0 = intent0.getParcelableExtra("google.messenger");
                if(parcelable0 instanceof FirebaseIidMessengerCompat) {
                    this.outgoingMessengerCompat = (FirebaseIidMessengerCompat)parcelable0;
                }
                if(parcelable0 instanceof Messenger) {
                    this.outgoingMessenger = (Messenger)parcelable0;
                }
            }
            this.handleIidResponse(((Intent)message0.obj));
            return;
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    static final Bundle lambda$registerRpc$0$Rpc(Task task0) throws Exception {
        if(task0.isSuccessful()) {
            return (Bundle)task0.getResult();
        }
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Error making request: " + task0.getException());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    // 检测为 Lambda 实现
    static final void lambda$registerRpcInternal$3$Rpc(TaskCompletionSource taskCompletionSource0) [...]

    // 检测为 Lambda 实现
    final void lambda$registerRpcInternal$4$Rpc(String s, ScheduledFuture scheduledFuture0, Task task0) [...]

    // 去混淆评级： 低(20)
    static final Task lambda$registerRpcViaIntent$1$Rpc(Bundle bundle0) throws Exception {
        return Rpc.gmsCoreRespondedWithMessenger(bundle0) ? Tasks.forResult(null) : Tasks.forResult(bundle0);
    }

    // 检测为 Lambda 实现
    final Task lambda$registerRpcViaIntent$2$Rpc(Bundle bundle0, Task task0) throws Exception [...]

    public static String nextId() [...] // 潜在的解密器

    void processError(Intent intent0) {
        String s = intent0.getStringExtra("error");
        if(s == null) {
            Log.w("FirebaseInstanceId", "Unexpected response, no error or registration id " + intent0.getExtras());
            return;
        }
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            String s1 = String.valueOf(s);
            Log.d("FirebaseInstanceId", (s1.length() == 0 ? new String("Received InstanceID error ") : "Received InstanceID error " + s1));
        }
        if(s.startsWith("|")) {
            String[] arr_s = s.split("\\|");
            if(arr_s.length > 2 && "ID".equals(arr_s[1])) {
                String s2 = arr_s[2];
                String s3 = arr_s[3];
                if(s3.startsWith(":")) {
                    s3 = s3.substring(1);
                }
                this.setResponse(s2, intent0.putExtra("error", s3).getExtras());
                return;
            }
            String s4 = String.valueOf(s);
            Log.w("FirebaseInstanceId", (s4.length() == 0 ? new String("Unexpected structured response ") : "Unexpected structured response " + s4));
            return;
        }
        synchronized(this.responseCallbacks) {
            for(int v1 = 0; v1 < this.responseCallbacks.size(); ++v1) {
                this.setResponse(((String)this.responseCallbacks.keyAt(v1)), intent0.getExtras());
            }
        }
    }

    Task registerRpc(Bundle bundle0) {
        return this.metadata.getGmsVersionCode() < 12000000 ? this.registerRpcViaIntent(bundle0) : MessengerIpcClient.getInstance(this.context).sendRequestForResponse(1, bundle0).continueWith(FirebaseIidExecutors.directExecutor(), Rpc..Lambda.0.$instance);
    }

    private Task registerRpcInternal(Bundle bundle0) {
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        synchronized(this.responseCallbacks) {
            this.responseCallbacks.put("0", taskCompletionSource0);
        }
        this.startRegisterRpc(bundle0, "0");
        Rpc..Lambda.2 rpc$$Lambda$20 = () -> if(taskCompletionSource0.trySetException(new IOException("TIMEOUT"))) {
            Log.w("FirebaseInstanceId", "No response");
        };
        taskCompletionSource0.getTask().addOnCompleteListener(FirebaseIidExecutors.directExecutor(), (Task task0) -> {
            synchronized(this.responseCallbacks) {
                this.responseCallbacks.remove("0");
            }
            this.timeoutExecutor.schedule(rpc$$Lambda$20, 30L, TimeUnit.SECONDS).cancel(false);
        });
        return taskCompletionSource0.getTask();
    }

    private Task registerRpcViaIntent(Bundle bundle0) {
        return this.metadata.isGmscorePresent() ? this.registerRpcInternal(bundle0).continueWithTask(FirebaseIidExecutors.directExecutor(), (Task task0) -> {
            if(!task0.isSuccessful()) {
                return task0;
            }
            return Rpc.gmsCoreRespondedWithMessenger(((Bundle)task0.getResult())) ? this.registerRpcInternal(bundle0).onSuccessTask(FirebaseIidExecutors.directExecutor(), Rpc..Lambda.4.$instance) : task0;
        }) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
    }

    protected void sendRequest(Intent intent0, String s) {
        intent0.putExtra("kid", "|ID|" + s + "|");
        if(Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Sending " + intent0.getExtras());
        }
        intent0.putExtra("google.messenger", this.responseMessenger);
        if(this.outgoingMessenger != null || this.outgoingMessengerCompat != null) {
            Message message0 = Message.obtain();
            message0.obj = intent0;
            try {
                Messenger messenger0 = this.outgoingMessenger;
                if(messenger0 != null) {
                    messenger0.send(message0);
                    return;
                }
                this.outgoingMessengerCompat.send(message0);
                return;
            }
            catch(RemoteException unused_ex) {
                if(Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                }
            }
        }
        if(this.metadata.getIidImplementation() == 2) {
            this.context.sendBroadcast(intent0);
            return;
        }
        this.context.startService(intent0);
    }

    public static void setPendingIntentExtra(Context context0, Intent intent0) {
        synchronized(Rpc.class) {
            if(Rpc.appPendingIntent == null) {
                Intent intent1 = new Intent();
                intent1.setPackage("com.google.example.invalidpackage");
                Rpc.appPendingIntent = PendingIntent.getBroadcast(context0, 0, intent1, 0);
            }
            intent0.putExtra("app", Rpc.appPendingIntent);
        }
    }

    private void setResponse(String s, Bundle bundle0) {
        synchronized(this.responseCallbacks) {
            TaskCompletionSource taskCompletionSource0 = (TaskCompletionSource)this.responseCallbacks.remove(s);
            if(taskCompletionSource0 == null) {
                String s1 = String.valueOf(s);
                Log.w("FirebaseInstanceId", (s1.length() == 0 ? new String("Missing callback for ") : "Missing callback for " + s1));
                return;
            }
            taskCompletionSource0.setResult(bundle0);
        }
    }

    private void startRegisterRpc(Bundle bundle0, String s) {
        Intent intent0 = new Intent();
        intent0.setPackage("com.google.android.gms");
        if(this.metadata.getIidImplementation() == 2) {
            intent0.setAction("com.google.iid.TOKEN_REQUEST");
        }
        else {
            intent0.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent0.putExtras(bundle0);
        Rpc.setPendingIntentExtra(this.context, intent0);
        this.sendRequest(intent0, s);
    }
}

