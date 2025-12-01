package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.firebase-iid.zza;
import com.google.android.gms.internal.firebase-iid.zze;
import com.google.android.gms.internal.firebase-iid.zzf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import jeb.synthetic.FIN;

public class MessengerIpcClient {
    class Connection implements ServiceConnection {
        final Messenger appMessenger;
        MessengerWrapper gmsCoreMessenger;
        final Queue requestsToBeSent;
        final SparseArray requestsWaitingForResponse;
        int state;

        private Connection() {
            this.state = 0;
            this.appMessenger = new Messenger(new zze(Looper.getMainLooper(), (Message message0) -> {
                Request messengerIpcClient$Request0;
                int v = message0.arg1;
                if(Log.isLoggable("MessengerIpcClient", 3)) {
                    Log.d("MessengerIpcClient", "Received response to request: " + v);
                }
                synchronized(this) {
                    messengerIpcClient$Request0 = (Request)this.requestsWaitingForResponse.get(v);
                    if(messengerIpcClient$Request0 == null) {
                        Log.w("MessengerIpcClient", "Received response for unknown request: " + v);
                        return true;
                    }
                    this.requestsWaitingForResponse.remove(v);
                    this.unbindIfFinished();
                }
                messengerIpcClient$Request0.handleResponse(message0.getData());
                return true;
            }));
            this.requestsToBeSent = new ArrayDeque();
            this.requestsWaitingForResponse = new SparseArray();
        }

        Connection(com.google.firebase.iid.MessengerIpcClient.1 messengerIpcClient$10) {
        }

        boolean enqueueRequest(Request messengerIpcClient$Request0) {
            __monitor_enter(this);
            int v = FIN.finallyOpen$NT();
            switch(this.state) {
                case 0: {
                    this.requestsToBeSent.add(messengerIpcClient$Request0);
                    this.startConnection();
                    FIN.finallyExec$NT(v);
                    return true;
                }
                case 1: {
                    this.requestsToBeSent.add(messengerIpcClient$Request0);
                    FIN.finallyExec$NT(v);
                    return true;
                }
                case 2: {
                    this.requestsToBeSent.add(messengerIpcClient$Request0);
                    this.scheduleSendingRequests();
                    FIN.finallyExec$NT(v);
                    return true;
                }
                case 3: 
                case 4: {
                    FIN.finallyCodeBegin$NT(v);
                    __monitor_exit(this);
                    FIN.finallyCodeEnd$NT(v);
                    return false;
                }
                default: {
                    FIN.finallyExec$NT(v);
                    throw new IllegalStateException("Unknown state: " + this.state);
                }
            }
        }

        void failAllPendingReqests(RequestFailedException messengerIpcClient$RequestFailedException0) {
            for(Object object0: this.requestsToBeSent) {
                ((Request)object0).fail(messengerIpcClient$RequestFailedException0);
            }
            this.requestsToBeSent.clear();
            for(int v = 0; v < this.requestsWaitingForResponse.size(); ++v) {
                ((Request)this.requestsWaitingForResponse.valueAt(v)).fail(messengerIpcClient$RequestFailedException0);
            }
            this.requestsWaitingForResponse.clear();
        }

        void handleDisconnect(int v, String s) {
            synchronized(this) {
                if(Log.isLoggable("MessengerIpcClient", 3)) {
                    String s1 = String.valueOf(s);
                    Log.d("MessengerIpcClient", (s1.length() == 0 ? new String("Disconnected: ") : "Disconnected: " + s1));
                }
                int v2 = this.state;
                if(v2 != 0) {
                    switch(v2) {
                        case 1: 
                        case 2: {
                            if(Log.isLoggable("MessengerIpcClient", 2)) {
                                Log.v("MessengerIpcClient", "Unbinding service");
                            }
                            this.state = 4;
                            ConnectionTracker.getInstance().unbindService(MessengerIpcClient.this.context, this);
                            this.failAllPendingReqests(new RequestFailedException(v, s));
                            return;
                        }
                        case 3: {
                            this.state = 4;
                            return;
                        }
                        case 4: {
                            return;
                        }
                        default: {
                            throw new IllegalStateException("Unknown state: " + this.state);
                        }
                    }
                }
            }
            throw new IllegalStateException();
        }

