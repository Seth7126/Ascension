package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.util.BroadcastHelper;

public class AdwHomeBadger implements Badger {
    public static final String CLASSNAME = "CNAME";
    public static final String COUNT = "COUNT";
    public static final String INTENT_UPDATE_COUNTER = "org.adw.launcher.counter.SEND";
    public static final String PACKAGENAME = "PNAME";

    @Override  // me.leolin.shortcutbadger.Badger
    public void executeBadge(Context context0, ComponentName componentName0, int v) throws ShortcutBadgeException {
        Intent intent0 = new Intent("org.adw.launcher.counter.SEND");
        intent0.putExtra("PNAME", componentName0.getPackageName());
        intent0.putExtra("CNAME", componentName0.getClassName());
        intent0.putExtra("COUNT", v);
        if(!BroadcastHelper.canResolveBroadcast(context0, intent0)) {
            throw new ShortcutBadgeException("unable to resolve intent: " + intent0.toString());
        }
        context0.sendBroadcast(intent0);
    }

    @Override  // me.leolin.shortcutbadger.Badger
    public List getSupportLaunchers() {
        return Arrays.asList(new String[]{"org.adw.launcher", "org.adwfreak.launcher"});
    }
}

