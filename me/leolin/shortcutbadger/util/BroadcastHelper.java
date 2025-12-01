package me.leolin.shortcutbadger.util;

import android.content.Context;
import android.content.Intent;
import java.util.List;

public class BroadcastHelper {
    public static boolean canResolveBroadcast(Context context0, Intent intent0) {
        List list0 = context0.getPackageManager().queryBroadcastReceivers(intent0, 0);
        return list0 != null && list0.size() > 0;
    }
}

