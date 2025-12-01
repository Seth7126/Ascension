package com.google.firebase.iid;

import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

interface IMessengerCompat extends IInterface {
    public static class Impl extends Binder implements IMessengerCompat {
        private final Handler handler;

        Impl(Handler handler0) {
            this.handler = handler0;
            this.attachInterface(this, "com.google.android.gms.iid.IMessengerCompat");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            parcel0.enforceInterface(this.getInterfaceDescriptor());
            if(v == 1) {
                this.send((parcel0.readInt() == 0 ? null : ((Message)Message.CREATOR.createFromParcel(parcel0))));
                return true;
            }
            return false;
        }

        @Override  // com.google.firebase.iid.IMessengerCompat
        public void send(Message message0) throws RemoteException {
            message0.arg2 = Binder.getCallingUid();
            this.handler.dispatchMessage(message0);
        }
    }

    public static class Proxy implements IMessengerCompat {
        private final IBinder remote;

        Proxy(IBinder iBinder0) {
            this.remote = iBinder0;
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this.remote;
        }

        @Override  // com.google.firebase.iid.IMessengerCompat
        public void send(Message message0) throws RemoteException {
            Parcel parcel0 = Parcel.obtain();
            parcel0.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            parcel0.writeInt(1);
            message0.writeToParcel(parcel0, 0);
            try {
                this.remote.transact(1, parcel0, null, 1);
            }
            finally {
                parcel0.recycle();
            }
        }
    }

    void send(Message arg1) throws RemoteException;
}

