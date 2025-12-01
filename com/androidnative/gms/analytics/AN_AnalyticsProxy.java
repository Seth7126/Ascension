package com.androidnative.gms.analytics;

import android.util.Log;
import com.androidnative.gms.utils.AnUtility;

public class AN_AnalyticsProxy {
    public static void ClearKey(String s) {
        try {
            V4GoogleAnalytics.GetInstance().clearKey(s);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void CreateItem(String s, String s1, String s2, String s3, String s4, String s5, String s6) {
        try {
            V4GoogleAnalytics.GetInstance().CreateItem(s, s1, s2, s3, s4, s5, s6);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void CreateTransaction(String s, String s1, String s2, String s3, String s4, String s5) {
        try {
            V4GoogleAnalytics.GetInstance().CreateTransaction(s, s1, s2, s3, s4, s5);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void EnableAdvertisingIdCollection(String s) {
        try {
            V4GoogleAnalytics.GetInstance().enableAdvertisingIdCollection(s.equals("true"));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SendEvent(String s, String s1, String s2, String s3) {
        try {
            V4GoogleAnalytics.GetInstance().sendEvent(s, s1, s2, s3);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SendEvent(String s, String s1, String s2, String s3, String s4, String s5) {
        try {
            V4GoogleAnalytics.GetInstance().sendEvent(s, s1, s2, s3, s4, s5);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SendTiming(String s, String s1, String s2, String s3) {
        try {
            V4GoogleAnalytics.GetInstance().sendTiming(s, s1, s2, s3);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SendView() {
        try {
            V4GoogleAnalytics.GetInstance().SendView();
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SendView(String s) {
        try {
            V4GoogleAnalytics.GetInstance().SendView(s);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SetDryRun(String s) {
        try {
            V4GoogleAnalytics.GetInstance().setDryRun(s.equals("true"));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SetKey(String s, String s1) {
        try {
            V4GoogleAnalytics.GetInstance().setKey(s, s1);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SetLogLevel(String s) {
        try {
            V4GoogleAnalytics.GetInstance().SetLogLevel(Integer.parseInt(s));
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void SetTrackerID(String s) {
        try {
            V4GoogleAnalytics.GetInstance().SetTracker(s);
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }

    public static void StartAnalyticsTracking() {
        try {
            V4GoogleAnalytics.GetInstance().startAnalyticsTracking(AnUtility.GetLauncherActivity());
        }
        catch(Exception exception0) {
            exception0.printStackTrace();
            Log.d("AndroidNative", "Error: " + exception0.getMessage());
        }
    }
}

