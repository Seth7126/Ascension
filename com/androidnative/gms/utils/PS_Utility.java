package com.androidnative.gms.utils;

import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.unity3d.player.UnityPlayer;
import java.io.IOException;

public class PS_Utility {
    public static String UTIL_LISTNER_NAME = "GooglePlayUtils";

    static {
    }

    public static String ArrayToString(int[] arr_v) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_v.length; ++v) {
            stringBuilder0.append(arr_v[v]);
            stringBuilder0.append("|");
        }
        String s = stringBuilder0.toString();
        return s.substring(0, s.length() - 1);
    }

    public static String ArrayToString(Object[] arr_object) {
        StringBuilder stringBuilder0 = new StringBuilder();
        for(int v = 0; v < arr_object.length; ++v) {
            stringBuilder0.append(arr_object[v]);
            stringBuilder0.append("|");
        }
        String s = stringBuilder0.toString();
        return s.substring(0, s.length() - 1);
    }

    public static void GetAdvertisingId() {
        new AsyncTask() {
            @Override  // android.os.AsyncTask
            protected Object doInBackground(Object[] arr_object) {
                return this.doInBackground(((Void[])arr_object));
            }

            protected Void doInBackground(Void[] arr_void) {
                String s = "";
                try {
                    boolean z = false;
                    AdvertisingIdClient.Info advertisingIdClient$Info0 = AdvertisingIdClient.getAdvertisingIdInfo(AnUtility.GetApplicationContex());
                    if(advertisingIdClient$Info0 != null) {
                        s = advertisingIdClient$Info0.getId();
                        z = advertisingIdClient$Info0.isLimitAdTrackingEnabled();
                    }
                }
                catch(IOException | IllegalStateException | GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException iOException0) {
                    iOException0.printStackTrace();
                }
                StringBuilder stringBuilder0 = new StringBuilder();
                stringBuilder0.append(s);
                stringBuilder0.append("|");
                if(z) {
                    stringBuilder0.append("true");
                }
                else {
                    stringBuilder0.append("false");
                }
                UnityPlayer.UnitySendMessage("GooglePlayUtils", "OnAdvertisingIdLoaded", stringBuilder0.toString());
                return null;
            }
        }.execute(new Void[0]);
    }

    public static void PrintGooglePlayConnectionFailedResult(ConnectionResult connectionResult0) {
        String s;
        switch(connectionResult0.getErrorCode()) {
            case 1: {
                s = "SERVICE_MISSING - Google Play services is missing on this device. The calling activity should pass this error code to getErrorDialog(int, Activity, int) to get a localized error dialog that will resolve the error when shown.";
                break;
            }
            case 2: {
                s = "SERVICE_VERSION_UPDATE_REQUIRED - The installed version of Google Play services is out of date. The calling activity should pass this error code to getErrorDialog(int, Activity, int) to get a localized error dialog that will resolve the error when shown.";
                break;
            }
            case 3: {
                s = "SERVICE_DISABLED - The installed version of Google Play services has been disabled on this device. The calling activity should pass this error code to getErrorDialog(int, Activity, int) to get a localized error dialog that will resolve the error when shown.";
                break;
            }
            case 4: {
                s = "SIGN_IN_REQUIRED - The client attempted to connect to the service but the user is not signed in. The client may choose to continue without using the API or it may call startResolutionForResult(Activity, int) to prompt the user to sign in. After the sign in activity returns with RESULT_OK further attempts to connect should succeed.";
                break;
            }
            case 5: {
                s = "INVALID_ACCOUNT - The client attempted to connect to the service with an invalid account name specified.";
                break;
            }
            case 6: {
                s = "RESOLUTION_REQUIRED - Completing the connection requires some form of resolution. A resolution will be available to be started with startResolutionForResult(Activity, int). If the result returned is RESULT_OK, then further attempts to connect should either complete or continue on to the next issue that needs to be resolved.";
                break;
            }
            case 7: {
                s = "NETWORK_ERROR - A network error occurred. Retrying should resolve the problem.";
                break;
            }
            case 8: {
                s = "INTERNAL_ERROR - An internal error occurred. Retrying should resolve the problem.";
                break;
            }
            case 9: {
                s = "SERVICE_INVALID - The version of the Google Play services installed on this device is not authentic.";
                break;
            }
            case 10: {
                s = "DEVELOPER_ERROR - The application is misconfigured. This error is not recoverable and will be treated as fatal. The developer should look at the logs after this to determine more actionable information.";
                break;
            }
            case 11: {
                s = "LICENSE_CHECK_FAILED - The application is not licensed to the user. This error is not recoverable and will be treated as fatal.";
                break;
            }
            case 13: {
                s = "CANCELED - The client canceled the connection by calling disconnect(). Only returned by blockingConnect().";
                break;
            }
            case 14: {
                s = "TIMEOUT - The timeout was exceeded while waiting for the connection to complete. Only returned by blockingConnect().";
                break;
            }
            case 15: {
                s = "INTERRUPTED - An interrupt occurred while waiting for the connection complete. Only returned by blockingConnect().";
                break;
            }
            case 16: {
                s = "API_UNAVAILABLE - One of the API components you attempted to connect to is not available. The API will not work on this device, and updating Google Play services will not likely solve the problem. Using the API on the device should be avoided.";
                break;
            }
            default: {
                s = "UNKNOWN";
            }
        }
        Log.d("AndroidNative", "*************************************************************");
        Log.d("AndroidNative", "*************************************************************");
        Log.d("AndroidNative", "*************** GOOGLE PLAY CONNECTION FAILED ***************");
        Log.d("AndroidNative", "ERROR CODE: " + Integer.toString(connectionResult0.getErrorCode()) + " ***************");
        Log.d("AndroidNative", "HAS RESOLUTION: " + connectionResult0.hasResolution() + " ***************");
        Log.d("AndroidNative", "DESCRIBTION: " + s);
        Log.d("AndroidNative", "READ MORE: http://developer.android.com/reference/com/google/android/gms/common/ConnectionResult.html");
        Log.d("AndroidNative", "*************************************************************");
        Log.d("AndroidNative", "*************************************************************");
    }

    public static String[] StringToArray(String s) {
        return s.split("\\|");
    }
}

