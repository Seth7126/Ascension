package me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.Badger;
import me.leolin.shortcutbadger.ShortcutBadgeException;

public class NovaHomeBadger implements Badger {
    private static final String CONTENT_URI = "content://com.teslacoilsw.notifier/unread_count";
    private static final String COUNT = "count";
    private static final String TAG = "tag";

    @Override  // me.leolin.shortcutbadger.Badger
    public void executeBadge(Context context0, ComponentName componentName0, int v) throws ShortcutBadgeException {
        ContentValues contentValues0 = new ContentValues();
        contentValues0.put("tag", componentName0.getPackageName() + "/" + componentName0.getClassName());
        contentValues0.put("count", v);
        context0.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues0);
    }

    @Override  // me.leolin.shortcutbadger.Badger
    public List getSupportLaunchers() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }
}

