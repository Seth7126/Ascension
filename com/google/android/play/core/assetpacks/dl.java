package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

public final class dl implements FilenameFilter {
    public final String a;

    public dl(String s) {
        this.a = s;
    }

    // 去混淆评级： 低(20)
    @Override
    public final boolean accept(File file0, String s) {
        return s.startsWith(this.a + "-") && s.endsWith(".apk");
    }
}

