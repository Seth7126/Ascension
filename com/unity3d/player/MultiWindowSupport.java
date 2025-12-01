package com.unity3d.player;

import android.app.Activity;

public class MultiWindowSupport {
    private static boolean s_LastMultiWindowMode;

    static {
    }

    // 去混淆评级： 低(20)
    public static boolean isInMultiWindowMode(Activity activity0) {
        return PlatformSupport.NOUGAT_SUPPORT ? activity0.isInMultiWindowMode() : false;
    }

    // 去混淆评级： 低(20)
    public static boolean isMultiWindowModeChangedToTrue(Activity activity0) {
        return !MultiWindowSupport.s_LastMultiWindowMode && MultiWindowSupport.isInMultiWindowMode(activity0);
    }

    public static void saveMultiWindowMode(Activity activity0) {
        MultiWindowSupport.s_LastMultiWindowMode = MultiWindowSupport.isInMultiWindowMode(activity0);
    }
}

