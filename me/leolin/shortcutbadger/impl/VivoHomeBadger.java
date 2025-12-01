package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;

public class VivoHomeBadger implements Badger {
    @Override  // me.leolin.shortcutbadger.Badger
    public void executeBadge(Context context0, ComponentName componentName0, int v) throws ShortcutBadgeException {
        Intent intent0 = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent0.putExtra("packageName", "com.playdekgames.android.Ascension");
        intent0.putExtra("className", componentName0.getClassName());
        intent0.putExtra("notificationNum", v);
        context0.sendBroadcast(intent0);
    }

    @Override  // me.leolin.shortcutbadger.Badger
    public List getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }
}

