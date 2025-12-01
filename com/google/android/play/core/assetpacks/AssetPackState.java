package com.google.android.play.core.assetpacks;

import android.os.Bundle;

public abstract class AssetPackState {
    public static AssetPackState a(String s, int v, int v1, long v2, long v3, double f, int v4, String s1, String s2) {
        return new bn(s, v, v1, v2, v3, ((int)Math.rint(100.0 * f)), v4, s1, s2);
    }

    public abstract String availableVersionTag();

    static AssetPackState b(Bundle bundle0, String s, co co0, eb eb0, be be0) {
        int v = be0.a(bundle0.getInt("status:" + s), s);
        int v1 = bundle0.getInt("error_code:" + s);
        long v2 = bundle0.getLong("bytes_downloaded:" + s);
        long v3 = bundle0.getLong("total_bytes_to_download:" + s);
        double f = co0.a(s);
        long v4 = bundle0.getLong("pack_version:" + s);
        long v5 = bundle0.getLong("pack_base_version:" + s);
        if(v == 4) {
            return v5 == 0L || v5 == v4 ? AssetPackState.a(s, 4, v1, v2, v3, f, 1, bundle0.getString("pack_version_tag:" + s, String.valueOf(bundle0.getInt("app_version_code"))), eb0.a(s)) : AssetPackState.a(s, 4, v1, v2, v3, f, 2, bundle0.getString("pack_version_tag:" + s, String.valueOf(bundle0.getInt("app_version_code"))), eb0.a(s));
        }
        return AssetPackState.a(s, v, v1, v2, v3, f, 1, bundle0.getString("pack_version_tag:" + s, String.valueOf(bundle0.getInt("app_version_code"))), eb0.a(s));
    }

    public abstract long bytesDownloaded();

    public abstract int errorCode();

    public abstract String installedVersionTag();

    public abstract String name();

    public abstract int status();

    public abstract long totalBytesToDownload();

    public abstract int transferProgressPercentage();

    public abstract int updateAvailability();
}

