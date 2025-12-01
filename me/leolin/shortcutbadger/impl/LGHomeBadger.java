package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.util.BroadcastHelper;

@Deprecated
public class LGHomeBadger implements Badger {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";

    @Override  // me.leolin.shortcutbadger.Badger
    public void executeBadge(Context context0, ComponentName componentName0, int v) throws ShortcutBadgeException {
        Intent intent0 = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent0.putExtra("badge_count", v);
        intent0.putExtra("badge_count_package_name", componentName0.getPackageName());
        intent0.putExtra("badge_count_class_name", componentName0.getClassName());
        if(!BroadcastHelper.canResolveBroadcast(context0, intent0)) {
            throw new ShortcutBadgeException("unable to resolve intent: " + intent0.toString());
        }
        context0.sendBroadcast(intent0);
    }

    @Override  // me.leolin.shortcutbadger.Badger
    public List getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.lge.launcher", "com.lge.launcher2"});
    }
}

