package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;

public class ZukHomeBadger implements Badger {
    private final Uri CONTENT_URI;

    public ZukHomeBadger() {
        this.CONTENT_URI = Uri.parse("content://com.android.badge/badge");
    }

    @Override  // me.leolin.shortcutbadger.Badger
    public void executeBadge(Context context0, ComponentName componentName0, int v) throws ShortcutBadgeException {
        Bundle bundle0 = new Bundle();
        bundle0.putInt("app_badge_count", v);
        context0.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", null, bundle0);
    }

    @Override  // me.leolin.shortcutbadger.Badger
    public List getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}

