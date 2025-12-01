package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FilenameFilter;

public final class ep implements FilenameFilter {
    public static final ep a;

    static {
        ep.a = new ep();
    }

    @Override
    public final boolean accept(File file0, String s) {
        return eq.b(file0, s);
    }
}

