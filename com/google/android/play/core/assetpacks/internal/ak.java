package com.google.android.play.core.assetpacks.internal;

import java.io.File;

public final class ak {
    public static String a(File file0) {
        if(!file0.getName().endsWith(".apk")) {
            throw new IllegalArgumentException("Non-apk found in splits directory.");
        }
        String s = file0.getName().replaceFirst("(_\\d+)?\\.apk", "");
        if(!s.equals("base-master") && !s.equals("base-main")) {
            return s.startsWith("base-") ? s.replace("base-", "config.") : s.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        return "";
    }
}