        // 检测为 Lambda 实现
        final void lambda$onServiceConnected$0$MessengerIpcClient$Connection(IBinder iBinder0) [...]

        // 检测为 Lambda 实现
        final void lambda$onServiceDisconnected$3$MessengerIpcClient$Connection() [...]

        // 检测为 Lambda 实现
        final void lambda$scheduleSendingRequests$1$MessengerIpcClient$Connection(Request messengerIpcClient$Request0) [...]

        // 检测为 Lambda 实现
        final void lambda$scheduleSendingRequests$2$MessengerIpcClient$Connection() [...]

        @Override  // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
            if(Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service connected");
            }
            MessengerIpcClient.this.executor.execute(() -> synchronized(this) {
                if(iBinder0 == null) {
                    this.handleDisconnect(0, "Null service connection");
                    return;
                }
                try {
                    this.gmsCoreMessenger = new MessengerWrapper(iBinder0);
                }
                catch(RemoteException remoteException0) {
                    this.handleDisconnect(0, remoteException0.getMessage());
                    return;
                }
                this.state = 2;
                this.scheduleSendingRequests();
            });
        }

        @Override  // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName0) {
            if(Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Service disconnected");
            }
            MessengerIpcClient.this.executor.execute(() -> this.handleDisconnect(2, "Service disconnected"));
        }

        // 检测为 Lambda 实现
        boolean receivedResponse(Message message0) [...]

        void scheduleSendingRequests() {
            MessengerIpcClient.Connection..Lambda.3 messengerIpcClient$Connection$$Lambda$30 = () -> {
                Request messengerIpcClient$Request0;
                while(true) {
                    synchronized(this) {
                        if(this.state != 2) {
                            return;
                        }
                        if(this.requestsToBeSent.isEmpty()) {
                            this.unbindIfFinished();
                            return;
                        }
                        messengerIpcClient$Request0 = (Request)this.requestsToBeSent.poll();
                        this.requestsWaitingForResponse.put(messengerIpcClient$Request0.requestId, messengerIpcClient$Request0);
                        MessengerIpcClient.Connection..Lambda.5 messengerIpcClient$Connection$$Lambda$50 = () -> this.timeoutRequest(messengerIpcClient$Request0.requestId);
                        MessengerIpcClient.this.executor.schedule(messengerIpcClient$Connection$$Lambda$50, 30L, TimeUnit.SECONDS);
                    }
                    this.sendRequestOverMessenger(messengerIpcClient$Request0);
                }
            };
            MessengerIpcClient.this.executor.execute(messengerIpcClient$Connection$$Lambda$30);
        }

        void sendRequestOverMessenger(Request messengerIpcClient$Request0) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Sending " + messengerIpcClient$Request0);
            }
            Message message0 = messengerIpcClient$Request0.createMessage(MessengerIpcClient.this.context, this.appMessenger);
            try {
                this.gmsCoreMessenger.send(message0);
            }
            catch(RemoteException remoteException0) {
                this.handleDisconnect(2, remoteException0.getMessage());
            }
        }

        void startConnection() {
            Preconditions.checkState(this.state == 0);
            if(Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Starting bind to GmsCore");
            }
            this.state = 1;
            Intent intent0 = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent0.setPackage("com.google.android.gms");
            if(!ConnectionTracker.getInstance().bindService(MessengerIpcClient.this.context, intent0, this, 1)) {
                this.handleDisconnect(0, "Unable to bind to service");
                return;
            }
            MessengerIpcClient.Connection..Lambda.1 messengerIpcClient$Connection$$Lambda$10 = () -> synchronized(this) {
                if(this.state == 1) {
                    this.handleDisconnect(1, "Timed out while binding");
                }
            };
            MessengerIpcClient.this.executor.schedule(messengerIpcClient$Connection$$Lambda$10, 30L, TimeUnit.SECONDS);
        }

        // 检测为 Lambda 实现
        void timeoutConnection() [...]

        void timeoutRequest(int v) {
            synchronized(this) {
                Request messengerIpcClient$Request0 = (Request)this.requestsWaitingForResponse.get(v);
                if(messengerIpcClient$Request0 != null) {
                    Log.w("MessengerIpcClient", "Timing out request: " + v);
                    this.requestsWaitingForResponse.remove(v);
                    messengerIpcClient$Request0.fail(new RequestFailedException(3, "Timed out waiting for response"));
                    this.unbindIfFinished();
                }
            }
        }

        void unbindIfFinished() {
            synchronized(this) {
                if(this.state == 2 && this.requestsToBeSent.isEmpty() && this.requestsWaitingForResponse.size() == 0) {
                    if(Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                    }
                    this.state = 3;
                    ConnectionTracker.getInstance().unbindService(MessengerIpcClient.this.context, this);
                }
            }
        }
    }

    static class MessengerWrapper {
        private final Messenger messenger;
        private final FirebaseIidMessengerCompat messengerCompat;

        MessengerWrapper(IBinder iBinder0) throws RemoteException {
            String s = iBinder0.getInterfaceDescriptor();
            if("android.os.IMessenger".equals(s)) {
                this.messenger = new Messenger(iBinder0);
                this.messengerCompat = null;
                return;
            }
            if("com.google.android.gms.iid.IMessengerCompat".equals(s)) {
                this.messengerCompat = new FirebaseIidMessengerCompat(iBinder0);
                this.messenger = null;
                return;
            }
            String s1 = String.valueOf(s);
            Log.w("MessengerIpcClient", (s1.length() == 0 ? new String("Invalid interface descriptor: ") : "Invalid interface descriptor: " + s1));
            throw new RemoteException();
        }

        void send(Message message0) throws RemoteException {
            Messenger messenger0 = this.messenger;
            if(messenger0 != null) {
                messenger0.send(message0);
                return;
            }
            FirebaseIidMessengerCompat firebaseIidMessengerCompat0 = this.messengerCompat;
            if(firebaseIidMessengerCompat0 == null) {
                throw new IllegalStateException("Both messengers are null");
            }
            firebaseIidMessengerCompat0.send(message0);
        }
    }

    static class OneWayRequest extends Request {
        OneWayRequest(int v, int v1, Bundle bundle0) {
            super(v, v1, bundle0);
        }

        @Override  // com.google.firebase.iid.MessengerIpcClient$Request
        void handleResponseInternal(Bundle bundle0) {
            if(bundle0.getBoolean("ack", false)) {
                this.finish(null);
                return;
            }
            this.fail(new RequestFailedException(4, "Invalid response to one way request"));
        }

        @Override  // com.google.firebase.iid.MessengerIpcClient$Request
        boolean isOneWay() {
            return true;
        }
    }

    static abstract class Request {
        final Bundle data;
        final int requestId;
        final TaskCompletionSource taskCompletionSource;
        final int what;

        Request(int v, int v1, Bundle bundle0) {
            this.taskCompletionSource = new TaskCompletionSource();
            this.requestId = v;
            this.what = v1;
            this.data = bundle0;
        }

        Message createMessage(Context context0, Messenger messenger0) {
            Message message0 = Message.obtain();
            message0.what = this.what;
            message0.arg1 = this.requestId;
            message0.replyTo = messenger0;
            Bundle bundle0 = new Bundle();
            bundle0.putBoolean("oneWay", this.isOneWay());
            bundle0.putString("pkg", "com.playdekgames.android.Ascension");
            bundle0.putBundle("data", this.data);
            message0.setData(bundle0);
            return message0;
        }

        void fail(RequestFailedException messengerIpcClient$RequestFailedException0) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Failing " + this + " with " + messengerIpcClient$RequestFailedException0);
            }
            this.taskCompletionSource.setException(messengerIpcClient$RequestFailedException0);
        }

        void finish(Object object0) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Finishing " + this + " with " + object0);
            }
            this.taskCompletionSource.setResult(object0);
        }

        Task getTask() {
            return this.taskCompletionSource.getTask();
        }

        void handleResponse(Bundle bundle0) {
            if(bundle0.getBoolean("unsupported", false)) {
                this.fail(new RequestFailedException(4, "Not supported by GmsCore"));
                return;
            }
            this.handleResponseInternal(bundle0);
        }

        abstract void handleResponseInternal(Bundle arg1);

        abstract boolean isOneWay();

        @Override
        public String toString() {
            boolean z = this.isOneWay();
            return "Request { what=" + this.what + " id=" + this.requestId + " oneWay=" + z + "}";
        }
    }

    public static class RequestFailedException extends Exception {
        @Retention(RetentionPolicy.SOURCE)
        public @interface ErrorCode {
            public static final int CONNECTION_TIMEOUT = 1;
            public static final int FAILED_TO_CONNECT = 0;
            public static final int REMOTE_ERROR = 2;
            public static final int REQUEST_TIMEOUT = 3;
            public static final int UNSUPPORTED = 4;

        }

        private final int errorCode;

        public RequestFailedException(int v, String s) {
            super(s);
            this.errorCode = v;
        }

        public int getErrorCode() {
            return this.errorCode;
        }
    }

    static class TwoWayRequest extends Request {
        TwoWayRequest(int v, int v1, Bundle bundle0) {
            super(v, v1, bundle0);
        }

        @Override  // com.google.firebase.iid.MessengerIpcClient$Request
        void handleResponseInternal(Bundle bundle0) {
            Bundle bundle1 = bundle0.getBundle("data");
            if(bundle1 == null) {
                bundle1 = Bundle.EMPTY;
            }
            this.finish(bundle1);
        }

        @Override  // com.google.firebase.iid.MessengerIpcClient$Request
        boolean isOneWay() {
            return false;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface What {
        public static final int FCM_ACK = 2;
        public static final int IID_TOKEN_REQUEST = 1;
        public static final int LEGACY_IID_TOKEN_REQUEST;

    }

    public static final String KEY_ACK = "ack";
    public static final String KEY_DATA = "data";
    public static final String KEY_ONE_WAY = "oneWay";
    public static final String KEY_PACKAGE = "pkg";
    public static final String KEY_UNSUPPORTED = "unsupported";
    private Connection connection;
    private final Context context;
    private final ScheduledExecutorService executor;
    private static MessengerIpcClient instance;
    private int nextRequestId;

    MessengerIpcClient(Context context0, ScheduledExecutorService scheduledExecutorService0) {
        this.connection = new Connection(this, null);
        this.nextRequestId = 1;
        this.executor = scheduledExecutorService0;
        this.context = context0.getApplicationContext();
    }

    public static MessengerIpcClient getInstance(Context context0) {
        synchronized(MessengerIpcClient.class) {
            if(MessengerIpcClient.instance == null) {
                MessengerIpcClient.instance = new MessengerIpcClient(context0, zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), zzf.zza));
            }
            return MessengerIpcClient.instance;
        }
    }

    private int getNextRequestId() {
        int v;
        synchronized(this) {
            v = this.nextRequestId;
            this.nextRequestId = v + 1;
        }
        return v;
    }

    public static void resetForTesting() {
        synchronized(MessengerIpcClient.class) {
            MessengerIpcClient.instance = null;
        }
    }

    public Task sendOneWayRequest(int v, Bundle bundle0) {
        return this.sendRequest(new OneWayRequest(this.getNextRequestId(), v, bundle0));
    }

    private Task sendRequest(Request messengerIpcClient$Request0) {
        synchronized(this) {
            if(Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing " + messengerIpcClient$Request0);
            }
            if(!this.connection.enqueueRequest(messengerIpcClient$Request0)) {
                Connection messengerIpcClient$Connection0 = new Connection(this, null);
                this.connection = messengerIpcClient$Connection0;
                messengerIpcClient$Connection0.enqueueRequest(messengerIpcClient$Request0);
            }
            return messengerIpcClient$Request0.getTask();
        }
    }

    public Task sendRequestForResponse(int v, Bundle bundle0) {
        return this.sendRequest(new TwoWayRequest(this.getNextRequestId(), v, bundle0));
    }

    class com.google.firebase.iid.MessengerIpcClient.1 {
    }

}

