package com.google.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ILicensingService extends IInterface {
    public static abstract class Stub extends Binder implements ILicensingService {
        static class Proxy implements ILicensingService {
            private IBinder mRemote;

            Proxy(IBinder iBinder0) {
                this.mRemote = iBinder0;
            }

            @Override  // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override  // com.google.android.vending.licensing.ILicensingService
            public void checkLicense(long v, String s, ILicenseResultListener iLicenseResultListener0) throws RemoteException {
                Parcel parcel0 = Parcel.obtain();
                try {
                    parcel0.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
                    parcel0.writeLong(v);
                    parcel0.writeString(s);
                    parcel0.writeStrongBinder((iLicenseResultListener0 == null ? null : iLicenseResultListener0.asBinder()));
                    this.mRemote.transact(1, parcel0, null, 1);
                }
                finally {
                    parcel0.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return "com.android.vending.licensing.ILicensingService";
            }
        }

        private static final String DESCRIPTOR = "com.android.vending.licensing.ILicensingService";
        static final int TRANSACTION_checkLicense = 1;

        public Stub() {
            this.attachInterface(this, "com.android.vending.licensing.ILicensingService");
        }

        @Override  // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static ILicensingService asInterface(IBinder iBinder0) {
            if(iBinder0 == null) {
                return null;
            }
            IInterface iInterface0 = iBinder0.queryLocalInterface("com.android.vending.licensing.ILicensingService");
            return iInterface0 != null && iInterface0 instanceof ILicensingService ? ((ILicensingService)iInterface0) : new Proxy(iBinder0);
        }

        @Override  // android.os.Binder
        public boolean onTransact(int v, Parcel parcel0, Parcel parcel1, int v1) throws RemoteException {
            switch(v) {
                case 1: {
                    parcel0.enforceInterface("com.android.vending.licensing.ILicensingService");
                    this.checkLicense(parcel0.readLong(), parcel0.readString(), com.google.android.vending.licensing.ILicenseResultListener.Stub.asInterface(parcel0.readStrongBinder()));
                    return true;
                }
                case 0x5F4E5446: {
                    parcel1.writeString("com.android.vending.licensing.ILicensingService");
                    return true;
                }
                default: {
                    return super.onTransact(v, parcel0, parcel1, v1);
                }
            }
        }
    }

    void checkLicense(long arg1, String arg2, ILicenseResultListener arg3) throws RemoteException;
}

