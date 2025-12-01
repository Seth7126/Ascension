package com.google.android.vending.licensing;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.vending.licensing.util.Base64;
import com.google.android.vending.licensing.util.Base64DecoderException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;

class LicenseValidator {
    private static final int ERROR_CONTACTING_SERVER = 0x101;
    private static final int ERROR_INVALID_PACKAGE_NAME = 0x102;
    private static final int ERROR_NON_MATCHING_UID = 0x103;
    private static final int ERROR_NOT_MARKET_MANAGED = 3;
    private static final int ERROR_OVER_QUOTA = 5;
    private static final int ERROR_SERVER_FAILURE = 4;
    private static final int LICENSED = 0;
    private static final int LICENSED_OLD_KEY = 2;
    private static final int NOT_LICENSED = 1;
    private static final String SIGNATURE_ALGORITHM = "SHA1withRSA";
    private static final String TAG = "LicenseValidator";
    private final LicenseCheckerCallback mCallback;
    private final DeviceLimiter mDeviceLimiter;
    private final int mNonce;
    private final String mPackageName;
    private final Policy mPolicy;
    private final String mVersionCode;

    LicenseValidator(Policy policy0, DeviceLimiter deviceLimiter0, LicenseCheckerCallback licenseCheckerCallback0, int v, String s, String s1) {
        this.mPolicy = policy0;
        this.mDeviceLimiter = deviceLimiter0;
        this.mCallback = licenseCheckerCallback0;
        this.mNonce = v;
        this.mPackageName = s;
        this.mVersionCode = s1;
    }

    public LicenseCheckerCallback getCallback() {
        return this.mCallback;
    }

    public int getNonce() {
        return this.mNonce;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    private void handleApplicationError(int v) {
        this.mCallback.applicationError(v);
    }

    private void handleInvalidResponse() {
        this.mCallback.dontAllow(561);
    }

    private void handleResponse(int v, ResponseData responseData0) {
        this.mPolicy.processServerResponse(v, responseData0);
        if(this.mPolicy.allowAccess()) {
            this.mCallback.allow(v);
            return;
        }
        this.mCallback.dontAllow(v);
    }

    public void verify(PublicKey publicKey0, int v, String s, String s1) {
        ResponseData responseData0;
        String s2;
        ResponseData responseData1;
        if(v == 0 || v == 1 || v == 2) {
            try {
                Signature signature0 = Signature.getInstance("SHA1withRSA");
                signature0.initVerify(publicKey0);
                signature0.update(s.getBytes());
                if(!signature0.verify(Base64.decode(s1))) {
                    Log.e("LicenseValidator", "Signature verification failed.");
                    this.handleInvalidResponse();
                    return;
                }
            }
            catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
                throw new RuntimeException(noSuchAlgorithmException0);
            }
            catch(InvalidKeyException unused_ex) {
                this.handleApplicationError(5);
                return;
            }
            catch(SignatureException signatureException0) {
                throw new RuntimeException(signatureException0);
            }
            catch(Base64DecoderException unused_ex) {
                Log.e("LicenseValidator", "Could not Base64-decode signature.");
                this.handleInvalidResponse();
                return;
            }
            try {
                responseData1 = ResponseData.parse(s);
            }
            catch(IllegalArgumentException unused_ex) {
                Log.e("LicenseValidator", "Could not parse response.");
                this.handleInvalidResponse();
                return;
            }
            if(responseData1.responseCode != v) {
                Log.e("LicenseValidator", "Response codes don\'t match.");
                this.handleInvalidResponse();
                return;
            }
            if(responseData1.nonce != this.mNonce) {
                Log.e("LicenseValidator", "Nonce doesn\'t match.");
                this.handleInvalidResponse();
                return;
            }
            if(!responseData1.packageName.equals(this.mPackageName)) {
                Log.e("LicenseValidator", "Package name doesn\'t match.");
                this.handleInvalidResponse();
                return;
            }
            if(!responseData1.versionCode.equals(this.mVersionCode)) {
                Log.e("LicenseValidator", "Version codes don\'t match.");
                this.handleInvalidResponse();
                return;
            }
            String s3 = responseData1.userId;
            if(TextUtils.isEmpty(s3)) {
                Log.e("LicenseValidator", "User identifier is empty.");
                this.handleInvalidResponse();
                return;
            }
            responseData0 = responseData1;
            s2 = s3;
        }
        else {
            s2 = null;
            responseData0 = null;
        }
        switch(v) {
            case 1: {
                this.handleResponse(561, responseData0);
                return;
            }
            case 0: 
            case 2: {
                this.handleResponse(this.mDeviceLimiter.isDeviceAllowed(s2), responseData0);
                return;
            }
            default: {
                if(v != 3) {
                    switch(v) {
                        case 4: {
                            Log.w("LicenseValidator", "An error has occurred on the licensing server.");
                            this.handleResponse(291, responseData0);
                            return;
                        }
                        case 5: {
                            Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
                            this.handleResponse(291, responseData0);
                            return;
                        }
                        case 0x101: {
                            Log.w("LicenseValidator", "Error contacting licensing server.");
                            this.handleResponse(291, responseData0);
                            return;
                        }
                        case 0x102: {
                            this.handleApplicationError(1);
                            return;
                        }
                        case 0x103: {
                            this.handleApplicationError(2);
                            return;
                        }
                        default: {
                            Log.e("LicenseValidator", "Unknown response code for license check.");
                            this.handleInvalidResponse();
                            return;
                        }
                    }
                }
                this.handleApplicationError(3);
            }
        }
    }
}

