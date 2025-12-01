package com.google.android.gms.games.internal;

import com.google.android.gms.common.internal.GmsLogger;

public final class zzz {
    private static final GmsLogger zzer;

    static {
        zzz.zzer = new GmsLogger("Games");
    }

    public static void e(String s, String s1) {
        String s2 = zzz.zzh(s);
        zzz.zzer.e(s2, s1);
    }

    public static void e(String s, String s1, Throwable throwable0) {
        zzz.zzer.e(zzz.zzh(s), s1, throwable0);
    }

    public static void i(String s, String s1, Throwable throwable0) {
        zzz.zzer.i(zzz.zzh(s), s1, throwable0);
    }

    public static void w(String s, String s1) {
        zzz.zzer.w(zzz.zzh(s), s1);
    }

    public static void w(String s, String s1, Throwable throwable0) {
        zzz.zzer.w(zzz.zzh(s), s1, throwable0);
    }

    private static String zzh(String s) {
        return String.format("%s[%s]", "PlayGamesServices", s);
    }
}

