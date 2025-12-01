package com.google.firebase.iid;

import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

public class FirebaseIidMessengerCompat implements Parcelable {
    public static final class HandleOldParcelNameClassLoader extends ClassLoader {
        @Override
        protected final Class loadClass(String s, boolean z) throws ClassNotFoundException {
            if("com.google.android.gms.iid.MessengerCompat".equals(s)) {
                if(FirebaseInstanceId.isDebugLogEnabled()) {
                    Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
                }
                return FirebaseIidMessengerCompat.class;
            }
            return super.loadClass(s, z);
        }
    }

    public static final Parcelable.Creator CREATOR;
    Messenger messenger;
    IMessengerCompat messengerCompat;

    static {
        FirebaseIidMessengerCompat.CREATOR = new Parcelable.Creator() {
            public FirebaseIidMessengerCompat createFromParcel(Parcel parcel0) {
                IBinder iBinder0 = parcel0.readStrongBinder();
                return iBinder0 == null ? null : new FirebaseIidMessengerCompat(iBinder0);
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            public FirebaseIidMessengerCompat[] newArray(int v) {
                return new FirebaseIidMessengerCompat[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        };
    }

    public FirebaseIidMessengerCompat(Handler handler0) {
        this.messenger = new Messenger(handler0);
    }

    public FirebaseIidMessengerCompat(IBinder iBinder0) {
        this.messenger = new Messenger(iBinder0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override
    public boolean equals(Object object0) {
        if(object0 == null) {
            return false;
        }
        try {
            return this.getBinder().equals(((FirebaseIidMessengerCompat)object0).getBinder());
        }
        catch(ClassCastException unused_ex) {
            return false;
        }
    }

    public IBinder getBinder() {
        Messenger messenger0 = this.messenger;
        return messenger0 == null ? this.messengerCompat.asBinder() : messenger0.getBinder();
    }

    public static int getSendingUid(Message message0) {
        return FirebaseIidMessengerCompat.getSendingUidNew(message0);
    }

    private static int getSendingUidNew(Message message0) {
        return message0.sendingUid;
    }

    @Override
    public int hashCode() {
        return this.getBinder().hashCode();
    }

    public void send(Message message0) throws RemoteException {
        Messenger messenger0 = this.messenger;
        if(messenger0 != null) {
            messenger0.send(message0);
            return;
        }
        this.messengerCompat.send(message0);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(Parcel parcel0, int v) {
        Messenger messenger0 = this.messenger;
        if(messenger0 != null) {
            parcel0.writeStrongBinder(messenger0.getBinder());
            return;
        }
        parcel0.writeStrongBinder(this.messengerCompat.asBinder());
    }
}

