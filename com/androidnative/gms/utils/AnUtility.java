package com.androidnative.gms.utils;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.unity3d.player.UnityPlayer;

public class AnUtility {
    private static final int PLAY_SERVICES_RESOLUTION_REQUEST = 9000;

    public static Context GetApplicationContex() {
        return AnUtility.GetLauncherActivity().getApplicationContext();
    }

    public static Activity GetLauncherActivity() {
        return UnityPlayer.currentActivity;
    }

    public static boolean checkPlayServices() {
        int v = GooglePlayServicesUtil.isGooglePlayServicesAvailable(AnUtility.GetLauncherActivity());
        if(v != 0) {
            if(GooglePlayServicesUtil.isUserRecoverableError(v)) {
                GooglePlayServicesUtil.getErrorDialog(v, AnUtility.GetLauncherActivity(), 9000).show();
                return false;
            }
            Log.i("AndroidNative", "This device is not supported.");
            AnUtility.GetLauncherActivity().finish();
            return false;
        }
        return true;
    }
}

