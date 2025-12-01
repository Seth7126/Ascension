package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.internal.zzab;
import com.google.android.play.core.appupdate.internal.zzi;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.internal.zzz;
import com.google.android.play.core.install.InstallException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

final class zzr {
    zzx zza;
    private static final zzm zzb;
    private static final Intent zzc;
    private final String zzd;
    private final Context zze;
    private final zzt zzf;

    static {
        zzr.zzb = new zzm("AppUpdateService");
        zzr.zzc = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");
    }

    zzr(Context context0, zzt zzt0) {
        this.zzd = "com.playdekgames.android.Ascension";
        this.zze = context0;
        this.zzf = zzt0;
        if(zzab.zza(context0)) {
            this.zza = new zzx(zzz.zza(context0), zzr.zzb, "AppUpdateService", zzr.zzc, zzl.zza, null);
        }
    }

    static int zza(Bundle bundle0) {
        return bundle0.getInt("error.code", -2);
    }

    static Bundle zzb(zzr zzr0, String s) {
        Integer integer0;
        Bundle bundle0 = new Bundle();
        bundle0.putAll(zzr.zzi());
        bundle0.putString("package.name", s);
        try {
            integer0 = zzr0.zze.getPackageManager().getPackageInfo("com.playdekgames.android.Ascension", 0).versionCode;
        }
        catch(PackageManager.NameNotFoundException unused_ex) {
            zzr.zzb.zzb("The current version of the app could not be retrieved", new Object[0]);
            integer0 = null;
        }
        if(integer0 != null) {
            bundle0.putInt("app.version.code", ((int)integer0));
        }
        return bundle0;
    }

    static Bundle zzc() {
        return zzr.zzi();
    }

    public final Task zzd(String s) {
        if(this.zza == null) {
            return zzr.zzj();
        }
        zzr.zzb.zzd("completeUpdate(%s)", new Object[]{s});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.zza.zzs(new zzn(this, taskCompletionSource0, taskCompletionSource0, s), taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    public final Task zze(String s) {
        if(this.zza == null) {
            return zzr.zzj();
        }
        zzr.zzb.zzd("requestUpdateInfo(%s)", new Object[]{s});
        TaskCompletionSource taskCompletionSource0 = new TaskCompletionSource();
        this.zza.zzs(new com.google.android.play.core.appupdate.zzm(this, taskCompletionSource0, s, taskCompletionSource0), taskCompletionSource0);
        return taskCompletionSource0.getTask();
    }

    static AppUpdateInfo zzf(zzr zzr0, Bundle bundle0, String s) {
        int v = bundle0.getInt("version.code", -1);
        int v1 = bundle0.getInt("update.availability");
        int v2 = bundle0.getInt("install.status", 0);
        Integer integer0 = bundle0.getInt("client.version.staleness", -1) == -1 ? null : bundle0.getInt("client.version.staleness");
        int v3 = bundle0.getInt("in.app.update.priority", 0);
        long v4 = bundle0.getLong("bytes.downloaded");
        long v5 = bundle0.getLong("total.bytes.to.download");
        long v6 = bundle0.getLong("additional.size.required");
        long v7 = zzr0.zzf.zza();
        Parcelable parcelable0 = bundle0.getParcelable("blocking.intent");
        Parcelable parcelable1 = bundle0.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent0 = (PendingIntent)bundle0.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent1 = (PendingIntent)bundle0.getParcelable("nonblocking.destructive.intent");
        HashMap hashMap0 = new HashMap();
        hashMap0.put("blocking.destructive.intent", zzr.zzk(bundle0.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        hashMap0.put("nonblocking.destructive.intent", zzr.zzk(bundle0.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        hashMap0.put("blocking.intent", zzr.zzk(bundle0.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        hashMap0.put("nonblocking.intent", zzr.zzk(bundle0.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return AppUpdateInfo.zzb(s, v, v1, v2, integer0, v3, v4, v5, v6, v7, ((PendingIntent)parcelable0), ((PendingIntent)parcelable1), pendingIntent0, pendingIntent1, hashMap0);
    }

    static zzm zzg() {
        return zzr.zzb;
    }

    static String zzh(zzr zzr0) {
        return zzr0.zzd;
    }

    private static Bundle zzi() {
        Bundle bundle0 = new Bundle();
        Bundle bundle1 = new Bundle();
        Map map0 = zzi.zza("app_update");
        bundle1.putInt("playcore_version_code", ((int)(((Integer)map0.get("java")))));
        if(map0.containsKey("native")) {
            bundle1.putInt("playcore_native_version", ((int)(((Integer)map0.get("native")))));
        }
        if(map0.containsKey("unity")) {
            bundle1.putInt("playcore_unity_version", ((int)(((Integer)map0.get("unity")))));
        }
        bundle0.putAll(bundle1);
        bundle0.putInt("playcore.version.code", 11004);
        return bundle0;
    }

    private static Task zzj() {
        zzr.zzb.zzb("onError(%d)", new Object[]{-9});
        return Tasks.forException(new InstallException(-9));
    }

    private static HashSet zzk(ArrayList arrayList0) {
        HashSet hashSet0 = new HashSet();
        if(arrayList0 != null) {
            hashSet0.addAll(arrayList0);
        }
        return hashSet0;
    }
}

