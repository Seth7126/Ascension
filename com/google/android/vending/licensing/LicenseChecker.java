package com.google.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.vending.licensing.util.Base64;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class LicenseChecker implements ServiceConnection {
    class ResultListener extends Stub {
        private static final int ERROR_CONTACTING_SERVER = 0x101;
        private static final int ERROR_INVALID_PACKAGE_NAME = 0x102;
        private static final int ERROR_NON_MATCHING_UID = 0x103;
        private Runnable mOnTimeout;
        private final LicenseValidator mValidator;

        public ResultListener(LicenseValidator licenseValidator0) {
            this.mValidator = licenseValidator0;
            this.mOnTimeout = new Runnable() {
                @Override
                public void run() {
                    Log.i("LicenseChecker", "Check timed out.");
                    ResultListener.access$2(ResultListener.this).handleServiceConnectionError(ResultListener.access$0(ResultListener.this));
                    ResultListener.access$2(ResultListener.this).finishCheck(ResultListener.access$0(ResultListener.this));
                }
            };
            this.startTimeout();
        }

        private void clearTimeout() {
            Log.i("LicenseChecker", "Clearing timeout.");
            LicenseChecker.this.mHandler.removeCallbacks(this.mOnTimeout);
        }

        private void startTimeout() {
            Log.i("LicenseChecker", "Start monitoring timeout.");
            LicenseChecker.this.mHandler.postDelayed(this.mOnTimeout, 10000L);
        }

        @Override  // com.google.android.vending.licensing.ILicenseResultListener
        public void verifyLicense(int v, String s, String s1) {
            com.google.android.vending.licensing.LicenseChecker.ResultListener.2 licenseChecker$ResultListener$20 = new Runnable() {
                @Override
                public void run() {
                    Log.i("LicenseChecker", "Received response.");
                    if(LicenseChecker.this.mChecksInProgress.contains(ResultListener.this.mValidator)) {
                        ResultListener.this.clearTimeout();
                        ResultListener.this.mValidator.verify(LicenseChecker.this.mPublicKey, v, s, s1);
                        LicenseChecker.this.finishCheck(ResultListener.this.mValidator);
                    }
                }
            };
            LicenseChecker.this.mHandler.post(licenseChecker$ResultListener$20);
        }
    }

    private static final boolean DEBUG_LICENSE_ERROR = false;
    private static final String KEY_FACTORY_ALGORITHM = "RSA";
    private static final SecureRandom RANDOM = null;
    private static final String TAG = "LicenseChecker";
    private static final int TIMEOUT_MS = 10000;
    private final Set mChecksInProgress;
    private final Context mContext;
    private Handler mHandler;
    private final String mPackageName;
    private final Queue mPendingChecks;
    private final Policy mPolicy;
    private PublicKey mPublicKey;
    private ILicensingService mService;
    private final String mVersionCode;

    static {
        LicenseChecker.RANDOM = new SecureRandom();
    }

    public LicenseChecker(Context context0, Policy policy0, String s) {
        this.mChecksInProgress = new HashSet();
        this.mPendingChecks = new LinkedList();
        this.mContext = context0;
        this.mPolicy = policy0;
        this.mPublicKey = LicenseChecker.generatePublicKey(s);
        this.mPackageName = "com.playdekgames.android.Ascension";
        this.mVersionCode = LicenseChecker.getVersionCode(context0, "com.playdekgames.android.Ascension");
        HandlerThread handlerThread0 = new HandlerThread("background thread");
        handlerThread0.start();
        this.mHandler = new Handler(handlerThread0.getLooper());
    }

    public void checkAccess(LicenseCheckerCallback licenseCheckerCallback0) {
        synchronized(this) {
            if(this.mPolicy.allowAccess()) {
                Log.i("LicenseChecker", "Using cached license response");
                licenseCheckerCallback0.allow(0x100);
            }
            else {
                NullDeviceLimiter nullDeviceLimiter0 = new NullDeviceLimiter();
                int v1 = this.generateNonce();
                LicenseValidator licenseValidator0 = new LicenseValidator(this.mPolicy, nullDeviceLimiter0, licenseCheckerCallback0, v1, this.mPackageName, this.mVersionCode);
                if(this.mService == null) {
                    Log.i("LicenseChecker", "Binding to licensing service.");
                    try {
                        Intent intent0 = new Intent("com.android.vending.licensing.ILicensingService");
                        intent0.setPackage("com.android.vending");
                        if(this.mContext.bindService(intent0, this, 1)) {
                            this.mPendingChecks.offer(licenseValidator0);
                        }
                        else {
                            Log.e("LicenseChecker", "Could not bind to service.");
                            this.handleServiceConnectionError(licenseValidator0);
                        }
                    }
                    catch(SecurityException unused_ex) {
                        licenseCheckerCallback0.applicationError(6);
                    }
                    catch(Base64DecoderException base64DecoderException0) {
                        base64DecoderException0.printStackTrace();
                    }
                }
                else {
                    this.mPendingChecks.offer(licenseValidator0);
                    this.runChecks();
                }
            }
        }
    }

    private void cleanupService() {
        if(this.mService != null) {
            try {
                this.mContext.unbindService(this);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
            }
            this.mService = null;
        }
    }

    private void finishCheck(LicenseValidator licenseValidator0) {
        synchronized(this) {
            this.mChecksInProgress.remove(licenseValidator0);
            if(this.mChecksInProgress.isEmpty()) {
                this.cleanupService();
            }
        }
    }

    private int generateNonce() {
        return LicenseChecker.RANDOM.nextInt();
    }

    private static PublicKey generatePublicKey(String s) {
        try {
            byte[] arr_b = Base64.decode(s);
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(arr_b));
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            throw new RuntimeException(noSuchAlgorithmException0);
        }
        catch(Base64DecoderException base64DecoderException0) {
            Log.e("LicenseChecker", "Could not decode from Base64.");
            throw new IllegalArgumentException(base64DecoderException0);
        }
        catch(InvalidKeySpecException invalidKeySpecException0) {
            Log.e("LicenseChecker", "Invalid key specification.");
            throw new IllegalArgumentException(invalidKeySpecException0);
        }
    }

    private static String getVersionCode(Context context0, String s) {
        try {
            return String.valueOf(context0.getPackageManager().getPackageInfo(s, 0).versionCode);
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            Log.e("LicenseChecker", "Package not found. could not get version code.");
            return "";
        }
    }

    private void handleServiceConnectionError(LicenseValidator licenseValidator0) {
        synchronized(this) {
            this.mPolicy.processServerResponse(291, null);
            if(this.mPolicy.allowAccess()) {
                licenseValidator0.getCallback().allow(291);
            }
            else {
                licenseValidator0.getCallback().dontAllow(291);
            }
        }
    }

    public void onDestroy() {
        synchronized(this) {
            this.cleanupService();
            this.mHandler.getLooper().quit();
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName0, IBinder iBinder0) {
        synchronized(this) {
            this.mService = com.google.android.vending.licensing.ILicensingService.Stub.asInterface(iBinder0);
            this.runChecks();
        }
    }

    @Override  // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName0) {
        synchronized(this) {
            Log.w("LicenseChecker", "Service unexpectedly disconnected.");
            this.mService = null;
        }
    }

    private void runChecks() {
        LicenseValidator licenseValidator0;
        while((licenseValidator0 = (LicenseValidator)this.mPendingChecks.poll()) != null) {
            try {
                Log.i("LicenseChecker", "Calling checkLicense on service for " + licenseValidator0.getPackageName());
                this.mService.checkLicense(((long)licenseValidator0.getNonce()), licenseValidator0.getPackageName(), new ResultListener(this, licenseValidator0));
                this.mChecksInProgress.add(licenseValidator0);
            }
            catch(RemoteException remoteException0) {
                Log.w("LicenseChecker", "RemoteException in checkLicense call.", remoteException0);
                this.handleServiceConnectionError(licenseValidator0);
            }
        }
    }
}

