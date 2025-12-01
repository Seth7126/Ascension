package com.voxelbusters.android.essentialkit.utilities;

import android.content.Context;
import android.util.Log;
import com.test.MainActivity;
import com.voxelbusters.android.essentialkit.NativePluginHelper;

public class Logger {
    public static String TAG = "[Voxel Busters : Essential Kit]";

    static {
    }

    public static void debug(String s) {
        if(Logger.isDebugEnabled()) {
            Log.d("[Voxel Busters : Essential Kit]", String.format("%s %s", Logger.getTag(), s));
        }
    }

    public static void error(String s) {
        Log.e("[Voxel Busters : Essential Kit]", String.format("%s %s", Logger.getTag(), s));
    }

    private static String getTag() {
        if(Logger.isDebugEnabled()) {
            StackTraceElement stackTraceElement0 = Thread.currentThread().getStackTrace()[4];
            return "[" + stackTraceElement0.getClassName() + ":" + stackTraceElement0.getMethodName() + "]";
        }
        return "[Voxel Busters : Essential Kit]";
    }

    private static boolean isDebugEnabled() {
        try {
            Context context0 = NativePluginHelper.getUnityContext();
            return context0 == null ? MainActivity.context != null : ApplicationUtil.isDebugBuild(context0);
        }
        catch(Throwable unused_ex) {
            return false;
        }
    }

    public static void warning(String s) {
        Log.w("[Voxel Busters : Essential Kit]", String.format("%s %s", Logger.getTag(), s));
    }
}

