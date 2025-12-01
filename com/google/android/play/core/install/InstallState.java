package com.google.android.play.core.install;

import android.content.Intent;
import com.google.android.play.core.appupdate.internal.zzm;

public abstract class InstallState {
    public abstract long bytesDownloaded();

    public abstract int installErrorCode();

    public abstract int installStatus();

    public abstract String packageName();

    public abstract long totalBytesToDownload();

    public static InstallState zza(int v, long v1, long v2, int v3, String s) {
        return new zza(v, v1, v2, v3, s);
    }

    public static InstallState zzb(Intent intent0, zzm zzm0) {
        zzm0.zza("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        zzm0.zza("Key: %s; value: %s", new Object[]{"install.status", intent0.getIntExtra("install.status", 0)});
        zzm0.zza("Key: %s; value: %s", new Object[]{"error.code", intent0.getIntExtra("error.code", 0)});
        return new zza(intent0.getIntExtra("install.status", 0), intent0.getLongExtra("bytes.downloaded", 0L), intent0.getLongExtra("total.bytes.to.download", 0L), intent0.getIntExtra("error.code", 0), intent0.getStringExtra("package.name"));
    }
}

