package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.util.BroadcastHelper;

public class ApexHomeBadger implements Badger {
    private static final String CLASS = "class";
    private static final String COUNT = "count";
    private static final String INTENT_UPDATE_COUNTER = "com.anddoes.launcher.COUNTER_CHANGED";
    private static final String PACKAGENAME = "package";

    @Override  // me.leolin.shortcutbadger.Badger
    public void executeBadge(Context context0, ComponentName componentName0, int v) throws ShortcutBadgeException {
        Intent intent0 = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent0.putExtra("package", componentName0.getPackageName());
        intent0.putExtra("count", v);
        intent0.putExtra("class", componentName0.getClassName());
        if(!BroadcastHelper.canResolveBroadcast(context0, intent0)) {
            throw new ShortcutBadgeException("unable to resolve intent: " + intent0.toString());
        }
        context0.sendBroadcast(intent0);
    }

    @Override  // me.leolin.shortcutbadger.Badger
    public List getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }
}

