package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ILicenseResultListener extends IInterface {
    public static abstract class Stub extends Binder implements ILicenseResultListener {
        static class Proxy implements ILicenseResultListener {
            private IBinder mRemote;

            Proxy(IBinder iBinder0) {
                this.mRemote = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return "com.android.vending.licensing.ILicenseResultListener";
            }

            @Override  // com.google.android.vending.licensing.ILicenseResultListener
            public void verifyLicense(int v, String s, String s1) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
                    parcel0.writeInt(v);
                    parcel0.writeString(s);
                    parcel0.writeString(s1);
                    this.mRemote.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }
        }

        private static final String DESCRIPTOR = "com.android.vending.licensing.ILicenseResultListener";
        static final int TRANSACTION_verifyLicense = 1;

        public Stub() {
            this.attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static ILicenseResultListener asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
            return iInterface0 != null && iInterface0 instanceof ILicenseResultListener ? ((ILicenseResultListener)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            switch(v) {
                case 1: {
                    parcel0.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
                    this.verifyLicense(parcel0.readInt(), parcel0.readString(), parcel0.readString());
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("com.android.vending.licensing.ILicenseResultListener");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    void verifyLicense(int arg1, String arg2, String arg3) throws RemoteException;
}

