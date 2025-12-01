package me.leolin.shortcutbadger;

import android.content.ComponentName;
import android.content.Context;
import java.util.List;

public interface Badger {
    void executeBadge(Context arg1, ComponentName arg2, int arg3) throws ShortcutBadgeException;

    List getSupportLaunchers();
}

